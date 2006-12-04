/** 
 * CIM_PrioritySchedulingElement.java
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
 * Description: This class is a subclass of the abstract class SchedulingElement. It indicates that a scheduler is taking packets from a set of inputs using the priority scheduling discipline. As is the case with all subclasses of SchedulingElement, the input associated with an instance of PrioritySchedulingElement is of one of two types: either a queue, or another scheduler. The Priority property represents the priority for an input, relative to the priorities of all the other inputs to which the scheduler (that aggregates this PrioritySchedulingElement) is associated. Inputs to which the scheduler is related via other scheduling disciplines do not figure in this prioritization. Because scheduling of this type is always work conserving, the inherited boolean property, WorkConserving, is restricted to TRUE in this class.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PrioritySchedulingElement extends CIM_SchedulingElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_PrioritySchedulingElement";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	A 16-bit unsigned integer indicating the priority level of this SchedulingElement's input, relative to the other inputs serviced by the SchedulingElement's aggregating PacketSchedulingService. A larger value represents a higher priority.
	*/
	public final static String CIM_PROPERTY_PRIORITY = "Priority"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_WORKCONSERVING = "WorkConserving"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIORITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_WORKCONSERVING);
				
		for (int i = 0; i < CIM_SchedulingElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SchedulingElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIORITY)||
				((String)CIM_SchedulingElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WORKCONSERVING)){
				continue;
			}
			
			CIM_PrioritySchedulingElement.CIM_PropertyNameList.add(CIM_SchedulingElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIORITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WORKCONSERVING, new CIMValue(new Boolean("TRUE"), new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_SchedulingElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SchedulingElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIORITY)||
				((CIMProperty)CIM_SchedulingElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WORKCONSERVING)){
				continue;
			}
			
			CIM_PrioritySchedulingElement.CIM_PropertyList.add(CIM_SchedulingElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SchedulingElement.Java_Package_List.size(); i++) {
			if (((String)CIM_SchedulingElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SchedulingElement.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PrioritySchedulingElement() {

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
	public CIM_PrioritySchedulingElement(Vector keyProperties){ 
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
	public CIM_PrioritySchedulingElement(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PrioritySchedulingElement)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PrioritySchedulingElement)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PrioritySchedulingElement)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PrioritySchedulingElement)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PrioritySchedulingElement)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PrioritySchedulingElement)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PrioritySchedulingElement)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PrioritySchedulingElement)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PrioritySchedulingElement)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PrioritySchedulingElement)object).cimObjectPath)) {
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
	
	// Attribute Priority
	
	public UnsignedInt16 get_Priority() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrioritySchedulingElement.CIM_PROPERTY_PRIORITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrioritySchedulingElement.CIM_PROPERTY_PRIORITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrioritySchedulingElement.CIM_PROPERTY_PRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Priority(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrioritySchedulingElement.CIM_PROPERTY_PRIORITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrioritySchedulingElement.CIM_PROPERTY_PRIORITY + " could not be found");
    		
		} else if (!CIM_PrioritySchedulingElementHelper.isValid_Priority(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrioritySchedulingElement.CIM_PROPERTY_PRIORITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrioritySchedulingElement.CIM_PROPERTY_PRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WorkConserving
	
	public Boolean get_WorkConserving() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WorkConserving(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING + " could not be found");
    		
		} else if (!CIM_PrioritySchedulingElementHelper.isValid_WorkConserving(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
