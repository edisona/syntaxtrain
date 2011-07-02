package GUI;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class gToolbar
{
	private static gToolbar instance = null;
	private JToolBar toolbar;
	
	private gToolbar()
	{
		toolbar = createToolBar( Variables.TOOLBAR_ITEMS, Variables.SHORTCUTS );
	}
	
	private JToolBar createToolBar( String[] items, KeyStroke[] keystrokes )
	{
		JToolBar toolbar = new JToolBar();
		toolbar.setFloatable(false);
		for( int i = 0;i<items.length;i++ )
		{
			String item = items[i];
			KeyStroke key = keystrokes[i];
			JButton itemButton = new JButton(item);
			if( key != null)
			{
				itemButton.registerKeyboardAction(Controller.getInstance(), item, key, JComponent.WHEN_IN_FOCUSED_WINDOW);
				itemButton.setToolTipText(item);
			}
			itemButton.addActionListener(Controller.getInstance());
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
