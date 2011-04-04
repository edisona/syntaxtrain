package Xml;

import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import Exceptions.XMLLoadException;
import Exceptions.XMLTextDoesNotExist;
import Exceptions.XMLattributeDoesNotExist;
import Exceptions.XMLnodeDoesNotExist;

public class XmlNode
{
	private Node node;
	private Node currentNodeGiven;
	
	public XmlNode(String xml, String version) throws XMLLoadException
	{
		String xmlVersion;
		currentNodeGiven = null;
		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new InputSource(new StringReader(xml)));
			node = doc.getDocumentElement();
			xmlVersion = getAttribute("version");
		} catch (Exception e)
		{
			throw new XMLLoadException( "XmlNode -> the string given isn't xml: " + xml );
		}
		//This has to be outside the try catch, otherwise the catch will just catch this exception too and it's message won't be sent on!
		if(!xmlVersion.equals(version))
			throw new XMLLoadException( "XmlNode -> version expected: " + version + " got: " + xmlVersion );
	}
	private XmlNode(Node node)
	{
		this.node = node;
	}
	
	public XmlNode getNextNode() throws XMLnodeDoesNotExist
	{
		if(currentNodeGiven == null)
		{
			currentNodeGiven = node.getFirstChild();
			if(currentNodeGiven.getNodeType() != Node.ELEMENT_NODE)
				return getNextNode();
			return new XmlNode(currentNodeGiven);
		}
		currentNodeGiven = currentNodeGiven.getNextSibling();
		if(currentNodeGiven == null)
			throw new XMLnodeDoesNotExist( "<Next node>" );
		if(currentNodeGiven.getNodeType() != Node.ELEMENT_NODE)
			return getNextNode();
		return new XmlNode(currentNodeGiven);
	}
	public boolean hasNextNode()
	{
		Node temp = currentNodeGiven;
		if(currentNodeGiven == null)
			if(node.hasChildNodes())
				temp = node.getFirstChild();
			else
				return false;
		Node sibling = temp.getNextSibling();
		while(sibling != null)
		{
			if(sibling.getNodeType() == Node.ELEMENT_NODE)
				return true;
			sibling = sibling.getNextSibling();
		}
		return false;
	}
	public String getName()
	{
		return node.getNodeName();
	}
	public ArrayList<XmlNode> getAllChildNodes() throws XMLnodeDoesNotExist
	{
		ArrayList<XmlNode> childNodes = new ArrayList<XmlNode>();
		NodeList nodes = node.getChildNodes();
		for(int i=0; i<nodes.getLength(); i++)
		{
			Node node = nodes.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE)
					childNodes.add(new XmlNode(node));
		}
		return childNodes;
	}
	public ArrayList<XmlNode> getChildNodes(String nodeName) throws XMLnodeDoesNotExist
	{
		ArrayList<XmlNode> childNodes = new ArrayList<XmlNode>();
		NodeList nodes = node.getChildNodes();
		for(int i=0; i<nodes.getLength(); i++)
		{
			Node node = nodes.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE)
				if(((Element) node).getTagName().equalsIgnoreCase(nodeName))
					childNodes.add(new XmlNode(node));
		}
		return childNodes;
	}
	public XmlNode getChildNode(String nodeName, int skipAmount) throws XMLnodeDoesNotExist
	{
		NodeList nodes = node.getChildNodes();
		for(int i=0; i<nodes.getLength(); i++)
		{
			Node node = nodes.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE)
				if(((Element) node).getTagName().equalsIgnoreCase(nodeName))
					if(skipAmount-- > 0)
						continue;
					else
						return new XmlNode(node);
		}
		throw new XMLnodeDoesNotExist( nodeName );
	}
	public XmlNode getChildNode(String nodeName) throws XMLnodeDoesNotExist
	{
		return getChildNode(nodeName, 0);
	}
	public int getIntAttribute(String attName) throws XMLattributeDoesNotExist
	{
		return Integer.parseInt(getAttribute(attName));
	}
	public boolean getBooleanAttribute( String attName ) throws XMLattributeDoesNotExist
	{
		return Boolean.parseBoolean( getAttribute(attName) );
	}
	public String getAttribute(String attName) throws XMLattributeDoesNotExist
	{
		NamedNodeMap nodeMap = node.getAttributes();
		for(int i=0;i<nodeMap.getLength();i++)
		{
			Node node = nodeMap.item(i);
			if(node.getNodeType() != Node.ATTRIBUTE_NODE)
			{
				System.out.println("XmlNode - getAttribute: Node: " + node + " is not an attribute! :S");
			}
			if(node.getNodeName().equalsIgnoreCase(attName))
			{
				return node.getNodeValue();
			}
		}
		throw new XMLattributeDoesNotExist(attName);
	}
	public String getText() throws XMLTextDoesNotExist
	{
		NodeList nodes = node.getChildNodes();
		for(int i=0; i<nodes.getLength(); i++)
		{
			Node node = nodes.item(i);
			if (node.getNodeType() == Node.TEXT_NODE)
					return node.getNodeValue();
		}
		throw new XMLTextDoesNotExist();
	}
}
