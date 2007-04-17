/** 
 * CIM_LogRecord.java
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
 * Description:  The LogRecord object can describe the definitional format for entries in a
 * MessageLog, or can be used to instantiate the actual records in the Log. The
 * latter approach provides a great deal more semantic definition and management
 * control over the individual entries in a MessageLog, than do the record
 * manipulation methods of the Log class. It is recommended that the data in
 * individual Log entries be modeled using subclasses of LogRecord, to avoid the
 * creation of LogRecords with one property (such as RecordData) without
 * semantics. Definitional formats for LogRecords could be specified by
 * establishing a naming convention for the RecordID and Message Timestamp key
 * properties.
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
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  The LogRecord object can describe the definitional format for entries in a
 * MessageLog, or can be used to instantiate the actual records in the Log. The
 * latter approach provides a great deal more semantic definition and management
 * control over the individual entries in a MessageLog, than do the record
 * manipulation methods of the Log class. It is recommended that the data in
 * individual Log entries be modeled using subclasses of LogRecord, to avoid the
 * creation of LogRecords with one property (such as RecordData) without
 * semantics. Definitional formats for LogRecords could be specified by
 * establishing a naming convention for the RecordID and Message Timestamp key
 * properties.
 */
public class CIM_LogRecord extends CIM_RecordForLog  {
	
