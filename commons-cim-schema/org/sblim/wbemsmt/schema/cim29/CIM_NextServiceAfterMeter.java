/** 
 * CIM_NextServiceAfterMeter.java
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
 * Description: This association describes a predecessor-successor relationship between a MeterService and one or more ConditioningService objects that process traffic from the meter. For example, for devices that implement preamble marking, the FollowingService reference (after the meter) is a PreambleMarkerService - to record the results of the metering in the preamble. 

It might be expected that the NextServiceAfterMeter association would subclass from NextService. However, meters are 1:n fan-out elements, and require a mechanism to distinguish between the different results/outputs of the meter. Therefore, this association defines a new key property, MeterResult, which is used to record the result and identify the output through which this traffic left the meter.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_NextServiceAfterMeter  {
	
	protected CIMInstance cimInstance			= new CIMInstance();
	protected CIMInstance original_cimInstance	= null;
	protected CIMObjectPath cimObjectPath		= null; 
	
	public final static String CIM_CLASS_NAME = "CIM_NextServiceAfterMeter";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_METERSERVICE = "PrecedingService"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_CONDITIONINGSERVICE = "FollowingService"; //$NON-NLS-1$
	
	
	/**
	*	Information on the result of the metering. Traffic is distinguished as being conforming, non-conforming, or partially conforming. More complicated metering can be built either by extending the enumeration or by cascading meters.
	*/
	public final static String CIM_PROPERTY_METERRESULT = "MeterResult"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_METERRESULT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_METERSERVICE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_CONDITIONINGSERVICE);
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_METERRESULT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_METERSERVICE, new CIMValue(null, new CIMDataType(CIM_MeterService.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_CONDITIONINGSERVICE, new CIMValue(null, new CIMDataType(CIM_ConditioningService.CIM_CLASS_NAME))));
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
		};
			
	public final static String[] CIM_VALUEMAP_METERRESULT = {"Unknown","Conforming","Partially Conforming","Non-Conforming"};
	
	
	public final static int METERRESULT_UNKNOWN = 0;
	public final static int METERRESULT_CONFORMING = 1;
	public final static int METERRESULT_PARTIALLYCONFORMING = 2;
	public final static int METERRESULT_NON_CONFORMING = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_NextServiceAfterMeter() {

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
	public CIM_NextServiceAfterMeter(Vector keyProperties){ 
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
	public CIM_NextServiceAfterMeter(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_MeterResult = this.cimInstance.getProperty(CIM_PROPERTY_METERRESULT);
		
		if (CIMProperty_MeterResult == null || CIMProperty_MeterResult.getValue().isEmpty() || CIMProperty_MeterResult.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_METERRESULT, "Key"});
			result = false;
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
	    
	    if (!(object instanceof CIM_NextServiceAfterMeter)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_NextServiceAfterMeter)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_NextServiceAfterMeter)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_NextServiceAfterMeter)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_NextServiceAfterMeter)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_NextServiceAfterMeter)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_NextServiceAfterMeter)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_NextServiceAfterMeter)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_NextServiceAfterMeter)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_NextServiceAfterMeter)object).cimObjectPath)) {
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
	
	// Attribute MeterResult
	
	public UnsignedInt16 get_MeterResult() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextServiceAfterMeter.CIM_PROPERTY_METERRESULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_METERRESULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_METERRESULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MeterResult(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextServiceAfterMeter.CIM_PROPERTY_METERRESULT);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_METERRESULT + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_METERRESULT + " could not be found");
    		
		} else if (!CIM_NextServiceAfterMeterHelper.isValid_MeterResult(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_METERRESULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_METERRESULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_MeterService
	
	public CIMObjectPath get_CIM_MeterService() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_METERSERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_METERSERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_MeterService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_METERSERVICE + " is not of expected type CIM_MeterService.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_MeterService(CIM_MeterService newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_METERSERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_METERSERVICE + " could not be found");
    		
		} else if (!CIM_NextServiceAfterMeterHelper.isValid_CIM_MeterService(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_METERSERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_MeterService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_METERSERVICE + " is not of expected type CIM_MeterService.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_MeterService.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ConditioningService
	
	public CIMObjectPath get_CIM_ConditioningService() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_CONDITIONINGSERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_CONDITIONINGSERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ConditioningService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_CONDITIONINGSERVICE + " is not of expected type CIM_ConditioningService.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ConditioningService(CIM_ConditioningService newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_CONDITIONINGSERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_CONDITIONINGSERVICE + " could not be found");
    		
		} else if (!CIM_NextServiceAfterMeterHelper.isValid_CIM_ConditioningService(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_CONDITIONINGSERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ConditioningService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NextServiceAfterMeter.CIM_PROPERTY_CIM_CONDITIONINGSERVICE + " is not of expected type CIM_ConditioningService.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ConditioningService.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
