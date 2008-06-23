/**
 *  CIMClassNode.java
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
 * Class that is representing a CIMClass
 *
 */

package org.sblim.wbemsmt.bl.tree;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;

import javax.cim.CIMClass;
import javax.cim.CIMInstance;
import javax.cim.CIMObjectPath;
import javax.cim.CIMProperty;
import javax.faces.context.FacesContext;
import javax.wbem.CloseableIterator;
import javax.wbem.WBEMException;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.AssociatorException;
import org.sblim.wbemsmt.exception.impl.EnumerateInstancesException;
import org.sblim.wbemsmt.exception.impl.GetClassException;
import org.sblim.wbemsmt.exception.impl.userobject.AssociatorUserObject;
import org.sblim.wbemsmt.exception.impl.userobject.EnumerateInstancesUserObject;
import org.sblim.wbemsmt.exception.impl.userobject.GetClassUserObject;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherContextMenu;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.CimclassDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.InstanceSubnodesDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument;
import org.sblim.wbemsmt.tasklauncher.filter.CIMInstanceFilter;
import org.sblim.wbemsmt.tasklauncher.initialobjectloading.WbemsmtInitialObjectLoader;
import org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNaming;
import org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNamingFactory;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

/**
 * Class that is representing a CIMClass
 */
public class CIMClassNode extends TaskLauncherTreeNode implements ICIMClassNode
{
    /**
     * constant defining -1 as infinite depth
     */
    public static final int DEPTH_INFINITE = -1;
    
    private boolean showInstances = false;
    private String instanceNamingKey;
    private CIMClass cimClass;
    private boolean instancesBuilt = false;
    private int maxDepth = DEPTH_INFINITE;
    private Vector instances;
    
    /**
     * vector of {@link ITaskLauncherTreeNode} objects
     */
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

	private CIMInstanceNaming cimInstanceNaming;

	/**
	 * the Instance which is responsible for loading the initial set of data
	 * <br>
	 * only used if the instances to be shown are no associations or to overstep some associations
	 * <br>
	 *
	 */
	private WbemsmtInitialObjectLoader initialObjectLoader;
    
    /**
     * Constructs a new CIMClassNode.
     * @param cimClient the connection
     * @param xmlconfigNode Representation of this node in the xml config, can be null
     * @param name Displayed name
     * @param cimClass The cim class which is represented by this node
     */
    public CIMClassNode(WBEMClient cimClient, TreenodeDocument.Treenode xmlconfigNode, String name, CIMClass cimClass)
    {
        super(cimClient, xmlconfigNode, name);
        this.cimClass = cimClass;
        this.instances = new Vector();
        this.eventListener = new HashSet();
        this.instanceSubnodes = new Vector();
    }
    
    /**
     * @return name of the association target class
     */
    public String getAssociationTargetClassName()
    {
    	return this.associationTargetClassName;
    }
    
    /**
     * @param associationTarget name of the association target class
     */
    public void setAssociationTargetClassName(String associationTarget)
    {
    	this.associationTargetClassName = associationTarget;
    }
    
    
    
    /**
     * @return name of the source rereference of the association.<br>
     * For example: SettingData is one reference name of the CIM_ElementSettingDataAssociation  
     */
    public String getAssociationSourceReferenceName() {
		return associationSourceReferenceName;
	}

    /**
     * @param associationSourceReferenceName name of the source rereference of the association.<br>
     * For example: SettingData is one reference name of the CIM_ElementSettingDataAssociation  
     */
	public void setAssociationSourceReferenceName(
			String associationSourceReferenceName) {
		this.associationSourceReferenceName = associationSourceReferenceName;
	}

    /**
     * @return name of the target rereference of the association.<br>
     * For example: SettingData is one reference name of the CIM_ElementSettingDataAssociation  
     */
	public String getAssociationTargetReferenceName() {
		return associationTargetReferenceName;
	}

    /**
     * @param associationTargetReferenceName name of the target rereference of the association.<br>
     * For example: SettingData is one reference name of the CIM_ElementSettingDataAssociation  
     */
	public void setAssociationTargetReferenceName(
			String associationTargetReferenceName) {
		this.associationTargetReferenceName = associationTargetReferenceName;
	}

	/**
	 * set the context menue
	 * @param contextMenu the context menue
	 */
	public void setInstanceContextMenu(TaskLauncherContextMenu contextMenu)
    {
    	this.instanceContextMenu = contextMenu;
    }
    
