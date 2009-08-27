 /** 
  * CreateInstanceUserObject.java
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
  * Description: UserObject for a CreateInstanceException
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import javax.cim.CIMInstance;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class CreateInstanceUserObject extends WbemsmtExceptionUserObject {
    
    private final CIMInstance instance;

    public CreateInstanceUserObject(CIMInstance instance)
    {
        this.instance = instance;
    }

    public CIMInstance getInstance() {
        return instance;
    }
    
    
    
}
