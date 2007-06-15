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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.filter.EmbeddedFilter;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.CimomDocument;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TasklauncherconfigDocument;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.TreeconfigDocument;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.Version;
import org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.CimomDocument.Cimom;
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

	private static final Enum[] SUPPORTED_VERSION_TASKLAUNCHER_CONFIGS = new Enum[]{Version.VERSION_2_0,Version.VERSION_2_1};
	
    private static Logger logger = Logger.getLogger(TaskLauncherConfig.class.getName());

    private Vector cimomData;
    private Vector treeConfigData;
	private TasklauncherconfigDocument tasklauncherConfigDoc;
	private boolean hasConfiguration;

	private WbemSmtResourceBundle bundle;

	/**
	 * This list contains all the treeConfigs that are taken into account if the config is loaded
	 * 
	 * If the list is empty or null all treeConfigs are used
	 */
	private List treeConfigs = new ArrayList();
    

	/**
	 * @param configFilename set to null if default behaviour is wanted (configuration-File created by TASKLAUNCHER_CONFIG_XML and getConfigDirectory)
	 * @throws WbemSmtException
	 */
    public TaskLauncherConfig(String configFilename) throws WbemSmtException
    {
    	this(configFilename,null);
    }

	/**
	 * @param configFilename set to null if default behaviour is wanted (configuration-File created by TASKLAUNCHER_CONFIG_XML and getConfigDirectory)
	 * @param treeConfigs List with TreeConfigData-Objects. Can be used to filter all those tasks which are not in the List
	 * @throws WbemSmtException
	 */
    public TaskLauncherConfig(String configFilename, List treeConfigs) throws WbemSmtException
    {
    	this.configFilename = configFilename;
		this.treeConfigs = treeConfigs;
    	init();
        this.readConfig();
    }    
    
    public TaskLauncherConfig(TasklauncherconfigDocument tasklauncherConfig) throws WbemSmtException
    {
    	init();
    	tasklauncherConfigDoc = tasklauncherConfig;
        this.readConfig(tasklauncherConfig);
        
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
			
        	readConfig(tasklauncherConfigDoc);
        }
        catch(Exception e)
        {
        	logger.log(Level.SEVERE, "Error while loading config file.", e);
        	throw new WbemSmtException(bundle.getString("cannot.load.config.file", new Object[]{configFile.getAbsolutePath()}));
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
			CimomData cimomData = new CimomData("",TaskLauncherConfig.DEFAULT_PORT,"","");
			cimomData.addTreeConfig(new TreeConfigData("noConfig","noConfig.xml","","messages",null,null,null));
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
					cimomData.addTreeConfig(treeConfigData);
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
        	cimomData.addTreeConfig(new TreeConfigData("No Configuration found","noConfig.xml","noConfig","messages",null,null,null));
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
                       user;
        private int port;
		private Vector treeConfigs = new Vector();
        
        public CimomData()
        {
            this.hostname = new String();
            this.namespace = new String();
            this.user = new String();
        }
        
		public CimomData(String hostname, int port, String namespace, String user)
        {
            this.hostname = hostname;
            this.port = port;
            this.namespace = namespace;
            this.user = user;
        }
        
        public CimomData(CimomDocument.Cimom cimom)
        {
            this(cimom.getHostname(), cimom.getPort(), cimom.getNamespace(), cimom.getUser());
        }

        public void addTreeConfig(TreeConfigData treeConfigData) {
        	treeConfigs.add(treeConfigData);
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
		File taskXML = null;
			File[] files = getTaskXMLs();
			for (int i = 0; i < files.length; i++) {
				try {
					taskXML = files[i];
					Tasklauncherconfig tasklauncherconfigToAdd = TasklauncherconfigDocument.Factory.parse(taskXML).getTasklauncherconfig();
					//Throws Exception if version is wrong
					checkVersion(taskXML, tasklauncherconfigToAdd);
					Treeconfig treeConfigToAdd = tasklauncherconfigToAdd.getTreeconfigArray(0);
					
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

	public File[] getTaskXMLs() {
		File tasksDir = new File(getConfigDirectory() + TASKS_DIR);
		
		if (!tasksDir.exists())
		{
			try {
				throw new FileNotFoundException(tasksDir.getAbsolutePath());
			} catch (FileNotFoundException e) {
				logger.log(Level.SEVERE, "Cannot find taskdirectory", e);
			}
		}
		
 		File[] files = tasksDir.listFiles(new FilenameFilter()
 		{

			public boolean accept(File dir, String name) {
				return name.endsWith(".xml");
			}
 		});
		return files;
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