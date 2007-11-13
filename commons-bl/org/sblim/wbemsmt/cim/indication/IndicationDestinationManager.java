 /** 
  * IndicationDestinationManager.java
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
  * Description: Class that manages Indication Destinations
  * 
  */
package org.sblim.wbemsmt.cim.indication;

import java.util.*;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.exception.IndicationPreparationException;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class IndicationDestinationManager
{
	Map presets = new HashMap();

	public Map getPresets() {
		return presets;
	}

	public void setPresets(Map presets) {
		this.presets = presets;
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
	 * @throws IndicationPreparationException 
	 * @see IndicationDestinationPresets#url
	 */
	public IndicationDestination getIndicationDestination(String presetName) throws IndicationPreparationException
	{
		IndicationDestinationPresets preset = (IndicationDestinationPresets) presets.get("*");
		
		if (presets.containsKey(presetName))
		{
			preset = (IndicationDestinationPresets) presets.get(presetName);
		}
		
		return preset.getIndicationDestination();
	}
	
	public void recycleIndicationDestination(IndicationDestination indicationDestination)
	{
		if (indicationDestination.isCalculatedPort())
		{
			Iterator it = presets.values().iterator();
			while (it.hasNext())
			{
				IndicationDestinationPresets preset = (IndicationDestinationPresets) it.next();
				if (preset == indicationDestination.getPresets())
				{
					preset.freePort(indicationDestination.getPort());
				}
			}
		}
	}
}

