package BnfCompiler;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Stack;

import org.antlr.Tool;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.tool.ErrorManager;

import Xml.XmlNode;

import BnfCompiler.Link.RepeatType;
import Exceptions.XMLLoadException;
import Exceptions.XMLattributeDoesNotExist;
import Exceptions.XMLnodeDoesNotExist;
import Kernel.Variables;
import Library.StdLibrary;

public class CommandLineTool
{
	private static String jdkBinFolder = "";
	private static final String optionsXmlFile = "bnfCompilerOptions.xml";
	
	public static void printUsage()
	{
		System.out.println("Usage: java -jar BnfCompiler.jar BnfFile");
		System.out.println();
		System.out.println("BnfFile:\tReference to the file containing the language to be compiled, written in BNF.");
	}
	
	public static void main(String[] args)
	{
		if( args.length != 1 )
		{
			printUsage();
			System.exit(0);
		}
		loadOptions();
		String filename = args[0];
		String filenamePre = filename.substring(0, filename.length() - 4);
		integrityCheck(filename);
		cleanup(filenamePre);
		
		String Bnf = StdLibrary.readFileAsString(filename);
		if( Bnf == null )
		{
			System.out.println("There was a problem reading file " + filename + ".");
			System.exit(0);
		}
		
		try
		{
			System.out.println("Parsing bnf");
			
			InputStream is = new ByteArrayInputStream(Bnf.getBytes("UTF-8"));
			ANTLRInputStream input = new ANTLRInputStream(is);
			BnfEvaluatorLexer lexer = new BnfEvaluatorLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			BnfEvaluatorParser parser = new BnfEvaluatorParser(tokens);
			
			try
			{
				parser.bnf();
				if( !(
						createAntlrFiles(filenamePre, parser.startRule, parser.ruleNameToLink) &&
						compileAntlrFiles("Grammar\\" + filenamePre) &&
						createSyntaxXml( "Grammar\\" + filenamePre, parser.ruleNameToLink) &&
						createJarFile( filenamePre, "Grammar\\" )
					) )
				{
					System.out.println("Failed to create grammar file!");
					return;
				}
				cleanup(filenamePre);
				File jarFile = new File(filenamePre + ".jar");
				System.out.println("Jar file created at: " + jarFile.getCanonicalPath());
				return;
			}
			catch (RecognitionException e)
			{
				
			}
			catch(RuntimeException e)
			{
				//TODO: the bnf wasn't written correctly
				System.out.println("Error creating jar file!");
			}
		}
		catch (UnsupportedEncodingException e)
		{
			System.out.println("Unknown Error!");
		}
		catch (IOException e)
		{
			System.out.println("Unknown Error!");
		}
		System.exit(1);
	}
	
	private static void loadOptions()
	{
		String optionsXml = StdLibrary.readFileAsString(optionsXmlFile);
		if( optionsXml == null )
		{
			System.out.println("There was a problem reading file " + optionsXmlFile + ".");
			System.exit(0);
		}
		
		try
		{
			XmlNode compilerOptions = new XmlNode(optionsXml, "0.1");
			jdkBinFolder = compilerOptions.getChildNode("path").getAttribute("jdkBinFolder") + "\\";
			return;
		}
		catch (XMLLoadException e)
		{
			System.out.println( optionsXmlFile + " contains invalid xml.");
		}
		catch (XMLattributeDoesNotExist e)
		{
			System.out.println("Invalid xml structure in " + optionsXmlFile);
		}
		catch (XMLnodeDoesNotExist e)
		{
			System.out.println("Invalid xml structure in " + optionsXmlFile);
		}
		System.exit(1);
	}

