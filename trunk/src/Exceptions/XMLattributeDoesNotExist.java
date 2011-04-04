package Exceptions;

public class XMLattributeDoesNotExist extends Exception
{
	private static final long serialVersionUID = -1349699666130356843L;
	String attribute;
	
	public XMLattributeDoesNotExist(String attribute)
	{
		System.out.println("XML attribute does not exist: " + attribute);
	}
}
