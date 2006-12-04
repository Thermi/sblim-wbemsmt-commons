/** 
 * CIM_DiagnosticRecord.java
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
 * Description: Data related to Diagnostics may be recorded in various DiagnosticRecord objects. The type of information that is recorded in a log is specified via the LogOptions property in DiagnosticSetting.
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



public class CIM_DiagnosticRecord extends CIM_RecordForLog  {
	
	public final static String CIM_CLASS_NAME = "CIM_DiagnosticRecord";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CORRESPONDINGSETTINGSRECORD = "CIM_CorrespondingSettingsRecord";
	
	
	/**
	*	A timestamp indicating when the record was created.
	*/
	public final static String CIM_PROPERTY_CREATIONTIMESTAMP = "CreationTimeStamp"; //$NON-NLS-1$
	/**
	*	The date and time that the record instance should be deleted. The expiration datetime should be set when the record is fully populated with record data. The value should be calculated using the ResultPersistence property of the DiagnosticSetting class. 
If a ResultPersistence value is not provided, the ExpirationDate should be set to the current datetime. 
Once the date has expired, instances should be deleted as soon as possible.
	*/
	public final static String CIM_PROPERTY_EXPIRATIONDATE = "ExpirationDate"; //$NON-NLS-1$
	/**
	*	Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
<OrgID>:<LocalID> 
Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
<LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
	*/
	public final static String CIM_PROPERTY_INSTANCEID = "InstanceID"; //$NON-NLS-1$
	/**
	*	This property SHOULD reflect the value of the underlying ManagedElement.ElementName property.
	*/
	public final static String CIM_PROPERTY_MANAGEDELEMENTNAME = "ManagedElementName"; //$NON-NLS-1$
	/**
	*	When "Other" (value=1) is entered in the RecordType property, OtherRecordTypeDescription can be used to describe the message type.
	*/
	public final static String CIM_PROPERTY_OTHERRECORDTYPEDESCRIPTION = "OtherRecordTypeDescription"; //$NON-NLS-1$
	/**
	*	The RecordType property specifies the nature of the data being entered into the ServiceRecord. The value in this property should match one of the values indicated by the DiagnosticSetting.LogOptions property. A brief summary of the various log options can be found in CIM_DiagnosticSetting.LogOptions.
	*/
	public final static String CIM_PROPERTY_RECORDTYPE = "RecordType"; //$NON-NLS-1$
	/**
	*	This property should reflect the value of the underlying DiagnosticService.Name property.
	*/
	public final static String CIM_PROPERTY_SERVICENAME = "ServiceName"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONTIMESTAMP);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXPIRATIONDATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_INSTANCEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_MANAGEDELEMENTNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERRECORDTYPEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECORDTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERVICENAME);
				
		for (int i = 0; i < CIM_RecordForLog.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONTIMESTAMP)||
				((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXPIRATIONDATE)||
				((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INSTANCEID)||
				((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MANAGEDELEMENTNAME)||
				((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERRECORDTYPEDESCRIPTION)||
				((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECORDTYPE)||
				((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERVICENAME)){
				continue;
			}
			
			CIM_DiagnosticRecord.CIM_PropertyNameList.add(CIM_RecordForLog.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONTIMESTAMP, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXPIRATIONDATE, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INSTANCEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MANAGEDELEMENTNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERRECORDTYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECORDTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERVICENAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_RecordForLog.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONTIMESTAMP)||
				((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXPIRATIONDATE)||
				((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INSTANCEID)||
				((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MANAGEDELEMENTNAME)||
				((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERRECORDTYPEDESCRIPTION)||
				((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECORDTYPE)||
				((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERVICENAME)){
				continue;
			}
			
			CIM_DiagnosticRecord.CIM_PropertyList.add(CIM_RecordForLog.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_RecordForLog.Java_Package_List.size(); i++) {
			if (((String)CIM_RecordForLog.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_RecordForLog.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_RECORDTYPE = {"Unknown","Other","Results","Subtests","Actions","Warnings","Status","Device Errors","Service Errors","Setting Data","Statistics","Hardware Configuration","Software Configuration","References","Debug"};
	
	
	public final static int RECORDTYPE_UNKNOWN = 0;
	public final static int RECORDTYPE_OTHER = 1;
	public final static int RECORDTYPE_RESULTS = 2;
	public final static int RECORDTYPE_SUBTESTS = 3;
	public final static int RECORDTYPE_ACTIONS = 4;
	public final static int RECORDTYPE_WARNINGS = 5;
	public final static int RECORDTYPE_STATUS = 6;
	public final static int RECORDTYPE_DEVICEERRORS = 7;
	public final static int RECORDTYPE_SERVICEERRORS = 8;
	public final static int RECORDTYPE_SETTINGDATA = 9;
	public final static int RECORDTYPE_STATISTICS = 10;
	public final static int RECORDTYPE_HARDWARECONFIGURATION = 11;
	public final static int RECORDTYPE_SOFTWARECONFIGURATION = 12;
	public final static int RECORDTYPE_REFERENCES = 13;
	public final static int RECORDTYPE_DEBUG = 14;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DiagnosticRecord() {

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
	public CIM_DiagnosticRecord(Vector keyProperties){ 
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
	public CIM_DiagnosticRecord(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_ExpirationDate = this.cimInstance.getProperty(CIM_PROPERTY_EXPIRATIONDATE);
		
		if (CIMProperty_ExpirationDate == null || CIMProperty_ExpirationDate.getValue().isEmpty() || CIMProperty_ExpirationDate.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_EXPIRATIONDATE, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_InstanceID = this.cimInstance.getProperty(CIM_PROPERTY_INSTANCEID);
		
		if (CIMProperty_InstanceID == null || CIMProperty_InstanceID.getValue().isEmpty() || CIMProperty_InstanceID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_INSTANCEID, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_ManagedElementName = this.cimInstance.getProperty(CIM_PROPERTY_MANAGEDELEMENTNAME);
		
		if (CIMProperty_ManagedElementName == null || CIMProperty_ManagedElementName.getValue().isEmpty() || CIMProperty_ManagedElementName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_MANAGEDELEMENTNAME, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_ServiceName = this.cimInstance.getProperty(CIM_PROPERTY_SERVICENAME);
		
		if (CIMProperty_ServiceName == null || CIMProperty_ServiceName.getValue().isEmpty() || CIMProperty_ServiceName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SERVICENAME, "Required"});
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
	    
	    if (!(object instanceof CIM_DiagnosticRecord)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DiagnosticRecord)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DiagnosticRecord)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DiagnosticRecord)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DiagnosticRecord)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DiagnosticRecord)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DiagnosticRecord)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DiagnosticRecord)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DiagnosticRecord)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DiagnosticRecord)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_DiagnosticSettingRecord_CIM_CorrespondingSettingsRecords(CIMClient cimClient,
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
					CIM_DiagnosticSettingRecord.CIM_CLASS_NAME, 
					"DataRecord",
					"SettingsRecord",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DiagnosticRecord.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiagnosticRecord.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_DiagnosticRecord.Java_Package_List.get(i))).endsWith(".")) {
							CIM_DiagnosticRecord.Java_Package_List.setElementAt((String)(CIM_DiagnosticRecord.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_DiagnosticRecord.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiagnosticSettingRecord(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_DiagnosticSettingRecord(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiagnosticSettingRecord(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_DiagnosticSettingRecord_CIM_CorrespondingSettingsRecord_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CORRESPONDINGSETTINGSRECORD, 
					CIM_DiagnosticSettingRecord.CIM_CLASS_NAME, 
					"DataRecord",
					"SettingsRecord");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_DiagnosticSettingRecord.CIM_CLASS_NAME)) {
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
	
	// Attribute CreationTimeStamp
	
	public Calendar get_CreationTimeStamp() {

		CIMProperty property = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_CREATIONTIMESTAMP);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_CREATIONTIMESTAMP + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_CREATIONTIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_CreationTimeStamp(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_CREATIONTIMESTAMP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_CREATIONTIMESTAMP + " could not be found");
    		
		} else if (!CIM_DiagnosticRecordHelper.isValid_CreationTimeStamp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticRecord.CIM_PROPERTY_CREATIONTIMESTAMP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_CREATIONTIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute ExpirationDate
	
	public Calendar get_ExpirationDate() {

		CIMProperty property = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_EXPIRATIONDATE);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_EXPIRATIONDATE + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_EXPIRATIONDATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_ExpirationDate(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_EXPIRATIONDATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_EXPIRATIONDATE + " could not be found");
    		
		} else if (!CIM_DiagnosticRecordHelper.isValid_ExpirationDate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticRecord.CIM_PROPERTY_EXPIRATIONDATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_EXPIRATIONDATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute InstanceID
	
	public String get_InstanceID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_INSTANCEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InstanceID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_INSTANCEID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DiagnosticRecord.CIM_PROPERTY_INSTANCEID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (!CIM_DiagnosticRecordHelper.isValid_InstanceID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticRecord.CIM_PROPERTY_INSTANCEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ManagedElementName
	
	public String get_ManagedElementName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_MANAGEDELEMENTNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_MANAGEDELEMENTNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_MANAGEDELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ManagedElementName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_MANAGEDELEMENTNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_MANAGEDELEMENTNAME + " could not be found");
    		
		} else if (!CIM_DiagnosticRecordHelper.isValid_ManagedElementName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticRecord.CIM_PROPERTY_MANAGEDELEMENTNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_MANAGEDELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherRecordTypeDescription
	
	public String get_OtherRecordTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_OTHERRECORDTYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_OTHERRECORDTYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_OTHERRECORDTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherRecordTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_OTHERRECORDTYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_OTHERRECORDTYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_DiagnosticRecordHelper.isValid_OtherRecordTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticRecord.CIM_PROPERTY_OTHERRECORDTYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_OTHERRECORDTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RecordType
	
	public UnsignedInt16 get_RecordType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_RECORDTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_RECORDTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_RECORDTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RecordType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_RECORDTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_RECORDTYPE + " could not be found");
    		
		} else if (!CIM_DiagnosticRecordHelper.isValid_RecordType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticRecord.CIM_PROPERTY_RECORDTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_RECORDTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ServiceName
	
	public String get_ServiceName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_SERVICENAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_SERVICENAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_SERVICENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ServiceName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiagnosticRecord.CIM_PROPERTY_SERVICENAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_SERVICENAME + " could not be found");
    		
		} else if (!CIM_DiagnosticRecordHelper.isValid_ServiceName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiagnosticRecord.CIM_PROPERTY_SERVICENAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiagnosticRecord.CIM_PROPERTY_SERVICENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
