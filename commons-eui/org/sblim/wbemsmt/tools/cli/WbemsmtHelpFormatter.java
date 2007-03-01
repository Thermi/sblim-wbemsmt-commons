package org.sblim.wbemsmt.tools.cli;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

 /** 
 * WbemsmtOptions.java
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
 * Description: HelpFormatter - Changed the rendering so that all options are rendered for the options list
 *              The implementation of that commons projects calls a method (Options.helpOptions) which is having a bug
 *              This method uses a map where all options stored by theit short option as key. And if there is more than one option with
 *              no short option ( internally handled with ' ' as key ) only one option is returned.
 * 
 */

/**
 * @author Bauschert
 *
 */
public class WbemsmtHelpFormatter extends HelpFormatter {
	
	   protected StringBuffer renderOptions( StringBuffer sb,
               int width,
               Options options,
               int leftPad,
               int descPad )
{
		final String lpad = createPadding(leftPad);
		final String dpad = createPadding(descPad);

		// first create list containing only <lpad>-a,--aaa where -a is opt and
		// --aaa is
		// long opt; in parallel look for the longest opt string
		// this list will be then used to sort options ascending
		int max = 0;
		StringBuffer optBuf;
		List prefixList = new ArrayList();
		Option option;
		
		//List optList = options.helpOptions();
		
		//Using getOptions() instead of helpOptions() - getOptions() method returns all Options
		Collection optCollection = options.getOptions();
		List optList = Arrays.asList(optCollection.toArray());
		Collections.sort(optList, new StringBufferComparator());
		for (Iterator i = optList.iterator(); i.hasNext();) {
			option = (Option) i.next();
			optBuf = new StringBuffer(8);

			if (option.getOpt().equals(" ")) {
				optBuf.append(lpad).append("   " + defaultLongOptPrefix)
						.append(option.getLongOpt());
			} else {
				optBuf.append(lpad).append(defaultOptPrefix).append(
						option.getOpt());
				if (option.hasLongOpt()) {
					optBuf.append(',').append(defaultLongOptPrefix).append(
							option.getLongOpt());
				}

			}

			if (option.hasArg()) {
				if (option.hasArgName()) {
					optBuf.append(" <").append(option.getArgName()).append('>');
				} else {
					optBuf.append(' ');
				}
			}

			prefixList.add(optBuf);
			max = optBuf.length() > max ? optBuf.length() : max;
		}
		int x = 0;
		for (Iterator i = optList.iterator(); i.hasNext();) {
			option = (Option) i.next();
			optBuf = new StringBuffer(prefixList.get(x++).toString());

			if (optBuf.length() < max) {
				optBuf.append(createPadding(max - optBuf.length()));
			}
			optBuf.append(dpad);

			int nextLineTabStop = max + descPad;
			renderWrappedText(sb, width, nextLineTabStop, optBuf.append(
					option.getDescription()).toString());
			if (i.hasNext()) {
				sb.append(defaultNewLine);
			}
		}

		return sb;
	}
	
	   // ----------------------------------------------------------- Inner classes

	    private static class StringBufferComparator
	    implements Comparator
	    {
	        public int compare( Object o1, Object o2 )
	        {
	            String str1 = stripPrefix(o1.toString());
	            String str2 = stripPrefix(o2.toString());
	            return (str1.compareTo(str2));
	        }

	        private String stripPrefix(String strOption)
	        {
	            // Strip any leading '-' characters
	            int iStartIndex = strOption.lastIndexOf('-');
	            if (iStartIndex == -1)
	            {
	              iStartIndex = 0;
	            }
	            return strOption.substring(iStartIndex);

	        }
	    }
	
	   
}
