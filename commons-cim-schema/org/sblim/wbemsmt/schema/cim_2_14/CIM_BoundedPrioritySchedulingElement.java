/** 
 * CIM_BoundedPrioritySchedulingElement.java
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
 * Description:  This class is a subclass of the class PriorityScheduling Element, which is
 * itself derived from the abstract class SchedulingElement. As is the case with
 * all subclasses of SchedulingElement, the input associated with an instance of
 * BoundedPrioritySchedulingElement is of one of two types: either a queue, or
 * another scheduler. BoundedPriority SchedulingElement adds an upper bound
 * (BandwidthBound in kilobits per second) on how much traffic can be handled
 * from an input. This data is specific to that one input. It is needed when
 * bounded strict priority scheduling is performed. Note that this class
 * inherits from its superclass the restriction of the inherited boolean
 * property WorkConserving to TRUE.
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
import org.sblim.wbem.cim.UnsignedInt32;


/**
 *  This class is a subclass of the class PriorityScheduling Element, which is
 * itself derived from the abstract class SchedulingElement. As is the case with
 * all subclasses of SchedulingElement, the input associated with an instance of
 * BoundedPrioritySchedulingElement is of one of two types: either a queue, or
 * another scheduler. BoundedPriority SchedulingElement adds an upper bound
 * (BandwidthBound in kilobits per second) on how much traffic can be handled
 * from an input. This data is specific to that one input. It is needed when
 * bounded strict priority scheduling is performed. Note that this class
 * inherits from its superclass the restriction of the inherited boolean
 * property WorkConserving to TRUE.
 */
public class CIM_BoundedPrioritySchedulingElement extends CIM_PrioritySchedulingElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_BoundedPrioritySchedulingElement"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	A 32-bit unsigned integer that defines the upper limit on the amount of traffic that can be handled from the input (through this SchedulingElement). This is not a shaped upper bound, since bursts can occur. It is a strict bound, limiting the impact of the input. Units are kilobits per second.
	*/
	public final static String CIM_PROPERTY_BANDWIDTHBOUND = "BandwidthBound"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_WORKCONSERVING = "WorkConserving"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BANDWIDTHBOUND);
		CIM_PropertyNameList.add(CIM_PROPERTY_WORKCONSERVING);
				
		for (int i = 0; i < CIM_PrioritySchedulingElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PrioritySchedulingElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BANDWIDTHBOUND)||
				((String)CIM_PrioritySchedulingElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WORKCONSERVING)){
				continue;
			}
			
			CIM_BoundedPrioritySchedulingElement.CIM_PropertyNameList.add(CIM_PrioritySchedulingElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BANDWIDTHBOUND, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WORKCONSERVING, new CIMValue(new Boolean("TRUE"), new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_PrioritySchedulingElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PrioritySchedulingElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BANDWIDTHBOUND)||
				((CIMProperty)CIM_PrioritySchedulingElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WORKCONSERVING)){
				continue;
			}
			
			CIM_BoundedPrioritySchedulingElement.CIM_PropertyList.add(CIM_PrioritySchedulingElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_PrioritySchedulingElement.Java_Package_List.size(); i++) {
			if (((String)CIM_PrioritySchedulingElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_PrioritySchedulingElement.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BoundedPrioritySchedulingElement() {

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
	public CIM_BoundedPrioritySchedulingElement(Vector keyProperties){ 
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
	public CIM_BoundedPrioritySchedulingElement(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_BoundedPrioritySchedulingElement)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BoundedPrioritySchedulingElement)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BoundedPrioritySchedulingElement)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BoundedPrioritySchedulingElement)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BoundedPrioritySchedulingElement)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BoundedPrioritySchedulingElement)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BoundedPrioritySchedulingElement)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BoundedPrioritySchedulingElement)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BoundedPrioritySchedulingElement)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BoundedPrioritySchedulingElement)object).cimObjectPath)) {
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
	
	// Attribute BandwidthBound
	
	public UnsignedInt32 get_BandwidthBound() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_BANDWIDTHBOUND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_BANDWIDTHBOUND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_BANDWIDTHBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BandwidthBound(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_BANDWIDTHBOUND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_BANDWIDTHBOUND + " could not be found");
    		
		} else if (!CIM_BoundedPrioritySchedulingElementHelper.isValid_BandwidthBound(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_BANDWIDTHBOUND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_BANDWIDTHBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WorkConserving
	
	public Boolean get_WorkConserving() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WorkConserving(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING + " could not be found");
    		
		} else if (!CIM_BoundedPrioritySchedulingElementHelper.isValid_WorkConserving(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BoundedPrioritySchedulingElement.CIM_PROPERTY_WORKCONSERVING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
