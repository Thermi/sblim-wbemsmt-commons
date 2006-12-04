 /** 
  * NumericFieldValidator.java
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
  * Description: Validator for numeric fields
  * 
  */
package org.sblim.wbemsmt.tools.validator;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.ValidationException;
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
	public void validateElement(MessageList result) throws ValidationException {
		
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
							String msg = adapter.getBundle().getString("validator.belowMin",new Object[]{value,min,component.getLabelText()});
							result.addError(msg,component);
						}
						if (max != null && value.longValue() > max.longValue())
						{
							String msg = adapter.getBundle().getString("validator.aboveMax",new Object[]{value,max,component.getLabelText()});
							result.addError(msg,component);
						}
					}
					else
					{
						logger.severe("Cannot validate Field. It's not a number");
						throw new ValidationException("Cannot validate Field. It's not a number");
					}
				}
			}
			else
			{
				Object minObj = min != null ? (Object)min : (Object)adapter.getBundle().getString("validator.not.defined");
				Object maxObj = max != null ? (Object)max : (Object)adapter.getBundle().getString("validator.not.defined");
				String msg = adapter.getBundle().getString("validator.notNumeric",new Object[]{minObj,maxObj,component.getLabelText()});
				result.addError(msg,component);
			}
		}
	}

	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{component} ;
	}

}
