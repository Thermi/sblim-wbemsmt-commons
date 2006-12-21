/**
 *  CIMClassNode.java
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
 * Contributors: Michael.Bauschert@de.ibm.com
 *
 */

package org.sblim.wbemsmt.tasklauncher;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.sblim.wbem.cim.CIMClass;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.util.ThreadPool;
import org.sblim.wbemsmt.bl.tree.ICIMClassNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.CimclassDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.InstanceSubnodesDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument;
import org.sblim.wbemsmt.tasklauncher.filter.CIMInstanceFilter;
import org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNaming;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

/**
 * @author Marius Kreis
 */
public class CIMClassNode extends TaskLauncherTreeNode implements ICIMClassNode
{
    public static final int DEPTH_INFINITE = -1;
    
	private static final Logger logger = Logger.getLogger(CIMClassNode.class.getName());
    
	static ThreadPool threadPool = new ThreadPool();
	
    private boolean showInstances = false;
    private String instanceNamingKey;
    private CIMInstanceNaming cimInstanceNaming;
    private CIMClass cimClass;
    private SubnodesUpdater subnodesUpdater;
    private boolean subnodesBuilt = false;
    private boolean instancesBuilt = false;
    private int maxDepth = DEPTH_INFINITE;
    private Vector instances;
    
    protected Vector instanceSubnodes;
    private String associationSourceReferenceName;
    private String associationTargetClassName;
    private String associationTargetReferenceName;
    /**
     * contextMenu which will be attached to every instance
     */
    private TaskLauncherContextMenu instanceContextMenu;

    /**
     * Filter for Filtering instance nodes
     */
	private CIMInstanceFilter filter = null;
    
    /**
     * Constructs a new CIMClassNode.
     * @param cimClient
     * @param xmlconfigNode Representation of this node in the xml config, can be null
     * @param name Displayed name
     * @param cimClass The cim class which is represented by this node
     */
    public CIMClassNode(CIMClient cimClient, TreenodeDocument.Treenode xmlconfigNode, String name, CIMClass cimClass)
    {
        super(cimClient, xmlconfigNode, name);
        this.cimClass = cimClass;
        this.subnodesUpdater = new SubnodesUpdater(cimClient, this);
        this.instances = new Vector();
        this.eventListener = new HashSet();
        this.instanceSubnodes = new Vector();
    }
    
    public String getAssociationTargetClassName()
    {
    	return this.associationTargetClassName;
    }
    
    public void setAssociationTargetClassName(String associationTarget)
    {
    	this.associationTargetClassName = associationTarget;
    }
    
    
    
    public String getAssociationSourceReferenceName() {
		return associationSourceReferenceName;
	}

	public void setAssociationSourceReferenceName(
			String associationSourceReferenceName) {
		this.associationSourceReferenceName = associationSourceReferenceName;
	}

	public String getAssociationTargetReferenceName() {
		return associationTargetReferenceName;
	}

	public void setAssociationTargetReferenceName(
			String associationTargetReferenceName) {
		this.associationTargetReferenceName = associationTargetReferenceName;
	}

	public void setInstanceContextMenu(TaskLauncherContextMenu contextMenu)
    {
    	this.instanceContextMenu = contextMenu;
    }
    
    public void addInstanceSubnode(TaskLauncherTreeNode instanceSubnode)
    {
    	this.instanceSubnodes.add(instanceSubnode);
    	instanceSubnode.setParent(this);
    }
    
    /**
     * Sets the maximum depth to which subclasses of the current {@link CIMClass} will be gathered.
     * @param maxDepth Maximum depth to which subclasses of the current {@link CIMClass} will be gathered.
     */
    public void setMaxDepth(int maxDepth)
    {
    	this.maxDepth = maxDepth;
    }
    
    /**
     * Triggers if CIM instances of the current CIM class will be treatened like subnodes.
     *
     * @param showInstances Flag if CIM instances of the current CIM class will be treatened like subnodes.
     */
    public void setShowInstances(boolean showInstances)
    {
    	this.showInstances = showInstances;
    }

    /**
     * Returns the Information if to show instances of a class
     * @return
     */
	public boolean getShowInstances() {
		return showInstances;
	}

