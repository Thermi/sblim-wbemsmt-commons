/**
 * AjaxPanelPhaseListener.java
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
 * PhasListener for Ajax-enabled Panel
 *
 */
package org.sblim.wbemsmt.ajax.panel;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.FacesException;
import javax.faces.application.StateManager;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.myfaces.shared_tomahawk.renderkit.RendererUtils;
import org.apache.myfaces.shared_tomahawk.renderkit.html.HtmlResponseWriterImpl;
import org.sblim.wbemsmt.html.renderer.WbemsmtHtmlRendererUtils;

public class AjaxPanelPhaseListener implements PhaseListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4156003658789894452L;
	private static Logger logger = Logger.getLogger(AjaxPanelPhaseListener.class.getName());
	public static final String AJAX_PARAMETER = "org.sblim.wbemsmt.ajax.AjaxPanelController.ajaxRequest";
	public static final String PPR_PARAMETER = AJAX_PARAMETER;
	public static final String TRIGGERED_COMPONENTS_PARAMETER = "org.sblim.wbemsmt.ajax.AjaxPanelController.triggeredComponents";
	public static final String XML_HEADER = "<?xml version=\"1.0\"?>\n";

	public void afterPhase(PhaseEvent phaseEvent)
	{
	}

	public void beforePhase(PhaseEvent event)
	{
		if (logger.isLoggable(Level.FINE))
		{
			logger.fine("In AjaxPanelPhaseListener beforePhase");
		}

		FacesContext context = event.getFacesContext();
		Map externalRequestMap = context.getExternalContext().getRequestParameterMap();

//		for (Iterator iter = externalRequestMap.entrySet().iterator(); iter.hasNext();) {
//			Map.Entry entry = (Map.Entry) iter.next();
//			logger.info(entry.getKey() + "=" + entry.getValue());
//		}
		
		if (externalRequestMap.containsKey(AJAX_PARAMETER))
		{
			context.getExternalContext().getRequestMap().put(AjaxPanelGroupRenderer.PPR_RESPONSE, Boolean.TRUE);

			ServletResponse response =
				(ServletResponse) context.getExternalContext().getResponse();
			ServletRequest request =
				(ServletRequest) context.getExternalContext().getRequest();

			UIViewRoot viewRoot = context.getViewRoot();
            String contentType = getContentType("text/xml",request.getCharacterEncoding());
            response.setContentType(contentType);
			response.setLocale(viewRoot.getLocale());
			String triggeredComponents = (String) externalRequestMap.get(TRIGGERED_COMPONENTS_PARAMETER);
			try
			{
				
				
				StringWriter sw = new StringWriter();
				PrintWriter out = new PrintWriter(sw);
				
				context.setResponseWriter(new HtmlResponseWriterImpl(out,
					contentType,
					request.getCharacterEncoding()));
				out.print(XML_HEADER);
				out.print("<response>\n");
				encodeTriggeredComponents(out, triggeredComponents, viewRoot, context);
				out.print("</response>");
				out.flush();
				
				String s = sw.toString();
//				System.err.println("********** before ");
//				System.err.println(s);

				s = StringUtils.replace(s, "]]></script>","</script>");
				s = StringUtils.replace(s,"<script type=\"text/javascript\"><![CDATA[","<script type=\"text/javascript\">");
				
//				System.err.println("********** after ");
//				System.err.println(s);

				PrintWriter out1 = response.getWriter();
				out1.print(s);
				out1.flush();
				out1.close();
			
			}
			catch (IOException e)
			{
				throw new FacesException(e);
			}

			context.responseComplete();
		}                                          
	}

    private String getContentType(String contentType, String charset)
    {
        if (charset == null || charset.trim().length() == 0)
            return contentType;
        else
            return contentType + ";charset=" + charset;
    }

    private void encodeTriggeredComponents(PrintWriter out, String triggeredComponents, UIViewRoot viewRoot, FacesContext context)
	{
		StringTokenizer st = new StringTokenizer(triggeredComponents, ",", false);
		String clientId;
		UIComponent component;
		while (st.hasMoreTokens())
		{
			clientId = st.nextToken();
			component = viewRoot.findComponent(clientId);
			if(component!=null) {
				out.print("<component id=\"" +
					component.getClientId(context) +
					"\"><![CDATA[");
                boolean oldValue = WbemsmtHtmlRendererUtils.isAllowedCdataSection(context);
                WbemsmtHtmlRendererUtils.allowCdataSection(context, false);
                try
				{
					RendererUtils.renderChildren(context, component);
				}
				catch (IOException e)
				{
					throw new FacesException(e);
				}
                WbemsmtHtmlRendererUtils.allowCdataSection(context, oldValue);
                out.print("]]></component>");
			}
			else
			{
				logger.fine("AxajPanelPhaseListener component with id" + clientId + "not found!");
			}
		}
        out.print("<state>");
                FacesContext facesContext = FacesContext.getCurrentInstance();
                StateManager stateManager = facesContext.getApplication().getStateManager();
                StateManager.SerializedView serializedView
                        = stateManager.saveSerializedView(facesContext);
                try
                {
                    stateManager.writeState(facesContext, serializedView);
                }
                catch (IOException e)
                {
                    throw new FacesException(e);
                }

        out.print("</state>");

    }

	public PhaseId getPhaseId()
	{
		return PhaseId.RENDER_RESPONSE;
	}
}
