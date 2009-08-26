 /** 
  * RequiredFieldValidator.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Validator for checking if only allowed values are set
  * 
  */
package org.sblim.wbemsmt.tools.validator;

import javax.cim.UnsignedInteger16;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;

public class OtherSelectionValidator extends Validator {

	
	//TOOD i18n
	private final LabeledStringArrayInputComponentIf component;
	private final String key;
	private final String[] values;

	/**
	 * Creates a new Validator
	 * @param component the component where the selected index is extracted from
	 * @param key the resourceBundle key of the value that is not allowed
	 * @param adapter
	 * @param values the array with the possible values
	 */
	public OtherSelectionValidator(LabeledStringArrayInputComponentIf component,String key, AbstractBaseCimAdapter adapter, String[] values) {
		super(adapter);
		this.component = component;
		this.key = key;
		this.values = values;
	}

	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	public void validateElement(MessageList result) throws WbemsmtException {
		
		if (!component.isEmpty())
		{
			UnsignedInteger16 idx = (UnsignedInteger16) component.getConvertedControlValue();
			if (idx != null)
			{
				String valueSet =  values[idx.intValue()];
				String valueNotAllowed = adapter.getBundle().getString(key);
				if (valueSet.equals(valueNotAllowed))
				{
					String msg = adapter.getBundle().getString(ErrCodes.MSG_VALUE_NOT_ALLOWED,"validator.valueNotAllowed",new Object[]{component.getLabelText(),valueNotAllowed});
					result.addMessage(new Message(ErrCodes.MSG_VALUE_NOT_ALLOWED,Message.ERROR,msg,component));
				}
			}
		}
	}

	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{component} ;
	}

}
