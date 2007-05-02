 /** 
  * CIM_ObjectCreator.java
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
  * Description: Creator for a CIM Object
  * 
  */
package org.sblim.wbemsmt.schema.cim_2_14.tools;

import org.sblim.wbemsmt.bl.fco.CIM_ObjectCreatorIf;
import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.schema.cim29.tools.CIM_Object;

/**
 * @author Bauschert
 *
 */
public class CIM_ObjectCreator implements CIM_ObjectCreatorIf {

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.bl.fco.CIM_ObjectCreatorIf#create(java.lang.Object)
	 */
	public CIM_ObjectIf create(Object object) throws WbemSmtException {
		return CIM_Object.create(object);
	}

	public CIM_ObjectIf createUnhecked(Object object) {
		return CIM_Object.createUnchecked(object);
	}
	
}
