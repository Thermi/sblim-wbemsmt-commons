/** 
 * CIM_OSPFProtocolEndpoint.java
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
 * Description: This class represents the OSPF configuration of an interface running OSPF. The instance of this class should be connected to an IPProtocolEndpoint instance via a BindsTo association. The IPProtocolEndpoint instance is the Antecedent and the OSPFProtocolEndpoint instance is the Dependent in the BindsTo association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_OSPFProtocolEndpoint extends CIM_OSPFProtocolEndpointBase  {
	
	public final static String CIM_CLASS_NAME = "CIM_OSPFProtocolEndpoint";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The cost of the routes through this OSPF endpoint, see C.3 in RFC 2328.
	*/
	public final static String CIM_PROPERTY_COST = "Cost"; //$NON-NLS-1$
	/**
	*	Indicates whether the interface connects to an on-demand circuit, see RFC 1793.
	*/
	public final static String CIM_PROPERTY_IFDEMAND = "IfDemand"; //$NON-NLS-1$
	/**
	*	If a neighbouring router on an NBMA (NonBroadcast MultiAccess) link becomes inactive, it is still necessary to send Hello Packets to the dead neighbor. These packets will be sent at the reduced rate, which should be much larger than HelloInterval, see C.5 in RFC 2328.
	*/
	public final static String CIM_PROPERTY_POLLINTERVAL = "PollInterval"; //$NON-NLS-1$
	/**
	*	When two routers attached to a network both attempt to become the Designated Router, the one with the highest (i.e. largest) Priority takes precedence, see C.3 in RFC 2328. Only routers with greater than zero priority are eligible to become Designated Router.
	*/
	public final static String CIM_PROPERTY_PRIORITY = "Priority"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_COST);
		CIM_PropertyNameList.add(CIM_PROPERTY_IFDEMAND);
		CIM_PropertyNameList.add(CIM_PROPERTY_POLLINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIORITY);
				
		for (int i = 0; i < CIM_OSPFProtocolEndpointBase.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_OSPFProtocolEndpointBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COST)||
				((String)CIM_OSPFProtocolEndpointBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IFDEMAND)||
				((String)CIM_OSPFProtocolEndpointBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POLLINTERVAL)||
				((String)CIM_OSPFProtocolEndpointBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIORITY)){
				continue;
			}
			
			CIM_OSPFProtocolEndpoint.CIM_PropertyNameList.add(CIM_OSPFProtocolEndpointBase.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COST, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IFDEMAND, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POLLINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIORITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
				
		for (int i = 0; i < CIM_OSPFProtocolEndpointBase.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_OSPFProtocolEndpointBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COST)||
				((CIMProperty)CIM_OSPFProtocolEndpointBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IFDEMAND)||
				((CIMProperty)CIM_OSPFProtocolEndpointBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POLLINTERVAL)||
				((CIMProperty)CIM_OSPFProtocolEndpointBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIORITY)){
				continue;
			}
			
			CIM_OSPFProtocolEndpoint.CIM_PropertyList.add(CIM_OSPFProtocolEndpointBase.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_OSPFProtocolEndpointBase.Java_Package_List.size(); i++) {
			if (((String)CIM_OSPFProtocolEndpointBase.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_OSPFProtocolEndpointBase.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_OSPFProtocolEndpoint() {

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
	public CIM_OSPFProtocolEndpoint(Vector keyProperties){ 
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
	public CIM_OSPFProtocolEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_OSPFProtocolEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_OSPFProtocolEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_OSPFProtocolEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_OSPFProtocolEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_OSPFProtocolEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_OSPFProtocolEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_OSPFProtocolEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_OSPFProtocolEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_OSPFProtocolEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_OSPFProtocolEndpoint)object).cimObjectPath)) {
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
	
	// Attribute Cost
	
	public UnsignedInt16 get_Cost() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFProtocolEndpoint.CIM_PROPERTY_COST);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_COST + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_COST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Cost(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFProtocolEndpoint.CIM_PROPERTY_COST);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_COST + " could not be found");
    		
		} else if (!CIM_OSPFProtocolEndpointHelper.isValid_Cost(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_COST);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_COST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IfDemand
	
	public Boolean get_IfDemand() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFProtocolEndpoint.CIM_PROPERTY_IFDEMAND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_IFDEMAND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_IFDEMAND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IfDemand(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFProtocolEndpoint.CIM_PROPERTY_IFDEMAND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_IFDEMAND + " could not be found");
    		
		} else if (!CIM_OSPFProtocolEndpointHelper.isValid_IfDemand(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_IFDEMAND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_IFDEMAND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PollInterval
	
	public UnsignedInt16 get_PollInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFProtocolEndpoint.CIM_PROPERTY_POLLINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_POLLINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_POLLINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PollInterval(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFProtocolEndpoint.CIM_PROPERTY_POLLINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_POLLINTERVAL + " could not be found");
    		
		} else if (!CIM_OSPFProtocolEndpointHelper.isValid_PollInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_POLLINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_POLLINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Priority
	
	public UnsignedInt8 get_Priority() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFProtocolEndpoint.CIM_PROPERTY_PRIORITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_PRIORITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_PRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Priority(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSPFProtocolEndpoint.CIM_PROPERTY_PRIORITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_PRIORITY + " could not be found");
    		
		} else if (!CIM_OSPFProtocolEndpointHelper.isValid_Priority(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_PRIORITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSPFProtocolEndpoint.CIM_PROPERTY_PRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
