/**
 *  TaskLauncherConfig.java
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

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.adapter.MessageUtil;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.filter.EmbeddedFilter;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.CimomDocument;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TasklauncherconfigDocument;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TreeconfigDocument;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.Version;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.CimomDocument.Cimom;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.ConfigurationDefinitionDocument.ConfigurationDefinition;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.ConfigurationValueDocument.ConfigurationValue;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.FcoPackageDocument.FcoPackage;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.ResourceBundleDocument.ResourceBundle;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TasklauncherconfigDocument.Tasklauncherconfig;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TreeconfigDocument.Treeconfig;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TreeconfigReferenceDocument.TreeconfigReference;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.Version.Enum;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.tools.slp.SLPHostDefinition;
import org.sblim.wbemsmt.tools.slp.SLPLoader;
import org.sblim.wbemsmt.tools.slp.SLPUtil;

// class to separate the config information from the xml layer...  this class could use a database aswell
public class TaskLauncherConfig
{
	
	public static final String DEFAULT_HOST = "localhost";

	public static final String DEFAULT_USER = "pegasus";

	public static final String DEFAULT_NAMESPACE = "/root/cimv2";

	private static final String DEFAULT_CONF_DIR = "/etc/sblim-wbemsmt";
	
	/**
	 * directory with the tasks-xmls
	 */
	private static final String TASKS_DIR = "/tasklauncher.d/";

	private static final String TASKLAUNCHER_CONFIG_XML = "tasklauncher-config.xml";

	/**
	 * overwrites the configuration-File created by TASKLAUNCHER_CONFIG_XML and getConfigDirectory
	 */
	private String configFilename = null;
	
	public final static int DEFAULT_PORT = 5988;

	private static final Enum[] SUPPORTED_VERSION_TASKLAUNCHER_CONFIGS = new Enum[]{Version.VERSION_2_0,Version.VERSION_2_1,Version.VERSION_2_2,Version.VERSION_2_3};
	
    private static Logger logger = Logger.getLogger(TaskLauncherConfig.class.getName());

    private Vector cimomData;
    private Vector treeConfigData;
	private TasklauncherconfigDocument tasklauncherConfigDoc;
	private TasklauncherconfigDocument tasklauncherConfigDocSlp;
	private boolean hasConfiguration;

	private WbemSmtResourceBundle bundle;

	/**
	 * This list contains all the treeConfigs that are taken into account if the config is loaded
	 * 
	 * If the list is empty or null all treeConfigs are used
	 */
	private List treeConfigs = new ArrayList();

	private boolean useSlp = false;

	private SLPLoader slpLoader;
    
	/**
	 * @param configFilename set to null if default behaviour is wanted (configuration-File created by TASKLAUNCHER_CONFIG_XML and getConfigDirectory)
	 * @param treeConfigs List with TreeConfigData-Objects. Can be used to filter all those tasks which are not in the List
	 * @throws WbemSmtException
	 */
    public TaskLauncherConfig(String configFilename, List treeConfigs, boolean useSlp, SLPLoader slpLoader) throws WbemSmtException
    {
    	this.configFilename = configFilename;
		this.treeConfigs = treeConfigs;
		this.useSlp = useSlp;
		this.slpLoader = slpLoader;
    	init();
        this.readConfig(); 
    }    
    
	private void init() {
		bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages"});
    	this.cimomData = new Vector();
        this.treeConfigData = new Vector();
	}

    private void readConfig() throws WbemSmtException
    {
        this.emptyCimomData();
        
        File configFile = new File(getConfigFile());
        try
        {
        	//The config doc
			tasklauncherConfigDoc = TasklauncherconfigDocument.Factory.parse(configFile);
			
			checkVersion(configFile,tasklauncherConfigDoc.getTasklauncherconfig());
			
			addTasks(tasklauncherConfigDoc.getTasklauncherconfig());
			
			//if no cimoms were found
//			if (tasklauncherConfigDoc.getTasklauncherconfig().getCimomArray().length == 0)
//			{
//	        	throw new WbemSmtException(bundle.getString("no.hosts.in.config.file", new Object[]{configFile.getAbsolutePath()}));
//			}
			
			if (useSlp)
				readConfig(tasklauncherConfigDocSlp);
			else
				readConfig(tasklauncherConfigDoc);
        }
        catch(Exception e)
        {
        	logger.log(Level.SEVERE, "Error while loading config file.", e);
        	throw new WbemSmtException(bundle.getString("cannot.load.config.file", new Object[]{configFile.getAbsolutePath()}),e);
        }
    }

	private void checkVersion(File f, Tasklauncherconfig tasklauncherconfig) throws WbemSmtException {
		
		
		boolean found = false;
		
		for (int i = 0; i < SUPPORTED_VERSION_TASKLAUNCHER_CONFIGS.length; i++) {
			Object version = SUPPORTED_VERSION_TASKLAUNCHER_CONFIGS[i];
			if (tasklauncherconfig.getVersion() != null && tasklauncherconfig.getVersion().equals(version))
			{
				found = true;
			}
		}
		if (!found)
		{
			String msg = "Model-Version " + tasklauncherconfig.getVersion() + " of file " + f.getAbsolutePath() + " is not supported.\nPlease upgrade to Version " + SUPPORTED_VERSION_TASKLAUNCHER_CONFIGS;
			throw new WbemSmtException(msg);			
		}
	}

	private void readConfig(TasklauncherconfigDocument tasklauncherConfig) {

		clearConfig();

		//read the the trees always from the file in the server
		Treeconfig[] treeconfigs = tasklauncherConfig.getTasklauncherconfig().getTreeconfigArray();
		for (int j = 0; j < treeconfigs.length; j++) {
			TreeconfigDocument.Treeconfig treeconfig = treeconfigs[j];
			this.addTreeConfig(treeconfig);
		}

		Cimom[] cimoms = tasklauncherConfig.getTasklauncherconfig().getCimomArray();
		int i=0;
		for (int j = 0; j < cimoms.length; j++) {
			CimomDocument.Cimom cimom = cimoms[j];
		    i++;
		    logger.log(Level.INFO, "Cimom data #" + i + " read: " + cimom.getUser() + "@" + cimom.getHostname() + cimom.getNamespace());
		    this.addCimomData(cimom);
		}
		
		hasConfiguration = cimoms.length > 0;
		if (!hasConfiguration)
		{
			CimomData cimomData = new CimomData("",TaskLauncherConfig.DEFAULT_PORT,DEFAULT_NAMESPACE,DEFAULT_NAMESPACE,"");
			//cimomData.addTreeConfig(new TreeConfigData("noConfig","noConfig.xml","","messages",null,null,null));
			this.cimomData.add(cimomData);
		}
	}

	private void clearConfig() {
		treeConfigData.clear();
		cimomData.clear();
	}
    
	/**
	 * reloads the configuration
	 */
    public void reload(String runtimeMode)
    {
    	readConfig(tasklauncherConfigDoc);
    }
    

	private void emptyCimomData()
    {
        this.cimomData.clear();
    }
    
    private void addCimomData(CimomDocument.Cimom cimom)
    {
        CimomData cimomData = new CimomData(cimom);
        
        //add the TreeConfigs to all CimomData-Objects according to the defined TreeConfigReferences
        TreeconfigReference[] treeconfigReferenceArray = cimom.getTreeconfigReferenceArray();
        for (int i = 0; i < treeconfigReferenceArray.length; i++) {
			TreeconfigReference reference = treeconfigReferenceArray[i];
			boolean found = false;
			for (Iterator iter = treeConfigData.iterator(); iter.hasNext()&& !found;) {
				TreeConfigData treeConfigData = (TreeConfigData) iter.next();
				if (treeConfigData.getName().equals(reference.getName()))
				{
					cimomData.addTreeConfig(treeConfigData,reference);
					found = true;
				}
			}
			if (!found)
			{
				logger.severe("TreeConfig with name " + reference.getName() + " defined in CIMOM " + cimom.getHostname() + " was not found");
			}
			else
			{
				logger.info("TreeConfig " + reference.getName() + " added to CIMOM " + cimom.getHostname());
			}
		}
        
        if (cimomData.getTreeConfigs().size() == 0)
        {
        	//cimomData.addTreeConfig(new TreeConfigData("No Configuration found","noConfig.xml","noConfig","messages",null,null,null));
        }
        
		this.cimomData.add(cimomData);
    }
    
    public Vector getCimomData()
    {
        return this.cimomData;
    }

    private void addTreeConfig(TreeconfigDocument.Treeconfig treeconfig)
    {
        this.treeConfigData.add(new TreeConfigData(treeconfig));
    }
    
    public Vector getTreeConfigDataByHostname(String cimomHostname)
    {
        for (Iterator iter = this.cimomData.iterator(); iter.hasNext();) {
			CimomData cimomData = (CimomData) iter.next();
			
			//Try to resolve the hostname because 
			//If the admin defined in the config-File the host on a per name basis and slp returns the IP-Address, and user wants to read configured tasks with
			//SLP the ipAddress and the hostname is compared and the cimom is not found
			try {
				InetAddress address1 = InetAddress.getByName(cimomData.getHostname());
				InetAddress address2 = InetAddress.getByName(cimomHostname);
				
				if (address1.getHostAddress().equals(address2.getHostAddress()))
				{
					return cimomData.getTreeConfigs();
				}
			} catch (UnknownHostException e) {
				//Try at least to compare the hostnames
				logger.log(Level.SEVERE,"Cannot lookup host " + cimomData.getHostname());
				if (cimomData.getHostname().equals(cimomHostname))
				{
					return cimomData.getTreeConfigs();
				}
			}
		}
        return new Vector();
    }
    
    /**
     * Returns the CimomDataObject of the given hostname
     * @param hostname
     * @return null if no CimomDataObjects was found
     */
    public CimomData getCimomDataDataByHostname(String hostname)
    {
        for (Iterator iter = this.cimomData.iterator(); iter.hasNext();) {
			CimomData cimomData = (CimomData) iter.next();
			
			//Try to resolve the hostname because 
			//If the admin defined in the config-File the host on a per name basis and slp returns the IP-Address, and user wants to read configured tasks with
			//SLP the ipAddress and the hostname is compared and the cimom is not found
			try {
				InetAddress address1 = InetAddress.getByName(cimomData.getHostname());
				InetAddress address2 = InetAddress.getByName(hostname);
				
				if (address1.getHostAddress().equals(address2.getHostAddress()))
				{
					return cimomData;
				}
			} catch (UnknownHostException e) {
				//Try at least to compare the hostnames
				logger.log(Level.SEVERE,"Cannot lookup host " + cimomData.getHostname());
				if (cimomData.getHostname().equals(hostname))
				{
					return cimomData;
				}
			}
		}
        return null;
    }

    
    public TreeConfigData getTreeConfigDataByTaskname(String taskname)
    {
    	for (Iterator iter = treeConfigData.iterator(); iter.hasNext();) {
			TreeConfigData configData = (TreeConfigData) iter.next();
			if (configData.getName().equals(taskname))
			{
				return configData;
			}
		}
    
    	return null;
    }
    
    
	public Vector getTreeConfigData() {
		return treeConfigData;
	}

	public Treeconfig[] getTreeconfig() {
		if (useSlp)
		{
			return tasklauncherConfigDocSlp.getTasklauncherconfig().getTreeconfigArray();
		}
		else
		{
			return tasklauncherConfigDoc.getTasklauncherconfig().getTreeconfigArray();
		}
	}

	// just a DTO
    public static class TreeConfigData
    {
        private String name;
        private String filename;
		private String slpServicename;
		private String[] bundles;
		private String lookupClass;
		private String embeddedFilterClass;
		private final String welcomeListenerClass;
        private final Map configMap = new HashMap();
		
		
        public TreeConfigData(String name, String filename, String slpServicename, String bundle, String lookupClass, String embeddedFilterClass, String welcomeListenerClass)
        {
            this.name = name;
            this.filename = filename;
			this.slpServicename = slpServicename;
			this.lookupClass = lookupClass;
			this.embeddedFilterClass = embeddedFilterClass;
			this.welcomeListenerClass = welcomeListenerClass;
			this.bundles = new String[]{bundle};
        }
        
        public TreeConfigData(TreeconfigDocument.Treeconfig treeconfig)
        {
            this.name = treeconfig.getName();
            this.filename = treeconfig.getFilename();
            this.slpServicename = treeconfig.getSlpServicename();
            this.lookupClass = treeconfig.getClassForServerTaskLookup();
            this.embeddedFilterClass = treeconfig.getEmbeddedFilter();
            this.welcomeListenerClass = treeconfig.getWelcomeListener();
            
            ResourceBundle[] resourceBundleArray = treeconfig.getResourceBundleArray();
            this.bundles = new String[resourceBundleArray.length];
            for (int i = 0; i < resourceBundleArray.length; i++) {
				ResourceBundle bundle = resourceBundleArray[i];
				String bundleName = bundle.getName();
				this.bundles[i] = bundleName;
			}
			logger.fine("Adding bundles " + bundles + " for " + name + " to localeManager");
			if (RuntimeUtil.getInstance().isJSF())
			{
				ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance()); 
				localeManager.addResourceBundleEntry(name,bundles);
			}
			else
			{
				throw new RuntimeException(RuntimeUtil.getInstance().getRuntime() + " is not supported");
			}

			FcoPackage[] packages = treeconfig.getFcoPackageArray();
            for (int i = 0; i < packages.length; i++) {
				FcoPackage pkg = packages[i];
				if (RuntimeUtil.getInstance().isJSF())
				{
					ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance()); 
					localeManager.addFcoPackage(name,pkg.getName());
				}
				else
				{
					throw new RuntimeException(RuntimeUtil.getInstance().getRuntime() + " is not supported");
				}
			}
            
            ConfigurationDefinition[] definitions = treeconfig.getConfigurationDefinitionArray();
            for (int i = 0; i < definitions.length; i++) {
				ConfigurationDefinition definition = definitions[i];
				configMap.put(definition.getName(), new ConfigurationValueData(definition.getName(),definition.getDefaultValue()));
			}
            
        }
        
        public String getName()
        {
            return this.name;
        }
        
        public String getFilename()
        {
            return this.filename;
        }

		public String getSlpServicename() {
			return slpServicename;
		}

		public String[] getBundles() {
			return bundles;
		}

		public String getLookupClass() {
			return lookupClass;
		}

		public String getEmbeddedFilterClass() {
			return embeddedFilterClass;
		}
		
		public String getWelcomeListenerClass() {
			return welcomeListenerClass;
		}

		/**
		 * Returns the Filter to filter the model iin embedded mode
		 * @return null if no filter was specified or the creation of the filter failed 
		 */
		public EmbeddedFilter getEmbeddedFilter() {
			try {
				return (EmbeddedFilter) Class.forName(embeddedFilterClass).newInstance();
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Cannot create embeddedFilter for class " + embeddedFilterClass, e);
				return null;
			}
		}

		/**
		 * overwrite the value of the given configuration with the value of the value object
		 * 
		 * The initial value is set by using the default value of the configuration entry
		 * 
		 * @param value
		 */
		public void overwriteConfigValue(ConfigurationValue value) {
			ConfigurationValueData configurationValue = getConfigurationValue(value.getName());
			if (configurationValue != null)
			{
				configurationValue.setValue(value.getValue());
			}
			else
			{
				logger.warning("The configurationValue " + value.getName() + " was not found in definition for task " + name);
			}
		}
		
		/**
		 * Returns the configured configuration value
		 * @param key
		 * @return
		 */
		public ConfigurationValueData getConfigurationValue(String key)
		{
			return (ConfigurationValueData) configMap.get(key);
		}
		
		/**
		 * return the Map with all the configuration values
		 * 
		 * key: The key as string
		 * value: ConfigurationValueData object
		 * 
		 * @return
		 * @see ConfigurationValueData
		 */
		public Map getConfigurationMap()
		{
			Map result = new HashMap();
			result.putAll(configMap);
			return result;
		}
		
		
    }
    
    // just a DTO
    public static class CimomData implements Serializable
    {
        /**
		 * 
		 */
		private static final long serialVersionUID = -7105076857317689934L;
		private String hostname,
                       namespace,
                       applicationNamespace,
                       user;
        private int port;
		private Vector treeConfigs = new Vector();
		
        public CimomData()
        {
            this.hostname = new String();
            this.namespace = new String();
            this.applicationNamespace = new String();
            this.user = new String();
        }
        
		public CimomData(String hostname, int port, String namespace, String applicationNamespace, String user)
        {
            this.hostname = hostname;
            this.port = port;
            this.namespace = namespace;
            this.applicationNamespace = applicationNamespace;
            this.user = user;
        }
        
        public CimomData(CimomDocument.Cimom cimom)
        {
            this(cimom.getHostname(), cimom.getPort(), cimom.getNamespace(), cimom.getApplicationNamespace(), cimom.getUser());
        }

        public CimomData(SLPHostDefinition definition) {
            this.hostname = definition.getHostname();
            this.port = definition.getPort();
            this.namespace = definition.getNamespace();
            this.applicationNamespace = TaskLauncherConfig.DEFAULT_NAMESPACE;
            this.user = TaskLauncherConfig.DEFAULT_USER;
		}

        /**
         * Add the treeconfig to the treeconfigs of the configuration
         * If the reference is not null all the configValues of the reference are overwritting the 
         * current configValues of the TreeConfigData
         * 
         *  
         * @param treeConfigData
         * @param reference
         */
		public void addTreeConfig(TreeConfigData treeConfigData, TreeconfigReference reference) {
			treeConfigs.add(treeConfigData);

			if (reference != null)
			{
				ConfigurationValue[] values = reference.getConfigurationValueArray();
				for (int i = 0; i < values.length; i++) {
					treeConfigData.overwriteConfigValue(values[i]);	
				}
			}
			
		}
		
        public Vector getTreeConfigs() {
			return treeConfigs;
		}

        public String getHostname()
        {
            return hostname;
        }

        public void setHostname(String hostname)
        {
            this.hostname = hostname;
        }

        public String getNamespace()
        {
            return namespace;
        }

        public void setNamespace(String namespace)
        {
            this.namespace = namespace;
        }

        public String getApplicationNamespace() {
			return applicationNamespace;
		}

		public void setApplicationNamespace(String applicationNamespace) {
			this.applicationNamespace = applicationNamespace;
		}

		public String getUser()
        {
            return user;
        }

        public void setUser(String user)
        {
            this.user = user;
        }

		public String getInfo() {
			return hostname + ":" + port + namespace;
		}

		/**
		 * Dummy method to fullfil the JSF Managed Bean Conventions
		 */
		public void setInfo(String info)
		{}
		
		public int getPort() {
			return port;
		}
		
		public void setPort(int port)
		{
			this.port = port;
		}

		public void setTreeConfigs(Vector configs) {
			this.treeConfigs = configs;
		}
    }
    
    public static class ConfigurationValueData
    {
    	private String name;
    	private String value;
		
    	public ConfigurationValueData(String name, String value) {
			super();
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
    	
    	
    }

	public boolean getHasConfiguration() {
		return hasConfiguration;
	}

	public String getConfigFile() throws ModelLoadException {
		
		String filename = getUsedConfigFilename();
		File f = new File(filename);
		if (!f.exists() || f.length() == 0)
		{
			//Okay we create one;
			createTasklauncherConfig(f);
			String msg = "File " + f.getAbsolutePath() + " was not found or was empty. Default file is created";
			Logger.getLogger("org.sblim.wbemsmt.tasklauncher").warning(msg);
		}

		logger.info("Reading tasklauncher-config from " + new File(filename).getAbsolutePath());
		
		return filename;
	}

	private String getUsedConfigFilename() {
		String filename = null;
		if (configFilename != null)
		{
			filename = configFilename;
		}
		else
		{
			String dir = getConfigDirectory();
			filename = dir + "/" + TaskLauncherConfig.TASKLAUNCHER_CONFIG_XML;
		}
		return filename;
	}

	private void createTasklauncherConfig(File f) throws ModelLoadException {
		
		TasklauncherconfigDocument document = TasklauncherconfigDocument.Factory.newInstance();
		Tasklauncherconfig tasklauncherconfig = document.addNewTasklauncherconfig();
		tasklauncherconfig.setVersion(Version.VERSION_2_1);
		Cimom cimom = tasklauncherconfig.addNewCimom();
		cimom.setHostname(TaskLauncherConfig.DEFAULT_HOST);
		cimom.setNamespace(TaskLauncherConfig.DEFAULT_NAMESPACE);
		cimom.setPort(TaskLauncherConfig.DEFAULT_PORT);
		cimom.setUser(TaskLauncherConfig.DEFAULT_USER);
		
		useSlp = false;
		addTasks(tasklauncherconfig);
		
		//for each task add a tree-reference
		Treeconfig[] treeconfigArray = tasklauncherconfig.getTreeconfigArray();
		for (int i = 0; i < treeconfigArray.length; i++) {
			TreeconfigReference reference = cimom.addNewTreeconfigReference();
			reference.setName(treeconfigArray[i].getName());
			//remove the TreeConfig
			tasklauncherconfig.removeTreeconfig(0);
		}
		
		//save document
		try {
			if (!f.getParentFile().exists())
			{
				logger.info("The directory " + f.getParentFile() + " not exists. creating it.");
				f.getParentFile().mkdirs();
			}
			document.save(f);
		} catch (IOException e) {
			throw new ModelLoadException("Error occured while loading config-data. Cannot save default config " + f,e);
		}
	}

	/**
	 * Reads all files, checks if they are wanted and adds them to the tasklauncherconfig
	 * @param tasklauncherconfig
	 */
	private void addTasks(Tasklauncherconfig tasklauncherconfig) {

		//read in the treeconfigs from the separate files
		File taskXML = null;
		File[] files = getTaskXMLs();
		List configs = new ArrayList();
		for (int i = 0; i < files.length; i++) {
			try {
				taskXML = files[i];
				Tasklauncherconfig tasklauncherconfigToAdd = TasklauncherconfigDocument.Factory.parse(taskXML).getTasklauncherconfig();
				//Throws Exception if version is wrong
				checkVersion(taskXML, tasklauncherconfigToAdd);
				configs.add(tasklauncherconfigToAdd.getTreeconfigArray(0));
			} catch (Exception e) {
				logger.log(Level.SEVERE,"Cannot load xml-Taskfile " + taskXML,e);
			}
		}
		Treeconfig[] treeconfigs = (Treeconfig[]) configs.toArray(new Treeconfig[configs.size()]);

		//for SLP get all the Tasks that are supported via SLP
		if (useSlp)
		{
			treeConfigs = new ArrayList();
			tasklauncherConfigDocSlp = SLPUtil.readFromSlp(slpLoader, treeconfigs);
		}
		else
		{
			for (int i = 0; i < treeconfigs.length; i++) {
				try {
					Treeconfig treeConfigToAdd = treeconfigs[i];
					
					//check if the task is wanted
					boolean add = true;
					if (treeConfigs != null && treeConfigs.size() > 0)
					{
						add = false;
						for (Iterator iter = treeConfigs.iterator(); !add && iter.hasNext();) {
							TreeConfigData treeConfigData = (TreeConfigData) iter.next();
							if (treeConfigData.getName().equals(treeConfigToAdd.getName()))
							{
								add = true;
							}
						}
					}
					if (add)
					{
						Treeconfig treeconfig = tasklauncherconfig.addNewTreeconfig();
						treeconfig.set(treeConfigToAdd.copy());
					}
					else
					{
						logger.log(Level.INFO,"Treeconfig " + treeConfigToAdd.getName() + " was not added because the TreeConfig was not in the include list");
					}
				} catch (Exception e) {
					logger.log(Level.SEVERE,"Cannot load xml-Taskfile " + taskXML,e); 
				}
			}
		}
	}

	public File[] getTaskXMLs() {
		File tasksDir = new File(getConfigDirectory() + TASKS_DIR);
		
		if (!tasksDir.exists())
		{
			try {
				throw new FileNotFoundException(tasksDir.getAbsolutePath());
			} catch (FileNotFoundException e) {
				logger.log(Level.SEVERE, "Cannot find taskdirectory", e);
				MessageUtil.addMessage(ErrCodes.MSGDEF_TASKSLAUNCHER_D_NOT_FOUND, new String[]{"messages"}, new Object[]{getConfigDirectory() + TASKS_DIR});
			}
			return new File[]{};
		}
		else
		{
			File[] files = tasksDir.listFiles(new FilenameFilter()
			{
				
				public boolean accept(File dir, String name) {
					return name.endsWith(".xml");
				}
			});
			if (files == null)
			{
				files = new File[]{};
			}
			if (files.length == 0)
			{
				MessageUtil.addMessage(ErrCodes.MSGDEF_NO_TASKS_FOUND, new String[]{"messages"}, new Object[]{getConfigDirectory() + TASKS_DIR});
			}
			
			return files;
		}
		
	}

	private String getConfigDirectory() {
		if (configFilename == null)
		{
			return System.getProperty("wbemsmt.config.dir",TaskLauncherConfig.DEFAULT_CONF_DIR);
		}
		else
		{
			return new File(configFilename).getParentFile().getAbsolutePath();			
		}
	}

	public TasklauncherconfigDocument getTasklauncherConfigDoc() {
		return tasklauncherConfigDoc;
	}

	public static CimomData getDefaultCimomData(CIMClient cimClient) {
		return new CimomData(cimClient.getNameSpace().getHost(), cimClient
				.getNameSpace().getPort(), cimClient.getNameSpace()
				.getNameSpace(), cimClient.getNameSpace().getNameSpace(),
				cimClient.getSessionProperties().getDefaultPrincipal());
	}

	
	
}