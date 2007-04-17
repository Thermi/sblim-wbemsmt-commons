/** 
 * CIM_BinarySensor.java
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
 * Description:  A BinarySensor provides a boolean output. The use of this class is being
 * deprecated in lieu of creating a Sensor with two PossibleStates.
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


/**
 *  A BinarySensor provides a boolean output. The use of this class is being
 * deprecated in lieu of creating a Sensor with two PossibleStates.
 */
public class CIM_BinarySensor extends CIM_Sensor  {
	
	public final static String CIM_CLASS_NAME = "CIM_BinarySensor"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The current value indicated by the Sensor.
	*/
	public final static String CIM_PROPERTY_CURRENTREADING = "CurrentReading"; //$NON-NLS-1$
	/**
	*	ExpectedReading indicates the 'normal' value for the Sensor.
	*/
	public final static String CIM_PROPERTY_EXPECTEDREADING = "ExpectedReading"; //$NON-NLS-1$
	/**
	*	InterpretationOfFalse is a string indicating what a 'False' value from the BinarySensor means. This information could be displayed to a user.
	*/
	public final static String CIM_PROPERTY_INTERPRETATIONOFFALSE = "InterpretationOfFalse"; //$NON-NLS-1$
	/**
	*	InterpretationOfTrue is a string indicating what a 'True' value from the BinarySensor means. This information could be displayed to a user.
	*/
	public final static String CIM_PROPERTY_INTERPRETATIONOFTRUE = "InterpretationOfTrue"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTREADING);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXPECTEDREADING);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERPRETATIONOFFALSE);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERPRETATIONOFTRUE);
				
		for (int i = 0; i < CIM_Sensor.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTREADING)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXPECTEDREADING)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERPRETATIONOFFALSE)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERPRETATIONOFTRUE)){
				continue;
			}
			
			CIM_BinarySensor.CIM_PropertyNameList.add(CIM_Sensor.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTREADING, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXPECTEDREADING, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERPRETATIONOFFALSE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERPRETATIONOFTRUE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Sensor.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTREADING)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXPECTEDREADING)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERPRETATIONOFFALSE)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERPRETATIONOFTRUE)){
				continue;
			}
			
			CIM_BinarySensor.CIM_PropertyList.add(CIM_Sensor.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Sensor.Java_Package_List.size(); i++) {
			if (((String)CIM_Sensor.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Sensor.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BinarySensor() {

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
	public CIM_BinarySensor(Vector keyProperties){ 
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
	public CIM_BinarySensor(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_BinarySensor)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BinarySensor)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BinarySensor)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BinarySensor)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BinarySensor)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BinarySensor)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BinarySensor)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BinarySensor)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BinarySensor)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BinarySensor)object).cimObjectPath)) {
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
	
	// Attribute CurrentReading
	
	public Boolean get_CurrentReading() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BinarySensor.CIM_PROPERTY_CURRENTREADING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BinarySensor.CIM_PROPERTY_CURRENTREADING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BinarySensor.CIM_PROPERTY_CURRENTREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentReading(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BinarySensor.CIM_PROPERTY_CURRENTREADING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BinarySensor.CIM_PROPERTY_CURRENTREADING + " could not be found");
    		
		} else if (!CIM_BinarySensorHelper.isValid_CurrentReading(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BinarySensor.CIM_PROPERTY_CURRENTREADING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BinarySensor.CIM_PROPERTY_CURRENTREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExpectedReading
	
	public Boolean get_ExpectedReading() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BinarySensor.CIM_PROPERTY_EXPECTEDREADING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BinarySensor.CIM_PROPERTY_EXPECTEDREADING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BinarySensor.CIM_PROPERTY_EXPECTEDREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExpectedReading(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BinarySensor.CIM_PROPERTY_EXPECTEDREADING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BinarySensor.CIM_PROPERTY_EXPECTEDREADING + " could not be found");
    		
		} else if (!CIM_BinarySensorHelper.isValid_ExpectedReading(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BinarySensor.CIM_PROPERTY_EXPECTEDREADING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BinarySensor.CIM_PROPERTY_EXPECTEDREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InterpretationOfFalse
	
	public String get_InterpretationOfFalse() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFFALSE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFFALSE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFFALSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InterpretationOfFalse(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFFALSE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFFALSE + " could not be found");
    		
		} else if (!CIM_BinarySensorHelper.isValid_InterpretationOfFalse(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFFALSE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFFALSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InterpretationOfTrue
	
	public String get_InterpretationOfTrue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFTRUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFTRUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFTRUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InterpretationOfTrue(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFTRUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFTRUE + " could not be found");
    		
		} else if (!CIM_BinarySensorHelper.isValid_InterpretationOfTrue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFTRUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BinarySensor.CIM_PROPERTY_INTERPRETATIONOFTRUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
