 /** 
  * UpdateControlsException.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Occurs if the Controls cannot be updated
  * 
  */
package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;

public class UpdateControlsException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UpdateControlsException(CIM_ObjectIf cimElement, Throwable arg1) {
		super(cimElement, arg1);
	}

	public UpdateControlsException(String arg0, CIM_ObjectIf cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
	}

	public UpdateControlsException(WbemSmtException arg1) {
		super(arg1);
	}

	public UpdateControlsException(String msg) {
		super(msg);
	}

	public UpdateControlsException(CIM_ObjectIf cimElement) {
		super(cimElement);
		
	}


	public UpdateControlsException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	

}
