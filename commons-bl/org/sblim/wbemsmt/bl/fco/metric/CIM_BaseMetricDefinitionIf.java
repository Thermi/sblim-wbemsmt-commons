 /** 
  * CIM_BaseMetricDefinitionIf.java
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
  * Description: Interface for CIM_BaseMetricDefinitions
  * 
  */
package org.sblim.wbemsmt.bl.fco.metric;


public interface CIM_BaseMetricDefinitionIf {

	/**
	 * get the units of the metric
	 * @return
	 */
	String get_Units();

}
