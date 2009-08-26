 /** 
  * MessageNumber.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Message number with relation to component and subsystem
  * 
  */
package org.sblim.wbemsmt.bl.messages;

import java.text.DecimalFormat;

/**
 * Message number with relation to component and subsystem
 */
public class MessageNumber
{
	private final String component;
	private final String subSys;
	private final int number;
	private String resourceBundleKey;
	private String qualifiedNumber;

	/**
	 * The default format for all message numbers
	 */
	public static final DecimalFormat MESSAGE_NUMBER_FORMAT = new DecimalFormat("0000");
	
	/**
	 * create a new message number
	 * @param component the component
	 * @param subSys the subsystem
	 * @param number the number
	 */
	public MessageNumber(String component,String subSys,int number)
	{
		this.number = number;
		this.component = component;
		this.subSys = subSys;
		this.resourceBundleKey = component + "." + subSys + "." + MESSAGE_NUMBER_FORMAT.format(number);
		this.qualifiedNumber = component + subSys + MESSAGE_NUMBER_FORMAT.format(number);
	}

	/**
	 * get the component
	 * @return the component
	 */
	public String getComponent() {
		return component;
	}

	/**
	 * return the subsystem
	 * @return return the subsystem
	 */
	public String getSubSys() {
		return subSys;
	}
	
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return the Component, subsystem and message number as String, separated by a single dot (.) for prefixing a resourceBundle-Entry
	 */
	public String getResourceBundleKey() {
		return this.resourceBundleKey;
	}

	/**
	 * @return the Component, subsystem and message number as String
	 */
	public String getQualifiedNumber() {
		return qualifiedNumber;
	}
	
	
}