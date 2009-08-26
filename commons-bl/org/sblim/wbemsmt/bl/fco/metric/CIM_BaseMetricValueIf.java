 /** 
  * CIM_BaseMetricValueIf.java
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
  * 
  * Description: Interface for CIM_BaseMetricValues
  * 
  */
package org.sblim.wbemsmt.bl.fco.metric;


public interface CIM_BaseMetricValueIf {

	/**
	 * get the value of the Metric
	 * @return the metric value
	 */
	String get_MetricValue();

}
