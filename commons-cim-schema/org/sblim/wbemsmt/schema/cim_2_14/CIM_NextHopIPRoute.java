/** 
 * CIM_NextHopIPRoute.java
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
 * Description:  NextHopIPRoute specifies routing in an IP network.
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
 *  NextHopIPRoute specifies routing in an IP network.
 */
public class CIM_NextHopIPRoute extends CIM_NextHopRoute  {
	
	public final static String CIM_CLASS_NAME = "CIM_NextHopIPRoute"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	An enumeration that describes the format of the address properties.
	*/
	public final static String CIM_PROPERTY_ADDRESSTYPE = "AddressType"; //$NON-NLS-1$
	/**
	*	The mask for the Ipv4 destination address.
	*/
	public final static String CIM_PROPERTY_DESTINATIONMASK = "DestinationMask"; //$NON-NLS-1$
	/**
	*	A string describing how the route was derived when the RouteDerivation property is 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERDERIVATION = "OtherDerivation"; //$NON-NLS-1$
	/**
	*	The prefix length for the IPv6 destination address.
	*/
	public final static String CIM_PROPERTY_PREFIXLENGTH = "PrefixLength"; //$NON-NLS-1$
	/**
	*	An enumerated integer indicating how the route was derived. This is useful for display and query purposes.
	*/
	public final static String CIM_PROPERTY_ROUTEDERIVATION = "RouteDerivation"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESSTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESTINATIONMASK);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERDERIVATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_PREFIXLENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_ROUTEDERIVATION);
				
		for (int i = 0; i < CIM_NextHopRoute.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NextHopRoute.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESSTYPE)||
				((String)CIM_NextHopRoute.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESTINATIONMASK)||
				((String)CIM_NextHopRoute.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERDERIVATION)||
				((String)CIM_NextHopRoute.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PREFIXLENGTH)||
				((String)CIM_NextHopRoute.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROUTEDERIVATION)){
				continue;
			}
			
			CIM_NextHopIPRoute.CIM_PropertyNameList.add(CIM_NextHopRoute.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESSTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESTINATIONMASK, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERDERIVATION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PREFIXLENGTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROUTEDERIVATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_NextHopRoute.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NextHopRoute.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESSTYPE)||
				((CIMProperty)CIM_NextHopRoute.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESTINATIONMASK)||
				((CIMProperty)CIM_NextHopRoute.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERDERIVATION)||
				((CIMProperty)CIM_NextHopRoute.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PREFIXLENGTH)||
				((CIMProperty)CIM_NextHopRoute.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROUTEDERIVATION)){
				continue;
			}
			
			CIM_NextHopIPRoute.CIM_PropertyList.add(CIM_NextHopRoute.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_NextHopRoute.Java_Package_List.size(); i++) {
			if (((String)CIM_NextHopRoute.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_NextHopRoute.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADDRESSTYPE = {"Unknown","IPv4","IPv6"};
	public final static String[] CIM_VALUEMAP_ROUTEDERIVATION = {"Unknown","Other","Connected","User-Defined","IGRP","EIGRP","RIP","Hello","EGP","BGP","ISIS","OSPF"};
	
	
	public final static int ADDRESSTYPE_UNKNOWN = 0;
	public final static int ADDRESSTYPE_IPV4 = 1;
	public final static int ADDRESSTYPE_IPV6 = 2;
	
	public final static int ROUTEDERIVATION_UNKNOWN = 0;
	public final static int ROUTEDERIVATION_OTHER = 1;
	public final static int ROUTEDERIVATION_CONNECTED = 2;
	public final static int ROUTEDERIVATION_USER_DEFINED = 3;
	public final static int ROUTEDERIVATION_IGRP = 4;
	public final static int ROUTEDERIVATION_EIGRP = 5;
	public final static int ROUTEDERIVATION_RIP = 6;
	public final static int ROUTEDERIVATION_HELLO = 7;
	public final static int ROUTEDERIVATION_EGP = 8;
	public final static int ROUTEDERIVATION_BGP = 9;
	public final static int ROUTEDERIVATION_ISIS = 10;
	public final static int ROUTEDERIVATION_OSPF = 11;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_NextHopIPRoute() {

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
	public CIM_NextHopIPRoute(Vector keyProperties){ 
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
	public CIM_NextHopIPRoute(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_NextHopIPRoute)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_NextHopIPRoute)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_NextHopIPRoute)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_NextHopIPRoute)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_NextHopIPRoute)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_NextHopIPRoute)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_NextHopIPRoute)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_NextHopIPRoute)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_NextHopIPRoute)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_NextHopIPRoute)object).cimObjectPath)) {
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextHopIPRoute.CIM_PROPERTY_ADDRESSTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_ADDRESSTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_ADDRESSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddressType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextHopIPRoute.CIM_PROPERTY_ADDRESSTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_ADDRESSTYPE + " could not be found");
    		
		} else if (!CIM_NextHopIPRouteHelper.isValid_AddressType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NextHopIPRoute.CIM_PROPERTY_ADDRESSTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_ADDRESSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DestinationMask
	
	public String get_DestinationMask() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextHopIPRoute.CIM_PROPERTY_DESTINATIONMASK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_DESTINATIONMASK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_DESTINATIONMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DestinationMask(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextHopIPRoute.CIM_PROPERTY_DESTINATIONMASK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_DESTINATIONMASK + " could not be found");
    		
		} else if (!CIM_NextHopIPRouteHelper.isValid_DestinationMask(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NextHopIPRoute.CIM_PROPERTY_DESTINATIONMASK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_DESTINATIONMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherDerivation
	
	public String get_OtherDerivation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextHopIPRoute.CIM_PROPERTY_OTHERDERIVATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_OTHERDERIVATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_OTHERDERIVATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherDerivation(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextHopIPRoute.CIM_PROPERTY_OTHERDERIVATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_OTHERDERIVATION + " could not be found");
    		
		} else if (!CIM_NextHopIPRouteHelper.isValid_OtherDerivation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NextHopIPRoute.CIM_PROPERTY_OTHERDERIVATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_OTHERDERIVATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrefixLength
	
	public UnsignedInt8 get_PrefixLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextHopIPRoute.CIM_PROPERTY_PREFIXLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_PREFIXLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_PREFIXLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrefixLength(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextHopIPRoute.CIM_PROPERTY_PREFIXLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_PREFIXLENGTH + " could not be found");
    		
		} else if (!CIM_NextHopIPRouteHelper.isValid_PrefixLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NextHopIPRoute.CIM_PROPERTY_PREFIXLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_PREFIXLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RouteDerivation
	
	public UnsignedInt16 get_RouteDerivation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextHopIPRoute.CIM_PROPERTY_ROUTEDERIVATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_ROUTEDERIVATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_ROUTEDERIVATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RouteDerivation(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextHopIPRoute.CIM_PROPERTY_ROUTEDERIVATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_ROUTEDERIVATION + " could not be found");
    		
		} else if (!CIM_NextHopIPRouteHelper.isValid_RouteDerivation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NextHopIPRoute.CIM_PROPERTY_ROUTEDERIVATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextHopIPRoute.CIM_PROPERTY_ROUTEDERIVATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
