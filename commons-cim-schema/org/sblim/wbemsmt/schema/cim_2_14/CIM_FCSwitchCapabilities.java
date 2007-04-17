/** 
 * CIM_FCSwitchCapabilities.java
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
 * Description:  FibreChannel switch control and configuration capabilities.
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
import org.sblim.wbem.cim.UnsignedInt8;


/**
 *  FibreChannel switch control and configuration capabilities.
 */
public class CIM_FCSwitchCapabilities extends CIM_EnabledLogicalElementCapabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_FCSwitchCapabilities"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	
	
	/**
	*	Boolean that indicates whether the DomainID setting can be modified.
	*/
	public final static String CIM_PROPERTY_DOMAINIDCONFIGUREABLE = "DomainIDConfigureable"; //$NON-NLS-1$
	/**
	*	Boolean that indicates whether the DomainIDLocked setting can be modified.
	*/
	public final static String CIM_PROPERTY_DOMAINIDLOCKEDSUPPORTED = "DomainIDLockedSupported"; //$NON-NLS-1$
	/**
	*	Maximum DomainID value supported by the switch. This value must be greater than or equal to MinDomainID.
	*/
	public final static String CIM_PROPERTY_MAXDOMAINID = "MaxDomainID"; //$NON-NLS-1$
	/**
	*	Minimum DomainID value supported by the switch.
	*/
	public final static String CIM_PROPERTY_MINDOMAINID = "MinDomainID"; //$NON-NLS-1$
	/**
	*	This array contains the principal priority settings that are supported by the switch.
	*/
	public final static String CIM_PROPERTY_PRINCIPALPRIORITIESSUPPORTED = "PrincipalPrioritiesSupported"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DOMAINIDCONFIGUREABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DOMAINIDLOCKEDSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXDOMAINID);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINDOMAINID);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRINCIPALPRIORITIESSUPPORTED);
				
		for (int i = 0; i < CIM_EnabledLogicalElementCapabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_EnabledLogicalElementCapabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DOMAINIDCONFIGUREABLE)||
				((String)CIM_EnabledLogicalElementCapabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DOMAINIDLOCKEDSUPPORTED)||
				((String)CIM_EnabledLogicalElementCapabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXDOMAINID)||
				((String)CIM_EnabledLogicalElementCapabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINDOMAINID)||
				((String)CIM_EnabledLogicalElementCapabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRINCIPALPRIORITIESSUPPORTED)){
				continue;
			}
			
			CIM_FCSwitchCapabilities.CIM_PropertyNameList.add(CIM_EnabledLogicalElementCapabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DOMAINIDCONFIGUREABLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DOMAINIDLOCKEDSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXDOMAINID, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINDOMAINID, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRINCIPALPRIORITIESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_EnabledLogicalElementCapabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_EnabledLogicalElementCapabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DOMAINIDCONFIGUREABLE)||
				((CIMProperty)CIM_EnabledLogicalElementCapabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DOMAINIDLOCKEDSUPPORTED)||
				((CIMProperty)CIM_EnabledLogicalElementCapabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXDOMAINID)||
				((CIMProperty)CIM_EnabledLogicalElementCapabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINDOMAINID)||
				((CIMProperty)CIM_EnabledLogicalElementCapabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRINCIPALPRIORITIESSUPPORTED)){
				continue;
			}
			
			CIM_FCSwitchCapabilities.CIM_PropertyList.add(CIM_EnabledLogicalElementCapabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_EnabledLogicalElementCapabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_EnabledLogicalElementCapabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_EnabledLogicalElementCapabilities.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PRINCIPALPRIORITIESSUPPORTED = {"Principal","Subordinate","Any","Not Applicable"};
	
	
	public final static int PRINCIPALPRIORITIESSUPPORTED_PRINCIPAL = 2;
	public final static int PRINCIPALPRIORITIESSUPPORTED_SUBORDINATE = 3;
	public final static int PRINCIPALPRIORITIESSUPPORTED_ANY = 4;
	public final static int PRINCIPALPRIORITIESSUPPORTED_NOTAPPLICABLE = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_FCSwitchCapabilities() {

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
	public CIM_FCSwitchCapabilities(Vector keyProperties){ 
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
	public CIM_FCSwitchCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_FCSwitchCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FCSwitchCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FCSwitchCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FCSwitchCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FCSwitchCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FCSwitchCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FCSwitchCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FCSwitchCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FCSwitchCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FCSwitchCapabilities)object).cimObjectPath)) {
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
	
	// Attribute DomainIDConfigureable
	
	public Boolean get_DomainIDConfigureable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDCONFIGUREABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDCONFIGUREABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDCONFIGUREABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DomainIDConfigureable(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDCONFIGUREABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDCONFIGUREABLE + " could not be found");
    		
		} else if (!CIM_FCSwitchCapabilitiesHelper.isValid_DomainIDConfigureable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDCONFIGUREABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDCONFIGUREABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DomainIDLockedSupported
	
	public Boolean get_DomainIDLockedSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDLOCKEDSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDLOCKEDSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDLOCKEDSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DomainIDLockedSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDLOCKEDSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDLOCKEDSUPPORTED + " could not be found");
    		
		} else if (!CIM_FCSwitchCapabilitiesHelper.isValid_DomainIDLockedSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDLOCKEDSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_DOMAINIDLOCKEDSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxDomainID
	
	public UnsignedInt8 get_MaxDomainID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCSwitchCapabilities.CIM_PROPERTY_MAXDOMAINID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_MAXDOMAINID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_MAXDOMAINID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxDomainID(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCSwitchCapabilities.CIM_PROPERTY_MAXDOMAINID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_MAXDOMAINID + " could not be found");
    		
		} else if (!CIM_FCSwitchCapabilitiesHelper.isValid_MaxDomainID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_MAXDOMAINID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_MAXDOMAINID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinDomainID
	
	public UnsignedInt8 get_MinDomainID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCSwitchCapabilities.CIM_PROPERTY_MINDOMAINID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_MINDOMAINID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_MINDOMAINID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinDomainID(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCSwitchCapabilities.CIM_PROPERTY_MINDOMAINID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_MINDOMAINID + " could not be found");
    		
		} else if (!CIM_FCSwitchCapabilitiesHelper.isValid_MinDomainID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_MINDOMAINID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_MINDOMAINID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrincipalPrioritiesSupported
	
	public UnsignedInt16[] get_PrincipalPrioritiesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCSwitchCapabilities.CIM_PROPERTY_PRINCIPALPRIORITIESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_PRINCIPALPRIORITIESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_PRINCIPALPRIORITIESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_PrincipalPrioritiesSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FCSwitchCapabilities.CIM_PROPERTY_PRINCIPALPRIORITIESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_PRINCIPALPRIORITIESSUPPORTED + " could not be found");
    		
		} else if (!CIM_FCSwitchCapabilitiesHelper.isValid_PrincipalPrioritiesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_PRINCIPALPRIORITIESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FCSwitchCapabilities.CIM_PROPERTY_PRINCIPALPRIORITIESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
