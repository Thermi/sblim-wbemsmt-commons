/** 
 * CIM_IKEAction.java
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
 * Description: IKEAction specifies the parameters to use for an IPsec IKE phase 1 negotiation.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_IKEAction extends CIM_SANegotiationAction  {
	
	public final static String CIM_CLASS_NAME = "CIM_IKEAction";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	When IKEAction.ExchangeMode is set to "Aggressive" (4), this property specifies the key exchange groupID to use in the first packets of the phase 1 negotiation. This property is ignored unless the ExchangeMode is 'aggressive'. If the GroupID number is from the vendor- specific range (32768-65535), the VendorID qualifies the group number. Well-known group identifiers from RFC2412, Appendix E, are: Group 1='768 bit prime', Group 2='1024 bit prime', Group 3='Elliptic Curve Group with 155 bit field element', Group 4='Large Elliptic Curve Group with 185 bit field element', and Group 5='1536 bit prime'.
	*/
	public final static String CIM_PROPERTY_AGGRESSIVEMODEGROUPID = "AggressiveModeGroupID"; //$NON-NLS-1$
	/**
	*	The ExchangeMode designates the mode IKE should use for its key negotiations.
	*/
	public final static String CIM_PROPERTY_EXCHANGEMODE = "ExchangeMode"; //$NON-NLS-1$
	/**
	*	UseIKEIdentityType specifies what network identity type should be used when negotiating with the peer. It is used in conjunction with the available IPNetworkIdentity instances, that are associated with an IPProtocolEndpoint.
	*/
	public final static String CIM_PROPERTY_USEIKEIDENTITYTYPE = "UseIKEIdentityType"; //$NON-NLS-1$
	/**
	*	VendorID specifies the value to be used in the Vendor ID payload. An empty string (the default) means that the Vendor ID payload will not be generated or accepted. A non-NULL value means that a Vendor ID payload will be generated (when acting as an initiator) or is expected (when acting as a responder).
	*/
	public final static String CIM_PROPERTY_VENDORID = "VendorID"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AGGRESSIVEMODEGROUPID);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXCHANGEMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_USEIKEIDENTITYTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_VENDORID);
				
		for (int i = 0; i < CIM_SANegotiationAction.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SANegotiationAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AGGRESSIVEMODEGROUPID)||
				((String)CIM_SANegotiationAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXCHANGEMODE)||
				((String)CIM_SANegotiationAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USEIKEIDENTITYTYPE)||
				((String)CIM_SANegotiationAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VENDORID)){
				continue;
			}
			
			CIM_IKEAction.CIM_PropertyNameList.add(CIM_SANegotiationAction.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AGGRESSIVEMODEGROUPID, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXCHANGEMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USEIKEIDENTITYTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VENDORID, new CIMValue("", new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_SANegotiationAction.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SANegotiationAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AGGRESSIVEMODEGROUPID)||
				((CIMProperty)CIM_SANegotiationAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXCHANGEMODE)||
				((CIMProperty)CIM_SANegotiationAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USEIKEIDENTITYTYPE)||
				((CIMProperty)CIM_SANegotiationAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VENDORID)){
				continue;
			}
			
			CIM_IKEAction.CIM_PropertyList.add(CIM_SANegotiationAction.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SANegotiationAction.Java_Package_List.size(); i++) {
			if (((String)CIM_SANegotiationAction.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SANegotiationAction.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_AGGRESSIVEMODEGROUPID = {"No Group/Non-Diffie-Hellman Exchange","DH-768 bit prime","DH-1024 bit prime","EC2N-155 bit field element","EC2N-185 bit field element","DH-1536 bit prime","Standard Group - Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_EXCHANGEMODE = {"Base","Main","Aggressive"};
	public final static String[] CIM_VALUEMAP_USEIKEIDENTITYTYPE = {"Other","IPV4 Address","FQDN","User FQDN","IPV4 Subnet Address","IPV6 Address","IPV6 Subnet Address","IPV4 Address Range","IPV6 Address Range","DER ASN1 DN","DER ASN1 GN","KEY ID","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String AGGRESSIVEMODEGROUPID_NOGROUP_NON_DIFFIE_HELLMANEXCHANGE = "0";
	public final static String AGGRESSIVEMODEGROUPID_DH_768BITPRIME = "1";
	public final static String AGGRESSIVEMODEGROUPID_DH_1024BITPRIME = "2";
	public final static String AGGRESSIVEMODEGROUPID_EC2N_155BITFIELDELEMENT = "3";
	public final static String AGGRESSIVEMODEGROUPID_EC2N_185BITFIELDELEMENT = "4";
	public final static String AGGRESSIVEMODEGROUPID_DH_1536BITPRIME = "5";
	public final static String AGGRESSIVEMODEGROUPID_STANDARDGROUP_RESERVED = "..";
	public final static String AGGRESSIVEMODEGROUPID_VENDORRESERVED = "0x8000..";
	
	public final static int EXCHANGEMODE_BASE = 2;
	public final static int EXCHANGEMODE_MAIN = 3;
	public final static int EXCHANGEMODE_AGGRESSIVE = 4;
	
	public final static String USEIKEIDENTITYTYPE_OTHER = "1";
	public final static String USEIKEIDENTITYTYPE_IPV4ADDRESS = "2";
	public final static String USEIKEIDENTITYTYPE_FQDN = "3";
	public final static String USEIKEIDENTITYTYPE_USERFQDN = "4";
	public final static String USEIKEIDENTITYTYPE_IPV4SUBNETADDRESS = "5";
	public final static String USEIKEIDENTITYTYPE_IPV6ADDRESS = "6";
	public final static String USEIKEIDENTITYTYPE_IPV6SUBNETADDRESS = "7";
	public final static String USEIKEIDENTITYTYPE_IPV4ADDRESSRANGE = "8";
	public final static String USEIKEIDENTITYTYPE_IPV6ADDRESSRANGE = "9";
	public final static String USEIKEIDENTITYTYPE_DERASN1DN = "10";
	public final static String USEIKEIDENTITYTYPE_DERASN1GN = "11";
	public final static String USEIKEIDENTITYTYPE_KEYID = "12";
	public final static String USEIKEIDENTITYTYPE_DMTFRESERVED = "..";
	public final static String USEIKEIDENTITYTYPE_VENDORRESERVED = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IKEAction() {

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
	public CIM_IKEAction(Vector keyProperties){ 
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
	public CIM_IKEAction(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_IKEAction)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IKEAction)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IKEAction)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IKEAction)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IKEAction)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IKEAction)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IKEAction)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IKEAction)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IKEAction)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IKEAction)object).cimObjectPath)) {
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
	
	// Attribute AggressiveModeGroupID
	
	public UnsignedInt16 get_AggressiveModeGroupID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKEAction.CIM_PROPERTY_AGGRESSIVEMODEGROUPID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKEAction.CIM_PROPERTY_AGGRESSIVEMODEGROUPID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKEAction.CIM_PROPERTY_AGGRESSIVEMODEGROUPID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AggressiveModeGroupID(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKEAction.CIM_PROPERTY_AGGRESSIVEMODEGROUPID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKEAction.CIM_PROPERTY_AGGRESSIVEMODEGROUPID + " could not be found");
    		
		} else if (!CIM_IKEActionHelper.isValid_AggressiveModeGroupID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKEAction.CIM_PROPERTY_AGGRESSIVEMODEGROUPID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKEAction.CIM_PROPERTY_AGGRESSIVEMODEGROUPID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExchangeMode
	
	public UnsignedInt16 get_ExchangeMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKEAction.CIM_PROPERTY_EXCHANGEMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKEAction.CIM_PROPERTY_EXCHANGEMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKEAction.CIM_PROPERTY_EXCHANGEMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExchangeMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKEAction.CIM_PROPERTY_EXCHANGEMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKEAction.CIM_PROPERTY_EXCHANGEMODE + " could not be found");
    		
		} else if (!CIM_IKEActionHelper.isValid_ExchangeMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKEAction.CIM_PROPERTY_EXCHANGEMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKEAction.CIM_PROPERTY_EXCHANGEMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UseIKEIdentityType
	
	public UnsignedInt16 get_UseIKEIdentityType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKEAction.CIM_PROPERTY_USEIKEIDENTITYTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKEAction.CIM_PROPERTY_USEIKEIDENTITYTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKEAction.CIM_PROPERTY_USEIKEIDENTITYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UseIKEIdentityType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKEAction.CIM_PROPERTY_USEIKEIDENTITYTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKEAction.CIM_PROPERTY_USEIKEIDENTITYTYPE + " could not be found");
    		
		} else if (!CIM_IKEActionHelper.isValid_UseIKEIdentityType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKEAction.CIM_PROPERTY_USEIKEIDENTITYTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKEAction.CIM_PROPERTY_USEIKEIDENTITYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VendorID
	
	public String get_VendorID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKEAction.CIM_PROPERTY_VENDORID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKEAction.CIM_PROPERTY_VENDORID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKEAction.CIM_PROPERTY_VENDORID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VendorID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKEAction.CIM_PROPERTY_VENDORID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKEAction.CIM_PROPERTY_VENDORID + " could not be found");
    		
		} else if (!CIM_IKEActionHelper.isValid_VendorID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKEAction.CIM_PROPERTY_VENDORID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKEAction.CIM_PROPERTY_VENDORID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
