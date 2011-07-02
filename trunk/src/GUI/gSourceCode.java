package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Point;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.TabSet;
import javax.swing.text.TabStop;

import KernelAPI.KernelApi;

public class gSourceCode extends JPanel
{
	private static final long serialVersionUID = 4279528648857232158L;
	private static gSourceCode instance = null;
	private JTextPane textPane;
	
	private gSourceCode()
	{
		this.setLayout(new BorderLayout());
		textPane = new JTextPane();
		textPane.setFont(new Font("Courier New",Font.PLAIN, 14 ));
		setTabs(textPane, 4);
		textPane.getDocument().addDocumentListener(Controller.getInstance());
		add( BorderLayout.CENTER, textPane );
		updateErrorPosition();
	}
	
	public void updateErrorPosition()
	{
		MutableAttributeSet errorAttrib = new SimpleAttributeSet();
		MutableAttributeSet normAttrib = new SimpleAttributeSet();
		StyleConstants.setBackground(errorAttrib, new Color(255,150,50));
		StyledDocument document = textPane.getStyledDocument();
		
		//clear formatting
		document.setCharacterAttributes(0, textPane.getText().length(), normAttrib, true);
		
		int lineNumber = KernelApi.getErrorLine() - 1;
		int charPositionInLine = KernelApi.getErrorCharPositionInLine();
		if( lineNumber >= 0 )
		{
			Point errorOffsets = getLineStartEndOffset( lineNumber );
			if( errorOffsets != null )
			{
				document.setCharacterAttributes(errorOffsets.x + charPositionInLine, errorOffsets.y - errorOffsets.x - charPositionInLine, errorAttrib, true);
			}
		}
	}
	
	private Point getLineStartEndOffset(int line)
	{
		String text = textPane.getText().replace("\r", ""); //For some reason indexOf counts \r but document doesn't, so just remove all of them :)
		int start = 0, end;
		while (line>0)
		{
			start = text.indexOf("\n", start) + 1;
			line--;
		}
		if( start == -1 )
		{
			//just in case of any errors, shouldn't be any since the line info is based on this string
			start = 0;
		}
		end = text.indexOf("\n", start + 1);
		if( end == -1 )
		{
			end = textPane.getText().length();
		}
		
		return new Point(start,end);
	}
	
	public String getSourceCode()
	{
		return textPane.getText();
	}
	
	public void updateSourceCode()
	{
		textPane.setText(KernelApi.getSourceCode());
	}
	
	private void setTabs( JTextPane textPane, int charactersPerTab)
	{
		FontMetrics fm = textPane.getFontMetrics( textPane.getFont() );
		int charWidth = fm.charWidth( ' ' );
		int tabWidth = charWidth * charactersPerTab;
		TabStop[] tabs = new TabStop[10];
		for (int j = 0; j < tabs.length; j++)
		{
			tabs[j] = new TabStop( (j+1) * tabWidth );
		}
		TabSet tabSet = new TabSet(tabs);
		SimpleAttributeSet attributes = new SimpleAttributeSet();
		StyleConstants.setTabSet(attributes, tabSet);
		int length = textPane.getDocument().getLength();
		textPane.getStyledDocument().setParagraphAttributes(0, length, attributes, false);
	}
	
	public static synchronized gSourceCode getInstance()
	{
		if( instance == null )
		{
			instance = new gSourceCode();
		}
		return instance;
	}
}
