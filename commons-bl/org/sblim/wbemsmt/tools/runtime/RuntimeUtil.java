 /** 
  * RuntimeUtil.java
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
  * Description: Util class to handle/query the applications current runtime environment
  * 
  */
package org.sblim.wbemsmt.tools.runtime;

public class RuntimeUtil {

	public static final int PL_TYPE_JSF = 0;
	public static final int PL_TYPE_SWING = 1;
	public static final int PL_TYPE_CMD = 2;
	
	
	private int plType = -1;
	public static final String MODE_MULTI = "multi";
	public static final String MODE_SINGLE = "single";
	public static final String MODE_EMBEDDED = "embedded";
	public static final String RUNTIME_MODE = "RuntimeMode";
	
	private static RuntimeUtil _instance;

	private RuntimeUtil() {
		//todo implement
	}

	public static synchronized RuntimeUtil getInstance() {
		if (_instance == null) {
			_instance = new RuntimeUtil();
		}
		return _instance;
	}
	
	public void setPlType(int plType)
	{
		this.plType = plType;
	}
	
	public boolean isJSF()
	{
		return this.plType == PL_TYPE_JSF;
	}
	
	public boolean isSwing()
	{
		return this.plType == PL_TYPE_SWING;
	}
	
	public boolean isCommandline()
	{
		return this.plType == PL_TYPE_CMD;
	}
	
	public String getRuntime()
	{
		if (isSwing())
			return "Swing";
		if (isJSF())
			return "JSF";
		if (isCommandline())
			return "Commandline";
		return "undefined";
	}
}
