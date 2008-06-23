 /** 
  * JsfUtil.java
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
  * Description: Class with JSF util-Methods
  * 
  */
package org.sblim.wbemsmt.tools.jsf;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.component.UICommand;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.event.ActionListener;

import org.apache.myfaces.custom.tree2.HtmlTree;
import org.apache.myfaces.custom.tree2.TreeNode;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public final class JsfUtil {

    /**
     * string for indention
     */
	private static final String INDENTION_STRING = "   ";
	/**
	 * Javascript command to stop all ajax requests
	 */
	public static final String STOP_ALL_AJAX_REQUESTS_TRUE = "stopAllAjaxRequests=true;";
	
	/**
	 * default constructor 
	 */
	private JsfUtil() {
		super();
	}
	
	/**
	 * trace the component and it's children with indenting of the children
	 * @param component the component
	 * @param out writer for the output
	 */
	public static void traceComponentTree(UIComponent component, PrintWriter out)
	{
		traceComponentTree(component,out,"");
	}

    /**
     * trace the component and it's children with indenting of the children
     * @param component the component
     * @param out writer for the output
     * @param indentionString String for identation
     */
	private static void traceComponentTree(UIComponent component, PrintWriter out, String indentionString)
	{
		String name = component.getClass().getName();
		if (name.indexOf(".") > -1)
		{
			name = name.substring(name.lastIndexOf(".")+1);
		}
		
		if (component instanceof UICommand) {
			UICommand cmd = (UICommand) component;
			out.println(indentionString + name + " ID " + component.getId() + "Value " + cmd.getValue()  + " Hashcode " + component.hashCode()+ " " + component.toString());
			ActionListener[] actionListeners = cmd.getActionListeners();
			for (int i = 0; i < actionListeners.length; i++) {
				ActionListener listener = actionListeners[i];
				out.println(indentionString + "actionlistener " + listener.getClass().getName());
			}
			if (cmd.getAction() != null)
			{
				out.println(indentionString + "action " + cmd.getAction().getExpressionString());
			}
			if (cmd.getActionListener() != null)
			{
				out.println(indentionString + "actionlistener " + cmd.getActionListener().getExpressionString());
			}
		}
		else if (component instanceof UIOutput) {
			UIOutput cmd = (UIOutput) component;
			out.println(indentionString + name + " ID " + component.getId() + "Value " + cmd.getValue()  + " Hashcode " + component.hashCode()+ " " + component.toString());

			traceBinding(out, indentionString, cmd, "value");
			out.println(indentionString + "value " + cmd.getValue());
		}
		else
		{
			out.println(indentionString + name + " ID " + component.getId() + " Hashcode " + component.hashCode()+ " " + component.toString());
		}
		
		if (component instanceof HtmlTree) {
			HtmlTree tree = (HtmlTree) component;
			TreeNode node = tree.getDataModel().getNodeById("0");
			traceComponentTree(node,out,indentionString + JsfUtil.INDENTION_STRING);
		}
		
		List children = component.getChildren();
		for (Iterator iter = children.iterator(); iter.hasNext();) {
			UIComponent child = (UIComponent) iter.next();
			traceComponentTree(child,out, indentionString + JsfUtil.INDENTION_STRING);
		}
		
	}

	/**
	 * get the binding bindingForField out of the component ui and tarce it to out by using indention as prefix
	 * @param out the writer
	 * @param indention the sting for the indention
	 * @param ui the component
	 * @param bindingForField name of the value binding to be traced
	 * @return the value binding
	 */
	private static ValueBinding traceBinding(PrintWriter out, String indention, UIOutput ui, String bindingForField) {
		ValueBinding binding = null;
		if (ui.getValueBinding(bindingForField) != null)
		{
			binding = ui.getValueBinding(bindingForField);
			String expressionString = binding.getExpressionString();
			out.println(indention + "value-binding " + expressionString);
		}
		
		return binding;
	}

	/**
	 * Trace a node with all it's children to the writer out by using the indentionString as prefix. Each level below is using JsfUtil.INDENTION_STRING as additional indention
	 * @param node the node to be traced
	 * @param out the writer
	 * @param indentionString the indentionString used as prefix
	 */
	private static void traceComponentTree(TreeNode node, PrintWriter out, String indentionString) {
		
		out.println(indentionString + "node " + node.getDescription());
		
		List children = node.getChildren();
		for (Iterator iter = children.iterator(); iter.hasNext();) {
			TreeNode child = (TreeNode) iter.next();
			traceComponentTree(child,out,indentionString + JsfUtil.INDENTION_STRING);
		}
		
	}

	/**
	 * handle the exception or other Throwables for the JSF layer
	 * @param t the Throwable
	 */
	public static void handleException(Throwable t)
	{
		handleExceptionEnduser(t);
	}
	
	/**	
	 * handle the exception or other Throwables for the JSF layer so that the enduser is happy (and not get bombed with too much details)
	 * @param t the Throwable
	 */
	public static void handleExceptionEnduser(Throwable t) {

		FacesContext fc = FacesContext.getCurrentInstance();
		ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.asValueBinding(fc).getValue(fc);
		Locale currentLocale = localeManager.getCurrentLocale();
		WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages"},currentLocale);
		
		//first search for the deepest WbemsmtException
		WbemsmtException smtException = (WbemsmtException) ExceptionUtil.findDeepest(WbemsmtException.class, t);

		
		Message msgTitle = Message.create(ErrCodes.MSGDEF_ERROR_WHILE_EXECUTION,bundle); 
		Message msg = ExceptionUtil.getEnduserExceptionText(t, currentLocale, bundle, smtException, null, "");
		
		JsfBase.addMessage(msgTitle);
		JsfBase.addMessage(msg);

	}
	
	/**
	 * create a Label with the given text
	 * @param text the content of the label
	 * @return the label
	 */
	public static HtmlOutputText createText(String text) {
		HtmlOutputText comp = (HtmlOutputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		comp.setEscape(false);
		comp.setValue("<nobr>" + text + "</nobr>");
		return comp;
	}
	
	/**
	 * create a Label with the given text, and style
     * @param text the content of the label
     * @param style the style of the label
	 * @return the label
	 */
	public static HtmlOutputText createText(String text, String style) {
		HtmlOutputText comp = createText(text);
		comp.setStyle(style);
		return comp;
	}

	/**
	 * create a Grid with the given columns
	 * @param cols amount of columns
	 * @return the table
	 */
	public static HtmlPanelGrid createPanelGrid(int cols) {
		HtmlPanelGrid comp = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		comp.setColumns(cols);
		return comp;
	}
	/**
	 * create a panelGroup
	 * @return the panelGroup
	 */
	public static HtmlPanelGroup createPanelGroup() {
		HtmlPanelGroup comp = (HtmlPanelGroup) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
		return comp;
	}

	/**
	 * add a message to the messageHandler instance 
	 * @param message the message to be added
	 */
	public static void addMessage(Message message)
	{
		JsfBase.addMessage(message);
	}

	/**
	 * check if the FacesContext contains errors
	 * @return true if the FacesContext contains errors
	 */
	public static boolean havingErrors() {
		Iterator messages = FacesContext.getCurrentInstance().getMessages();
		while (messages.hasNext()) {
			FacesMessage msg = (FacesMessage) messages.next();
			if (msg.getSeverity().equals(FacesMessage.SEVERITY_ERROR) || msg.getSeverity().equals(FacesMessage.SEVERITY_FATAL))
			{
				return true;
			}
			if(msg instanceof WbemsmtFacesMessage)
			{
				WbemsmtFacesMessage wbemsmtFacesMessage = (WbemsmtFacesMessage) msg;
				if (wbemsmtFacesMessage.getMessage().isError())
				{
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * externalized this statement into this method because the handling via JSF EL is too complex
	 * @return the javascript call to get a confirmation from the user to revert the current edit action
	 */
	public static String getRevertEditActionJavaScriptConfirmStatement()
	{
		WbemSmtResourceBundle resourceBundle = ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance());
		return "if (!showConfirm('" +  resourceBundle.getString("revertEditAction")  +"')) return false;";
	}
	
}
