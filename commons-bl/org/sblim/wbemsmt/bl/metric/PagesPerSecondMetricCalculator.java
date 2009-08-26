 /** 
  * PagesPerSecondMetricCalculator.java
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
  * Description: calculator for PagesPerSecond metric
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
 * calculator for PagesPerSecond metric
 */
public class PagesPerSecondMetricCalculator extends AbstractMetricCalculator {

	private DecimalFormat format = new DecimalFormat("###,###,###,###,##0");
	
    /**
     * Get the unit the calculator is responsible for
     * @return "Pages per second"
     */ 
	public String getUnit() {
		return "Pages per second";
	}

    /**
     * execute the calculation
     * @param definition the definition of the metric
     * @param value the page per second
     * @param bundle the bundle for translating labels. For a list of labels see the doCalculate of the subclasses 
     * @return the pages per second with unit pages/sec
     * @throws WbemsmtException if the metric calculation failed
     */
	
	public String doCalculate(CIM_BaseMetricDefinitionIf definition,CIM_BaseMetricValueIf value, WbemSmtResourceBundle bundle) throws WbemsmtException {

		format.setDecimalFormatSymbols(new DecimalFormatSymbols(bundle.getLocale()));
		long l = Long.parseLong(value.get_MetricValue());
		String result = format.format(l) + " pages/sec";
		return result;
		
	}
}
