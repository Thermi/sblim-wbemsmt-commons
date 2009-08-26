/**
 * StopRefreshRenderer.java
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
 * Renderer for Stop-checkbox for stopping the refresh of a Ajax-enabled Panel
 *
 */


package org.sblim.wbemsmt.ajax.panel;

import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import org.apache.myfaces.renderkit.html.HtmlCheckboxRenderer;
import org.apache.myfaces.shared_tomahawk.renderkit.html.util.FormInfo;
import org.sblim.wbemsmt.html.renderer.WbemsmtHtmlRendererUtils;

public class StopRefreshRenderer extends HtmlCheckboxRenderer
{

	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException
	{
		if (uiComponent instanceof StopRefresh) {
			StopRefresh checkbox = (StopRefresh) uiComponent;

			List<UIComponent> panelGroupList = WbemsmtHtmlRendererUtils.findComponents(AjaxPanelGroup.class, facesContext.getViewRoot());

			StringTokenizer tokenizer = new StringTokenizer(checkbox.getPanel(),",");
			
			StringBuffer sb = new StringBuffer();
			
			while (tokenizer.hasMoreTokens())
			{
				String clientId = tokenizer.nextToken();
				
				int found = -1;
				for (int i=0; i < panelGroupList.size() && found == -1; i++)
				{
					UIComponent component = (UIComponent) panelGroupList.get(i);
					if (component.getClientId(facesContext).equals(clientId))
					{
						found = i;
					}
				}
				
				if (found != -1)
				{
					AjaxPanelGroup ajaxPanel = (AjaxPanelGroup) panelGroupList.get(found);
					FormInfo fi = WbemsmtHtmlRendererUtils.findNestingForm(ajaxPanel, facesContext);
					sb.append("dojo.byId('"+ fi.getFormName() + "').wbemsmtAjaxPanelController.togglePeriodicalUpdate("+ ajaxPanel.getPeriodicalUpdate() +",'"+ clientId +"');");
				}
				else
				{
					throw new IllegalArgumentException("AjaxPanel with id " + checkbox.getPanel() + " was not found");
				}				
				
			}
			if (sb.length() > 0)
			{
				checkbox.setOnclick(sb.toString());
			}
		}
		

		super.encodeBegin(facesContext, uiComponent);
		
	}

	public void encodeEnd(FacesContext facesContext, UIComponent uiComponent) throws IOException
	{
		super.encodeEnd(facesContext, uiComponent);
	}
}
