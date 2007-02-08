 /** 
  * Constants.java
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
  * Description: Class with Constants
  * 
  */
package org.sblim.wbemsmt.bl;

import java.util.MissingResourceException;

import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class Constants {

	private static final String BUNDLE_NAME = "org.sblim.wbemsmt.dcg.messages"; //$NON-NLS-1$
	private static final String BUNDLE_NAME_GENERATOR = "org.sblim.wbemsmt.dcg.generator.messages";

	public static WbemSmtResourceBundle RESOURCE_BUNDLE = ResourceBundleManager.getResourceBundle(new String[]{BUNDLE_NAME,BUNDLE_NAME_GENERATOR});
	public static final String NO_DEFAULT_VALUE = "noDefaultValue";

	private Constants() {}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static String getString(String key, Object values[]) {
		try {
			return RESOURCE_BUNDLE.getString(key,values);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static final String RESSOURCE_DIR = System.getProperty("RESOURCE.DIR", "./") + (System.getProperty("RESOURCE.DIR", "./").endsWith("/") ? "" : "/");
	
	public static final String ICON_FCO = RESSOURCE_DIR + "images/fco.gif";
	public static final String ICON_LINK_FCO = RESSOURCE_DIR + "images/linkFco.png";
	public static final String ICON_TREE = RESSOURCE_DIR + "images/tree.gif";
	public static final String ICON_PANELS = RESSOURCE_DIR + "images/panels.gif";
	public static final String ICON_LINK_CONTAINER = RESSOURCE_DIR + "images/linkContainer.png";
	public static final String ICON_ADAPTER = RESSOURCE_DIR + "images/adapter.gif";
	public static final String ICON_CLS = RESSOURCE_DIR + "images/cls.png";
	public static final String ICON_COMMMANDS = RESSOURCE_DIR + "images/cmd.png";
	public static final String ICON_COMMMAND = RESSOURCE_DIR + "images/cmd.png";
	public static final String ICON_OPTION = RESSOURCE_DIR + "images/option.png";
	public static final String ICON_TAB = RESSOURCE_DIR + "images/tab.gif";
	public static final String ICON_PANEL = RESSOURCE_DIR + "images/panel.gif";
	public static final String ICON_BUNDLE = RESSOURCE_DIR + "images/topic.gif";
	public static final String ICON_SHEET = RESSOURCE_DIR + "images/topic.gif";
	public static final String ICON_LISTENER = RESSOURCE_DIR + "images/listener.gif";
	public static final String ICON_LIST = RESSOURCE_DIR + "images/topic.gif";
	public static final String ICON_LISTENER_PKG = RESSOURCE_DIR + "images/listenerPkg.gif";
	public static final String ICON_WIZARD = RESSOURCE_DIR + "images/wizard.png";
	public static final String ICON_WIZARD_PKG = RESSOURCE_DIR + "images/wizardPkg.png";
	public static final String ICON_EDIT = RESSOURCE_DIR + "images/edit.gif";
	public static final String ICON_DELETE = RESSOURCE_DIR + "images/delete.gif";
	public static final String ICON_FIELD_NEW = RESSOURCE_DIR + "images/fieldNew.png";
	public static final String ICON_FIELD = RESSOURCE_DIR + "images/field.png";
	public static final String ICON_PKG = RESSOURCE_DIR + "images/pkg.png";
	public static final String ICON_LINK_CLS = RESSOURCE_DIR + "images/linkCls.png";
	public static final String ICON_EXTENDS = RESSOURCE_DIR + "images/extends.png";
	public static final String ICON_CONTAINER = RESSOURCE_DIR + "images/container.png";

	public static final String LABEL_UI =  getString("Constants.UI");
	public static final String LABEL_DELETE_ACTIONS = getString("Constants.DeleteActions");
	public static final String LABEL_LIST_ACTIONS = getString("Constants.ListActions");
	public static final String LABEL_CREATE_ACTIONS = getString("Constants.CreateActions");
	public static final String LABEL_EDIT_ACTIONS = getString("Constants.EditActions");
	public static final String LABEL_WIZARD_PANELS = getString("Constants.WizardPanels");
	public static final String LABEL_PRESENTATION_LAYER = getString("Constants.PresentationLayer");
	public static final String LABEL_USER_DEFINED_FIELD = getString("Constants.UserdefinedField");
	public static final String LABEL_USER_DEFINED_FCO_REL = getString("Constants.UserdefinedFCORelation");
	public static final String LABEL_USER_DEFINED_CONTAINER = getString("Constants.UserdefinedContainer");
	public static final String LABEL_USE_FILE_OPEN_TO_SELECT_A_XML = getString("Constants.UseFileOpen");
	public static final String LABEL_FCO = getString("Constants.FCO");
	public static final String LABEL_EXTENDS = getString("Constants.extends");
	public static final String LABEL_DATA_TYPE = getString("Constants.DataType");
	public static final String LABEL_FCO_FIELDNAME = getString("Constants.FCOFieldname");
	public static final String LABEL_CONTAINER_FIELD = getString("Constants.ContainerField");

	public static void reload() {
		RESOURCE_BUNDLE = ResourceBundleManager.reloadResourceBundle(new String[]{BUNDLE_NAME,BUNDLE_NAME_GENERATOR});
	}

}
