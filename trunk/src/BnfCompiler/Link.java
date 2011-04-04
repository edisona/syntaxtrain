package BnfCompiler;

import java.util.Stack;

public class Link
{
	public enum RepeatType {sequence, optional, atleastOnce, loop, oneOfMultiple}
	private String id;
	private Stack<Link> ids;
	private RepeatType repeating;
	private String UUID;
	private static int currentID = 0;
	
	public Link()
	{
		createLink( null, null );
	}
	
	public Link( Link link )
	{
		createLink( null, link );
	}
	
	//when this option is used, no functions can be used!
	public Link( String identifier )
	{
		//Replace " with '
		String id = identifier.replace("\"", "'");
		createLink( id, null );
	}
	
	private void createLink( String identifier, Link link )
	{
		ids = new Stack<Link>();
		if( link != null )
		{
			ids.push(link);
		}
		id = identifier;
		if( id != null )
		{
			UUID = "id" + Integer.toString(currentID++);
		}
		//by default all Links are sequences
		repeating = RepeatType.sequence;
	}
	
	public String getUUID()
	{
		return UUID;
	}
	
	private void setRepeat( RepeatType repeat )
	{
		this.repeating = repeat;
	}
	
	public RepeatType getRepeat()
	{
		return repeating;
	}
	
	public String getId()
	{
		return id;
	}
	
	public Stack<Link> getIds()
	{
		return ids;
	}
	
	/**
	 * Adds another link to the sequence
	 * @param link
	 */
	public void add( Link link )
	{
		ids.add(link);
	}
	
	/**
	 * This link requires just one of the ids, ex. "abc" | someRule | myrule | hehehe.
	 */
	public void oneOfMultiple()
	{
		setRepeat(RepeatType.oneOfMultiple);
	}
	
	/**
	 * This link is optional, ex. ["abc" someRule]
	 */
	public void optional()
	{
		integrityCheck();
		setRepeat(RepeatType.optional);
	}
	
	/**
	 * This link can loop from 0 to infinitely many times, ex. ("abc" someRule)* or <"abc" someRule>
	 */
	public void loop()
	{
		integrityCheck();
		setRepeat(RepeatType.loop);
	}
	
	/**
	 * This link loops atleast once, ex. ("abc" someRule)+
	 */
	public void loopAtleastOnce()
	{
		integrityCheck();
		setRepeat(RepeatType.atleastOnce);
	}
	
	private void integrityCheck()
	{
		if( id != null )
		{
			throw new Error("Integrity check error in Link, id is defined and trying to add other objects!");
		}
	}
	
	/*public String toString()
	{
		String retVal = "";
		switch( operator )
		{
		case and:
			retVal = " ";
			break;
		case or:
			retVal = "| ";
		}
		if( id != null )
		{
			retVal += id;
		}
		else
		{
			switch( repeating )
			{
			case atleastOnce:
				retVal += "-.-";
				break;
			case loop:
				retVal += "<";
				break;
			case optional:
				retVal += "[";
				break;
			case sequence:
				retVal += "(";
				break;
			}
			for( Link id : ids )
			{
				retVal += id.toString() + " ";
			}
			switch( repeating )
			{
			case atleastOnce:
				retVal += "-:-";
				break;
			case loop:
				retVal += ">";
				break;
			case optional:
				retVal += "]";
				break;
			case sequence:
				retVal += ")";
				break;
			}
		}
		return retVal;
	}*/
}
