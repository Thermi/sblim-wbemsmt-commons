/**
 *  TaskLauncherController.java
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
 * Contributors: Michael.Bauschert@de.ibm.com
 *
 */

package org.sblim.wbemsmt.tasklauncher;

import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.cleanup.Cleanup;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.tree.CustomTreeConfig;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeFactory;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
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
    
    
    private HashMap<String, TaskLauncherTreeFactory> treeFactories;
    private TaskLauncherConfig taskLauncherConfig;
    private String runtimeMode;
	private String configFilename = null;
	private SLPLoader slpLoader;
	private boolean useSlp;
	private WbemSmtResourceBundle bundle;
	private List<CimomData> cimomDatas = new ArrayList<CimomData>();
    
    public TaskLauncherController() throws WbemsmtException
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

	public void init(String hostname, String port, String protocol, String username, String password, boolean useSlpForTasks) throws WbemsmtException {
		init(hostname,port,protocol,username,password,useSlpForTasks,null);
	}
	
	
	/**
	 * Initialize the TaskLauncherController
	 * @param name
	 * @param cimClient
	 * @param useSlpForTasks
	 * @param treeConfigs List with TreeConfigData-Objects. Can be used to filter all those tasks which are not in the List
	 * @throws WbemsmtException
	 */
	public void init(String hostname, String port, String protocol, String username, String password, boolean useSlpForTasks, List<TaskLauncherConfig.TreeConfigData> treeConfigs) throws WbemsmtException
    {
		try {
			cimomDatas.add(new TaskLauncherConfig.CimomData(hostname,Integer.parseInt(port),protocol,username,password));
        	this.useSlp = useSlpForTasks;
			loadConfig(configFilename,treeConfigs);
		} catch (Exception e) {
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,e);
		}
    }
	public HashMap<String, TaskLauncherTreeFactory> getTreeFactories() throws WbemsmtException
    {
		if (this.treeFactories == null)
		{
	        loadConfig(configFilename);
		}
        return this.treeFactories;
    }
    
    public TaskLauncherTreeFactory getTreeFactory(String cimomName) throws WbemsmtException
    {
        return (TaskLauncherTreeFactory) getTreeFactories().get(cimomName);
    }
    
    public Set<String> getTreeFactoryNames() throws WbemsmtException
    {
        return this.getTreeFactories().keySet();
    }
    
    private void createTreeFactories() throws WbemsmtException
    {
    	if (treeFactories == null)
    	{
    		treeFactories = new HashMap<String, TaskLauncherTreeFactory>();
    	}
    	treeFactories.clear();
    	
    	boolean exceptionDuringConnect = false;
    	
    	for (Iterator<CimomData> it = cimomDatas.iterator(); it.hasNext();) {
    		CimomData data = it.next();
			if(data != null && this.taskLauncherConfig != null)
			{
				String cimomName = data.getHostname() ;
				Vector<TaskLauncherConfig.TreeConfigData> treeconfigsByHostname = taskLauncherConfig.getTreeConfigDataByHostname(cimomName);
				
				List<CustomTreeConfig> treeConfigs = new ArrayList<CustomTreeConfig>();
				for (Iterator<TaskLauncherConfig.TreeConfigData> iter = treeconfigsByHostname.iterator(); iter.hasNext();) {
					TaskLauncherConfig.TreeConfigData configData = iter.next();
					
					try {
						if (WbemsmtSession.getSession().getCIMClientPool(cimomName) == null)
						{
							WbemsmtSession.getSession().createCIMClientPool(data.getProtocol(),cimomName, ""+data.getPort(),data.getUser(),data.getPassword());
						}
						WBEMClient cimClient = WbemsmtSession.getSession().getCIMClientPool(cimomName).getCIMClient(configData.getNamespace());
						addTreeConfig(cimClient, configData, data, treeConfigs);
					} catch (WbemsmtException e) {
						ExceptionUtil.handleException(e);
                        exceptionDuringConnect = true;
					}
				}
				
				if (!exceptionDuringConnect && treeConfigs.size() == 0)
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
					for (Iterator<TaskLauncherConfig.TreeConfigData> iter = taskLauncherConfig.getTreeConfigData().iterator(); iter.hasNext();) {
						TaskLauncherConfig.TreeConfigData configData = (TaskLauncherConfig.TreeConfigData) iter.next();
						try {
							if (WbemsmtSession.getSession().getCIMClientPool(cimomName) == null)
							{
								WbemsmtSession.getSession().createCIMClientPool(data.getProtocol(), cimomName,""+data.getPort(),data.getUser(),data.getPassword());
							}
							WBEMClient cimClient = WbemsmtSession.getSession().getCIMClientPool(cimomName).getCIMClient(configData.getNamespace());
							addTreeConfig(cimClient, configData, data, treeConfigs);
						} catch (WbemsmtException e) {
							ExceptionUtil.handleException(e);
						}
					}
				}

				this.treeFactories.put(cimomName, new TaskLauncherTreeFactory(treeConfigs));
			}
		}
    }

	private void addTreeConfig(WBEMClient cimClient, TaskLauncherConfig.TreeConfigData configData, CimomData cimomData, List<CustomTreeConfig> treeConfigs) {
		
		String host = cimomData.getHostname();
		String namespace = configData.getNamespace();
		
		if (!useSlp || useSlp && SLPUtil.getTaskIsSupported(slpLoader,host,configData.getSlpServicename()))
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
							JsfUtil.addMessage(Message.create(ErrCodes.MSG_TASK_SUPPORTED,Message.INFO,bundle,"task.supported", new Object[]{configData.getName(),host,namespace}));
						}
						else
						{
							JsfUtil.addMessage(Message.create(ErrCodes.MSG_TASK_NOT_SUPPORTED_SERVER,Message.ERROR,bundle,"task.not.supported.on.server", new Object[]{configData.getName(),host,namespace}));
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
			logger.log(Level.INFO, "Task " + configData.getName() + " is not supported for host " + host);
			if (RuntimeUtil.getInstance().isJSF())
			{
				String msg = bundle.getString(ErrCodes.MSG_TASK_NOT_SUPPORTED,"task.not.supported", new Object[]{configData.getName(),host});
				JsfUtil.addMessage(new Message(ErrCodes.MSG_TASK_NOT_SUPPORTED,Message.ERROR,msg));
			}
		}
	}
    
    public void createTreeFactoriesMultiHost() throws WbemsmtException
    {
    	createTreeFactoriesMultiHost(false);
    }
    
    public void createTreeFactoriesMultiHost(boolean useSlp) throws WbemsmtException
    {
    	if (treeFactories == null)
    	{
    		treeFactories = new HashMap<String, TaskLauncherTreeFactory>();
    	}
    	treeFactories.clear();
    	Vector<CimomData> cimomData;
    	if (useSlp)
    	{
    		cimomData = new Vector<CimomData>();
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
    
    public void createTreeFactoriesMultiHost(CimomData[] data) throws WbemsmtException
    {
    	this.treeFactories.put(TaskLauncherController.NAME_FOR_MULTI_CIMOM_TREE,new TaskLauncherTreeFactory(data));    	
    }
    
	private void loadConfig(String configFilename) throws WbemsmtException {
		loadConfig(configFilename,null);
	}
    
	/**
	 * @param configFilename
	 * @param treeConfigs List with TreeConfigData-Objects. Can be used to filter all those tasks which are not in the List
	 * @throws WbemsmtException
	 */
	private void loadConfig(String configFilename, List<TaskLauncherConfig.TreeConfigData> treeConfigs) throws WbemsmtException {
		this.taskLauncherConfig = new TaskLauncherConfig(configFilename, treeConfigs,useSlp,slpLoader);

		//Overwrite the namespace of the WBEMClients if Slp was used and SLP lookup returned other namespace
//		for (Iterator it = cimClients.entrySet().iterator(); it.hasNext();) {
//			Entry entry = (Entry) it.next();
//    		WBEMClient cimClient = (WBEMClient) entry.getValue();
//			if(cimClient != null && this.taskLauncherConfig != null)
//			{
//				CimomData cimomData = taskLauncherConfig.getCimomDataDataByHostname(host);
//				if (cimomData == null)
//				{
//					cimomData = TaskLauncherConfig.getDefaultCimomData(cimClient);
//				}
//				
//				if (useSlp && !cimomData.getNamespace().equals(namespace))
//				{
//					cimClient.getNameSpace().setNameSpace(cimomData.getNamespace());
//				}
//			}
//		}
		
		this.createTreeFactories();
	}

	public TaskLauncherConfig getTaskLauncherConfig() throws WbemsmtException
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

	public void setConfigFilename(String configFilename) throws WbemsmtException {
		this.configFilename = configFilename;
		loadConfig(configFilename);
		
	}

	
	
	
    
}