 /** 
  * BasePanel.java
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
  * Description: Base class for JSF-Panels
  * 
  */
package org.sblim.wbemsmt.tools.jsf;

import java.util.Locale;
import java.util.logging.Logger;

import javax.faces.component.UIComponentBase;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.converter.test.DummyConverter;
import org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter;
import org.sblim.wbemsmt.tools.converter.test.UnsignedInt32StringConverter;
import org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxActionComponent;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLabelComponent;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.LocaleChangeListener;
import org.sblim.wbemsmt.tools.resources.LocaleManager;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public abstract class BasePanel {

	protected String title;
	protected CimObjectKey key;
	protected MessageList messageList;
	protected Converter stringHtmlInputConverter = new DummyConverter();
	protected Converter int32HtmlInputConverter = new UnsignedInt32StringConverter();
	protected Converter int16HtmlInputConverter = new UnsignedInt16StringConverter();
	protected WbemSmtResourceBundle bundle;
	private AbstractBaseCimAdapter adapter;
	private String keyForTitle = null;
	protected String bindingPrefix;
	private String footerTextKey;
	private String footerText;

    protected static final Logger logger = Logger.getLogger("org.sblim.wbemsmt.tools.jsf");
	
	public BasePanel(AbstractBaseCimAdapter adapter, String bindingPrefix)
	{
		this(adapter,bindingPrefix,null);
	}
	
	public BasePanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String keyForTitle) {
		this.adapter = adapter;
		this.bindingPrefix = bindingPrefix;
		ILocaleManager localeManager = LocaleManager.getCurrent(FacesContext.getCurrentInstance());
		bundle = ResourceBundleManager.getResourceBundle(getResourceBundleNames(),localeManager.getCurrentLocale());
		if (keyForTitle != null)
		{
			this.keyForTitle = keyForTitle;
			this.title = bundle.getString(keyForTitle);
		}
		localeManager.addLocaleChangeListener(new LocaleChangeListener()
		{
			public void localeChanged(Locale newLocale) {
				bundle = ResourceBundleManager.getResourceBundle(bundle.getBundleNames(),newLocale);				
				reload();
			}
		});
	}
	
	public abstract String[] getResourceBundleNames();

	public static void addComponent(UIComponentBase parentComponent, LabeledJSFInputComponent inputComponent)
	{
		if (inputComponent instanceof JSFButtonComponent) {
			//Buttons have no label and should therefore be stores in first columne
			parentComponent.getChildren().add(inputComponent.getComponent());
		}
		else if (inputComponent instanceof LabeledJSFCheckboxActionComponent
				 || inputComponent instanceof LabeledJSFCheckboxComponent
				) {
			HtmlPanelGrid group = createComponentTable(2);
			group.setColumnClasses("checkboxComponentTableLeft,checkboxComponentTableRight");
			group.getChildren().add(inputComponent.getComponentPanel()); 
			group.getChildren().add(inputComponent.getLabelPanel()); 
			parentComponent.getChildren().add(group);
		}
		else if (inputComponent instanceof LabeledJSFLabelComponent) {
			
			HtmlPanelGrid group = createComponentTable(2);
			group.setColumnClasses("labelComponentTableLeft,labelComponentTableRight");
			group.setWidth("100%");
			group.getChildren().add(inputComponent.getLabelPanel()); 
			group.getChildren().add(inputComponent.getComponentPanel()); 
			parentComponent.getChildren().add(group);
		}
		else
		{
			HtmlPanelGrid group = createComponentTable(1);
			group.getChildren().add(inputComponent.getLabelPanel());
			if (inputComponent.getComponentPanel() != null)
			{
				group.getChildren().add(inputComponent.getComponentPanel());
			}
			else
			{
				group.getChildren().add(inputComponent.getComponent());
			}
			parentComponent.getChildren().add(group);
		}
	}

	private static HtmlPanelGrid createComponentTable(int cols) {
		HtmlPanelGrid group = (HtmlPanelGrid)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		group.setColumnClasses("componentTableLeft,componentTableRight");
		group.setColumns(cols);
		group.setCellpadding("0");
		group.setCellspacing("0");
		group.setWidth("0%");
		return group;
	}
	
	public void setKey(CimObjectKey key) {
		this.key = key;
	
	}

	public CimObjectKey getKey() {
		return key;
	}

		//set the title
	protected void setTitle(HtmlPanelGrid panelGrid) {
		HtmlPanelGroup group = (HtmlPanelGroup)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);

		HtmlOutputText text = (HtmlOutputText)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		text.setValueBinding("value",FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + bindingPrefix + "titleText"  + "}"));
		text.setStyleClass("tableHeader");
		panelGrid.setHeaderClass("tableHeader");

		group.getChildren().add(text);
		group.getChildren().add(JsfUtil.createText("<br><hr class=\"tableHeaderHR\"/>"));
		
		panelGrid.getFacets().put("header",group);
	}
	
	protected void createTitleValueBindingForMultiline(HtmlPanelGrid panelGrid, String bindingForTitle, String keyForTitle) {
		
		this.keyForTitle = keyForTitle;
		this.title = bundle.getString(keyForTitle);

		if (!"".equals(title))
		{
			HtmlPanelGroup group = (HtmlPanelGroup)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
			

			HtmlOutputText text = (HtmlOutputText)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
			text.setValueBinding("value",FacesContext.getCurrentInstance().getApplication().createValueBinding(bindingForTitle));
			text.setStyleClass("tableHeader");
			panelGrid.setHeaderClass("tableHeader");
			
			group.getChildren().add(text);
			group.getChildren().add(JsfUtil.createText("<br><hr class=\"tableHeaderHR\"/>"));
			
			panelGrid.getFacets().put("header",group);
		}
		
	}

	//set the title
	protected void setFooter(HtmlPanelGrid panelGrid, String key) {

		setFooter(panelGrid,key,"#{" + bindingPrefix + "footerText"  + "}");
		
	}
	
	//set the title
	protected void setFooter(HtmlPanelGrid panelGrid, String key, String binding) {
		
		
		footerTextKey = key;
		if (bundle.keyExists(key))
		{
			footerText = bundle.getString(key);

			HtmlPanelGroup group = (HtmlPanelGroup)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
			
			HtmlPanelGrid table = (HtmlPanelGrid)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
			table.setColumns(2);
			table.setColumnClasses("tableFooter tableFooterIcon,tableFooter");
			group.getChildren().add(table);
			
			HtmlGraphicImage img = (HtmlGraphicImage)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlGraphicImage.COMPONENT_TYPE);
			img.setStyle("border:0px");
			img.setUrl("/images/info.gif");
			table.getChildren().add(img);
			
			HtmlOutputText text = (HtmlOutputText)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
			text.setValueBinding("value",FacesContext.getCurrentInstance().getApplication().createValueBinding(binding));
			text.setStyleClass("tableFooter");
			table.getChildren().add(text);
			
			panelGrid.setFooterClass("tableFooter");
			panelGrid.getFacets().put("footer",group);
		}
		
	}

	public String getTitleText()
	{
		return title;
	}

	public String getFooterText()
	{
		return footerText;
	}

	public AbstractBaseCimAdapter getAdapter() {
		return adapter;
	}

	public void setAdapter(AbstractBaseCimAdapter adapter) {
		this.adapter = adapter;
	}

	public void setMessagesList(MessageList messageList) {
		this.messageList = messageList;
	}

	public MessageList getMessagesList() {
		return messageList;
	}
	
	public void reload() {
		if (keyForTitle != null)
		{
			this.title = bundle.getString(keyForTitle);
		}
		if (footerTextKey != null && bundle.keyExists(footerTextKey))
		{
			footerText = bundle.getString(footerTextKey);
		}
	}

}
