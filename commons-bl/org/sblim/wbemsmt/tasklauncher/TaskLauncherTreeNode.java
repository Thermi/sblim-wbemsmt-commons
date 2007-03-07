/**
 *  TaskLauncherTreeNode.java
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
 * Contributors: michael.bauschert@de.ibm.com
 *
 */

package org.sblim.wbemsmt.tasklauncher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.sblim.wbem.cim.CIMClass;
import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMSimpleDateTime;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.Numeric;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.cim.UnsignedInt64;
import org.sblim.wbem.cim.UnsignedInt8;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListener;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.TreeConfigData;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.CimclassDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.CiminstanceDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ContextmenuDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.EventListenerDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.KeypropertyDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ParamDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.AssociationDocument.Association;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.EventListenerDocument.EventListener;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.FilterDocument.Filter;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.InstanceNamingClassDocument.InstanceNamingClass;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ParamDocument.Param;
import org.sblim.wbemsmt.tasklauncher.event.DeleteListener;
import org.sblim.wbemsmt.tasklauncher.event.EditListener;
import org.sblim.wbemsmt.tasklauncher.filter.CIMInstanceFilterFactory;
import org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNamingFactory;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

/**
 * Basic Node for the navigation tree.
 * @author Marius Kreis
 */
public class TaskLauncherTreeNode implements Cloneable, ITaskLauncherTreeNode
{
    private static final Logger logger = Logger.getLogger(TaskLauncherTreeNode.class.getName());
    
    public static final int TYPE_DEFAULT = 1,
    				  		TYPE_CIMCLASS = 2,
    				  		TYPE_CIMINSTANCE = 3;
    
    protected static final String NO_DESCRIPTION = "(no description)";
    
    protected CIMClient cimClient;
    protected Vector subnodes;
    protected String name;
    protected boolean subnodesRead = false;
    protected boolean enabled = true;
    protected TreenodeDocument.Treenode xmlconfigNode;
    protected Set eventListener;
    protected TaskLauncherContextMenu contextMenu;
    
    private ITaskLauncherTreeNode parent;

	private CustomTreeConfig customTreeConfig;

	private TreeConfigData treeConfigData;
    
    /**
     * Constructs a Treenode, Name will be taken from xmlconfigNode's description.
     * @param cimClient
     * @param xmlconfigNode Representation of this node in the xml config, not null
     */
    public TaskLauncherTreeNode(CIMClient cimClient, TreenodeDocument.Treenode xmlconfigNode)
    {
    	this(cimClient, xmlconfigNode, (xmlconfigNode != null && xmlconfigNode.getDescription() != null) ? xmlconfigNode.getDescription() : NO_DESCRIPTION);
    }

    /**
     * Constructs a Treenode with given name.
     * @param cimClient
     * @param xmlconfigNode Representation of this node in the xml config, can be null
     * @param name Display name of the node
     */
    public TaskLauncherTreeNode(CIMClient cimClient, TreenodeDocument.Treenode xmlconfigNode, String name)
    {
        this.cimClient = cimClient;
        this.xmlconfigNode = xmlconfigNode;
        this.name = name;
        this.subnodes = new Vector();
        this.eventListener = new HashSet();
    }
    
	/**
     * Returns whether the current node was initialized with xml data.
     * @return
     */
    public boolean hasXMLData()
    {
        return this.xmlconfigNode != null;
    }
    
    /**
     * Returns the xml data the current node was initialized with.
     * @return
     */
    public TreenodeDocument.Treenode getXMLData()
    {
        return this.xmlconfigNode;
    }
    
    /**
     * Sets the display name of the current node.
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
        if (xmlconfigNode != null)
        {
        	this.xmlconfigNode.setDescription(name);
        }
    }
    
    /**
     * Returns the display name of the current node.
     * @return
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Returns all subnodes of the current node.
     * @return
     * @throws WbemSmtException 
     */
    public Vector getSubnodes() throws WbemSmtException
    {
    	return getSubnodes(true);
    }
    
    /**
     * Returns all subnodes of the current node.
     * @param notifyEventListeners passes and Refresh-Event to all Listeners if set to true
     * @return
     * @throws WbemSmtException 
     */
    public Vector getSubnodes(boolean notifyEventListeners) throws WbemSmtException
    {
        if(!this.subnodesRead)
        {
            readSubnodes(notifyEventListeners);
        }
        return this.subnodes;
    }
    
