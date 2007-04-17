/** 
 * CIM_StorageSettingsGeneratedFromCapabilities.java
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
 * Description:  This association define StorageSettings that reflect the capabilities of the
 * associated StorageCapabilities. The associated StorageSetting may not define
 * the operational characteristics (through settings properties) of any storage
 * element. StorageSettingsGeneratedFromCapabilities is the association between
 * instances of StorageCapabilities and those instances of StorageSetting that
 * have been created from the StorageCapabilities instance using the
 * StorageCapabilities "CreateSetting" method. These settings have a
 * StorageSetting.ChangeableType of "Changeable - Transient" or "Changeable -
 * Persistent" The settings associated by this class reflect the capabilities
 * from which they are generated. These setting SHALL be associated with one
 * StorageCapabilities. A generated setting can be deleted by the implementation
 * at any time if it is a a StorageSetting of "Changed - Transient"
 * ChangeableType. A client should not use this association to find transient
 * Settings to subsequently modify and/or use because that would increase the
 * likelihood of setting contention across clients. Instead the implementation
 * uses this association to define transient settings, which can be located
 * through any means, that have special temporal based life cycle.
 * DefaultSetting is meaningless in this class.
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


/**
 *  This association define StorageSettings that reflect the capabilities of the
 * associated StorageCapabilities. The associated StorageSetting may not define
 * the operational characteristics (through settings properties) of any storage
 * element. StorageSettingsGeneratedFromCapabilities is the association between
 * instances of StorageCapabilities and those instances of StorageSetting that
 * have been created from the StorageCapabilities instance using the
 * StorageCapabilities "CreateSetting" method. These settings have a
 * StorageSetting.ChangeableType of "Changeable - Transient" or "Changeable -
 * Persistent" The settings associated by this class reflect the capabilities
 * from which they are generated. These setting SHALL be associated with one
 * StorageCapabilities. A generated setting can be deleted by the implementation
 * at any time if it is a a StorageSetting of "Changed - Transient"
 * ChangeableType. A client should not use this association to find transient
 * Settings to subsequently modify and/or use because that would increase the
 * likelihood of setting contention across clients. Instead the implementation
 * uses this association to define transient settings, which can be located
 * through any means, that have special temporal based life cycle.
 * DefaultSetting is meaningless in this class.
 */
public class CIM_StorageSettingsGeneratedFromCapabilities extends CIM_SettingAssociatedToCapabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageSettingsGeneratedFromCapabilities"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	public final static String CIM_PROPERTY_CIM_STORAGECAPABILITIES = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_STORAGESETTING = "Dependent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_STORAGECAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_STORAGESETTING);
				
		for (int i = 0; i < CIM_SettingAssociatedToCapabilities.CIM_PropertyNameList.size(); i++) {
			
			CIM_StorageSettingsGeneratedFromCapabilities.CIM_PropertyNameList.add(CIM_SettingAssociatedToCapabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_STORAGECAPABILITIES, new CIMValue(null, new CIMDataType(CIM_StorageCapabilities.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_STORAGESETTING, new CIMValue(null, new CIMDataType(CIM_StorageSetting.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_SettingAssociatedToCapabilities.CIM_PropertyList.size(); i++) {
			
			CIM_StorageSettingsGeneratedFromCapabilities.CIM_PropertyList.add(CIM_SettingAssociatedToCapabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SettingAssociatedToCapabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_SettingAssociatedToCapabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_SettingAssociatedToCapabilities.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageSettingsGeneratedFromCapabilities() {

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
	public CIM_StorageSettingsGeneratedFromCapabilities(Vector keyProperties){ 
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
	public CIM_StorageSettingsGeneratedFromCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageSettingsGeneratedFromCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageSettingsGeneratedFromCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageSettingsGeneratedFromCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageSettingsGeneratedFromCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageSettingsGeneratedFromCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageSettingsGeneratedFromCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageSettingsGeneratedFromCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageSettingsGeneratedFromCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageSettingsGeneratedFromCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageSettingsGeneratedFromCapabilities)object).cimObjectPath)) {
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
	
	// Attribute CIM_StorageCapabilities
	
	public CIMObjectPath get_CIM_StorageCapabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGECAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGECAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_StorageCapabilities.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGECAPABILITIES + " is not of expected type CIM_StorageCapabilities.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_StorageCapabilities(CIM_StorageCapabilities newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGECAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGECAPABILITIES + " could not be found");
    		
		} else if (!CIM_StorageSettingsGeneratedFromCapabilitiesHelper.isValid_CIM_StorageCapabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGECAPABILITIES);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_StorageCapabilities.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGECAPABILITIES + " is not of expected type CIM_StorageCapabilities.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_StorageCapabilities.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_StorageSetting
	
	public CIMObjectPath get_CIM_StorageSetting() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGESETTING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGESETTING + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_StorageSetting.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGESETTING + " is not of expected type CIM_StorageSetting.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_StorageSetting(CIM_StorageSetting newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGESETTING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGESETTING + " could not be found");
    		
		} else if (!CIM_StorageSettingsGeneratedFromCapabilitiesHelper.isValid_CIM_StorageSetting(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGESETTING);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_StorageSetting.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingsGeneratedFromCapabilities.CIM_PROPERTY_CIM_STORAGESETTING + " is not of expected type CIM_StorageSetting.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_StorageSetting.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
