 /** 
  * CimCommandComparator.java
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
  * Description: Compare the names of the cim commands
  * 
  */
package org.sblim.wbemsmt.tools.cli;

import java.util.Comparator;

public class CimCommandComparator extends Object implements Comparator<CimCommand> {

	/**
	 * 
	 */
	public CimCommandComparator() {
		super();
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(CimCommand, CimCommand)
	 */
	public int compare(CimCommand o1, CimCommand o2) {
		//CimCommand c1 = (CimCommand) o1;
		//CimCommand c2 = (CimCommand) o2;
		
		return o1.getCommandName().compareTo(o2.getCommandName());
	}

}
