 /** 
  * MessageNumber.java
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
  * Description: Message number with relation to component and subsystem
  * 
  */
package org.sblim.wbemsmt.bl;

import java.text.DecimalFormat;

public class MessageNumber
{
	private final String component;
	private final String subSys;
	private final int number;
	private String resourceBundleKey;
	private String qualifiedNumber;

	public static final DecimalFormat MESSAGE_NUMBER_FORMAT = new DecimalFormat("0000");
	
	public MessageNumber(String component,String subSys,int number)
	{
		this.number = number;
		this.component = component;
		this.subSys = subSys;
		this.resourceBundleKey = component + "." + subSys + "." + MESSAGE_NUMBER_FORMAT.format(number);
		this.qualifiedNumber = component + subSys + MESSAGE_NUMBER_FORMAT.format(number);
	}

	public String getComponent() {
		return component;
	}

	public String getSubSys() {
		return subSys;
	}
	
	public int getNumber() {
		return number;
	}

	/**
	 * Returns the Component, subsystem and message number as String, separated by a single dot (.) for prefixing a resourceBundle-Entry
	 * @return
	 */
	public String getResourceBundleKey() {
		return this.resourceBundleKey;
	}

	/**
	 * Returns the Component, subsystem and message number as String
	 * @return
	 */
	public String getQualifiedNumber() {
		return qualifiedNumber;
	}
	
	
}