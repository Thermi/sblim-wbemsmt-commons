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

public class WizardFieldRadioButtonLocator implements FieldLocator {

	private final static String TEMPLATE = "document.mainForm.elements[''mainForm:objectActionController_currentWizard_currentPanel__{0}_item''][{1}]";
	private String info;
	
	public WizardFieldRadioButtonLocator(String fieldName, String radioIdx)
	{
		this.info = MessageFormat.format(TEMPLATE, new Object[]{fieldName,""+(Integer.parseInt(radioIdx))});
	}
	
	public String getInfo() {
		return info;
	}

}
