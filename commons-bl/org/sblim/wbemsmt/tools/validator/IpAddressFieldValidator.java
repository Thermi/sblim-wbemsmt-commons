 /** 
  * IpAddressFieldValidator.java
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
  * Description: Validator for checking ip addresses
  * 
  */
package org.sblim.wbemsmt.tools.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.ValidationException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class IpAddressFieldValidator extends Validator {

	private final LabeledBaseInputComponentIf component;

	public IpAddressFieldValidator(LabeledBaseInputComponentIf component,AbstractBaseCimAdapter adapter) {
		super(adapter);
		this.component = component;
	}

	/**
	 * @throws ValidationException 
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	public void validateElement(MessageList result) throws ValidationException {
		
		if  ( !component.isEmpty())
		{
			if (component.isConvertible())
			{
				Object rawControlValue = component.getConvertedControlValue();
				if (rawControlValue != null)
				{
					if (rawControlValue instanceof String)
					{
						String value = (String)rawControlValue;
						validateIpAddress(result, value,adapter,component);
					}
					else
					{
						logger.severe("Cannot validate IpAdress - Raw Value for InputComponent is no String");
						throw new ValidationException("Cannot validate IpAdress - Raw Value for InputComponent is no String");
					}
					
				}
			}
			else
			{
				//only a example should not occur
				String msg = adapter.getBundle().getString("validator.ipCannotConvert",new Object[]{component.getLabelText()});
				result.addError(msg,component);
			}
		}
	}

	/**
	 * return true if the value is a valid Ipv4 Address
	 * @param result
	 * @param value
	 * @param adapter
	 * @param component
	 * @return
	 */
	public static boolean validateIpAddress(MessageList result, String value, AbstractBaseCimAdapter adapter,LabeledBaseInputComponentIf component) {
		
		int errorCount = result.getErrors().length;
		
		List values = new ArrayList();
		StringTokenizer tokenizer = new StringTokenizer(value,".");
		while (tokenizer.hasMoreElements())
		{
			values.add(tokenizer.nextElement());
		}
		

		if (values.size() != 4)
		{
			String msg = adapter.getBundle().getString("validator.ip4Digits",new Object[]{value,component.getLabelText()});
			result.addError(msg,component);
			return false;
		}
		
		String[] valueArray = (String[]) values.toArray(new String[values.size()]);
		
		validateIpValues(result, value, adapter, component, valueArray);
		
		boolean success = errorCount == result.getErrors().length;
		return success;
	}

	public static boolean validateIpValues(MessageList result, String value, AbstractBaseCimAdapter adapter, LabeledBaseInputComponentIf component, String[] valueArray) {

		int errorCount = result.getErrors().length;
		
		for (int i = 0; i < valueArray.length; i++) {
			String strNr = valueArray[i];
			try {
				int nr = Integer.parseInt(strNr);
				if (nr > 255)
				{
					String msg = adapter.getBundle().getString("validator.ipLargerThan255",new Object[]{strNr,value,component.getLabelText()});
					result.addError(msg,component);
				}
				if (nr < 0)
				{
					String msg = adapter.getBundle().getString("validator.ipLessThan0",new Object[]{strNr,value,component.getLabelText()});
					result.addError(msg,component);
				}
				
			} catch (NumberFormatException e) {
				String msg = adapter.getBundle().getString("validator.ipNoNumber",new Object[]{strNr,value,component.getLabelText()});
				result.addError(msg,component);
			}
		}
		boolean success = errorCount == result.getErrors().length;
		return success;
		
	}
	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{component} ;
	}

}
