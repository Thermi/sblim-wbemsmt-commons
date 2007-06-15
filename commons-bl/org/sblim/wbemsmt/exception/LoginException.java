/**
 * ObjectCreationException.java
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
 * Author:     Wolfgang Taphorn <taphorn@de.ibm.com>
 * 
 * Contributors: Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 **/

/*
 * Created on Mar 14, 2005
 *
 */
package org.sblim.wbemsmt.exception;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;

/**
 * Author Bauschert
 *
 */
public class LoginException extends ObjectSaveException {

	private CIMClient cimClient = null;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7726662820716834494L;

	public LoginException(CIM_ObjectIf cimElement, CIMClient cimClient) {
		super(cimElement);
		this.cimClient = cimClient;
		
	}

	public LoginException(String arg0, Throwable arg1, CIMClient cimClient) {
		super(arg0, arg1);
		this.cimClient = cimClient;
	}

	public LoginException(Throwable arg1, CIMClient cimClient) {
		super(arg1);
		this.cimClient = cimClient;
	}

	public LoginException(String arg0, CIMClient cimClient) {
		super(arg0);
		this.cimClient = cimClient;
	}

	public LoginException(String arg0, CIM_ObjectIf cimElement, Throwable arg1, CIMClient cimClient) {
		super(arg0, cimElement, arg1);
		this.cimClient = cimClient;
	}

	public LoginException(CIM_ObjectIf cimElement, Throwable arg1, CIMClient cimClient) {
		super(cimElement, arg1);
		this.cimClient = cimClient;
	}

	public LoginException(WbemSmtException arg1, CIMClient cimClient) {
		super(arg1);
		this.cimClient = cimClient;
	}

	public CIMClient getCimClient() {
		return cimClient;
	}

	public void setCimClient(CIMClient cimClient) {
		this.cimClient = cimClient;
	}


	
	

	
}
