package GUI;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class Variables
{
	public static String lastOpenedDirectory = ".";
	//Toolbar strings
	public final static String[] TOOLBAR_ITEMS =
	{
		Variables.OPEN_SOURCE_FILE, 
		Variables.RELOAD_SOURCE_FILE,
		Variables.CHECK_SYNTAX, 
		Variables.SHOW_HIDE_BNF_GRAMMARS,
		Variables.SAVE_SOURCE_FILE,
		Variables.HELP,
		Variables.ABOUT};
	
	public final static KeyStroke[] SHORTCUTS =
	{
		KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK),
		KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_DOWN_MASK),
		KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0 ),
		KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0 ),
		KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK),
		null,
		null
	};
	
	public final static String SEPERATOR = "seperator";
	public final static String OPEN_SOURCE_FILE = "Open";
	public final static String RELOAD_SOURCE_FILE = "Reload file";
	public final static String SAVE_SOURCE_FILE = "Save";
	public final static String CHECK_SYNTAX = "Check syntax";
	public final static String SHOW_HIDE_BNF_GRAMMARS = "Show/hide syntax components";
	public final static String HELP = "Help";
	public final static String ABOUT = "About";
	
	private static boolean codeChanged = false;
	public static boolean isCodeChanged()
	{
		return codeChanged;
	}
	public static void setCodeChanged(boolean codeChanged)
	{
		Variables.codeChanged = codeChanged;
	}
	private static boolean diagramsOutOfSync = false;
	public static boolean isDiagramsOutOfSync()
	{
		return diagramsOutOfSync;
	}
	public static void setDiagramsOutOfSynch(boolean diagramsOutOfSynch)
	{
		Variables.diagramsOutOfSync = diagramsOutOfSynch;
	}
}
