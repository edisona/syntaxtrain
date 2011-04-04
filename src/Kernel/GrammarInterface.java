package Kernel;

public class GrammarInterface extends GrammarCompiler
{
	private static GrammarInterface instance = null;
	
	private GrammarInterface()
	{
		super();
	}
	
	public void compile()
	{
		compileSourceCode();
		createBnfComponents();
	}
	
	public static synchronized GrammarInterface getInstance()
	{
		if(instance == null)
		{
			instance = new GrammarInterface();
		}
		return instance;
	}
}
