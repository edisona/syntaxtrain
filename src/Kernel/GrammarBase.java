package Kernel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import javax.swing.JOptionPane;

import GuiAPI.GuiApi;
import Library.StdLibrary;

public class GrammarBase
{
	protected String sourceCode;
	protected String xmlGrammar;
	protected URLClassLoader classLoader;
	protected File currentFile;
	
	protected GrammarBase()
	{
		boolean success = false;
		String jarFileName = Variables.grammarName + ".jar";
		sourceCode = "";
		/*
		 * Load jar file
		 */
		try
		{
			File jarFile = new File(jarFileName);
			if( jarFile.exists())
			{
				URL[] urls = {jarFile.toURI().toURL()};
				classLoader = new URLClassLoader(urls, ClassLoader.getSystemClassLoader());
				success = true;
			}
		}
		catch (MalformedURLException e)
		{
		}
		if( !success )
		{
			JOptionPane.showMessageDialog( null, "Jar file could not be read: " + jarFileName);
			System.exit(1);
		}
	}
	
	public void reloadSourceCode()
	{
		readSourceCode(currentFile);
	}
	
	public void readSourceCode( File file )
	{
		currentFile = file;
		if( file == null )
		{
			return;
		}
		sourceCode = StdLibrary.readFileAsString( file );
		GuiApi.updateSourceCode( file.getName() );
	}
	
	public boolean loadGrammar( String grammarFile )
	{
		xmlGrammar = StdLibrary.readFileAsString( classLoader.getResourceAsStream( grammarFile ) );
		return xmlGrammar == null ? false : true;
	}
	
	public String getSourceCode()
	{
		return sourceCode;
	}
	public void setSourceCode( String code )
	{
		sourceCode = code;
	}
	
	public void saveSourceCode() throws IOException
	{
		if( sourceCode == null || currentFile == null )
		{
			throw new IOException();
		}
		FileOutputStream stream = new FileOutputStream(currentFile);
		stream.write(sourceCode.getBytes());
		stream.close();
	}
}
