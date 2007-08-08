 /** 
  * MetricCalculatorFactory.java
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
  * Description: Factory class for Metric calculators
  * 
  */
package org.sblim.wbemsmt.bl.metric;

import java.util.HashMap;
import java.util.Map;

import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;

public class MetricCalculatorFactory {

	
	private static MetricCalculatorFactory instance = null;
	private Map calculatorByUnit = new HashMap();
	private DefaultMetricCalculator defaultCalculator; 
	
	private MetricCalculatorFactory()
	{
		defaultCalculator = new DefaultMetricCalculator();
		addMetricCalculator(new BytesMetricCalculator());
		addMetricCalculator(new MillisecondMetricCalculator());
		addMetricCalculator(new PercentMetricCalculator());
		addMetricCalculator(new NotAvailableMetricCalculator());
		addMetricCalculator(new PagesPerSecondMetricCalculator());
		addMetricCalculator(new SharesMetricCalculator());
	}

	private void addMetricCalculator(MetricCalculator calculator) {
		calculatorByUnit.put(calculator.getUnit(), calculator);
	}
	
	public static MetricCalculatorFactory getInstance()
	{
		if (instance == null)
		{
			instance = new MetricCalculatorFactory();
		}
		
		return instance;
	}

	/**
	 * return a Calculator for the unit of the fiven definition
	 * 
	 * @param definitionIf
	 * @return If there is no calculator for this definition's unit the default calculator is returned
	 */
	public MetricCalculator getCalculatorByUnit(CIM_BaseMetricDefinitionIf definitionIf) {
		
		MetricCalculator result = (MetricCalculator) calculatorByUnit.get(definitionIf.get_Units());
		if (result == null)
		{
			result = defaultCalculator;
		}
		return result;
	}
	
}
