 /** 
  * ValidatorUtil.java
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
  * Description: Class to handle validation actions
  * 
  */
package org.sblim.wbemsmt.tools.validator;

import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class ValidatorUtil {

	public static void setError(LabeledBaseInputComponentIf component) {
		if (component != null)
			component.setHasErrors(true);
	}

	public static void setOK(LabeledBaseInputComponentIf component) {
		if (component != null)
			component.setHasErrors(false);
		
	}

	public static void setError(LabeledBaseInputComponentIf[] component) {
		if (component != null)
		{
			for (int i = 0; i < component.length; i++) {
				LabeledBaseInputComponentIf if1 = component[i];
				setError(if1);
			}
		}
	}

	public static void setOK(LabeledBaseInputComponentIf[] component) {
		if (component != null)
		{
			for (int i = 0; i < component.length; i++) {
				LabeledBaseInputComponentIf if1 = component[i];
				setOK(if1);
			}
		}
		
	}

}
