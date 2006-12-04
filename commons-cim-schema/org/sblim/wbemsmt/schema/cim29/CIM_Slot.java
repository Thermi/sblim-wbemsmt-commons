/** 
 * CIM_Slot.java
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
 * Description: The Slot class represents Connectors into which Packages are inserted. For example, a PhysicalPackage that is a DiskDrive may be inserted into an SCA 'Slot'. As another example, a Card (subclass of PhysicalPackage) may be inserted into a 16-, 32-, or 64-bit expansion 'Slot' on a HostingBoard. PCI or PCMCIA Type III Slots are examples of the latter.
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



public class CIM_Slot extends CIM_PhysicalConnector  {
	
	public final static String CIM_CLASS_NAME = "CIM_Slot";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDINSLOT = "CIM_CardInSlot";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINSLOT = "CIM_PackageInSlot";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SLOTINSLOT = "CIM_SlotInSlot";
	
	
	/**
	*	
	*/
	public final static String CIM_PROPERTY_CONNECTORTYPE = "ConnectorType"; //$NON-NLS-1$
	/**
	*	Maximum height of an adapter Card that can be inserted into the Slot, in inches.
	*/
	public final static String CIM_PROPERTY_HEIGHTALLOWED = "HeightAllowed"; //$NON-NLS-1$
	/**
	*	Maximum length of an adapter Card that can be inserted into the Slot, in inches.
	*/
	public final static String CIM_PROPERTY_LENGTHALLOWED = "LengthAllowed"; //$NON-NLS-1$
	/**
	*	Maximum bus width of adapter Cards that can be inserted into this Slot, in bits. If the value is 'unknown', enter 0. If the value is other than 8, 16, 32, 64 or 128, enter 1.
	*/
	public final static String CIM_PROPERTY_MAXDATAWIDTH = "MaxDataWidth"; //$NON-NLS-1$
	/**
	*	The Number property indicates the physical slot number, which can be used as an index into a system slot table, whether or not that slot is physically occupied.
	*/
	public final static String CIM_PROPERTY_NUMBER = "Number"; //$NON-NLS-1$
	/**
	*	A boolean indicating whether the switch state of the Slot is currently open (TRUE) or closed (FALSE). This switch state determines whether the contents of the Slot can be hot-plugged.
	*/
	public final static String CIM_PROPERTY_OPENSWITCH = "OpenSwitch"; //$NON-NLS-1$
	/**
	*	A boolean indicating whether the Slot is currently powered (TRUE) or not (FALSE).
	*/
	public final static String CIM_PROPERTY_POWERED = "Powered"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_POWEREDON = "PoweredOn"; //$NON-NLS-1$
	/**
	*	A free-form string describing that this Slot is physically unique and may hold special types of hardware. This property only has meaning when the corresponding boolean property, SpecialPurpose, is set to TRUE.
	*/
	public final static String CIM_PROPERTY_PURPOSEDESCRIPTION = "PurposeDescription"; //$NON-NLS-1$
	/**
	*	Boolean indicating that this Slot is physically unique and may hold special types of hardware, e.g. a graphics processor slot. If set to TRUE, then the property, Special PurposeDescription (a string), should specify the nature of the uniqueness or purpose of the Slot.
	*/
	public final static String CIM_PROPERTY_SPECIALPURPOSE = "SpecialPurpose"; //$NON-NLS-1$
	/**
	*	Boolean indicating whether the Slot supports hot-plug of adapter Cards.
	*/
	public final static String CIM_PROPERTY_SUPPORTSHOTPLUG = "SupportsHotPlug"; //$NON-NLS-1$
	/**
	*	Maximum thermal dissipation of the Slot in milliwatts.
	*/
	public final static String CIM_PROPERTY_THERMALRATING = "ThermalRating"; //$NON-NLS-1$
	/**
	*	An array of enumerated integers indicating the Vcc voltage supported by this Slot.
	*/
	public final static String CIM_PROPERTY_VCCMIXEDVOLTAGESUPPORT = "VccMixedVoltageSupport"; //$NON-NLS-1$
	/**
	*	An array of enumerated integers indicating the Vpp voltage supported by this Slot.
	*/
	public final static String CIM_PROPERTY_VPPMIXEDVOLTAGESUPPORT = "VppMixedVoltageSupport"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTORTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_HEIGHTALLOWED);
		CIM_PropertyNameList.add(CIM_PROPERTY_LENGTHALLOWED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXDATAWIDTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_OPENSWITCH);
		CIM_PropertyNameList.add(CIM_PROPERTY_POWERED);
		CIM_PropertyNameList.add(CIM_PROPERTY_POWEREDON);
		CIM_PropertyNameList.add(CIM_PROPERTY_PURPOSEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPECIALPURPOSE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTSHOTPLUG);
		CIM_PropertyNameList.add(CIM_PROPERTY_THERMALRATING);
		CIM_PropertyNameList.add(CIM_PROPERTY_VCCMIXEDVOLTAGESUPPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_VPPMIXEDVOLTAGESUPPORT);
				
		for (int i = 0; i < CIM_PhysicalConnector.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTORTYPE)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HEIGHTALLOWED)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LENGTHALLOWED)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXDATAWIDTH)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBER)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OPENSWITCH)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POWERED)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POWEREDON)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PURPOSEDESCRIPTION)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPECIALPURPOSE)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTSHOTPLUG)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_THERMALRATING)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VCCMIXEDVOLTAGESUPPORT)||
				((String)CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VPPMIXEDVOLTAGESUPPORT)){
				continue;
			}
			
			CIM_Slot.CIM_PropertyNameList.add(CIM_PhysicalConnector.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTORTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HEIGHTALLOWED, new CIMValue(null, new CIMDataType(CIMDataType.REAL32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LENGTHALLOWED, new CIMValue(null, new CIMDataType(CIMDataType.REAL32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXDATAWIDTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OPENSWITCH, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POWERED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POWEREDON, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PURPOSEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPECIALPURPOSE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTSHOTPLUG, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_THERMALRATING, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VCCMIXEDVOLTAGESUPPORT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VPPMIXEDVOLTAGESUPPORT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_PhysicalConnector.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTORTYPE)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HEIGHTALLOWED)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LENGTHALLOWED)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXDATAWIDTH)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBER)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OPENSWITCH)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POWERED)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POWEREDON)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PURPOSEDESCRIPTION)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPECIALPURPOSE)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTSHOTPLUG)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_THERMALRATING)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VCCMIXEDVOLTAGESUPPORT)||
				((CIMProperty)CIM_PhysicalConnector.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VPPMIXEDVOLTAGESUPPORT)){
				continue;
			}
			
			CIM_Slot.CIM_PropertyList.add(CIM_PhysicalConnector.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PhysicalConnector.Java_Package_List.size(); i++) {
			if (((String)CIM_PhysicalConnector.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PhysicalConnector.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_MAXDATAWIDTH = {"Value0","Value1","Value2","Value3","Value4","Value5","Value6"};
	public final static String[] CIM_VALUEMAP_VCCMIXEDVOLTAGESUPPORT = {"Unknown","Other","3.3V","5V"};
	public final static String[] CIM_VALUEMAP_VPPMIXEDVOLTAGESUPPORT = {"Unknown","Other","3.3V","5V","12V"};
	
	
	public final static int MAXDATAWIDTH_VALUE0 = 0;
	public final static int MAXDATAWIDTH_VALUE1 = 1;
	public final static int MAXDATAWIDTH_VALUE2 = 8;
	public final static int MAXDATAWIDTH_VALUE3 = 16;
	public final static int MAXDATAWIDTH_VALUE4 = 32;
	public final static int MAXDATAWIDTH_VALUE5 = 64;
	public final static int MAXDATAWIDTH_VALUE6 = 128;
	
	public final static int VCCMIXEDVOLTAGESUPPORT_UNKNOWN = 0;
	public final static int VCCMIXEDVOLTAGESUPPORT_OTHER = 1;
	public final static int VCCMIXEDVOLTAGESUPPORT_3_3V = 2;
	public final static int VCCMIXEDVOLTAGESUPPORT_5V = 3;
	
	public final static int VPPMIXEDVOLTAGESUPPORT_UNKNOWN = 0;
	public final static int VPPMIXEDVOLTAGESUPPORT_OTHER = 1;
	public final static int VPPMIXEDVOLTAGESUPPORT_3_3V = 2;
	public final static int VPPMIXEDVOLTAGESUPPORT_5V = 3;
	public final static int VPPMIXEDVOLTAGESUPPORT_12V = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Slot() {

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
	public CIM_Slot(Vector keyProperties){ 
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
	public CIM_Slot(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Slot)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Slot)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Slot)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Slot)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Slot)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Slot)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Slot)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Slot)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Slot)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Slot)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_Card_CIM_CardInSlots(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDINSLOT, 
					CIM_Card.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_Slot.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Slot.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Slot.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Slot.Java_Package_List.setElementAt((String)(CIM_Slot.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Slot.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Card(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Card(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Card(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Card_CIM_CardInSlot_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDINSLOT, 
					CIM_Card.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Card.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PhysicalPackage_CIM_PackageInSlots(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINSLOT, 
					CIM_PhysicalPackage.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_Slot.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Slot.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Slot.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Slot.Java_Package_List.setElementAt((String)(CIM_Slot.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Slot.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalPackage(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PhysicalPackage(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalPackage(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PhysicalPackage_CIM_PackageInSlot_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINSLOT, 
					CIM_PhysicalPackage.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PhysicalPackage.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_Slot_CIM_SlotInSlots(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SLOTINSLOT, 
					CIM_Slot.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_Slot.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Slot.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Slot.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Slot.Java_Package_List.setElementAt((String)(CIM_Slot.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Slot.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Slot(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Slot(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Slot(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Slot_CIM_SlotInSlot_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SLOTINSLOT, 
					CIM_Slot.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Slot.CIM_CLASS_NAME)) {
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
	
	// Attribute ConnectorType
	
	public UnsignedInt16[] get_ConnectorType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_CONNECTORTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_CONNECTORTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_CONNECTORTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ConnectorType(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_CONNECTORTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_CONNECTORTYPE + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_ConnectorType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_CONNECTORTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_CONNECTORTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HeightAllowed
	
	public Float get_HeightAllowed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_HEIGHTALLOWED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_HEIGHTALLOWED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_HEIGHTALLOWED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Float)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HeightAllowed(Float newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_HEIGHTALLOWED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_HEIGHTALLOWED + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_HeightAllowed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_HEIGHTALLOWED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_HEIGHTALLOWED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.REAL32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LengthAllowed
	
	public Float get_LengthAllowed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_LENGTHALLOWED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_LENGTHALLOWED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_LENGTHALLOWED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Float)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LengthAllowed(Float newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_LENGTHALLOWED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_LENGTHALLOWED + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_LengthAllowed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_LENGTHALLOWED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_LENGTHALLOWED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.REAL32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxDataWidth
	
	public UnsignedInt16 get_MaxDataWidth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_MAXDATAWIDTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_MAXDATAWIDTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_MAXDATAWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxDataWidth(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_MAXDATAWIDTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_MAXDATAWIDTH + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_MaxDataWidth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_MAXDATAWIDTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_MAXDATAWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Number
	
	public UnsignedInt16 get_Number() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_NUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_NUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_NUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Number(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_NUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_NUMBER + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_Number(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_NUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_NUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OpenSwitch
	
	public Boolean get_OpenSwitch() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_OPENSWITCH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_OPENSWITCH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_OPENSWITCH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OpenSwitch(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_OPENSWITCH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_OPENSWITCH + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_OpenSwitch(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_OPENSWITCH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_OPENSWITCH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Powered
	
	public Boolean get_Powered() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_POWERED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_POWERED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_POWERED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Powered(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_POWERED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_POWERED + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_Powered(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_POWERED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_POWERED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PoweredOn
	
	public Boolean get_PoweredOn() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_POWEREDON);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_POWEREDON + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_POWEREDON + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PoweredOn(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_POWEREDON);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_POWEREDON + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_PoweredOn(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_POWEREDON);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_POWEREDON + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PurposeDescription
	
	public String get_PurposeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_PURPOSEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_PURPOSEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_PURPOSEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PurposeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_PURPOSEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_PURPOSEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_PurposeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_PURPOSEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_PURPOSEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SpecialPurpose
	
	public Boolean get_SpecialPurpose() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_SPECIALPURPOSE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_SPECIALPURPOSE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_SPECIALPURPOSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SpecialPurpose(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_SPECIALPURPOSE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_SPECIALPURPOSE + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_SpecialPurpose(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_SPECIALPURPOSE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_SPECIALPURPOSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportsHotPlug
	
	public Boolean get_SupportsHotPlug() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_SUPPORTSHOTPLUG);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_SUPPORTSHOTPLUG + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_SUPPORTSHOTPLUG + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SupportsHotPlug(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_SUPPORTSHOTPLUG);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_SUPPORTSHOTPLUG + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_SupportsHotPlug(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_SUPPORTSHOTPLUG);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_SUPPORTSHOTPLUG + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ThermalRating
	
	public UnsignedInt32 get_ThermalRating() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_THERMALRATING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_THERMALRATING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_THERMALRATING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ThermalRating(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_THERMALRATING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_THERMALRATING + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_ThermalRating(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_THERMALRATING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_THERMALRATING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VccMixedVoltageSupport
	
	public UnsignedInt16[] get_VccMixedVoltageSupport() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_VCCMIXEDVOLTAGESUPPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_VCCMIXEDVOLTAGESUPPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_VCCMIXEDVOLTAGESUPPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_VccMixedVoltageSupport(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_VCCMIXEDVOLTAGESUPPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_VCCMIXEDVOLTAGESUPPORT + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_VccMixedVoltageSupport(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_VCCMIXEDVOLTAGESUPPORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_VCCMIXEDVOLTAGESUPPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VppMixedVoltageSupport
	
	public UnsignedInt16[] get_VppMixedVoltageSupport() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_VPPMIXEDVOLTAGESUPPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_VPPMIXEDVOLTAGESUPPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_VPPMIXEDVOLTAGESUPPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_VppMixedVoltageSupport(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Slot.CIM_PROPERTY_VPPMIXEDVOLTAGESUPPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Slot.CIM_PROPERTY_VPPMIXEDVOLTAGESUPPORT + " could not be found");
    		
		} else if (!CIM_SlotHelper.isValid_VppMixedVoltageSupport(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Slot.CIM_PROPERTY_VPPMIXEDVOLTAGESUPPORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Slot.CIM_PROPERTY_VPPMIXEDVOLTAGESUPPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
