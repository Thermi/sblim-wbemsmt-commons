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

import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.TreeConfigData;

/**
 * @author Bauschert
 *
 */
public class WelcomeData {

	TreeConfigData treeConfigData;
	WBEMClient cimClient;
	
	public WelcomeData(TreeConfigData treeConfigData, WBEMClient cimClient) {
		super();
		this.treeConfigData = treeConfigData;
		this.cimClient = cimClient;
	}

	public WelcomeData(ITaskLauncherTreeNode node) throws WbemsmtException {
		super();
		if (node == null)
		{
			throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "node was null. Cannot create WelcomeData");
		}
		if (node.getCustomTreeConfig()  == null)
		{
			throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"customTreeConfig of node " + node.getInfo() + " was null. Cannot create WelcomeData");
		}
		if (node.getCustomTreeConfig().getTreeConfigData()  == null)
		{
			throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"treeConfigData of node " + node.getInfo() + " was null. Cannot create WelcomeData");
		}
		if (node.getCimClient() == null)
		{
			throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"cimClient of node " + node.getInfo() + " was null. Cannot create WelcomeData");
		}
		this.treeConfigData = node.getCustomTreeConfig().getTreeConfigData();
		this.cimClient = node.getCimClient();
	}

	public WBEMClient getCimClient() {
		return cimClient;
	}

	public void setCimClient(WBEMClient cimClient) {
		this.cimClient = cimClient;
	}

	public TreeConfigData getTreeConfigData() {
		return treeConfigData;
	}

	public void setTreeConfigData(TreeConfigData treeConfigData) {
		this.treeConfigData = treeConfigData;
	}
	
	
	
	
	
	
}
