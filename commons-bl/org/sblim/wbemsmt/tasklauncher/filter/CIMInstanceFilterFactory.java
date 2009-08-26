 /** 
  * FilterFactory.java
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
  * Description: Class for creating filters
  * 
  */
package org.sblim.wbemsmt.tasklauncher.filter;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbemsmt.tasklauncher.customtreeconfig.FilterDocument.Filter;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ParamDocument.Param;

public class CIMInstanceFilterFactory {

	private static final CIMInstanceFilter DUMMY = new DummyCIMInstanceFilter();
	private static Logger logger = Logger.getLogger(CIMInstanceFilterFactory.class.getName());

	public static CIMInstanceFilter create(Filter filter) {
		
		if (filter == null)
		{
			return DUMMY;
		}
		
		try {
			CIMInstanceFilter filterInstance = (CIMInstanceFilter) Class.forName(filter.getClassname()).newInstance();
			Param[] paramArray = filter.getParamArray();
			for (int i = 0; i < paramArray.length; i++) {
				Param param = paramArray[i];
				filterInstance.addParameter(param.getParamName(),param.getParamValue());
			}
			return filterInstance;
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot create Filter for class " + filter.getClassname(),e);
			return DUMMY;
		}
	}


}
