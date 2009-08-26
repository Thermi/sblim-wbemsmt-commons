 /** 
  * MillisecondMetricCalculator.java
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
  * Description: calculator for millisecond metric values
  * 
  */
package org.sblim.wbemsmt.bl.metric;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricDefinitionIf;
import org.sblim.wbemsmt.bl.fco.metric.CIM_BaseMetricValueIf;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

/**
 * calculator for millisecond metric values
 */
public class MillisecondMetricCalculator extends AbstractMetricCalculator {

    /**
     *  @return "Milliseconds" as unit
     */
	public String getUnit() {
		return "Milliseconds";
	}

	/**
	 * calculate the value
	 * @param definition the definition of the metric
	 * @param value the value of the metric
	 * @param bundle the bundle for translating time/date labels. For a list of labels see {@link #calculateDurationString(long, WbemSmtResourceBundle)}
	 * @return the milliseconds as string. Example: '2 days 4 hours 3 minutes 5.0 seconds' 
	 * @throws WbemsmtException if the calculation failed
	 */
	public String doCalculate(CIM_BaseMetricDefinitionIf definition, CIM_BaseMetricValueIf value, WbemSmtResourceBundle bundle) throws WbemsmtException {
		
		long l = Long.parseLong(value.get_MetricValue());
        return calculateDurationString(l, bundle);
	}

	/**
	 * calculate the string for a duration value
	 * @param l the duration
	 * @param bundle - resourcebundle for translating the labels<br>
	 * used labels:
	 * <ul>
	 * <li>duration.format - something like <b>d' days 'H' hours 'm' minutes 's.S' seconds'</b> which works for {@link DurationFormatUtils#formatDuration(long, String, boolean)}</li>
	 * <li>duration.days</li>
     * <li>duration.day</li>
     * <li>duration.hour</li>
     * <li>duration.hours</li>
     * <li>duration.minutes</li>
     * <li>duration.minute</li>
	 * </ul>
	 * @return the calculated string
	 */
	public static String calculateDurationString(long l, WbemSmtResourceBundle bundle) {
		String result = DurationFormatUtils.formatDuration(l, bundle.getString("duration.format"), true);
        String days = bundle.getString("duration.days");
        String day = bundle.getString("duration.day");
        String hour = bundle.getString("duration.hour");
        String hours = bundle.getString("duration.hours");
        String minutes = bundle.getString("duration.minutes");
        String minute = bundle.getString("duration.minute");
        
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
