 /** 
  * CimomTreeNode.java
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
  * Description: Tree representing a CIMOM in MultiHost-Mode
  * 
  */
package org.sblim.wbemsmt.tasklauncher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.faces.context.FacesContext;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.TreeConfigData;
import org.sblim.wbemsmt.tasklauncher.login.CimomLoginLogoutListener;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TreeconfigDocument.Treeconfig;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.tools.slp.SLPLoader;


public class CimomTreeNode extends TaskLauncherTreeNode {

	private WbemSmtResourceBundle bundle = null;
	
	private CimomData cimomData;
	private CIMClient cimClient;

	private String password;
	private boolean emptyPassword;
	private boolean remindPassword;
	private boolean useSlp;
	private boolean slpRendered;
	
	private SLPLoader slpLoader = null;

	private Map commonContextMenues = new HashMap();

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
		Vector vc = cimomData.getTreeConfigs();
		TreeConfigData[] configs = (TreeConfigData[]) vc.toArray(new TreeConfigData[vc.size()]);
		buildTree(configs);
	}

	public void buildTree(Treeconfig[] treeconfigs) throws WbemSmtException {
		
		List list = new ArrayList();
		for (int i = 0; i < treeconfigs.length; i++) {
			Treeconfig treeconfig = treeconfigs[i];
			list.add(new TreeConfigData(treeconfig));
		}
		
		TreeConfigData[] configs = (TreeConfigData[]) list.toArray(new TreeConfigData[list.size()]);
		buildTree(configs);
	}

	public void buildTree(TreeConfigData[] treeConfigDatas) throws WbemSmtException {
		clearSubnodes();
		if (cimClient != null)
		{
			for (int i=0; i < treeConfigDatas.length; i++) {
				TreeConfigData treeConfigData = (TreeConfigData) treeConfigDatas[i];
				
				CustomTreeConfig treeConfig = new CustomTreeConfig(treeConfigData,cimomData);
				
				boolean readNodes = false;
				
				if (treeConfig.isLoaded())
				{
					if (treeConfig.serverTaskExists(cimClient))
					{
						readNodes = true;
						JsfUtil.addMessage(Message.create(ErrCodes.MSG_TASK_SUPPORTED,Message.INFO,bundle,"task.supported", new Object[]{treeConfigData.getName(),cimClient.getNameSpace().getHost()}));
					}
					else
					{
						JsfUtil.addMessage(Message.create(ErrCodes.MSG_TASK_NOT_SUPPORTED_SERVER,Message.ERROR,bundle,"task.not.supported.on.server", new Object[]{treeConfigData.getName(),cimClient.getNameSpace().getHost()}));
					}
				}
				else
				{
					JsfUtil.addMessage(Message.create(ErrCodes.MSG_TASK_NOT_SUPPORTED_CLIENT,Message.ERROR,bundle,"task.not.supported.on.client",new Object[]{treeConfigData.getName()}));
				}
				
				if (readNodes)
				{
					TaskLauncherTreeNode rootNode = TaskLauncherTreeNode.createNodeFromXML(cimClient, treeConfig.getRootnode(),treeConfig);
					if (treeConfig.getCommonContextMenue() != null)
					{
        				TaskLauncherContextMenu contextMenu = new TaskLauncherContextMenu(treeConfig.getCommonContextMenue(),treeConfig.getTreeConfigData().getBundles());
        				contextMenu.setCommon(true);
        				//The ContextMenue in MultiHost Environment is having no default node
        				contextMenu.setNode(null);
						commonContextMenues.put(treeConfig.getTreeConfigData().getName(),contextMenu);
					}
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
    				rootNode.setCustomTreeConfig(treeConfig);
    				rootNode.setEnabled(false);
					addSubnode(rootNode);
				}
			}
		}
	}

	/**
	 * Clear the subnodes and the commonContextMenue
	 */
	public void clearSubnodes()
	{
		super.clearSubnodes();
		commonContextMenues.clear();
	}
	
	public void updateName()
	{
		if (cimClient != null)
		{
			String usr = cimomData.getUser() != null && cimomData.getUser().length() > 0 ? cimomData.getUser() : bundle.getString("noUser");
			setName(getTreeNodeName(bundle,cimomData.getHostname(),usr)); 
		}
		else
		{
			setName(cimomData.getHostname());
		}
		
	}

	/**
	 * returns a string for the treenode containing the hostname and the user (in brackets)
	 * @param bundle
	 * @param host
	 * @param usr
	 * @return
	 */
	public static String getTreeNodeName(WbemSmtResourceBundle bundle, String host, String usr) {
		return host + " (" + bundle.getString("user") + ": "  + usr + ")";
	}

	public SLPLoader getSlpLoader() {
		return slpLoader;
	}

	public void setSlpLoader(SLPLoader slpLoader) {
		this.slpLoader = slpLoader;
	}
	
	public String getInfo() {
		return CimomTreeNode.class.getName() + name + "; " + cimomData.getInfo();
	}

	public Map getCommonContextMenues() {
		return commonContextMenues;
	}

	public void logout() throws WbemSmtException {
		setCimClient(null);
		updateName();
		buildTree();   
		readSubnodes(true);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isUseSlp() {
		return useSlp;
	}

	public void setUseSlp(boolean useSlp) {
		this.useSlp = useSlp;
	}

	public boolean isSlpRendered() {
		return slpRendered;
	}

	public void setSlpRendered(boolean useSlpEnabled) {
		this.slpRendered = useSlpEnabled;
	}

	public boolean isEmptyPassword() {
		return emptyPassword;
	}

	public void setEmptyPassword(boolean emptyPassword) {
		this.emptyPassword = emptyPassword;
	}

	public boolean isRemindPassword() {
		return remindPassword;
	}

	public void setRemindPassword(boolean remindPassword) {
		this.remindPassword = remindPassword;
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
	
	
	
	
    
    
    
}
