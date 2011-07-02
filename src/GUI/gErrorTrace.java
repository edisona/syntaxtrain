package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JPanel;

import KernelAPI.KernelApi;

/**
 * Displays a rail-road diagram of the source code. (top)
 */
public class gErrorTrace extends JPanel
{
	private static final int SPACE_BETWEEN_BOXES = 10, SPACE_ON_EACH_SIDE_INSIDE_BOXES = 2;
	private static final long serialVersionUID = 7253097565513080782L;
	private static gErrorTrace instance = null;
	private ArrayList<String> errorTrace;
	private Dimension size;
	private boolean outOfSync;
	
	private gErrorTrace()
	{
		setBackground(Color.WHITE);
		updateDiagram();
		outOfSync = false;
	}
	
	public Dimension getPreferredSize()
	{
		if( size != null )
			return size;
		return new Dimension(400, 100);
	}
	
	public void updateSyncStatus()
	{
		outOfSync = Variables.isDiagramsOutOfSync();
		getParent().repaint();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Font header_font = new Font( "Serif", Font.PLAIN, 20 );
		Font box_font = new Font( "Serif", Font.PLAIN, 14 );
		int posX = 15, posY = 25;
		
		g.setFont(header_font);
		String textBuffer = "No syntax errors";
		if( errorTrace.size() > 0 )
		{
			textBuffer = "First syntax error: ";
		}
		Rectangle2D bounds = g.getFontMetrics().getStringBounds(textBuffer, g);
		posY = (int)bounds.getHeight() + 5;
		g.drawString(textBuffer, posX, posY);
		
		if( outOfSync )
		{
			textBuffer = "modified";
			g.setFont(new Font( "Serif", Font.PLAIN, 12));
			int modHeight = (int)g.getFontMetrics().getStringBounds(textBuffer, g).getHeight();
			g.drawString(textBuffer, posX, posY + modHeight + 3);
		}
		
		posX += bounds.getWidth();
		
		g.setFont(box_font);
		for( int i=errorTrace.size()-1;i>0;i-- )
		{
			//text
			g.setColor(Color.BLACK);
			textBuffer = errorTrace.get(i);
			g.drawString(textBuffer, posX, posY);
			bounds = g.getFontMetrics().getStringBounds(textBuffer, g);
			
			//rectangle
			g.setColor(Color.RED);
			g.drawRect(posX - SPACE_ON_EACH_SIDE_INSIDE_BOXES, (int) (posY - bounds.getHeight()), (int) (bounds.getWidth() + SPACE_ON_EACH_SIDE_INSIDE_BOXES * 2), (int)bounds.getHeight() * 3 / 2);
			posX += SPACE_BETWEEN_BOXES;
			posX += bounds.getWidth();
		}
		size = new Dimension(posX, posY);
		getParent().doLayout();
	}
	
	public void updateDiagram()
	{
		errorTrace = new ArrayList<String>();
		//get grammar
		Stack<Stack<String>> errorTrace = KernelApi.getErrorTrace();
		if( errorTrace == null )
		{
			return;
		}
		for( Stack<String> ruleTrace : errorTrace )
		{
			this.errorTrace.add(ruleTrace.firstElement());
		}
		
		if(getParent() != null)
			getParent().doLayout();
		repaint();
	}
	
	public static synchronized gErrorTrace getInstance()
	{
		if( instance == null )
		{
			instance = new gErrorTrace();
		}
		return instance;
	}
}
