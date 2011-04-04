package Init;

import java.awt.Color;
import java.awt.Font;

import net.hydromatic.clapham.graph.Chart;

import GUI.MainScreen;
import Kernel.GrammarInterface;

public class Init
{
	
	public static void main(String[] args)
	{
		Chart.titleColor = Color.BLACK;
		Chart.titleFont = new Font("Serif", Font.PLAIN, 18);
		
		//Debug:
		GrammarInterface.getInstance().loadGrammar("Grammar/testgrammar.xml");
		GrammarInterface.getInstance().readSourceCode( "example.java" );
		GrammarInterface.getInstance().compile();
		
		new MainScreen();
	}
}
