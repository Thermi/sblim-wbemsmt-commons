 /** 
  * WbemsmtInitialObjectLoaderFactory.java
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
  * Description: Class for creating initial object loaders
  * 
  */
package org.sblim.wbemsmt.tasklauncher.initialobjectloading;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbemsmt.tasklauncher.customtreeconfig.InitialObjectLoaderClassDocument.InitialObjectLoaderClass;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ParamDocument.Param;

public class WbemsmtInitialObjectLoaderFactory {

	private static Logger logger = Logger.getLogger(WbemsmtInitialObjectLoaderFactory.class.getName());

	/**
	 * create an initial object loader
	 * @param initialObjectLoaderClass
	 * @return null if the given initialObjectLoaderClass was null or if there was a expception while creating the class
	 */
	public static WbemsmtInitialObjectLoader create(InitialObjectLoaderClass initialObjectLoaderClass) {
		
		if (initialObjectLoaderClass == null)
		{
			return null;
		}
		
		try {
			WbemsmtInitialObjectLoader loader = (WbemsmtInitialObjectLoader) Class.forName(initialObjectLoaderClass.getClassname()).newInstance();
			Param[] paramArray = initialObjectLoaderClass.getParamArray();
			for (int i = 0; i < paramArray.length; i++) {
				Param param = paramArray[i];
				loader.addParameter(param.getParamName(),param.getParamValue());
			}
			return loader;
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot create WbemsmtInitialObjectLoader for class " + initialObjectLoaderClass.getClassname(),e);
			return null;
		}
	}


}
