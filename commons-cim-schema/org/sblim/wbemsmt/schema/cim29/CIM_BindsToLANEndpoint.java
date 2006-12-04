/** 
 * CIM_BindsToLANEndpoint.java
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
 * Description: This association makes explicit the dependency of a SAP or ProtocolEndpoint on an underlying LANEndpoint, on the same system.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_BindsToLANEndpoint extends CIM_BindsTo  {
	
	public final static String CIM_CLASS_NAME = "CIM_BindsToLANEndpoint";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_LANENDPOINT = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SERVICEACCESSPOINT = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	This describes the framing method for the upper layer SAP or Endpoint that is bound to the LANEndpoint. Note: "Raw802.3" is only known to be used with the IPX protocol.
	*/
	public final static String CIM_PROPERTY_FRAMETYPE = "FrameType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_FRAMETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_LANENDPOINT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SERVICEACCESSPOINT);
				
		for (int i = 0; i < CIM_BindsTo.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_BindsTo.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FRAMETYPE)){
				continue;
			}
			
			CIM_BindsToLANEndpoint.CIM_PropertyNameList.add(CIM_BindsTo.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FRAMETYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_LANENDPOINT, new CIMValue(null, new CIMDataType(CIM_LANEndpoint.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SERVICEACCESSPOINT, new CIMValue(null, new CIMDataType(CIM_ServiceAccessPoint.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_BindsTo.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_BindsTo.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FRAMETYPE)){
				continue;
			}
			
			CIM_BindsToLANEndpoint.CIM_PropertyList.add(CIM_BindsTo.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_BindsTo.Java_Package_List.size(); i++) {
			if (((String)CIM_BindsTo.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_BindsTo.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_FRAMETYPE = {"Unknown","Ethernet","802.2","SNAP","Raw802.3"};
	
	
	public final static int FRAMETYPE_UNKNOWN = 0;
	public final static int FRAMETYPE_ETHERNET = 1;
	public final static int FRAMETYPE_802_2 = 2;
	public final static int FRAMETYPE_SNAP = 3;
	public final static int FRAMETYPE_RAW802_3 = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BindsToLANEndpoint() {

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
	public CIM_BindsToLANEndpoint(Vector keyProperties){ 
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
	public CIM_BindsToLANEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_BindsToLANEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BindsToLANEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BindsToLANEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BindsToLANEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BindsToLANEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BindsToLANEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BindsToLANEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BindsToLANEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BindsToLANEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BindsToLANEndpoint)object).cimObjectPath)) {
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
	
	// Attribute FrameType
	
	public UnsignedInt16 get_FrameType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BindsToLANEndpoint.CIM_PROPERTY_FRAMETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_FRAMETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_FRAMETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FrameType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BindsToLANEndpoint.CIM_PROPERTY_FRAMETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_FRAMETYPE + " could not be found");
    		
		} else if (!CIM_BindsToLANEndpointHelper.isValid_FrameType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_FRAMETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_FRAMETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_LANEndpoint
	
	public CIMObjectPath get_CIM_LANEndpoint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_LANENDPOINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_LANENDPOINT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_LANEndpoint.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_LANENDPOINT + " is not of expected type CIM_LANEndpoint.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_LANEndpoint(CIM_LANEndpoint newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_LANENDPOINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_LANENDPOINT + " could not be found");
    		
		} else if (!CIM_BindsToLANEndpointHelper.isValid_CIM_LANEndpoint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_LANENDPOINT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_LANEndpoint.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_LANENDPOINT + " is not of expected type CIM_LANEndpoint.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_LANEndpoint.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ServiceAccessPoint
	
	public CIMObjectPath get_CIM_ServiceAccessPoint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_SERVICEACCESSPOINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_SERVICEACCESSPOINT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ServiceAccessPoint.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_SERVICEACCESSPOINT + " is not of expected type CIM_ServiceAccessPoint.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ServiceAccessPoint(CIM_ServiceAccessPoint newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_SERVICEACCESSPOINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_SERVICEACCESSPOINT + " could not be found");
    		
		} else if (!CIM_BindsToLANEndpointHelper.isValid_CIM_ServiceAccessPoint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_SERVICEACCESSPOINT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ServiceAccessPoint.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BindsToLANEndpoint.CIM_PROPERTY_CIM_SERVICEACCESSPOINT + " is not of expected type CIM_ServiceAccessPoint.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ServiceAccessPoint.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
