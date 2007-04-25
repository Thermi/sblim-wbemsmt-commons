/**
 * SelectionNotValidException.java
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
 * Author:     Michael Bauschert <Michael.Bauschert@de.ibm.com>
 * 
 * Contributors: 
 * 
 * Occurs if adaper is accessing a selection that is not valid
 *
 **/

/*
 * Created on Mar 14, 2005
 *
 */
package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.bl.fco.CIM_Object;
import org.sblim.wbemsmt.schema.cim29.CIM_Component;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

/**
 * Author taphorn
 *
 */
public class SelectionNotValidException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8600442033186651495L;

	public SelectionNotValidException(CIM_ManagedElement cimElement, Throwable arg1) {
		super(cimElement, arg1);
		
	}

	public SelectionNotValidException(String arg0, CIM_ManagedElement cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
		
	}

	public SelectionNotValidException(WbemSmtException arg1) {
		super(arg1);
		
	}

	public SelectionNotValidException(CIM_Component co, Throwable t) {
		super(co, t);
	}

	public SelectionNotValidException(CIM_ManagedElement cimElement) {
		super(cimElement);
	}

	public SelectionNotValidException(CIM_Object cimObject, Throwable arg1) {
		super(cimObject, arg1);
	}

	public SelectionNotValidException(String msg, CIM_Component co, Throwable t) {
		super(msg, co, t);
	}

	public SelectionNotValidException(String arg0, CIM_Object cimObject, Throwable arg1) {
		super(arg0, cimObject, arg1);
	}

	public SelectionNotValidException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public SelectionNotValidException(String arg0) {
		super(arg0);
	}

	public SelectionNotValidException(Throwable arg1) {
		super(arg1);
	}


	
	
	
}
