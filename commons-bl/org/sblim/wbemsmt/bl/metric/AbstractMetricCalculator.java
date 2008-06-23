 /** 
  * AbstractMetricCalculator.java
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
  * Description: Abstract base class for calculating metrics
  * 
  */
package org.sblim.wbemsmt.bl.metric;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricValueIf;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public abstract class AbstractMetricCalculator implements MetricCalculator {

    /**
     * logger for all metric calculators
     */
	static Logger logger = Logger.getLogger(AbstractMetricCalculator.class.getName());
	
	/**
	 * calculate the metrics, call the abstract method {@link #doCalculate(CIM_BaseMetricDefinitionIf, CIM_BaseMetricValueIf, WbemSmtResourceBundle)}<br>
	 * if there was an exception during {@link #doCalculate(CIM_BaseMetricDefinitionIf, CIM_BaseMetricValueIf, WbemSmtResourceBundle)} <br>
	 * the translated label for 'no.metric.available' is returned as result.
     * @param definition the definition of the metric
     * @param value the value of the metric
     * @param bundle the bundle for translating labels. For a list of labels see the doCalculate of the subclasses 
	 * @return the calculated value or the translated label for 'no.metric.available'
	 */
	public synchronized String calculate(CIM_BaseMetricDefinitionIf definition, CIM_BaseMetricValueIf value, WbemSmtResourceBundle bundle) {
		try
		{
			return doCalculate(definition, value,bundle);
		}
		catch (Exception e)
		{
			logger.log(Level.SEVERE, "Cannot convert value " + value.get_MetricValue() + " with unit " + definition.get_Units(),e);
			return bundle.getString("no.metric.available");
		}
		
	}

	/**
	 * execute the calculation
     * @param definition the definition of the metric
     * @param value the value of the metric
     * @param bundle the bundle for translating labels. For a list of labels see the doCalculate of the subclasses 
     * @return the calculated value
     * @throws WbemsmtException if the metric calculation failed
	 */
	protected abstract String doCalculate(CIM_BaseMetricDefinitionIf definition, CIM_BaseMetricValueIf value, WbemSmtResourceBundle bundle) throws WbemsmtException;
}
