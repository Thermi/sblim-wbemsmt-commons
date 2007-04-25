 /** 
  * WbemsmtFacesMessage.java
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
  * Description: Wrapper for JSF Messages
  * 
  */
package org.sblim.wbemsmt.tools.jsf;

import javax.faces.application.FacesMessage;

import org.sblim.wbemsmt.bl.adapter.Message;

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
	

}
