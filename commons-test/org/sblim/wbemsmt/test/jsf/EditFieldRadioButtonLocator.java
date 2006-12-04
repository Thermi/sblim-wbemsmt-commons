 /** 
  * EditFieldLocator.java
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
  * Description: Locator Object for EditFields
  * 
  */
package org.sblim.wbemsmt.test.jsf;

import java.text.MessageFormat;

public class EditFieldRadioButtonLocator implements FieldLocator {

	private final static String TEMPLATE = "document.mainForm.elements[''mainForm:objectActionController_editBeans__{0}___containers_{1}___{2}_item''][{3}]";
	private String info;
	
	public EditFieldRadioButtonLocator(String tabName, int containerIdx, String fieldName, String radioIdx)
	{
		this.info = MessageFormat.format(TEMPLATE, new Object[]{tabName,""+containerIdx,fieldName,""+(Integer.parseInt(radioIdx))});
	}
	
	public String getInfo() {
		return info;
	}

}
