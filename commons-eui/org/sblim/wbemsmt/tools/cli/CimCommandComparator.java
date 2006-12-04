 /** 
  * CimCommandComparator.java
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
  * Description: Compare the names of the cim commands
  * 
  */
package org.sblim.wbemsmt.tools.cli;

import java.util.Comparator;

public class CimCommandComparator extends Object implements Comparator {

	/**
	 * 
	 */
	public CimCommandComparator() {
		super();
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Object o1, Object o2) {
		CimCommand c1 = (CimCommand) o1;
		CimCommand c2 = (CimCommand) o2;
		
		return c1.getCommandName().compareTo(c2.getCommandName());
	}

}
