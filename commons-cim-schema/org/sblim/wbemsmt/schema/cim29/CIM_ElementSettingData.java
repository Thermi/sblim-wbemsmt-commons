/** 
 * CIM_ElementSettingData.java
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
 * @author:	ECCG 0.9.7 generated 
 * 			(author should be changed, e.g. First and Last Name <xxx@cc.ibm.com>)
 *
 * Contributors:
 *
 *
 * Description:  ElementSettingData represents the association between ManagedElements and
 * applicable setting data. This association also describes whether this is a
 * default or current setting.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  ElementSettingData represents the association between ManagedElements and
 * applicable setting data. This association also describes whether this is a
 * default or current setting.
 */
public class CIM_ElementSettingData  {
	
	protected CIMInstance cimInstance			= new CIMInstance();
	protected CIMInstance original_cimInstance	= null;
	protected CIMObjectPath cimObjectPath		= null; 
	
	public final static String CIM_CLASS_NAME = "CIM_ElementSettingData"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_MANAGEDELEMENT = "ManagedElement"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SETTINGDATA = "SettingData"; //$NON-NLS-1$
	
	
	/**
	*	An enumerated integer indicating that the referenced setting is currently being used in the operation of the element, or that this information is unknown.
	*/
	public final static String CIM_PROPERTY_ISCURRENT = "IsCurrent"; //$NON-NLS-1$
	/**
	*	An enumerated integer indicating that the referenced setting is a default setting for the element, or that this information is unknown.
	*/
	public final static String CIM_PROPERTY_ISDEFAULT = "IsDefault"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ISCURRENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISDEFAULT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_MANAGEDELEMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SETTINGDATA);
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISCURRENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISDEFAULT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_MANAGEDELEMENT, new CIMValue(null, new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SETTINGDATA, new CIMValue(null, new CIMDataType(CIM_SettingData.CIM_CLASS_NAME))));
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
		};
			
	public final static String[] CIM_VALUEMAP_ISCURRENT = {"Unknown","Is Current","Is Not Current"};
	public final static String[] CIM_VALUEMAP_ISDEFAULT = {"Unknown","Is Default","Is Not Default"};
	
	
	public final static int ISCURRENT_UNKNOWN = 0;
	public final static int ISCURRENT_ISCURRENT = 1;
	public final static int ISCURRENT_ISNOTCURRENT = 2;
	
	public final static int ISDEFAULT_UNKNOWN = 0;
	public final static int ISDEFAULT_ISDEFAULT = 1;
	public final static int ISDEFAULT_ISNOTDEFAULT = 2;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ElementSettingData() {

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
	public CIM_ElementSettingData(Vector keyProperties){ 
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
	public CIM_ElementSettingData(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_ElementSettingData.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_ElementSettingData.Java_Package_List.toArray(new String[CIM_ElementSettingData.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_ElementSettingData)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ElementSettingData)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ElementSettingData)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ElementSettingData)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ElementSettingData)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ElementSettingData)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ElementSettingData)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ElementSettingData)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ElementSettingData)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ElementSettingData)object).cimObjectPath)) {
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
	
	// Attribute IsCurrent
	
	public UnsignedInt16 get_IsCurrent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSettingData.CIM_PROPERTY_ISCURRENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSettingData.CIM_PROPERTY_ISCURRENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSettingData.CIM_PROPERTY_ISCURRENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsCurrent(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSettingData.CIM_PROPERTY_ISCURRENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSettingData.CIM_PROPERTY_ISCURRENT + " could not be found");
    		
		} else if (!CIM_ElementSettingDataHelper.isValid_IsCurrent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ElementSettingData.CIM_PROPERTY_ISCURRENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSettingData.CIM_PROPERTY_ISCURRENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsDefault
	
	public UnsignedInt16 get_IsDefault() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSettingData.CIM_PROPERTY_ISDEFAULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSettingData.CIM_PROPERTY_ISDEFAULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSettingData.CIM_PROPERTY_ISDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsDefault(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSettingData.CIM_PROPERTY_ISDEFAULT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSettingData.CIM_PROPERTY_ISDEFAULT + " could not be found");
    		
		} else if (!CIM_ElementSettingDataHelper.isValid_IsDefault(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ElementSettingData.CIM_PROPERTY_ISDEFAULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSettingData.CIM_PROPERTY_ISDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ManagedElement
	
	public CIMObjectPath get_CIM_ManagedElement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSettingData.CIM_PROPERTY_CIM_MANAGEDELEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSettingData.CIM_PROPERTY_CIM_MANAGEDELEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSettingData.CIM_PROPERTY_CIM_MANAGEDELEMENT + " is not of expected type CIM_ManagedElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ManagedElement(CIM_ManagedElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSettingData.CIM_PROPERTY_CIM_MANAGEDELEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSettingData.CIM_PROPERTY_CIM_MANAGEDELEMENT + " could not be found");
    		
		} else if (!CIM_ElementSettingDataHelper.isValid_CIM_ManagedElement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ElementSettingData.CIM_PROPERTY_CIM_MANAGEDELEMENT);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSettingData.CIM_PROPERTY_CIM_MANAGEDELEMENT + " is not of expected type CIM_ManagedElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SettingData
	
	public CIMObjectPath get_CIM_SettingData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSettingData.CIM_PROPERTY_CIM_SETTINGDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSettingData.CIM_PROPERTY_CIM_SETTINGDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSettingData.CIM_PROPERTY_CIM_SETTINGDATA + " is not of expected type CIM_SettingData.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SettingData(CIM_SettingData newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSettingData.CIM_PROPERTY_CIM_SETTINGDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSettingData.CIM_PROPERTY_CIM_SETTINGDATA + " could not be found");
    		
		} else if (!CIM_ElementSettingDataHelper.isValid_CIM_SettingData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ElementSettingData.CIM_PROPERTY_CIM_SETTINGDATA);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSettingData.CIM_PROPERTY_CIM_SETTINGDATA + " is not of expected type CIM_SettingData.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SettingData.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
