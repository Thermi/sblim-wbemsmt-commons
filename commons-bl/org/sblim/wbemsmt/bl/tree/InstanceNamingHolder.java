 /** 
  * InstanceNamingHolder.java
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
  * Description: Interface for holding InstanceNaming instances
  * 
  */
package org.sblim.wbemsmt.bl.tree;

import org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNaming;
import org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNamingFactory;

/**
 * Interface for holding InstanceNaming instances
 *
 */
public interface InstanceNamingHolder {

	/**
	 * returns the Instance responsible for naming a cimInstance
	 * @return the Instance responsible for naming a cimInstance
	 * 
	 * @see org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNamingFactory
	 */
	public CIMInstanceNaming getCimInstanceNaming();

	
	/**
	 * set the Instance responsible for naming a cimInstance
	 * @param cimInstanceNaming the instance
	 * @see CIMInstanceNamingFactory
	 *
	 */
	public void setCimInstanceNaming(CIMInstanceNaming cimInstanceNaming);	
}
