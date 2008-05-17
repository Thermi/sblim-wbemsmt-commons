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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.cim.*;
import javax.wbem.WBEMException;
import javax.wbem.client.WBEMClient;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.metric.MillisecondMetricCalculator;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.GetInstanceException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponent;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class FcoHelper implements FcoHelperIf
{
	
	protected boolean notifyChanges = true;
	
	static MultiMap listeners = new MultiHashMap();
	
	public static final String PREFIX_LINUX = "Linux_";

	/**
	 * Format received from CIMDateTimeAbsolute yyyyMMddHHmmss.uuuuuuSutc
	 * microseconds and utc offset is cut off manually
	 * 
	 * @see CIMDateTimeAbsolute
	 */ 
	private static final DateFormat DATETIME_ABSOLUTE = new SimpleDateFormat("yyyyMMddHHmmss.SSS");

	static Logger logger = Logger.getLogger(FcoHelper.class.getName());
	
	public FcoHelper() {
		super();
	}

	public  void delete(Collection c, WBEMClient cimClient) throws WbemsmtException
	{
		for (Iterator it = c.iterator(); it.hasNext();) {
			Object obj = (Object) it.next();
			if (obj instanceof AbstractWbemsmtFco) {
				AbstractWbemsmtFco fco = (AbstractWbemsmtFco) obj;
				delete(fco, cimClient);
			}
		}
	}
	
	/**
	 * deletes the object
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws WbemsmtException
	 */
	public  void delete(AbstractWbemsmtFco fco, WBEMClient cimClient) throws WbemsmtException 
	{
		try {
			delete(fco,cimClient,false);
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,e);
		}
	}

	/**
	 * deletes the object
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws WbemsmtException
	 */
	public  void delete(AbstractWbemsmtFco objectToDelete, WBEMClient cimClient, boolean testIfObjectRemovedAfterDeletion) throws WbemsmtException 
	{
		
		
		String helperName = objectToDelete.getClass().getName() + "Helper";
		Class helperClass = null;

		String namespace = objectToDelete.getCimObjectPath().getNamespace();
		
		try {
			helperClass = Class.forName(helperName,true,objectToDelete.getClass().getClassLoader());
			FcoHelperProcessItemEvent event = fireEvent(FcoHelperProcessItemEvent.TYPE_BEFORE_DELETE,objectToDelete);
			if (!event.isDoProcessing())
			{
				logger.log(Level.WARNING,"Processing stopped by EventListener");
				return;
			}			
			Method method = helperClass.getMethod("deleteInstance", new Class[]{WBEMClient.class,objectToDelete.getClass()});
			logger.fine("Calling " + helperName + "." + method.getName()  + " with fco " + objectToDelete.toString()+ " on " + namespace);
			method.invoke(null,new Object[]{cimClient,objectToDelete});
			logger.info("Deleted " + objectToDelete.getCimObjectPath() + " on " + namespace);
			
			fireEvent(FcoHelperProcessItemEvent.TYPE_AFTER_DELETE,objectToDelete);
			
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE,"Cannot find Helper class " + helperName + " for deleting object",e);
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error");
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot find deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error");
		} catch (IllegalAccessException e) {
			logger.log(Level.SEVERE,"Cannot access deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error");
		} catch (InvocationTargetException e) {
			logger.log(Level.SEVERE,"Cannot invoke deleteInstance-Method on class " + helperName + " for deleting object",e);
			if (e.getTargetException() instanceof WbemsmtException) {
                throw (WbemsmtException)e.getTargetException();
            } else {
                throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error",objectToDelete, e.getTargetException());
            }
			
		} catch (RuntimeException e) {
		    logger.log(Level.SEVERE,"Cannot execute deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error");
		}
		
		//test if deletion was ok
		if (testIfObjectRemovedAfterDeletion)
		{
			try {
				Method getInstanceMethod = helperClass.getMethod("getInstance", new Class[]{WBEMClient.class,CIMObjectPath.class});

				Object obj = getInstanceMethod.invoke(null,new Object[]{cimClient,objectToDelete.getCimObjectPath()});
				
				if (obj != null)
				{
					objectToDelete = (AbstractWbemsmtFco)obj;
					throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"After deleting the object " + objectToDelete.getCimObjectPath() + " on " + namespace + " the object was still found.");					
				}
			} 
			catch (WbemsmtException e)
			{
				throw e;
				
			} catch (Exception e) {
			    if (e instanceof InvocationTargetException) {
                    InvocationTargetException ite = (InvocationTargetException) e;
                    if (ite.getTargetException() instanceof GetInstanceException) {
                        GetInstanceException gie = (GetInstanceException) ite.getTargetException();
                        WBEMException wbeme = (WBEMException) ExceptionUtil.findDeepest(WBEMException.class, gie);
                        if (wbeme.getID() == WBEMException.CIM_ERR_NOT_FOUND)
                        {
                            //that's okay the instance should not be found
                            return;
                        }
                    }
                }
				throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Verification if the deletion was done was not possible",objectToDelete,e);
			}
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"After deleting the object " + objectToDelete.getCimObjectPath() + " on " + namespace + " the object was still found.");			
		}		
	}

	/**
	 * Creates a new FCO with the given keyProperties and deletes it
	 * @param fcoClass
	 * @param keyPropertiesArray
	 * @param cimClient
	 */
	public  void delete(Class fcoClass, String namespace, CIMProperty[] keyPropertiesArray, WBEMClient cimClient) throws WbemsmtException  {
		delete(fcoClass,namespace,keyPropertiesArray,cimClient, true);
	}	

	/**
	 * load a FCO with the given keyProperties and deletes it
	 * @param fcoClass
	 * @param keyPropertiesArray
	 * @param cimClient
	 */
	public  void delete(Class fcoClass, String namespace, CIMProperty[] keyPropertiesArray, WBEMClient cimClient, boolean testIfObjectRemovedAfterDeletion) throws WbemsmtException  {
		
		
		String helperName = fcoClass.getName() + "Helper";
		AbstractWbemsmtFco cimObject = null;
		
		try {
			
			Field f = fcoClass.getDeclaredField("CIM_CLASS_NAME");
			String className = (String) f.get(fcoClass);
			
			CIMObjectPath path = new CIMObjectPath(className, namespace,keyPropertiesArray );

			Class helperClass = Class.forName(helperName,true,fcoClass.getClassLoader());
			
			//get the instance - if the instance was not found -> ready & return
			
			Constructor constructor = fcoClass.getConstructor(new Class[]{WBEMClient.class, String.class});
			cimObject = (AbstractWbemsmtFco) constructor.newInstance(new Object[]{cimClient,namespace});
			cimObject.setCimInstance(cimObject.getCimInstance().deriveInstance(keyPropertiesArray));
			
			Method getInstanceMethod = helperClass.getMethod("getInstance", new Class[]{WBEMClient.class,CIMObjectPath.class});
			getInstanceMethod.setAccessible(true);
			try {
				cimObject = (AbstractWbemsmtFco) getInstanceMethod.invoke(null,new Object[]{cimClient,path});
			} catch (Exception e) {
				if (isNotFoundException(e))
				{
					//everything okay object was already deleted
					return;
				}
				throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,e);
			}

			FcoHelperProcessItemEvent event = fireEvent(FcoHelperProcessItemEvent.TYPE_BEFORE_DELETE,cimObject);
			if (!event.isDoProcessing())
			{
				logger.log(Level.WARNING,"Processing stopped by EventListener");
				return;
			}

			
			Method deleteMethod = helperClass.getMethod("deleteInstance", new Class[]{WBEMClient.class,fcoClass});
			deleteMethod.setAccessible(true);
			logger.fine("Calling " + helperName + "." + deleteMethod.getName()  + " with fco " + fcoClass.toString()+ " on " + namespace);
			deleteMethod.invoke(null,new Object[]{cimClient,cimObject});
			
			//test if deletion was ok
			if (testIfObjectRemovedAfterDeletion)
			{
				try {
					cimObject = (AbstractWbemsmtFco) getInstanceMethod.invoke(null,new Object[]{cimClient,path});
					if (cimObject != null)
					{
						throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"After deleting the object " + path + " on " + namespace + " the object was still found.");					
					}
				} catch (Exception e) {
					if (isNotFoundException(e))
					{
						//everything okay
					}
					else
					{
						throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"After deleting the object " + path + " on " + namespace + " the object was still found.",e);
					}
				}
			}
			
			logger.info("Deleted " + path + " on " + namespace.toString());
			
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE,"Cannot find Helper class " + helperName + " for deleting object",e);
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error");
		} catch (NoSuchFieldException e) {
			logger.log(Level.SEVERE,"Cannot find Field CIM_CLASS_NAME in class " + fcoClass.getName() + " for deleting object",e);
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error");
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot find deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error");
		} catch (IllegalAccessException e) {
			logger.log(Level.SEVERE,"Cannot access deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error");
		} catch (InvocationTargetException e) {
			logger.log(Level.SEVERE,"Cannot invoke deleteInstance-Method on class " + helperName + " for deleting object",e);
            if (e.getTargetException() instanceof WbemsmtException) {
                throw (WbemsmtException)e.getTargetException();
            } else {
                throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error",cimObject, e.getTargetException());
            }
		} catch (RuntimeException e) {
		    logger.log(Level.SEVERE,"Cannot execute deleteInstance-Method on class " + helperName + " for deleting object",e);
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error");
		} catch (InstantiationException e) {
		    logger.log(Level.SEVERE,"Cannot execute deleteInstance-Method on constructor of class " + fcoClass.getName() + " for getting instance",e);
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error",e);
		} catch (WbemsmtException e) {
		    logger.log(Level.SEVERE,"Cannot execute deleteInstance-Method on constructor of class " + fcoClass.getName() + " for getting instance",e);
			throw new WbemsmtException(WbemsmtException.ERR_DELETE_OBJECT,"Internal error",e);
		}
		fireEvent(FcoHelperProcessItemEvent.TYPE_AFTER_DELETE,cimObject);
		
	}

	private boolean isNotFoundException(Exception e) {
		return e instanceof WBEMException && ((WBEMException)e).getID() == WBEMException.CIM_ERR_NOT_FOUND;
	}

	/**
	 * creates objects
	 * @param o the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @return 
	 * @throws WbemsmtException
	 */

	public  Collection create(Collection c, WBEMClient cimClient) throws WbemsmtException 
	{
		List result = new ArrayList();
		for (Iterator it = c.iterator(); it.hasNext();) {
			Object o1 = (Object) it.next();
			if (o1 instanceof AbstractWbemsmtFco) {
				AbstractWbemsmtFco managedElement = (AbstractWbemsmtFco) o1;
				result.add(create(managedElement, cimClient));
			}
			else
			{
				logger.log(Level.SEVERE,"Cannot create object with class " + o1.getClass().getName());
				throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
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
	 * @return the created object or input-fco if no object was created
	 * @throws WbemsmtException
	 */

	public  AbstractWbemsmtFco create(AbstractWbemsmtFco cimObject, WBEMClient cimClient) throws WbemsmtException 
	{
		checkFieldSet(cimObject, "get_InstanceID");
		
		Object fco = cimObject;
		
		String helperName = fco.getClass().getName() + "Helper";
		AbstractWbemsmtFco newInstance = null;
		Class helperClass = null;
		
		String namespace = cimObject.getCimObjectPath().getNamespace();
		
		try {
			FcoHelperProcessItemEvent event = fireEvent(FcoHelperProcessItemEvent.TYPE_BEFORE_CREATE,cimObject);
			if (!event.isDoProcessing())
			{
				logger.log(Level.WARNING,"Processing stopped by EventListener");
				return (AbstractWbemsmtFco) fco;
			}

			helperClass = Class.forName(helperName,true,fco.getClass().getClassLoader());
			Method method = helperClass.getMethod("createInstance", new Class[]{WBEMClient.class,fco.getClass(),boolean.class});
			logger.fine("Calling " + helperName + "." + method.getName()  + " with fco " + fco.toString()+ " on " + namespace);
			AbstractWbemsmtFco createdObject = (AbstractWbemsmtFco) method.invoke(null,new Object[]{cimClient,fco,new Boolean(notifyChanges)});
			if (createdObject == null)
			{
				logger.log(Level.SEVERE,"Cannot create Object - The new created cimInstance could not retrieved properly from the server. Old: " + fco + " from server: " + createdObject);
				throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
			}
			else
			{
				newInstance = createdObject;
				String path = newInstance.getCimObjectPath().toString();
				logger.info("Created " + path + " on " + namespace);
			}
			
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE,"Cannot find Helper class " + helperName + " for creating object",e);
			throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot find createInstance-Method on class " + helperName + " for creating object",e);
			throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		} catch (IllegalAccessException e) {
			logger.log(Level.SEVERE,"Cannot access createInstance-Method on class " + helperName + " for creating object",e);
			throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		} catch (InvocationTargetException e) {
			logger.log(Level.SEVERE,"Cannot access createInstance-Method on class " + helperName + " for creating object");
            if (e.getTargetException() instanceof WbemsmtException) {
                throw (WbemsmtException)e.getTargetException();
            } else {
                throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error",cimObject,e.getTargetException());
            }
		} catch (RuntimeException e) {
			logger.log(Level.SEVERE,"Cannot execute createInstance-Method on class " + helperName + " for creating object",e);
			throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error",e);
		} catch (WbemsmtException e) {
		    throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error",e);
		}

		if (newInstance == null)
		{
			logger.log(Level.SEVERE,"The creation of Fco " + fco + " returned no value.");
		    throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		}
		
		fireEvent(FcoHelperProcessItemEvent.TYPE_AFTER_CREATE,newInstance);
		return newInstance;
	
	}

	private  FcoHelperProcessItemEvent fireEvent(int type, AbstractWbemsmtFco cimObject) {
		
		FcoHelperProcessItemEvent event = new FcoHelperProcessItemEvent(cimObject,type);
		
		String className = cimObject.getClass().getName();
		
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
	 * @throws WbemsmtException thrown if the value return by this Method is null
	 * @return The Object returned by the Method or null if the method not exists
	 */
	private  Object checkFieldSet(AbstractWbemsmtFco cimObject, String getterMethodName) throws WbemsmtException {
		Object object = null;
		try {
			Method method = cimObject.getClass().getMethod(getterMethodName,new Class[]{});
			method.setAccessible(true);
			object = method.invoke(cimObject,new Object[]{});
			if (object == null)
			{
				logger.log(Level.SEVERE,"InstanceId of Fco " + cimObject + " is not set.");
			    throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
			}
		} catch (SecurityException e1) {
			logger.log(Level.SEVERE,"",e1);
		    throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		} catch (NoSuchMethodException e1) {
			// Thats okay
		} catch (IllegalArgumentException e) {
			logger.log(Level.SEVERE,"",e);
		    throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		} catch (IllegalAccessException e) {
			logger.log(Level.SEVERE,"",e);
		    throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		} catch (InvocationTargetException e) {
			logger.log(Level.SEVERE,"",e);
            if (e.getTargetException() instanceof WbemsmtException) {
                throw (WbemsmtException)e.getTargetException();
            } else {
                throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error",cimObject,e.getTargetException());
            }

		}
		return object;
	}

	public  AbstractWbemsmtFco create(Class fcoClass, WBEMClient cimClient, String namespace, Vector keyProperties) throws WbemsmtException {
			
		String helperName = fcoClass.getName() + "Helper";
		AbstractWbemsmtFco o = null;
		
		try
		{
			Constructor constructor = fcoClass.getConstructor(new Class[]{WBEMClient.class,String.class});
			constructor.setAccessible(true);
			o = (AbstractWbemsmtFco) constructor.newInstance(new Object[]{cimClient,namespace});
			
			CIMProperty[] keyProperties2 = (CIMProperty[]) keyProperties.toArray(new CIMProperty[keyProperties.size()]);
			
			CIMInstance derivedInstance = o.getCimInstance().deriveInstance(keyProperties2);
			
			constructor = fcoClass.getConstructor(new Class[]{CIMInstance.class});
			constructor.setAccessible(true);
			o = (AbstractWbemsmtFco) constructor.newInstance(new Object[]{derivedInstance});
			
			
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot find constructor for creating fco with Vector",e);
		    throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		} catch (IllegalAccessException e) {
			logger.log(Level.SEVERE,"Cannot access constructor on class " + helperName + " for deleting object",e);
		    throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		} catch (InvocationTargetException e) {
		    logger.log(Level.SEVERE,"Cannot invoke constructor-Method on class " + helperName + " for deleting object",e);
            if (e.getTargetException() instanceof WbemsmtException) {
                throw (WbemsmtException)e.getTargetException();
            } else {
                throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Cannot create FCO with keyProerties " + fcoClass.getName() + " with key-Properties " + toString(keyProperties) ,e.getTargetException());
            }
		} catch (RuntimeException e) {
		    logger.log(Level.SEVERE,"Cannot execute deleteconstructorInstance-Method on class " + helperName + " for deleting object",e);
		    throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		} catch (InstantiationException e) {
		    logger.log(Level.SEVERE,"Cannot create on class " + fcoClass.getName() + " for deleting object",e);
		    throw new WbemsmtException(WbemsmtException.ERR_CREATE_OBJECT,"Internal error");
		}
		
		return create(o,cimClient);
		
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
	 * @throws WbemsmtException
	 */

	public  void save(Collection c, WBEMClient cimClient) throws WbemsmtException 
	{
		for (Iterator it = c.iterator(); it.hasNext();) {
			Object o1 = (Object) it.next();
			if (o1 instanceof AbstractWbemsmtFco) {
				AbstractWbemsmtFco managedElement = (AbstractWbemsmtFco) o1;
				save(managedElement, cimClient);
			}
			else
			{
				logger.log(Level.SEVERE,"Cannot save object with class " + o1.getClass().getName());
			    throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Internal error");
			}	
		}
	}
	
	/**
	 * saves the object, if it was modified
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws WbemsmtException
	 * @return the modified instance - or the not modified instance if an event listener stopped the processing
	 */

	public  AbstractWbemsmtFco save(AbstractWbemsmtFco cimObject, WBEMClient cimClient) throws WbemsmtException 
	{
		
		String namespace = cimObject.getCimObjectPath().getNamespace();
		
		if (!cimObject.isModified())
		{
			logger.info("The element with key " + cimObject.getCimObjectPath().toString() + " was not modified and is not saved.");
			return cimObject;
		}
		
		FcoHelperProcessItemEvent event = fireEvent(FcoHelperProcessItemEvent.TYPE_BEFORE_UPDATE,cimObject);
		if (!event.isDoProcessing())
		{
			logger.log(Level.WARNING,"Processing stopped by EventListener");
			return cimObject;
		}					
		
		String helperName = cimObject.getClass().getName() + "Helper";
		try {
			Class helperClass = Class.forName(helperName,true,cimObject.getClass().getClassLoader());
			Method method = helperClass.getMethod("modifyInstance", new Class[]{WBEMClient.class,cimObject.getClass(),boolean.class});
			logger.fine("Calling " + helperName + "." + method.getName()  + " with fco " + cimObject.toString()+ " on " + namespace);
			cimObject = (AbstractWbemsmtFco) method.invoke(null,new Object[]{cimClient,cimObject,new Boolean(notifyChanges)});
			logger.info("Saved " + cimObject.getCimObjectPath() + " on " + namespace);
	
			fireEvent(FcoHelperProcessItemEvent.TYPE_AFTER_UPDATE,cimObject);			
			
			return cimObject;
			
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE,"Cannot find Helper class " + helperName + " for saving object",e);
		    throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Internal error");
		} catch (NoSuchMethodException e) {
			logger.log(Level.SEVERE,"Cannot find modifyInstance-Method on class " + helperName + " for saving object",e);
		    throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Internal error");
		} catch (IllegalAccessException e) {
			logger.log(Level.SEVERE,"Cannot access modifyInstance-Method on class " + helperName + " for saving object",e);
		    throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Internal error");
		} catch (InvocationTargetException e) {
		    logger.log(Level.SEVERE,"Cannot access modifyInstance-Method on class " + helperName + " for saving object",e);
            if (e.getTargetException() instanceof WbemsmtException) {
                throw (WbemsmtException)e.getTargetException();
            } else {
                throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Internal error",cimObject,e.getTargetException());
            }
		} catch (RuntimeException e) {
		    logger.log(Level.SEVERE,"Cannot execute modifyInstance-Method on class " + helperName + " for saving object",e);
		    throw new WbemsmtException(WbemsmtException.ERR_SAVE_OBJECT,"Internal error");
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
	 * @throws WbemsmtException 
	 */
	public  void updateFcoContent(Object fco, DataContainer dataContainer, FcoHelperKeyHashSet keyFields) throws WbemsmtException {
		
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
						    throw new WbemsmtException(WbemsmtException.ERR_UPDATE_OBJECT,"Internal error");
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
		    throw new WbemsmtException(WbemsmtException.ERR_UPDATE_OBJECT,"Internal error");
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
	 * @throws WbemsmtException 
	 */
	public  void updateControlContent(Object fco, DataContainer dataContainer) throws WbemsmtException {
		
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
					    throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Internal error");
					}
					getter.setAccessible(true);
					Object valueToSet = getter.invoke(fco,new Object[]{});
					
					//call setControlValue
					method.setAccessible(true);
					Object inputComponent = method.invoke(dataContainer,new Object[]{});
					if (!(inputComponent instanceof LabeledBaseInputComponent))
					{
						logger.log(Level.SEVERE,"Object return by Method " + getterName + " is not from type LabeledBaseInputComponent");
					    throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Internal error");
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
		    throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Internal error");
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

	public  void copyValues(AbstractWbemsmtFco source, AbstractWbemsmtFco target, Class managedElementClass) throws WbemsmtException {
		
		if (!source.getClass().equals(target.getClass()))
		{
			logger.log(Level.SEVERE,"Elements are not from same Type. Source is: " + source.getClass().getName() + " and target is " + target.getClass().getName());
		    throw new WbemsmtException(WbemsmtException.ERR_UPDATING_MODEL,"Internal error");
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
			    throw new WbemsmtException(WbemsmtException.ERR_UPDATING_MODEL,"Internal error");
			}
			
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot set ObjectPath",e);
		    throw new WbemsmtException(WbemsmtException.ERR_UPDATING_MODEL,"Internal error");
		}
	}

	/**
	 * Reloads a fco from the servr
	 * @param fcoToReload
	 * @param cc
	 * @return
	 * @throws WbemsmtException 
	 */
	public  AbstractWbemsmtFco reload(AbstractWbemsmtFco cimObject, WBEMClient cimClient) throws WbemsmtException {
		
		String helperName = cimObject.getClass().getName() + "Helper";
		try {
			Class helperClass = Class.forName(helperName,true,cimObject.getClass().getClassLoader());
			CIMObjectPath path = cimObject.getCimObjectPath();
			return reload(helperClass,path,cimClient);
		} catch (WbemsmtException e) {
			throw e;
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot reload Fco " + cimObject,e);
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Internal error",e);
		}
	}

	/**
	 * Reloads a fco from the servr
	 * @param fcoToReload
	 * @param cc
	 * @return
	 * @throws WbemsmtException 
	 */
	public  AbstractWbemsmtFco reload(Class helperClass, CIMObjectPath path, WBEMClient cimClient) throws WbemsmtException {
		try {
			Method getInstanceMethod = helperClass.getMethod("getInstance", new Class[]{WBEMClient.class,CIMObjectPath.class});
			getInstanceMethod.setAccessible(true);
			try {
				AbstractWbemsmtFco reloadedFco = (AbstractWbemsmtFco) getInstanceMethod.invoke(null,new Object[]{cimClient,path});
				if (reloadedFco == null)
				{
					logger.log(Level.SEVERE,"Cannot find object with CimObjectPath " + path);						
				    throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Internal error");
				}
				return reloadedFco;
			} catch (Exception e) {
				if (isNotFoundException(e))
				{
					logger.log(Level.SEVERE,"Cannot find object with CimObjectPath " + path);
				    throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Internal error");
				}
				throw e;
			}
		} catch (WbemsmtException e) {
			throw e;
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot reload Fco with path" + path.toString(),e);
		    throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Internal error");
		}
	}
	
	/**
	 * gets an instance
	 * @param fcoToReload
	 * @param cc
	 * @return
	 * @throws WbemsmtException 
	 */
	public  AbstractWbemsmtFco getInstance(Class helperClass, String namespace, Vector keys, WBEMClient cimClient) throws WbemsmtException {
		try {
			
			Class fcoClass = Class.forName(helperClass.getName().substring(0,helperClass.getName().length() - "Helper".length()));
			Field f = fcoClass.getDeclaredField("CIM_CLASS_NAME");
			String className = (String) f.get(fcoClass);
			  
			CIMProperty[] keyPropertiesArray = (CIMProperty[]) keys.toArray(new CIMProperty[keys.size()]);
			
			CIMObjectPath path = new CIMObjectPath(className, namespace,keyPropertiesArray );
			
				
			Method getInstanceMethod = helperClass.getMethod("getInstance", new Class[]{WBEMClient.class,CIMObjectPath.class});
			getInstanceMethod.setAccessible(true);
			try {
				AbstractWbemsmtFco reloadedFco = (AbstractWbemsmtFco) getInstanceMethod.invoke(null,new Object[]{cimClient,path});
				if (reloadedFco == null)
				{
					logger.log(Level.SEVERE,"Cannot find object with Keys" + keys.toString());						
				    throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Internal error");
				}
				return reloadedFco;
			} catch (Exception e) {
				if (isNotFoundException(e))
				{
					logger.log(Level.SEVERE,"Cannot find object with Keys " + keys.toString());
				    throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Internal error",e);
				}
				throw e;
			}
		} catch (WbemsmtException e) {
			throw e;
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot reload Fco with keys " + keys.toString(),e);
		    throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Internal error");
		}
	}
	
	
	public  CIMObjectPath getPath(Class fcoClass, String namespace, String keyFieldName, Object keyFieldValue, WBEMClient cimClient) throws WbemsmtException {
		return getPath(fcoClass,namespace,new String[]{keyFieldName},new Object[]{keyFieldValue}, cimClient);
	}
	
	public  CIMObjectPath getPath(Class fcoClass, String namespace, String[] keyFieldNames, Object[] keyFieldValues, WBEMClient cimClient) throws WbemsmtException {

		String helperName = fcoClass.getName() + "Helper";
		try {
			Class helperClass = Class.forName(helperName,true,fcoClass.getClassLoader());
			Method enumMethod = helperClass.getMethod("enumerateInstanceNames", new Class[]{WBEMClient.class,String.class,boolean.class});
			enumMethod.setAccessible(true);

			ArrayList list = (ArrayList) enumMethod.invoke(null, new Object[]{cimClient,namespace,Boolean.TRUE});
			
			return getPath(list,keyFieldNames,keyFieldValues);
			
		} catch (Exception e) {
			logger.log(Level.WARNING,"For Object of class " + fcoClass.getName() + " No Element with key = " + keyFieldNames + " and value = " + keyFieldValues + " was found.",e);
		    throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,"Internal error");
		}
	}
	public  CIMObjectPath getPath(List objectPathList, String keyFieldName, String keyFieldValue) throws WbemsmtException {
		return getPath(objectPathList, new String[]{keyFieldName}, new String[]{keyFieldValue});
	}
	public  CIMObjectPath getPath(List objectPathList, String[] keyFieldNames, Object[] keyFieldValues) throws WbemsmtException {

		try {
			for (Iterator iter = objectPathList.iterator(); iter.hasNext();) {
				Object o = iter.next();
				CIMObjectPath path = (CIMObjectPath) o;
				int matchCount = 0;
				for (int i = 0; i < keyFieldNames.length; i++) {
					if (path.getKey(keyFieldNames[i]).getValue().equals(keyFieldValues[i]))
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
		    throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,"Internal error");
		}

		logger.log(Level.WARNING,"In List no Element with key = " + keyFieldNames + " and value = " + keyFieldValues + " was found.");
	    throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,"Internal error");
	}


	public  void addFcoHelperListener(Class fcoClass, FcoHelperListener listener)
	{
		listeners.put(fcoClass.getName(),listener);
	}

	public  void removeFcoHelperListener(Class fcoClass, FcoHelperListener listener)
	{
		listeners.remove(fcoClass.getName(),listener);
	}

	/**
	 * Get the date converted as String. First conversion of
	 * @param dateTime
	 * @param dateFormat
	 * @return null if dateTime == null
	 * @throws WbemsmtException 
	 */
	public static String getDate(CIMDateTimeAbsolute dateTime, SimpleDateFormat dateFormat) throws WbemsmtException {
		
	    if (dateTime == null)
	    {
	        return null;
	    }
	    
		String dateTimeString = dateTime.getDateTimeString();
		//remove the offset (trailing +/-<utc offset>)
		int offset = 0;
		int minus = dateTimeString.indexOf("-");
		if (minus > -1)
		{
			String utcOffset = dateTimeString.substring(minus+1);
			try {
				offset = Integer.parseInt(utcOffset) * -1;
			} catch (NumberFormatException e) {
				logger.warning("Cannot convert utc offset " + utcOffset+ "of dateTime " + dateTimeString);
			}
			dateTimeString = dateTimeString.substring(0,minus);
		}
		int plus = dateTimeString.indexOf("+");
		if (plus > -1)
		{
			String utcOffset = dateTimeString.substring(plus+1);
			try {
				offset = Integer.parseInt(utcOffset) * -1;
			} catch (NumberFormatException e) {
				logger.warning("Cannot convert utc offset " + utcOffset+ "of dateTime " + dateTimeString);
			}
			dateTimeString = dateTimeString.substring(0,plus);
		}
		
		//remove the microseconds (last 6 digits)
		int micros = Integer.parseInt(dateTimeString.substring(dateTimeString.length()-6));
		
		Calendar calendar = new GregorianCalendar();
		try {
			calendar.setTime(DATETIME_ABSOLUTE.parse(dateTimeString));
		} catch (ParseException e) {
			throw new WbemsmtException(WbemsmtException.ERR_VALUE_CONVERSION, e);
		}
		//add the offset
		calendar.add(Calendar.MINUTE, offset);
		//convert and add the micros to the millis
		calendar.add(Calendar.MILLISECOND, micros/1000);
		return dateFormat.format(calendar.getTime());
	}
	
	/**
	 * Get the date converted as String. First conversion of
	 * @param dateTime
	 * @param dateFormat
	 * @return
	 * @throws WbemsmtException 
	 */
	public static String getDate(CIMDateTimeInterval dateTime, WbemSmtResourceBundle bundle) throws WbemsmtException {
		
		String dateTimeString = dateTime.getDateTimeString();
		// the string is having the format ddddddddHHMMSS.mmmmmm:000
		
		long days = getValueOfDateTimeIntervalString(dateTimeString,0,8);
		long hours = getValueOfDateTimeIntervalString(dateTimeString,8,2);
		long minutes = getValueOfDateTimeIntervalString(dateTimeString,10,2);
		long seconds = getValueOfDateTimeIntervalString(dateTimeString,12,2);
		long millis = getValueOfDateTimeIntervalString(dateTimeString,15,3);
		
		long interval = millis 
		                + seconds * 1000 
		                + minutes * 1000 * 60 
		                + hours   * 1000 * 60 * 60
		                + days    * 1000 * 60 * 60 * 24;
		
		return MillisecondMetricCalculator.calculateDurationString(interval, bundle);
	}	

	private static int getValueOfDateTimeIntervalString(String dateTimeString,
			int offset, int length) {
		String string = dateTimeString.substring(offset, offset+length);
		//replace all asterisks by an empty string - asterisk = non-siginificance character
		string = string.replaceAll("*", "");
		return Integer.parseInt(string);
	}

	public void setNotifyChanges(boolean notifyChanges) {
		this.notifyChanges = notifyChanges;
		
	}

}
