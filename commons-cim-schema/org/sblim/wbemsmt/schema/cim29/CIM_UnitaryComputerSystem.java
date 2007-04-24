/** 
 * CIM_UnitaryComputerSystem.java
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
 * Description:  A class derived from ComputerSystem that represents a Desktop, Mobile, NetPC,
 * Server or other type of a single node Computer System.
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



/**
 *  A class derived from ComputerSystem that represents a Desktop, Mobile, NetPC,
 * Server or other type of a single node Computer System.
 */
public class CIM_UnitaryComputerSystem extends CIM_ComputerSystem  {
	
	public final static String CIM_CLASS_NAME = "CIM_UnitaryComputerSystem"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY = "CIM_ComputerSystemMemory"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR = "CIM_ComputerSystemProcessor"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION = "CIM_SystemPartition"; //$NON-NLS-1$
	
	
	/**
	*	This object contains the data needed to find either the initial load device (its key) or the boot service to request the operating system to start up. In addition, the load parameters (ie, a pathname and parameters) may also be specified.
	*/
	public final static String CIM_PROPERTY_INITIALLOADINFO = "InitialLoadInfo"; //$NON-NLS-1$
	/**
	*	This object contains the data identifying either the initial load device (its key) or the boot service that requested the last operating system load. In addition, the load parameters (ie, a pathname and parameters) may also be specified.
	*/
	public final static String CIM_PROPERTY_LASTLOADINFO = "LastLoadInfo"; //$NON-NLS-1$
	/**
	*	When TRUE, indicates that the computer can be power managed. The use of this property has been deprecated. Instead, the existence of an associated PowerManagementCapabilities class (associated using the ElementCapabilites relationship) indicates that power management is supported.
	*/
	public final static String CIM_PROPERTY_POWERMANAGEMENTSUPPORTED = "PowerManagementSupported"; //$NON-NLS-1$
	/**
	*	Indicates the current power state of the ComputerSystem and its associated OperatingSystem. Regarding the Power Save states, these are defined as follows: Value 4 ("Power Save - Unknown") indicates that the System is known to be in a power save mode, but its exact status in this mode is unknown; 
Value 2 ("Power Save - Low Power Mode") indicates that the System is in a power save state but still functioning, and may exhibit degraded performance; 
Value 3 ("Power Save - Standby") describes that the System is not functioning but could be brought to full power 'quickly'; value 7 ("Power Save - Warning") indicates that the ComputerSystem is in a warning state, though also in a power save mode. 
Values 8 and 9 describe the ACPI "Hibernate" and "Soft Off" states.
	*/
	public final static String CIM_PROPERTY_POWERSTATE = "PowerState"; //$NON-NLS-1$
	/**
	*	The event that caused the System to power up. This information is available in SMBIOS, in the Type 1 structure, the Wake Up Type attribute.
	*/
	public final static String CIM_PROPERTY_WAKEUPTYPE = "WakeUpType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_INITIALLOADINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTLOADINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_POWERMANAGEMENTSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_POWERSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_WAKEUPTYPE);
				
