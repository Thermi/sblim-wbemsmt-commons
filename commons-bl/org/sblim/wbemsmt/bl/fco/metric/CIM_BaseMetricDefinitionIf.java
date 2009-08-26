 /** 
  * CIM_BaseMetricDefinitionIf.java
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
  * Description: Interface for CIM_BaseMetricDefinitions
  * 
  */
package org.sblim.wbemsmt.bl.fco.metric;


/**
 * Interface for CIM_BaseMetricDefinitions
 */
public interface CIM_BaseMetricDefinitionIf {

	/**
	 * get the units of the metric
	 * @return the units
	 */
	String get_Units();

}
