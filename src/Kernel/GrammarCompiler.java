package Kernel;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import Exceptions.XMLLoadException;
import Exceptions.XMLattributeDoesNotExist;
import Exceptions.XMLnodeDoesNotExist;
import Xml.XmlNode;

import net.hydromatic.clapham.parser.AlternateNode;
import net.hydromatic.clapham.parser.EbnfNode;
import net.hydromatic.clapham.parser.IdentifierNode;
import net.hydromatic.clapham.parser.LiteralNode;
import net.hydromatic.clapham.parser.OptionNode;
import net.hydromatic.clapham.parser.ProductionNode;
import net.hydromatic.clapham.parser.RepeatNode;
import net.hydromatic.clapham.parser.SequenceNode;

public class GrammarCompiler extends SourceCodeCompiler
{
	protected ArrayList<ProductionNode> productionNodes;
	protected ArrayList<String> grammars;
	private boolean lastHighlightConsumed;
	
	protected GrammarCompiler()
	{
		super();
		lastHighlightConsumed = false;
	}
	
	public ArrayList<String> getGrammars()
	{
		return grammars;
	}
	
	public List<ProductionNode> getProductionNodes()
	{
		return productionNodes;
	}
	
	protected void createBnfComponents()
	{
		productionNodes = new ArrayList<ProductionNode>();
		grammars = new ArrayList<String>();
		
		if( errorTrace == null || xmlGrammar == null )
		{
			return;
		}
		try
		{
			XmlNode xml = new XmlNode(xmlGrammar, Variables.xmlVersion);
			mainForLoop:
			for(XmlNode rule : xml.getChildNodes("rule"))
			{
				String ruleName = rule.getAttribute("ID");
				grammars.add(ruleName);
				//checks if there's a trace for the given rule
				for( int i=errorTrace.size() - 1;i>=0;i-- )
				{
					Stack<String> trace = errorTrace.get(i);
					if( trace.firstElement().equals( ruleName ))
					{
						@SuppressWarnings("unchecked")
						Stack<String> clone = (Stack<String>) trace.clone();
						clone.remove(0); //remove the first element indicating the rule name
						if( i == errorTrace.size() - 1 )
						{
							if( popLast )
							{
								clone.pop(); //hack, the very last element in the error trace is wrong and has to be removed.
							}
							productionNodes.add( createProductionNodeFromRule( rule, clone, null, true ) );
						}
						else
						{
							productionNodes.add( createProductionNodeFromRule( rule, clone, clone.lastElement(), false ) );
						}
						continue mainForLoop;
					}
				}
				productionNodes.add( createProductionNodeFromRule( rule, new Stack<String>(), null, false ) );
			}
			Collections.sort(grammars);
		} 
		catch (XMLLoadException e)
		{
			e.printStackTrace();
			System.out.println("XmlLoadException: " + e.toString());
			System.exit(1);
		}
		catch (XMLnodeDoesNotExist e)
		{
			e.printStackTrace();
			System.out.println("XMLnodeDoesNotExist: " + e.toString());
			System.exit(1);
		}
		catch (XMLattributeDoesNotExist e)
		{
			e.printStackTrace();
			System.out.println("XMLnodeDoesNotExist: " + e.toString());
			System.exit(1);
		}
	}

	//Returns a production node for the given rule, all rules can then be put together into a list
	private ProductionNode createProductionNodeFromRule( XmlNode rule, Stack<String> highlights, String errorNode, boolean markNextTokens )
	{
		try
		{
			
			
			if( !rule.getName().equalsIgnoreCase("rule") )
			{
				System.out.println("GrammarCompiler returns null - 1");
				return null;
			}
			
			String id = rule.getAttribute("ID");
			boolean markFirst = highlights.size() == 0;
			SequenceNode seq = createSequenceFromXml(rule, highlights, errorNode, markNextTokens, markFirst);
			return new ProductionNode(new IdentifierNode(id), seq );
		}
		catch (XMLattributeDoesNotExist e)
		{
			e.printStackTrace();
		}
		catch (XMLnodeDoesNotExist e)
		{
			e.printStackTrace();
		}
		System.out.println("GrammarCompiler returns null - 2");
		return null;
	}
	
