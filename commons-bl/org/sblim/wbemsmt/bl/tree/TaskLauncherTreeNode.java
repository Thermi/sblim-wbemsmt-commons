/**
 *  TaskLauncherTreeNode.java
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
 * Contributors: michael.bauschert@de.ibm.com
 *
 */

package org.sblim.wbemsmt.bl.tree;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.cim.*;
import javax.faces.context.FacesContext;
import javax.wbem.CloseableIterator;
import javax.wbem.WBEMException;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.GetClassException;
import org.sblim.wbemsmt.exception.impl.GetInstanceException;
import org.sblim.wbemsmt.exception.impl.userobject.GetClassUserObject;
import org.sblim.wbemsmt.exception.impl.userobject.GetInstanceUserObject;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherContextMenu;
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
    /**
     * logger
     */
    protected static final Logger logger = Logger.getLogger(TaskLauncherTreeNode.class.getName());
    
    
    /**
     * default type of a node
     */
    public static final int TYPE_DEFAULT = 1;
    
    /**
     * node represents a cim class
     */
    public static final int TYPE_CIMCLASS = 2;

    /**
     * node represents a cim instance
     */
    public static final int TYPE_CIMINSTANCE = 3;
    
    /**
     * map to store {@link CIMDataType} objects<br>
     * key: {@link Cimdatatype} enumeration objects. Example: {@link Cimdatatype#BOOLEAN}
     * value: the matching {@link CIMDataType}. Example: {@link CIMDataType#BOOLEAN_T}
     * 
     */
    protected static Map<Cimdatatype.Enum, CIMDataType> CIM_DATA_TYPES_BY_ENUM = new HashMap<Cimdatatype.Enum, CIMDataType>(); 
    
    /**
     * default text for no descriptions
     */
    protected static final String NO_DESCRIPTION = "(no description)";
    
    /**
     * the server connection
     */
    protected WBEMClient cimClient;
    
    /**
     * namespace used by the server connection to create this node
     */
    protected String namespace;
    
    /**
     * the children
     */
    protected Vector<ITaskLauncherTreeNode> subnodes;
    
    /**
     * name of the node
     */
    protected String name;
    
    /**
     * flag to indicate if the subnodes are already read
     */
    protected boolean subnodesRead = false;
    
    /**
     * flag to indicate if this node is enabked 
     */
    protected boolean enabled = true;
    
    /**
     * the configuration element from the tree.xml
     */
    protected TreenodeDocument.Treenode xmlconfigNode;
    
    /**
     * all event listener
     */
    protected Set<TaskLauncherTreeNodeEventListener> eventListener;
    
    /**
     * the context menue for this node
     */
    protected TaskLauncherContextMenu contextMenu;
    
    private ITaskLauncherTreeNode parent;

	private CustomTreeConfig customTreeConfig;

    private Map<String, Object> values;

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
     * @param cimClient the server connection
     * @param xmlconfigNode Representation of this node in the xml config, not null
     */
    public TaskLauncherTreeNode(WBEMClient cimClient, TreenodeDocument.Treenode xmlconfigNode)
    {
    	this(cimClient, xmlconfigNode, (xmlconfigNode != null && xmlconfigNode.getDescription() != null) ? xmlconfigNode.getDescription() : NO_DESCRIPTION);
    }

    /**
     * Constructs a Treenode with given name.
     * @param cimClient the server connection
     * @param xmlconfigNode Representation of this node in the xml config, can be null
     * @param name Display name of the node
     */
    public TaskLauncherTreeNode(WBEMClient cimClient, TreenodeDocument.Treenode xmlconfigNode, String name)
    {
        this.cimClient = cimClient;
        this.xmlconfigNode = xmlconfigNode;
        this.name = name;
        this.subnodes = new Vector<ITaskLauncherTreeNode>();
        this.eventListener = new HashSet<TaskLauncherTreeNodeEventListener>();
    }
    
	/**
     * Returns whether the current node was initialized with xml data.
     * @return true if the current node was initialized with xml data
     */
    public boolean hasXMLData()
    {
        return this.xmlconfigNode != null;
    }
    
    /**
     * Returns the xml data the current node was initialized with.
     * @return the xml data the current node was initialized with.
     */
    public TreenodeDocument.Treenode getXMLData()
    {
        return this.xmlconfigNode;
    }
    
    /**
     * Sets the display name of the current node.
     * @param name the display name
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
     * @return the display name
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Returns the plain name without formatting.
     * @return the plain name without formatting.
     */
    public final String getPlainName()
    {
        return this.name;
    }

    /**
     * Returns all subnodes of the current node.
     * @return all subnodes of the current node.
     * @throws WbemsmtException if reading the subnodes failed
     */
    public Vector<ITaskLauncherTreeNode> getSubnodes() throws WbemsmtException
    {
    	return getSubnodes(true);
    }
    
    /**
     * Returns all subnodes of the current node.
     * @param notifyEventListeners passes and Refresh-Event to all Listeners if set to true
     * @return the subnodes
     * @throws WbemsmtException  if reading the subnodes failed
     */
    public Vector<ITaskLauncherTreeNode> getSubnodes(boolean notifyEventListeners) throws WbemsmtException
    {
        if(!this.subnodesRead)
        {
            readSubnodes(notifyEventListeners);
        }
        return this.subnodes;
    }
    
    /**
     * Returns wether the current node has subnodes.
     * @return true if the current node has subnodes.
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
     * Adds a subnode to the current node. The subnode will be appended to the end.<br>
     * also set the current instance as parent of subnode
     * @param subnode the new node
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
     * @param reference the node to count the offset from
     * @param nodeToPaste the new node
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
     * @param reference node is pasted relative to the reference
     * @param nodeToPaste the node to paste
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
     * @param subnode node to delete
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
     * @param subnode xml subnode to delete
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
        	for (Iterator<TaskLauncherTreeNodeEventListener> iter = this.eventListener.iterator(); iter.hasNext();) {
				TaskLauncherTreeNodeEventListener eventListener = iter.next();
                EventListenerDocument.EventListener eventNode = node.addNewEventListener();
                eventNode.setClassname(eventListener.getClass().getName());
                Properties parameters = eventListener.getParameters();
                for (Iterator<Object> iterator = parameters.keySet().iterator(); iterator
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
    
    /**
     * the client where the data of this node is coming from
     * @return the client where the data of this node is coming from
     */

    public WBEMClient getCimClient()
    {
        return cimClient;
    }

    /**
     * set the client where the data of this node is coming from
     * @param cimClient  the client where the data of this node is coming from
     */
    public void setCimClient(WBEMClient cimClient)
    {
        this.cimClient = cimClient;
    }

    /**
     * the namespace from where the data of this node is coming from
     * @return the namespace from where the data of this node is coming from
     */
    public String getNamespace()
    {
    	if (namespace == null && cimClient != null)
    	{
    		namespace = WbemsmtSession.getSession().getCIMClientPool(cimClient).getNamespace(cimClient);
    	}
		return namespace;
    }

    /**
     * the namespace from where the data of this node is coming from
     * @param cimClient the client from where to get the namespace from
     * @return the namespace from where the data of this node is coming from
     * @see CIMClientPool#getNamespace(WBEMClient)
     */    
    public static String getNamespace(WBEMClient cimClient)
    {
    	return WbemsmtSession.getSession().getCIMClientPool(cimClient).getNamespace(cimClient);
    }

    /**
     * set the children
     * @param subnodes the children
     */
    public void setSubnodes(Vector<ITaskLauncherTreeNode> subnodes)
    {
        this.subnodes = subnodes;
    }

    /**
     * set the xml configuration
     * @param xmlconfigNode the xml configuration
     */
    public void setXmlconfigNode(TreenodeDocument.Treenode xmlconfigNode)
    {
        this.xmlconfigNode = xmlconfigNode;
    }

    /**
     * Returns true if {@link TaskLauncherTreeNodeEventListener} have been registered for this node.
     * @return true if there are event listeners
     */
    public boolean hasEventListener()
    {
    	return !this.eventListener.isEmpty();
    }
    
    /**
     * Returns true if there are event listeners with action that take longer so that the frontend can show a wait indicator
     * <br>
     * listeners with longrunning actions are {@link EditListener} and {@link DeleteListener} objects
     * @return true if there are some listeners with long running actions.
     */
    public boolean hasEventListenerWithLongrunningActions()
    {
    	for (Iterator<TaskLauncherTreeNodeEventListener> iter = eventListener.iterator(); iter.hasNext();) {
			TaskLauncherTreeNodeEventListener listener = (TaskLauncherTreeNodeEventListener) iter.next();
			if (listener instanceof DeleteListener || listener instanceof EditListener)
			{
				return true;
			}
		}
    	return false;
    }

    /**
     * check if there are event listeners that are custom listeners
     * @return true if there are custom listeners
     * @see TaskLauncherTreeNodeEventListener#isCustomListener()
     */
    public boolean hasCustomEventListener()
    {
    	for (Iterator<TaskLauncherTreeNodeEventListener> iter = eventListener.iterator(); iter.hasNext();) {
			TaskLauncherTreeNodeEventListener listener = (TaskLauncherTreeNodeEventListener) iter.next();
			if (listener.isCustomListener())
				return true;
		}
    	return false;
    }

    /**
     * Passes an {@link TaskLauncherTreeNodeEvent} to all EventListeners of this node.
     * @param event the event
     * @return the result that can be used as target for further navigation 
     * @throws WbemsmtException if passing the event failed 
     */
    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException
    {
    	String result = null;
    	
    	int listenersWithReturnValue = 0;
    	
    	TaskLauncherTreeNodeEventListener[] listeners = eventListener.toArray(new TaskLauncherTreeNodeEventListener[0]);

    	if (listeners.length > 0)
    	{
    		Arrays.sort(listeners, new TaskLauncherTreeNodeEventListenerComparator());

    		Level level = Level.INFO;
			if (logger.isLoggable(level))
    		{
    			StringBuffer sb = new StringBuffer("Execution Order: \n");

    			for (int i = 0; i < listeners.length; i++) {
    				TaskLauncherTreeNodeEventListener listener = (TaskLauncherTreeNodeEventListener) listeners[i];
//                        if (listener.getClass() != null && listener.getPriority() != null) {
//				if (listener != null) {
					sb.append("   ")
					  .append(listener.getClass().getName())
					  .append(" Priority: ")
					  .append(listener.getPriority().toString())
					  .append("\n");
					//			}
				}
    			logger.log(level,sb.toString());
    		}
    		
    		for (int i = 0; i < listeners.length; i++) {
    			TaskLauncherTreeNodeEventListener listener = (TaskLauncherTreeNodeEventListener) listeners[i];
				if (listener != null) {
    			String tmpResult = listener.processEvent(event);
    			if (tmpResult != null && listener.isCustomListener())
    			{
    				result = tmpResult;
    				listenersWithReturnValue++;
    			}			
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
     * @return the amount of custom listeners
     * @see TaskLauncherTreeNodeEventListener#isCustomListener()
     */
    protected int countCustomEventListeners() {
		int count = 0;
		for (Iterator<TaskLauncherTreeNodeEventListener> iter = eventListener.iterator(); iter.hasNext();) {
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
     * @param eventListener the event listener
     */
    public void addEventListener(TaskLauncherTreeNodeEventListener eventListener)
    {
        this.eventListener.add(eventListener);
    }
    
    /**
     * Adds a Vector of {@link TaskLauncherTreeNodeEventListener}s to the node.
     * @param eventListener the event listeners
     */
    public void addEventListener(Set<TaskLauncherTreeNodeEventListener> eventListener)
    {
    	this.eventListener.addAll(eventListener);
    }
        
    /**
     * Replaces the {@link TaskLauncherTreeNodeEventListener}s of the node with the Vector.
     * @param eventListener the event listeners
     */
    public void setEventListener(Set<TaskLauncherTreeNodeEventListener> eventListener)
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
            Class<?> listenerClass = Class.forName(eventListenerClass);
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
     * @param listener the listener to add
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
     * Reads subnodes of the current {@link CIMClass} which can be textnodes of the xml configuration ({@link TaskLauncherTreeNode}),
     * instances ({@link CIMInstanceNode}) or subclasses ({@link CIMClassNode}).
     * Instances are labeled according to the instanceNamingKey or to the cimInstanceNaming property.
     * @throws WbemsmtException if reading the nodes failed 
     */
    public void readSubnodes() throws WbemsmtException
    {
    	readSubnodes(false);
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
     * @param customTreeConfig the confifguration for this part of the tree
     * @return generated TaskLauncherTreeNode
     * @throws WbemsmtException if the creation failed 
     */
    public static TaskLauncherTreeNode createNodeFromXML(WBEMClient cimClient, TreenodeDocument.Treenode treenode, CustomTreeConfig customTreeConfig) throws WbemsmtException
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
				CimclassDocument.Cimclass cimclassnode = treenode.getCimclass();	
				String className = null;
				String instanceNamingKey = null;
				InitialObjectLoaderClass initialObjectLoader = null;
				boolean showInstances = false;
				int maxDepth = CIMClassNode.DEPTH_INFINITE;
				Association associationTarget = null;
				Filter filter = null;
				InstanceNamingClass namingClass = null;
				
				if(cimclassnode != null)
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
				CiminstanceDocument.Ciminstance ciminstancenode = treenode.getCiminstance();	
				String instanceClassName = null;
				        	
				if(ciminstancenode != null)
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
    
    /**
     * get the cimDataType by the given enumeration from the XML
     * @param cimDataType the enumeration from the xml
     * @return the cim data type
     */
    private static CIMDataType getCIMDataType(Enum cimDataType) {
		
    	
    	CIMDataType type = (CIMDataType) CIM_DATA_TYPES_BY_ENUM.get(cimDataType);
    	if (type == null)
    		throw new IllegalArgumentException(cimDataType.toString() + " is not supported.");
    	return type;
	}

	/**
     * Create a simple TextNode
     * @param nodeName the name of the Node
     * @return the next node
     */
	public static TaskLauncherTreeNode createSimpleTextNode(String nodeName) {
		return new SimpleTextTreeNode(nodeName);
	}
    
    
    /**
     * set the context menue of this node
     * @param contextMenu the context menue of this node
     */
	public void setContextMenu(TaskLauncherContextMenu contextMenu)
    {
    	this.contextMenu = contextMenu;
    	if (contextMenu != null)
    	{
    		contextMenu.setNode(this);
    	}
    }
    
    /**
     * get the context menue of this node
     * @return the context menue of this node
     */

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

    /**
     * clone the node
     * @return the copy of the node
     * @TODO Set<TaskLauncherTreeNodeEventListener> cannot be cloned. Original programmers caste it to HashSet to allow cloning. Is this safe?
     */
    @SuppressWarnings("unchecked")
	public Object clone()
    {
        try
        {
            TaskLauncherTreeNode cloned = (TaskLauncherTreeNode) super.clone();
            cloned.setSubnodes((Vector<ITaskLauncherTreeNode>) this.subnodes.clone());
            cloned.setContextMenu((TaskLauncherContextMenu) (contextMenu != null ? contextMenu.clone() : null));
            if(this.hasXMLData()) cloned.setXmlconfigNode((TreenodeDocument.Treenode) this.xmlconfigNode.copy());
            cloned.setEventListener((Set<TaskLauncherTreeNodeEventListener>) ((HashSet) this.eventListener).clone());

            
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

    /**
     * return the parent node
     * @return the parent
     */
    public ITaskLauncherTreeNode getParent() {
		return parent;
	}

    /**
     * set the parent node
     * @param node the parent
     */
    public void setParent(ITaskLauncherTreeNode node) {
		this.parent = node;
	}
    
	/**
	 * Returns an new instance of the datatype that is identified by the CIMDataType type id and assigns the value identified by the string.
	 * (i.e. null for CIMDataType.NULL, Unsigned8 for CIMDataType.UINT8 and so on). If the value type
	 * is undetermined or a conversion error occurs, a null pointer is returned.
	 * @param type the {@link CIMDataType}
	 * @param value the value
	 * @return the Type 
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
			default:
			        logger.severe("Type " + type + " is not supported");
			        return null;
			}
		}
		catch(Exception e) {} // ignore conversion errors
		
		return null;	
	}

    /**
     * find a class node
     * @param cimClassName name of the class
     * @param label the label of the class node
     * @return the class node
     * @throws WbemsmtException if the classnode was not found
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
     * find a class node
     * @param classNode the class node
     * @return the class node
     * @throws WbemsmtException if the classnode was not found
     */
	public ITaskLauncherTreeNode findClassNode(CIMClassNode classNode) throws WbemsmtException {
		return findClassNode(classNode.getCIMClass().getName(),classNode.getName());
	}

    /**
     * find a class node
     * @param cimClassName name of the class
     * @param label the label of the class node
     * @return the class node
     * @throws WbemsmtException if the classnode was not found
     */
	TaskLauncherTreeNode findClassNodeImpl(String cimClassName, String label) throws WbemsmtException {
		CIMClassNode clsNode = (CIMClassNode) this;
		if (clsNode.getCIMClass().getName().equals(cimClassName) && label.equals(clsNode.getName()))
		{
			return clsNode;
		}

		for (Iterator<ITaskLauncherTreeNode> iter = getSubnodes().iterator(); iter.hasNext();) {
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
		for (Iterator<ITaskLauncherTreeNode> iter = getSubnodes().iterator(); iter.hasNext();) {
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) iter.next();
			node = node.findClassNodeImpl(cimClassName,label);
			if (node != null)
			{
				return node;
			}
		}
		return null;
	}
	
	
    /**
     * find all instances that are representing this class
     * @param cimClassName name of the cim class
     * @return List with {@link ICIMInstanceNode} objects
     * @throws WbemsmtException  if getting the instance nodes failed
     * TODO add optional support for inheritence by checking the baseclasses of instances if they match with the cimClassName 
     */
	public List<ICIMInstanceNode> findInstanceNodes(String cimClassName) throws WbemsmtException {
		List<ICIMInstanceNode> result = new ArrayList<ICIMInstanceNode>();
		findInstanceNodes(cimClassName,result);
		return result;
	}

    /**
     * find all instances that are representing this class
     * @param cimClassName name of the cim class
     * @param result List with {@link ICIMInstanceNode} objects
     * @throws WbemsmtException
     * TODO add optional support for inheritence by checking the baseclasses of instances if they match with the cimClassName 
     */
	void findInstanceNodes(String cimClassName, List<ICIMInstanceNode> result) throws WbemsmtException {
		if (this instanceof CIMInstanceNode) {
			CIMInstanceNode clsNode = (CIMInstanceNode) this;
			if (clsNode.getCimInstance().getClassName().equals(cimClassName))
			{
				result.add(clsNode);
			}
		}
		
		Vector<ITaskLauncherTreeNode> subnodes2 = getSubnodes();
		for (int i=0; i < subnodes2.size(); i++)
		{
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) subnodes2.get(i);
			node.findInstanceNodes(cimClassName,result);
		}
	}
	
    /**
     * find all instances that are representing this class
     * @param instanceClass the fco class
     * @return List with {@link ICIMInstanceNode} objects
     * @throws WbemsmtException
     * TODO add optional support for inheritence by checking the baseclasses of instances if they match with the instanceClass 
     */

	public List<ICIMInstanceNode> findInstanceNodes(Class<?> instanceClass) throws WbemsmtException {
		List<ICIMInstanceNode> result = new ArrayList<ICIMInstanceNode>();
		findInstanceNodes(instanceClass,result);
		return result;
	}

    /**
     * Find instance nodes that are passing the instanceNodeFilter
     * @param instanceNodeFilter object to filter valid instances
     * @return list of {@link ICIMInstanceNode} objects
     * @throws WbemsmtException if getting the subnodes failed
     */
	public List<ICIMInstanceNode> findInstanceNodes(InstanceNodeFilter instanceNodeFilter) throws WbemsmtException {
        List<ICIMInstanceNode> result = new ArrayList<ICIMInstanceNode>();
        findInstanceNodes(instanceNodeFilter,result);
        return result;
    }

    /**
     * find all instances that are representing this class
     * @param instanceClass the fco class
     * @param result List with {@link ICIMInstanceNode} objects
     * @throws WbemsmtException
     * TODO add optional support for inheritence by checking the baseclasses of instances if they match with the instanceClass 
     */
    private void findInstanceNodes(Class<?> instanceClass, List<ICIMInstanceNode> result) throws WbemsmtException {

		if (this instanceof CIMInstanceNode) {
			CIMInstanceNode clsNode = (CIMInstanceNode) this;
			if (instanceClass.isAssignableFrom(clsNode.getCimObject().getClass()))
			{
				result.add(clsNode);
			}
		}
		Vector<ITaskLauncherTreeNode> subnodes2 = getSubnodes();
		for (int i=0; i < subnodes2.size(); i++)
		{
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) subnodes2.get(i);
			node.findInstanceNodes(instanceClass,result);
		}
	}

    /**
     * Find instance nodes that are passing the instanceNodeFilter
     * @param instanceNodeFilter object to filter valid instances
     * @param result result list of {@link ICIMInstanceNode} objects
     * @throws WbemsmtException if getting the subnodes failed
     */
    private void findInstanceNodes(InstanceNodeFilter instanceNodeFilter, List<ICIMInstanceNode> result) throws WbemsmtException {

        if (this instanceof CIMInstanceNode) {
            CIMInstanceNode clsNode = (CIMInstanceNode) this;
            if (instanceNodeFilter.accept(clsNode))
            {
                result.add(clsNode);
            }
        }
        Vector<ITaskLauncherTreeNode> subnodes2 = getSubnodes();
        for (int i=0; i < subnodes2.size(); i++)
        {
            TaskLauncherTreeNode node = (TaskLauncherTreeNode) subnodes2.get(i);
            node.findInstanceNodes(instanceNodeFilter,result);
        }
    }
    
    /**
     * find class nodes that are matching with the given name
     * @param cimClassName the name of the class to check
     * @return List with {@link ICIMClassNode} objects
     * @throws WbemsmtException if getting the classnodes failed
     */

    public List<ICIMClassNode> findClassNodes(String cimClassName) throws WbemsmtException {
		List<ICIMClassNode> result = new ArrayList<ICIMClassNode>();
		findClassNodes(cimClassName,result);
		return result;
	}

    /**
     * find class nodes that are matching with the given name
     * @param cimClassName the name of the class to check
     * @param result result lists where {@link ICIMClassNode} objects are added
     * @throws WbemsmtException if getting the classnodes failed
     */

    void findClassNodes(String cimClassName, List<ICIMClassNode> result) throws WbemsmtException {
		if (this instanceof CIMClassNode) {
			CIMClassNode clsNode = (CIMClassNode) this;
			if (clsNode.getCIMClass().getName().equals(cimClassName))
			{
				result.add(clsNode);
			}
		}
		Vector<ITaskLauncherTreeNode> subnodes2 = getSubnodes();
		for (int i=0; i < subnodes2.size(); i++)
		{
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) subnodes2.get(i);
			node.findClassNodes(cimClassName,result);
		}

	}

    /**
     * find an instance node with the given path
     * @param path the path to search
     * @return the instance node or null if the node was not found
     * @throws WbemsmtException  if getting the subnodes failed
     */
    public TaskLauncherTreeNode findInstanceNode(CIMObjectPath path) throws WbemsmtException {
		if (this instanceof CIMInstanceNode) {
			CIMInstanceNode clsNode = (CIMInstanceNode) this;
			if (clsNode.getCimInstance().getObjectPath().equals(path) || path != null && clsNode.getCimInstance().getObjectPath().toString().equals(path.toString()))
			{
				return clsNode;
			}
		}

		Vector<ITaskLauncherTreeNode> subnodes2 = getSubnodes();
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

    /**
     * set the tree configuration of this node
     * @param customTreeConfig the configuration
     */	
	public void setCustomTreeConfig(CustomTreeConfig customTreeConfig) {
		this.customTreeConfig = customTreeConfig;
	}

    /**
     * get the tree configuration 
     * @return the configuration
     */
	public CustomTreeConfig getCustomTreeConfig() {
		if (customTreeConfig == null && parent != null)
		{
			customTreeConfig = parent.getCustomTreeConfig();
		}
		return customTreeConfig;
	}

	
	
    /**
     * check if the node is enabled
     * @return true if the node is enabled
     */
	public boolean isEnabled() {
		return enabled;
	}

    /**
     * enable/disable the node
     * @param enabled true for enabling the node
     */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

    /**
     * click the tree node and trigger the listeners and revert the current data
     * @return the outcome for further navigation
     */
	public String click() {
		return click(true);
	}

    /**
     * click the tree node and trigger the listeners
     * @param revert revert the current data ?
     * @return the outcome for further navigation
     */
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

    /**
     * get a short information text about this node<br>
     * for that class: classname + node name
     * @return informational text
     */
	public String getInfo() {
		return TaskLauncherTreeNode.class.getName() + name;

	}

    /**
     * find a node
     * @param selectedNode node to find
     * @return the node or null if treeNode is neither a {@link ICIMInstanceNode} nor a {@link ICIMClassNode}
     * @throws WbemsmtException if the node was not found
     */

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

    /**
     * get the eventlisteners
     * @return set with {@link TaskLauncherTreeNodeEventListener} objects
     */
	public Set<TaskLauncherTreeNodeEventListener> getEventListener() {
		return eventListener;
	}

	
    /**
     * get the root node of this node
     * @return the root node
     * @throws WbemsmtException if getting the root node failed
     */

	public ITaskLauncherTreeNode getRootNode() throws WbemsmtException {
		ITaskLauncherTreeNode parent = this;
		while (parent.getParent() != null)
		{
			parent = parent.getParent();
		}
		return parent;
	}

    /**
     * find nodes by the given node name
     * @param name the name of the node (the caption)
     * @return list with {@link ITaskLauncherTreeNode} objects
     * @throws WbemsmtException if getting the subnodes failed
     */
	public List<ITaskLauncherTreeNode> findNodesByName(String name) throws WbemsmtException {
		List<ITaskLauncherTreeNode> result = new ArrayList<ITaskLauncherTreeNode> ();
		findNodesByName(name, result);
		return result;
	}

    /**
     * find nodes by the given node name
     * @param name the name of the node (the caption)
     * @param result  result list with {@link ITaskLauncherTreeNode} objects
     * @throws WbemsmtException if getting the subnodes failed
     */
	private void findNodesByName(String name,List<ITaskLauncherTreeNode> result) throws WbemsmtException {

		if (name.equalsIgnoreCase(getName()))
		{
			result.add(this);
		}

		Vector<ITaskLauncherTreeNode>  subnodes2 = getSubnodes();
		for (int i=0; i < subnodes2.size(); i++)
		{
			TaskLauncherTreeNode node = (TaskLauncherTreeNode) subnodes2.get(i);
			node.findNodesByName(name,result);
		}
	}

	/**
	 * check if the subnodes are already read
	 * @return true if the subnodes are already read
	 */
	public boolean isSubnodesRead() {
		return subnodesRead;
	}

	/**
	 * check if the Iterator carries a exception (Really does nothing and is only for convenience - is overwritten by 
	 * checkException(CloseableIterator iterator, boolean silent)
	 * @param iterator the iterator to check for an exception
	 * @param silent if !silent a exception is thrown if the iterator carries one
	 * @throws WbemsmtException thrown if not silent and the {@link CloseableIterator} carries an exception
	 */
	protected void checkException(Iterator<?> iterator, boolean silent) throws WbemsmtException {
	}
	
	/**
	 * check if the Iterator carries a exception
	 * @param iterator the iterator from cim context
	 * @param silent if !silent a exception is thrown if the iterator carries one
	 * @throws WbemsmtException thrown if not silent and the {@link CloseableIterator} carries an exception
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

    /**
     * get the userdefined value
     * @param key the key of the value
     * @return the value or null if no value exists
     */
    public Object getValue(String key)
    {
        return values != null ? values.get(key) : null;
    }
    
    /**
     * set a userdefined value to be used later in the business logic
     * @param key the key to find the value later
     * @param value the value
     */
    public void setValue(String key, Object value)
    {
        if (values == null)
        {
            values = new HashMap<String, Object>();
        }
        values.put(key,value);
    }
	
	



}
