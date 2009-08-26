 /** 
  * BasePanel.java
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

import javax.cim.UnsignedInteger16;
import javax.cim.UnsignedInteger32;
import javax.faces.component.UIComponentBase;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.ajax.panel.AjaxPanelGroup;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.converter.test.DummyConverter;
import org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter;
import org.sblim.wbemsmt.tools.converter.test.UnsignedInt32StringConverter;
import org.sblim.wbemsmt.tools.input.jsf.*;
import org.sblim.wbemsmt.tools.resources.*;
import org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;
import org.sblim.wbemsmt.webapp.jsf.style.StyleBean;

public abstract class BasePanel  {

	//private static final String SUFFIX_INPUT = "Input";
	protected String title;
	protected CimObjectKey key;
	protected MessageList messageList;
	protected Converter stringHtmlInputConverter = new DummyConverter();
	protected Converter int32HtmlInputConverter = new UnsignedInt32StringConverter();
	protected Converter int16HtmlInputConverter = new UnsignedInt16StringConverter();
	protected WbemSmtResourceBundle bundle;
	protected AbstractBaseCimAdapter adapter;	private String keyForTitle = null;
	protected String expressionPrefix;
	private String footerTextKey;
	private String footerText;
	protected AjaxPanelGroup ajaxPanelGroup;

	//Defines the minimum length of a children table
	public static final int MIN_TABLE_LENGTH = 3;
	
    protected static final Logger logger = Logger.getLogger("org.sblim.wbemsmt.tools.jsf");
	
	public BasePanel(AbstractBaseCimAdapter adapter, String expressionPrefix)
	{
		this(adapter,expressionPrefix,null);
	}
	
	public BasePanel(AbstractBaseCimAdapter adapter, String expressionPrefix, String keyForTitle) {
		this.adapter = adapter;
		this.expressionPrefix = expressionPrefix;
		ILocaleManager localeManager = LocaleManager.getCurrent(FacesContext.getCurrentInstance());
		bundle = adapter.getBundle();
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
	
	public static void addComponent(UIComponentBase parentComponent, LabeledJSFInputComponent inputComponent)
	{
		if (inputComponent instanceof JSFButtonComponent) {
			//Buttons have no label and should therefore be stores in first columne
			parentComponent.getChildren().add(inputComponent.getComponentPanel());
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
			group.getChildren().add(inputComponent.getComponentPanel());
			parentComponent.getChildren().add(group);
		}
	}

	private static HtmlPanelGrid createComponentTable(int cols) {
		HtmlPanelGrid group = (HtmlPanelGrid)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		group.setStyleClass("componentTable");
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

	protected void setTitle(HtmlPanelGrid panelGrid, String updateIntervalKey) {
		HtmlPanelGroup group = (HtmlPanelGroup)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);

		HtmlOutputText text = (HtmlOutputText)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		text.setValueExpression("value",FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + expressionPrefix + "titleText"  + "}&nbsp;&nbsp;", Object.class));
		text.setStyleClass("tableHeader");
		text.setEscape(false);
		panelGrid.setHeaderClass("tableHeader");

		group.getChildren().add(text);
	
		//we want a toolbox for defining the dynamic update interval
		if (updateIntervalKey != null)
		{
	    	FacesContext fc = FacesContext.getCurrentInstance();

//			HtmlPanelGrid grid = (HtmlPanelGrid)fc.getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
//			grid.setStyle("position:absolute;top:0px;left:0px;visibility:hidden;z-index:100");
//			grid.setStyleClass("waitDlg");
//			grid.setRowClasses("waitDlgMsgRow");
//			grid.setCellpadding("0");
//			grid.setCellspacing("0");
//			grid.setColumns(1);
//			String settingsKey = LabeledJSFInputComponent.asJsfId("settings_" + updateIntervalKey);
//			grid.setId(settingsKey);
//
//			HtmlPanelGroup group2 = (HtmlPanelGroup)fc.getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
//			grid.getChildren().add(group2);
//			
//			HtmlOutputText label = (HtmlOutputText)fc.getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
//			label.setStyleClass("fieldLabel");
//			label.setValueExpression("value", fc.getApplication().createValueExpression("#{messages.updateInterval}<br><br>"));
//			label.setEscape(false);
//
//			HtmlInputText txt = (HtmlInputText)fc.getApplication().createComponent(HtmlInputText.COMPONENT_TYPE);
//			txt.setSize(10);
//			txt.setId(settingsKey + SUFFIX_INPUT);
//			txt.setValueExpression("value", BeanNameConstants.OBJECT_ACTION_CONTROLLER.asValueExpression(FacesContext.getCurrentInstance(), "#'{'{0}.updateInterval[''" + updateIntervalKey + "'']'}'"));
//			
//			HtmlCommandButton btn = (HtmlCommandButton)fc.getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE);
//			btn.setValueExpression("value", fc.getApplication().createValueExpression("#{messages.ok}"));
//			btn.setAction(FacesContext.getCurrentInstance().getApplication().createMethodExpression("#{" + BeanNameConstants.OBJECT_ACTION_CONTROLLER.getName() + ".setInterval" + "}",new Class[]{}));
//
//			group2.getChildren().add(label);
//			group2.getChildren().add(txt);
//			group2.getChildren().add(btn);
			
			
			HtmlPanelGroup group1 = (HtmlPanelGroup)fc.getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
			
			HtmlGraphicImage image = (HtmlGraphicImage)fc.getApplication().createComponent(HtmlGraphicImage.COMPONENT_TYPE);
			image.setValueExpression("onclick",fc.getApplication().getExpressionFactory().createValueExpression(fc.getELContext(), "toggleToolbox(this,'#{objectActionController.updateInterval['"+ updateIntervalKey +"']}','"+updateIntervalKey+"')", Object.class));
			image.setValueExpression("value",fc.getApplication().getExpressionFactory().createValueExpression(fc.getELContext(), "#{style.resourceDir}/images/settings.gif", Object.class));
			image.setValueExpression("title",fc.getApplication().getExpressionFactory().createValueExpression(fc.getELContext(), "#{messages.configure_update_interval}", Object.class));
			image.setValueExpression("alt",fc.getApplication().getExpressionFactory().createValueExpression(fc.getELContext(), "#{messages.configure_update_interval}", Object.class));
			image.setStyle("vertical-align:middle");
			group1.getChildren().add(image);

//			HtmlOutputText label1 = (HtmlOutputText)fc.getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
//			label1.setValue("<br>");
//			label1.setEscape(false);
//			group1.getChildren().add(label1);
			
			
			group.getChildren().add(group1);
			//group.getChildren().add(grid);	
		}
		
		group.getChildren().add(JsfUtil.createText("<br><hr class=\"tableHeaderHR\"/>"));
		
		
		panelGrid.getFacets().put("header",group);
	}

	//set the title
	protected void setTitle(HtmlPanelGrid panelGrid) {
		setTitle(panelGrid,null);
	}
	
	protected void createTitleValueExpressionForMultiline(HtmlPanelGrid panelGrid, String expressionForTitle, String keyForTitle) {
		
		this.keyForTitle = keyForTitle;
		this.title = bundle.getString(keyForTitle);

		if (!"".equals(title))
		{
			HtmlPanelGroup group = (HtmlPanelGroup)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
			

			HtmlOutputText text = (HtmlOutputText)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
			text.setValueExpression("value",FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), expressionForTitle, Object.class));
			text.setStyleClass("tableHeader");
			panelGrid.setHeaderClass("tableHeader");
			
			group.getChildren().add(text);
			group.getChildren().add(JsfUtil.createText("<br><hr class=\"tableHeaderHR\"/>"));
			
			panelGrid.getFacets().put("header",group);
		}
		
	}

	
	//set the title
	protected void setFooter(HtmlPanelGrid panelGrid, String key) {

		setFooter(panelGrid,key,"#{" + expressionPrefix + "footerText"  + "}");
		
	}
	
	//set the title
	protected void setFooter(HtmlPanelGrid panelGrid, String key, String expression) {
		
		
		
		footerTextKey = key;
		if (bundle.keyExists(key) || this instanceof WizardBasePanel)
		{
			StyleBean style = (StyleBean) BeanNameConstants.STYLE.getBoundValue(FacesContext.getCurrentInstance());
			
			HtmlPanelGroup group = (HtmlPanelGroup)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
			
			HtmlPanelGrid table = (HtmlPanelGrid)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
			table.setColumns(2);
			table.setColumnClasses("tableFooterIcon,tableFooter");
			group.getChildren().add(table);

			panelGrid.setFooterClass("tableFooter");
			panelGrid.getFacets().put("footer",group);

			
			if (bundle.keyExists(key))
			{
				footerText = bundle.getString(key);
				String altExpression = "#{messages.info}";

				HtmlGraphicImage img = (HtmlGraphicImage)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlGraphicImage.COMPONENT_TYPE);
				img.setStyle("border:0px");
				img.setUrl(style.getResourceDir()+"/images/info.gif");
				img.setValueExpression("alt",FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), altExpression, Object.class));
				img.setValueExpression("title",FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), altExpression, Object.class));
				
				table.getChildren().add(img);
				
				HtmlOutputText text = (HtmlOutputText)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
				text.setValueExpression("value",FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), expression, Object.class));
				text.setStyleClass("tableFooter");
				table.getChildren().add(text);
			}

			if (this instanceof WizardBasePanel)
			{
				addRequiredIconLegend(style,table,"#{objectActionController.currentWizard.currentPanel.requiredVisible}");
				addErrorIconLegend(style,table,"#{objectActionController.currentWizard.currentPanel.errorVisible}");
			}
			
			
		}
		
	}

	public static void addErrorIconLegend(StyleBean style, HtmlPanelGrid table,String visibleExpression) {
		String expression = "#{messages.fieldError}";
		String image = "/images/fieldIndicatorError.png";
		addLegend(style, table, expression, image,visibleExpression);
	}

	public  static void addRequiredIconLegend(StyleBean style, HtmlPanelGrid table, String visibleExpression) {
		String expression = "#{messages.fieldRequired}";
		String image = "/images/fieldIndicatorRequired.png";
		addLegend(style, table, expression, image,visibleExpression);
	}

	private static void addLegend(StyleBean style, HtmlPanelGrid table, String expression, String image, String visibleExpression) {
		HtmlGraphicImage img = (HtmlGraphicImage)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlGraphicImage.COMPONENT_TYPE);
		img.setStyle("border:0px");
		img.setValueExpression("alt",FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), expression, Object.class));
		img.setValueExpression("title",FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), expression, Object.class));
		img.setValueExpression("rendered",FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), visibleExpression, Object.class));
		img.setUrl(style.getResourceDir()+image);
		table.getChildren().add(img);
		
		HtmlOutputText text = (HtmlOutputText)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		text.setValueExpression("value",FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), expression, Object.class));
		text.setValueExpression("rendered",FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), visibleExpression, Object.class));
		text.setStyleClass("tableFooter");
		table.getChildren().add(text);
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

	public void addAjaxPanel(HtmlPanelGrid panel) {
		FacesContext fc = FacesContext.getCurrentInstance();
		ajaxPanelGroup =  (AjaxPanelGroup)fc.getApplication().createComponent(AjaxPanelGroup.COMPONENT_TYPE);
		ajaxPanelGroup.setPeriodicalUpdate(((ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(fc)).getDefaultUpdateInterval());
		ajaxPanelGroup.getChildren().add(panel);			
	}

}
