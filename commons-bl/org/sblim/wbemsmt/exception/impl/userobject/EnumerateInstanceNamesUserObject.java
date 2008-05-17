 /** 
  * EnumerateInstanceNamesUserObject.java
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
  * Description: UserObject for EnumerateInstanceNamesException
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class EnumerateInstanceNamesUserObject extends WbemsmtExceptionUserObject {

    private final CIMObjectPath path;

    public EnumerateInstanceNamesUserObject(CIMObjectPath path)
    {
        this.path = path;
    }

    public CIMObjectPath getPath() {
        return path;
    }

    
}
