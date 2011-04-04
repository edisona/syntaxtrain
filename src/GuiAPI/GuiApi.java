package GuiAPI;

import GUI.gGrammarDiagram;
import GUI.gGrammarOptions;
import GUI.gSourceCode;
import GUI.gSourceCodeDiagram;

public class GuiApi
{
	public static void update()
	{
		
	}
	
	public static void updateDiagrams()
	{
		gGrammarOptions.getInstance().updateGrammars();
		gGrammarDiagram.getInstance().updateDiagram();
		gSourceCodeDiagram.getInstance().updateDiagram();
		gSourceCode.getInstance().updateErrorPosition();
	}
}
