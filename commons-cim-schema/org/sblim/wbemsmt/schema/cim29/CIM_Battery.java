/** 
 * CIM_Battery.java
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
 * Description: Capabilities and management of the Battery LogicalDevice. This class applies to both batteries in Laptop Systems and other internal/external batteries, such as used in, or as UPSs.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_Battery extends CIM_LogicalDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_Battery";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDBATTERY = "CIM_AssociatedBattery";
	
	
	/**
	*	Description of the Battery's charge status. Values such as "Fully Charged" (value=3) or "Partially Charged" (11) can be specified. The value, 10, is not valid in the CIM Schema since in DMI it represents that no battery is installed. In this case, this object should not be instantiated.
	*/
	public final static String CIM_PROPERTY_BATTERYSTATUS = "BatteryStatus"; //$NON-NLS-1$
	/**
	*	An enumeration that describes the Battery's chemistry.
	*/
	public final static String CIM_PROPERTY_CHEMISTRY = "Chemistry"; //$NON-NLS-1$
	/**
	*	The design capacity of the battery in mWatt-hours. If this property is not supported, enter 0.
	*/
	public final static String CIM_PROPERTY_DESIGNCAPACITY = "DesignCapacity"; //$NON-NLS-1$
	/**
	*	The design voltage of the battery in mVolts. If this attribute is not supported, enter 0.
	*/
	public final static String CIM_PROPERTY_DESIGNVOLTAGE = "DesignVoltage"; //$NON-NLS-1$
	/**
	*	An estimate of the percentage of full charge remaining.
	*/
	public final static String CIM_PROPERTY_ESTIMATEDCHARGEREMAINING = "EstimatedChargeRemaining"; //$NON-NLS-1$
	/**
	*	EstimatedRunTime is an estimate in minutes of the time to battery charge depletion under the present load conditions if the utility power is off, or lost and remains off, or a Laptop is disconnected from a power source.
	*/
	public final static String CIM_PROPERTY_ESTIMATEDRUNTIME = "EstimatedRunTime"; //$NON-NLS-1$
	/**
	*	Indicates the Battery's expected lifetime in minutes, assuming that the Battery is fully charged. This property represents the total expected life of the Battery, not its current remaining life, which is indicated by the EstimatedRunTime property.
	*/
	public final static String CIM_PROPERTY_EXPECTEDLIFE = "ExpectedLife"; //$NON-NLS-1$
	/**
	*	The full charge capacity of the battery in mWatt-hours. Comparison of this value to the Battery DesignCapacity determines when the Battery requires replacement. A Battery's end of life is typically when the FullCharge Capacity falls below 80% of the DesignCapacity. If this property is not supported, enter 0.
	*/
	public final static String CIM_PROPERTY_FULLCHARGECAPACITY = "FullChargeCapacity"; //$NON-NLS-1$
	/**
	*	MaxRechargeTime indicates the maximum time, in minutes, to fully charge the Battery. This property represents the time to recharge a fully depleted Battery, not the current remaining charging time, which is indicated in the TimeToFullCharge property.
	*/
	public final static String CIM_PROPERTY_MAXRECHARGETIME = "MaxRechargeTime"; //$NON-NLS-1$
	/**
	*	The Smart Battery Data Specification version number supported by this Battery. If the Battery does not support this function, the value should be left blank.
	*/
	public final static String CIM_PROPERTY_SMARTBATTERYVERSION = "SmartBatteryVersion"; //$NON-NLS-1$
	/**
	*	TimeOnBattery indicates the elapsed time in seconds since the ComputerSystem, UPS, ... last switched to battery power, or the time since the System or UPS was last restarted, whichever is less. Zero shall be returned if the Battery is 'on line'.
	*/
	public final static String CIM_PROPERTY_TIMEONBATTERY = "TimeOnBattery"; //$NON-NLS-1$
	/**
	*	The remaining time to charge the battery fully in minutes at the current charging rate and usage.
	*/
	public final static String CIM_PROPERTY_TIMETOFULLCHARGE = "TimeToFullCharge"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BATTERYSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CHEMISTRY);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESIGNCAPACITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESIGNVOLTAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ESTIMATEDCHARGEREMAINING);
		CIM_PropertyNameList.add(CIM_PROPERTY_ESTIMATEDRUNTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXPECTEDLIFE);
		CIM_PropertyNameList.add(CIM_PROPERTY_FULLCHARGECAPACITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXRECHARGETIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SMARTBATTERYVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEONBATTERY);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMETOFULLCHARGE);
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BATTERYSTATUS)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHEMISTRY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESIGNCAPACITY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESIGNVOLTAGE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ESTIMATEDCHARGEREMAINING)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ESTIMATEDRUNTIME)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXPECTEDLIFE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FULLCHARGECAPACITY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXRECHARGETIME)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SMARTBATTERYVERSION)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEONBATTERY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMETOFULLCHARGE)){
				continue;
			}
			
			CIM_Battery.CIM_PropertyNameList.add(CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BATTERYSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHEMISTRY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESIGNCAPACITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESIGNVOLTAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ESTIMATEDCHARGEREMAINING, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ESTIMATEDRUNTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXPECTEDLIFE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FULLCHARGECAPACITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXRECHARGETIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SMARTBATTERYVERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEONBATTERY, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMETOFULLCHARGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BATTERYSTATUS)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHEMISTRY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESIGNCAPACITY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESIGNVOLTAGE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ESTIMATEDCHARGEREMAINING)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ESTIMATEDRUNTIME)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXPECTEDLIFE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FULLCHARGECAPACITY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXRECHARGETIME)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SMARTBATTERYVERSION)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEONBATTERY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMETOFULLCHARGE)){
				continue;
			}
			
			CIM_Battery.CIM_PropertyList.add(CIM_LogicalDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_BATTERYSTATUS = {"Other","Unknown","Fully Charged","Low","Critical","Charging","Charging and High","Charging and Low","Charging and Critical","Undefined","Partially Charged"};
	public final static String[] CIM_VALUEMAP_CHEMISTRY = {"Other","Unknown","Lead Acid","Nickel Cadmium","Nickel Metal Hydride","Lithium-ion","Zinc air","Lithium Polymer"};
	
	
	public final static int BATTERYSTATUS_OTHER = 1;
	public final static int BATTERYSTATUS_UNKNOWN = 2;
	public final static int BATTERYSTATUS_FULLYCHARGED = 3;
	public final static int BATTERYSTATUS_LOW = 4;
	public final static int BATTERYSTATUS_CRITICAL = 5;
	public final static int BATTERYSTATUS_CHARGING = 6;
	public final static int BATTERYSTATUS_CHARGINGANDHIGH = 7;
	public final static int BATTERYSTATUS_CHARGINGANDLOW = 8;
	public final static int BATTERYSTATUS_CHARGINGANDCRITICAL = 9;
	public final static int BATTERYSTATUS_UNDEFINED = 10;
	public final static int BATTERYSTATUS_PARTIALLYCHARGED = 11;
	
	public final static int CHEMISTRY_OTHER = 1;
	public final static int CHEMISTRY_UNKNOWN = 2;
	public final static int CHEMISTRY_LEADACID = 3;
	public final static int CHEMISTRY_NICKELCADMIUM = 4;
	public final static int CHEMISTRY_NICKELMETALHYDRIDE = 5;
	public final static int CHEMISTRY_LITHIUM_ION = 6;
	public final static int CHEMISTRY_ZINCAIR = 7;
	public final static int CHEMISTRY_LITHIUMPOLYMER = 8;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Battery() {

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
	public CIM_Battery(Vector keyProperties){ 
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
	public CIM_Battery(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Battery)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Battery)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Battery)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Battery)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Battery)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Battery)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Battery)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Battery)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Battery)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Battery)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_LogicalDevice_CIM_AssociatedBatterys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDBATTERY, 
					CIM_LogicalDevice.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Battery.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Battery.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Battery.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Battery.Java_Package_List.setElementAt((String)(CIM_Battery.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Battery.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalDevice(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalDevice(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalDevice(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_LogicalDevice_CIM_AssociatedBattery_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDBATTERY, 
					CIM_LogicalDevice.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LogicalDevice.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute BatteryStatus
	
	public UnsignedInt16 get_BatteryStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_BATTERYSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_BATTERYSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_BATTERYSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BatteryStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_BATTERYSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_BATTERYSTATUS + " could not be found");
    		
		} else if (!CIM_BatteryHelper.isValid_BatteryStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Battery.CIM_PROPERTY_BATTERYSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_BATTERYSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Chemistry
	
	public UnsignedInt16 get_Chemistry() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_CHEMISTRY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_CHEMISTRY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_CHEMISTRY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Chemistry(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_CHEMISTRY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_CHEMISTRY + " could not be found");
    		
		} else if (!CIM_BatteryHelper.isValid_Chemistry(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Battery.CIM_PROPERTY_CHEMISTRY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_CHEMISTRY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DesignCapacity
	
	public UnsignedInt32 get_DesignCapacity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_DESIGNCAPACITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_DESIGNCAPACITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_DESIGNCAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DesignCapacity(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_DESIGNCAPACITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_DESIGNCAPACITY + " could not be found");
    		
		} else if (!CIM_BatteryHelper.isValid_DesignCapacity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Battery.CIM_PROPERTY_DESIGNCAPACITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_DESIGNCAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DesignVoltage
	
	public UnsignedInt64 get_DesignVoltage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_DESIGNVOLTAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_DESIGNVOLTAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_DESIGNVOLTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DesignVoltage(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_DESIGNVOLTAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_DESIGNVOLTAGE + " could not be found");
    		
		} else if (!CIM_BatteryHelper.isValid_DesignVoltage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Battery.CIM_PROPERTY_DESIGNVOLTAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_DESIGNVOLTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EstimatedChargeRemaining
	
	public UnsignedInt16 get_EstimatedChargeRemaining() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EstimatedChargeRemaining(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING + " could not be found");
    		
		} else if (!CIM_BatteryHelper.isValid_EstimatedChargeRemaining(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Battery.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_ESTIMATEDCHARGEREMAINING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EstimatedRunTime
	
	public UnsignedInt32 get_EstimatedRunTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_ESTIMATEDRUNTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_ESTIMATEDRUNTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_ESTIMATEDRUNTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EstimatedRunTime(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_ESTIMATEDRUNTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_ESTIMATEDRUNTIME + " could not be found");
    		
		} else if (!CIM_BatteryHelper.isValid_EstimatedRunTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Battery.CIM_PROPERTY_ESTIMATEDRUNTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_ESTIMATEDRUNTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExpectedLife
	
	public UnsignedInt32 get_ExpectedLife() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_EXPECTEDLIFE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_EXPECTEDLIFE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_EXPECTEDLIFE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExpectedLife(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_EXPECTEDLIFE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_EXPECTEDLIFE + " could not be found");
    		
		} else if (!CIM_BatteryHelper.isValid_ExpectedLife(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Battery.CIM_PROPERTY_EXPECTEDLIFE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_EXPECTEDLIFE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FullChargeCapacity
	
	public UnsignedInt32 get_FullChargeCapacity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_FULLCHARGECAPACITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_FULLCHARGECAPACITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_FULLCHARGECAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FullChargeCapacity(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_FULLCHARGECAPACITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_FULLCHARGECAPACITY + " could not be found");
    		
		} else if (!CIM_BatteryHelper.isValid_FullChargeCapacity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Battery.CIM_PROPERTY_FULLCHARGECAPACITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_FULLCHARGECAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxRechargeTime
	
	public UnsignedInt32 get_MaxRechargeTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_MAXRECHARGETIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_MAXRECHARGETIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_MAXRECHARGETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxRechargeTime(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_MAXRECHARGETIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_MAXRECHARGETIME + " could not be found");
    		
		} else if (!CIM_BatteryHelper.isValid_MaxRechargeTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Battery.CIM_PROPERTY_MAXRECHARGETIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_MAXRECHARGETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SmartBatteryVersion
	
	public String get_SmartBatteryVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_SMARTBATTERYVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_SMARTBATTERYVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_SMARTBATTERYVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SmartBatteryVersion(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_SMARTBATTERYVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_SMARTBATTERYVERSION + " could not be found");
    		
		} else if (!CIM_BatteryHelper.isValid_SmartBatteryVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Battery.CIM_PROPERTY_SMARTBATTERYVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_SMARTBATTERYVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOnBattery
	
	public UnsignedInt32 get_TimeOnBattery() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_TIMEONBATTERY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_TIMEONBATTERY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_TIMEONBATTERY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TimeOnBattery(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_TIMEONBATTERY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_TIMEONBATTERY + " could not be found");
    		
		} else if (!CIM_BatteryHelper.isValid_TimeOnBattery(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Battery.CIM_PROPERTY_TIMEONBATTERY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_TIMEONBATTERY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeToFullCharge
	
	public UnsignedInt32 get_TimeToFullCharge() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_TIMETOFULLCHARGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_TIMETOFULLCHARGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_TIMETOFULLCHARGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TimeToFullCharge(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Battery.CIM_PROPERTY_TIMETOFULLCHARGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Battery.CIM_PROPERTY_TIMETOFULLCHARGE + " could not be found");
    		
		} else if (!CIM_BatteryHelper.isValid_TimeToFullCharge(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Battery.CIM_PROPERTY_TIMETOFULLCHARGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Battery.CIM_PROPERTY_TIMETOFULLCHARGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
