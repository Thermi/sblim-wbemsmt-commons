/** 
 * EditBasePanel.java
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
 * Description: BasePanel for Editor Panels
 * 
 */
package org.sblim.wbemsmt.tools.jsf;

import java.lang.reflect.Method;
import java.util.Map;

import javax.faces.component.UIPanel;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.ajax.panel.AjaxPanelPhaseListener;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.InitContainerException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;

public abstract class EditBasePanel extends BasePanel implements DataContainer {

	protected static final String BINDING_PREFIX_CURRENT_PAGE = "objectActionController.currentEditor.currentEditPage.";
	private HtmlPanelGrid panelGrid;

	/**
	 * The key is used by the ajaxPanels to get the defined update interval and
	 * the key is also used by BasePanel.setTitle to create a toolbox to configure that interval 
	 */
	protected String updateIntervalKey;
	
	public EditBasePanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String keyForTitle,boolean dynamic) {
		this(adapter,bindingPrefix,keyForTitle, 1, dynamic);
	}
	
	public EditBasePanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String keyForTitle, int cols,boolean dynamic) {
		super(adapter, bindingPrefix, keyForTitle );
		
		panelGrid = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		panelGrid.setColumns(cols);
		panelGrid.setWidth("100%");
		panelGrid.setCellpadding("0");
		panelGrid.setCellspacing("0");
		
		if (dynamic)
		{
			updateIntervalKey = getClass().getName();
			setTitle(panelGrid,updateIntervalKey);
		}
		else
		{
			setTitle(panelGrid);
		}

	}
	

	public HtmlPanelGrid getPanelForCustomLayout()
	{
		return panelGrid;
	}

	protected void addComponent(LabeledJSFInputComponent inputComponent)
	{
		addComponent(panelGrid,inputComponent);
	}

	public UIPanel getInputFieldContainer()
	{
		return ajaxPanelGroup != null ? (UIPanel)ajaxPanelGroup : (UIPanel)panelGrid;
	}

	public void checkForUpdateControls() {

		String key = "updateControls." + this.toString();
		String ajaxKey = AjaxPanelPhaseListener.AJAX_PARAMETER;
		FacesContext fc = FacesContext.getCurrentInstance();
		Map requestParameterMap = fc.getExternalContext().getRequestParameterMap();
		Map requestMap = fc.getExternalContext().getRequestMap();
		
		synchronized (fc) {
			if ( requestParameterMap.containsKey(ajaxKey) && 
					!requestMap.containsKey(key))
			{
				if (this.getAdapter().periodicalRefreshEnabled(this))
				{
					try {
						//first set the key in the requestMap so that
						//subsequent getXYZ() calls are not leading to a infinite loop
						requestMap.put(key, "true");				
						
						try {
							Method m = this.getClass().getMethod("updateControls", null);
							m.invoke(this, null);
						} catch (Exception e) {
							e.printStackTrace();
						}
						
						
						this.getAdapter().updateControls(this);
						//this.updateControls();
					} catch (UpdateControlsException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	
	public String getUpdateIntervalKey() {
		return updateIntervalKey;
	}

	public void setUpdateIntervalKey(String updateIntervalKey) {
		this.updateIntervalKey = updateIntervalKey;
	}
	
	/**
	 * can be overwritten by the subclassses to count and cerate the children objects
	 * @throws InitContainerExceptio
	 */
	
	public void countAndCreateChildren() throws InitContainerException 	{}

	/**
	 * 
	 * @throws UpdateControlsException
	 */
	public void updateControls() throws UpdateControlsException {}
	
}
