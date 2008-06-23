 /** 
  * ITaskLauncherTreeNode.java
  *
  * © Copyright IBM Corp. 2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Interface of a TaskLauncherTreeNode
  * 
  */

package org.sblim.wbemsmt.bl.tree;

import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.cim.CIMObjectPath;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherContextMenu;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument.Treenode;

/**
 * Interface of a TaskLauncherTreeNode
 */
public interface ITaskLauncherTreeNode {

	/**
	 * Returns all subnodes of the current node.
	 * @return vector with {@link ITaskLauncherTreeNode} instances
	 * @throws WbemsmtException if reading the subnodes failed
	 */
	public abstract Vector getSubnodes() throws WbemsmtException;

	/**
	 * Returns wether the current node has subnodes.
	 * @return true if the current node is having subnodes
	 */
	public abstract boolean hasSubnodes();
	
	/**
	 * the client where the data of this node is coming from
	 * @return the client where the data of this node is coming from
	 */

	public abstract WBEMClient getCimClient();

	/**
	 * the namespace from where the data of this node is coming from
	 * @return the namespace from where the data of this node is coming from
	 */
	public abstract String getNamespace();

	/**
     * Returns the display name of the current node.
     * @return the display name of the current node.
     */
	public abstract String getName();

    /**
     * Returns the plain name without formatting.
     * @return the plain name without formatting.
     */
	public abstract String getPlainName();

	/**
	 * return the parent node
	 * @return the parent
	 */
	public abstract ITaskLauncherTreeNode getParent();

	/**
	 * delete the children which is a subnode of this node
	 * @param subnode the children
	 */
	public abstract void deleteSubnode(ITaskLauncherTreeNode subnode);

	/**
	 * find a class node
	 * @param cimClassName name of the class
	 * @param label the label of the class node
	 * @return the class node
	 * @throws WbemsmtException if the classnode was not found
	 */
	public abstract ITaskLauncherTreeNode findClassNode(String cimClassName, String label) throws WbemsmtException;

    /**
     * find a class node
     * @param classNode the class node
     * @return the class node
     * @throws WbemsmtException if the classnode was not found
     */
	public abstract ITaskLauncherTreeNode findClassNode(CIMClassNode classNode) throws WbemsmtException;

    /**
     * find a node
     * @param treeNode node to find
     * @return the node or null if treeNode is neither a {@link ICIMInstanceNode} nor a {@link ICIMClassNode}
     * @throws WbemsmtException if the node was not found
     */
	public abstract ITaskLauncherTreeNode findNode(ITaskLauncherTreeNode treeNode) throws WbemsmtException;

	/**
	 * get the root node of this node
	 * @return the root node
	 * @throws WbemsmtException if getting the root node failed
	 */
	public abstract ITaskLauncherTreeNode getRootNode() throws WbemsmtException;

	/**
	 * find all instances that are representing this class
	 * @param cimClassName name of the cim class
	 * @return List with {@link ICIMInstanceNode} objects
	 * @throws WbemsmtException if getting the instance nodes failed
	 */
	public abstract List findInstanceNodes(String cimClassName) throws WbemsmtException;

    /**
     * find all instances that are representing this class
     * @param instanceClass the fco class
     * @return List with {@link ICIMInstanceNode} objects
     * @throws WbemsmtException if getting the instance nodes failed
     */
	public abstract List findInstanceNodes(Class instanceClass) throws WbemsmtException;

	/**
	 * find class nodes that are matching with the given name
	 * @param cimClassName the name of the class to check
	 * @return List with {@link ICIMClassNode} objects
	 * @throws WbemsmtException  if getting the classnodes failed
	 */
	public abstract List findClassNodes(String cimClassName) throws WbemsmtException;

    /**
     * Reads subnodes of the current {@link CIMClass} which can be textnodes of the xml configuration ({@link TaskLauncherTreeNode}),
     * instances ({@link CIMInstanceNode}) or subclasses ({@link CIMClassNode}).
     * Instances are labeled according to the instanceNamingKey or to the cimInstanceNaming property.
     * @throws WbemsmtException if reading the nodes failed 
     */

	public abstract void readSubnodes() throws WbemsmtException;

    /**
     * Reads subnodes of the current {@link CIMClass} which can be textnodes of the xml configuration ({@link TaskLauncherTreeNode}),
     * instances ({@link CIMInstanceNode}) or subclasses ({@link CIMClassNode}).
     * Instances are labeled according to the instanceNamingKey or to the cimInstanceNaming property.
     * @param notifyListeners set to true if the method should notify the eventlisteners 
     * @throws WbemsmtException if reading the nodes failed 
     */
	public abstract void readSubnodes(boolean notifyListeners) throws WbemsmtException;

    /**
     * adds an eventlistener for the specific instance of the xml defined event listener object
     * @param eventListener the listener to add
     */
	public void addEventListener(TaskLauncherTreeNodeEventListener eventListener);