	/**
	 * add an instance node to the subnodes and set this instance as parent of instanceSubnode
	 * @param instanceSubnode new subnode
	 */
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
     * @return true if the instances should be shown
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
     * @param cimClass the cim class object
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
     * Returns a Vector of all instances of the current CIM Class.
     *
     * @return Vector Instances of the {@link CIMInstanceNode}
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
     * @param notifyEventListener set to true if the method should notify the eventlisteners 
     * @throws WbemsmtException if reading the nodes failed 
     */
    public void readSubnodes(boolean notifyEventListener) throws WbemsmtException
    {
    	this.clearSubnodes();
    	
        // check if there are subnodes in the xml conf
        if(xmlconfigNode != null)
        {
            for (int i = 0; i < xmlconfigNode.getTreenodeArray().length; i++) {
				TreenodeDocument.Treenode configsubnode = xmlconfigNode.getTreenodeArray()[i];
            	this.addSubnode(TaskLauncherTreeNode.createNodeFromXML(cimClient, configsubnode,getCustomTreeConfig()));
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
        		
    			CloseableIterator it = null;
    			
    			try {
    				//first do a getClass to check if the target Classname is found
    				//(for the case the cimom is not checking that while a associators-call)
    				
    			    CIMObjectPath objectPath = new CIMObjectPath(this.associationTargetClassName,getNamespace());
    			    try {
                        cimClient.getClass(objectPath,false,true,false,null);
    			    } catch (WBEMException e)
    			    {
    			        throw new GetClassException(e,new GetClassUserObject(objectPath));
    			    }
    			    
    				
    				//then get the associated Objects
    				try {
                        it = cimClient.associators(
                        		instance.getObjectPath(),
                        		this.cimClass.getName(), 
                         		this.associationTargetClassName, 
                        		this.associationSourceReferenceName,
                        		this.associationTargetReferenceName,
                        		false,
                        		false,
                        		null);
                    }
                    catch (WBEMException e) {
                        WbemsmtException modelLoadException = new AssociatorException(e,
                            new AssociatorUserObject(
                                instance.getObjectPath(),
                                this.cimClass.getName(),
                                associationTargetClassName ,
                                associationSourceReferenceName,
                                associationTargetReferenceName,false,false,null ));
                        logger.log(Level.SEVERE, 
                                "Error while enumeration associators from CIM Association " 
                                + this.cimClass.getName() 
                                + " with targetClasName " + associationTargetClassName 
                                + " source/targetReferenceName " + associationSourceReferenceName + "/" + associationTargetReferenceName,modelLoadException);
                        throw modelLoadException;
                    }
    				while(it.hasNext())
    				{
    					checkException(it,false);
    					logger.log(Level.FINE, "Adding Associator.");
    					Object o = it.next();
    					checkException(it,false);
                		CIMInstance associator = (CIMInstance) o;

                		if (filter == null || filter.accept(associator, cimClient))
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
    					checkException(it,false);
                		
    				}
    			}
    			catch(WbemsmtException e)
    			{
					ExceptionUtil.handleException(e);
    			}
    			catch (Exception e)
    			{
                    WbemsmtException modelLoadException = new WbemsmtException(WbemsmtException.ERR_FAILED, e);
                    ExceptionUtil.handleException(modelLoadException);
    			}
        	}

        }

        if(showInstances && cimClass != null && !cimClass.isAssociation())
        {
            CIMObjectPath path = cimClass.getObjectPath();
            try
            {
                Iterator cimInstances;
                
                if (initialObjectLoader != null)
                {
                	initialObjectLoader.load(this);
                	cimInstances = initialObjectLoader.getInitialObjects().iterator();
                	this.cimClient = initialObjectLoader.getChangedCimClient();
                }
                else //if there is no initial object loader use a "normal" enumeration
                {
                	try {
                        cimInstances = this.cimClient.enumerateInstances(path,true,false,false,null);
                    }
                    catch (WBEMException e) {
                        logger.log(Level.SEVERE, "Error while enumeration instances of " + cimClass.getName() + ": " + e.getLocalizedMessage(),e);
                        throw new EnumerateInstancesException(e,new EnumerateInstancesUserObject(path,true,false,false,null));
                    }
                }

                while(cimInstances.hasNext())
                {
                	checkException(cimInstances, false);
                    CIMInstance currentInstance = (CIMInstance) cimInstances.next();
                    checkException(cimInstances, false);
                    if (filter == null || filter.accept(currentInstance, cimClient))
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
                checkException(cimInstances, false);
            }
            catch(WbemsmtException e)
            {
                ExceptionUtil.handleException(e);
            }
            catch (CloneNotSupportedException e) {
                ExceptionUtil.handleException(new WbemsmtException(WbemsmtException.ERR_FAILED,e));
            }  
        }
        
        subnodesRead = true;        
    	
//        if(this.maxDepth != 0 && !this.subnodesBuilt && subnodesUpdater != null && !subnodesUpdater.isAlive())
//        {
//            this.subnodesBuilt = true;
//            
//        }
//        
        
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

    /**
     * get the name of the node<br>
     * uses the {@link #instanceNamingKey} to find the property. if {@link #instanceNamingKey} is null the {@link #cimInstanceNaming} is used if != null
     * @param currentInstance the node get the name from
     * @return the name of the node or {@link TaskLauncherTreeNode#NO_DESCRIPTION} if neither {@link #instanceNamingKey} nor {@link #cimInstanceNaming} was set. 
     */
    
	private String getName(CIMInstance currentInstance) {
		String name = null;
		if(instanceNamingKey != null)
		{
			CIMProperty nameprop = currentInstance.getProperty(instanceNamingKey);
			if(nameprop != null && nameprop.getValue() != null) name = nameprop.getValue().toString();
		}
		else if(cimInstanceNaming != null)
		{
		     try {
				name = cimInstanceNaming.getDisplayString(currentInstance, cimClient);
			} catch (WbemsmtException e) {
				logger.log(Level.SEVERE, "Cannot get Naming for TreeNode",e);
			}
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
            CloseableIterator it;
            try {
                it = this.cimClient.enumerateInstances(this.cimClass.getObjectPath(),true,false,false,null);
            }
            catch (WBEMException e) {
                throw new EnumerateInstancesException(e, new EnumerateInstancesUserObject(this.cimClass.getObjectPath(),true,false,false,null));
            }

            while(it.hasNext())
            {
            	checkException(it, false);
                CIMInstance currentInstance = (CIMInstance) it.next();
            	checkException(it, false);
        
                logger.log(Level.FINEST, "Got CIM Instance from " + currentInstance.getClassName());
                CIMInstanceNode newNode = new CIMInstanceNode(this.cimClient, xmlconfigNode, currentInstance);
                this.instances.add(newNode);
            }
        	checkException(it, false);
        }
        catch(WbemsmtException e)
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
	 * Clones the Classnode
	 * <br>
	 * The SubnodesUpdater is cloned also
	 * 
	 * @return the clone
	 * 
	 */
	public Object clone()
    {
        try
        {
        	CIMClassNode cloned = (CIMClassNode) super.clone();
            return cloned;
        }
        catch(Exception e)
        {
            logger.log(Level.SEVERE, "Error while cloning " + this.getClass().getName() + " named " + this.name + ": " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
	
	/**
	 * set the filer to filter cim instances
	 * @param filter the filter
	 */

	public void setFilter(CIMInstanceFilter filter) {
		this.filter = filter;
	}

	/**
	 * @return get the name of this class + the node node + the name of {@link #cimClass}
	 */
	public String getInfo() {
		return CIMClassNode.class.getName() + name + "; " + cimClass.getName();
	}


	/**
	 * returns the Instance responsible for naming a cimInstance
	 * @return the instance responsible for naming a cimInstance
	 * 
	 * @see org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNamingFactory
	 */
	public CIMInstanceNaming getCimInstanceNaming() {
		return cimInstanceNaming;
	}

	/**
	 * set the Instance responsible for naming a cimInstance
	 * @param cimInstanceNaming the Instance responsible for naming a cimInstance
	 * @see CIMInstanceNamingFactory
	 *
	 */
	public void setCimInstanceNaming(CIMInstanceNaming cimInstanceNaming) {
		this.cimInstanceNaming = cimInstanceNaming;
	}

	/**
	 * Set the Instance which is responsible for loading the initial set of data
	 * @param initialObjectLoader the Instance which is responsible for loading the initial set of data
	 */
	public void setInitialObjectLoader(WbemsmtInitialObjectLoader initialObjectLoader) {
		this.initialObjectLoader = initialObjectLoader;
		
	}
	

}
