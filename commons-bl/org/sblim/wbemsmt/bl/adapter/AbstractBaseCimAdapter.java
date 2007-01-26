 /** 
  * AbstractBaseCimAdapter.java
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
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.collections.MultiHashMap;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.Cleanup;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.LocaleChangeListener;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.validator.Validator;
import org.sblim.wbemsmt.tools.wizard.WizardBase;

public abstract class AbstractBaseCimAdapter implements CimAdapterDelegator,LocaleChangeListener,Cleanup {

	public static final int ACTIVE_EDIT = 0;
	public static final int ACTIVE_WIZARD = 1;
	
	private Logger logger = Logger.getLogger(AbstractBaseCimAdapter.class.getName());	
	
	protected CIMClient cimClient;
	private MultiHashMap validators = new MultiHashMap();
	private SelectionHierarchy selectionHierarchy;
	/**
	 * Defines the currently active Module
	 * @see AbstractBaseCimAdapter#ACTIVE_EDIT
	 * @see AbstractBaseCimAdapter#ACTIVE_WIZARD
	 */
	private int activeModule = -1;
	protected boolean loaded = false;
	/**
	 * Allow a particular action to mark that there should be a reload of the complete task at the end of the action
	 */
	protected boolean markedForReload = false;
	/**
	 * Allow a particular action to mark that there should be a reload at the end of the action
	 */
	protected boolean editObjectMarkedForReload = false;

	protected LabeledBaseInputComponentIf updateTrigger;
	protected CimObjectKey lastSelectedKey;
	
	/**
	 * Can be set after creatign a new Object so that the wizard knows which node to select in the tree
	 * This variable is currently only questioned by the wizards, but could be used for example after a deletion action
	 * to select the next possible treeNNode
	 */
	protected CIMObjectPath pathOfTreeNode;
	protected ITaskLauncherTreeNode rootNode = null; 
	protected WbemSmtResourceBundle bundle;

	private ILocaleManager localeManager;
	
	public AbstractBaseCimAdapter()
	{
	}

	public void init(WbemSmtResourceBundle resourceBundle, SelectionHierarchy selectionHierarchy) {
		this.bundle = resourceBundle;
		this.selectionHierarchy = selectionHierarchy;
	}

	/**
	 * execute a reload, discards all changes in the local model an loads the data from the cim server
	 * @throws ModelLoadException
	 */
	public abstract void reLoad(CIMClient cimClient) throws ModelLoadException;
	
	/**
	 * loads the data
	 * Implementors should only load this elements which are not still loaded
	 * 
	 * The cimClient should be stored in the object for later actions
	 * 
	 * @throws ModelLoadException
	 */
	public abstract void load(CIMClient cimClient) throws ModelLoadException;
	
	/**
	 * initially loads the data (Called from cli-Commands)
	 * Implementors should only load this elements who are needed for startup, all other elements can be lazy-loaded
	 * 
	 * The cimClient should be stored in the object for later actions
	 * 
	 * @throws ModelLoadException
	 */
	public abstract void loadInitial(CIMClient cimClient) throws ModelLoadException;

	/**
	 * ReLoads with the help from Treenodes
	 * @param rootNode
	 */
	public abstract void reLoad(ITaskLauncherTreeNode rootNode) throws ModelLoadException;

	/**
	 * Loads with the help from Treenodes
	 * The treeFactory should be stored in the object for later actions
	 * @param rootNode
	 */
	public abstract void load(ITaskLauncherTreeNode rootNode) throws ModelLoadException;

	/**
	 * Returns the object with the given tree Node
	 * 
	 * @return The method can return null. If the method returns null no select-Method is called
	 * @throws ObjectNotFoundException
	 */
	public abstract CimObjectKey getKeyByTreeNode(ITaskLauncherTreeNode treeNode) throws ObjectNotFoundException;

	public abstract String[] getResourceBundleNames();
	
	/**
	 * Selects the current object by the given node
	 * @param treeNode
	 * @return the Key that was uses for selection or null if there was no key found to select
 	 * @throws ObjectNotFoundException if the key was found but the selection was not possible
	 */
	public CimObjectKey select(ITaskLauncherTreeNode treeNode) throws ObjectNotFoundException
	{
		logger.info("Get key by Treenode " + treeNode.getName());
		CimObjectKey key = getKeyByTreeNode(treeNode);
		
		if (key == null)
		{
			logger.info("For Treenode " + treeNode.getName() + " no CIMObjectKey returned");
		}
		
		if (key != null && (lastSelectedKey == null || !key.toString().equals(lastSelectedKey.toString())))
		{
			if (key != null)
			{
				select(key);
			}
		}
		
		return key;
	}
	
	/**
	 * Selects the object with the given data
	 * The implementor can decide if he wants to select the parent also if a child from a other parent is given.
	 * 
	 * Is used by the CommandLine classes to initialize certain parts of the adapter
	 * 
	 * @throws ObjectNotFoundException
	 */
	public void select(CimObjectKey keyContainer) throws ObjectNotFoundException
	{
		logger.info("Selecting:\n " + keyContainer.toString());		

		selectionHierarchy.clear();
		List keys = keyContainer.getKeyList();
		for (int i=0; i < keys.size(); i++)
		{
			CimObjectKey key = (CimObjectKey)keys.get(i);
			String name = key.getObjectPath().getObjectName();
			String methodName = "select_" + i + "_" + name;

			logger.fine("Using method " + methodName);		
			
			try {
				Method method = this.getClass().getMethod(methodName, new Class[]{CimObjectKey.class});
				method.setAccessible(true);
				Boolean success = (Boolean)method.invoke(this,new Object[]{key});
				if (!success.booleanValue())
				{
					logger.severe("Cannot select the object " + name + " with the key " + key.toString());
					throw new ObjectNotFoundException("Internal error");
				}
			} catch (NoSuchMethodException e) {
				logger.log(Level.SEVERE, "Cannot select Object with Method " + methodName + ". Method not exists",e);
				throw new ObjectNotFoundException("Internal error");
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Cannot select Object with Method " + methodName,e);
				throw new ObjectNotFoundException("Internal error");
			} 
		}
	}
	
	/**
	 * Init container is called after the container
	 * Here the implementor can add things that are existant from start on and independent on 
	 * which fco will be displayed (for example the values of pulldown elements)
	 * @param dataContainer
	 * @throws InitContainerException
	 */
	public void initContainer(DataContainer dataContainer) throws InitContainerException {
		Class interfaceClass = getDataContainerInterface(dataContainer);
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
			throw new InitContainerException("Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot init Container with Method " + methodName,t);
			if (t instanceof InitContainerException) {
				InitContainerException e1 = (InitContainerException) t;
				throw e1;
			}
			else
			{
				throw new InitContainerException("Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot init Container with Method " + methodName,e);
			throw new InitContainerException("Internal error");
		} 
	}

	/**
	 * updates the GUI-Elements with the values from the model
	 * @param dataContainer
	 * @throws UpdateControlsException
	 */
	public void updateControls(DataContainer dataContainer) throws UpdateControlsException
	{
		Class interfaceClass = getDataContainerInterface(dataContainer);
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
			throw new UpdateControlsException("Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot update Controls with Method " + methodName,t);
			if (t instanceof UpdateControlsException) {
				UpdateControlsException e1 = (UpdateControlsException) t;
				throw e1;
			}
			else
			{
				throw new UpdateControlsException("Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot update Controls with Method " + methodName,e);
			throw new UpdateControlsException("Internal error");
		} 
	}
	
	/**
	 * updates the List of Gui-Elements with the values from the Model
	 * a UpdateControlsException should be thrown:
	 *   - if the size datContainer-List is not equal the size of the modelElements-List
	 *   - if the type of a element in the dataContainer list doesn't fit to the type of the modelElemets List. 
	 *     e.g. if a user wants to update a resourceRecord-ContainerItem with a zone-ModelElement   
	 * @param dataContainer
	 * @param modelElements
	 * @throws UpdateControlsException
	 */
	public void updateControls(List containerList, List modelElements) throws UpdateControlsException
	{
		if (modelElements.size() != containerList.size())
		{
			String msg = "There are {0} resource Records found in Model and {1} in GUI. Cannot update the GUI";
			throw new UpdateControlsException(MessageFormat.format(msg,new Object[]{new Integer(modelElements.size()),new Integer(containerList.size())}));
		}
		
		for (int i=0; i <  modelElements.size(); i++) {
			CIM_ManagedElement modelElement = (CIM_ManagedElement) modelElements.get(i);
			DataContainer containerElement = (DataContainer)containerList.get(i);

			Class modelClass = modelElement.getClass();
			
			Class containerClass = getDataContainerInterface(containerElement);
			logger.fine("updating Controls: " + containerClass.getName().toString());		

			String methodName = "updateControlsImpl";
			
			logger.fine("Using method " + methodName);		

			String signature = methodName + "(" + containerClass.getName().toString() + "," + modelClass.getName().toString() +")";
			try {
				Method method = getUpdateControlsDelegatee().getClass().getMethod(methodName, new Class[]{containerClass,modelClass});
				method.setAccessible(true);
				//1.5 method.invoke(this,new Object[]{containerClass.cast(containerElement),modelClass.cast(modelElement)});
				method.invoke(getUpdateControlsDelegatee(),new Object[]{containerElement,modelElement});
			} catch (NoSuchMethodException e) {
				logger.log(Level.SEVERE, "Cannot update Controls with Method " + signature +". Method not exists");
				throw new UpdateControlsException("Internal error");
			} catch (InvocationTargetException e) {
				Throwable t = e.getTargetException();
				logger.log(Level.SEVERE, "Cannot update Object with Method " + signature,t);
				if (t instanceof UpdateControlsException) {
					UpdateControlsException e1 = (UpdateControlsException) t;
					throw e1;
				}
				else
				{
					throw new UpdateControlsException("Internal error",t);
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Cannot update Object with Method " + signature,e);
				throw new UpdateControlsException("Internal error");
			} 
		}		
	}
	
	/**
	 * saves the changes contained in the dataContainer
	 * 
	 * The implementor have to decide if he wants to save the childs too
	 * 
	 * Calls the saveImpl-Methods on the derived class
	 * 
	 * @param dataContainer
	 * @throws ObjectUpdateException
	 */
	public void save(DataContainer dataContainer) throws ObjectSaveException
	{
		
		if (!DataContainerUtil.validateEnteredValues(dataContainer))
		{
			return;
		}

		Class interfaceClass = getDataContainerInterface(dataContainer);
		String interfaceName = interfaceClass.getName();
		logger.fine("Creating: " + interfaceName);		

		String methodName = "saveImpl";
		
		logger.fine("Using method " + methodName);		
		
		try {
			Method method = getSaveDelegatee().getClass().getMethod(methodName, new Class[]{interfaceClass});
			method.setAccessible(true);
			MessageList list = (MessageList) method.invoke(getSaveDelegatee(),new Object[]{dataContainer});
			dataContainer.setMessagesList(list != null ? list : new MessageList());
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE, "Cannot save Object with Method " + methodName + "(" + interfaceClass.getName().toString() + "). Method not exists");
			throw new ObjectSaveException("Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot save Object with Method " + methodName,t);
			if (t instanceof ObjectSaveException) {
				ObjectSaveException e1 = (ObjectSaveException) t;
				throw e1;
			}
			else
			{
				throw new ObjectSaveException("Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot save Object with Method " + methodName,e);
			throw new ObjectSaveException("Internal error");
		} 
	}
	
	/**
	 * saves the List ModelElements
	 * a UpdateControlsException should be thrown:
	 *   - if the size datContainer-List is not equal the size of the modelElements-List
	 *   - if the type of a element in the dataContainer list doesn't fit to the type of the modelElemets List. 
	 *     e.g. if a user wants to update a resourceRecord-ContainerItem with a zone-ModelElement   
	 * @param dataContainer
	 * @param modelElements
	 * @throws UpdateControlsException
	 */
	public MessageList save(List containerList, List modelElements) throws ObjectSaveException
	{
		
		if (modelElements.size() != containerList.size())
		{
			String msg = "There are {0} resource Records found in Model and [1} in GUI. Cannot save the GUI";
			throw new ObjectSaveException(bundle.getString(msg,new Object[]{new Integer(modelElements.size()),new Integer(containerList.size())}));
		}
		
		MessageList result = new MessageList();
		
		for (int i=0; i <  modelElements.size(); i++) {
			CIM_ManagedElement modelElement = (CIM_ManagedElement) modelElements.get(i);
			DataContainer containerElement = (DataContainer)containerList.get(i);

			if (!DataContainerUtil.validateEnteredValues(containerElement))
			{
				return containerElement.getMessagesList();
			}
			
			Class modelClass = modelElement.getClass();
			Class containerClass = getDataContainerInterface(containerElement);
			logger.fine("updating Controls: " + containerClass.getName().toString());		

			String methodName = "saveImpl";
			
			logger.fine("Using method " + methodName);		

			String signature = methodName + "(" + containerClass.getName().toString() + "," + modelClass.getName().toString() +")";
			try {
				Method method = getSaveDelegatee().getClass().getMethod(methodName, new Class[]{containerClass,modelClass});
				method.setAccessible(true);
				MessageList result1 = (MessageList) method.invoke(getSaveDelegatee(),new Object[]{containerElement,modelElement});
				result.addAll(result1);
			} catch (NoSuchMethodException e) {
				logger.log(Level.SEVERE, "Cannot save Controls with Method " + signature +". Method not exists");
				throw new ObjectSaveException("Internal error");
			} catch (InvocationTargetException e) {
				Throwable t = e.getTargetException();
				logger.log(Level.SEVERE, "Cannot save Object with Method " + signature,t);
				if (t instanceof ObjectSaveException) {
					ObjectSaveException e1 = (ObjectSaveException) t;
					throw e1;
				}
				else
				{
					throw new ObjectSaveException("Internal error",t);
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Cannot save Object with Method " + signature,e);
				throw new ObjectSaveException("Internal error");
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
	 * @param dataContainer
	 * @throws ObjectUpdateException
	 */
	public void revert(DataContainer dataContainer) throws ObjectRevertException
	{
		
		if (!DataContainerUtil.validateEnteredValues(dataContainer))
		{
			return;
		}

		Class interfaceClass = getDataContainerInterface(dataContainer);
		String interfaceName = interfaceClass.getName();
		logger.fine("Reverting: " + interfaceName);		

		String methodName = "revertImpl";
		
		logger.fine("Using method " + methodName);		
		
		try {
			Method method = getRevertDelegatee().getClass().getMethod(methodName, new Class[]{interfaceClass});
			method.setAccessible(true);
			MessageList list = (MessageList) method.invoke(getRevertDelegatee(),new Object[]{dataContainer});
			dataContainer.setMessagesList(list != null ? list : new MessageList());
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE, "Cannot revert Object with Method " + methodName + "(" + interfaceClass.getName().toString() + "). Method not exists");
			throw new ObjectRevertException("Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot revert Object with Method " + methodName,t);
			if (t instanceof ObjectRevertException) {
				ObjectRevertException e1 = (ObjectRevertException) t;
				throw e1;
			}
			else
			{
				throw new ObjectRevertException("Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot revert Object with Method " + methodName,e);
			throw new ObjectRevertException("Internal error");
		} 
	}
	
	/**
	 * saves the List ModelElements
	 * a UpdateControlsException should be thrown:
	 *   - if the size datContainer-List is not equal the size of the modelElements-List
	 *   - if the type of a element in the dataContainer list doesn't fit to the type of the modelElemets List. 
	 *     e.g. if a user wants to update a resourceRecord-ContainerItem with a zone-ModelElement   
	 * @param dataContainer
	 * @param modelElements
	 * @throws UpdateControlsException
	 */
	public MessageList revert(List containerList, List modelElements) throws ObjectRevertException
	{
		
		if (modelElements.size() != containerList.size())
		{
			String msg = "There are {0} resource Records found in Model and [1} in GUI. Cannot revert the GUI";
			throw new ObjectRevertException(bundle.getString(msg,new Object[]{new Integer(modelElements.size()),new Integer(containerList.size())}));
		}
		
		MessageList result = new MessageList();
		
		for (int i=0; i <  modelElements.size(); i++) {
			CIM_ManagedElement modelElement = (CIM_ManagedElement) modelElements.get(i);
			DataContainer containerElement = (DataContainer)containerList.get(i);

			if (!DataContainerUtil.validateEnteredValues(containerElement))
			{
				return containerElement.getMessagesList();
			}
			
			Class modelClass = modelElement.getClass();
			Class containerClass = getDataContainerInterface(containerElement);
			logger.fine("updating Controls: " + containerClass.getName().toString());		

			String methodName = "revertImpl";
			
			logger.fine("Using method " + methodName);		

			String signature = methodName + "(" + containerClass.getName().toString() + "," + modelClass.getName().toString() +")";
			try {
				Method method = getRevertDelegatee().getClass().getMethod(methodName, new Class[]{containerClass,modelClass});
				method.setAccessible(true);
				MessageList result1 = (MessageList) method.invoke(getRevertDelegatee(),new Object[]{containerElement,modelElement});
				result.addAll(result1);
			} catch (NoSuchMethodException e) {
				logger.log(Level.SEVERE, "Cannot revert Controls with Method " + signature +". Method not exists");
				throw new ObjectRevertException("Internal error");
			} catch (InvocationTargetException e) {
				Throwable t = e.getTargetException();
				logger.log(Level.SEVERE, "Cannot revert Object with Method " + signature,t);
				if (t instanceof ObjectRevertException) {
					ObjectRevertException e1 = (ObjectRevertException) t;
					throw e1;
				}
				else
				{
					throw new ObjectRevertException("Internal error",t);
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Cannot revert Object with Method " + signature,e);
				throw new ObjectRevertException("Internal error");
			} 
		}		
		return result;
	}

	/**
	 * update the Data Model (Triggered by the frontend)
	 * 
	 * The implementor have to decide if he wants to save the childs too
	 * 
	 * @param dataContainer
	 * @throws ObjectUpdateException
	 */
	public void updateModel(DataContainer dataContainer) throws ObjectUpdateException
	{
		updateModel(dataContainer, null);
	}	
	/**
	 * saves the changes contained in the dataContainer
	 * 
	 * The implementor have to decide if he wants to save the childs too
	 * 
	 * To check if the Correspondig field was the trigger use within the update-Method:
	 * boolean buttonPressed = dataContainer.get_<Fieldname>() == updateTrigger;
	 * 
	 * @param dataContainer
	 * @param updateTrigger The input component who triggered the update
	 * @throws ObjectUpdateException
	 */
	public void updateModel(DataContainer dataContainer, LabeledBaseInputComponentIf updateTrigger) throws ObjectUpdateException
	{
		if (!DataContainerUtil.validateEnteredValues(dataContainer))
		{
			return;
		}
		
		this.updateTrigger = updateTrigger;
		Class interfaceClass = getDataContainerInterface(dataContainer);
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
			throw new ObjectUpdateException("Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,t);
			if (t instanceof ObjectUpdateException) {
				ObjectUpdateException e1 = (ObjectUpdateException) t;
				throw e1;
			}
			else
			{
				throw new ObjectUpdateException("Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,e);
			throw new ObjectUpdateException("Internal error");
		} 
	}
	
	/**
	 * updates the modelElements
	 * a ObjectUpdateException should be thrown:
	 *   - if the size datContainer-List is not equal the size of the modelElements-List
	 *   - if the type of a element in the dataContainer list doesn't fit to the type of the modelElemets List. 
	 *     e.g. if a user wants to update a resourceRecord-ContainerItem with a zone-ModelElement   
	 * @param dataContainer
	 * @param modelElements
	 * @throws UpdateControlsException
	 */
	public void updateModel(List containerList, List modelElements) throws ObjectUpdateException
	{
		if (modelElements.size() != containerList.size())
		{
			String msg = "There are {0} resource Records found in Model and [1} in GUI. Cannot update the GUI";
			throw new ObjectUpdateException(bundle.getString(msg,new Object[]{new Integer(modelElements.size()),new Integer(containerList.size())}));
		}
		
		for (int i=0; i <  modelElements.size(); i++) {
			CIM_ManagedElement modelElement = (CIM_ManagedElement) modelElements.get(i);
			DataContainer containerElement = (DataContainer)containerList.get(i);

			Class modelClass = modelElement.getClass();
			
			Class containerClass = getDataContainerInterface(containerElement);
			logger.fine("updating : " + containerClass.getName().toString());		

			String methodName = "updateModelImpl";
			
			logger.fine("Using method " + methodName);		

			String signature = methodName + "(" + containerClass.getName().toString() + "," + modelClass.getName().toString() +")";
			try {
				Method method = getUpdateModelDelegatee().getClass().getMethod(methodName, new Class[]{containerClass,modelClass});
				method.setAccessible(true);
				method.invoke(getUpdateModelDelegatee(),new Object[]{containerElement,modelElement});
			} catch (NoSuchMethodException e) {
				logger.log(Level.SEVERE, "Cannot update Model with Method " + signature +". Method not exists");
				throw new ObjectUpdateException("Internal error");
			} catch (InvocationTargetException e) {
				Throwable t = e.getTargetException();
				logger.log(Level.SEVERE, "Cannot update Model with Method " + signature,t);
				if (t instanceof ObjectUpdateException) {
					ObjectUpdateException e1 = (ObjectUpdateException) t;
					throw e1;
				}
				else
				{
					throw new ObjectUpdateException("Internal error",t);
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Cannot update Model with Method " + signature,e);
				throw new ObjectUpdateException("Internal error");
			} 
		}		
	}

	/**
	 * Deletes the selected Object of the given type
	 * @param dataContainerClass
	 * @throws ObjectDeletionException
	 */
	public void delete() throws ObjectDeletionException
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
			throw new ObjectDeletionException("Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot delete Object with Method " + methodName,t);
			if (t instanceof ObjectDeletionException) {
				ObjectDeletionException e1 = (ObjectDeletionException) t;
				throw e1;
			}
			else
			{
				throw new ObjectDeletionException("Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot delete Object with Method " + methodName,e);
			throw new ObjectDeletionException("Internal error");
		} 
	}
	
	/**
	 * creates the object that belongs to the given container
	 * @param dataContainer
	 * @throws ObjectCreationException
	 */
	public void create(DataContainer dataContainer) throws ObjectCreationException
	{
		
		//This variable can be step by the business logic which is creating a new object
		pathOfTreeNode = null;
		
		Class interfaceClass = getDataContainerInterface(dataContainer);
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
			throw new ObjectCreationException("Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot create Object with Method " + methodName,t);
			if (t instanceof ObjectCreationException) {
				ObjectCreationException e1 = (ObjectCreationException) t;
				throw e1;
			}
			else
			{
				throw new ObjectCreationException("Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot create Object with Method " + methodName,e);
			throw new ObjectCreationException("Internal error");
		} 
	}

	/**
	 * Gets the interface class of a dataContainer
	 * @param dataContainer
	 * @return
	 */
	private Class getDataContainerInterface(DataContainer dataContainer) {
		Class[] interfaces = dataContainer.getClass().getInterfaces();
		Class interfaceClass = null;
		for (int i = 0; i < interfaces.length; i++) {
			interfaceClass = interfaces[i];
			String interfaceName = interfaceClass.getName();
			if (interfaceName.endsWith("DataContainer"))
			{
				break;
			}
		}
		return interfaceClass;
	}
	
	/**
	 * install the validators for the given container
	 * @param dataContainer
	 * @throws ValidationException 
	 */
	private void installValidators(DataContainer dataContainer) throws ValidationException
	{
		Class interfaceClass = getDataContainerInterface(dataContainer);
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
			throw new ValidationException("Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot InstallValidators with Method " + methodName,t);
			if (t instanceof ValidationException) {
				ValidationException e1 = (ValidationException) t;
				throw e1;
			}
			else
			{
				throw new ValidationException("Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot InstallValidators with Method " + methodName,e);
			throw new ValidationException("Internal error");
		} 
	}
	
	/**
	 * Adds the validator to the given container
	 * @param dataContainer
	 * @param validator
	 */
	public void addValidator(DataContainer dataContainer, Validator validator)
	{
		validators.put(dataContainer,validator);
	}
	
	/**
	 * validates the dataContainer
	 * @param dataContainer
	 * @return
	 * @throws ValidationException
	 */
	public void validateValues(DataContainer dataContainer) throws ValidationException {
		
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
	 * Count a class that should be the fco of datacontainer linked as list within a parent container
	 * @param classToCount
	 * @return
	 * @throws CountException
	 */
	public int count(Class classToCount) throws CountException
	{
		String className = classToCount.getName();
		if (className.indexOf(".")>-1)
		{
			className = className.substring(className.lastIndexOf(".")+1);
		}
		
		logger.fine("Counting " + className);		

		String methodName = "countImpl_" + className;
		
		logger.fine("Using method " + methodName);		
		
		try {
			Method method = getCountDelegatee().getClass().getMethod(methodName, new Class[]{});
			method.setAccessible(true);
			Integer count = (Integer)method.invoke(getCountDelegatee(),new Object[]{});
			return count.intValue();
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE, "Cannot count with Method " + methodName +". Method not exists or returns no int");
			throw new CountException("Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,t);
			if (t instanceof CountException) {
				throw (CountException)t;
			}
			throw new CountException("Internal error",t);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot update Object with Method " + methodName,e);
			throw new CountException("Internal error");
		} 		
	}

	/**
	 * Get the CimClient of this adapter
	 * @return
	 */
	public CIMClient getCimClient() {
		return cimClient;
	}

	/**
	 * set the CimClient of this Adapter
	 * @param cimClient
	 */
	public void setCimClient(CIMClient cimClient) {
		this.cimClient = cimClient;
	}

	/**
	 * return true if the adapter was loaded
	 * @return
	 */
	public boolean isLoaded() {
		return loaded;
	}

	/**
	 * set the Adapter as loaded
	 * @param loaded
	 */
	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}

	/**
	 * Get the resource Bundle of the adapter
	 * @return
	 */
	public WbemSmtResourceBundle getBundle() {
		return bundle;
	}

	/**
	 * set the resource bundle of the task belonging to this adapter
	 * @param bundle
	 */
	public void setBundle(WbemSmtResourceBundle bundle) {
		this.bundle = bundle;
	}

	/**
	 * Get the Component which was used as trigger for a updateModel action. This is normally done by a button
	 * @return
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
	 * @param base 
	 * @param dataContainer
	 * @throws InitWizardException 
	 */
	public void initWizard(WizardBase base, DataContainer dataContainer, String currentPageName) throws InitWizardException {
		
		activeModule = ACTIVE_WIZARD;
		
		Class interfaceClass = getDataContainerInterface(dataContainer);
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
			throw new InitWizardException("Internal error");
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			logger.log(Level.SEVERE, "Cannot init wizard with Method " + methodName,t);
			if (t instanceof InitWizardException) {
				InitWizardException e1 = (InitWizardException) t;
				throw e1;
			}
			else
			{
				throw new InitWizardException("Internal error",t);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot init wizard with Method " + methodName,e);
			throw new InitWizardException("Internal error");
		} 
		
	}

	
	public void addLocaleChangeListener(LocaleChangeListener listener)
	{
		//no all having a locale change manager
		if (localeManager != null)
		{
			localeManager.addLocaleChangeListener(listener);
		}
	}
	
	public void setLocaleManager(ILocaleManager localeManager) {
		this.localeManager = localeManager;
		if (bundle == null || !bundle.getLocale().equals(localeManager.getCurrentLocale()))
		{
			bundle = ResourceBundleManager.getResourceBundle(getResourceBundleNames(),localeManager.getCurrentLocale());
		}
		addLocaleChangeListener(this);
	}

	public void localeChanged(Locale newLocale)
	{
		bundle = ResourceBundleManager.getResourceBundle(getResourceBundleNames(),newLocale);			
	}
	
	public boolean isMarkedForReload() {
		return markedForReload;
	}

	public void setMarkedForReload() {
		this.markedForReload = true;
	}
	
	public boolean isEditObjectMarkedForReload() {
		return editObjectMarkedForReload;
	}

	/**
	 * set to true if the edit object should be refreshed (for example after a updateModel action deleting some items)
	 * 
	 * Only evaluated if the user in a editAction.
	 * 
	 * @param editObjectMarkedForReload
	 */
	public void setEditObjectMarkedForReload(boolean editObjectMarkedForReload) {
		this.editObjectMarkedForReload = editObjectMarkedForReload;
	}

	/**
	 * reloads the Tree. Is only executed if marked for reload
	 * @throws WbemSmtException
	 * @see AbstractBaseCimAdapter#markedForReload
	 */
	public void reload() throws WbemSmtException
	{
		if (markedForReload)
		{
			if (rootNode != null)
			{
				rootNode.readSubnodes(true);
			}
			markedForReload = false;
		}
	}
	
	public void cleanup()
	{
		CimAdapterFactory.getInstance().removeAdapter(this);		
	}

	public CIMObjectPath getPathOfTreeNode() {
		return pathOfTreeNode;
	}

	public void setPathOfTreeNode(CIMObjectPath pathOfCreatedNode) {
		this.pathOfTreeNode = pathOfCreatedNode;
	}

	public int getActiveModule() {
		return activeModule;
	}

	public void setActiveModule(int activeModule) {
		this.activeModule = activeModule;
	}
	
	
	
}
