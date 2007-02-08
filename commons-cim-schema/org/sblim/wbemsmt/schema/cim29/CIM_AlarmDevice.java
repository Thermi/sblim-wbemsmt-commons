/** 
 * CIM_AlarmDevice.java
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
 * Description: An AlarmDevice is a type of Device that emits audible or visible indications related to a problem situation.
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



public class CIM_AlarmDevice extends CIM_LogicalDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_AlarmDevice";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDALARM = "CIM_AssociatedAlarm";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEALARM = "CIM_PackageAlarm";
	
	
	/**
	*	The current state of the alarm.
	*/
	public final static String CIM_PROPERTY_ALARMSTATE = "AlarmState"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the Alarm is audible.
	*/
	public final static String CIM_PROPERTY_AUDIBLEALARM = "AudibleAlarm"; //$NON-NLS-1$
	/**
	*	True indicates that the audio of an AlarmState indicator has been disabled (i.e. muted). A disabled state here does not imply that the AlarmState is off.
	*/
	public final static String CIM_PROPERTY_AUDIOINDICATORISDISABLED = "AudioIndicatorIsDisabled"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the Alarm causes motion of the Device.
	*/
	public final static String CIM_PROPERTY_MOTIONALARM = "MotionAlarm"; //$NON-NLS-1$
	/**
	*	True indicates that the motion of an AlarmState indicator has been disabled (i.e. stopped). A disabled state here does not imply that the AlarmState is off.
	*/
	public final static String CIM_PROPERTY_MOTIONINDICATORISDISABLED = "MotionIndicatorIsDisabled"; //$NON-NLS-1$
	/**
	*	Urgency is an enumerated value that indicates the relative frequency at which the Alarm flashes, vibrates and/or emits audible tones.
	*/
	public final static String CIM_PROPERTY_URGENCY = "Urgency"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the Alarm is visible.
	*/
	public final static String CIM_PROPERTY_VISIBLEALARM = "VisibleAlarm"; //$NON-NLS-1$
	/**
	*	True indicates that the visual of an AlarmState indicator has been disabled (i.e. dimmed). A disabled state here does not imply that the AlarmState is off.
	*/
	public final static String CIM_PROPERTY_VISUALINDICATORISDISABLED = "VisualIndicatorIsDisabled"; //$NON-NLS-1$
	
	
	/**
	*	SetAlarmIndicator is a method for enabling or disabling the indicator of the AlarmState function, without changing the current AlarmState. It has 3 input parameters, Audio Indicator, VisualIndicator and MotionIndicator. For all of the input parameters, a value of 0 indicates no change to the AlarmState indicator, 1 indicates Disable, and 2 indicates Enable. The method returns 0 if the request is successfully implemented, 1 if the specified request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes should be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier.
	*/
	public final static String CIM_METHOD_SETALARMINDICATOR = "SetAlarmIndicator";
	/**
	*	SetAlarmState is a method for defining the current state of the Alarm. Its input parameter, RequestedAlarmState, is specified using the Values list of AlarmDevice's AlarmState property. SetAlarmState returns 0 if the request is successfully implemented, 1 if the specified RequestedAlarm State is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes should be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier.
	*/
	public final static String CIM_METHOD_SETALARMSTATE = "SetAlarmState";
	/**
	*	SetUrgency is a method for defining the desired urgency level for the Alarm. Its input parameter, RequestedUrgency, is specified using the Values list of AlarmDevice's Urgency property. SetUrgency returns 0 if the request is successfully implemented, 1 if the specified Urgency level is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes should be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier.
	*/
	public final static String CIM_METHOD_SETURGENCY = "SetUrgency";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ALARMSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_AUDIBLEALARM);
		CIM_PropertyNameList.add(CIM_PROPERTY_AUDIOINDICATORISDISABLED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MOTIONALARM);
		CIM_PropertyNameList.add(CIM_PROPERTY_MOTIONINDICATORISDISABLED);
		CIM_PropertyNameList.add(CIM_PROPERTY_URGENCY);
		CIM_PropertyNameList.add(CIM_PROPERTY_VISIBLEALARM);
		CIM_PropertyNameList.add(CIM_PROPERTY_VISUALINDICATORISDISABLED);
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALARMSTATE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUDIBLEALARM)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUDIOINDICATORISDISABLED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MOTIONALARM)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MOTIONINDICATORISDISABLED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_URGENCY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VISIBLEALARM)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VISUALINDICATORISDISABLED)){
				continue;
			}
			
			CIM_AlarmDevice.CIM_PropertyNameList.add(CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALARMSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUDIBLEALARM, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUDIOINDICATORISDISABLED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MOTIONALARM, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MOTIONINDICATORISDISABLED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_URGENCY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VISIBLEALARM, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VISUALINDICATORISDISABLED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALARMSTATE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUDIBLEALARM)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUDIOINDICATORISDISABLED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MOTIONALARM)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MOTIONINDICATORISDISABLED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_URGENCY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VISIBLEALARM)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VISUALINDICATORISDISABLED)){
				continue;
			}
			
			CIM_AlarmDevice.CIM_PropertyList.add(CIM_LogicalDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ALARMSTATE = {"Unknown","Off","Steady","Alternating"};
	public final static String[] CIM_VALUEMAP_URGENCY = {"Unknown","Other","Not Supported","Informational","Non-Critical","Critical","Unrecoverable"};
	
	
	public final static int ALARMSTATE_UNKNOWN = 0;
	public final static int ALARMSTATE_OFF = 1;
	public final static int ALARMSTATE_STEADY = 2;
	public final static int ALARMSTATE_ALTERNATING = 3;
	
	public final static int URGENCY_UNKNOWN = 0;
	public final static int URGENCY_OTHER = 1;
	public final static int URGENCY_NOTSUPPORTED = 2;
	public final static int URGENCY_INFORMATIONAL = 3;
	public final static int URGENCY_NON_CRITICAL = 4;
	public final static int URGENCY_CRITICAL = 5;
	public final static int URGENCY_UNRECOVERABLE = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AlarmDevice() {

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
	public CIM_AlarmDevice(Vector keyProperties){ 
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
	public CIM_AlarmDevice(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_AlarmDevice)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AlarmDevice)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AlarmDevice)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AlarmDevice)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AlarmDevice)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AlarmDevice)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AlarmDevice)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AlarmDevice)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AlarmDevice)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AlarmDevice)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_LogicalDevice_CIM_AssociatedAlarms(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDALARM, 
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
				
					for (int i = 0; clazz == null && i < CIM_AlarmDevice.Java_Package_List.size(); i++) {
						if (!((String)(CIM_AlarmDevice.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_AlarmDevice.Java_Package_List.get(i))).endsWith(".")) {
							CIM_AlarmDevice.Java_Package_List.setElementAt((String)(CIM_AlarmDevice.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_AlarmDevice.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_LogicalDevice_CIM_AssociatedAlarm_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDALARM, 
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

	public ArrayList getAssociated_CIM_PhysicalPackage_CIM_PackageAlarms(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEALARM, 
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
				
					for (int i = 0; clazz == null && i < CIM_AlarmDevice.Java_Package_List.size(); i++) {
						if (!((String)(CIM_AlarmDevice.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_AlarmDevice.Java_Package_List.get(i))).endsWith(".")) {
							CIM_AlarmDevice.Java_Package_List.setElementAt((String)(CIM_AlarmDevice.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_AlarmDevice.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_PhysicalPackage_CIM_PackageAlarm_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEALARM, 
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

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute AlarmState
	
	public UnsignedInt16 get_AlarmState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_ALARMSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_ALARMSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_ALARMSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AlarmState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_ALARMSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_ALARMSTATE + " could not be found");
    		
		} else if (!CIM_AlarmDeviceHelper.isValid_AlarmState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlarmDevice.CIM_PROPERTY_ALARMSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_ALARMSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AudibleAlarm
	
	public Boolean get_AudibleAlarm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_AUDIBLEALARM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_AUDIBLEALARM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_AUDIBLEALARM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AudibleAlarm(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_AUDIBLEALARM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_AUDIBLEALARM + " could not be found");
    		
		} else if (!CIM_AlarmDeviceHelper.isValid_AudibleAlarm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlarmDevice.CIM_PROPERTY_AUDIBLEALARM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_AUDIBLEALARM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AudioIndicatorIsDisabled
	
	public Boolean get_AudioIndicatorIsDisabled() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_AUDIOINDICATORISDISABLED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_AUDIOINDICATORISDISABLED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_AUDIOINDICATORISDISABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AudioIndicatorIsDisabled(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_AUDIOINDICATORISDISABLED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_AUDIOINDICATORISDISABLED + " could not be found");
    		
		} else if (!CIM_AlarmDeviceHelper.isValid_AudioIndicatorIsDisabled(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlarmDevice.CIM_PROPERTY_AUDIOINDICATORISDISABLED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_AUDIOINDICATORISDISABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MotionAlarm
	
	public Boolean get_MotionAlarm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_MOTIONALARM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_MOTIONALARM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_MOTIONALARM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MotionAlarm(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_MOTIONALARM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_MOTIONALARM + " could not be found");
    		
		} else if (!CIM_AlarmDeviceHelper.isValid_MotionAlarm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlarmDevice.CIM_PROPERTY_MOTIONALARM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_MOTIONALARM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MotionIndicatorIsDisabled
	
	public Boolean get_MotionIndicatorIsDisabled() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_MOTIONINDICATORISDISABLED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_MOTIONINDICATORISDISABLED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_MOTIONINDICATORISDISABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MotionIndicatorIsDisabled(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_MOTIONINDICATORISDISABLED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_MOTIONINDICATORISDISABLED + " could not be found");
    		
		} else if (!CIM_AlarmDeviceHelper.isValid_MotionIndicatorIsDisabled(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlarmDevice.CIM_PROPERTY_MOTIONINDICATORISDISABLED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_MOTIONINDICATORISDISABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Urgency
	
	public UnsignedInt16 get_Urgency() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_URGENCY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_URGENCY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_URGENCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Urgency(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_URGENCY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_URGENCY + " could not be found");
    		
		} else if (!CIM_AlarmDeviceHelper.isValid_Urgency(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlarmDevice.CIM_PROPERTY_URGENCY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_URGENCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VisibleAlarm
	
	public Boolean get_VisibleAlarm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_VISIBLEALARM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_VISIBLEALARM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_VISIBLEALARM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VisibleAlarm(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_VISIBLEALARM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_VISIBLEALARM + " could not be found");
    		
		} else if (!CIM_AlarmDeviceHelper.isValid_VisibleAlarm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlarmDevice.CIM_PROPERTY_VISIBLEALARM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_VISIBLEALARM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VisualIndicatorIsDisabled
	
	public Boolean get_VisualIndicatorIsDisabled() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_VISUALINDICATORISDISABLED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_VISUALINDICATORISDISABLED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_VISUALINDICATORISDISABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VisualIndicatorIsDisabled(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlarmDevice.CIM_PROPERTY_VISUALINDICATORISDISABLED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlarmDevice.CIM_PROPERTY_VISUALINDICATORISDISABLED + " could not be found");
    		
		} else if (!CIM_AlarmDeviceHelper.isValid_VisualIndicatorIsDisabled(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlarmDevice.CIM_PROPERTY_VISUALINDICATORISDISABLED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlarmDevice.CIM_PROPERTY_VISUALINDICATORISDISABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_setAlarmIndicator(CIMClient cimClient, UnsignedInt16 AudioIndicator, UnsignedInt16 VisualIndicator, UnsignedInt16 MotionIndicator) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_AlarmDevice.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_AudioIndicator = new CIMValue(AudioIndicator, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_VisualIndicator = new CIMValue(VisualIndicator, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_MotionIndicator = new CIMValue(MotionIndicator, new CIMDataType(CIMDataType.UINT16));
		
	  	inParameter.add(new CIMArgument("AudioIndicator", cimValue_AudioIndicator));
		inParameter.add(new CIMArgument("VisualIndicator", cimValue_VisualIndicator));
		inParameter.add(new CIMArgument("MotionIndicator", cimValue_MotionIndicator));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_SETALARMINDICATOR,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_AlarmDevice.CIM_METHOD_SETALARMINDICATOR + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_AlarmDevice.CIM_METHOD_SETALARMINDICATOR + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_AlarmDevice.CIM_METHOD_SETALARMINDICATOR + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_setAlarmState(CIMClient cimClient, UnsignedInt16 RequestedAlarmState) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_AlarmDevice.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_RequestedAlarmState = new CIMValue(RequestedAlarmState, new CIMDataType(CIMDataType.UINT16));
		
	  	inParameter.add(new CIMArgument("RequestedAlarmState", cimValue_RequestedAlarmState));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_SETALARMSTATE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_AlarmDevice.CIM_METHOD_SETALARMSTATE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_AlarmDevice.CIM_METHOD_SETALARMSTATE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_AlarmDevice.CIM_METHOD_SETALARMSTATE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_setUrgency(CIMClient cimClient, UnsignedInt16 RequestedUrgency) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_AlarmDevice.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_RequestedUrgency = new CIMValue(RequestedUrgency, new CIMDataType(CIMDataType.UINT16));
		
	  	inParameter.add(new CIMArgument("RequestedUrgency", cimValue_RequestedUrgency));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_SETURGENCY,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_AlarmDevice.CIM_METHOD_SETURGENCY + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_AlarmDevice.CIM_METHOD_SETURGENCY + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_AlarmDevice.CIM_METHOD_SETURGENCY + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
