 /** 
  * NumericFieldValidator.java
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
  * Description: Validator for numeric fields
  * 
  */
package org.sblim.wbemsmt.tools.validator;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class NumericFieldValidator extends Validator {

	private final LabeledBaseInputComponentIf component;
	private final Long min;
	private final Long max;

	public NumericFieldValidator(long min_value, long max_value, LabeledBaseInputComponentIf component, AbstractBaseCimAdapter adapter) {
		this(new Long(min_value),new Long(max_value),component,adapter);
	}

	public NumericFieldValidator(Long min, Long max, LabeledBaseInputComponentIf component,AbstractBaseCimAdapter adapter) {
		super(adapter);
		this.min = min;
		this.max = max;
		this.component = component;
	}


	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	public void validateElement(MessageList result) throws WbemsmtException {
		
		if  ( !component.isEmpty())
		{
			if (component.isConvertible())
			{
				Object rawControlValue = component.getConvertedControlValue();
				if (rawControlValue != null)
				{
					if (rawControlValue instanceof Number)
					{
						Number value = (Number)rawControlValue;

						if (min != null && value.longValue() < min.longValue())
						{
							String msg = adapter.getBundle().getString(ErrCodes.MSG_BELOW_MIN,"validator.belowMin",new Object[]{value,min,component.getLabelText()});
							result.addMessage(new Message(ErrCodes.MSG_BELOW_MIN,Message.ERROR,msg,component));
						}
						if (max != null && value.longValue() > max.longValue())
						{
							String msg = adapter.getBundle().getString(ErrCodes.MSG_ABOVE_MAX,"validator.aboveMax",new Object[]{value,max,component.getLabelText()});
							result.addMessage(new Message(ErrCodes.MSG_ABOVE_MAX,Message.ERROR,msg,component));
						}
					}
					else
					{
						logger.severe("Cannot validate Field. It's not a number");
						throw new WbemsmtException(WbemsmtException.ERR_VALIDATION,"Cannot validate Field. It's not a number");
					}
				}
			}
			else
			{
				Object minObj = min != null ? (Object)min : (Object)adapter.getBundle().getString("validator.not.defined");
				Object maxObj = max != null ? (Object)max : (Object)adapter.getBundle().getString("validator.not.defined");
				String msg = adapter.getBundle().getString(ErrCodes.MSG_NOT_NUMERIC,"validator.notNumeric",new Object[]{minObj,maxObj,component.getLabelText()});
				result.addMessage(new Message(ErrCodes.MSG_NOT_NUMERIC,Message.ERROR,msg,component));
			}
		}
	}

	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{component} ;
	}

}
