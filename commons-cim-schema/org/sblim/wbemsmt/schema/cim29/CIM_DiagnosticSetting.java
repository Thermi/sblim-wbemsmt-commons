/** 
 * CIM_DiagnosticSetting.java
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
 * Description: Specific diagnostic test parameters and execution instructions are defined by this class. To provide more detailed Settings for a type of test (i.e., additional properties), subclassing is appropriate.
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



public class CIM_DiagnosticSetting extends CIM_Setting  {
	
	public final static String CIM_CLASS_NAME = "CIM_DiagnosticSetting";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICSETTINGFORTEST = "CIM_DiagnosticSettingForTest";
	
	
	/**
	*	When this flag is true, the test will halt after finding the first error.
	*/
	public final static String CIM_PROPERTY_HALTONERROR = "HaltOnError"; //$NON-NLS-1$
	/**
	*	This property, along with the locale information in LocalizationCapabilities and DiagnosticServiceRecord, meets the requirement to specify locale for results produced by a diagnostic service. A locale indicates a particular geographical, political, or cultural region. The Locales property of the DiagnosticSetting class is an array of strings whose entries specify a language to be used in the formulation of information requested by or delivered to a client as a result of running a diagnostic service. It is specified by the client as an input parameter to the RunDiagnostic method, by virtue of its inclusion in this Setting class which is a parameter of the method. A single Setting object may specify more than one Locale. In this case, information MUST be returned in each language specified. 

Each array entry consists of three sub-strings, separated by underscores: 
- The first sub-string is the language code, as specified in ISO639. 
- The second sub-string is the country code, as specified in ISO3166. 
- The third sub-string is a variant, which is vendor specific. 
For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and generally is limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. The language and country codes are required; the variant may be empty.
	*/
	public final static String CIM_PROPERTY_LOCALES = "Locales"; //$NON-NLS-1$
	/**
	*	The LogOptions property is used to specify the types of data that SHOULD be logged by the diagnostic service. Any number of values may be specified in the array. Note that the default behavior is for nothing to be logged. 
The AMOUNT of data to be logged can be controlled for each value selected by specifying a VerbosityLevel value. Verbosity may not apply to all LogOptions values, in which case the default VerbosityLevel of "Standard" SHOULD be used. 
The RecordForLog produced by running a service MUST be tagged with a RecordType that corresponds to one of these log option values. 
Following is a brief description of the available log options: 
* "Other" (value = 1): Details are given in the corresponding OtherLogOptionsDescriptions entry. 
* "Results" (value = 2): Log the results obtained by running the service. This is the most common value for reporting the service results. 
* "Subtests" (value = 3): Log a test summary report upon completion of each subtest and each loop iteration. The summary reports SHOULD state whether the individual subtest or iteration passed or failed and list relevant error codes and respective error counts. 
* "Actions" (value = 4): Log corrective action and instructional messages to guide service personnel; for example, a prioritized list of actions to perform in order to isolate a failure or correct a problem. When ordering steps or prioritizing actions, a number should proceed the text; for example, 1) Do this first, 2) Do this next, etc. 
* "Warnings" (value = 5): Log warning messages; for example, 'device will be taken off line', 'test is long-running' or 'available memory is low'. The VerbosityLevel value specified for the Warnings option is related to the severity of the warnings logged; for instance, one would specify a high level of verbosity to get all warnings logged, regardless of severity, and a low level of verbosity to have only the most severe warnings logged. 
* "Status" (value = 6): Log status messages; for example, state information for the driver, device, or system. 
* "Device Errors" (value = 7): Log errors related to the managed element being serviced. 
* "Service Errors" (value = 8): Log errors related to the service itself rather than the element being serviced, such as 'Resource Allocaton Failure'. 
* "Setting Data" (value=9): Log the property values of the DiagnosticSetting object used to configure the service. 
* "Statistics" (value = 10): Log statistical messages; for example, packets sent per second. 
* "Hardware Configuration" (value = 11): Log messages that contain information about the hardware configuration as viewed by the service; for example, vendor, version, FRU identification, and location information. The format and contents of this property is element dependent. Examples are: SCSI ID, LPTx, PCI Slot Number, and Dimm#. 
* "Software Configuration" (value = 12): Log messages that contain information about the software environment as viewed by the service; for example, the name and version of all the critical software elements controlling the device under test. Each configuration message SHOULD have the following common format: Element name; element type; manufacturer name; version; for example, 'Miniport driver; SCSI; Intel; Version 1.2'. 
* "Reference" (value = 13): Log the keys of an CIM object of of interest; for example, the element under test, or a data file. 
* "Debug" (value = 14): Log debug messages. These messages are vendor specific.
	*/
	public final static String CIM_PROPERTY_LOGOPTIONS = "LogOptions"; //$NON-NLS-1$
	/**
	*	The LogStorage setting property indicates which types of supported storage should be used by the Diagnostic Service for logging of the data specified in LogOptions. 
The values are: 
"DiagnosticRecordLog" (Value = 2): Use the DiagnosticRecordLog and DiagnosticRecord classes. 
"MessageLog" (Value = 4): Use the MessageLog class and its methods. 
"File" (Value = 5): Write data to a file.
	*/
	public final static String CIM_PROPERTY_LOGSTORAGE = "LogStorage"; //$NON-NLS-1$
	/**
	*	Array entries contain parameters corresponding to entries in the LoopControl array, limiting the number of times a test should be repeated with a single invocation of a test method by a CIM client.
	*/
	public final static String CIM_PROPERTY_LOOPCONTROLPARAMETER = "LoopControlParameter"; //$NON-NLS-1$
	/**
	*	LoopControl, used in conjunction with LoopControlParameter, sets one or more loop control mechanisms that limits the number of times a test should be repeated with a single invocation of a test method by a CIM client. There is an array-positional correspondence between LoopControl entries & LoopControlParameter entries. The entries in these coupled arrays of loop controls can be used in a logical OR fashion to achieve the desired loop control. For example, if a client wants to loop a test 1000 times, but quit if a timer runs out, it could set both controls into the LoopControl array as two separate entries in each array. The looping test will terminate when the first of the two ORed conditions are met. 
The descriptions for each loop control are given below: 
Unknown (= 0) 
Other (= 1) : Additional detail may be found in OtherLoopControlDescriptions. 
Continuous (= 2) : The corresponding LoopControl Parameter is ignored and the test will execute continuously. Tests that use this control should also support DiscontinueTest. 
Count(=3) : The corresponding LoopControlParameter is interpreted as a loop count (uint32), indicating the number of times the test should be repeated with a single invocation of a test method by a CIM client. 
Timer (= 4) : The corresponding LoopControlParameter is interpreted as an initial value (uint32) for a test loop timer, given in seconds. The looping is terminated when this timer has lapsed. 
ErrorCount (= 5) : The corresponding LoopControl Parameter is interpreted as an error count (uint32). The loop will continue until the number of errors that have occurred exceeds the ErrorCount. Note: the ErrorCount only refers to hard test errors; it does not include soft errors or warnings.
	*/
	public final static String CIM_PROPERTY_LOOPCONTROL = "LoopControl"; //$NON-NLS-1$
	/**
	*	Provides additional information regarding the types of test messages that are logged when the property LogOptions includes the value 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS = "OtherLogOptionsDescriptions"; //$NON-NLS-1$
	/**
	*	This property provides additional information for LogStorage when the corresponding value is set to 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERLOGSTORAGEDESCRIPTIONS = "OtherLogStorageDescriptions"; //$NON-NLS-1$
	/**
	*	This property is deprecated and replaced with an array. 
It provides additional information for LoopControl when its value is set to 1 ('Other').
	*/
	public final static String CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTION = "OtherLoopControlDescription"; //$NON-NLS-1$
	/**
	*	This property provides additional information for LoopControl when the corresponding value is set to 1 ('Other').
	*/
	public final static String CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS = "OtherLoopControlDescriptions"; //$NON-NLS-1$
	/**
	*	Requests the diagnostic software to reduce test coverage to the specified percentage. For example, a hard drive scan test could be asked to run at 50%. The most effective way to accomplish this is for the test software to scan every other track, as opposed to only scanning the first half of a drive. It is assumed that the effectiveness of the test is impacted proportional to the percentage of testing requested. Permissible values for this property range from 0 to 100.
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
	*	The ResultPersistence property is a directive from a diagnostic client to a diagnostic provider. It allows the client to specify to the diagnostic service provider how long to persist the messages that result from execution of a diagnostic service. This applies to instances of DiagnosticResult as well as the preferred use of DiagnosticServiceRecord. The timeout period starts upon completion of the diagnostic action described by the DiagnosticService. 

Here is a summary of the choices and behaviors for different ResultPersistence values: 
0 = "No Persistence": 
Setting the timer to zero tells the provider not to persist the diagnostic result. The diagnostic information is only available while the diagnostic is executing or at its conclusion. 
Value > 0 and < 0xFFFFFFFF = "Persist With TimeOut": 
Setting the ResultPersistenceOption to a integer will cause the DiagnosticResult to be persisted for that number of seconds. At the end of that time, the DiagnosticResult may be deleted by the diagnostic service provider. 
0xFFFFFFFF = "Persist Forever": 
By setting the timeout value to the very large value, 0xFFFFFFFF, the provider shall persist results forever. In this case, the client MUST bear the responsibility for deleting them.
	*/
	public final static String CIM_PROPERTY_RESULTPERSISTENCE = "ResultPersistence"; //$NON-NLS-1$
	/**
	*	In order to ensure uniqueness within the NameSpace, the value of SettingID SHOULD be constructed using the following 'preferred' algorithm: 
<OrgID>:<LocalID> 
Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the SettingID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in SettingID MUST appear between <OrgID> and <LocalID>. 
<LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant SettingID is not re-used across any SettingIDs produced by this or other providers for this instance's NameSpace. 
A preferred value for <LocalID> is a timestamp (CIM DateTime). For example, ACME:19980525133015.0000000-300
	*/
	public final static String CIM_PROPERTY_SETTINGID = "SettingID"; //$NON-NLS-1$
	/**
	*	This property is being deprecated because the TestWarningLevel and LogOptions properties serve the same purpose. It is deprecated in lieu of using the LogOptions ('Warnings') property in conjunction with VerbosityLevel to specify this information. The 'Missing Resources' and 'Testing Impacts' values are not included directly in LogOptions, but they are expected to be recorded in the resulting DiagnosticServiceRecord object. 

Sets the level of warning messages to be logged. 
If for example no warning information is required, the level would be set to "No Warnings" (value=0). Using "Missing Resources" (value=1) will cause warnings to be generated when required resources or hardware are not found. Setting the value to 2, "Testing Impacts", results in both missing resources and 'test impact' warnings (for example, multiple retries required) to be reported.
	*/
	public final static String CIM_PROPERTY_TESTWARNINGLEVEL = "TestWarningLevel"; //$NON-NLS-1$
	/**
	*	A client may want to specify the desired volume or detail logged by a diagnostic service. This property is applied to a corresponding logging option, acting as a qualifier on its description. Three levels of verbosity are defined as follows: 
* "Minimum" (value=2): Specified if the least amount of information is desired; for example, Pass or Fail. 
* "Standard" (value=3): This is the standard level of messaging provided by the service. It is the form most likely to be used if no verbosity value is specified (default). 
* "Full" (value=4): Specified when all information, regardless of size, is desired. 
Note that VerbosityLevel is a subjective property and relates to the degree of detail, not an absolute metric. A client simply specifies its desired level of detail and the provider publishes its data in accordance with this desired level of detail. 
Verbosity may not apply to all LogOptions values, in which case the default VerbosityLevel of "Standard" SHOULD be used.
	*/
	public final static String CIM_PROPERTY_VERBOSITYLEVEL = "VerbosityLevel"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_HALTONERROR);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALES);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGOPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGSTORAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOOPCONTROLPARAMETER);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOOPCONTROL);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLOGSTORAGEDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERCENTOFTESTCOVERAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_QUICKMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPORTSOFTERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPORTSTATUSMESSAGES);
		CIM_PropertyNameList.add(CIM_PROPERTY_RESULTPERSISTENCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SETTINGID);
		CIM_PropertyNameList.add(CIM_PROPERTY_TESTWARNINGLEVEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_VERBOSITYLEVEL);
				
		for (int i = 0; i < CIM_Setting.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HALTONERROR)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALES)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGOPTIONS)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGSTORAGE)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOOPCONTROLPARAMETER)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOOPCONTROL)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLOGSTORAGEDESCRIPTIONS)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTION)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PERCENTOFTESTCOVERAGE)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_QUICKMODE)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REPORTSOFTERRORS)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REPORTSTATUSMESSAGES)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RESULTPERSISTENCE)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SETTINGID)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TESTWARNINGLEVEL)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VERBOSITYLEVEL)){
				continue;
			}
			
			CIM_DiagnosticSetting.CIM_PropertyNameList.add(CIM_Setting.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HALTONERROR, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGOPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGSTORAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOOPCONTROLPARAMETER, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOOPCONTROL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLOGSTORAGEDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERCENTOFTESTCOVERAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_QUICKMODE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPORTSOFTERRORS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPORTSTATUSMESSAGES, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESULTPERSISTENCE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SETTINGID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TESTWARNINGLEVEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VERBOSITYLEVEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_Setting.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HALTONERROR)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALES)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGOPTIONS)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGSTORAGE)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOOPCONTROLPARAMETER)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOOPCONTROL)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLOGSTORAGEDESCRIPTIONS)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTION)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PERCENTOFTESTCOVERAGE)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_QUICKMODE)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REPORTSOFTERRORS)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REPORTSTATUSMESSAGES)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RESULTPERSISTENCE)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SETTINGID)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TESTWARNINGLEVEL)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VERBOSITYLEVEL)){
				continue;
			}
			
			CIM_DiagnosticSetting.CIM_PropertyList.add(CIM_Setting.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Setting.Java_Package_List.size(); i++) {
			if (((String)CIM_Setting.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Setting.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LOGOPTIONS = {"Unknown","Other","Results","Subtests","Actions","Warnings","Status","Device Errors","Service Errors","Setting Data","Statistics","Hardware Configuration","Software Configuration","References","Debug","No Log Options"};
	public final static String[] CIM_VALUEMAP_LOGSTORAGE = {"Unknown","Other","DiagnosticRecordLog","MessageLog","File"};
	public final static String[] CIM_VALUEMAP_LOOPCONTROL = {"Unknown","Other","Continuous","Count","Timer","ErrorCount"};
	public final static String[] CIM_VALUEMAP_TESTWARNINGLEVEL = {"No Warnings","Missing Resources","Testing Impacts","All Warnings"};
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
	public final static int LOGOPTIONS_NOLOGOPTIONS = 15;
	
	public final static int LOGSTORAGE_UNKNOWN = 0;
	public final static int LOGSTORAGE_OTHER = 1;
	public final static int LOGSTORAGE_DIAGNOSTICRECORDLOG = 2;
	public final static int LOGSTORAGE_MESSAGELOG = 3;
	public final static int LOGSTORAGE_FILE = 4;
	
	public final static int LOOPCONTROL_UNKNOWN = 0;
	public final static int LOOPCONTROL_OTHER = 1;
	public final static int LOOPCONTROL_CONTINUOUS = 2;
	public final static int LOOPCONTROL_COUNT = 3;
	public final static int LOOPCONTROL_TIMER = 4;
	public final static int LOOPCONTROL_ERRORCOUNT = 5;
	
	public final static int TESTWARNINGLEVEL_NOWARNINGS = 0;
	public final static int TESTWARNINGLEVEL_MISSINGRESOURCES = 1;
	public final static int TESTWARNINGLEVEL_TESTINGIMPACTS = 2;
	public final static int TESTWARNINGLEVEL_ALLWARNINGS = 3;
	
	public final static int VERBOSITYLEVEL_MINIMUM = 2;
	public final static int VERBOSITYLEVEL_STANDARD = 3;
	public final static int VERBOSITYLEVEL_FULL = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DiagnosticSetting() {

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
	public CIM_DiagnosticSetting(Vector keyProperties){ 
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
	public CIM_DiagnosticSetting(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_SettingID = this.cimInstance.getProperty(CIM_PROPERTY_SETTINGID);
		
		if (CIMProperty_SettingID == null || CIMProperty_SettingID.getValue().isEmpty() || CIMProperty_SettingID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SETTINGID, "Key"});
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
	    
	    if (!(object instanceof CIM_DiagnosticSetting)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DiagnosticSetting)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DiagnosticSetting)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DiagnosticSetting)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DiagnosticSetting)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DiagnosticSetting)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DiagnosticSetting)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DiagnosticSetting)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DiagnosticSetting)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DiagnosticSetting)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_DiagnosticTest_CIM_DiagnosticSettingForTests(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICSETTINGFORTEST, 
					CIM_DiagnosticTest.CIM_CLASS_NAME, 
					"Setting",
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
				
					for (int i = 0; clazz == null && i < CIM_DiagnosticSetting.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiagnosticSetting.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_DiagnosticSetting.Java_Package_List.get(i))).endsWith(".")) {
							CIM_DiagnosticSetting.Java_Package_List.setElementAt((String)(CIM_DiagnosticSetting.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_DiagnosticSetting.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_DiagnosticTest_CIM_DiagnosticSettingForTest_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICSETTINGFORTEST, 
					CIM_DiagnosticTest.CIM_CLASS_NAME, 
					"Setting",
					"Element");
		
		
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

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute HaltOnError
	
	public Boolean get_HaltOnError() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_HALTONERROR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_HALTONERROR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_HALTONERROR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HaltOnError(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_HALTONERROR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_HALTONERROR + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_HaltOnError(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_HALTONERROR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_HALTONERROR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Locales
	
	public String[] get_Locales() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_LOCALES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOCALES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOCALES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_Locales(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_LOCALES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOCALES + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_Locales(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOCALES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOCALES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LogOptions
	
	public UnsignedInt16[] get_LogOptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_LOGOPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOGOPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOGOPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_LOGOPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOGOPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_LogOptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOGOPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOGOPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LogStorage
	
	public UnsignedInt16[] get_LogStorage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_LOGSTORAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOGSTORAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOGSTORAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_LogStorage(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_LOGSTORAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOGSTORAGE + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_LogStorage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOGSTORAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOGSTORAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LoopControlParameter
	
	public String[] get_LoopControlParameter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROLPARAMETER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROLPARAMETER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROLPARAMETER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROLPARAMETER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROLPARAMETER + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_LoopControlParameter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROLPARAMETER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROLPARAMETER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LoopControl
	
	public UnsignedInt16[] get_LoopControl() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROL + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_LoopControl(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_LOOPCONTROL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLogOptionsDescriptions
	
	public String[] get_OtherLogOptionsDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_OtherLogOptionsDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGOPTIONSDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLogStorageDescriptions
	
	public String[] get_OtherLogStorageDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGSTORAGEDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGSTORAGEDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGSTORAGEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherLogStorageDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGSTORAGEDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGSTORAGEDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_OtherLogStorageDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGSTORAGEDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOGSTORAGEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLoopControlDescription
	
	public String get_OtherLoopControlDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherLoopControlDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTION + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_OtherLoopControlDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLoopControlDescriptions
	
	public String[] get_OtherLoopControlDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_OtherLoopControlDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_OTHERLOOPCONTROLDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PercentOfTestCoverage
	
	public UnsignedInt8 get_PercentOfTestCoverage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_PERCENTOFTESTCOVERAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_PERCENTOFTESTCOVERAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_PERCENTOFTESTCOVERAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PercentOfTestCoverage(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_PERCENTOFTESTCOVERAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_PERCENTOFTESTCOVERAGE + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_PercentOfTestCoverage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_PERCENTOFTESTCOVERAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_PERCENTOFTESTCOVERAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute QuickMode
	
	public Boolean get_QuickMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_QUICKMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_QUICKMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_QUICKMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_QuickMode(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_QUICKMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_QUICKMODE + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_QuickMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_QUICKMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_QUICKMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReportSoftErrors
	
	public Boolean get_ReportSoftErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSOFTERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSOFTERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSOFTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReportSoftErrors(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSOFTERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSOFTERRORS + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_ReportSoftErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSOFTERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSOFTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReportStatusMessages
	
	public Boolean get_ReportStatusMessages() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSTATUSMESSAGES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSTATUSMESSAGES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSTATUSMESSAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReportStatusMessages(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSTATUSMESSAGES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSTATUSMESSAGES + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_ReportStatusMessages(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSTATUSMESSAGES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_REPORTSTATUSMESSAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ResultPersistence
	
	public UnsignedInt32 get_ResultPersistence() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_RESULTPERSISTENCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_RESULTPERSISTENCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_RESULTPERSISTENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ResultPersistence(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_RESULTPERSISTENCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_RESULTPERSISTENCE + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_ResultPersistence(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_RESULTPERSISTENCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_RESULTPERSISTENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SettingID
	
	public String get_SettingID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_SETTINGID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_SETTINGID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_SETTINGID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SettingID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_SETTINGID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DiagnosticSetting.CIM_PROPERTY_SETTINGID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_SETTINGID + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_SettingID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_SETTINGID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_SETTINGID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TestWarningLevel
	
	public UnsignedInt16 get_TestWarningLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_TESTWARNINGLEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_TESTWARNINGLEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_TESTWARNINGLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TestWarningLevel(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_TESTWARNINGLEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_TESTWARNINGLEVEL + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_TestWarningLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_TESTWARNINGLEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_TESTWARNINGLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VerbosityLevel
	
	public UnsignedInt16[] get_VerbosityLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_VERBOSITYLEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_VERBOSITYLEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_VERBOSITYLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticSetting.CIM_PROPERTY_VERBOSITYLEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_VERBOSITYLEVEL + " could not be found");
    		
		} else if (!CIM_DiagnosticSettingHelper.isValid_VerbosityLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticSetting.CIM_PROPERTY_VERBOSITYLEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticSetting.CIM_PROPERTY_VERBOSITYLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
