 /** 
  * WizardContainerUtil.java
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
  * Description: Utility-Class to manage the page navigation within a wizard
  * 
  */
package org.sblim.wbemsmt.tools.wizard;

import java.util.Map;
import java.util.logging.Logger;

public abstract class WizardContainerUtil {
	
	private Logger logger = Logger.getLogger(WizardContainerUtil.class.getName());	
	
	public abstract String getNextPanel(String currentPageName, Map hmPages);
	
	public String getNextPanelDefault(String currentPageName, String[] array)
	{
		if (currentPageName.equals(""))
		{
			return array[0];
		}
		for (int i = 0; i < array.length; i++) {
			if(currentPageName.equals(array[i]))
			{
				//if we have the last element return it again
				if (i+1 == array.length)
				{
					logger.info("Next page of " + currentPageName + " is " + currentPageName);
					return currentPageName;
				}
				else
				{
					logger.info("Next page of " + currentPageName + " is " + array[i+1]);
					return array[i+1];
				}
			}
		}
		logger.warning("Panel with name " + currentPageName + " not found.");
		return array[0];
	}
	
}
