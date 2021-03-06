 /** 
  * TaskLauncherTreeConfigTreeNode.java
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
  * Description:
  * 
  */
package org.sblim.wbemsmt.bl.tree;

import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.TreeConfigData;


public class TaskLauncherTreeConfigTreeNode extends TaskLauncherTreeNode {

	protected final TreeConfigData treeconfig;

	/**
	 * @param cimClient
	 * @param xmlconfigNode
	 */
	public TaskLauncherTreeConfigTreeNode(TreeConfigData treeconfig) {
		super(null,null,treeconfig.getName());
		this.treeconfig = treeconfig;
	}

    /**
     * Reads subnodes of the current node.
     * These subnodes are treenodes of the xml configuration.
     */
    public void readSubnodes(boolean notifyEventListener)
    {
    	subnodesRead = true;
    }
    
    
}
