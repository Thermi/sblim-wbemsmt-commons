/**
 * ObjectUpdateException.java
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

import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

/**
 * Author taphorn
 *
 */
public class ObjectUpdateException extends ObjectSaveException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 217342474936011723L;

	public ObjectUpdateException(CIM_ManagedElement cimElement) {
		super(cimElement);
		
	}

	public ObjectUpdateException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public ObjectUpdateException(String arg0) {
		super(arg0);
		
	}

	public ObjectUpdateException(CIM_ManagedElement cimElement, Throwable arg1) {
		super(cimElement, arg1);
		
	}

	public ObjectUpdateException(String arg0, CIM_ManagedElement cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
		
	}

	public ObjectUpdateException(WbemSmtException arg1) {
		super(arg1);
		
	}


	
	
	
}
