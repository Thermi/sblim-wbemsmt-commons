 /** 
  * WelcomeDataComparator.java
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
  * Description: Compare the WelcomeData objects by using the name of their related treeConfiguation
  * 
  */
package org.sblim.wbemsmt.bl.welcome;

import java.util.Comparator;

public class WelcomeDataComparator implements Comparator<WelcomeData> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(WelcomeData arg0, WelcomeData arg1) {
		
		WelcomeData wc0 = (WelcomeData) arg0;
		WelcomeData wc1 = (WelcomeData) arg1;
		
		return wc0.treeConfigData.getName().compareTo(wc1.getTreeConfigData().getName());
	}

}
