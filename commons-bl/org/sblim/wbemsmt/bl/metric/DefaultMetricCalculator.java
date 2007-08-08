 /** 
  * DefaultMetricCalculator.java
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
  * Description: Calculator which is able to calculate all metrics
  * 
  */
package org.sblim.wbemsmt.bl.metric;

import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricValueIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class DefaultMetricCalculator extends AbstractMetricCalculator {

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.bl.metric.MetricCalculator#calculate(org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricValueIf, org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle)
	 */
	public String doCalculate(CIM_BaseMetricDefinitionIf definition, CIM_BaseMetricValueIf value,
			WbemSmtResourceBundle bundle) {
		return value.get_MetricValue() + definition.get_Units();
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.bl.metric.MetricCalculator#getUnit()
	 */
	public String getUnit() {
		return "*";
	}

}
