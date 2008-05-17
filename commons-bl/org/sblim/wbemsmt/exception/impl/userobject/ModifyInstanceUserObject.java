 /** 
  * ModifyInstanceUserObject.java
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
  * Description: UserObject for a ModifyInstanceException
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import javax.cim.CIMInstance;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class ModifyInstanceUserObject extends WbemsmtExceptionUserObject {
  
    private final CIMInstance instance;
    private final String[] propertyList;

    public ModifyInstanceUserObject(CIMInstance instance, java.lang.String[] propertyList)
    {
        this.instance = instance;
        this.propertyList = propertyList;
    }

    public CIMInstance getInstance() {
        return instance;
    }

    public String[] getPropertyList() {
        return propertyList;
    }
    
    
    
}
