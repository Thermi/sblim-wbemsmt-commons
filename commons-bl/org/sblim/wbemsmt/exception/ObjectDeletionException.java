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

import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;
import org.sblim.wbemsmt.schema.cim_2_14.tools.CIM_Object;

/**
 * Author taphorn
 *
 */
public class ObjectDeletionException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2759098014655005891L;

	public ObjectDeletionException(CIM_ObjectIf cimElement, Throwable arg1) {
		super(cimElement, arg1);
		
	}

	public ObjectDeletionException(String arg0, CIM_ObjectIf cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
		
	}
	
	public ObjectDeletionException(WbemSmtException arg1) {
		super(arg1);
		
	}

	public ObjectDeletionException(String msg) {
		super(msg);
	}

	public ObjectDeletionException(CIM_ObjectIf cimElement) {
		super(cimElement);
		
	}

	public ObjectDeletionException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public ObjectDeletionException(CIM_Object cimObject, Throwable arg1) {
		super(cimObject, arg1);
		
	}

	public ObjectDeletionException(String arg0, CIM_Object cimObject, Throwable arg1) {
		super(arg0, cimObject, arg1);
		
	}

	public ObjectDeletionException(Throwable arg1) {
		super(arg1);
		
	}

	public ObjectDeletionException(String msg, CIM_ObjectIf cimElement) {
		super(msg,cimElement,null);
	}




	
	
	
}
