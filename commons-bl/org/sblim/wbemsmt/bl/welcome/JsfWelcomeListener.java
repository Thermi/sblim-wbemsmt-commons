 /** 
  * JsfWelcomeListener.java
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
  * Description: Interface for welcome listeners in JSF Context
  * 
  */
package org.sblim.wbemsmt.bl.welcome;

import javax.faces.component.UIComponentBase;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;
/**
 * @author Bauschert
 *
 */
public interface JsfWelcomeListener extends WelcomeListener {

	/**
	 * Create a panel representing the datacontainer bound to that welcome listener
	 * @return
	 */
	public void create(String bindingPrefix, WBEMClient cimClient) throws WbemsmtException;
	
	public UIComponentBase getPanel();
	
	public DataContainer getContainer();

}
