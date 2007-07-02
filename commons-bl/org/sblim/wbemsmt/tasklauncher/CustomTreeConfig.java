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
 * Contributors:
 *
 */

package org.sblim.wbemsmt.tasklauncher;

import java.io.File;
import java.math.BigInteger;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.filter.EmbeddedFilter;
import org.sblim.wbemsmt.lookup.Lookup;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.TreeConfigData;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.CimclassDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.CustomtreeconfigDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.EventListenerDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.Version;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ContextmenuDocument.Contextmenu;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.CustomtreeconfigDocument.Customtreeconfig;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

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

    public CustomTreeConfig(TreeConfigData configData, CimomData cimomData)
    {
        this.treeConfigData = configData;
		this.cimomData = cimomData;
		this.filename = configData.getFilename();
        this.readConfig();
    }

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
    
    public void test()
    {
        //readConfig();
        //System.out.println(this.rootNode.getDescription());
        TreenodeDocument doc = TreenodeDocument.Factory.newInstance();
    	
    	//this.filename = "C:\\Dokumente und Einstellungen\\marius\\Desktop\\customtree.xml";
    	//this.readConfig();
    	
    	//TreenodeDocument doc = this.treeDocument;
        
        rootNode = doc.addNewTreenode();
        rootNode.setDescription("root");
        TreenodeDocument.Treenode ersterKnoten = rootNode.addNewTreenode();
        ersterKnoten.setDescription("mein erster Knoten");
        EventListenerDocument.EventListener eventListener = ersterKnoten.addNewEventListener();
        eventListener.setClassname("org.wbem.sblim.webapp.jsf.myEventListener");
        
        CimclassDocument.Cimclass cimclass = ersterKnoten.addNewCimclass();
        cimclass.setClassname("CIM_Zimt");
        //1.5 BigInteger.TEN
        cimclass.setDepth(BigInteger.valueOf(10));
        
        
        try
        {
            doc.save(new File("C:\\Dokumente und Einstellungen\\marius\\Desktop\\customtree.xml"));
        }
        catch(Exception e) { System.err.println(e.getMessage()); }
    }
    
    public TreenodeDocument.Treenode getRootnode()
    {
        return this.rootNode;
    }

	public String getFilename() {
		return filename;
	}

	public TreeConfigData getTreeConfigData() {
		return treeConfigData;
	}
	
	public CimomData getCimomData() {
		return cimomData;
	}

	public boolean isLoaded() {
		return loaded;
	}

	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}

	public boolean serverTaskExists(CIMClient cimClient) {
		String className = treeConfigData.getLookupClass();
		if (className != null)
		{
			try {
				Lookup lookup = (Lookup) Class.forName(className).newInstance();
				return lookup.lookup(cimClient);
			} catch (Exception e) {
				logger.log(Level.SEVERE,"Cannot lokup with class " + className + " on server " + cimClient.getNameSpace().toString(),e);
			}
		}
		return false;
	}

	private void checkVersion(URL url, Customtreeconfig treeconfig) throws WbemSmtException {

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
			throw new WbemSmtException(msg);			
		}
		
	}

	public Contextmenu getCommonContextMenue() {
		return commonContextMenue;
	}

	
	
	
    
}
