 /** 
  * ICIMInstanceNode.java
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
  * Description: Interface of a CIMInstance Node
  * 
  */

package org.sblim.wbemsmt.bl.tree;

import javax.cim.CIMInstance;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;

/**
 * Interface of a CIMInstance Node
 */
public interface ICIMInstanceNode extends ITaskLauncherTreeNode, InstanceNamingHolder {

    /**
     * get {@link CIMInstance}
     * @return the cim instance
     */
	public abstract CIMInstance getCimInstance();

	/**
	 * return the FCO
	 * @return the fco
	 */
	public AbstractWbemsmtFco getCimObject();

	/**
	 * set the cim object (for example for later use in the adaoter class)
	 * @param cimObject the cim object
	 */
	public void setCimObject(AbstractWbemsmtFco cimObject);
	
}