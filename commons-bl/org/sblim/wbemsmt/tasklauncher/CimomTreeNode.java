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
  *              This kind of Treenode cannot hold a CIMClient reference because for logging in you will need a CIMNamespace. And the namespace is defined by the task itself
  *              
  *              So for retrieving a CIMClient within a specific task you can do the following:
  *              <xmp>
  *						ITaskLauncherTreeNode node = cimomTreeNode.getNodeForTask(MetaclusterCimAdapter.METACLUSTER_TASKNAME);
  *						//continue only if the task was found
  *						if (node != null)
  *						{
  *							CIMClient cimClient = node.getCimClient();
  *							//do something meaningful
  *						}
  *              </xmp>
  *              
  * 
  */
package org.sblim.wbemsmt.tasklauncher;

import java.net.UnknownHostException;
import java.util.*;
import java.util.logging.Level;

import javax.faces.context.FacesContext;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.session.WbemsmtSession;
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

	private boolean emptyPassword;
	private boolean remindPassword;
	private boolean useSlp;
	private boolean slpRendered;
	private boolean loggedIn;
	
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

	public CimomData getCimomData() {
		return cimomData;
	}

	public void setCimomData(CimomData cimom) {
		this.cimomData = cimom;
	}

	public void readSubnodes(boolean notifyEventListener) throws WbemSmtException {
//    	for (Iterator iter = getSubnodes().iterator(); iter.hasNext();) {
//			ITaskLauncherTreeNode node = (ITaskLauncherTreeNode) iter.next();
//			Vector subnodes = node.getSubnodes();
//			for (Iterator iterator = subnodes.iterator(); iterator.hasNext();) {
//				ITaskLauncherTreeNode childNode = (ITaskLauncherTreeNode) iterator.next();
//				childNode.readSubnodes(notifyEventListener);
//			}
//		}
		
		subnodesRead = true;
		
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
		for (int i=0; i < treeConfigDatas.length; i++) {
			TreeConfigData treeConfigData = (TreeConfigData) treeConfigDatas[i];
			
			CustomTreeConfig treeConfig = new CustomTreeConfig(treeConfigData,cimomData,null);
			
			boolean readNodes = false;
			
			try {
				if (WbemsmtSession.getSession().getCIMClientPool(cimomData.getHostname()) == null)
				{
					WbemsmtSession.getSession().createCIMClientPool(cimomData.getHostname(),""+cimomData.getPort(),cimomData.getUser(),cimomData.getPassword());
				}
				CIMClient cimClient = WbemsmtSession.getSession().getCIMClientPool(cimomData.getHostname()).getCIMClient(treeConfigData.getNamespace());
				if (treeConfig.isLoaded())
				{
					if (treeConfig.serverTaskExists(cimClient))
					{
						readNodes = true;
						JsfUtil.addMessage(Message.create(ErrCodes.MSG_TASK_SUPPORTED,Message.INFO,bundle,"task.supported", new Object[]{treeConfigData.getName(),cimClient.getNameSpace().getHost(),cimClient.getNameSpace().getNameSpace()}));
					}
					else
					{
						JsfUtil.addMessage(Message.create(ErrCodes.MSG_TASK_NOT_SUPPORTED_SERVER,Message.ERROR,bundle,"task.not.supported.on.server", new Object[]{treeConfigData.getName(),cimClient.getNameSpace().getHost(),cimClient.getNameSpace().getNameSpace()}));
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
			} catch (UnknownHostException e) {
				logger.log(Level.SEVERE, "Cannot create a CIMClient for host " + cimomData.getHostname() + " Host was not found",e);
			}			
		}
		loggedIn = treeConfigDatas != null &&  treeConfigDatas.length > 0;
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
		if (isLoggedIn())
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
		loggedIn = false;
		clearSubnodes();
		updateName();
		buildTree(new TreeConfigData[]{});   
		readSubnodes(true);
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

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	/**
	 * the method will return to CIMClient, since CIMOMTreeNode are not having a namespace and cannot create a cimclient
	 * the namespace is defined by the tasks itselfs and therefore the first instance that is holding a CIMClient are the
	 * child nodes
	 * 
	 * @see #getNodeForTask(String)
	 */
	public CIMClient getCimClient() {
		throw new IllegalArgumentException("Cannot get CIMClient from CimomTreeNode");
	}

	public void setCimClient(CIMClient cimClient) {
		throw new IllegalArgumentException("Cannot set CIMClient on CimomTreeNode");
	}

	/**
	 * Get the node of the specified task. The taskname should correspond to the name of the task in the tasklauncher-config.xml
	 * @param taskname
	 * @return the node or null if for the task no host was found
	 * @throws WbemSmtException
	 */
	public ITaskLauncherTreeNode getNodeForTask(String taskname) throws WbemSmtException {
    	for (Iterator iter = getSubnodes().iterator(); iter.hasNext();) {
			ITaskLauncherTreeNode node = (ITaskLauncherTreeNode) iter.next();
			if (   node.getCustomTreeConfig() != null 
				&& node.getCustomTreeConfig().getTreeConfigData() != null 
				&& taskname.equals(node.getCustomTreeConfig().getTreeConfigData().getName()) )
			{
				return node;
			}
		}
    	
    	return null;
	} 
	
    
	
	
    
    
    
}
