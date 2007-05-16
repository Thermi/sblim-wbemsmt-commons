 /** 
  * FcoHelper.java
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
  * Description: Helper class to handle actions on FCOs
  * 
  */
package org.sblim.wbemsmt.bl.fco;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ModelUpdateException;
import org.sblim.wbemsmt.exception.ObjectCreationException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.ObjectUpdateException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponent;

public class FcoHelper
{
	
	private CIM_ObjectCreatorIf creator;
	
	static MultiMap listeners = new MultiHashMap();
	
	public static final String PREFIX_LINUX = "Linux_";

	static Logger logger = Logger.getLogger(FcoHelper.class.getName());
	
	public FcoHelper(CIM_ObjectCreatorIf creator) {
		super();
		this.creator = creator;
	}

	public  void delete(Collection c, CIMClient cimClient) throws ObjectDeletionException
	{
		for (Iterator it = c.iterator(); it.hasNext();) {
			Object obj = (Object) it.next();
			delete((CIM_ObjectIf)obj, cimClient);
		}
	}
	
	/**
	 * deletes the object
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws ObjectDeletionException
	 */
	public  void delete(CIM_ObjectIf fco, CIMClient cimClient) throws ObjectDeletionException 
	{
		delete(fco,cimClient,false);
	}

	/**
	 * deletes the object
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws ObjectDeletionException
	 */
	public  void delete(Object fco, CIMClient cimClient) throws ObjectDeletionException 
	{
		try {
			delete(creator.create(fco),cimClient,false);
		} catch (WbemSmtException e) {
			throw new ObjectDeletionException(e);
		}
	}

