/** 
 * CIM_PeerIDPayloadFilterEntry.java
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
 * Description: PeerIDPayloadFilterEntry defines filters used to match the Identification Type field in the ID Payload of the IKE protocol exchange. It permits the specification of ID values such as "*@example.com" or "192.0.2.0/24".
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PeerIDPayloadFilterEntry extends CIM_FilterEntryBase  {
	
	public final static String CIM_CLASS_NAME = "CIM_PeerIDPayloadFilterEntry";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	MatchIdentityType specifies the Identification Type provided by the peer in the payload. The list of identities was generated from Section 4.6.2.1 of RFC2407. Note that the enumeration is different than the RFC list, since the value 'Other' is taken into account.
	*/
	public final static String CIM_PROPERTY_MATCHIDENTITYTYPE = "MatchIdentityType"; //$NON-NLS-1$
	/**
	*	MatchIdentityValue is the filter value for comparison with the ID payload, e,g, "*@company.com". The syntax may need to be converted for comparison. For example, if the type of identity is a DER-encoded distinguished name, (for example, MatchIdentityType = 10, "DER_ASN1_DN"), the MatchIdentityValue MUST be converted into a DER-encoded string. This allows it to be matched against the values extracted from the ID payload at runtime. 

Note that a wildcard mechanism may be used when MatchIdentityType specifies a general character string (for example, if MatchIdentityType=3, 'FQDN'). MatchFieldValue may contain a wildcard character, '*', in the pattern match specification. For example, for 'FQDN', a MatchFieldValue of '*@example.com' will successfully match an ID payload of 'janedoe@example.com'. A wildcard can be used to represent 0 or more characters as is appropriate for the type specified in MatchIdentityType.
	*/
	public final static String CIM_PROPERTY_MATCHIDENTITYVALUE = "MatchIdentityValue"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MATCHIDENTITYTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MATCHIDENTITYVALUE);
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MATCHIDENTITYTYPE)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MATCHIDENTITYVALUE)){
				continue;
			}
			
			CIM_PeerIDPayloadFilterEntry.CIM_PropertyNameList.add(CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MATCHIDENTITYTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MATCHIDENTITYVALUE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MATCHIDENTITYTYPE)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MATCHIDENTITYVALUE)){
				continue;
			}
			
			CIM_PeerIDPayloadFilterEntry.CIM_PropertyList.add(CIM_FilterEntryBase.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_FilterEntryBase.Java_Package_List.size(); i++) {
			if (((String)CIM_FilterEntryBase.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_FilterEntryBase.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_MATCHIDENTITYTYPE = {"Other","IPV4 Address","FQDN","User FQDN","IPV4 Subnet Address","IPV6 Address","IPV6 Subnet Address","IPV4 Address Range","IPV6 Address Range","DER ASN1 DN","DER ASN1 GN","KEY ID","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String MATCHIDENTITYTYPE_OTHER = "1";
	public final static String MATCHIDENTITYTYPE_IPV4ADDRESS = "2";
	public final static String MATCHIDENTITYTYPE_FQDN = "3";
	public final static String MATCHIDENTITYTYPE_USERFQDN = "4";
	public final static String MATCHIDENTITYTYPE_IPV4SUBNETADDRESS = "5";
	public final static String MATCHIDENTITYTYPE_IPV6ADDRESS = "6";
	public final static String MATCHIDENTITYTYPE_IPV6SUBNETADDRESS = "7";
	public final static String MATCHIDENTITYTYPE_IPV4ADDRESSRANGE = "8";
	public final static String MATCHIDENTITYTYPE_IPV6ADDRESSRANGE = "9";
	public final static String MATCHIDENTITYTYPE_DERASN1DN = "10";
	public final static String MATCHIDENTITYTYPE_DERASN1GN = "11";
	public final static String MATCHIDENTITYTYPE_KEYID = "12";
	public final static String MATCHIDENTITYTYPE_DMTFRESERVED = "..";
	public final static String MATCHIDENTITYTYPE_VENDORRESERVED = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PeerIDPayloadFilterEntry() {

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
	public CIM_PeerIDPayloadFilterEntry(Vector keyProperties){ 
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
	public CIM_PeerIDPayloadFilterEntry(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_MatchIdentityType = this.cimInstance.getProperty(CIM_PROPERTY_MATCHIDENTITYTYPE);
		
		if (CIMProperty_MatchIdentityType == null || CIMProperty_MatchIdentityType.getValue().isEmpty() || CIMProperty_MatchIdentityType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_MATCHIDENTITYTYPE, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_MatchIdentityValue = this.cimInstance.getProperty(CIM_PROPERTY_MATCHIDENTITYVALUE);
		
		if (CIMProperty_MatchIdentityValue == null || CIMProperty_MatchIdentityValue.getValue().isEmpty() || CIMProperty_MatchIdentityValue.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_MATCHIDENTITYVALUE, "Required"});
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
	    
	    if (!(object instanceof CIM_PeerIDPayloadFilterEntry)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PeerIDPayloadFilterEntry)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PeerIDPayloadFilterEntry)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PeerIDPayloadFilterEntry)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PeerIDPayloadFilterEntry)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PeerIDPayloadFilterEntry)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PeerIDPayloadFilterEntry)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PeerIDPayloadFilterEntry)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PeerIDPayloadFilterEntry)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PeerIDPayloadFilterEntry)object).cimObjectPath)) {
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
	
	// Attribute MatchIdentityType
	
	public UnsignedInt16 get_MatchIdentityType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MatchIdentityType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYTYPE + " could not be found");
    		
		} else if (!CIM_PeerIDPayloadFilterEntryHelper.isValid_MatchIdentityType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MatchIdentityValue
	
	public String get_MatchIdentityValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MatchIdentityValue(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYVALUE + " could not be found");
    		
		} else if (!CIM_PeerIDPayloadFilterEntryHelper.isValid_MatchIdentityValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PeerIDPayloadFilterEntry.CIM_PROPERTY_MATCHIDENTITYVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
