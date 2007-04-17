/** 
 * CIM_DiagnosticTest.java
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
 * Description:  The CIM_DiagnosticTest class represents the framework for running diagnostic
 * tests. Specific diagnostic tests may be defined by subclassing and/or
 * instantiating this object. To provide more detail for a type of test(s) (i.e,
 * additional properties and methods), subclassing is appropriate. When a
 * DiagnosticTest can be simultaneously executed against several elements, then
 * DiagnosticTest may launch a ConcreteJob to represent each execution.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMArgument;
import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  The CIM_DiagnosticTest class represents the framework for running diagnostic
 * tests. Specific diagnostic tests may be defined by subclassing and/or
 * instantiating this object. To provide more detail for a type of test(s) (i.e,
 * additional properties and methods), subclassing is appropriate. When a
 * DiagnosticTest can be simultaneously executed against several elements, then
 * DiagnosticTest may launch a ConcreteJob to represent each execution.
 */
public class CIM_DiagnosticTest extends CIM_DiagnosticService  {
	
	public final static String CIM_CLASS_NAME = "CIM_DiagnosticTest"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICRESULTFORTEST = "CIM_DiagnosticResultForTest"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICSETTINGFORTEST = "CIM_DiagnosticSettingForTest"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICTESTFORMSE = "CIM_DiagnosticTestForMSE"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICTESTINPACKAGE = "CIM_DiagnosticTestInPackage"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICTESTSOFTWARE = "CIM_DiagnosticTestSoftware"; //$NON-NLS-1$
	
	
	/**
	*	The descriptions for each Characteristic are below: 

* "Is Exclusive" (value=2) is specified for the test module only if the diagnostic cannot run more than one test at a time, regardless of how many SystemElements are supported. Typically, this occurs when hardware or software constraints prevent the test from running as multiple, concurrent instances. If the diagnostic can be run against multiple SystemElements, but only once per Element, then set the IsExclusiveForMSE boolean property on the appropriate instances of DiagnosticTestForMSE. 

* If "Is Interactive" (value=3) is set, then the diagnostic displays a message either before, during or after testing. 

* Set "Is Destructive" (value=4) if the diagnostic will destroy data, or reconfigure the Element that is being tested. 

* "Is Risky" (value=5) indicates that data loss may occur if the test is interrupted. Some tests make copies of data, perform the test, and restore the data returning the tested entity to its previous configuration. If the test is interrupted, then loss of data or reconfiguration of the tested ManagedSystemElement may occur. 

* If "Is Package" (value=6) is set, this test is actually a set of lower level diagnostics, that are packaged together by the test. This packaging is implemented by the diagnostic test, not aggregated by CIM. Information and results associated with the individual tests in the package may be requested by using the "Subtests" value in the DiagnosticSetting.LogOptions array. 

(value=7) was "Supports PercentOfTestCoverage" in Version 2.6. Value = 7 is being deprecated. Instead, it should be described in DiagnosticServiceCapabilities. 

"Is Synchronous" (value=8) indicates that this diagnostic service will complete before the RunDiagnostic method returns to the caller. A Job is still created that can be accessed by the client for accounting purposes, but the ability to track progress and status of the Job are lost. Additionally, in certain environments, the client may be "blocked" from further action until the service completes. 
"Media Required" (value=9) indicates that this diagnostic service requires that media be inserted into the device in order to perform the service. "Additional Hardware Required" (value=10) indicates that this diagnostic service requires that some additional hardware is installed (e.g., wrap plug) in order to perform the service.
	*/
	public final static String CIM_PROPERTY_CHARACTERISTICS = "Characteristics"; //$NON-NLS-1$
	/**
	*	This property is being deprecated. The boolean Started property inherited from CIM_Service should be used instead. 
If this test is currently being performed, the InUse property is set to TRUE. To determine which ManagedSystem Element is being tested, query the DiagnosticResult objects associated with this test (query DiagnosticResultForTest), and for which the TestState equals 4 ("In Progress"). The DiagnosticResult object is associated with the System Element under test, using DiagnosticResultForMSE.
	*/
	public final static String CIM_PROPERTY_ISINUSE = "IsInUse"; //$NON-NLS-1$
	/**
	*	Provides additional information for the Characteristic when its value is set to 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERCHARACTERISTICDESCRIPTION = "OtherCharacteristicDescription"; //$NON-NLS-1$
	/**
	*	OtherCharacteristicsDescriptions is a Bag array that contains an element with additional information for each Characteristics element with a value of 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERCHARACTERISTICSDESCRIPTIONS = "OtherCharacteristicsDescriptions"; //$NON-NLS-1$
	/**
	*	OtherTestTypesDescriptions is an array that contains an element with additional information for each TestTypes element with a value of 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERTESTTYPESDESCRIPTIONS = "OtherTestTypesDescriptions"; //$NON-NLS-1$
	/**
	*	This property is being deprecated and replaced with a more general method for indicating Managed Elements that are affected by this Test. The DiagnosticService parent has a ServiceAffectsElement association to a Managed Element for this purpose. 
The "Expensive" qualifier can be applied to this class and its RunTest method. If so, the ResourcesUsed property describes the resources that are capitalized, based on a default setup for the test. Multiple resources can be specified since the property is an array.
	*/
	public final static String CIM_PROPERTY_RESOURCESUSED = "ResourcesUsed"; //$NON-NLS-1$
	/**
	*	The descriptions for each test type are below: 

* If "Functional" (value=2) is set, this tests one, more or all the functionality of the element. 

* If "Stress" (value=3) is set, this test is a stress test or exerciser for the element. 

* If "Health Check" (value=4) is set, this test validates the current health of the element. 

* If "Access Test" (value=5) is set, this test verifies the element is accessible to the system and user. This would include access through the OS as a user would access the element. 

* If "Media Verify" (value=6) is set, this test verifies the media for the element. This does not validate that specific data is correctly written on the media or even if data can be written to the media, but verifies that the media itself has no faults.
	*/
	public final static String CIM_PROPERTY_TESTTYPES = "TestTypes"; //$NON-NLS-1$
	
	
	/**
	*	This method is deprecated in favor of using the corresponding functionality contained in the Log class, this is consistant with the deprecation of the Result class in favor of Log. 
Execution of this method will delete all instances of the DiagnosticResultForMSE object, for this DiagnosticTest and the specified ManagedSystemElement (defined using the SystemElement input parameter). The DiagnosticResults referenced in the DiagnosticResultForMSE instances will be deleted. Also the association DiagnosticResultForTest that refers to the DiagnosticResult object, and this test will be deleted. 
One output parameter is defined - ResultsNotCleared - which is a string array that lists the keys of the DiagnosticResults which could not be deleted. This information enables those Results to be revisited and either manually removed, or other corrective action taken. 
The method's return codes are expected to adhere to the XML return codes as they are introduced. Currently, the standard return values are: 
0 = OK (function succeeded, but the test itself may have failed) 
1 = Unspecified Error (function failed for unspecified reasons) 
2 = Not Implemented (function is not implemented for this instance) 
3 = Out Of Resources (component could not allocate required resources, e.g. memory, disk space, etc.) 
In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_CLEARRESULTS = "ClearResults";
	/**
	*	After invocation of this method and its completion, the specified test(s) will be discontinued for the indicated ManagedSystemElement (defined by the SystemElement input parameter). The test to discontinue is specified using the Result input parameter. If all instances of this test should be stopped for the SystemElement, then the Result reference should be NULL. Upon completion of the method, test status and other information (such as PercentComplete) will be stored in the DiagnosticResult instance defined by the Result input parameter. The output parameter, TestingStopped, is used as follows: 
Set to TRUE if testing was successfully stopped. 
Set to FALSE if the current test(s) can not be stopped. 
If set to FALSE, testing will stop when the diagnostic is able to do so safely. To determine if/when the testing is stopped, check the TestState property in the DiagnosticResult instance defined by the Result parameter. TestState will change from "In Progress" to "Stopped" (from 4 to 5). 
The method's return codes are expected to adhere to the XML return codes as they are introduced. Currently, the standard return values are: 
0 = OK (function succeeded, but the test itself may have failed 
1 = Unspecified Error (function failed for unspecified reasons) 
2 = Not Implemented (function is not implemented for this instance) 
3 = Out Of Resources (component could not allocate required resources, e.g. memory, disk space, etc.) 
In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_DISCONTINUETEST = "DiscontinueTest";
	/**
	*	This method is being deprecated and replaced by the RunDiagnostic method in the DiagnosticService class. 
The RunTest method executes this test for the specified ManagedSystemElement. The use of this method has been deprecated. Instead, the RunDiagnostic method (inherited from DiagnosticService) should be used. 
The RunTest method executes this test for the specified ManagedSystemElement (defined using the SystemElement input parameter). Results of the test are stored in a Diagnostic Result object, a reference to which is returned as the Result output parameter. How the test should execute, i.e. its settings, is defined in a DiagnosticSetting object (or by a subclass of DiagnosticSetting). A reference to a Setting object is specified using the Setting input parameter. If a reference is not passed into the method, then a default DiagnosticSetting may be used. This default Setting is associated with the DiagnoticTest using the DefaultSetting relationship of the Core Model. 
When RunTest starts execution, the settings, which are time sensitive, should be evaluated and captured. This is suggested since the DiagnosticSetting object can be modified at any time, and therefore the current test settings could be lost. 
The method's return codes are expected to adhere to the XML return codes as they are introduced. Currently, the standard return values are: 
0 = OK (function succeeded, but the test itself may have failed 
1 = Unspecified Error (function failed for unspecified reasons) 
2 = Not Implemented (function is not implemented for this instance) 
3 = Out Of Resources (component could not allocate required resources, e.g. memory, disk space, etc.) 
In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_RUNTEST = "RunTest";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CHARACTERISTICS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISINUSE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCHARACTERISTICDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCHARACTERISTICSDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERTESTTYPESDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RESOURCESUSED);
		CIM_PropertyNameList.add(CIM_PROPERTY_TESTTYPES);
				
		for (int i = 0; i < CIM_DiagnosticService.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_DiagnosticService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHARACTERISTICS)||
				((String)CIM_DiagnosticService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISINUSE)||
				((String)CIM_DiagnosticService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCHARACTERISTICDESCRIPTION)||
				((String)CIM_DiagnosticService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCHARACTERISTICSDESCRIPTIONS)||
				((String)CIM_DiagnosticService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERTESTTYPESDESCRIPTIONS)||
				((String)CIM_DiagnosticService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RESOURCESUSED)||
				((String)CIM_DiagnosticService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TESTTYPES)){
				continue;
			}
			
			CIM_DiagnosticTest.CIM_PropertyNameList.add(CIM_DiagnosticService.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHARACTERISTICS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISINUSE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCHARACTERISTICDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCHARACTERISTICSDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERTESTTYPESDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESOURCESUSED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TESTTYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_DiagnosticService.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_DiagnosticService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHARACTERISTICS)||
				((CIMProperty)CIM_DiagnosticService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISINUSE)||
				((CIMProperty)CIM_DiagnosticService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCHARACTERISTICDESCRIPTION)||
				((CIMProperty)CIM_DiagnosticService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCHARACTERISTICSDESCRIPTIONS)||
				((CIMProperty)CIM_DiagnosticService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERTESTTYPESDESCRIPTIONS)||
				((CIMProperty)CIM_DiagnosticService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RESOURCESUSED)||
				((CIMProperty)CIM_DiagnosticService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TESTTYPES)){
				continue;
			}
			
			CIM_DiagnosticTest.CIM_PropertyList.add(CIM_DiagnosticService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_DiagnosticService.Java_Package_List.size(); i++) {
			if (((String)CIM_DiagnosticService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_DiagnosticService.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CHARACTERISTICS = {"Unknown","Other","Is Exclusive","Is Interactive","Is Destructive","Is Risky","Is Package","Reserved","Is Synchronous","Media Required","Additional Hardware Required"};
	public final static String[] CIM_VALUEMAP_RESOURCESUSED = {"CPU","Memory","Hard Disk","CDROM","Floppy","PCI Bus","USB Bus","1394 Bus","SCSI Bus","IDE Bus","Network","ISA Bus","EISA Bus","VESA Bus","PCMCIA Bus","CardBus","Access.bus","NuBus","AGP","VME Bus","Sbus IEEE 1396-1993","MCA Bus","GIO Bus","XIO Bus","HIO Bus","PMC Bus","SIO Bus"};
	public final static String[] CIM_VALUEMAP_TESTTYPES = {"Unknown","Other","Functional","Stress","Health Check","Access Test","Media Verify","DMTF Reserved","Vendor Reserved"};
	
	
	public final static int CHARACTERISTICS_UNKNOWN = 0;
	public final static int CHARACTERISTICS_OTHER = 1;
	public final static int CHARACTERISTICS_ISEXCLUSIVE = 2;
	public final static int CHARACTERISTICS_ISINTERACTIVE = 3;
	public final static int CHARACTERISTICS_ISDESTRUCTIVE = 4;
	public final static int CHARACTERISTICS_ISRISKY = 5;
	public final static int CHARACTERISTICS_ISPACKAGE = 6;
	public final static int CHARACTERISTICS_RESERVED = 7;
	public final static int CHARACTERISTICS_ISSYNCHRONOUS = 8;
	public final static int CHARACTERISTICS_MEDIAREQUIRED = 9;
	public final static int CHARACTERISTICS_ADDITIONALHARDWAREREQUIRED = 10;
	
	public final static int RESOURCESUSED_CPU = 2;
	public final static int RESOURCESUSED_MEMORY = 3;
	public final static int RESOURCESUSED_HARDDISK = 4;
	public final static int RESOURCESUSED_CDROM = 5;
	public final static int RESOURCESUSED_FLOPPY = 6;
	public final static int RESOURCESUSED_PCIBUS = 7;
	public final static int RESOURCESUSED_USBBUS = 8;
	public final static int RESOURCESUSED_1394BUS = 9;
	public final static int RESOURCESUSED_SCSIBUS = 10;
	public final static int RESOURCESUSED_IDEBUS = 11;
	public final static int RESOURCESUSED_NETWORK = 12;
	public final static int RESOURCESUSED_ISABUS = 13;
	public final static int RESOURCESUSED_EISABUS = 14;
	public final static int RESOURCESUSED_VESABUS = 15;
	public final static int RESOURCESUSED_PCMCIABUS = 16;
	public final static int RESOURCESUSED_CARDBUS = 17;
	public final static int RESOURCESUSED_ACCESS_BUS = 18;
	public final static int RESOURCESUSED_NUBUS = 19;
	public final static int RESOURCESUSED_AGP = 20;
	public final static int RESOURCESUSED_VMEBUS = 21;
	public final static int RESOURCESUSED_SBUSIEEE1396_1993 = 22;
	public final static int RESOURCESUSED_MCABUS = 23;
	public final static int RESOURCESUSED_GIOBUS = 24;
	public final static int RESOURCESUSED_XIOBUS = 25;
	public final static int RESOURCESUSED_HIOBUS = 26;
	public final static int RESOURCESUSED_PMCBUS = 27;
	public final static int RESOURCESUSED_SIOBUS = 28;
	
	public final static String TESTTYPES_UNKNOWN = "0";
	public final static String TESTTYPES_OTHER = "1";
	public final static String TESTTYPES_FUNCTIONAL = "2";
	public final static String TESTTYPES_STRESS = "3";
	public final static String TESTTYPES_HEALTHCHECK = "4";
	public final static String TESTTYPES_ACCESSTEST = "5";
	public final static String TESTTYPES_MEDIAVERIFY = "6";
	public final static String TESTTYPES_DMTFRESERVED = "..";
	public final static String TESTTYPES_VENDORRESERVED = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DiagnosticTest() {

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
	public CIM_DiagnosticTest(Vector keyProperties){ 
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
	public CIM_DiagnosticTest(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DiagnosticTest)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DiagnosticTest)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DiagnosticTest)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DiagnosticTest)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DiagnosticTest)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DiagnosticTest)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DiagnosticTest)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DiagnosticTest)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DiagnosticTest)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DiagnosticTest)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_DiagnosticResult_CIM_DiagnosticResultForTests(CIMClient cimClient,
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
					CIM_DiagnosticResult.CIM_CLASS_NAME, 
					"DiagnosticTest", //$NON-NLS-1$
					"DiagnosticResult", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DiagnosticTest.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiagnosticTest.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_DiagnosticTest.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_DiagnosticTest.Java_Package_List.setElementAt((String)(CIM_DiagnosticTest.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_DiagnosticTest.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_DiagnosticResult_CIM_DiagnosticResultForTest_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICRESULTFORTEST, 
					CIM_DiagnosticResult.CIM_CLASS_NAME, 
					"DiagnosticTest", //$NON-NLS-1$
					"DiagnosticResult"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_CIM_DiagnosticSetting_CIM_DiagnosticSettingForTests(CIMClient cimClient,
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
					CIM_DiagnosticSetting.CIM_CLASS_NAME, 
					"Element", //$NON-NLS-1$
					"Setting", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DiagnosticTest.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiagnosticTest.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_DiagnosticTest.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_DiagnosticTest.Java_Package_List.setElementAt((String)(CIM_DiagnosticTest.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_DiagnosticTest.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiagnosticSetting(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_DiagnosticSetting(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiagnosticSetting(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_DiagnosticSetting_CIM_DiagnosticSettingForTest_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICSETTINGFORTEST, 
					CIM_DiagnosticSetting.CIM_CLASS_NAME, 
					"Element", //$NON-NLS-1$
					"Setting"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_DiagnosticSetting.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_ManagedSystemElement_CIM_DiagnosticTestForMSEs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICTESTFORMSE, 
					CIM_ManagedSystemElement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_DiagnosticTest.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiagnosticTest.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_DiagnosticTest.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_DiagnosticTest.Java_Package_List.setElementAt((String)(CIM_DiagnosticTest.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_DiagnosticTest.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_ManagedSystemElement_CIM_DiagnosticTestForMSE_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICTESTFORMSE, 
					CIM_ManagedSystemElement.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_CIM_DiagnosticTest_CIM_DiagnosticTestInPackages(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICTESTINPACKAGE, 
					CIM_DiagnosticTest.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_DiagnosticTest.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiagnosticTest.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_DiagnosticTest.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_DiagnosticTest.Java_Package_List.setElementAt((String)(CIM_DiagnosticTest.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_DiagnosticTest.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_DiagnosticTest_CIM_DiagnosticTestInPackage_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICTESTINPACKAGE, 
					CIM_DiagnosticTest.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_CIM_SoftwareElement_CIM_DiagnosticTestSoftwares(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICTESTSOFTWARE, 
					CIM_SoftwareElement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_DiagnosticTest.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiagnosticTest.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_DiagnosticTest.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_DiagnosticTest.Java_Package_List.setElementAt((String)(CIM_DiagnosticTest.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_DiagnosticTest.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_SoftwareElement_CIM_DiagnosticTestSoftware_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIAGNOSTICTESTSOFTWARE, 
					CIM_SoftwareElement.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
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
	
	// Attribute Characteristics
	
	public UnsignedInt16[] get_Characteristics() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_CHARACTERISTICS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_CHARACTERISTICS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_CHARACTERISTICS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Characteristics(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_CHARACTERISTICS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_CHARACTERISTICS + " could not be found");
    		
		} else if (!CIM_DiagnosticTestHelper.isValid_Characteristics(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticTest.CIM_PROPERTY_CHARACTERISTICS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_CHARACTERISTICS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsInUse
	
	public Boolean get_IsInUse() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_ISINUSE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_ISINUSE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_ISINUSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsInUse(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_ISINUSE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_ISINUSE + " could not be found");
    		
		} else if (!CIM_DiagnosticTestHelper.isValid_IsInUse(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticTest.CIM_PROPERTY_ISINUSE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_ISINUSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherCharacteristicDescription
	
	public String get_OtherCharacteristicDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherCharacteristicDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICDESCRIPTION + " could not be found");
    		
		} else if (!CIM_DiagnosticTestHelper.isValid_OtherCharacteristicDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherCharacteristicsDescriptions
	
	public String[] get_OtherCharacteristicsDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICSDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICSDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICSDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherCharacteristicsDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICSDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICSDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticTestHelper.isValid_OtherCharacteristicsDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICSDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERCHARACTERISTICSDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherTestTypesDescriptions
	
	public String[] get_OtherTestTypesDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_OTHERTESTTYPESDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERTESTTYPESDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERTESTTYPESDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherTestTypesDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_OTHERTESTTYPESDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERTESTTYPESDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_DiagnosticTestHelper.isValid_OtherTestTypesDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERTESTTYPESDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_OTHERTESTTYPESDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ResourcesUsed
	
	public UnsignedInt16[] get_ResourcesUsed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_RESOURCESUSED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_RESOURCESUSED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_RESOURCESUSED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ResourcesUsed(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_RESOURCESUSED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_RESOURCESUSED + " could not be found");
    		
		} else if (!CIM_DiagnosticTestHelper.isValid_ResourcesUsed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticTest.CIM_PROPERTY_RESOURCESUSED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_RESOURCESUSED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TestTypes
	
	public UnsignedInt16[] get_TestTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_TESTTYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_TESTTYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_TESTTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_TestTypes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticTest.CIM_PROPERTY_TESTTYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_TESTTYPES + " could not be found");
    		
		} else if (!CIM_DiagnosticTestHelper.isValid_TestTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticTest.CIM_PROPERTY_TESTTYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticTest.CIM_PROPERTY_TESTTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_clearResults(CIMClient cimClient, CIM_ManagedSystemElement SystemElement, String ResultsNotCleared) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_DiagnosticTest.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_SystemElement = new CIMValue(SystemElement.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_ResultsNotCleared = new CIMValue(ResultsNotCleared, new CIMDataType(CIMDataType.STRING_ARRAY));
		
	  	inParameter.add(new CIMArgument("SystemElement", cimValue_SystemElement));
		inParameter.add(new CIMArgument("ResultsNotCleared", cimValue_ResultsNotCleared));
		
	  	outParameter.add(new CIMArgument("ResultsNotCleared", cimValue_ResultsNotCleared));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CLEARRESULTS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_DiagnosticTest.CIM_METHOD_CLEARRESULTS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_DiagnosticTest.CIM_METHOD_CLEARRESULTS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_DiagnosticTest.CIM_METHOD_CLEARRESULTS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_discontinueTest(CIMClient cimClient, CIM_ManagedSystemElement SystemElement, CIM_DiagnosticResult Result, Boolean TestingStopped) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_DiagnosticTest.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_SystemElement = new CIMValue(SystemElement.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Result = new CIMValue(Result.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TestingStopped = new CIMValue(TestingStopped, new CIMDataType(CIMDataType.BOOLEAN));
		
	  	inParameter.add(new CIMArgument("SystemElement", cimValue_SystemElement));
		inParameter.add(new CIMArgument("Result", cimValue_Result));
		inParameter.add(new CIMArgument("TestingStopped", cimValue_TestingStopped));
		
	  	outParameter.add(new CIMArgument("TestingStopped", cimValue_TestingStopped));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_DISCONTINUETEST,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_DiagnosticTest.CIM_METHOD_DISCONTINUETEST + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_DiagnosticTest.CIM_METHOD_DISCONTINUETEST + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_DiagnosticTest.CIM_METHOD_DISCONTINUETEST + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_runTest(CIMClient cimClient, CIM_ManagedSystemElement SystemElement, CIM_DiagnosticSetting Setting, CIM_DiagnosticResult Result) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_DiagnosticTest.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_SystemElement = new CIMValue(SystemElement.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Setting = new CIMValue(Setting.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Result = new CIMValue(Result.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("SystemElement", cimValue_SystemElement));
		inParameter.add(new CIMArgument("Setting", cimValue_Setting));
		inParameter.add(new CIMArgument("Result", cimValue_Result));
		
	  	outParameter.add(new CIMArgument("Result", cimValue_Result));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_RUNTEST,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_DiagnosticTest.CIM_METHOD_RUNTEST + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_DiagnosticTest.CIM_METHOD_RUNTEST + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_DiagnosticTest.CIM_METHOD_RUNTEST + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