    /**
     * Returns wether the current node has subnodes.
     * @return
     */
    public boolean hasSubnodes()
    {
        return(!this.subnodes.isEmpty());
    }
    
    /**
     * Removes all subnodes of the current node.
     */
    public void clearSubnodes()
    {
        this.subnodes.clear();
    }
    
    /**
     * Adds a subnode to the current node. The subnode will be appended to the end.
     * @param subnode
     */
    public void addSubnode(ITaskLauncherTreeNode subnode)
    {
    	subnode.setParent(this);
        this.subnodes.add(subnode);
    }
    
    /**
     * Adds a subnode to the current node at a given position, relative to the reference.
     * If the parent has xml data the new node will be added to this aswell.
     * @param reference
     * @param nodeToPaste
     * @param offset relative position to the reference.
     */
    public void insertSubnode(TaskLauncherTreeNode reference, TaskLauncherTreeNode nodeToPaste, int offset)
    {
        int insertPosition = subnodes.indexOf(reference);

        if(insertPosition >= 0)
        {
            insertPosition += offset;
            
            // make sure the index fits into array bounds, otherwise trim to fit.
            if(insertPosition > subnodes.size()) insertPosition = subnodes.size();
            if(insertPosition < 0) insertPosition = 0;
            
            subnodes.add(insertPosition + offset, nodeToPaste);
        }
        else
        {
            // referece was not found; append node to end
            subnodes.add(nodeToPaste);
        }
           
        if(this.hasXMLData())
        {
            pasteXMLSubnode(reference, nodeToPaste, offset);
        }
    }
    
    /**
     * Adds a subnode to the xml data of current node at a given position, relative to the reference.
     * If the subnode has no xml data it will be generated.
     * @param reference
     * @param nodeToPaste
     * @param offset relative position to the reference.
     */
    private void pasteXMLSubnode(TaskLauncherTreeNode reference, TaskLauncherTreeNode nodeToPaste, int offset)
    {
        // default position is the end
        int insertPosition = xmlconfigNode.sizeOfTreenodeArray();

        if(reference != null && reference.hasXMLData())
        {
            TreenodeDocument.Treenode[] xmlnodes = this.xmlconfigNode.getTreenodeArray();
            for(int i=0; i < xmlnodes.length; i++)
            {
                if(xmlnodes[i].equals(reference.getXMLData()))
                {
                    insertPosition = i + offset;
                }
            }
        }
        
        
        // make sure the index fits into array bounds, otherwise trim to fit.
        if(insertPosition > xmlconfigNode.sizeOfTreenodeArray()) insertPosition = xmlconfigNode.sizeOfTreenodeArray();
        if(insertPosition < 0) insertPosition = 0;

        TreenodeDocument.Treenode newNode = this.xmlconfigNode.insertNewTreenode(insertPosition);
        if(nodeToPaste.hasXMLData()) newNode.set(nodeToPaste.getXMLData().copy());
        newNode.set(nodeToPaste.generateXML(newNode));
    }
    
    /**
     * Deletes the given node from the subnodes.
     * @param subnode
     */
    public void deleteSubnode(ITaskLauncherTreeNode subnode)
    {
    	TaskLauncherTreeNode node = (TaskLauncherTreeNode) subnode;
        if(node.hasXMLData())
        {
            deleteXMLSubnode(node.getXMLData());
        }
        this.subnodes.remove(node);
    }
    
    /**
     * Deletes the subnode from the xml subnode data.
     * @param subnode
     */
    private void deleteXMLSubnode(TreenodeDocument.Treenode subnode)
    {
        TreenodeDocument.Treenode[] xmlnodes = this.xmlconfigNode.getTreenodeArray();
        int position = -1;
        for(int i=0; i < xmlnodes.length; i++)
        {
            if(xmlnodes[i].equals(subnode))
            {
                position = i;
            }
        }
        if(position >= 0) xmlconfigNode.removeTreenode(position);
    }
    
