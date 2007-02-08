/** 
 * CIM_AssociatedSupplyVoltageSensor.java
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
 * Description: The use of this association is being deprecated in lieu of using AssociatedSensor, since the use of the referenced class VoltageSensor is deprecated. 
A PowerSupply may have an associated VoltageSensor, monitoring its input voltage. This is described by this association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_AssociatedSupplyVoltageSensor extends CIM_AssociatedSensor  {
	
	public final static String CIM_CLASS_NAME = "CIM_AssociatedSupplyVoltageSensor";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_VOLTAGESENSOR = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_POWERSUPPLY = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	Indicates the PowerSupply's input voltage range measured by the associated sensor. Range 1, 2 or both can be specified using the values 2, 3 or 4, respectively.
	*/
	public final static String CIM_PROPERTY_MONITORINGRANGE = "MonitoringRange"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MONITORINGRANGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_VOLTAGESENSOR);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POWERSUPPLY);
				
		for (int i = 0; i < CIM_AssociatedSensor.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_AssociatedSensor.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MONITORINGRANGE)){
				continue;
			}
			
			CIM_AssociatedSupplyVoltageSensor.CIM_PropertyNameList.add(CIM_AssociatedSensor.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MONITORINGRANGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_VOLTAGESENSOR, new CIMValue(null, new CIMDataType(CIM_VoltageSensor.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POWERSUPPLY, new CIMValue(null, new CIMDataType(CIM_PowerSupply.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_AssociatedSensor.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_AssociatedSensor.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MONITORINGRANGE)){
				continue;
			}
			
			CIM_AssociatedSupplyVoltageSensor.CIM_PropertyList.add(CIM_AssociatedSensor.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_AssociatedSensor.Java_Package_List.size(); i++) {
			if (((String)CIM_AssociatedSensor.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_AssociatedSensor.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_MONITORINGRANGE = {"Unknown","Other","Range 1","Range 2","Both Range 1 and 2"};
	
	
	public final static int MONITORINGRANGE_UNKNOWN = 0;
	public final static int MONITORINGRANGE_OTHER = 1;
	public final static int MONITORINGRANGE_RANGE1 = 2;
	public final static int MONITORINGRANGE_RANGE2 = 3;
	public final static int MONITORINGRANGE_BOTHRANGE1AND2 = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AssociatedSupplyVoltageSensor() {

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
	public CIM_AssociatedSupplyVoltageSensor(Vector keyProperties){ 
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
	public CIM_AssociatedSupplyVoltageSensor(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_AssociatedSupplyVoltageSensor)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AssociatedSupplyVoltageSensor)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AssociatedSupplyVoltageSensor)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AssociatedSupplyVoltageSensor)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AssociatedSupplyVoltageSensor)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AssociatedSupplyVoltageSensor)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AssociatedSupplyVoltageSensor)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AssociatedSupplyVoltageSensor)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AssociatedSupplyVoltageSensor)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AssociatedSupplyVoltageSensor)object).cimObjectPath)) {
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
	
	// Attribute MonitoringRange
	
	public UnsignedInt16 get_MonitoringRange() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_MONITORINGRANGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_MONITORINGRANGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_MONITORINGRANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MonitoringRange(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_MONITORINGRANGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_MONITORINGRANGE + " could not be found");
    		
		} else if (!CIM_AssociatedSupplyVoltageSensorHelper.isValid_MonitoringRange(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_MONITORINGRANGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_MONITORINGRANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_VoltageSensor
	
	public CIMObjectPath get_CIM_VoltageSensor() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_VOLTAGESENSOR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_VOLTAGESENSOR + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_VoltageSensor.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_VOLTAGESENSOR + " is not of expected type CIM_VoltageSensor.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_VoltageSensor(CIM_VoltageSensor newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_VOLTAGESENSOR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_VOLTAGESENSOR + " could not be found");
    		
		} else if (!CIM_AssociatedSupplyVoltageSensorHelper.isValid_CIM_VoltageSensor(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_VOLTAGESENSOR);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_VoltageSensor.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_VOLTAGESENSOR + " is not of expected type CIM_VoltageSensor.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_VoltageSensor.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_PowerSupply
	
	public CIMObjectPath get_CIM_PowerSupply() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_POWERSUPPLY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_POWERSUPPLY + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PowerSupply.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_POWERSUPPLY + " is not of expected type CIM_PowerSupply.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PowerSupply(CIM_PowerSupply newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_POWERSUPPLY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_POWERSUPPLY + " could not be found");
    		
		} else if (!CIM_AssociatedSupplyVoltageSensorHelper.isValid_CIM_PowerSupply(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_POWERSUPPLY);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PowerSupply.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedSupplyVoltageSensor.CIM_PROPERTY_CIM_POWERSUPPLY + " is not of expected type CIM_PowerSupply.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PowerSupply.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
