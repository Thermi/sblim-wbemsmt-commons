/**
 *  TaskLauncherController.java
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
 * Contributors: Michael.Bauschert@de.ibm.com
 *
 */

package org.sblim.wbemsmt.tasklauncher;

import java.net.UnknownHostException;
import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.Cleanup;
import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.LoginException;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;
import org.sblim.wbemsmt.tasklauncher.logging.FacesMessageFormater;
import org.sblim.wbemsmt.tasklauncher.logging.FacesMessageHandler;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.tools.slp.SLPHostDefinition;
import org.sblim.wbemsmt.tools.slp.SLPLoader;
import org.sblim.wbemsmt.tools.slp.SLPUtil;


public class TaskLauncherController implements Cleanup
{
    public static final String NAME_FOR_MULTI_CIMOM_TREE = "multi";
	private static Logger logger = Logger.getLogger(TaskLauncherController.class.getName());
    private static ConsoleHandler handler;
    
    
    private HashMap treeFactories;
    private TaskLauncherConfig taskLauncherConfig;
    private String runtimeMode;
	private String configFilename = null;
	private SLPLoader slpLoader;
	private boolean useSlp;
	private WbemSmtResourceBundle bundle;
	private List cimomDatas = new ArrayList();
    
    public TaskLauncherController() throws WbemSmtException
    {
        // initialize logging
    	if (handler == null)
    	{
    		handler = new FacesMessageHandler();
    		handler.setLevel(Level.INFO);
    		handler.setFormatter(new FacesMessageFormater());
            logger.log(Level.INFO, "Logger created.");
    	}
        bundle = ResourceBundleManager.getCommonResourceBundle();
    }

    
    public SLPLoader getSlpLoader() {
		return slpLoader;
	}

	public void setSlpLoader(SLPLoader slpLoader) {
		this.slpLoader = slpLoader;
	}

	public void init(String hostname, String port, String protocol, String username, String password, boolean useSlpForTasks) throws ModelLoadException {
		init(hostname,port,protocol,username,password,useSlpForTasks,null);
	}
	
	
	/**
	 * Initialize the TaskLauncherController
	 * @param name
	 * @param cimClient
	 * @param useSlpForTasks
	 * @param treeConfigs List with TreeConfigData-Objects. Can be used to filter all those tasks which are not in the List
	 * @throws ModelLoadException
	 */
	public void init(String hostname, String port, String protocol, String username, String password, boolean useSlpForTasks, List treeConfigs) throws ModelLoadException
    {
		try {
			cimomDatas.add(new TaskLauncherConfig.CimomData(hostname,Integer.parseInt(port),protocol,username,password));
        	this.useSlp = useSlpForTasks;
			loadConfig(null,treeConfigs);
		} catch (Exception e) {
			throw new ModelLoadException(e);
		}
    }
	public HashMap getTreeFactories() throws WbemSmtException
    {
		if (this.treeFactories == null)
		{
	        loadConfig(configFilename);
		}
        return this.treeFactories;
    }
    
    public TaskLauncherTreeFactory getTreeFactory(String cimomName) throws WbemSmtException
    {
        return (TaskLauncherTreeFactory) getTreeFactories().get(cimomName);
    }
    
    public Set getTreeFactoryNames() throws WbemSmtException
    {
        return this.getTreeFactories().keySet();
    }
    
