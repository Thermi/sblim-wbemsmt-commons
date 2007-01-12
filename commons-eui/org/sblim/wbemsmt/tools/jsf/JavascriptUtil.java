 /** 
  * JavascriptUtil.java
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
  * Description: Util Class for Javascript
  * 
  */
package org.sblim.wbemsmt.tools.jsf;

public class JavascriptUtil
{

	public static String getShowWaitCall(String text) {
		return getShowWaitCall(text, true);
	}

	public static String getShowWaitCall(String text, boolean textIsLiteral) {
		
		if (textIsLiteral)
		{
			return "waitMessage = '" + text + "';"
		    + "showWait();";
		}
		else
		{
			return "waitMessage = " + text + ";"
		    + "showWait();";
		}
		
	}

	
}
