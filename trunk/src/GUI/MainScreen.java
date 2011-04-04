package GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class MainScreen extends JFrame
{
	private static final long serialVersionUID = -5921202176825848947L;

	public MainScreen()
	{
		super("SyntaxTrain");
		//initialize frame
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 50, 1000, 700);
		setExtendedState(MAXIMIZED_BOTH);
		
		//add toolbar
		add( BorderLayout.PAGE_START, gToolbar.getInstance().getToolBar() );
		
		//center panel
		JPanel mainPanel = new JPanel(new BorderLayout());
			JSplitPane BottomPanes = new JSplitPane(
					JSplitPane.HORIZONTAL_SPLIT, 
					gSourceCode.getInstance(), 
					gGrammarPanel.getInstance()
					);
			
			JSplitPane topBottomPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, gSourceCodeDiagram.getInstance(), BottomPanes);
			mainPanel.add(topBottomPane);
		add( BorderLayout.CENTER, mainPanel );
		
		//show frame
		setVisible(true);

		try
		{
			Thread.sleep(50);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BottomPanes.setDividerLocation(0.2);
		topBottomPane.setDividerLocation(0.2);
	}
}