	/**
     * Returns the {@link CIMClass} which is attached to this CIMClassNode.
     * 
     * @return The {@link CIMClass} which is attached to this CIMClassNode.
     */
    public CIMClass getCIMClass()
    {
        return this.cimClass;
    }
    
	/**
     * Sets the {@link CIMClass} which is attached to this CIMClassNode.
     */
    public void setCIMClass(CIMClass cimClass)
    {
        this.cimClass = cimClass;
    }

    
    /**
     * Sets the name of the property which identifies an CIM instance, e.g. caption.
     *
     * @param key Name of the property which identifies an CIM instance
     */
    public void setInstanceNamingKey(String key)
    {
    	this.instanceNamingKey = key;
    }
    
    /**
     * Returns the name of the property which identifies an CIM instance, e.g. caption.
     *
     * @return Name of the property which identifies an CIM instance
     */
    public String getInstanceNamingKey()
    {
    	return this.instanceNamingKey;
    }
    
    
    /**
     * returns the Instance responsible for naming a cimInstance
     * @return
     * 
     * @see org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNamingFactory
     */
    
    public CIMInstanceNaming getCimInstanceNaming() {
		return cimInstanceNaming;
	}

    /**
     * set the Instance responsible for naming a cimInstance
     * @param cimInstanceNaming
     * @see CIMInstanceNamingFactory
     *
     */
	public void setCimInstanceNaming(CIMInstanceNaming cimInstanceNaming) {
		this.cimInstanceNaming = cimInstanceNaming;
	}

	/**
     * Returns a Vector of all instances of the current CIM Class.
     *
     * @return Vector<CIMInstanceNode> Instances of the current CIM Class
     */
    public Vector getInstanceNodes()
    {
        logger.log(Level.FINE, "Getting instances of CIMClass " + this.getName());
        if(!this.instancesBuilt)
        {
            this.readInstanceNodes();
            this.instancesBuilt = true;
        }
        return this.instances;
    }
    
