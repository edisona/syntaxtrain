package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class StdLibrary
{
	public static String xmlEscapeString( String str )
	{
		return str.replace("\"", "&quot;").replace("&", "&amp;").replace("'", "&apos;").replace("<", "&lt;").replace(">", "&gt;");
	}
	
	public static String xmlUnEscapeString( String str )
	{
		return str.replace("&quot;", "\"").replace("&amp;", "&").replace("&apos;", "'").replace("&lt;", "<").replace("&gt;", ">");
	}
	
	public static String readFileAsString(InputStream inputstream)
	{
		if( inputstream == null )
		{
			return null;
		}
        return readFileAsString(new InputStreamReader(inputstream));
    }
	public static String readFileAsString(File file)
	{
        try
        {
			return readFileAsString(new FileInputStream(file));
		}
        catch (FileNotFoundException e)
		{
			return null;
		}
    }
	/**
	 * Reads a file and returns it's content
	 * @param filePath path of the file to read
	 * @return Content of the file specified, returns null if file does not exist or there's an IOException.
	 */
	public static String readFileAsString(String filePath)
	{
        try
        {
        	return readFileAsString(new FileReader(filePath));
        }
        catch (FileNotFoundException e)
        {
        	return null;
        }
    }
	
	public static String readFileAsString(Reader reader)
	{
        try {
			StringBuffer fileData = new StringBuffer(1000);
			char[] buf = new char[1024];
			int numRead=0;
			while((numRead=reader.read(buf)) != -1){
			    String readData = String.valueOf(buf, 0, numRead);
			    fileData.append(readData);
			    buf = new char[1024];
			}
			reader.close();
			return fileData.toString();
        }
		catch (IOException e) {}
		return null;
    }
}
