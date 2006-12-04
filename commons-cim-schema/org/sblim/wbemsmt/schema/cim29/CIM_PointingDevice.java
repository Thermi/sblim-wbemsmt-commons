/** 
 * CIM_PointingDevice.java
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
 * Description: PointingDevice represents those Devices used to 'point' to regions of a Display.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PointingDevice extends CIM_UserDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_PointingDevice";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	Integer indicating whether the PointingDevice is configured for right (value=2) or left handed operation (value=3). Also, the values, "Unknown" (0) and "Not Applicable" (1), can be defined.
	*/
	public final static String CIM_PROPERTY_HANDEDNESS = "Handedness"; //$NON-NLS-1$
	/**
	*	Number of buttons. If the PointingDevice has no buttons, enter 0.
	*/
	public final static String CIM_PROPERTY_NUMBEROFBUTTONS = "NumberOfButtons"; //$NON-NLS-1$
	/**
	*	The type of the pointing device.
	*/
	public final static String CIM_PROPERTY_POINTINGTYPE = "PointingType"; //$NON-NLS-1$
	/**
	*	Tracking resolution of the PointingDevice in Counts per Inch.
	*/
	public final static String CIM_PROPERTY_RESOLUTION = "Resolution"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_HANDEDNESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFBUTTONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_POINTINGTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_RESOLUTION);
				
		for (int i = 0; i < CIM_UserDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_UserDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HANDEDNESS)||
				((String)CIM_UserDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFBUTTONS)||
				((String)CIM_UserDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POINTINGTYPE)||
				((String)CIM_UserDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RESOLUTION)){
				continue;
			}
			
			CIM_PointingDevice.CIM_PropertyNameList.add(CIM_UserDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HANDEDNESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFBUTTONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POINTINGTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_UserDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_UserDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HANDEDNESS)||
				((CIMProperty)CIM_UserDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFBUTTONS)||
				((CIMProperty)CIM_UserDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POINTINGTYPE)||
				((CIMProperty)CIM_UserDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RESOLUTION)){
				continue;
			}
			
			CIM_PointingDevice.CIM_PropertyList.add(CIM_UserDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_UserDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_UserDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_UserDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_HANDEDNESS = {"Unknown","Not Applicable","Right Handed Operation","Left Handed Operation"};
	public final static String[] CIM_VALUEMAP_POINTINGTYPE = {"Other","Unknown","Mouse","Track Ball","Track Point","Glide Point","Touch Pad","Touch Screen","Mouse - Optical Sensor"};
	
	
	public final static int HANDEDNESS_UNKNOWN = 0;
	public final static int HANDEDNESS_NOTAPPLICABLE = 1;
	public final static int HANDEDNESS_RIGHTHANDEDOPERATION = 2;
	public final static int HANDEDNESS_LEFTHANDEDOPERATION = 3;
	
	public final static int POINTINGTYPE_OTHER = 1;
	public final static int POINTINGTYPE_UNKNOWN = 2;
	public final static int POINTINGTYPE_MOUSE = 3;
	public final static int POINTINGTYPE_TRACKBALL = 4;
	public final static int POINTINGTYPE_TRACKPOINT = 5;
	public final static int POINTINGTYPE_GLIDEPOINT = 6;
	public final static int POINTINGTYPE_TOUCHPAD = 7;
	public final static int POINTINGTYPE_TOUCHSCREEN = 8;
	public final static int POINTINGTYPE_MOUSE_OPTICALSENSOR = 9;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PointingDevice() {

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
	public CIM_PointingDevice(Vector keyProperties){ 
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
	public CIM_PointingDevice(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		return validCimInstance;
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
	    
	    if (!(object instanceof CIM_PointingDevice)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PointingDevice)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PointingDevice)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PointingDevice)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PointingDevice)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PointingDevice)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PointingDevice)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PointingDevice)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PointingDevice)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PointingDevice)object).cimObjectPath)) {
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
	
	// Attribute Handedness
	
	public UnsignedInt16 get_Handedness() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PointingDevice.CIM_PROPERTY_HANDEDNESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PointingDevice.CIM_PROPERTY_HANDEDNESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PointingDevice.CIM_PROPERTY_HANDEDNESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Handedness(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PointingDevice.CIM_PROPERTY_HANDEDNESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PointingDevice.CIM_PROPERTY_HANDEDNESS + " could not be found");
    		
		} else if (!CIM_PointingDeviceHelper.isValid_Handedness(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PointingDevice.CIM_PROPERTY_HANDEDNESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PointingDevice.CIM_PROPERTY_HANDEDNESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfButtons
	
	public UnsignedInt8 get_NumberOfButtons() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PointingDevice.CIM_PROPERTY_NUMBEROFBUTTONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PointingDevice.CIM_PROPERTY_NUMBEROFBUTTONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PointingDevice.CIM_PROPERTY_NUMBEROFBUTTONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfButtons(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PointingDevice.CIM_PROPERTY_NUMBEROFBUTTONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PointingDevice.CIM_PROPERTY_NUMBEROFBUTTONS + " could not be found");
    		
		} else if (!CIM_PointingDeviceHelper.isValid_NumberOfButtons(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PointingDevice.CIM_PROPERTY_NUMBEROFBUTTONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PointingDevice.CIM_PROPERTY_NUMBEROFBUTTONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PointingType
	
	public UnsignedInt16 get_PointingType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PointingDevice.CIM_PROPERTY_POINTINGTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PointingDevice.CIM_PROPERTY_POINTINGTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PointingDevice.CIM_PROPERTY_POINTINGTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PointingType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PointingDevice.CIM_PROPERTY_POINTINGTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PointingDevice.CIM_PROPERTY_POINTINGTYPE + " could not be found");
    		
		} else if (!CIM_PointingDeviceHelper.isValid_PointingType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PointingDevice.CIM_PROPERTY_POINTINGTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PointingDevice.CIM_PROPERTY_POINTINGTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Resolution
	
	public UnsignedInt32 get_Resolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PointingDevice.CIM_PROPERTY_RESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PointingDevice.CIM_PROPERTY_RESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PointingDevice.CIM_PROPERTY_RESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Resolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PointingDevice.CIM_PROPERTY_RESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PointingDevice.CIM_PROPERTY_RESOLUTION + " could not be found");
    		
		} else if (!CIM_PointingDeviceHelper.isValid_Resolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PointingDevice.CIM_PROPERTY_RESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PointingDevice.CIM_PROPERTY_RESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
