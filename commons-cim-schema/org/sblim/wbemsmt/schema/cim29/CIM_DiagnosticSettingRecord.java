/** 
 * CIM_DiagnosticSettingRecord.java
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
 * Description: The DiagnosticSettingData that was used to when a Diagnostic was run.
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



public class CIM_DiagnosticSettingRecord extends CIM_DiagnosticRecord  {
	
	public final static String CIM_CLASS_NAME = "CIM_DiagnosticSettingRecord";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CORRESPONDINGSETTINGSRECORD = "CIM_CorrespondingSettingsRecord";
	
	
	/**
	*	When this flag is true, the test will halt after finding the first error.
	*/
	public final static String CIM_PROPERTY_HALTONERROR = "HaltOnError"; //$NON-NLS-1$
	/**
	*	The LogOptions property lists the log options that were requested for the Diagnostic Service. A brief summary of the various log options can be found in CIM_DiagnosticSetting.LogOptions.
	*/
	public final static String CIM_PROPERTY_LOGOPTIONS = "LogOptions"; //$NON-NLS-1$
	/**
	*	Array entries contain parameters corresponding to entries in the LoopControl array, limiting the number of times a test should be repeated with a single invocation of RunTest by a CIM client.
	*/
	public final static String CIM_PROPERTY_LOOPCONTROLPARAMETER = "LoopControlParameter"; //$NON-NLS-1$
	/**
	*	LoopControl, used in conjunction with LoopControlParameter, sets one or more loop control mechanisms that limits the number of times a test should be repeated with a single invocation of RunTest by a CIM client. There is an array-positional correspondence between LoopControl entries & LoopControlParameter entries. The entries in these coupled arrays of loop controls can be used in a logical OR fashion to achieve the desired loop control. For example, if a client wants to loop a test 1000 times, but quit if a timer runs out, it could set both controls into the LoopControl array as two separate entries in each array. The looping test will terminate when the first of the two ORed conditions are met. 
A brief description for each loop control can be found in the description of DiagnosticSetting.LoopControl.
	*/
	public final static String CIM_PROPERTY_LOOPCONTROL = "LoopControl"; //$NON-NLS-1$
	/**
	*	Provides additional information regarding the types of test messages that are logged when the property LogOptions includes the value 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS = "OtherLogOptionsDescriptions"; //$NON-NLS-1$
	/**
	*	Provides additional information for LoopControl when its value is set to 1 ('Other').
	*/
	public final static String CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS = "OtherLoopControlDescriptions"; //$NON-NLS-1$
	/**
	*	The requested percentage of coverage for the diagnostic service. For example, a hard drive scan test could be asked to run at 50%. Permissible values for this property range from 0 to 100.
	*/
	public final static String CIM_PROPERTY_PERCENTOFTESTCOVERAGE = "PercentOfTestCoverage"; //$NON-NLS-1$
	/**
	*	When this flag is true, the test software should attempt to run in an accelerated fashion either by reducing the coverage or number of tests performed.
	*/
	public final static String CIM_PROPERTY_QUICKMODE = "QuickMode"; //$NON-NLS-1$
	/**
	*	The desired length of time to persist the messages that result from execution of a diagnostic service. Here is a summary of the choices and behaviors for different ResultPersistence values: 
0 = "No Persistence": 
Setting the timer to zero tells the provider not to persist the diagnostic result. The diagnostic information is only available while the diagnostic is executing or at its conclusion. 
Value > 0 and < 0xFFFFFFFF = "Persist With TimeOut": 
Setting the ResultPersistenceOption to a integer will cause the DiagnosticResult to be persisted for that number of seconds. At the end of that time, the DiagnosticResult may be deleted by the diagnostic service provider. 
0xFFFFFFFF = "Persist Forever": 
By setting the timeout value to the very large value, 0xFFFFFFFF, the provider shall persist results forever. In this case, the client MUST bear the responsibility for deleting them.
	*/
	public final static String CIM_PROPERTY_RESULTPERSISTENCE = "ResultPersistence"; //$NON-NLS-1$
	/**
	*	A client may want to specify the volume or detail of information logged by a diagnostic service. This metric is applied to a corresponding logging option, acting as a qualifier on its description. Three levels of verbosity are defined as follows: 
* "Minimum" (value=2): Specified if the least amount of information is desired; for example, Pass or Fail. 
* "Standard" (value=3): This is the standard level of messaging provided by the service. It is the form most likely to be used if no verbosity value is specified (default). 
* "Full" (value=4): Specified when all information, regardless of size, is desired. 
Verbosity may not apply to all LogOptions values, in which case the default VerbosityLevel of "Standard" SHOULD be used.
	*/
	public final static String CIM_PROPERTY_VERBOSITYLEVEL = "VerbosityLevel"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_HALTONERROR);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGOPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOOPCONTROLPARAMETER);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOOPCONTROL);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERCENTOFTESTCOVERAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_QUICKMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_RESULTPERSISTENCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_VERBOSITYLEVEL);
				
		for (int i = 0; i < CIM_DiagnosticRecord.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_DiagnosticRecord.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HALTONERROR)||
				((String)CIM_DiagnosticRecord.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGOPTIONS)||
				((String)CIM_DiagnosticRecord.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOOPCONTROLPARAMETER)||
				((String)CIM_DiagnosticRecord.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOOPCONTROL)||
				((String)CIM_DiagnosticRecord.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS)||
				((String)CIM_DiagnosticRecord.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS)||
				((String)CIM_DiagnosticRecord.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PERCENTOFTESTCOVERAGE)||
				((String)CIM_DiagnosticRecord.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_QUICKMODE)||
				((String)CIM_DiagnosticRecord.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RESULTPERSISTENCE)||
				((String)CIM_DiagnosticRecord.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VERBOSITYLEVEL)){
				continue;
			}
			
			CIM_DiagnosticSettingRecord.CIM_PropertyNameList.add(CIM_DiagnosticRecord.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HALTONERROR, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGOPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOOPCONTROLPARAMETER, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOOPCONTROL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERCENTOFTESTCOVERAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_QUICKMODE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESULTPERSISTENCE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VERBOSITYLEVEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_DiagnosticRecord.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_DiagnosticRecord.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HALTONERROR)||
				((CIMProperty)CIM_DiagnosticRecord.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGOPTIONS)||
				((CIMProperty)CIM_DiagnosticRecord.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOOPCONTROLPARAMETER)||
				((CIMProperty)CIM_DiagnosticRecord.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOOPCONTROL)||
				((CIMProperty)CIM_DiagnosticRecord.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS)||
				((CIMProperty)CIM_DiagnosticRecord.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS)||
				((CIMProperty)CIM_DiagnosticRecord.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PERCENTOFTESTCOVERAGE)||
				((CIMProperty)CIM_DiagnosticRecord.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_QUICKMODE)||
				((CIMProperty)CIM_DiagnosticRecord.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RESULTPERSISTENCE)||
				((CIMProperty)CIM_DiagnosticRecord.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VERBOSITYLEVEL)){
				continue;
			}
			
			CIM_DiagnosticSettingRecord.CIM_PropertyList.add(CIM_DiagnosticRecord.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_DiagnosticRecord.Java_Package_List.size(); i++) {
			if (((String)CIM_DiagnosticRecord.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_DiagnosticRecord.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LOGOPTIONS = {"Unknown","Other","Results","Subtests","Actions","Warnings","Status","Device Errors","Service Errors","Setting Data","Statistics","Hardware Configuration","Software Configuration","References","Debug"};
	public final static String[] CIM_VALUEMAP_LOOPCONTROL = {"Unknown","Other","Continuous","Count","Timer","Error Count"};
	public final static String[] CIM_VALUEMAP_VERBOSITYLEVEL = {"Minimum","Standard","Full"};
	
	
	public final static int LOGOPTIONS_UNKNOWN = 0;
	public final static int LOGOPTIONS_OTHER = 1;
	public final static int LOGOPTIONS_RESULTS = 2;
	public final static int LOGOPTIONS_SUBTESTS = 3;
	public final static int LOGOPTIONS_ACTIONS = 4;
	public final static int LOGOPTIONS_WARNINGS = 5;
	public final static int LOGOPTIONS_STATUS = 6;
	public final static int LOGOPTIONS_DEVICEERRORS = 7;
	public final static int LOGOPTIONS_SERVICEERRORS = 8;
	public final static int LOGOPTIONS_SETTINGDATA = 9;
	public final static int LOGOPTIONS_STATISTICS = 10;
	public final static int LOGOPTIONS_HARDWARECONFIGURATION = 11;
	public final static int LOGOPTIONS_SOFTWARECONFIGURATION = 12;
	public final static int LOGOPTIONS_REFERENCES = 13;
	public final static int LOGOPTIONS_DEBUG = 14;
	
	public final static int LOOPCONTROL_UNKNOWN = 0;
	public final static int LOOPCONTROL_OTHER = 1;
	public final static int LOOPCONTROL_CONTINUOUS = 2;
	public final static int LOOPCONTROL_COUNT = 3;
	public final static int LOOPCONTROL_TIMER = 4;
	public final static int LOOPCONTROL_ERRORCOUNT = 5;
	
	public final static int VERBOSITYLEVEL_MINIMUM = 2;
	public final static int VERBOSITYLEVEL_STANDARD = 3;
	public final static int VERBOSITYLEVEL_FULL = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DiagnosticSettingRecord() {

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
	public CIM_DiagnosticSettingRecord(Vector keyProperties){ 
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
	public CIM_DiagnosticSettingRecord(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DiagnosticSettingRecord)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DiagnosticSettingRecord)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DiagnosticSettingRecord)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DiagnosticSettingRecord)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DiagnosticSettingRecord)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DiagnosticSettingRecord)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DiagnosticSettingRecord)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DiagnosticSettingRecord)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DiagnosticSettingRecord)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DiagnosticSettingRecord)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_DiagnosticRecord_CIM_CorrespondingSettingsRecords(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CORRESPONDINGSETTINGSRECORD, 
					CIM_DiagnosticRecord.CIM_CLASS_NAME, 
					"SettingsRecord",
					"DataRecord",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DiagnosticSettingRecord.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiagnosticSettingRecord.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_DiagnosticSettingRecord.Java_Package_List.get(i))).endsWith(".")) {
							CIM_DiagnosticSettingRecord.Java_Package_List.setElementAt((String)(CIM_DiagnosticSettingRecord.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_DiagnosticSettingRecord.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiagnosticRecord(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_DiagnosticRecord(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiagnosticRecord(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_DiagnosticRecord_CIM_CorrespondingSettingsRecord_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CORRESPONDINGSETTINGSRECORD, 
					CIM_DiagnosticRecord.CIM_CLASS_NAME, 
					"SettingsRecord",
					"DataRecord");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_DiagnosticRecord.CIM_CLASS_NAME)) {
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
	
	// Attribute HaltOnError
	
	public Boolean get_HaltOnError() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_HALTONERROR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_HALTONERROR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_HALTONERROR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HaltOnError(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_HALTONERROR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_HALTONERROR + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingRecordHelper.isValid_HaltOnError(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_HALTONERROR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_HALTONERROR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LogOptions
	
	public UnsignedInt16[] get_LogOptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOGOPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOGOPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOGOPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_LogOptions(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOGOPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOGOPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingRecordHelper.isValid_LogOptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOGOPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOGOPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LoopControlParameter
	
	public String[] get_LoopControlParameter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROLPARAMETER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROLPARAMETER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROLPARAMETER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_LoopControlParameter(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROLPARAMETER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROLPARAMETER + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingRecordHelper.isValid_LoopControlParameter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROLPARAMETER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROLPARAMETER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LoopControl
	
	public UnsignedInt16[] get_LoopControl() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_LoopControl(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROL + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingRecordHelper.isValid_LoopControl(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_LOOPCONTROL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLogOptionsDescriptions
	
	public String[] get_OtherLogOptionsDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherLogOptionsDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingRecordHelper.isValid_OtherLogOptionsDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLoopControlDescriptions
	
	public String[] get_OtherLoopControlDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherLoopControlDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingRecordHelper.isValid_OtherLoopControlDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PercentOfTestCoverage
	
	public UnsignedInt8 get_PercentOfTestCoverage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_PERCENTOFTESTCOVERAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_PERCENTOFTESTCOVERAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_PERCENTOFTESTCOVERAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PercentOfTestCoverage(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_PERCENTOFTESTCOVERAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_PERCENTOFTESTCOVERAGE + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingRecordHelper.isValid_PercentOfTestCoverage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_PERCENTOFTESTCOVERAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_PERCENTOFTESTCOVERAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute QuickMode
	
	public Boolean get_QuickMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_QUICKMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_QUICKMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_QUICKMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_QuickMode(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_QUICKMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_QUICKMODE + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingRecordHelper.isValid_QuickMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_QUICKMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_QUICKMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ResultPersistence
	
	public UnsignedInt32 get_ResultPersistence() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_RESULTPERSISTENCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_RESULTPERSISTENCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_RESULTPERSISTENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ResultPersistence(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_RESULTPERSISTENCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_RESULTPERSISTENCE + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingRecordHelper.isValid_ResultPersistence(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_RESULTPERSISTENCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_RESULTPERSISTENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VerbosityLevel
	
	public UnsignedInt16[] get_VerbosityLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_VERBOSITYLEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_VERBOSITYLEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_VERBOSITYLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_VerbosityLevel(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSettingRecord.CIM_PROPERTY_VERBOSITYLEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_VERBOSITYLEVEL + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingRecordHelper.isValid_VerbosityLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_VERBOSITYLEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSettingRecord.CIM_PROPERTY_VERBOSITYLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
