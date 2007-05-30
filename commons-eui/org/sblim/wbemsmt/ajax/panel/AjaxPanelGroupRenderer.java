/**
 * AjaxPanelGroupRenderer.java
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
 * Renderer for Ajax-enabled Panel
 *
 */

package org.sblim.wbemsmt.ajax.panel;

import java.io.IOException;
import java.text.MessageFormat;

import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import org.apache.myfaces.renderkit.html.ext.HtmlGroupRenderer;
import org.apache.myfaces.shared_tomahawk.renderkit.html.HTML;
import org.apache.myfaces.shared_tomahawk.renderkit.html.util.FormInfo;
import org.sblim.wbemsmt.html.renderer.WbemsmtHtmlRendererUtils;

public class AjaxPanelGroupRenderer extends HtmlGroupRenderer
{
	public static final String PPR_INITIALIZED = "org.sblim.wbemsmt.ajax.INITIALIZED";
	public static final String PPR_RESPONSE = "org.sblim.wbemsmt.ajax.RESPONSE";

    private static final String DOJO_REQUIRE                     = "dojo.require(''{0}'');";
    private static final String DOJOEXTENSIONS_NAMESPACE         = "dojo.setModulePrefix('extensions', '../dojoextensions.ResourceLoader');\n";
	
	private static final String PPR_JS_FILE = "ajaxPanelController.js";
	private static final String DOJO_JS_FILE = "dojo.js";
	private static final String MY_FACES_PPR_INIT_CODE = "new org.sblim.wbemsmt.ajax.AjaxPanelController";
	

	public void encodeJavaScript(FacesContext facesContext, AjaxPanelGroup ajaxPanel) throws IOException
	{
		if (facesContext.getExternalContext().getRequestMap().containsKey(PPR_RESPONSE))
		{
			return;
		}

		FormInfo fi = WbemsmtHtmlRendererUtils.findNestingForm(ajaxPanel, facesContext);
		if (fi == null)
		{
			throw new FacesException("PPRPanelGroup must be embedded in an form.");
		}

		//global javascript initialized
		if (!facesContext.getExternalContext().getRequestMap().containsKey(PPR_INITIALIZED))
		{
			facesContext.getExternalContext().getRequestMap().put(PPR_INITIALIZED, Boolean.TRUE);

			ResponseWriter writer = facesContext.getResponseWriter();

            addJavaScriptReference(facesContext, writer, DOJO_JS_FILE);
            addJavaScriptReference(facesContext, writer,PPR_JS_FILE);
            
    		writer.startElement(HTML.SCRIPT_ELEM, null);

    		writer.write("var djConfig = { };\n");
    		writer.write(DOJOEXTENSIONS_NAMESPACE);
    		require(writer,"dojo.io.*");
    		require(writer,"dojo.event.*");
            
			writer.endElement(HTML.SCRIPT_ELEM);
        }
        
		//javascript for the form initialized

		if (!facesContext.getExternalContext().getRequestMap().containsKey(PPR_INITIALIZED  +
                    "." +
                    fi.getFormName()))
		{
			facesContext.getExternalContext().getRequestMap().put(PPR_INITIALIZED  +
                    "." +
                    fi.getFormName(),
                    Boolean.TRUE);

            renderInlineScript(facesContext, ajaxPanel,
                    "dojo.byId('" +
                    fi.getFormName() +
                    "').wbemsmtAjaxPanelController =" +
                    MY_FACES_PPR_INIT_CODE + "('" + fi.getFormName() + "');");
        }

	}
	
	private void require(ResponseWriter writer, String dojoLib) throws IOException {
		writer.write(MessageFormat.format(DOJO_REQUIRE, new Object[]{dojoLib}));
	}

	private void addJavaScriptReference(FacesContext facesContext, ResponseWriter writer, String filename) throws IOException {

		String contextPath = facesContext.getExternalContext().getRequestContextPath();
		
		writer.startElement(HTML.SCRIPT_ELEM, null);
		writer.writeAttribute(HTML.SRC_ATTR,  contextPath + "/scripts/" + filename, null);
		writer.endElement(HTML.SCRIPT_ELEM);
		
	}



	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException
	{
		if (uiComponent.getId() == null || uiComponent.getId().startsWith(UIViewRoot.UNIQUE_ID_PREFIX))
		{
			throw new IllegalArgumentException("'id' is a required attribute for the AjaxPanel");
		}

		if (uiComponent instanceof AjaxPanelGroup)
		{
			AjaxPanelGroup ajaxPanel = (AjaxPanelGroup) uiComponent;

			if (ajaxPanel.getPeriodicalUpdate() != null)
			{
				encodeJavaScript(facesContext, ajaxPanel);
			}
		}
		super.encodeBegin(facesContext, uiComponent);
		
	}

	public void encodeEnd(FacesContext facesContext, UIComponent uiComponent) throws IOException
	{
		super.encodeEnd(facesContext, uiComponent);
		
		if (uiComponent instanceof AjaxPanelGroup)
		{
			AjaxPanelGroup ajaxPanel = (AjaxPanelGroup) uiComponent;

	        if (ajaxPanel.getPeriodicalUpdate() != null)
	        {
				String clientId = ajaxPanel.getClientId(facesContext);
	        	FormInfo fi = WbemsmtHtmlRendererUtils.findNestingForm(ajaxPanel, facesContext);
	        	String script = "dojo.byId('"+ fi.getFormName() + "').wbemsmtAjaxPanelController.startPeriodicalUpdate("+ ajaxPanel.getPeriodicalUpdate() +" * 1000,'"+ clientId +"');";

	            renderInlineScript(facesContext, ajaxPanel, script);
	        }
		}
		
	}

	/**
	 * Helper to write an inline javascript at the
	 * exact resource location of the call.
	 *
	 * @param facesContext The current faces-context.
	 * @param component The component for which the script is written.
	 * @param script The script to be written.
	 * @throws IOException A forwarded exception from the underlying renderer.
	 */
	private static void renderInlineScript(FacesContext facesContext, UIComponent component, String script) throws IOException
	{
		ResponseWriter writer = facesContext.getResponseWriter();
		writer.startElement(HTML.SCRIPT_ELEM, component);
		writer.writeAttribute(HTML.TYPE_ATTR, HTML.SCRIPT_TYPE_TEXT_JAVASCRIPT, null);
		writer.write(script);
		writer.endElement(HTML.SCRIPT_ELEM);
	}
}
