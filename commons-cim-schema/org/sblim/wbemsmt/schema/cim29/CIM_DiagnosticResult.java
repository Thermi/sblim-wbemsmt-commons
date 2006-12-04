/** 
 * CIM_DiagnosticResult.java
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
 * Description: When a DiagnosticTest Service is running, test results are reported using a DiagnosticResult object, or one of its subclasses. A DiagnosticTest may be running because its Service is Started or due to an invocation of the RunTest method. Diagnostic Results are related to their Test via an instance of the DiagnosticResultsForMSE association. 
For every running of DiagnosticTest, a new instance of DiagnosticResult, or one of it's subclasses should be created.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_DiagnosticResult  {
	
	protected CIMInstance cimInstance			= new CIMInstance();
	protected CIMInstance original_cimInstance	= null;
	protected CIMObjectPath cimObjectPath		= null; 
	
	public final static String CIM_CLASS_NAME = "CIM_DiagnosticResult";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICRESULTFORMSE = "CIM_DiagnosticResultForMSE";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICRESULTFORTEST = "CIM_DiagnosticResultForTest";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICRESULTINPACKAGE = "CIM_DiagnosticResultInPackage";
	
	
	/**
	*	The scoping Test's SystemCreationClassName.
	*/
	public final static String CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME = "DiagSystemCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping Test's SystemName.
	*/
	public final static String CIM_PROPERTY_DIAGSYSTEMNAME = "DiagSystemName"; //$NON-NLS-1$
	/**
	*	The scoping Test's CreationClassName.
	*/
	public final static String CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME = "DiagnosticCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping Test's Name.
	*/
	public final static String CIM_PROPERTY_DIAGNOSTICNAME = "DiagnosticName"; //$NON-NLS-1$
	/**
	*	If applicable, this string should contain one or more vendor specific error codes that the diagnostic service detected. These error codes may be used by the vendor for variety of purposes such as: fault data base indexing, field service trouble ticketing, product quality tracking, part failure history, etc. Since these codes are for vendor purposes they may assume any form. Details on suggested use cases will be left to white papers. The array of error codes has model correspondence with an ErrorCount array so the number of errors reported can be analyzed by individual error code.
	*/
	public final static String CIM_PROPERTY_ERRORCODE = "ErrorCode"; //$NON-NLS-1$
	/**
	*	Since some tests may detect transient and correctable errors such as a network diagnostic or memory test, an error count is useful to indicate the severity of the failure. This field contains an integer value of the number of errors detected by the test. The ErrorCount is an array with model correspondence to ErrorCode so that the test can report an ErrorCount on each type of error encountered. It is recommended that hard errors and correctable or recoverable errors be given different codes so that clients with knowledge of the error codes can evaluate correctable, recoverable, and hard errors independently.
	*/
	public final static String CIM_PROPERTY_ERRORCOUNT = "ErrorCount"; //$NON-NLS-1$
	/**
	*	Estimated number of seconds to perform the Diagnostic Test indicated by the DiagnosticCreationClassName and DiagnosticName properties. After the test has completed, the actual elapsed time can be determined by subtracting the TestStartTime from the TestCompletionTime. A similar property is defined in the association, DiagnosticTest ForMSE. The difference between the two properties is that the value stored in the association is a generic test execution time for the Element and the Test. But, the value here (in DiagnosticResult) is the estimated time that this instance with the given settings would take to run the test. A CIM Consumer can compare this value with the value in the association DiagnosticTestForMSE to get an idea what impact their settings have on test execution.
	*/
	public final static String CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING = "EstimatedTimeOfPerforming"; //$NON-NLS-1$
	/**
	*	The Unique identifier for an instance of Diagnostic Results.
	*/
	public final static String CIM_PROPERTY_EXECUTIONID = "ExecutionID"; //$NON-NLS-1$
	/**
	*	When this flag is true, the test will halt after finding the first error.
	*/
	public final static String CIM_PROPERTY_HALTONERROR = "HaltOnError"; //$NON-NLS-1$
	/**
	*	This property is being deprecated. Tests should be grouped at the test level, not by the model. /n If this property is TRUE, then this DiagnosticResult summarizes the results from the execution of a packaged set of DiagnosticTests. The Tests in the package can be identified by following the DiagnosticResultForTest association to the test and then using the DiagnosticTest InPackage aggregation. The individual Results can be broken out by instantiating DiagnosticResults for the individual lower level tests and aggregating into the 'summary' Result using the DiagnosticResultInPackage association.
	*/
	public final static String CIM_PROPERTY_ISPACKAGE = "IsPackage"; //$NON-NLS-1$
	/**
	*	Since some tests may be looped, it is useful to report how many iterations passed and failed. This is relevant in analyzing transitory failures. For example, if all the errors occurred in just one of 100 iterations, the device may be viewed as OK or marginal, to be monitored further rather then failed. Note: LoopsPassed & LoopsFailed should add up to the loops completed.
	*/
	public final static String CIM_PROPERTY_LOOPSFAILED = "LoopsFailed"; //$NON-NLS-1$
	/**
	*	Since some tests may be looped, it is useful to report how many iterations passed and failed. This is relevant in analyzing transitory failures. For example if all the errors occurred in just one of 100 iterations, the device may be viewed as OK or marginal, to be monitored further rather then failed. Note: LoopsPassed & LoopsFailed should add up to the loops completed.
	*/
	public final static String CIM_PROPERTY_LOOPSPASSED = "LoopsPassed"; //$NON-NLS-1$
	/**
	*	When "Other" (value=1) is entered in the TestState property, OtherStateDescription can be used to describe the test's state.
	*/
	public final static String CIM_PROPERTY_OTHERSTATEDESCRIPTION = "OtherStateDescription"; //$NON-NLS-1$
	/**
	*	The percentage of the test that has executed thus far, if the TestState property is set to "In Progress" or the percentage of the complete test that was executed if the TestState property is set to any of the completed states ("Passed", "Failed" or "Stopped"). Final results may be based on less than 100% coverage due to the parameters defined in DiagnosticSetting (such as QuickMode, PercentOfTestCoverage or HaltOnError).
	*/
	public final static String CIM_PROPERTY_PERCENTCOMPLETE = "PercentComplete"; //$NON-NLS-1$
	/**
	*	Requests the diagnostic software to reduce test coverage to the specified percentage. For example, a hard drive scan test could be asked to run at 50%. The most effective way to accomplish this is for the test software to scan every other track, as opposed to only scanning the first half of a drive. It is assumed that the effectiveness of the test is impacted proportional to the percentage of testing requested. Permissible values for this property range from 0 to 100. 
This property may not be applicable to all tests. If it can be set for a test, the value 7 ("Supports PercentOf TestCoverage") should be entered into the DiagnosticTest's Characteristics array.
	*/
	public final static String CIM_PROPERTY_PERCENTOFTESTCOVERAGE = "PercentOfTestCoverage"; //$NON-NLS-1$
	/**
	*	When this flag is true, the test software should attempt to run in an accelerated fashion either by reducing the coverage or number of tests performed.
	*/
	public final static String CIM_PROPERTY_QUICKMODE = "QuickMode"; //$NON-NLS-1$
	/**
	*	When this flag is true, the diagnostic test will report 'soft errors'. In this context, a soft error is a message from the diagnostic reporting a known defect in the hardware or driver configuration, or execution environment. Examples are: 'Not enough memory', 'Driver IOCTL not implemented', 'Video RAM compare failed during polygon fill test (A known defect in the video chipset)', etc.
	*/
	public final static String CIM_PROPERTY_REPORTSOFTERRORS = "ReportSoftErrors"; //$NON-NLS-1$
	/**
	*	When this flag is true, the diagnostic test will report 'status messages'. In this context, a status message indicates that the diagnostic code is at a checkpoint. Examples are: "Completion of phase 1", "Complex pattern", etc.
	*/
	public final static String CIM_PROPERTY_REPORTSTATUSMESSAGES = "ReportStatusMessages"; //$NON-NLS-1$
	/**
	*	The date and time when this test completed.
	*/
	public final static String CIM_PROPERTY_TESTCOMPLETIONTIME = "TestCompletionTime"; //$NON-NLS-1$
	/**
	*	TestResults stores one or more textual results from the execution of the DiagnosticTest(s) referenced by the DiagnosticCreationClassName and DiagnosticName properties. One entry is considered a cell location in the array. Each entry is time stamped and contains the following information, in the following format: 
LogOption|yyymmddhhttssoutc|TestName|message_text 
Where: 
LogOption = string identical to the LogOption value in DiagnosticSetting that was used to enable logging this message. 
yyyy = year, e.g. 2000 
mm = month (01 - 12) 
dd = day (01 - 31) 
hh = hour (00 - 24) 
tt = minute (00-59) 
ss = second (00-59) 
o = "+" or "-" indicating the sign of the UTC correction field 
utc = offset from UTC (Universal Coordinated Time) in minutes 
TestName = Internal test name or current internal subtest name that sent the message. 
Textual message = free form string that is the 'test result'.
	*/
	public final static String CIM_PROPERTY_TESTRESULTS = "TestResults"; //$NON-NLS-1$
	/**
	*	The date and time when this test started.
	*/
	public final static String CIM_PROPERTY_TESTSTARTTIME = "TestStartTime"; //$NON-NLS-1$
	/**
	*	Describes how the test is progressing. For example, if the test was discontinued, the TestState will be "Stopped" (value=5), or if testing is currently executing, TestState will be "In Progress" (4).
	*/
	public final static String CIM_PROPERTY_TESTSTATE = "TestState"; //$NON-NLS-1$
	/**
	*	Sets the level of warning messages to be logged. If for example no warning information is required, the level would be set to "No Warnings" (value=0). Using "Missing Resources" (value=1) will cause warnings to be generated when required resources or hardware are not found. Setting the value to 2, "Testing Impacts", results in both missing resources and 'test impact' warnings (for example, multiple retries required) to be reported.
	*/
	public final static String CIM_PROPERTY_TESTWARNINGLEVEL = "TestWarningLevel"; //$NON-NLS-1$
	/**
	*	The date and time the result was last updated.
	*/
	public final static String CIM_PROPERTY_TIMESTAMP = "TimeStamp"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_DIAGSYSTEMNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_DIAGNOSTICNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORCODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXECUTIONID);
		CIM_PropertyNameList.add(CIM_PROPERTY_HALTONERROR);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISPACKAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOOPSFAILED);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOOPSPASSED);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERSTATEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERCENTCOMPLETE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERCENTOFTESTCOVERAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_QUICKMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPORTSOFTERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPORTSTATUSMESSAGES);
		CIM_PropertyNameList.add(CIM_PROPERTY_TESTCOMPLETIONTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_TESTRESULTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TESTSTARTTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_TESTSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TESTWARNINGLEVEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMESTAMP);
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIAGSYSTEMNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIAGNOSTICNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORCODE, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXECUTIONID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HALTONERROR, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISPACKAGE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOOPSFAILED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOOPSPASSED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERSTATEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERCENTCOMPLETE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERCENTOFTESTCOVERAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_QUICKMODE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPORTSOFTERRORS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPORTSTATUSMESSAGES, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TESTCOMPLETIONTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TESTRESULTS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TESTSTARTTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TESTSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TESTWARNINGLEVEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMESTAMP, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
		};
			
	public final static String[] CIM_VALUEMAP_TESTSTATE = {"Unknown","Other","Passed","Failed","In Progress","Stopped"};
	public final static String[] CIM_VALUEMAP_TESTWARNINGLEVEL = {"No Warnings","Missing Resources","Testing Impacts","All Warnings"};
	
	
	public final static int TESTSTATE_UNKNOWN = 0;
	public final static int TESTSTATE_OTHER = 1;
	public final static int TESTSTATE_PASSED = 2;
	public final static int TESTSTATE_FAILED = 3;
	public final static int TESTSTATE_INPROGRESS = 4;
	public final static int TESTSTATE_STOPPED = 5;
	
	public final static int TESTWARNINGLEVEL_NOWARNINGS = 0;
	public final static int TESTWARNINGLEVEL_MISSINGRESOURCES = 1;
	public final static int TESTWARNINGLEVEL_TESTINGIMPACTS = 2;
	public final static int TESTWARNINGLEVEL_ALLWARNINGS = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DiagnosticResult() {

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
	public CIM_DiagnosticResult(Vector keyProperties){ 
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
	public CIM_DiagnosticResult(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_DiagSystemCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME);
		
		if (CIMProperty_DiagSystemCreationClassName == null || CIMProperty_DiagSystemCreationClassName.getValue().isEmpty() || CIMProperty_DiagSystemCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_DiagSystemName = this.cimInstance.getProperty(CIM_PROPERTY_DIAGSYSTEMNAME);
		
		if (CIMProperty_DiagSystemName == null || CIMProperty_DiagSystemName.getValue().isEmpty() || CIMProperty_DiagSystemName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_DIAGSYSTEMNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_DiagnosticCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME);
		
		if (CIMProperty_DiagnosticCreationClassName == null || CIMProperty_DiagnosticCreationClassName.getValue().isEmpty() || CIMProperty_DiagnosticCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_DiagnosticName = this.cimInstance.getProperty(CIM_PROPERTY_DIAGNOSTICNAME);
		
		if (CIMProperty_DiagnosticName == null || CIMProperty_DiagnosticName.getValue().isEmpty() || CIMProperty_DiagnosticName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_DIAGNOSTICNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_ExecutionID = this.cimInstance.getProperty(CIM_PROPERTY_EXECUTIONID);
		
		if (CIMProperty_ExecutionID == null || CIMProperty_ExecutionID.getValue().isEmpty() || CIMProperty_ExecutionID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_EXECUTIONID, "Key"});
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
	    
	    if (!(object instanceof CIM_DiagnosticResult)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DiagnosticResult)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DiagnosticResult)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DiagnosticResult)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DiagnosticResult)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DiagnosticResult)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DiagnosticResult)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DiagnosticResult)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DiagnosticResult)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DiagnosticResult)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ManagedSystemElement_CIM_DiagnosticResultForMSEs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICRESULTFORMSE, 
					CIM_ManagedSystemElement.CIM_CLASS_NAME, 
					"Result",
					"SystemElement",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DiagnosticResult.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiagnosticResult.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_DiagnosticResult.Java_Package_List.get(i))).endsWith(".")) {
							CIM_DiagnosticResult.Java_Package_List.setElementAt((String)(CIM_DiagnosticResult.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_DiagnosticResult.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ManagedSystemElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ManagedSystemElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ManagedSystemElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ManagedSystemElement_CIM_DiagnosticResultForMSE_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICRESULTFORMSE, 
					CIM_ManagedSystemElement.CIM_CLASS_NAME, 
					"Result",
					"SystemElement");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ManagedSystemElement.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_DiagnosticTest_CIM_DiagnosticResultForTests(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICRESULTFORTEST, 
					CIM_DiagnosticTest.CIM_CLASS_NAME, 
					"DiagnosticResult",
					"DiagnosticTest",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DiagnosticResult.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiagnosticResult.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_DiagnosticResult.Java_Package_List.get(i))).endsWith(".")) {
							CIM_DiagnosticResult.Java_Package_List.setElementAt((String)(CIM_DiagnosticResult.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_DiagnosticResult.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiagnosticTest(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_DiagnosticTest(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiagnosticTest(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_DiagnosticTest_CIM_DiagnosticResultForTest_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICRESULTFORTEST, 
					CIM_DiagnosticTest.CIM_CLASS_NAME, 
					"DiagnosticResult",
					"DiagnosticTest");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_DiagnosticTest.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_DiagnosticResult_CIM_DiagnosticResultInPackages(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICRESULTINPACKAGE, 
					CIM_DiagnosticResult.CIM_CLASS_NAME, 
					"PackageResult",
					"Result",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DiagnosticResult.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiagnosticResult.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_DiagnosticResult.Java_Package_List.get(i))).endsWith(".")) {
							CIM_DiagnosticResult.Java_Package_List.setElementAt((String)(CIM_DiagnosticResult.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_DiagnosticResult.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiagnosticResult(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_DiagnosticResult(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiagnosticResult(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_DiagnosticResult_CIM_DiagnosticResultInPackage_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICRESULTINPACKAGE, 
					CIM_DiagnosticResult.CIM_CLASS_NAME, 
					"PackageResult",
					"Result");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_DiagnosticResult.CIM_CLASS_NAME)) {
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
	
	// Attribute DiagSystemCreationClassName
	
	public String get_DiagSystemCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DiagSystemCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_DiagSystemCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DiagSystemName
	
	public String get_DiagSystemName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DiagSystemName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMNAME + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_DiagSystemName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGSYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DiagnosticCreationClassName
	
	public String get_DiagnosticCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DiagnosticCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_DiagnosticCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DiagnosticName
	
	public String get_DiagnosticName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DiagnosticName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICNAME + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_DiagnosticName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_DIAGNOSTICNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorCode
	
	public String[] get_ErrorCode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_ERRORCODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ERRORCODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ERRORCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_ErrorCode(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_ERRORCODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ERRORCODE + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_ErrorCode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_ERRORCODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ERRORCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorCount
	
	public UnsignedInt32[] get_ErrorCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_ERRORCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ERRORCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt32[] resultArray = new UnsignedInt32[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt32)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_ErrorCount(UnsignedInt32[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_ERRORCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ERRORCOUNT + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_ErrorCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_ERRORCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EstimatedTimeOfPerforming
	
	public UnsignedInt32 get_EstimatedTimeOfPerforming() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EstimatedTimeOfPerforming(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_EstimatedTimeOfPerforming(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ESTIMATEDTIMEOFPERFORMING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExecutionID
	
	public String get_ExecutionID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_EXECUTIONID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_EXECUTIONID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_EXECUTIONID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExecutionID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_EXECUTIONID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DiagnosticResult.CIM_PROPERTY_EXECUTIONID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_EXECUTIONID + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_ExecutionID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_EXECUTIONID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_EXECUTIONID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HaltOnError
	
	public Boolean get_HaltOnError() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_HALTONERROR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_HALTONERROR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_HALTONERROR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HaltOnError(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_HALTONERROR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_HALTONERROR + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_HaltOnError(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_HALTONERROR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_HALTONERROR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsPackage
	
	public Boolean get_IsPackage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_ISPACKAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ISPACKAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ISPACKAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsPackage(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_ISPACKAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ISPACKAGE + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_IsPackage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_ISPACKAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_ISPACKAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LoopsFailed
	
	public UnsignedInt32 get_LoopsFailed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_LOOPSFAILED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_LOOPSFAILED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_LOOPSFAILED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LoopsFailed(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_LOOPSFAILED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_LOOPSFAILED + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_LoopsFailed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_LOOPSFAILED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_LOOPSFAILED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LoopsPassed
	
	public UnsignedInt32 get_LoopsPassed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_LOOPSPASSED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_LOOPSPASSED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_LOOPSPASSED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LoopsPassed(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_LOOPSPASSED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_LOOPSPASSED + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_LoopsPassed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_LOOPSPASSED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_LOOPSPASSED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherStateDescription
	
	public String get_OtherStateDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_OTHERSTATEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_OTHERSTATEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_OTHERSTATEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherStateDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_OTHERSTATEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_OTHERSTATEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_OtherStateDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_OTHERSTATEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_OTHERSTATEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PercentComplete
	
	public UnsignedInt8 get_PercentComplete() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_PERCENTCOMPLETE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_PERCENTCOMPLETE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_PERCENTCOMPLETE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PercentComplete(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_PERCENTCOMPLETE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_PERCENTCOMPLETE + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_PercentComplete(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_PERCENTCOMPLETE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_PERCENTCOMPLETE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PercentOfTestCoverage
	
	public UnsignedInt8 get_PercentOfTestCoverage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_PERCENTOFTESTCOVERAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_PERCENTOFTESTCOVERAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_PERCENTOFTESTCOVERAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PercentOfTestCoverage(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_PERCENTOFTESTCOVERAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_PERCENTOFTESTCOVERAGE + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_PercentOfTestCoverage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_PERCENTOFTESTCOVERAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_PERCENTOFTESTCOVERAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute QuickMode
	
	public Boolean get_QuickMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_QUICKMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_QUICKMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_QUICKMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_QuickMode(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_QUICKMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_QUICKMODE + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_QuickMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_QUICKMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_QUICKMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReportSoftErrors
	
	public Boolean get_ReportSoftErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_REPORTSOFTERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_REPORTSOFTERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_REPORTSOFTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReportSoftErrors(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_REPORTSOFTERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_REPORTSOFTERRORS + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_ReportSoftErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_REPORTSOFTERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_REPORTSOFTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReportStatusMessages
	
	public Boolean get_ReportStatusMessages() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_REPORTSTATUSMESSAGES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_REPORTSTATUSMESSAGES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_REPORTSTATUSMESSAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReportStatusMessages(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_REPORTSTATUSMESSAGES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_REPORTSTATUSMESSAGES + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_ReportStatusMessages(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_REPORTSTATUSMESSAGES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_REPORTSTATUSMESSAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TestCompletionTime
	
	public Calendar get_TestCompletionTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_TESTCOMPLETIONTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTCOMPLETIONTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTCOMPLETIONTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TestCompletionTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_TESTCOMPLETIONTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTCOMPLETIONTIME + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_TestCompletionTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTCOMPLETIONTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTCOMPLETIONTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute TestResults
	
	public String[] get_TestResults() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_TESTRESULTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTRESULTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTRESULTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_TestResults(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_TESTRESULTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTRESULTS + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_TestResults(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTRESULTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTRESULTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TestStartTime
	
	public Calendar get_TestStartTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_TESTSTARTTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTSTARTTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTSTARTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TestStartTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_TESTSTARTTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTSTARTTIME + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_TestStartTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTSTARTTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTSTARTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute TestState
	
	public UnsignedInt16 get_TestState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_TESTSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TestState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_TESTSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTSTATE + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_TestState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TestWarningLevel
	
	public UnsignedInt16 get_TestWarningLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_TESTWARNINGLEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTWARNINGLEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTWARNINGLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TestWarningLevel(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_TESTWARNINGLEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTWARNINGLEVEL + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_TestWarningLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTWARNINGLEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TESTWARNINGLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeStamp
	
	public Calendar get_TimeStamp() {

		CIMProperty property = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_TIMESTAMP);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TIMESTAMP + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeStamp(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticResult.CIM_PROPERTY_TIMESTAMP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TIMESTAMP + " could not be found");
    		
		} else if (!CIM_DiagnosticResultHelper.isValid_TimeStamp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticResult.CIM_PROPERTY_TIMESTAMP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticResult.CIM_PROPERTY_TIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
