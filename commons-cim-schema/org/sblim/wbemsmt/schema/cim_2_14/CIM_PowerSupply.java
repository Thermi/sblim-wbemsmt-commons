/** 
 * CIM_PowerSupply.java
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
 * Description:  Capabilities and management of the PowerSupply LogicalDevice.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  Capabilities and management of the PowerSupply LogicalDevice.
 */
public class CIM_PowerSupply extends CIM_LogicalDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_PowerSupply"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDSUPPLYCURRENTSENSOR = "CIM_AssociatedSupplyCurrentSensor"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDSUPPLYVOLTAGESENSOR = "CIM_AssociatedSupplyVoltageSensor"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SUPPLIESPOWER = "CIM_SuppliesPower"; //$NON-NLS-1$
	
	
	/**
	*	ActiveInputVoltage indicates which input voltage range is currently in use. Range 1, 2, or both can be specified using the values 3, 4, or 5, respectively. If the Supply is not currently drawing power, the value 6 ("Neither") can be specified. This information is necessary in the case of a UPS, a subclass of PowerSupply.
	*/
	public final static String CIM_PROPERTY_ACTIVEINPUTVOLTAGE = "ActiveInputVoltage"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the PowerSupply is a switching (instead of linear) supply.
	*/
	public final static String CIM_PROPERTY_ISSWITCHINGSUPPLY = "IsSwitchingSupply"; //$NON-NLS-1$
	/**
	*	The frequency (in hertz) at the high end of the Input Frequency Range 1 of this Power Supply. A value of 0 implies DC.
	*/
	public final static String CIM_PROPERTY_RANGE1INPUTFREQUENCYHIGH = "Range1InputFrequencyHigh"; //$NON-NLS-1$
	/**
	*	The frequency (in hertz) at the low end of the Input Frequency Range 1 of this Power Supply. A value of 0 implies DC.
	*/
	public final static String CIM_PROPERTY_RANGE1INPUTFREQUENCYLOW = "Range1InputFrequencyLow"; //$NON-NLS-1$
	/**
	*	The high voltage of Input Voltage Range 1 for this Power Supply, in millivolts. A value of 0 denotes 'unknown'.
	*/
	public final static String CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH = "Range1InputVoltageHigh"; //$NON-NLS-1$
	/**
	*	The low voltage of Input Voltage Range 1 for this Power Supply, in millivolts. A value of 0 denotes 'unknown'.
	*/
	public final static String CIM_PROPERTY_RANGE1INPUTVOLTAGELOW = "Range1InputVoltageLow"; //$NON-NLS-1$
	/**
	*	The frequency (in hertz) at the high end of the Input Frequency Range 2 of this Power Supply. A value of 0 implies DC.
	*/
	public final static String CIM_PROPERTY_RANGE2INPUTFREQUENCYHIGH = "Range2InputFrequencyHigh"; //$NON-NLS-1$
	/**
	*	The frequency (in hertz) at the low end of the Input Frequency Range 2 of this Power Supply. A value of 0 implies DC.
	*/
	public final static String CIM_PROPERTY_RANGE2INPUTFREQUENCYLOW = "Range2InputFrequencyLow"; //$NON-NLS-1$
	/**
	*	The high voltage of Input Voltage Range 2 for this Power Supply, in millivolts. A value of 0 denotes 'unknown'.
	*/
	public final static String CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH = "Range2InputVoltageHigh"; //$NON-NLS-1$
	/**
	*	The low voltage of Input Voltage Range 2 for this Power Supply, in millivolts. A value of 0 denotes 'unknown'.
	*/
	public final static String CIM_PROPERTY_RANGE2INPUTVOLTAGELOW = "Range2InputVoltageLow"; //$NON-NLS-1$
	/**
	*	Represents the total output power of the PowerSupply in milliWatts. 0 denotes 'unknown'.
	*/
	public final static String CIM_PROPERTY_TOTALOUTPUTPOWER = "TotalOutputPower"; //$NON-NLS-1$
	/**
	*	TypeOfRangeSwitching describes the kind of input voltage range switching that is implemented in this PowerSupply. For example, autoswitching can be specified (value=4).
	*/
	public final static String CIM_PROPERTY_TYPEOFRANGESWITCHING = "TypeOfRangeSwitching"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIVEINPUTVOLTAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISSWITCHINGSUPPLY);
		CIM_PropertyNameList.add(CIM_PROPERTY_RANGE1INPUTFREQUENCYHIGH);
		CIM_PropertyNameList.add(CIM_PROPERTY_RANGE1INPUTFREQUENCYLOW);
		CIM_PropertyNameList.add(CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH);
		CIM_PropertyNameList.add(CIM_PROPERTY_RANGE1INPUTVOLTAGELOW);
		CIM_PropertyNameList.add(CIM_PROPERTY_RANGE2INPUTFREQUENCYHIGH);
		CIM_PropertyNameList.add(CIM_PROPERTY_RANGE2INPUTFREQUENCYLOW);
		CIM_PropertyNameList.add(CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH);
		CIM_PropertyNameList.add(CIM_PROPERTY_RANGE2INPUTVOLTAGELOW);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALOUTPUTPOWER);
		CIM_PropertyNameList.add(CIM_PROPERTY_TYPEOFRANGESWITCHING);
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIVEINPUTVOLTAGE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISSWITCHINGSUPPLY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RANGE1INPUTFREQUENCYHIGH)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RANGE1INPUTFREQUENCYLOW)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RANGE1INPUTVOLTAGELOW)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RANGE2INPUTFREQUENCYHIGH)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RANGE2INPUTFREQUENCYLOW)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RANGE2INPUTVOLTAGELOW)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALOUTPUTPOWER)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TYPEOFRANGESWITCHING)){
				continue;
			}
			
			CIM_PowerSupply.CIM_PropertyNameList.add(CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIVEINPUTVOLTAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISSWITCHINGSUPPLY, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RANGE1INPUTFREQUENCYHIGH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RANGE1INPUTFREQUENCYLOW, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RANGE1INPUTVOLTAGELOW, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RANGE2INPUTFREQUENCYHIGH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RANGE2INPUTFREQUENCYLOW, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RANGE2INPUTVOLTAGELOW, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALOUTPUTPOWER, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TYPEOFRANGESWITCHING, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIVEINPUTVOLTAGE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISSWITCHINGSUPPLY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RANGE1INPUTFREQUENCYHIGH)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RANGE1INPUTFREQUENCYLOW)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RANGE1INPUTVOLTAGELOW)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RANGE2INPUTFREQUENCYHIGH)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RANGE2INPUTFREQUENCYLOW)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RANGE2INPUTVOLTAGELOW)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALOUTPUTPOWER)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TYPEOFRANGESWITCHING)){
				continue;
			}
			
			CIM_PowerSupply.CIM_PropertyList.add(CIM_LogicalDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_LogicalDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ACTIVEINPUTVOLTAGE = {"Other","Unknown","Range 1","Range 2","Both","Neither"};
	public final static String[] CIM_VALUEMAP_TYPEOFRANGESWITCHING = {"Other","Unknown","Manual","Autoswitch","Wide Range","Not Applicable"};
	
	
	public final static int ACTIVEINPUTVOLTAGE_OTHER = 1;
	public final static int ACTIVEINPUTVOLTAGE_UNKNOWN = 2;
	public final static int ACTIVEINPUTVOLTAGE_RANGE1 = 3;
	public final static int ACTIVEINPUTVOLTAGE_RANGE2 = 4;
	public final static int ACTIVEINPUTVOLTAGE_BOTH = 5;
	public final static int ACTIVEINPUTVOLTAGE_NEITHER = 6;
	
	public final static int TYPEOFRANGESWITCHING_OTHER = 1;
	public final static int TYPEOFRANGESWITCHING_UNKNOWN = 2;
	public final static int TYPEOFRANGESWITCHING_MANUAL = 3;
	public final static int TYPEOFRANGESWITCHING_AUTOSWITCH = 4;
	public final static int TYPEOFRANGESWITCHING_WIDERANGE = 5;
	public final static int TYPEOFRANGESWITCHING_NOTAPPLICABLE = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PowerSupply() {

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
	public CIM_PowerSupply(Vector keyProperties){ 
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
	public CIM_PowerSupply(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PowerSupply)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PowerSupply)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PowerSupply)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PowerSupply)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PowerSupply)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PowerSupply)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PowerSupply)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PowerSupply)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PowerSupply)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PowerSupply)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_CurrentSensor_CIM_AssociatedSupplyCurrentSensors(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDSUPPLYCURRENTSENSOR, 
					CIM_CurrentSensor.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_PowerSupply.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PowerSupply.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_PowerSupply.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_PowerSupply.Java_Package_List.setElementAt((String)(CIM_PowerSupply.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_PowerSupply.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_CurrentSensor(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_CurrentSensor(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_CurrentSensor(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_CurrentSensor_CIM_AssociatedSupplyCurrentSensor_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDSUPPLYCURRENTSENSOR, 
					CIM_CurrentSensor.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_CurrentSensor.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_VoltageSensor_CIM_AssociatedSupplyVoltageSensors(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDSUPPLYVOLTAGESENSOR, 
					CIM_VoltageSensor.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_PowerSupply.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PowerSupply.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_PowerSupply.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_PowerSupply.Java_Package_List.setElementAt((String)(CIM_PowerSupply.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_PowerSupply.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_VoltageSensor(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_VoltageSensor(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_VoltageSensor(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_VoltageSensor_CIM_AssociatedSupplyVoltageSensor_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDSUPPLYVOLTAGESENSOR, 
					CIM_VoltageSensor.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_VoltageSensor.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_LogicalDevice_CIM_SuppliesPowers(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SUPPLIESPOWER, 
					CIM_LogicalDevice.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_PowerSupply.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PowerSupply.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_PowerSupply.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_PowerSupply.Java_Package_List.setElementAt((String)(CIM_PowerSupply.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_PowerSupply.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_LogicalDevice_CIM_SuppliesPower_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SUPPLIESPOWER, 
					CIM_LogicalDevice.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
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
	
	// Attribute ActiveInputVoltage
	
	public UnsignedInt16 get_ActiveInputVoltage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_ACTIVEINPUTVOLTAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_ACTIVEINPUTVOLTAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_ACTIVEINPUTVOLTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ActiveInputVoltage(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_ACTIVEINPUTVOLTAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_ACTIVEINPUTVOLTAGE + " could not be found");
    		
		} else if (!CIM_PowerSupplyHelper.isValid_ActiveInputVoltage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PowerSupply.CIM_PROPERTY_ACTIVEINPUTVOLTAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_ACTIVEINPUTVOLTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsSwitchingSupply
	
	public Boolean get_IsSwitchingSupply() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_ISSWITCHINGSUPPLY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_ISSWITCHINGSUPPLY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_ISSWITCHINGSUPPLY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsSwitchingSupply(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_ISSWITCHINGSUPPLY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_ISSWITCHINGSUPPLY + " could not be found");
    		
		} else if (!CIM_PowerSupplyHelper.isValid_IsSwitchingSupply(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PowerSupply.CIM_PROPERTY_ISSWITCHINGSUPPLY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_ISSWITCHINGSUPPLY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Range1InputFrequencyHigh
	
	public UnsignedInt32 get_Range1InputFrequencyHigh() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYHIGH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYHIGH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Range1InputFrequencyHigh(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYHIGH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYHIGH + " could not be found");
    		
		} else if (!CIM_PowerSupplyHelper.isValid_Range1InputFrequencyHigh(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYHIGH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Range1InputFrequencyLow
	
	public UnsignedInt32 get_Range1InputFrequencyLow() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYLOW);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYLOW + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYLOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Range1InputFrequencyLow(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYLOW);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYLOW + " could not be found");
    		
		} else if (!CIM_PowerSupplyHelper.isValid_Range1InputFrequencyLow(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYLOW);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTFREQUENCYLOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Range1InputVoltageHigh
	
	public UnsignedInt32 get_Range1InputVoltageHigh() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Range1InputVoltageHigh(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH + " could not be found");
    		
		} else if (!CIM_PowerSupplyHelper.isValid_Range1InputVoltageHigh(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGEHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Range1InputVoltageLow
	
	public UnsignedInt32 get_Range1InputVoltageLow() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Range1InputVoltageLow(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW + " could not be found");
    		
		} else if (!CIM_PowerSupplyHelper.isValid_Range1InputVoltageLow(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE1INPUTVOLTAGELOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Range2InputFrequencyHigh
	
	public UnsignedInt32 get_Range2InputFrequencyHigh() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYHIGH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYHIGH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Range2InputFrequencyHigh(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYHIGH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYHIGH + " could not be found");
    		
		} else if (!CIM_PowerSupplyHelper.isValid_Range2InputFrequencyHigh(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYHIGH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Range2InputFrequencyLow
	
	public UnsignedInt32 get_Range2InputFrequencyLow() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYLOW);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYLOW + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYLOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Range2InputFrequencyLow(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYLOW);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYLOW + " could not be found");
    		
		} else if (!CIM_PowerSupplyHelper.isValid_Range2InputFrequencyLow(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYLOW);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTFREQUENCYLOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Range2InputVoltageHigh
	
	public UnsignedInt32 get_Range2InputVoltageHigh() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Range2InputVoltageHigh(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH + " could not be found");
    		
		} else if (!CIM_PowerSupplyHelper.isValid_Range2InputVoltageHigh(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGEHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Range2InputVoltageLow
	
	public UnsignedInt32 get_Range2InputVoltageLow() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Range2InputVoltageLow(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW + " could not be found");
    		
		} else if (!CIM_PowerSupplyHelper.isValid_Range2InputVoltageLow(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_RANGE2INPUTVOLTAGELOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TotalOutputPower
	
	public UnsignedInt32 get_TotalOutputPower() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_TOTALOUTPUTPOWER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_TOTALOUTPUTPOWER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_TOTALOUTPUTPOWER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalOutputPower(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_TOTALOUTPUTPOWER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_TOTALOUTPUTPOWER + " could not be found");
    		
		} else if (!CIM_PowerSupplyHelper.isValid_TotalOutputPower(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PowerSupply.CIM_PROPERTY_TOTALOUTPUTPOWER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_TOTALOUTPUTPOWER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TypeOfRangeSwitching
	
	public UnsignedInt16 get_TypeOfRangeSwitching() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_TYPEOFRANGESWITCHING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_TYPEOFRANGESWITCHING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_TYPEOFRANGESWITCHING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TypeOfRangeSwitching(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PowerSupply.CIM_PROPERTY_TYPEOFRANGESWITCHING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PowerSupply.CIM_PROPERTY_TYPEOFRANGESWITCHING + " could not be found");
    		
		} else if (!CIM_PowerSupplyHelper.isValid_TypeOfRangeSwitching(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PowerSupply.CIM_PROPERTY_TYPEOFRANGESWITCHING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PowerSupply.CIM_PROPERTY_TYPEOFRANGESWITCHING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
