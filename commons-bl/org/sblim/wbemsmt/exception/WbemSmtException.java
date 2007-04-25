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

import org.sblim.wbemsmt.bl.fco.CIM_Object;
import org.sblim.wbemsmt.schema.cim29.CIM_Component;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class WbemSmtException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8090752773000518419L;
	protected CIM_Object cimObject;
	protected String cimIdentifier;

	public WbemSmtException(String arg0) {
		super(arg0);
	}

	public WbemSmtException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public WbemSmtException(String arg0, CIM_ManagedElement cimElement, Throwable arg1) {
		super(arg0, arg1);
		this.cimObject = CIM_Object.create(cimElement);
	}

	public WbemSmtException(CIM_ManagedElement cimElement, Throwable arg1) {
		super(arg1);
		this.cimObject = CIM_Object.create(cimElement);
	}

	public WbemSmtException(String arg0, CIM_Object cimObject, Throwable arg1) {
		super(arg0, arg1);
		this.cimObject = cimObject;
	}

	public WbemSmtException(CIM_Object cimObject, Throwable arg1) {
		super(arg1);
		this.cimObject = cimObject;
	}

	public WbemSmtException(Throwable arg1) {
		super(arg1);
	}

	public WbemSmtException(CIM_ManagedElement cimElement) {
		super();
		this.cimObject = CIM_Object.create(cimElement);
	}

	public WbemSmtException(WbemSmtException arg1) {
		super(arg1);
	}
	
	public WbemSmtException(String msg, CIM_Component co, Throwable t) {
		super(msg,t);
		this.cimObject = CIM_Object.create(co);
	}
	
	public WbemSmtException(CIM_Component co, Throwable t) {
		super(t);
		this.cimObject = CIM_Object.create(co);
	}

	public CIM_Object getCIM_Object() {
		return this.cimObject;
	}

	public String getCimIdentifier() {
		return cimIdentifier;
	}

	public void setCimIdentifier(String cimIdentifier) {
		this.cimIdentifier = cimIdentifier;
	}
	
	
	
}
