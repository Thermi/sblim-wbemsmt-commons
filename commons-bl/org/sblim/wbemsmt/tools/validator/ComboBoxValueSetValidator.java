 /** 
  * ComboBoxValueSetValidator.java
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
  * Description: Validator for checking if a default value in a comboBox was overwritten
  * 
  */
package org.sblim.wbemsmt.tools.validator;

import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.ValidationException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class ComboBoxValueSetValidator extends Validator {

	private final LabeledBaseInputComponentIf component;
	private final int defaultValue;
	private final String defaultContent;

	public ComboBoxValueSetValidator(LabeledBaseInputComponentIf component,int defaultValue, String defaultContent,AbstractBaseCimAdapter adapter) {
		super(adapter);
		this.component = component;
		this.defaultValue = defaultValue;
		this.defaultContent = defaultContent;
	}

	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	public void validateElement(MessageList result) throws ValidationException {
		
		if (component.isEmpty())
		{
			String msg = adapter.getBundle().getString(ErrCodes.MSG_REQUIRED_FIELD,"validator.requiredField",new Object[]{component.getLabelText()});
			result.addMessage(new Message(ErrCodes.MSG_REQUIRED_FIELD,Message.ERROR,msg,component));
		}
		else
		{
			UnsignedInt16 controlValue = (UnsignedInt16) component.getConvertedControlValue();
			UnsignedInt16 checkValue = new UnsignedInt16(defaultValue);
			if (controlValue.equals(checkValue))
			{
				String msg = adapter.getBundle().getString(ErrCodes.MSG_OTHER_COMBO_ENTRY,".validator.otherComboBoxEntry",new Object[]{defaultContent});
				result.addMessage(new Message(ErrCodes.MSG_OTHER_COMBO_ENTRY,Message.ERROR,msg,component));
			}
		}
	}

	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{component} ;
	}

}
