package Kernel;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Stack;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import Grammar.BnfParser;

public class SourceCodeCompiler extends GrammarBase
{
	/**
	 * Stack of rules which are in the error (top down).
	 * Each rule is a stack trace indicating which steps in these rules have been taken (starting with the rule name as the first element)
	 * 
	 * Example:
	 * 		compilationUnit
	 * 		typeDeclaration
	 * 		classDeclaration 'class' IDENTIFIER '{' fieldDeclaration
	 * 
	 * This means the last '}' is missing (if fieldDeclaration weren't there, the error would be in that.
	 */
	protected Stack<Stack<String>> errorTrace;
	protected int errorLine;
	private Constructor<Lexer> LexerConstructor;
	private Constructor<BnfParser> ParserConstructor;
	
	protected SourceCodeCompiler()
	{
		super();
		boolean success = false;
		errorTrace = null;
		errorLine = -1;
		
		/*
		 * Load classes
		 */
		try
		{
			Class CLexer = Class.forName("Grammar." + Variables.grammarName + "Lexer", false, classLoader);
			Class CParser = Class.forName("Grammar." + Variables.grammarName + "Parser", false, classLoader);
			
			LexerConstructor = CLexer.getConstructor(new Class[]{CharStream.class});
			ParserConstructor = CParser.getConstructor(new Class[]{TokenStream.class});
			
			//A little check to make sure files can be loaded
			InputStream is = new ByteArrayInputStream((new String()).getBytes("UTF-8"));
			ANTLRInputStream input = new ANTLRInputStream(is);
			
			Lexer lexer = LexerConstructor.newInstance(new Object[]{input});
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			BnfParser parser = ParserConstructor.newInstance(new Object[]{tokens});
			
			success = true;
		}
		catch (SecurityException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch (InvocationTargetException e)
		{
			e.printStackTrace();
		}
		if( !success )
		{
			System.out.println("Invalid Jar file!");
			System.exit(1);
		}
	}
	
	public Stack<Stack<String>> getErrorTrace()
	{
		return errorTrace;
	}
	
	public int getErrorLine()
	{
		return errorLine;
	}
	
	protected void compileSourceCode()
	{
		try
		{
			if( getSourceCode() == null )
				return;
			InputStream is = new ByteArrayInputStream(getSourceCode().getBytes("UTF-8"));
			ANTLRInputStream input = new ANTLRInputStream(is);
			
			Lexer lexer = LexerConstructor.newInstance(new Object[]{input});
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			BnfParser parser = ParserConstructor.newInstance(new Object[]{tokens});
			
			try
			{
				parser.bnf();
				System.out.println("No errors :)");
			}
			catch(RuntimeException e)
			{
				System.out.println("Failed, errors in code :(");
			}
			errorTrace = parser.trace;
			errorLine = parser.errorLine;
			
			System.out.println("Error trace:");
			for( Stack<String> stck : errorTrace )
			{
				for(String str : stck)
					System.out.println("	trace: " + str);
			}
			
			return;
		}
		catch (UnsupportedEncodingException e)
		{
		}
		catch (IOException e)
		{
		}
		catch (RecognitionException e)
		{
		}
		catch (InstantiationException e1)
		{
			System.out.println("Invalid Jar file!");
			System.exit(1);
		}
		catch (IllegalAccessException e1) {
			System.out.println("Invalid Jar file!");
			System.exit(1);
		}
		catch (InvocationTargetException e1)
		{
			System.out.println("Invalid Jar file!");
			System.exit(1);
		}
		errorTrace = null;
	}
}
