/** 
 * CIM_BGPAttributesForRoute.java
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
 * Description:  This defines the attributes that are transmitted between BGP peers on a
 * per-route basis.
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
import org.sblim.wbem.cim.UnsignedInt8;


/**
 *  This defines the attributes that are transmitted between BGP peers on a
 * per-route basis.
 */
public class CIM_BGPAttributesForRoute extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_BGPAttributesForRoute"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_BGPPATHATTRIBUTES = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_BGPIPROUTE = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	The IP address prefix of the property, PathAttrPeer. Its length is specified by the property, PathAttrIpAddrPrefixLen.
	*/
	public final static String CIM_PROPERTY_PATHATTRIPADDRPREFIX = "PathAttrIPAddrPrefix"; //$NON-NLS-1$
	/**
	*	This defines the length in bits of the IP address prefix for the property, PathAttrPeer. The range is 0 to 32.
	*/
	public final static String CIM_PROPERTY_PATHATTRIPADDRPREFIXLEN = "PathAttrIPAddrPrefixLen"; //$NON-NLS-1$
	/**
	*	This defines the IP address of the peer where the path information was learned.
	*/
	public final static String CIM_PROPERTY_PATHATTRPEER = "PathAttrPeer"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRIPADDRPREFIX);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRIPADDRPREFIXLEN);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHATTRPEER);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_BGPPATHATTRIBUTES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_BGPIPROUTE);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRIPADDRPREFIX)||
				((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRIPADDRPREFIXLEN)||
				((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHATTRPEER)){
				continue;
			}
			
			CIM_BGPAttributesForRoute.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRIPADDRPREFIX, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRIPADDRPREFIXLEN, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHATTRPEER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_BGPPATHATTRIBUTES, new CIMValue(null, new CIMDataType(CIM_BGPPathAttributes.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_BGPIPROUTE, new CIMValue(null, new CIMDataType(CIM_BGPIPRoute.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRIPADDRPREFIX)||
				((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRIPADDRPREFIXLEN)||
				((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHATTRPEER)){
				continue;
			}
			
			CIM_BGPAttributesForRoute.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Dependency.Java_Package_List.size(); i++) {
			if (((String)CIM_Dependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Dependency.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BGPAttributesForRoute() {

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
	public CIM_BGPAttributesForRoute(Vector keyProperties){ 
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
	public CIM_BGPAttributesForRoute(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_BGPAttributesForRoute)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BGPAttributesForRoute)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BGPAttributesForRoute)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BGPAttributesForRoute)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BGPAttributesForRoute)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BGPAttributesForRoute)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BGPAttributesForRoute)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BGPAttributesForRoute)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BGPAttributesForRoute)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BGPAttributesForRoute)object).cimObjectPath)) {
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
	
	// Attribute PathAttrIPAddrPrefix
	
	public String get_PathAttrIPAddrPrefix() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrIPAddrPrefix(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIX + " could not be found");
    		
		} else if (!CIM_BGPAttributesForRouteHelper.isValid_PathAttrIPAddrPrefix(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrIPAddrPrefixLen
	
	public UnsignedInt8 get_PathAttrIPAddrPrefixLen() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIXLEN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIXLEN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIXLEN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrIPAddrPrefixLen(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIXLEN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIXLEN + " could not be found");
    		
		} else if (!CIM_BGPAttributesForRouteHelper.isValid_PathAttrIPAddrPrefixLen(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIXLEN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRIPADDRPREFIXLEN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathAttrPeer
	
	public String get_PathAttrPeer() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRPEER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRPEER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRPEER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathAttrPeer(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRPEER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRPEER + " could not be found");
    		
		} else if (!CIM_BGPAttributesForRouteHelper.isValid_PathAttrPeer(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRPEER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_PATHATTRPEER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_BGPPathAttributes
	
	public CIMObjectPath get_CIM_BGPPathAttributes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPPATHATTRIBUTES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPPATHATTRIBUTES + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_BGPPathAttributes.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPPATHATTRIBUTES + " is not of expected type CIM_BGPPathAttributes.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_BGPPathAttributes(CIM_BGPPathAttributes newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPPATHATTRIBUTES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPPATHATTRIBUTES + " could not be found");
    		
		} else if (!CIM_BGPAttributesForRouteHelper.isValid_CIM_BGPPathAttributes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPPATHATTRIBUTES);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_BGPPathAttributes.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPPATHATTRIBUTES + " is not of expected type CIM_BGPPathAttributes.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_BGPPathAttributes.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_BGPIPRoute
	
	public CIMObjectPath get_CIM_BGPIPRoute() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPIPROUTE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPIPROUTE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_BGPIPRoute.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPIPROUTE + " is not of expected type CIM_BGPIPRoute.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_BGPIPRoute(CIM_BGPIPRoute newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPIPROUTE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPIPROUTE + " could not be found");
    		
		} else if (!CIM_BGPAttributesForRouteHelper.isValid_CIM_BGPIPRoute(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPIPROUTE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_BGPIPRoute.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPAttributesForRoute.CIM_PROPERTY_CIM_BGPIPROUTE + " is not of expected type CIM_BGPIPRoute.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_BGPIPRoute.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}