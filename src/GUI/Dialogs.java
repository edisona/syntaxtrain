package GUI;

import java.awt.SystemColor;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Dialogs
{
	public static void showHelpDialog()
	{
		final JTextArea helpTextArea = new JTextArea(
				"In order to use this program, first open a source file, which is accepted by the current grammar file.\n" +
				"If there's any error in your code, SyntaxTrain will show syntax diagrams to describe the error, just\n" +
				"like a stack trace. For an example you can try using the java grammar included and open example.java.\n\n" +
				"If a node in the diagram is marked blue then it means that node was correctly matched (no error here)\n" +
				"If instead the node is colored red, it means that the error occured here, and above you will see the\n" +
				"appropriate diagram for that node. Finally if the node is marked orange, that means this is what you\n" +
				"can write at that point (one or multiple nodes may be colored orange).\n" +
				"In the top there's a diagram showing where in your code the error is located.\n" +
				"Ex. it could be inside an if sentence inside your function inside your class.");
		helpTextArea.setEditable(false);
		helpTextArea.setBackground(SystemColor.control);
		JOptionPane.showMessageDialog(MainScreen.getInstance(), helpTextArea,"SyntaxTrain - Help",JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void showAboutDialog()
	{
		final JTextArea aboutTextArea = new JTextArea(
				"SyntaxTrain - Syntax Diagrams for Java Programs\n" +
				"Version 1.0\n" +
				"Copyright 2011 by Andreas Leon Aagaard Moth.\n\n" +
				"This program is free software: you can redistribute it and/or modify\n" +
				"it under the terms of the GNU General Public License as published by\n" +
				"the Free Software Foundation, either version 3 of the License, or\n" +
				"(at your option) any later version.\n" +
				"\n" +
				"This program is distributed in the hope that it will be useful,\n" +
				"but WITHOUT ANY WARRANTY; without even the implied warranty of\n" +
				"MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\n" +
				"GNU General Public License for more details.\n" +
				"\n" +
				"You should have received a copy of the GNU General Public License\n" +
				"along with this program.  If not, see <http://www.gnu.org/licenses/>.");
		aboutTextArea.setEditable(false);
		aboutTextArea.setBackground(SystemColor.control);
		JOptionPane.showMessageDialog(MainScreen.getInstance(), aboutTextArea,"About SyntaxTrain - version 1.0",JOptionPane.PLAIN_MESSAGE);
	}
}
