 /** 
  * OptionDefinition.java
  *
  * � Copyright IBM Corp. 2005
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
  * Description: Class as DataObject for the Values defining a Apache Commons CLI option
  * 
  */
package org.sblim.wbemsmt.tools.cli;

public class OptionDefinition {
	private String longKey;
	private String defaultValue;
	private boolean required;
	private String argName;
	private boolean readOnly;
	private String bundleKey;
	
	/**
	 * Creates a new Object
	 * @param shortKey the Short option (later used with -&lt;shortOption&gt;
	 * @param longKey the Long option (later used with -&lt;longOption&gt;
	 * @param defaultValue the defaultValue if option not provided (is currently not used for containerField-related Options
	 * @param argName the value for the argument (later use: -a, --ALong &lt;ArgName&gt; , Description
	 * @param required is the Option required
	 * @param readOnly is the value readOnly (keyFields)
	 * @param bundleKey the resourceBundleKey for the Description value for the argument (later use: -a, --ALong &lt;ArgName&gt; , Description
	 */
	public OptionDefinition(String longKey, String defaultValue, String argName, boolean required, boolean readOnly,String bundleKey)
	{
		this.longKey = longKey;
		this.defaultValue = defaultValue;
		this.argName = argName;
		this.required = required;
		this.readOnly = readOnly;
		this.bundleKey = bundleKey;
	}

	public String getLongKey() {
		return longKey;
	}

	void setLongKey(String longKey) {
		this.longKey = longKey;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public boolean isRequired() {
		return required;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String getArgName() {
		return argName;
	}

	public void setArgName(String argName) {
		this.argName = argName;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public String getBundleKey() {
		return bundleKey;
	}

	public void setBundleKey(String bundleKey) {
		this.bundleKey = bundleKey;
	}
	
	
	

	

}
