 /** 
  * WbemsmtSessionBean.java
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
  * Description: Managed bean for accesing the Wbemsmt Session
  * 
  */
package org.sblim.wbemsmt.session.jsf;

import org.sblim.wbemsmt.bl.cleanup.Cleanup;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.session.WebSession;

/**
 * @author Bauschert
 *
 */
public class WbemsmtSessionBean extends WbemsmtSession implements Cleanup {

	WebSession webSession = null;
	
	public WbemsmtSessionBean()
	{
		webSession = WebSessionManger.getCurrentWebSession();
	}
	
	public void cleanup() {
		clear();
	}

}
