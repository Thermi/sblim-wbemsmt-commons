/** 
 * GenericFieldDataConverter.java
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
 * @author:	Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 *              
 *
 * Description: Class for Converting GenericFieldDatas 
 * 
 */

package org.sblim.wbemsmt.tools.converter.cli;

import javax.cim.UnsignedInteger16;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.bl.fielddata.GenericFieldData;
import org.sblim.wbemsmt.tools.converter.StringArrayConverter;
import org.sblim.wbemsmt.util.StringUtil;

public class GenericFieldDataConverter implements StringArrayConverter {

	private GenericFieldData genericFieldData;
    private String[] values;
    private boolean showAllInReadOnlyView;
    private boolean readOnly;
	
    /**
	 * return the text to set (as String)
	 */
	public Object convertForGui(Object value) {
	    GenericFieldData fieldData = (GenericFieldData) value;
	    if (fieldData == null || fieldData.getData() == null || fieldData.getType() == null)
	    {
	        return "";
	    }
	    if (fieldData.getType() == GenericFieldData.TYPE_TEXT || fieldData.getType() == GenericFieldData.TYPE_LABEL)
	    {
	        return fieldData.getData().toString();
	    }
        if (fieldData.getType() == GenericFieldData.TYPE_PASSWORD)
        {
            return "********";
        }
        if (fieldData.getType() == GenericFieldData.TYPE_CHECKBOX)
        {
            return "" + ((Boolean)fieldData.getData()).booleanValue();
        }
        if (fieldData.getType() == GenericFieldData.TYPE_COMBOBOX
            || fieldData.getType() == GenericFieldData.TYPE_RADIOBUTTON     
            )
        {
            if (readOnly && showAllInReadOnlyView)
            {
                return StringUtil.asString(values, ", ");
            }
            else
            {
                int idx = ((Number)fieldData.getData()).intValue();
                return values[idx];
            }
        }
	    
		throw new IllegalArgumentException("GenericFieldData with type = " + fieldData.getType() + " is not registered" );
	}

	/**
	 * Converts the value into generic field data 
	 */
	public Object convertForModel(Object guiElement) {
        
        if (genericFieldData == null || genericFieldData.getType() == null || guiElement == null)
        {
            return null;
        }
        if (genericFieldData.getType() == GenericFieldData.TYPE_TEXT
            || genericFieldData.getType() == GenericFieldData.TYPE_PASSWORD
            || genericFieldData.getType() == GenericFieldData.TYPE_LABEL )
        {
            genericFieldData.setData(guiElement);
            return genericFieldData;
        }
        if (genericFieldData.getType() == GenericFieldData.TYPE_CHECKBOX)
        {
            genericFieldData.setData(new Boolean(guiElement.toString().equalsIgnoreCase("yes") || guiElement.toString().equalsIgnoreCase("true")));
            return genericFieldData;
        }
        if (genericFieldData.getType() == GenericFieldData.TYPE_COMBOBOX
            || genericFieldData.getType() == GenericFieldData.TYPE_RADIOBUTTON     
            )
        {
            genericFieldData.setData(null);
            for (int i = 0; i < values.length; i++) {
                String value = values[i];
                if (value.equals(guiElement))
                {
                    genericFieldData.setData(new UnsignedInteger16(i));
                }
            }
            return genericFieldData;
        }
        
        throw new IllegalArgumentException("GenericFieldData with type = " + genericFieldData.getType() + " is not registered" );
	}

	/**
	 * Returns if the fieldData.type and the guiElement is matching 
	 */
	public boolean canConvert(Object guiElement) {
        
	    if (guiElement == null)
        {
            return true;
        }
        if ((genericFieldData.getType() == GenericFieldData.TYPE_TEXT
            || genericFieldData.getType() == GenericFieldData.TYPE_PASSWORD
            || genericFieldData.getType() == GenericFieldData.TYPE_LABEL )
            && guiElement instanceof String)
        {
            return true;
        }
        if (genericFieldData.getType() == GenericFieldData.TYPE_CHECKBOX)
        {
            try {
                return "true".equalsIgnoreCase(guiElement.toString()) || "false".equalsIgnoreCase(guiElement.toString())
                       || "yes".equalsIgnoreCase(guiElement.toString()) || "no".equalsIgnoreCase(guiElement.toString());
            }
            catch (RuntimeException e) {
                return false;
            }
        }
        if (genericFieldData.getType() == GenericFieldData.TYPE_COMBOBOX
            || genericFieldData.getType() == GenericFieldData.TYPE_RADIOBUTTON     
            )
        {
            try {
                for (int i = 0; i < values.length; i++) {
                    String value = values[i];
                    if (value.equals(guiElement))
                    {
                        return true;
                    }
                }
                return false;
            }
            catch (RuntimeException e) {
                return false;
            }
        }
        return false;
	}

	public String getTypeForModel() {
		return ClassUtils.getShortClassName(GenericFieldData.class);
	}

    public void setGenericFieldData(GenericFieldData value) {
        this.genericFieldData = value;
    }

    public void setValues(String[] values) {
        this.values = values;
    }

    public String[] getValues() {
        if (genericFieldData!= null)
        {
            if (genericFieldData.getType() == GenericFieldData.TYPE_CHECKBOX)
            {
                return new String[]{"true","yes","false","no"};
            }
        }
        
        return values;
    }

    public boolean isShowAllInReadOnlyView() {
        return showAllInReadOnlyView;
    }

    public void setShowAllInReadOnlyView(boolean showAllInReadOnlyView) {
        this.showAllInReadOnlyView = showAllInReadOnlyView;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }
	
    
    
}
