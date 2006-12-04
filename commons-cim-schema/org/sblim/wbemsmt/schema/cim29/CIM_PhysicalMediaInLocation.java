/** 
 * CIM_PhysicalMediaInLocation.java
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
 * Description: Within a StorageLibrary, all Media should be accounted for, and be present in some Storage Location. This relationship is made explicit by the PhysicalMediaInLocation association. In addition, one can determine if a Location is empty or full based on whether this association exists for the StorageMediaLocation.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;


public class CIM_PhysicalMediaInLocation extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_PhysicalMediaInLocation";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_STORAGEMEDIALOCATION = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_PHYSICALMEDIA = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	An enumeration expressing which 'Side' of the Media is facing up. Since sides can be named by various schemes (0/1 or A/B), both schemes are expressed in the Values array of this property. Also, the value 5 ("Not Applicable" describes that orientation is not pertinent for this Media.
	*/
	public final static String CIM_PROPERTY_ORIENTATION = "Orientation"; //$NON-NLS-1$
	/**
	*	The date and time that the Media was last placed into the referenced Location.
	*/
	public final static String CIM_PROPERTY_TIMEOFLASTPLACEMENT = "TimeOfLastPlacement"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ORIENTATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFLASTPLACEMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_STORAGEMEDIALOCATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_PHYSICALMEDIA);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ORIENTATION)||
				((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFLASTPLACEMENT)){
				continue;
			}
			
			CIM_PhysicalMediaInLocation.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ORIENTATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFLASTPLACEMENT, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_STORAGEMEDIALOCATION, new CIMValue(null, new CIMDataType(CIM_StorageMediaLocation.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_PHYSICALMEDIA, new CIMValue(null, new CIMDataType(CIM_PhysicalMedia.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ORIENTATION)||
				((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFLASTPLACEMENT)){
				continue;
			}
			
			CIM_PhysicalMediaInLocation.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Dependency.Java_Package_List.size(); i++) {
			if (((String)CIM_Dependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Dependency.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ORIENTATION = {"Unknown","Side 0","Side 1","Side A","Side B","Not Applicable"};
	
	
	public final static int ORIENTATION_UNKNOWN = 0;
	public final static int ORIENTATION_SIDE0 = 1;
	public final static int ORIENTATION_SIDE1 = 2;
	public final static int ORIENTATION_SIDEA = 3;
	public final static int ORIENTATION_SIDEB = 4;
	public final static int ORIENTATION_NOTAPPLICABLE = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PhysicalMediaInLocation() {

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
	public CIM_PhysicalMediaInLocation(Vector keyProperties){ 
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
	public CIM_PhysicalMediaInLocation(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PhysicalMediaInLocation)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PhysicalMediaInLocation)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PhysicalMediaInLocation)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PhysicalMediaInLocation)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PhysicalMediaInLocation)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PhysicalMediaInLocation)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PhysicalMediaInLocation)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PhysicalMediaInLocation)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PhysicalMediaInLocation)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PhysicalMediaInLocation)object).cimObjectPath)) {
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
	
	// Attribute Orientation
	
	public UnsignedInt16 get_Orientation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMediaInLocation.CIM_PROPERTY_ORIENTATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_ORIENTATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_ORIENTATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Orientation(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMediaInLocation.CIM_PROPERTY_ORIENTATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_ORIENTATION + " could not be found");
    		
		} else if (!CIM_PhysicalMediaInLocationHelper.isValid_Orientation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_ORIENTATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_ORIENTATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfLastPlacement
	
	public Calendar get_TimeOfLastPlacement() {

		CIMProperty property = this.cimInstance.getProperty(CIM_PhysicalMediaInLocation.CIM_PROPERTY_TIMEOFLASTPLACEMENT);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_TIMEOFLASTPLACEMENT + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_TIMEOFLASTPLACEMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfLastPlacement(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMediaInLocation.CIM_PROPERTY_TIMEOFLASTPLACEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_TIMEOFLASTPLACEMENT + " could not be found");
    		
		} else if (!CIM_PhysicalMediaInLocationHelper.isValid_TimeOfLastPlacement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_TIMEOFLASTPLACEMENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_TIMEOFLASTPLACEMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute CIM_StorageMediaLocation
	
	public CIMObjectPath get_CIM_StorageMediaLocation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_StorageMediaLocation.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION + " is not of expected type CIM_StorageMediaLocation.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_StorageMediaLocation(CIM_StorageMediaLocation newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION + " could not be found");
    		
		} else if (!CIM_PhysicalMediaInLocationHelper.isValid_CIM_StorageMediaLocation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_StorageMediaLocation.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_STORAGEMEDIALOCATION + " is not of expected type CIM_StorageMediaLocation.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_StorageMediaLocation.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_PhysicalMedia
	
	public CIMObjectPath get_CIM_PhysicalMedia() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_PHYSICALMEDIA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_PHYSICALMEDIA + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PhysicalMedia.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_PHYSICALMEDIA + " is not of expected type CIM_PhysicalMedia.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PhysicalMedia(CIM_PhysicalMedia newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_PHYSICALMEDIA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_PHYSICALMEDIA + " could not be found");
    		
		} else if (!CIM_PhysicalMediaInLocationHelper.isValid_CIM_PhysicalMedia(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_PHYSICALMEDIA);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PhysicalMedia.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMediaInLocation.CIM_PROPERTY_CIM_PHYSICALMEDIA + " is not of expected type CIM_PhysicalMedia.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PhysicalMedia.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
