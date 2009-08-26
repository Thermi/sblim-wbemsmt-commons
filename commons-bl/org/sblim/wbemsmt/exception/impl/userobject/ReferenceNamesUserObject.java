 /** 
  * ReferenceNamesObject.java
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
  * Description: UserObject for a ReferenceNamesExceptions
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class ReferenceNamesUserObject extends WbemsmtExceptionUserObject {
 
    private final CIMObjectPath objectName;
    private final String resultClass;
    private final String role;

    public ReferenceNamesUserObject(CIMObjectPath pObjectName, java.lang.String pResultClass, java.lang.String pRole)
    {
        objectName = pObjectName;
        resultClass = pResultClass;
        role = pRole;
    }

    public CIMObjectPath getObjectName() {
        return objectName;
    }

    public String getResultClass() {
        return resultClass;
    }

    public String getRole() {
        return role;
    }
    
    
    
}
