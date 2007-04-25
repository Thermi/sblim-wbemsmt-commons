 /** 
  * CIMInstanceNamingFactory.java
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
  * Description: Class for creating userdefined namings
  * 
  */
package org.sblim.wbemsmt.tasklauncher.naming;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbemsmt.tasklauncher.customtreeconfig.InstanceNamingClassDocument.InstanceNamingClass;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ParamDocument.Param;

public class CIMInstanceNamingFactory {

	private static final CIMInstanceNaming DUMMY = new DummyCIMInstanceNaming();
	private static Logger logger = Logger.getLogger(CIMInstanceNamingFactory.class.getName());

	public static CIMInstanceNaming create(InstanceNamingClass instanceNaming) {
		
		if (instanceNaming == null)
		{
			return DUMMY;
		}
		
		try {
			CIMInstanceNaming namingInstance = (CIMInstanceNaming) Class.forName(instanceNaming.getClassname()).newInstance();
			Param[] paramArray = instanceNaming.getParamArray();
			for (int i = 0; i < paramArray.length; i++) {
				Param param = paramArray[i];
				namingInstance.addParameter(param.getParamName(),param.getParamValue());
			}
			return namingInstance;
		} catch (Exception e) {
			logger.log(Level.SEVERE,"Cannot create Filter for class " + instanceNaming.getClassname(),e);
			return DUMMY;
		}
	}


}
