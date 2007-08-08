 /** 
  * MillisecondMetricCalculator.java
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
  * Description: calculator for millisecond metric values
  * 
  */
package org.sblim.wbemsmt.bl.metric;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricValueIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class MillisecondMetricCalculator extends AbstractMetricCalculator {

	public String getUnit() {
		return "Milliseconds";
	}

	public String doCalculate(CIM_BaseMetricDefinitionIf definition, CIM_BaseMetricValueIf value, WbemSmtResourceBundle bundle) {
		
		long l = Long.parseLong(value.get_MetricValue());
        String result = DurationFormatUtils.formatDuration(l, bundle.getString("duration.format"), true);
        String days = bundle.getString("duration.days");
        String day = bundle.getString("duration.day");
        String hour = bundle.getString("duration.hour");;
        String hours = bundle.getString("duration.hours");;
        String minutes = bundle.getString("duration.minutes");;;
        String minute = bundle.getString("duration.minute");;;
        
        result = " " + result;
		String tmp = StringUtils.replaceOnce(result, " 0 " + days, "");
		tmp = StringUtils.replaceOnce(tmp, " 1 " + days, " 1 " + day);
        if (tmp.length() != result.length()) {
            result = tmp;
			tmp = StringUtils.replaceOnce(result, " 0 " + hours, "");
			tmp = StringUtils.replaceOnce(tmp, " 1 " + hours, " 1 " + hour);
            if (tmp.length() != result.length()) {
                result = tmp;
				result = StringUtils.replaceOnce(result, " 0 " + minutes, "");
				result = StringUtils.replaceOnce(result, " 1 " + minutes, " 1 " + minute);
            }
        }
        if (result.length() != 0) {
            // strip the space off again
            result = result.substring(1);
        }
        return result;
	}
}
