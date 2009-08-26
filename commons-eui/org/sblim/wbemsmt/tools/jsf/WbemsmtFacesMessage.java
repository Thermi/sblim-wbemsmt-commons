 /** 
  * WbemsmtFacesMessage.java
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
  * Description: Wrapper for JSF Messages
  * 
  */
package org.sblim.wbemsmt.tools.jsf;

import javax.faces.application.FacesMessage;

import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageInputHandler;

/**
 * @author Bauschert
 *
 */
public class WbemsmtFacesMessage extends FacesMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4323400706642117406L;
	private Message message;
	protected WbemsmtFacesMessage()
	{
		this.message = null;
	}
	
	public WbemsmtFacesMessage(Message message) {
		super(message.getMessageString());
		this.message = message;
	}

	public Message getMessage() {
		return message;
	}
	
	public String getSummary()
	{
		return message.getMessageString();
	}

	public String getMessageText()
	{
		return message.getMessage();
	}
	
	public String getMessageCode()
	{
		return message.getMessageCode();
	}

	public String getMessageType()
	{
		return message.getType();
	}
	
    public int getRequiredInput() {
        return message.getRequiredInput();
    }

    public  MessageInputHandler getMessageInputHandler() {
        return message.getMessageInputHandler();
    }

    public boolean getHasOKCancel() {
        return message.getRequiredInput() == Message.INPUT_OK_CANCEL;
    }

    public boolean getHasYesNo() {
        return message.getRequiredInput() == Message.INPUT_YES_NO;
    }
    
    
}
