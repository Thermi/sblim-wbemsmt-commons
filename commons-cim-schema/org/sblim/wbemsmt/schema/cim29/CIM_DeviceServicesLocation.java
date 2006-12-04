/** 
 * CIM_DeviceServicesLocation.java
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
 * Description: Within an automated StorageLibrary, Media should be accessible to the various robotics and MediaTransferDevices (Pickers, Changers, InterLibraryPorts, etc.). The Library may be serviced by different TransferDevices, each responsible for a subset of the Library's StorageMediaLocations. The Device ServicesLocation association indicates that the Transfer Device handles Media stored in the referenced Location. For example, LibraryPort 'A' may only service Media from Slots 1-10, while LibraryPort 'B' covers Slots 11-33. This detail is conveyed by this association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_DeviceServicesLocation extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_DeviceServicesLocation";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_MEDIATRANSFERDEVICE = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_STORAGEMEDIALOCATION = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	Boolean indicating that the referenced StorageMediaLocation is not currently accessible to the MediaTransferDevice. For example, the Location could be the realization of an InterLibraryPort that is currently servicing another Library. The DeviceServicesLocation association describes that the TransferDevice COULD service the MediaLocation. This boolean indicates that that this is temporarily not possible.
	*/
	public final static String CIM_PROPERTY_INACCESSIBLE = "Inaccessible"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_INACCESSIBLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_MEDIATRANSFERDEVICE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_STORAGEMEDIALOCATION);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INACCESSIBLE)){
				continue;
			}
			
			CIM_DeviceServicesLocation.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INACCESSIBLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_MEDIATRANSFERDEVICE, new CIMValue(null, new CIMDataType(CIM_MediaTransferDevice.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_STORAGEMEDIALOCATION, new CIMValue(null, new CIMDataType(CIM_StorageMediaLocation.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INACCESSIBLE)){
				continue;
			}
			
			CIM_DeviceServicesLocation.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Dependency.Java_Package_List.size(); i++) {
			if (((String)CIM_Dependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Dependency.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DeviceServicesLocation() {

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
	public CIM_DeviceServicesLocation(Vector keyProperties){ 
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
	public CIM_DeviceServicesLocation(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DeviceServicesLocation)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DeviceServicesLocation)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DeviceServicesLocation)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DeviceServicesLocation)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DeviceServicesLocation)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DeviceServicesLocation)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DeviceServicesLocation)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DeviceServicesLocation)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DeviceServicesLocation)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DeviceServicesLocation)object).cimObjectPath)) {
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
	
	// Attribute Inaccessible
	
	public Boolean get_Inaccessible() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceServicesLocation.CIM_PROPERTY_INACCESSIBLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceServicesLocation.CIM_PROPERTY_INACCESSIBLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceServicesLocation.CIM_PROPERTY_INACCESSIBLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Inaccessible(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceServicesLocation.CIM_PROPERTY_INACCESSIBLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceServicesLocation.CIM_PROPERTY_INACCESSIBLE + " could not be found");
    		
		} else if (!CIM_DeviceServicesLocationHelper.isValid_Inaccessible(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceServicesLocation.CIM_PROPERTY_INACCESSIBLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceServicesLocation.CIM_PROPERTY_INACCESSIBLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_MediaTransferDevice
	
	public CIMObjectPath get_CIM_MediaTransferDevice() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_MEDIATRANSFERDEVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_MEDIATRANSFERDEVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_MediaTransferDevice.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_MEDIATRANSFERDEVICE + " is not of expected type CIM_MediaTransferDevice.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_MediaTransferDevice(CIM_MediaTransferDevice newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_MEDIATRANSFERDEVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_MEDIATRANSFERDEVICE + " could not be found");
    		
		} else if (!CIM_DeviceServicesLocationHelper.isValid_CIM_MediaTransferDevice(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_MEDIATRANSFERDEVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_MediaTransferDevice.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_MEDIATRANSFERDEVICE + " is not of expected type CIM_MediaTransferDevice.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_MediaTransferDevice.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_StorageMediaLocation
	
	public CIMObjectPath get_CIM_StorageMediaLocation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_StorageMediaLocation.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION + " is not of expected type CIM_StorageMediaLocation.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_StorageMediaLocation(CIM_StorageMediaLocation newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION + " could not be found");
    		
		} else if (!CIM_DeviceServicesLocationHelper.isValid_CIM_StorageMediaLocation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_StorageMediaLocation.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceServicesLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION + " is not of expected type CIM_StorageMediaLocation.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_StorageMediaLocation.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
