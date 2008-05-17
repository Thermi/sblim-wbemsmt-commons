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

import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;

public interface LoginCheck
{
    public boolean isLoggedIn();
    public void reloadLoginSettings() throws WbemsmtException;
    public WBEMClient getCimClient();
	public void setCimomData(CimomData data);
	public boolean isUseSlp();
	public void setUseSlp(boolean useSlp);
}
