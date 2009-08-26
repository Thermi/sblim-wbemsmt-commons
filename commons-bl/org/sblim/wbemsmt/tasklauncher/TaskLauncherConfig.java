/**
 *  TaskLauncherConfig.java
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

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.MessageUtil;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.filter.EmbeddedFilter;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.CimomDocument;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TasklauncherconfigDocument;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TreeconfigDocument;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.Version;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.CimomDocument.Cimom;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.ConfigurationDefinitionDocument.ConfigurationDefinition;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.ConfigurationValueDocument.ConfigurationValue;
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

public class TaskLauncherConfig
{
	
	public static final String DEFAULT_HOST = "localhost";

	public static final String DEFAULT_USER = "pegasus";

	public static final String DEFAULT_NAMESPACE = "/root/cimv2";

	public static final String DEFAULT_PROTOCOL = "http";

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

	public static final Enum VERSION_FOR_CREATE = Version.VERSION_2_6;

	private static final Enum[] SUPPORTED_VERSION_TASKLAUNCHER_CONFIGS = new Enum[]{Version.VERSION_2_6};
    private static final String SUPPORTED_VERSION_TASKLAUNCHER_CONFIGS_STRING = ""+Version.VERSION_2_6;

	public static final String HTTP = "http";
	public static final int HTTP_PORT_DEFAULT = 5988;
	
	public static final String HTTPS = "https";
	public static final int HTTPS_PORT_DEFAULT = 5989;

	
    private static Logger logger = Logger.getLogger(TaskLauncherConfig.class.getName());

    private Vector<CimomData> cimomData;
    private Vector<TreeConfigData> treeConfigData;
	private TasklauncherconfigDocument tasklauncherConfigDoc;
	private TasklauncherconfigDocument tasklauncherConfigDocSlp;
	private boolean hasConfiguration;

	private WbemSmtResourceBundle bundle;

	/**
	 * This list contains all the treeConfigs that are taken into account if the config is loaded
	 * 
	 * If the list is empty or null all treeConfigs are used
	 */
	private List<TreeConfigData> treeConfigs = new ArrayList<TreeConfigData>();

	private boolean useSlp = false;

	private SLPLoader slpLoader;
    
	/**
	 * @param configFilename set to null if default behaviour is wanted (configuration-File created by TASKLAUNCHER_CONFIG_XML and getConfigDirectory)
	 * @param treeConfigs List with TreeConfigData-Objects. Can be used to filter all those tasks which are not in the List
	 * @throws WbemsmtException
	 */
    public TaskLauncherConfig(String configFilename, List<TreeConfigData> treeConfigs, boolean useSlp, SLPLoader slpLoader) throws WbemsmtException
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
    	this.cimomData = new Vector<CimomData>();
        this.treeConfigData = new Vector<TreeConfigData>();
	}

    private void readConfig() throws WbemsmtException
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
//	        	throw new WbemsmtException(bundle.getString("no.hosts.in.config.file", new Object[]{configFile.getAbsolutePath()}));
//			}
			
			if (useSlp)
				readConfig(tasklauncherConfigDocSlp);
			else
				readConfig(tasklauncherConfigDoc);
        }
        catch(Exception e)
        {
        	throw new WbemsmtException(WbemsmtException.ERR_FAILED,bundle.getString("cannot.load.config.file", new Object[]{configFile.getAbsolutePath(),e.getMessage()}),e);
        }
    }

	private void checkVersion(File f, Tasklauncherconfig tasklauncherconfig) throws WbemsmtException {
		
	    String versionInConfig = tasklauncherconfig.getDomNode().getAttributes().getNamedItem("version").getNodeValue();
		try {
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
                String msg = "Model-Version " + versionInConfig + " of file " + f.getAbsolutePath() + " is not supported.\nPlease upgrade to Version " + SUPPORTED_VERSION_TASKLAUNCHER_CONFIGS_STRING;
            	throw new WbemsmtException(WbemsmtException.ERR_FAILED, msg);			
            }
        }
        catch (XmlValueOutOfRangeException e) {
            String msg = "Model-Version " + versionInConfig + " of file " + f.getAbsolutePath() + " is not supported.\nPlease upgrade to Version " + SUPPORTED_VERSION_TASKLAUNCHER_CONFIGS_STRING;
            throw new WbemsmtException(WbemsmtException.ERR_FAILED, msg,e);           
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
		    logger.log(Level.INFO, "Cimom data #" + i + " read: " + cimom.getUser() + "@" + cimom.getHostname());
		    this.addCimomData(cimom);
		}
		
		hasConfiguration = cimoms.length > 0;
		if (!hasConfiguration)
		{
			CimomData cimomData = new CimomData("",TaskLauncherConfig.DEFAULT_PORT,DEFAULT_PROTOCOL,"");
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
			for (Iterator<TreeConfigData> iter = treeConfigData.iterator(); iter.hasNext()&& !found;) {
				TreeConfigData treeConfigData = iter.next();
				if (treeConfigData.getName().equals(reference.getName()))
				{
					try {
						cimomData.addTreeConfig((TreeConfigData) treeConfigData.clone(),reference);
						found = true;
					} catch (CloneNotSupportedException e) {
						logger.log(Level.SEVERE,"Cloning of treeconfigData is not supported",e);
					}
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
    
    public Vector<CimomData> getCimomData()
    {
        return this.cimomData;
    }

    private void addTreeConfig(TreeconfigDocument.Treeconfig treeconfig)
    {
        this.treeConfigData.add(new TreeConfigData(treeconfig));
    }
    
    public Vector<TreeConfigData> getTreeConfigDataByHostname(String cimomHostname) throws WbemsmtException
    {
        for (Iterator<CimomData> iter = this.cimomData.iterator(); iter.hasNext();) {
			CimomData cimomData = iter.next();
			
			//Try to resolve the hostname because 
			//If the admin defined in the config-File the host on a per name basis and slp returns the IP-Address, and user wants to read configured tasks with
			//SLP the ipAddress and the hostname is compared and the cimom is not found
			InetAddress address1;
			InetAddress address2;
			try {
                address1 = InetAddress.getByName(cimomData.getHostname());
                try {
                    address2 = InetAddress.getByName(cimomHostname);
                    if (address1.getHostAddress().equals(address2.getHostAddress()))
                    {
                        return cimomData.getTreeConfigs();
                    }
                } catch (UnknownHostException e) {
                    WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages"});
                    throw new WbemsmtException(WbemsmtException.ERR_NOT_CONNECTED, bundle.getString("unknown.host",new Object[]{cimomHostname}),e);
                }
            }
            catch (UnknownHostException e1) {
                //Try at least to compare the hostnames
                logger.log(Level.SEVERE,"Cannot lookup host " + cimomData.getHostname());
                if (cimomData.getHostname().equals(cimomHostname))
                {
                    return cimomData.getTreeConfigs();
                }
            }
		}
        return new Vector<TreeConfigData>();
    }
    
    /**
     * Returns the CimomDataObject of the given hostname
     * @param hostname
     * @return null if no CimomDataObjects was found
     */
    public CimomData getCimomDataDataByHostname(String hostname)
    {
        for (Iterator<CimomData> iter = this.cimomData.iterator(); iter.hasNext();) {
			CimomData cimomData = iter.next();
			
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
    	for (Iterator<TreeConfigData> iter = treeConfigData.iterator(); iter.hasNext();) {
			TreeConfigData configData = iter.next();
			if (configData.getName().equals(taskname))
			{
				return configData;
			}
		}
    
    	return null;
    }
    
    
	public Vector<TreeConfigData> getTreeConfigData() {
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
    public static class TreeConfigData implements Cloneable
    {
        private String name;
        private String filename;
		private String slpServicename;
		private String[] bundles;
		private String lookupClass;
		private String embeddedFilterClass;
		private final String welcomeListenerClass;
        private final Map<String, ConfigurationValueData> configMap = new HashMap<String, ConfigurationValueData>();
		private String namespace;
		
		
        public TreeConfigData(String name, String filename, String slpServicename, String bundle, String lookupClass, String embeddedFilterClass, String welcomeListenerClass, String namespace)
        {
            this.name = name;
            this.filename = filename;
			this.slpServicename = slpServicename;
			this.bundles = new String[]{bundle};
			this.lookupClass = lookupClass;
			this.embeddedFilterClass = embeddedFilterClass;
			this.welcomeListenerClass = welcomeListenerClass;
            this.namespace = namespace;
        }
        
        public TreeConfigData(TreeconfigDocument.Treeconfig treeconfig)
        {
            this.name = treeconfig.getName();
            this.filename = treeconfig.getFilename();
            this.slpServicename = treeconfig.getSlpServicename();
            this.lookupClass = treeconfig.getClassForServerTaskLookup();
            this.embeddedFilterClass = treeconfig.getEmbeddedFilter();
            this.welcomeListenerClass = treeconfig.getWelcomeListener();
            this.namespace = treeconfig.getNamespace();
            
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

            ConfigurationDefinition[] definitions = treeconfig.getConfigurationDefinitionArray();
            for (int i = 0; i < definitions.length; i++) {
				ConfigurationDefinition definition = definitions[i];
				configMap.put(definition.getName(), new ConfigurationValueData(definition.getName(),definition.getDefaultValue()));
			}
            
        }
        
        /**
         * Cloning Constructor
         * @param data
         */
        private TreeConfigData(TreeConfigData data) {
            this.name = data.getName();
            this.filename = data.getFilename();
			this.slpServicename = data.getSlpServicename();
			this.bundles = (String[]) ArrayUtils.clone(data.getBundles());
			this.lookupClass = data.getLookupClass();
			this.embeddedFilterClass = data.getEmbeddedFilterClass();
			this.welcomeListenerClass = data.getWelcomeListenerClass();
            this.namespace = data.getNamespace();
            this.configMap.putAll(data.getConfigurationMap()); 
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

		public String getNamespace() {
			return namespace;
		}
		
		

		public void setNamespace(String namespace) {
			this.namespace = namespace;
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
		 * return the Map with all the configuration values as a copy
		 * 
		 * key: The key as string
		 * value: ConfigurationValueData object
		 * 
		 * @return
		 * @see ConfigurationValueData
		 */
		public Map<String, ConfigurationValueData> getConfigurationMap()
		{
			Map<String, ConfigurationValueData> result = new HashMap<String, ConfigurationValueData>();
			Iterator<Map.Entry<String, ConfigurationValueData>> iterator = configMap.entrySet().iterator();
			while (iterator.hasNext())
			{
				Map.Entry<String, ConfigurationValueData> entry = iterator.next();
				ConfigurationValueData value = (ConfigurationValueData) entry.getValue();
				value = new ConfigurationValueData(value.getName(),value.getValue());
				result.put(entry.getKey(),value);
			}
			result.putAll(configMap);
			return result;
		}

		protected Object clone() throws CloneNotSupportedException {
			TreeConfigData clone = new TreeConfigData(this);
			return clone;
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
                       protocol,
                       user, password;
        private int port;
		private Vector<TreeConfigData> treeConfigs = new Vector<TreeConfigData>();
		
        public CimomData()
        {
            this.hostname = new String();
            this.protocol = TaskLauncherConfig.DEFAULT_PROTOCOL;
            this.user = new String();
        }
        
		public CimomData(String hostname, int port, String protocol, String user)
        {
            this.hostname = hostname;
            this.port = port;
            this.protocol = StringUtils.isNotEmpty(protocol) ? protocol : DEFAULT_PROTOCOL;
            this.user = user;
        }
        
		public CimomData(String hostname, int port, String protocol, String user, String password)
        {
            this.hostname = hostname;
            this.port = port;
            this.protocol = StringUtils.isNotEmpty(protocol) ? protocol : DEFAULT_PROTOCOL;
            this.user = user;
            this.password = password;
        }

		public CimomData(CimomDocument.Cimom cimom)
        {
            this(cimom.getHostname(), cimom.getPort(), cimom.getProtocol(), cimom.getUser());
        }

        public CimomData(SLPHostDefinition definition) {
            this.hostname = definition.getHostname();
            this.port = definition.getPort();
            this.protocol = TaskLauncherConfig.DEFAULT_PROTOCOL;
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
				treeConfigData.setNamespace(reference.getNamespace());
				
				ConfigurationValue[] values = reference.getConfigurationValueArray();
				for (int i = 0; i < values.length; i++) {
					treeConfigData.overwriteConfigValue(values[i]);	
				}
			}
			
		}
		
        public Vector<TreeConfigData> getTreeConfigs() {
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

        
		public String getProtocol() {
			return protocol;
		}

		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getUser()
        {
            return user;
        }

        public void setUser(String user)
        {
            this.user = user;
        }

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getInfo() {
			return protocol + "://" + hostname + ":" + port;
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

		public void setTreeConfigs(Vector<TreeConfigData> configs) {
			this.treeConfigs = configs;
		}
    }
    
    /**
     * A DTO to hold the configuration Entries
     */
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

	public String getConfigFile() throws WbemsmtException {
		
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

	private void createTasklauncherConfig(File f) throws WbemsmtException {
		
		TasklauncherconfigDocument document = TasklauncherconfigDocument.Factory.newInstance();
		Tasklauncherconfig tasklauncherconfig = document.addNewTasklauncherconfig();
		tasklauncherconfig.setVersion(VERSION_FOR_CREATE);
		Cimom cimom = tasklauncherconfig.addNewCimom();
		cimom.setHostname(TaskLauncherConfig.DEFAULT_HOST);
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
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Error occured while loading config-data. Cannot save default config " + f,e);
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
		List<Treeconfig> configs = new ArrayList<Treeconfig>();
		for (int i = 0; i < files.length; i++) {
			try {
				taskXML = files[i];
				Tasklauncherconfig tasklauncherconfigToAdd = TasklauncherconfigDocument.Factory.parse(taskXML).getTasklauncherconfig();
				//Throws Exception if version is wrong
				checkVersion(taskXML, tasklauncherconfigToAdd);
				configs.add(tasklauncherconfigToAdd.getTreeconfigArray(0));
			} catch (Exception e) {
				ExceptionUtil.handleException(e);
			}
		}
		Treeconfig[] treeconfigs = (Treeconfig[]) configs.toArray(new Treeconfig[configs.size()]);

		//for SLP get all the Tasks that are supported via SLP
		if (useSlp)
		{
			treeConfigs = new ArrayList<TreeConfigData>();
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
						for (Iterator<TreeConfigData> iter = treeConfigs.iterator(); !add && iter.hasNext();) {
							TreeConfigData treeConfigData = iter.next();
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
				MessageUtil.addMessage(ErrCodes.MSGDEF_TASKSLAUNCHER_D_NOT_FOUND, null, new String[]{"messages"}, new Object[]{getConfigDirectory() + TASKS_DIR});
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
				MessageUtil.addMessage(ErrCodes.MSGDEF_NO_TASKS_FOUND, null, new String[]{"messages"}, new Object[]{getConfigDirectory() + TASKS_DIR});
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

	
}