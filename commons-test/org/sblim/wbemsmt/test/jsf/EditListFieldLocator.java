 /** 
  * EditListFieldLocator.java
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
  * Description: Locator Object for EditFields in Lists
  * 
  */


package org.sblim.wbemsmt.test.jsf;

import java.text.MessageFormat;

public class EditListFieldLocator implements FieldLocator {

	private static final  String TEMPLATE = "mainForm:objectActionController_editBeans__{0}___containers_{1}__{2}_{3}___{4}_item";
	private String info;
	
	public EditListFieldLocator(String tabName, int containerIdx, String relationName, int positionInList, String fieldName)
	{
		this.info = MessageFormat.format(TEMPLATE, new Object[]{tabName,""+containerIdx,relationName,""+positionInList, fieldName});
	}
	
	public String getInfo() {
		return info;
	}

}
