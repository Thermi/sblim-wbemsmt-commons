 /** 
  * WelcomeDataComparator.java
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
  * Description: Compare the WelcomeData objects by using the name of their related treeConfiguation
  * 
  */
package org.sblim.wbemsmt.bl.welcome;

import java.util.Comparator;

public class WelcomeDataComparator implements Comparator {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Object arg0, Object arg1) {
		
		WelcomeData wc0 = (WelcomeData) arg0;
		WelcomeData wc1 = (WelcomeData) arg1;
		
		return wc0.treeConfigData.getName().compareTo(wc1.getTreeConfigData().getName());
	}

}
