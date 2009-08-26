 /** 
  * DestinationManagerBean.java
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
  * Description: Manages the Destination Urls for Indication subscriptions
  * 
  */
package org.sblim.wbemsmt.cim.indication.jsf;

import java.util.Map;

import org.sblim.wbemsmt.cim.indication.IndicationDestinationManager;
import org.sblim.wbemsmt.cim.indication.IndicationDestinationPresets;

public class DestinationManagerBean extends IndicationDestinationManager {
	
    public Map<String, IndicationDestinationPresets> getPresets()
    {
        return presets;
    }

    public void setPresets(Map<String, IndicationDestinationPresets> presets)
    {
        this.presets = presets;
    }
	
}
