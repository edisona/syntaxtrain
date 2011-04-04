package Grammar;

import java.util.Stack;

import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

public abstract class BnfParser extends Parser
{
	public BnfParser(TokenStream input)
	{
		super(input);
	}
	
	public BnfParser(TokenStream input, RecognizerSharedState state)
	{
		super(input, state);
	}
	public int errorLine = -1;
	public Stack<Stack<String>> trace = new Stack<Stack<String>>();
	public void displayRecognitionError(String[] tokenNames, RecognitionException e) throws RuntimeException
	{
    		errorLine = e.line;
		throw new RuntimeException();
	}
	//the default call to check syntax
	public abstract void bnf() throws RecognitionException;
}
