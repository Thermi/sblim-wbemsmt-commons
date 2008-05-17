 /** 
  * PreloadThread.java
  *
  * © Copyright IBM Corp. 2008
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
  * Description: Thread class to preload Business Objects
  * 
  */
package org.sblim.wbemsmt.bl.wrapper.preload;

import javax.wbem.client.WBEMClient;

public class PreloadThread extends Thread {

    protected final WBEMClient client;

    public PreloadThread(String id, WBEMClient client) {
        super("preload-" + id);
        this.client = client;
    }

    
    
}
