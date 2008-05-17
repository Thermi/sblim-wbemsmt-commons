 /** 
  * InvokeMethodUserObject.java
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
  * Description: UserObject for a InvokeMethodException
  * 
  */
package org.sblim.wbemsmt.exception.impl.userobject;

import javax.cim.CIMArgument;
import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.exception.WbemsmtExceptionUserObject;

public class InvokeMethodUserObject extends WbemsmtExceptionUserObject {

    private CIMObjectPath path;
    private String methodName;
    private CIMArgument[] inputArguments;
    private CIMArgument[] outputArguments;

    public InvokeMethodUserObject(CIMObjectPath path, java.lang.String pMethodName, CIMArgument[] pInputArguments, CIMArgument[] pOutputArguments) {
        this.path = path;
        methodName = pMethodName;
        inputArguments = pInputArguments;
        outputArguments = pOutputArguments;
    }

    public CIMObjectPath getPath() {
        return path;
    }

    public String getMethodName() {
        return methodName;
    }

    public CIMArgument[] getInputArguments() {
        return inputArguments;
    }

    public CIMArgument[] getOutputArguments() {
        return outputArguments;
    }
    
    
    
    
    
}
