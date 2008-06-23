/** 
 * RuntimeUtil.java
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
 * Description: Util class to handle/query the applications current runtime environment
 * 
 */
package org.sblim.wbemsmt.tools.runtime;

/**
 * Util class to handle/query the applications current runtime environment
 */
public final class RuntimeUtil {

    
	private int plType = -1;

	/**
	 * Type for JSF presentation layer
	 */
	public static final int PL_TYPE_JSF = 0;
    /**
     * Type for Swing presentation layer
     */
	public static final int PL_TYPE_SWING = 1;
    /**
     * Type for Command line presentation layer
     */
	public static final int PL_TYPE_CMD = 2;
	
	
	private String mode;
	
	/**
	 * token for Multi host mode
	 */
	public static final String MODE_MULTI = "multi";
    /**
     * token for single host mode
     */
	public static final String MODE_SINGLE = "single";
    /**
     * token for single host mode running as embedded client 
     */
	public static final String MODE_EMBEDDED = "embedded";
	
	/**
	 * Key for storing the runtime in a session etc
	 */
	public static final String RUNTIME_MODE = "RuntimeMode";
	
	
	private static RuntimeUtil _instance;

	/**
	 * use get Instance to get a vaid Instance
	 * @see #getInstance()
	 */
	private RuntimeUtil() {
		//todo implement
	}

	/**
	 * @return the instance of the RuntimeUtil
	 */
	public static synchronized RuntimeUtil getInstance() {
		if (_instance == null) {
			_instance = new RuntimeUtil();
		}
		return _instance;
	}
	
	/**
	 * set the type of the Presentation layer
	 * @param plType the type of the Presentation layer
	 */
	public void setPlType(int plType)
	{
		this.plType = plType;
	}
	
	/**
	 * @return true if current presentation layer is JSF
	 */
	public boolean isJSF()
	{
		return this.plType == PL_TYPE_JSF;
	}
	
    /**
     * @return true if current presentation layer is Swing
     */
	public boolean isSwing()
	{
		return this.plType == PL_TYPE_SWING;
	}
	
    /**
     * @return true if current presentation layer is Commandline
     */
	public boolean isCommandline()
	{
		return this.plType == PL_TYPE_CMD;
	}
	
    /**
     * @return true if current mode is the single host mode
     */
	public boolean isSingleMode()
	{
		return MODE_SINGLE.equals(this.mode);
	}
	
    /**
     * @return true if current mode is the multi host mode
     */
	public boolean isMultiMode()
	{
		return MODE_EMBEDDED.equals(this.mode);
	}

    /**
     * @return true if current mode is the embedded mode
     */
	public boolean isEmbeddedMode()
	{
		return MODE_EMBEDDED.equals(this.mode);
	}
	
	/**
	 * @return the String of the current presentation layer
	 */
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

	/**
	 * set the mode of the application
	 * @param mode the mode of the application 
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @return the plaform dependent linebreak
	 */
    public static String getLineBreak() {
        
        if (getInstance().isJSF())
        {
            return "<br>";
        }        
        return "\n";
    }
}
