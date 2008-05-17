 /** 
  * PagesPerSecondMetricCalculator.java
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
  * Description: calculator for PagesPerSecond metric
  * 
  */
package org.sblim.wbemsmt.bl.metric;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import javax.wbem.WBEMException;

import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricValueIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class PagesPerSecondMetricCalculator extends AbstractMetricCalculator {

	private DecimalFormat format = new DecimalFormat("###,###,###,###,##0");
	
	public String getUnit() {
		return "Pages per second";
	}

	public String doCalculate(CIM_BaseMetricDefinitionIf definition,CIM_BaseMetricValueIf value, WbemSmtResourceBundle bundle) throws WBEMException {

		format.setDecimalFormatSymbols(new DecimalFormatSymbols(bundle.getLocale()));
		long l = Long.parseLong(value.get_MetricValue());
		String result = format.format(l) + " pages/sec";
		return result;
		
	}
}
