/**
 *  TaskLauncherTreeFactory.java
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
 * @author: Marius Kreis <mail@nulldevice.org>
 *
 * Contributors:
 *
 */

package org.sblim.wbemsmt.tasklauncher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeFactory;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.welcome.WelcomeData;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.TreeConfigData;
import org.sblim.wbemsmt.tasklauncher.login.LoginCheck;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;


public class TaskLauncherTreeFactory implements ITaskLauncherTreeFactory
{
    private static final Logger logger = Logger.getLogger(TaskLauncherTreeFactory.class.getName());
    
    private List rootNodes = new ArrayList();

    private List commonContextMenues = new ArrayList();

	private List cimomNodes = new ArrayList();
    
    public TaskLauncherTreeFactory(CIMClient cimClient, List customTreeConfigs) throws ModelLoadException
    { 
    	if (customTreeConfigs != null)
    	{
        	for (Iterator iter = customTreeConfigs.iterator(); iter.hasNext();) {
    			CustomTreeConfig customTreeConfig = (CustomTreeConfig) iter.next();
    			if (customTreeConfig.isLoaded() && customTreeConfig.serverTaskExists(cimClient))
    			{
        			TaskLauncherTreeNode nodeFromXML = TaskLauncherTreeNode.createNodeFromXML(cimClient, customTreeConfig.getRootnode(),customTreeConfig);
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
					} catch (WbemSmtException e) {
						throw new ModelLoadException(e);
					}
    			}
    		}
    	}
    }
    
    public TaskLauncherTreeFactory(CIMClient cimClient) throws ModelLoadException
    {
        this(cimClient, null);
    }

    public TaskLauncherTreeFactory(CimomData[] cimoms) throws WbemSmtException {
		for (int i = 0; i < cimoms.length; i++) {
			CimomData cimom = cimoms[i];
			addCimomNode(cimom);
		}
		sortCimomNodes(rootNodes);		
	}

	private void addCimomNode(CimomData cimom) throws WbemSmtException {
		TaskLauncherDelegaterTreeNode rootNode = new TaskLauncherDelegaterTreeNode(new ArrayList(),"root");
		CimomTreeNode cimomNode = new CimomTreeNode(cimom);
		cimomNodes.add(cimomNode);
		rootNode.addSubnode(cimomNode);
		rootNodes.add(rootNode);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbem.webapp.ITaskLauncherTreeFactory#getRootNode()
	 */ 
    public List getRootNodes()
    {
    	return rootNodes;
    }
    
    /**
     * Updates the current Cimom Treenodes
     * @param cimomDataArray
     * @throws WbemSmtException 
     */
	public void updateMultiHost(CimomData[] cimomDataArray) throws WbemSmtException {
		
		Set oldCimoms = new HashSet(); 
		Set newCimoms = new HashSet();
		
		for (Iterator iter = rootNodes.iterator(); iter.hasNext();) {
			TaskLauncherTreeNode rootNode = (TaskLauncherTreeNode) iter.next();
			CimomTreeNode cimomNode = (CimomTreeNode)rootNode.getSubnodes().get(0);
			oldCimoms.add(cimomNode.getCimomData().getHostname().toLowerCase());
		}
		
		for (int i = 0; i < cimomDataArray.length; i++) {
			CimomData data = cimomDataArray[i];
			newCimoms.add(data.getHostname().toLowerCase());
		}
		
		//first remove the oldOnes that doesn't exist anymore
		for (Iterator iter = oldCimoms.iterator(); iter.hasNext();) {
			String oldHost = (String) iter.next();
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
		for (Iterator iter = newCimoms.iterator(); iter.hasNext();) {
			String newHost = (String) iter.next();
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

	public void updateSingleHost(CimomData[] cimomDataArray) throws ModelLoadException
	{
		LoginCheck loginCheck = (LoginCheck) BeanNameConstants.LOGIN_CHECK.getBoundValue(FacesContext.getCurrentInstance());
		CIMClient client = loginCheck.getCimClient();
		
		CimomData ourCimom = null;
		
		for (int i = 0; i < cimomDataArray.length && ourCimom == null; i++) {
			CimomData data = cimomDataArray[i];
			if (client != null && data.getHostname().equalsIgnoreCase(client.getNameSpace().getHost()))
			{
				ourCimom = data;
			}
		}
		
		if (ourCimom != null)
		{
			Set oldItems = new HashSet(); 
			Set newItems = new HashSet();
			
			for (Iterator iter = rootNodes.iterator(); iter.hasNext();) {
				TaskLauncherTreeNode rootNode = (TaskLauncherTreeNode) iter.next();
				oldItems.add(rootNode.getCustomTreeConfig().getFilename());
			}
			
			Vector treeConfigs = ourCimom.getTreeConfigs();
			for (Iterator iter = treeConfigs.iterator(); iter.hasNext();) {
				TreeConfigData treeConfigData = (TreeConfigData) iter.next();
				newItems.add(treeConfigData.getFilename());
			}
			
			//first remove the oldOnes that doesn't exist anymore
			for (Iterator iter = oldItems.iterator(); iter.hasNext();) {
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
			for (Iterator iter = newItems.iterator(); iter.hasNext();) {
				String newItem = (String) iter.next();
				if (!oldItems.contains(newItem))
				{
					for (Iterator iterator = treeConfigs.iterator(); iterator.hasNext();) {
						TreeConfigData treeConfigData = (TreeConfigData) iterator.next();
						
						if (treeConfigData.getFilename().equalsIgnoreCase(newItem))
						{
							CustomTreeConfig customTreeConfig = new CustomTreeConfig(treeConfigData,ourCimom);
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
	
	private void sortCimomNodes(List nodes) {

		Collections.sort(nodes, new Comparator()
				{
			public int compare(Object o1, Object o2) {
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

		Collections.sort(rootNodes, new Comparator()
		{
			public int compare(Object o1, Object o2) {
				try {
					ITaskLauncherTreeNode treeNode1 = (ITaskLauncherTreeNode)((TaskLauncherTreeNode)o1).getSubnodes().get(0);
					ITaskLauncherTreeNode treeNode2 = (ITaskLauncherTreeNode)((TaskLauncherTreeNode)o2).getSubnodes().get(0);
					return treeNode1.getName().compareTo(treeNode2.getName());
				} catch (Exception e) {
					e.printStackTrace();
					return 0;
				}
			}
		});
		
	}

	public List getCommonContextMenues() {
	
		List result = new ArrayList();
		if (RuntimeUtil.getInstance().isSingleMode() || RuntimeUtil.getInstance().isEmbeddedMode())
		{
			result.addAll(commonContextMenues);
		}
		else
		{
			Set addedCommonContextMenues = new HashSet();
			
			for (Iterator iter = cimomNodes.iterator(); iter.hasNext();) {
				CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
				Map ctxMenues = cimomTreeNode.getCommonContextMenues();
				for (Iterator iterator = ctxMenues.entrySet().iterator(); iterator.hasNext();) {
					Map.Entry entry = (Entry) iterator.next();
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
			for (Iterator iter = result.iterator(); iter.hasNext();) {
				TaskLauncherContextMenu menu = (TaskLauncherContextMenu) iter.next();
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
		for (Iterator iter = cimomNodes.iterator(); iter.hasNext();) {
			CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
			if (cimomTreeNode.getCimClient() != null)
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
		for (Iterator iter = cimomNodes.iterator(); iter.hasNext();) {
			CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
			if (cimomTreeNode.getCimClient() == null)
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
			List nodes = getActiveCimomNodes();
			sortCimomNodes(nodes);

			result = new SimpleTextTreeNode("activeCimoms");
			for (Iterator iter = nodes.iterator(); iter.hasNext();) {
				CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
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
			List nodes = getInactiveCimomNodes();
			sortCimomNodes(nodes);
			
			result = new SimpleTextTreeNode("inactiveCimoms");
			for (Iterator iter = nodes.iterator(); iter.hasNext();) {
				CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
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
	private List getActiveCimomNodes() {

		List result = new ArrayList();
		
		for (Iterator iter = cimomNodes.iterator(); iter.hasNext();) {
			CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
			if (cimomTreeNode.getCimClient() != null)
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
	private List getInactiveCimomNodes() {

		List result = new ArrayList();
		
		for (Iterator iter = cimomNodes.iterator(); iter.hasNext();) {
			CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
			if (cimomTreeNode.getCimClient() == null)
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
		Map map = new HashMap();
		
		for (int i=0; i < rootNodes.size(); i++)
		{
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) rootNodes.get(i);
			if (node.getCustomTreeConfig() != null)
			{
				map.put(node.getCustomTreeConfig().getTreeConfigData().getName(), new WelcomeData(node.getCustomTreeConfig().getTreeConfigData(),node.getCimClient()));
			}
		}		

		List activeCimoms = getActiveCimomNodes();
		for (Iterator iter = activeCimoms.iterator(); iter.hasNext();) {
			CimomTreeNode cimomTreeNode = (CimomTreeNode) iter.next();
			try {
				List vector = cimomTreeNode.getSubnodes();
				for (Iterator iterator = vector.iterator(); iterator.hasNext();) {
					TaskLauncherTreeNode node = (TaskLauncherTreeNode) iterator.next();
					
					//add only if the adapter for the task was initialized
					if (CimAdapterFactory.getInstance().getAdapter(node.getCustomTreeConfig().getTreeConfigData().getName(),cimomTreeNode.getCimClient()) != null)
					{
						map.put(node.getCustomTreeConfig().getTreeConfigData().getName(), new WelcomeData(node.getCustomTreeConfig().getTreeConfigData(),cimomTreeNode.getCimClient()));
					}
				}
			} catch (WbemSmtException e) {
				logger.log(Level.SEVERE, "Cannot get nodes of cimomTreeNode " + cimomTreeNode.getInfo(),e);
			}
		}
		Collection values = map.values();
		return (WelcomeData[]) values.toArray(new WelcomeData[values.size()]);
	}
	
}