    private void createTreeFactories() throws ModelLoadException
    {
    	if (treeFactories == null)
    	{
    		treeFactories = new HashMap();
    	}
    	treeFactories.clear();
    	
    	for (Iterator it = cimomDatas.iterator(); it.hasNext();) {
    		CimomData data = (CimomData) it.next();
			if(data != null && this.taskLauncherConfig != null)
			{
				String cimomName = (String)data.getHostname() ;
				Vector treeconfigsByHostname = taskLauncherConfig.getTreeConfigDataByHostname(cimomName);
				
				List treeConfigs = new ArrayList();
				for (Iterator iter = treeconfigsByHostname.iterator(); iter.hasNext();) {
					TaskLauncherConfig.TreeConfigData configData = (TaskLauncherConfig.TreeConfigData) iter.next();
					
					try {
						if (WbemsmtSession.getSession().getCIMClientPool(cimomName) == null)
						{
							WbemsmtSession.getSession().createCIMClientPool(cimomName,""+data.getPort(),data.getUser(),data.getPassword());
						}
						CIMClient cimClient = WbemsmtSession.getSession().getCIMClientPool(cimomName).getCIMClient(configData.getNamespace());
						addTreeConfig(cimClient, configData, data, treeConfigs);
					} catch (UnknownHostException e) {
						logger.log(Level.SEVERE, "Cannot create a CIMClient for host " + cimomName + " Host was not found",e);
					} catch (LoginException e) {
						ExceptionUtil.handleException(e);
					}
				}
				
				if (treeConfigs.size() == 0)
				{
					if (RuntimeUtil.getInstance().isJSF())
					{
						if (taskLauncherConfig.getTreeConfigData().size() > 0)
						{
							JsfUtil.addMessage(Message.create(ErrCodes.MSG_HOST_NOT_FOUND_TASKS_ADDED,Message.INFO,bundle,"host.not.found.tasks.added", new Object[]{cimomName}));
						}
						else
						{
							JsfUtil.addMessage(Message.create(ErrCodes.MSG_HOST_NOT_FOUND,Message.INFO,bundle,"host.not.found", new Object[]{cimomName}));
						}
					}
					for (Iterator iter = taskLauncherConfig.getTreeConfigData().iterator(); iter.hasNext();) {
						TaskLauncherConfig.TreeConfigData configData = (TaskLauncherConfig.TreeConfigData) iter.next();
						try {
							if (WbemsmtSession.getSession().getCIMClientPool(cimomName) == null)
							{
								WbemsmtSession.getSession().createCIMClientPool(cimomName,""+data.getPort(),data.getUser(),data.getPassword());
							}
							CIMClient cimClient = WbemsmtSession.getSession().getCIMClientPool(cimomName).getCIMClient(configData.getNamespace());
							addTreeConfig(cimClient, configData, data, treeConfigs);
						} catch (UnknownHostException e) {
							logger.log(Level.SEVERE, "Cannot create a CIMClient for host " + cimomName + " Host was not found",e);
						} catch (LoginException e) {
							ExceptionUtil.handleException(e);
						}
					}
				}

				this.treeFactories.put(cimomName, new TaskLauncherTreeFactory(treeConfigs));
			}
		}
    }

	private void addTreeConfig(CIMClient cimClient, TaskLauncherConfig.TreeConfigData configData, CimomData cimomData, List treeConfigs) {
		if (!useSlp || useSlp && SLPUtil.getTaskIsSupported(slpLoader,cimClient.getNameSpace().getHost(),configData.getSlpServicename()))
		{
			logger.log(Level.INFO, "Creating Treefactory \"" + configData.getName() + "\" from file " + configData.getFilename());
			CustomTreeConfig treeConfig = new CustomTreeConfig(configData,cimomData,cimClient);
			if (RuntimeUtil.getInstance().isJSF())
			{
				if (RuntimeUtil.getInstance().isJSF())
				{
					if (treeConfig.isLoaded())
					{
						if (treeConfig.serverTaskExists(cimClient))
						{
							JsfUtil.addMessage(Message.create(ErrCodes.MSG_TASK_SUPPORTED,Message.INFO,bundle,"task.supported", new Object[]{configData.getName(),cimClient.getNameSpace().getHost(),cimClient.getNameSpace().getNameSpace()}));
						}
						else
						{
							JsfUtil.addMessage(Message.create(ErrCodes.MSG_TASK_NOT_SUPPORTED_SERVER,Message.ERROR,bundle,"task.not.supported.on.server", new Object[]{configData.getName(),cimClient.getNameSpace().getHost(),cimClient.getNameSpace().getNameSpace()}));
						}
					}
					else
					{
						JsfUtil.addMessage(Message.create(ErrCodes.MSG_TASK_NOT_SUPPORTED_CLIENT,Message.ERROR,bundle,"task.not.supported.on.client", new Object[]{configData.getName()}));
					}
				}
			}
			treeConfigs.add(treeConfig);
		}
		else
		{
			logger.log(Level.INFO, "Task " + configData.getName() + " is not supported for host " + cimClient.getNameSpace().getHost());
			if (RuntimeUtil.getInstance().isJSF())
			{
				String msg = bundle.getString(ErrCodes.MSG_TASK_NOT_SUPPORTED,"task.not.supported", new Object[]{configData.getName(),cimClient.getNameSpace().getHost()});
				JsfUtil.addMessage(new Message(ErrCodes.MSG_TASK_NOT_SUPPORTED,Message.ERROR,msg));
			}
		}
	}
    
