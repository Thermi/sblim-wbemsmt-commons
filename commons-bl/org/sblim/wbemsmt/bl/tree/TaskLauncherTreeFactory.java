/**
 *  TaskLauncherTreeFactory.java
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
 * @author: Marius Kreis <mail@nulldevice.org>
 *
 * Contributors:
 *
 */

package org.sblim.wbemsmt.bl.tree;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.welcome.WelcomeData;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherContextMenu;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.TreeConfigData;
import org.sblim.wbemsmt.tasklauncher.login.LoginCheck;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;


public class TaskLauncherTreeFactory implements ITaskLauncherTreeFactory
{
    private static final Logger logger = Logger.getLogger(TaskLauncherTreeFactory.class.getName());
    
    private List<TaskLauncherTreeNode> rootNodes = new ArrayList<TaskLauncherTreeNode>();

    private List<TaskLauncherContextMenu> commonContextMenues = new ArrayList<TaskLauncherContextMenu>();

	private List<CimomTreeNode> cimomNodes = new ArrayList<CimomTreeNode>();
    
    public TaskLauncherTreeFactory(List<CustomTreeConfig> customTreeConfigs) throws WbemsmtException
    { 
    	if (customTreeConfigs != null)
    	{
        	for (Iterator<CustomTreeConfig> iter = customTreeConfigs.iterator(); iter.hasNext();) {
    			CustomTreeConfig customTreeConfig = iter.next();
    			if (customTreeConfig.isLoaded() && customTreeConfig.serverTaskExists(customTreeConfig.getCimClient()))
    			{
        			TaskLauncherTreeNode nodeFromXML = TaskLauncherTreeNode.createNodeFromXML(customTreeConfig.getCimClient(), customTreeConfig.getRootnode(),customTreeConfig);
        			nodeFromXML.setCustomTreeConfig(customTreeConfig);
        			rootNodes.add( nodeFromXML );
        			if (customTreeConfig.getCommonContextMenue() != null)
        			{
        				TaskLauncherContextMenu contextMenu = new TaskLauncherContextMenu(customTreeConfig.getCommonContextMenue(),customTreeConfig.getTreeConfigData().getBundles());
        				contextMenu.setCommon(true);
        				contextMenu.setNode(nodeFromXML);
						commonContextMenues.add(contextMenu);
        			}
    			}
    			else
    			{
        			try {
        				TaskLauncherTreeNode rootNode = TaskLauncherTreeNode.createSimpleTextNode(customTreeConfig.getTreeConfigData().getName());
        				//add the node itself as child (the root Nodes are not displayed)
        				TaskLauncherTreeNode disabledNode = TaskLauncherTreeNode.createSimpleTextNode(customTreeConfig.getTreeConfigData().getName());
        				disabledNode.setEnabled(false);
						rootNode.getSubnodes().add(disabledNode);
	        			rootNodes.add( rootNode );
					} catch (WbemsmtException e) {
						throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,e);
					}
    			}
    		}
    	}
    }
    
    public TaskLauncherTreeFactory(WBEMClient cimClient) throws WbemsmtException
    {
        this(new ArrayList<CustomTreeConfig>());
    }

    public TaskLauncherTreeFactory(CimomData[] cimoms) throws WbemsmtException {
		for (int i = 0; i < cimoms.length; i++) {
			CimomData cimom = cimoms[i];
			addCimomNode(cimom);
		}
		sortCimomNodes(rootNodes);		
	}

	private void addCimomNode(CimomData cimom) throws WbemsmtException {
		TaskLauncherDelegaterTreeNode rootNode = new TaskLauncherDelegaterTreeNode(new ArrayList<ITaskLauncherTreeNode>(),"root");
		CimomTreeNode cimomNode = new CimomTreeNode(cimom);
		cimomNodes.add(cimomNode);
		rootNode.addSubnode(cimomNode);
		rootNodes.add(rootNode);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbem.webapp.ITaskLauncherTreeFactory#getRootNode()
	 */ 
    public List<TaskLauncherTreeNode> getRootNodes()
    {
    	return rootNodes;
    }
    
    /**
     * Updates the current Cimom Treenodes
     * @param cimomDataArray
     * @throws WbemsmtException 
     */
	public void updateMultiHost(CimomData[] cimomDataArray) throws WbemsmtException {
		
		Set<String> oldCimoms = new HashSet<String>(); 
		Set<String> newCimoms = new HashSet<String>();
		
		for (Iterator<TaskLauncherTreeNode> iter = rootNodes.iterator(); iter.hasNext();) {
			TaskLauncherTreeNode rootNode = iter.next();
			CimomTreeNode cimomNode = (CimomTreeNode)rootNode.getSubnodes().get(0);
			oldCimoms.add(cimomNode.getCimomData().getHostname().toLowerCase());
		}
		
		for (int i = 0; i < cimomDataArray.length; i++) {
			CimomData data = cimomDataArray[i];
			newCimoms.add(data.getHostname().toLowerCase());
		}
		
		//first remove the oldOnes that doesn't exist anymore
		for (Iterator<String> iter = oldCimoms.iterator(); iter.hasNext();) {
			String oldHost = iter.next();
			if (!newCimoms.contains(oldHost))
			{
				for (int i=0; i < rootNodes.size(); i++)
				{
					TaskLauncherTreeNode rootNode = (TaskLauncherTreeNode) rootNodes.get(i);
					CimomTreeNode cimomNode = (CimomTreeNode) rootNode.getSubnodes().get(0);
					if (oldHost.equalsIgnoreCase(cimomNode.getCimomData().getHostname()))
					{
						logger.info("Removing CIMOIM " + oldHost);
						rootNodes.remove(i);
						cimomNodes.remove(i);
						break;
					}
				}
			}
		}
		
		//add the new found hosts
		for (Iterator<String> iter = newCimoms.iterator(); iter.hasNext();) {
			String newHost = iter.next();
			if (!oldCimoms.contains(newHost))
			{
				for (int i = 0; i < cimomDataArray.length; i++) {
					CimomData data = cimomDataArray[i];
					if(newHost.equalsIgnoreCase(data.getHostname().toLowerCase()))
					{
						logger.info("Adding CIMOM " + newHost);
						addCimomNode(data);
						break;
					}
				}
			}
		}
		sortCimomNodes(rootNodes);
		logger.info("Cimom-Subnodes: " + rootNodes.size());
	}

	public void updateSingleHost(CimomData[] cimomDataArray) throws WbemsmtException
	{
		LoginCheck loginCheck = (LoginCheck) BeanNameConstants.LOGIN_CHECK.getBoundValue(FacesContext.getCurrentInstance());
		WBEMClient client = loginCheck.getCimClient();
		
		String hostOfClient = WbemsmtSession.getSession().getCIMClientPool(client).getHostname();
		
		CimomData ourCimom = null;
		
		for (int i = 0; i < cimomDataArray.length && ourCimom == null; i++) {
			CimomData data = cimomDataArray[i];
			if (client != null && data.getHostname().equalsIgnoreCase(hostOfClient))
			{
				ourCimom = data;
			}
		}
		
		if (ourCimom != null)
		{
			Set<String> oldItems = new HashSet<String>(); 
			Set<String> newItems = new HashSet<String>();
			
			for (Iterator<TaskLauncherTreeNode> iter = rootNodes.iterator(); iter.hasNext();) {
				TaskLauncherTreeNode rootNode = (TaskLauncherTreeNode) iter.next();
				oldItems.add(rootNode.getCustomTreeConfig().getFilename());
			}
			
			Vector<TreeConfigData> treeConfigs = ourCimom.getTreeConfigs();
			for (Iterator<TreeConfigData> iter = treeConfigs.iterator(); iter.hasNext();) {
				TreeConfigData treeConfigData = (TreeConfigData) iter.next();
				newItems.add(treeConfigData.getFilename());
			}
			
			//first remove the oldOnes that doesn't exist anymore
			for (Iterator<String> iter = oldItems.iterator(); iter.hasNext();) {
				String oldItem = (String) iter.next();
				if (!newItems.contains(oldItem))
				{
					for (int i=0; i < rootNodes.size(); i++)
					{
						TaskLauncherTreeNode rootNode = (TaskLauncherTreeNode) rootNodes.get(i);
						if (oldItem.equalsIgnoreCase(rootNode.getCustomTreeConfig().getFilename()))
						{
							logger.info("Removing Node " + oldItem);
							rootNodes.remove(i);
							break;
						}
					}
				}
			}
			
			//add the new found Tasks
			for (Iterator<String> iter = newItems.iterator(); iter.hasNext();) {
				String newItem = (String) iter.next();
				if (!oldItems.contains(newItem))
				{
					for (Iterator<TreeConfigData> iterator = treeConfigs.iterator(); iterator.hasNext();) {
						TreeConfigData treeConfigData = (TreeConfigData) iterator.next();
						
						if (treeConfigData.getFilename().equalsIgnoreCase(newItem))
						{
							CustomTreeConfig customTreeConfig = new CustomTreeConfig(treeConfigData,ourCimom,null);
							TaskLauncherTreeNode nodeFromXML = TaskLauncherTreeNode.createNodeFromXML(client, customTreeConfig.getRootnode(),customTreeConfig);
							nodeFromXML.setCustomTreeConfig(customTreeConfig);
							rootNodes.add( nodeFromXML );
						}
					}
				}
			}			
			sortTaskNodes();
		}
		else
		{
			rootNodes.clear();
		}
	}
	
	// Really there's a CimomData specific method being called to compare the objects
	// But it appears that sometimes there is a non-CimomData object that has CimomData nodes as children.
	// In these cases the child of each object is compared.
	private void sortCimomNodes(List<? extends TaskLauncherTreeNode> nodes) {

		Collections.sort(nodes, new Comparator<TaskLauncherTreeNode>()
				{
			public int compare(TaskLauncherTreeNode o1, TaskLauncherTreeNode o2) {
				try {
					
					if (o1 instanceof CimomTreeNode && o2 instanceof CimomTreeNode)
					{
						CimomTreeNode cimomNode1 = (CimomTreeNode)o1;
						CimomTreeNode cimomNode2 = (CimomTreeNode)o2;
						return cimomNode1.getCimomData().getHostname().compareTo(cimomNode2.getCimomData().getHostname());
					}
					else
					{
						CimomTreeNode cimomNode1 = (CimomTreeNode)((TaskLauncherTreeNode)o1).getSubnodes().get(0);
						CimomTreeNode cimomNode2 = (CimomTreeNode)((TaskLauncherTreeNode)o2).getSubnodes().get(0);
						return cimomNode1.getCimomData().getHostname().compareTo(cimomNode2.getCimomData().getHostname());
					}
					
				} catch (Exception e) {
					e.printStackTrace();
					return 0;
				}
			}
		});
		
	}

	private void sortTaskNodes() {

		Collections.sort(rootNodes, new Comparator<TaskLauncherTreeNode>()
		{
			public int compare(TaskLauncherTreeNode o1, TaskLauncherTreeNode o2) {
				try {
					ITaskLauncherTreeNode treeNode1 = (ITaskLauncherTreeNode)o1.getSubnodes().get(0);
					ITaskLauncherTreeNode treeNode2 = (ITaskLauncherTreeNode)o2.getSubnodes().get(0);
					return treeNode1.getName().compareTo(treeNode2.getName());
				} catch (Exception e) {
					e.printStackTrace();
					return 0;
				}
			}
		});
		
	}

	public List<TaskLauncherContextMenu> getCommonContextMenues() {
	
		List<TaskLauncherContextMenu> result = new ArrayList<TaskLauncherContextMenu>();
		if (RuntimeUtil.getInstance().isSingleMode() || RuntimeUtil.getInstance().isEmbeddedMode())
		{
			result.addAll(commonContextMenues);
		}
		else
		{
			Set<String> addedCommonContextMenues = new HashSet<String>();
			
			for (Iterator<CimomTreeNode> iter = cimomNodes.iterator(); iter.hasNext();) {
				CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
				Map<String, TaskLauncherContextMenu> ctxMenues = cimomTreeNode.getCommonContextMenues();
				for (Iterator<Map.Entry<String, TaskLauncherContextMenu>> iterator = ctxMenues.entrySet().iterator(); iterator.hasNext();) {
					Map.Entry<String, TaskLauncherContextMenu> entry =  iterator.next();
					if (!addedCommonContextMenues.contains(entry.getKey()))
					{
						result.add(entry.getValue());
						addedCommonContextMenues.add(entry.getKey());
					}
					
				}
			}
			
		}
		
		
		
		if (RuntimeUtil.getInstance().isJSF() )
		{
			ILocaleManager manager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
			for (Iterator<TaskLauncherContextMenu> iter = result.iterator(); iter.hasNext();) {
				TaskLauncherContextMenu menu = iter.next();
				if (menu != null && menu.getItemCount() > 0 && menu.getItem(0).getDescription() == null)
				{
					menu.initI18n(manager);
				}
			}
		}
		
		return result;
	}

	/**
	 * Counts the active Cimom Nodes 
	 * If the application is not running in multimode the return value is 0
	 * @return
	 */
	public int getActiveCimomNodeCount()
	{
		int count = 0;
		for (Iterator<CimomTreeNode> iter = cimomNodes.iterator(); iter.hasNext();) {
			CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
			if (cimomTreeNode.isLoggedIn())
			{
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Counts the inactive Cimom Nodes 
	 * If the application is not running in multimode the return value is 0
	 * @return
	 */
	public int getInactiveCimomNodeCount()
	{
		int count = 0;
		for (Iterator<CimomTreeNode> iter = cimomNodes.iterator(); iter.hasNext();) {
			CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
			if (!cimomTreeNode.isLoggedIn())
			{
				count++;
			}
		}
		return count;
	}

	/**
	 * Returns a node with all active cimons
	 * If the application is not running in multimode the return value is nul
	 * @return null or a SimpleTextTreeNode with all the active CimomTreeNodes as childs
	 */
	public ITaskLauncherTreeNode getNodeWithActiveCimomsNodes()
	{
		ITaskLauncherTreeNode result = null;
		if (getActiveCimomNodeCount() > 0)
		{
			List<CimomTreeNode> nodes = getActiveCimomNodes();
			sortCimomNodes(nodes);

			result = new SimpleTextTreeNode("activeCimoms");
			for (Iterator<CimomTreeNode> iter = nodes.iterator(); iter.hasNext();) {
				CimomTreeNode cimomTreeNode = iter.next();
				result.addSubnode(cimomTreeNode);
			}
			
		}
			
		return result;
	}
	
	/**
	 * Returns a node with all inactive cimons
	 * If the application is not running in multimode or there are no inactive nodes the return value is null
	 * @return null or a SimpleTextTreeNode with all the active CimomTreeNodes as childs
	 */
	public ITaskLauncherTreeNode getNodeWithInactiveCimomsNodes()
	{
		ITaskLauncherTreeNode result = null;
		if (getInactiveCimomNodeCount() > 0)
		{
			List<CimomTreeNode> nodes = getInactiveCimomNodes();
			sortCimomNodes(nodes);
			
			result = new SimpleTextTreeNode("inactiveCimoms");
			for (Iterator<CimomTreeNode> iter = nodes.iterator(); iter.hasNext();) {
				CimomTreeNode cimomTreeNode = iter.next();
				result.addSubnode(cimomTreeNode);
			}
		}
			
		return result;
	}
	

	/**
	 * Returns a node with all rootNodes
	 * @return null or a SimpleTextTreeNode with all the active rootnodes as childs
	 */
	public ITaskLauncherTreeNode getNodeWithRootNodes()
	{
		ITaskLauncherTreeNode result = null;
		
		for (int i=0; i < rootNodes.size(); i++)
		{
			if (i==0)
			{
				result = new SimpleTextTreeNode("activeCimoms");
			}
			ITaskLauncherTreeNode node = (ITaskLauncherTreeNode) rootNodes.get(i);
			result.addSubnode(node);
		}
		return result;
	}

	/**
	 * Returns a list with all active cimons
	 * If the application is not running in multimode the return value is null
	 * @return
	 */
	private List<CimomTreeNode>  getActiveCimomNodes() {

		List<CimomTreeNode> result = new ArrayList<CimomTreeNode>();
		
		for (Iterator<CimomTreeNode> iter = cimomNodes.iterator(); iter.hasNext();) {
			CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
			if (cimomTreeNode.isLoggedIn())
			{
				result.add(cimomTreeNode);
			}	
		}
		return result;
	}

	/**
	 * Returns a list with all active cimons
	 * If the application is not running in multimode the return value is null
	 * @return
	 */
	private List<CimomTreeNode>  getInactiveCimomNodes() {

		List<CimomTreeNode> result = new ArrayList<CimomTreeNode> ();
		
		for (Iterator<CimomTreeNode>  iter = cimomNodes.iterator(); iter.hasNext();) {
			CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
			if (!cimomTreeNode.isLoggedIn())
			{
				result.add(cimomTreeNode);
			}	
		}
		return result;
	}

	
	/**
	 * Returns a array of TreeConfigData Objects of all active tasks
	 * @return
	 */
	
	public WelcomeData[] getWelcomeData() {
		Map<String, WelcomeData> map = new HashMap<String, WelcomeData>();
		
		for (int i=0; i < rootNodes.size(); i++)
		{
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) rootNodes.get(i);
			if (node.getCustomTreeConfig() != null)
			{
				map.put(node.getCustomTreeConfig().getTreeConfigData().getName(), new WelcomeData(node.getCustomTreeConfig().getTreeConfigData(),node.getCimClient()));
			}
		}		

		List<CimomTreeNode> activeCimoms = getActiveCimomNodes();
		for (Iterator<CimomTreeNode> iter = activeCimoms.iterator(); iter.hasNext();) {
			CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
			try {
				List<ITaskLauncherTreeNode> vector = cimomTreeNode.getSubnodes();
				for (Iterator<ITaskLauncherTreeNode> iterator = vector.iterator(); iterator.hasNext();) {
					TaskLauncherTreeNode node = (TaskLauncherTreeNode) iterator.next();
					
					//add only if the adapter for the task was initialized
					if (CimAdapterFactory.getInstance().getAdapter(node.getCustomTreeConfig().getTreeConfigData().getName(),node.getCimClient()) != null)
					{
						map.put(node.getCustomTreeConfig().getTreeConfigData().getName(), new WelcomeData(node.getCustomTreeConfig().getTreeConfigData(),node.getCimClient()));
					}
				}
			} catch (WbemsmtException e) {
				logger.log(Level.SEVERE, "Cannot get nodes of cimomTreeNode " + cimomTreeNode.getInfo(),e);
			}
		}
		Collection<WelcomeData> values = map.values();
		return (WelcomeData[]) values.toArray(new WelcomeData[values.size()]);
	}
	
}
