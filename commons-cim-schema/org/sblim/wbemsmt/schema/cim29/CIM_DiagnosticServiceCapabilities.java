/** 
 * CIM_DiagnosticServiceCapabilities.java
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
 * Description: DiagnosticServiceCapabilities is a class that describes the capabilities of the diagnostic service. This provides the means for the diagnostic service to describe its abilities, limitations, and/or potential for use of various diagnostic service parameters. For example, what types of settings the diagnostic service supports.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_DiagnosticServiceCapabilities extends CIM_Capabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_DiagnosticServiceCapabilities";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	
	
	/**
	*	Provides additional information for SupportedExecutionControls when the corresponding value is set ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERSUPPORTEDEXECUTIONCONTROLSDESCRIPTIONS = "OtherSupportedExecutionControlsDescriptions"; //$NON-NLS-1$
	/**
	*	Provides additional information for SupportedLogOptions when the corresponding value is set to 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERSUPPORTEDLOGOPTIONSDESCRIPTIONS = "OtherSupportedLogOptionsDescriptions"; //$NON-NLS-1$
	/**
	*	Provides additional information for SupportedLogStorage when the corresponding value is set to 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERSUPPORTEDLOGSTORAGEDESCRIPTIONS = "OtherSupportedLogStorageDescriptions"; //$NON-NLS-1$
	/**
	*	Provides additional information for SupportedLoopControl when the corresponding value is set to 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERSUPPORTEDLOOPCONTROLDESCRIPTIONS = "OtherSupportedLoopControlDescriptions"; //$NON-NLS-1$
	/**
	*	Provides additional information for SupportedServiceModes when the corresponding value is set to 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERSUPPORTEDSERVICEMODESDESCRIPTIONS = "OtherSupportedServiceModesDescriptions"; //$NON-NLS-1$
	/**
	*	The SupportedExecutionControls property lists the job controls that are supported by the Diagnostic Service. The values are: 
"Job Creation" (Value = 2): publishes that a ConcreteJob instance will be created to control the diagnostic job launched by the diagnostic service. 
"Kill Job" (Value = 3): publishes that the diagnostic service implements the ConcreteJob.RequestStateChange(Kill) method. 
"Suspend Job" (Value = 4): publishes that the diagnostic service implements the ConcreteJob.RequestStateChange(Suspend) method. 
"Terminate Job" (Value = 5): publishes that the diagnostic service implements the ConcreteJob.RequestStateChange(Terminate) method.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDEXECUTIONCONTROLS = "SupportedExecutionControls"; //$NON-NLS-1$
	/**
	*	The SupportedLogOptions property lists the log options that are supported by the Diagnostic Service.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDLOGOPTIONS = "SupportedLogOptions"; //$NON-NLS-1$
	/**
	*	The SupportedLogStorage property lists the storage options for logging that are supported by the Diagnostic Service. 
The values are: 
"DiagnosticRecordLog" (Value = 2): Supports use of the DiagnosticRecordLog class for aggregating DiagnosticRecords. 
"MessageLog" (Value = 3): Supports writing log information using the methods in the MessageLog class. 
"File" (Value = 4): Supports writing log information to a file.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDLOGSTORAGE = "SupportedLogStorage"; //$NON-NLS-1$
	/**
	*	The SupportedLoopControl property lists the loop controls that are supported by the Diagnostic Service.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDLOOPCONTROL = "SupportedLoopControl"; //$NON-NLS-1$
	/**
	*	The SupportedServiceModes property lists the operational modes that are supported by the Diagnostic Service. These modes may correspond to, but are not limited to, settings that may be applied to a Diagnostic Service.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDSERVICEMODES = "SupportedServiceModes"; //$NON-NLS-1$
	/**
	*	This property is being deprecated because the TestWarningLevel and LogOptions properties serve the same purpose. 
Lists the level of warning messages that MAY be logged. If for example no warning information is required, the level would be set to "No Warnings" (value=0). Using "Missing Resources" (value=1) will cause warnings to be generated when required resources or hardware are not found. Setting the value to 2, "Testing Impacts", results in both missing resources and 'test impact' warnings (for example, multiple retries required) to be reported.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDTESTWARNINGS = "SupportedTestWarnings"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERSUPPORTEDEXECUTIONCONTROLSDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERSUPPORTEDLOGOPTIONSDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERSUPPORTEDLOGSTORAGEDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERSUPPORTEDLOOPCONTROLDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERSUPPORTEDSERVICEMODESDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDEXECUTIONCONTROLS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDLOGOPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDLOGSTORAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDLOOPCONTROL);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDSERVICEMODES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDTESTWARNINGS);
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERSUPPORTEDEXECUTIONCONTROLSDESCRIPTIONS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERSUPPORTEDLOGOPTIONSDESCRIPTIONS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERSUPPORTEDLOGSTORAGEDESCRIPTIONS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERSUPPORTEDLOOPCONTROLDESCRIPTIONS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERSUPPORTEDSERVICEMODESDESCRIPTIONS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDEXECUTIONCONTROLS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDLOGOPTIONS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDLOGSTORAGE)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDLOOPCONTROL)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDSERVICEMODES)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDTESTWARNINGS)){
				continue;
			}
			
			CIM_DiagnosticServiceCapabilities.CIM_PropertyNameList.add(CIM_Capabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERSUPPORTEDEXECUTIONCONTROLSDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERSUPPORTEDLOGOPTIONSDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERSUPPORTEDLOGSTORAGEDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERSUPPORTEDLOOPCONTROLDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERSUPPORTEDSERVICEMODESDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDEXECUTIONCONTROLS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDLOGOPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDLOGSTORAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDLOOPCONTROL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDSERVICEMODES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDTESTWARNINGS, new CIMValue(new UnsignedInt16("3"), new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERSUPPORTEDEXECUTIONCONTROLSDESCRIPTIONS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERSUPPORTEDLOGOPTIONSDESCRIPTIONS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERSUPPORTEDLOGSTORAGEDESCRIPTIONS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERSUPPORTEDLOOPCONTROLDESCRIPTIONS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERSUPPORTEDSERVICEMODESDESCRIPTIONS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDEXECUTIONCONTROLS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDLOGOPTIONS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDLOGSTORAGE)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDLOOPCONTROL)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDSERVICEMODES)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDTESTWARNINGS)){
				continue;
			}
			
			CIM_DiagnosticServiceCapabilities.CIM_PropertyList.add(CIM_Capabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Capabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_Capabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Capabilities.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_SUPPORTEDEXECUTIONCONTROLS = {"Unknown","Other","Job Creation","Kill Job","Suspend Job","Terminate Job","No Execution Controls"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDLOGOPTIONS = {"Unknown","Other","Results","Subtests","Actions","Warnings","Status","Device Errors","Service Errors","Setting Data","Statistics","Hardware Configuration","Software Configuration","References","Debug","No Log Options"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDLOGSTORAGE = {"Unknown","Other","DiagnosticRecordLog","MessageLog","File","No Log Storage"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDLOOPCONTROL = {"Unknown","Other","Continuous","Count","Timer","ErrorCount","No Loop Control"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDSERVICEMODES = {"Unknown","Other","PercentOfTestCoverage","QuickMode","HaltOnError","ResultPersistence","No Service Modes"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDTESTWARNINGS = {"No Warnings","Missing Resources","Testing Impacts","All Warnings"};
	
	
	public final static String SUPPORTEDEXECUTIONCONTROLS_UNKNOWN = "0";
	public final static String SUPPORTEDEXECUTIONCONTROLS_OTHER = "1";
	public final static String SUPPORTEDEXECUTIONCONTROLS_JOBCREATION = "2";
	public final static String SUPPORTEDEXECUTIONCONTROLS_KILLJOB = "3";
	public final static String SUPPORTEDEXECUTIONCONTROLS_SUSPENDJOB = "4";
	public final static String SUPPORTEDEXECUTIONCONTROLS_TERMINATEJOB = "5";
	public final static String SUPPORTEDEXECUTIONCONTROLS_NOEXECUTIONCONTROLS = "0x8000";
	
	public final static String SUPPORTEDLOGOPTIONS_UNKNOWN = "0";
	public final static String SUPPORTEDLOGOPTIONS_OTHER = "1";
	public final static String SUPPORTEDLOGOPTIONS_RESULTS = "2";
	public final static String SUPPORTEDLOGOPTIONS_SUBTESTS = "3";
	public final static String SUPPORTEDLOGOPTIONS_ACTIONS = "4";
	public final static String SUPPORTEDLOGOPTIONS_WARNINGS = "5";
	public final static String SUPPORTEDLOGOPTIONS_STATUS = "6";
	public final static String SUPPORTEDLOGOPTIONS_DEVICEERRORS = "7";
	public final static String SUPPORTEDLOGOPTIONS_SERVICEERRORS = "8";
	public final static String SUPPORTEDLOGOPTIONS_SETTINGDATA = "9";
	public final static String SUPPORTEDLOGOPTIONS_STATISTICS = "10";
	public final static String SUPPORTEDLOGOPTIONS_HARDWARECONFIGURATION = "11";
	public final static String SUPPORTEDLOGOPTIONS_SOFTWARECONFIGURATION = "12";
	public final static String SUPPORTEDLOGOPTIONS_REFERENCES = "13";
	public final static String SUPPORTEDLOGOPTIONS_DEBUG = "14";
	public final static String SUPPORTEDLOGOPTIONS_NOLOGOPTIONS = "0x8000";
	
	public final static String SUPPORTEDLOGSTORAGE_UNKNOWN = "0";
	public final static String SUPPORTEDLOGSTORAGE_OTHER = "1";
	public final static String SUPPORTEDLOGSTORAGE_DIAGNOSTICRECORDLOG = "2";
	public final static String SUPPORTEDLOGSTORAGE_MESSAGELOG = "3";
	public final static String SUPPORTEDLOGSTORAGE_FILE = "4";
	public final static String SUPPORTEDLOGSTORAGE_NOLOGSTORAGE = "0x8000";
	
	public final static String SUPPORTEDLOOPCONTROL_UNKNOWN = "0";
	public final static String SUPPORTEDLOOPCONTROL_OTHER = "1";
	public final static String SUPPORTEDLOOPCONTROL_CONTINUOUS = "2";
	public final static String SUPPORTEDLOOPCONTROL_COUNT = "3";
	public final static String SUPPORTEDLOOPCONTROL_TIMER = "4";
	public final static String SUPPORTEDLOOPCONTROL_ERRORCOUNT = "5";
	public final static String SUPPORTEDLOOPCONTROL_NOLOOPCONTROL = "0x8000";
	
	public final static String SUPPORTEDSERVICEMODES_UNKNOWN = "0";
	public final static String SUPPORTEDSERVICEMODES_OTHER = "1";
	public final static String SUPPORTEDSERVICEMODES_PERCENTOFTESTCOVERAGE = "2";
	public final static String SUPPORTEDSERVICEMODES_QUICKMODE = "3";
	public final static String SUPPORTEDSERVICEMODES_HALTONERROR = "4";
	public final static String SUPPORTEDSERVICEMODES_RESULTPERSISTENCE = "5";
	public final static String SUPPORTEDSERVICEMODES_NOSERVICEMODES = "0x8000";
	
	public final static int SUPPORTEDTESTWARNINGS_NOWARNINGS = 2;
	public final static int SUPPORTEDTESTWARNINGS_MISSINGRESOURCES = 3;
	public final static int SUPPORTEDTESTWARNINGS_TESTINGIMPACTS = 4;
	public final static int SUPPORTEDTESTWARNINGS_ALLWARNINGS = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DiagnosticServiceCapabilities() {

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
	public CIM_DiagnosticServiceCapabilities(Vector keyProperties){ 
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
	public CIM_DiagnosticServiceCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DiagnosticServiceCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DiagnosticServiceCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DiagnosticServiceCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DiagnosticServiceCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DiagnosticServiceCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DiagnosticServiceCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DiagnosticServiceCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DiagnosticServiceCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DiagnosticServiceCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DiagnosticServiceCapabilities)object).cimObjectPath)) {
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
	
	// Attribute OtherSupportedExecutionControlsDescriptions
	
	public String[] get_OtherSupportedExecutionControlsDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDEXECUTIONCONTROLSDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDEXECUTIONCONTROLSDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDEXECUTIONCONTROLSDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherSupportedExecutionControlsDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDEXECUTIONCONTROLSDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDEXECUTIONCONTROLSDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticServiceCapabilitiesHelper.isValid_OtherSupportedExecutionControlsDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDEXECUTIONCONTROLSDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDEXECUTIONCONTROLSDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherSupportedLogOptionsDescriptions
	
	public String[] get_OtherSupportedLogOptionsDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGOPTIONSDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGOPTIONSDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGOPTIONSDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherSupportedLogOptionsDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGOPTIONSDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGOPTIONSDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticServiceCapabilitiesHelper.isValid_OtherSupportedLogOptionsDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGOPTIONSDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGOPTIONSDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherSupportedLogStorageDescriptions
	
	public String[] get_OtherSupportedLogStorageDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGSTORAGEDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGSTORAGEDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGSTORAGEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherSupportedLogStorageDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGSTORAGEDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGSTORAGEDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticServiceCapabilitiesHelper.isValid_OtherSupportedLogStorageDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGSTORAGEDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOGSTORAGEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherSupportedLoopControlDescriptions
	
	public String[] get_OtherSupportedLoopControlDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOOPCONTROLDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOOPCONTROLDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOOPCONTROLDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherSupportedLoopControlDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOOPCONTROLDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOOPCONTROLDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticServiceCapabilitiesHelper.isValid_OtherSupportedLoopControlDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOOPCONTROLDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDLOOPCONTROLDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherSupportedServiceModesDescriptions
	
	public String[] get_OtherSupportedServiceModesDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDSERVICEMODESDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDSERVICEMODESDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDSERVICEMODESDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherSupportedServiceModesDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDSERVICEMODESDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDSERVICEMODESDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticServiceCapabilitiesHelper.isValid_OtherSupportedServiceModesDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDSERVICEMODESDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_OTHERSUPPORTEDSERVICEMODESDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedExecutionControls
	
	public UnsignedInt16[] get_SupportedExecutionControls() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDEXECUTIONCONTROLS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDEXECUTIONCONTROLS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDEXECUTIONCONTROLS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedExecutionControls(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDEXECUTIONCONTROLS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDEXECUTIONCONTROLS + " could not be found");
    		
		} else if (!CIM_DiagnosticServiceCapabilitiesHelper.isValid_SupportedExecutionControls(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDEXECUTIONCONTROLS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDEXECUTIONCONTROLS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedLogOptions
	
	public UnsignedInt16[] get_SupportedLogOptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGOPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGOPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGOPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedLogOptions(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGOPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGOPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticServiceCapabilitiesHelper.isValid_SupportedLogOptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGOPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGOPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedLogStorage
	
	public UnsignedInt16[] get_SupportedLogStorage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGSTORAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGSTORAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGSTORAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedLogStorage(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGSTORAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGSTORAGE + " could not be found");
    		
		} else if (!CIM_DiagnosticServiceCapabilitiesHelper.isValid_SupportedLogStorage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGSTORAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOGSTORAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedLoopControl
	
	public UnsignedInt16[] get_SupportedLoopControl() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOOPCONTROL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOOPCONTROL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOOPCONTROL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedLoopControl(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOOPCONTROL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOOPCONTROL + " could not be found");
    		
		} else if (!CIM_DiagnosticServiceCapabilitiesHelper.isValid_SupportedLoopControl(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOOPCONTROL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDLOOPCONTROL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedServiceModes
	
	public UnsignedInt16[] get_SupportedServiceModes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDSERVICEMODES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDSERVICEMODES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDSERVICEMODES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedServiceModes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDSERVICEMODES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDSERVICEMODES + " could not be found");
    		
		} else if (!CIM_DiagnosticServiceCapabilitiesHelper.isValid_SupportedServiceModes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDSERVICEMODES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDSERVICEMODES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedTestWarnings
	
	public UnsignedInt16 get_SupportedTestWarnings() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDTESTWARNINGS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDTESTWARNINGS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDTESTWARNINGS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SupportedTestWarnings(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDTESTWARNINGS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDTESTWARNINGS + " could not be found");
    		
		} else if (!CIM_DiagnosticServiceCapabilitiesHelper.isValid_SupportedTestWarnings(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDTESTWARNINGS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticServiceCapabilities.CIM_PROPERTY_SUPPORTEDTESTWARNINGS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
