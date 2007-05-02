 /** 
  * CIM_Object.java
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
  * Description: Wrapper as pseudo-base-class for all CIM-Baseclasses
  * 
  * Implemented because there is no baseclass for all CIM-Classes except java.lang.Object
  * 
  */
package org.sblim.wbemsmt.schema.cim29.tools;

import java.util.Vector;
import java.util.logging.Logger;

import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.schema.cim29.*;

public abstract class CIM_Object implements CIM_ObjectIf {

	public abstract CIMObjectPath getCimObjectPath();
	public abstract Object getWrappedObject();
	public abstract CIMInstance getCimInstance();
	public abstract String getClassDisplayName();

	private static Logger logger = Logger.getLogger(CIM_Object.class.getName());
	
	/**
	 * Create a object by the given CIM_ManagedElement
	 * @param cimElement
	 * @return
	 */
	public static CIM_Object create(final CIM_ManagedElement cimElement)
	{
		CIM_Object retValue = new CIM_Object()
		{
			public CIMObjectPath getCimObjectPath() {
				return cimElement.getCimObjectPath();
			}
			public CIMInstance getCimInstance() {
				return cimElement.getCimInstance();
			}
			public String getClassDisplayName() {
				return cimElement.getClassDisplayName();
			}
			public Object getWrappedObject() {
				return cimElement;
			}
			public boolean isModified() {
				return cimElement.isModified();
			}
			public void setCimInstance(CIMInstance cimInstance) {
				cimElement.setCimInstance(cimInstance);
			}
		};
		return retValue;
	}

	/**
	 * Create a object by the given CIM_Dependency
	 * @param cimElement
	 * @return
	 */

	public static CIM_Object create(final CIM_Dependency cimElement)
	{
		CIM_Object retValue = new CIM_Object()
		{
			public CIMObjectPath getCimObjectPath() {
				return cimElement.getCimObjectPath();
			}
			public CIMInstance getCimInstance() {
				return cimElement.getCimInstance();
			}
			public String getClassDisplayName() {
				return cimElement.getClassDisplayName();
			}
			public Object getWrappedObject() {
				return cimElement;
			}
			public boolean isModified() {
				return cimElement.isModified();
			}
			public void setCimInstance(CIMInstance cimInstance) {
				cimElement.setCimInstance(cimInstance);
			}
		};
		return retValue;
	}
	

	/**
	 * Create a object by the given CIM_Component
	 * @param cimElement
	 * @return
	 */

	public static CIM_Object create(final CIM_Component cimElement)
	{
		CIM_Object retValue = new CIM_Object()
		{
			public CIMObjectPath getCimObjectPath() {
				return cimElement.getCimObjectPath();
			}
			public CIMInstance getCimInstance() {
				return cimElement.getCimInstance();
			}
			public String getClassDisplayName() {
				return cimElement.getClassDisplayName();
			}
			public Object getWrappedObject() {
				return cimElement;
			}
			public boolean isModified() {
				return cimElement.isModified();
			}
			public void setCimInstance(CIMInstance cimInstance) {
				cimElement.setCimInstance(cimInstance);
			}
		};
		return retValue;
	}

	/**
	 * Create a object by the given CIM_ElementSettingData
	 * @param cimElement
	 * @return
	 */
	public static CIM_Object create(final CIM_ElementSettingData cimElement)
	{
		CIM_Object retValue = new CIM_Object()
		{
			public CIMObjectPath getCimObjectPath() {
				return cimElement.getCimObjectPath();
			}
			public CIMInstance getCimInstance() {
				return cimElement.getCimInstance();
			}
			public String getClassDisplayName() {
				return cimElement.getClassDisplayName();
			}
			public Object getWrappedObject() {
				return cimElement;
			}
			public boolean isModified() {
				return cimElement.isModified();
			}
			public void setCimInstance(CIMInstance cimInstance) {
				cimElement.setCimInstance(cimInstance);
			}
		};
		return retValue;
	}
	
	/**
	 * Create a object by the given Object
	 * 
	 * 
	 * @param cimElement
	 * @return
	 */
	public static CIM_Object createByObject(final Object cimElement)
	{
		CIM_Object retValue = new CIM_Object()
		{
			public CIMObjectPath getCimObjectPath() {
				try {
					return (CIMObjectPath) cimElement.getClass().getMethod("getCimObjectPath",null).invoke(cimElement,null);
				} catch (Exception e) {
					e.printStackTrace();
					logger.severe("Cannot execute getCimObjectPath on object " + cimElement);
					return new CIMObjectPath("unknown",new Vector());
				}
			}
			public CIMInstance getCimInstance() {
				try {
					return (CIMInstance) cimElement.getClass().getMethod("getCimInstance",null).invoke(cimElement,null);
				} catch (Exception e) {
					e.printStackTrace();
					logger.severe("Cannot execute getCimInstance on object " + cimElement);
					return new CIMInstance();
				}
			}
			public String getClassDisplayName() {
				try {
					return (String) cimElement.getClass().getMethod("getClassDisplayName",null).invoke(cimElement,null);
				} catch (Exception e) {
					e.printStackTrace();
					logger.severe("Cannot execute getClassDisplayName on object " + cimElement);
					return cimElement.getClass().getName();
				}
			}
			public Object getWrappedObject() {
				return cimElement;
			}
			public boolean isModified() {
				try {
					return ((Boolean) cimElement.getClass().getMethod("isModified",null).invoke(cimElement,null)).booleanValue();
				} catch (Exception e) {
					e.printStackTrace();
					logger.severe("Cannot execute getClassDisplayName on object " + cimElement);
					return false;
				}
			}
			public void setCimInstance(CIMInstance cimInstance) {
				try {
					cimElement.getClass().getMethod("setCimInstance",new Class[]{CIMInstance.class}).invoke(cimElement,new Object[]{cimInstance});
				} catch (Exception e) {
					e.printStackTrace();
					logger.severe("Cannot execute getClassDisplayName on object " + cimElement);
				}
			}
		};
		return retValue;
	}
	
	/**
	 * Create a object by the given Object
	 * If the object cannot be used to create a new CIM_Object instance a exception is thrown
	 * @param cimElement
	 * @return
	 */
	
	public static CIM_Object create(Object fco)  throws WbemSmtException {
		if (fco instanceof CIM_ManagedElement) {
			CIM_ManagedElement element = (CIM_ManagedElement) fco;
			return create(element);
		}
		if (fco instanceof CIM_Component) {
			CIM_Component element = (CIM_Component) fco;
			return create(element);
		}
		if (fco instanceof CIM_Dependency) {
			CIM_Dependency element = (CIM_Dependency) fco;
			return create(element);
		}
		if (fco instanceof CIM_ElementSettingData) {
			CIM_ElementSettingData element = (CIM_ElementSettingData) fco;
			return create(element);
		}
		//stupid if clause - but preserves the throws Clause
		if (fco instanceof Object) {
			return createByObject(fco);
		}
		throw new WbemSmtException("Cannot create CIM_Object wrapper for fco " + fco);
	}
		
	/**
	 * Create a object by the given Object
	 * If the object cannot be used null is returned
	 * @param cimElement
	 * @boolean silent
	 * @return
	 */
	
	public static CIM_Object createUnchecked(Object fco){

		try {
			return create(fco);
		} catch (WbemSmtException e) {
			logger.severe("Cannot handle Object from type " + (fco == null ? "null" : fco.getClass().getName()));
			return null;
		}
		
	}
}
