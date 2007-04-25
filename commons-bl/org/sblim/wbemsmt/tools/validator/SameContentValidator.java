 /** 
  * SameContentValidator.java
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
  * Description: Checks if the Content of both fields is the same 
  * 
  */
package org.sblim.wbemsmt.tools.validator;

import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.ValidationException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class SameContentValidator extends Validator {

	
	private final LabeledBaseInputComponentIf field1;
	private final LabeledBaseInputComponentIf field2;

	public SameContentValidator(LabeledBaseInputComponentIf field1, LabeledBaseInputComponentIf field2,AbstractBaseCimAdapter adapter) {
		super(adapter);
		this.field1 = field1;
		this.field2 = field2;
	}

	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	public void validateElement(MessageList result) throws ValidationException {
		
		if  ( !field1.isEmpty() && !field2.isEmpty())
		{
			if (field1.isConvertible() && field2.isConvertible())
			{
				Object rawControlValue1 = field1.getConvertedControlValue();
				Object rawControlValue2 = field2.getConvertedControlValue();
				if (rawControlValue1 != null && rawControlValue2 != null)
				{
					if (rawControlValue1 instanceof String && rawControlValue2 instanceof String)
					{
						String value1 = (String)rawControlValue1;
						String value2 = (String)rawControlValue2;

						if (!value1.equals(value2))
						{
							String msg = adapter.getBundle().getString(ErrCodes.MSG_NOT_THE_SAME, "validator.notTheSame",new Object[]{field1.getLabelText(),field2.getLabelText()});
							result.addMessage(new Message(ErrCodes.MSG_NOT_THE_SAME,Message.ERROR,msg,new LabeledBaseInputComponentIf[]{field1,field2}));
						}
					}
					else
					{
						logger.severe("Cannot validate if values are the same - Raw Value for InputComponents is no String");
						throw new ValidationException("Cannot validate if values are the same - Raw Value for InputComponents is no String");
					}
					
				}
			}
			else
			{
				//only a example should not occur
				String msg = adapter.getBundle().getString(ErrCodes.MSG_CANNOT_CONVERT,"validator.cannotConvert",new Object[]{field1.getLabelText()});
				result.addMessage(new Message(ErrCodes.MSG_CANNOT_CONVERT,Message.ERROR,msg,field1));
				
				msg = adapter.getBundle().getString(ErrCodes.MSG_CANNOT_CONVERT,"validator.cannotConvert",new Object[]{field2.getLabelText()});
				result.addMessage(new Message(ErrCodes.MSG_CANNOT_CONVERT,Message.ERROR,msg,field2));
			}
		}
	}

	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{field1,field2} ;
	}

}
