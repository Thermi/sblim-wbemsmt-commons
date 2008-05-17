 /** 
  * ReferencesUserObject.java
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
  * Description: UserObject for a ReferencesExceptions
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class ReferencesUserObject extends WbemsmtExceptionUserObject {
    
    private final CIMObjectPath objectName;
    private final String resultClass;
    private final String role;
    private final boolean includeQualifiers;
    private final boolean includeClassOrigin;
    private final String[] propertyList;

    public ReferencesUserObject(CIMObjectPath pObjectName, java.lang.String pResultClass,
            java.lang.String pRole, boolean pIncludeQualifiers, boolean pIncludeClassOrigin,
            java.lang.String[] pPropertyList) {
                objectName = pObjectName;
                resultClass = pResultClass;
                role = pRole;
                includeQualifiers = pIncludeQualifiers;
                includeClassOrigin = pIncludeClassOrigin;
                propertyList = pPropertyList;
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

    public boolean isIncludeQualifiers() {
        return includeQualifiers;
    }

    public boolean isIncludeClassOrigin() {
        return includeClassOrigin;
    }

    public String[] getPropertyList() {
        return propertyList;
    }
    
    
    
}
