 /** 
  * loginUrl.java
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
  * Description: UserObject for LoginExceptions
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class LoginUserObject extends WbemsmtExceptionUserObject {
    
    private String loginUrl;
    
    public LoginUserObject(String loginUrl) {
        super();
        this.loginUrl = loginUrl;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }
    
    
}
