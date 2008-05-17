 /** 
  * GetClassUserObject.java
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
  * Description: UserObject for a GetClassException
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class GetClassUserObject extends WbemsmtExceptionUserObject {

    private CIMObjectPath objectPath;
    private boolean propagated;
    private boolean includeQualifiers;
    private boolean includeClassOrigin;
    private String[] propertyList;

    public GetClassUserObject(CIMObjectPath objectPath) {
        this.objectPath = objectPath;
    }

    public GetClassUserObject(CIMObjectPath pName, boolean pPropagated, boolean pIncludeQualifiers, boolean pIncludeClassOrigin, java.lang.String[] pPropertyList) {
        objectPath = pName;
        propagated = pPropagated;
        includeQualifiers = pIncludeQualifiers;
        includeClassOrigin = pIncludeClassOrigin;
        propertyList = pPropertyList;
    }

    public CIMObjectPath getObjectPath() {
        return objectPath;
    }

    public boolean isPropagated() {
        return propagated;
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
