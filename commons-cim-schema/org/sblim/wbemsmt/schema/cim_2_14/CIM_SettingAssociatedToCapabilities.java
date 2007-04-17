/** 
 * CIM_SettingAssociatedToCapabilities.java
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
 * Description:  This association defines settings that can be used to create or modify
 * elements. Unlike ElementSettingData, these settings are not used to express
 * the characteristics of existing managed elements. Typically, the capabilities
 * associated with this class define the characteristics of a service in
 * creating or modifying elements that are dependent on the service directly or
 * indirectly. A CIM Client may use this association to find SettingData
 * instances that can be used to create or modify these dependent elements.
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
 *  This association defines settings that can be used to create or modify
 * elements. Unlike ElementSettingData, these settings are not used to express
 * the characteristics of existing managed elements. Typically, the capabilities
 * associated with this class define the characteristics of a service in
 * creating or modifying elements that are dependent on the service directly or
 * indirectly. A CIM Client may use this association to find SettingData
 * instances that can be used to create or modify these dependent elements.
 */
public class CIM_SettingAssociatedToCapabilities extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_SettingAssociatedToCapabilities"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	public final static String CIM_PROPERTY_CIM_CAPABILITIES = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SETTINGDATA = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	If an element whose characteristics are described by the associated Capabilities instance has a dependent element created or modified without specifying an associated SettingData instance, then the default SettingData will be used in that operation.
	*/
	public final static String CIM_PROPERTY_DEFAULTSETTING = "DefaultSetting"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTSETTING);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SETTINGDATA);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTSETTING)){
				continue;
			}
			
			CIM_SettingAssociatedToCapabilities.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTSETTING, new CIMValue(new Boolean("FALSE"), new CIMDataType(CIMDataType.BOOLEAN))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_CAPABILITIES, new CIMValue(null, new CIMDataType(CIM_Capabilities.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SETTINGDATA, new CIMValue(null, new CIMDataType(CIM_SettingData.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTSETTING)){
				continue;
			}
			
			CIM_SettingAssociatedToCapabilities.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Dependency.Java_Package_List.size(); i++) {
			if (((String)CIM_Dependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
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
	public CIM_SettingAssociatedToCapabilities() {

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
	public CIM_SettingAssociatedToCapabilities(Vector keyProperties){ 
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
	public CIM_SettingAssociatedToCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_DefaultSetting = this.cimInstance.getProperty(CIM_PROPERTY_DEFAULTSETTING);
		
		if (CIMProperty_DefaultSetting == null || CIMProperty_DefaultSetting.getValue().isEmpty() || CIMProperty_DefaultSetting.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_DEFAULTSETTING, "Required"});
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
	    
	    if (!(object instanceof CIM_SettingAssociatedToCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SettingAssociatedToCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SettingAssociatedToCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SettingAssociatedToCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SettingAssociatedToCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SettingAssociatedToCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SettingAssociatedToCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SettingAssociatedToCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SettingAssociatedToCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SettingAssociatedToCapabilities)object).cimObjectPath)) {
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
	
	// Attribute DefaultSetting
	
	public Boolean get_DefaultSetting() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_DEFAULTSETTING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_DEFAULTSETTING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_DEFAULTSETTING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultSetting(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_DEFAULTSETTING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_DEFAULTSETTING + " could not be found");
    		
		} else if (!CIM_SettingAssociatedToCapabilitiesHelper.isValid_DefaultSetting(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_DEFAULTSETTING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_DEFAULTSETTING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Capabilities
	
	public CIMObjectPath get_CIM_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Capabilities.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_CAPABILITIES + " is not of expected type CIM_Capabilities.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Capabilities(CIM_Capabilities newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_SettingAssociatedToCapabilitiesHelper.isValid_CIM_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Capabilities.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_CAPABILITIES + " is not of expected type CIM_Capabilities.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Capabilities.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SettingData
	
	public CIMObjectPath get_CIM_SettingData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_SETTINGDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_SETTINGDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SettingData.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_SETTINGDATA + " is not of expected type CIM_SettingData.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SettingData(CIM_SettingData newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_SETTINGDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_SETTINGDATA + " could not be found");
    		
		} else if (!CIM_SettingAssociatedToCapabilitiesHelper.isValid_CIM_SettingData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_SETTINGDATA);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SettingData.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingAssociatedToCapabilities.CIM_PROPERTY_CIM_SETTINGDATA + " is not of expected type CIM_SettingData.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SettingData.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
