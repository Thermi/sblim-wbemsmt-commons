/**
 * AjaxPanelGroup.java
 *
 * Â© Copyright IBM Corp. 2005
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
 * Ajax-enabled Panel
 *
 */

package org.sblim.wbemsmt.ajax.panel;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;

public class AjaxPanelGroup extends HtmlPanelGroup
{
	public static final String COMPONENT_TYPE = "org.sblim.wbemsmt.AjaxPanelGroup";
	public static final String COMPONENT_FAMILY = "org.sblim.wbemsmt.AjaxPanelGroup";
	public static final String DEFAULT_RENDERER_TYPE = "org.sblim.wbemsmt.AjaxPanelGroup";

	/**
	 * See wbemsmt-taglib.tld for description
	 */
    private Integer periodicalUpdate;

	public AjaxPanelGroup()
	{
		setRendererType(DEFAULT_RENDERER_TYPE);
	}

	public String getFamily()
	{
		return COMPONENT_FAMILY;
	}

    public Integer getPeriodicalUpdate() 
    {
    	return (Integer) getValue(periodicalUpdate,"periodicalUpdate");
    }

    public void setPeriodicalUpdate(Integer periodicalUpdate)
    {
        this.periodicalUpdate = periodicalUpdate;
    }

	public void restoreState(FacesContext context, Object state)
	{

		List values = (List) state;
		int idx=0;
		super.restoreState(context, values.get(idx++));
        periodicalUpdate = 		(Integer) values.get(idx++);

    }

	public Object saveState(FacesContext context)
	{
		List values = new ArrayList();
		values.add(super.saveState(context));
		values.add(periodicalUpdate);
        return values;
	}
	
    private Object getValue(Object value, String keyForBinding) {
        if (value != null) return value;
        ValueBinding vb = getValueBinding(keyForBinding);
        return (vb != null) ? vb.getValue(getFacesContext()) : null;
	}
	
}
