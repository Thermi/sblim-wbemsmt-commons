 /** 
  * FacesMessageWrapper.java
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
  * Description: Wrapper for a javax.faces.application.FacesMessage
  * 
  */
package org.sblim.wbemsmt.tools.jsf;

import javax.faces.application.FacesMessage;

import org.sblim.wbemsmt.bl.messages.Message;

/**
 * @author Bauschert
 *
 */
public class FacesMessageWrapper extends WbemsmtFacesMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8127927378785159293L;
	private final FacesMessage msg;

	public FacesMessageWrapper(FacesMessage msg) {
		this.msg = msg;
	}

	/**
	 * return null because a javax.faces.application.FacesMessage have no message object
	 */
	public Message getMessage() {
		return null;
	}

	/**
	 * return empty string because a javax.faces.application.FacesMessage have no message code
	 */
	public String getMessageCode() {
		return "";
	}

	public String getMessageText() {
		return "";
	}

	/**
	 * return the severity of the wrapped javax.faces.application.FacesMessage
	 * converted to a Type defined in Message class
	 * 
	 * @see Message#SUCCESS
	 * @see Message#INFO
	 * @see Message#WARNING
	 * @see Message#ERROR
	 */
	public String getMessageType() {
		return new WbesmtFacesSeverity(msg.getSeverity()).getSeverity();
	}

	public String getSummary() {
		return msg.getSummary();
	}
	
	

}