    public void createTreeFactoriesMultiHost() throws WbemSmtException
    {
    	createTreeFactoriesMultiHost(false);
    }
    
    public void createTreeFactoriesMultiHost(boolean useSlp) throws WbemSmtException
    {
    	if (treeFactories == null)
    	{
    		treeFactories = new HashMap();
    	}
    	treeFactories.clear();
    	Vector cimomData;
    	if (useSlp)
    	{
    		cimomData = new Vector();
    		SLPHostDefinition[] hostDefinition = SLPUtil.getHosts(slpLoader);
    		for (int i = 0; i < hostDefinition.length; i++) {
				SLPHostDefinition definition = hostDefinition[i];
				cimomData.add(new CimomData(definition));
			}
    	}
    	else
    	{
			cimomData = taskLauncherConfig.getCimomData();
    	}
    	CimomData[] data = (CimomData[]) cimomData.toArray(new CimomData[cimomData.size()]);
    	createTreeFactoriesMultiHost(data);
    }
    
    public void createTreeFactoriesMultiHost(CimomData[] data) throws WbemSmtException
    {
    	this.treeFactories.put(TaskLauncherController.NAME_FOR_MULTI_CIMOM_TREE,new TaskLauncherTreeFactory(data));    	
    }
    
	private void loadConfig(String configFilename) throws WbemSmtException {
		loadConfig(configFilename,null);
	}
    
	/**
	 * @param configFilename
	 * @param treeConfigs List with TreeConfigData-Objects. Can be used to filter all those tasks which are not in the List
	 * @throws WbemSmtException
	 */
	private void loadConfig(String configFilename, List treeConfigs) throws WbemSmtException {
		this.taskLauncherConfig = new TaskLauncherConfig(configFilename, treeConfigs,useSlp,slpLoader);

		//Overwrite the namespace of the CIMClients if Slp was used and SLP lookup returned other namespace
//		for (Iterator it = cimClients.entrySet().iterator(); it.hasNext();) {
//			Entry entry = (Entry) it.next();
//    		CIMClient cimClient = (CIMClient) entry.getValue();
//			if(cimClient != null && this.taskLauncherConfig != null)
//			{
//				CimomData cimomData = taskLauncherConfig.getCimomDataDataByHostname(cimClient.getNameSpace().getHost());
//				if (cimomData == null)
//				{
//					cimomData = TaskLauncherConfig.getDefaultCimomData(cimClient);
//				}
//				
//				if (useSlp && !cimomData.getNamespace().equals(cimClient.getNameSpace().getNameSpace()))
//				{
//					cimClient.getNameSpace().setNameSpace(cimomData.getNamespace());
//				}
//			}
//		}
		
		this.createTreeFactories();
	}

	public TaskLauncherConfig getTaskLauncherConfig() throws WbemSmtException
    {
		if (this.taskLauncherConfig == null)
		{
	        loadConfig(configFilename);
		}
		return this.taskLauncherConfig;
    }

	public String getRuntimeMode() {
		return runtimeMode;
	}

	public void setRuntimeMode(String runtimeMode) {
		this.runtimeMode = runtimeMode;
	}

	public boolean isUseSlp() {
		return useSlp;
	}

	public void setUseSlp(boolean useSlp) {
		this.useSlp = useSlp;
	}

	public void cleanup() {
		if (treeFactories != null) treeFactories.clear();
	}

	public String getConfigFilename() {
		return configFilename;
	}

	public void setConfigFilename(String configFilename) throws WbemSmtException {
		this.configFilename = configFilename;
		loadConfig(configFilename);
		
	}

	
	
	
    
}