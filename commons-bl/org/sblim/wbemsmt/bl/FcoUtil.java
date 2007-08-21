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
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
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

}
