 /** 

  * LoginCheck.java
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
  * @author Marius Kreis
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Interface for beans this AuthorizationFilter can check against.
  * 
  * 
  */
package org.sblim.wbemsmt.tasklauncher.login;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;

public interface LoginCheck
{
    public boolean isLoggedIn();
    public void reloadLoginSettings() throws WbemSmtException;
    public CIMClient getCimClient();
	public void setCimomData(CimomData data);
}
