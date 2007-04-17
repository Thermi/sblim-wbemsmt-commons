/** 
 * CIM_IKESAEndpoint.java
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
 * Description:  IKESAEndpoint is created in the first phase of SA negotiation and protects the
 * key negotiation traffic. This endpoint is only created when IKE is the key
 * exchange protocol. Other protocols and their endpoints will be defined in a
 * future release.
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
import org.sblim.wbem.cim.UnsignedInt64;


/**
 *  IKESAEndpoint is created in the first phase of SA negotiation and protects the
 * key negotiation traffic. This endpoint is only created when IKE is the key
 * exchange protocol. Other protocols and their endpoints will be defined in a
 * future release.
 */
public class CIM_IKESAEndpoint extends CIM_SecurityAssociationEndpoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_IKESAEndpoint"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	AuthenticationMethod is an enumeration that specifies the operation of the IKESAEndpoint. The list of methods was generated from Appendix A of RFC2409. Note that the enumeration is different than the RFC list, since the values of Unknown and Other are taken into account.
	*/
	public final static String CIM_PROPERTY_AUTHENTICATIONMETHOD = "AuthenticationMethod"; //$NON-NLS-1$
	/**
	*	CipherAlgorithm is an enumeration that specifies the encryption algorithm used by the IKESAEndpoint. The list of algorithms was generated from Appendix A of RFC2409. Note that the enumeration is different than the RFC list, since the values of Unknown and Other are taken into account.
	*/
	public final static String CIM_PROPERTY_CIPHERALGORITHM = "CipherAlgorithm"; //$NON-NLS-1$
	/**
	*	GroupId specifies the key exchange group ID. If the GroupID number is from the vendor-specific range (32768-65535), the VendorID qualifies the group number. Well-known group identifiers from RFC2412, Appendix E, are: Group 1='768 bit prime', Group 2='1024 bit prime', Group 3= 'Elliptic Curve Group with 155 bit field element', Group 4= 'Large Elliptic Curve Group with 185 bit field element', and Group 5='1536 bit prime'.
	*/
	public final static String CIM_PROPERTY_GROUPID = "GroupId"; //$NON-NLS-1$
	/**
	*	HashAlgorithm is an enumeration that specifies the hash function used by the IKESAEndpoint. The list of algorithms was generated from Appendix A of RFC2409. Note that the enumeration is different than the RFC list, since the values of Unknown and Other are taken into account.
	*/
	public final static String CIM_PROPERTY_HASHALGORITHM = "HashAlgorithm"; //$NON-NLS-1$
	/**
	*	Identifier of the IKE phase 1 negotiation initiator. Combined with the ResponderCookie, this value, in string form, may be used to construct the value of the key field 'Name', inherited from ServiceAccessPoint.
	*/
	public final static String CIM_PROPERTY_INITIATORCOOKIE = "InitiatorCookie"; //$NON-NLS-1$
	/**
	*	Description of the method when the value 1 ("Other") is specified for the property, AuthenticationMethod.
	*/
	public final static String CIM_PROPERTY_OTHERAUTHENTICATIONMETHOD = "OtherAuthenticationMethod"; //$NON-NLS-1$
	/**
	*	Description of the encryption algorithm when the value 1 ("Other") is specified for the property, CipherAlgorithm.
	*/
	public final static String CIM_PROPERTY_OTHERCIPHERALGORITHM = "OtherCipherAlgorithm"; //$NON-NLS-1$
	/**
	*	Description of the hash function when the value 1 ("Other") is specified for the property, HashAlgorithm.
	*/
	public final static String CIM_PROPERTY_OTHERHASHALGORITHM = "OtherHashAlgorithm"; //$NON-NLS-1$
	/**
	*	Identifier of the IKE phase 1 negotiation responder. Combined with the InitiatorCookie, this value, in string form, may be used to construct the value of the key field 'Name', inherited from ServiceAccessPoint.
	*/
	public final static String CIM_PROPERTY_RESPONDERCOOKIE = "ResponderCookie"; //$NON-NLS-1$
	/**
	*	VendorID identifies the vendor when the value of GroupID is in the vendor-specific range, 32768 to 65535.
	*/
	public final static String CIM_PROPERTY_VENDORID = "VendorID"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AUTHENTICATIONMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIPHERALGORITHM);
		CIM_PropertyNameList.add(CIM_PROPERTY_GROUPID);
		CIM_PropertyNameList.add(CIM_PROPERTY_HASHALGORITHM);
		CIM_PropertyNameList.add(CIM_PROPERTY_INITIATORCOOKIE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERAUTHENTICATIONMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCIPHERALGORITHM);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERHASHALGORITHM);
		CIM_PropertyNameList.add(CIM_PROPERTY_RESPONDERCOOKIE);
		CIM_PropertyNameList.add(CIM_PROPERTY_VENDORID);
				
		for (int i = 0; i < CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUTHENTICATIONMETHOD)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CIPHERALGORITHM)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GROUPID)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HASHALGORITHM)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INITIATORCOOKIE)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERAUTHENTICATIONMETHOD)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCIPHERALGORITHM)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERHASHALGORITHM)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RESPONDERCOOKIE)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VENDORID)){
				continue;
			}
			
			CIM_IKESAEndpoint.CIM_PropertyNameList.add(CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUTHENTICATIONMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIPHERALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GROUPID, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HASHALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INITIATORCOOKIE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERAUTHENTICATIONMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCIPHERALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERHASHALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESPONDERCOOKIE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VENDORID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_SecurityAssociationEndpoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUTHENTICATIONMETHOD)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CIPHERALGORITHM)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GROUPID)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HASHALGORITHM)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INITIATORCOOKIE)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERAUTHENTICATIONMETHOD)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCIPHERALGORITHM)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERHASHALGORITHM)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RESPONDERCOOKIE)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VENDORID)){
				continue;
			}
			
			CIM_IKESAEndpoint.CIM_PropertyList.add(CIM_SecurityAssociationEndpoint.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SecurityAssociationEndpoint.Java_Package_List.size(); i++) {
			if (((String)CIM_SecurityAssociationEndpoint.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_SecurityAssociationEndpoint.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_AUTHENTICATIONMETHOD = {"Unknown","Other","Pre-shared Key","DSS Signatures","RSA Signatures","Encryption with RSA","Revised Encryption with RSA","DMTF/IANA Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_CIPHERALGORITHM = {"Unknown","Other","DES","IDEA","Blowfish","RC5","3DES","CAST","DMTF/IANA Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_GROUPID = {"No Group/Non-Diffie-Hellman Exchange","DH-768 bit prime","DH-1024 bit prime","EC2N-155 bit field element","EC2N-185 bit field element","DH-1536 bit prime","Standard Group - Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_HASHALGORITHM = {"Unknown","Other","MD5","SHA-1","Tiger","DMTF/IANA Reserved","Vendor Reserved"};
	
	
	public final static String AUTHENTICATIONMETHOD_UNKNOWN = "0";
	public final static String AUTHENTICATIONMETHOD_OTHER = "1";
	public final static String AUTHENTICATIONMETHOD_PRE_SHAREDKEY = "2";
	public final static String AUTHENTICATIONMETHOD_DSSSIGNATURES = "3";
	public final static String AUTHENTICATIONMETHOD_RSASIGNATURES = "4";
	public final static String AUTHENTICATIONMETHOD_ENCRYPTIONWITHRSA = "5";
	public final static String AUTHENTICATIONMETHOD_REVISEDENCRYPTIONWITHRSA = "6";
	public final static String AUTHENTICATIONMETHOD_DMTF_IANARESERVED = "7..65000";
	public final static String AUTHENTICATIONMETHOD_VENDORRESERVED = "65001..65535";
	
	public final static String CIPHERALGORITHM_UNKNOWN = "0";
	public final static String CIPHERALGORITHM_OTHER = "1";
	public final static String CIPHERALGORITHM_DES = "2";
	public final static String CIPHERALGORITHM_IDEA = "3";
	public final static String CIPHERALGORITHM_BLOWFISH = "4";
	public final static String CIPHERALGORITHM_RC5 = "5";
	public final static String CIPHERALGORITHM_3DES = "6";
	public final static String CIPHERALGORITHM_CAST = "7";
	public final static String CIPHERALGORITHM_DMTF_IANARESERVED = "8..65000";
	public final static String CIPHERALGORITHM_VENDORRESERVED = "65001..65535";
	
	public final static String GROUPID_NOGROUP_NON_DIFFIE_HELLMANEXCHANGE = "0";
	public final static String GROUPID_DH_768BITPRIME = "1";
	public final static String GROUPID_DH_1024BITPRIME = "2";
	public final static String GROUPID_EC2N_155BITFIELDELEMENT = "3";
	public final static String GROUPID_EC2N_185BITFIELDELEMENT = "4";
	public final static String GROUPID_DH_1536BITPRIME = "5";
	public final static String GROUPID_STANDARDGROUP_RESERVED = "..";
	public final static String GROUPID_VENDORRESERVED = "0x8000..";
	
	public final static String HASHALGORITHM_UNKNOWN = "0";
	public final static String HASHALGORITHM_OTHER = "1";
	public final static String HASHALGORITHM_MD5 = "2";
	public final static String HASHALGORITHM_SHA_1 = "3";
	public final static String HASHALGORITHM_TIGER = "4";
	public final static String HASHALGORITHM_DMTF_IANARESERVED = "5..65000";
	public final static String HASHALGORITHM_VENDORRESERVED = "65001..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IKESAEndpoint() {

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
	public CIM_IKESAEndpoint(Vector keyProperties){ 
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
	public CIM_IKESAEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_IKESAEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IKESAEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IKESAEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IKESAEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IKESAEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IKESAEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IKESAEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IKESAEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IKESAEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IKESAEndpoint)object).cimObjectPath)) {
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
	
	// Attribute AuthenticationMethod
	
	public UnsignedInt16 get_AuthenticationMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_AUTHENTICATIONMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_AUTHENTICATIONMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_AUTHENTICATIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AuthenticationMethod(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_AUTHENTICATIONMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_AUTHENTICATIONMETHOD + " could not be found");
    		
		} else if (!CIM_IKESAEndpointHelper.isValid_AuthenticationMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKESAEndpoint.CIM_PROPERTY_AUTHENTICATIONMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_AUTHENTICATIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CipherAlgorithm
	
	public UnsignedInt16 get_CipherAlgorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_CIPHERALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_CIPHERALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_CIPHERALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CipherAlgorithm(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_CIPHERALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_CIPHERALGORITHM + " could not be found");
    		
		} else if (!CIM_IKESAEndpointHelper.isValid_CipherAlgorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKESAEndpoint.CIM_PROPERTY_CIPHERALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_CIPHERALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute GroupId
	
	public UnsignedInt16 get_GroupId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_GROUPID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_GROUPID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_GROUPID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_GroupId(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_GROUPID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_GROUPID + " could not be found");
    		
		} else if (!CIM_IKESAEndpointHelper.isValid_GroupId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKESAEndpoint.CIM_PROPERTY_GROUPID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_GROUPID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HashAlgorithm
	
	public UnsignedInt16 get_HashAlgorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_HASHALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_HASHALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_HASHALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HashAlgorithm(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_HASHALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_HASHALGORITHM + " could not be found");
    		
		} else if (!CIM_IKESAEndpointHelper.isValid_HashAlgorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKESAEndpoint.CIM_PROPERTY_HASHALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_HASHALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InitiatorCookie
	
	public UnsignedInt64 get_InitiatorCookie() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_INITIATORCOOKIE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_INITIATORCOOKIE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_INITIATORCOOKIE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InitiatorCookie(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_INITIATORCOOKIE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_INITIATORCOOKIE + " could not be found");
    		
		} else if (!CIM_IKESAEndpointHelper.isValid_InitiatorCookie(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKESAEndpoint.CIM_PROPERTY_INITIATORCOOKIE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_INITIATORCOOKIE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherAuthenticationMethod
	
	public String get_OtherAuthenticationMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_OTHERAUTHENTICATIONMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERAUTHENTICATIONMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERAUTHENTICATIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherAuthenticationMethod(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_OTHERAUTHENTICATIONMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERAUTHENTICATIONMETHOD + " could not be found");
    		
		} else if (!CIM_IKESAEndpointHelper.isValid_OtherAuthenticationMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERAUTHENTICATIONMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERAUTHENTICATIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherCipherAlgorithm
	
	public String get_OtherCipherAlgorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_OTHERCIPHERALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERCIPHERALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERCIPHERALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherCipherAlgorithm(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_OTHERCIPHERALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERCIPHERALGORITHM + " could not be found");
    		
		} else if (!CIM_IKESAEndpointHelper.isValid_OtherCipherAlgorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERCIPHERALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERCIPHERALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherHashAlgorithm
	
	public String get_OtherHashAlgorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_OTHERHASHALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERHASHALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERHASHALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherHashAlgorithm(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_OTHERHASHALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERHASHALGORITHM + " could not be found");
    		
		} else if (!CIM_IKESAEndpointHelper.isValid_OtherHashAlgorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERHASHALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_OTHERHASHALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ResponderCookie
	
	public UnsignedInt64 get_ResponderCookie() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_RESPONDERCOOKIE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_RESPONDERCOOKIE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_RESPONDERCOOKIE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ResponderCookie(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_RESPONDERCOOKIE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_RESPONDERCOOKIE + " could not be found");
    		
		} else if (!CIM_IKESAEndpointHelper.isValid_ResponderCookie(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKESAEndpoint.CIM_PROPERTY_RESPONDERCOOKIE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_RESPONDERCOOKIE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VendorID
	
	public String get_VendorID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_VENDORID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_VENDORID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_VENDORID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VendorID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKESAEndpoint.CIM_PROPERTY_VENDORID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_VENDORID + " could not be found");
    		
		} else if (!CIM_IKESAEndpointHelper.isValid_VendorID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKESAEndpoint.CIM_PROPERTY_VENDORID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKESAEndpoint.CIM_PROPERTY_VENDORID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