    /**
     * Takes a {@link TreenodeDocument.Treenode} and adds all configuration data to it to represent the current node in XML.
     * This method is to be overridden and called by subclasses whereas every subclass adds ifs custom data to the node.
     *
     * @param node to which current configuration data will be added to
     * @return TreenodeDocument.Treenode The modified node
     */
    public TreenodeDocument.Treenode generateXML(TreenodeDocument.Treenode node)
    {
        node.setDescription(this.getName());
        if(this.hasEventListener())
        {
        	for (Iterator iter = this.eventListener.iterator(); iter.hasNext();) {
				TaskLauncherTreeNodeEventListener eventListener = (TaskLauncherTreeNodeEventListener) iter.next();
                EventListenerDocument.EventListener eventNode = node.addNewEventListener();
                eventNode.setClassname(eventListener.getClass().getName());
                Properties parameters = eventListener.getParameters();
                for (Iterator iterator = parameters.keySet().iterator(); iterator
						.hasNext();) {
					Object key = (Object) iterator.next();
                    ParamDocument.Param parameter = eventNode.insertNewParam(0);
                    parameter.setParamName((String) key);
                    parameter.setParamValue((String) parameters.get(key));
                }
            }
        }
        return node;
    }
    
    public CIMClient getCimClient()
    {
        return cimClient;
    }

    public void setCimClient(CIMClient cimClient)
    {
        this.cimClient = cimClient;
    }

    public void setSubnodes(Vector subnodes)
    {
        this.subnodes = subnodes;
    }

    public void setXmlconfigNode(TreenodeDocument.Treenode xmlconfigNode)
    {
        this.xmlconfigNode = xmlconfigNode;
    }

    /**
     * Returns where {@link TaskLauncherTreeNodeEventListener} have been registered for this node.
     * @return
     */
    public boolean hasEventListener()
    {
    	return !this.eventListener.isEmpty();
    }
    
    /**
     * Returns true if there are event listeners with action that take longer so that the frontend can show a wait indicator
     * @return
     */
    public boolean hasEventListenerWithLongrunningActions()
    {
    	for (Iterator iter = eventListener.iterator(); iter.hasNext();) {
			TaskLauncherTreeNodeEventListener listener = (TaskLauncherTreeNodeEventListener) iter.next();
			if (listener instanceof DeleteListener || listener instanceof EditListener)
			{
				return true;
			}
		}
    	return false;
    }

    public boolean hasCustomEventListener()
    {
    	for (Iterator iter = eventListener.iterator(); iter.hasNext();) {
			TaskLauncherTreeNodeEventListener listener = (TaskLauncherTreeNodeEventListener) iter.next();
			if (listener.isCustomListener())
				return true;
		}
    	return false;
    }

    /**
     * Passes an {@link TaskLauncherTreeNodeEvent} to all EventListeners of this node.
     * @param event
     * @throws WbemSmtException 
     */
    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemSmtException
    {
    	String result = null;
    	
    	int listenersWithReturnValue = 0;
    	
    	for (Iterator iter = eventListener.iterator(); iter.hasNext();) {
			TaskLauncherTreeNodeEventListener listener = (TaskLauncherTreeNodeEventListener) iter.next();
			String tmpResult = listener.processEvent(event);
			if (tmpResult != null && listener.isCustomListener())
			{
				result = tmpResult;
				listenersWithReturnValue++;
			}
        }
    	
    	if (listenersWithReturnValue == 1)
    	{
    		return result;
    	}
    	else
    	{
    		return null;
    	}
    }
    
    /**
     * Counts the Eventlisteners that are defined by User
     * @return
     */
    protected int countCustomEventListeners() {
		int count = 0;
		for (Iterator iter = eventListener.iterator(); iter.hasNext();) {
			TaskLauncherTreeNodeEventListener listener = (TaskLauncherTreeNodeEventListener) iter.next();
			if (listener.isCustomListener())
			{
				count++;
			}
		}
		return count;
	}

	/**
     * Adds an {@link TaskLauncherTreeNodeEventListener} to the node.
     * @param eventListener
     */
    public void addEventListener(TaskLauncherTreeNodeEventListener eventListener)
    {
        this.eventListener.add(eventListener);
    }
    
    /**
     * Adds a Vector of {@link TaskLauncherTreeNodeEventListener}s to the node.
     * @param eventListener
     */
    public void addEventListener(Set eventListener)
    {
    	this.eventListener.addAll(eventListener);
    }
        
