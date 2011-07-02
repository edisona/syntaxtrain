package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import javax.swing.JPanel;

import KernelAPI.KernelApi;
import Library.Lock;

import net.hydromatic.clapham.Clapham;
import net.hydromatic.clapham.graph.Chart;
import net.hydromatic.clapham.graph.Grammar;
import net.hydromatic.clapham.graph.Symbol;
import net.hydromatic.clapham.parser.ProductionNode;

/**
 * Displays a rail-road diagram of the source code (bottom middle)
 */
public class gGrammarDiagram extends JPanel
{
	private static final long serialVersionUID = 1333493020186127182L;
	private static gGrammarDiagram instance = null;
	private BufferedImage[] grammarDiagrams;
	private HashMap<String, Integer> grammarToId;
	private String[] grammars;
	private boolean[] showGrammar;
	private Lock grammarDiagramsLock;
	
	private gGrammarDiagram()
	{
		grammarDiagramsLock = new Lock();
		setBackground(Color.WHITE);
		updateDiagram();
	}
	
	synchronized public void updateDiagram()
	{
		ArrayList<String> grammarNames = KernelApi.getGrammars();
		if( grammarNames == null )
		{
			return;
		}
		grammarDiagramsLock.P();
		//initialize grammar varaibles
		int grammarId = 0;
        grammars = new String[grammarNames.size()];
		showGrammar = new boolean[grammarNames.size()];
		grammarToId = new HashMap<String, Integer>();
		grammarDiagrams = new BufferedImage[grammarNames.size()];

		if( KernelApi.getErrorTrace() != null ) //== null if no error
		{
			@SuppressWarnings("unchecked")
			Stack<Stack<String>> errorTrace = (Stack<Stack<String>>) KernelApi.getErrorTrace().clone();
			while(!errorTrace.isEmpty())
			{
				String ruleName = errorTrace.pop().firstElement();
				if( grammarToId.containsKey(ruleName) )
	        		continue;
				grammars[grammarId] = ruleName;
				showGrammar[grammarId] = true;
				grammarToId.put(ruleName, grammarId);
				grammarId++;
			}
		}
		
		if( grammarNames != null )
        {
	        for ( String grammarName : grammarNames )
	        {
	        	if( grammarToId.containsKey(grammarName) )
	        		continue;
	        	
	        	grammars[grammarId] = grammarName;
				showGrammar[grammarId] = false;
				grammarToId.put(grammarName, grammarId);
				grammarId++;
	        }
        }
		
		//build grammar diagrams
		List<ProductionNode> productionNodes = KernelApi.getGrammarProductionNodes();
		if( productionNodes == null )
		{
			return;
		}
		Grammar grammar = Clapham.buildGrammar(productionNodes);
		List<String> nameList = new ArrayList<String>();
		nameList.clear();
        nameList.addAll(grammar.symbolMap.keySet());
        
		for( String grammarName : nameList )
		{
			BufferedImage image = drawNode(grammarName, grammar);
			int id = grammarToId.get(grammarName);
			grammarDiagrams[id] = image;
		}
		grammarDiagramsLock.V();

		//show default grammars
		updateDimensions();
		repaint();
	}
	
	public void setGrammarVisible( String grammar, boolean visible )
	{
		int id = grammarToId.get(grammar);
		showGrammar[id] = visible;
		
		updateDimensions();
		repaint();
	}
	
	private void updateDimensions()
	{
		int width=0, height=0;
		
		for( int i=0;i<grammars.length;i++ )
		{
			if(showGrammar[i])
			{
				BufferedImage image = grammarDiagrams[i];
				
				width = Math.max(image.getWidth(), width);
	        	height += image.getHeight();
			}
		}
		Dimension dim = new Dimension(width, height);
        this.setSize(dim);
        this.setPreferredSize(dim);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		if( grammars == null )
		{
			return;
		}
		grammarDiagramsLock.P();
		for( int i=0;i<grammars.length;i++ )
		{
			if(showGrammar[i])
			{
				BufferedImage image = grammarDiagrams[i];
				g.drawImage(image, 0, 0, null);
				g.translate(0, image.getHeight());
			}
		}
		grammarDiagramsLock.V();
	}
	
	private BufferedImage drawNode(String symbolName, Grammar grammar)
	{
		//temporary image to draw on
		BufferedImage tempImg = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics = tempImg.createGraphics();
		
		Symbol symbol = grammar.symbolMap.get(symbolName);
		if (symbol.graph == null)
		{
		    throw new RuntimeException(
		        "Symbol '" + symbolName + "' not found");
		}
		
		Chart chart = new Chart(grammar, (Graphics2D) graphics);
		chart.calcDrawing();
		chart.drawComponent(symbol);
		
		//draw the final image
		Dimension dim = chart.getDimension();
		
		BufferedImage finalDrawing = new BufferedImage((int)dim.getWidth(), (int)dim.getHeight() + 5, BufferedImage.TYPE_INT_RGB);
		graphics = finalDrawing.createGraphics();
		
		chart = new Chart(grammar, (Graphics2D) graphics);
		chart.calcDrawing();
		chart.drawComponent(symbol);
		return finalDrawing;
	}
	
	public static synchronized gGrammarDiagram getInstance()
	{
		if( instance == null )
		{
			instance = new gGrammarDiagram();
		}
		return instance;
	}
}
