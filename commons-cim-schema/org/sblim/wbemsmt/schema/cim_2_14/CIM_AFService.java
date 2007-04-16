/** 
 * CIM_AFService.java
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
 * Description:  This class represents a specialization to the general concept of forwarding
 * network traffic by adding specific semantics that characterize the operation
 * of the Assured Forwarding (AF) Service (RFC2597). This RFC defines four
 * different AF classes to represent four different treatments of traffic (e.g.,
 * a different amount of forwarding resources, such as buffer space and
 * bandwidth, are allocated). Within each AF class, IP packets are marked with
 * one of three possible drop precedence values. The drop precedence of a packet
 * determines the relative importance of that packet compared to other packets
 * within the same AF class if congestion occurs. A congested interface will try
 * to avoid dropping packets with a lower drop precedence value by instead
 * discarding packets with a higher drop precedence value. Note that [R2597]
 * defines 12 DSCPs that together represent the AF Per Hop Behavior (PHB) group.
 * Implementations are free to extend this (e.g., add more classes and/or drop
 * precedences). The AFService class is modeled as a specialization of
 * DiffServService, which is in turn a specialization of QoSService. This
 * enables it to be related to higher-level QoSServices, as well as to
 * lower-level conditioning sub-services (e.g., classification, metering,
 * dropping, queuing, and others).
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
 *  This class represents a specialization to the general concept of forwarding
 * network traffic by adding specific semantics that characterize the operation
 * of the Assured Forwarding (AF) Service (RFC2597). This RFC defines four
 * different AF classes to represent four different treatments of traffic (e.g.,
 * a different amount of forwarding resources, such as buffer space and
 * bandwidth, are allocated). Within each AF class, IP packets are marked with
 * one of three possible drop precedence values. The drop precedence of a packet
 * determines the relative importance of that packet compared to other packets
 * within the same AF class if congestion occurs. A congested interface will try
 * to avoid dropping packets with a lower drop precedence value by instead
 * discarding packets with a higher drop precedence value. Note that [R2597]
 * defines 12 DSCPs that together represent the AF Per Hop Behavior (PHB) group.
 * Implementations are free to extend this (e.g., add more classes and/or drop
 * precedences). The AFService class is modeled as a specialization of
 * DiffServService, which is in turn a specialization of QoSService. This
 * enables it to be related to higher-level QoSServices, as well as to
 * lower-level conditioning sub-services (e.g., classification, metering,
 * dropping, queuing, and others).
 */
public class CIM_AFService extends CIM_DiffServService  {
	
	public final static String CIM_CLASS_NAME = "CIM_AFService"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	This property is an 8-bit unsigned integer that indicates the number of AF classes that this AF implementation uses. Among the instances aggregated into AFService (using QoSConditioningSubService), one SHOULD find markers with as many distinct values as is indicated by ClassNumber.
	*/
	public final static String CIM_PROPERTY_CLASSNUMBER = "ClassNumber"; //$NON-NLS-1$
	/**
	*	This property is an 8-bit unsigned integer that indicates the number of drop precedence values that this AF implementation uses. The number of drop precedence values is the number PER AF CLASS. The corresponding droppers are found in the collection of ConditioningServices aggregated by QoSConditioningSubService.
	*/
	public final static String CIM_PROPERTY_DROPPERNUMBER = "DropperNumber"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASSNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_DROPPERNUMBER);
				
		for (int i = 0; i < CIM_DiffServService.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_DiffServService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASSNUMBER)||
				((String)CIM_DiffServService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DROPPERNUMBER)){
				continue;
			}
			
			CIM_AFService.CIM_PropertyNameList.add(CIM_DiffServService.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASSNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DROPPERNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
				
		for (int i = 0; i < CIM_DiffServService.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_DiffServService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASSNUMBER)||
				((CIMProperty)CIM_DiffServService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DROPPERNUMBER)){
				continue;
			}
			
			CIM_AFService.CIM_PropertyList.add(CIM_DiffServService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_DiffServService.Java_Package_List.size(); i++) {
			if (((String)CIM_DiffServService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_DiffServService.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AFService() {

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
	public CIM_AFService(Vector keyProperties){ 
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
	public CIM_AFService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_AFService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AFService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AFService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AFService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AFService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AFService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AFService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AFService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AFService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AFService)object).cimObjectPath)) {
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
	
	// Attribute ClassNumber
	
	public UnsignedInt8 get_ClassNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AFService.CIM_PROPERTY_CLASSNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AFService.CIM_PROPERTY_CLASSNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AFService.CIM_PROPERTY_CLASSNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ClassNumber(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AFService.CIM_PROPERTY_CLASSNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AFService.CIM_PROPERTY_CLASSNUMBER + " could not be found");
    		
		} else if (!CIM_AFServiceHelper.isValid_ClassNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AFService.CIM_PROPERTY_CLASSNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AFService.CIM_PROPERTY_CLASSNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DropperNumber
	
	public UnsignedInt8 get_DropperNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AFService.CIM_PROPERTY_DROPPERNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AFService.CIM_PROPERTY_DROPPERNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AFService.CIM_PROPERTY_DROPPERNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DropperNumber(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AFService.CIM_PROPERTY_DROPPERNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AFService.CIM_PROPERTY_DROPPERNUMBER + " could not be found");
    		
		} else if (!CIM_AFServiceHelper.isValid_DropperNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AFService.CIM_PROPERTY_DROPPERNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AFService.CIM_PROPERTY_DROPPERNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
