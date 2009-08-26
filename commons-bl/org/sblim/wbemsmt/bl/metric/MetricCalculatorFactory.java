 /** 
  * MetricCalculatorFactory.java
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
  */
package org.sblim.wbemsmt.bl.metric;

import java.util.HashMap;
import java.util.Map;

import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;

/**
 * Description: Factory class for Metric calculators<br>
 * Pattern: Singleton
 */
public final class MetricCalculatorFactory {

	
	private static MetricCalculatorFactory instance = null;
	/**
	 * key: calculator.getUnit()<br>
	 * value: calculator<br>
	 * @see MetricCalculator
	 */
	private Map<String, MetricCalculator> calculatorByUnit = new HashMap<String, MetricCalculator>();
	
	/**
	 * the default calculator
	 */
	private DefaultMetricCalculator defaultCalculator; 
	
	/**
	 * private constructor<br>
	 * use getInstance() to retrieve a valid instance
	 */
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

	/**
	 * add a metric calculator
	 * @param calculator the calculator to add to calculatorByUnit by using calculator.getUnit()
	 */
	private void addMetricCalculator(MetricCalculator calculator) {
		calculatorByUnit.put(calculator.getUnit(), calculator);
	}
	
	/**
	 * @return the calculator instance
	 */
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
	 * @param definitionIf the metric definition
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
