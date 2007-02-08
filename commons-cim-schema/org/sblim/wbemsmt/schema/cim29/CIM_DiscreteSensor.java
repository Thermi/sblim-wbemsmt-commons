/** 
 * CIM_DiscreteSensor.java
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
 * Description: A DiscreteSensor has a set of legal string values, that it can report. These values are enumerated in the Sensor's PossibleValues property. A DiscreteSensor will always have a 'current reading' that corresponds to one of the enumerated values. 
The use of this class is being deprecated in lieu of CIM_Sensor. Information in the CurrentReading and PossibleValues properties will typically have the same values and semantics as for the CurrentState and PossibleStates properties, inherited from Sensor.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_DiscreteSensor extends CIM_Sensor  {
	
	public final static String CIM_CLASS_NAME = "CIM_DiscreteSensor";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	AcceptableValues details which of the PossibleValues strings are considered 'acceptable' (ie, 'not an error').
	*/
	public final static String CIM_PROPERTY_ACCEPTABLEVALUES = "AcceptableValues"; //$NON-NLS-1$
	/**
	*	The current value indicated by the Sensor.
	*/
	public final static String CIM_PROPERTY_CURRENTREADING = "CurrentReading"; //$NON-NLS-1$
	/**
	*	PossibleValues enumerates the string outputs that can be reported by the DiscreteSensor.
	*/
	public final static String CIM_PROPERTY_POSSIBLEVALUES = "PossibleValues"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCEPTABLEVALUES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTREADING);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSSIBLEVALUES);
				
		for (int i = 0; i < CIM_Sensor.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCEPTABLEVALUES)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTREADING)||
				((String)CIM_Sensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSSIBLEVALUES)){
				continue;
			}
			
			CIM_DiscreteSensor.CIM_PropertyNameList.add(CIM_Sensor.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCEPTABLEVALUES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTREADING, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSSIBLEVALUES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
				
		for (int i = 0; i < CIM_Sensor.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCEPTABLEVALUES)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTREADING)||
				((CIMProperty)CIM_Sensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSSIBLEVALUES)){
				continue;
			}
			
			CIM_DiscreteSensor.CIM_PropertyList.add(CIM_Sensor.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Sensor.Java_Package_List.size(); i++) {
			if (((String)CIM_Sensor.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
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
	public CIM_DiscreteSensor() {

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
	public CIM_DiscreteSensor(Vector keyProperties){ 
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
	public CIM_DiscreteSensor(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DiscreteSensor)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DiscreteSensor)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DiscreteSensor)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DiscreteSensor)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DiscreteSensor)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DiscreteSensor)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DiscreteSensor)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DiscreteSensor)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DiscreteSensor)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DiscreteSensor)object).cimObjectPath)) {
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
	
	// Attribute AcceptableValues
	
	public String[] get_AcceptableValues() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiscreteSensor.CIM_PROPERTY_ACCEPTABLEVALUES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiscreteSensor.CIM_PROPERTY_ACCEPTABLEVALUES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiscreteSensor.CIM_PROPERTY_ACCEPTABLEVALUES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_AcceptableValues(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiscreteSensor.CIM_PROPERTY_ACCEPTABLEVALUES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiscreteSensor.CIM_PROPERTY_ACCEPTABLEVALUES + " could not be found");
    		
		} else if (!CIM_DiscreteSensorHelper.isValid_AcceptableValues(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiscreteSensor.CIM_PROPERTY_ACCEPTABLEVALUES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiscreteSensor.CIM_PROPERTY_ACCEPTABLEVALUES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentReading
	
	public String get_CurrentReading() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiscreteSensor.CIM_PROPERTY_CURRENTREADING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiscreteSensor.CIM_PROPERTY_CURRENTREADING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiscreteSensor.CIM_PROPERTY_CURRENTREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentReading(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiscreteSensor.CIM_PROPERTY_CURRENTREADING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiscreteSensor.CIM_PROPERTY_CURRENTREADING + " could not be found");
    		
		} else if (!CIM_DiscreteSensorHelper.isValid_CurrentReading(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiscreteSensor.CIM_PROPERTY_CURRENTREADING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiscreteSensor.CIM_PROPERTY_CURRENTREADING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PossibleValues
	
	public String[] get_PossibleValues() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiscreteSensor.CIM_PROPERTY_POSSIBLEVALUES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiscreteSensor.CIM_PROPERTY_POSSIBLEVALUES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiscreteSensor.CIM_PROPERTY_POSSIBLEVALUES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_PossibleValues(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiscreteSensor.CIM_PROPERTY_POSSIBLEVALUES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiscreteSensor.CIM_PROPERTY_POSSIBLEVALUES + " could not be found");
    		
		} else if (!CIM_DiscreteSensorHelper.isValid_PossibleValues(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiscreteSensor.CIM_PROPERTY_POSSIBLEVALUES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiscreteSensor.CIM_PROPERTY_POSSIBLEVALUES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
