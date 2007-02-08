/**
 * ObjectRevertException.java
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
 * Exception thrown while Reverting a Container
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

public class ObjectRevertException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8375900149617127953L;

	public ObjectRevertException(CIM_ManagedElement cimElement, Throwable arg1) {
		super(cimElement, arg1);
		
	}

	public ObjectRevertException(String arg0, CIM_ManagedElement cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
		
	}

	public ObjectRevertException(WbemSmtException arg1) {
		super(arg1);
		
	}

	public ObjectRevertException(CIM_ManagedElement cimElement) {
		super(cimElement);
		
	}

	public ObjectRevertException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public ObjectRevertException(String arg0) {
		super(arg0);
		
	}

	public ObjectRevertException(String msg, CIM_Component co, Throwable t) {
		super(msg, co, t);
		
	}

	public ObjectRevertException(CIM_Component co, Throwable t) {
		super(co, t);
		
	}

	public ObjectRevertException(Throwable arg1) {
		super(arg1);
		
	}

	public ObjectRevertException(CIM_Object cimObject, Throwable arg1) {
		super(cimObject, arg1);
		
	}

	public ObjectRevertException(String arg0, CIM_Object cimObject, Throwable arg1) {
		super(arg0, cimObject, arg1);
		
	}
	
	
}
