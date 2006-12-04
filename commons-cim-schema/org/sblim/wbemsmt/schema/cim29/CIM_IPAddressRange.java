/** 
 * CIM_IPAddressRange.java
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
 * Description: IPAddressRange represents a grouping of specific addresses, and provides additional semantics for this group if appropriate. The class is deprecated in lieu of the concrete class RangeOfIPAddresses since there is sufficient information for the class to be instantiated. In addition, an address range should be defined in the context of a System (for example, a network element or an admin domain). These semantics are incorporated in the RangeOfIPAddresses class.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_IPAddressRange extends CIM_CollectionOfMSEs  {
	
	public final static String CIM_CLASS_NAME = "CIM_IPAddressRange";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	This attribute defines the region that addresses can be allocated to.
	*/
	public final static String CIM_PROPERTY_ALLOCATIONREGION = "AllocationRegion"; //$NON-NLS-1$
	/**
	*	The ending IP address of the AddressRange, formatted according to the appropriate convention as defined in the AddressType property of this class (e.g., 171.79.6.40).
	*/
	public final static String CIM_PROPERTY_ENDADDRESS = "EndAddress"; //$NON-NLS-1$
	/**
	*	The starting IP address of the AddressRange, formatted according to the appropriate convention as defined in the AddressType property of this class (e.g., 171.79.6.40).
	*/
	public final static String CIM_PROPERTY_STARTADDRESS = "StartAddress"; //$NON-NLS-1$
	/**
	*	An enumeration that defines how to format the address and mask of the address range that defines this IPSubnet. 

Whenever possible, IPv4-compatible addresses should be used instead of IPv6 addresses (see RFC 2373, section 2.5.4). In order to have a consistent format for IPv4 addresses in a mixed IPv4/v6 environment, all IPv4 addresses and both IPv4-compatible IPv6 addresses and IPv4-mapped IPv6 addresses, per RFC 2373, section 2.5.4, should be formatted in standard IPv4 format.
	*/
	public final static String CIM_PROPERTY_TYPEOFADDRESS = "TypeOfAddress"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ALLOCATIONREGION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENDADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_STARTADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TYPEOFADDRESS);
				
		for (int i = 0; i < CIM_CollectionOfMSEs.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALLOCATIONREGION)||
				((String)CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENDADDRESS)||
				((String)CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STARTADDRESS)||
				((String)CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TYPEOFADDRESS)){
				continue;
			}
			
			CIM_IPAddressRange.CIM_PropertyNameList.add(CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALLOCATIONREGION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENDADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STARTADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TYPEOFADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_CollectionOfMSEs.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_CollectionOfMSEs.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALLOCATIONREGION)||
				((CIMProperty)CIM_CollectionOfMSEs.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENDADDRESS)||
				((CIMProperty)CIM_CollectionOfMSEs.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STARTADDRESS)||
				((CIMProperty)CIM_CollectionOfMSEs.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TYPEOFADDRESS)){
				continue;
			}
			
			CIM_IPAddressRange.CIM_PropertyList.add(CIM_CollectionOfMSEs.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_CollectionOfMSEs.Java_Package_List.size(); i++) {
			if (((String)CIM_CollectionOfMSEs.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_CollectionOfMSEs.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ALLOCATIONREGION = {"Unknown","Multiregional: 192.0.0.0 to 193.255.255.255","Europe: 194.0.0.0 to 195.255.255.255","Others: 196.0.0.0 to 197.255.255.255","North America: 198.0.0.0 to 199.255.255.255","Central & South America: 200.0.0.0 to 201.255.255.255","Pacific Rim: 202.0.0.0 to 203.255.255.255","Others: 204.0.0.0 to 205.255.255.255","Others: 206.0.0.0 to 207.255.255.255"};
	public final static String[] CIM_VALUEMAP_TYPEOFADDRESS = {"Unknown","IPv4","IPv6"};
	
	
	public final static int ALLOCATIONREGION_UNKNOWN = 0;
	public final static int ALLOCATIONREGION_MULTIREGIONAL_192_0_0_0TO193_255_255_255 = 1;
	public final static int ALLOCATIONREGION_EUROPE_194_0_0_0TO195_255_255_255 = 2;
	public final static int ALLOCATIONREGION_OTHERS_196_0_0_0TO197_255_255_255 = 3;
	public final static int ALLOCATIONREGION_NORTHAMERICA_198_0_0_0TO199_255_255_255 = 4;
	public final static int ALLOCATIONREGION_CENTRAL_AND_SOUTHAMERICA_200_0_0_0TO201_255_255_255 = 5;
	public final static int ALLOCATIONREGION_PACIFICRIM_202_0_0_0TO203_255_255_255 = 6;
	public final static int ALLOCATIONREGION_OTHERS_204_0_0_0TO205_255_255_255 = 7;
	public final static int ALLOCATIONREGION_OTHERS_206_0_0_0TO207_255_255_255 = 8;
	
	public final static int TYPEOFADDRESS_UNKNOWN = 0;
	public final static int TYPEOFADDRESS_IPV4 = 1;
	public final static int TYPEOFADDRESS_IPV6 = 2;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IPAddressRange() {

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
	public CIM_IPAddressRange(Vector keyProperties){ 
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
	public CIM_IPAddressRange(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_IPAddressRange)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IPAddressRange)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IPAddressRange)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IPAddressRange)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IPAddressRange)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IPAddressRange)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IPAddressRange)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IPAddressRange)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IPAddressRange)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IPAddressRange)object).cimObjectPath)) {
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
	
	// Attribute AllocationRegion
	
	public UnsignedInt16 get_AllocationRegion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPAddressRange.CIM_PROPERTY_ALLOCATIONREGION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPAddressRange.CIM_PROPERTY_ALLOCATIONREGION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPAddressRange.CIM_PROPERTY_ALLOCATIONREGION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AllocationRegion(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPAddressRange.CIM_PROPERTY_ALLOCATIONREGION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPAddressRange.CIM_PROPERTY_ALLOCATIONREGION + " could not be found");
    		
		} else if (!CIM_IPAddressRangeHelper.isValid_AllocationRegion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPAddressRange.CIM_PROPERTY_ALLOCATIONREGION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPAddressRange.CIM_PROPERTY_ALLOCATIONREGION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EndAddress
	
	public String get_EndAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPAddressRange.CIM_PROPERTY_ENDADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPAddressRange.CIM_PROPERTY_ENDADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPAddressRange.CIM_PROPERTY_ENDADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EndAddress(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPAddressRange.CIM_PROPERTY_ENDADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPAddressRange.CIM_PROPERTY_ENDADDRESS + " could not be found");
    		
		} else if (!CIM_IPAddressRangeHelper.isValid_EndAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPAddressRange.CIM_PROPERTY_ENDADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPAddressRange.CIM_PROPERTY_ENDADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StartAddress
	
	public String get_StartAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPAddressRange.CIM_PROPERTY_STARTADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPAddressRange.CIM_PROPERTY_STARTADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPAddressRange.CIM_PROPERTY_STARTADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StartAddress(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPAddressRange.CIM_PROPERTY_STARTADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPAddressRange.CIM_PROPERTY_STARTADDRESS + " could not be found");
    		
		} else if (!CIM_IPAddressRangeHelper.isValid_StartAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPAddressRange.CIM_PROPERTY_STARTADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPAddressRange.CIM_PROPERTY_STARTADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TypeOfAddress
	
	public UnsignedInt16 get_TypeOfAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPAddressRange.CIM_PROPERTY_TYPEOFADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPAddressRange.CIM_PROPERTY_TYPEOFADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPAddressRange.CIM_PROPERTY_TYPEOFADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TypeOfAddress(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPAddressRange.CIM_PROPERTY_TYPEOFADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPAddressRange.CIM_PROPERTY_TYPEOFADDRESS + " could not be found");
    		
		} else if (!CIM_IPAddressRangeHelper.isValid_TypeOfAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPAddressRange.CIM_PROPERTY_TYPEOFADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPAddressRange.CIM_PROPERTY_TYPEOFADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
