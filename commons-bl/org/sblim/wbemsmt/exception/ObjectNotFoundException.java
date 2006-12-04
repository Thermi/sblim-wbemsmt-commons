/**
 * ObjectNotFoundException.java
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
 * Contributors: Michael Bauschert <Michael.Bauschert@de.ibm.com>
 * 
 * Occurs if a requested object cannot be found in the model
 *
 **/

/*
 * Created on Mar 14, 2005
 *
 */
package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.schema.cim29.CIM_Component;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

/**
 * Author Bauschert
 *
 */
public class ObjectNotFoundException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5097698708919777783L;

	public ObjectNotFoundException(String msg, CIM_Component co, Throwable t) {
		super(msg, co, t);
		
	}

	public ObjectNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public ObjectNotFoundException(CIM_ManagedElement cimElement, Throwable arg1) {
		super(cimElement, arg1);
		
	}

	public ObjectNotFoundException(CIM_ManagedElement cimElement) {
		super(cimElement);
	}

	public ObjectNotFoundException(String arg0, CIM_ManagedElement cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
		
	}

	public ObjectNotFoundException(WbemSmtException arg1) {
		super(arg1);
		
	}

	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	
	
	
	
}
