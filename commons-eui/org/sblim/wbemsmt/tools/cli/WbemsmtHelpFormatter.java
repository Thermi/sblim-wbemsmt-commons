package org.sblim.wbemsmt.tools.cli;
import java.util.*;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

 /** 
 * WbemsmtOptions.java
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
		List<StringBuffer> prefixList = new ArrayList<StringBuffer>();
		Option option;
		
		//List optList = options.helpOptions();
		
		//Using getOptions() instead of helpOptions() - getOptions() method returns all Options
		Collection<Option> optCollection = (Collection<Option>) options.getOptions();
		List<Option> optList = Arrays.asList(optCollection.toArray(new Option[0]));
		Collections.sort(optList, new StringBufferComparator());
		
		for (Iterator<Option> i = optList.iterator(); i.hasNext();) {
			option = i.next();
			optBuf = new StringBuffer(8);

			if (option.getOpt().equals(" ")) {
				optBuf.append(lpad).append("   " + getLongOptPrefix())
						.append(option.getLongOpt());
			} else {
				optBuf.append(lpad).append(getOptPrefix()).append(
						option.getOpt());
				if (option.hasLongOpt()) {
					optBuf.append(',').append(getLongOptPrefix()).append(
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
		for (Iterator<Option> i = optList.iterator(); i.hasNext();) {
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
				sb.append(getNewLine());
			}
		}

		return sb;
	}
	
	   // ----------------------------------------------------------- Inner classes

	    private static class StringBufferComparator
	    implements Comparator<Option>
	    {
	        public int compare( Option o1, Option o2 )
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