	private SequenceNode createSequenceFromXml( XmlNode xml, Stack<String> highlights, String errorNode, boolean markNextTokens, boolean markThisOne ) throws XMLnodeDoesNotExist, XMLattributeDoesNotExist
	{
		List<EbnfNode> nodes = new ArrayList<EbnfNode>();
		boolean markThis = markThisOne;
		boolean highLightNext = false;
		
		for(XmlNode child : xml.getAllChildNodes())
		{
			highLightNext = false;
			if( lastHighlightConsumed || markThis )
			{
				lastHighlightConsumed = false;
				markThis = false;
				highLightNext = true;
			}
			nodes.add(createEbnfNodeFromXml(child, highlights, errorNode, markNextTokens, highLightNext));
		}
		return new SequenceNode(nodes);
	}
	
	private EbnfNode createEbnfNodeFromXml( XmlNode xml, Stack<String> highlights, String errorNode, boolean markNextTokens, boolean markThisOne ) throws XMLnodeDoesNotExist, XMLattributeDoesNotExist
	{
		String nodeName = xml.getName();
		boolean highLightNext = false;
		
		if( lastHighlightConsumed || markThisOne )
		{
			lastHighlightConsumed = false;
			highLightNext = true;
		}
		if( nodeName.equalsIgnoreCase("rule") )
		{
			String id = xml.getAttribute("ID");
			String uuid = xml.getAttribute("UUID");
			Font font;
			if( id.startsWith("'") )
			{
				font = new Font( "Courier New", Font.PLAIN, 14 );
				
				if( uuid.equals(errorNode) )
					return new LiteralNode(id, Color.RED, Color.BLACK, font);
				else if( (highLightNext || markThisOne) && markNextTokens )
					return new LiteralNode(id, Variables.highlightColor, Variables.highlightColor, font);
				else if( highlights.remove( uuid ) )
				{
					if( highlights.isEmpty() )
					{
						lastHighlightConsumed = true;
					}
					return new LiteralNode(id, Color.BLUE, Color.BLUE, font);
				}
				else
					return new LiteralNode(id, Color.BLACK, Color.BLACK, font);
			}
			else
			{
				font = new Font( "Serif", Font.PLAIN, 14 );
				
				if( uuid.equals(errorNode) )
					return new IdentifierNode(id, Color.RED, Color.BLACK, font);
				else if( (highLightNext || markThisOne) && markNextTokens )
					return new IdentifierNode(id, Variables.highlightColor, Variables.highlightColor, font);
				else if( highlights.remove( uuid ) )
				{
					if( highlights.isEmpty() )
					{
						lastHighlightConsumed = true;
					}
					return new IdentifierNode(id, Color.BLUE, Color.BLUE, font);
				}
				else
					return new IdentifierNode(id, Color.BLACK, Color.BLACK, font);
			}
		}
		else if( nodeName.equalsIgnoreCase("repeat"))
		{
			SequenceNode repeatSequence = createSequenceFromXml(xml, highlights, errorNode, markNextTokens, highLightNext);
			lastHighlightConsumed = highLightNext; // the next token should also be highlighted
			return new RepeatNode(repeatSequence);
		}
		else if( nodeName.equalsIgnoreCase("or"))
		{
			List<EbnfNode> nodes = new ArrayList<EbnfNode>();
			for(XmlNode child : xml.getChildNodes("option"))
			{
				nodes.add(createEbnfNodeFromXml(child, highlights, errorNode, markNextTokens, highLightNext));
			}
			return new AlternateNode(nodes);
		}
		else if( nodeName.equalsIgnoreCase("option"))
		{
			//this section is called from the "or" node above
			return createSequenceFromXml(xml, highlights, errorNode, markNextTokens, highLightNext);
		}
		else if( nodeName.equalsIgnoreCase("optional"))
		{
			SequenceNode optionalSequence = createSequenceFromXml(xml, highlights, errorNode, markNextTokens, highLightNext);
			lastHighlightConsumed = highLightNext; // the next token should also be highlighted
			return new OptionNode(optionalSequence);
		}
		throw new XMLnodeDoesNotExist("Unknown xml node.");
	}
}
