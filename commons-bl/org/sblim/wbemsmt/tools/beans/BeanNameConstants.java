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

public class BeanNameConstants {
	public static final BeanNameConstant MESSAGE_HANDLER = new BeanNameConstant("messageHandler");
	public static final BeanNameConstant TASKLAUNCHER_CONTROLLER = new BeanNameConstant("taskLauncherController");
	public static final BeanNameConstant TREE_SELECTOR = new BeanNameConstant("treeSelector");
	public static final BeanNameConstant OBJECT_ACTION_CONTROLLER = new BeanNameConstant("objectActionController");
	public static final BeanNameConstant LOGIN_CHECK = new BeanNameConstant("loginCheck");
	public static final BeanNameConstant MENUE_CONTROLLER = new BeanNameConstant("menueController");
	public static final BeanNameConstant LOCALE_MANAGER = new BeanNameConstant("localeManager");
	public static final BeanNameConstant HELP_MANAGER = new BeanNameConstant("helpManager");
	public static final BeanNameConstant STYLE = new BeanNameConstant("style");
	
	public static class BeanNameConstant
	{
		private final String name;

		private BeanNameConstant(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
		
		public ValueBinding asValueBinding(FacesContext fc)
		{
			Application application = fc.getApplication();
			ValueBinding valueBinding = application.createValueBinding("#{" + name + "}");
			return valueBinding;
		}

		public Object getBoundValue(FacesContext fc)
		{
			Application application = fc.getApplication();
			ValueBinding valueBinding = application.createValueBinding("#{" + name + "}");
			return valueBinding.getValue(fc);
		}

		/**
		 * Inserts the BeanName in the given string and creates a value binding
		 * @param fc
		 * @param pattern for a MessageFormat-formatted String. At Index 0 the BeanName is inserted
		 * @return
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
