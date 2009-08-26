 /** 
  * JavascriptUtil.java
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
  * Description: Util Class for Javascript
  * 
  */
package org.sblim.wbemsmt.tools.jsf;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;


public class JavascriptUtil
{

	public static String getShowWaitCall(String text) {
		return getShowWaitCall(text, true);
	}

	public static String getShowWaitCall(String text, boolean textIsLiteral) {
		
		
		if (text == null)
		{
			text = "Please wait";
		}
		
		if (textIsLiteral)
		{
			if (text.indexOf("'") > -1 && text.indexOf("\\'") == -1)
			{
				text = text.replaceAll("'", "\\'");
			}
			
			return "waitMessage = '" + text + "';"
		    + "showWait();";
		}
		else
		{
			return "waitMessage = " + text + ";"
		    + "showWait();";
		}
		
	}

	public static String getInputFieldValueChangedCall() {
		WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance());
		return "inputFieldChanged('" + bundle.getString("loose.changes") + "');";
	}

	public static String getCheckModificationsCall() {
		return "if (!checkModifications()) return false;";
	}

	
}
