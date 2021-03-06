 /** 
  * IndicationDestinationManager.java
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
  * Description: Class that manages Indication Destinations
  * 
  */
package org.sblim.wbemsmt.cim.indication;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class IndicationDestinationManager
{
    protected Map<String, IndicationDestinationPresets> presets = new HashMap<String, IndicationDestinationPresets>();

	public IndicationDestinationManager()
	{
	}

	
	public void addPreset(String key, IndicationDestinationPresets presets) {
		this.presets.put("Key", presets);
	}
	
	public static IndicationDestinationManager getCurrent()
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			return (IndicationDestinationManager) BeanNameConstants.DESTINATION_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
		}
		else if (RuntimeUtil.getInstance().isCommandline())
		{
			return new IndicationDestinationManager();
		}
		else throw new RuntimeException("Runtimemode " + RuntimeUtil.getInstance().getRuntime() + " is not supported" );
	}
	
	/**
	 * gets the Url from the Preset
	 * 
	 * the Url can be define so that the hostname and/or the port is replaced dynamically
	 * 
	 * @param template
	 * @return
	 * @throws WbemsmtException 
	 * @see IndicationDestinationPresets#url
	 */
	public IndicationDestination getIndicationDestination(String presetName) throws WbemsmtException
	{
	    IndicationDestinationPresets preset = (IndicationDestinationPresets) presets.get(presetName);
		
		if (preset == null)
		{
		    throw new WbemsmtException(WbemsmtException.ERR_INDICATION_PREPARATION,"IndicationDestinaionPreset " + presetName + " was not found." );
		}
		
		return preset.getIndicationDestination();
	}
	
	public void recycleIndicationDestination(IndicationDestination indicationDestination)
	{
		if (indicationDestination.getPort() != null)
		{
			Iterator<IndicationDestinationPresets> it = presets.values().iterator();
			while (it.hasNext())
			{
				IndicationDestinationPresets preset = (IndicationDestinationPresets) it.next();
				if (preset == indicationDestination.getPresets())
				{
					preset.freePort(indicationDestination.getPort().intValue());
				}
			}
		}
	}
}

