/**
 * InvalidPropertyValueException.java
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
 * Created on Mar 7, 2005
 *
 */
package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;

/**
 * Author taphorn
 *
 */
public class InvalidPropertyValueException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8734899879389381782L;

	public InvalidPropertyValueException(CIM_ObjectIf cimElement, Throwable arg1) {
		super(cimElement, arg1);
		
	}

	public InvalidPropertyValueException(String arg0, CIM_ObjectIf cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
		
	}

	public InvalidPropertyValueException(WbemSmtException arg1) {
		super(arg1);
		
	}
    

	
	
}
