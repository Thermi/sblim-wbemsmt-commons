/** 
 * CIM_Watchdog.java
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
 * Description: CIM_Watchdog is a timer implemented in system hardware. It allows the hardware to monitor the state of the Operating System, BIOS or a software component installed on the System. If the monitored component fails to re-arm the timer before its expiration, the hardware assumes that the System is in a critical state, and could reset the ComputerSystem. This feature can also be used as an application watchdog timer for a mission-critical application. In this case, the application would assume responsibility for re-arming the timer before expiration.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import org.sblim.wbem.client.*;



public class CIM_Watchdog extends CIM_LogicalDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_Watchdog";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The action that should happen upon the expiry of the watchdog.
	*/
	public final static String CIM_PROPERTY_ACTIONONEXPIRATION = "ActionOnExpiration"; //$NON-NLS-1$
	/**
	*	The entity that is currently being monitored by the WatchDog. This property is used to identify the module that is responsible for or whose information is used to re-arm the watchdog at periodic intervals.
	*/
	public final static String CIM_PROPERTY_MONITOREDENTITY = "MonitoredEntity"; //$NON-NLS-1$
	/**
	*	A string describing more textual information about the monitored entity.
	*/
	public final static String CIM_PROPERTY_MONITOREDENTITYDESCRIPTION = "MonitoredEntityDescription"; //$NON-NLS-1$
	/**
	*	Monitored entity at the time of last timer expiry.
	*/
	public final static String CIM_PROPERTY_MONITOREDENTITYONLASTEXPIRATION = "MonitoredEntityOnLastExpiration"; //$NON-NLS-1$
	/**
	*	The time of the last timer expiry.
	*/
	public final static String CIM_PROPERTY_TIMEOFLASTEXPIRATION = "TimeOfLastExpiration"; //$NON-NLS-1$
	/**
	*	The timeout interval used by the watchdog, in MicroSeconds.
	*/
	public final static String CIM_PROPERTY_TIMEOUTINTERVAL = "TimeoutInterval"; //$NON-NLS-1$
	/**
	*	Resolution of the timer. For example, if this value is 100, then the timer can expire anytime between (TimeoutInterval- 100) microseconds or (TimeoutInterval+100) microseconds.
	*/
	public final static String CIM_PROPERTY_TIMERRESOLUTION = "TimerResolution"; //$NON-NLS-1$
	
	
	/**
	*	A method to re-arm the timer. This method is only used if the MonitoredEntity is "Application". It returns 0 if successful, 1 if unsupported, and any other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_KEEPALIVE = "KeepAlive";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIONONEXPIRATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_MONITOREDENTITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_MONITOREDENTITYDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_MONITOREDENTITYONLASTEXPIRATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFLASTEXPIRATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOUTINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMERRESOLUTION);
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIONONEXPIRATION)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MONITOREDENTITY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MONITOREDENTITYDESCRIPTION)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MONITOREDENTITYONLASTEXPIRATION)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFLASTEXPIRATION)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOUTINTERVAL)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMERRESOLUTION)){
				continue;
			}
			
			CIM_Watchdog.CIM_PropertyNameList.add(CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIONONEXPIRATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MONITOREDENTITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MONITOREDENTITYDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MONITOREDENTITYONLASTEXPIRATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFLASTEXPIRATION, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOUTINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMERRESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIONONEXPIRATION)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MONITOREDENTITY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MONITOREDENTITYDESCRIPTION)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MONITOREDENTITYONLASTEXPIRATION)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFLASTEXPIRATION)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOUTINTERVAL)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMERRESOLUTION)){
				continue;
			}
			
			CIM_Watchdog.CIM_PropertyList.add(CIM_LogicalDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ACTIONONEXPIRATION = {"None - Status Only","System Reset","System Power Off","System Power Off, then On","Generate System NonMaskableInterrupt (NMI)","Generate System Management Interrupt (SMI)"};
	public final static String[] CIM_VALUEMAP_MONITOREDENTITY = {"Unknown","Other","Operating System","Operating System Boot Process","Operating System Shutdown Process","Firmware Boot Process","BIOS Boot Process","Application","Service Processor"};
	public final static String[] CIM_VALUEMAP_MONITOREDENTITYONLASTEXPIRATION = {"Unknown","Other","Operating System","Operating System Boot Process","Operating System Shutdown Process","Firmware Boot Process","BIOS Boot Process","Application","Service Processor"};
	
	
	public final static int ACTIONONEXPIRATION_NONE_STATUSONLY = 0;
	public final static int ACTIONONEXPIRATION_SYSTEMRESET = 1;
	public final static int ACTIONONEXPIRATION_SYSTEMPOWEROFF = 2;
	public final static int ACTIONONEXPIRATION_SYSTEMPOWEROFF_THENON = 3;
	public final static int ACTIONONEXPIRATION_GENERATESYSTEMNONMASKABLEINTERRUPTNMI = 4;
	public final static int ACTIONONEXPIRATION_GENERATESYSTEMMANAGEMENTINTERRUPTSMI = 5;
	
	public final static int MONITOREDENTITY_UNKNOWN = 0;
	public final static int MONITOREDENTITY_OTHER = 1;
	public final static int MONITOREDENTITY_OPERATINGSYSTEM = 2;
	public final static int MONITOREDENTITY_OPERATINGSYSTEMBOOTPROCESS = 3;
	public final static int MONITOREDENTITY_OPERATINGSYSTEMSHUTDOWNPROCESS = 4;
	public final static int MONITOREDENTITY_FIRMWAREBOOTPROCESS = 5;
	public final static int MONITOREDENTITY_BIOSBOOTPROCESS = 6;
	public final static int MONITOREDENTITY_APPLICATION = 7;
	public final static int MONITOREDENTITY_SERVICEPROCESSOR = 8;
	
	public final static int MONITOREDENTITYONLASTEXPIRATION_UNKNOWN = 0;
	public final static int MONITOREDENTITYONLASTEXPIRATION_OTHER = 1;
	public final static int MONITOREDENTITYONLASTEXPIRATION_OPERATINGSYSTEM = 2;
	public final static int MONITOREDENTITYONLASTEXPIRATION_OPERATINGSYSTEMBOOTPROCESS = 3;
	public final static int MONITOREDENTITYONLASTEXPIRATION_OPERATINGSYSTEMSHUTDOWNPROCESS = 4;
	public final static int MONITOREDENTITYONLASTEXPIRATION_FIRMWAREBOOTPROCESS = 5;
	public final static int MONITOREDENTITYONLASTEXPIRATION_BIOSBOOTPROCESS = 6;
	public final static int MONITOREDENTITYONLASTEXPIRATION_APPLICATION = 7;
	public final static int MONITOREDENTITYONLASTEXPIRATION_SERVICEPROCESSOR = 8;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Watchdog() {

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
	public CIM_Watchdog(Vector keyProperties){ 
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
	public CIM_Watchdog(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Watchdog)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Watchdog)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Watchdog)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Watchdog)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Watchdog)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Watchdog)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Watchdog)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Watchdog)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Watchdog)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Watchdog)object).cimObjectPath)) {
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
	
	// Attribute ActionOnExpiration
	
	public UnsignedInt16 get_ActionOnExpiration() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_ACTIONONEXPIRATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_ACTIONONEXPIRATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_ACTIONONEXPIRATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ActionOnExpiration(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_ACTIONONEXPIRATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_ACTIONONEXPIRATION + " could not be found");
    		
		} else if (!CIM_WatchdogHelper.isValid_ActionOnExpiration(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Watchdog.CIM_PROPERTY_ACTIONONEXPIRATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_ACTIONONEXPIRATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MonitoredEntity
	
	public UnsignedInt16 get_MonitoredEntity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MonitoredEntity(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITY + " could not be found");
    		
		} else if (!CIM_WatchdogHelper.isValid_MonitoredEntity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MonitoredEntityDescription
	
	public String get_MonitoredEntityDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MonitoredEntityDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYDESCRIPTION + " could not be found");
    		
		} else if (!CIM_WatchdogHelper.isValid_MonitoredEntityDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MonitoredEntityOnLastExpiration
	
	public UnsignedInt16 get_MonitoredEntityOnLastExpiration() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYONLASTEXPIRATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYONLASTEXPIRATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYONLASTEXPIRATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MonitoredEntityOnLastExpiration(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYONLASTEXPIRATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYONLASTEXPIRATION + " could not be found");
    		
		} else if (!CIM_WatchdogHelper.isValid_MonitoredEntityOnLastExpiration(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYONLASTEXPIRATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_MONITOREDENTITYONLASTEXPIRATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfLastExpiration
	
	public Calendar get_TimeOfLastExpiration() {

		CIMProperty property = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_TIMEOFLASTEXPIRATION);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_TIMEOFLASTEXPIRATION + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_TIMEOFLASTEXPIRATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfLastExpiration(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_TIMEOFLASTEXPIRATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_TIMEOFLASTEXPIRATION + " could not be found");
    		
		} else if (!CIM_WatchdogHelper.isValid_TimeOfLastExpiration(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Watchdog.CIM_PROPERTY_TIMEOFLASTEXPIRATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_TIMEOFLASTEXPIRATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute TimeoutInterval
	
	public UnsignedInt32 get_TimeoutInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_TIMEOUTINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_TIMEOUTINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_TIMEOUTINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TimeoutInterval(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_TIMEOUTINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_TIMEOUTINTERVAL + " could not be found");
    		
		} else if (!CIM_WatchdogHelper.isValid_TimeoutInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Watchdog.CIM_PROPERTY_TIMEOUTINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_TIMEOUTINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimerResolution
	
	public UnsignedInt32 get_TimerResolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_TIMERRESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_TIMERRESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_TIMERRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TimerResolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Watchdog.CIM_PROPERTY_TIMERRESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Watchdog.CIM_PROPERTY_TIMERRESOLUTION + " could not be found");
    		
		} else if (!CIM_WatchdogHelper.isValid_TimerResolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Watchdog.CIM_PROPERTY_TIMERRESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Watchdog.CIM_PROPERTY_TIMERRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_keepAlive(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Watchdog.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	
	  	
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_KEEPALIVE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Watchdog.CIM_METHOD_KEEPALIVE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Watchdog.CIM_METHOD_KEEPALIVE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Watchdog.CIM_METHOD_KEEPALIVE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
