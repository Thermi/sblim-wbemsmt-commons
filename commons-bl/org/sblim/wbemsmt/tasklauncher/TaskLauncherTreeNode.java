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

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.cim.*;
import javax.faces.context.FacesContext;
import javax.wbem.CloseableIterator;
import javax.wbem.WBEMException;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.InstanceNodeFilter;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListener;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.GetClassException;
import org.sblim.wbemsmt.exception.impl.GetInstanceException;
import org.sblim.wbemsmt.exception.impl.userobject.GetClassUserObject;
import org.sblim.wbemsmt.exception.impl.userobject.GetInstanceUserObject;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.*;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.AssociationDocument.Association;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.Cimdatatype.Enum;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.EventListenerDocument.EventListener;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.FilterDocument.Filter;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.InitialObjectLoaderClassDocument.InitialObjectLoaderClass;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.InstanceNamingClassDocument.InstanceNamingClass;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ParamDocument.Param;
import org.sblim.wbemsmt.tasklauncher.event.DeleteListener;
import org.sblim.wbemsmt.tasklauncher.event.EditListener;
import org.sblim.wbemsmt.tasklauncher.filter.CIMInstanceFilterFactory;
import org.sblim.wbemsmt.tasklauncher.initialobjectloading.WbemsmtInitialObjectLoaderFactory;
import org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNamingFactory;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

/**
 * Basic Node for the navigation tree.
 * @author Marius Kreis
 */
public class TaskLauncherTreeNode implements Cloneable, ITaskLauncherTreeNode
{
    protected static final Logger logger = Logger.getLogger(TaskLauncherTreeNode.class.getName());
    
    public static final int TYPE_DEFAULT = 1,
    				  		TYPE_CIMCLASS = 2,
    				  		TYPE_CIMINSTANCE = 3;
    
    protected static Map CIM_DATA_TYPES_BY_ENUM = new HashMap(); 
    
    protected static final String NO_DESCRIPTION = "(no description)";
    
    protected WBEMClient cimClient;
    protected String namespace;
    protected Vector subnodes;
    protected String name;
    protected boolean subnodesRead = false;
    protected boolean enabled = true;
    protected TreenodeDocument.Treenode xmlconfigNode;
    protected Set eventListener;
    protected TaskLauncherContextMenu contextMenu;
    
    private ITaskLauncherTreeNode parent;

	private CustomTreeConfig customTreeConfig;

    private Map values;

	//private TreeConfigData treeConfigData;

