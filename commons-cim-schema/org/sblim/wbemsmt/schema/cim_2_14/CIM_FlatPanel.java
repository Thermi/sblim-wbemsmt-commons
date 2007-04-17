/** 
 * CIM_FlatPanel.java
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
 * @author:	ECCG 0.9.7 generated 
 * 			(author should be changed, e.g. First and Last Name <xxx@cc.ibm.com>)
 *
 * Contributors:
 *
 *
 * Description:  Capabilities and management of the FlatPanel LogicalDevice.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;


/**
 *  Capabilities and management of the FlatPanel LogicalDevice.
 */
public class CIM_FlatPanel extends CIM_Display  {
	
	public final static String CIM_CLASS_NAME = "CIM_FlatPanel"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	An integer enumeration describing the type of flat panel display.
	*/
	public final static String CIM_PROPERTY_DISPLAYTYPE = "DisplayType"; //$NON-NLS-1$
	/**
	*	FlatPanel's horizontal resolution in Pixels.
	*/
	public final static String CIM_PROPERTY_HORIZONTALRESOLUTION = "HorizontalResolution"; //$NON-NLS-1$
	/**
	*	A description of the display illumination type. For example, backlit (value=2) or reflective (4) can be specified.
	*/
	public final static String CIM_PROPERTY_LIGHTSOURCE = "LightSource"; //$NON-NLS-1$
	/**
	*	A FlatPanel's scan mode indicating either single (value=2) or dual scan (3).
	*/
	public final static String CIM_PROPERTY_SCANMODE = "ScanMode"; //$NON-NLS-1$
	/**
	*	Boolean indicating whether the FlatPanel supports color display.
	*/
	public final static String CIM_PROPERTY_SUPPORTSCOLOR = "SupportsColor"; //$NON-NLS-1$
	/**
	*	FlatPanel's vertical resolution in Pixels.
	*/
	public final static String CIM_PROPERTY_VERTICALRESOLUTION = "VerticalResolution"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DISPLAYTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_HORIZONTALRESOLUTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_LIGHTSOURCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCANMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTSCOLOR);
		CIM_PropertyNameList.add(CIM_PROPERTY_VERTICALRESOLUTION);
				
		for (int i = 0; i < CIM_Display.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Display.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DISPLAYTYPE)||
				((String)CIM_Display.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HORIZONTALRESOLUTION)||
				((String)CIM_Display.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LIGHTSOURCE)||
				((String)CIM_Display.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCANMODE)||
				((String)CIM_Display.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTSCOLOR)||
				((String)CIM_Display.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VERTICALRESOLUTION)){
				continue;
			}
			
			CIM_FlatPanel.CIM_PropertyNameList.add(CIM_Display.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DISPLAYTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HORIZONTALRESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LIGHTSOURCE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCANMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTSCOLOR, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VERTICALRESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_Display.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Display.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DISPLAYTYPE)||
				((CIMProperty)CIM_Display.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HORIZONTALRESOLUTION)||
				((CIMProperty)CIM_Display.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LIGHTSOURCE)||
				((CIMProperty)CIM_Display.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCANMODE)||
				((CIMProperty)CIM_Display.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTSCOLOR)||
				((CIMProperty)CIM_Display.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VERTICALRESOLUTION)){
				continue;
			}
			
			CIM_FlatPanel.CIM_PropertyList.add(CIM_Display.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Display.Java_Package_List.size(); i++) {
			if (((String)CIM_Display.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Display.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DISPLAYTYPE = {"Unknown","Other","Passive Matrix LCD","Active Matrix LCD","Cholesteric LCD","Field Emission Display","Electro Luminescent Display","Gas Plasma","LED"};
	public final static String[] CIM_VALUEMAP_LIGHTSOURCE = {"Unknown","Other","Backlit","Edgelit","Reflective"};
	public final static String[] CIM_VALUEMAP_SCANMODE = {"Unknown","Other","Single Scan","Dual Scan"};
	
	
	public final static int DISPLAYTYPE_UNKNOWN = 0;
	public final static int DISPLAYTYPE_OTHER = 1;
	public final static int DISPLAYTYPE_PASSIVEMATRIXLCD = 2;
	public final static int DISPLAYTYPE_ACTIVEMATRIXLCD = 3;
	public final static int DISPLAYTYPE_CHOLESTERICLCD = 4;
	public final static int DISPLAYTYPE_FIELDEMISSIONDISPLAY = 5;
	public final static int DISPLAYTYPE_ELECTROLUMINESCENTDISPLAY = 6;
	public final static int DISPLAYTYPE_GASPLASMA = 7;
	public final static int DISPLAYTYPE_LED = 8;
	
	public final static int LIGHTSOURCE_UNKNOWN = 0;
	public final static int LIGHTSOURCE_OTHER = 1;
	public final static int LIGHTSOURCE_BACKLIT = 2;
	public final static int LIGHTSOURCE_EDGELIT = 3;
	public final static int LIGHTSOURCE_REFLECTIVE = 4;
	
	public final static int SCANMODE_UNKNOWN = 0;
	public final static int SCANMODE_OTHER = 1;
	public final static int SCANMODE_SINGLESCAN = 2;
	public final static int SCANMODE_DUALSCAN = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_FlatPanel() {

		this.cimInstance	= new CIMInstance();
		
		for (int i = 0; i < CIM_PropertyList.size(); i++) {
			this.cimInstance.addProperty((CIMProperty)((CIMProperty)CIM_PropertyList.get(i)).clone());
		}
		
		this.cimObjectPath 	= new CIMObjectPath(CIM_CLASS_NAME);
		this.cimInstance.setObjectPath(this.cimObjectPath);

		this.original_cimInstance	= (CIMInstance)this.cimInstance.clone();

		setValidCimInstance(false);
	}


	/**
	*	Class constructor
	*/	
	public CIM_FlatPanel(Vector keyProperties){ 
		this();
		
		if (keyProperties == null) {
			throw new InvalidParameterException("The keyProperties parameter does not contain a valid reference.");
		
		}
		
		Iterator iter = keyProperties.iterator();
		while (iter.hasNext()) {
			Object property = iter.next();
			
			if (property instanceof CIMProperty) {
				CIMProperty keyProperty = (CIMProperty)property;
				this.cimObjectPath.addKey(keyProperty);
				
				if (this.cimInstance.getProperty(keyProperty.getName()) != null) {
					this.cimInstance.removeProperty(keyProperty.getName());
				}
				this.cimInstance.addProperty(keyProperty);
				
			} else {
				throw new InvalidParameterException("The keyProperties parameter should only contain objects of class CIMProperty.");
				
			}
		}
		
		setValidCimInstance(false);
	}

	
	/**
	*	Class constructor
	*/	
	public CIM_FlatPanel(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!CIM_CLASS_NAME.equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class of the cimInstance must be of type " + CIM_CLASS_NAME + ".");
		}
		
		setCimInstance(cimInstance);
		this.original_cimInstance = (CIMInstance)cimInstance.clone();
		this.cimObjectPath        = cimObjectPath;
		setValidCimInstance(true);
	}

	
	/**
	*	The method returns the display name of the class
	*/	
	public String getClassDisplayName(){
		return CIM_CLASS_DISPLAYNAME;
	}
	
	//**********************************************************************
	// Instance methods
	//**********************************************************************

	/**
	*	no description
	*/	
	public boolean isDataValid(Vector invalidProperties) {
		boolean result = true;
		
		if (invalidProperties == null) {
			invalidProperties = new Vector();
		} else {
			invalidProperties.removeAllElements();
		}
		
		return result;
	}
	
	/**
	 * @return Returns the validCimInstance.
	 */
	public boolean isValidCimInstance() {
		return this.validCimInstance;
	}
	
	/**
	 * @param validCimInstance The validCimInstance to set.
	 */
	private void setValidCimInstance(boolean isValidCimInstance) {

		this.validCimInstance = isValidCimInstance;
	}
	
	
	/**
	*	The method returns this CIM instance
	*/
	public CIMInstance getCimInstance() {
		
		return this.cimInstance;
	}
	
	
	/**
	*	The method sets this CIM instance
	*/
	public void setCimInstance(CIMInstance cimInstance) {
		
		this.cimInstance = cimInstance;
	}
	
		
	/**
	*	The method returns this CIM object path
	*/
	public CIMObjectPath getCimObjectPath() {
		return this.cimObjectPath;
	}
	
	
	/**
	*	The method checks if the cimInstance has been modified
	*/
	public boolean isModified() {
	    
	    if (!this.original_cimInstance.equals(this.cimInstance)) 
	        return true;
	    
	    return false;
	}
	
	
	/**
	*	The method resets the values of the cimInstance
	*/	
	public void resetValues() {
	    this.cimInstance = (CIMInstance)this.original_cimInstance.clone();
	}
	
	
	/**
	*	The method checks if the cimInstance equals an other cimInstance
	*/	
	public boolean equals(Object object) {
	    
	    if (!(object instanceof CIM_FlatPanel)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FlatPanel)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FlatPanel)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FlatPanel)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FlatPanel)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FlatPanel)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FlatPanel)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FlatPanel)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FlatPanel)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FlatPanel)object).cimObjectPath)) {
	        return false;
	        
	    } 
	    
	    return true;
	}
	
	/**
	*	The method return this method as a string
	*/	
	public String toString() {
		return this.cimInstance.toString();
	}

	//*****************************************************
	// Associators methods
	//*****************************************************
	
	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute DisplayType
	
	public UnsignedInt16 get_DisplayType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FlatPanel.CIM_PROPERTY_DISPLAYTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FlatPanel.CIM_PROPERTY_DISPLAYTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FlatPanel.CIM_PROPERTY_DISPLAYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DisplayType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FlatPanel.CIM_PROPERTY_DISPLAYTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FlatPanel.CIM_PROPERTY_DISPLAYTYPE + " could not be found");
    		
		} else if (!CIM_FlatPanelHelper.isValid_DisplayType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FlatPanel.CIM_PROPERTY_DISPLAYTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FlatPanel.CIM_PROPERTY_DISPLAYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HorizontalResolution
	
	public UnsignedInt32 get_HorizontalResolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FlatPanel.CIM_PROPERTY_HORIZONTALRESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FlatPanel.CIM_PROPERTY_HORIZONTALRESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FlatPanel.CIM_PROPERTY_HORIZONTALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HorizontalResolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FlatPanel.CIM_PROPERTY_HORIZONTALRESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FlatPanel.CIM_PROPERTY_HORIZONTALRESOLUTION + " could not be found");
    		
		} else if (!CIM_FlatPanelHelper.isValid_HorizontalResolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FlatPanel.CIM_PROPERTY_HORIZONTALRESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FlatPanel.CIM_PROPERTY_HORIZONTALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LightSource
	
	public UnsignedInt16 get_LightSource() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FlatPanel.CIM_PROPERTY_LIGHTSOURCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FlatPanel.CIM_PROPERTY_LIGHTSOURCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FlatPanel.CIM_PROPERTY_LIGHTSOURCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LightSource(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FlatPanel.CIM_PROPERTY_LIGHTSOURCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FlatPanel.CIM_PROPERTY_LIGHTSOURCE + " could not be found");
    		
		} else if (!CIM_FlatPanelHelper.isValid_LightSource(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FlatPanel.CIM_PROPERTY_LIGHTSOURCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FlatPanel.CIM_PROPERTY_LIGHTSOURCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ScanMode
	
	public UnsignedInt16 get_ScanMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FlatPanel.CIM_PROPERTY_SCANMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FlatPanel.CIM_PROPERTY_SCANMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FlatPanel.CIM_PROPERTY_SCANMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ScanMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FlatPanel.CIM_PROPERTY_SCANMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FlatPanel.CIM_PROPERTY_SCANMODE + " could not be found");
    		
		} else if (!CIM_FlatPanelHelper.isValid_ScanMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FlatPanel.CIM_PROPERTY_SCANMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FlatPanel.CIM_PROPERTY_SCANMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportsColor
	
	public Boolean get_SupportsColor() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FlatPanel.CIM_PROPERTY_SUPPORTSCOLOR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FlatPanel.CIM_PROPERTY_SUPPORTSCOLOR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FlatPanel.CIM_PROPERTY_SUPPORTSCOLOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SupportsColor(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FlatPanel.CIM_PROPERTY_SUPPORTSCOLOR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FlatPanel.CIM_PROPERTY_SUPPORTSCOLOR + " could not be found");
    		
		} else if (!CIM_FlatPanelHelper.isValid_SupportsColor(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FlatPanel.CIM_PROPERTY_SUPPORTSCOLOR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FlatPanel.CIM_PROPERTY_SUPPORTSCOLOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VerticalResolution
	
	public UnsignedInt32 get_VerticalResolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FlatPanel.CIM_PROPERTY_VERTICALRESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FlatPanel.CIM_PROPERTY_VERTICALRESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FlatPanel.CIM_PROPERTY_VERTICALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VerticalResolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FlatPanel.CIM_PROPERTY_VERTICALRESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FlatPanel.CIM_PROPERTY_VERTICALRESOLUTION + " could not be found");
    		
		} else if (!CIM_FlatPanelHelper.isValid_VerticalResolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FlatPanel.CIM_PROPERTY_VERTICALRESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FlatPanel.CIM_PROPERTY_VERTICALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
