 /** 
  * WelcomeData.java
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
  * Description: Data Object for calling the Welcome Listener
  * 
  */
package org.sblim.wbemsmt.bl.welcome;

import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.TreeConfigData;

/**
 * @author Bauschert
 *
 */
public class WelcomeData {

	TreeConfigData treeConfigData;
	CIMClient cimClient;
	
	public WelcomeData(TreeConfigData treeConfigData, CIMClient cimClient) {
		super();
		this.treeConfigData = treeConfigData;
		this.cimClient = cimClient;
	}

	public WelcomeData(ITaskLauncherTreeNode node) throws WbemSmtException {
		super();
		if (node.getTreeConfigData() == null)
		{
			throw new WbemSmtException("treeConfigData of node " + node.getInfo() + " was null. Cannot create WelcomeData");
		}
		if (node.getCimClient() == null)
		{
			throw new WbemSmtException("cimClient of node " + node.getInfo() + " was null. Cannot create WelcomeData");
		}
		this.treeConfigData = node.getTreeConfigData();
		this.cimClient = node.getCimClient();
	}

	public CIMClient getCimClient() {
		return cimClient;
	}

	public void setCimClient(CIMClient cimClient) {
		this.cimClient = cimClient;
	}

	public TreeConfigData getTreeConfigData() {
		return treeConfigData;
	}

	public void setTreeConfigData(TreeConfigData treeConfigData) {
		this.treeConfigData = treeConfigData;
	}
	
	
	
	
	
	
}
