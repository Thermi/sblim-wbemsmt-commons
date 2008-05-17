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

public class RuntimeNotSupportedUserObject extends WbemsmtExceptionUserObject {
    
    private String runtimeMode;
    
    public RuntimeNotSupportedUserObject(String loginUrl) {
        super();
        this.runtimeMode = loginUrl;
    }

    public String getRuntimeMode() {
        return runtimeMode;
    }

    public void setRuntimeMode(String loginUrl) {
        this.runtimeMode = loginUrl;
    }
    
    
}
