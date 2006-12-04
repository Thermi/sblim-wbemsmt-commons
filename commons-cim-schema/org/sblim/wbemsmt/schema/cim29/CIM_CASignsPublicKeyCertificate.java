/** 
 * CIM_CASignsPublicKeyCertificate.java
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
 * Description: This relationship associates a CertificateAuthority with the certificates it signs.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;


public class CIM_CASignsPublicKeyCertificate extends CIM_ManagedCredential  {
	
	public final static String CIM_CLASS_NAME = "CIM_CASignsPublicKeyCertificate";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_CERTIFICATEAUTHORITY = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	The Authority's revocation list distribution points.
	*/
	public final static String CIM_PROPERTY_CRLDISTRIBUTIONPOINT = "CRLDistributionPoint"; //$NON-NLS-1$
	/**
	*	The time it expires.
	*/
	public final static String CIM_PROPERTY_EXPIRES = "Expires"; //$NON-NLS-1$
	/**
	*	The Serial Number.
	*/
	public final static String CIM_PROPERTY_SERIALNUMBER = "SerialNumber"; //$NON-NLS-1$
	/**
	*	The Signature.
	*/
	public final static String CIM_PROPERTY_SIGNATURE = "Signature"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CRLDISTRIBUTIONPOINT);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXPIRES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERIALNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_SIGNATURE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_CERTIFICATEAUTHORITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE);
				
		for (int i = 0; i < CIM_ManagedCredential.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ManagedCredential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CRLDISTRIBUTIONPOINT)||
				((String)CIM_ManagedCredential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXPIRES)||
				((String)CIM_ManagedCredential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERIALNUMBER)||
				((String)CIM_ManagedCredential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SIGNATURE)){
				continue;
			}
			
			CIM_CASignsPublicKeyCertificate.CIM_PropertyNameList.add(CIM_ManagedCredential.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CRLDISTRIBUTIONPOINT, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXPIRES, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERIALNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SIGNATURE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_CERTIFICATEAUTHORITY, new CIMValue(null, new CIMDataType(CIM_CertificateAuthority.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE, new CIMValue(null, new CIMDataType(CIM_PublicKeyCertificate.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ManagedCredential.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ManagedCredential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CRLDISTRIBUTIONPOINT)||
				((CIMProperty)CIM_ManagedCredential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXPIRES)||
				((CIMProperty)CIM_ManagedCredential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERIALNUMBER)||
				((CIMProperty)CIM_ManagedCredential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SIGNATURE)){
				continue;
			}
			
			CIM_CASignsPublicKeyCertificate.CIM_PropertyList.add(CIM_ManagedCredential.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ManagedCredential.Java_Package_List.size(); i++) {
			if (((String)CIM_ManagedCredential.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ManagedCredential.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_CASignsPublicKeyCertificate() {

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
	public CIM_CASignsPublicKeyCertificate(Vector keyProperties){ 
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
	public CIM_CASignsPublicKeyCertificate(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_CASignsPublicKeyCertificate)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_CASignsPublicKeyCertificate)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_CASignsPublicKeyCertificate)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_CASignsPublicKeyCertificate)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_CASignsPublicKeyCertificate)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_CASignsPublicKeyCertificate)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_CASignsPublicKeyCertificate)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_CASignsPublicKeyCertificate)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_CASignsPublicKeyCertificate)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_CASignsPublicKeyCertificate)object).cimObjectPath)) {
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
	
	// Attribute CRLDistributionPoint
	
	public String[] get_CRLDistributionPoint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CRLDISTRIBUTIONPOINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CRLDISTRIBUTIONPOINT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CRLDISTRIBUTIONPOINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_CRLDistributionPoint(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CRLDISTRIBUTIONPOINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CRLDISTRIBUTIONPOINT + " could not be found");
    		
		} else if (!CIM_CASignsPublicKeyCertificateHelper.isValid_CRLDistributionPoint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CRLDISTRIBUTIONPOINT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CRLDISTRIBUTIONPOINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Expires
	
	public Calendar get_Expires() {

		CIMProperty property = this.cimInstance.getProperty(CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_EXPIRES);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_EXPIRES + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_EXPIRES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_Expires(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_EXPIRES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_EXPIRES + " could not be found");
    		
		} else if (!CIM_CASignsPublicKeyCertificateHelper.isValid_Expires(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_EXPIRES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_EXPIRES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute SerialNumber
	
	public String get_SerialNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SERIALNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SERIALNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SERIALNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SerialNumber(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SERIALNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SERIALNUMBER + " could not be found");
    		
		} else if (!CIM_CASignsPublicKeyCertificateHelper.isValid_SerialNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SERIALNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SERIALNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Signature
	
	public UnsignedInt8[] get_Signature() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SIGNATURE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SIGNATURE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SIGNATURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt8[] resultArray = new UnsignedInt8[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt8)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_Signature(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SIGNATURE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SIGNATURE + " could not be found");
    		
		} else if (!CIM_CASignsPublicKeyCertificateHelper.isValid_Signature(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SIGNATURE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_SIGNATURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_CertificateAuthority
	
	public CIMObjectPath get_CIM_CertificateAuthority() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_CERTIFICATEAUTHORITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_CERTIFICATEAUTHORITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_CertificateAuthority.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_CERTIFICATEAUTHORITY + " is not of expected type CIM_CertificateAuthority.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_CertificateAuthority(CIM_CertificateAuthority newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_CERTIFICATEAUTHORITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_CERTIFICATEAUTHORITY + " could not be found");
    		
		} else if (!CIM_CASignsPublicKeyCertificateHelper.isValid_CIM_CertificateAuthority(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_CERTIFICATEAUTHORITY);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_CertificateAuthority.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_CERTIFICATEAUTHORITY + " is not of expected type CIM_CertificateAuthority.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_CertificateAuthority.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_PublicKeyCertificate
	
	public CIMObjectPath get_CIM_PublicKeyCertificate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PublicKeyCertificate.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE + " is not of expected type CIM_PublicKeyCertificate.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PublicKeyCertificate(CIM_PublicKeyCertificate newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE + " could not be found");
    		
		} else if (!CIM_CASignsPublicKeyCertificateHelper.isValid_CIM_PublicKeyCertificate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PublicKeyCertificate.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CASignsPublicKeyCertificate.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE + " is not of expected type CIM_PublicKeyCertificate.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PublicKeyCertificate.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