    /**
     * Reads subnodes of the current {@link CIMClass} which can be textnodes of the xml configuration ({@link TaskLauncherTreeNode}),
     * instances ({@link CIMInstanceNode}) or subclasses ({@link CIMClassNode}).
     * Instances are labeled according to the instanceNamingKey or to the cimInstanceNaming property.
     * @throws WbemSmtException 
     */
    public void readSubnodes(boolean notifyEventListener) throws WbemSmtException
    {
    	this.clearSubnodes();
    	
        // check if there are subnodes in the xml conf
        if(xmlconfigNode != null)
        {
            for (int i = 0; i < xmlconfigNode.getTreenodeArray().length; i++) {
				TreenodeDocument.Treenode configsubnode = xmlconfigNode.getTreenodeArray()[i];
            	this.addSubnode(TaskLauncherTreeNode.createNodeFromXML(cimClient, configsubnode,getTreeConfigData()));
            }
        }
        
        if(cimClass != null && cimClass.isAssociation())
        {
        	// look for the very first parent node which is an instance
        	TaskLauncherTreeNode parent = (TaskLauncherTreeNode) this.getParent();
        	
        	while(parent != null && !(parent instanceof CIMInstanceNode))
        	{
        		parent = (TaskLauncherTreeNode) parent.getParent();
        	}
        	if(parent != null)
        	{
        		CIMInstanceNode instanceNode = (CIMInstanceNode) parent;
        		CIMInstance instance = instanceNode.getCimInstance();
        		
    			Enumeration enumeration = null;
    			
    			try {
    				//first do a getClass to check if the target Classname is found
    				//(for the case the cimom is not checking that while a associators-call)
    				
    				cimClient.getClass(new CIMObjectPath(this.associationTargetClassName));
    				
    				//then get the associated Objects
    				enumeration = cimClient.associators(
    						instance.getObjectPath(),
    						this.cimClass.getName(), 
    		 		 		this.associationTargetClassName, 
    						this.associationSourceReferenceName,
    						this.associationTargetReferenceName,
    						false,
    						false,
    						null);
    				while(enumeration.hasMoreElements())
    				{
    					logger.log(Level.FINE, "Adding Associator.");
    					Object o = enumeration.nextElement();
                		CIMInstance associator = (CIMInstance) o;

                		if (filter == null || filter.accept(associator))
                		{
                            String name = getName(associator);
                    		
                            CIMInstanceNode associatorNode = new CIMInstanceNode(cimClient, xmlconfigNode, name, associator);
                            
                            // add instanceSubnodes as subnodes to this new CIMInstanceNode
                        	logger.log(Level.FINE, "Adding InstanceSubnodes to Assosciator " + name + "...");
                            
                        	for(int i = 0; i < instanceSubnodes.size(); i++)
                        	{
                        		//We are cloning the instances so that every associatorNode has its own subnodes...
                        		TaskLauncherTreeNode instanceSubnode = (TaskLauncherTreeNode) ((TaskLauncherTreeNode) instanceSubnodes.get(i)).clone();
                            	associatorNode.addSubnode(instanceSubnode);
                            	logger.log(Level.FINEST, "Adding InstanceSubnode " + instanceSubnode.getName());
                        	}
                        	
                            // add ContextMenu to CIMInstanceNode
                        	if(this.instanceContextMenu != null)
                        	{
                        		logger.log(Level.INFO, "Adding ContextMenu to Assosciator " + name + "...");
                        		// We are cloning the menu so that every associatorNode has its own context menu
                        		associatorNode.setContextMenu((TaskLauncherContextMenu) this.instanceContextMenu.clone());
                        	}
                        	addSubnode(associatorNode);
                		}
                    		
                		
                		
    				}
    			}
    			catch(Exception e)
    			{
    				ModelLoadException modelLoadException = new ModelLoadException(e);
    				modelLoadException.setCimIdentifier("Association: "+ this.cimClass.getName() 
    						+ " Target: " + associationTargetClassName 
    						+ " RefNames: " + associationSourceReferenceName + "/" + associationTargetReferenceName );
    				logger.log(Level.SEVERE, 
    						"Error while enumeration associators from CIM Association " 
    						+ this.cimClass.getName() 
    						+ " with targetClasName " + associationTargetClassName 
    						+ " source/targetReferenceName " + associationSourceReferenceName + "/" + associationTargetReferenceName,modelLoadException);
					ExceptionUtil.handleException(modelLoadException);
    			}
        	}

        }

        if(showInstances && cimClass != null && !cimClass.isAssociation())
        {
            CIMObjectPath path = cimClass.getObjectPath();
            try
            {
                Enumeration cimInstances = this.cimClient.enumerateInstances(path);
                while(cimInstances.hasMoreElements())
                {
                    CIMInstance currentInstance = (CIMInstance) cimInstances.nextElement();
                    if (filter == null || filter.accept(currentInstance))
                    {
                    	String name = getName(currentInstance);
                    	
                    	CIMInstanceNode newInstanceNode = new CIMInstanceNode(this.cimClient, xmlconfigNode, name, currentInstance);
                    	
                    	// add instanceSubnodes as subnodes to this new CIMInstanceNode
                    	logger.log(Level.FINE, "Adding InstanceSubnodes to Instance " + name + "...");
                    	
                    	for(int i = 0; i < instanceSubnodes.size(); i++)
                    	{
                    		
                    		//We are cloning the instances so that every InstanceNode has its own subnodes...
                    		TaskLauncherTreeNode instanceSubnode = (TaskLauncherTreeNode) ((TaskLauncherTreeNode) instanceSubnodes.get(i)).clone();
                    		newInstanceNode.addSubnode(instanceSubnode);
                    		logger.log(Level.FINEST, "Adding InstanceSubnode " + instanceSubnode.getName());
                    	}
                    	// add ContextMenu to CIMInstanceNode
                    	if(this.instanceContextMenu != null)
                    	{
                    		logger.log(Level.INFO, "Adding ContextMenu to Instance " + name + "...");
                    		// We are cloning the menu so that every instanceNode has its own context menu
                    		newInstanceNode.setContextMenu((TaskLauncherContextMenu) this.instanceContextMenu.clone());
                    	}
                    	
                    	this.addSubnode(newInstanceNode);
                    }
                }
            }
            catch(Exception e)
            {
            	logger.log(Level.SEVERE, "Error while enumeration instances of " + cimClass.getName() + ": " + e.getLocalizedMessage(),e);
				if (RuntimeUtil.getInstance().isJSF())
				{
					JsfUtil.handleException(e);
				}
				else if (RuntimeUtil.getInstance().isSwing())
				{
					
				}
            }  
        }
    	
        if(this.maxDepth != 0 && !this.subnodesBuilt && subnodesUpdater != null && !subnodesUpdater.isAlive())
        {
            logger.log(Level.FINER, "Getting subclasses of CIMClass " + this.getName() + " depth " + maxDepth);

            threadPool.execute(subnodesUpdater);
            subnodesUpdater = null;
            this.subnodesBuilt = true;
            subnodesRead = true;
        }
        
        
        // call update on subnodes
        for(int i = 0; i < this.subnodes.size(); i++)
        {
        	((TaskLauncherTreeNode) subnodes.get(i)).readSubnodes();
        }

        if(notifyEventListener)
        {
        	// notify event listeners of refresh event
        	if (RuntimeUtil.getInstance().isJSF())
        	{
        		processEvent(new TaskLauncherTreeNodeEvent(this, this, FacesContext.getCurrentInstance(), TaskLauncherTreeNodeEvent.TYPE_REFRESHED));
        	}
        	else
        	{
        		throw new IllegalArgumentException("Cannot send Event for Runtime " + RuntimeUtil.getInstance().getRuntime());
        	}
        }
    }

