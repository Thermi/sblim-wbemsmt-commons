 /** 
  * NotAvailableMetricCalculator.java
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
  * Description: calculator for metrics which have the unit "N/A"
  * 
  */
package org.sblim.wbemsmt.bl.metric;

import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricValueIf;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

/**
 * calculator for metrics which have the unit "N/A"
 */
public class NotAvailableMetricCalculator extends AbstractMetricCalculator {

    /**
     * Get the unit the calculator is responsible for
     * @return "N/A"
     */ 
    
	public String getUnit() {
		return "N/A";
	}

    /**
     * execute the calculation
     * @param definition the definition of the metric
     * @param value the value
     * @param bundle the bundle for translating labels. For a list of labels see the doCalculate of the subclasses 
     * @return the metrics value *without* a unit
     * @throws WbemsmtException if the metric calculation failed
     */
	public String doCalculate(CIM_BaseMetricDefinitionIf definition, CIM_BaseMetricValueIf value, WbemSmtResourceBundle bundle) throws WbemsmtException {
		
        String result = value.get_MetricValue();
        return result;
	}
}
