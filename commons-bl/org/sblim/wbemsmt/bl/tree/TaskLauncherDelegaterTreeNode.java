 /** 
  * TaskLauncherDelegaterTreeNode.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Treenode delegating the calls to the attached childs
  * 
  */
package org.sblim.wbemsmt.bl.tree;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.Arrays;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;


public class TaskLauncherDelegaterTreeNode extends TaskLauncherTreeNode {

	private final List<ITaskLauncherTreeNode> nodesToDelegate;

	/**
	 * @param cimClient
	 * @param xmlconfigNode
	 * @throws WbemsmtException 
	 */
	public TaskLauncherDelegaterTreeNode(List<? extends ITaskLauncherTreeNode> nodesToDelegate,String name) throws WbemsmtException {
		super(null,null,name);
		ITaskLauncherTreeNode[] x = nodesToDelegate.toArray(new ITaskLauncherTreeNode[]{});
		this.nodesToDelegate = Arrays.asList(x);
		
		//this.nodesToDelegate.add(nodesToDelegate.get(0));
    	for (Iterator<ITaskLauncherTreeNode> iter = this.nodesToDelegate.iterator(); iter.hasNext();) {
			ITaskLauncherTreeNode node = iter.next();
			Vector<ITaskLauncherTreeNode> subnodes = node.getSubnodes();
			for (Iterator<ITaskLauncherTreeNode> iterator = subnodes.iterator(); iterator.hasNext();) {
				ITaskLauncherTreeNode childNode = (ITaskLauncherTreeNode) iterator.next();
				addSubnode(childNode);
			}
		}
	}

    /**
     * Adds a subnode to the current node. The subnode will be appended to the end.
     * @param subnode
     */
    public void addSubnode(ITaskLauncherTreeNode subnode)
    {
    	subnode.setParent(this);
    	//dont set the customTreeConfig becauuse the delegator treenode is not having a CustomtreeConfig
    	//subnode.setCustomTreeConfig(customTreeConfig);
        this.subnodes.add(subnode);
    } 
	
    /**
     * Reads subnodes of the current node.
     * These subnodes are treenodes of the xml configuration.
     * @throws WbemsmtException 
     */
    public void readSubnodes(boolean notifyEventListener) throws WbemsmtException
    {
    	for (Iterator<ITaskLauncherTreeNode> iter = nodesToDelegate.iterator(); iter.hasNext();) {
			ITaskLauncherTreeNode node = (ITaskLauncherTreeNode) iter.next();
			Vector<ITaskLauncherTreeNode> subnodes = node.getSubnodes();
			for (Iterator<ITaskLauncherTreeNode> iterator = subnodes.iterator(); iterator.hasNext();) {
				try {
					ITaskLauncherTreeNode childNode = (ITaskLauncherTreeNode) iterator.next();
					childNode.readSubnodes(false);
				} catch (Exception e) {
					if (RuntimeUtil.getInstance().isJSF())
					{
						JsfUtil.handleException(e);
					}
					else if (RuntimeUtil.getInstance().isSwing())
					{
						
					}
				}
			}
		}
    	subnodesRead = true;
    	
    	if(notifyEventListener)
        {
        	for (Iterator<ITaskLauncherTreeNode> iter = nodesToDelegate.iterator(); iter.hasNext();) {
    			ITaskLauncherTreeNode node = (ITaskLauncherTreeNode) iter.next();
    			Vector<ITaskLauncherTreeNode>  subnodes = node.getSubnodes();
    			for (Iterator<ITaskLauncherTreeNode>  iterator = subnodes.iterator(); iterator.hasNext();) {
    				ITaskLauncherTreeNode childNode = (ITaskLauncherTreeNode) iterator.next();
    	        	if (RuntimeUtil.getInstance().isJSF())
    	        	{
    	        		//first process the Event itself (the JSF or other PressentationLayer-Node is builded here) and the let the childs
    	        		//react in the tree refreshing
    	        		processEvent(new TaskLauncherTreeNodeEvent(childNode, this, FacesContext.getCurrentInstance(), TaskLauncherTreeNodeEvent.TYPE_REFRESHED));
    	        		childNode.processEvent(new TaskLauncherTreeNodeEvent(childNode, this, FacesContext.getCurrentInstance(), TaskLauncherTreeNodeEvent.TYPE_REFRESHED));
    	        	}
    	        	else
    	        	{
    	        		throw new IllegalArgumentException("Cannot send Event for Runtime " + RuntimeUtil.getInstance().getRuntime());
    	        	}
    			}
    		}

        }
    	
    }
    
    
}
