 /** 
  * MillisecondCalculator.java
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
  * Description: Calculator for percent metrics
  * 
  */
package org.sblim.wbemsmt.bl.metric;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricValueIf;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

/**
 * Calculator for percent metrics
 */
public class PercentMetricCalculator extends AbstractMetricCalculator {

    /**
     * Get the unit the calculator is responsible for
     * @return "Percent"
     */ 
	public String getUnit() {
		return "Percent";
	}

	private DecimalFormat format = new DecimalFormat("##0.00");

    /**
     * execute the calculation
     * @param definition the definition of the metric
     * @param value the percent value
     * @param bundle the bundle for translating labels. For a list of labels see the doCalculate of the subclasses 
     * @return the calculated value percent string with suffix '%'
     * @throws WbemsmtException if the metric calculation failed
     */
	public String doCalculate(CIM_BaseMetricDefinitionIf definition, CIM_BaseMetricValueIf value, WbemSmtResourceBundle bundle) throws WbemsmtException {

		format.setDecimalFormatSymbols(new DecimalFormatSymbols(bundle.getLocale()));
		double d = Double.parseDouble(value.get_MetricValue());
        String result = format.format(d) + "%";
        return result;
	}
}
