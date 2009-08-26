 /** 
  * BytesMetricCalculator.java
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
  * Description: calculator for Bytes
  * 
  */
package org.sblim.wbemsmt.bl.metric;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricValueIf;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class BytesMetricCalculator extends AbstractMetricCalculator {

	private DecimalFormat format = new DecimalFormat("###,###,###,###,##0");
	private static final int LIMIT_KB  = 1024;
	private static final int LIMIT_MB  = 1024*1024;
	private static final int LIMIT_GB  = 1024*1024*1024;
	private static final long LIMIT_TB = 1024*1024*1024*1024;

    /**
     * Get the unit the calculator is responsible for
     * @return "Bytes"
     */	
	public String getUnit() {
		return "Bytes";
	}

    /**
     * execute the calculation
     * @param definition the definition of the metric
     * @param value the bytes
     * @param bundle the bundle for translating labels. For a list of labels see the doCalculate of the subclasses 
     * @return the calculated value as TB,GB,MB,KB or bytes
     * @throws WbemsmtException if the metric calculation failed
     */
	public String doCalculate(CIM_BaseMetricDefinitionIf definition,CIM_BaseMetricValueIf value, WbemSmtResourceBundle bundle) throws WbemsmtException {
		
		format.setDecimalFormatSymbols(new DecimalFormatSymbols(bundle.getLocale()));
		
		String result;
		
		long l = Long.parseLong(value.get_MetricValue());
		
		
		int calculatedValue = 0;
		String unit = null;
		
		if (l >= LIMIT_TB)
		{
			calculatedValue = (int) (l / LIMIT_TB);
			unit = calculatedValue + " TB";
		}
		else if (l >= LIMIT_GB)
		{
			calculatedValue = (int) (l / LIMIT_GB);
			unit = calculatedValue + " GB";
		}
		else if (l >= LIMIT_MB)
		{
			calculatedValue = (int) (l / LIMIT_MB);
			unit = calculatedValue + " MB";
		}
		else if (l >= LIMIT_KB)
		{
			calculatedValue = (int) (l / LIMIT_KB);
			unit = calculatedValue + " KB";
		}
		else 
		{
			calculatedValue = (int) l;
		}

		result = format.format(l) + " Bytes";
		if (calculatedValue != l)
		{
			result = unit + " (" + result + ")"; 
		}
		
		return result;
		
	}
}
