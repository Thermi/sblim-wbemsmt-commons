/** 
 * BeanNameConstants.java
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
 * Description: Constant class for keys to accesss backing beans
 * 
 */

package org.sblim.wbemsmt.tools.beans;

import java.text.MessageFormat;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;

import org.sblim.wbemsmt.bl.help.HelpManager;
import org.sblim.wbemsmt.cim.indication.jsf.DestinationManagerBean;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherController;
import org.sblim.wbemsmt.tasklauncher.login.LoginCheck;
import org.sblim.wbemsmt.webapp.jsf.LocaleManagerBean;
import org.sblim.wbemsmt.webapp.jsf.MessageHandlerBean;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;
import org.sblim.wbemsmt.webapp.jsf.style.StyleBean;

public final class BeanNameConstants {
    /**
     * Constant for the MessageHandler
     * @see MessageHandlerBean
     */
	public static final BeanNameConstant MESSAGE_HANDLER = new BeanNameConstant("messageHandler");
    /**
     * Constant for the TasklauncherControler
     * @see TaskLauncherController
     */
	public static final BeanNameConstant TASKLAUNCHER_CONTROLLER = new BeanNameConstant("taskLauncherController");
    /**
     * Constant for the TreeSelector
     * @see TreeSelector 
     */
	public static final BeanNameConstant TREE_SELECTOR = new BeanNameConstant("treeSelector");
    /**
     * Constant for the ObjectActionController 
     * @see ObjectActionControllerBean
     */
	public static final BeanNameConstant OBJECT_ACTION_CONTROLLER = new BeanNameConstant("objectActionController");
    /**
     * Constant for the LoginCheckBean 
     * @see LoginCheck
     * @see org.sblim.wbemsmt.webapp.jsf.LoginCheckBean
     * @see org.sblim.wbemsmt.webapp.jsf.embedded.LoginCheckBean
     */
	public static final BeanNameConstant LOGIN_CHECK = new BeanNameConstant("loginCheck");
	
	/**
	 * Constant for MenueController
	 * @see org.sblim.wbemsmt.webapp.jsf.MenueControllerBean
	 */
	public static final BeanNameConstant MENUE_CONTROLLER = new BeanNameConstant("menueController");
	
    /**
     * Constant for LocaleManager
     * @see LocaleManagerBean
     */
	public static final BeanNameConstant LOCALE_MANAGER = new BeanNameConstant("localeManager");
    /**
     * Constant for HelpManager
     * @see HelpManager
     * @see org.sblim.wbemsmt.webapp.jsf.HelpManagerBean
     */
	public static final BeanNameConstant HELP_MANAGER = new BeanNameConstant("helpManager");
	
	/**
	 * Constant for SessionManager
	 * @see WbemsmtSession
     * @see org.sblim.wbemsmt.webapp.jsf.WbemsmtSessionBean
	 */
	public static final BeanNameConstant SESSION = new BeanNameConstant("wbemsmtSessionBean");
	
	/**
	 * Constant for Destination Manager
	 * @see DestinationManagerBean 
	 */
	public static final BeanNameConstant DESTINATION_MANAGER = new BeanNameConstant("destinationManager");
	
	/**
	 * Constant for the StyleManager
	 * @see StyleBean
	 */
	public static final BeanNameConstant STYLE = new BeanNameConstant("style");
	
	public static final class BeanNameConstant
	{
		private final String name;

		/**
		 * private constructor
		 * @param name the name of the bean
 		 */
		private BeanNameConstant(String name)
		{
			this.name = name;
		}
		
		/**
		 * @return the name of the bean
		 */
		public String getName()
		{
			return name;
		}
		
		/**
		 * @param fc FacesContext
		 * @return the the bean as ValueBinding 
		 */
		public ValueBinding asValueBinding(FacesContext fc)
		{
			Application application = fc.getApplication();
			ValueBinding valueBinding = application.createValueBinding("#{" + name + "}");
			return valueBinding;
		}

		/**
		 * @param fc Faces Context
		 * @return the bound object
		 */
		public Object getBoundValue(FacesContext fc)
		{
			Application application = fc.getApplication();
			ValueBinding valueBinding = application.createValueBinding("#{" + name + "}");
			return valueBinding.getValue(fc);
		}

		/**
		 * Inserts the BeanName in the given string and creates a value binding
		 * @param fc FacesContext instance
		 * @param pattern for a MessageFormat-formatted String. At Index 0 the BeanName is inserted
		 * @return ValueBinding which uses the BeanName in the given pattern string
		 * 
		 * @see MessageFormat
		 */
		public ValueBinding asValueBinding(FacesContext fc, String pattern) {
			Application application = fc.getApplication();
			String binding = MessageFormat.format(pattern, new Object[]{name});
			ValueBinding valueBinding = application.createValueBinding(binding);
			return valueBinding;
		}
	
	}
	
}
