package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
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
    //used by getListCellRendererComponent to avoid allocating a new checkbox all the time
    private JCheckBox checkBox;
    private JLabel label;
    private JPanel panel;
    private String[] listData;
    private int numChecked;
	
	public gGrammarOptions()
	{
		clearCheckedRules();
        //this.setName("test");
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
		dim.setSize(dim.getWidth()+70, dim.getHeight());
		return dim;
	}
	
	private void clearCheckedRules()
	{
		isChecked = new HashMap<String, Boolean>();
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
		if( KernelApi.getErrorTrace() != null )
		{
			for(Stack<String> ruleTrace : KernelApi.getErrorTrace())
			{
				isChecked.put(ruleTrace.firstElement(), true);
				numChecked++;
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
            		//top
            		if( numChecked > 0 )
            		{
            			numChecked = 0;
            			for ( int i=1;i<listData.length;i++ )
            	        {
            				String grammarName = listData[i];
            	            isChecked.put( grammarName, false );
            	            gGrammarDiagram.getInstance().setGrammarVisible(grammarName, false);
            	        }
            		}
            		else
            		{
            			numChecked = listData.length - 1;
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
	            	numChecked += isSelected ? -1 : 1;
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
