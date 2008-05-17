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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.cim.*;
import javax.wbem.client.WBEMClient;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

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
	
	public static Object getFirstChild(Class mustReturnThis, List list, boolean silent, boolean createIfNotExists, WBEMClient client) throws WbemsmtException {
		if (!silent && list.size() != 1)
		{
			logger.severe("Cannot get Element of Type " + mustReturnThis.getName() + " beause not exact one element was found in List. Found: " + list.size());
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Cannot load data model");
		}
		
		if (!silent && list.get(0) == null)
		{
			logger.severe("Cannot get Element of Type " + mustReturnThis.getName() + " beause first element was null");
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Cannot load data model");
		}
	
		if (!silent && !mustReturnThis.isAssignableFrom(list.get(0).getClass()) && !(list.get(0) instanceof CIMObjectPath) )
		{
			logger.severe("Cannot get Element of Type " + mustReturnThis.getName() + " beause first element is not from type " + mustReturnThis.getName() + "  but is of type " + list.get(0).getClass());
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Cannot load data model");
		}
		
		if (list.size() == 0 && createIfNotExists)
		{
			try {
				return mustReturnThis.newInstance();
			} catch (Exception e) {
				throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,e);
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
					Method method = clsHelper.getMethod("getInstance",new Class[]{WBEMClient.class,CIMObjectPath.class});
					fco = method.invoke(null,new Object[]{client,path});
					return fco;
				} catch (Exception e) {
					throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Cannot load element with path " + path, e);
				}
			}
			else
			{
				return o;
			}
		}
	}

    /**
     * Converts a value from a CIM Property to a String for the UI
     * @param propertyValue
     * @param cls 
     * @param propertyName 
     * @param bundle 
     * @return
     */
    public static String getValueAsString(CIMInstance instance, String propertyName, CIMClass cls, WbemSmtResourceBundle bundle) {
    
        String result = "";
        
        CIMProperty property = instance.getProperty(propertyName);
        CIMClassProperty clsProperty = cls.getProperty(propertyName);
        
        if (property != null)
        {
            Object propertyValue = property.getValue();
            if (propertyValue != null)
            {
                if (property.getDataType() == CIMDataType.BOOLEAN_T)
                {
                    result = getBooleanValue(property, clsProperty);
                }
                else if (property.getDataType() == CIMDataType.UINT8_T 
                    || property.getDataType() == CIMDataType.UINT16_T 
                    || property.getDataType() == CIMDataType.UINT32_T
                    || property.getDataType() == CIMDataType.UINT64_T)
                {
                    Object value = (Object) property.getValue();
                    if (value == null && clsProperty != null)
                    {
                        value = (Object) clsProperty.getValue(); 
                    }
                    
                    if (clsProperty != null)
                    {
                        String[] valueMap = (String[]) clsProperty.getQualifierValue("ValueMap");
                        String[] values = (String[]) clsProperty.getQualifierValue("Values");
                        if (valueMap != null || values != null)
                        {
                            result = getValueFromValueMap(value, valueMap, values);
                        }
                        else
                        {
                            result = getNumber(value);
                        }
                    }
                    else
                    {
                        result = getNumber(value);
                    }
                }
                else if (property.getDataType() == CIMDataType.STRING_T)
                {
                    result = getString(property, clsProperty);
                }
                else
                {
                    if (cls != null)
                    {
                        logger.warning("CIMProperty " + cls.getName() + "." + property.getName() + " with type " + property.getDataType().toString() + " cannot be used for a GenericField");
                    }
                    else
                    {
                        logger.warning("CIMProperty " + property.getName() + " with type " + property.getDataType().toString() + " cannot be used for a GenericField");
                    }
                    result = bundle.getString("type.not.supported");
                }
                
            }
        }
        
        return result;
    }

    private static String getString(CIMProperty property, CIMClassProperty clsProperty) {
        String result;
        String value = (String) property.getValue();
        if (value == null && clsProperty != null)
        {
            value = (String) clsProperty.getValue(); 
        }
        
        String s =  value != null ? value : "";
        result = s;
        return result;
    }

    private static String getNumber(Object value) {
        String result;
        String s = "0";
        if (value != null)
        {
            s = "" +  ((Number)value).longValue();
        }
        result = s;
        return result;
    }

    private static String getValueFromValueMap(Object value, String[] valueMap,String[] values) {
        
        String result = null;
        
        int idx = 0;
        if (value != null)
        {
            idx = ((Number)value).intValue();
        }
      
        if (values != null && valueMap == null)
        {
            valueMap = new String[values.length];
            for (int i = 0; i < values.length; i++) {
                valueMap[i] = ""+i;
            }
        }
        
        if (values != null && valueMap != null)
        {
            //1. try the exact Matches
            boolean found = false;
            for (int i = 0; i < valueMap.length && !found; i++) {
                String valueMapEntry = valueMap[i];
                if (valueMapEntry.indexOf("..") == -1 && valueMapEntry.equals(""+idx))
                {
                    found = true;
                    result = values[i];
                }
            }
            
            //2. check the <= conditions ( valueMapEntries with ..<number> ) 
            for (int i = 0; i < valueMap.length && !found; i++) {
                String valueMapEntry = valueMap[i];
                String valueBefore = i > 0 ? valueMap[i-1].replace(".", "") : null; 
                if (valueMapEntry.length() > 2 
                        && valueMapEntry.startsWith("..") 
                        && Integer.parseInt(valueMapEntry.substring(2)) >= idx
                        && (valueBefore == null || valueBefore != null && Integer.parseInt(valueBefore)  < idx)
                )
                {
                    found = true;
                    result = values[i];
                }
            }
            //3. check the >= conditions ( valueMapEntries with <number>.. ) 
            for (int i = valueMap.length -1; i >= 0 && !found; i--) {
                String valueMapEntry = valueMap[i];
                String valueAfter = i < valueMap.length -1 ? valueMap[i+1].replace(".", "") : null; 
                if (valueMapEntry.length() > 2 
                        && valueMapEntry.endsWith("..") 
                        && Integer.parseInt(valueMapEntry.substring(0,valueMapEntry.length()-2)) <= idx
                        && (valueAfter == null || valueAfter != null && Integer.parseInt(valueAfter)  > idx)
                )
                {
                    found = true;
                    result = values[i];
                }
            }
            //4. check if there is a else clause (valueMapEntries with ..) 
            for (int i = 0; i < valueMap.length && !found; i++) {
                String valueMapEntry = valueMap[i];
                if (valueMapEntry.equals(".."))
                {
                    found = true;
                    result = values[i];
                }
            }
            
            //5. If no entry matches we return the idx itself
            if (!found)
            {
                result = ""+idx;
            }
            
        }
        else //having only the valueMap entries
        {
            result = valueMap[idx];
        }
        return result;
    }

    private static String getBooleanValue(CIMProperty property, CIMClassProperty clsProperty) {
        String result;
        Boolean value = (Boolean) property.getValue();
        if (value == null && clsProperty != null)
        {
            value = (Boolean) clsProperty.getValue(); 
        }
        
        boolean b = value != null && value.booleanValue();
        result = "" + b;
        return result;
    }

}