	private String getName(CIMInstance currentInstance) {
		String name = null;
		if(instanceNamingKey != null)
		{
			CIMProperty nameprop = currentInstance.getProperty(instanceNamingKey);
			if(nameprop != null && nameprop.getValue() != null) name = (String) nameprop.getValue().getValue();
		}
		else if(cimInstanceNaming != null)
		{
		     name = cimInstanceNaming.getDisplayString(currentInstance);
		}
		if(name == null) name = TaskLauncherTreeNode.NO_DESCRIPTION;
		return name;
	}


    /**
     * Reads especially instances of the current CIM Class, event if showInstanceNodes is false.
     * This instances will not be added as subnodes.
     * @deprecated Instances should either be subnodes or read by an EventListener which cares for them.
     */
    private void readInstanceNodes()
    {
        this.instances.clear();
        try
        {
            Enumeration cimInstances = this.cimClient.enumerateInstances(this.cimClass.getObjectPath());

            while(cimInstances.hasMoreElements())
            {
                CIMInstance currentInstance = (CIMInstance) cimInstances.nextElement();
        
                logger.log(Level.FINEST, "Got CIM Instance from " + currentInstance.getClassName());
                CIMInstanceNode newNode = new CIMInstanceNode(this.cimClient, xmlconfigNode, currentInstance);
                this.instances.add(newNode);
            }
        }
        catch(Exception e)
        {
			if (RuntimeUtil.getInstance().isJSF())
			{
				JsfUtil.handleException(e);
			}
			else if (RuntimeUtil.getInstance().isSwing())
			{
				
			}
            logger.log(Level.SEVERE, "Exception while enumerating Instances of " + cimClass.getName() + ": " + e.getLocalizedMessage(),e);
        }
    }
    
    /**
     * Takes a {@link TreenodeDocument.Treenode} and adds all configuration data to it to represent the current node in XML.
     *
     * @param node to which current configuration data will be added to
     * @return TreenodeDocument.Treenode The modified node
     */
    public TreenodeDocument.Treenode generateXML(TreenodeDocument.Treenode node)
    {
        node = super.generateXML(node);
        CimclassDocument.Cimclass cimclass = node.addNewCimclass();
        if(this.cimClass != null) cimclass.setClassname(this.cimClass.getName());
        if(this.maxDepth != DEPTH_INFINITE) cimclass.setDepth(BigInteger.valueOf(this.maxDepth));
        if(this.instanceNamingKey != null) cimclass.setInstanceNamingKey(this.instanceNamingKey);
        
        if(this.instanceSubnodes != null)
        {
        	cimclass.unsetInstanceSubnodes();
        	InstanceSubnodesDocument.InstanceSubnodes instanceSubnodes = cimclass.addNewInstanceSubnodes();
        	Iterator iter = this.instanceSubnodes.iterator();
        	while(iter.hasNext())
        	{
        		TaskLauncherTreeNode subnode = (TaskLauncherTreeNode) iter.next();
        		TreenodeDocument.Treenode instanceSubnode = instanceSubnodes.addNewTreenode();
        		instanceSubnode = subnode.generateXML(instanceSubnode);
        	}
        }
        return node;
    }
    

    

    
    
    
    /**
     * Small thread to gather all subclasses from the cim client.
     * @author Marius Kreis
     *
     */
    private class SubnodesUpdater implements Runnable, Cloneable
    {
        private CIMClassNode rootNode;
        private CIMClient cimClient;
		private boolean isAlive = false;

