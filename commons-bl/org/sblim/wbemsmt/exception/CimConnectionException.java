/**
 * CimConnectionException.java
 *
 * (C) Copyright IBM Corp. 2005
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
 * Created on Mar 21, 2005
 *
 */
package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

/**
 * Author taphorn
 *
 */
public class CimConnectionException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3587196677645063893L;

	public CimConnectionException(CIM_ManagedElement cimElement, Throwable arg1) {
		super(cimElement, arg1);
		
	}

	public CimConnectionException(String arg0, CIM_ManagedElement cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
		
	}

	public CimConnectionException(WbemSmtException arg1) {
		super(arg1);
		
	}

	
	
}
