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
  * Description: Validator for checking required fields
  * 
  */
package org.sblim.wbemsmt.tools.validator;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class RequiredFieldValidator extends Validator {

	
	//TOOD i18n
	private final LabeledBaseInputComponentIf component;

	public RequiredFieldValidator(LabeledBaseInputComponentIf component,AbstractBaseCimAdapter adapter) {
		super(adapter);
		this.component = component;
	}

	/**
	 * @see org.sblim.wbemsmt.tools.validator.Validator#validate()
	 */
	public void validateElement(MessageList result) throws WbemsmtException {
		
		if (component.isEmpty())
		{
			String msg = adapter.getBundle().getString(ErrCodes.MSG_REQUIRED_FIELD, "validator.requiredField",new Object[]{component.getLabelText()});
			result.addMessage(new Message(ErrCodes.MSG_REQUIRED_FIELD,Message.ERROR,msg,component));
		}
	}

	protected LabeledBaseInputComponentIf[] getComponents() {
		return new LabeledBaseInputComponentIf[]{component} ;
	}

}
