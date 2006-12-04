/** 
 * CIM_MessageLog.java
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
 * Description: MessageLog represents any type of event, error or informational register or chronicle. The object describes the existence of the log and its characteristics. Several methods are defined for retrieving, writing and deleting log entries, and maintaining the log. This type of log uses iterators to access the log records, whereas its peer class, RecordLog, uses more abstracted access mechanisms.
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



public class CIM_MessageLog extends CIM_Log  {
	
	public final static String CIM_CLASS_NAME = "CIM_MessageLog";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGINDATAFILE = "CIM_LogInDataFile";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGINDEVICEFILE = "CIM_LogInDeviceFile";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGINSTORAGE = "CIM_LogInStorage";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OPERATIONLOG = "CIM_OperationLog";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_RECORDINLOG = "CIM_RecordInLog";
	
	
	/**
	*	An array of free-form strings providing more detailed explanations for any of the Log features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_CAPABILITIESDESCRIPTIONS = "CapabilitiesDescriptions"; //$NON-NLS-1$
	/**
	*	An array of integers indicating the Log capabilities. Information such as "Write Record Supported" (value= 2) or "Variable Length Records Supported" (8) is specified in this property.
	*/
	public final static String CIM_PROPERTY_CAPABILITIES = "Capabilities"; //$NON-NLS-1$
	/**
	*	An enumeration describing the character set used to record data in the individual Log entries. For example, the Log records may contain ASCII data (value=2), or be raw octet strings (value=10).
	*/
	public final static String CIM_PROPERTY_CHARACTERSET = "CharacterSet"; //$NON-NLS-1$
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	If the SizeOfHeader property is non-zero, this property describes the structure and format of the Log header. It is a free-form string. If the SizeOfHeader property is 0, then the information in this property is undefined.
	*/
	public final static String CIM_PROPERTY_HEADERFORMAT = "HeaderFormat"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the Log is currently frozen and modifications are not allowed.
	*/
	public final static String CIM_PROPERTY_ISFROZEN = "IsFrozen"; //$NON-NLS-1$
	/**
	*	An enumeration describing the last change to the MessageLog.
	*/
	public final static String CIM_PROPERTY_LASTCHANGE = "LastChange"; //$NON-NLS-1$
	/**
	*	The maximum size, in bytes, to which the Log can grow. If there is no maximum, then MaxLogSize should be set to 0.
	*/
	public final static String CIM_PROPERTY_MAXLOGSIZE = "MaxLogSize"; //$NON-NLS-1$
	/**
	*	Maximum size, in bytes, to which an individual Log entry (record) can grow - if the Capabilities array includes a value of 7 ("Variable Length Records Supported"). If the Capabilities array does not include a 7, then the Log only supports fixed length entries. The size of these entries is described by this property.
	*/
	public final static String CIM_PROPERTY_MAXRECORDSIZE = "MaxRecordSize"; //$NON-NLS-1$
	/**
	*	The inherited Name serves as part of the key (a unique identifier) for the MessageLog instance.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	When the OverwritePolicy specifies a value of 1 ("Other"), the Log's behavior can be explained using this property. If OverwritePolicy is not 1, then this property's contents are undefined.
	*/
	public final static String CIM_PROPERTY_OTHERPOLICYDESCRIPTION = "OtherPolicyDescription"; //$NON-NLS-1$
	/**
	*	An enumeration describing the behavior of the Log, when it becomes full or near full. For example, the Log may wrap (value=2) or may simply stop recording entries (value =7). 

Some of the property's possible values need further explanation: 
3="Clear When Near Full" indicates that all of the Log's entries will be deleted when a specified record capacity is reached. The capacity is specified in percentage, using the property, PercentageNearFull. 'Near Full' may be less than 100% if the Log takes time to clear, and a position should always be available for new records. 
4="Overwrite Outdated When Needed" describes that Log entries (timestamped later than the date/time specified in the property, TimeWhenOutdated) can be overwritten. 
5="Remove Outdated Records" specifies that records (timestamped later than the date/time specified in the property, TimeWhenOutdated) are logically and/or physically removed from the Log. 
6="Overwrite Specific Records" indicates that specially flagged records may be overwritten. This property only makes sense when the Capabilities array includes a value of 10, "Can Flag Records for Overwrite".
	*/
	public final static String CIM_PROPERTY_OVERWRITEPOLICY = "OverwritePolicy"; //$NON-NLS-1$
	/**
	*	If the OverwritePolicy is based on clearing records when the Log is near full (value=3), this property defines the record capacity (in percentage) that is considered to be 'near full'.
	*/
	public final static String CIM_PROPERTY_PERCENTAGENEARFULL = "PercentageNearFull"; //$NON-NLS-1$
	/**
	*	If the SizeOfRecordHeader property is non-zero, this property describes the structure and format of the record headers. It is a free-form string. If the SizeOfRecordHeader property is 0, then the information in this property is undefined.
	*/
	public final static String CIM_PROPERTY_RECORDHEADERFORMAT = "RecordHeaderFormat"; //$NON-NLS-1$
	/**
	*	When a change is made to the Log, the record number that was modified is captured.
	*/
	public final static String CIM_PROPERTY_RECORDLASTCHANGED = "RecordLastChanged"; //$NON-NLS-1$
	/**
	*	The size of the Log header, in bytes, if one is present. If there is no Log header, then this property should be set to 0. Headers may include general information about the Log such as the current number of records, time of last update, or a pointer to the location of the first Log entry. Note that this property is NOT the size of the header for an individual Log entry. The latter is described by the property, SizeOfRecordHeader.
	*/
	public final static String CIM_PROPERTY_SIZEOFHEADER = "SizeOfHeader"; //$NON-NLS-1$
	/**
	*	The size of the header for the Log's individual entries, in bytes, if record headers are defined. If there are no record headers, then this property should be set to 0. Record headers may include information such as the type of the Log entry, the date/time that the entry was last updated, or a pointer to the start of optional data. Note that this property defines the header size for individual records in the Log, while the SizeOfHeader property describes the Log's overall header, typically located at the start of the MessageLog.
	*/
	public final static String CIM_PROPERTY_SIZEOFRECORDHEADER = "SizeOfRecordHeader"; //$NON-NLS-1$
	/**
	*	When a change is made to the Log, the date/time of that modification is captured. This property could be used to event against any update to the MessageLog.
	*/
	public final static String CIM_PROPERTY_TIMEOFLASTCHANGE = "TimeOfLastChange"; //$NON-NLS-1$
	/**
	*	If the OverwritePolicy is based on 'outdated' records (values 4 or 5), this property defines when a Log entry is considered to be outdated - either by time interval or at a specific date and time.
	*/
	public final static String CIM_PROPERTY_TIMEWHENOUTDATED = "TimeWhenOutdated"; //$NON-NLS-1$
	
	
	/**
	*	Requests that an iteration of the Log, identified by the IterationIdentifier input parameter, be stopped. The return value from CancelIteration should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_CANCELITERATION = "CancelIteration";
	/**
	*	Requests that the record indicated by the IterationIdentifier be deleted from the MessageLog. After deletion, the Iteration Identifier may be advanced to the next record by setting the PositionToNext input parameter to TRUE. If set to FALSE, then the IterationIdentifier will be positioned at the previous record. Two output parameters are defined for the method - RecordData which holds the contents of the deleted Log entry (as an array of bytes that can be recast to an appropriate format or discarded), and RecordNumber which returns the current record number addressed via the IterationIdentifier. The RecordNumber parameter is only defined/valid when the Capabilities array indicates that ordinal record number addressing is supported (a value of 7). 

IterationIdentifier is defined as an Input/Output method parameter to allow the Log to embed state information in the Identifier and potentially let the identifier be maintained by the using application. 

The return value from DeleteRecord should be 0 if the request was successfully executed, 1 if the request is not supported, and some other value if an error occurred. If the request is not supported, check the Capabilities array that a value of 3 ("Delete Record Supported") is specified. 

Note: In a subclass, the set of possible return codes could be described using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_DELETERECORD = "DeleteRecord";
	/**
	*	Requests that the record indicated by the IterationIdentifier be flagged as overwriteable. This method is only supported when the Capabilities array includes a value of 10, "Can Flag Records for Overwrite". After updating the entry, the IterationIdentifier may be advanced to the next record by setting the PositionToNext input parameter to TRUE. One output parameter is defined for the method RecordNumber. It returns the current record number addressed via the Iteration Identifier. This parameter is only defined/valid when the Capabilities array indicates that ordinal record number addressing is supported (a value of 7). 

IterationIdentifier is defined as an Input/Output method parameter to allow the Log to embed state information in the Identifier and potentially let the identifier be maintained by the using application. 

The return value from FlagRecordForOverwrite should be 0 if the request was successfully executed, 1 if the request is not supported, and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_FLAGRECORDFOROVERWRITE = "FlagRecordForOverwrite";
	/**
	*	Requests that the MessageLog be placed in a frozen state ("Freeze" input parameter = TRUE) or 'unfrozen' (= FALSE). If frozen, modifications to the Log will not be allowed. If successful, the Log's IsFrozen boolean property will be updated to reflect the desired state. 

The method's return code should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. If the request is not supported, check the Capabilities array that a value of 5 ("Freeze Log Supported") is specified. 

Note: In a subclass, the set of possible return codes could be described using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_FREEZELOG = "FreezeLog";
	/**
	*	Requests that the record indicated by the IterationIdentifier be retrieved from the MessageLog. After retrieval, the IterationIdentifier may be advanced to the next record by setting the PositionToNext input parameter to TRUE. Two output parameters are defined for the method - RecordData which holds the contents of the Log entry (as an array of bytes that can be recast to an appropriate format), and RecordNumber which returns the current record number addressed via the Iteration Identifier. The RecordNumber parameter is only defined/valid when the Capabilities array indicates that ordinal record number addressing is supported (a value of 7). 

IterationIdentifier is defined as an Input/Output method parameter to allow the Log to embed state information in the Identifier and potentially let the identifier be maintained by the using application. 

The return value from GetRecord should be 0 if the request was successfully executed, 1 if the request is not supported, and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_GETRECORD = "GetRecord";
	/**
	*	Requests that the Log's iteration identifier be advanced or retreated a specific number of records, or set to the entry at a specified numeric location. These two different behaviors are accomplished using the input parameters of the method. Advancing or retreating is achieved by setting the MoveAbsolute boolean to FALSE, and then specifying the number of entries to advance or retreat as positive or negative values in the RecordNumber parameter. Moving to a specific record number is accomplished by setting the MoveAbsolute input parameter to TRUE, and then placing the record number into the RecordNumber parameter. This can only be done if the Capabilities array includes a value of 7, "Supports Addressing by Ordinal Record Number". 

After the method completes and if ordinal record numbers are supported (the Capabilities array includes a 7), the current record number is returned in the RecordNumber output parameter. Otherwise, the value of the parameter is undefined. 

IterationIdentifier is defined as an Input/Output method parameter to allow the Log to embed state information in the Identifier and potentially let the identifier be maintained by the using application. 

The return value from PositionAtRecord should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. If the request is not supported, check the Capabilities array regarding support for ordinal record number addressing and backward movement in the Log (values 7 and 4, respectively). 

Note: In a subclass, the set of possible return codes could be described using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_POSITIONATRECORD = "PositionAtRecord";
	/**
	*	Requests that an iteration of the MessageLog be established and that the iterator be set to the first entry in the Log. An identifier for the iterator is returned as an output parameter of the method. 

Regarding iteration, you have 2 choices: 1) Embed iteration data in the method call, and allow implementations to track/ store this data manually; or, 2) Iterate using a separate object (for example, class ActiveIterator) as an iteration agent. The first approach is used here for interoperability. The second requires an instance of the Iterator object for EACH iteration in progress. 2's functionality could be implemented underneath 1. 

The return value from PositionToFirstRecord should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_POSITIONTOFIRSTRECORD = "PositionToFirstRecord";
	/**
	*	Requests that a record be inserted at the Log position indicated by the IterationIdentifier. The entry's data is provided in the RecordData input parameter. After insertion, the IterationIdentifier may be advanced to the next record by setting the PositionToNext input parameter to TRUE. The output parameter, RecordNumber, returns the current record number addressed via the IterationIdentifier. This parameter is only defined/valid when the Capabilities array indicates that ordinal record number addressing is supported (a value of 7). 

IterationIdentifier is defined as an Input/Output method parameter to allow the Log to embed state information in the Identifier and potentially let the identifier be maintained by the using application. 

The return value from WriteRecord should be 0 if the request was successfully executed, 1 if the request is not supported, and some other value if an error occurred. If the request is not supported, check the Capabilities array that a value of 2 ("Write Record Supported") is specified. 

Note: In a subclass, the set of possible return codes could be described using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_WRITERECORD = "WriteRecord";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIESDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CHARACTERSET);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_HEADERFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISFROZEN);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTCHANGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXLOGSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXRECORDSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERPOLICYDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OVERWRITEPOLICY);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERCENTAGENEARFULL);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECORDHEADERFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECORDLASTCHANGED);
		CIM_PropertyNameList.add(CIM_PROPERTY_SIZEOFHEADER);
		CIM_PropertyNameList.add(CIM_PROPERTY_SIZEOFRECORDHEADER);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFLASTCHANGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEWHENOUTDATED);
				
		for (int i = 0; i < CIM_Log.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIESDESCRIPTIONS)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIES)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHARACTERSET)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HEADERFORMAT)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISFROZEN)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTCHANGE)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXLOGSIZE)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXRECORDSIZE)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERPOLICYDESCRIPTION)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OVERWRITEPOLICY)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PERCENTAGENEARFULL)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECORDHEADERFORMAT)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECORDLASTCHANGED)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SIZEOFHEADER)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SIZEOFRECORDHEADER)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFLASTCHANGE)||
				((String)CIM_Log.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEWHENOUTDATED)){
				continue;
			}
			
			CIM_MessageLog.CIM_PropertyNameList.add(CIM_Log.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIESDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHARACTERSET, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HEADERFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISFROZEN, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTCHANGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXLOGSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXRECORDSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERPOLICYDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OVERWRITEPOLICY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERCENTAGENEARFULL, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECORDHEADERFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECORDLASTCHANGED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SIZEOFHEADER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SIZEOFRECORDHEADER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFLASTCHANGE, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEWHENOUTDATED, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_Log.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIESDESCRIPTIONS)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIES)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHARACTERSET)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HEADERFORMAT)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISFROZEN)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTCHANGE)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXLOGSIZE)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXRECORDSIZE)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERPOLICYDESCRIPTION)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OVERWRITEPOLICY)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PERCENTAGENEARFULL)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECORDHEADERFORMAT)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECORDLASTCHANGED)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SIZEOFHEADER)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SIZEOFRECORDHEADER)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFLASTCHANGE)||
				((CIMProperty)CIM_Log.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEWHENOUTDATED)){
				continue;
			}
			
			CIM_MessageLog.CIM_PropertyList.add(CIM_Log.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Log.Java_Package_List.size(); i++) {
			if (((String)CIM_Log.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Log.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CAPABILITIES = {"Unknown","Other","Write Record Supported","Delete Record Supported","Can Move Backward in Log","Freeze Log Supported","Clear Log Supported","Supports Addressing by Ordinal Record Number","Variable Length Records Supported","Variable Formats for Records","Can Flag Records for Overwrite"};
	public final static String[] CIM_VALUEMAP_CHARACTERSET = {"Unknown","Other","ASCII","Unicode","ISO2022","ISO8859","Extended UNIX Code","UTF-8","UCS-2","Bitmapped Data","OctetString","Defined by Individual Records"};
	public final static String[] CIM_VALUEMAP_LASTCHANGE = {"Unknown","Add","Delete","Modify","Log Cleared"};
	public final static String[] CIM_VALUEMAP_OVERWRITEPOLICY = {"Unknown","Other","Wraps When Full","Clear When Near Full","Overwrite Outdated When Needed","Remove Outdated Records","Overwrite Specific Records","Never Overwrite"};
	
	
	public final static int CAPABILITIES_UNKNOWN = 0;
	public final static int CAPABILITIES_OTHER = 1;
	public final static int CAPABILITIES_WRITERECORDSUPPORTED = 2;
	public final static int CAPABILITIES_DELETERECORDSUPPORTED = 3;
	public final static int CAPABILITIES_CANMOVEBACKWARDINLOG = 4;
	public final static int CAPABILITIES_FREEZELOGSUPPORTED = 5;
	public final static int CAPABILITIES_CLEARLOGSUPPORTED = 6;
	public final static int CAPABILITIES_SUPPORTSADDRESSINGBYORDINALRECORDNUMBER = 7;
	public final static int CAPABILITIES_VARIABLELENGTHRECORDSSUPPORTED = 8;
	public final static int CAPABILITIES_VARIABLEFORMATSFORRECORDS = 9;
	public final static int CAPABILITIES_CANFLAGRECORDSFOROVERWRITE = 10;
	
	public final static int CHARACTERSET_UNKNOWN = 0;
	public final static int CHARACTERSET_OTHER = 1;
	public final static int CHARACTERSET_ASCII = 2;
	public final static int CHARACTERSET_UNICODE = 3;
	public final static int CHARACTERSET_ISO2022 = 4;
	public final static int CHARACTERSET_ISO8859 = 5;
	public final static int CHARACTERSET_EXTENDEDUNIXCODE = 6;
	public final static int CHARACTERSET_UTF_8 = 7;
	public final static int CHARACTERSET_UCS_2 = 8;
	public final static int CHARACTERSET_BITMAPPEDDATA = 9;
	public final static int CHARACTERSET_OCTETSTRING = 10;
	public final static int CHARACTERSET_DEFINEDBYINDIVIDUALRECORDS = 11;
	
	public final static int LASTCHANGE_UNKNOWN = 0;
	public final static int LASTCHANGE_ADD = 1;
	public final static int LASTCHANGE_DELETE = 2;
	public final static int LASTCHANGE_MODIFY = 3;
	public final static int LASTCHANGE_LOGCLEARED = 4;
	
	public final static int OVERWRITEPOLICY_UNKNOWN = 0;
	public final static int OVERWRITEPOLICY_OTHER = 1;
	public final static int OVERWRITEPOLICY_WRAPSWHENFULL = 2;
	public final static int OVERWRITEPOLICY_CLEARWHENNEARFULL = 3;
	public final static int OVERWRITEPOLICY_OVERWRITEOUTDATEDWHENNEEDED = 4;
	public final static int OVERWRITEPOLICY_REMOVEOUTDATEDRECORDS = 5;
	public final static int OVERWRITEPOLICY_OVERWRITESPECIFICRECORDS = 6;
	public final static int OVERWRITEPOLICY_NEVEROVERWRITE = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_MessageLog() {

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
	public CIM_MessageLog(Vector keyProperties){ 
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
	public CIM_MessageLog(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_CreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CREATIONCLASSNAME);
		
		if (CIMProperty_CreationClassName == null || CIMProperty_CreationClassName.getValue().isEmpty() || CIMProperty_CreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
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
	    
	    if (!(object instanceof CIM_MessageLog)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_MessageLog)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_MessageLog)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_MessageLog)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_MessageLog)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_MessageLog)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_MessageLog)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_MessageLog)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_MessageLog)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_MessageLog)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_DataFile_CIM_LogInDataFiles(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGINDATAFILE, 
					CIM_DataFile.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_MessageLog.Java_Package_List.size(); i++) {
						if (!((String)(CIM_MessageLog.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_MessageLog.Java_Package_List.get(i))).endsWith(".")) {
							CIM_MessageLog.Java_Package_List.setElementAt((String)(CIM_MessageLog.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_MessageLog.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DataFile(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_DataFile(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DataFile(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_DataFile_CIM_LogInDataFile_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGINDATAFILE, 
					CIM_DataFile.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_DataFile.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_DeviceFile_CIM_LogInDeviceFiles(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGINDEVICEFILE, 
					CIM_DeviceFile.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_MessageLog.Java_Package_List.size(); i++) {
						if (!((String)(CIM_MessageLog.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_MessageLog.Java_Package_List.get(i))).endsWith(".")) {
							CIM_MessageLog.Java_Package_List.setElementAt((String)(CIM_MessageLog.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_MessageLog.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DeviceFile(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_DeviceFile(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DeviceFile(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_DeviceFile_CIM_LogInDeviceFile_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGINDEVICEFILE, 
					CIM_DeviceFile.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_DeviceFile.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_StorageExtent_CIM_LogInStorages(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGINSTORAGE, 
					CIM_StorageExtent.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_MessageLog.Java_Package_List.size(); i++) {
						if (!((String)(CIM_MessageLog.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_MessageLog.Java_Package_List.get(i))).endsWith(".")) {
							CIM_MessageLog.Java_Package_List.setElementAt((String)(CIM_MessageLog.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_MessageLog.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageExtent(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_StorageExtent(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageExtent(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_StorageExtent_CIM_LogInStorage_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGINSTORAGE, 
					CIM_StorageExtent.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_StorageExtent.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_LogicalElement_CIM_OperationLogs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OPERATIONLOG, 
					CIM_LogicalElement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_MessageLog.Java_Package_List.size(); i++) {
						if (!((String)(CIM_MessageLog.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_MessageLog.Java_Package_List.get(i))).endsWith(".")) {
							CIM_MessageLog.Java_Package_List.setElementAt((String)(CIM_MessageLog.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_MessageLog.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_LogicalElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_LogicalElement_CIM_OperationLog_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OPERATIONLOG, 
					CIM_LogicalElement.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LogicalElement.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_LogRecord_CIM_RecordInLogs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_RECORDINLOG, 
					CIM_LogRecord.CIM_CLASS_NAME, 
					"MessageLog",
					"LogRecord",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_MessageLog.Java_Package_List.size(); i++) {
						if (!((String)(CIM_MessageLog.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_MessageLog.Java_Package_List.get(i))).endsWith(".")) {
							CIM_MessageLog.Java_Package_List.setElementAt((String)(CIM_MessageLog.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_MessageLog.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogRecord(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_LogRecord(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogRecord(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_LogRecord_CIM_RecordInLog_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_RECORDINLOG, 
					CIM_LogRecord.CIM_CLASS_NAME, 
					"MessageLog",
					"LogRecord");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LogRecord.CIM_CLASS_NAME)) {
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
	
	// Attribute CapabilitiesDescriptions
	
	public String[] get_CapabilitiesDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_CAPABILITIESDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_CAPABILITIESDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_CAPABILITIESDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CapabilitiesDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_CAPABILITIESDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_CAPABILITIESDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_CapabilitiesDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_CAPABILITIESDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_CAPABILITIESDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Capabilities
	
	public UnsignedInt16[] get_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Capabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CharacterSet
	
	public UnsignedInt16 get_CharacterSet() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_CHARACTERSET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_CHARACTERSET + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_CHARACTERSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CharacterSet(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_CHARACTERSET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_CHARACTERSET + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_CharacterSet(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_CHARACTERSET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_CHARACTERSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_MessageLog.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HeaderFormat
	
	public String get_HeaderFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_HEADERFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_HEADERFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_HEADERFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HeaderFormat(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_HEADERFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_HEADERFORMAT + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_HeaderFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_HEADERFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_HEADERFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsFrozen
	
	public Boolean get_IsFrozen() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_ISFROZEN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_ISFROZEN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_ISFROZEN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsFrozen(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_ISFROZEN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_ISFROZEN + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_IsFrozen(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_ISFROZEN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_ISFROZEN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastChange
	
	public UnsignedInt16 get_LastChange() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_LASTCHANGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_LASTCHANGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_LASTCHANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LastChange(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_LASTCHANGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_LASTCHANGE + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_LastChange(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_LASTCHANGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_LASTCHANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxLogSize
	
	public UnsignedInt64 get_MaxLogSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_MAXLOGSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_MAXLOGSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_MAXLOGSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxLogSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_MAXLOGSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_MAXLOGSIZE + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_MaxLogSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_MAXLOGSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_MAXLOGSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxRecordSize
	
	public UnsignedInt64 get_MaxRecordSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_MAXRECORDSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_MAXRECORDSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_MAXRECORDSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxRecordSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_MAXRECORDSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_MAXRECORDSIZE + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_MaxRecordSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_MAXRECORDSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_MAXRECORDSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_MessageLog.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherPolicyDescription
	
	public String get_OtherPolicyDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_OTHERPOLICYDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_OTHERPOLICYDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_OTHERPOLICYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherPolicyDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_OTHERPOLICYDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_OTHERPOLICYDESCRIPTION + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_OtherPolicyDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_OTHERPOLICYDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_OTHERPOLICYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OverwritePolicy
	
	public UnsignedInt16 get_OverwritePolicy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_OVERWRITEPOLICY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_OVERWRITEPOLICY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_OVERWRITEPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OverwritePolicy(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_OVERWRITEPOLICY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_OVERWRITEPOLICY + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_OverwritePolicy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_OVERWRITEPOLICY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_OVERWRITEPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PercentageNearFull
	
	public UnsignedInt8 get_PercentageNearFull() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_PERCENTAGENEARFULL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_PERCENTAGENEARFULL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_PERCENTAGENEARFULL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PercentageNearFull(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_PERCENTAGENEARFULL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_PERCENTAGENEARFULL + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_PercentageNearFull(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_PERCENTAGENEARFULL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_PERCENTAGENEARFULL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RecordHeaderFormat
	
	public String get_RecordHeaderFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_RECORDHEADERFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_RECORDHEADERFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_RECORDHEADERFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RecordHeaderFormat(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_RECORDHEADERFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_RECORDHEADERFORMAT + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_RecordHeaderFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_RECORDHEADERFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_RECORDHEADERFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RecordLastChanged
	
	public UnsignedInt64 get_RecordLastChanged() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_RECORDLASTCHANGED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_RECORDLASTCHANGED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_RECORDLASTCHANGED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RecordLastChanged(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_RECORDLASTCHANGED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_RECORDLASTCHANGED + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_RecordLastChanged(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_RECORDLASTCHANGED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_RECORDLASTCHANGED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SizeOfHeader
	
	public UnsignedInt64 get_SizeOfHeader() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_SIZEOFHEADER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_SIZEOFHEADER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_SIZEOFHEADER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SizeOfHeader(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_SIZEOFHEADER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_SIZEOFHEADER + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_SizeOfHeader(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_SIZEOFHEADER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_SIZEOFHEADER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SizeOfRecordHeader
	
	public UnsignedInt64 get_SizeOfRecordHeader() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_SIZEOFRECORDHEADER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_SIZEOFRECORDHEADER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_SIZEOFRECORDHEADER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SizeOfRecordHeader(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_SIZEOFRECORDHEADER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_SIZEOFRECORDHEADER + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_SizeOfRecordHeader(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_SIZEOFRECORDHEADER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_SIZEOFRECORDHEADER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfLastChange
	
	public Calendar get_TimeOfLastChange() {

		CIMProperty property = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_TIMEOFLASTCHANGE);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_TIMEOFLASTCHANGE + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_TIMEOFLASTCHANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfLastChange(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_TIMEOFLASTCHANGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_TIMEOFLASTCHANGE + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_TimeOfLastChange(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_TIMEOFLASTCHANGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_TIMEOFLASTCHANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute TimeWhenOutdated
	
	public Calendar get_TimeWhenOutdated() {

		CIMProperty property = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_TIMEWHENOUTDATED);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_TIMEWHENOUTDATED + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_TIMEWHENOUTDATED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeWhenOutdated(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MessageLog.CIM_PROPERTY_TIMEWHENOUTDATED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MessageLog.CIM_PROPERTY_TIMEWHENOUTDATED + " could not be found");
    		
		} else if (!CIM_MessageLogHelper.isValid_TimeWhenOutdated(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MessageLog.CIM_PROPERTY_TIMEWHENOUTDATED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MessageLog.CIM_PROPERTY_TIMEWHENOUTDATED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_cancelIteration(CIMClient cimClient, String IterationIdentifier) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_MessageLog.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_IterationIdentifier = new CIMValue(IterationIdentifier, new CIMDataType(CIMDataType.STRING));
		
	  	inParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CANCELITERATION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_CANCELITERATION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_CANCELITERATION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_MessageLog.CIM_METHOD_CANCELITERATION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_deleteRecord(CIMClient cimClient, String IterationIdentifier, Boolean PositionToNext, UnsignedInt64 RecordNumber, UnsignedInt8 RecordData) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_MessageLog.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_IterationIdentifier = new CIMValue(IterationIdentifier, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_PositionToNext = new CIMValue(PositionToNext, new CIMDataType(CIMDataType.BOOLEAN));
		CIMValue cimValue_RecordNumber = new CIMValue(RecordNumber, new CIMDataType(CIMDataType.UINT64));
		CIMValue cimValue_RecordData = new CIMValue(RecordData, new CIMDataType(CIMDataType.UINT8_ARRAY));
		
	  	inParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		inParameter.add(new CIMArgument("PositionToNext", cimValue_PositionToNext));
		inParameter.add(new CIMArgument("RecordNumber", cimValue_RecordNumber));
		inParameter.add(new CIMArgument("RecordData", cimValue_RecordData));
		
	  	outParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		outParameter.add(new CIMArgument("RecordNumber", cimValue_RecordNumber));
		outParameter.add(new CIMArgument("RecordData", cimValue_RecordData));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_DELETERECORD,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_DELETERECORD + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_DELETERECORD + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_MessageLog.CIM_METHOD_DELETERECORD + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_flagRecordForOverwrite(CIMClient cimClient, String IterationIdentifier, Boolean PositionToNext, UnsignedInt64 RecordNumber) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_MessageLog.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_IterationIdentifier = new CIMValue(IterationIdentifier, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_PositionToNext = new CIMValue(PositionToNext, new CIMDataType(CIMDataType.BOOLEAN));
		CIMValue cimValue_RecordNumber = new CIMValue(RecordNumber, new CIMDataType(CIMDataType.UINT64));
		
	  	inParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		inParameter.add(new CIMArgument("PositionToNext", cimValue_PositionToNext));
		inParameter.add(new CIMArgument("RecordNumber", cimValue_RecordNumber));
		
	  	outParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		outParameter.add(new CIMArgument("RecordNumber", cimValue_RecordNumber));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_FLAGRECORDFOROVERWRITE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_FLAGRECORDFOROVERWRITE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_FLAGRECORDFOROVERWRITE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_MessageLog.CIM_METHOD_FLAGRECORDFOROVERWRITE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_freezeLog(CIMClient cimClient, Boolean Freeze) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_MessageLog.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Freeze = new CIMValue(Freeze, new CIMDataType(CIMDataType.BOOLEAN));
		
	  	inParameter.add(new CIMArgument("Freeze", cimValue_Freeze));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_FREEZELOG,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_FREEZELOG + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_FREEZELOG + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_MessageLog.CIM_METHOD_FREEZELOG + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_getRecord(CIMClient cimClient, String IterationIdentifier, Boolean PositionToNext, UnsignedInt64 RecordNumber, UnsignedInt8 RecordData) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_MessageLog.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_IterationIdentifier = new CIMValue(IterationIdentifier, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_PositionToNext = new CIMValue(PositionToNext, new CIMDataType(CIMDataType.BOOLEAN));
		CIMValue cimValue_RecordNumber = new CIMValue(RecordNumber, new CIMDataType(CIMDataType.UINT64));
		CIMValue cimValue_RecordData = new CIMValue(RecordData, new CIMDataType(CIMDataType.UINT8_ARRAY));
		
	  	inParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		inParameter.add(new CIMArgument("PositionToNext", cimValue_PositionToNext));
		inParameter.add(new CIMArgument("RecordNumber", cimValue_RecordNumber));
		inParameter.add(new CIMArgument("RecordData", cimValue_RecordData));
		
	  	outParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		outParameter.add(new CIMArgument("RecordNumber", cimValue_RecordNumber));
		outParameter.add(new CIMArgument("RecordData", cimValue_RecordData));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_GETRECORD,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_GETRECORD + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_GETRECORD + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_MessageLog.CIM_METHOD_GETRECORD + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_positionAtRecord(CIMClient cimClient, String IterationIdentifier, Boolean MoveAbsolute, Long RecordNumber) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_MessageLog.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_IterationIdentifier = new CIMValue(IterationIdentifier, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_MoveAbsolute = new CIMValue(MoveAbsolute, new CIMDataType(CIMDataType.BOOLEAN));
		CIMValue cimValue_RecordNumber = new CIMValue(RecordNumber, new CIMDataType(CIMDataType.SINT64));
		
	  	inParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		inParameter.add(new CIMArgument("MoveAbsolute", cimValue_MoveAbsolute));
		inParameter.add(new CIMArgument("RecordNumber", cimValue_RecordNumber));
		
	  	outParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		outParameter.add(new CIMArgument("RecordNumber", cimValue_RecordNumber));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_POSITIONATRECORD,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_POSITIONATRECORD + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_POSITIONATRECORD + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_MessageLog.CIM_METHOD_POSITIONATRECORD + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_positionToFirstRecord(CIMClient cimClient, String IterationIdentifier) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_MessageLog.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_IterationIdentifier = new CIMValue(IterationIdentifier, new CIMDataType(CIMDataType.STRING));
		
	  	inParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		
	  	outParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_POSITIONTOFIRSTRECORD,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_POSITIONTOFIRSTRECORD + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_POSITIONTOFIRSTRECORD + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_MessageLog.CIM_METHOD_POSITIONTOFIRSTRECORD + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_writeRecord(CIMClient cimClient, String IterationIdentifier, Boolean PositionToNext, UnsignedInt8 RecordData, UnsignedInt64 RecordNumber) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_MessageLog.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_IterationIdentifier = new CIMValue(IterationIdentifier, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_PositionToNext = new CIMValue(PositionToNext, new CIMDataType(CIMDataType.BOOLEAN));
		CIMValue cimValue_RecordData = new CIMValue(RecordData, new CIMDataType(CIMDataType.UINT8_ARRAY));
		CIMValue cimValue_RecordNumber = new CIMValue(RecordNumber, new CIMDataType(CIMDataType.UINT64));
		
	  	inParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		inParameter.add(new CIMArgument("PositionToNext", cimValue_PositionToNext));
		inParameter.add(new CIMArgument("RecordData", cimValue_RecordData));
		inParameter.add(new CIMArgument("RecordNumber", cimValue_RecordNumber));
		
	  	outParameter.add(new CIMArgument("IterationIdentifier", cimValue_IterationIdentifier));
		outParameter.add(new CIMArgument("RecordNumber", cimValue_RecordNumber));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_WRITERECORD,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_WRITERECORD + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_MessageLog.CIM_METHOD_WRITERECORD + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_MessageLog.CIM_METHOD_WRITERECORD + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
