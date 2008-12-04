 /** 
  * AbstractBaseCimAdapter.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Baseclass for all WebmSmt-CIM-Adapters
  * 
  */

package org.sblim.wbemsmt.bl.adapter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.cim.CIMClass;
import javax.cim.CIMObjectPath;
import javax.faces.context.FacesContext;
import javax.wbem.client.WBEMClient;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.bl.adapter.refresh.RemoveDataContainerThread;
import org.sblim.wbemsmt.bl.cleanup.Cleanup;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFcoHelper;
import org.sblim.wbemsmt.bl.fco.FcoHelper;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.tree.CustomTreeConfig;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.cim.CIMClientPool;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.ConfigurationValueData;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.LocaleChangeListener;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.tools.validator.Validator;
import org.sblim.wbemsmt.tools.wizard.WizardBase;
import org.sblim.wbemsmt.webapp.jsf.LocaleManagerBean;

/**
 * Baseclass for all WebmSmt-CIM-Adapters
 */
public abstract class AbstractBaseCimAdapter implements CimAdapterDelegator,LocaleChangeListener,Cleanup {

    /**
     * used if the adaper is currently in edit mode
     */
	public static final int ACTIVE_EDIT = 0;
    /**
     * used if the adaper is currently in wizard mode
     */
	public static final int ACTIVE_WIZARD = 1;
	
	/**
	 * The Object to synchronize Refresh-Threads on
	 */
	private Object refreshMedium = "";
	
	/**
	 * the logger
	 */
	static Logger logger = Logger.getLogger(AbstractBaseCimAdapter.class.getName());	
	
	/**
	 * the connection to the server
	 * @see #getCimClient()
	 */
	protected WBEMClient cimClient;
	
	/**
	 * installed validators
	 * @see #installValidators(DataContainer)
	 * @see #addValidator(DataContainer, Validator)
	 * @see Validator
	 */
	private MultiHashMap validators = new MultiHashMap();
	
	
	/**
	 * the object which represents the current selection state
	 */
	private SelectionHierarchy selectionHierarchy;

	/**
	 * the list of the dependent adapeters
	 * @see #addDependentAdapterForReload(AbstractBaseCimAdapter)
	 */
	private List reloadDependentAdapters = new ArrayList();
	
	/**
	 * the fco Helper instance
	 * @see #getFcoHelper() 
	 */
	private FcoHelper fcoHelper = null;
	
	/**
	 * Defines the currently active Module
	 * @see AbstractBaseCimAdapter#ACTIVE_EDIT
	 * @see AbstractBaseCimAdapter#ACTIVE_WIZARD
	 */
	private int activeModule = -1;
	
	/**
	 * flag that indicates if data for the adapter was loaded
	 */
	protected boolean loaded = false;
	/**
	 * Allow a particular action to mark that there should be a reload of the complete task at the end of the action
	 */
	protected boolean markedForReload = false;

	/**
	 * the component which triggered the updateModel
	 * @see #getUpdateTrigger()
	 */
	protected LabeledBaseInputComponentIf updateTrigger;
	
	/**
	 * the key which was used for the last selection<br>
	 * is kept to increase performace during a request for more than one dataContainer using the same objectKeys
	 * 
	 */
	protected CimObjectKey lastSelectedKey;
	
	/**
	 * Can be set after creatign a new Object so that the wizard knows which node to select in the tree
	 * This variable is currently only questioned by the wizards, but could be used for example after a deletion action
	 * to select the next possible treeNNode
	 */
	protected CIMObjectPath pathOfTreeNode;
	
	/**
	 * the root node of a task
	 */
	protected ITaskLauncherTreeNode rootNode = null;
	
	/**
	 * the task-specific resource Bundle
	 */
	protected WbemSmtResourceBundle bundle;

	/**
	 * instance to the localeManager
	 * @see LocaleManagerBean
	 */
	private ILocaleManager localeManager;
	
	/**
	 * the items to be refreshed perdiodically
	 * @see #periodicalRefresh(DataContainer)
     * @see #periodicalRefreshEnabled(DataContainer)
	 */
	private Set refreshItems = new HashSet();
	/**
	 * Stores the time at which a DataContainer was last accessed
	 */
	private Map accessTimes = new HashedMap();
	
	/**
	 * Thread that removes old dataContainers
	 */
	private RemoveDataContainerThread removeDataContainerThread;
	
	/**
	 * the configuraiton of the task
	 */
	protected CustomTreeConfig customTreeConfig;
	
	/**
	 * the userdefined config values
	 * @see #addConfigurationValue(String, String)
	 * @see #getConfigurationValue(String)
	 * @see #getConfigurationValue(String, String)
	 * @see #getConfigurationValues()
	 * @see #setConfigurationValues(Map)
	 */
	private Map configurationValues;
    
	/**
	 * the current namespace of the server connection
	 */
	protected String namespace;
	
	/**
	 * the handler for adding asynchronous messages
	 */
    private AsynchronousMessageHandler asynchronousMessageHandler;
	
    /**
     * default constructor
     */
	protected AbstractBaseCimAdapter()
	{
		if (!RuntimeUtil.getInstance().isCommandline())
		{
			removeDataContainerThread = new RemoveDataContainerThread(this);
			removeDataContainerThread.start();
		}
	}

	/**
	 * initialized the adapter instance
	 * @param resourceBundle the resource bundle
	 * @param selectionHierarchy the selection hierarchy
	 * @param fcoHelperIf the fco help for cim object related actions
	 */
	public void init(WbemSmtResourceBundle resourceBundle, SelectionHierarchy selectionHierarchy, FcoHelper fcoHelperIf) {
		this.bundle = resourceBundle;
		this.selectionHierarchy = selectionHierarchy;
		this.fcoHelper = fcoHelperIf;
		
        if (RuntimeUtil.getInstance().isJSF())
        {
            asynchronousMessageHandler = (AsynchronousMessageHandler) BeanNameConstants.MESSAGE_HANDLER.getBoundValue(FacesContext.getCurrentInstance());
        }
        else if (RuntimeUtil.getInstance().isCommandline())
        {
            asynchronousMessageHandler = new CliAsynchronousMessageHandler();
        }

		
	}

	/**
	 * execute a reload, discards all changes in the local model an loads the data from the cim server
	 * @param cimClient the server connection
	 * @throws WbemsmtException if the reload failed
	 */
	protected abstract void reLoad(WBEMClient cimClient) throws WbemsmtException;
	
	/**
	 * execute a reload, discards all changes in the local model an loads the data from the cim server
	 * reset all flags and calls the task-implementation's
     * @param cimClient the server connection
	 * @throws WbemsmtException if the reload failed
	 */
	public void reload(WBEMClient cimClient)  throws WbemsmtException {
		resetFlags();		
		reLoad(cimClient);
	}

	/**
	 * reset the loaded and markedForReload - flags
	 */
	private void resetFlags() {
		loaded = false;
		markedForReload = false;
	}
	
	
	/**
	 * loads the data
	 * Implementors should only load this elements which are not still loaded
	 * 
	 * The cimClient should be stored in the object for later actions
     * @param cimClient the server connection
	 * @throws WbemsmtException if the load failed
	 */
	public abstract void load(WBEMClient cimClient) throws WbemsmtException;
	
	/**
	 * initially loads the data (Called from cli-Commands)
	 * Implementors should only load this elements who are needed for startup, all other elements can be lazy-loaded
	 * 
	 * The cimClient should be stored in the object for later actions
     * @param cimClient the server connection
     * @throws WbemsmtException if the load failed
	 * @throws WbemsmtException
	 */
	public abstract void loadInitial(WBEMClient cimClient) throws WbemsmtException;

