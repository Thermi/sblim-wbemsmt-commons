/** 
  *LabeledJSFPictureComponent.java
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
  * Description: a Pictrue with a label and the tooltip with the label text
  * 
  */

package org.sblim.wbemsmt.tools.input.jsf;

import java.text.MessageFormat;

import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.fielddata.FieldData;
import org.sblim.wbemsmt.bl.fielddata.PictureData;
import org.sblim.wbemsmt.tools.converter.Converter;

public class LabeledJSFPictureComponent extends LabeledJSFInputComponent {

	public LabeledJSFPictureComponent(DataContainer parent, String labelText,String id, Converter converter,boolean readOnly) {
		super(parent, labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlGraphicImage.COMPONENT_TYPE), converter,readOnly);
		setComponentBindings1(this, id);
	}

	public Object getItem() {
		
		PictureData data = (PictureData) getFieldData();
		if (data != null)
		{
			item = MessageFormat.format("/servlet/WbemsmtImageLoader?path={0}", new Object[]{data.getPath()});
		}
		else
		{
			logger.warning("No PictureData set for  " + getItemLabelText());
			item = MessageFormat.format("/servlet/WbemsmtImageLoader?path={0}", new Object[]{"/images/empty.gif"});
		}
		return item;
	}

	public void setFieldData(FieldData fieldData) {
		super.setFieldData(fieldData);
	}
	
	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		setComponentBindings1((LabeledJSFPictureComponent) comp,prefix);
	}

	private void setComponentBindings1(LabeledJSFPictureComponent component, String id) {
		HtmlGraphicImage img = ((HtmlGraphicImage)component.getComponent());
		img.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"}"));
		img.setValueBinding("alt", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"PlainLabelText}"));
		img.setValueBinding("title", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"PlainLabelText}"));
	}	
	
	
}
