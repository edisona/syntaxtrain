package Exceptions;

public class XMLnodeDoesNotExist extends Exception
{
	private static final long serialVersionUID = 2952107033994886886L;
	private String error;
	
	public XMLnodeDoesNotExist( String node )
	{
		error = "Missing node: " + node;
	}
	
	public String toString()
	{
		return error;
	}
}
