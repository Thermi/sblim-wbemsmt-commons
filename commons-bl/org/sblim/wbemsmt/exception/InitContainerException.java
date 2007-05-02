 /** 
  * InitContainerException.java
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
  * Description: Occurs if the Container cannot be initialized
  * 
  */
package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;

public class InitContainerException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InitContainerException(CIM_ObjectIf cimElement, Throwable arg1) {
		super(cimElement, arg1);
	}

	public InitContainerException(WbemSmtException arg1) {
		super(arg1);
	}

	public InitContainerException(String msg) {
		super(msg);
	}

	public InitContainerException(CIM_ObjectIf cimElement) {
		super(cimElement);
		
	}

	public InitContainerException(String msg, CIM_ObjectIf co, Throwable t) {
		super(msg, co, t);
		
	}

	public InitContainerException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	

}
