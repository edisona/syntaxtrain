package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

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
		add( BorderLayout.CENTER, new JScrollPane( textPane ));
		updateSourceCode();
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
		if( lineNumber >= 0 )
		{
			Point errorOffsets = getLineStartEndOffset( lineNumber );
			if( errorOffsets != null )
				document.setCharacterAttributes(errorOffsets.x, errorOffsets.y - errorOffsets.x, errorAttrib, false);
		}
	}
	
	public Point getLineStartEndOffset(int line)
	{
		StringTokenizer st = new StringTokenizer(textPane.getText(),"\n");
		int start = 0, end;
		while (line>0)
		{
			try
			{
				String s = st.nextToken();
				start += s.length() + 1;
				line--;
			}
			catch (NoSuchElementException e)
			{
				return null;
			}
		}
		try
		{
			end = start + st.nextToken().length() + 1;
		}
		catch (NoSuchElementException e)
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
	
	public static synchronized gSourceCode getInstance()
	{
		if( instance == null )
		{
			instance = new gSourceCode();
		}
		return instance;
	}
}