		for (int i = 0; i < CIM_ComputerSystem.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ComputerSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INITIALLOADINFO)||
				((String)CIM_ComputerSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTLOADINFO)||
				((String)CIM_ComputerSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POWERMANAGEMENTSUPPORTED)||
				((String)CIM_ComputerSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POWERSTATE)||
				((String)CIM_ComputerSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WAKEUPTYPE)){
				continue;
			}
			
			CIM_UnitaryComputerSystem.CIM_PropertyNameList.add(CIM_ComputerSystem.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INITIALLOADINFO, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTLOADINFO, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POWERMANAGEMENTSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POWERSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WAKEUPTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_ComputerSystem.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ComputerSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INITIALLOADINFO)||
				((CIMProperty)CIM_ComputerSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTLOADINFO)||
				((CIMProperty)CIM_ComputerSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POWERMANAGEMENTSUPPORTED)||
				((CIMProperty)CIM_ComputerSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POWERSTATE)||
				((CIMProperty)CIM_ComputerSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WAKEUPTYPE)){
				continue;
			}
			
			CIM_UnitaryComputerSystem.CIM_PropertyList.add(CIM_ComputerSystem.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ComputerSystem.Java_Package_List.size(); i++) {
			if (((String)CIM_ComputerSystem.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ComputerSystem.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_POWERSTATE = {"Unknown","Full Power","Power Save - Low Power Mode","Power Save - Standby","Power Save - Unknown","Power Cycle","Power Off","Power Save - Warning","Power Save - Hibernate","Power Save - Soft Off"};
	public final static String[] CIM_VALUEMAP_WAKEUPTYPE = {"Reserved","Other","Unknown","APM Timer","Modem Ring","LAN Remote","Power Switch","PCI PME#","A/C Power Restored"};
	
	
	public final static int POWERSTATE_UNKNOWN = 0;
	public final static int POWERSTATE_FULLPOWER = 1;
	public final static int POWERSTATE_POWERSAVE_LOWPOWERMODE = 2;
	public final static int POWERSTATE_POWERSAVE_STANDBY = 3;
	public final static int POWERSTATE_POWERSAVE_UNKNOWN = 4;
	public final static int POWERSTATE_POWERCYCLE = 5;
	public final static int POWERSTATE_POWEROFF = 6;
	public final static int POWERSTATE_POWERSAVE_WARNING = 7;
	public final static int POWERSTATE_POWERSAVE_HIBERNATE = 8;
	public final static int POWERSTATE_POWERSAVE_SOFTOFF = 9;
	
	public final static int WAKEUPTYPE_RESERVED = 0;
	public final static int WAKEUPTYPE_OTHER = 1;
	public final static int WAKEUPTYPE_UNKNOWN = 2;
	public final static int WAKEUPTYPE_APMTIMER = 3;
	public final static int WAKEUPTYPE_MODEMRING = 4;
	public final static int WAKEUPTYPE_LANREMOTE = 5;
	public final static int WAKEUPTYPE_POWERSWITCH = 6;
	public final static int WAKEUPTYPE_PCIPME = 7;
	public final static int WAKEUPTYPE_A_CPOWERRESTORED = 8;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_UnitaryComputerSystem() {

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
	public CIM_UnitaryComputerSystem(Vector keyProperties){ 
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
	public CIM_UnitaryComputerSystem(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_UnitaryComputerSystem)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_UnitaryComputerSystem)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_UnitaryComputerSystem)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_UnitaryComputerSystem)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_UnitaryComputerSystem)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_UnitaryComputerSystem)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_UnitaryComputerSystem)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_UnitaryComputerSystem)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_UnitaryComputerSystem)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_UnitaryComputerSystem)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_Memory_CIM_ComputerSystemMemorys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, 
					CIM_Memory.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_UnitaryComputerSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_UnitaryComputerSystem.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_UnitaryComputerSystem.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_UnitaryComputerSystem.Java_Package_List.setElementAt((String)(CIM_UnitaryComputerSystem.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_UnitaryComputerSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Memory(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Memory(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Memory(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Memory_CIM_ComputerSystemMemory_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, 
					CIM_Memory.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Memory.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_Processor_CIM_ComputerSystemProcessors(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR, 
					CIM_Processor.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_UnitaryComputerSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_UnitaryComputerSystem.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_UnitaryComputerSystem.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_UnitaryComputerSystem.Java_Package_List.setElementAt((String)(CIM_UnitaryComputerSystem.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_UnitaryComputerSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Processor(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Processor(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Processor(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Processor_CIM_ComputerSystemProcessor_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR, 
					CIM_Processor.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Processor.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_SystemPartitions(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_UnitaryComputerSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_UnitaryComputerSystem.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_UnitaryComputerSystem.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_UnitaryComputerSystem.Java_Package_List.setElementAt((String)(CIM_UnitaryComputerSystem.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_UnitaryComputerSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_SystemPartition_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
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
	
	// Attribute InitialLoadInfo
	
	public String[] get_InitialLoadInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitaryComputerSystem.CIM_PROPERTY_INITIALLOADINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_INITIALLOADINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_INITIALLOADINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_InitialLoadInfo(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitaryComputerSystem.CIM_PROPERTY_INITIALLOADINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_INITIALLOADINFO + " could not be found");
    		
		} else if (!CIM_UnitaryComputerSystemHelper.isValid_InitialLoadInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_INITIALLOADINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_INITIALLOADINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastLoadInfo
	
	public String get_LastLoadInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitaryComputerSystem.CIM_PROPERTY_LASTLOADINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_LASTLOADINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_LASTLOADINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LastLoadInfo(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitaryComputerSystem.CIM_PROPERTY_LASTLOADINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_LASTLOADINFO + " could not be found");
    		
		} else if (!CIM_UnitaryComputerSystemHelper.isValid_LastLoadInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_LASTLOADINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_LASTLOADINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PowerManagementSupported
	
	public Boolean get_PowerManagementSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERMANAGEMENTSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERMANAGEMENTSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERMANAGEMENTSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PowerManagementSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERMANAGEMENTSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERMANAGEMENTSUPPORTED + " could not be found");
    		
		} else if (!CIM_UnitaryComputerSystemHelper.isValid_PowerManagementSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERMANAGEMENTSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERMANAGEMENTSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PowerState
	
	public UnsignedInt16 get_PowerState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PowerState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERSTATE + " could not be found");
    		
		} else if (!CIM_UnitaryComputerSystemHelper.isValid_PowerState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_POWERSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WakeUpType
	
	public UnsignedInt16 get_WakeUpType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitaryComputerSystem.CIM_PROPERTY_WAKEUPTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_WAKEUPTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_WAKEUPTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WakeUpType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitaryComputerSystem.CIM_PROPERTY_WAKEUPTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_WAKEUPTYPE + " could not be found");
    		
		} else if (!CIM_UnitaryComputerSystemHelper.isValid_WakeUpType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_WAKEUPTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitaryComputerSystem.CIM_PROPERTY_WAKEUPTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
