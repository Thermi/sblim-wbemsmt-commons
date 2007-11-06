 /** 
  * FcoUtil.java
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
  * Description: Utility class for FCOs
  * 
  */
package org.sblim.wbemsmt.bl;

import java.lang.reflect.Method;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbem.cim.CIMElement;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cimxml.CIMXmlUtil;
import org.sblim.wbem.cimxml.CIMXmlUtilFactory;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class FcoUtil {

	static Logger logger = Logger.getLogger(FcoUtil.class.getName());	
	
	/**
	 * Copies a value from a container to a fco 
	 * @param container the container
	 * @param fco the fco
	 * @param propertyName the name of the field (ideally you can use the CIM_PROPERTY_* constants of the FCO class)
	 */
	public static void copyValueToFco(DataContainer container, Object fco, String propertyName) {
		
		try {
			String getterName = "get_" + StringUtils.capitalize(propertyName);
			String setterName = "set_" + StringUtils.capitalize(propertyName);
			
			Method method = container.getClass().getMethod(getterName, null);
			LabeledBaseInputComponentIf field = (LabeledBaseInputComponentIf) method.invoke(container, null);
			
			Method getterFco = fco.getClass().getMethod(getterName, null);
			Class returnType = getterFco.getReturnType();
			
			Method setterFco = fco.getClass().getMethod(setterName, new Class[]{returnType});
			
			setterFco.invoke(fco, new Object[]{field.getConvertedControlValue()});
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot copy values to fco", e);
			throw new IllegalArgumentException("Cannot copy values to fco " + e);
		} 
		
	}

	/**
	 * Copies a value from a fco to a container
	 * @param container the container
	 * @param fco the fco
	 * @param propertyName the name of the field (ideally you can use the CIM_PROPERTY_* constants of the FCO class)
	 */
	public static void copyValueToDataContainer(DataContainer container, Object fco, String propertyName) {
		
		try {
			String getterName = "get_" + StringUtils.capitalize(propertyName);
			
			Method method = container.getClass().getMethod(getterName, null);
			LabeledBaseInputComponentIf field = (LabeledBaseInputComponentIf) method.invoke(container, null);
			
			Method getterFco = fco.getClass().getMethod(getterName, null);
			
			field.setControlValue(getterFco.invoke(fco, null));
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot copy values to dataContainer", e);
			throw new IllegalArgumentException("Cannot copy values to datacontainer " + e.getMessage());
		} 
		
	}
	
	public static Object getFirstChild(Class mustReturnThis, List list, boolean silent, boolean createIfNotExists, CIMClient client) throws ModelLoadException {
		if (!silent && list.size() != 1)
		{
			logger.severe("Cannot get Element of Type " + mustReturnThis.getName() + " beause not exact one element was found in List. Found: " + list.size());
			throw new ModelLoadException("Cannot load data model");
		}
		
		if (!silent && list.get(0) == null)
		{
			logger.severe("Cannot get Element of Type " + mustReturnThis.getName() + " beause first element was null");
			throw new ModelLoadException("Cannot load data model");
		}
	
		if (!silent && !mustReturnThis.isAssignableFrom(list.get(0).getClass()) && !(list.get(0) instanceof CIMObjectPath) )
		{
			logger.severe("Cannot get Element of Type " + mustReturnThis.getName() + " beause first element is not from type " + mustReturnThis.getName() + "  but is of type " + list.get(0).getClass());
			throw new ModelLoadException("Cannot load data model");
		}
		
		if (list.size() == 0 && createIfNotExists)
		{
			try {
				return mustReturnThis.newInstance();
			} catch (Exception e) {
				throw new ModelLoadException(e);
			}
		}
		
		if (silent && list.size() == 0)
		{
			return null;
		}
		else
		{
			Object o = list.get(0);
			if (o instanceof CIMObjectPath)
			{
				CIMObjectPath path = (CIMObjectPath) o;
				String helper = mustReturnThis.getName() + "Helper";
				Object fco = null;
				try {
					Class clsHelper = Class.forName(helper);
					Method method = clsHelper.getMethod("getInstance",new Class[]{CIMClient.class,CIMObjectPath.class});
					fco = method.invoke(null,new Object[]{client,path});
					return fco;
				} catch (Exception e) {
					throw new ModelLoadException("Cannot load element with path " + path, e);
				}
			}
			else
			{
				return o;
			}
		}
	}


	
	/**
	 * Create a embedded instance (a cim object as xml representation) with all attributes
	 * @param cimObject
	 * @return
	 */
	public static String getEmbeddedInstance(CIM_ObjectIf cimObject) {
		return getEmbeddedInstance(cimObject, false);
	}
	
	/**
	 * Create a embedded instance (a cim object as xml representation)
	 * @param cimObject
	 * @param onlyKeys set to true if the instance should contain only key properties
	 * @return
	 */
	public static String getEmbeddedInstance(CIM_ObjectIf cimObject, boolean onlyKeys) {
		CIMInstance cimInstance = cimObject.getCimInstance();
		return getEmbeddedInstance(cimInstance, onlyKeys);
	}

	public static String getEmbeddedInstance(CIMInstance cimInstance, boolean onlyKeys) {
		if (onlyKeys)
		{
			//we need to clone the object because we are removing the non-key-properties
			cimInstance = (CIMInstance) cimInstance.clone();

			//collect the key properties
			Vector keys = cimInstance.getObjectPath().getKeys();
			Set keynames = new HashSet();
			for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
				CIMProperty property = (CIMProperty) iterator.next();
				keynames.add(property.getName());
				
			}

			//remove the non-key properties
			Vector properties = cimInstance.getAllProperties();
			for (int i = properties.size() - 1; i >= 0; i--) {
				CIMProperty property = (CIMProperty) properties.get(i);
				String propertyName = property.getName();
				if (!keynames.contains(propertyName))
				{
					cimInstance.removeProperty(propertyName);
				}
			}
			
		}
		
		//create the XML
		CIMXmlUtil util = CIMXmlUtilFactory.getCIMXmlUtil();
		String xml = util.CIMElementToXml(cimInstance);
		
		//cut of the first two lines - <xml...> and a empty line
		xml = xml.substring(xml.indexOf("<INSTA"));
		return xml;
	}
	
	public static CIMInstance getFromEmbeddedInstance(String embeddedInstance)
	{
		CIMXmlUtil util = CIMXmlUtilFactory.getCIMXmlUtil();
		try {
			CIMElement element = util.getCIMElement(embeddedInstance);
			return (CIMInstance)element;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
