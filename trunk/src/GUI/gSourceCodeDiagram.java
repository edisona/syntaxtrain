package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.JScrollPane;

import KernelAPI.KernelApi;

import net.hydromatic.clapham.Clapham;
import net.hydromatic.clapham.graph.Chart;
import net.hydromatic.clapham.graph.Grammar;
import net.hydromatic.clapham.graph.Symbol;
import net.hydromatic.clapham.parser.EbnfNode;
import net.hydromatic.clapham.parser.IdentifierNode;
import net.hydromatic.clapham.parser.ProductionNode;
import net.hydromatic.clapham.parser.SequenceNode;

/**
 * Displays a rail-road diagram of the source code. (top)
 */
public class gSourceCodeDiagram extends JScrollPane
{
	private static final long serialVersionUID = 7253097565513080782L;
	private static gSourceCodeDiagram instance = null;
	private BufferedImage diagramImage;
	
	private gSourceCodeDiagram()
	{
		updateDiagram();
	}
	
	public Dimension getPreferredSize()
	{
		if( diagramImage != null)
		{
			return new Dimension(diagramImage.getWidth(), diagramImage.getHeight() + 30);
		}
		return new Dimension(400, 300);
	}
	
	public void paint(Graphics g)
	{
		setBackground(Color.WHITE);
		g.clearRect(0, 0, getWidth(), getHeight());
		int x = ( getWidth() - diagramImage.getWidth() ) / 2;
		int y = 10;//( getHeight() - diagramImage.getHeight() ) / 2;
		g.drawImage(diagramImage, x, y, null);
	}
	
	public void updateDiagram()
	{
		Font font = new Font( "Serif", Font.PLAIN, 14 );
		
		//Initialize
		List<ProductionNode> productionNodes = new ArrayList<ProductionNode>();
		List<EbnfNode> nodes = new ArrayList<EbnfNode>();
		
		//get grammar
		Stack<Stack<String>> errorTrace = KernelApi.getErrorTrace();
		if( errorTrace == null )
		{
			return;
		}
		for( Stack<String> ruleTrace : errorTrace )
		{
			nodes.add(new IdentifierNode(ruleTrace.firstElement(), Color.BLACK, Color.BLACK, font));
		}
		if( errorTrace.size() > 0 )
		{
			//there is an error, push an error node to the end of the sequence
			nodes.add(new IdentifierNode("error"));
		}
		else
		{
			//no compilation errors
			nodes.add(new IdentifierNode("No syntax errors"));
		}
		productionNodes.add(new ProductionNode(new IdentifierNode("Position of error"), new SequenceNode(nodes)));
		
		Grammar grammar = Clapham.buildGrammar(productionNodes);
		List<String> nameList = new ArrayList<String>();
		nameList.clear();
        nameList.addAll(grammar.symbolMap.keySet());
        
		diagramImage = drawNode( nameList.get(0), grammar);
		
		setSize(diagramImage.getWidth(), diagramImage.getHeight()+1);
		
		if(getParent() != null)
			getParent().doLayout();
		repaint();
	}
	
	private BufferedImage drawNode(String symbolName, Grammar grammar)
	{
		//temporary image to draw on
		BufferedImage tempImg = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics = tempImg.createGraphics();
		
		final Symbol symbol = grammar.symbolMap.get(symbolName);
		if (symbol.graph == null)
		{
		    throw new RuntimeException(
		        "Symbol '" + symbolName + "' not found");
		}

		final Chart chart = new Chart(grammar, (Graphics2D) graphics);
		chart.calcDrawing();
		chart.drawComponent(symbol);
		
		//draw the final image
		Dimension dim = chart.getDimension();
		BufferedImage finalDrawing = new BufferedImage((int)dim.getWidth(), (int)dim.getHeight(), BufferedImage.TYPE_INT_RGB);
		finalDrawing.createGraphics().drawImage(tempImg, 0, 0, this);
		return finalDrawing;
	}
	
	public static synchronized gSourceCodeDiagram getInstance()
	{
		if( instance == null )
		{
			instance = new gSourceCodeDiagram();
		}
		return instance;
	}
}
