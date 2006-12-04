/** 
 * CIM_PCIDevice.java
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
 * Description: Capabilities and management of a PCI device controller on an adapter card.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PCIDevice extends CIM_PCIController  {
	
	public final static String CIM_CLASS_NAME = "CIM_PCIDevice";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	Array of doubleword base memory addresses.
	*/
	public final static String CIM_PROPERTY_BASEADDRESS = "BaseAddress"; //$NON-NLS-1$
	/**
	*	Register specifying how often the device needs access to the PCI bus in 250ns. A zero value indicates no requirement.
	*/
	public final static String CIM_PROPERTY_MAXLATENCY = "MaxLatency"; //$NON-NLS-1$
	/**
	*	Register indiating how long the master would like to retain PCI bus ownership whenever it initiates a transaction. A zero value indicates no requirement.
	*/
	public final static String CIM_PROPERTY_MINGRANTTIME = "MinGrantTime"; //$NON-NLS-1$
	/**
	*	Subsystem identifier code.
	*/
	public final static String CIM_PROPERTY_SUBSYSTEMID = "SubsystemID"; //$NON-NLS-1$
	/**
	*	Subsystem vendor ID. ID information is reported from a PCIDevice via protocol-specific requests. The correct place in the CIM Schema for this information is in CIM_Physical Element (the Manufacturer property) for hardware, and CIM_Product (the Vendor property) if the information is related to Product acquisition. This data is also reported here since it is part of the standard output from the Device, and as an optimization.
	*/
	public final static String CIM_PROPERTY_SUBSYSTEMVENDORID = "SubsystemVendorID"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BASEADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXLATENCY);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINGRANTTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUBSYSTEMID);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUBSYSTEMVENDORID);
				
		for (int i = 0; i < CIM_PCIController.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BASEADDRESS)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXLATENCY)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINGRANTTIME)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUBSYSTEMID)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUBSYSTEMVENDORID)){
				continue;
			}
			
			CIM_PCIDevice.CIM_PropertyNameList.add(CIM_PCIController.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BASEADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXLATENCY, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINGRANTTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUBSYSTEMID, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUBSYSTEMVENDORID, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_PCIController.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BASEADDRESS)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXLATENCY)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINGRANTTIME)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUBSYSTEMID)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUBSYSTEMVENDORID)){
				continue;
			}
			
			CIM_PCIDevice.CIM_PropertyList.add(CIM_PCIController.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PCIController.Java_Package_List.size(); i++) {
			if (((String)CIM_PCIController.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PCIController.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PCIDevice() {

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
	public CIM_PCIDevice(Vector keyProperties){ 
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
	public CIM_PCIDevice(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PCIDevice)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PCIDevice)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PCIDevice)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PCIDevice)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PCIDevice)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PCIDevice)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PCIDevice)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PCIDevice)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PCIDevice)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PCIDevice)object).cimObjectPath)) {
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
	
	// Attribute BaseAddress
	
	public UnsignedInt32 get_BaseAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIDevice.CIM_PROPERTY_BASEADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIDevice.CIM_PROPERTY_BASEADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIDevice.CIM_PROPERTY_BASEADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BaseAddress(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIDevice.CIM_PROPERTY_BASEADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIDevice.CIM_PROPERTY_BASEADDRESS + " could not be found");
    		
		} else if (!CIM_PCIDeviceHelper.isValid_BaseAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIDevice.CIM_PROPERTY_BASEADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIDevice.CIM_PROPERTY_BASEADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxLatency
	
	public UnsignedInt8 get_MaxLatency() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIDevice.CIM_PROPERTY_MAXLATENCY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIDevice.CIM_PROPERTY_MAXLATENCY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIDevice.CIM_PROPERTY_MAXLATENCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxLatency(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIDevice.CIM_PROPERTY_MAXLATENCY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIDevice.CIM_PROPERTY_MAXLATENCY + " could not be found");
    		
		} else if (!CIM_PCIDeviceHelper.isValid_MaxLatency(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIDevice.CIM_PROPERTY_MAXLATENCY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIDevice.CIM_PROPERTY_MAXLATENCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinGrantTime
	
	public UnsignedInt8 get_MinGrantTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIDevice.CIM_PROPERTY_MINGRANTTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIDevice.CIM_PROPERTY_MINGRANTTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIDevice.CIM_PROPERTY_MINGRANTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinGrantTime(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIDevice.CIM_PROPERTY_MINGRANTTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIDevice.CIM_PROPERTY_MINGRANTTIME + " could not be found");
    		
		} else if (!CIM_PCIDeviceHelper.isValid_MinGrantTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIDevice.CIM_PROPERTY_MINGRANTTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIDevice.CIM_PROPERTY_MINGRANTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SubsystemID
	
	public UnsignedInt16 get_SubsystemID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SubsystemID(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMID + " could not be found");
    		
		} else if (!CIM_PCIDeviceHelper.isValid_SubsystemID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SubsystemVendorID
	
	public UnsignedInt16 get_SubsystemVendorID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMVENDORID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMVENDORID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMVENDORID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SubsystemVendorID(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMVENDORID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMVENDORID + " could not be found");
    		
		} else if (!CIM_PCIDeviceHelper.isValid_SubsystemVendorID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMVENDORID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIDevice.CIM_PROPERTY_SUBSYSTEMVENDORID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
