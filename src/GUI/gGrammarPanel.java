package GUI;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class gGrammarPanel extends JPanel
{
	private static final long serialVersionUID = 1452823813888634187L;
	private static gGrammarPanel instance = null;
	
	private gGrammarPanel()
	{
		super(new BorderLayout());
		JScrollPane scroll = new JScrollPane(gGrammarDiagram.getInstance());
		scroll.getVerticalScrollBar().setUnitIncrement(16);
		add(BorderLayout.CENTER, scroll);
		add(BorderLayout.EAST, gGrammarOptions.getInstance());
	}
	
	public static synchronized gGrammarPanel getInstance()
	{
		if(instance == null)
		{
			instance = new gGrammarPanel();
		}
		return instance;
	}
}
