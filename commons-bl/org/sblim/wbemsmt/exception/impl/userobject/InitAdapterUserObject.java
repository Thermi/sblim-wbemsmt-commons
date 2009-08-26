 /** 
  * InitAdapterUserObject.java
  *
  * © Copyright IBM Corp.  2009,2008
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
  * Description: UserObject for InitAdapterException
  * 
  * @see InitAdapterException
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class InitAdapterUserObject extends WbemsmtExceptionUserObject {
    private String adapterClassName;
    
    public InitAdapterUserObject(String adapterClassName) {
        super();
        this.adapterClassName = adapterClassName;
    }

    public String getAdapterClassName() {
        return adapterClassName;
    }

    public void setAdapterClassName(String loginUrl) {
        this.adapterClassName = loginUrl;
    }
    
}
