/**
 * InvalidParameterException.java
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
 * Contributors:
 *
 **/

/*
 * Created on Mar 22, 2005
 *
 */
package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;

/**
 * Author taphorn
 *
 */
public class InvalidParameterException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7907110917127091973L;

	public InvalidParameterException(CIM_ObjectIf cimElement, Throwable arg1) {
		super(cimElement, arg1);
		
	}

	public InvalidParameterException(String arg0, CIM_ObjectIf cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
		
	}

	public InvalidParameterException(WbemSmtException arg1) {
		super(arg1);
		
	}

	
	
}
