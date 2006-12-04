 /** 
  * StringComparator.java
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
  * Description: Compares Strings
  * 
  * 
  * 
  */
package org.sblim.wbemsmt.util;

import java.util.Comparator;

public class StringComparator implements Comparator {

	/**
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * @see java.lang.String#compareTo(java.lang.String)
	 */
	public int compare(Object o1, Object o2) {
		if (o1 != null && o2 != null)
		{
			return o1.toString().compareTo(o2.toString());
		}
		else
		{
			return 0;
		}
	}

}
