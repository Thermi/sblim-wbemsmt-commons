/** 
 * CIM_Hdr8021Filter.java
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
 * Description:  8021Filter allows 802.1.source and destination MAC addresses, as well as the
 * 802.1 protocol ID, priority, and VLAN identifier fields, to be expressed in a
 * single object to classify and identify traffic.
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
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.cim.UnsignedInt8;


/**
 *  8021Filter allows 802.1.source and destination MAC addresses, as well as the
 * 802.1 protocol ID, priority, and VLAN identifier fields, to be expressed in a
 * single object to classify and identify traffic.
 */
public class CIM_Hdr8021Filter extends CIM_FilterEntryBase  {
	
	public final static String CIM_CLASS_NAME = "CIM_Hdr8021Filter"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	This property is an OctetString of size 6, representing a 48-bit destination MAC address in canonical format. This value is compared to the DestinationAddress field in the MAC header, subject to the mask represented in the 8021HdrDestMACMask property. If a value for this property is not provided, then the filter does not consider 8021HdrDestMACAddr in selecting matching packets, i.e., 8021HdrDestMACAddr matches for all values.
	*/
	public final static String CIM_PROPERTY_HDRDESTMACADDR8021 = "HdrDestMACAddr8021"; //$NON-NLS-1$
	/**
	*	This property is an OctetString of size 6, representing a 48-bit mask to be used in comparing the DestinationAddress field in the MAC header with the value represented in the 8021HdrDestMACAddr property. If a value for this property is not provided, then the filter does not consider 8021HdrDestMACMask in selecting matching packets, i.e., the value of 8021HdrDestMACAddr must match the destination MAC address in the packet exactly.
	*/
	public final static String CIM_PROPERTY_HDRDESTMACMASK8021 = "HdrDestMACMask8021"; //$NON-NLS-1$
	/**
	*	This property is an 8-bit unsigned integer, representing an 802.1Q priority. This value is compared to the Priority field in the 802.1Q header. Since the 802.1Q Priority field consists of 3 bits, the values for this property are limited to the range 0..7. If a value for this property is not provided, then the filter does not consider 8021HdrPriorityValue in selecting matching packets, i.e., 8021HdrPriorityValue matches for all values.
	*/
	public final static String CIM_PROPERTY_HDRPRIORITYVALUE8021 = "HdrPriorityValue8021"; //$NON-NLS-1$
	/**
	*	This property is a 16-bit unsigned integer, representing an Ethernet protocol type. This value is compared to the Ethernet Type field in the 802.3 MAC header. If a value for this property is not provided, then the filter does not consider 8021HdrProtocolID in selecting matching packets, i.e., 8021HdrProtocolID matches for all values.
	*/
	public final static String CIM_PROPERTY_HDRPROTOCOLID8021 = "HdrProtocolID8021"; //$NON-NLS-1$
	/**
	*	This property is an OctetString of size 6, representing a 48-bit source MAC address in canonical format. This value is compared to the SourceAddress field in the MAC header, subject to the mask represented in the 8021HdrSrcMACMask property. If a value for this property is not provided, then the filter does not consider 8021HdrSrcMACAddr in selecting matching packets, i.e., 8021HdrSrcMACAddr matches for all values.
	*/
	public final static String CIM_PROPERTY_HDRSRCMACADDR8021 = "HdrSrcMACAddr8021"; //$NON-NLS-1$
	/**
	*	This property is an OctetString of size 6, representing a 48-bit mask to be used in comparing the SourceAddress field in the MAC header with the value represented in the 8021HdrSrcMACAddr property. If a value for this property is not provided, then the filter does not consider 8021HdrSrcMACMask in selecting matching packets, i.e., the value of 8021HdrSrcMACAddr must match the source MAC address in the packet exactly.
	*/
	public final static String CIM_PROPERTY_HDRSRCMACMASK8021 = "HdrSrcMACMask8021"; //$NON-NLS-1$
	/**
	*	This property is an 32-bit unsigned integer, representing an 802.1Q VLAN Identifier. This value is compared to the VLAN ID field in the 802.1Q header. Since the 802.1Q VLAN ID field consists of 12 bits, the values for this property are limited to the range 0..4095. If a value for this property is not provided, then the filter does not consider 8021HdrVLANID in selecting matching packets, i.e., 8021HdrVLANID matches for all values.
	*/
	public final static String CIM_PROPERTY_HDRVLANID8021 = "HdrVLANID8021"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRDESTMACADDR8021);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRDESTMACMASK8021);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRPRIORITYVALUE8021);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRPROTOCOLID8021);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRSRCMACADDR8021);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRSRCMACMASK8021);
		CIM_PropertyNameList.add(CIM_PROPERTY_HDRVLANID8021);
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRDESTMACADDR8021)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRDESTMACMASK8021)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRPRIORITYVALUE8021)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRPROTOCOLID8021)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRSRCMACADDR8021)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRSRCMACMASK8021)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HDRVLANID8021)){
				continue;
			}
			
			CIM_Hdr8021Filter.CIM_PropertyNameList.add(CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRDESTMACADDR8021, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRDESTMACMASK8021, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRPRIORITYVALUE8021, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRPROTOCOLID8021, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRSRCMACADDR8021, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRSRCMACMASK8021, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HDRVLANID8021, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRDESTMACADDR8021)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRDESTMACMASK8021)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRPRIORITYVALUE8021)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRPROTOCOLID8021)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRSRCMACADDR8021)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRSRCMACMASK8021)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HDRVLANID8021)){
				continue;
			}
			
			CIM_Hdr8021Filter.CIM_PropertyList.add(CIM_FilterEntryBase.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_FilterEntryBase.Java_Package_List.size(); i++) {
			if (((String)CIM_FilterEntryBase.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_FilterEntryBase.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Hdr8021Filter() {

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
	public CIM_Hdr8021Filter(Vector keyProperties){ 
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
	public CIM_Hdr8021Filter(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Hdr8021Filter)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Hdr8021Filter)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Hdr8021Filter)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Hdr8021Filter)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Hdr8021Filter)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Hdr8021Filter)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Hdr8021Filter)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Hdr8021Filter)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Hdr8021Filter)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Hdr8021Filter)object).cimObjectPath)) {
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
	
	// Attribute HdrDestMACAddr8021
	
	public UnsignedInt8 get_HdrDestMACAddr8021() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACADDR8021);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACADDR8021 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACADDR8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrDestMACAddr8021(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACADDR8021);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACADDR8021 + " could not be found");
    		
		} else if (!CIM_Hdr8021FilterHelper.isValid_HdrDestMACAddr8021(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACADDR8021);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACADDR8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrDestMACMask8021
	
	public UnsignedInt8 get_HdrDestMACMask8021() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACMASK8021);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACMASK8021 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACMASK8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrDestMACMask8021(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACMASK8021);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACMASK8021 + " could not be found");
    		
		} else if (!CIM_Hdr8021FilterHelper.isValid_HdrDestMACMask8021(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACMASK8021);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRDESTMACMASK8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrPriorityValue8021
	
	public UnsignedInt8 get_HdrPriorityValue8021() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRPRIORITYVALUE8021);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRPRIORITYVALUE8021 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRPRIORITYVALUE8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrPriorityValue8021(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRPRIORITYVALUE8021);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRPRIORITYVALUE8021 + " could not be found");
    		
		} else if (!CIM_Hdr8021FilterHelper.isValid_HdrPriorityValue8021(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRPRIORITYVALUE8021);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRPRIORITYVALUE8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrProtocolID8021
	
	public UnsignedInt16 get_HdrProtocolID8021() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRPROTOCOLID8021);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRPROTOCOLID8021 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRPROTOCOLID8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrProtocolID8021(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRPROTOCOLID8021);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRPROTOCOLID8021 + " could not be found");
    		
		} else if (!CIM_Hdr8021FilterHelper.isValid_HdrProtocolID8021(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRPROTOCOLID8021);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRPROTOCOLID8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrSrcMACAddr8021
	
	public UnsignedInt8 get_HdrSrcMACAddr8021() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACADDR8021);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACADDR8021 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACADDR8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrSrcMACAddr8021(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACADDR8021);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACADDR8021 + " could not be found");
    		
		} else if (!CIM_Hdr8021FilterHelper.isValid_HdrSrcMACAddr8021(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACADDR8021);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACADDR8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrSrcMACMask8021
	
	public UnsignedInt8 get_HdrSrcMACMask8021() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACMASK8021);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACMASK8021 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACMASK8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrSrcMACMask8021(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACMASK8021);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACMASK8021 + " could not be found");
    		
		} else if (!CIM_Hdr8021FilterHelper.isValid_HdrSrcMACMask8021(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACMASK8021);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRSRCMACMASK8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HdrVLANID8021
	
	public UnsignedInt32 get_HdrVLANID8021() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRVLANID8021);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRVLANID8021 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRVLANID8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HdrVLANID8021(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Hdr8021Filter.CIM_PROPERTY_HDRVLANID8021);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRVLANID8021 + " could not be found");
    		
		} else if (!CIM_Hdr8021FilterHelper.isValid_HdrVLANID8021(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRVLANID8021);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Hdr8021Filter.CIM_PROPERTY_HDRVLANID8021 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
