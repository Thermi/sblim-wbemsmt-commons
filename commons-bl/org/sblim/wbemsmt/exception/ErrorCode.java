 /** 
  * ErrorCode.java
  *
  * © Copyright IBM Corp.  2009,2008
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
  * Description: representing an error code of a wbemsmt exception
  * 
  */
package org.sblim.wbemsmt.exception;

import java.util.HashMap;
import java.util.Map;

public class ErrorCode implements ErrorCodeIf {

    private static Map<String, String> codes = new HashMap<String, String>();
    private final String msg;
    private final int code;

    public ErrorCode(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    /* (non-Javadoc)
     * @see org.sblim.wbemsmt.exception.ErrorCodeIf#getMsg()
     */
    public String getMsg() {
        return msg;
    }

    /* (non-Javadoc)
     * @see org.sblim.wbemsmt.exception.ErrorCodeIf#getCode()
     */
    public int getCode() {
        return code;
    }

    public static void addCode(String msg, int code2) {
        String key = ""+code2;
        if (codes.containsKey(key))
        {
            throw new IllegalArgumentException("ErrorCode " + code2 + " already registered for msg " + msg);
        }
        codes .put(key,msg);
        
    }
    
    public String toString()
    {
        return code + " (" + msg + ")"; 
    }
    
    

}
