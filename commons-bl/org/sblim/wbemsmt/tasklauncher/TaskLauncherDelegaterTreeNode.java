 /** 
  * TaskLauncherDelegaterTreeNode.java
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
  * Description: Treenode delegating the calls to the attached childs
  * 
  */
package org.sblim.wbemsmt.tasklauncher;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;


public class TaskLauncherDelegaterTreeNode extends TaskLauncherTreeNode {

	private final List nodesToDelegate;

	/**
	 * @param cimClient
	 * @param xmlconfigNode
	 * @throws WbemsmtException 
	 */
	public TaskLauncherDelegaterTreeNode(List nodesToDelegate,String name) throws WbemsmtException {
		super(null,null,name);
		this.nodesToDelegate = nodesToDelegate;
    	for (Iterator iter = nodesToDelegate.iterator(); iter.hasNext();) {
			ITaskLauncherTreeNode node = (ITaskLauncherTreeNode) iter.next();
			Vector subnodes = node.getSubnodes();
			for (Iterator iterator = subnodes.iterator(); iterator.hasNext();) {
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
    	for (Iterator iter = nodesToDelegate.iterator(); iter.hasNext();) {
			ITaskLauncherTreeNode node = (ITaskLauncherTreeNode) iter.next();
			Vector subnodes = node.getSubnodes();
			for (Iterator iterator = subnodes.iterator(); iterator.hasNext();) {
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
        	for (Iterator iter = nodesToDelegate.iterator(); iter.hasNext();) {
    			ITaskLauncherTreeNode node = (ITaskLauncherTreeNode) iter.next();
    			Vector subnodes = node.getSubnodes();
    			for (Iterator iterator = subnodes.iterator(); iterator.hasNext();) {
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
