/** 
 * CIM_Action.java
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
 * Description: A CIM_Action is an operation that is part of a process to either create a SoftwareElement in its next state or to eliminate the SoftwareElement in its current state. A CIM_ComputerSystem object represents the environment in which CIM_SoftwareElements are already deployed/installed or into which the elements will be deployed/installed. For the case in which an element is already installed, the CIM_InstalledSoftwareElement association identifies the CIM_ComputerSystem object that represents the "environment". When a SoftwareElement is being deployed for installation on a ComputerSystem, that system is the target of the Action and is identified using the TargetSystem reference of the InvokeOnSystem method.
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



public class CIM_Action extends CIM_ManagedElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_Action";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ACTIONSEQUENCE = "CIM_ActionSequence";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTACTIONS = "CIM_SoftwareElementActions";
	
	
	/**
	*	The ActionID property is a unique identifier assigned to a particular Action for a SoftwareElement.
	*/
	public final static String CIM_PROPERTY_ACTIONID = "ActionID"; //$NON-NLS-1$
	/**
	*	The Direction property is used to indicate whether this Action is part of a sequence to transition the SoftwareElement to its next state ("Install") or to remove the element ("Uninstall").
	*/
	public final static String CIM_PROPERTY_DIRECTION = "Direction"; //$NON-NLS-1$
	/**
	*	The name used to identify the SoftwareElement that is being acted upon.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	This is an identifier for the SoftwareElement being acted upon.
	*/
	public final static String CIM_PROPERTY_SOFTWAREELEMENTID = "SoftwareElementID"; //$NON-NLS-1$
	/**
	*	The SoftwareElementState of the SoftwareElement being acted upon.
	*/
	public final static String CIM_PROPERTY_SOFTWAREELEMENTSTATE = "SoftwareElementState"; //$NON-NLS-1$
	/**
	*	The Target Operating System of the SoftwareElement being acted upon.
	*/
	public final static String CIM_PROPERTY_TARGETOPERATINGSYSTEM = "TargetOperatingSystem"; //$NON-NLS-1$
	/**
	*	The version of the SoftwareElement being acted upon.
	*/
	public final static String CIM_PROPERTY_VERSION = "Version"; //$NON-NLS-1$
	
	
	/**
	*	The Invoke method takes this Action. The details of how the Action is implemented are described by specific subclasses of CIM_Action. When the SoftwareElement being transitioned or eliminated is already installed, the CIM_InstalledSoftwareElement association identifies the CIM_ComputerSystem in whose context the Invoke is executed. If this association is not in place, then the InvokeOnSystem method should be used - since it identifies the TargetSystem as a parameter of the method. 
The results of the Invoke method are based on the return value. A zero is returned if the Action is satisfied. A one is returned if the method is not supported. Any other value indicates the Action is not satisfied.
	*/
	public final static String CIM_METHOD_INVOKE = "Invoke";
	/**
	*	The InvokeOnSystem method takes this Action. The details of how the Action is implemented are described by specific subclasses of CIM_Action. The method's TargetSystem input parameter specifies the ComputerSystem in whose context the method is invoked. 
The results of the InvokeOnSystem method are based on the return value. A zero is returned if the Action is satisfied. A one is returned if the method is not supported. Any other value indicates the Action is not satisfied.
	*/
	public final static String CIM_METHOD_INVOKEONSYSTEM = "InvokeOnSystem";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIONID);
		CIM_PropertyNameList.add(CIM_PROPERTY_DIRECTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SOFTWAREELEMENTID);
		CIM_PropertyNameList.add(CIM_PROPERTY_SOFTWAREELEMENTSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TARGETOPERATINGSYSTEM);
		CIM_PropertyNameList.add(CIM_PROPERTY_VERSION);
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIONID)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DIRECTION)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SOFTWAREELEMENTID)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SOFTWAREELEMENTSTATE)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TARGETOPERATINGSYSTEM)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VERSION)){
				continue;
			}
			
			CIM_Action.CIM_PropertyNameList.add(CIM_ManagedElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIONID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIRECTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SOFTWAREELEMENTID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SOFTWAREELEMENTSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TARGETOPERATINGSYSTEM, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIONID)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DIRECTION)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SOFTWAREELEMENTID)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SOFTWAREELEMENTSTATE)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TARGETOPERATINGSYSTEM)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VERSION)){
				continue;
			}
			
			CIM_Action.CIM_PropertyList.add(CIM_ManagedElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ManagedElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ManagedElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ManagedElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DIRECTION = {"Install","Uninstall"};
	public final static String[] CIM_VALUEMAP_SOFTWAREELEMENTSTATE = {"Deployable","Installable","Executable","Running"};
	public final static String[] CIM_VALUEMAP_TARGETOPERATINGSYSTEM = {"Unknown","Other","MACOS","ATTUNIX","DGUX","DECNT","Tru64 UNIX","OpenVMS","HPUX","AIX","MVS","OS400","OS/2","JavaVM","MSDOS","WIN3x","WIN95","WIN98","WINNT","WINCE","NCR3000","NetWare","OSF","DC/OS","Reliant UNIX","SCO UnixWare","SCO OpenServer","Sequent","IRIX","Solaris","SunOS","U6000","ASERIES","TandemNSK","TandemNT","BS2000","LINUX","Lynx","XENIX","VM","Interactive UNIX","BSDUNIX","FreeBSD","NetBSD","GNU Hurd","OS9","MACH Kernel","Inferno","QNX","EPOC","IxWorks","VxWorks","MiNT","BeOS","HP MPE","NextStep","PalmPilot","Rhapsody","Windows 2000","Dedicated","OS/390","VSE","TPF","Windows (R) Me","Caldera Open UNIX","OpenBSD","Not Applicable","Windows XP","z/OS"};
	
	
	public final static int DIRECTION_INSTALL = 0;
	public final static int DIRECTION_UNINSTALL = 1;
	
	public final static int SOFTWAREELEMENTSTATE_DEPLOYABLE = 0;
	public final static int SOFTWAREELEMENTSTATE_INSTALLABLE = 1;
	public final static int SOFTWAREELEMENTSTATE_EXECUTABLE = 2;
	public final static int SOFTWAREELEMENTSTATE_RUNNING = 3;
	
	public final static int TARGETOPERATINGSYSTEM_UNKNOWN = 0;
	public final static int TARGETOPERATINGSYSTEM_OTHER = 1;
	public final static int TARGETOPERATINGSYSTEM_MACOS = 2;
	public final static int TARGETOPERATINGSYSTEM_ATTUNIX = 3;
	public final static int TARGETOPERATINGSYSTEM_DGUX = 4;
	public final static int TARGETOPERATINGSYSTEM_DECNT = 5;
	public final static int TARGETOPERATINGSYSTEM_TRU64UNIX = 6;
	public final static int TARGETOPERATINGSYSTEM_OPENVMS = 7;
	public final static int TARGETOPERATINGSYSTEM_HPUX = 8;
	public final static int TARGETOPERATINGSYSTEM_AIX = 9;
	public final static int TARGETOPERATINGSYSTEM_MVS = 10;
	public final static int TARGETOPERATINGSYSTEM_OS400 = 11;
	public final static int TARGETOPERATINGSYSTEM_OS_2 = 12;
	public final static int TARGETOPERATINGSYSTEM_JAVAVM = 13;
	public final static int TARGETOPERATINGSYSTEM_MSDOS = 14;
	public final static int TARGETOPERATINGSYSTEM_WIN3X = 15;
	public final static int TARGETOPERATINGSYSTEM_WIN95 = 16;
	public final static int TARGETOPERATINGSYSTEM_WIN98 = 17;
	public final static int TARGETOPERATINGSYSTEM_WINNT = 18;
	public final static int TARGETOPERATINGSYSTEM_WINCE = 19;
	public final static int TARGETOPERATINGSYSTEM_NCR3000 = 20;
	public final static int TARGETOPERATINGSYSTEM_NETWARE = 21;
	public final static int TARGETOPERATINGSYSTEM_OSF = 22;
	public final static int TARGETOPERATINGSYSTEM_DC_OS = 23;
	public final static int TARGETOPERATINGSYSTEM_RELIANTUNIX = 24;
	public final static int TARGETOPERATINGSYSTEM_SCOUNIXWARE = 25;
	public final static int TARGETOPERATINGSYSTEM_SCOOPENSERVER = 26;
	public final static int TARGETOPERATINGSYSTEM_SEQUENT = 27;
	public final static int TARGETOPERATINGSYSTEM_IRIX = 28;
	public final static int TARGETOPERATINGSYSTEM_SOLARIS = 29;
	public final static int TARGETOPERATINGSYSTEM_SUNOS = 30;
	public final static int TARGETOPERATINGSYSTEM_U6000 = 31;
	public final static int TARGETOPERATINGSYSTEM_ASERIES = 32;
	public final static int TARGETOPERATINGSYSTEM_TANDEMNSK = 33;
	public final static int TARGETOPERATINGSYSTEM_TANDEMNT = 34;
	public final static int TARGETOPERATINGSYSTEM_BS2000 = 35;
	public final static int TARGETOPERATINGSYSTEM_LINUX = 36;
	public final static int TARGETOPERATINGSYSTEM_LYNX = 37;
	public final static int TARGETOPERATINGSYSTEM_XENIX = 38;
	public final static int TARGETOPERATINGSYSTEM_VM = 39;
	public final static int TARGETOPERATINGSYSTEM_INTERACTIVEUNIX = 40;
	public final static int TARGETOPERATINGSYSTEM_BSDUNIX = 41;
	public final static int TARGETOPERATINGSYSTEM_FREEBSD = 42;
	public final static int TARGETOPERATINGSYSTEM_NETBSD = 43;
	public final static int TARGETOPERATINGSYSTEM_GNUHURD = 44;
	public final static int TARGETOPERATINGSYSTEM_OS9 = 45;
	public final static int TARGETOPERATINGSYSTEM_MACHKERNEL = 46;
	public final static int TARGETOPERATINGSYSTEM_INFERNO = 47;
	public final static int TARGETOPERATINGSYSTEM_QNX = 48;
	public final static int TARGETOPERATINGSYSTEM_EPOC = 49;
	public final static int TARGETOPERATINGSYSTEM_IXWORKS = 50;
	public final static int TARGETOPERATINGSYSTEM_VXWORKS = 51;
	public final static int TARGETOPERATINGSYSTEM_MINT = 52;
	public final static int TARGETOPERATINGSYSTEM_BEOS = 53;
	public final static int TARGETOPERATINGSYSTEM_HPMPE = 54;
	public final static int TARGETOPERATINGSYSTEM_NEXTSTEP = 55;
	public final static int TARGETOPERATINGSYSTEM_PALMPILOT = 56;
	public final static int TARGETOPERATINGSYSTEM_RHAPSODY = 57;
	public final static int TARGETOPERATINGSYSTEM_WINDOWS2000 = 58;
	public final static int TARGETOPERATINGSYSTEM_DEDICATED = 59;
	public final static int TARGETOPERATINGSYSTEM_OS_390 = 60;
	public final static int TARGETOPERATINGSYSTEM_VSE = 61;
	public final static int TARGETOPERATINGSYSTEM_TPF = 62;
	public final static int TARGETOPERATINGSYSTEM_WINDOWSRME = 63;
	public final static int TARGETOPERATINGSYSTEM_CALDERAOPENUNIX = 64;
	public final static int TARGETOPERATINGSYSTEM_OPENBSD = 65;
	public final static int TARGETOPERATINGSYSTEM_NOTAPPLICABLE = 66;
	public final static int TARGETOPERATINGSYSTEM_WINDOWSXP = 67;
	public final static int TARGETOPERATINGSYSTEM_Z_OS = 68;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Action() {

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
	public CIM_Action(Vector keyProperties){ 
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
	public CIM_Action(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_ActionID = this.cimInstance.getProperty(CIM_PROPERTY_ACTIONID);
		
		if (CIMProperty_ActionID == null || CIMProperty_ActionID.getValue().isEmpty() || CIMProperty_ActionID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ACTIONID, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SoftwareElementID = this.cimInstance.getProperty(CIM_PROPERTY_SOFTWAREELEMENTID);
		
		if (CIMProperty_SoftwareElementID == null || CIMProperty_SoftwareElementID.getValue().isEmpty() || CIMProperty_SoftwareElementID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SOFTWAREELEMENTID, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SoftwareElementState = this.cimInstance.getProperty(CIM_PROPERTY_SOFTWAREELEMENTSTATE);
		
		if (CIMProperty_SoftwareElementState == null || CIMProperty_SoftwareElementState.getValue().isEmpty() || CIMProperty_SoftwareElementState.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SOFTWAREELEMENTSTATE, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_TargetOperatingSystem = this.cimInstance.getProperty(CIM_PROPERTY_TARGETOPERATINGSYSTEM);
		
		if (CIMProperty_TargetOperatingSystem == null || CIMProperty_TargetOperatingSystem.getValue().isEmpty() || CIMProperty_TargetOperatingSystem.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_TARGETOPERATINGSYSTEM, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Version = this.cimInstance.getProperty(CIM_PROPERTY_VERSION);
		
		if (CIMProperty_Version == null || CIMProperty_Version.getValue().isEmpty() || CIMProperty_Version.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_VERSION, "Key"});
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
	    
	    if (!(object instanceof CIM_Action)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Action)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Action)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Action)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Action)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Action)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Action)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Action)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Action)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Action)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_Action_CIM_ActionSequences(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ACTIONSEQUENCE, 
					CIM_Action.CIM_CLASS_NAME, 
					"Next",
					"Prior",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Action.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Action.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Action.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Action.Java_Package_List.setElementAt((String)(CIM_Action.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Action.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Action(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Action(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Action(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Action_CIM_ActionSequence_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ACTIONSEQUENCE, 
					CIM_Action.CIM_CLASS_NAME, 
					"Next",
					"Prior");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Action.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_SoftwareElement_CIM_SoftwareElementActionss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTACTIONS, 
					CIM_SoftwareElement.CIM_CLASS_NAME, 
					"Action",
					"Element",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Action.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Action.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Action.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Action.Java_Package_List.setElementAt((String)(CIM_Action.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Action.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SoftwareElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_SoftwareElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SoftwareElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_SoftwareElement_CIM_SoftwareElementActions_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTACTIONS, 
					CIM_SoftwareElement.CIM_CLASS_NAME, 
					"Action",
					"Element");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SoftwareElement.CIM_CLASS_NAME)) {
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
	
	// Attribute ActionID
	
	public String get_ActionID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_ACTIONID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_ACTIONID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_ACTIONID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ActionID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_ACTIONID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Action.CIM_PROPERTY_ACTIONID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_ACTIONID + " could not be found");
    		
		} else if (!CIM_ActionHelper.isValid_ActionID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Action.CIM_PROPERTY_ACTIONID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_ACTIONID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Direction
	
	public UnsignedInt16 get_Direction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_DIRECTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_DIRECTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_DIRECTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Direction(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_DIRECTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_DIRECTION + " could not be found");
    		
		} else if (!CIM_ActionHelper.isValid_Direction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Action.CIM_PROPERTY_DIRECTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_DIRECTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Action.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_ActionHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Action.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SoftwareElementID
	
	public String get_SoftwareElementID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SoftwareElementID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTID + " could not be found");
    		
		} else if (!CIM_ActionHelper.isValid_SoftwareElementID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SoftwareElementState
	
	public UnsignedInt16 get_SoftwareElementState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SoftwareElementState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTSTATE);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTSTATE + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTSTATE + " could not be found");
    		
		} else if (!CIM_ActionHelper.isValid_SoftwareElementState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_SOFTWAREELEMENTSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TargetOperatingSystem
	
	public UnsignedInt16 get_TargetOperatingSystem() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_TARGETOPERATINGSYSTEM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_TARGETOPERATINGSYSTEM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_TARGETOPERATINGSYSTEM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TargetOperatingSystem(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_TARGETOPERATINGSYSTEM);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Action.CIM_PROPERTY_TARGETOPERATINGSYSTEM + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_TARGETOPERATINGSYSTEM + " could not be found");
    		
		} else if (!CIM_ActionHelper.isValid_TargetOperatingSystem(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Action.CIM_PROPERTY_TARGETOPERATINGSYSTEM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_TARGETOPERATINGSYSTEM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Version
	
	public String get_Version() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_VERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_VERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_VERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Version(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Action.CIM_PROPERTY_VERSION);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Action.CIM_PROPERTY_VERSION + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Action.CIM_PROPERTY_VERSION + " could not be found");
    		
		} else if (!CIM_ActionHelper.isValid_Version(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Action.CIM_PROPERTY_VERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Action.CIM_PROPERTY_VERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_invoke(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Action.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	
	  	
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_INVOKE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Action.CIM_METHOD_INVOKE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Action.CIM_METHOD_INVOKE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Action.CIM_METHOD_INVOKE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_invokeOnSystem(CIMClient cimClient, CIM_ComputerSystem TargetSystem) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Action.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_TargetSystem = new CIMValue(TargetSystem.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("TargetSystem", cimValue_TargetSystem));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_INVOKEONSYSTEM,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Action.CIM_METHOD_INVOKEONSYSTEM + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Action.CIM_METHOD_INVOKEONSYSTEM + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Action.CIM_METHOD_INVOKEONSYSTEM + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
