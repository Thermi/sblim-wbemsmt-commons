 /** 
  * WizardStepList.java
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
  * Description: List for all Steps within a wizard
  * 
  */
package org.sblim.wbemsmt.tools.wizard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bauschert
 *
 */
public class WizardStepList extends ArrayList {

	
	/**
	 * Serial ID 
	 */
	private static final long serialVersionUID = 8087461944747821014L;
	
	Map steps = new HashMap();
	
	public void addWizardStep(WizardStep step)
	{
		steps.put(step.getPageName(), step);
		add(step);
	}
	
	public WizardStep getWizardStep(String pageName)
	{
		return (WizardStep) steps.get(pageName);
	}
}
