 /** 
  * WbemSmtException.java
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
  * Description: Baseclass for all Exceptions thrown in the WebmSmt-Framework
  * 
  */

package org.sblim.wbemsmt.exception;

import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;

public class WbemSmtException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8090752773000518419L;
	protected CIM_ObjectIf cimObject;
	protected String cimIdentifier;

	public WbemSmtException(String arg0) {
		super(arg0);
	}

	public WbemSmtException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
	
	public WbemSmtException(String arg0, CIM_ObjectIf cimObject) {
		super(arg0);
		this.cimObject = cimObject;
	}
	
	public WbemSmtException(String arg0, CIM_ObjectIf cimObject, Throwable arg1) {
		super(arg0, arg1);
		this.cimObject = cimObject;
	}

	public WbemSmtException(CIM_ObjectIf cimObject, Throwable arg1) {
		super(arg1);
		this.cimObject = cimObject;
	}

	public WbemSmtException(CIM_ObjectIf cimObject) {
		super();
		this.cimObject = cimObject;
	}

	public WbemSmtException(Throwable arg1) {
		super(arg1);
	}

	public WbemSmtException(WbemSmtException arg1) {
		super(arg1);
	}
	
	public CIM_ObjectIf getCIM_Object() {
		return this.cimObject;
	}

	public String getCimIdentifier() {
		return cimIdentifier;
	}

	public void setCimIdentifier(String cimIdentifier) {
		this.cimIdentifier = cimIdentifier;
	}
	
	
	
}
