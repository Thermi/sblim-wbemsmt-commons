/** 
 * CIM_Tachometer.java
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
 * Description: The use of this class is deprecated in lieu of the additions to Sensor and NumericSensor. A Tachometer can be defined by setting the SensorType property. inherited from Sensor, to 5 ("Tachometer").
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_Tachometer extends CIM_NumericSensor  {
	
	public final static String CIM_CLASS_NAME = "CIM_Tachometer";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	
	*/
	public final static String CIM_PROPERTY_BASEUNITS = "BaseUnits"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_RATEUNITS = "RateUnits"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_RESOLUTION = "Resolution"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_SENSORTYPE = "SensorType"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_UNITMODIFIER = "UnitModifier"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BASEUNITS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RATEUNITS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RESOLUTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_SENSORTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNITMODIFIER);
				
		for (int i = 0; i < CIM_NumericSensor.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BASEUNITS)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RATEUNITS)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RESOLUTION)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SENSORTYPE)||
				((String)CIM_NumericSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNITMODIFIER)){
				continue;
			}
			
			CIM_Tachometer.CIM_PropertyNameList.add(CIM_NumericSensor.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BASEUNITS, new CIMValue(new UnsignedInt16("38"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RATEUNITS, new CIMValue(new UnsignedInt16("4"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SENSORTYPE, new CIMValue(new UnsignedInt16("5"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNITMODIFIER, new CIMValue(new Integer("1"), new CIMDataType(CIMDataType.SINT32))));
				
		for (int i = 0; i < CIM_NumericSensor.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BASEUNITS)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RATEUNITS)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RESOLUTION)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SENSORTYPE)||
				((CIMProperty)CIM_NumericSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNITMODIFIER)){
				continue;
			}
			
			CIM_Tachometer.CIM_PropertyList.add(CIM_NumericSensor.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_NumericSensor.Java_Package_List.size(); i++) {
			if (((String)CIM_NumericSensor.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_NumericSensor.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Tachometer() {

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
	public CIM_Tachometer(Vector keyProperties){ 
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
	public CIM_Tachometer(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Tachometer)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Tachometer)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Tachometer)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Tachometer)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Tachometer)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Tachometer)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Tachometer)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Tachometer)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Tachometer)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Tachometer)object).cimObjectPath)) {
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
	
	// Attribute BaseUnits
	
	public UnsignedInt16 get_BaseUnits() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Tachometer.CIM_PROPERTY_BASEUNITS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Tachometer.CIM_PROPERTY_BASEUNITS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Tachometer.CIM_PROPERTY_BASEUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BaseUnits(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Tachometer.CIM_PROPERTY_BASEUNITS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Tachometer.CIM_PROPERTY_BASEUNITS + " could not be found");
    		
		} else if (!CIM_TachometerHelper.isValid_BaseUnits(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Tachometer.CIM_PROPERTY_BASEUNITS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Tachometer.CIM_PROPERTY_BASEUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RateUnits
	
	public UnsignedInt16 get_RateUnits() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Tachometer.CIM_PROPERTY_RATEUNITS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Tachometer.CIM_PROPERTY_RATEUNITS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Tachometer.CIM_PROPERTY_RATEUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RateUnits(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Tachometer.CIM_PROPERTY_RATEUNITS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Tachometer.CIM_PROPERTY_RATEUNITS + " could not be found");
    		
		} else if (!CIM_TachometerHelper.isValid_RateUnits(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Tachometer.CIM_PROPERTY_RATEUNITS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Tachometer.CIM_PROPERTY_RATEUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Resolution
	
	public UnsignedInt32 get_Resolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Tachometer.CIM_PROPERTY_RESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Tachometer.CIM_PROPERTY_RESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Tachometer.CIM_PROPERTY_RESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Resolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Tachometer.CIM_PROPERTY_RESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Tachometer.CIM_PROPERTY_RESOLUTION + " could not be found");
    		
		} else if (!CIM_TachometerHelper.isValid_Resolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Tachometer.CIM_PROPERTY_RESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Tachometer.CIM_PROPERTY_RESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SensorType
	
	public UnsignedInt16 get_SensorType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Tachometer.CIM_PROPERTY_SENSORTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Tachometer.CIM_PROPERTY_SENSORTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Tachometer.CIM_PROPERTY_SENSORTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SensorType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Tachometer.CIM_PROPERTY_SENSORTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Tachometer.CIM_PROPERTY_SENSORTYPE + " could not be found");
    		
		} else if (!CIM_TachometerHelper.isValid_SensorType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Tachometer.CIM_PROPERTY_SENSORTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Tachometer.CIM_PROPERTY_SENSORTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnitModifier
	
	public Integer get_UnitModifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Tachometer.CIM_PROPERTY_UNITMODIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Tachometer.CIM_PROPERTY_UNITMODIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Tachometer.CIM_PROPERTY_UNITMODIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Integer)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnitModifier(Integer newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Tachometer.CIM_PROPERTY_UNITMODIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Tachometer.CIM_PROPERTY_UNITMODIFIER + " could not be found");
    		
		} else if (!CIM_TachometerHelper.isValid_UnitModifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Tachometer.CIM_PROPERTY_UNITMODIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Tachometer.CIM_PROPERTY_UNITMODIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
