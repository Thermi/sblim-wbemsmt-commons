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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
							list.addError(container.getAdapter().getBundle().getString("conversion.error"));							
						}
						
						String msg = container.getAdapter().getBundle().getString("cannot.convert",new Object[]{field.getLabelText(),field.getConverter().getTypeForModel()});
						list.addError(msg, field);
						errors++;
					}
				} catch (Exception e) {
					logger.log(Level.SEVERE, "Cannot check Field",e);
				}
			}
		}
		
		return errors == 0;
	}

}
