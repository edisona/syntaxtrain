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
	
	protected GrammarCompiler()
	{
		super();
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
		try
		{
			productionNodes = new ArrayList<ProductionNode>();
			grammars = new ArrayList<String>();
			
			XmlNode xml = new XmlNode(xmlGrammar, Variables.xmlVersion);
			mainForLoop:
			for(XmlNode rule : xml.getChildNodes("rule"))
			{
				String ruleName = rule.getAttribute("ID");
				grammars.add(ruleName);
				//checks if there's a trace for the given rule
				for( int i=0;i<errorTrace.size();i++ )
				{
					Stack<String> trace = errorTrace.get(i);
					if( trace.firstElement().equals( ruleName ))
					{
						@SuppressWarnings("unchecked")
						Stack<String> clone = (Stack<String>) trace.clone();
						clone.remove(0); //remove the first element indicating the rule name
						String errorNode = errorTrace.size() > i+1 ? errorTrace.get(i+1).firstElement() : null;
						productionNodes.add( createProductionNodeFromRule( rule, trace, errorNode ) );
						continue mainForLoop;
					}
				}
				productionNodes.add( createProductionNodeFromRule( rule, new Stack<String>(), null ) );
			}
			Collections.sort(grammars);
		} 
		catch (XMLLoadException e)
		{
			System.out.println("XmlLoadException: " + e.toString());
			System.exit(1);
		}
		catch (XMLnodeDoesNotExist e)
		{
			System.out.println("XMLnodeDoesNotExist: " + e.toString());
			System.exit(1);
		}
		catch (XMLattributeDoesNotExist e)
		{
			System.out.println("XMLnodeDoesNotExist: " + e.toString());
			System.exit(1);
		}
	}

	//Returns a production node for the given rule, all rules can then be put together into a list
	private static ProductionNode createProductionNodeFromRule( XmlNode rule, Stack<String> highlights, String errorNode )
	{
		try
		{
			List<EbnfNode> nodes = new ArrayList<EbnfNode>();
			
			if( !rule.getName().equalsIgnoreCase("rule") )
			{
				System.out.println("GrammarCompiler returns null - 1");
				return null;
			}
			
			String id = rule.getAttribute("ID");
			for(XmlNode child : rule.getAllChildNodes())
			{
				nodes.add(createEbnfNodeFromXml(child, highlights, errorNode));
			}
			return new ProductionNode(new IdentifierNode(id), new SequenceNode(nodes) );
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
	
	private static EbnfNode createEbnfNodeFromXml( XmlNode xml, Stack<String> highlights, String errorNode )
	{
		String nodeName = xml.getName();
		try
		{
			if( nodeName.equalsIgnoreCase("rule") )
			{
				String id = xml.getAttribute("ID");
				Font font;
				if( id.startsWith("'") )
				{
					font = new Font( "Courier New", Font.PLAIN, 14 );
					
					if( id.equals(errorNode) )
						return new LiteralNode(xml.getAttribute("ID"), Color.RED, Color.BLACK, font);
					if( highlights.contains( xml.getAttribute("UUID") ) )
						return new LiteralNode(xml.getAttribute("ID"), Color.BLUE, Color.BLUE, font);
					else
						return new LiteralNode(xml.getAttribute("ID"), Color.BLACK, Color.BLACK, font);
				}
				else
				{
					font = new Font( "Serif", Font.PLAIN, 14 );
					
					if( id.equals(errorNode) )
						return new IdentifierNode(xml.getAttribute("ID"), Color.RED, Color.BLACK, font);
					if( highlights.contains( xml.getAttribute("UUID") ) )
						return new IdentifierNode(xml.getAttribute("ID"), Color.BLUE, Color.BLUE, font);
					else
						return new IdentifierNode(xml.getAttribute("ID"), Color.BLACK, Color.BLACK, font);
				}
			}
			else if( nodeName.equalsIgnoreCase("repeat"))
			{
				List<EbnfNode> nodes = new ArrayList<EbnfNode>();
				for(XmlNode child : xml.getAllChildNodes())
				{
					nodes.add(createEbnfNodeFromXml(child, highlights, errorNode));
				}
				return new RepeatNode(new SequenceNode(nodes));
			}
			else if( nodeName.equalsIgnoreCase("or"))
			{
				List<EbnfNode> nodes = new ArrayList<EbnfNode>();
				for(XmlNode child : xml.getChildNodes("option"))
				{
					nodes.add(createEbnfNodeFromXml(child, highlights, errorNode));
				}
				return new AlternateNode(nodes);
			}
			else if( nodeName.equalsIgnoreCase("option"))
			{
				//this section is called from the "or" node above
				List<EbnfNode> nodes = new ArrayList<EbnfNode>();
				for(XmlNode child : xml.getAllChildNodes())
				{
					nodes.add(createEbnfNodeFromXml(child, highlights, errorNode));
				}
				return new SequenceNode(nodes);
			}
			else if( nodeName.equalsIgnoreCase("optional"))
			{
				List<EbnfNode> nodes = new ArrayList<EbnfNode>();
				for(XmlNode child : xml.getAllChildNodes())
				{
					nodes.add(createEbnfNodeFromXml(child, highlights, errorNode));
				}
				return new OptionNode(new SequenceNode(nodes));
			}
		}
		catch (XMLattributeDoesNotExist e)
		{
			e.printStackTrace();
		}
		catch (XMLnodeDoesNotExist e)
		{
			e.printStackTrace();
		}
		System.out.println("GrammarCompiler returns null - 3 - node: " + nodeName);
		return null;
	}
}
