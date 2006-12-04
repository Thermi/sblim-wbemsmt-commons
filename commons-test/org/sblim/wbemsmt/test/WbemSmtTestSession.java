/** 
  * WbemSmtTestSession.java
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
  * Description: TestSession for wbemsmt tests
  * 
  */
package org.sblim.wbemsmt.test;

import java.util.HashMap;
import java.util.Map;

import org.sblim.wbem.cim.CIMInstance;

/**
 * @author Bauschert
 *
 */
public class WbemSmtTestSession
{
	private static final String LAST_TEST_OK = "---lastTestOK---";
	private static final String LAST_TEST_SESSION_OK = "---lastTestSessionOK---";
	private static WbemSmtTestSession instance;
	private Map values = new HashMap();
	
	
	
	private WbemSmtTestSession() {
		super();
		setLastTestOK();
	}

	public static synchronized WbemSmtTestSession getInstance()
	{
		if (instance == null)
		{
			instance = new WbemSmtTestSession();
		}
		return instance;
	}
	
	public void setAttribute(String key, Object value)
	{
		values.put(key,value);
	}

	public void setAttribute(String key, int value) {
		setAttribute(key,new Integer(value));
	}

	public void setAttribute(String key, boolean value) {
		setAttribute(key,new Boolean(value));
	}

	public Object getAttribute(String key)
	{
		return values.get(key);
	}

	public CIMInstance getCIMInstance(String key)
	{
		return (CIMInstance) values.get(key);
	}

	public int getInt(String key)
	{
		Object object = values.get(key);
		return object != null ? ((Integer) object).intValue() : 0;
	}

	public boolean getBoolean(String key)
	{
		Object object = values.get(key);
		return object != null ? ((Boolean) object).booleanValue() : false;
	}
	
	public boolean lastTestOK()
	{
		return getBoolean(WbemSmtTestSession.LAST_TEST_OK);
	}

	public boolean lastTestSessionOK()
	{
		return getBoolean(WbemSmtTestSession.LAST_TEST_SESSION_OK);
	}

	public void setLastTestFailed()
	{
		setAttribute(WbemSmtTestSession.LAST_TEST_OK,false);
	}

	public void setLastTestOK()
	{
		setAttribute(WbemSmtTestSession.LAST_TEST_OK,true);
	}

	public void setLastTestSessionFailed() {
		setAttribute(WbemSmtTestSession.LAST_TEST_SESSION_OK,false);
	}

	public void setLastTestSessionOK() {
		setAttribute(WbemSmtTestSession.LAST_TEST_SESSION_OK,true);
	}
}
