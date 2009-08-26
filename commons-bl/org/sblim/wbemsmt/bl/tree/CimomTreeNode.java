 /** 
  * CimomTreeNode.java
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
  * Description: Tree representing a CIMOM in MultiHost-Mode
  */
package org.sblim.wbemsmt.bl.tree;

import java.util.*;

import javax.faces.context.FacesContext;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherContextMenu;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherContextMenuItem;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.TreeConfigData;
import org.sblim.wbemsmt.tasklauncher.login.CimomLoginLogoutListener;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TreeconfigDocument.Treeconfig;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.tools.slp.SLPLoader;


/**
  * Description: Tree representing a CIMOM in MultiHost-Mode
  *              This kind of Treenode cannot hold a WBEMClient reference because for logging in you will need a CIMNamespace. And the namespace is defined by the task itself
  *              
  *              So for retrieving a WBEMClient within a specific task you can do the following:
  *              <xmp>
  *                     ITaskLauncherTreeNode node = cimomTreeNode.getNodeForTask(MetaclusterCimAdapter.METACLUSTER_TASKNAME);
  *                     //continue only if the task was found
  *                     if (node != null)
  *                     {
  *                         WBEMClient cimClient = node.getCimClient();
  *                         //do something meaningful
  *                     }
  *              </xmp>
  */
public class CimomTreeNode extends TaskLauncherTreeNode {

	private WbemSmtResourceBundle bundle = null;
	
	private CimomData cimomData;

	private boolean emptyPassword;
	private boolean remindPassword;
	private boolean useSlp;
	private boolean slpRendered;
	private boolean loggedIn;
	
	private SLPLoader slpLoader = null;

	private Map<String, TaskLauncherContextMenu> commonContextMenues = new HashMap<String, TaskLauncherContextMenu>();

	/**
	 * create a new host tree node
	 * @param cimom the host
	 */
    public CimomTreeNode(CimomData cimom) {
		super(null,null,cimom.getHostname());

		this.cimomData = cimom;
		bundle = ResourceBundleManager.getCommonResourceBundle();
		
		addEventListener(new CimomLoginLogoutListener());
		
		TaskLauncherContextMenu menu = new TaskLauncherContextMenu(null,new String[]{"messages"});
		menu.addMenuItem(new TaskLauncherContextMenuItem("tree.menu.loginLogout",new CimomLoginLogoutListener(),null));
		setContextMenu(menu);

    
    }

    /**
     * @return the config data
     */
	public CimomData getCimomData() {
		return cimomData;
	}
	
	/**
	 * set the config data
	 * @param cimom the config data
	 */

	public void setCimomData(CimomData cimom) {
		this.cimomData = cimom;
	}

