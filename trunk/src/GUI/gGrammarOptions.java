package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import KernelAPI.KernelApi;

public class gGrammarOptions extends JList implements ListCellRenderer, ListSelectionListener
{
	private static final long serialVersionUID = 4419173956236695445L;

	private static gGrammarOptions instance = null;
	
	private HashMap<String, Boolean> isChecked;
	private HashSet<String> errorTraceComponents;
    //used by getListCellRendererComponent to avoid allocating a new checkbox all the time
    private JCheckBox checkBox;
    private JLabel label;
    private JPanel panel;
    private String[] listData;
    private int numChecked;
	
	public gGrammarOptions()
	{
		clearCheckedRules();
        setCellRenderer( this );
        addListSelectionListener( this );

        checkBox = new JCheckBox();
        label = new JLabel();
        panel = new JPanel( new BorderLayout() );
        panel.add( BorderLayout.WEST, label );
        panel.add( BorderLayout.EAST, checkBox );
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        //set default grammars
        updateGrammars();
	}
	
	public Dimension getPreferredSize()
	{
		Dimension dim = super.getPreferredSize();
		dim.setSize(dim.getWidth()+20, dim.getHeight());
		return dim;
	}
	
	private void clearCheckedRules()
	{
		isChecked = new HashMap<String, Boolean>();
		errorTraceComponents = new HashSet<String>();
		ArrayList<String> grammarNames = KernelApi.getGrammars();
        if( grammarNames != null )
        {
        	listData = new String[grammarNames.size()+1];
        	listData[0] = "Syntax Components:";
	        for ( int i=0;i<grammarNames.size();i++ )
	        {
	        	String grammarName = grammarNames.get(i);
	        	listData[i+1] = grammarName;
	            isChecked.put( grammarName, false );
	        }
	        
	        setListData( listData );
        }
        
        numChecked = 0;
	}
	
	public void updateGrammars()
	{
		clearCheckedRules();
		showErrorTrace();
	}
	
	private void showErrorTrace()
	{
		if( KernelApi.getErrorTrace() != null )
		{
			for(Stack<String> ruleTrace : KernelApi.getErrorTrace())
			{
				String component = ruleTrace.firstElement();
				isChecked.put(component, true);
				errorTraceComponents.add(component);
			}
		}
	}
	
	public Component getListCellRendererComponent(
            JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus )
    {
        if ( !(value instanceof String) )
        {
            return new JLabel( "Error: " + value.toString() );
        }
        String name = ( String ) value;
        if( name.equalsIgnoreCase("Syntax Components:") )
        {
        	//top
        	checkBox.setSelected(false);
        	label.setText(name);
        	panel.setComponentOrientation( list.getComponentOrientation() );
        	panel.setBackground( new Color(200,200,200) );
        	checkBox.setBackground( new Color(200,200,200) );
        	checkBox.setSelected( numChecked > 0 );
            panel.setForeground( list.getForeground() );
            
        }
        else
        {
	        checkBox.setSelected( isChecked.get( name ) );
	        label.setText( name );
	
	        panel.setComponentOrientation( list.getComponentOrientation() );
	        if ( isChecked.get( name ) )
	        {
	            panel.setBackground( list.getSelectionBackground() );
	            checkBox.setBackground( list.getSelectionBackground() );
	            panel.setForeground( list.getSelectionForeground() );
	        }
	        else
	        {
	            panel.setBackground( list.getBackground() );
	            checkBox.setBackground( list.getBackground() );
	            panel.setForeground( list.getForeground() );
	        }
        }

        return panel;
    }

    public void valueChanged( ListSelectionEvent e )
    {
        //make sure we aren't dragging anything into the list
        if ( !e.getValueIsAdjusting() )
        {
            Object value = getSelectedValue();
            if ( value instanceof String )
            {
            	String name = ( String ) value;
            	if( name.equalsIgnoreCase("Syntax Components:") )
            	{
            		// header clicked
            		if( numChecked > 0 )
            		{
            			numChecked = 0;
            			for ( int i=1;i<listData.length;i++ )
            	        {
            				String grammarName = listData[i];
            				boolean showGrammar = false;
            				//make sure to still show the error trace
            				if( errorTraceComponents.contains(grammarName) )
            				{
            					showGrammar = true;
            				}
            				isChecked.put( grammarName, showGrammar );
							gGrammarDiagram.getInstance().setGrammarVisible(grammarName, showGrammar);
            	        }
            		}
            		else
            		{
            			numChecked = listData.length - 1 - errorTraceComponents.size();
            			for ( int i=1;i<listData.length;i++ )
            	        {
            				String grammarName = listData[i];
            	            isChecked.put( grammarName, true );
            	            gGrammarDiagram.getInstance().setGrammarVisible(grammarName, true);
            	        }
            		}
            	}
            	else
            	{
	            	boolean isSelected = isChecked.get( name );
	            	if( errorTraceComponents.contains( name ) )
	            	{
	            		// selection is part of the trace, so if it's turned off, then we move one step away from default (0), otherwise we move one closer.
	            		numChecked += isSelected ? 1 : -1;
	            	}
	            	else
	            	{
	            		//selection is not part of the error trace, if it's turned off then move one step closer to default (0), otherwise move one step away.
	            		numChecked += isSelected ? -1 : 1;
	            	}
	                isChecked.put( name, !isSelected );
	                gGrammarDiagram.getInstance().setGrammarVisible(name, !isSelected);
            	}
                removeSelectionInterval( 0, isChecked.size() );
            }
        }
    }
	
	public static synchronized gGrammarOptions getInstance()
	{
		if(instance == null)
		{
			instance = new gGrammarOptions();
		}
		return instance;
	}
}
