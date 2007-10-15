 /** 
  * IndicationPreparationException.java
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
  * Description: Occurs if during the preparation for the system to receive indications
  * 
  */
package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;

public class IndicationPreparationException extends WbemSmtException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8344408728184185351L;

	public IndicationPreparationException(CIM_ObjectIf cimElement) {
		super(cimElement);
		
	}

	public IndicationPreparationException(String msg, CIM_ObjectIf co, Throwable t) {
		super(msg, co, t);
		
	}

	public IndicationPreparationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public IndicationPreparationException(String arg0) {
		super(arg0);
		
	}

	public IndicationPreparationException(CIM_ObjectIf cimElement, Throwable arg1) {
		super(cimElement, arg1);
		
	}

	public IndicationPreparationException(WbemSmtException arg1) {
		super(arg1);
		
	}


}
