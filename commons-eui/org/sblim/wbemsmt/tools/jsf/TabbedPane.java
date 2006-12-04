 /** 
  * TabbedPane.java
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
  * Description: Helper-Object for creating JSF-tabbed-Panels
  * 
  */
package org.sblim.wbemsmt.tools.jsf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.faces.application.Application;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlCommandLink;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.apache.myfaces.custom.panelstack.HtmlPanelStack;
import org.apache.myfaces.custom.tabbedpane.HtmlPanelTab;
import org.apache.myfaces.custom.tabbedpane.HtmlPanelTabbedPane;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.LocaleChangeListener;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class TabbedPane
{
	List bundleKeys = new ArrayList();
	List tabPanels = new ArrayList();
	List ids = new ArrayList();
	private HtmlPanelGrid panel;
	private Map idsByTabName = new HashMap();
	private WbemSmtResourceBundle bundle;
	//private HtmlForm form;
	
	public TabbedPane(WbemSmtResourceBundle resourceBundle)
	{
		this.bundle = resourceBundle;
		ILocaleManager localeManager = (ILocaleManager)BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
		localeManager.addLocaleChangeListener(new LocaleChangeListener()
		{
			public void localeChanged(Locale newLocale) {
				bundle = ResourceBundleManager.getResourceBundle(bundle.getBundleNames());
			}
		});
	}
	
	public void addTab(String id, String bundleKey, HtmlPanelGrid panel)
	{
		ids.add(id);
		bundleKeys.add(bundleKey);
		tabPanels.add(panel);
	}
	
	/**
	 * For creation of Tomahawk TabPanel
	 * @param createOKCancelButtons 
	 */
	
	public void create(boolean createOKCancelButtons)
	{
		FacesContext fc = FacesContext.getCurrentInstance();
		Application app = fc.getApplication();
		
		panel = createTable(1,"noBorder", "noBorder","100%",0,0);
//		form = (HtmlForm) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlForm.COMPONENT_TYPE);
//		panel.getChildren().add(form);
		
		HtmlPanelTabbedPane tabbedPane = (HtmlPanelTabbedPane) app.createComponent(HtmlPanelTabbedPane.COMPONENT_TYPE);
		tabbedPane.setStyle("width:100%");
		tabbedPane.setId("tabbedPane");
		tabbedPane.setServerSideTabSwitch(true);
		tabbedPane.setActiveTabStyleClass("activeTab");
		tabbedPane.setInactiveTabStyleClass("inactiveTab");
		tabbedPane.addTabChangeListener(new TabbedPaneChangeListener());
		tabbedPane.setValueBinding("selectedIndex",app.createValueBinding("#{objectActionController.selectedTabIndex}"));
		panel.getChildren().add(tabbedPane);

		String[] bundleKeyArray = (String[]) this.bundleKeys.toArray(new String[this.bundleKeys.size()]);
		for (int i = 0; i < bundleKeyArray.length; i++) {
			String bundleKey = bundleKeyArray[i];
			String id = (String) ids.get(i);
			addTab(app,tabbedPane,i,bundleKey,id);
		}
		
		if (createOKCancelButtons)
		{
			addOKCancelButtons();
		}
	}
	
	
	private void addOKCancelButtons() {
		
		HtmlCommandButton btnOK = (HtmlCommandButton) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE);
		btnOK.setValueBinding("value",FacesContext.getCurrentInstance().getApplication().createValueBinding("#{messages.ok}"));
		String binding = "#{" + BeanNameConstants.OBJECT_ACTION_CONTROLLER.getName() + ".currentEditListener.save" + "}";
		btnOK.setAction(FacesContext.getCurrentInstance().getApplication().createMethodBinding(binding,null));
		btnOK.setId("editok");
		
		HtmlCommandButton btnCancel = (HtmlCommandButton) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE);
		btnCancel.setValueBinding("value",FacesContext.getCurrentInstance().getApplication().createValueBinding("#{messages.cancel}"));
		binding = "#{" + BeanNameConstants.OBJECT_ACTION_CONTROLLER.getName() + ".currentEditListener.cancel" + "}";
		btnCancel.setAction(FacesContext.getCurrentInstance().getApplication().createMethodBinding(binding,null));
		btnCancel.setId("editcancel");

		HtmlPanelGroup buttonGroup = (HtmlPanelGroup) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
		HtmlOutputText text1 = (HtmlOutputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		text1.setEscape(false);
		text1.setValue("<br>");
		HtmlOutputText text2 = (HtmlOutputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		text2.setEscape(false);
		text2.setValue("&nbsp;&nbsp;");
		
		buttonGroup.getChildren().add(text1);
		buttonGroup.getChildren().add(btnOK);
		buttonGroup.getChildren().add(text2);
		buttonGroup.getChildren().add(btnCancel);

		panel.getChildren().add(buttonGroup);
		
	}

	private void addTab(Application app, HtmlPanelTabbedPane tabbedPane, int i, String bundleKey, String id) {
		HtmlPanelTab tab  = (HtmlPanelTab) app.createComponent(HtmlPanelTab.COMPONENT_TYPE);
		tab.setId("Tab_" + LabeledJSFInputComponent.asJsfId(id));
		
		String binding = "#{" + BeanNameConstants.OBJECT_ACTION_CONTROLLER.getName() + ".tabbedPane.bundle['" + bundleKey + "']}";
		tab.setValueBinding("label",FacesContext.getCurrentInstance().getApplication().createValueBinding(binding));

		tabbedPane.getChildren().add(tab);
		HtmlPanelGrid content = (HtmlPanelGrid)tabPanels.get(i);
		content.setWidth("100%");
		tab.getChildren().add(content);
	}

	/**
	 * For creation of self-implemented TabPanel
	 *
	 */
	public void createPanelBasedTabs()
	{
		FacesContext fc = FacesContext.getCurrentInstance();
		Application app = fc.getApplication();
		
		panel = createTable(1,"noBorder", "noBorder","100%",0,0);
		HtmlPanelStack stack = (HtmlPanelStack) app.createComponent(HtmlPanelStack.COMPONENT_TYPE);
		stack.setId("stack");
		stack.setValueBinding("selectedPanel",app.createValueBinding("#{objectActionController.selectedTabId}"));
		panel.getChildren().add(stack);

		String[] tabNames = (String[]) this.bundleKeys.toArray(new String[this.bundleKeys.size()]);
		for (int i = 0; i < tabNames.length; i++) {
			String tabName = tabNames[i];
			addTab(fc,app,stack,i,tabName,tabNames);
		}
	}

	
	private void addTab(FacesContext fc, Application app, HtmlPanelStack stack, int idx, String tabName, String[] names) {
		
		String id = (String)ids.get(idx);
		HtmlPanelGrid content = (HtmlPanelGrid)tabPanels.get(idx);
		
		HtmlPanelGrid tabPanel = createTable(1,"noBorder", "noBorder","100%",0,0);
		id = LabeledJSFInputComponent.asJsfId(id);
		ids.set(idx,id);
		tabPanel.setId(id);
		stack.getChildren().add(tabPanel);
		
		idsByTabName .put(tabName,id);
		
		HtmlPanelGrid panelWithTabs =  createTable(names.length + 1,"panelWithTabs", "panelWithTabs","100%",0,0);
		
		HtmlPanelGrid tab = null; 
		HtmlOutputText text = null;
		
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			
			if (name.equals(tabName))
			{
				tab =  createTable(1,"tabActive", "tabActive","100%",10,0);
				text = (HtmlOutputText) app.createComponent(HtmlOutputText.COMPONENT_TYPE);
				text.setStyle("font-weight:bold");
				text.setValue(name);
				tab.getChildren().add(text);
			}
			else
			{
				tab =  createTable(1,"tabNotActive", "tabNotActive","100%",10,0);
				HtmlCommandLink link = (HtmlCommandLink) app.createComponent(HtmlCommandLink.COMPONENT_TYPE);
				link.setActionListener(app.createMethodBinding("#{objectActionController.setTab}",new Class[]{ActionEvent.class}));
				link.setStyle("font-weight:normal");
				link.setValue(name);
				tab.getChildren().add(link);
			}
			panelWithTabs.getChildren().add(tab);
		}
		tab = createTable(1,"tabDummyRemainder", "tabDummyRemainder","5%",10,0);
		text = (HtmlOutputText) app.createComponent(HtmlOutputText.COMPONENT_TYPE);
		text.setValue("&nbsp;");
		text.setEscape(false);
		tab.getChildren().add(text);
		panelWithTabs.getChildren().add(tab);
		
		tabPanel.getChildren().add(panelWithTabs);
		
		content.setStyle("background-color:#D9D9D9");
		content.setWidth("100%");
		tabPanel.getChildren().add(content);
		
	}

	private HtmlPanelGrid createTable(int cols, String styleClass, String styleColumn, String width, int cellpading, int cellspacing) {
		Application app = FacesContext.getCurrentInstance().getApplication();
		HtmlPanelGrid table = (HtmlPanelGrid) app.createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		table.setStyleClass(styleClass);
		table.setColumnClasses(styleColumn);
		table.setWidth(width);
		table.setColumns(cols);
		table.setCellpadding(""+cellpading);
		table.setCellspacing(""+cellspacing);
		return table;
		
	}

	public HtmlPanelGrid getPanel()
	{
		return panel;
	}
	
	public String getIdByTabname(String tabName)
	{
		return (String) idsByTabName.get(tabName);
	}
	
	public String getFirstId()
	{
		return (String) ids.get(0);
	}

	
	public WbemSmtResourceBundle getBundle() {
		return bundle;
	}

	public void setBundle(WbemSmtResourceBundle bundle) {
		this.bundle = bundle;
	}

	public String getString(String key) {
		return bundle.getString(key);
	}
	
	
	
}
