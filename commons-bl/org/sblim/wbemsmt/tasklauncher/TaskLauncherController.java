/**
 *  TaskLauncherController.java
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
 * @author: Marius Kreis <mail@nulldevice.org>
 *
 * Contributors:
 *
 */

package org.sblim.wbemsmt.tasklauncher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.Map.Entry;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.Cleanup;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;
import org.sblim.wbemsmt.tasklauncher.logging.FacesMessageFormater;
import org.sblim.wbemsmt.tasklauncher.logging.FacesMessageHandler;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.tools.slp.SLPLoader;
import org.sblim.wbemsmt.tools.slp.SLPUtil;


public class TaskLauncherController implements Cleanup
{
    public static final String NAME_FOR_MULTI_CIMOM_TREE = "multi";
	private static Logger loggerFacesMessages = Logger.getLogger("org.sblim.wbem.webapp");
	private static Logger logger = Logger.getLogger(TaskLauncherController.class.getName());
    private static ConsoleHandler handler;
    
    
    private Map cimClients = new HashMap();
    private HashMap treeFactories;
    private TaskLauncherConfig taskLauncherConfig;
    private String runtimeMode;
	private String configFilename = null;
	private SLPLoader slpLoader;
	private boolean useSlp;
	private WbemSmtResourceBundle bundle;
    
    public static final Logger getLoggerFacesMessages() { return loggerFacesMessages; }

    public TaskLauncherController() throws WbemSmtException
    {
        // initialize logging
    	if (handler == null)
    	{
    		handler = new FacesMessageHandler();
    		handler.setLevel(Level.INFO);
    		handler.setFormatter(new FacesMessageFormater());
            loggerFacesMessages.addHandler(handler);
            loggerFacesMessages.setLevel(Level.INFO);
            logger.log(Level.INFO, "Logger created.");
    	}
        bundle = ResourceBundleManager.getCommonResourceBundle();
    }

    public CIMClient getCimClient(String name)
    {
        return (CIMClient) cimClients.get(name);
    }

    
    
    public SLPLoader getSlpLoader() {
		return slpLoader;
	}

	public void setSlpLoader(SLPLoader slpLoader) {
		this.slpLoader = slpLoader;
	}

	public void init(String name, CIMClient cimClient, boolean useSlpForTasks) throws ModelLoadException
    {
        try {
        	this.useSlp = useSlpForTasks;
			this.cimClients.put(name,cimClient);
			loadConfig(null);
		} catch (WbemSmtException e) {
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
    	
    	for (Iterator it = cimClients.entrySet().iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
    		CIMClient cimClient = (CIMClient) entry.getValue();
    		String cimomName = (String) entry.getKey();
			if(cimClient != null && this.taskLauncherConfig != null)
			{
				List treeConfigs = new ArrayList();
				for (Iterator iter = taskLauncherConfig.getTreeConfigDataByHostname(cimClient.getNameSpace().getHost()).iterator(); iter.hasNext();) {
					TaskLauncherConfig.TreeConfigData configData = (TaskLauncherConfig.TreeConfigData) iter.next();
					addTreeConfig(cimClient, configData, treeConfigs);
				}
				
				if (treeConfigs.size() == 0)
				{
					if (RuntimeUtil.getInstance().isJSF())
					{
						JsfUtil.addMessage(FacesMessage.SEVERITY_INFO,bundle.getString("host.not.found.tasks.added", new Object[]{cimClient.getNameSpace().getHost()}));
					}
					for (Iterator iter = taskLauncherConfig.getTreeConfigData().iterator(); iter.hasNext();) {
						TaskLauncherConfig.TreeConfigData configData = (TaskLauncherConfig.TreeConfigData) iter.next();
						addTreeConfig(cimClient, configData, treeConfigs);
					}
				}

				this.treeFactories.put(cimomName, new TaskLauncherTreeFactory(cimClient, treeConfigs));
			}
		}
    }

	private void addTreeConfig(CIMClient cimClient, TaskLauncherConfig.TreeConfigData configData, List treeConfigs) {
		if (!useSlp || useSlp && SLPUtil.getTaskIsSupported(slpLoader,cimClient.getNameSpace().getHost(),configData.getSlpServicename()))
		{
			logger.log(Level.INFO, "Creating Treefactory \"" + configData.getName() + "\" from file " + configData.getFilename());
			CustomTreeConfig treeConfig = new CustomTreeConfig(configData);
			if (RuntimeUtil.getInstance().isJSF())
			{
				if (RuntimeUtil.getInstance().isJSF())
				{
					if (treeConfig.isLoaded())
					{
						if (treeConfig.serverTaskExists(cimClient))
						{
							JsfUtil.addMessage(FacesMessage.SEVERITY_INFO,bundle.getString("task.supported", new Object[]{configData.getName(),cimClient.getNameSpace().getHost()}));
						}
						else
						{
							JsfUtil.addMessage(FacesMessage.SEVERITY_ERROR,bundle.getString("task.not.supported.on.server", new Object[]{configData.getName(),cimClient.getNameSpace().getHost()}));
						}
					}
					else
					{
						JsfUtil.addMessage(FacesMessage.SEVERITY_ERROR,bundle.getString("task.not.supported.on.client", new Object[]{configData.getName()}));
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
				JsfUtil.addMessage(FacesMessage.SEVERITY_WARN,bundle.getString("task.not.supported", new Object[]{configData.getName(),cimClient.getNameSpace().getHost()}));
			}
		}
	}
    
    public void createTreeFactoriesMultiHost() throws WbemSmtException
    {
    	if (treeFactories == null)
    	{
    		treeFactories = new HashMap();
    	}
    	treeFactories.clear();
    	Vector cimomData = taskLauncherConfig.getCimomData();
    	CimomData[] data = (CimomData[]) cimomData.toArray(new CimomData[cimomData.size()]);
    	this.treeFactories.put(TaskLauncherController.NAME_FOR_MULTI_CIMOM_TREE,new TaskLauncherTreeFactory(data));
    }
    
	private void loadConfig(String configFilename) throws WbemSmtException {
		this.taskLauncherConfig = new TaskLauncherConfig(configFilename);
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
		cimClients.clear();
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