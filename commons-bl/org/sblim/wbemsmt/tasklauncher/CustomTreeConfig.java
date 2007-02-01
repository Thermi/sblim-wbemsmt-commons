/**
 *  CustomTreeConfig.java
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

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.xmlbeans.XmlException;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.filter.EmbeddedFilter;
import org.sblim.wbemsmt.lookup.Lookup;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.TreeConfigData;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.CimclassDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.EventListenerDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class CustomTreeConfig
{
    private static Logger logger = Logger.getLogger(CustomTreeConfig.class.getName());
    private String filename;
    
    private TreenodeDocument treeDocument;
    private TreenodeDocument.Treenode rootNode;
	private final TreeConfigData treeConfigData;
	private boolean loaded = false;

    public CustomTreeConfig(TreeConfigData configData)
    {
        this.treeConfigData = configData;
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
                treeDocument = TreenodeDocument.Factory.parse(treeConfigUrl);
                
                //use the define filter to get the rootNode if we are running in embedded mode
                if (RuntimeUtil.getInstance().isEmbeddedMode())
                {
                	EmbeddedFilter embeddedFilter = treeConfigData.getEmbeddedFilter();
                	if (embeddedFilter != null)
                	{
                		this.rootNode = embeddedFilter.filter(treeDocument);
                	}
                }
                if (this.rootNode == null)
                {
                	//reload the Model because evtl the filter had destoryed the old one
                	treeDocument = TreenodeDocument.Factory.parse(treeConfigUrl);
                	this.rootNode = treeDocument.getTreenode();
                }
                
                
                loaded = true;
            }
            catch(IOException e)
            {
                logger.log(Level.SEVERE, "IO Error while loading config file " + treeConfigUrl, e.getLocalizedMessage());
            }
            catch(XmlException e)
            {
                logger.log(Level.SEVERE, "Error while reading config file " + treeConfigUrl, e.getLocalizedMessage());
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
    
    public void saveConfig()
    {
        this.printSubnodes(rootNode, 0);
        try
        {
            File save = new File("savedconfig.xml");
            logger.log(Level.INFO, "Saving Config to " + save.getAbsolutePath());
            this.treeDocument.save(save);
        }
        catch(Exception e) { System.err.println(e.getMessage()); }
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


	
	
    
}
