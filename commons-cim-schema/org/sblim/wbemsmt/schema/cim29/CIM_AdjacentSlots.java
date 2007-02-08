/** 
 * CIM_AdjacentSlots.java
 *
 * © Copyright IBM Corp. 2005
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
 * Description: AdjacentSlots describes the layout of Slots on a HostingBoard or adapter Card. Information like the distance between the Slots and whether they are 'shared' (if one is populated, then the other Slot can not be used), is conveyed as properties of the association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_AdjacentSlots  {
	
	protected CIMInstance cimInstance			= new CIMInstance();
	protected CIMInstance original_cimInstance	= null;
	protected CIMObjectPath cimObjectPath		= null; 
	
	public final static String CIM_CLASS_NAME = "CIM_AdjacentSlots";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_SLOT_1 = "SlotA"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SLOT_2 = "SlotB"; //$NON-NLS-1$
	
	
	/**
	*	The distance, in inches, between adjacent Slots.
	*/
	public final static String CIM_PROPERTY_DISTANCEBETWEENSLOTS = "DistanceBetweenSlots"; //$NON-NLS-1$
	/**
	*	Slots can be located in close proximity on Hosting Boards or other Cards, such that if one of these Slots is populated by an adapter Card, the other Slot must be left empty. This relationship is indicated by the SharedSlots boolean set to TRUE.
	*/
	public final static String CIM_PROPERTY_SHAREDSLOTS = "SharedSlots"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DISTANCEBETWEENSLOTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SHAREDSLOTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SLOT_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SLOT_2);
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DISTANCEBETWEENSLOTS, new CIMValue(null, new CIMDataType(CIMDataType.REAL32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SHAREDSLOTS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SLOT_1, new CIMValue(null, new CIMDataType(CIM_Slot.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SLOT_2, new CIMValue(null, new CIMDataType(CIM_Slot.CIM_CLASS_NAME))));
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
		};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AdjacentSlots() {

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
	public CIM_AdjacentSlots(Vector keyProperties){ 
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
	public CIM_AdjacentSlots(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_AdjacentSlots)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AdjacentSlots)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AdjacentSlots)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AdjacentSlots)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AdjacentSlots)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AdjacentSlots)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AdjacentSlots)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AdjacentSlots)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AdjacentSlots)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AdjacentSlots)object).cimObjectPath)) {
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
	
	// Attribute DistanceBetweenSlots
	
	public Float get_DistanceBetweenSlots() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdjacentSlots.CIM_PROPERTY_DISTANCEBETWEENSLOTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_DISTANCEBETWEENSLOTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_DISTANCEBETWEENSLOTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Float)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DistanceBetweenSlots(Float newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdjacentSlots.CIM_PROPERTY_DISTANCEBETWEENSLOTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_DISTANCEBETWEENSLOTS + " could not be found");
    		
		} else if (!CIM_AdjacentSlotsHelper.isValid_DistanceBetweenSlots(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdjacentSlots.CIM_PROPERTY_DISTANCEBETWEENSLOTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_DISTANCEBETWEENSLOTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.REAL32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SharedSlots
	
	public Boolean get_SharedSlots() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdjacentSlots.CIM_PROPERTY_SHAREDSLOTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_SHAREDSLOTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_SHAREDSLOTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SharedSlots(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdjacentSlots.CIM_PROPERTY_SHAREDSLOTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_SHAREDSLOTS + " could not be found");
    		
		} else if (!CIM_AdjacentSlotsHelper.isValid_SharedSlots(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdjacentSlots.CIM_PROPERTY_SHAREDSLOTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_SHAREDSLOTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Slot_1
	
	public CIMObjectPath get_CIM_Slot_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Slot.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_1 + " is not of expected type CIM_Slot.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Slot_1(CIM_Slot newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_1 + " could not be found");
    		
		} else if (!CIM_AdjacentSlotsHelper.isValid_CIM_Slot_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_1);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Slot.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_1 + " is not of expected type CIM_Slot.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Slot.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Slot_2
	
	public CIMObjectPath get_CIM_Slot_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Slot.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_2 + " is not of expected type CIM_Slot.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Slot_2(CIM_Slot newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_2 + " could not be found");
    		
		} else if (!CIM_AdjacentSlotsHelper.isValid_CIM_Slot_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_2);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Slot.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdjacentSlots.CIM_PROPERTY_CIM_SLOT_2 + " is not of expected type CIM_Slot.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Slot.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
