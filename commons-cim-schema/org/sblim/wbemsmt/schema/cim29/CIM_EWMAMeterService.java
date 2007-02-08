/** 
 * CIM_EWMAMeterService.java
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
 * Description: This is a concrete subclass of the MeterService class that represents an exponentially weighted moving average meter. This meter is a simple low-pass filter that measures the rate of incoming packets over a small, fixed sampling interval. Any admitted packet that pushes the average rate over a pre-defined limit is defined to be non-conforming.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_EWMAMeterService extends CIM_MeterService  {
	
	public final static String CIM_CLASS_NAME = "CIM_EWMAMeterService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	This property is a 32-bit unsigned integer that defines the average rate against which the sampled arrival rate of packets should be measured. Any packet that causes the sampled rate to exceed this rate is deemed non-conforming. The value is specified in kilobits per second.
	*/
	public final static String CIM_PROPERTY_AVERAGERATE = "AverageRate"; //$NON-NLS-1$
	/**
	*	This property is a 64-bit unsigned integer that defines the sampling interval used to measure the arrival rate. The calculated rate is averaged over this interval and checked against the AverageRate property. All packets whose computed average arrival rate is less than the AverageRate are deemed conforming. The value is specified in microseconds.
	*/
	public final static String CIM_PROPERTY_DELTAINTERVAL = "DeltaInterval"; //$NON-NLS-1$
	/**
	*	This property is a 32-bit unsigned integer representing the reciprocal of the time constant (e.g., frequency response) of what is essentially a simple low-pass filter. For example, the value 64 for this property represents a time constant value of 1/64.
	*/
	public final static String CIM_PROPERTY_GAIN = "Gain"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AVERAGERATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELTAINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_GAIN);
				
		for (int i = 0; i < CIM_MeterService.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_MeterService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AVERAGERATE)||
				((String)CIM_MeterService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELTAINTERVAL)||
				((String)CIM_MeterService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GAIN)){
				continue;
			}
			
			CIM_EWMAMeterService.CIM_PropertyNameList.add(CIM_MeterService.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AVERAGERATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELTAINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GAIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_MeterService.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_MeterService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AVERAGERATE)||
				((CIMProperty)CIM_MeterService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELTAINTERVAL)||
				((CIMProperty)CIM_MeterService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GAIN)){
				continue;
			}
			
			CIM_EWMAMeterService.CIM_PropertyList.add(CIM_MeterService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_MeterService.Java_Package_List.size(); i++) {
			if (((String)CIM_MeterService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_MeterService.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_EWMAMeterService() {

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
	public CIM_EWMAMeterService(Vector keyProperties){ 
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
	public CIM_EWMAMeterService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_EWMAMeterService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_EWMAMeterService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_EWMAMeterService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_EWMAMeterService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_EWMAMeterService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_EWMAMeterService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_EWMAMeterService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_EWMAMeterService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_EWMAMeterService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_EWMAMeterService)object).cimObjectPath)) {
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
	
	// Attribute AverageRate
	
	public UnsignedInt32 get_AverageRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EWMAMeterService.CIM_PROPERTY_AVERAGERATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EWMAMeterService.CIM_PROPERTY_AVERAGERATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EWMAMeterService.CIM_PROPERTY_AVERAGERATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AverageRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EWMAMeterService.CIM_PROPERTY_AVERAGERATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EWMAMeterService.CIM_PROPERTY_AVERAGERATE + " could not be found");
    		
		} else if (!CIM_EWMAMeterServiceHelper.isValid_AverageRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EWMAMeterService.CIM_PROPERTY_AVERAGERATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EWMAMeterService.CIM_PROPERTY_AVERAGERATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeltaInterval
	
	public UnsignedInt64 get_DeltaInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EWMAMeterService.CIM_PROPERTY_DELTAINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EWMAMeterService.CIM_PROPERTY_DELTAINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EWMAMeterService.CIM_PROPERTY_DELTAINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeltaInterval(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EWMAMeterService.CIM_PROPERTY_DELTAINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EWMAMeterService.CIM_PROPERTY_DELTAINTERVAL + " could not be found");
    		
		} else if (!CIM_EWMAMeterServiceHelper.isValid_DeltaInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EWMAMeterService.CIM_PROPERTY_DELTAINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EWMAMeterService.CIM_PROPERTY_DELTAINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Gain
	
	public UnsignedInt32 get_Gain() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EWMAMeterService.CIM_PROPERTY_GAIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EWMAMeterService.CIM_PROPERTY_GAIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EWMAMeterService.CIM_PROPERTY_GAIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Gain(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EWMAMeterService.CIM_PROPERTY_GAIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EWMAMeterService.CIM_PROPERTY_GAIN + " could not be found");
    		
		} else if (!CIM_EWMAMeterServiceHelper.isValid_Gain(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EWMAMeterService.CIM_PROPERTY_GAIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EWMAMeterService.CIM_PROPERTY_GAIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
