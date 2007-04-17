/** 
 * CIM_BiometricAuthentication.java
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
 * Description:  A class describing a company's and/or administrator's credential requirements
 * that should be authenticated in order to establish/trust a CIM_Identity. This
 * class defines specific biometric data that should be authenticated.
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
 *  A class describing a company's and/or administrator's credential requirements
 * that should be authenticated in order to establish/trust a CIM_Identity. This
 * class defines specific biometric data that should be authenticated.
 */
public class CIM_BiometricAuthentication extends CIM_AuthenticationCondition  {
	
	public final static String CIM_CLASS_NAME = "CIM_BiometricAuthentication"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	String specifying the biometric when the TypeOfBiometric property is set to 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERBIOMETRIC = "OtherBiometric"; //$NON-NLS-1$
	/**
	*	String defining a specific biometric code, which may be validated by the security infrastructure. If this property is left blank, it is the responsibility of the infrastructure to verify the biometric (which MUST be of a type specified by the TypeOfBiometric property).
	*/
	public final static String CIM_PROPERTY_PERSONALIDENTIFIER = "PersonalIdentifier"; //$NON-NLS-1$
	/**
	*	Integer enumeration identifying the biometric data that should be authenticated.
	*/
	public final static String CIM_PROPERTY_TYPEOFBIOMETRIC = "TypeOfBiometric"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERBIOMETRIC);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERSONALIDENTIFIER);
		CIM_PropertyNameList.add(CIM_PROPERTY_TYPEOFBIOMETRIC);
				
		for (int i = 0; i < CIM_AuthenticationCondition.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_AuthenticationCondition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERBIOMETRIC)||
				((String)CIM_AuthenticationCondition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PERSONALIDENTIFIER)||
				((String)CIM_AuthenticationCondition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TYPEOFBIOMETRIC)){
				continue;
			}
			
			CIM_BiometricAuthentication.CIM_PropertyNameList.add(CIM_AuthenticationCondition.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERBIOMETRIC, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERSONALIDENTIFIER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TYPEOFBIOMETRIC, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_AuthenticationCondition.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_AuthenticationCondition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERBIOMETRIC)||
				((CIMProperty)CIM_AuthenticationCondition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PERSONALIDENTIFIER)||
				((CIMProperty)CIM_AuthenticationCondition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TYPEOFBIOMETRIC)){
				continue;
			}
			
			CIM_BiometricAuthentication.CIM_PropertyList.add(CIM_AuthenticationCondition.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_AuthenticationCondition.Java_Package_List.size(); i++) {
			if (((String)CIM_AuthenticationCondition.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_AuthenticationCondition.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_TYPEOFBIOMETRIC = {"Other","Facial","Retina","Mark","Finger","Voice","DNA-RNA","EEG"};
	
	
	public final static int TYPEOFBIOMETRIC_OTHER = 1;
	public final static int TYPEOFBIOMETRIC_FACIAL = 2;
	public final static int TYPEOFBIOMETRIC_RETINA = 3;
	public final static int TYPEOFBIOMETRIC_MARK = 4;
	public final static int TYPEOFBIOMETRIC_FINGER = 5;
	public final static int TYPEOFBIOMETRIC_VOICE = 6;
	public final static int TYPEOFBIOMETRIC_DNA_RNA = 7;
	public final static int TYPEOFBIOMETRIC_EEG = 8;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BiometricAuthentication() {

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
	public CIM_BiometricAuthentication(Vector keyProperties){ 
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
	public CIM_BiometricAuthentication(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_BiometricAuthentication)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BiometricAuthentication)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BiometricAuthentication)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BiometricAuthentication)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BiometricAuthentication)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BiometricAuthentication)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BiometricAuthentication)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BiometricAuthentication)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BiometricAuthentication)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BiometricAuthentication)object).cimObjectPath)) {
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
	
	// Attribute OtherBiometric
	
	public String get_OtherBiometric() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BiometricAuthentication.CIM_PROPERTY_OTHERBIOMETRIC);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BiometricAuthentication.CIM_PROPERTY_OTHERBIOMETRIC + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BiometricAuthentication.CIM_PROPERTY_OTHERBIOMETRIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherBiometric(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BiometricAuthentication.CIM_PROPERTY_OTHERBIOMETRIC);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BiometricAuthentication.CIM_PROPERTY_OTHERBIOMETRIC + " could not be found");
    		
		} else if (!CIM_BiometricAuthenticationHelper.isValid_OtherBiometric(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BiometricAuthentication.CIM_PROPERTY_OTHERBIOMETRIC);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BiometricAuthentication.CIM_PROPERTY_OTHERBIOMETRIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PersonalIdentifier
	
	public String get_PersonalIdentifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BiometricAuthentication.CIM_PROPERTY_PERSONALIDENTIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BiometricAuthentication.CIM_PROPERTY_PERSONALIDENTIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BiometricAuthentication.CIM_PROPERTY_PERSONALIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PersonalIdentifier(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BiometricAuthentication.CIM_PROPERTY_PERSONALIDENTIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BiometricAuthentication.CIM_PROPERTY_PERSONALIDENTIFIER + " could not be found");
    		
		} else if (!CIM_BiometricAuthenticationHelper.isValid_PersonalIdentifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BiometricAuthentication.CIM_PROPERTY_PERSONALIDENTIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BiometricAuthentication.CIM_PROPERTY_PERSONALIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TypeOfBiometric
	
	public UnsignedInt16 get_TypeOfBiometric() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BiometricAuthentication.CIM_PROPERTY_TYPEOFBIOMETRIC);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BiometricAuthentication.CIM_PROPERTY_TYPEOFBIOMETRIC + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BiometricAuthentication.CIM_PROPERTY_TYPEOFBIOMETRIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TypeOfBiometric(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BiometricAuthentication.CIM_PROPERTY_TYPEOFBIOMETRIC);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BiometricAuthentication.CIM_PROPERTY_TYPEOFBIOMETRIC + " could not be found");
    		
		} else if (!CIM_BiometricAuthenticationHelper.isValid_TypeOfBiometric(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BiometricAuthentication.CIM_PROPERTY_TYPEOFBIOMETRIC);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BiometricAuthentication.CIM_PROPERTY_TYPEOFBIOMETRIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
