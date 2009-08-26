 /** 
  * DifferenceAfterCreateUserObject.java
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
  * Description: UserObject for DifferenceAfterCreateUserObjectExceptions
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import java.util.List;

import javax.cim.CIMInstance;
import javax.cim.CIMProperty;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class DifferenceAfterCreateUserObject extends WbemsmtExceptionUserObject {
    
    private List<CIMProperty[]> listWithDifferences;
    private final CIMInstance instance;
    
    public DifferenceAfterCreateUserObject(CIMInstance instance, List<CIMProperty[]> listWithDifferences) {
        super();
        this.instance = instance;
        this.listWithDifferences = listWithDifferences;
    }

    public List<CIMProperty[]> getListWithDifferences() {
        return listWithDifferences;
    }

    public CIMInstance getInstance() {
        return instance;
    }
    
    

    
    
}
