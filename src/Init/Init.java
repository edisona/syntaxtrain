package Init;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

import javax.swing.JOptionPane;

import Xml.XmlNode;

import net.hydromatic.clapham.graph.Chart;

import Exceptions.XMLLoadException;
import Exceptions.XMLattributeDoesNotExist;
import Exceptions.XMLnodeDoesNotExist;
import GUI.MainScreen;
import GUI.Variables;
import GuiAPI.GuiApi;
import Kernel.GrammarInterface;
import KernelAPI.KernelApi;
import Library.StdLibrary;

public class Init
{
	private static final String optionsXmlFile = "options.xml";
	
	public static void main(String[] args)
	{
		Kernel.Variables.jarPath = (new File(Init.class.getProtectionDomain().getCodeSource().getLocation().getPath())).getParentFile().getAbsolutePath().replaceAll("%20", " ") + "\\";
		
		Chart.titleColor = Color.BLACK;
		Chart.titleFont = new Font("Serif", Font.PLAIN, 18);
		
		readOptions();
		
		MainScreen.getInstance();
		
		if( ! GrammarInterface.getInstance().loadGrammar("Grammar/" + Kernel.Variables.grammarName + ".xml") )
		{
			GuiApi.showMessage("An error occured while loading grammar file: " + Kernel.Variables.grammarName + ".jar.");
			System.exit(0);
		}
		GrammarInterface.getInstance().compile(); //to initialize kernel
		GuiApi.updateDiagrams(); //to initialize gui
		
		Variables.setCodeChanged(false);
		Variables.setDiagramsOutOfSynch(false);
		
		if( args.length > 0 )
		{
			File file = new File(args[0]);
			if( !file.exists() )
			{
				GuiApi.showMessage("Source file " + args[0] + " was not found.");
				System.exit(0);
			}
			KernelApi.readSourceFile(file);
			Variables.lastOpenedDirectory = file.getParent();
		}
	}
	
	private static void readOptions()
	{
		String optionsXml = StdLibrary.readFileAsString( Kernel.Variables.jarPath + optionsXmlFile );
		if( optionsXml == null )
		{
			JOptionPane.showMessageDialog( null, "There was a problem reading file " + Kernel.Variables.jarPath + optionsXmlFile + ".");
			System.exit(0);
		}
		
		try
		{
			XmlNode options = new XmlNode(optionsXml, "1.0");
			Kernel.Variables.grammarName = options.getChildNode("GUI").getChildNode("path").getAttribute("grammarFile");
			return;
		}
		catch (XMLLoadException e)
		{
		}
		catch (XMLattributeDoesNotExist e)
		{
		}
		catch (XMLnodeDoesNotExist e)
		{
		}
		JOptionPane.showMessageDialog( null, "Invalid xml in option file " + optionsXmlFile + ".jar.");
		System.exit(1);
	}
}
