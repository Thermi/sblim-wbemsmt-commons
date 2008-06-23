/**
 *  CustomTreeConfig.java
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
 * Contributors: Michael Bauschert <Michael.Bauschert@de.ibm.com>
 * 
 * Configuration of a tree for one task
 *
 */

package org.sblim.wbemsmt.bl.tree;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.filter.EmbeddedFilter;
import org.sblim.wbemsmt.lookup.Lookup;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.TreeConfigData;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.CustomtreeconfigDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.Version;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ContextmenuDocument.Contextmenu;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.CustomtreeconfigDocument.Customtreeconfig;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

/**
 * Configuration of a tree for one task
 */
public class CustomTreeConfig
{
    private static final Object[] SUPPORTED_VERSIONS_TREE_CONFIG = new Object[] {Version.VERSION_2_0, Version.VERSION_2_1,Version.VERSION_2_2};
	private static Logger logger = Logger.getLogger(CustomTreeConfig.class.getName());
    private String filename;
    
    private TreenodeDocument.Treenode rootNode;
	private final TreeConfigData treeConfigData;
	private boolean loaded = false;
	private Contextmenu commonContextMenue;
	private final CimomData cimomData;
	private final WBEMClient cimClient;

	/**
	 * creates a new config
	 * @param configData the tree config from the xml
	 * @param cimomData the host's data
	 * @param cimClient the server connection
	 */
    public CustomTreeConfig(TreeConfigData configData, CimomData cimomData, WBEMClient cimClient)
    {
        this.treeConfigData = configData;
		this.cimomData = cimomData;
		this.cimClient = cimClient;
		this.filename = configData.getFilename();
        this.readConfig();
    }

    /**
     * read the tree configuration<br>
     * Invoking the {@link EmbeddedFilter} after the tree config was read if we are running in Embedded mode
     * @see RuntimeUtil#isEmbeddedMode()
     */
    public void readConfig()
    {
        loaded = false;
    	if (RuntimeUtil.getInstance().isJSF())
    	{
        	URL treeConfigUrl = loadUrl(getClass().getClassLoader(),filename);
        	
        	if (treeConfigUrl == null)
        	{
        		logger.severe("The file " + filename + " was not found.");        		
        		return;
        	}
        	
            try
            {
                logger.log(Level.INFO, "Reading config from " + treeConfigUrl + filename);
                
                CustomtreeconfigDocument.Customtreeconfig customtreeconfig = CustomtreeconfigDocument.Factory.parse(treeConfigUrl).getCustomtreeconfig(); 
                rootNode = customtreeconfig.getTreenode();
                commonContextMenue = customtreeconfig.getContextmenu();
                
                checkVersion(treeConfigUrl, CustomtreeconfigDocument.Factory.parse(treeConfigUrl).getCustomtreeconfig());
                
                //use the define filter to get the rootNode if we are running in embedded mode
                if (RuntimeUtil.getInstance().isEmbeddedMode())
                {
                	EmbeddedFilter embeddedFilter = treeConfigData.getEmbeddedFilter();
                	if (embeddedFilter != null)
                	{
                		this.rootNode = embeddedFilter.filter(rootNode);
                	}
                }
                if (this.rootNode == null)
                {
                	//reload the Model because evtl the filter had destoryed the old one
                	rootNode = CustomtreeconfigDocument.Factory.parse(treeConfigUrl).getCustomtreeconfig().getTreenode();
                }
                
                
                loaded = true;
            }
            catch(Exception e)
            {
                logger.log(Level.SEVERE, "Error while reading config file " + treeConfigUrl, e);
            }  
    	}
    	else
    	{
            logger.severe("Runtime mode is not jsf - not supported ");
    	}
    }

    /**
     * load fname as url from a classloader
     * @param classloader the classloader
     * @param fname the name of the url
     * @return the URL
     */
	private URL loadUrl(final ClassLoader classloader, final String fname) {
		URL treeConfigUrl = (URL)java.security.AccessController.doPrivileged(
		        new java.security.PrivilegedAction() {
		            public Object run() {
		                if (classloader != null) {
		                    return classloader.getResource(fname);
		                } else {
		                    return ClassLoader.getSystemResourceAsStream(fname);
		                }
		            }
		        }
		    );
		return treeConfigUrl;
	}
    
