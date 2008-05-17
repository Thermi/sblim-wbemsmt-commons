 /** 
  * DifferenceAfterModifyUserObject.java
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
  * Description: UserObject for DDifferenceAfterModifyUserObjectExceptions
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import java.util.List;

import javax.cim.CIMInstance;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class DifferenceAfterModifyUserObject extends WbemsmtExceptionUserObject {
    
    private List listWithDifferences;
    private final CIMInstance instance;
    
    public DifferenceAfterModifyUserObject(CIMInstance instance, List listWithDifferences) {
        super();
        this.instance = instance;
        this.listWithDifferences = listWithDifferences;
    }

    public List getListWithDifferences() {
        return listWithDifferences;
    }

    public CIMInstance getInstance() {
        return instance;
    }
    
    
    
}
