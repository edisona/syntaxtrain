package GUI;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class MainScreen extends JFrame
{
	private static final long serialVersionUID = -5921202176825848947L;
	private static MainScreen instance = null;
	private String filename;
	private boolean isDividerLocationInitialized;
	private JSplitPane BottomPanes, topBottomPane;

	private MainScreen()
	{
		super("SyntaxTrain");
		filename = null;
		isDividerLocationInitialized = false;
		//initialize frame
		setLayout(new BorderLayout());
		setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
		addWindowListener(Controller.getInstance());
		setBounds(300, 50, 1000, 700);
		setExtendedState(MAXIMIZED_BOTH);
		
		//add toolbar
		add( BorderLayout.PAGE_START, gToolbar.getInstance().getToolBar() );
		
		//center panel
		JPanel mainPanel = new JPanel(new BorderLayout());
			JScrollPane sourceScrollPane = new JScrollPane( gSourceCode.getInstance() );
			sourceScrollPane.getVerticalScrollBar().setUnitIncrement(16);
			BottomPanes = new JSplitPane(
					JSplitPane.HORIZONTAL_SPLIT, 
					sourceScrollPane, 
					gGrammarPanel.getInstance()
					);
			BottomPanes.setOneTouchExpandable(true);
			JScrollPane scrollSourceDiagram = new JScrollPane(gErrorTrace.getInstance());
			topBottomPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, scrollSourceDiagram, BottomPanes);
			topBottomPane.setDividerSize(0);
			mainPanel.add(topBottomPane);
		add( BorderLayout.CENTER, mainPanel );
		
		//when using int the divider location can be set before showing the frame
		topBottomPane.setDividerLocation(80);
		
		//This is to ensure enough room is given to the source code
		//(sometimes java doesn't update the frame after the 30% division is set in the paint function below)
		BottomPanes.setDividerLocation(400);
		
		//show frame
		setVisible(true);
		doLayout();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		if( ! isDividerLocationInitialized )
		{
			BottomPanes.setDividerLocation(0.3); //when using double the divider must be set after showing the frame
			
			isDividerLocationInitialized = true;
			repaint();
		}
	}
	
	public void setFilename( String filename )
	{
		this.filename = filename;
		setTitle("SyntaxTrain - " + filename);
	}
	
	public String getFilename()
	{
		return filename;
	}
	
	public static MainScreen getInstance()
	{
		if(instance == null)
		{
			instance = new MainScreen();
		}
		return instance;
	}
}
