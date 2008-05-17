/** 
 * Validator.java
 * © Copyright IBM Corp. 2005
 *
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author:	Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 *              
 *
 * Description: BaseClass for Validators
 * 
 */

package org.sblim.wbemsmt.tools.validator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public abstract class Validator {

	
	protected AbstractBaseCimAdapter adapter;
	private boolean validationOK = false;
	private boolean stopWithoutMessage = false;

	protected Logger logger = Logger.getLogger(Validator.class.getName());
	
	public Validator(AbstractBaseCimAdapter adapter)
	{
		this.adapter = adapter;
		stopWithoutMessage = false;
	}
	
	/**
	 * Returns a list with error Messages 
	 * if there is no errorMessage, the List.size() must be 0.
	 * @return
	 * @throws WbemsmtException 
	 */
	public MessageList validate() throws WbemsmtException
	{
		//can be overwrittemn by the subclass
		stopWithoutMessage = false;
		
		
		MessageList result = new MessageList();
		
		
		validateParents(result);
		
		validationOK = result.size() == 0 && !stopWithoutMessage;
		if (!validationOK)
		{
			System.err.println("Stopped Validation");
			return result;
		}
		
		
		validateElement(result);
		
		LabeledBaseInputComponentIf[] components = getComponents();
		ValidatorUtil.setOK(components);
		
		Message[] messages = result.getErrors();
		for (int i = 0; i < messages.length; i++) {
			Message message = messages[i];
			LabeledBaseInputComponentIf[] inputComponents = message.getInputComponents();
			ValidatorUtil.setError(inputComponents);
		}
		
		validationOK = result.size() == 0 && !stopWithoutMessage;
		if (validationOK)
		{
			validateChilds(result);
		}
		else
		{
			System.err.println("Stopped Validation");
		}
		return result;
	}

	protected abstract LabeledBaseInputComponentIf[] getComponents();

	public abstract void validateElement(MessageList result) throws WbemsmtException;

	List childs = new ArrayList();
	List parents = new ArrayList();
	
	/**
	 * The added validator childs are only validated if the parent validator finished okay
	 * @param validator
	 */
	public void addChild(Validator validator)
	{
		childs.add(validator);
	}
	
	/**
	 * The added validator parents are validated before ther validator. Only if the parents are okay the validator itself is executed
	 * @param validator
	 */
	public void addParent(Validator validator)
	{
		parents.add(validator);
	}

	private void validateChilds(MessageList result) throws WbemsmtException
	{
		for (Iterator iter = childs.iterator(); iter.hasNext();) {
			Validator child = (Validator) iter.next();
			result.addAll(child.validate());
		}
	}

	private void validateParents(MessageList result) throws WbemsmtException
	{
		for (Iterator iter = parents.iterator(); iter.hasNext();) {
			Validator child = (Validator) iter.next();
			result.addAll(child.validate());
		}
	}

	public boolean isValidationOK() {
		return validationOK;
	}

	public void setValidationOK(boolean validationOK) {
		this.validationOK = validationOK;
	}

	protected void stopWithoutMessage() {
		stopWithoutMessage = true;
		
	}

	
	
}
