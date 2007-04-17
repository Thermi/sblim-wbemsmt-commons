/** 
 * CIM_SAEndpointRefreshSettings.java
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
 * Description:  SAEndpointRefreshSettings hold the refresh thresholds for the
 * SecurityAssociationEndpoint. Since these settings may change for an SA, the
 * properties are defined both in this class and in SecurityAssociationEndpoint.
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
import org.sblim.wbem.cim.UnsignedInt8;


/**
 *  SAEndpointRefreshSettings hold the refresh thresholds for the
 * SecurityAssociationEndpoint. Since these settings may change for an SA, the
 * properties are defined both in this class and in SecurityAssociationEndpoint.
 */
public class CIM_SAEndpointRefreshSettings extends CIM_SettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_SAEndpointRefreshSettings"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	RefreshThresholdKbytesPercentage is the lifetime percentage of kilobytes processed, at which a new SA should be acquired.
	*/
	public final static String CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE = "RefreshThresholdKbytesPercentage"; //$NON-NLS-1$
	/**
	*	RefreshThresholdSecondsPercentage is the lifetime percentage after which a new SA should be acquired, before the existing SA expires.
	*/
	public final static String CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE = "RefreshThresholdSecondsPercentage"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE);
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE)){
				continue;
			}
			
			CIM_SAEndpointRefreshSettings.CIM_PropertyNameList.add(CIM_SettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE)){
				continue;
			}
			
			CIM_SAEndpointRefreshSettings.CIM_PropertyList.add(CIM_SettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_SettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_SettingData.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SAEndpointRefreshSettings() {

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
	public CIM_SAEndpointRefreshSettings(Vector keyProperties){ 
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
	public CIM_SAEndpointRefreshSettings(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SAEndpointRefreshSettings)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SAEndpointRefreshSettings)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SAEndpointRefreshSettings)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SAEndpointRefreshSettings)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SAEndpointRefreshSettings)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SAEndpointRefreshSettings)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SAEndpointRefreshSettings)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SAEndpointRefreshSettings)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SAEndpointRefreshSettings)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SAEndpointRefreshSettings)object).cimObjectPath)) {
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
	
	// Attribute RefreshThresholdKbytesPercentage
	
	public UnsignedInt8 get_RefreshThresholdKbytesPercentage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RefreshThresholdKbytesPercentage(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE + " could not be found");
    		
		} else if (!CIM_SAEndpointRefreshSettingsHelper.isValid_RefreshThresholdKbytesPercentage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RefreshThresholdSecondsPercentage
	
	public UnsignedInt8 get_RefreshThresholdSecondsPercentage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RefreshThresholdSecondsPercentage(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE + " could not be found");
    		
		} else if (!CIM_SAEndpointRefreshSettingsHelper.isValid_RefreshThresholdSecondsPercentage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SAEndpointRefreshSettings.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}