	/**
	 * ReLoads with the help from Treenodes
	 * @param rootNode the root Node of the task
     * @throws WbemsmtException if the load failed
	 */
	protected abstract void reLoad(ITaskLauncherTreeNode rootNode) throws WbemsmtException;

	/**
	 * execute a reload, discards all changes in the local model an loads the data from the cim server
	 * reset all flags and calls the task-implementation's
     * @param rootNode the root Node of the task
     * @throws WbemsmtException if the load failed
	 */
	public void reload(ITaskLauncherTreeNode rootNode)  throws WbemsmtException {
		resetFlags();		
		reLoad(rootNode);
	}

	/**
	 * Loads with the help from Treenodes
	 * The treeFactory should be stored in the object for later actions
     * @param rootNode the root Node of the task
     * @throws WbemsmtException if the load failed
	 */
	public abstract void load(ITaskLauncherTreeNode rootNode) throws WbemsmtException;

	/**
	 * Returns the object with the given tree Node<br>
	 * the returned key should also reflect the hierarchy<br>
	 * @param treeNode the selected treenode 
	 * 
	 * @return The method can return null. If the method returns null no select-Method is called
     * @throws WbemsmtException if getting the key failed
	 */
	public abstract CimObjectKey getKeyByTreeNode(ITaskLauncherTreeNode treeNode) throws WbemsmtException;

	/**
	 * get names of the resourceBundles<br>
	 * if the bundle is in the root of the source folders subclasses can return sth like "messages","messages&lt;Task&%gt;" - without properties and any slashes.<br>
	 * the array should include also the common resource bundle "messages"
	 * @return the names of the resource bundles
	 */
	public abstract String[] getResourceBundleNames();
	
	/**
	 * Selects the current object by the given node<br>
	 * calls get {@link #getKeyByTreeNode(ITaskLauncherTreeNode)} and if the result != null {@link #select(CimObjectKey)} is called
	 * @param treeNode the selected tree node
	 * @return the Key that was uses for selection or null if there was no key found to select
 	 * @throws WbemsmtException if the key was found but the selection was not possible
	 */
	public CimObjectKey select(ITaskLauncherTreeNode treeNode) throws WbemsmtException
	{
		logger.info("Get key by Treenode " + treeNode.getName());
		CimObjectKey key = getKeyByTreeNode(treeNode);
		
		if (key == null)
		{
			logger.info("For Treenode " + treeNode.getName() + " no CIMObjectKey returned");
		}
		
		if (key != null)
		{
			select(key);
		}
		
		return key;
	}
	
