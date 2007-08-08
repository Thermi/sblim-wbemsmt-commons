 /** 
  * MetricCalculator.java
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
  * Description: interface of all MetricCalculators
  * 
  */
package org.sblim.wbemsmt.bl.metric;

import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricValueIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public interface MetricCalculator {
	
	/**
	 * calculate the value
	 * @param value
	 * @return
	 */
	public String calculate(CIM_BaseMetricDefinitionIf definitionIf, CIM_BaseMetricValueIf value, WbemSmtResourceBundle bundle);
	
	
	/**
	 * Get the unit the calculator is responsible for
	 * @return
	 */
	public String getUnit();

}