	/**
	 * prit out all subnodes of node<br>
	 * each level is indented by "--"
	 * @param node the node start from
	 * @param depth the current depth
	 */
    public void printSubnodes(TreenodeDocument.Treenode node, int depth)
    {
        String path = "";
        for(int i=0; i < depth; i++) path += "--";
        System.out.println(path + node.getDescription());
        TreenodeDocument.Treenode[] nodes = node.getTreenodeArray();
        for (int i = 0; i < nodes.length; i++) {
			TreenodeDocument.Treenode subnode = nodes[i];
			printSubnodes(subnode, depth+1);
		}
    }

    /**
     * get the root node of the tree config
     * @return the root node of the tree config
     */
    public TreenodeDocument.Treenode getRootnode()
    {
        return this.rootNode;
    }

    /**
     * get the filename of the tree config
     * @return the filename of the tree config
     */
	public String getFilename() {
		return filename;
	}

	/**
	 * get the treeconfig from the xml
	 * @return the treeconfig from the xml
	 */
	public TreeConfigData getTreeConfigData() {
		return treeConfigData;
	}
	
	/**
	 * the host
	 * @return the host configuration
	 */
	public CimomData getCimomData() {
		return cimomData;
	}

	/**
	 * true if the tree config was loaded
	 * @return true if the tree was loaded
	 */
	public boolean isLoaded() {
		return loaded;
	}
	

	/**
	 * creates a {@link CustomTreeConfig} by using the configData and check the {@link #isLoaded()} method if the treeconfig was loaded
	 * @param configData the treeconfig
	 * @return true if the {@link CustomTreeConfig}  was loaded
	 */
	public static boolean isLoaded(TreeConfigData configData)
	{
		return new CustomTreeConfig(configData,null,null).isLoaded();
	}
	
	/**
	 * checks by using the {@link TreeConfigData#getLookupClass()} if the task exists on the server
	 * @param cimClient connection to the server
	 * @return true if the task exists on the servers
	 */
	public boolean serverTaskExists(WBEMClient cimClient) {
		String className = treeConfigData.getLookupClass();
		if (className != null)
		{
			try {
				Lookup lookup = (Lookup) Class.forName(className).newInstance();
				return lookup.lookup(cimClient,treeConfigData.getNamespace());
			} catch (Exception e) {
				logger.log(Level.SEVERE,"Cannot lokup with class " + className + " on server " + getCimomData().getInfo(),e);
			}
		}
		return false;
	}

	/**
	 * check the version of the tree conf
	 * @param url url with tree.xml file
	 * @param treeconfig the xml element of the tree configuration
	 * @throws WbemsmtException if the version is not supported
	 */
	private void checkVersion(URL url, Customtreeconfig treeconfig) throws WbemsmtException {

		boolean found = false;
		
		for (int i = 0; i < SUPPORTED_VERSIONS_TREE_CONFIG.length; i++) {
			Object version = SUPPORTED_VERSIONS_TREE_CONFIG[i];
			if (treeconfig.getVersion() != null && treeconfig.getVersion().equals(version))
			{
				found = true;
			}
		}
		if (!found)
		{
			String msg = "Model-Version " + treeconfig.getVersion() + " of " + url + " is not supported.\nPlease upgrade to Version " + SUPPORTED_VERSIONS_TREE_CONFIG;
			throw new WbemsmtException(WbemsmtException.ERR_FAILED, msg);			
		}
		
	}

	/**
	 * get the common context menues as defined in the xml 
	 * @return the common context menues as defined in the xml
	 */

	public Contextmenu getCommonContextMenue() {
		return commonContextMenue;
	}

	/**
	 * get the connection to server for which this config is targeted
	 * @return the connection to server
	 */
	public WBEMClient getCimClient() {
		return cimClient;
	}

	
	
	
	
    
}
