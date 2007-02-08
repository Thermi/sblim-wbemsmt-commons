/**
 * WbemsmtHtmlRendererUtils.java
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
 * Renderer Utils for HTML Renderers
 *
 */


package org.sblim.wbemsmt.html.renderer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.context.FacesContext;

import org.apache.myfaces.shared_tomahawk.renderkit.html.util.FormInfo;

public class WbemsmtHtmlRendererUtils {
	
	public static final String ALLOW_CDATA_SECTION_ON = "org.sblim.wbemsmt.ResponseWriter.CdataSectionOn";

	public static boolean isAllowedCdataSection(FacesContext fc) {

        Boolean value = (Boolean) fc.getExternalContext().getRequestMap().get(ALLOW_CDATA_SECTION_ON);
        return value != null && ((Boolean) value).booleanValue();
    }
    
    public static void allowCdataSection(FacesContext fc, boolean cdataSectionAllowed)
    {
          fc.getExternalContext().getRequestMap().put(ALLOW_CDATA_SECTION_ON,Boolean.valueOf(cdataSectionAllowed));
    }    

    /**
     * Find the enclosing form of a component
     * in the view-tree.
     * All Subclasses of <code>UIForm</code> and all known
     * form-families are searched for.
     * <p/>
     * There might be additional form families
     * which have to be explicitly entered here.
     *
     * @param uiComponent
     * @param facesContext
     * @return FormInfo Information about the form - the form itself and its name.
     */
    public static FormInfo findNestingForm(UIComponent uiComponent, FacesContext facesContext)
    {
        UIComponent parent = uiComponent.getParent();
        while (parent != null && !(parent instanceof UIForm))
        {
            parent = parent.getParent();
        }

        if (parent != null)
        {
            //link is nested inside a form
            String formName = parent.getClientId(facesContext);
            return new FormInfo(parent, formName);
        }

        return null;
    }

	public static List findComponents(Class componentClass, UIComponent parent) {
		
		List result = new ArrayList();

		findComponent(componentClass, parent, result);
		
		return result;
	}

	private static void findComponent(Class componentClass, UIComponent parent, List result) {
		
		if (componentClass.isAssignableFrom(parent.getClass()))
		{
			result.add(parent);
		}
		List children = parent.getChildren();
		for (Iterator iter = children.iterator(); iter.hasNext();) {
			findComponent(componentClass, (UIComponent) iter.next(), result);
		}
		
	}
		
    
    
}
