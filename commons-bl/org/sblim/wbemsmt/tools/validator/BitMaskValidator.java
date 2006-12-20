 /** 
  * BitMaskValidator.java
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
  * Description: Validator for validarting BitMasks
  * 
  */
package org.sblim.wbemsmt.tools.validator;

import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.ValidationException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class BitMaskValidator extends Validator {

	
	//TOOD i18n
	private final LabeledBaseInputComponentIf component;
	private final int fieldSize;

	public BitMaskValidator(int fieldSize, LabeledBaseInputComponentIf component,AbstractBaseCimAdapter adapter) {
		super(adapter);
		this.fieldSize = fieldSize;
		this.component = component;
	}

	/**
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

						if (value.length() != fieldSize)
						{
							String msg = adapter.getBundle().getString(ErrCodes.MSG_BITMASK_LENGTH,"validator.bitmaskLength",new Object[]{value,""+fieldSize,component.getLabelText()});
							result.addMessage(new Message(ErrCodes.MSG_BITMASK_LENGTH,Message.ERROR,msg,component));
						}
						else
						{
							for(int i=0; i < fieldSize; i++)
							{
								String strBitValue = value.substring(i,i+1);
								try {
									int bitValue = Integer.parseInt(strBitValue);
									if (bitValue > 7)
									{
										String msg = adapter.getBundle().getString(ErrCodes.MSG_BITMASK_VALUE_TOO_LARGE, "validator.bitvalueTooLarge",new Object[]{value,strBitValue,component.getLabelText()});
										result.addMessage(new Message(ErrCodes.MSG_BITMASK_VALUE_TOO_LARGE,Message.ERROR,msg,component));
									}
								} catch (NumberFormatException e) {
									String msg = adapter.getBundle().getString(ErrCodes.MSG_BITMASK_VALUE_NO_NUMBER, "validator.bitvalueNoNumber",new Object[]{value,strBitValue,component.getLabelText()});
									result.addMessage(new Message(ErrCodes.MSG_BITMASK_VALUE_NO_NUMBER,Message.ERROR,msg,component));
								}
								
							}
						}
					}
					else
					{
						logger.severe("Cannot validate BitMask - Raw Value for InputComponent is no String");
						throw new ValidationException("Cannot validate BitMask - Raw Value for InputComponent is no String");
					}
					
				}
			}
			else
			{
				//only a example should not occur
				String msg = adapter.getBundle().getString(ErrCodes.MSG_CANNOT_CONVERT, "validator.cannotConvert",new Object[]{component.getLabelText()});
				result.addMessage(new Message(ErrCodes.MSG_CANNOT_CONVERT,Message.ERROR,msg,component));
			}
		}
	}

	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{component} ;
	}

}