	/**
	 * Selects the object with the given data<br>
	 * The implementor can decide if he wants to select the parent also if a child from a other parent is given.<br>
	 * <br>
	 * implementors should also update the state of the selction hierarchy<br>
	 * Is used by the CommandLine classes to initialize certain parts of the adapter<br>
	 * <br>
	 * executes for each level of the hierarchy the following method<br>
	 * select_&lt;level&gt;_&lt;object name of the key&gt;<br>
	 * if the select method with the object name was not found the method tries to use the parent (base class) of the object<br>
	 * @see #findSelectMethod(String, Class)
	 * 
	 * @param keyToSelect the key to select the object - the key reflects the hierarchy of the selected objects
	 * 
	 * @throws WbemsmtException if the select failed (for example if the select method was not found,
	 */
	public void select(CimObjectKey keyToSelect) throws WbemsmtException
	{
		
	    if (lastSelectedKey != null && keyToSelect.toString().equals(lastSelectedKey.toString()))
	    {
	        logger.info("Using previous selection");
	        return;
	    }
	    
	    logger.info("Selecting:\n " + keyToSelect.toString());		

		selectionHierarchy.clear();
		List keys = keyToSelect.getKeyList();
		for (int i=0; i < keys.size(); i++)
		{
			CimObjectKey key = (CimObjectKey)keys.get(i);
			String methodPrefix = "select_" + i + "_";
			String name;
			Method method = null;
			if (key.getCimObject() != null)
			{
				Class cls = key.getCimObject().getClass();
                name = ClassUtils.getShortClassName(cls);
                method = findSelectMethod(methodPrefix, cls);
			}
			else
			{
				name = key.getObjectPath().getObjectName();
				method = findSelectMethod(methodPrefix, name);
			}
			
			if (method == null)
			{
				throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,"Internal error");				
			}

			try {
				Boolean success = (Boolean)method.invoke(this,new Object[]{key});
				if (!success.booleanValue())
				{
					logger.severe("Cannot select the object " + name + " with the key " + key.toString());
					throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,"Internal error");
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Cannot select Object ",e);
				throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,"Internal error");
			} 
		}
		
		lastSelectedKey = keyToSelect;
	}
	
	public void setLastKeySelect(CimObjectKey key){
		this.lastSelectedKey = key;
	}
	
	
    /**
	 * Init container is called after the container
	 * Here the implementor can add things that are existant from start on and independent on 
	 * which fco will be displayed (for example the values of pulldown elements)
	 * @param dataContainer the DataContainer which is initialized
	 * @throws WbemsmtException the exception if the init failed
	 */
	public void initContainer(DataContainer dataContainer) throws WbemsmtException {
		Class interfaceClass = DataContainerUtil.getDataContainerInterface(dataContainer);
		String interfaceName = interfaceClass.getName();
		
		logger.fine("InitContainer: " + dataContainer + " with interface " + interfaceName);		

		String methodName = "initContainerImpl";
		
		logger.fine("Using method " + methodName);		
		
		try {
			Method method = getInitContainerDelegatee().getClass().getMethod(methodName, new Class[]{interfaceClass});
			method.setAccessible(true);
			//1.5 method.invoke(this,new Object[]{interfaceClass.cast(dataContainer)});
			// 1.4
			method.invoke(getInitContainerDelegatee(),new Object[]{dataContainer});
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot init Container with Method " + methodName + "(" + interfaceClass.getName().toString() + "). Method not exists",e);
			throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER,"Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot init Container with Method " + methodName,t);
			if (t instanceof WbemsmtException) {
			    WbemsmtException e1 = (WbemsmtException) t;
				throw e1;
			}
			else
			{
				throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER,"Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot init Container with Method " + methodName,e);
			throw new WbemsmtException(WbemsmtException.ERR_INIT_CONTAINER,"Internal error");
		} 
	}

	/**
	 * updates the GUI-Elements with the values from the model
	 * @param dataContainer the data container carrying the fields
	 * @throws WbemsmtException if the action failed
	 */
	public void updateControls(DataContainer dataContainer) throws WbemsmtException
	{
		Class interfaceClass = DataContainerUtil.getDataContainerInterface(dataContainer);
		String interfaceName = interfaceClass.getName();
		logger.fine("UpdatingControls: " + interfaceName);		

		String methodName = "updateControlsImpl";
		
		logger.fine("Using method " + methodName);		
		
		try {
			Method method = getUpdateControlsDelegatee().getClass().getMethod(methodName, new Class[]{interfaceClass});
			method.setAccessible(true);
			//1.5 method.invoke(this,new Object[]{interfaceClass.cast(dataContainer)});
			// 1.4
			method.invoke(getUpdateControlsDelegatee(),new Object[]{dataContainer});
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot update Controls with Method " + methodName + "(" + interfaceClass.getName().toString() + "). Method not exists",e);
			throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot update Controls with Method " + methodName,t);
			if (t instanceof WbemsmtException) {
			    WbemsmtException e1 = (WbemsmtException) t;
				throw e1;
			}
			else
			{
				throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot update Controls with Method " + methodName,e);
			throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Internal error");
		} 
	}
	
	/**
	 * updates the List of Gui-Elements with the values from the Model <br>
	 * 
	 * a {@link WbemsmtException} should be thrown:<br>
	 *   - if the size datContainer-List is not equal the size of the modelElements-List<br>
	 *   - if the type of a element in the dataContainer list doesn't fit to the type of the modelElemets List.<br> 
	 *     e.g. if a user wants to update a resourceRecord-ContainerItem with a zone-ModelElement<br>
	 * <br>
	 * calls a method updateControls(&lt;childDataContainer&gt;,&lt;model Element&gt;)<br>
	 * @param containerList list with dataContainers
	 * @param modelElements list with model Elements
     * @throws WbemsmtException if the action failed
	 */
	public void updateControls(List containerList, List modelElements) throws WbemsmtException
	{
		if (modelElements.size() != containerList.size())
		{
			String msg = "There are {0} entries found in Model and {1} in GUI. Cannot update the GUI";
			throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,MessageFormat.format(msg,new Object[]{new Integer(modelElements.size()),new Integer(containerList.size())}));
		}
		
		for (int i=0; i <  modelElements.size(); i++) {
			Object modelElement = modelElements.get(i);
			DataContainer containerElement = (DataContainer)containerList.get(i);

			Class modelClass = modelElement.getClass();
			
			Class containerClass = DataContainerUtil.getDataContainerInterface(containerElement);
			logger.fine("updating Controls: " + containerClass.getName().toString());		

			String methodName = "updateControlsImpl";
			
			logger.fine("Using method " + methodName);		

			String signature = methodName + "(" + containerClass.getName().toString() + "," + modelClass.getName().toString() +")";
			try {
				Method method = findMethod(getUpdateControlsDelegatee().getClass(),methodName,containerClass,modelClass);
				//1.5 method.invoke(this,new Object[]{containerClass.cast(containerElement),modelClass.cast(modelElement)});
				method.invoke(getUpdateControlsDelegatee(),new Object[]{containerElement,modelElement});
			} catch (NoSuchMethodException e) {
				logger.log(Level.SEVERE, "Cannot update Controls with Method " + signature +". Method not exists");
				throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Internal error");
			} catch (InvocationTargetException e) {
				Throwable t = e.getTargetException();
				logger.log(Level.SEVERE, "Cannot update Object with Method " + signature,t);
				if (t instanceof WbemsmtException) {
				    WbemsmtException e1 = (WbemsmtException) t;
					throw e1;
				}
				else
				{
					throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Internal error",t);
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Cannot update Object with Method " + signature,e);
				throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Internal error");
			} 
		}		
	}
	
	/**
	 * Try to find the method on the delegatee
	 * @param delegateeClass the class containing the method
	 * @param methodName the name of the method
	 * @param containerClass the container class (first parameter of the method)
	 * @param fcoClass the fco class (first parameter of the method) - if a method signature with the fcoClass was not found the method tries to use the baseclass 
	 * @return the method - never null (in this case the NoSuchMethodException is thrown)
	 * @throws NoSuchMethodException if the method was not found
	 */
	private Method findMethod(Class delegateeClass, String methodName, Class containerClass,
            Class fcoClass) throws NoSuchMethodException {

	    Method result = null;
	    String signature = null;
	    Class cls = fcoClass; 
	    
	    while (cls != null && result == null)
	    {
    	    try {
                signature = methodName + "(" + containerClass.getName().toString() + "," + cls.getName().toString() +")";
                result = delegateeClass.getMethod(methodName, new Class[]{containerClass,cls});
                result.setAccessible(true);
                logger.fine("Using method with signature " + signature);
            }
            catch (NoSuchMethodException e) {
                //that's okay we try the baseClass
                logger.info("Cannot find method with siganture " + signature + " - Trying to use the baseclass of the FCO");
                cls = cls.getSuperclass();
            }
	    }
        
	    return result;
    }

    /**
     * Try to find the select method , with the name select_&lt;number&gt;_CIMClass
     * @param selectMethodPrefix the prefix of the select method ==> select_&lt;number&gt;_
     * @param fcoClass the fco class last part of the method name - if a method signature with the fcoClass was not found the method tries to use the baseclass 
     * @return the method - never null (in this case the NoSuchMethodException is thrown)
     * @throws NoSuchMethodException
     */
    private Method findSelectMethod(String selectMethodPrefix, Class fcoClass)  {

        Method result = null;
        String methodName = null;
        Class cls = fcoClass; 
        
        while (cls != null && result == null)
        {
            try {
                methodName = selectMethodPrefix + ClassUtils.getShortClassName(cls);
                result = getClass().getMethod(methodName, new Class[]{CimObjectKey.class});
                result.setAccessible(true);
                logger.fine("Using select method " + methodName+ "(CimObjectKey)");
            }
            catch (NoSuchMethodException e) {
                //that's okay we try the baseClass
                logger.info("Cannot find select method with siganture " + methodName + "(CimObjectKey) - Trying to use the baseclass of the FCO");
                cls = cls.getSuperclass();
            }
        }
        
        return result;
    }
    
    /**
     * Try to find the select method , with the name select_&lt;number&gt;_CIMClass
     * @param selectMethodPrefix the prefix of the select method ==> select_&lt;number&gt;_
     * @param cimClass the fco class last part of the method name - if a method signature with the fcoClass was not found the method tries to use the baseclass 
     * @return the method - never null (in this case the NoSuchMethodException is thrown)
     * @throws NoSuchMethodException
     */
    private Method findSelectMethod(String selectMethodPrefix, String cimClass) {

        Method result = null;
        String methodName = null;
        CIMClass cls;
        try {
            cls = AbstractWbemsmtFcoHelper.getClass(getCimClient(),cimClass,getNamespace());
        }
        catch (WbemsmtException e2) {
        	logger.log(Level.SEVERE, "Cannot get Class " + cimClass,e2);
            return null;
        } 
        
        while (cls != null && result == null)
        {
            try {
                methodName = selectMethodPrefix + cls.getName();
                result = getClass().getMethod(methodName, new Class[]{CimObjectKey.class});
                result.setAccessible(true);
                logger.fine("Using select method " + methodName+ "(CimObjectKey)");
            }
            catch (NoSuchMethodException e) {
                //that's okay we try the baseClass
                logger.info("Cannot find select method with siganture " + methodName + "(CimObjectKey) - Trying to use the baseclass of the FCO");
                String superClass = cls.getSuperClassName();
                //the jsr48 api is not clear on the return value of getSuperClassName() - What is returned if there is no super class ??? 
                if (superClass != null && superClass.length() > 0 && ! superClass.equals(cimClass))
                {
                	try {
                        cls = AbstractWbemsmtFcoHelper.getClass(getCimClient(),superClass,getNamespace());
                    }
                    catch (WbemsmtException e1) {
                        logger.log(Level.SEVERE, "Cannot get SuperClass " + superClass,e1);
                    } 
                }
                else
                {
                    cls = null;
                }
            }
        }
        
        return result;
    }
    

    
    /**
	 * saves the changes contained in the dataContainer
	 * 
	 * The implementor have to decide if he wants to save the childs too
	 * 
	 * Calls the saveImpl-Methods on the derived class
	 * 
	 * @param dataContainer the container to save
	 * @throws WbemsmtException if the save failed
	 */
	public void save(DataContainer dataContainer) throws WbemsmtException
	{
		
		if (!DataContainerUtil.validateEnteredValues(dataContainer))
		{
			return;
		}

		Class interfaceClass = DataContainerUtil.getDataContainerInterface(dataContainer);
		String interfaceName = interfaceClass.getName();
		logger.fine("Creating: " + interfaceName);		

		String methodName = "saveImpl";
		
		logger.fine("Using method " + methodName);		
		
		try {
			Method method = getSaveDelegatee().getClass().getMethod(methodName, new Class[]{interfaceClass});
			method.setAccessible(true);
			MessageList list = (MessageList) method.invoke(getSaveDelegatee(),new Object[]{dataContainer});
			dataContainer.setMessagesList(list != null ? list : new MessageList());
			if (!dataContainer.getMessagesList().hasErrors())
			{
				DataContainerUtil.resetModifiedFlag(dataContainer);				
			}
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE, "Cannot save Object with Method " + methodName + "(" + interfaceClass.getName().toString() + "). Method not exists");
			throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot save Object with Method " + methodName,t);
			if (t instanceof WbemsmtException) {
			    WbemsmtException e1 = (WbemsmtException) t;
				throw e1;
			}
			else
			{
				throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot save Object with Method " + methodName,e);
			throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Internal error");
		}
		
		
	}
	
	/**
	 * saves the List ModelElements
	 * a {@link WbemsmtException} should be thrown:
	 *   - if the size datContainer-List is not equal the size of the modelElements-List
	 *   - if the type of a element in the dataContainer list doesn't fit to the type of the modelElemets List. 
	 *     e.g. if a user wants to update a resourceRecord-ContainerItem with a zone-ModelElement   
     * @param containerList list with dataContainers
     * @param modelElements list with model Elements
     * @throws WbemsmtException if the action failed
     * @return list with messages - if the message contains an error the following save actions are aborted
	 */
	public MessageList save(List containerList, List modelElements) throws WbemsmtException
	{
		
		if (modelElements.size() != containerList.size())
		{
			String msg = "There are {0} resource Records found in Model and [1} in GUI. Cannot save the GUI";
			throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,bundle.getString(msg,new Object[]{new Integer(modelElements.size()),new Integer(containerList.size())}));
		}
		
		MessageList result = new MessageList();
		
		for (int i=0; i <  modelElements.size(); i++) {
			Object modelElement = modelElements.get(i);
			DataContainer containerElement = (DataContainer)containerList.get(i);

			if (!DataContainerUtil.validateEnteredValues(containerElement))
			{
				return containerElement.getMessagesList();
			}
			
			Class modelClass = modelElement.getClass();
			Class containerClass = DataContainerUtil.getDataContainerInterface(containerElement);
			logger.fine("updating Controls: " + containerClass.getName().toString());		

			String methodName = "saveImpl";
			
			logger.fine("Using method " + methodName);		

			String signature = methodName + "(" + containerClass.getName().toString() + "," + modelClass.getName().toString() +")";
			try {
			    Method method = findMethod(getSaveDelegatee().getClass(),methodName, containerClass,modelClass);
				method.setAccessible(true);
				MessageList result1 = (MessageList) method.invoke(getSaveDelegatee(),new Object[]{containerElement,modelElement});
				result.addAll(result1);
			} catch (NoSuchMethodException e) {
				logger.log(Level.SEVERE, "Cannot save Controls with Method " + signature +". Method not exists");
				throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Internal error");
			} catch (InvocationTargetException e) {
				Throwable t = e.getTargetException();
				logger.log(Level.SEVERE, "Cannot save Object with Method " + signature,t);
				if (t instanceof WbemsmtException) {
				    WbemsmtException e1 = (WbemsmtException) t;
					throw e1;
				}
				else
				{
					throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Internal error",t);
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Cannot save Object with Method " + signature,e);
				throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Internal error");
			} 
		}		

		if (!result.hasErrors())
		{
			for (int i=0; i <  containerList.size(); i++) {
				DataContainer containerElement = (DataContainer)containerList.get(i);
				DataContainerUtil.resetModifiedFlag(containerElement);	
			}
		}
		
		return result;
	}

	/**
	 * revert the changes contained in the dataContainer
	 * 
	 * The implementor must revert the childs too
	 * 
	 * Calls the saveImpl-Methods on the derived class
	 * 
	 * @param dataContainer the container to revert
	 * @throws WbemsmtException if the revert failed
	 */
	public void revert(DataContainer dataContainer) throws WbemsmtException
	{
		
		if (!DataContainerUtil.validateEnteredValues(dataContainer))
		{
			return;
		}

		if (!dataContainer.isModified())
		{
			return;
		}

		Class interfaceClass = DataContainerUtil.getDataContainerInterface(dataContainer);
		String interfaceName = interfaceClass.getName();
		logger.fine("Reverting: " + interfaceName);		

		String methodName = "revertImpl";
		
		logger.fine("Using method " + methodName);		
		
		try {
			Method method = getRevertDelegatee().getClass().getMethod(methodName, new Class[]{interfaceClass});
			method.setAccessible(true);
			MessageList list = (MessageList) method.invoke(getRevertDelegatee(),new Object[]{dataContainer});
			dataContainer.setMessagesList(list != null ? list : new MessageList());
			if (!dataContainer.getMessagesList().hasErrors())
			{
				DataContainerUtil.resetModifiedFlag(dataContainer);				
			}
			
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE, "Cannot revert Object with Method " + methodName + "(" + interfaceClass.getName().toString() + "). Method not exists");
			throw new WbemsmtException(WbemsmtException.ERR_REVERT_OBJECT,"Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot revert Object with Method " + methodName,t);
			if (t instanceof WbemsmtException) {
			    WbemsmtException e1 = (WbemsmtException) t;
				throw e1;
			}
			else
			{
				throw new WbemsmtException(WbemsmtException.ERR_REVERT_OBJECT,"Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot revert Object with Method " + methodName,e);
			throw new WbemsmtException(WbemsmtException.ERR_REVERT_OBJECT,"Internal error");
		} 
		
		DataContainerUtil.resetModifiedFlag(dataContainer);
	}
	
	/**
	 * saves the List ModelElements
	 * a {@link WbemsmtException} should be thrown:
	 *   - if the size datContainer-List is not equal the size of the modelElements-List
	 *   - if the type of a element in the dataContainer list doesn't fit to the type of the modelElemets List. 
	 *     e.g. if a user wants to update a resourceRecord-ContainerItem with a zone-ModelElement   
     * @param containerList list with dataContainers
     * @param modelElements list with model Elements
     * @throws WbemsmtException if the action failed
     * @return list with messages
	 */
	public MessageList revert(List containerList, List modelElements) throws WbemsmtException
	{
		
		if (modelElements.size() != containerList.size())
		{
			String msg = "There are {0} resource Records found in Model and [1} in GUI. Cannot revert the GUI";
			throw new WbemsmtException(WbemsmtException.ERR_REVERT_OBJECT,bundle.getString(msg,new Object[]{new Integer(modelElements.size()),new Integer(containerList.size())}));
		}
		
		MessageList result = new MessageList();
		
		for (int i=0; i <  modelElements.size(); i++) {
			Object modelElement = modelElements.get(i);
			DataContainer containerElement = (DataContainer)containerList.get(i);

			if (!DataContainerUtil.validateEnteredValues(containerElement))
			{
				return containerElement.getMessagesList();
			}
			
			Class modelClass = modelElement.getClass();
			Class containerClass = DataContainerUtil.getDataContainerInterface(containerElement);
			logger.fine("updating Controls: " + containerClass.getName().toString());		

			String methodName = "revertImpl";
			
			logger.fine("Using method " + methodName);		

			String signature = methodName + "(" + containerClass.getName().toString() + "," + modelClass.getName().toString() +")";
			try {
			    Method method = findMethod(getRevertDelegatee().getClass(),methodName, containerClass,modelClass);
				method.setAccessible(true);
				MessageList result1 = (MessageList) method.invoke(getRevertDelegatee(),new Object[]{containerElement,modelElement});
				result.addAll(result1);
			} catch (NoSuchMethodException e) {
				logger.log(Level.SEVERE, "Cannot revert Controls with Method " + signature +". Method not exists");
				throw new WbemsmtException(WbemsmtException.ERR_REVERT_OBJECT,"Internal error");
			} catch (InvocationTargetException e) {
				Throwable t = e.getTargetException();
				logger.log(Level.SEVERE, "Cannot revert Object with Method " + signature,t);
				if (t instanceof WbemsmtException) {
				    WbemsmtException e1 = (WbemsmtException) t;
					throw e1;
				}
				else
				{
					throw new WbemsmtException(WbemsmtException.ERR_REVERT_OBJECT,"Internal error",t);
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Cannot revert Object with Method " + signature,e);
				throw new WbemsmtException(WbemsmtException.ERR_REVERT_OBJECT,"Internal error");
			} 
		}		
		
		if (!result.hasErrors())
		{
			for (int i=0; i <  containerList.size(); i++) {
				DataContainer containerElement = (DataContainer)containerList.get(i);
				DataContainerUtil.resetModifiedFlag(containerElement);	
			}
			
		}

		
		return result;
	}

	/**
	 * update the Data Model (Triggered by the frontend)
	 * 
	 * The implementor have to decide if he wants to save the childs too
	 * 
	 * @param dataContainer the container which was used to update the model
	 * @throws WbemsmtException if the update model failed
	 */
	public void updateModel(DataContainer dataContainer) throws WbemsmtException
	{
		updateModel(dataContainer, null);
	}	
	/**
	 * saves the changes contained in the dataContainer
	 * 
	 * The implementor have to decide if he wants to save the childs too
	 * 
	 * To check if the Correspondig field was the trigger use within the update-Method:
	 * boolean buttonPressed = dataContainer.get_&lt;Fieldname&gt;() == updateTrigger;
	 * 
	 * @param dataContainer the container containing the triggered component
	 * @param updateTrigger The input component who triggered the update
	 * @throws WbemsmtException if the update model failed
	 */
	public void updateModel(DataContainer dataContainer, LabeledBaseInputComponentIf updateTrigger) throws WbemsmtException
	{
		//This variable can be set by the business logic which is creating a new object
		pathOfTreeNode = null;

		if (!DataContainerUtil.validateEnteredValues(dataContainer))
		{
			return;
		}
		
		this.updateTrigger = updateTrigger;
		Class interfaceClass = DataContainerUtil.getDataContainerInterface(dataContainer);
		String interfaceName = interfaceClass.getName();
		logger.fine("UpdateModel: " + interfaceName);		

		String methodName = "updateModelImpl";
		
		logger.fine("Using method " + methodName);		
		
		try {
			Method method = getUpdateModelDelegatee().getClass().getMethod(methodName, new Class[]{interfaceClass});
			method.setAccessible(true);
			method.invoke(getUpdateModelDelegatee(),new Object[]{dataContainer});
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName + "(" + interfaceClass.getName().toString() + "). Method not exists");
			throw new WbemsmtException(WbemsmtException.ERR_UPDATE_OBJECT,"Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,t);
			if (t instanceof WbemsmtException) {
			    WbemsmtException e1 = (WbemsmtException) t;
				throw e1;
			}
			else
			{
				throw new WbemsmtException(WbemsmtException.ERR_UPDATE_OBJECT,"Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,e);
			throw new WbemsmtException(WbemsmtException.ERR_UPDATE_OBJECT,"Internal error");
		} 
	}
	
	/**
	 * updates the modelElements
	 * a {@link WbemsmtException} should be thrown:
	 *   - if the size datContainer-List is not equal the size of the modelElements-List
	 *   - if the type of a element in the dataContainer list doesn't fit to the type of the modelElemets List. 
	 *     e.g. if a user wants to update a resourceRecord-ContainerItem with a zone-ModelElement   
     * @param containerList list with dataContainers
     * @param modelElements list with model Elements
     * @throws WbemsmtException if the action failed
     */
	public void updateModel(List containerList, List modelElements) throws WbemsmtException
	{
		if (modelElements.size() != containerList.size())
		{
			String msg = "There are {0} resource Records found in Model and [1} in GUI. Cannot update the GUI";
			throw new WbemsmtException(WbemsmtException.ERR_UPDATE_OBJECT,bundle.getString(msg,new Object[]{new Integer(modelElements.size()),new Integer(containerList.size())}));
		}
		
		for (int i=0; i <  modelElements.size(); i++) {
			Object modelElement = modelElements.get(i);
			DataContainer containerElement = (DataContainer)containerList.get(i);

			Class modelClass = modelElement.getClass();
			
			Class containerClass = DataContainerUtil.getDataContainerInterface(containerElement);
			logger.fine("updating : " + containerClass.getName().toString());		

			String methodName = "updateModelImpl";
			
			logger.fine("Using method " + methodName);		

			String signature = methodName + "(" + containerClass.getName().toString() + "," + modelClass.getName().toString() +")";
			try {
			    Method method = findMethod(getUpdateModelDelegatee().getClass(),methodName, containerClass,modelClass);
				method.setAccessible(true);
				method.invoke(getUpdateModelDelegatee(),new Object[]{containerElement,modelElement});
			} catch (NoSuchMethodException e) {
				logger.log(Level.SEVERE, "Cannot update Model with Method " + signature +". Method not exists");
				throw new WbemsmtException(WbemsmtException.ERR_UPDATE_OBJECT,"Internal error");
			} catch (InvocationTargetException e) {
				Throwable t = e.getTargetException();
				logger.log(Level.SEVERE, "Cannot update Model with Method " + signature,t);
				if (t instanceof WbemsmtException) {
				    WbemsmtException e1 = (WbemsmtException) t;
					throw e1;
				}
				else
				{
					throw new WbemsmtException(WbemsmtException.ERR_UPDATE_OBJECT,"Internal error",t);
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Cannot update Model with Method " + signature,e);
				throw new WbemsmtException(WbemsmtException.ERR_UPDATE_OBJECT,"Internal error");
			} 
		}		
	}

	/**
	 * Deletes the selected Object of the given type<br>
	 * takes the peek of the selection hierarchy and uses the classname of the peek object to find the delete method: delete(&lt;Class of peek object&gt;) 
	 * @param dataContainerClass
	 * @throws WbemsmtException if teh delete failed
	 */
	public void delete() throws WbemsmtException
	{
		Object obj = selectionHierarchy.peek();
		Class objectClass = obj.getClass();

		logger.fine("Deleting: " + objectClass.getName());		

		String methodName = "deleteImpl";
		
		logger.fine("Using method " + methodName);		
		
		try {
			Method method = getDeleteDelegatee().getClass().getMethod(methodName, new Class[]{objectClass});
			method.setAccessible(true);
			method.invoke(getDeleteDelegatee(),new Object[]{obj});

			//if everything went okay then we are ready
			if (selectionHierarchy.size() > 0)
			{
				selectionHierarchy.pop();
			}
		
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE, "Cannot delete Object with Method " + methodName + "(" + objectClass.getName().toString() + "). Method not exists");
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot delete Object with Method " + methodName,t);
			if (t instanceof WbemsmtException) {
			    WbemsmtException e1 = (WbemsmtException) t;
				throw e1;
			}
			else
			{
				throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot delete Object with Method " + methodName,e);
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error");
		} 
	}
	
	/**
	 * creates the object that belongs to the given container
	 * @param dataContainer the last page of a wizard
	 * @throws WbemsmtException if the create failes
	 */
	public void create(DataContainer dataContainer) throws WbemsmtException
	{
		
		//This variable can be set by the business logic which is creating a new object
		pathOfTreeNode = null;
		
		Class interfaceClass = DataContainerUtil.getDataContainerInterface(dataContainer);
		String interfaceName = interfaceClass.getName();
		logger.fine("Creating: " + interfaceName);		

		String methodName = "createImpl";
		
		logger.fine("Using method " + methodName);		
		
		try {
			Method method = getCreateDelegatee().getClass().getMethod(methodName, new Class[]{interfaceClass});
			method.setAccessible(true);
			method.invoke(getCreateDelegatee(),new Object[]{dataContainer});
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE, "Cannot create Object with Method " + methodName + "(" + interfaceClass.getName().toString() + "). Method not exists");
			throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot create Object with Method " + methodName,t);
			if (t instanceof WbemsmtException) {
			    WbemsmtException e1 = (WbemsmtException) t;
				throw e1;
			}
			else
			{
				throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot create Object with Method " + methodName,e);
			throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		} 
	}

	/**
	 * install the validators for the given container<br>
	 * calls the installValidatorsImpl(&lt;dataContainer&gt;) on the install validators delegatee
	 * @param dataContainer the container to add the validators
	 * @throws WbemsmtException if intstalling the validators failed
	 * @see #addValidator(DataContainer, Validator)
	 */
	private void installValidators(DataContainer dataContainer) throws WbemsmtException
	{
		Class interfaceClass = DataContainerUtil.getDataContainerInterface(dataContainer);
		String interfaceName = interfaceClass.getName();
		logger.fine("InstallValidators: " + interfaceName);		

		String methodName = "installValidatorsImpl";
		
		logger.fine("Using method " + methodName);		
		
		try {
			Method method = getInstallValidatorsDelegatee().getClass().getMethod(methodName, new Class[]{interfaceClass});
			method.setAccessible(true);
			method.invoke(getInstallValidatorsDelegatee(),new Object[]{dataContainer});
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE, "Cannot InstallValidators with Method " + methodName + "(" + interfaceClass.getName() + "). Method not exists");
			throw new WbemsmtException(WbemsmtException.ERR_VALIDATION,"Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot InstallValidators with Method " + methodName,t);
			if (t instanceof WbemsmtException) {
			    WbemsmtException e1 = (WbemsmtException) t;
				throw e1;
			}
			else
			{
				throw new WbemsmtException(WbemsmtException.ERR_VALIDATION,"Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot InstallValidators with Method " + methodName,e);
			throw new WbemsmtException(WbemsmtException.ERR_VALIDATION,"Internal error");
		} 
	}
	
	/**
	 * Adds the validator to the given container<br>
	 * can be used inside the InstallValidatorsDelegatee to add a validator to a container
	 * @param dataContainer the container to add the validator
	 * @param validator the validator to add
	 */
	public void addValidator(DataContainer dataContainer, Validator validator)
	{
		validators.put(dataContainer,validator);
	}
	
	/**
	 * validates the dataContainer
	 * @param dataContainer the container with the values
	 * @throws WbemsmtException if the validation failed
	 */
	public void validateValues(DataContainer dataContainer) throws WbemsmtException {
		
		if (!validators.containsKey(dataContainer))
		{
			installValidators(dataContainer);
		}
		
		MessageList result = new MessageList();
		List validatorList = (List) validators.get(dataContainer);
		for (int i = 0; validatorList != null && i < validatorList.size(); i++) {
			Validator validator = (Validator) validatorList.get(i);
			result.addAll(validator.validate());
		}
		dataContainer.setMessagesList(result);
	}	
	
	/**
	 * Count a class that should be the fco of datacontainer linked as list within a parent container<br>
	 * @param classToCount the children class to count
	 * @return the amount of children
	 * @throws WbemsmtException if the action failes
     * @deprecated {@link #count(String, Class, DataContainer)} should be used
     * 
	 */
	public int count(Class classToCount) throws WbemsmtException
	{
		return count(classToCount, null); 		
	}

    /**
     * Count a class that should be the fco of datacontainer linked as list within a parent container<br>
     * <br>
     * if parentContainer != null the method searches<br>
     * <br>
     * first for a method count_&lt;classToCount&gt;(DataContainer parentClass)<br>
     * <br>
     * if parentContainer == null or method count_&lt;classToCount&gt;(DataContainer parentClass) was not found<br>
     * the method searches for<br>
     * <br>
     * count_&lt;classToCount&gt;<br>
     * <br>
     * <br>
     * @param classToCount the child to be counted
     * @param parentContainer the parentContainer
     * @return the amount of children
     * @throws WbemsmtException if the count failed or no count method was found in the delegatee
     * @deprecated count(String role, Class classToCount, DataContainer parentContainer) should be used
     */
    public int count(Class classToCount, DataContainer parentContainer) throws WbemsmtException
    {
        String child = ClassUtils.getShortClassName(classToCount);
        
        if (parentContainer != null)
        {
            Class interfaceClass = DataContainerUtil.getDataContainerInterface(parentContainer);
            logger.fine("Counting " + child + " with parent " + interfaceClass.getName());       
            String methodName = "countImpl_" + child;
            logger.fine("Using method " + methodName + "( DataContainer " + interfaceClass.getName() + ")");      
            try {
                Method method = getCountDelegatee().getClass().getMethod(methodName, new Class[]{interfaceClass});
                method.setAccessible(true);
                Integer count = (Integer)method.invoke(getCountDelegatee(),new Object[]{parentContainer});
                return count.intValue();
            } catch (NoSuchMethodException e) {
                //do nothing but add a log 
                logger.info("method " + methodName + " was not found. Using method without parent");
            } catch (InvocationTargetException e) {
                Throwable t = e.getTargetException();
                logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,t);
                if (t instanceof WbemsmtException) {
                    throw (WbemsmtException)t;
                }
                throw new WbemsmtException(WbemsmtException.ERR_COUNT,"Internal error",t);
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,e);
                throw new WbemsmtException(WbemsmtException.ERR_COUNT,"Internal error");
            }       
        }
        
        logger.fine("Counting " + child);       
        String methodName = "countImpl_" + child;
        logger.fine("Using method " + methodName);      
        try {
            Method method = getCountDelegatee().getClass().getMethod(methodName, new Class[]{});
            method.setAccessible(true);
            Integer count = (Integer)method.invoke(getCountDelegatee(),new Object[]{});
            return count.intValue();
        } catch (NoSuchMethodException e) {
            logger.log(Level.SEVERE, "Cannot count with Method " + methodName +". Method not exists or returns no int");
            throw new WbemsmtException(WbemsmtException.ERR_COUNT,"Internal error");
        } catch (InvocationTargetException e) {
            Throwable t = e.getTargetException();
            logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,t);
            if (t instanceof WbemsmtException) {
                throw (WbemsmtException)t;
            }
            throw new WbemsmtException(WbemsmtException.ERR_COUNT,"Internal error",t);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,e);
            throw new WbemsmtException(WbemsmtException.ERR_COUNT,"Internal error");
        }       
        
    }
    
    
    /**
     * Count a class that should be the fco of datacontainer linked as list within a parent container<br>
     * <br>
     * if parentContainer != null the method searches<br>
     * <br>
     * first for a method count_&lt;classToCount&gt;(DataContainer parentClass)<br>
     * <br>
     * if parentContainer == null or method count_&lt;classToCount&gt;(DataContainer parentClass) was not found<br>
     * the method searches for<br>
     * <br>
     * count_&lt;classToCount&gt;<br>
     * <br>
     * <br>
     * @param classToCount the child to be counted
     * @param parentContainer the parentContainer
     * @param role the role of the children
     * @return the amount of childen
     * @throws WbemsmtException if the count failed or if no count method was found
     */
    public int count(String role, Class classToCount, DataContainer parentContainer) throws WbemsmtException
    {
        String child = ClassUtils.getShortClassName(classToCount);
        
        role = StringUtils.capitalize(role);
        
        if (parentContainer != null)
        {
            Class interfaceClass = DataContainerUtil.getDataContainerInterface(parentContainer);
            logger.fine("Counting " + child + " with parent " + interfaceClass.getName() + " and with role " + role);       
            String methodName = "countImpl_" + role;
            logger.fine("Using method " + methodName + "(Class childClass, DataContainer " + interfaceClass.getName() + ")");      
            try {
                Method method = getCountDelegatee().getClass().getMethod(methodName, new Class[]{Class.class, interfaceClass});
                method.setAccessible(true);
                Integer count = (Integer)method.invoke(getCountDelegatee(),new Object[]{classToCount, parentContainer});
                return count.intValue();
            } catch (NoSuchMethodException e) {
                //do nothing but add a log 
                logger.info("method " + methodName + " was not found. Using method without parent");
            } catch (InvocationTargetException e) {
                Throwable t = e.getTargetException();
                logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,t);
                if (t instanceof WbemsmtException) {
                    throw (WbemsmtException)t;
                }
                throw new WbemsmtException(WbemsmtException.ERR_COUNT,"Internal error",t);
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,e);
                throw new WbemsmtException(WbemsmtException.ERR_COUNT,"Internal error");
            }       
        }
        
        logger.fine("Counting " + child);       
        String methodName = "countImpl_" + role;
        logger.fine("Using method " + methodName);      
        try {
            Method method = getCountDelegatee().getClass().getMethod(methodName, new Class[]{Class.class});
            method.setAccessible(true);
            Integer count = (Integer)method.invoke(getCountDelegatee(),new Object[]{classToCount});
            return count.intValue();
        } catch (NoSuchMethodException e) {
            logger.log(Level.SEVERE, "Cannot count with Method " + methodName +". Method not exists or returns no int");
            throw new WbemsmtException(WbemsmtException.ERR_COUNT,"Internal error");
        } catch (InvocationTargetException e) {
            Throwable t = e.getTargetException();
            logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,t);
            if (t instanceof WbemsmtException) {
                throw (WbemsmtException)t;
            }
            throw new WbemsmtException(WbemsmtException.ERR_COUNT,"Internal error",t);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,e);
            throw new WbemsmtException(WbemsmtException.ERR_COUNT,"Internal error");
        }       
        
    }
        
    /**
	 * Get the CimClient of this adapter
	 * @return the cimClient
	 */
	public WBEMClient getCimClient() {
		return cimClient;
	}

	/**
	 * set the CimClient of this Adapter
	 * @param cimClient the client
	 * @throws WbemsmtException if the namespace cannot be retrieved from the cim client
	 * @see CIMClientPool#getNamespace(WBEMClient)
	 */
	public void setCimClient(WBEMClient cimClient) throws WbemsmtException {
		this.cimClient = cimClient;
		namespace = WbemsmtSession.getSession().getCIMClientPool(cimClient).getNamespace(cimClient);
	}

	/**
	 * return true if the adapter was loaded
	 * @return true if the adapter was loaded
	 */
	public boolean isLoaded() {
		return loaded;
	}

	/**
	 * set the Adapter as loaded
	 * @param loaded use true if the adapter was loaded 
	 */
	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}

	/**
	 * Get the resource Bundle of the adapter
	 * @return the resource Bundle of the adapter
	 */
	public WbemSmtResourceBundle getBundle() {
		return bundle;
	}

	/**
	 * set the resource bundle of the task belonging to this adapter
	 * @param bundle the resource bundle of the task belonging to this adapter 
	 */
	public void setBundle(WbemSmtResourceBundle bundle) {
		this.bundle = bundle;
	}

	/**
	 * Get the Component which was used as trigger for a updateModel action. This is normally done by a button
	 * @return the Component which was used as trigger for a updateModel action. This is normally done by a button
	 */
	public LabeledBaseInputComponentIf getUpdateTrigger() {
		return updateTrigger;
	}

	/**
	 * Get the root node of the task this adapter belongs to.
	 * @return the root node. Can be null if the adapter is initialized with a tasklauncher having no ui (like commandline,webservice etc)
	 */
	public ITaskLauncherTreeNode getRootNode() {
		return rootNode;
	}

	/**
	 * init the wizard with the given Container
	 * @param base the wizard itself
	 * @param dataContainer the first panel of the wizard
	 * @param currentPageName the pagename of this panel
	 * @throws WbemsmtException if the init failed or the initWizardImpl method was not found
	 */
	public void initWizard(WizardBase base, DataContainer dataContainer, String currentPageName) throws WbemsmtException {
		
		activeModule = ACTIVE_WIZARD;
		
		Class interfaceClass = DataContainerUtil.getDataContainerInterface(dataContainer);
		String interfaceName = interfaceClass.getName();
		
		Class wizardContainerClass = base.getWizardContainer().getClass();
		String wizardContainerClassName = wizardContainerClass.getName();
		
		logger.fine("initWizard: " + interfaceName + " container = " + wizardContainerClassName);		

		String methodName = "initWizardImpl";
		
		logger.fine("Using method " + methodName);		
		
		try {
			Method method = getInitWizardDelegatee().getClass().getMethod(methodName, new Class[]{interfaceClass,wizardContainerClass,String.class});
			method.setAccessible(true);
			//1.5 method.invoke(this,new Object[]{interfaceClass.cast(dataContainer)});
			// 1.4
			method.invoke(getInitWizardDelegatee(),new Object[]{dataContainer,base.getWizardContainer(),currentPageName});
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot init wizard with Method " + methodName + "(" + interfaceClass.getName().toString() + "). Method not exists",e);
			throw new WbemsmtException(WbemsmtException.ERR_INIT_WIZARD,"Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot init wizard with Method " + methodName,t);
			if (t instanceof WbemsmtException) {
			    WbemsmtException e1 = (WbemsmtException) t;
				throw e1;
			}
			else
			{
				throw new WbemsmtException(WbemsmtException.ERR_INIT_WIZARD,"Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot init wizard with Method " + methodName,e);
			throw new WbemsmtException(WbemsmtException.ERR_INIT_WIZARD,"Internal error");
		} 
		
	}

	/**
	 * add listener to be notified when the locale changes
	 * @param listener listener instance
	 */
	public void addLocaleChangeListener(LocaleChangeListener listener)
	{
		//no all having a locale change manager
		if (localeManager != null)
		{
			localeManager.addLocaleChangeListener(listener);
		}
	}
	
	/**
	 * set the Manager class which switches and holds the locale<br>
	 * set during the initialization of the adapter
	 * @param localeManager the manager instance
	 */
	public void setLocaleManager(ILocaleManager localeManager) {
		this.localeManager = localeManager;
		if (bundle == null || !bundle.getLocale().equals(localeManager.getCurrentLocale()))
		{
			bundle = ResourceBundleManager.getResourceBundle(getResourceBundleNames(),localeManager.getCurrentLocale());
		}
		addLocaleChangeListener(this);
	}

	/**
	 * called if the locale changes<br>
	 * reloads the resource bundle
	 * @param newLocale the locale which is now used
	 * 
	 */
	public void localeChanged(Locale newLocale)
	{
		bundle = ResourceBundleManager.getResourceBundle(getResourceBundleNames(),newLocale);			
	}
	
	/**
	 * 
	 * @return true if the adapter is marked to be reloaded
	 */
	public boolean isMarkedForReload() {
		return markedForReload;
	}

	/**
	 * marks the adapter to be reloaded
	 */
	public void setMarkedForReload() {
		this.markedForReload = true;
	}
	
	/**
	 * reloads the Tree. Is only executed if marked for reload
	 * @throws WbemsmtException if the reload failed
	 * @see AbstractBaseCimAdapter#markedForReload
	 */
	public void reload() throws WbemsmtException
	{
		if (markedForReload)
		{
			if (rootNode != null)
			{
				rootNode.readSubnodes(true);
			}
			markedForReload = false;
		}
		
		for (Iterator iter = reloadDependentAdapters.iterator(); iter.hasNext();) {
			AbstractBaseCimAdapter adapter = (AbstractBaseCimAdapter) iter.next();
			adapter.reload();
		}
		reloadDependentAdapters.clear();
		
	}
	
	/**
	 * cleans up the adapter
	 * @see Cleanup
	 */
	public void cleanup()
	{
		CimAdapterFactory.getInstance().removeAdapter(this);
		refreshItems.clear();
		clearSelection();
		if ( removeDataContainerThread != null)
		{
			removeDataContainerThread.cleanup();
			removeDataContainerThread=null;
		}
	}

	/**
	 * get the path of the treenode which is set by the business logic for future selection
	 * @return the path
	 */
	public CIMObjectPath getPathOfTreeNode() {
		return pathOfTreeNode;
	}

	/**
	 * set the path of the treenode for future selection<br>
	 * set by the business logic
	 * @param pathOfCreatedNode the path
	 */
	public void setPathOfTreeNode(CIMObjectPath pathOfCreatedNode) {
		this.pathOfTreeNode = pathOfCreatedNode;
	}
	
	/**
	 * return if the adapter is used in edit or wizard mode
	 * @return the mode
	 * @see #ACTIVE_EDIT
	 * @see #ACTIVE_WIZARD
	 */

	public int getActiveModule() {
		return activeModule;
	}

	/**
	 * set the currently active module
	 * @param activeModule the currently active module
     * @see #ACTIVE_EDIT
     * @see #ACTIVE_WIZARD
	 */
	public void setActiveModule(int activeModule) {
		this.activeModule = activeModule;
	}

	/**
	 * Manages the periodical refresh for the given DataContainer
	 * Calls updateControls
	 * @param dataContainer the container to periodically refresh
	 */
	public void periodicalRefresh(DataContainer dataContainer) {
		synchronized (refreshMedium) {
			refreshItems.add(dataContainer);
		}
	}

	/**
	 * Checks if the refresh for this container is enabled
	 * @param dataContainer the container to check
	 * @return true if the periodical refresh for that container is enabled
	 */
	public boolean periodicalRefreshEnabled(DataContainer dataContainer) {
		synchronized (refreshMedium) {
			return refreshItems.contains(dataContainer);
		}
	}

	/**
	 * get all the containers that are refreshed periodically
	 * @return set with {@link DataContainer} instances
	 */
	public Set getRefreshItems() {
		return refreshItems;
	}
	
	/**
	 * return the object wich syncs the refresh actions
	 * @return the object wich syncs the refresh actions
	 */
	public Object getRefreshMedium()
	{
	    return refreshMedium;
	}
	
	/**
	 * Updates the last access timestamp for the given datacontainer
	 * @param dc the container to update the access time
	 */
	public void updateAccesTime(DataContainer dc) {
		synchronized (refreshMedium) {
			accessTimes.put(dc,new Long(System.currentTimeMillis()));
		}
	}
	
	/**
	 * Gets the Map with the time value a container was access last time
	 * @return a Map with all containers and their last time thei are accessed.<br>
	 * Key: instance of {@link DataContainer}<br>
	 * Value: instance of {@link Long} - the timestamp
	 * 
	 * @see System#currentTimeMillis()
	 */
	public Map getAccessTimes() {
		return accessTimes;
	}

	
	/**
	 * Returns the default refresh interval (10 seconds) as milliseconds 
	 * @return the default interval
	 */
	public long getDefaultRefreshIntervalInMillis()
	{
		return 10000L;
	}
	
	/**
	 * Define the period in millis after which a DataContainer is removed from the RefreshList<br>
	 * Default:100 seconds
	 * @return the default period
	 */
	public long getDefaultRefreshTimeout()
	{
		return 100000L;
	}

	/**
	 * returns the helper class for supporting fco actions 
	 * @return the helper class for supporting fco actions
	 */
	public FcoHelper getFcoHelper() {
		return fcoHelper;
	}

	
	/**
	 * add an adapter which is depending on this adapter
	 * @param adapter the dependent adapter
	 */
	
	public void addDependentAdapterForReload(AbstractBaseCimAdapter adapter) {
		
		adapter.setMarkedForReload();
		//don't add ourself
		if (adapter != this)
		{
			reloadDependentAdapters.add(adapter);
		}
		
	}

	/**
	 * set the configuration for the task
	 * <br>
	 * see wbemsmt-commons/commons-bl/config/customTreeConfig.xsd for the structure of the {@link CustomTreeConfig}
	 * @param customTreeConfig the configuration for the task
	 */
	public void setCustomTreeConfig(CustomTreeConfig customTreeConfig) {
		this.customTreeConfig = customTreeConfig;
		setConfigurationValues(customTreeConfig.getTreeConfigData().getConfigurationMap());		
	}

	/**
	 * get the configruation for the task represented by this adapter
	 * <br>
     * see wbemsmt-commons/commons-bl/config/customTreeConfig.xsd for the structure of the {@link CustomTreeConfig}

	 * @return the configruation for the task represented by this adapter
	 */
	public CustomTreeConfig getCustomTreeConfig() {
		return customTreeConfig;
	}

	/**
	 * get a map with all configuration values
	 * @return key: name of configuration entry, value: value of the configuration entry type: {@link ConfigurationValueData}
	 * @see #addConfigurationValue(String, String)
	 */
	public Map getConfigurationValues() {
		return configurationValues;
	}

	/**
	 * expects a map with the name of the configurationValue as key and the ConfigurationValueData objects as value 
	 * @param configurationValues the map  
	 * @see ConfigurationValueData
	 */
	public void setConfigurationValues(Map configurationValues) {
		this.configurationValues = configurationValues;
	}
	
	/**
	 * get the configured value
	 * @param key tne name of the config value
	 * @return the value or null if for the given key no value was found
	 */
	public String getConfigurationValue(String key)
	{
		return getConfigurationValue(key,null);
	}
	
    /**
     * get the configured value
     * @param key name of the entry
     * @param defaultValue default for the case entry was not found or the entry's value was null
     * @return the value or default value if for the given key no value was found
     */
    public String getConfigurationValue(String key, String defaultValue)
    {
        if (configurationValues != null && configurationValues.get(key) != null)
        {
            ConfigurationValueData value = (ConfigurationValueData) configurationValues.get(key);
            return value.getValue() != null ? value.getValue() : defaultValue;
        }
        else
        {
            return defaultValue;
        }
    }	
    
    
    /**
     * Used to add userdefined configuration value
     * @param key the key of the configuration
     * @param value the value of the configuration entry
     */
    public void addConfigurationValue(String key, String value)
    {
        if (this.configurationValues  == null)
        {
            this.configurationValues = new HashMap();
        }
        ConfigurationValueData data = new ConfigurationValueData(key,value);
        this.configurationValues.put(data.getName(), data);
    }
    

    /**
     * get the currently used namespace
     * @return the currently used namespace
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Get the presentationlayer specific component which is responsible for adding asynchronous messages
     * @return the handler instance
     */
    public AsynchronousMessageHandler getAsynchronousMessageHandler() {
        return asynchronousMessageHandler;
    }

    /**
     * Clear the current selection
     * 
     * subclasses can override this method to clear the selected business objects
     */
    public void clearSelection()
    {
        selectionHierarchy.clear();
    }

    /**
     * get a new CIM Client instance<br>
     * can be used by the preloading threads to get their own cim client instance
     * @return a new cim client instance
     * @throws WbemsmtException if no CimClient can be retrieved
     * @see CIMClientPool#getNewCIMClient(String)
     */
    public WBEMClient getNewCimClient() throws WbemsmtException {
        return WbemsmtSession.getSession().getCIMClientPool(getCimClient()).getNewCIMClient(getNamespace());
    }
	
    
}
