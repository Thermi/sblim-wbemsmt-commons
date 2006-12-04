/** 
 * CIM_IPNetworkIdentity.java
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
 * Description: IPNetworkIdentity is used to represent the various network identities that may be used for an IPProtocolEndpoint. The relationship between the NetworkIdentity and the IPProtocolEndpoint is modeled by the AssignedIdentity association, inherited from CIM_Identity. This association could also be used to relate an address range or other endpoint collection with the Identity.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_IPNetworkIdentity extends CIM_Identity  {
	
	public final static String CIM_CLASS_NAME = "CIM_IPNetworkIdentity";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The IdentityType specifies the type of IP network Identity. The list of identities was generated from Section 4.6.2.1 of RFC2407. Note that the enumeration is different than the RFC list, since the value 'Other' is taken into account.
	*/
	public final static String CIM_PROPERTY_IDENTITYTYPE = "IdentityType"; //$NON-NLS-1$
	/**
	*	IdentityValue contains a string encoding of the Identity. For Identity instances that are address types, the IdentityValue string value may be omitted and the associated IPProtocolEndpoint, RangeOfIPAddresses or similar class is used to define this information. The class is associated using the AssignedIdentity relationship.
	*/
	public final static String CIM_PROPERTY_IDENTITYVALUE = "IdentityValue"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_IDENTITYTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_IDENTITYVALUE);
				
		for (int i = 0; i < CIM_Identity.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Identity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IDENTITYTYPE)||
				((String)CIM_Identity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IDENTITYVALUE)){
				continue;
			}
			
			CIM_IPNetworkIdentity.CIM_PropertyNameList.add(CIM_Identity.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IDENTITYTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IDENTITYVALUE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Identity.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Identity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IDENTITYTYPE)||
				((CIMProperty)CIM_Identity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IDENTITYVALUE)){
				continue;
			}
			
			CIM_IPNetworkIdentity.CIM_PropertyList.add(CIM_Identity.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Identity.Java_Package_List.size(); i++) {
			if (((String)CIM_Identity.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Identity.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_IDENTITYTYPE = {"Other","IPV4 Address","FQDN","User FQDN","IPV4 Subnet Address","IPV6 Address","IPV6 Subnet Address","IPV4 Address Range","IPV6 Address Range","DER ASN1 DN","DER ASN1 GN","KEY ID","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String IDENTITYTYPE_OTHER = "1";
	public final static String IDENTITYTYPE_IPV4ADDRESS = "2";
	public final static String IDENTITYTYPE_FQDN = "3";
	public final static String IDENTITYTYPE_USERFQDN = "4";
	public final static String IDENTITYTYPE_IPV4SUBNETADDRESS = "5";
	public final static String IDENTITYTYPE_IPV6ADDRESS = "6";
	public final static String IDENTITYTYPE_IPV6SUBNETADDRESS = "7";
	public final static String IDENTITYTYPE_IPV4ADDRESSRANGE = "8";
	public final static String IDENTITYTYPE_IPV6ADDRESSRANGE = "9";
	public final static String IDENTITYTYPE_DERASN1DN = "10";
	public final static String IDENTITYTYPE_DERASN1GN = "11";
	public final static String IDENTITYTYPE_KEYID = "12";
	public final static String IDENTITYTYPE_DMTFRESERVED = "..";
	public final static String IDENTITYTYPE_VENDORRESERVED = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IPNetworkIdentity() {

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
	public CIM_IPNetworkIdentity(Vector keyProperties){ 
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
	public CIM_IPNetworkIdentity(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_IdentityType = this.cimInstance.getProperty(CIM_PROPERTY_IDENTITYTYPE);
		
		if (CIMProperty_IdentityType == null || CIMProperty_IdentityType.getValue().isEmpty() || CIMProperty_IdentityType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_IDENTITYTYPE, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_IdentityValue = this.cimInstance.getProperty(CIM_PROPERTY_IDENTITYVALUE);
		
		if (CIMProperty_IdentityValue == null || CIMProperty_IdentityValue.getValue().isEmpty() || CIMProperty_IdentityValue.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_IDENTITYVALUE, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_IPNetworkIdentity)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IPNetworkIdentity)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IPNetworkIdentity)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IPNetworkIdentity)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IPNetworkIdentity)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IPNetworkIdentity)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IPNetworkIdentity)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IPNetworkIdentity)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IPNetworkIdentity)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IPNetworkIdentity)object).cimObjectPath)) {
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
	
	// Attribute IdentityType
	
	public UnsignedInt16 get_IdentityType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IdentityType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYTYPE + " could not be found");
    		
		} else if (!CIM_IPNetworkIdentityHelper.isValid_IdentityType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IdentityValue
	
	public String get_IdentityValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IdentityValue(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYVALUE + " could not be found");
    		
		} else if (!CIM_IPNetworkIdentityHelper.isValid_IdentityValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPNetworkIdentity.CIM_PROPERTY_IDENTITYVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
