/**
 * AjaxPanelGroup.java
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
import javax.el.ValueExpression;

public class AjaxPanelGroup extends HtmlPanelGroup
{
	public static final String COMPONENT_TYPE = "org.sblim.wbemsmt.AjaxPanelGroup";
	public static final String COMPONENT_FAMILY = "org.sblim.wbemsmt.AjaxPanelGroup";
	public static final String DEFAULT_RENDERER_TYPE = "org.sblim.wbemsmt.AjaxPanelGroup";

	/**
	 * See wbemsmt-taglib.tld for description
	 */
    private String periodicalUpdate;

	public AjaxPanelGroup()
	{
		setRendererType(DEFAULT_RENDERER_TYPE);
	}

	public String getFamily()
	{
		return COMPONENT_FAMILY;
	}

    public String getPeriodicalUpdate() 
    {
    	return (String) getValue(periodicalUpdate,"periodicalUpdate");
    }

    public void setPeriodicalUpdate(String periodicalUpdate)
    {
        this.periodicalUpdate = periodicalUpdate;
    }

    // @TODO The state Object used here is a List with a String and an Object that represents the State. This needs fixing.
	public void restoreState(FacesContext context, Object state)
	{

		List values = (List) state;
		int idx=0;
		super.restoreState(context, values.get(idx++));
        periodicalUpdate = 		(String) values.get(idx++);

    }

    // @TODO The state Object used here is a List with a String and an Object that represents the State. This needs fixing.
	public Object saveState(FacesContext context)
	{
		List values = new ArrayList();
		values.add(super.saveState(context));
		values.add(periodicalUpdate);
        return values;
	}
	
    private Object getValue(Object value, String keyForBinding) {
        if (value != null) return value;
        ValueExpression ve = getValueExpression(keyForBinding);
        return (ve != null) ? ve.getValue(getFacesContext().getELContext()) : null;
	}
	
}
