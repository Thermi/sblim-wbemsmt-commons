/** 
 * CIM_AllocationSchedulingElement.java
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
 * Description: This class is a subclass of the abstract class SchedulingElement. It introduces five new properties to support bandwidth-based scheduling. As is the case with all subclasses of SchedulingElement, the input associated with an instance of AllocationSchedulingElement is of one of two types: either a queue, or another scheduler.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_AllocationSchedulingElement extends CIM_SchedulingElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_AllocationSchedulingElement";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	A 16-bit unsigned integer enumeration that identifies the units in which the BandwidthAllocation and BurstAllocation properties are expressed. The following values are defined: 
- Bytes(1) 
- Packets(2) 
- Cells(3) (fixed-size, for example, ATM) 
If no value is specified, 1 ("Bytes") should be assumed.
	*/
	public final static String CIM_PROPERTY_ALLOCATIONUNITS = "AllocationUnits"; //$NON-NLS-1$
	/**
	*	A 32-bit bit unsigned integer defining the number of 'units' per second that should be allocated to the associated input. 'Units' are identified by the AllocationUnits property.
	*/
	public final static String CIM_PROPERTY_BANDWIDTHALLOCATION = "BandwidthAllocation"; //$NON-NLS-1$
	/**
	*	A 32-bit bit unsigned integer specifying the amount of temporary or short-term bandwidth (in 'units' per second) that can be allocated to an input, beyond the amount of bandwidth allocated through the BandwidthAllocation property. If the maximum actual bandwidth allocation for the input were to be measured, it would be the sum of the BurstAllocation and the BandwidthAllocation properties. 'Units' are identified by the AllocationUnits property.
	*/
	public final static String CIM_PROPERTY_BURSTALLOCATION = "BurstAllocation"; //$NON-NLS-1$
	/**
	*	A boolean property that, if TRUE, enables unused bandwidth from the associated input to be allocated to other inputs serviced by the Scheduler.
	*/
	public final static String CIM_PROPERTY_CANSHARE = "CanShare"; //$NON-NLS-1$
	/**
	*	A boolean property that, if TRUE, indicates that the behavior of the scheduler relative to this input can be altered by changing the value of the inherited property, WorkConserving.
	*/
	public final static String CIM_PROPERTY_WORKFLEXIBLE = "WorkFlexible"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ALLOCATIONUNITS);
		CIM_PropertyNameList.add(CIM_PROPERTY_BANDWIDTHALLOCATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_BURSTALLOCATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CANSHARE);
		CIM_PropertyNameList.add(CIM_PROPERTY_WORKFLEXIBLE);
				
		for (int i = 0; i < CIM_SchedulingElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SchedulingElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALLOCATIONUNITS)||
				((String)CIM_SchedulingElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BANDWIDTHALLOCATION)||
				((String)CIM_SchedulingElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BURSTALLOCATION)||
				((String)CIM_SchedulingElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CANSHARE)||
				((String)CIM_SchedulingElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WORKFLEXIBLE)){
				continue;
			}
			
			CIM_AllocationSchedulingElement.CIM_PropertyNameList.add(CIM_SchedulingElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALLOCATIONUNITS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BANDWIDTHALLOCATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BURSTALLOCATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CANSHARE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WORKFLEXIBLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_SchedulingElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SchedulingElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALLOCATIONUNITS)||
				((CIMProperty)CIM_SchedulingElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BANDWIDTHALLOCATION)||
				((CIMProperty)CIM_SchedulingElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BURSTALLOCATION)||
				((CIMProperty)CIM_SchedulingElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CANSHARE)||
				((CIMProperty)CIM_SchedulingElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WORKFLEXIBLE)){
				continue;
			}
			
			CIM_AllocationSchedulingElement.CIM_PropertyList.add(CIM_SchedulingElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SchedulingElement.Java_Package_List.size(); i++) {
			if (((String)CIM_SchedulingElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SchedulingElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ALLOCATIONUNITS = {"Bytes","Packets","Cells"};
	
	
	public final static int ALLOCATIONUNITS_BYTES = 1;
	public final static int ALLOCATIONUNITS_PACKETS = 2;
	public final static int ALLOCATIONUNITS_CELLS = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AllocationSchedulingElement() {

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
	public CIM_AllocationSchedulingElement(Vector keyProperties){ 
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
	public CIM_AllocationSchedulingElement(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_AllocationSchedulingElement)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AllocationSchedulingElement)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AllocationSchedulingElement)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AllocationSchedulingElement)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AllocationSchedulingElement)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AllocationSchedulingElement)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AllocationSchedulingElement)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AllocationSchedulingElement)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AllocationSchedulingElement)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AllocationSchedulingElement)object).cimObjectPath)) {
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
	
	// Attribute AllocationUnits
	
	public UnsignedInt16 get_AllocationUnits() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AllocationSchedulingElement.CIM_PROPERTY_ALLOCATIONUNITS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_ALLOCATIONUNITS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_ALLOCATIONUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AllocationUnits(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AllocationSchedulingElement.CIM_PROPERTY_ALLOCATIONUNITS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_ALLOCATIONUNITS + " could not be found");
    		
		} else if (!CIM_AllocationSchedulingElementHelper.isValid_AllocationUnits(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_ALLOCATIONUNITS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_ALLOCATIONUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BandwidthAllocation
	
	public UnsignedInt32 get_BandwidthAllocation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AllocationSchedulingElement.CIM_PROPERTY_BANDWIDTHALLOCATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_BANDWIDTHALLOCATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_BANDWIDTHALLOCATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BandwidthAllocation(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AllocationSchedulingElement.CIM_PROPERTY_BANDWIDTHALLOCATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_BANDWIDTHALLOCATION + " could not be found");
    		
		} else if (!CIM_AllocationSchedulingElementHelper.isValid_BandwidthAllocation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_BANDWIDTHALLOCATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_BANDWIDTHALLOCATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BurstAllocation
	
	public UnsignedInt32 get_BurstAllocation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AllocationSchedulingElement.CIM_PROPERTY_BURSTALLOCATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_BURSTALLOCATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_BURSTALLOCATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BurstAllocation(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AllocationSchedulingElement.CIM_PROPERTY_BURSTALLOCATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_BURSTALLOCATION + " could not be found");
    		
		} else if (!CIM_AllocationSchedulingElementHelper.isValid_BurstAllocation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_BURSTALLOCATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_BURSTALLOCATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CanShare
	
	public Boolean get_CanShare() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AllocationSchedulingElement.CIM_PROPERTY_CANSHARE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_CANSHARE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_CANSHARE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CanShare(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AllocationSchedulingElement.CIM_PROPERTY_CANSHARE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_CANSHARE + " could not be found");
    		
		} else if (!CIM_AllocationSchedulingElementHelper.isValid_CanShare(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_CANSHARE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_CANSHARE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WorkFlexible
	
	public Boolean get_WorkFlexible() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AllocationSchedulingElement.CIM_PROPERTY_WORKFLEXIBLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_WORKFLEXIBLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_WORKFLEXIBLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WorkFlexible(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AllocationSchedulingElement.CIM_PROPERTY_WORKFLEXIBLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_WORKFLEXIBLE + " could not be found");
    		
		} else if (!CIM_AllocationSchedulingElementHelper.isValid_WorkFlexible(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_WORKFLEXIBLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AllocationSchedulingElement.CIM_PROPERTY_WORKFLEXIBLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