	private static boolean createJarFile(String filenamePre, String folder)
	{
		try
		{
			System.out.println("Creating jar file...");
			Process jarProcess = Runtime.getRuntime().exec( jdkBinFolder + "jar.exe cf " + filenamePre + ".jar " + folder );
			Long start = System.currentTimeMillis();
			while( true )
			{
				Thread.sleep(500);
				try
				{
					int exitCode1 = jarProcess.exitValue();
					if( exitCode1 != 0 )
					{
						System.out.println("Error, jar file not created.");
						return false;
					}
					
					break;
				}
				catch (IllegalThreadStateException e)
				{
					if( System.currentTimeMillis() - start > 30000 )
					{
						//over 30 sec passed
						System.out.println("Jar file creation took too long.");
						jarProcess.destroy();
						return false;
					}
				}
			}
			return true;
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	private static void cleanup( String filenamePre )
	{
		File directory = new File("Grammar\\");
		File[] files = directory.listFiles();
		for( File file : files )
		{
			String name = file.getName();
			if( name.equalsIgnoreCase("bnfparser.class") ||
				name.equalsIgnoreCase(filenamePre + ".jar") ||
				file.isDirectory() )
			{
				continue;
			}
			file.delete();
		}
	}
	private static void integrityCheck(String filename)
	{
		//TODO: checks that grammar folder exists (otherwise it creates it), that given jdk bin folder exists and contains javac and jar.
		//also verifies that antlr.jar and grammar/BnfParser.class exists.
		File antlr = new File("antlr.jar");
		File bnfparser = new File("Grammar\\bnfparser.class");
		File javac = new File(jdkBinFolder + "javac.exe");
		File jar = new File(jdkBinFolder + "jar.exe");
		File bnfFile = new File(filename);
		
		if( !antlr.exists() )
		{
			System.out.println("Missing file: antlr.jar");
			System.exit(1);
		}
		if( !bnfparser.exists() )
		{
			System.out.println("Missing file Grammar\\bnfparser.class");
			System.exit(1);
		}
		if( !javac.exists() )
		{
			System.out.println("Missing or wrongly set up java compilation file: " + jdkBinFolder + "javac.exe");
			System.exit(1);
		}
		if( !jar.exists() )
		{
			System.out.println("Missing or wrongly set up jar compilation file: " + jdkBinFolder + "jar.exe");
			System.exit(1);
		}
		if( !bnfFile.exists() )
		{
			System.out.println("Missing file: " + filename);
			System.exit(1);
		}
	}
	private static boolean compileAntlrFiles( String filenamePre )
	{
		try
		{
			System.out.println("Compiling...");
			Process compilation1 = Runtime.getRuntime().exec( jdkBinFolder + "javac.exe -cp antlr.jar;. " + filenamePre + "Lexer.java" );
			Process compilation2 = Runtime.getRuntime().exec( jdkBinFolder + "javac.exe -cp antlr.jar;. " + filenamePre + "Parser.java" );
			Long start = System.currentTimeMillis();
			while( true )
			{
				Thread.sleep(500);
				try
				{
					int exitCode1 = compilation1.exitValue();
					int exitCode2 = compilation2.exitValue();
					if( exitCode1 != 0 || exitCode2 != 0 )
					{
						System.out.println("Failed to compile code.");
						return false;
					}
					
					break;
				}
				catch (IllegalThreadStateException e)
				{
					if( System.currentTimeMillis() - start > 30000 )
					{
						//over 30 sec passed
						System.out.println("Compilation error, took too long time to compile.");
						compilation1.destroy();
						compilation2.destroy();
						return false;
					}
				}
			}
			return true;
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	private static boolean createSyntaxXml( String filenamePre, HashMap<String, Link> ruleNameToLink )
	{
		System.out.println("Creating syntax xml file");
		String filename = filenamePre + ".xml";
		File file = new File(filename);
		if(file.exists())
		{
			//just to be sure
			file.delete();
		}
		try
		{
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write("<SyntaxTrain version=\"" + Variables.xmlVersion + "\">\n");
			for( String ruleName : ruleNameToLink.keySet() )
			{
				Link link = ruleNameToLink.get(ruleName);
				out.write("\t<Rule ID=\"" + ruleName + "\">\n");
				writeXmlRule(link, out, 2);
				out.write("\t</Rule>\n\n");
			}
			out.write("</SyntaxTrain>\n");
			out.close();
			return true;
		}
		catch (IOException e)
		{
			System.out.println("Could not write to xml file!!!!");
		}
		return false;
	}
	private static void writeTabs(int tabs, BufferedWriter out) throws IOException
	{
		for(int i=0;i<tabs;i++)
		{
			out.write("\t");
		}
	}
	private static void writeXmlRule( Link rule, BufferedWriter out, int tabs) throws IOException
	{
		int numTabs = tabs;
		RepeatType repeating = rule.getRepeat();
		String id = rule.getId();
		String UUID = rule.getUUID();
		Stack<Link> ids = rule.getIds();
		
		if( id != null )
		{
			writeTabs(tabs, out);
			out.write("\t<Rule ID=\"" + id + "\" UUID=\"" + UUID + "\" />\n");
		}
		else
		{
			if( repeating == RepeatType.oneOfMultiple )
			{
				//special case
				writeTabs(tabs, out);
				out.write("<or>\n");
				
				for( Link subRule : ids )
				{
					writeTabs(tabs+1, out);
					out.write("<option>\n");
					writeXmlRule(subRule, out, numTabs+1);
					writeTabs(tabs+1, out);
					out.write("</option>\n");
				}
				out.write("</or>\n");
			}
			else
			{
				switch( repeating )
				{
				case atleastOnce:
					writeTabs(tabs, out);
					out.write( "<OnePlus>\n" );
					break;
				case loop:
					writeTabs(tabs, out);
					out.write( "<Repeat>\n" );
					break;
				case optional:
					writeTabs(tabs, out);
					out.write( "<Optional>\n" );
					break;
				case sequence:
					//the next items stay on the same line
					numTabs--;
					break;
				}
				numTabs++;
				for( Link subRule : ids )
				{
					writeXmlRule(subRule, out, numTabs);
				}
				switch( repeating )
				{
				case atleastOnce:
					writeTabs(tabs, out);
					out.write( "</OnePlus>\n" );
					break;
				case loop:
					writeTabs(tabs, out);
					out.write( "</Repeat>\n" );
					break;
				case optional:
					writeTabs(tabs, out);
					out.write( "</Optional>\n" );
					break;
				case sequence:
					
					break;
				}
			}
		}
	}
	
	private static boolean createAntlrFiles( String filenamePre, String startRule, HashMap<String, Link> ruleNameToLink )
	{
		System.out.println("Creating parser and lexer files");
		String filename = filenamePre + ".g";
		File file = new File(filename);
		if(file.exists())
		{
			//just to be sure
			file.delete();
		}
		try
		{
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write(
					"grammar " + filenamePre + ";\n" +
					"\n" +
					"options\n" +
					"{\n" +
					"	superClass=BnfParser;\n" +
				    "}\n" +
					"\n" +
					"@header\n" +
					"{\n" +
					"package Grammar;\n" +
					"\n" +
					"import java.util.Stack;\n" +
					"}\n" +
					"\n" +
					"@lexer::header\n" +
					"{\n" +
					"package Grammar;\n" +
					"}\n" +
					"\n" +
					"@members\n" +
					"{\n" +
					"	public void bnf() throws RecognitionException\n" +
					"	{\n" +
					"		" + startRule + "();\n" +
					"	}\n" +
					"}\n" +
					"\n"
					);
			writeBnfRule( startRule, ruleNameToLink.get(startRule), out );
			for( String ruleName : ruleNameToLink.keySet() )
			{
				if(ruleName.equalsIgnoreCase(startRule))
				{
					//rule is already written
					continue;
				}
				writeBnfRule( ruleName, ruleNameToLink.get(ruleName), out);
			}
			out.write(
					"INT :	'0'..'9'+\n" +
					"    ;\n" +
					"\n" +
					"FLOAT\n" +
					"    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?\n" +
					"    |   '.' ('0'..'9')+ EXPONENT?\n" +
					"    |   ('0'..'9')+ EXPONENT\n" +
					"    ;\n" +
					"\n" +
					"HEX\n" +
					"	:	'0'..'9' | 'a'..'f';\n" +
					"\n" +
					"STRING\n" +
				    ":  '\"' ( ESC_SEQ | ~('\\\\'|'\"') )* '\"'\n" +
				    ";\n" +
					"\n" +
					"fragment\n" +
					"EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;\n" +
					"\n" +
					"fragment\n" +
					"HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;\n" +
					"\n" +
					"fragment\n" +
					"ESC_SEQ\n" +
					"    :   '\\\\' ('b'|'t'|'n'|'f'|'r'|'\\\"'|'\\''|'\\\\')\n" +
					"    |   UNICODE_ESC\n" +
					"    |   OCTAL_ESC\n" +
					"    ;\n" +
					"\n" +
					"fragment\n" +
					"OCTAL_ESC\n" +
					"    :   '\\\\' ('0'..'3') ('0'..'7') ('0'..'7')\n" +
					"    |   '\\\\' ('0'..'7') ('0'..'7')\n" +
					"    |   '\\\\' ('0'..'7')\n" +
					"    ;\n" +
					"\n" +
					"fragment\n" +
					"UNICODE_ESC\n" +
					"    :   '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT\n" +
					"    ;\n" +
					"\n" +
					"COMMENT\n" +
					"    :   '//' ~('\\n'|'\\r')* '\\r'? '\\n' {$channel=HIDDEN;}\n" +
					"    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}\n" +
					"    ;\n" +
					"\n" +
					"IDENTIFIER  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;\n" +
					"\n" +
					"WS  :   ( ' '\n" +
					"        | '\\t'\n" +
					"        | '\\r'\n" +
					"        | '\\n'\n" +
					"        ) {$channel=HIDDEN;}\n" +
					"    ;\n"
			);
			out.close();
			ErrorListener listener = new ErrorListener();
			ErrorManager.setErrorListener(listener);
			Tool antlrTool = new Tool();
			antlrTool.addGrammarFile(filename);
			antlrTool.process();
			
			if( listener.numErrorsAndWarnings > 0 )
			{
				//Error reporting has been moved to the listener since it is not certain that the antlr tool will stop
				//in some cases it loops forever and then no error message will be reported :(
				return false;
			}
			//move the files
			File grammarFile = new File(filename);
			File tokenFile = new File(filenamePre + ".tokens");
			File lexerFile = new File(filenamePre + "Lexer.java");
			File parserFile = new File(filenamePre + "Parser.java");
			
			File GrammarDir = new File("Grammar\\");
			
			if( !(
					grammarFile.renameTo(new File(GrammarDir, grammarFile.getName())) &&
					tokenFile.renameTo(new File(GrammarDir, tokenFile.getName())) &&
					lexerFile.renameTo(new File(GrammarDir, lexerFile.getName())) &&
					parserFile.renameTo(new File(GrammarDir, parserFile.getName()))
			))
			{
				System.out.println("Could not rename antlr files!");
				return false;
			}
			return true;
		}
		catch (IOException e)
		{
			System.out.println("Could not write to file!!!!");
		}
		return false;
	}
	private static void writeBnfRule(String ruleName, Link rule, BufferedWriter out) throws IOException
	{
		out.write( ruleName + " :\n" );
		out.write( "\t\t{Stack<String> stack = new Stack<String>(); trace.push(stack); stack.push(\"" + ruleName + "\");}\n" );
		for( Link subRule : rule.getIds() )
		{
			writeBnfSubRule( subRule, out );
		}
		out.write("\n\t\t{trace.pop();};\n\n");
	}
	private static void writeBnfSubRule(Link rule, BufferedWriter out) throws IOException
	{
		RepeatType repeating = rule.getRepeat();
		String id = rule.getId();
		String UUID = rule.getUUID();
		Stack<Link> ids = rule.getIds();
		
		if( id != null )
		{
			out.write( " (" + id + " " );
			out.write( "{stack.push(\"" + UUID + "\");}) ");
		}
		else
		{
			if( repeating == RepeatType.oneOfMultiple )
			{
				//special case
				out.write("(");
				for( int i=0;i<ids.size()-1;i++)
				{
					writeBnfSubRule(ids.get(i), out);
					out.write("|");
				}
				writeBnfSubRule(ids.get(ids.size()-1), out);
				out.write(")");
			}
			else
			{
				switch( repeating )
				{
				case atleastOnce:
					out.write( "(" );
					break;
				case loop:
					out.write( "(" );
					break;
				case optional:
					out.write( "(" );
					break;
				case sequence:
					out.write( "" );
					break;
				}
				for( Link subRule : ids )
				{
					writeBnfSubRule(subRule, out);
				}
				switch( repeating )
				{
				case atleastOnce:
					out.write( ")+" );
					break;
				case loop:
					out.write( ")*" );
					break;
				case optional:
					out.write( ")?" );
					break;
				case sequence:
					out.write( "" );
					break;
				}
			}
		}
	}

}
