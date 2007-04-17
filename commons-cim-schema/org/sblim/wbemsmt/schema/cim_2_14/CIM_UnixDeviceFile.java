/** 
 * CIM_UnixDeviceFile.java
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
 * Description:  DeviceFile is a special type of LogicalFile that represents a Device. This
 * class is a specialization of DeviceFile for a Unix environment.
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


/**
 *  DeviceFile is a special type of LogicalFile that represents a Device. This
 * class is a specialization of DeviceFile for a Unix environment.
 */
public class CIM_UnixDeviceFile extends CIM_DeviceFile  {
	
	public final static String CIM_CLASS_NAME = "CIM_UnixDeviceFile"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	Additional information provided by the driver. This property may be null if no information is available, or a general description of the device when available, e.g. "Non-rewind tape streamer".
	*/
	public final static String CIM_PROPERTY_DEVICEDESCRIPTION = "DeviceDescription"; //$NON-NLS-1$
	/**
	*	The type of device file.
	*/
	public final static String CIM_PROPERTY_DEVICEFILETYPE = "DeviceFileType"; //$NON-NLS-1$
	/**
	*	The device Identifier: this is the st_rdev field in the stat structure.
	*/
	public final static String CIM_PROPERTY_DEVICEID = "DeviceId"; //$NON-NLS-1$
	/**
	*	The Device's Major Id.
	*/
	public final static String CIM_PROPERTY_DEVICEMAJOR = "DeviceMajor"; //$NON-NLS-1$
	/**
	*	The Device's Minor Id.
	*/
	public final static String CIM_PROPERTY_DEVICEMINOR = "DeviceMinor"; //$NON-NLS-1$
	/**
	*	Additional information when the DeviceFileType property is set to "Other".
	*/
	public final static String CIM_PROPERTY_OTHERTYPEDESCRIPTION = "OtherTypeDescription"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DEVICEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEVICEFILETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEVICEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEVICEMAJOR);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEVICEMINOR);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERTYPEDESCRIPTION);
				
		for (int i = 0; i < CIM_DeviceFile.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_DeviceFile.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEVICEDESCRIPTION)||
				((String)CIM_DeviceFile.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEVICEFILETYPE)||
				((String)CIM_DeviceFile.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEVICEID)||
				((String)CIM_DeviceFile.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEVICEMAJOR)||
				((String)CIM_DeviceFile.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEVICEMINOR)||
				((String)CIM_DeviceFile.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERTYPEDESCRIPTION)){
				continue;
			}
			
			CIM_UnixDeviceFile.CIM_PropertyNameList.add(CIM_DeviceFile.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEVICEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEVICEFILETYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEVICEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEVICEMAJOR, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEVICEMINOR, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERTYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_DeviceFile.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_DeviceFile.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEVICEDESCRIPTION)||
				((CIMProperty)CIM_DeviceFile.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEVICEFILETYPE)||
				((CIMProperty)CIM_DeviceFile.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEVICEID)||
				((CIMProperty)CIM_DeviceFile.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEVICEMAJOR)||
				((CIMProperty)CIM_DeviceFile.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEVICEMINOR)||
				((CIMProperty)CIM_DeviceFile.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERTYPEDESCRIPTION)){
				continue;
			}
			
			CIM_UnixDeviceFile.CIM_PropertyList.add(CIM_DeviceFile.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_DeviceFile.Java_Package_List.size(); i++) {
			if (((String)CIM_DeviceFile.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_DeviceFile.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DEVICEFILETYPE = {"Unknown","Other","Block","Character"};
	
	
	public final static int DEVICEFILETYPE_UNKNOWN = 0;
	public final static int DEVICEFILETYPE_OTHER = 1;
	public final static int DEVICEFILETYPE_BLOCK = 2;
	public final static int DEVICEFILETYPE_CHARACTER = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_UnixDeviceFile() {

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
	public CIM_UnixDeviceFile(Vector keyProperties){ 
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
	public CIM_UnixDeviceFile(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_DeviceId = this.cimInstance.getProperty(CIM_PROPERTY_DEVICEID);
		
		if (CIMProperty_DeviceId == null || CIMProperty_DeviceId.getValue().isEmpty() || CIMProperty_DeviceId.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_DEVICEID, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_DeviceMajor = this.cimInstance.getProperty(CIM_PROPERTY_DEVICEMAJOR);
		
		if (CIMProperty_DeviceMajor == null || CIMProperty_DeviceMajor.getValue().isEmpty() || CIMProperty_DeviceMajor.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_DEVICEMAJOR, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_DeviceMinor = this.cimInstance.getProperty(CIM_PROPERTY_DEVICEMINOR);
		
		if (CIMProperty_DeviceMinor == null || CIMProperty_DeviceMinor.getValue().isEmpty() || CIMProperty_DeviceMinor.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_DEVICEMINOR, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_UnixDeviceFile)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_UnixDeviceFile)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_UnixDeviceFile)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_UnixDeviceFile)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_UnixDeviceFile)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_UnixDeviceFile)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_UnixDeviceFile)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_UnixDeviceFile)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_UnixDeviceFile)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_UnixDeviceFile)object).cimObjectPath)) {
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
	
	// Attribute DeviceDescription
	
	public String get_DeviceDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeviceDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_UnixDeviceFileHelper.isValid_DeviceDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeviceFileType
	
	public UnsignedInt16 get_DeviceFileType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEFILETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEFILETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEFILETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeviceFileType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEFILETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEFILETYPE + " could not be found");
    		
		} else if (!CIM_UnixDeviceFileHelper.isValid_DeviceFileType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEFILETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEFILETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeviceId
	
	public String get_DeviceId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeviceId(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEID + " could not be found");
    		
		} else if (!CIM_UnixDeviceFileHelper.isValid_DeviceId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeviceMajor
	
	public String get_DeviceMajor() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMAJOR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMAJOR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMAJOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeviceMajor(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMAJOR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMAJOR + " could not be found");
    		
		} else if (!CIM_UnixDeviceFileHelper.isValid_DeviceMajor(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMAJOR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMAJOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeviceMinor
	
	public String get_DeviceMinor() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMINOR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMINOR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMINOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeviceMinor(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMINOR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMINOR + " could not be found");
    		
		} else if (!CIM_UnixDeviceFileHelper.isValid_DeviceMinor(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMINOR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_DEVICEMINOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherTypeDescription
	
	public String get_OtherTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixDeviceFile.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixDeviceFile.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_UnixDeviceFileHelper.isValid_OtherTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixDeviceFile.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixDeviceFile.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
