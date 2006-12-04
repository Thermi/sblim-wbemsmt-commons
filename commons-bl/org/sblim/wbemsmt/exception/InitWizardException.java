 /** 
  * InitWizardException.java
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
  * Description: Occurs if the Initialization of a wizard failed
  * 
  */
package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.schema.cim29.CIM_Component;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class InitWizardException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InitWizardException(CIM_ManagedElement cimElement, Throwable arg1) {
		super(cimElement, arg1);
	}

	public InitWizardException(String arg0, CIM_ManagedElement cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
	}

	public InitWizardException(WbemSmtException arg1) {
		super(arg1);
	}

	public InitWizardException(String msg) {
		super(msg);
	}

	public InitWizardException(CIM_ManagedElement cimElement) {
		super(cimElement);
		
	}

	public InitWizardException(String msg, CIM_Component co, Throwable t) {
		super(msg, co, t);
		
	}

	public InitWizardException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	

}
