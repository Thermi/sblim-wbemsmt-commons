 /** 
  * CimomTreeNode.java
  *
  * (C) Copyright IBM Corp. 2005
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
  * Description: Tree representing a CIMOM in MultiHost-Mode
  * 
  */
package org.sblim.wbemsmt.tasklauncher;

import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.TreeConfigData;
import org.sblim.wbemsmt.tasklauncher.login.CimomLoginLogoutListener;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.tools.slp.SLPLoader;
import org.sblim.wbemsmt.tools.slp.SLPUtil;


public class CimomTreeNode extends TaskLauncherTreeNode {

	private WbemSmtResourceBundle bundle = null;
	
	private CimomData cimomData;
	private CIMClient cimClient;

	private static Logger logger = Logger.getLogger(CimomTreeNode.class.getName());
	
	private SLPLoader slpLoader = null;

    public CimomTreeNode(CimomData cimom) {
		super(null,null,cimom.getHostname());

		this.cimomData = cimom;
		bundle = ResourceBundleManager.getCommonResourceBundle();
		
		addEventListener(new CimomLoginLogoutListener());
		
		TaskLauncherContextMenu menu = new TaskLauncherContextMenu(null,new String[]{"messages"});
		menu.addMenuItem(new TaskLauncherContextMenuItem("tree.menu.loginLogout",new CimomLoginLogoutListener(),null));
		setContextMenu(menu);

    
    }

	public CIMClient getCimClient() {
		return cimClient;
	}

	public void setCimClient(CIMClient cimClient) {
		this.cimClient = cimClient;
	}

	public CimomData getCimomData() {
		return cimomData;
	}

	public void setCimomData(CimomData cimom) {
		this.cimomData = cimom;
	}

	public boolean hasCimClient() {
		return cimClient != null;
	}

	public void readSubnodes(boolean notifyEventListener) throws WbemSmtException {
		if (cimClient != null)
		{
	    	for (Iterator iter = getSubnodes().iterator(); iter.hasNext();) {
				ITaskLauncherTreeNode node = (ITaskLauncherTreeNode) iter.next();
				Vector subnodes = node.getSubnodes();
				for (Iterator iterator = subnodes.iterator(); iterator.hasNext();) {
					ITaskLauncherTreeNode childNode = (ITaskLauncherTreeNode) iterator.next();
					childNode.readSubnodes(notifyEventListener);
				}
			}
	    	subnodesRead = true;
		}
		else
		{
			subnodesRead = true;
		}
    	if(notifyEventListener)
        {
        	// notify event listeners of refresh event
        	if (RuntimeUtil.getInstance().isJSF())
        	{
        		processEvent(new TaskLauncherTreeNodeEvent(this, this, FacesContext.getCurrentInstance(), TaskLauncherTreeNodeEvent.TYPE_REFRESHED));
        	}
        	else
        	{
        		throw new IllegalArgumentException("Cannot send Event for Runtime " + RuntimeUtil.getInstance().getRuntime());
        	}
        }
		
	}

	public void buildTree() throws WbemSmtException {
		clearSubnodes();
		if (cimClient != null)
		{
			Vector treeConfigs = cimomData.getTreeConfigs();
			for (Iterator iter = treeConfigs.iterator(); iter.hasNext();) {
				TreeConfigData treeConfigData = (TreeConfigData) iter.next();
				
				//check if slp is wanted and check if the task is supported
				if (slpLoader == null || slpLoader != null && SLPUtil.getTaskIsSupported(slpLoader,cimomData.getHostname(),treeConfigData.getSlpServicename()))
				{
					CustomTreeConfig treeConfig = new CustomTreeConfig(treeConfigData);
					
					boolean readNodes = false;
					
					if (treeConfig.isLoaded())
					{
						if (treeConfig.serverTaskExists(cimClient))
						{
							readNodes = true;
							JsfUtil.addMessage(FacesMessage.SEVERITY_INFO,bundle.getString("task.supported", new Object[]{treeConfigData.getName(),cimClient.getNameSpace().getHost()}));
						}
						else
						{
							JsfUtil.addMessage(FacesMessage.SEVERITY_ERROR,bundle.getString("task.not.supported.on.server", new Object[]{treeConfigData.getName(),cimClient.getNameSpace().getHost()}));
						}
					}
					else
					{
        				//TODO check if only added once
						JsfUtil.addMessage(FacesMessage.SEVERITY_ERROR,bundle.getString("task.not.supported.on.client", new Object[]{treeConfigData.getName()}));
					}
					
					if (readNodes)
					{
						TaskLauncherTreeNode rootNode = TaskLauncherTreeNode.createNodeFromXML(cimClient, treeConfig.getRootnode(),treeConfigData);
						//forget the root node and just add the childs
						Vector subnodes = rootNode.getSubnodes();
						for (Iterator iterator = subnodes.iterator(); iterator.hasNext();) {
							TaskLauncherTreeNode childNode = (TaskLauncherTreeNode) iterator.next();
							addSubnode(childNode);
						}
					}
					else
					{
        				TaskLauncherTreeNode rootNode = TaskLauncherTreeNode.createSimpleTextNode(treeConfig.getTreeConfigData().getName());
        				rootNode.setEnabled(false);
						addSubnode(rootNode);
					}
				}
				else
				{
					logger.log(Level.INFO, "Task " + treeConfigData.getName() + " is not supported for host " + cimClient.getNameSpace().getHost());
					if (RuntimeUtil.getInstance().isJSF())
					{
						JsfUtil.addMessage(FacesMessage.SEVERITY_WARN,bundle.getString("task.not.supported", new Object[]{treeConfigData.getName(),cimClient.getNameSpace().getHost()}));
					}
					
				}
			}
		}
	}

	public void updateName()
	{
		if (cimClient != null)
		{
			String usr = cimomData.getUser() != null && cimomData.getUser().length() > 0 ? cimomData.getUser() : bundle.getString("noUser");
			setName(cimomData.getHostname() + " (" + bundle.getString("user") + ": "  + usr + ")"); 
		}
		else
		{
			setName(cimomData.getHostname());
		}
		
	}

	public SLPLoader getSlpLoader() {
		return slpLoader;
	}

	public void setSlpLoader(SLPLoader slpLoader) {
		this.slpLoader = slpLoader;
	}
	
	
    
    
    
}
