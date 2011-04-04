package Kernel;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import Library.StdLibrary;

public class GrammarBase
{
	protected String sourceCode;
	protected String xmlGrammar;
	protected URLClassLoader classLoader;
	
	protected GrammarBase()
	{
		boolean success = false;
		sourceCode = "";
		/*
		 * Load jar file
		 */
		try
		{
			File jarFile = new File(Variables.grammarName + ".jar");
			URL[] urls = {jarFile.toURI().toURL()};
			classLoader = new URLClassLoader(urls, ClassLoader.getSystemClassLoader());
			success = true;
		}
		catch (MalformedURLException e)
		{
		}
		if( !success )
		{
			System.out.println("Invalid Jar file!");
			System.exit(1);
		}
	}
	
	public void readSourceCode( String filename )
	{
		sourceCode = StdLibrary.readFileAsString( filename );
		//sourceCode = "class test\n{\n\tboolean ab();\n\tboolean ab()\n}";
		//sourceCode = "class test {";
	}
	
	public void loadGrammar( String xmlFileName )
	{
		xmlGrammar = StdLibrary.readFileAsString(classLoader.getResourceAsStream(xmlFileName));
	}
	
	public String getSourceCode()
	{
		return sourceCode;
	}
	public void setSourceCode( String code )
	{
		sourceCode = code;
	}
	
	public void saveSourceCode( String filename )
	{
		//TODO: save source code to file
	}
}
