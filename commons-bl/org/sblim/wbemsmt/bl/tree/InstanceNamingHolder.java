 /** 
  * InstanceNamingHolder.java
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
  * Description: Interface for holding InstanceNaming instances
  * 
  */
package org.sblim.wbemsmt.bl.tree;

import org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNaming;

/**
 * @author Bauschert
 *
 */
public interface InstanceNamingHolder {

	/**
	 * returns the Instance responsible for naming a cimInstance
	 * @return
	 * 
	 * @see org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNamingFactory
	 */
	public CIMInstanceNaming getCimInstanceNaming();

	
	/**
	 * set the Instance responsible for naming a cimInstance
	 * @param cimInstanceNaming
	 * @see CIMInstanceNamingFactory
	 *
	 */
	public void setCimInstanceNaming(CIMInstanceNaming cimInstanceNaming);	
}
