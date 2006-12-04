/** 
 * CIM_AGPSoftwareFeature.java
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
 * Description: AGPSoftwareFeature adds two attributes to SoftwareFeature to represent the capabilities of an AGP device driver. An instance of this class would be associated with the Driver's SoftwareElement using the SoftwareFeatureSoftware Elements relationship. The driver's SoftwareElement is associated with the AGPVideoController via the Device Software relationship.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_AGPSoftwareFeature extends CIM_SoftwareFeature  {
	
	public final static String CIM_CLASS_NAME = "CIM_AGPSoftwareFeature";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	An array of free-form strings providing more detailed explanations for any of the features indicated in the Characteristics array. Each entry in this array is related to the Characteristics array entry located at the same index.
	*/
	public final static String CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS = "CharacteristicDescriptions"; //$NON-NLS-1$
	/**
	*	An array of integers indicating various capabilities and characteristics of the AGPVideoController.
	*/
	public final static String CIM_PROPERTY_CHARACTERISTICS = "Characteristics"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CHARACTERISTICS);
				
		for (int i = 0; i < CIM_SoftwareFeature.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SoftwareFeature.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS)||
				((String)CIM_SoftwareFeature.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHARACTERISTICS)){
				continue;
			}
			
			CIM_AGPSoftwareFeature.CIM_PropertyNameList.add(CIM_SoftwareFeature.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHARACTERISTICS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_SoftwareFeature.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SoftwareFeature.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS)||
				((CIMProperty)CIM_SoftwareFeature.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHARACTERISTICS)){
				continue;
			}
			
			CIM_AGPSoftwareFeature.CIM_PropertyList.add(CIM_SoftwareFeature.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SoftwareFeature.Java_Package_List.size(); i++) {
			if (((String)CIM_SoftwareFeature.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SoftwareFeature.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CHARACTERISTICS = {"Unknown","Other","OS support","Hardware Acceleration","Hardware Blit","OpenGL Support","Cache Coherency"};
	
	
	public final static int CHARACTERISTICS_UNKNOWN = 0;
	public final static int CHARACTERISTICS_OTHER = 1;
	public final static int CHARACTERISTICS_OSSUPPORT = 2;
	public final static int CHARACTERISTICS_HARDWAREACCELERATION = 3;
	public final static int CHARACTERISTICS_HARDWAREBLIT = 4;
	public final static int CHARACTERISTICS_OPENGLSUPPORT = 5;
	public final static int CHARACTERISTICS_CACHECOHERENCY = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AGPSoftwareFeature() {

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
	public CIM_AGPSoftwareFeature(Vector keyProperties){ 
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
	public CIM_AGPSoftwareFeature(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_AGPSoftwareFeature)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AGPSoftwareFeature)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AGPSoftwareFeature)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AGPSoftwareFeature)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AGPSoftwareFeature)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AGPSoftwareFeature)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AGPSoftwareFeature)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AGPSoftwareFeature)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AGPSoftwareFeature)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AGPSoftwareFeature)object).cimObjectPath)) {
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
	
	// Attribute CharacteristicDescriptions
	
	public String[] get_CharacteristicDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_CharacteristicDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_AGPSoftwareFeatureHelper.isValid_CharacteristicDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Characteristics
	
	public UnsignedInt16[] get_Characteristics() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_Characteristics(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICS + " could not be found");
    		
		} else if (!CIM_AGPSoftwareFeatureHelper.isValid_Characteristics(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AGPSoftwareFeature.CIM_PROPERTY_CHARACTERISTICS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
