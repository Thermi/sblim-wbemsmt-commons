/**
 * StopRefreshTag.java
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
 * @author: Michael.Bauschert@de.ibm.com
 *
 * Contributors: 
 * 
 * Tag class for Stop-checkbox for stopping the refresh of a Ajax-enabled Panel
 *
 */


package org.sblim.wbemsmt.ajax.panel;

import javax.faces.component.UIComponent;

import org.apache.myfaces.custom.checkbox.HtmlCheckboxTag;

public class StopRefreshTag extends HtmlCheckboxTag
{
	/**
	 * See wbemsmt-taglib.tld for description
	 */
    private String panel;

    public String getComponentType()
	{
		return StopRefresh.COMPONENT_TYPE;
	}

	public String getRendererType()
	{
		return StopRefresh.DEFAULT_RENDERER_TYPE;
	}

	public void release()
	{
		super.release();
		panel = null;
    }

	protected void setProperties(UIComponent component)
	{
		super.setProperties(component);
        setStringProperty(component,"panel", panel);
    }

    public void setPanel(String panel)
    {
    	this.panel = panel;
    }
    
}
