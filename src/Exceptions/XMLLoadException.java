package Exceptions;

public class XMLLoadException extends Exception
{
	private static final long serialVersionUID = -2522214346015679085L;
	private String error;
	
	public XMLLoadException( String error )
	{
		this.error = error;
	}
	
	public String toString()
	{
		return error;
	}
}
