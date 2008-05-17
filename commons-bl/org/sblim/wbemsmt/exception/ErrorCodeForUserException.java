 /** 
  * ErrorCodeForUserException.java
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
  * Description: ErrorCode for an exception that uses an User object. Cannot be used to create a WbemSmtExceptiion directly.
  * The subclass takes the errorCode  
  * 
  * 
  */
package org.sblim.wbemsmt.exception;

public class ErrorCodeForUserException implements ErrorCodeIf {

    private final String msg;
    private final int code;

    public ErrorCodeForUserException(String msg, int code) {
        this.msg = msg;
        this.code = code;
        ErrorCode.addCode(msg,code);
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

}
