/** 
 * CIM_IPProtocolEndpoint.java
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
 * Description:  A ProtocolEndpoint that is dedicated to running IP.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  A ProtocolEndpoint that is dedicated to running IP.
 */
public class CIM_IPProtocolEndpoint extends CIM_ProtocolEndpoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_IPProtocolEndpoint"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The IP address that this ProtocolEndpoint represents, formatted according to the appropriate convention as defined in the AddressType property of this class (e.g., 171.79.6.40). This single property is deprecated to replace it by specific IPv4 and v6 addresses.
	*/
	public final static String CIM_PROPERTY_ADDRESS = "Address"; //$NON-NLS-1$
	/**
	*	An enumeration that describes the format of the Address property. It is deprecated since it is not needed, as the class contains both IPv4 and v6 addresses).
	*/
	public final static String CIM_PROPERTY_ADDRESSTYPE = "AddressType"; //$NON-NLS-1$
	/**
	*	This property explicitly defines support for different versions of the IP protocol, for this Endpoint. It is deprecated since the ProtocolIFType also provides this functionality by describing an endpoint as IPv4 only (value=4096), IPv6 only (value=4097), or IPv4/v6 (value=4098).
	*/
	public final static String CIM_PROPERTY_IPVERSIONSUPPORT = "IPVersionSupport"; //$NON-NLS-1$
	/**
	*	The IPv4 address that this ProtocolEndpoint represents.
	*/
	public final static String CIM_PROPERTY_IPV4ADDRESS = "IPv4Address"; //$NON-NLS-1$
	/**
	*	The IPv6 address that this ProtocolEndpoint represents.
	*/
	public final static String CIM_PROPERTY_IPV6ADDRESS = "IPv6Address"; //$NON-NLS-1$
	/**
	*	The prefix length for the IPv6 address of this Protocol Endpoint, if one is defined.
	*/
	public final static String CIM_PROPERTY_PREFIXLENGTH = "PrefixLength"; //$NON-NLS-1$
	/**
	*	ProtocolIFType's enumeration is limited to IP-related and reserved values for this subclass of ProtocolEndpoint.
	*/
	public final static String CIM_PROPERTY_PROTOCOLIFTYPE = "ProtocolIFType"; //$NON-NLS-1$
	/**
	*	The mask for the IPv4 address of this ProtocolEndpoint, if one is defined.
	*/
	public final static String CIM_PROPERTY_SUBNETMASK = "SubnetMask"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESSTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_IPVERSIONSUPPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_IPV4ADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_IPV6ADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PREFIXLENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOLIFTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUBNETMASK);
				
		for (int i = 0; i < CIM_ProtocolEndpoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESS)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESSTYPE)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IPVERSIONSUPPORT)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IPV4ADDRESS)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IPV6ADDRESS)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PREFIXLENGTH)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOLIFTYPE)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUBNETMASK)){
				continue;
			}
			
			CIM_IPProtocolEndpoint.CIM_PropertyNameList.add(CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESSTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IPVERSIONSUPPORT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IPV4ADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IPV6ADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PREFIXLENGTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOLIFTYPE, new CIMValue(new UnsignedInt16("4096"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUBNETMASK, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ProtocolEndpoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESS)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESSTYPE)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IPVERSIONSUPPORT)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IPV4ADDRESS)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IPV6ADDRESS)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PREFIXLENGTH)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOLIFTYPE)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUBNETMASK)){
				continue;
			}
			
			CIM_IPProtocolEndpoint.CIM_PropertyList.add(CIM_ProtocolEndpoint.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim_2_14");
				
		String[] parentClassPackageList = CIM_ProtocolEndpoint.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADDRESSTYPE = {"Unknown","IPv4","IPv6"};
	public final static String[] CIM_VALUEMAP_IPVERSIONSUPPORT = {"Unknown","IPv4 Only","IPv6 Only","Both IPv4 and IPv6"};
	public final static String[] CIM_VALUEMAP_PROTOCOLIFTYPE = {"Other","IANA Reserved","IPv4","IPv6","IPv4/v6","DMTF Reserved","Vendor Reserved"};
	
	
	public final static int ADDRESSTYPE_UNKNOWN = 0;
	public final static int ADDRESSTYPE_IPV4 = 1;
	public final static int ADDRESSTYPE_IPV6 = 2;
	
	public final static int IPVERSIONSUPPORT_UNKNOWN = 0;
	public final static int IPVERSIONSUPPORT_IPV4ONLY = 1;
	public final static int IPVERSIONSUPPORT_IPV6ONLY = 2;
	public final static int IPVERSIONSUPPORT_BOTHIPV4ANDIPV6 = 3;
	
	public final static String PROTOCOLIFTYPE_OTHER = "1";
	public final static String PROTOCOLIFTYPE_IANARESERVED = "225..4095";
	public final static String PROTOCOLIFTYPE_IPV4 = "4096";
	public final static String PROTOCOLIFTYPE_IPV6 = "4097";
	public final static String PROTOCOLIFTYPE_IPV4_V6 = "4098";
	public final static String PROTOCOLIFTYPE_DMTFRESERVED = "4301..32767";
	public final static String PROTOCOLIFTYPE_VENDORRESERVED = "32768..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IPProtocolEndpoint() {

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
	public CIM_IPProtocolEndpoint(Vector keyProperties){ 
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
	public CIM_IPProtocolEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_IPProtocolEndpoint.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_IPProtocolEndpoint.Java_Package_List.toArray(new String[CIM_IPProtocolEndpoint.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_IPProtocolEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IPProtocolEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IPProtocolEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IPProtocolEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IPProtocolEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IPProtocolEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IPProtocolEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IPProtocolEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IPProtocolEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IPProtocolEndpoint)object).cimObjectPath)) {
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
	
	// Attribute Address
	
	public String get_Address() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Address(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESS + " could not be found");
    		
		} else if (!CIM_IPProtocolEndpointHelper.isValid_Address(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AddressType
	
	public UnsignedInt16 get_AddressType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESSTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESSTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddressType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESSTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESSTYPE + " could not be found");
    		
		} else if (!CIM_IPProtocolEndpointHelper.isValid_AddressType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESSTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_ADDRESSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IPVersionSupport
	
	public UnsignedInt16 get_IPVersionSupport() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_IPVERSIONSUPPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPVERSIONSUPPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPVERSIONSUPPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IPVersionSupport(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_IPVERSIONSUPPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPVERSIONSUPPORT + " could not be found");
    		
		} else if (!CIM_IPProtocolEndpointHelper.isValid_IPVersionSupport(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPVERSIONSUPPORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPVERSIONSUPPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IPv4Address
	
	public String get_IPv4Address() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV4ADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV4ADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV4ADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IPv4Address(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV4ADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV4ADDRESS + " could not be found");
    		
		} else if (!CIM_IPProtocolEndpointHelper.isValid_IPv4Address(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV4ADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV4ADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IPv6Address
	
	public String get_IPv6Address() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV6ADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV6ADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV6ADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IPv6Address(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV6ADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV6ADDRESS + " could not be found");
    		
		} else if (!CIM_IPProtocolEndpointHelper.isValid_IPv6Address(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV6ADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_IPV6ADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrefixLength
	
	public UnsignedInt8 get_PrefixLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_PREFIXLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_PREFIXLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_PREFIXLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrefixLength(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_PREFIXLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_PREFIXLENGTH + " could not be found");
    		
		} else if (!CIM_IPProtocolEndpointHelper.isValid_PrefixLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_PREFIXLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_PREFIXLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtocolIFType
	
	public UnsignedInt16 get_ProtocolIFType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtocolIFType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " could not be found");
    		
		} else if (!CIM_IPProtocolEndpointHelper.isValid_ProtocolIFType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SubnetMask
	
	public String get_SubnetMask() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_SUBNETMASK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_SUBNETMASK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_SUBNETMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SubnetMask(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPProtocolEndpoint.CIM_PROPERTY_SUBNETMASK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_SUBNETMASK + " could not be found");
    		
		} else if (!CIM_IPProtocolEndpointHelper.isValid_SubnetMask(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_SUBNETMASK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPProtocolEndpoint.CIM_PROPERTY_SUBNETMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
