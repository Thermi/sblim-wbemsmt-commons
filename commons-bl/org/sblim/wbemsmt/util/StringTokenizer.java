 /** 
  * StringTokenizer.java
  *
  * (C) Copyright IBM Corp. 2005
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
  * Description: Convenience-StringTokenizer (extending the functionality of java.util.StringTokenizer
  * 
  */
package org.sblim.wbemsmt.util;

import java.util.ArrayList;
import java.util.List;

public class StringTokenizer extends java.util.StringTokenizer {

	/**
	 * @param str
	 */
	public StringTokenizer(String str) {
		super(str);
		
	}

	/**
	 * @param str
	 * @param delim
	 */
	public StringTokenizer(String str, String delim) {
		super(str, delim);
		
	}

	/**
	 * @param str
	 * @param delim
	 * @param returnDelims
	 */
	public StringTokenizer(String str, String delim, boolean returnDelims) {
		super(str, delim, returnDelims);
		
	}

	public String[] asArray(boolean trimTokens,boolean includeEmptyTokens)
	{
		List values = new ArrayList();
		while (hasMoreTokens())
		{
			String nextToken = nextToken();
			if (trimTokens)
			{
				nextToken = nextToken.trim();
			}
			if (includeEmptyTokens || !includeEmptyTokens && nextToken.length() > 0)
			{
				values.add(nextToken);
			}
		}
		return (String[]) values.toArray(new String[values.size()]);
		
	}
}
