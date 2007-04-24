/** 
 * CIM_ElementSoftwareIdentity.java
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
 * Description:  ElementSoftwareIdentity allows a Managed Element to report its software related
 * asset information (firmware, drivers, configuration software, and etc.)
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  ElementSoftwareIdentity allows a Managed Element to report its software related
 * asset information (firmware, drivers, configuration software, and etc.)
 */
public class CIM_ElementSoftwareIdentity extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_ElementSoftwareIdentity"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_SOFTWAREIDENTITY = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_MANAGEDELEMENT = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	Describes the upgrade condition, when UpgradeCondition is set to 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERUPGRADECONDITION = "OtherUpgradeCondition"; //$NON-NLS-1$
	/**
	*	Indicates the element's ability to upgrade this software asset. 
'Resides off element'(2), indicates the persistence of the software is outside of the element. Typically for a element this software is part of the OperatingSystem is typically upgradeable. 
'Owner Upgradeable' (3), indicates the persistence of the software is on the element and is upgradeable by the owner. 
'FactoryUpgradeable' (4),indicates the persistence of the software is on the element and is upgradeable by the manufacturer. 
'Not Upgradeable' (5), indicates the presistence of the software is on the element and is not upgradeable. (i.e. burned into a non replaceable ROM chip.
	*/
	public final static String CIM_PROPERTY_UPGRADECONDITION = "UpgradeCondition"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERUPGRADECONDITION);
		CIM_PropertyNameList.add(CIM_PROPERTY_UPGRADECONDITION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SOFTWAREIDENTITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_MANAGEDELEMENT);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERUPGRADECONDITION)||
				((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UPGRADECONDITION)){
				continue;
			}
			
			CIM_ElementSoftwareIdentity.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERUPGRADECONDITION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UPGRADECONDITION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SOFTWAREIDENTITY, new CIMValue(null, new CIMDataType(CIM_SoftwareIdentity.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_MANAGEDELEMENT, new CIMValue(null, new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERUPGRADECONDITION)||
				((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UPGRADECONDITION)){
				continue;
			}
			
			CIM_ElementSoftwareIdentity.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Dependency.Java_Package_List.size(); i++) {
			if (((String)CIM_Dependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Dependency.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_UPGRADECONDITION = {"Unknown","Other","Resides off device","Owner Upgradeable","Factory Upgradeable","Not Upgradeable","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String UPGRADECONDITION_UNKNOWN = "0";
	public final static String UPGRADECONDITION_OTHER = "1";
	public final static String UPGRADECONDITION_RESIDESOFFDEVICE = "2";
	public final static String UPGRADECONDITION_OWNERUPGRADEABLE = "3";
	public final static String UPGRADECONDITION_FACTORYUPGRADEABLE = "4";
	public final static String UPGRADECONDITION_NOTUPGRADEABLE = "5";
	public final static String UPGRADECONDITION_DMTFRESERVED = "..";
	public final static String UPGRADECONDITION_VENDORRESERVED = "0x8000..0xFFFF";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ElementSoftwareIdentity() {

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
	public CIM_ElementSoftwareIdentity(Vector keyProperties){ 
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
	public CIM_ElementSoftwareIdentity(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ElementSoftwareIdentity)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ElementSoftwareIdentity)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ElementSoftwareIdentity)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ElementSoftwareIdentity)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ElementSoftwareIdentity)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ElementSoftwareIdentity)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ElementSoftwareIdentity)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ElementSoftwareIdentity)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ElementSoftwareIdentity)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ElementSoftwareIdentity)object).cimObjectPath)) {
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
	
	// Attribute OtherUpgradeCondition
	
	public String get_OtherUpgradeCondition() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSoftwareIdentity.CIM_PROPERTY_OTHERUPGRADECONDITION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_OTHERUPGRADECONDITION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_OTHERUPGRADECONDITION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherUpgradeCondition(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSoftwareIdentity.CIM_PROPERTY_OTHERUPGRADECONDITION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_OTHERUPGRADECONDITION + " could not be found");
    		
		} else if (!CIM_ElementSoftwareIdentityHelper.isValid_OtherUpgradeCondition(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_OTHERUPGRADECONDITION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_OTHERUPGRADECONDITION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UpgradeCondition
	
	public UnsignedInt16 get_UpgradeCondition() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSoftwareIdentity.CIM_PROPERTY_UPGRADECONDITION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_UPGRADECONDITION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_UPGRADECONDITION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UpgradeCondition(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSoftwareIdentity.CIM_PROPERTY_UPGRADECONDITION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_UPGRADECONDITION + " could not be found");
    		
		} else if (!CIM_ElementSoftwareIdentityHelper.isValid_UpgradeCondition(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_UPGRADECONDITION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_UPGRADECONDITION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SoftwareIdentity
	
	public CIMObjectPath get_CIM_SoftwareIdentity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_SOFTWAREIDENTITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_SOFTWAREIDENTITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SoftwareIdentity.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_SOFTWAREIDENTITY + " is not of expected type CIM_SoftwareIdentity.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SoftwareIdentity(CIM_SoftwareIdentity newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_SOFTWAREIDENTITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_SOFTWAREIDENTITY + " could not be found");
    		
		} else if (!CIM_ElementSoftwareIdentityHelper.isValid_CIM_SoftwareIdentity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_SOFTWAREIDENTITY);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SoftwareIdentity.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_SOFTWAREIDENTITY + " is not of expected type CIM_SoftwareIdentity.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SoftwareIdentity.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ManagedElement
	
	public CIMObjectPath get_CIM_ManagedElement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_MANAGEDELEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_MANAGEDELEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_MANAGEDELEMENT + " is not of expected type CIM_ManagedElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ManagedElement(CIM_ManagedElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_MANAGEDELEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_MANAGEDELEMENT + " could not be found");
    		
		} else if (!CIM_ElementSoftwareIdentityHelper.isValid_CIM_ManagedElement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_MANAGEDELEMENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ElementSoftwareIdentity.CIM_PROPERTY_CIM_MANAGEDELEMENT + " is not of expected type CIM_ManagedElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
