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
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class DefaultMetricCalculator extends AbstractMetricCalculator {

    /**
     * execute the calculation
     * @param definition the definition of the metric
     * @param value the value
     * @param bundle the bundle for translating labels. For a list of labels see the doCalculate of the subclasses 
     * @return the value + the unit from the definition object
     * @throws WbemsmtException if the metric calculation failed
     * @see CIM_BaseMetricDefinitionIf#get_Units()
     */
	public String doCalculate(CIM_BaseMetricDefinitionIf definition, CIM_BaseMetricValueIf value,
			WbemSmtResourceBundle bundle) throws WbemsmtException {
		return value.get_MetricValue() + definition.get_Units();
	}

    /**
     * Get the unit the calculator is responsible for
     * @return "*" - all undefined
     */ 

	public String getUnit() {
		return "*";
	}

}
