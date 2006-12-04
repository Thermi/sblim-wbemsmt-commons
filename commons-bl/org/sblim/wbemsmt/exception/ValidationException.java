 /** 
  * ValidationException.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Occurs if during the validation something wents wrong
  * 
  */
package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.schema.cim29.CIM_Component;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class ValidationException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8344408728184185351L;

	public ValidationException(CIM_ManagedElement cimElement) {
		super(cimElement);
		
	}

	public ValidationException(String msg, CIM_Component co, Throwable t) {
		super(msg, co, t);
		
	}

	public ValidationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public ValidationException(String arg0) {
		super(arg0);
		
	}

	public ValidationException(CIM_ManagedElement cimElement, Throwable arg1) {
		super(cimElement, arg1);
		
	}

	public ValidationException(String arg0, CIM_ManagedElement cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
		
	}

	public ValidationException(WbemSmtException arg1) {
		super(arg1);
		
	}


}