	static
	{
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.BOOLEAN,CIMDataType.BOOLEAN_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.DATETIME,CIMDataType.DATETIME_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.STRING,CIMDataType.STRING_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.CHAR_16,CIMDataType.CHAR16_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.REAL_32,CIMDataType.REAL32_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.REAL_64,CIMDataType.REAL64_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.SINT_8,CIMDataType.BOOLEAN_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.SINT_16,CIMDataType.BOOLEAN_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.SINT_32,CIMDataType.BOOLEAN_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.SINT_64,CIMDataType.BOOLEAN_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.UINT_8,CIMDataType.UINT8_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.UINT_16,CIMDataType.UINT16_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.UINT_32,CIMDataType.UINT32_T);	
		CIM_DATA_TYPES_BY_ENUM.put(Cimdatatype.UINT_64,CIMDataType.UINT64_T);	
	}
	
    /**
     * Constructs a Treenode, Name will be taken from xmlconfigNode's description.
     * @param cimClient
     * @param xmlconfigNode Representation of this node in the xml config, not null
     */
    public TaskLauncherTreeNode(WBEMClient cimClient, TreenodeDocument.Treenode xmlconfigNode)
    {
    	this(cimClient, xmlconfigNode, (xmlconfigNode != null && xmlconfigNode.getDescription() != null) ? xmlconfigNode.getDescription() : NO_DESCRIPTION);
    }

    /**
     * Constructs a Treenode with given name.
     * @param cimClient
     * @param xmlconfigNode Representation of this node in the xml config, can be null
     * @param name Display name of the node
     */
    public TaskLauncherTreeNode(WBEMClient cimClient, TreenodeDocument.Treenode xmlconfigNode, String name)
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
     * Returns the plain name without formatting.
     * @return
     */
    public final String getPlainName()
    {
        return this.name;
    }

    /**
     * Returns all subnodes of the current node.
     * @return
     * @throws WbemsmtException 
     */
    public Vector getSubnodes() throws WbemsmtException
    {
    	return getSubnodes(true);
    }
    
    /**
     * Returns all subnodes of the current node.
     * @param notifyEventListeners passes and Refresh-Event to all Listeners if set to true
     * @return
     * @throws WbemsmtException 
     */
    public Vector getSubnodes(boolean notifyEventListeners) throws WbemsmtException
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
        return(this.subnodes != null && !this.subnodes.isEmpty());
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
    	subnode.setCustomTreeConfig(customTreeConfig);
        this.subnodes.add(subnode);
        
    }
    
    /**
     * Adds a subnode to the current node at a given position, relative to the reference.
     * If the parent has xml data the new node will be added to this aswell.
     * @param reference
     * @param nodeToPaste
     * @param offset relative position to the reference.
     */
    public void insertSubnode(ITaskLauncherTreeNode reference, ITaskLauncherTreeNode nodeToPaste, int offset)
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
    private void pasteXMLSubnode(ITaskLauncherTreeNode reference, ITaskLauncherTreeNode nodeToPaste, int offset)
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
    
    public WBEMClient getCimClient()
    {
        return cimClient;
    }

    public void setCimClient(WBEMClient cimClient)
    {
        this.cimClient = cimClient;
    }

    public String getNamespace()
    {
    	if (namespace == null && cimClient != null)
    	{
    		namespace = WbemsmtSession.getSession().getCIMClientPool(cimClient).getNamespace(cimClient);
    	}
		return namespace;
    }

    public static String getNamespace(WBEMClient cimClient)
    {
    	return WbemsmtSession.getSession().getCIMClientPool(cimClient).getNamespace(cimClient);
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
     * @throws WbemsmtException 
     */
    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException
    {
    	String result = null;
    	
    	int listenersWithReturnValue = 0;
    	
    	Object[] listeners = eventListener.toArray();
    	
    	if (listeners.length > 0)
    	{
    		Arrays.sort(listeners, new TaskLauncherTreeNodeEventListenerComparator());

    		Level level = Level.INFO;
			if (logger.isLoggable(level))
    		{
    			StringBuffer sb = new StringBuffer("Execution Order: \n");
    			for (int i = 0; i < listeners.length; i++) {
    				TaskLauncherTreeNodeEventListener listener = (TaskLauncherTreeNodeEventListener) listeners[i];
					sb.append("   ")
					  .append(listener.getClass().getName())
					  .append(" Priority: ")
					  .append(listener.getPriority().toString())
					  .append("\n");
				}
    			logger.log(level,sb.toString());
    		}
    		
    		for (int i = 0; i < listeners.length; i++) {
    			TaskLauncherTreeNodeEventListener listener = (TaskLauncherTreeNodeEventListener) listeners[i];
    			String tmpResult = listener.processEvent(event);
    			if (tmpResult != null && listener.isCustomListener())
    			{
    				result = tmpResult;
    				listenersWithReturnValue++;
    			}			
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
     * @throws WbemsmtException 
     */
    public void readSubnodes() throws WbemsmtException
    {
    	readSubnodes(false);
    }
    
    /**
     * Reads subnodes of the current node.
     * These subnodes are treenodes of the xml configuration.
     * @throws WbemsmtException 
     */
    public void readSubnodes(boolean notifyEventListener) throws WbemsmtException
    {
    	this.subnodesRead = true;
        this.clearSubnodes();
        
        logger.log(Level.INFO, "Populating TreeNode " + this.name + " with " + this.xmlconfigNode.getTreenodeArray().length + " Subnodes");
        
        for (int i = 0; i < this.xmlconfigNode.getTreenodeArray().length; i++) {
			TreenodeDocument.Treenode configsubnode = this.xmlconfigNode.getTreenodeArray()[i];
			this.addSubnode(createNodeFromXML(cimClient, configsubnode,getCustomTreeConfig()));			
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
     * @param cimClient WBEMClient to get information from
     * @param treenode XML Node to create the node from.
     * @return generated TaskLauncherTreeNode
     * @throws WbemsmtException 
     */
    static public TaskLauncherTreeNode createNodeFromXML(WBEMClient cimClient, TreenodeDocument.Treenode treenode, CustomTreeConfig customTreeConfig) throws WbemsmtException
    {
        String namespace = getNamespace(cimClient);
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
				InitialObjectLoaderClass initialObjectLoader = null;
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
					initialObjectLoader = showInstances ? cimclassnode.getInstanceSubnodes().getInitialObjectLoaderClass() : null; 
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
			            CIMObjectPath objectPath = new CIMObjectPath(className,namespace);
			            try
			            {
                            cimClass = cimClient.getClass(objectPath,false,true,false,null);
			            }
			            catch (WBEMException e)
			            {
			                throw new GetClassException(e, new GetClassUserObject(objectPath));
			            }
			            description = (treenode.getDescription() != null) ? treenode.getDescription() : cimClass.getName();
			        }
			        else
			        {
			            cimClass = null;
			            description = treenode.getDescription();
			        }
			        subnode = new CIMClassNode(cimClient, treenode, description, cimClass);
					subnode.setCustomTreeConfig(customTreeConfig);
			        ((CIMClassNode) subnode).setMaxDepth(maxDepth);
			        ((CIMClassNode) subnode).setShowInstances(showInstances);
			        ((CIMClassNode) subnode).setInstanceNamingKey(instanceNamingKey);
			        ((CIMClassNode) subnode).setCimInstanceNaming(CIMInstanceNamingFactory.create(namingClass));
			        ((CIMClassNode) subnode).setInitialObjectLoader(WbemsmtInitialObjectLoaderFactory.create(initialObjectLoader));
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
							((CIMClassNode) subnode).addInstanceSubnode(createNodeFromXML(cimClient, instanceSubnodesConfig[i],subnode.getCustomTreeConfig()));
						}
						
						// there might also a context menu be set which has to be attach to every instance
						ContextmenuDocument.Contextmenu instanceMenu = cimclassnode.getInstanceSubnodes().getContextmenu();
						if(instanceMenu != null)
						{
							//For better peformance cache the Menu and clone the cached one for better performance 
							((CIMClassNode) subnode).setInstanceContextMenu((TaskLauncherContextMenu) new TaskLauncherContextMenu(instanceMenu,subnode.getCustomTreeConfig().getTreeConfigData().getBundles()).clone());
						}
					}
				}
			    catch(WbemsmtException e)
			    {
			        subnode = new TaskLauncherTreeNode(cimClient, treenode);
					subnode.setCustomTreeConfig(customTreeConfig);
					logger.log(Level.SEVERE,"Cannot load Node for class " + className,e);
					WbemsmtException modelLoadException = new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Cannot load Node for class " + className,e);
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

				CIMObjectPath cop = null;
				CIMInstance cimInstance;
			        if(instanceClassName != null)
			        {
			        	KeypropertyDocument.Keyproperty[] properties = ciminstancenode.getKeypropertyArray();
			        	CIMProperty[] keysProperties = new CIMProperty[properties.length];
			        	
			        	for(int i = 0; i < properties.length; i++)
			        	{
			        		KeypropertyDocument.Keyproperty property = properties[i];
			        		
		        			CIMDataType dataType = getCIMDataType(property.getPropertyDatatype());
		        			Object value = TaskLauncherTreeNode.createTypeFromString(dataType.getType(), property.getPropertyValue());
		        			keysProperties[i] = new CIMProperty(property.getPropertyName(),dataType,value); 
			        	}
			        	cop = new CIMObjectPath(instanceClassName,namespace,keysProperties);
						try {
                            cimInstance = cimClient.getInstance(cop,false,false,null);
                        }
                        catch (WBEMException e) {
                            throw new GetInstanceException(e, new GetInstanceUserObject(cop,false,false,null));
                        }
			            
			            description = (treenode.getDescription() != null) ? treenode.getDescription() : cimInstance.getClassName();
			        }
			        else
			        {
			            cimInstance = null;
			            description = treenode.getDescription();
			        }
			        subnode = new CIMInstanceNode(cimClient, treenode, description, cimInstance);
					subnode.setCustomTreeConfig(customTreeConfig);
			        subnode.createEventListener(treenode.getEventListenerArray());
				
				break;

			
			default: // could also be TYPE_DEFAULT
				subnode = new TaskLauncherTreeNode(cimClient, treenode);
				subnode.setCustomTreeConfig(customTreeConfig);
				subnode.createEventListener(treenode.getEventListenerArray());
				break;
			}

			// add context menu
			// For better peformance cache the Menu and clone the cached one for better performance 
			try {
				String[] bundles = subnode.getCustomTreeConfig() != null && subnode.getCustomTreeConfig().getTreeConfigData() != null ? subnode.getCustomTreeConfig().getTreeConfigData().getBundles() : new String[]{"messages"};
				subnode.setContextMenu((TaskLauncherContextMenu) new TaskLauncherContextMenu(treenode.getContextmenu(),bundles).clone());
			} catch (CloneNotSupportedException e) {
				logger.log(Level.SEVERE,"Exception while setting ContextMenu ",e);
				throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Exception while setting ContextMenu ",e);
			}
		}
		catch (WbemsmtException e)
        {
            throw e;
        }
		catch (Exception e) {
	        subnode = new TaskLauncherTreeNode(cimClient, treenode);
			subnode.setCustomTreeConfig(customTreeConfig);
			ExceptionUtil.handleException(e);
		}
		return subnode;
        
		
    }
    
    private static CIMDataType getCIMDataType(Enum cimDataType) {
		
    	
    	CIMDataType type = (CIMDataType) CIM_DATA_TYPES_BY_ENUM.get(cimDataType);
    	if (type == null)
    		throw new IllegalArgumentException(cimDataType.toString() + " is not supported.");
    	return type;
	}

	/**
     * Create a simple TextNode
     * @param the name of the Node
     * @return
     */
	public static TaskLauncherTreeNode createSimpleTextNode(String nodeName) {
		return new SimpleTextTreeNode(nodeName);
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
					return new UnsignedInteger8(value);
				
			case CIMDataType.UINT16: 
					return new UnsignedInteger16(value);
	
			case CIMDataType.UINT32: 
					return new UnsignedInteger32(value);
	
			case CIMDataType.UINT64: 
					return new UnsignedInteger64(value);
	
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
				if (value.toString().indexOf(":") > -1)
				{
					return new CIMDateTimeInterval(value);
				}
				else
				{
					return new CIMDateTimeAbsolute(value);
				}
	
			case CIMDataType.REFERENCE:
					return new CIMObjectPath(value);
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
	public ITaskLauncherTreeNode findClassNode(String cimClassName, String label) throws WbemsmtException
	{
		ITaskLauncherTreeNode result = findClassNodeImpl(cimClassName,label);
		if (result == null)
		{
    		logger.log(Level.SEVERE,"CimClassNode for class " + cimClassName + " with label " + label + " was not found");
    		throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"CimClassNode for class " + cimClassName + " with label " + label + " was not found");
		}
		return result;
	}

	/**
	 * find a classNode and give it back
	 * @param cim_class_name the Name of the class
	 * @param label the label of the classNode
	 * @throws WbemsmtException 
	 */
	public ITaskLauncherTreeNode findClassNode(CIMClassNode classNode) throws WbemsmtException {
		return findClassNode(classNode.getCIMClass().getName(),classNode.getName());
	}

	TaskLauncherTreeNode findClassNodeImpl(String cimClassName, String label) throws WbemsmtException {
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
	
	
	public List findInstanceNodes(String cimClassName) throws WbemsmtException {
		List result = new ArrayList();
		findInstanceNodes(cimClassName,result);
		return result;
	}

	void findInstanceNodes(String cimClassName, List result) throws WbemsmtException {
		if (this instanceof CIMInstanceNode) {
			CIMInstanceNode clsNode = (CIMInstanceNode) this;
			if (clsNode.getCimInstance().getClassName().equals(cimClassName))
			{
				result.add(clsNode);
			}
		}
		
		Vector subnodes2 = getSubnodes();
		for (int i=0; i < subnodes2.size(); i++)
		{
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) subnodes2.get(i);
			node.findInstanceNodes(cimClassName,result);
		}
	}
	
	public List findInstanceNodes(Class instanceClass) throws WbemsmtException {
		List result = new ArrayList();
		findInstanceNodes(instanceClass,result);
		return result;
	}

    public List findInstanceNodes(InstanceNodeFilter instanceNodeFilter) throws WbemsmtException {
        List result = new ArrayList();
        findInstanceNodes(instanceNodeFilter,result);
        return result;
    }

    private void findInstanceNodes(Class instanceClass, List result) throws WbemsmtException {

		if (this instanceof CIMInstanceNode) {
			CIMInstanceNode clsNode = (CIMInstanceNode) this;
			if (instanceClass.isAssignableFrom(clsNode.getCimObject().getClass()))
			{
				result.add(clsNode);
			}
		}
		Vector subnodes2 = getSubnodes();
		for (int i=0; i < subnodes2.size(); i++)
		{
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) subnodes2.get(i);
			node.findInstanceNodes(instanceClass,result);
		}
	}

    private void findInstanceNodes(InstanceNodeFilter filter, List result) throws WbemsmtException {

        if (this instanceof CIMInstanceNode) {
            CIMInstanceNode clsNode = (CIMInstanceNode) this;
            if (filter.accept(clsNode))
            {
                result.add(clsNode);
            }
        }
        Vector subnodes2 = getSubnodes();
        for (int i=0; i < subnodes2.size(); i++)
        {
            TaskLauncherTreeNode node = (TaskLauncherTreeNode) subnodes2.get(i);
            node.findInstanceNodes(filter,result);
        }
    }
    
	public List findClassNodes(String cimClassName) throws WbemsmtException {
		List result = new ArrayList();
		findClassNodes(cimClassName,result);
		return result;
	}

	void findClassNodes(String cimClassName, List result) throws WbemsmtException {
		if (this instanceof CIMClassNode) {
			CIMClassNode clsNode = (CIMClassNode) this;
			if (clsNode.getCIMClass().getName().equals(cimClassName))
			{
				result.add(clsNode);
			}
		}
		Vector subnodes2 = getSubnodes();
		for (int i=0; i < subnodes2.size(); i++)
		{
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) subnodes2.get(i);
			node.findClassNodes(cimClassName,result);
		}

	}

	public TaskLauncherTreeNode findInstanceNode(CIMObjectPath path) throws WbemsmtException {
		if (this instanceof CIMInstanceNode) {
			CIMInstanceNode clsNode = (CIMInstanceNode) this;
			if (clsNode.getCimInstance().getObjectPath().equals(path) || path != null && clsNode.getCimInstance().getObjectPath().toString().equals(path.toString()))
			{
				return clsNode;
			}
		}

		Vector subnodes2 = getSubnodes();
		for (int i=0; i < subnodes2.size(); i++)
		{
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) subnodes2.get(i);
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
		if (customTreeConfig == null && parent != null)
		{
			customTreeConfig = parent.getCustomTreeConfig();
		}
		return customTreeConfig;
	}

	
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String click() {
		return click(true);
	}

	public String click(boolean revert) {
        try {
			if(hasEventListener())
			{
			    TaskLauncherTreeNodeEvent treeNodeEvent = new TaskLauncherTreeNodeEvent(this, this, FacesContext.getCurrentInstance(), TaskLauncherTreeNodeEvent.TYPE_CLICKED);
			    treeNodeEvent.addParameter(TaskLauncherTreeNodeEvent.PARAM_REVERT, revert);
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

	public ITaskLauncherTreeNode findNode(ITaskLauncherTreeNode selectedNode) throws WbemsmtException {

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

	
	public ITaskLauncherTreeNode getRootNode() throws WbemsmtException {
		ITaskLauncherTreeNode parent = this;
		while (parent.getParent() != null)
		{
			parent = parent.getParent();
		}
		return parent;
	}

	public List findNodesByName(String name) throws WbemsmtException {
		List result = new ArrayList();
		findNodesByName(name, result);
		return result;
	}

	public void findNodesByName(String name,List result) throws WbemsmtException {

		if (name.equalsIgnoreCase(getName()))
		{
			result.add(this);
		}

		Vector subnodes2 = getSubnodes();
		for (int i=0; i < subnodes2.size(); i++)
		{
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) subnodes2.get(i);
			node.findNodesByName(name,result);
		}
	}

	public boolean isSubnodesRead() {
		return subnodesRead;
	}

	/**
	 * check if the Iterator carries a exception (Really does nothing and is only for convenience - is overwritten by 
	 * checkException(CloseableIterator iterator, boolean silent)
	 * @param iterator
	 * @param silent if !silent a exception is thrown if the iterator carries one
	 * @throws WbemsmtException
	 */
	protected void checkException(Iterator iterator, boolean silent) throws WbemsmtException {
	}
	
	/**
	 * check if the Iterator carries a exception
	 * @param iterator
	 * @param silent if !silent a exception is thrown if the iterator carries one
	 * @throws WbemsmtException
	 */
	protected void checkException(CloseableIterator iterator, boolean silent) throws WbemsmtException {
		WBEMException exception = iterator.getWBEMException();
		if (exception != null)
		{
			logger.log(Level.SEVERE,"Exception during iteration of a cim collection",exception);
			if (!silent)
			{
				throw new WbemsmtException(WbemsmtException.ERR_CIM_ITERATION, exception);
			}
		}
	}

    public Object getValue(String key)
    {
        return values != null ? values.get(key) : null;
    }
    
    public void setValue(String key, Object value)
    {
        if (values == null)
        {
            values = new HashMap();
        }
        values.put(key,value);
    }
	
	



}
