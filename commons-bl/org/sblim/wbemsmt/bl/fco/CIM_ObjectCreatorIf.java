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
  * Description: Interface for Creator for a CIM Object
  * 
  */
package org.sblim.wbemsmt.bl.fco;

import org.sblim.wbemsmt.exception.WbemSmtException;

/**
 * @author Bauschert
 *
 */
public interface CIM_ObjectCreatorIf {

	CIM_ObjectIf create(Object object)  throws WbemSmtException;
	CIM_ObjectIf createUnhecked(Object object);

}
