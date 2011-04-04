package KernelAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import net.hydromatic.clapham.parser.ProductionNode;

import Kernel.GrammarInterface;

public class KernelApi
{
	//GETTERS
	public static String getSourceCode()
	{
		return GrammarInterface.getInstance().getSourceCode();
	}
	
	public static Stack<Stack<String>> getErrorTrace()
	{
		return GrammarInterface.getInstance().getErrorTrace();
	}
	
	public static ArrayList<String> getGrammars()
	{
		return GrammarInterface.getInstance().getGrammars();
	}
	
	public static List<ProductionNode> getGrammarProductionNodes()
	{
		return GrammarInterface.getInstance().getProductionNodes();
	}
	
	public static int getErrorLine()
	{
		return GrammarInterface.getInstance().getErrorLine();
	}
	
	//SETTERS
	public static void setSourceCode(String code)
	{
		GrammarInterface.getInstance().setSourceCode(code);
		GrammarInterface.getInstance().compile();
	}
}
