/** 
 * CIM_DeviceSoftware.java
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
 * Description:  The DeviceSoftware relationship identifies any software that is associated with
 * a Device such as drivers, configuration, or application software, or
 * firmware.
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
 *  The DeviceSoftware relationship identifies any software that is associated with
 * a Device such as drivers, configuration, or application software, or
 * firmware.
 */
public class CIM_DeviceSoftware extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_DeviceSoftware"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	public final static String CIM_PROPERTY_CIM_SOFTWAREELEMENT = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_LOGICALDEVICE = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	Boolean that indicates that the software is 'burned into' or otherwise located on the hardware of the LogicalDevice.
	*/
	public final static String CIM_PROPERTY_LOADEDONDEVICE = "LoadedOnDevice"; //$NON-NLS-1$
	/**
	*	An enumerated integer that indicates the role that this software plays in regards to its associated Device. For example, this software could be instrumentation (value=5) or firmware (value=6).
	*/
	public final static String CIM_PROPERTY_PURPOSE = "Purpose"; //$NON-NLS-1$
	/**
	*	A free-form string that provides more information for the Purpose property, for example, "Application Software".
	*/
	public final static String CIM_PROPERTY_PURPOSEDESCRIPTION = "PurposeDescription"; //$NON-NLS-1$
	/**
	*	Boolean that indicates whether the software is upgradeable, when it is LoadedOnDevice. Software that is loaded as part of the OperatingSystem is typically changeable and upgradeable. However, when DeviceSoftware is burned into EEPROM or a chip that realizes the LogicalDevice, then it might not be upgradeable. This property indicates the ability to update and upgrade DeviceSoftware.
	*/
	public final static String CIM_PROPERTY_UPGRADEABLEONDEVICE = "UpgradeableOnDevice"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LOADEDONDEVICE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PURPOSE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PURPOSEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_UPGRADEABLEONDEVICE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SOFTWAREELEMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_LOGICALDEVICE);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOADEDONDEVICE)||
				((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PURPOSE)||
				((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PURPOSEDESCRIPTION)||
				((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UPGRADEABLEONDEVICE)){
				continue;
			}
			
			CIM_DeviceSoftware.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOADEDONDEVICE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PURPOSE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PURPOSEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UPGRADEABLEONDEVICE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SOFTWAREELEMENT, new CIMValue(null, new CIMDataType(CIM_SoftwareElement.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_LOGICALDEVICE, new CIMValue(null, new CIMDataType(CIM_LogicalDevice.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOADEDONDEVICE)||
				((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PURPOSE)||
				((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PURPOSEDESCRIPTION)||
				((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UPGRADEABLEONDEVICE)){
				continue;
			}
			
			CIM_DeviceSoftware.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Dependency.Java_Package_List.size(); i++) {
			if (((String)CIM_Dependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Dependency.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PURPOSE = {"Unknown","Other","Driver","Configuration Software","Application Software","Instrumentation","Firmware","BIOS","Boot ROM"};
	
	
	public final static int PURPOSE_UNKNOWN = 0;
	public final static int PURPOSE_OTHER = 1;
	public final static int PURPOSE_DRIVER = 2;
	public final static int PURPOSE_CONFIGURATIONSOFTWARE = 3;
	public final static int PURPOSE_APPLICATIONSOFTWARE = 4;
	public final static int PURPOSE_INSTRUMENTATION = 5;
	public final static int PURPOSE_FIRMWARE = 6;
	public final static int PURPOSE_BIOS = 7;
	public final static int PURPOSE_BOOTROM = 8;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DeviceSoftware() {

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
	public CIM_DeviceSoftware(Vector keyProperties){ 
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
	public CIM_DeviceSoftware(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DeviceSoftware)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DeviceSoftware)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DeviceSoftware)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DeviceSoftware)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DeviceSoftware)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DeviceSoftware)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DeviceSoftware)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DeviceSoftware)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DeviceSoftware)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DeviceSoftware)object).cimObjectPath)) {
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
	
	// Attribute LoadedOnDevice
	
	public Boolean get_LoadedOnDevice() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceSoftware.CIM_PROPERTY_LOADEDONDEVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_LOADEDONDEVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_LOADEDONDEVICE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LoadedOnDevice(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceSoftware.CIM_PROPERTY_LOADEDONDEVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_LOADEDONDEVICE + " could not be found");
    		
		} else if (!CIM_DeviceSoftwareHelper.isValid_LoadedOnDevice(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceSoftware.CIM_PROPERTY_LOADEDONDEVICE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_LOADEDONDEVICE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Purpose
	
	public UnsignedInt16 get_Purpose() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceSoftware.CIM_PROPERTY_PURPOSE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_PURPOSE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_PURPOSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Purpose(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceSoftware.CIM_PROPERTY_PURPOSE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_PURPOSE + " could not be found");
    		
		} else if (!CIM_DeviceSoftwareHelper.isValid_Purpose(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceSoftware.CIM_PROPERTY_PURPOSE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_PURPOSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PurposeDescription
	
	public String get_PurposeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceSoftware.CIM_PROPERTY_PURPOSEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_PURPOSEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_PURPOSEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PurposeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceSoftware.CIM_PROPERTY_PURPOSEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_PURPOSEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_DeviceSoftwareHelper.isValid_PurposeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceSoftware.CIM_PROPERTY_PURPOSEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_PURPOSEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UpgradeableOnDevice
	
	public Boolean get_UpgradeableOnDevice() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceSoftware.CIM_PROPERTY_UPGRADEABLEONDEVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_UPGRADEABLEONDEVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_UPGRADEABLEONDEVICE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UpgradeableOnDevice(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceSoftware.CIM_PROPERTY_UPGRADEABLEONDEVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_UPGRADEABLEONDEVICE + " could not be found");
    		
		} else if (!CIM_DeviceSoftwareHelper.isValid_UpgradeableOnDevice(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceSoftware.CIM_PROPERTY_UPGRADEABLEONDEVICE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_UPGRADEABLEONDEVICE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SoftwareElement
	
	public CIMObjectPath get_CIM_SoftwareElement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceSoftware.CIM_PROPERTY_CIM_SOFTWAREELEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_CIM_SOFTWAREELEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SoftwareElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_CIM_SOFTWAREELEMENT + " is not of expected type CIM_SoftwareElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SoftwareElement(CIM_SoftwareElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceSoftware.CIM_PROPERTY_CIM_SOFTWAREELEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_CIM_SOFTWAREELEMENT + " could not be found");
    		
		} else if (!CIM_DeviceSoftwareHelper.isValid_CIM_SoftwareElement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceSoftware.CIM_PROPERTY_CIM_SOFTWAREELEMENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SoftwareElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_CIM_SOFTWAREELEMENT + " is not of expected type CIM_SoftwareElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SoftwareElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_LogicalDevice
	
	public CIMObjectPath get_CIM_LogicalDevice() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceSoftware.CIM_PROPERTY_CIM_LOGICALDEVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_CIM_LOGICALDEVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_LogicalDevice.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_CIM_LOGICALDEVICE + " is not of expected type CIM_LogicalDevice.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_LogicalDevice(CIM_LogicalDevice newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceSoftware.CIM_PROPERTY_CIM_LOGICALDEVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_CIM_LOGICALDEVICE + " could not be found");
    		
		} else if (!CIM_DeviceSoftwareHelper.isValid_CIM_LogicalDevice(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceSoftware.CIM_PROPERTY_CIM_LOGICALDEVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_LogicalDevice.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceSoftware.CIM_PROPERTY_CIM_LOGICALDEVICE + " is not of expected type CIM_LogicalDevice.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_LogicalDevice.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
