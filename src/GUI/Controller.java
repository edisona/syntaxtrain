package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import GuiAPI.GuiApi;
import KernelAPI.KernelApi;

public class Controller implements ActionListener, WindowListener, DocumentListener
{
	private static Controller instance;
	
	private Controller()
	{
	}
	
	public void actionPerformed(ActionEvent action)
	{
		String command = action.getActionCommand();
		if( command.equals(Variables.OPEN_SOURCE_FILE) )
		{
			
			final JFileChooser fileChooser = new JFileChooser(Variables.lastOpenedDirectory);
			int retVal = fileChooser.showOpenDialog(MainScreen.getInstance());
			if( retVal == JFileChooser.APPROVE_OPTION )
			{
				File selectedFile = fileChooser.getSelectedFile();
				KernelApi.readSourceFile(selectedFile);
				Variables.lastOpenedDirectory = selectedFile.getParent();
			}
		}
		else if( command.equals(Variables.RELOAD_SOURCE_FILE) )
		{
			KernelApi.reloadSourceCode();
		}
		else if( command.equals(Variables.CHECK_SYNTAX) )
		{
			KernelApi.setSourceCode(gSourceCode.getInstance().getSourceCode());
			GuiApi.updateDiagrams();
		}
		else if( command.equals(Variables.SAVE_SOURCE_FILE))
		{
			saveSourceCode();
		}
		else if( command.equals(Variables.SHOW_HIDE_BNF_GRAMMARS))
		{
			gGrammarPanel.getInstance().swapBetweenShowAndHideGrammarOptions();
		}
		else if( command.equals(Variables.HELP))
		{
			Dialogs.showHelpDialog();
		}
		else if( command.equals(Variables.ABOUT))
		{
			Dialogs.showAboutDialog();
		}
		else
		{
			System.out.println("Unknown command: " + command);
		}
	}
	
	private boolean saveSourceCode()
	{
		try
		{
			KernelApi.setSourceCode(gSourceCode.getInstance().getSourceCode());
			KernelApi.saveSourceCode();
			Variables.setCodeChanged(false);
			return true;
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(MainScreen.getInstance(), "Failed to save file!");
		}
		return false;
	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{
	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		if( Variables.isCodeChanged() )
		{
			String filename = MainScreen.getInstance().getFilename(); 
			if( filename == null )
			{
				System.exit(0);
			}
			int result = JOptionPane.showConfirmDialog(MainScreen.getInstance(), "Save file " + filename + "?", "Close", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			switch( result )
			{
			case JOptionPane.YES_OPTION:
				if( saveSourceCode() )
				{
					System.exit(0);
				}
				break;
			case JOptionPane.NO_OPTION:
				System.exit(0);
				break;
			}
		}
		else
		{
			System.exit(0);
		}
	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
	}

	@Override
	public void changedUpdate(DocumentEvent e)
	{
		sourceChanged();
	}

	@Override
	public void insertUpdate(DocumentEvent e)
	{
		sourceChanged();
	}

	@Override
	public void removeUpdate(DocumentEvent e)
	{
		sourceChanged();
	}
	public void sourceChanged()
	{
		Variables.setCodeChanged(true);
		Variables.setDiagramsOutOfSynch(true);
		gErrorTrace.getInstance().updateSyncStatus();
	}
	
	public static Controller getInstance()
	{
		if( instance == null )
		{
			instance = new Controller();
		}
		return instance;
	}
}
