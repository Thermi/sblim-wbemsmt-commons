 /** 
  * DifferenceAfterCreateException.java
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
  * Description: Exception for Differences after Object creation
  * 
  */
package org.sblim.wbemsmt.exception.impl;

import java.util.Iterator;
import java.util.List;

import javax.cim.CIMInstance;
import javax.cim.CIMProperty;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.exception.ErrorCodeForUserException;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.userobject.DifferenceAfterCreateUserObject;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class DifferenceAfterCreateException extends WbemsmtException implements UserObjectExceptionIf {

    /**
     * 
     */
    private static final long serialVersionUID = 7554333135285266702L;

    /**
     * @param errorCode
     * @param msg
     */
    public DifferenceAfterCreateException(String msg,
            DifferenceAfterCreateUserObject userObject) {
        super(null, msg);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_CREATE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param t
     */
    public DifferenceAfterCreateException(String msg, Throwable t,
            DifferenceAfterCreateUserObject userObject) {
        super(null, msg, t);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_CREATE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param e
     */
    public DifferenceAfterCreateException(Throwable e,
            DifferenceAfterCreateUserObject userObject) {
        super(null, e);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_CREATE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public DifferenceAfterCreateException(String msg, AbstractWbemsmtFco fco,
            DifferenceAfterCreateUserObject userObject) {
        super(null, msg, fco);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_CREATE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public DifferenceAfterCreateException(String msg, AbstractWbemsmtFco[] fco,
            DifferenceAfterCreateUserObject userObject) {
        super(null,msg, fco);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_CREATE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     * @param t
     */
    public DifferenceAfterCreateException(String msg, AbstractWbemsmtFco fco,
            Throwable t,
            DifferenceAfterCreateUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_CREATE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     * @param t
     */
    public DifferenceAfterCreateException(ErrorCodeForUserException errorCode, String msg,
            AbstractWbemsmtFco[] fco, Throwable t,
            DifferenceAfterCreateUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_CREATE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public DifferenceAfterCreateException(AbstractWbemsmtFco fco,
            Throwable throwable,
            DifferenceAfterCreateUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_CREATE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public DifferenceAfterCreateException(AbstractWbemsmtFco[] fco,
            Throwable throwable,
            DifferenceAfterCreateUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_CREATE);
        setUserObject(userObject);
    }

    /**
     * @param msg
     * @param instances
     * @param throwable
     * @param userObject TODO
     */
    public DifferenceAfterCreateException(String msg, CIMInstance[] instances, Throwable throwable,
            DifferenceAfterCreateUserObject userObject) {
        super(null, msg, instances, throwable);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_CREATE);
        setUserObject(userObject);
    }
    
    public Message getMessage(WbemSmtResourceBundle bundle) {
        DifferenceAfterCreateUserObject userObject = (DifferenceAfterCreateUserObject) getUserObject();
        return Message.create(ErrCodes.MSGDEF_CIM_DIFF_AFTER_CREATE, bundle, new Object[]{
                   userObject.getInstance().getObjectPath(),
                   getAsString(bundle,userObject.getListWithDifferences())
         });
    }

    public static String getAsString(WbemSmtResourceBundle bundle, List<CIMProperty[]> listWithDifferences) {
        StringBuffer sb = new StringBuffer();
        
        String oldText = bundle.getString("local.property");
        String newText = bundle.getString("server.property");
        String notSet = bundle.getString("not.set");
        String noValue = bundle.getString("no.value");
        String noType = bundle.getString("no.type");
        
        for (Iterator<CIMProperty[]> iterator = listWithDifferences.iterator(); iterator.hasNext();) {
            CIMProperty[] properties = (CIMProperty[]) iterator.next();
            CIMProperty oldProperty = properties[0];
            CIMProperty newProperty = properties[1];
            sb.append(oldProperty.getName() + ":");
                    
            sb.append(" " + oldText + " ");
            
            if (oldProperty != null)
            {
                
                sb.append(
                        oldProperty.getValue() != null ? oldProperty.getValue().toString() : noValue + 
                        oldProperty.getDataType() != null ?
                           " (DataType =  "  + 
                           oldProperty.getDataType().toString()
                           : noType +
                        ")");
            }
            else
            {
                sb.append(notSet);
            }
            
            sb.append(" " + newText + " ");

            if (newProperty != null)
            {
                
                sb.append(
                        newProperty.getValue() != null ? newProperty.getValue().toString() : noValue + 
                        newProperty.getDataType() != null ?
                           " (DataType =  "  + 
                           newProperty.getDataType().toString()
                           : noType +
                        ")");
            }
            else
            {
                sb.append(notSet);
            }

            sb.append("\n");
        }
        
        return sb.toString();
    }        
    
    public boolean addCIMExceptionCause() {
        return false;
    }
    

}
