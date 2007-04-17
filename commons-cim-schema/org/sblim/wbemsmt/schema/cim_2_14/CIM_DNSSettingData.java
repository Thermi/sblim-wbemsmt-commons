/** 
 * CIM_DNSSettingData.java
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
 * Description:  DNSSettingData defines the DNSconfiguration settings for a single IP network
 * connection. With the exception of the the DNSServerAddresses and the hostname
 * in use, the configuration of a DNSProtocolEndpoint is indicated by the
 * properties of an associated instance of DNSSettingData.
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
 *  DNSSettingData defines the DNSconfiguration settings for a single IP network
 * connection. With the exception of the the DNSServerAddresses and the hostname
 * in use, the configuration of a DNSProtocolEndpoint is indicated by the
 * properties of an associated instance of DNSSettingData.
 */
public class CIM_DNSSettingData extends CIM_IPAssignmentSettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_DNSSettingData"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.14.0";
	
	
	/**
	*	AddressOrigin identifies the method by which the IP Address, Subnet Mask, and Gateway were assigned to the IPProtocolEndpoint. This is independent of the DNS configuration, thus this property has the value of 2 ("Not Applicable")
	*/
	public final static String CIM_PROPERTY_ADDRESSORIGIN = "AddressOrigin"; //$NON-NLS-1$
	/**
	*	One or more DHCP options that the DNS client should utilise if they are returned during a DHCP bind operation.
	*/
	public final static String CIM_PROPERTY_DHCPOPTIONSTOUSE = "DHCPOptionsToUse"; //$NON-NLS-1$
	/**
	*	The DNS servers to contact. The array ordering correlates to the order in which the DNS servers will be contacted. The RemoteServiceAccessPoints associated with the DNSProtocolEndpoint with the value of the AccessContext property being "DNS Server" represent the actual DNS Servers being utilized by the DNS client.
	*/
	public final static String CIM_PROPERTY_DNSSERVERADDRESSES = "DNSServerAddresses"; //$NON-NLS-1$
	/**
	*	The domain to use for this client connection.
	*/
	public final static String CIM_PROPERTY_DOMAINNAME = "DomainName"; //$NON-NLS-1$
	/**
	*	Whether or not this connection's address should be registered in DNS.
	*/
	public final static String CIM_PROPERTY_REGISTERTHISCONNECTIONSADDRESS = "RegisterThisConnectionsAddress"; //$NON-NLS-1$
	/**
	*	The Hostname requested for this client connection.
	*/
	public final static String CIM_PROPERTY_REQUESTEDHOSTNAME = "RequestedHostname"; //$NON-NLS-1$
	/**
	*	Whether or not the suffix should be appended before registering the client name with the DNS server.
	*/
	public final static String CIM_PROPERTY_USESUFFIXWHENREGISTERING = "UseSuffixWhenRegistering"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESSORIGIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_DHCPOPTIONSTOUSE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DNSSERVERADDRESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_DOMAINNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_REGISTERTHISCONNECTIONSADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTEDHOSTNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_USESUFFIXWHENREGISTERING);
				
		for (int i = 0; i < CIM_IPAssignmentSettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESSORIGIN)||
				((String)CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DHCPOPTIONSTOUSE)||
				((String)CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DNSSERVERADDRESSES)||
				((String)CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DOMAINNAME)||
				((String)CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REGISTERTHISCONNECTIONSADDRESS)||
				((String)CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTEDHOSTNAME)||
				((String)CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USESUFFIXWHENREGISTERING)){
				continue;
			}
			
			CIM_DNSSettingData.CIM_PropertyNameList.add(CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESSORIGIN, new CIMValue(new UnsignedInt16("2"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DHCPOPTIONSTOUSE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DNSSERVERADDRESSES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DOMAINNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REGISTERTHISCONNECTIONSADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTEDHOSTNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USESUFFIXWHENREGISTERING, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_IPAssignmentSettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_IPAssignmentSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESSORIGIN)||
				((CIMProperty)CIM_IPAssignmentSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DHCPOPTIONSTOUSE)||
				((CIMProperty)CIM_IPAssignmentSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DNSSERVERADDRESSES)||
				((CIMProperty)CIM_IPAssignmentSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DOMAINNAME)||
				((CIMProperty)CIM_IPAssignmentSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REGISTERTHISCONNECTIONSADDRESS)||
				((CIMProperty)CIM_IPAssignmentSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTEDHOSTNAME)||
				((CIMProperty)CIM_IPAssignmentSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USESUFFIXWHENREGISTERING)){
				continue;
			}
			
			CIM_DNSSettingData.CIM_PropertyList.add(CIM_IPAssignmentSettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_IPAssignmentSettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_IPAssignmentSettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_IPAssignmentSettingData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADDRESSORIGIN = {"DMTF Reserved","Not Applicable","DMTF Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_DHCPOPTIONSTOUSE = {"Domain Name Server","Host Name","Domain Name","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String ADDRESSORIGIN_DMTFRESERVED = "0..1";
	public final static String ADDRESSORIGIN_NOTAPPLICABLE = "2";
	public final static String ADDRESSORIGIN_DMTFRESERVED1 = "3..32767";
	public final static String ADDRESSORIGIN_VENDORRESERVED = "32768..";
	
	public final static String DHCPOPTIONSTOUSE_DOMAINNAMESERVER = "8";
	public final static String DHCPOPTIONSTOUSE_HOSTNAME = "14";
	public final static String DHCPOPTIONSTOUSE_DOMAINNAME = "17";
	public final static String DHCPOPTIONSTOUSE_DMTFRESERVED = "18..32767";
	public final static String DHCPOPTIONSTOUSE_VENDORRESERVED = "32768..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DNSSettingData() {

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
	public CIM_DNSSettingData(Vector keyProperties){ 
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
	public CIM_DNSSettingData(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DNSSettingData)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DNSSettingData)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DNSSettingData)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DNSSettingData)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DNSSettingData)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DNSSettingData)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DNSSettingData)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DNSSettingData)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DNSSettingData)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DNSSettingData)object).cimObjectPath)) {
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
	
	// Attribute AddressOrigin
	
	public UnsignedInt16 get_AddressOrigin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_ADDRESSORIGIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_ADDRESSORIGIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_ADDRESSORIGIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddressOrigin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_ADDRESSORIGIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_ADDRESSORIGIN + " could not be found");
    		
		} else if (!CIM_DNSSettingDataHelper.isValid_AddressOrigin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DNSSettingData.CIM_PROPERTY_ADDRESSORIGIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_ADDRESSORIGIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DHCPOptionsToUse
	
	public UnsignedInt8[] get_DHCPOptionsToUse() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_DHCPOPTIONSTOUSE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_DHCPOPTIONSTOUSE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_DHCPOPTIONSTOUSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
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
	    
			
	public void set_DHCPOptionsToUse(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_DHCPOPTIONSTOUSE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_DHCPOPTIONSTOUSE + " could not be found");
    		
		} else if (!CIM_DNSSettingDataHelper.isValid_DHCPOptionsToUse(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DNSSettingData.CIM_PROPERTY_DHCPOPTIONSTOUSE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_DHCPOPTIONSTOUSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DNSServerAddresses
	
	public String[] get_DNSServerAddresses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_DNSSERVERADDRESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_DNSSERVERADDRESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_DNSSERVERADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_DNSServerAddresses(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_DNSSERVERADDRESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_DNSSERVERADDRESSES + " could not be found");
    		
		} else if (!CIM_DNSSettingDataHelper.isValid_DNSServerAddresses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DNSSettingData.CIM_PROPERTY_DNSSERVERADDRESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_DNSSERVERADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DomainName
	
	public String get_DomainName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_DOMAINNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_DOMAINNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_DOMAINNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DomainName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_DOMAINNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_DOMAINNAME + " could not be found");
    		
		} else if (!CIM_DNSSettingDataHelper.isValid_DomainName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DNSSettingData.CIM_PROPERTY_DOMAINNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_DOMAINNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RegisterThisConnectionsAddress
	
	public Boolean get_RegisterThisConnectionsAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_REGISTERTHISCONNECTIONSADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_REGISTERTHISCONNECTIONSADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_REGISTERTHISCONNECTIONSADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RegisterThisConnectionsAddress(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_REGISTERTHISCONNECTIONSADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_REGISTERTHISCONNECTIONSADDRESS + " could not be found");
    		
		} else if (!CIM_DNSSettingDataHelper.isValid_RegisterThisConnectionsAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DNSSettingData.CIM_PROPERTY_REGISTERTHISCONNECTIONSADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_REGISTERTHISCONNECTIONSADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequestedHostname
	
	public String get_RequestedHostname() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_REQUESTEDHOSTNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_REQUESTEDHOSTNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_REQUESTEDHOSTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequestedHostname(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_REQUESTEDHOSTNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_REQUESTEDHOSTNAME + " could not be found");
    		
		} else if (!CIM_DNSSettingDataHelper.isValid_RequestedHostname(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DNSSettingData.CIM_PROPERTY_REQUESTEDHOSTNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_REQUESTEDHOSTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UseSuffixWhenRegistering
	
	public Boolean get_UseSuffixWhenRegistering() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_USESUFFIXWHENREGISTERING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_USESUFFIXWHENREGISTERING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_USESUFFIXWHENREGISTERING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UseSuffixWhenRegistering(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSSettingData.CIM_PROPERTY_USESUFFIXWHENREGISTERING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSSettingData.CIM_PROPERTY_USESUFFIXWHENREGISTERING + " could not be found");
    		
		} else if (!CIM_DNSSettingDataHelper.isValid_UseSuffixWhenRegistering(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DNSSettingData.CIM_PROPERTY_USESUFFIXWHENREGISTERING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSSettingData.CIM_PROPERTY_USESUFFIXWHENREGISTERING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
