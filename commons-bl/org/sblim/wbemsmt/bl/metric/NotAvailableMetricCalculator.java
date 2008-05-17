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
  * Description: calculator for metrics which have no units
  * 
  */
package org.sblim.wbemsmt.bl.metric;

import javax.wbem.WBEMException;

import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricValueIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class NotAvailableMetricCalculator extends AbstractMetricCalculator {

	public String getUnit() {
		return "N/A";
	}

	public String doCalculate(CIM_BaseMetricDefinitionIf definition, CIM_BaseMetricValueIf value, WbemSmtResourceBundle bundle) throws WBEMException {
		
        String result = value.get_MetricValue();
        return result;
	}
}