    /**
     * Replaces the {@link TaskLauncherTreeNodeEventListener}s of the node with the Vector.
     * @param eventListener
     */
    public void setEventListener(Set eventListener)
    {
    	this.eventListener = eventListener;
    }

    /**
     * Adds an {@link TaskLauncherTreeNodeEventListener} to the node, identified by its classname.
     * Additional parameters will be passed to the EventListener.
     * 
     * @param eventListenerClass The classname of the {@link TaskLauncherTreeNodeEventListener}.
     * @param parameters Additional parameters which will be passes to the eventListener.
     */
    public void addEventListener(String eventListenerClass, Properties parameters)
    {
        try
        {
            Class listenerClass = Class.forName(eventListenerClass);
            TaskLauncherTreeNodeEventListener listener = (TaskLauncherTreeNodeEventListener) listenerClass.newInstance();
            if(parameters != null) listener.setParameters(parameters);
            this.eventListener.add(listener);
        }
        catch(ClassNotFoundException e)
        {
        	e.printStackTrace();
            logger.log(Level.SEVERE, "EventListener of class " + eventListenerClass + " not found.");
        }
        catch(IllegalAccessException e)
        {
        	e.printStackTrace();
            logger.log(Level.SEVERE, "Illegal Access while instantiating EventListener of class " + eventListenerClass);
        }
        catch(InstantiationException e)
        {
        	e.printStackTrace();
            logger.log(Level.SEVERE, "Error while instantiating EventListener of class " + eventListenerClass);
        }
        catch(ClassCastException e)
        {
        	e.printStackTrace();
            logger.log(Level.SEVERE, "Error while casting class " + eventListenerClass + " to an EventListener.");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	logger.log(Level.SEVERE, "Error while adding EventListener of class " + eventListenerClass);
        }
    }

    /**
     * adds an eventlistener for the specific instance of the xml defined event listener object
     * @param listener
     */
	public void addEventListener(EventListener listener) {
		
		Properties properties = new Properties();
		Param[] paramArray = listener.getParamArray();
		for (int i = 0; i < paramArray.length; i++) {
			Param param = paramArray[i];
			properties.put(param.getParamName(),param.getParamValue());
		}
		addEventListener(listener.getClassname(),properties);
	}
	    
    /**
     * Reads subnodes of the current node.
     * These subnodes are treenodes of the xml configuration.
     * @throws WbemSmtException 
     */
    public void readSubnodes() throws WbemSmtException
    {
    	readSubnodes(false);
    }
    