    /**
     * Reads subnodes of the current node.<br>
     * This implementation is reading the nodes later - after the login
     * @param notifyEventListener notify the eventlisteners
     * @throws WbemsmtException if notifyEventListener failed
     */
	public void readSubnodes(boolean notifyEventListener) throws WbemsmtException {
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

	/**
	 * build the tree by using the current treeconfigs of the cimomData instance
	 * @throws WbemsmtException if building the tree failed
	 * @see CimomData#getTreeConfigs()
	 */
	public void buildTree() throws WbemsmtException {
		Vector<TreeConfigData> vc = cimomData.getTreeConfigs();
		TreeConfigData[] configs = (TreeConfigData[]) vc.toArray(new TreeConfigData[vc.size()]);
		buildTree(configs);
	}

	/**
	 * build the tree using the tree configurations
	 * @param treeconfigs the configuration
	 * @throws WbemsmtException if building the tree failed
	 */
	public void buildTree(Treeconfig[] treeconfigs) throws WbemsmtException {
		
		List<TreeConfigData> list = new ArrayList<TreeConfigData>();
		for (int i = 0; i < treeconfigs.length; i++) {
			Treeconfig treeconfig = treeconfigs[i];
			list.add(new TreeConfigData(treeconfig));
		}
		
		TreeConfigData[] configs = (TreeConfigData[]) list.toArray(new TreeConfigData[list.size()]);
		buildTree(configs);
	}

    /**
     * build the tree using the tree configurations
     * @param treeConfigDatas the configuration
     * @throws WbemsmtException if building the tree failed
     */
	public void buildTree(TreeConfigData[] treeConfigDatas) throws WbemsmtException {
		clearSubnodes();
		for (int i=0; i < treeConfigDatas.length; i++) {
			TreeConfigData treeConfigData = (TreeConfigData) treeConfigDatas[i];
			
			CustomTreeConfig treeConfig = new CustomTreeConfig(treeConfigData,cimomData,null);
			
			boolean readNodes = false;
			
			try {
				if (WbemsmtSession.getSession().getCIMClientPool(cimomData.getHostname()) == null)
				{
					WbemsmtSession.getSession().createCIMClientPool(cimomData.getProtocol(), cimomData.getHostname(),""+cimomData.getPort(),cimomData.getUser(),cimomData.getPassword());
				}
				WBEMClient cimClient = WbemsmtSession.getSession().getCIMClientPool(cimomData.getHostname()).getCIMClient(treeConfigData.getNamespace());
				if (treeConfig.isLoaded())
				{
					if (treeConfig.serverTaskExists(cimClient))
					{
						readNodes = true;
						JsfUtil.addMessage(Message.create(ErrCodes.MSG_TASK_SUPPORTED,Message.INFO,bundle,"task.supported", new Object[]{treeConfigData.getName(),cimomData.getHostname(),treeConfigData.getNamespace()}));
					}
					else
					{
						JsfUtil.addMessage(Message.create(ErrCodes.MSG_TASK_NOT_SUPPORTED_SERVER,Message.ERROR,bundle,"task.not.supported.on.server", new Object[]{treeConfigData.getName(),cimomData.getHostname(),treeConfigData.getNamespace()}));
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
					Vector<ITaskLauncherTreeNode> subnodes = rootNode.getSubnodes();
					for (Iterator<ITaskLauncherTreeNode> iterator = subnodes.iterator(); iterator.hasNext();) {
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
			} catch (WbemsmtException e) {
				ExceptionUtil.handleException(e);
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
	
	/**
	 * update the name of the tree node<br>
	 * name depends on the fact if the user is logged in to cimserver represented by this node  
	 */
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
	 * @param bundle the resourcebundle to resolve the key 'user'
	 * @param host the name of the host
	 * @param usr name of the user
	 * @return hostname and the user (in brackets)
	 */
	public static String getTreeNodeName(WbemSmtResourceBundle bundle, String host, String usr) {
		return host + " (" + bundle.getString("user") + ": "  + usr + ")";
	}

	/**
	 * get the slp loader to find the tasks of this host
	 * @return the slp loader
	 */
	public SLPLoader getSlpLoader() {
		return slpLoader;
	}

	/**
	 * set the slp loader to find the tasks of this host
	 * @param slpLoader the slp loader to find the tasks of this host
	 */
	public void setSlpLoader(SLPLoader slpLoader) {
		this.slpLoader = slpLoader;
	}
	
    /**
     * @return get the name of this class + the node name + the {@link CimomData#getInfo()}
     */
	public String getInfo() {
		return CimomTreeNode.class.getName() + name + "; " + cimomData.getInfo();
	}

	/**
	 * get the context menues for this host node
	 * @return the context menues for this host node
	 */
	public Map<String, TaskLauncherContextMenu> getCommonContextMenues() {
		return commonContextMenues;
	}
	
	/**
	 * user logged out from this host
	 * @throws WbemsmtException if cleanup failed
	 */

	public void logout() throws WbemsmtException {
		loggedIn = false;
		clearSubnodes();
		updateName();
		buildTree(new TreeConfigData[]{});   
		readSubnodes(true);
	}
	/**
	 * @return true if the host node should use slp to find the tasks
	 */
	public boolean isUseSlp() {
		return useSlp;
	}

	/**
	 * define if the host node should use slp to find the tasks
	 * @param useSlp true = slp on
	 */
	public void setUseSlp(boolean useSlp) {
		this.useSlp = useSlp;
	}

	/**
	 * @return true if rendering the slp lookup checkbox for this node is active
	 */
	public boolean isSlpRendered() {
		return slpRendered;
	}

	/**
	 * render the slp lookup checkbox for this node ?
	 * @param useSlpEnabled true = rendering on
	 */
	public void setSlpRendered(boolean useSlpEnabled) {
		this.slpRendered = useSlpEnabled;
	}

	/**
	 * @return true = node uses empty password for authentication
	 */
	public boolean isEmptyPassword() {
		return emptyPassword;
	}

	/**
	 * node uses empty password for authentication
	 * @param emptyPassword true = node uses empty password for authentication 
	 */
	public void setEmptyPassword(boolean emptyPassword) {
		this.emptyPassword = emptyPassword;
	}

	/**
	 * @return true = save password
	 */
	public boolean isRemindPassword() {
		return remindPassword;
	}

	/**
	 * should the password be save
	 * @param remindPassword true if the password should be saved
	 */
	public void setRemindPassword(boolean remindPassword) {
		this.remindPassword = remindPassword;
	}
	
    /**
     * Adds a subnode to the current node. The subnode will be appended to the end.
     * @param subnode the subnode
     */
    public void addSubnode(ITaskLauncherTreeNode subnode)
    {
    	subnode.setParent(this);
    	//dont set the customTreeConfig becauuse the delegator treenode is not having a CustomtreeConfig
    	//subnode.setCustomTreeConfig(customTreeConfig);
        this.subnodes.add(subnode);
    }

    /**
     * @return true if the user is logged in to the cimserver represented by this node
     */
	public boolean isLoggedIn() {
		return loggedIn;
	}

	/**
	 * set to true if the user is logged in to the cimserver represented by this node
	 * @param loggedIn true if the user is logged in 
	 */
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	/**
	 * the method will return to WBEMClient, since CIMOMTreeNode are not having a namespace and cannot create a cimclient
	 * the namespace is defined by the tasks itselfs and therefore the first instance that is holding a WBEMClient are the
	 * child nodes
	 * @return the cim client
	 * @see #getNodeForTask(String)
	 */
	public WBEMClient getCimClient() {
		throw new IllegalArgumentException("Cannot get WBEMClient from CimomTreeNode");
	}

	/**
	 * set the cimclient for this cimserver's node
	 * @param cimClient = the server connection
	 */
	public void setCimClient(WBEMClient cimClient) {
		throw new IllegalArgumentException("Cannot set WBEMClient on CimomTreeNode");
	}

	/**
	 * Get the node of the specified task. The taskname should correspond to the name of the task in the tasklauncher-config.xml
	 * @param taskname name of the task
	 * @return the node or null if for the task no host was found
	 * @throws WbemsmtException if getting the subnodes failed
	 */
	public ITaskLauncherTreeNode getNodeForTask(String taskname) throws WbemsmtException {
    	for (Iterator<ITaskLauncherTreeNode> iter = getSubnodes().iterator(); iter.hasNext();) {
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
