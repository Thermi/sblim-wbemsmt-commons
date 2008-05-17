 /** 
  * CliLocaleManager.java
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
  * Description: TODO Add class description
  * 
  */
package org.sblim.wbemsmt.tools.cli;

import java.util.Locale;

import org.sblim.wbemsmt.tools.resources.LocaleManager;

public class CliLocaleManager extends LocaleManager {

    
    private static CliLocaleManager instance = null;
    
    public CliLocaleManager()
    {
        currentLocale = Locale.getDefault();
    }
    
    public static CliLocaleManager getInstance()
    {
        if (instance == null)
        {
            instance = new CliLocaleManager();
        }
        return instance;
    }

}
