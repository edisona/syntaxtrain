package GUI;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class gGrammarPanel extends JPanel
{
	private static final long serialVersionUID = 1452823813888634187L;
	private static gGrammarPanel instance = null;
	private boolean isGrammarOptionsVisible;
	private JScrollPane scrollGrammarOptions;
	private JSplitPane diagramsOptionsSplitPane;
	
	private gGrammarPanel()
	{
		super(new BorderLayout());
		//Grammar diagrams
		JScrollPane scrollGrammarDiagram = new JScrollPane(gGrammarDiagram.getInstance());
		scrollGrammarDiagram.getVerticalScrollBar().setUnitIncrement(16);
		//Grammar options
		scrollGrammarOptions = new JScrollPane(gGrammarOptions.getInstance());
		//by default the grammar options are hidden
		isGrammarOptionsVisible = false;
		
		//Split pane containing the diagram pane and the options pane
		diagramsOptionsSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollGrammarDiagram, scrollGrammarOptions);
		diagramsOptionsSplitPane.setEnabled(false);
		diagramsOptionsSplitPane.setDividerSize(0);
		diagramsOptionsSplitPane.setDividerLocation(0); //to avoid drawing a line at startup
		add(BorderLayout.CENTER, diagramsOptionsSplitPane);
	}
	
	public void paint(Graphics g)
	{
		if( isGrammarOptionsVisible )
		{
			diagramsOptionsSplitPane.setDividerLocation((int) (getWidth() - scrollGrammarOptions.getPreferredSize().getWidth()) - 1);
		}
		else
		{
			// hide grammar options
			diagramsOptionsSplitPane.setDividerLocation( 1.0 );
		}
		super.paint(g);
	}
	
	public void swapBetweenShowAndHideGrammarOptions()
	{
		isGrammarOptionsVisible = !isGrammarOptionsVisible;
		repaint();
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
