package BnfCompiler;

import org.antlr.tool.ANTLRErrorListener;
import org.antlr.tool.Message;
import org.antlr.tool.ToolMessage;

public class ErrorListener implements ANTLRErrorListener
{
	public int numErrorsAndWarnings = 0;
	
	private void addError( String error )
	{
		if( numErrorsAndWarnings == 0 )
		{
			//first error
			System.out.println("Bnf error.");
			System.out.println("Make sure theres no left recursion or multiple alternatives for rules.");
			System.out.println("List of errors (line numbers does not match with the given BNF):");
		}
		numErrorsAndWarnings++;
		System.out.println( error );
	}
	
	@Override
	public void error(Message msg)
	{
		addError(msg.toString());
	}

	@Override
	public void error(ToolMessage tmsg)
	{
		addError(tmsg.toString());
	}

	@Override
	public void info(String info)
	{
		System.out.println("Info: " + info);
	}

	@Override
	public void warning(Message warning)
	{
		addError(warning.toString());
	}
}
