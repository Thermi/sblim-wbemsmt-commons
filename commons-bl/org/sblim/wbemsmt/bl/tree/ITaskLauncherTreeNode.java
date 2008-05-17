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
  * Description: Interface of a ITaskLauncherTreeNode
  * 
  */

package org.sblim.wbemsmt.bl.tree;

import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.cim.CIMObjectPath;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tasklauncher.CIMClassNode;
import org.sblim.wbemsmt.tasklauncher.CustomTreeConfig;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherContextMenu;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherTreeNode;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument.Treenode;

public interface ITaskLauncherTreeNode {

	/**
	 * Returns all subnodes of the current node.
	 * @return
	 * @throws WbemsmtException 
	 */
	public abstract Vector getSubnodes() throws WbemsmtException;

	/**
	 * Returns wether the current node has subnodes.
	 * @return
	 */
	public abstract boolean hasSubnodes();

	public abstract WBEMClient getCimClient();

	public abstract String getNamespace();

	/**
     * Returns the display name of the current node.
     * @return
     */
	public abstract String getName();

    /**
     * Returns the plain name without formatting.
     * @return
     */
	public abstract String getPlainName();

	public abstract ITaskLauncherTreeNode getParent();
	
	public abstract void deleteSubnode(ITaskLauncherTreeNode subnode);

	public abstract ITaskLauncherTreeNode findClassNode(String cimClassName, String label) throws WbemsmtException;

	public abstract ITaskLauncherTreeNode findClassNode(CIMClassNode classNode) throws WbemsmtException;

	public abstract ITaskLauncherTreeNode findNode(ITaskLauncherTreeNode treeNode) throws WbemsmtException;

	public abstract ITaskLauncherTreeNode getRootNode() throws WbemsmtException;

	public abstract List findInstanceNodes(String cimClassName) throws WbemsmtException;

	public abstract List findInstanceNodes(Class instanceClass) throws WbemsmtException;

	public abstract List findClassNodes(String cimClassName) throws WbemsmtException;

	public abstract void readSubnodes() throws WbemsmtException;

	public abstract void readSubnodes(boolean notifyListeners) throws WbemsmtException;

	public void addEventListener(TaskLauncherTreeNodeEventListener eventListener);

	public abstract void setParent(ITaskLauncherTreeNode node);
	
	public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException;

	public abstract TaskLauncherTreeNode findInstanceNode(CIMObjectPath pathOfCreatedNode) throws WbemsmtException;

	public abstract String getInfo();
	
	public void addSubnode(ITaskLauncherTreeNode subnode);

	public abstract Set getEventListener();
	
	//public TreeConfigData getTreeConfigData();

	public abstract boolean hasEventListener();

	public abstract boolean hasCustomEventListener();

	public abstract void insertSubnode(ITaskLauncherTreeNode taskLauncherTreeNode, ITaskLauncherTreeNode taskLauncherTreeNode2, int offset);

	public abstract TaskLauncherContextMenu getContextMenu();

	public abstract Object clone();

	public abstract boolean isEnabled();

	public abstract void setEnabled(boolean enabled);

	public abstract boolean hasEventListenerWithLongrunningActions();

	public abstract String click(boolean b);

	public abstract boolean hasXMLData();

	public abstract TreenodeDocument.Treenode getXMLData();

	public abstract TreenodeDocument.Treenode generateXML(Treenode newNode);

	public abstract void setName(String string);

	public abstract List findNodesByName(String name) throws WbemsmtException;

	public void setCustomTreeConfig(CustomTreeConfig customTreeConfig);

	public CustomTreeConfig getCustomTreeConfig();

    public abstract List findInstanceNodes(InstanceNodeFilter instanceNodeFilter) throws WbemsmtException;
	
    public Object getValue(String key);
    
    public void setValue(String key, Object value);

}
