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

public interface ICIMInstanceNode extends ITaskLauncherTreeNode, InstanceNamingHolder {

	public abstract CIMInstance getCimInstance();

	public AbstractWbemsmtFco getCimObject();

	public void setCimObject(AbstractWbemsmtFco cimObject);
	
}