	/**
	 * deletes the object
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws ObjectDeletionException
	 */
	public  void delete(Object fco, CIMClient cimClient, boolean testIfObjectRemovedAfterDeletion) throws ObjectDeletionException 
	{
		try {
			delete(creator.create(fco),cimClient,testIfObjectRemovedAfterDeletion);
		} catch (WbemSmtException e) {
			throw new ObjectDeletionException(e);
		}
	}

	
	/**
	 * deletes the object
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws ObjectDeletionException
	 */
	public  void delete(CIM_ObjectIf cimObject, CIMClient cimClient, boolean testIfObjectRemovedAfterDeletion) throws ObjectDeletionException 
	{
		
		Object objectToDelete = cimObject.getWrappedObject();
		
		String helperName = objectToDelete.getClass().getName() + "Helper";
		Class helperClass = null;
		try {
			helperClass = Class.forName(helperName,true,objectToDelete.getClass().getClassLoader());
			FcoHelperProcessItemEvent event = fireEvent(FcoHelperProcessItemEvent.TYPE_BEFORE_DELETE,cimObject);
			if (!event.isDoProcessing())
			{
				logger.log(Level.WARNING,"Processing stopped by EventListener");
				return;
			}			
			Method method = helperClass.getMethod("deleteInstance", new Class[]{CIMClient.class,objectToDelete.getClass()});
			logger.fine("Calling " + helperName + "." + method.getName()  + " with fco " + objectToDelete.toString()+ " on " + cimClient.getNameSpace().toString());
			method.invoke(null,new Object[]{cimClient,objectToDelete});
			logger.info("Deleted " + cimObject.getCimObjectPath() + " on " + cimClient.getNameSpace().toString());
			
			fireEvent(FcoHelperProcessItemEvent.TYPE_AFTER_DELETE,cimObject);
			
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE,"Cannot find Helper class " + helperName + " for deleting object",e);
			throw new ObjectDeletionException("Internal error");
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot find deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new ObjectDeletionException("Internal error");
		} catch (IllegalAccessException e) {
			logger.log(Level.SEVERE,"Cannot access deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new ObjectDeletionException("Internal error");
		} catch (InvocationTargetException e) {
			logger.log(Level.SEVERE,"Cannot invoke deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new ObjectDeletionException("Internal error",cimObject, e.getTargetException());
			
		} catch (RuntimeException e) {
		    logger.log(Level.SEVERE,"Cannot execute deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new ObjectDeletionException("Internal error");
		}
		
		//test if deletion was ok
		if (testIfObjectRemovedAfterDeletion)
		{
			try {
				Method getInstanceMethod = helperClass.getMethod("getInstance", new Class[]{CIMClient.class,CIMObjectPath.class});

				Object obj = getInstanceMethod.invoke(null,new Object[]{cimClient,cimObject.getCimObjectPath()});
				
				if (obj != null)
				{
					objectToDelete = creator.create(obj);
					throw new ObjectDeletionException("After deleting the object " + cimObject.getCimObjectPath() + " on " + cimClient.getNameSpace().toString() + " the object was still found.");					
				}
			} 
			catch (ObjectDeletionException e)
			{
				throw e;
				
			} catch (Exception e) {
				if (e instanceof InvocationTargetException && ((InvocationTargetException)e).getTargetException() instanceof CIMException)
				{
					CIMException cimException = (CIMException) ((InvocationTargetException)e).getTargetException();
					if (cimException.getID().equals(CIMException.CIM_ERR_NOT_FOUND))
					{
						//everything okay
						return;
					}
					else
					{
						throw new ObjectDeletionException("After deleting the object " + cimObject.getCimObjectPath() + " on " + cimClient.getNameSpace().toString() + " the object was still found.",e);
					}
				}
				throw new ObjectDeletionException("Verification if the deletion was done was not possible",cimObject,e);
			}			
		}		
	}

	/**
	 * Creates a new FCO with the given keyProperties and deletes it
	 * @param fcoClass
	 * @param keyProperties
	 * @param cimClient
	 */
	public  void delete(Class fcoClass, Vector keyProperties, CIMClient cimClient) throws ObjectDeletionException  {
		delete(fcoClass,keyProperties,cimClient,true);
	}	
	/**
	 * load a FCO with the given keyProperties and deletes it
	 * @param fcoClass
	 * @param keyProperties
	 * @param cimClient
	 */
	public  void delete(Class fcoClass, Vector keyProperties, CIMClient cimClient, boolean testIfObjectRemovedAfterDeletion) throws ObjectDeletionException  {
		
		
		String helperName = fcoClass.getName() + "Helper";
		CIM_ObjectIf cimObject = null;
		
		try {
			Class helperClass = Class.forName(helperName,true,fcoClass.getClassLoader());
			
			//get the instance - if the instance was not found -> ready & return
			
			Constructor constructor = fcoClass.getConstructor(new Class[]{Vector.class});
			cimObject = creator.create(constructor.newInstance(new Object[]{keyProperties}));
			cimObject.getCimObjectPath().setNameSpace(cimClient.getNameSpace());
			
			Method getInstanceMethod = helperClass.getMethod("getInstance", new Class[]{CIMClient.class,CIMObjectPath.class});
			getInstanceMethod.setAccessible(true);
			try {
				cimObject = creator.create(getInstanceMethod.invoke(null,new Object[]{cimClient,cimObject.getCimObjectPath()}));
			} catch (CIMException e) {
				if (e.getID().equals(CIMException.CIM_ERR_NOT_FOUND))
				{
					//everything okay object was already deleted
					return;
				}
				throw e;
			}

			FcoHelperProcessItemEvent event = fireEvent(FcoHelperProcessItemEvent.TYPE_BEFORE_DELETE,cimObject);
			if (!event.isDoProcessing())
			{
				logger.log(Level.WARNING,"Processing stopped by EventListener");
				return;
			}

			
			Method deleteMethod = helperClass.getMethod("deleteInstance", new Class[]{CIMClient.class,fcoClass});
			deleteMethod.setAccessible(true);
			logger.fine("Calling " + helperName + "." + deleteMethod.getName()  + " with fco " + fcoClass.toString()+ " on " + cimClient.getNameSpace().toString());
			deleteMethod.invoke(null,new Object[]{cimClient,cimObject.getWrappedObject()});
			
			String path = cimObject.getCimObjectPath().toString();

			//test if deletion was ok
//			if (testIfObjectRemovedAfterDeletion)
//			{
//				try {
//					fco = getInstanceMethod.invoke(null,new Object[]{cimClient,keyProperties});
//					if (fco != null)
//					{
//						throw new ObjectDeletionException("After deleting the object " + path + " on " + cimClient.getNameSpace().toString() + " the object was still found.");					
//					}
//				} catch (CIMException e) {
//					if (e.getID().equals(CIMException.CIM_ERR_NOT_FOUND))
//					{
//						//everything okay
//					}
//					else
//					{
//						throw new ObjectDeletionException("After deleting the object " + path + " on " + cimClient.getNameSpace().toString() + " the object was still found.",e);
//					}
//				}
//			}
			
			logger.info("Deleted " + path + " on " + cimClient.getNameSpace().toString());
			
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE,"Cannot find Helper class " + helperName + " for deleting object",e);
			throw new ObjectDeletionException("Internal error");
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot find deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new ObjectDeletionException("Internal error");
		} catch (IllegalAccessException e) {
			logger.log(Level.SEVERE,"Cannot access deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new ObjectDeletionException("Internal error");
		} catch (InvocationTargetException e) {
			logger.log(Level.SEVERE,"Cannot invoke deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new ObjectDeletionException("Internal error",cimObject, e.getTargetException());
		} catch (RuntimeException e) {
		    logger.log(Level.SEVERE,"Cannot execute deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new ObjectDeletionException("Internal error");
		} catch (InstantiationException e) {
		    logger.log(Level.SEVERE,"Cannot execute createInstance-Method on constructor of class " + fcoClass.getName() + " for getting instance",e);
			throw new ObjectDeletionException("Internal error",e);
		} catch (WbemSmtException e) {
		    logger.log(Level.SEVERE,"Cannot execute createInstance-Method on constructor of class " + fcoClass.getName() + " for getting instance",e);
			throw new ObjectDeletionException("Internal error",e);
		}
		fireEvent(FcoHelperProcessItemEvent.TYPE_AFTER_DELETE,cimObject);
		
	}

	/**
	 * creates objects
	 * @param o the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @return 
	 * @throws ObjectDeletionException
	 */

	public  Collection create(Collection c, CIMClient cimClient) throws ObjectCreationException 
	{
		List result = new ArrayList();
		for (Iterator it = c.iterator(); it.hasNext();) {
			Object o1 = (Object) it.next();
			if (o1 instanceof CIM_ObjectIf) {
				CIM_ObjectIf managedElement = (CIM_ObjectIf) o1;
				result.add(create(managedElement, cimClient));
			}
			else
			{
				logger.log(Level.SEVERE,"Cannot create object with class " + o1.getClass().getName());
				throw new ObjectCreationException("Internal error");
			}
		}
		c.clear();
		c.addAll(result);
		return result;

	}
	/**
	 * creates objects
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @return 
	 * @throws ObjectCreationException
	 */

	public  Object create(CIM_ObjectIf fco, CIMClient cimClient) throws ObjectCreationException 
	{
		return create(fco,cimClient,false);
		
	}
	
	/**
	 * creates objects
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @return 
	 * @throws ObjectCreationException
	 */

	public  Object create(Object fco, CIMClient cimClient) throws ObjectCreationException 
	{
		try {
			return create(creator.create(fco),cimClient,false);
		} catch (WbemSmtException e) {
			throw new ObjectCreationException(e);
		}
		
	}

	/**
	 * creates objects
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @return 
	 * @throws ObjectCreationException
	 */

	public  Object create(Object fco, CIMClient cimClient, boolean testIfObjectExists) throws ObjectCreationException 
	{
		try {
			return create(creator.create(fco),cimClient,testIfObjectExists);
		} catch (WbemSmtException e) {
			throw new ObjectCreationException(e);
		}
		
	}
	
	/**
	 * creates objects
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @return the created object or input-fco if no object was created
	 * @throws ObjectCreationException
	 */

	public  Object create(CIM_ObjectIf cimObject, CIMClient cimClient, boolean testIfObjectExists) throws ObjectCreationException 
	{
		checkFieldSet(cimObject, "get_InstanceID");
		
		Object fco = cimObject.getWrappedObject();
		
		String helperName = fco.getClass().getName() + "Helper";
		CIM_ObjectIf newInstance = null;
		Class helperClass = null;
		
		try {
			FcoHelperProcessItemEvent event = fireEvent(FcoHelperProcessItemEvent.TYPE_BEFORE_CREATE,cimObject);
			if (!event.isDoProcessing())
			{
				logger.log(Level.WARNING,"Processing stopped by EventListener");
				return fco;
			}

			helperClass = Class.forName(helperName,true,fco.getClass().getClassLoader());
			Method method = helperClass.getMethod("createInstance", new Class[]{CIMClient.class,fco.getClass(),boolean.class});
			logger.fine("Calling " + helperName + "." + method.getName()  + " with fco " + fco.toString()+ " on " + cimClient.getNameSpace().toString());
			Object createdObject = method.invoke(null,new Object[]{cimClient,fco,Boolean.TRUE});
			if (createdObject == null)
			{
				logger.log(Level.SEVERE,"Cannot create Object - The new created cimInstance could not retrieved properly from the server. Old: " + fco + " from server: " + createdObject);
				throw new ObjectCreationException("Internal error");
			}
			else
			{
				newInstance = creator.create(createdObject);
				String path = newInstance.getCimObjectPath().toString();
				logger.info("Created " + path + " on " + cimClient.getNameSpace().toString());
			}
			
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE,"Cannot find Helper class " + helperName + " for creating object",e);
			throw new ObjectCreationException("Internal error");
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot find createInstance-Method on class " + helperName + " for creating object",e);
			throw new ObjectCreationException("Internal error");
		} catch (IllegalAccessException e) {
			logger.log(Level.SEVERE,"Cannot access createInstance-Method on class " + helperName + " for creating object",e);
			throw new ObjectCreationException("Internal error");
		} catch (InvocationTargetException e) {
			logger.log(Level.SEVERE,"Cannot access createInstance-Method on class " + helperName + " for creating object");
			throw new ObjectCreationException("Internal error",cimObject,e.getTargetException());
		} catch (RuntimeException e) {
			logger.log(Level.SEVERE,"Cannot execute createInstance-Method on class " + helperName + " for creating object",e);
			throw new ObjectCreationException("Internal error",e);
		} catch (WbemSmtException e) {
		    throw new ObjectCreationException("Internal error",e);
		}

		if (newInstance == null)
		{
			logger.log(Level.SEVERE,"The creation of Fco " + fco + " returned no value.");
		    throw new ObjectCreationException("Internal error");
		}
		if (testIfObjectExists)
		{
			try {
				Method getInstanceMethod = helperClass.getMethod("getInstance", new Class[]{CIMClient.class,CIMObjectPath.class});
				getInstanceMethod.setAccessible(true);

				CIMObjectPath path = cimObject.getCimObjectPath();

				try {
					Object createdFco = getInstanceMethod.invoke(null,new Object[]{cimClient,path});
					if (createdFco == null)
					{
						logger.log(Level.SEVERE,"Cannot find created object with CimObjectPath " + path);						
					    throw new ObjectCreationException("Internal error");
					}
				} catch (CIMException e) {
					if (e.getID().equals(CIMException.CIM_ERR_NOT_FOUND))
					{
						logger.log(Level.SEVERE,"Cannot find created object with CimObjectPath " + path);
					    throw new ObjectCreationException("Internal error");
					}
					throw e;
				}
			} catch (ObjectCreationException e) {
				throw e;
			} catch (Exception e) {
				logger.log(Level.SEVERE,"Cannot check the creation of Fco " + fco,e);
			    throw new ObjectCreationException("Internal error",e);
			}
		}
		
		fireEvent(FcoHelperProcessItemEvent.TYPE_AFTER_CREATE,newInstance);
		return newInstance.getWrappedObject();
	
	}

	private  FcoHelperProcessItemEvent fireEvent(int type, CIM_ObjectIf cimObject) {
		
		FcoHelperProcessItemEvent event = new FcoHelperProcessItemEvent(cimObject,type);
		
		String className = cimObject.getWrappedObject().getClass().getName();
		
		List listeners = (List) FcoHelper.listeners.get(className);
		if (listeners != null)
		{
			for (Iterator iter = listeners.iterator(); iter.hasNext() ;) {
				FcoHelperListener listener = (FcoHelperListener) iter.next();
				logger.info("Calling " + listener.getClass().getName() + " with Event " + event.toString());
				listener.processItem(event);
			}
		}
		
		return event;
	}

	/**
	 * checks if a field is having a value. The method do the check only if the correspondig method exists. The Method must be a getter Method with no Arguments
	 * @param fco
	 * @param getterMethodName Name of the Method having no Arguments. Like every simple getter of a java bean
	 * @throws ObjectCreationException thrown if the value return by this Method is null
	 * @return The Object returned by the Method or null if the method not exists
	 */
	private  Object checkFieldSet(CIM_ObjectIf cimObject, String getterMethodName) throws ObjectCreationException {
		Object fco = cimObject.getWrappedObject();
		Object object = null;
		try {
			Method method = fco.getClass().getMethod(getterMethodName,new Class[]{});
			method.setAccessible(true);
			object = method.invoke(fco,new Object[]{});
			if (object == null)
			{
				logger.log(Level.SEVERE,"InstanceId of Fco " + fco + " is not set.");
			    throw new ObjectCreationException("Internal error");
			}
		} catch (SecurityException e1) {
			logger.log(Level.SEVERE,"",e1);
		    throw new ObjectCreationException("Internal error");
		} catch (NoSuchMethodException e1) {
			// Thats okay
		} catch (IllegalArgumentException e) {
			logger.log(Level.SEVERE,"",e);
		    throw new ObjectCreationException("Internal error");
		} catch (IllegalAccessException e) {
			logger.log(Level.SEVERE,"",e);
		    throw new ObjectCreationException("Internal error");
		} catch (InvocationTargetException e) {
			logger.log(Level.SEVERE,"",e);
			throw new ObjectCreationException("Internal error",cimObject,e.getTargetException());

		}
		return object;
	}

	public  Object create(Class fcoClass, CIMClient cimClient, Vector keyProperties) throws ObjectCreationException {
		return create(fcoClass,cimClient,keyProperties,true);
	}

	public  Object create(Class fcoClass, CIMClient cimClient, Vector keyProperties, boolean b) throws ObjectCreationException {
			
		String helperName = fcoClass.getName() + "Helper";
		CIM_ObjectIf o = null;
		
		try
		{
			Constructor constructor = fcoClass.getConstructor(new Class[]{Vector.class});
			constructor.setAccessible(true);
			o = creator.create(constructor.newInstance(new Object[]{keyProperties}));
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot find constructor for creating fco with Vector",e);
		    throw new ObjectCreationException("Internal error");
		} catch (IllegalAccessException e) {
			logger.log(Level.SEVERE,"Cannot access constructor on class " + helperName + " for deleting object",e);
		    throw new ObjectCreationException("Internal error");
		} catch (InvocationTargetException e) {
		    logger.log(Level.SEVERE,"Cannot invoke constructor-Method on class " + helperName + " for deleting object",e);
		    throw new ObjectCreationException("Cannot create FCO with keyProerties " + fcoClass.getName() + " with key-Properties " + toString(keyProperties) ,e.getTargetException());
		} catch (RuntimeException e) {
		    logger.log(Level.SEVERE,"Cannot execute deleteconstructorInstance-Method on class " + helperName + " for deleting object",e);
		    throw new ObjectCreationException("Internal error");
		} catch (InstantiationException e) {
		    logger.log(Level.SEVERE,"Cannot create on class " + fcoClass.getName() + " for deleting object",e);
		    throw new ObjectCreationException("Internal error");
		} catch (WbemSmtException e) {
			logger.log(Level.SEVERE,"Cannot create on class " + fcoClass.getName(),e);
			throw new ObjectCreationException("Internal error",e);
		}
		
		return create(o,cimClient,b);
		
	}

	/**
	 * Gets the Collection with CIMProperty-Objects as String
	 * @param cimProperties
	 * @return
	 */
	private  String toString(Collection cimProperties) {
		StringBuffer sb = new StringBuffer();
		
		for (Iterator iter = cimProperties.iterator(); iter.hasNext();) {
			CIMProperty property = (CIMProperty) iter.next();
			sb.append(property.toString()).append("\n\n");
		}
		return sb.toString();
	}

	/**
	 * saves objects
	 * @param o the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws ObjectDeletionException
	 */

	public  void save(Collection c, CIMClient cimClient) throws ObjectSaveException 
	{
		for (Iterator it = c.iterator(); it.hasNext();) {
			Object o1 = (Object) it.next();
			if (o1 instanceof CIM_ObjectIf) {
				CIM_ObjectIf managedElement = (CIM_ObjectIf) o1;
				save(managedElement, cimClient);
			}
			else
			{
				logger.log(Level.SEVERE,"Cannot save object with class " + o1.getClass().getName());
			    throw new ObjectSaveException("Internal error");
			}	
		}
	}
	
	/**
	 * saves objects, if it was modified
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws ObjectSaveException
	 * @return the modified instance - or the not modified instance if an event listener stopped the processing
	 */

	public  Object save(Object fco, CIMClient cimClient) throws ObjectSaveException 
	{
		try {
			return save(creator.create(fco),cimClient);
		} catch (WbemSmtException e) {
			throw new ObjectSaveException(e);
		}
	}	
	/**
	 * saves objects, if it was modified
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws ObjectSaveException
	 * @return the modified instance - or the not modified instance if an event listener stopped the processing
	 */

	public  Object save(CIM_ObjectIf cimObject, CIMClient cimClient) throws ObjectSaveException 
	{
		
		Object fco = cimObject.getWrappedObject();
		
		if (!cimObject.isModified())
		{
			logger.info("The element with key " + cimObject.getCimObjectPath().toString() + " was not modified and is not saved.");
			return cimObject.getWrappedObject();
		}
		
		FcoHelperProcessItemEvent event = fireEvent(FcoHelperProcessItemEvent.TYPE_BEFORE_UPDATE,cimObject);
		if (!event.isDoProcessing())
		{
			logger.log(Level.WARNING,"Processing stopped by EventListener");
			return cimObject.getWrappedObject();
		}					
		
		String helperName = fco.getClass().getName() + "Helper";
		try {
			Class helperClass = Class.forName(helperName,true,fco.getClass().getClassLoader());
			Method method = helperClass.getMethod("modifyInstance", new Class[]{CIMClient.class,fco.getClass(),boolean.class});
			logger.fine("Calling " + helperName + "." + method.getName()  + " with fco " + fco.toString()+ " on " + cimClient.getNameSpace().toString());
			fco = creator.create(method.invoke(null,new Object[]{cimClient,fco,Boolean.FALSE}));
			logger.info("Saved " + cimObject.getCimObjectPath() + " on " + cimClient.getNameSpace().toString());
			
			Method getInstance = helperClass.getMethod("getInstance", new Class[]{CIMClient.class,CIMObjectPath.class});
			getInstance.setAccessible(true);
			
			fco = creator.create(getInstance.invoke(null,new Object[]{cimClient,cimObject.getCimObjectPath()}));
			
			fireEvent(FcoHelperProcessItemEvent.TYPE_AFTER_UPDATE,cimObject);			
			
			return cimObject.getWrappedObject();
			
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE,"Cannot find Helper class " + helperName + " for saving object",e);
		    throw new ObjectSaveException("Internal error");
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot find modifyInstance-Method on class " + helperName + " for saving object",e);
		    throw new ObjectSaveException("Internal error");
		} catch (IllegalAccessException e) {
			logger.log(Level.SEVERE,"Cannot access modifyInstance-Method on class " + helperName + " for saving object",e);
		    throw new ObjectSaveException("Internal error");
		} catch (InvocationTargetException e) {
		    logger.log(Level.SEVERE,"Cannot access modifyInstance-Method on class " + helperName + " for saving object",e);
		    throw new ObjectSaveException("Internal error",cimObject,e.getTargetException());
		} catch (RuntimeException e) {
		    logger.log(Level.SEVERE,"Cannot execute modifyInstance-Method on class " + helperName + " for saving object",e);
		    throw new ObjectSaveException("Internal error");
		} catch (WbemSmtException e) {
			logger.log(Level.SEVERE,"Cannot execute modifyInstance-Method on class " + helperName + " for saving object",e);
			throw new ObjectCreationException("Internal error",e);
		}
	}
	
	/**
	 * Searches in the dataContainer for all Methods starting with get_, gets the InputComponent
	 * from the dataContainer and sets the value on the  fco.
	 * Uses setAccessible(true) to invoke the methods because methods from a inner class defined by a interface cannot be accessed
	 * see fior that http://bugs.sun.com/bugdatabase/view_bug.do;:YfiG?bug_id=4071593 
	 * of the fco
	 * @param fco
	 * @param dataContainer
	 * @param keyFields
	 * @throws ModelUpdateException 
	 */
	public  void updateFcoContent(Object fco, DataContainer dataContainer, FcoHelperKeyHashSet keyFields) throws ObjectUpdateException {
		
		logger.fine("Updating FCO " + fco.getClass().getName());
		
		Object valueToSet = null;
		String setterMethodName = null;
		
		try {
			Method[] methods = dataContainer.getClass().getMethods();
			for (int i = 0; i < methods.length; i++) {
				Method method = methods[i];
				String getterName = method.getName();
				if (getterName.startsWith("get_") 
						&& !getterName.startsWith("get_" + FcoConstants.USR_DEFINED_TOKEN)
						&& !getterName.startsWith("get_" + FcoConstants.INVOKE_TOKEN)
					)
				{
					if (! keyFields.contains(getterName.toLowerCase()))
					{
						logger.fine("Getter: " + getterName);
						method.setAccessible(true);
						valueToSet = method.invoke(dataContainer,new Object[]{});
						//call getConvertedControlValue
						valueToSet = valueToSet.getClass().getMethod("getConvertedControlValue",new Class[]{}).invoke(valueToSet,new Object[]{});
						Method[] setterMethods = fco.getClass().getMethods();
						setterMethodName = "s" + getterName.substring(1);
						boolean found = false;
						for (int j = 0; j < setterMethods.length && ! found; j++) {
							Method setterMethod = setterMethods[j];
							if (setterMethod.getName().equals(setterMethodName))
							{
								method.setAccessible(true);
								logger.fine("Setter: " + setterMethod.getName());
								logger.fine("Value: " + valueToSet);
								setterMethod.invoke(fco,new Object[]{valueToSet});
								found=true;
							}
						}
						if (!found)
						{
							logger.log(Level.SEVERE,"Method with name " + setterMethodName + " was not found on fco " + fco.getClass().getName());
						    throw new ObjectUpdateException("Internal error");
						}
					}
					else
					{
						logger.fine("Ignoring " + getterName + " - Key-Attribute.");
					}
				}
			}
		}
		catch (Exception e)
		{
			logger.log(Level.SEVERE,"Cannot update data model."
					+ " Method: " + fco.getClass().getName() + "." + setterMethodName
					+ " value " + valueToSet,e);
		    throw new ObjectUpdateException("Internal error");
		}
	}
	
	/**
	 * Searches in the dataContainer for all Methods starting with get_, gets the InputComponent
	 * from the dataContainer and sets the value on the  fco. 
	 * of the fco
	 * Uses setAccessible(true) to invoke the methods because methods from a inner class defined by a interface cannot be accessed
	 * see fior that http://bugs.sun.com/bugdatabase/view_bug.do;:YfiG?bug_id=4071593 
	 * @param fco
	 * @param dataContainer
	 * @throws ModelUpdateException 
	 */
	public  void updateControlContent(Object fco, DataContainer dataContainer) throws UpdateControlsException {
		
		try {
			Method[] methods = dataContainer.getClass().getMethods();
			for (int i = 0; i < methods.length; i++) {
				Method method = methods[i];
				String getterName = method.getName();
				if (getterName.startsWith("get_") 
						&& !getterName.startsWith("get_" + FcoConstants.USR_DEFINED_TOKEN)
						&& !getterName.startsWith("get_" + FcoConstants.INVOKE_TOKEN)
				)
				{
					//get the value from the fco
					Method getter=null;
					try {
						getter = fco.getClass().getMethod(getterName,new Class[]{});
					} catch (NoSuchMethodException e) {
						logger.log(Level.SEVERE,"Getter method " + getterName + " was not found in fco class " + fco.getClass().getName(),e);
					    throw new UpdateControlsException("Internal error");
					}
					getter.setAccessible(true);
					Object valueToSet = getter.invoke(fco,new Object[]{});
					
					//call setControlValue
					method.setAccessible(true);
					Object inputComponent = method.invoke(dataContainer,new Object[]{});
					if (!(inputComponent instanceof LabeledBaseInputComponent))
					{
						logger.log(Level.SEVERE,"Object return by Method " + getterName + " is not from type LabeledBaseInputComponent");
					    throw new UpdateControlsException("Internal error");
					}
					
					Method setterMethod=null;
					setterMethod = inputComponent.getClass().getMethod("setControlValue",new Class[]{Object.class});
					setterMethod.setAccessible(true);
					setterMethod.invoke(inputComponent,new Object[]{valueToSet});
				}
			}
		}
		catch (Exception e)
		{
			logger.log(Level.SEVERE,"Cannot update controls",e);
		    throw new UpdateControlsException("Internal error");
		}
	}

	/**
	 * Searches for the String value in the valueMap
	 * @param valueMap
	 * @param value
	 * @return -1 if not found the index within the valueMap if found
	 */
	public  int getIndex(String[] valueMap, String value) {
		
		for (int i = 0; i < valueMap.length; i++) {
			String valueMapEntry = valueMap[i];
			if (valueMapEntry.equals(value))
			{
				return i;
			}
		}
		return -1;
	}

	public  void copyValues(CIM_ObjectIf source, CIM_ObjectIf target, Class managedElementClass) throws ModelUpdateException {
		
		if (!source.getClass().equals(target.getClass()))
		{
			logger.log(Level.SEVERE,"Elements are not from same Type. Source is: " + source.getClass().getName() + " and target is " + target.getClass().getName());
		    throw new ModelUpdateException("Internal error");
		}
		
		target.setCimInstance(source.getCimInstance());
		
		try {
			
			int changeCount = 0;
			
			Field[] fields =managedElementClass.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				Field field = fields[i];
				System.err.println("Field " + field.getName() + " Type " + field.getType());
				if (field.getType().equals(CIMObjectPath.class))
				{
					field.setAccessible(true);
					field.set(target,source.getCimObjectPath());
					changeCount++;
				}
				else if (field.getType().equals(CIMInstance.class))
				{
					field.setAccessible(true);
					field.set(target,source.getCimInstance());
					changeCount++;
				}
			}
			
			if (changeCount != 3)
			{
				logger.log(Level.SEVERE,"Expected 3 changes but registered " + changeCount); 
			    throw new ModelUpdateException("Internal error");
			}
			
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot set ObjectPath",e);
		    throw new ModelUpdateException("Internal error");
		}
	}

	/**
	 * Reloads a fco from the servr
	 * @param fcoToReload
	 * @param cc
	 * @return
	 * @throws ModelLoadException 
	 */
	public  Object reload(CIM_ObjectIf cimObject, CIMClient cimClient) throws ModelLoadException {
		
		Object fcoToReload = cimObject.getWrappedObject();
		
		String helperName = fcoToReload.getClass().getName() + "Helper";
		try {
			Class helperClass = Class.forName(helperName,true,fcoToReload.getClass().getClassLoader());
			Method getInstanceMethod = helperClass.getMethod("getInstance", new Class[]{CIMClient.class,CIMObjectPath.class});
			getInstanceMethod.setAccessible(true);

			CIMObjectPath path = cimObject.getCimObjectPath();
			try {
				Object reloadedObject = getInstanceMethod.invoke(null,new Object[]{cimClient,path});
				if (reloadedObject == null)
				{
					logger.log(Level.SEVERE,"Cannot find object with CimObjectPath " + path);						
				    throw new ModelLoadException("Internal error");
				}
				CIM_ObjectIf reloadedFco = creator.create(reloadedObject);
				return reloadedFco.getWrappedObject();
			} catch (CIMException e) {
				if (e.getID().equals(CIMException.CIM_ERR_NOT_FOUND))
				{
					logger.log(Level.SEVERE,"Cannot find object with CimObjectPath " + path);
				    throw new ModelLoadException("Internal error",e);
				}
				throw e;
			}
		} catch (ModelLoadException e) {
			throw e;
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot reload Fco " + fcoToReload,e);
			throw new ModelLoadException("Internal error",e);
		}
	}

	/**
	 * Reloads a fco from the servr
	 * @param fcoToReload
	 * @param cc
	 * @return
	 * @throws ModelLoadException 
	 */
	public  Object reload(Class helperClass, CIMObjectPath path, CIMClient cimClient) throws ModelLoadException {
		try {
			Method getInstanceMethod = helperClass.getMethod("getInstance", new Class[]{CIMClient.class,CIMObjectPath.class});
			getInstanceMethod.setAccessible(true);
			try {
				CIM_ObjectIf reloadedFco = creator.create(getInstanceMethod.invoke(null,new Object[]{cimClient,path}));
				if (reloadedFco == null)
				{
					logger.log(Level.SEVERE,"Cannot find object with CimObjectPath " + path);						
				    throw new ModelLoadException("Internal error");
				}
				return reloadedFco.getWrappedObject();
			} catch (CIMException e) {
				if (e.getID().equals(CIMException.CIM_ERR_NOT_FOUND))
				{
					logger.log(Level.SEVERE,"Cannot find object with CimObjectPath " + path);
				    throw new ModelLoadException("Internal error");
				}
				throw e;
			}
		} catch (ModelLoadException e) {
			throw e;
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot reload Fco with path" + path.toString(),e);
		    throw new ModelLoadException("Internal error");
		}
	}
	
	/**
	 * gets an instance
	 * @param fcoToReload
	 * @param cc
	 * @return
	 * @throws ModelLoadException 
	 */
	public  Object getInstance(Class helperClass, Vector keys, CIMClient cimClient) throws ModelLoadException {
		try {
			Method getInstanceMethod = helperClass.getMethod("getInstance", new Class[]{CIMClient.class,Vector.class});
			getInstanceMethod.setAccessible(true);
			try {
				CIM_ObjectIf reloadedFco = creator.create(getInstanceMethod.invoke(null,new Object[]{cimClient,keys}));
				if (reloadedFco == null)
				{
					logger.log(Level.SEVERE,"Cannot find object with Keys" + keys.toString());						
				    throw new ModelLoadException("Internal error");
				}
				return reloadedFco.getWrappedObject();
			} catch (CIMException e) {
				if (e.getID().equals(CIMException.CIM_ERR_NOT_FOUND))
				{
					logger.log(Level.SEVERE,"Cannot find object with Keys " + keys.toString());
				    throw new ModelLoadException("Internal error",e);
				}
				throw e;
			}
		} catch (ModelLoadException e) {
			throw e;
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot reload Fco with keys " + keys.toString(),e);
		    throw new ModelLoadException("Internal error");
		}
	}
	
	
	public  CIMObjectPath getPath(Class fcoClass, String keyFieldName, Object keyFieldValue, CIMClient cimClient) throws ObjectNotFoundException {
		return getPath(fcoClass,new String[]{keyFieldName},new Object[]{keyFieldValue},cimClient);
	}
	
	public  CIMObjectPath getPath(Class fcoClass, String[] keyFieldNames, Object[] keyFieldValues, CIMClient cimClient) throws ObjectNotFoundException {

		String helperName = fcoClass.getName() + "Helper";
		try {
			Class helperClass = Class.forName(helperName,true,fcoClass.getClassLoader());
			Method enumMethod = helperClass.getMethod("enumerateInstanceNames", new Class[]{CIMClient.class,boolean.class});
			enumMethod.setAccessible(true);

			ArrayList list = (ArrayList) enumMethod.invoke(null, new Object[]{cimClient,Boolean.TRUE});
			
			return getPath(list,keyFieldNames,keyFieldValues);
			
		} catch (Exception e) {
			logger.log(Level.WARNING,"For Object of class " + fcoClass.getName() + " No Element with key = " + keyFieldNames + " and value = " + keyFieldValues + " was found.",e);
		    throw new ObjectNotFoundException("Internal error");
		}
	}
	public  CIMObjectPath getPath(List objectPathList, String keyFieldName, String keyFieldValue) throws ObjectNotFoundException {
		return getPath(objectPathList, new String[]{keyFieldName}, new String[]{keyFieldValue});
	}
	public  CIMObjectPath getPath(List objectPathList, String[] keyFieldNames, Object[] keyFieldValues) throws ObjectNotFoundException {

		try {
			for (Iterator iter = objectPathList.iterator(); iter.hasNext();) {
				Object o = iter.next();
				CIMObjectPath path = (CIMObjectPath) o;
				int matchCount = 0;
				for (int i = 0; i < keyFieldNames.length; i++) {
					if (path.getKey(keyFieldNames[i]).getValue().getValue().equals(keyFieldValues[i]))
					{
						matchCount++;
					}
					else
					{
						break;
					}
				}
				if (matchCount == keyFieldNames.length)
				{
					return path;
				}
			}
		} catch (Exception e) {
			logger.log(Level.WARNING,"In List no Element with keys = " + keyFieldNames + " and value = " + keyFieldValues + " was found.",e);
		    throw new ObjectNotFoundException("Internal error");
		}

		logger.log(Level.WARNING,"In List no Element with key = " + keyFieldNames + " and value = " + keyFieldValues + " was found.");
	    throw new ObjectNotFoundException("Internal error");
	}


	public  void addFcoHelperListener(Class fcoClass, FcoHelperListener listener)
	{
		listeners.put(fcoClass.getName(),listener);
	}

	public  void removeFcoHelperListener(Class fcoClass, FcoHelperListener listener)
	{
		listeners.remove(fcoClass.getName(),listener);
	}

	public CIM_ObjectCreatorIf getCIM_ObjectCreator() {
		return creator;
	}

}
