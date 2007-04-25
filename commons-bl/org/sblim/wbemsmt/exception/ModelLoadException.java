 /** 

  * ModelLoadException.java
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
  * Description: Occurs if the Model cannot be loaded
  * 
  */
package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class ModelLoadException extends WbemSmtException {

	private static final long serialVersionUID = -572530742347664243L;

	public ModelLoadException(CIM_ManagedElement cimElement, Throwable arg1) {
		super(cimElement, arg1);
	}

	public ModelLoadException(String arg0, CIM_ManagedElement cimElement, Throwable arg1) {
		super(arg0, cimElement, arg1);
	}

	public ModelLoadException(Throwable arg1) {
		super(arg1);
	}

	public ModelLoadException(String msg) {
		super(msg);
	}

	public ModelLoadException(String string, Throwable t) {
		super(string,t);
	}


	
	

}
