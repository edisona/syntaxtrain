package GuiAPI;

import javax.swing.JOptionPane;

import GUI.MainScreen;
import GUI.Variables;
import GUI.gGrammarDiagram;
import GUI.gGrammarOptions;
import GUI.gSourceCode;
import GUI.gErrorTrace;

public class GuiApi
{
	public static void updateDiagrams()
	{
		boolean wasCodeChanged = Variables.isCodeChanged();
		gGrammarOptions.getInstance().updateGrammars();
		gGrammarDiagram.getInstance().updateDiagram();
		gErrorTrace.getInstance().updateDiagram();
		gSourceCode.getInstance().updateErrorPosition();
		
		Variables.setDiagramsOutOfSynch(false);
		gErrorTrace.getInstance().updateSyncStatus();
		Variables.setCodeChanged(wasCodeChanged);
	}

	public static void updateSourceCode(String fileOpened)
	{
		MainScreen.getInstance().setFilename(fileOpened);
		gSourceCode.getInstance().updateSourceCode();
		
		Variables.setCodeChanged(false);
	}
	
	public static void showMessage( String message )
	{
		JOptionPane.showMessageDialog(MainScreen.getInstance(), message);
	}
}