	/**
	 * set the parent node
	 * @param node the parent
	 */
	public abstract void setParent(ITaskLauncherTreeNode node);
	
    /**
     * Passes an {@link TaskLauncherTreeNodeEvent} to all EventListeners of this node.
     * @param event the event
     * @return the result that can be used as target for further navigation 
     * @throws WbemsmtException if passing the event failed 
     */
	public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException;

	/**
	 * find an instance node with the given path
	 * @param pathOfCreatedNode the path to search
	 * @return the instance node or null if the node was not found
	 * @throws WbemsmtException  if getting the subnodes failed
	 */
	public abstract TaskLauncherTreeNode findInstanceNode(CIMObjectPath pathOfCreatedNode) throws WbemsmtException;

	/**
	 * get a short information text about this node
	 * @return informational text
	 */
	public abstract String getInfo();
	
    /**
     * Adds a subnode to the current node. The subnode will be appended to the end.<br>
     * also set the current instance as parent of subnode
     * @param subnode the new node
     */
	public void addSubnode(ITaskLauncherTreeNode subnode);

	/**
	 * get the eventlisteners
	 * @return set with {@link TaskLauncherTreeNodeEventListener} objects
	 */
	public abstract Set getEventListener();
	
	
	/**
	 * check if there are event listeners
	 * @return true if there are eventlisteners
	 */
	public abstract boolean hasEventListener();

	/**
	 * check if there are event listeners that are custom listeners
	 * @return true if there are custom listeners
	 */
	public abstract boolean hasCustomEventListener();

	/**
     * Adds a subnode to the current node at a given position, relative to the reference.
     * If the parent has xml data the new node will be added to this aswell.
     * @param reference the node to count the offset from
     * @param nodeToPaste the new node
     * @param offset relative position to the reference.
	 */
	public abstract void insertSubnode(ITaskLauncherTreeNode reference, ITaskLauncherTreeNode nodeToPaste, int offset);

	/**
	 * get the context menue of this node
	 * @return the context menue of this node
	 */
	public abstract TaskLauncherContextMenu getContextMenu();

	/**
	 * clone the node
	 * @return the copy of the node
	 */
	public abstract Object clone();

	/**
	 * check if the node is enabled
	 * @return true if the node is enabled
	 */
	public abstract boolean isEnabled();

	/**
	 * enable/disable the node
	 * @param enabled true for enabling the node
	 */
	public abstract void setEnabled(boolean enabled);

    /**
     * Returns true if there are event listeners with action that take longer so that the frontend can show a wait indicator
     * <br>
     * listeners with longrunning actions are {@link EditListener} and {@link DeleteListener} objects
     * @return true if there are some listeners with long running actions.
     */
	public abstract boolean hasEventListenerWithLongrunningActions();

	/**
	 * click the tree node and trigger the listeners
	 * @param revert revert the current data ?
	 * @return the outcome for further navigation
	 */
	public abstract String click(boolean revert);

    /**
     * Returns whether the current node was initialized with xml data.
     * @return true if the current node was initialized with xml data
     */
	public abstract boolean hasXMLData();

    
    /**
     * Returns the xml data the current node was initialized with.
     * @return the xml data the current node was initialized with.
     */
	public abstract TreenodeDocument.Treenode getXMLData();

    /**
     * Takes a {@link TreenodeDocument.Treenode} and adds all configuration data to it to represent the current node in XML.
     *
     * @param newNode to which current configuration data will be added to
     * @return TreenodeDocument.Treenode The modified node
     */
	public abstract TreenodeDocument.Treenode generateXML(Treenode newNode);

    /**
     * Sets the display name of the current node.
     * @param name the display name
     */
	public abstract void setName(String name);

	/**
	 * find nodes by the given node name
	 * @param name the name of the node (the caption)
	 * @return list with {@link ITaskLauncherTreeNode} objects
	 * @throws WbemsmtException if getting the subnodes failed
	 */
	public abstract List findNodesByName(String name) throws WbemsmtException;

	/**
	 * set the tree configuration of this node
	 * @param customTreeConfig the configuration
	 */
	public void setCustomTreeConfig(CustomTreeConfig customTreeConfig);

	/**
	 * get the tree configuration 
	 * @return the configuration
	 */
	public CustomTreeConfig getCustomTreeConfig();

	/**
	 * Find instance nodes that are passing the instanceNodeFilter
	 * @param instanceNodeFilter object to filter valid instances
	 * @return list of {@link ICIMInstanceNode} objects
	 * @throws WbemsmtException if getting the subnodes failed
	 */
    public abstract List findInstanceNodes(InstanceNodeFilter instanceNodeFilter) throws WbemsmtException;

    /**
     * get the userdefined value
     * @param key the key of the value
     * @return the value or null if no value exists
     */
    public Object getValue(String key);
    
    /**
     * set a userdefined value to be used later in the business logic
     * @param key the key to find the value later
     * @param value the value
     */
    public void setValue(String key, Object value);

}
