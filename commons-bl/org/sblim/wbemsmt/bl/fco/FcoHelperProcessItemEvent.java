 /** 
  * FcoHelperProcessItemEvent.java
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
  * Description: Event
  * 
  */
package org.sblim.wbemsmt.bl.fco;

import org.apache.commons.lang.builder.ToStringBuilder;

public class FcoHelperProcessItemEvent {

	public static int TYPE_BEFORE_UPDATE = 0;
	public static int TYPE_AFTER_UPDATE = 1;
	public static int TYPE_BEFORE_CREATE = 2;
	public static int TYPE_AFTER_CREATE = 3;
	public static int TYPE_BEFORE_DELETE = 4;
	public static int TYPE_AFTER_DELETE = 5;
	private CIM_Object object;
	final int type;
	private boolean doProcessing = true;
	
	public FcoHelperProcessItemEvent(CIM_Object object, int type) {
		this.object = object;
		this.type = type;
		
	}


	public CIM_Object getObject() {
		return object;
	}


	public int getType() {
		return type;
	}


	public boolean isDoProcessing() {
		return doProcessing;
	}


	/**
	 * if do proecessing was alread set to falseit cannot be overwritten with true
	 * @param doProcessing
	 */
	public void setDoProcessing(boolean doProcessing) {
		this.doProcessing = this.doProcessing && doProcessing;
	}
	
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this);
	}
	
	
}
