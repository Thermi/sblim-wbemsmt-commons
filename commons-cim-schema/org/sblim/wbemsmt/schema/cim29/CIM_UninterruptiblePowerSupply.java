/** 
 * CIM_UninterruptiblePowerSupply.java
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
 * Description: Capabilities and management of an UninterruptiblePowerSupply. The properties of the UPS Device indicate when incoming power is trimmed or boosted, and the aggregated information of the batteries, generators, etc. that comprise the Device. These individual components (for example, multiple batteries) can also be independently modeled and associated with the UPS.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_UninterruptiblePowerSupply extends CIM_PowerSupply  {
	
	public final static String CIM_CLASS_NAME = "CIM_UninterruptiblePowerSupply";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	An estimate of the percentage of full charge remaining for a UPS (that uses battery technology).
	*/
	public final static String CIM_PROPERTY_ESTIMATEDCHARGEREMAINING = "EstimatedChargeRemaining"; //$NON-NLS-1$
	/**
	*	EstimatedRunTime is an estimate in minutes of the time to battery, generator, ... depletion under the present load conditions if the utility power is off, or lost and remains off.
	*/
	public final static String CIM_PROPERTY_ESTIMATEDRUNTIME = "EstimatedRunTime"; //$NON-NLS-1$
	/**
	*	If the voltage (in millivolts) rises above the value specified by Range1InputVoltageHigh, the UPS will compensate by trimming the voltage. A value of 0 indicates that the voltage at which trimming occurs is 'unknown'.
	*/
	public final static String CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH = "Range1InputVoltageHigh"; //$NON-NLS-1$
	/**
	*	If the voltage (in millivolts) drops below the value specified by Range1InputVoltageLow, the UPS will compensate by boosting the voltage using its power source(s). A value of 0 indicates that the voltage at which boosting occurs is 'unknown'.
	*/
	public final static String CIM_PROPERTY_RANGE1INPUTVOLTAGELOW = "Range1InputVoltageLow"; //$NON-NLS-1$
	/**
	*	If the voltage (in millivolts) rises above the value specified by Range2InputVoltageHigh, the UPS will compensate by trimming the voltage. A value of 0 indicates that the voltage at which trimming occurs is 'unknown'.
	*/
	public final static String CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH = "Range2InputVoltageHigh"; //$NON-NLS-1$
	/**
	*	If the voltage (in millivolts) drops below the value specified by Range2InputVoltageLow, the UPS will compensate by boosting the voltage using its power source(s). A value of 0 indicates that the voltage at which boosting occurs is 'unknown'.
	*/
	public final static String CIM_PROPERTY_RANGE2INPUTVOLTAGELOW = "Range2InputVoltageLow"; //$NON-NLS-1$
	/**
	*	The indication of the capacity remaining in the UPS' batteries, generator, ... A value of "Normal" (2) indicates that the remaining estimated minutes of run-time is greater than the UPS' defined 'low power' state (typically two minutes). A value of "Low" (3) indicates that the remaining estimated minutes of run-time is less than or equal to the UPS' defined 'low power' state. A value of "Depleted" (4) indicates that the UPS will be unable to sustain the present load when and if the utility power is lost (including the possibility that the utility power is currently absent).
	*/
	public final static String CIM_PROPERTY_REMAININGCAPACITYSTATUS = "RemainingCapacityStatus"; //$NON-NLS-1$
	/**
	*	TimeOnBackup indicates the elapsed time in seconds since the UPS last switched to battery power, generator, ... Or, the time since the UPS was last restarted, whichever is less. Zero shall be returned if the UPS is 'on line'.
	*/
	public final static String CIM_PROPERTY_TIMEONBACKUP = "TimeOnBackup"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ESTIMATEDCHARGEREMAINING);
		CIM_PropertyNameList.add(CIM_PROPERTY_ESTIMATEDRUNTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH);
		CIM_PropertyNameList.add(CIM_PROPERTY_RANGE1INPUTVOLTAGELOW);
		CIM_PropertyNameList.add(CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH);
		CIM_PropertyNameList.add(CIM_PROPERTY_RANGE2INPUTVOLTAGELOW);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMAININGCAPACITYSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEONBACKUP);
				
		for (int i = 0; i < CIM_PowerSupply.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PowerSupply.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ESTIMATEDCHARGEREMAINING)||
				((String)CIM_PowerSupply.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ESTIMATEDRUNTIME)||
				((String)CIM_PowerSupply.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH)||
				((String)CIM_PowerSupply.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RANGE1INPUTVOLTAGELOW)||
				((String)CIM_PowerSupply.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH)||
				((String)CIM_PowerSupply.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RANGE2INPUTVOLTAGELOW)||
				((String)CIM_PowerSupply.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMAININGCAPACITYSTATUS)||
				((String)CIM_PowerSupply.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEONBACKUP)){
				continue;
			}
			
			CIM_UninterruptiblePowerSupply.CIM_PropertyNameList.add(CIM_PowerSupply.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ESTIMATEDCHARGEREMAINING, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ESTIMATEDRUNTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RANGE1INPUTVOLTAGELOW, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RANGE2INPUTVOLTAGELOW, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMAININGCAPACITYSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEONBACKUP, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_PowerSupply.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PowerSupply.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ESTIMATEDCHARGEREMAINING)||
				((CIMProperty)CIM_PowerSupply.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ESTIMATEDRUNTIME)||
				((CIMProperty)CIM_PowerSupply.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH)||
				((CIMProperty)CIM_PowerSupply.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RANGE1INPUTVOLTAGELOW)||
				((CIMProperty)CIM_PowerSupply.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH)||
				((CIMProperty)CIM_PowerSupply.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RANGE2INPUTVOLTAGELOW)||
				((CIMProperty)CIM_PowerSupply.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMAININGCAPACITYSTATUS)||
				((CIMProperty)CIM_PowerSupply.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEONBACKUP)){
				continue;
			}
			
			CIM_UninterruptiblePowerSupply.CIM_PropertyList.add(CIM_PowerSupply.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PowerSupply.Java_Package_List.size(); i++) {
			if (((String)CIM_PowerSupply.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PowerSupply.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_REMAININGCAPACITYSTATUS = {"Unknown","Normal","Low","Depleted"};
	
	
	public final static int REMAININGCAPACITYSTATUS_UNKNOWN = 1;
	public final static int REMAININGCAPACITYSTATUS_NORMAL = 2;
	public final static int REMAININGCAPACITYSTATUS_LOW = 3;
	public final static int REMAININGCAPACITYSTATUS_DEPLETED = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_UninterruptiblePowerSupply() {

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
	public CIM_UninterruptiblePowerSupply(Vector keyProperties){ 
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
	public CIM_UninterruptiblePowerSupply(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_UninterruptiblePowerSupply)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_UninterruptiblePowerSupply)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_UninterruptiblePowerSupply)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_UninterruptiblePowerSupply)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_UninterruptiblePowerSupply)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_UninterruptiblePowerSupply)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_UninterruptiblePowerSupply)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_UninterruptiblePowerSupply)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_UninterruptiblePowerSupply)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_UninterruptiblePowerSupply)object).cimObjectPath)) {
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
	
	// Attribute EstimatedChargeRemaining
	
	public UnsignedInt16 get_EstimatedChargeRemaining() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EstimatedChargeRemaining(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING + " could not be found");
    		
		} else if (!CIM_UninterruptiblePowerSupplyHelper.isValid_EstimatedChargeRemaining(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EstimatedRunTime
	
	public UnsignedInt32 get_EstimatedRunTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDRUNTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDRUNTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDRUNTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EstimatedRunTime(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDRUNTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDRUNTIME + " could not be found");
    		
		} else if (!CIM_UninterruptiblePowerSupplyHelper.isValid_EstimatedRunTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDRUNTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_ESTIMATEDRUNTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Range1InputVoltageHigh
	
	public UnsignedInt32 get_Range1InputVoltageHigh() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Range1InputVoltageHigh(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH + " could not be found");
    		
		} else if (!CIM_UninterruptiblePowerSupplyHelper.isValid_Range1InputVoltageHigh(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Range1InputVoltageLow
	
	public UnsignedInt32 get_Range1InputVoltageLow() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Range1InputVoltageLow(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW + " could not be found");
    		
		} else if (!CIM_UninterruptiblePowerSupplyHelper.isValid_Range1InputVoltageLow(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Range2InputVoltageHigh
	
	public UnsignedInt32 get_Range2InputVoltageHigh() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Range2InputVoltageHigh(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH + " could not be found");
    		
		} else if (!CIM_UninterruptiblePowerSupplyHelper.isValid_Range2InputVoltageHigh(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Range2InputVoltageLow
	
	public UnsignedInt32 get_Range2InputVoltageLow() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Range2InputVoltageLow(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW + " could not be found");
    		
		} else if (!CIM_UninterruptiblePowerSupplyHelper.isValid_Range2InputVoltageLow(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemainingCapacityStatus
	
	public UnsignedInt16 get_RemainingCapacityStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_REMAININGCAPACITYSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_REMAININGCAPACITYSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_REMAININGCAPACITYSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemainingCapacityStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_REMAININGCAPACITYSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_REMAININGCAPACITYSTATUS + " could not be found");
    		
		} else if (!CIM_UninterruptiblePowerSupplyHelper.isValid_RemainingCapacityStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_REMAININGCAPACITYSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_REMAININGCAPACITYSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOnBackup
	
	public UnsignedInt32 get_TimeOnBackup() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_TIMEONBACKUP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_TIMEONBACKUP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_TIMEONBACKUP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TimeOnBackup(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UninterruptiblePowerSupply.CIM_PROPERTY_TIMEONBACKUP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_TIMEONBACKUP + " could not be found");
    		
		} else if (!CIM_UninterruptiblePowerSupplyHelper.isValid_TimeOnBackup(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_TIMEONBACKUP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UninterruptiblePowerSupply.CIM_PROPERTY_TIMEONBACKUP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
