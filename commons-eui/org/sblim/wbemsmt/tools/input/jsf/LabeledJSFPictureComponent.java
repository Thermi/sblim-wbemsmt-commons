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
		    if (data.getPath() != null)
		    {
		        item = MessageFormat.format("/servlet/WbemsmtImageLoader?path={0}", new Object[]{data.getPath()});
		    }
		    else if (data.getIcon() != null)
		    {
		        if (data.getIcon() == PictureData.ICON_INFO)
		        {
		            item = "/images/info.gif";
		        }
		        else if (data.getIcon() == PictureData.ICON_WARNING)
                {
                    item = "/images/warning.gif";
                }
		        else if (data.getIcon() == PictureData.ICON_ERROR)
                {
                    item = "/images/error.gif";
                }
		        else if (data.getIcon() == PictureData.ICON_FATAL)
                {
                    item = "/images/fatal.gif";
                }
                else if (data.getIcon() == PictureData.ICON_SUPPORTED)
                {
                    item = "/images/supported.gif";
                }
                else if (data.getIcon() == PictureData.ICON_NOT_SUPPORTED)
                {
                    item = "/images/notSupported.gif";
                }
                else if (data.getIcon() == PictureData.ICON_EMPTY)
                {
                    item = "/images/empty.png";
                }
		        else
		        {
	               logger.warning("Predefined Icon not recognized for  " + getItemLabelText());
	               item = "/images/empty.png";
		        }
		    }
		    else
		    {
	           logger.warning("No path and no icon set for  " + getItemLabelText());
	           item = "/images/empty.png";
		    }
		}
		else
		{
			logger.warning("No PictureData set for  " + getItemLabelText());
            item = "/images/empty.png";
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
        img.setValueBinding("onmouseover", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"OnMouseOver}"));
        img.setValueBinding("onmouseout", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"OnMouseOut}"));
	}	
	
	public String getItemOnMouseOver()
	{
	    PictureData data = (PictureData) getFieldData();
	    if (data != null && data.getTooltip() != null)
	    {
	        return "showTooltip(event,'" + data.getTooltip().getText() + "')";
	    }
	    else
	    {
	        return "return true";
	    }
	}
	
	public String getItemPlainLabelText()
	{
	    PictureData data = (PictureData) getFieldData();
        if (data == null || data.getTooltip() == null)
        {
            return super.getItemPlainLabelText();
        }
        else
        {
            return null;
        }
	}
	
    public String getItemOnMouseOut()
    {
        PictureData data = (PictureData) getFieldData();
        if (data != null && data.getTooltip() != null)
        {
            return "hideTooltip(this.event)";
        }
        else
        {
            return "return true";
        }
    }
	
}
