 /** 
  * WelcomeListener.java
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
  * Description: INterface for all Welcome Listeners
  * 
  */
package org.sblim.wbemsmt.bl.welcome;

import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

/**
 * @author Bauschert
 *
 */
public interface WelcomeListener {

	/**
	 * Return a presentation layer specific welcome listener
	 * The implementor can query RuntimeUtil to find out the current presentation technology used
	 * @return
	 * @throws WbemSmtException 
	 * @see RuntimeUtil
	 */
	public WelcomeListener getListenerByPlType() throws WbemSmtException;

}
