/**
 * ObjectNotFoundException.java
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
 * Occurs if a requested object cannot be found in the model
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

public class ModelNotLoadedException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6123341206129786861L;

	public ModelNotLoadedException(CIM_Component co, Throwable t) {
		super(co, t);
	}

	public ModelNotLoadedException(CIM_ManagedElement cimElement) {
		super(cimElement);
	}

	public ModelNotLoadedException(CIM_Object cimObject, Throwable arg1) {
		super(cimObject, arg1);
	}

	public ModelNotLoadedException(String msg, CIM_Component co, Throwable t) {
		super(msg, co, t);
	}

	public ModelNotLoadedException(String arg0, CIM_Object cimObject, Throwable arg1) {
		super(arg0, cimObject, arg1);
	}

	public ModelNotLoadedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ModelNotLoadedException(String arg0) {
		super(arg0);
	}

	public ModelNotLoadedException(Throwable arg1) {
		super(arg1);
	}

	public ModelNotLoadedException(CIM_ManagedElement cimElement, Throwable arg1) {
		super(cimElement, arg1);
		
	}

	public ModelNotLoadedException(String arg0, CIM_ManagedElement cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
		
	}

	public ModelNotLoadedException(WbemSmtException arg1) {
		super(arg1);
		
	}


	

	
	
}
