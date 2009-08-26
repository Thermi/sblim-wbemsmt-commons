 /** 
  * EnumerateInstancesUserObject.java
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
  * Description: UserObject for EnumerateInstancesException
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class EnumerateInstancesUserObject extends WbemsmtExceptionUserObject {

    private final CIMObjectPath path;
    private final boolean deep;
    private final boolean propagated;
    private final boolean includeClassOrigin;
    private final String[] propertyList;

    public EnumerateInstancesUserObject(CIMObjectPath pPath, boolean pDeep, boolean pPropagated, boolean pIncludeClassOrigin, java.lang.String[] pPropertyList) {
        path = pPath;
        deep = pDeep;
        propagated = pPropagated;
        includeClassOrigin = pIncludeClassOrigin;
        propertyList = pPropertyList;
    }

    public CIMObjectPath getPath() {
        return path;
    }

    public boolean isDeep() {
        return deep;
    }

    public boolean isPropagated() {
        return propagated;
    }

    public boolean isIncludeClassOrigin() {
        return includeClassOrigin;
    }

    public String[] getPropertyList() {
        return propertyList;
    }
    
    
    
}
