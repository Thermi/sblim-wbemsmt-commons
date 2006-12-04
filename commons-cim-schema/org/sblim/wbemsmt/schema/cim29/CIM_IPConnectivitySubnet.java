/** 
 * CIM_IPConnectivitySubnet.java
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
 * Description: An IPConnectivitySubnet represents a group of related IPProtocolEndpoints that can communicate with each other, as members of a subnet. The class describes the characteristics of the subnet.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_IPConnectivitySubnet extends CIM_ConnectivityCollection  {
	
	public final static String CIM_CLASS_NAME = "CIM_IPConnectivitySubnet";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	An enumeration that describes the format of the address properties in IPConnectivitySubnet.
	*/
	public final static String CIM_PROPERTY_ADDRESSTYPE = "AddressType"; //$NON-NLS-1$
	/**
	*	The prefix length for IPv6 addresses in the IP subnet, if needed (i.e., if the AddressType property is 2, "IPv6").
	*/
	public final static String CIM_PROPERTY_PREFIXLENGTH = "PrefixLength"; //$NON-NLS-1$
	/**
	*	The mask for the starting IPv4 address of the IP subnet, if needed (i.e., if the AddressType property is 1, "IPv4").
	*/
	public final static String CIM_PROPERTY_SUBNETMASK = "SubnetMask"; //$NON-NLS-1$
	/**
	*	The IP address of the entire subnet, formatted according to the appropriate convention as defined in the AddressType property of this class.
	*/
	public final static String CIM_PROPERTY_SUBNETNUMBER = "SubnetNumber"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESSTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PREFIXLENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUBNETMASK);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUBNETNUMBER);
				
		for (int i = 0; i < CIM_ConnectivityCollection.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESSTYPE)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PREFIXLENGTH)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUBNETMASK)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUBNETNUMBER)){
				continue;
			}
			
			CIM_IPConnectivitySubnet.CIM_PropertyNameList.add(CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESSTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PREFIXLENGTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUBNETMASK, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUBNETNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ConnectivityCollection.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESSTYPE)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PREFIXLENGTH)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUBNETMASK)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUBNETNUMBER)){
				continue;
			}
			
			CIM_IPConnectivitySubnet.CIM_PropertyList.add(CIM_ConnectivityCollection.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ConnectivityCollection.Java_Package_List.size(); i++) {
			if (((String)CIM_ConnectivityCollection.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ConnectivityCollection.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADDRESSTYPE = {"Unknown","IPv4","IPv6"};
	
	
	public final static int ADDRESSTYPE_UNKNOWN = 0;
	public final static int ADDRESSTYPE_IPV4 = 1;
	public final static int ADDRESSTYPE_IPV6 = 2;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IPConnectivitySubnet() {

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
	public CIM_IPConnectivitySubnet(Vector keyProperties){ 
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
	public CIM_IPConnectivitySubnet(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_IPConnectivitySubnet)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IPConnectivitySubnet)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IPConnectivitySubnet)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IPConnectivitySubnet)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IPConnectivitySubnet)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IPConnectivitySubnet)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IPConnectivitySubnet)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IPConnectivitySubnet)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IPConnectivitySubnet)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IPConnectivitySubnet)object).cimObjectPath)) {
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
	
	// Attribute AddressType
	
	public UnsignedInt16 get_AddressType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPConnectivitySubnet.CIM_PROPERTY_ADDRESSTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_ADDRESSTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_ADDRESSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddressType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPConnectivitySubnet.CIM_PROPERTY_ADDRESSTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_ADDRESSTYPE + " could not be found");
    		
		} else if (!CIM_IPConnectivitySubnetHelper.isValid_AddressType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_ADDRESSTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_ADDRESSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrefixLength
	
	public UnsignedInt8 get_PrefixLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPConnectivitySubnet.CIM_PROPERTY_PREFIXLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_PREFIXLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_PREFIXLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrefixLength(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPConnectivitySubnet.CIM_PROPERTY_PREFIXLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_PREFIXLENGTH + " could not be found");
    		
		} else if (!CIM_IPConnectivitySubnetHelper.isValid_PrefixLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_PREFIXLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_PREFIXLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SubnetMask
	
	public String get_SubnetMask() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETMASK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETMASK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SubnetMask(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETMASK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETMASK + " could not be found");
    		
		} else if (!CIM_IPConnectivitySubnetHelper.isValid_SubnetMask(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETMASK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SubnetNumber
	
	public String get_SubnetNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SubnetNumber(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETNUMBER + " could not be found");
    		
		} else if (!CIM_IPConnectivitySubnetHelper.isValid_SubnetNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPConnectivitySubnet.CIM_PROPERTY_SUBNETNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
