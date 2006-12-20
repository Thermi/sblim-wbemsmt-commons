 /** 
  * JsfUtil.java
  *
  * (C) Copyright IBM Corp. 2005
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
import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class JsfUtil {

	private static final String IDENT_STRING = "   ";
	
	/**
	 * 
	 */
	private JsfUtil() {
		super();
	}
	
	public static void traceComponentTree(UIComponent component, PrintWriter out)
	{
		traceComponentTree(component,out,"");
	}

	private static void traceComponentTree(UIComponent component, PrintWriter out, String identString)
	{
		String name = component.getClass().getName();
		if (name.indexOf(".") > -1)
		{
			name = name.substring(name.lastIndexOf(".")+1);
		}
		
		if (component instanceof UICommand) {
			UICommand cmd = (UICommand) component;
			out.println(identString + name + " ID " + component.getId() + "Value " + cmd.getValue()  + " Hashcode " + component.hashCode()+ " " + component.toString());
			ActionListener[] actionListeners = cmd.getActionListeners();
			for (int i = 0; i < actionListeners.length; i++) {
				ActionListener listener = actionListeners[i];
				out.println(identString + "actionlistener " + listener.getClass().getName());
			}
			if (cmd.getAction() != null)
			{
				out.println(identString + "action " + cmd.getAction().getExpressionString());
			}
			if (cmd.getActionListener() != null)
			{
				out.println(identString + "actionlistener " + cmd.getActionListener().getExpressionString());
			}
		}
		else if (component instanceof UIOutput) {
			UIOutput cmd = (UIOutput) component;
			out.println(identString + name + " ID " + component.getId() + "Value " + cmd.getValue()  + " Hashcode " + component.hashCode()+ " " + component.toString());

			traceBinding(out, identString, cmd, "value");
			out.println(identString + "value " + cmd.getValue());
		}
		else
		{
			out.println(identString + name + " ID " + component.getId() + " Hashcode " + component.hashCode()+ " " + component.toString());
		}
		
		if (component instanceof HtmlTree) {
			HtmlTree tree = (HtmlTree) component;
			TreeNode node = tree.getDataModel().getNodeById("0");
			traceComponentTree(node,out,identString + JsfUtil.IDENT_STRING);
		}
		
		List children = component.getChildren();
		for (Iterator iter = children.iterator(); iter.hasNext();) {
			UIComponent child = (UIComponent) iter.next();
			traceComponentTree(child,out, identString + JsfUtil.IDENT_STRING);
		}
		
	}

	private static ValueBinding traceBinding(PrintWriter out, String identString, UIOutput ui, String bindingForField) {
		ValueBinding binding = null;
		if (ui.getValueBinding(bindingForField) != null)
		{
			binding = ui.getValueBinding(bindingForField);
			String expressionString = binding.getExpressionString();
			out.println(identString + "value-binding " + expressionString);
		}
		
		return binding;
	}

	private static void traceComponentTree(TreeNode node, PrintWriter out, String identString) {
		
		out.println(identString + "node " + node.getDescription());
		
		List children = node.getChildren();
		for (Iterator iter = children.iterator(); iter.hasNext();) {
			TreeNode child = (TreeNode) iter.next();
			traceComponentTree(child,out,identString + JsfUtil.IDENT_STRING);
		}
		
	}

	public static void handleException(Throwable t)
	{
		handleExceptionEnduser(t);
	}
	public static void handleExceptionEnduser(Throwable t) {

		FacesContext fc = FacesContext.getCurrentInstance();
		ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.asValueBinding(fc).getValue(fc);
		Locale currentLocale = localeManager.getCurrentLocale();
		WbemSmtResourceBundle taskBundle = null;
		WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages"},currentLocale);
		
		//first search for the deepest WbemSmtException
		WbemSmtException smtException = (WbemSmtException) ExceptionUtil.findDeepest(WbemSmtException.class, t);
		if (smtException != null && smtException.getCIM_Object() != null && smtException.getCIM_Object().getWrappedObject() != null)
		{
				taskBundle = localeManager.getBundleByFco(smtException.getCIM_Object());
		} 

		
		Message msgTitle = new Message(ErrCodes.MSG_ERROR_WHILE_EXECUTION,Message.ERROR,bundle.getString(ErrCodes.MSG_ERROR_WHILE_EXECUTION,"error.while.execution")); 
		Message msg = ExceptionUtil.getEnduserExceptionText(t, currentLocale, bundle, taskBundle, smtException, null, "");
		
		JsfBase.addMessage(msgTitle);
		JsfBase.addMessage(msg);

	}
	
	/**
	 * create a Label with the given text
	 * @param text
	 * @return
	 */
	public static HtmlOutputText createText(String text) {
		HtmlOutputText comp = (HtmlOutputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		comp.setEscape(false);
		comp.setValue("<nobr>" + text + "</nobr>");
		return comp;
	}
	
	/**
	 * create a Label with the given text, and style
	 * @param text
	 * @return
	 */
	public static HtmlOutputText createText(String text, String style) {
		HtmlOutputText comp = createText(text);
		comp.setStyle(style);
		return comp;
	}

	/**
	 * create a Grid with the given text
	 * @param text
	 * @return
	 */
	public static HtmlPanelGrid createPanelGrid(int cols) {
		HtmlPanelGrid comp = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		comp.setColumns(cols);
		return comp;
	}
	/**
	 * create a Grid with the given text
	 * @param text
	 * @return
	 */
	public static HtmlPanelGroup createPanelGroup() {
		HtmlPanelGroup comp = (HtmlPanelGroup) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
		return comp;
	}

	public static void addMessage(Message message)
	{
		JsfBase.addMessage(message);
	}

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
}