    /**
     * Reads subnodes of the current node.
     * These subnodes are treenodes of the xml configuration.
     * @throws WbemSmtException 
     */
    public void readSubnodes(boolean notifyEventListener) throws WbemSmtException
    {
    	this.subnodesRead = true;
        this.clearSubnodes();
        
        logger.log(Level.INFO, "Populating TreeNode " + this.name + " with " + this.xmlconfigNode.getTreenodeArray().length + " Subnodes");
        
        for (int i = 0; i < this.xmlconfigNode.getTreenodeArray().length; i++) {
			TreenodeDocument.Treenode configsubnode = this.xmlconfigNode.getTreenodeArray()[i];
			this.addSubnode(createNodeFromXML(cimClient, configsubnode,getTreeConfigData()));			
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
     * Creates a TaskLauncherTreeNode (which can be a {@link CIMInstanceNode} or {@link CIMClassNode} aswell) from a xml configuration node.
     * @param cimClient CIMClient to get information from
     * @param treenode XML Node to create the node from.
     * @return generated TaskLauncherTreeNode
     * @throws WbemSmtException 
     */
    static public TaskLauncherTreeNode createNodeFromXML(CIMClient cimClient, TreenodeDocument.Treenode treenode, TreeConfigData treeConfigData) throws ModelLoadException
    {
        TaskLauncherTreeNode subnode = null;
		try {
			subnode = null;
			String description;
			
			int type = TYPE_DEFAULT;
			
			// examine current xml node 
			// if the node contains a cimclass definition it's a cimclassnode
			
			// if there are more subclasses then add your check here....
			if(treenode.getCimclass() != null) type = TYPE_CIMCLASS;
			if(treenode.getCiminstance() != null) type = TYPE_CIMINSTANCE;
			
			switch(type)
			{
			case TYPE_CIMCLASS:
			    // create object path for the specified CIM Class
				CimclassDocument.Cimclass cimclassnode;	
				String className = null;
				String instanceNamingKey = null;
				boolean showInstances = false;
				int maxDepth = CIMClassNode.DEPTH_INFINITE;
				Association associationTarget = null;
				Filter filter = null;
				InstanceNamingClass namingClass = null;
				
				if((cimclassnode = treenode.getCimclass()) != null)
				{
					className = cimclassnode.getClassname();
			        if(className != null && className.trim().length() == 0) className = null; // empty classnames should be null to make cimclient enumerate all classes
			        
			        // check if maximum Depth is set; otherwise set to infinite
					maxDepth = cimclassnode.isSetDepth() ? cimclassnode.getDepth().intValue() : CIMClassNode.DEPTH_INFINITE; 
					showInstances = cimclassnode.getInstanceSubnodes() != null;
					instanceNamingKey = cimclassnode.getInstanceNamingKey();
					associationTarget = cimclassnode.getAssociation();
					filter = cimclassnode.getFilter();
					namingClass = cimclassnode.getInstanceNamingClass();
				}

				try
				{
			        CIMClass cimClass;
			        if(className != null)
			        {
			            cimClass = cimClient.getClass(new CIMObjectPath(className));
			            description = (treenode.getDescription() != null) ? treenode.getDescription() : cimClass.getName();
			        }
			        else
			        {
			            cimClass = null;
			            description = treenode.getDescription();
			        }
			        subnode = new CIMClassNode(cimClient, treenode, description, cimClass);
					subnode.setTreeConfigData(treeConfigData);
			        ((CIMClassNode) subnode).setMaxDepth(maxDepth);
			        ((CIMClassNode) subnode).setShowInstances(showInstances);
			        ((CIMClassNode) subnode).setInstanceNamingKey(instanceNamingKey);
			        ((CIMClassNode) subnode).setCimInstanceNaming(CIMInstanceNamingFactory.create(namingClass));
			        ((CIMClassNode) subnode).setFilter(CIMInstanceFilterFactory.create(filter));
			        if (associationTarget != null)
			        {
			        	((CIMClassNode) subnode).setAssociationSourceReferenceName(associationTarget.getSourceReferenceName());
			        	((CIMClassNode) subnode).setAssociationTargetReferenceName(associationTarget.getTargetReferenceName());
			        	((CIMClassNode) subnode).setAssociationTargetClassName(associationTarget.getTargetClassName());
			        }
			        subnode.createEventListener(treenode.getEventListenerArray());
			        
					// if xml subnode <instanceSubnodes> is set, we have to get all sub <treenode>s inside of this element
			        // and put them into the cimclass
					if(showInstances)
					{
						TreenodeDocument.Treenode[] instanceSubnodesConfig = cimclassnode.getInstanceSubnodes().getTreenodeArray();
						for(int i=0; i < instanceSubnodesConfig.length; i++)
						{
							// instance subnodes are just a kind of backup
							// they will be cloned and attached to every instance of this cimclass
							((CIMClassNode) subnode).addInstanceSubnode(createNodeFromXML(cimClient, instanceSubnodesConfig[i],subnode.getTreeConfigData()));
						}
						
						// there might also a context menu be set which has to be attach to every instance
						ContextmenuDocument.Contextmenu instanceMenu = cimclassnode.getInstanceSubnodes().getContextmenu();
						if(instanceMenu != null)
						{
							//TODO cache the Menu and clone the cached one for better performance 
							((CIMClassNode) subnode).setInstanceContextMenu((TaskLauncherContextMenu) new TaskLauncherContextMenu(instanceMenu,subnode.getTreeConfigData().getBundles()).clone());
						}
					}
				}
			    catch(Exception e)
			    {
			        subnode = new TaskLauncherTreeNode(cimClient, treenode);
					subnode.setTreeConfigData(treeConfigData);
					logger.log(Level.SEVERE,"Cannot load Node for class " + className,e);
					ModelLoadException modelLoadException = new ModelLoadException("Cannot load Node for class " + className,e);
					modelLoadException.setCimIdentifier(className);
					throw modelLoadException;
			    }
			    break;
			    
			case TYPE_CIMINSTANCE:
			    // create object path for the specified CIM Class
				CiminstanceDocument.Ciminstance ciminstancenode;	
				String instanceClassName = null;
				        	
				if((ciminstancenode = treenode.getCiminstance()) != null)
				{
					instanceClassName = ciminstancenode.getClassname();
				}

				try
				{
			        CIMInstance cimInstance;
			        if(instanceClassName != null)
			        {
			        	CIMObjectPath cop = new CIMObjectPath(instanceClassName);
			        	KeypropertyDocument.Keyproperty[] properties = ciminstancenode.getKeypropertyArray();
			        	for(int i = 0; i < properties.length; i++)
			        	{
			        		KeypropertyDocument.Keyproperty property = properties[i];
			        		
			        		// transform string data from configuration to correct object types
			        		if(property.getPropertyDatatype() != null)
			        		{
			        			CIMDataType dataType = CIMDataType.getDataType(property.getPropertyDatatype().toString(), false);
			        			Object value = TaskLauncherTreeNode.createTypeFromString(dataType.getType(), property.getPropertyValue());
			        			CIMValue cimValue = new CIMValue(value, dataType);
			        		
			        		
			        			cop.addKey(property.getPropertyName(), cimValue);
			        		}
			        	}
			        	try {
							cimInstance = cimClient.getInstance(cop);
						} catch (RuntimeException e) {
							System.err.println(cop != null ? cop.toString() : " -----------> null ");
							e.printStackTrace();
							throw e;
						}
			            
			            description = (treenode.getDescription() != null) ? treenode.getDescription() : cimInstance.getClassName();
			        }
			        else
			        {
			            cimInstance = null;
			            description = treenode.getDescription();
			        }
			        subnode = new CIMInstanceNode(cimClient, treenode, description, cimInstance);
					subnode.setTreeConfigData(treeConfigData);
			        subnode.createEventListener(treenode.getEventListenerArray());
				}
			    catch(Exception e)
			    {
			        subnode = new TaskLauncherTreeNode(cimClient, treenode);
					subnode.setTreeConfigData(treeConfigData);
					logger.log(Level.SEVERE,"Cannot load Node for instance " + instanceClassName,e);
					ModelLoadException modelLoadException = new ModelLoadException("Cannot load Node for instance " + instanceClassName,e);
					modelLoadException.setCimIdentifier(instanceClassName);
					throw modelLoadException;
			    }
				
				break;

			
			default: // could also be TYPE_DEFAULT
				subnode = new TaskLauncherTreeNode(cimClient, treenode);
				subnode.setTreeConfigData(treeConfigData);
				subnode.createEventListener(treenode.getEventListenerArray());
				break;
			}

			// add context menu
			// TODO cache the Menu and clone the cached one for better performance 
			try {
				String[] bundles = subnode.getTreeConfigData() != null ? subnode.getTreeConfigData().getBundles() : new String[]{"messages"};
				subnode.setContextMenu((TaskLauncherContextMenu) new TaskLauncherContextMenu(treenode.getContextmenu(),bundles).clone());
			} catch (CloneNotSupportedException e) {
				logger.log(Level.SEVERE,"Exception while setting ContextMenu ",e);
				throw new ModelLoadException("Exception while setting ContextMenu ",e);
			}
		} catch (Exception e) {
	        subnode = new TaskLauncherTreeNode(cimClient, treenode);
			subnode.setTreeConfigData(treeConfigData);
			ExceptionUtil.handleException(e);
		}
		return subnode;
        
		
    }
    
    /**
     * Create a simple TextNode
     * @param the name of the Node
     * @return
     */
	public static TaskLauncherTreeNode createSimpleTextNode(String nodeName) {
		return new SimpleTextTreeNode(nodeName);
	}
    
    
    public void setTreeConfigData(TreeConfigData treeConfigData) {
		this.treeConfigData = treeConfigData;
	}
    
	public TreeConfigData getTreeConfigData() {
		return treeConfigData;
	}

	public void setContextMenu(TaskLauncherContextMenu contextMenu)
    {
    	this.contextMenu = contextMenu;
    	if (contextMenu != null)
    	{
    		contextMenu.setNode(this);
    	}
    }
    
    public TaskLauncherContextMenu getContextMenu()
    {
    	return this.contextMenu;
    }
    
    /**
     * Creates EventListener from xml configuration data.
     * @param eventListenerArray Array of XML Bean data of EventListeners.
     * @return
     */
    protected void createEventListener(EventListenerDocument.EventListener[] eventListenerArray)
    {
    	for (int i = 0; i < eventListenerArray.length; i++) {
			EventListenerDocument.EventListener eventListener = eventListenerArray[i];
        	
        	if(eventListener.getClassname() != null)
        	{
        		logger.log(Level.FINE, "EventListener for " + getName() + ": " + eventListener.getClassname());
        		
        		// get param subelements an put them in a Properties list
        		Properties parameters = new Properties();
        		for (int j = 0; j < eventListener.getParamArray().length; j++) {
					ParamDocument.Param param = eventListener.getParamArray()[j];
        			parameters.setProperty(param.getParamName(), param.getParamValue());
        		}
        		addEventListener(eventListener.getClassname(), parameters);
        	}
        }
    }
    
    public Object clone()
    {
        try
        {
            TaskLauncherTreeNode cloned = (TaskLauncherTreeNode) super.clone();
            cloned.setSubnodes((Vector) this.subnodes.clone());
            cloned.setContextMenu((TaskLauncherContextMenu) (contextMenu != null ? contextMenu.clone() : null));
            if(this.hasXMLData()) cloned.setXmlconfigNode((TreenodeDocument.Treenode) this.xmlconfigNode.copy());
            cloned.setEventListener((Set) ((HashSet) this.eventListener).clone());
            
            return cloned;
        }
        catch(CloneNotSupportedException e)
        {
            logger.log(Level.SEVERE, "CloneNotSupportedException while cloning " + this.getClass().getName() + " named " + this.name);
            return null;
        }
        catch(Exception e)
        {
            logger.log(Level.SEVERE, "Error while cloning " + this.getClass().getName() + " named " + this.name + ": " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

	public ITaskLauncherTreeNode getParent() {
		return parent;
	}

	public void setParent(ITaskLauncherTreeNode parent) {
		this.parent = parent;
	}
    
	/**
	 * Returns an new instance of the datatype that is identified by the CIMDataType type id and assigns the value identified by the string.
	 * (i.e. null for CIMDataType.NULL, Unsigned8 for CIMDataType.UINT8 and so on). If the value type
	 * is undetermined or a conversion error occurs, a null pointer is returned.
	 */
	public static Object createTypeFromString(int type, String value)
	{
		try
		{
			switch(type) {
			case CIMDataType.UINT8: 
					return new UnsignedInt8(value);
				
			case CIMDataType.UINT16: 
					return new UnsignedInt16(value);
	
			case CIMDataType.UINT32: 
					return new UnsignedInt32(value);
	
			case CIMDataType.UINT64: 
					return new UnsignedInt64(value);
	
			case CIMDataType.SINT8: 
					return new Byte(value);
	
			case CIMDataType.SINT16: 
					return new Short(value);
	
			case CIMDataType.SINT32: 
					return new Integer(value);
	
			case CIMDataType.SINT64: 
					return new Long(value);
	
			case CIMDataType.STRING:
					return value;
	
			case CIMDataType.BOOLEAN:
					return new Boolean(value);
	
			case CIMDataType.REAL32:
					return new Float(value);
	
			case CIMDataType.REAL64:
					return new Double(value);
	
			case CIMDataType.DATETIME: 
					return new CIMSimpleDateTime(value);
	
			case CIMDataType.CHAR16:
					return new Character(value.charAt(0));
	
			case CIMDataType.REFERENCE:
					return new CIMObjectPath(value);
	
			case CIMDataType.NUMERIC:
					return new Numeric(value);
			}
		}
		catch(Exception e) {} // ignore conversion errors
		
		return null;	
	}

	/**
	 * find a classNode and give it back
	 * @param cim_class_name the Name of the class
	 * @param label the label of the classNode
	 */
	public ITaskLauncherTreeNode findClassNode(String cimClassName, String label) throws WbemSmtException
	{
		ITaskLauncherTreeNode result = findClassNodeImpl(cimClassName,label);
		if (result == null)
		{
    		logger.log(Level.SEVERE,"CimClassNode for class " + cimClassName + " with label " + label + " was not found");
    		throw new ModelLoadException("CimClassNode for class " + cimClassName + " with label " + label + " was not found");
		}
		return result;
	}

	/**
	 * find a classNode and give it back
	 * @param cim_class_name the Name of the class
	 * @param label the label of the classNode
	 * @throws WbemSmtException 
	 */
	public ITaskLauncherTreeNode findClassNode(CIMClassNode classNode) throws WbemSmtException {
		return findClassNode(classNode.getCIMClass().getName(),classNode.getName());
	}

	TaskLauncherTreeNode findClassNodeImpl(String cimClassName, String label) throws WbemSmtException {
		CIMClassNode clsNode = (CIMClassNode) this;
		if (clsNode.getCIMClass().getName().equals(cimClassName) && label.equals(clsNode.getName()))
		{
			return clsNode;
		}

		for (Iterator iter = getSubnodes().iterator(); iter.hasNext();) {
			ITaskLauncherTreeNode node = (ITaskLauncherTreeNode) iter.next();
			if (node instanceof CIMClassNode) {
				clsNode = (CIMClassNode) node;
				if (clsNode.getCIMClass().getName().equals(cimClassName) && label.equals(clsNode.getName()))
				{
					return clsNode;
				}
			}
		}
		//if not found go down the next Level of the tree
		for (Iterator iter = getSubnodes().iterator(); iter.hasNext();) {
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) iter.next();
			node = node.findClassNodeImpl(cimClassName,label);
			if (node != null)
			{
				return node;
			}
		}
		return null;
	}
	
	
	public List findInstanceNodes(String cimClassName) throws WbemSmtException {
		List result = new ArrayList();
		findInstanceNodes(cimClassName,result);
		return result;
	}

	void findInstanceNodes(String cimClassName, List result) throws WbemSmtException {
		if (this instanceof CIMInstanceNode) {
			CIMInstanceNode clsNode = (CIMInstanceNode) this;
			if (clsNode.getCimInstance().getClassName().equals(cimClassName))
			{
				result.add(clsNode);
			}
		}
		for (Iterator iter = getSubnodes().iterator(); iter.hasNext();) {
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) iter.next();
			node.findInstanceNodes(cimClassName,result);
		}
	}

	public TaskLauncherTreeNode findInstanceNode(CIMObjectPath path) throws WbemSmtException {
		if (this instanceof CIMInstanceNode) {
			CIMInstanceNode clsNode = (CIMInstanceNode) this;
			if (clsNode.getCimInstance().getObjectPath().equals(path))
			{
				return clsNode;
			}
		}

		for (Iterator iter = getSubnodes().iterator(); iter.hasNext();) {
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) iter.next();
			TaskLauncherTreeNode result = node.findInstanceNode(path);
			if (result != null)
			{
				return result;
			}
		}
		return null;
	}

	
	public void setCustomTreeConfig(CustomTreeConfig customTreeConfig) {
		this.customTreeConfig = customTreeConfig;
	}

	public CustomTreeConfig getCustomTreeConfig() {
		return customTreeConfig;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String click() {
        try {
			if(hasEventListener())
			{
			    TaskLauncherTreeNodeEvent treeNodeEvent = new TaskLauncherTreeNodeEvent(this, this, FacesContext.getCurrentInstance(), TaskLauncherTreeNodeEvent.TYPE_CLICKED);
				String result = processEvent(treeNodeEvent);
			    return result;
			}
		} catch (Exception e) {
			JsfUtil.handleException(e);
		}
		return null;
	}

	public String getInfo() {
		return TaskLauncherTreeNode.class.getName() + name;

	}

	public ITaskLauncherTreeNode findNode(ITaskLauncherTreeNode selectedNode) throws WbemSmtException {

		if (this instanceof CIMClassNode) {
			CIMClassNode classNode = (CIMClassNode) this;
			return findClassNode(classNode);
		}
		else if (this instanceof CIMInstanceNode) {
			CIMInstanceNode node = (CIMInstanceNode) this;
			return findInstanceNode(node.getCimInstance().getObjectPath());
		}
		else
		{
			logger.warning("Cannot search for Node from type " + (selectedNode != null ? selectedNode.getInfo() : "" + selectedNode));
		}
		
		return null;
	}

	public Set getEventListener() {
		return eventListener;
	}

	


	
	



}