	public final static String CIM_CLASS_NAME = "CIM_LogRecord"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_RECORDINLOG = "CIM_RecordInLog"; //$NON-NLS-1$
	
	
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	A free-form string describing the LogRecord's data structure.
	*/
	public final static String CIM_PROPERTY_DATAFORMAT = "DataFormat"; //$NON-NLS-1$
	/**
	*	The scoping Log's CreationClassName.
	*/
	public final static String CIM_PROPERTY_LOGCREATIONCLASSNAME = "LogCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping Log's Name.
	*/
	public final static String CIM_PROPERTY_LOGNAME = "LogName"; //$NON-NLS-1$
	/**
	*	A LogRecord's key structure includes a timestamp for the entry. If the timestamp for the entry is unknown, the value 99990101000000.000000+000 SHOULD be used.
	*/
	public final static String CIM_PROPERTY_MESSAGETIMESTAMP = "MessageTimestamp"; //$NON-NLS-1$
	/**
	*	RecordID, with the MessageTimestamp property, serve to uniquely identify the LogRecord within a MessageLog. Note that this property is different than the RecordNumber parameters of the MessageLog methods. The latter are ordinal values only, useful to track position when iterating through a Log. On the other hand, RecordID is truly an identifier for an instance of LogRecord. It may be set to the record's ordinal position, but this is not required.
	*/
	public final static String CIM_PROPERTY_RECORDID = "RecordID"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MESSAGETIMESTAMP);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECORDID);
				
		for (int i = 0; i < CIM_RecordForLog.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAFORMAT)||
				((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGCREATIONCLASSNAME)||
				((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGNAME)||
				((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MESSAGETIMESTAMP)||
				((String)CIM_RecordForLog.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECORDID)){
				continue;
			}
			
			CIM_LogRecord.CIM_PropertyNameList.add(CIM_RecordForLog.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MESSAGETIMESTAMP, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECORDID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_RecordForLog.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAFORMAT)||
				((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGCREATIONCLASSNAME)||
				((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGNAME)||
				((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MESSAGETIMESTAMP)||
				((CIMProperty)CIM_RecordForLog.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECORDID)){
				continue;
			}
			
			CIM_LogRecord.CIM_PropertyList.add(CIM_RecordForLog.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_RecordForLog.Java_Package_List.size(); i++) {
			if (((String)CIM_RecordForLog.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_RecordForLog.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_LogRecord() {

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
	public CIM_LogRecord(Vector keyProperties){ 
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
	public CIM_LogRecord(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_LogCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_LOGCREATIONCLASSNAME);
		
		if (CIMProperty_LogCreationClassName == null || CIMProperty_LogCreationClassName.getValue().isEmpty() || CIMProperty_LogCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_LOGCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_LogName = this.cimInstance.getProperty(CIM_PROPERTY_LOGNAME);
		
		if (CIMProperty_LogName == null || CIMProperty_LogName.getValue().isEmpty() || CIMProperty_LogName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_LOGNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_MessageTimestamp = this.cimInstance.getProperty(CIM_PROPERTY_MESSAGETIMESTAMP);
		
		if (CIMProperty_MessageTimestamp == null || CIMProperty_MessageTimestamp.getValue().isEmpty() || CIMProperty_MessageTimestamp.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_MESSAGETIMESTAMP, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_RecordID = this.cimInstance.getProperty(CIM_PROPERTY_RECORDID);
		
		if (CIMProperty_RecordID == null || CIMProperty_RecordID.getValue().isEmpty() || CIMProperty_RecordID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_RECORDID, "Key"});
			result = false;
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
	    
	    if (!(object instanceof CIM_LogRecord)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_LogRecord)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_LogRecord)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_LogRecord)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_LogRecord)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_LogRecord)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_LogRecord)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_LogRecord)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_LogRecord)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_LogRecord)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_MessageLog_CIM_RecordInLogs(CIMClient cimClient,
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
					CIM_MessageLog.CIM_CLASS_NAME, 
					"LogRecord", //$NON-NLS-1$
					"MessageLog", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_LogRecord.Java_Package_List.size(); i++) {
						if (!((String)(CIM_LogRecord.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_LogRecord.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_LogRecord.Java_Package_List.setElementAt((String)(CIM_LogRecord.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_LogRecord.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_MessageLog(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_MessageLog(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_MessageLog(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_MessageLog_CIM_RecordInLog_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_RECORDINLOG, 
					CIM_MessageLog.CIM_CLASS_NAME, 
					"LogRecord", //$NON-NLS-1$
					"MessageLog"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_MessageLog.CIM_CLASS_NAME)) {
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
	
	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogRecord.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogRecord.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogRecord.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogRecord.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_LogRecord.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogRecord.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_LogRecordHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LogRecord.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogRecord.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataFormat
	
	public String get_DataFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogRecord.CIM_PROPERTY_DATAFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogRecord.CIM_PROPERTY_DATAFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogRecord.CIM_PROPERTY_DATAFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataFormat(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogRecord.CIM_PROPERTY_DATAFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogRecord.CIM_PROPERTY_DATAFORMAT + " could not be found");
    		
		} else if (!CIM_LogRecordHelper.isValid_DataFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LogRecord.CIM_PROPERTY_DATAFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogRecord.CIM_PROPERTY_DATAFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LogCreationClassName
	
	public String get_LogCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogRecord.CIM_PROPERTY_LOGCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogRecord.CIM_PROPERTY_LOGCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogRecord.CIM_PROPERTY_LOGCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LogCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogRecord.CIM_PROPERTY_LOGCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_LogRecord.CIM_PROPERTY_LOGCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogRecord.CIM_PROPERTY_LOGCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_LogRecordHelper.isValid_LogCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LogRecord.CIM_PROPERTY_LOGCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogRecord.CIM_PROPERTY_LOGCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LogName
	
	public String get_LogName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogRecord.CIM_PROPERTY_LOGNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogRecord.CIM_PROPERTY_LOGNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogRecord.CIM_PROPERTY_LOGNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LogName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogRecord.CIM_PROPERTY_LOGNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_LogRecord.CIM_PROPERTY_LOGNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogRecord.CIM_PROPERTY_LOGNAME + " could not be found");
    		
		} else if (!CIM_LogRecordHelper.isValid_LogName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LogRecord.CIM_PROPERTY_LOGNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogRecord.CIM_PROPERTY_LOGNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MessageTimestamp
	
	public Calendar get_MessageTimestamp() {

		CIMProperty property = this.cimInstance.getProperty(CIM_LogRecord.CIM_PROPERTY_MESSAGETIMESTAMP);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogRecord.CIM_PROPERTY_MESSAGETIMESTAMP + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogRecord.CIM_PROPERTY_MESSAGETIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_MessageTimestamp(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogRecord.CIM_PROPERTY_MESSAGETIMESTAMP);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_LogRecord.CIM_PROPERTY_MESSAGETIMESTAMP + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogRecord.CIM_PROPERTY_MESSAGETIMESTAMP + " could not be found");
    		
		} else if (!CIM_LogRecordHelper.isValid_MessageTimestamp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LogRecord.CIM_PROPERTY_MESSAGETIMESTAMP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogRecord.CIM_PROPERTY_MESSAGETIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute RecordID
	
	public String get_RecordID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogRecord.CIM_PROPERTY_RECORDID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogRecord.CIM_PROPERTY_RECORDID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogRecord.CIM_PROPERTY_RECORDID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RecordID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogRecord.CIM_PROPERTY_RECORDID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_LogRecord.CIM_PROPERTY_RECORDID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogRecord.CIM_PROPERTY_RECORDID + " could not be found");
    		
		} else if (!CIM_LogRecordHelper.isValid_RecordID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LogRecord.CIM_PROPERTY_RECORDID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogRecord.CIM_PROPERTY_RECORDID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
