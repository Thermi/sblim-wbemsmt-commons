 /** 

  * FilterException.java
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
  * Description: Occurs if the object cannot be filtered
  * 
  */
package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class FilterException extends WbemSmtException {

	private static final long serialVersionUID = -572530742347664243L;

	public FilterException(CIM_ManagedElement cimElement, Throwable arg1) {
		super(cimElement, arg1);
	}

	public FilterException(String arg0, CIM_ManagedElement cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
	}

	public FilterException(Throwable arg1) {
		super(arg1);
	}

	public FilterException(String msg) {
		super(msg);
	}

	public FilterException(String string, Throwable t) {
		super(string,t);
	}


	
	

}
