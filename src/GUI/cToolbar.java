package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GuiAPI.GuiApi;
import KernelAPI.KernelApi;

public class cToolbar implements ActionListener
{
	public void actionPerformed(ActionEvent action)
	{
		String command = action.getActionCommand();
		if( command.equals(Constants.OPEN_SOURCE_FILE))
		{
			
		}
		else if( command.equals(Constants.CHECK_SYNTAX))
		{
			KernelApi.setSourceCode(gSourceCode.getInstance().getSourceCode());
			GuiApi.updateDiagrams();
		}
		else if( command.equals(Constants.SAVE_SOURCE_FILE))
		{
			
		}
		else if( command.equals(Constants.PREFERENCES))
		{
			
		}
		else if( command.equals(Constants.HELP))
		{
			
		}
		else if( command.equals(Constants.ABOUT))
		{
			
		}
		else
		{
			System.out.println("Unknown command: " + command);
		}
	}
	
}
