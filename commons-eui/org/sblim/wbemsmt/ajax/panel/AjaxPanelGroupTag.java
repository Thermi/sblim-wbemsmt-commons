/**
 * AjaxPanelGroupTag.java
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
 * Tag for Ajax-enabled Panel
 *
 */

package org.sblim.wbemsmt.ajax.panel;

import javax.faces.component.UIComponent;

import org.apache.myfaces.taglib.html.ext.HtmlPanelGroupTag;

public class AjaxPanelGroupTag extends HtmlPanelGroupTag
{
	/**
	 * See wbemsmt-taglib.tld for description
	 */
    private String _periodicalUpdate;

    public String getComponentType()
	{
		return AjaxPanelGroup.COMPONENT_TYPE;
	}

	public String getRendererType()
	{
		return AjaxPanelGroup.DEFAULT_RENDERER_TYPE;
	}

	public void release()
	{
		super.release();
        _periodicalUpdate = null;
    }

	protected void setProperties(UIComponent component)
	{
		super.setProperties(component);
        setStringProperty(component,"periodicalUpdate", _periodicalUpdate);
    }

    public void setPeriodicalUpdate(String periodicalUpdate)
    {
        _periodicalUpdate = periodicalUpdate;
    }
    
}
