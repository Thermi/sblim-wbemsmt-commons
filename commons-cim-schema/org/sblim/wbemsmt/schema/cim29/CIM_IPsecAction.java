/** 
 * CIM_IPsecAction.java
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
 * Description: IPsecAction specifies the parameters to use for an IPsec phase 2 negotiation.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_IPsecAction extends CIM_SANegotiationAction  {
	
	public final static String CIM_CLASS_NAME = "CIM_IPsecAction";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The property Granularity is an enumeration that specifies how the selector for the SA should be derived from the traffic that triggered the negotiation. Its values are: 
1=Other; See the OtherGranularity property for more information 
2=Subnet; The source and destination subnet masks are used 
3=Address; The source and destination IP addresses of the triggering packet are used 
4=Protocol; The source and destination IP addresses and the IP protocol of the triggering packet are used 
5=Port; The source and destination IP addresses, IP protocol and the source and destination layer 4 ports of the triggering packet are used.
	*/
	public final static String CIM_PROPERTY_GRANULARITY = "Granularity"; //$NON-NLS-1$
	/**
	*	GroupId specifies the PFS group ID to use. This value is only used if PFS is True and UsePhase1Group is False. If the GroupID number is from the vendor-specific range (32768-65535), the VendorID qualifies the group number. Well-known group identifiers from RFC2412, Appendix E, are: Group 1='768 bit prime', Group 2='1024 bit prime', Group 3='Elliptic Curve Group with 155 bit field element', Group 4='Large Elliptic Curve Group with 185 bit field element', and Group 5='1536 bit prime'.
	*/
	public final static String CIM_PROPERTY_GROUPID = "GroupId"; //$NON-NLS-1$
	/**
	*	Description of the granularity when the value 1 ("Other") is specified for the property, Granularity.
	*/
	public final static String CIM_PROPERTY_OTHERGRANULARITY = "OtherGranularity"; //$NON-NLS-1$
	/**
	*	UsePFS indicates whether perfect forward secrecy is required when refreshing keys.
	*/
	public final static String CIM_PROPERTY_USEPFS = "UsePFS"; //$NON-NLS-1$
	/**
	*	UsePhase1Group indicates that the phase 2 GroupId should be the same as that used in the phase 1 key exchange. If UsePFS is False, then this property is ignored. Note that a value of False indicates that the property GroupId will contain the key exchange group to use for phase 2.
	*/
	public final static String CIM_PROPERTY_USEPHASE1GROUP = "UsePhase1Group"; //$NON-NLS-1$
	/**
	*	The property VendorID is used together with the property GroupID (when it is in the vendor-specific range) to identify the key exchange group. VendorID is ignored unless UsePFS is true, AND UsePhase1Group is False, AND GroupID is in the vendor-specific range (32768-65535).
	*/
	public final static String CIM_PROPERTY_VENDORID = "VendorID"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_GRANULARITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_GROUPID);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERGRANULARITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_USEPFS);
		CIM_PropertyNameList.add(CIM_PROPERTY_USEPHASE1GROUP);
		CIM_PropertyNameList.add(CIM_PROPERTY_VENDORID);
				
		for (int i = 0; i < CIM_SANegotiationAction.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SANegotiationAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GRANULARITY)||
				((String)CIM_SANegotiationAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GROUPID)||
				((String)CIM_SANegotiationAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERGRANULARITY)||
				((String)CIM_SANegotiationAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USEPFS)||
				((String)CIM_SANegotiationAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USEPHASE1GROUP)||
				((String)CIM_SANegotiationAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VENDORID)){
				continue;
			}
			
			CIM_IPsecAction.CIM_PropertyNameList.add(CIM_SANegotiationAction.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GRANULARITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GROUPID, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERGRANULARITY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USEPFS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USEPHASE1GROUP, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VENDORID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_SANegotiationAction.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SANegotiationAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GRANULARITY)||
				((CIMProperty)CIM_SANegotiationAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GROUPID)||
				((CIMProperty)CIM_SANegotiationAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERGRANULARITY)||
				((CIMProperty)CIM_SANegotiationAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USEPFS)||
				((CIMProperty)CIM_SANegotiationAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USEPHASE1GROUP)||
				((CIMProperty)CIM_SANegotiationAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VENDORID)){
				continue;
			}
			
			CIM_IPsecAction.CIM_PropertyList.add(CIM_SANegotiationAction.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SANegotiationAction.Java_Package_List.size(); i++) {
			if (((String)CIM_SANegotiationAction.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SANegotiationAction.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_GRANULARITY = {"Other","Subnet","Address","Protocol","Port"};
	public final static String[] CIM_VALUEMAP_GROUPID = {"No Group/Non-Diffie-Hellman Exchange","DH-768 bit prime","DH-1024 bit prime","EC2N-155 bit field element","EC2N-185 bit field element","DH-1536 bit prime","Standard Group - Reserved","Vendor Reserved"};
	
	
	public final static int GRANULARITY_OTHER = 1;
	public final static int GRANULARITY_SUBNET = 2;
	public final static int GRANULARITY_ADDRESS = 3;
	public final static int GRANULARITY_PROTOCOL = 4;
	public final static int GRANULARITY_PORT = 5;
	
	public final static String GROUPID_NOGROUP_NON_DIFFIE_HELLMANEXCHANGE = "0";
	public final static String GROUPID_DH_768BITPRIME = "1";
	public final static String GROUPID_DH_1024BITPRIME = "2";
	public final static String GROUPID_EC2N_155BITFIELDELEMENT = "3";
	public final static String GROUPID_EC2N_185BITFIELDELEMENT = "4";
	public final static String GROUPID_DH_1536BITPRIME = "5";
	public final static String GROUPID_STANDARDGROUP_RESERVED = "..";
	public final static String GROUPID_VENDORRESERVED = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IPsecAction() {

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
	public CIM_IPsecAction(Vector keyProperties){ 
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
	public CIM_IPsecAction(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_IPsecAction)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IPsecAction)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IPsecAction)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IPsecAction)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IPsecAction)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IPsecAction)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IPsecAction)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IPsecAction)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IPsecAction)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IPsecAction)object).cimObjectPath)) {
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
	
	// Attribute Granularity
	
	public UnsignedInt16 get_Granularity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecAction.CIM_PROPERTY_GRANULARITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecAction.CIM_PROPERTY_GRANULARITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecAction.CIM_PROPERTY_GRANULARITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Granularity(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecAction.CIM_PROPERTY_GRANULARITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecAction.CIM_PROPERTY_GRANULARITY + " could not be found");
    		
		} else if (!CIM_IPsecActionHelper.isValid_Granularity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPsecAction.CIM_PROPERTY_GRANULARITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecAction.CIM_PROPERTY_GRANULARITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute GroupId
	
	public UnsignedInt16 get_GroupId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecAction.CIM_PROPERTY_GROUPID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecAction.CIM_PROPERTY_GROUPID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecAction.CIM_PROPERTY_GROUPID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_GroupId(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecAction.CIM_PROPERTY_GROUPID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecAction.CIM_PROPERTY_GROUPID + " could not be found");
    		
		} else if (!CIM_IPsecActionHelper.isValid_GroupId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPsecAction.CIM_PROPERTY_GROUPID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecAction.CIM_PROPERTY_GROUPID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherGranularity
	
	public String get_OtherGranularity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecAction.CIM_PROPERTY_OTHERGRANULARITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecAction.CIM_PROPERTY_OTHERGRANULARITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecAction.CIM_PROPERTY_OTHERGRANULARITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherGranularity(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecAction.CIM_PROPERTY_OTHERGRANULARITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecAction.CIM_PROPERTY_OTHERGRANULARITY + " could not be found");
    		
		} else if (!CIM_IPsecActionHelper.isValid_OtherGranularity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPsecAction.CIM_PROPERTY_OTHERGRANULARITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecAction.CIM_PROPERTY_OTHERGRANULARITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UsePFS
	
	public Boolean get_UsePFS() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecAction.CIM_PROPERTY_USEPFS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecAction.CIM_PROPERTY_USEPFS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecAction.CIM_PROPERTY_USEPFS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UsePFS(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecAction.CIM_PROPERTY_USEPFS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecAction.CIM_PROPERTY_USEPFS + " could not be found");
    		
		} else if (!CIM_IPsecActionHelper.isValid_UsePFS(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPsecAction.CIM_PROPERTY_USEPFS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecAction.CIM_PROPERTY_USEPFS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UsePhase1Group
	
	public Boolean get_UsePhase1Group() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecAction.CIM_PROPERTY_USEPHASE1GROUP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecAction.CIM_PROPERTY_USEPHASE1GROUP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecAction.CIM_PROPERTY_USEPHASE1GROUP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UsePhase1Group(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecAction.CIM_PROPERTY_USEPHASE1GROUP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecAction.CIM_PROPERTY_USEPHASE1GROUP + " could not be found");
    		
		} else if (!CIM_IPsecActionHelper.isValid_UsePhase1Group(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPsecAction.CIM_PROPERTY_USEPHASE1GROUP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecAction.CIM_PROPERTY_USEPHASE1GROUP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VendorID
	
	public String get_VendorID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecAction.CIM_PROPERTY_VENDORID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecAction.CIM_PROPERTY_VENDORID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecAction.CIM_PROPERTY_VENDORID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VendorID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecAction.CIM_PROPERTY_VENDORID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecAction.CIM_PROPERTY_VENDORID + " could not be found");
    		
		} else if (!CIM_IPsecActionHelper.isValid_VendorID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPsecAction.CIM_PROPERTY_VENDORID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecAction.CIM_PROPERTY_VENDORID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
