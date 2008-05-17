 /** 
  * AssociatorUserObject.java
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
  * Description: UserObject for AssociatorExceptions
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class AssociatorUserObject extends WbemsmtExceptionUserObject {

    private final CIMObjectPath objectName;
    private final String associationClass;
    private final String resultClass;
    private final String role;
    private final String role2;
    private final String resultRole;
    private final boolean includeQualifiers;
    private final boolean includeClassOrigin;
    private final String[] propertyList;

    public AssociatorUserObject(CIMObjectPath pObjectName,
            java.lang.String pAssociationClass,
            java.lang.String pResultClass,
            java.lang.String pRole,
            java.lang.String pResultRole,
            boolean pIncludeQualifiers,
            boolean pIncludeClassOrigin,
            java.lang.String[] pPropertyList) {
                objectName = pObjectName;
                associationClass = pAssociationClass;
                resultClass = pResultClass;
                role2 = pRole;
                role = pRole;
                resultRole = pResultRole;
                includeQualifiers = pIncludeQualifiers;
                includeClassOrigin = pIncludeClassOrigin;
                propertyList = pPropertyList;
    }

    public CIMObjectPath getObjectName() {
        return objectName;
    }

    public String getAssociationClass() {
        return associationClass;
    }

    public String getResultClass() {
        return resultClass;
    }

    public String getRole() {
        return role;
    }

    public String getRole2() {
        return role2;
    }

    public String getResultRole() {
        return resultRole;
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
