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

import javax.wbem.WBEMException;

import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricValueIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public abstract class AbstractMetricCalculator implements MetricCalculator {

	static Logger logger = Logger.getLogger(AbstractMetricCalculator.class.getName());
	
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
	 * @param value
	 * @param bundle
	 * @return
	 */
	protected abstract String doCalculate(CIM_BaseMetricDefinitionIf definition, CIM_BaseMetricValueIf value, WbemSmtResourceBundle bundle) throws WBEMException;
}
