 /** 
  * Lookup.java
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
  * Description: Interface for classes doing a lookup with the help of the cimClient
  * 
  */
package org.sblim.wbemsmt.lookup;

import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.WbemsmtException;

public interface Lookup {

	public boolean lookup(WBEMClient cimClient, String namespace) throws WbemsmtException; 
	
}
