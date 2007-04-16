/** 
 * CIM_ApplicationSystem.java
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
 * Description:  The ApplicationSystem class represents an application or a software system that
 * supports a particular business function and that can be managed as an
 * independent unit. Such a system can be decomposed into its functional
 * components using the CIM_SoftwareFeature class. The Features for a particular
 * application or software system are located using the
 * CIM_ApplicationSystemSoftwareFeature association. The features are part of
 * the deployment-oriented aspects of the application system. With regard to the
 * application runtime aspects, the ApplicationSystem class also represents the
 * core class of the Application Systems' sub-model which of the application
 * runtime model. Its role in the systems sub-model is a) the root node of the
 * containment hierarchy of the application elements (at runtime) as services,
 * components, sub-systems, etc., b) the place for runtime overview information
 * such as response time or system status, c) runtime control of the entire
 * application (e.g., start/stop), and d) the main entry point to the navigation
 * through and drill-down into the runtime model. The lifetime of an instance of
 * this class is not limited to the application instance it represents. Even if
 * the application is not running, the ApplicationSystem object can report
 * properties that have values (e.g., the name of the application or the current
 * status). Note that it is also possible to define the lifetime of the objects
 * through the lifetime of the application instances. Through
 * ApplicationSystemDependency, non-containment relationships can be expressed.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMDateTime;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMSimpleDateTime;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  The ApplicationSystem class represents an application or a software system that
 * supports a particular business function and that can be managed as an
 * independent unit. Such a system can be decomposed into its functional
 * components using the CIM_SoftwareFeature class. The Features for a particular
 * application or software system are located using the
 * CIM_ApplicationSystemSoftwareFeature association. The features are part of
 * the deployment-oriented aspects of the application system. With regard to the
 * application runtime aspects, the ApplicationSystem class also represents the
 * core class of the Application Systems' sub-model which of the application
 * runtime model. Its role in the systems sub-model is a) the root node of the
 * containment hierarchy of the application elements (at runtime) as services,
 * components, sub-systems, etc., b) the place for runtime overview information
 * such as response time or system status, c) runtime control of the entire
 * application (e.g., start/stop), and d) the main entry point to the navigation
 * through and drill-down into the runtime model. The lifetime of an instance of
 * this class is not limited to the application instance it represents. Even if
 * the application is not running, the ApplicationSystem object can report
 * properties that have values (e.g., the name of the application or the current
 * status). Note that it is also possible to define the lifetime of the objects
 * through the lifetime of the application instances. Through
 * ApplicationSystemDependency, non-containment relationships can be expressed.
 */
public class CIM_ApplicationSystem extends CIM_System  {
	
