package GUI;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class gToolbar
{
	private static gToolbar instance = null;
	private JToolBar toolbar;
	private cToolbar controller;
	
	private gToolbar()
	{
		controller = new cToolbar();
		
		toolbar = createToolBar( Constants.TOOLBAR_ITEMS );
	}
	
	private JToolBar createToolBar( String[] items )
	{
		JToolBar toolbar = new JToolBar();
		toolbar.setFloatable(false);
		for( String item : items )
		{
			JButton itemButton = new JButton(item);
			itemButton.addActionListener(controller);
			toolbar.add( itemButton );
		}
		return toolbar;
	}
	
	public JToolBar getToolBar()
	{
		return toolbar;
	}
	
	public static synchronized gToolbar getInstance()
	{
		if( instance == null )
		{
			instance = new gToolbar();
		}
		return instance;
	}
}
