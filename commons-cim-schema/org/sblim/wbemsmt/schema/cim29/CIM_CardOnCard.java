/** 
 * CIM_CardOnCard.java
 *
 * � Copyright IBM Corp. 2005
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
 * Description: Cards may be plugged into Motherboards/baseboards, are daughtercards of an adapter, or support special Card-like modules. These relationships are described by the CardOnCard association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_CardOnCard extends CIM_Container  {
	
	public final static String CIM_CLASS_NAME = "CIM_CardOnCard";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_CARD_1 = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_CARD_2 = "PartComponent"; //$NON-NLS-1$
	
	
	/**
	*	A string describing and identifying how the Card is mounted on or plugged into the 'other' Card. Slot information could be included in this field and may be sufficient for certain management purposes. If so, this avoids creating instantiations of Connector/Slot objects just to model the relationship of Cards to HostingBoards or other adapters. On the other hand, if Slot and Connector information is available, this field could be used to provide more detailed mounting or slot insertion data.
	*/
	public final static String CIM_PROPERTY_MOUNTORSLOTDESCRIPTION = "MountOrSlotDescription"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MOUNTORSLOTDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_CARD_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_CARD_2);
				
		for (int i = 0; i < CIM_Container.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Container.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MOUNTORSLOTDESCRIPTION)){
				continue;
			}
			
			CIM_CardOnCard.CIM_PropertyNameList.add(CIM_Container.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MOUNTORSLOTDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_CARD_1, new CIMValue(null, new CIMDataType(CIM_Card.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_CARD_2, new CIMValue(null, new CIMDataType(CIM_Card.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Container.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Container.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MOUNTORSLOTDESCRIPTION)){
				continue;
			}
			
			CIM_CardOnCard.CIM_PropertyList.add(CIM_Container.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Container.Java_Package_List.size(); i++) {
			if (((String)CIM_Container.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Container.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_CardOnCard() {

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
	public CIM_CardOnCard(Vector keyProperties){ 
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
	public CIM_CardOnCard(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_CardOnCard)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_CardOnCard)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_CardOnCard)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_CardOnCard)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_CardOnCard)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_CardOnCard)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_CardOnCard)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_CardOnCard)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_CardOnCard)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_CardOnCard)object).cimObjectPath)) {
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
	
	// Attribute MountOrSlotDescription
	
	public String get_MountOrSlotDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CardOnCard.CIM_PROPERTY_MOUNTORSLOTDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CardOnCard.CIM_PROPERTY_MOUNTORSLOTDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CardOnCard.CIM_PROPERTY_MOUNTORSLOTDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MountOrSlotDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CardOnCard.CIM_PROPERTY_MOUNTORSLOTDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CardOnCard.CIM_PROPERTY_MOUNTORSLOTDESCRIPTION + " could not be found");
    		
		} else if (!CIM_CardOnCardHelper.isValid_MountOrSlotDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CardOnCard.CIM_PROPERTY_MOUNTORSLOTDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CardOnCard.CIM_PROPERTY_MOUNTORSLOTDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Card_1
	
	public CIMObjectPath get_CIM_Card_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Card.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_1 + " is not of expected type CIM_Card.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Card_1(CIM_Card newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_1 + " could not be found");
    		
		} else if (!CIM_CardOnCardHelper.isValid_CIM_Card_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_1);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Card.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_1 + " is not of expected type CIM_Card.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Card.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Card_2
	
	public CIMObjectPath get_CIM_Card_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Card.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_2 + " is not of expected type CIM_Card.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Card_2(CIM_Card newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_2 + " could not be found");
    		
		} else if (!CIM_CardOnCardHelper.isValid_CIM_Card_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_2);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Card.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CardOnCard.CIM_PROPERTY_CIM_CARD_2 + " is not of expected type CIM_Card.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Card.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