	public final static String CIM_CLASS_NAME = "CIM_ApplicationSystem"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDEPENDENCY = "CIM_ApplicationSystemDependency"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY = "CIM_ApplicationSystemDirectory"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMHIERARCHY = "CIM_ApplicationSystemHierarchy"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE = "CIM_ApplicationSystemSoftwareFeature"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDAPPSYSTEMOVERVIEWSTATISTICS = "CIM_AssociatedAppSystemOverviewStatistics"; //$NON-NLS-1$
	
	
	/**
	*	Distribution describes how the application system is distributed with respect to its underlying servers. In general, the application system is distributed or local. This property indicates whether the application system is running on one or multiple servers. This can be determined without having to query for associated servers represented by ComputerSystems. Distributed systems also introduce a virtual notion to themselves. Note that a distributed application system is not tangible but virtual. Only its contained local systems can be found as processes or threads, and can therefore be regarded as tangible. The distributed system remains a named, virtual entity, that scopes strongly bound constituents and allows the application to be managed in its entirety. 
The property is needed to help root cause analysis and operations, especially when these are automated, in order to clearly know that more than one executed application - most likely the local application systems - is affected by the management task. This is particularly true if the contained application systems provide uniform functionality like webserver or application server farms. 
To express constraints between distributed and local system, this class must be derived and appropriate associations must be defined. 
This property should not be confused with the Roles[] property defined in System. The latter is reserved for administrator assigned roles.
	*/
	public final static String CIM_PROPERTY_DISTRIBUTION = "Distribution"; //$NON-NLS-1$
	/**
	*	EnabledState is an integer enumeration that indicates the enabled/disabled states of an element. It can also indicate the transitions between these requested states. For example, shutting down and starting are transient states between enabled and disabled. 
In contrast to the original version defined higher in the inheritance hierarchy (EnabledLogicalElement), EnabledState is simplified. It reflects the notion of an execution status tailored to applications and represents a summary of the original property. It allows simplified and efficient determination of whether the application is started, stopped or in transition between either of these states. The property does not show any errors. Errors MUST be described in MSE.OperationalStatus, and MAY also be described in logs or other data sources. 
The mapping to MSE.OperationalStatus is as follows: 
ExecutionStatus <- MSE.OperationalStatus 
Unknown <- Unknown, No Contact, Lost Communication, 
Either of the values <- Other 
Enabled (started) <- OK, Degraded, Stressed, Predictive Failure, In Service, Dormant, Supporting Entity in Error, Completed 
Enabled or Disabled (Started or Stopped) <- Error, Non-Recoverable Error 
Starting <- Starting 
Shutting Down (Stopping) <- Stopping 
Disabled (Stopped) <- Stopped, Aborted. 
The mapping to the original EnabledState property is as follows: 
Unknown <- Unknown, Not Applicable 
Either of the values <-Other 
Enabled <- Enabled, Enabled but Offline, In Test, Deferred, Quiesce 
Disabled <- Disabled 
ShuttingDown <- ShuttingDown 
Starting <- Starting.
	*/
	public final static String CIM_PROPERTY_ENABLEDSTATE = "EnabledState"; //$NON-NLS-1$
	/**
	*	The point in time at which the ServingStatus property was last updated.
	*/
	public final static String CIM_PROPERTY_LASTSERVINGSTATUSUPDATE = "LastServingStatusUpdate"; //$NON-NLS-1$
	/**
	*	ServingStatus is a summary of MSE.OperationalStatus. It allows simplified and efficient determination of whether the application is providing service or has stopped doing so for various reasons like errors, shutdown, abort, etc. Therefore, no transitional values are provided. The property does not show any errors. Errors MUST be described in MSE.OperationalStatus, and MAY also be described in logs or other data sources. Therefore, ServingStatus is suited to provide summary information for monitoring purposes and service level management. 
The mapping to MSE.OperationalStatus is as follows: 
ServingStatus <- MSE.OperationalStatus 
Unknown <- Unknown, No Contact, Lost Communication 
Either of the values <- Other 
Serving <- OK, Degraded, Stressed, Predictive Failure, Completed 
Not Serving <- Error, Non-Recoverable Error, Starting, Stopping, Stopped, In Service, Aborted, Dormant, Supporting Entity in Error.
	*/
	public final static String CIM_PROPERTY_SERVINGSTATUS = "ServingStatus"; //$NON-NLS-1$
	/**
	*	The point in time (date and time) when the application system was last started. If the application system is in a state other the state Enabled (i.e., started and running) this value is not meaningful and the property value MUST be set to all zeros. 
StartupTime is preferably the point in time when the application is available to the user. Instead, if the provider and/or the instrumentation cannot determine the point in time the application becomes available, the point in time can be used at which the underlying operating system reports successful launch of the application. If no value can be provided the property value MUST be set to all zeros.
	*/
	public final static String CIM_PROPERTY_STARTUPTIME = "StartupTime"; //$NON-NLS-1$
	
	
	/**
	*	StartApplication() starts an application system. The ApplicationSystem object must have been created prior to the invocation of this method. It is up to the implementation of the method to define which of the contained or dependent sub-elements are to be started and in which order their startup may occur. 
Since a system startup can extend over long periods of time (several minutes is not unusual for complex distributed applications), the method can be implemented synchronously or asynchronously. In both cases EnabledState and RequestedState reflect the current state of the application and the desired state (Enabled) respectively. The exact nature of the errors during the startup cannot be determined in the asynchronous case. The method must return one of the following values: 
Unspecified Error: If no return code can be identified 
Completed with No Error: successful invocation 
Start Already in Progress: application still being started 
Failed:Indicates errors upon execution.
	*/
	public final static String CIM_METHOD_STARTAPPLICATION = "StartApplication";
	/**
	*	StopApplication() allows for stopping/shutting down an application system. It is up to the implementation of the method to define which of the contained or dependent sub-elements are to be stopped and in which order their stop has to occur. 
Since a system shutdown can last considerable time (several minutes is not necessarily unusual for complex distributed applications), the method can be implemented synchronously or asynchronously. In both cases EnabledState and RequestedState reflect the current state of the application and the desired state (Disabled) respectively. The exact nature of the errors during the stop cannot be determined in the asynchronous case. The method must return one of the following: 
Unspecified Error: If no return code can be identified 
Completed with No Error: successful invocation 
Stop Already in Process: application is shutting down 
Failed: Indicates errors upon execution.
	*/
	public final static String CIM_METHOD_STOPAPPLICATION = "StopApplication";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DISTRIBUTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEDSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTSERVINGSTATUSUPDATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERVINGSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_STARTUPTIME);
				
		for (int i = 0; i < CIM_System.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_System.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DISTRIBUTION)||
				((String)CIM_System.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEDSTATE)||
				((String)CIM_System.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTSERVINGSTATUSUPDATE)||
				((String)CIM_System.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERVINGSTATUS)||
				((String)CIM_System.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STARTUPTIME)){
				continue;
			}
			
			CIM_ApplicationSystem.CIM_PropertyNameList.add(CIM_System.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DISTRIBUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEDSTATE, new CIMValue(new UnsignedInt16("0"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTSERVINGSTATUSUPDATE, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERVINGSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STARTUPTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_System.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_System.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DISTRIBUTION)||
				((CIMProperty)CIM_System.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEDSTATE)||
				((CIMProperty)CIM_System.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTSERVINGSTATUSUPDATE)||
				((CIMProperty)CIM_System.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERVINGSTATUS)||
				((CIMProperty)CIM_System.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STARTUPTIME)){
				continue;
			}
			
			CIM_ApplicationSystem.CIM_PropertyList.add(CIM_System.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_System.Java_Package_List.size(); i++) {
			if (((String)CIM_System.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_System.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DISTRIBUTION = {"Unknown","Distributed","Local","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_ENABLEDSTATE = {"Unknown","Enabled","Disabled","Shutting Down","Starting","DMTF Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_SERVINGSTATUS = {"Unknown","Serving","Not Serving","DMTF Reserved","Vendor Specific"};
	
	
	public final static String DISTRIBUTION_UNKNOWN = "0";
	public final static String DISTRIBUTION_DISTRIBUTED = "1";
	public final static String DISTRIBUTION_LOCAL = "2";
	public final static String DISTRIBUTION_DMTFRESERVED = "3..32767";
	public final static String DISTRIBUTION_VENDORSPECIFIC = "32768..65535";
	
	public final static String ENABLEDSTATE_UNKNOWN = "0";
	public final static String ENABLEDSTATE_ENABLED = "2";
	public final static String ENABLEDSTATE_DISABLED = "3";
	public final static String ENABLEDSTATE_SHUTTINGDOWN = "4";
	public final static String ENABLEDSTATE_STARTING = "10";
	public final static String ENABLEDSTATE_DMTFRESERVED = "11..32767";
	public final static String ENABLEDSTATE_VENDORRESERVED = "32768..65535";
	
	public final static String SERVINGSTATUS_UNKNOWN = "0";
	public final static String SERVINGSTATUS_SERVING = "1";
	public final static String SERVINGSTATUS_NOTSERVING = "2";
	public final static String SERVINGSTATUS_DMTFRESERVED = "5..4096";
	public final static String SERVINGSTATUS_VENDORSPECIFIC = "4097..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ApplicationSystem() {

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
	public CIM_ApplicationSystem(Vector keyProperties){ 
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
	public CIM_ApplicationSystem(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ApplicationSystem)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ApplicationSystem)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ApplicationSystem)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ApplicationSystem)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ApplicationSystem)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ApplicationSystem)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ApplicationSystem)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ApplicationSystem)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ApplicationSystem)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ApplicationSystem)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ApplicationSystem_CIM_ApplicationSystemDependencys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDEPENDENCY, 
					CIM_ApplicationSystem.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_ApplicationSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_ApplicationSystem.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_ApplicationSystem.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_ApplicationSystem.Java_Package_List.setElementAt((String)(CIM_ApplicationSystem.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_ApplicationSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ApplicationSystem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ApplicationSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ApplicationSystem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ApplicationSystem_CIM_ApplicationSystemDependency_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDEPENDENCY, 
					CIM_ApplicationSystem.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ApplicationSystem.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_Directory_CIM_ApplicationSystemDirectorys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY, 
					CIM_Directory.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_ApplicationSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_ApplicationSystem.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_ApplicationSystem.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_ApplicationSystem.Java_Package_List.setElementAt((String)(CIM_ApplicationSystem.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_ApplicationSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Directory(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Directory(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Directory(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Directory_CIM_ApplicationSystemDirectory_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY, 
					CIM_Directory.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Directory.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_ApplicationSystem_CIM_ApplicationSystemHierarchys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMHIERARCHY, 
					CIM_ApplicationSystem.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_ApplicationSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_ApplicationSystem.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_ApplicationSystem.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_ApplicationSystem.Java_Package_List.setElementAt((String)(CIM_ApplicationSystem.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_ApplicationSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ApplicationSystem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ApplicationSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ApplicationSystem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ApplicationSystem_CIM_ApplicationSystemHierarchy_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMHIERARCHY, 
					CIM_ApplicationSystem.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ApplicationSystem.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_SoftwareFeature_CIM_ApplicationSystemSoftwareFeatures(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE, 
					CIM_SoftwareFeature.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_ApplicationSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_ApplicationSystem.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_ApplicationSystem.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_ApplicationSystem.Java_Package_List.setElementAt((String)(CIM_ApplicationSystem.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_ApplicationSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SoftwareFeature(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_SoftwareFeature(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SoftwareFeature(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_SoftwareFeature_CIM_ApplicationSystemSoftwareFeature_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE, 
					CIM_SoftwareFeature.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SoftwareFeature.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_StatisticalRuntimeOverview_CIM_AssociatedAppSystemOverviewStatisticss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDAPPSYSTEMOVERVIEWSTATISTICS, 
					CIM_StatisticalRuntimeOverview.CIM_CLASS_NAME, 
					"ManagedElement", //$NON-NLS-1$
					"Stats", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_ApplicationSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_ApplicationSystem.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_ApplicationSystem.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_ApplicationSystem.Java_Package_List.setElementAt((String)(CIM_ApplicationSystem.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_ApplicationSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StatisticalRuntimeOverview(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_StatisticalRuntimeOverview(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StatisticalRuntimeOverview(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_StatisticalRuntimeOverview_CIM_AssociatedAppSystemOverviewStatistics_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDAPPSYSTEMOVERVIEWSTATISTICS, 
					CIM_StatisticalRuntimeOverview.CIM_CLASS_NAME, 
					"ManagedElement", //$NON-NLS-1$
					"Stats"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_StatisticalRuntimeOverview.CIM_CLASS_NAME)) {
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
	
	// Attribute Distribution
	
	public UnsignedInt16 get_Distribution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystem.CIM_PROPERTY_DISTRIBUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_DISTRIBUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_DISTRIBUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Distribution(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystem.CIM_PROPERTY_DISTRIBUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_DISTRIBUTION + " could not be found");
    		
		} else if (!CIM_ApplicationSystemHelper.isValid_Distribution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ApplicationSystem.CIM_PROPERTY_DISTRIBUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_DISTRIBUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EnabledState
	
	public UnsignedInt16 get_EnabledState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystem.CIM_PROPERTY_ENABLEDSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_ENABLEDSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_ENABLEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EnabledState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystem.CIM_PROPERTY_ENABLEDSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_ENABLEDSTATE + " could not be found");
    		
		} else if (!CIM_ApplicationSystemHelper.isValid_EnabledState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ApplicationSystem.CIM_PROPERTY_ENABLEDSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_ENABLEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastServingStatusUpdate
	
	public Calendar get_LastServingStatusUpdate() {

		CIMProperty property = this.cimInstance.getProperty(CIM_ApplicationSystem.CIM_PROPERTY_LASTSERVINGSTATUSUPDATE);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_LASTSERVINGSTATUSUPDATE + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_LASTSERVINGSTATUSUPDATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_LastServingStatusUpdate(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystem.CIM_PROPERTY_LASTSERVINGSTATUSUPDATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_LASTSERVINGSTATUSUPDATE + " could not be found");
    		
		} else if (!CIM_ApplicationSystemHelper.isValid_LastServingStatusUpdate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ApplicationSystem.CIM_PROPERTY_LASTSERVINGSTATUSUPDATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_LASTSERVINGSTATUSUPDATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute ServingStatus
	
	public UnsignedInt16 get_ServingStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystem.CIM_PROPERTY_SERVINGSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_SERVINGSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_SERVINGSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ServingStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystem.CIM_PROPERTY_SERVINGSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_SERVINGSTATUS + " could not be found");
    		
		} else if (!CIM_ApplicationSystemHelper.isValid_ServingStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ApplicationSystem.CIM_PROPERTY_SERVINGSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_SERVINGSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StartupTime
	
	public Calendar get_StartupTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_ApplicationSystem.CIM_PROPERTY_STARTUPTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_STARTUPTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_STARTUPTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_StartupTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystem.CIM_PROPERTY_STARTUPTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_STARTUPTIME + " could not be found");
    		
		} else if (!CIM_ApplicationSystemHelper.isValid_StartupTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ApplicationSystem.CIM_PROPERTY_STARTUPTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystem.CIM_PROPERTY_STARTUPTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt16 invoke_startApplication(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ApplicationSystem.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	
	  	
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_STARTAPPLICATION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ApplicationSystem.CIM_METHOD_STARTAPPLICATION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ApplicationSystem.CIM_METHOD_STARTAPPLICATION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ApplicationSystem.CIM_METHOD_STARTAPPLICATION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");		
		}

		return (UnsignedInt16)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt16 invoke_stopApplication(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ApplicationSystem.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	
	  	
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_STOPAPPLICATION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ApplicationSystem.CIM_METHOD_STOPAPPLICATION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ApplicationSystem.CIM_METHOD_STOPAPPLICATION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ApplicationSystem.CIM_METHOD_STOPAPPLICATION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");		
		}

		return (UnsignedInt16)returnValue.getValue(); 		  	
	  }

	

}