        /**
         * Constructs the Subnodes Updater thread
         * @param cimClient to be used for the update
         * @param rootNode to which subnodes will be added to
         */
        public SubnodesUpdater(CIMClient cimClient, CIMClassNode rootNode)
        {
            this.cimClient = cimClient;
            this.rootNode = rootNode;
        }
        
        public boolean isAlive() {
			return isAlive;
		}

		public void run()
        {
			try
			{
				isAlive = true;
				this.getSubnodes(rootNode, rootNode.getCIMClass(), maxDepth);
			}
			finally
			{
				rootNode = null;
				cimClient = null;
				isAlive = false;
				logger.log(Level.FINE, "Building Tree finished");
			}
        }
        
        protected void finalize() throws Throwable {
        	System.err.println("Finalize " + getName());
        	super.finalize();
        }
        
        public Object clone()
        {
        	try {
				return super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
				return null;
			}
        }
        
        /**
         * Recursive method to gather all subclasses. Catches errors of the {@link CIMClient}
         * which may occur due to bugs in den CIMClient, misconfiguration (invalid CIM Classes)
         * or too many connections.
         * @param node Current node to which subnodes will be added to
         * @param cimClass Current {@link CIMClass} from whose subclasses subnodes are built
         * @param depth Counter of the current depth, to be compared with the maximum depth
         */
        private void getSubnodes(CIMClassNode node, CIMClass cimClass, int depth)
        {
            CIMObjectPath path = (cimClass != null) ? cimClass.getObjectPath() : new CIMObjectPath();
            try
            {
                Enumeration cimClasses = this.cimClient.enumerateClasses(path);
                while(cimClasses.hasMoreElements())
                {
                    CIMClass currentCimClass = (CIMClass) cimClasses.nextElement();
                    if(!currentCimClass.isAssociation())
                    {
                        logger.log(Level.FINEST, "Got CIM Class: " + currentCimClass.getName());
                        CIMClassNode newNode = new CIMClassNode(this.cimClient, null, currentCimClass.getName(), currentCimClass);
                        
                        // every child gets the same eventListener as the parent
                        newNode.addEventListener(eventListener);
                        
                        node.addSubnode(newNode);
                        
                        if(maxDepth == DEPTH_INFINITE || (maxDepth > 0 && depth <= maxDepth))
                        {
                            this.getSubnodes(newNode, currentCimClass, depth+1);
                        }
                    }
                    else logger.log(Level.FINEST, "Got CIM Association: " + currentCimClass.getName());
                }
            }
            catch(Exception e)
            {
                if(logger.isLoggable(Level.SEVERE))
                    logger.log(Level.SEVERE, "Error while enumerating Classes of Path " + path.toString() + ": " + e.getMessage());
            }
        }
    }

    

    SubnodesUpdater getSubnodesUpdater() {
		return subnodesUpdater;
	}

	void setSubnodesUpdater(SubnodesUpdater subnodesUpdater) {
		this.subnodesUpdater = subnodesUpdater;
	}

	/**
	 * Clones the Classnode
	 * 
	 * The SubnodesUpdater is cloned also
	 * 
	 */
	public Object clone()
    {
        try
        {
        	CIMClassNode cloned = (CIMClassNode) super.clone();
            cloned.setSubnodesUpdater((SubnodesUpdater)getSubnodesUpdater().clone());
            return cloned;
        }
        catch(Exception e)
        {
            logger.log(Level.SEVERE, "Error while cloning " + this.getClass().getName() + " named " + this.name + ": " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

	public void setFilter(CIMInstanceFilter filter) {
		this.filter = filter;
	}

	public String getInfo() {
		return CIMClassNode.class.getName() + name + "; " + cimClass.getName();
	}



}
