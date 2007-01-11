 /** 
  * DataContainerUtil.java
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
  * Description: UtilClass for DataContainers
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;


public class DataContainerUtil {

	private static Logger logger = Logger.getLogger(DataContainerUtil.class.getName());	

	public static DataContainer copyValues(DataContainer source, DataContainer target) {
		
		
		String sourceClassName = source.getClass().getName();
		String targetClassName = target.getClass().getName();
		
		if (!sourceClassName.equals(targetClassName))
		{
			throw new IllegalArgumentException("The containers are not from same type. Source is " + sourceClassName + " and target is " + targetClassName );
		}
		
		Method[] methods = target.getClass().getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method targetMethod = methods[i];
			targetMethod.setAccessible(true);
			if (targetMethod.getName().startsWith("get_"))
			{
				try {
					Method sourceMethod = source.getClass().getMethod(targetMethod.getName(),null);
					sourceMethod.setAccessible(true);
					LabeledBaseInputComponentIf sourceField = (LabeledBaseInputComponentIf) sourceMethod.invoke(source,null);
					LabeledBaseInputComponentIf targetField = (LabeledBaseInputComponentIf) targetMethod.invoke(target,null);
					targetField.setValue(sourceField.getValue());
					//targetField.setControlValue(sourceField.getConvertedControlValue());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if (targetMethod.getName().startsWith("get") && targetMethod.getReturnType().equals(List.class))
			{
				try {
					Method sourceMethod = source.getClass().getMethod(targetMethod.getName(),null);
					sourceMethod.setAccessible(true);
					List sourceList = (List) sourceMethod.invoke(source,null);
					List targetList = (List) targetMethod.invoke(target,null);
					if (sourceList.size() != targetList.size())
					{
						throw new IllegalArgumentException("The Liste are not from same size. Source is " + sourceList.size() + " and target is " + targetList.size() );
					}
					
					for (int ii=0; ii < sourceList.size(); ii++)
					{
						DataContainerUtil.copyValues((DataContainer) sourceList.get(ii),(DataContainer)targetList.get(ii));
					}
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if (targetMethod.getName().startsWith("getMessageList") && targetMethod.getReturnType().equals(MessageList.class))
			{
				try {
					Method sourceMethod = source.getClass().getMethod(targetMethod.getName(),null);
					sourceMethod.setAccessible(true);
					MessageList sourceList = (MessageList) sourceMethod.invoke(source,null);

					MessageList.init(target).addAll(sourceList);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return target;
	}

	public static boolean validateEnteredValues(DataContainer container) {
		
		MessageList list = MessageList.init(container);
		
		int errors = 0;
		
		Method[] methods = container.getClass().getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			method.setAccessible(true);
			if (method.getName().startsWith("get_") 
				&& LabeledBaseInputComponentIf.class.isAssignableFrom(method.getReturnType()))
			{
				try {
					LabeledBaseInputComponentIf field = (LabeledBaseInputComponentIf) method.invoke(container, null);
					if (!field.getConverter().canConvert(field.getValue()))
					{
						if (errors == 0)
						{
							String msg = container.getAdapter().getBundle().getString(ErrCodes.MSG_CONVERSION_ERROR,"conversion.error");
							list.addMessage(new Message(ErrCodes.MSG_CONVERSION_ERROR,Message.ERROR, msg));
						}
						
						String msg = container.getAdapter().getBundle().getString(ErrCodes.MSG_CANNOT_CONVERT, "cannot.convert",new Object[]{field.getLabelText(),field.getConverter().getTypeForModel()});
						list.addMessage(new Message(ErrCodes.MSG_CANNOT_CONVERT,Message.ERROR, msg, field));
						errors++;
					}
				} catch (Exception e) {
					logger.log(Level.SEVERE, "Cannot check Field",e);
				}
			}
		}
		
		return errors == 0;
	}

	/**
	 * Check if some fields are marked as required. A field is only marked as required if the field has no error
	 * @param containers List with DataContainers
	 * @return true if a field within the containers or their childs is required
	 */
	public static boolean havingRequiredFields(List containers) {
		for (Iterator iter = containers.iterator(); iter.hasNext();) {
			DataContainer container = (DataContainer) iter.next();
			boolean result = havingRequiredFields(container);
			if (result)
			{
				return true;
			}
		}
		return false;
	}

	public static boolean havingRequiredFields(DataContainer container) {
		List fields = container.getFields();
		for (Iterator iterator = fields.iterator(); iterator.hasNext();) {
			LabeledBaseInputComponentIf field = (LabeledBaseInputComponentIf) iterator.next();
			if (field.isRequired() && !field.hasErrors())
			{
				return true;
			}
		}
		List childContainers = container.getChildContainers();
		boolean result = havingRequiredFields(childContainers);
		return result;
	}	

	
	/**
	 * Check if some fields are required
	 * @param containers List with DataContainers
	 * @return true if a field within the containers or their childs is required
	 */
	public static boolean havingErrorFields(List containers) {
		for (Iterator iter = containers.iterator(); iter.hasNext();) {
			DataContainer container = (DataContainer) iter.next();
			boolean result = havingErrorFields(container);
			if (result)
			{
				return true;
			}
		}
		return false;
	}

	public static boolean havingErrorFields(DataContainer container) {
		List fields = container.getFields();
		for (Iterator iterator = fields.iterator(); iterator.hasNext();) {
			LabeledBaseInputComponentIf field = (LabeledBaseInputComponentIf) iterator.next();
			if (field.hasErrors())
			{
				return true;
			}
		}
		List childContainers = container.getChildContainers();
		boolean result = havingErrorFields(childContainers);
		return result;
	}	
}
