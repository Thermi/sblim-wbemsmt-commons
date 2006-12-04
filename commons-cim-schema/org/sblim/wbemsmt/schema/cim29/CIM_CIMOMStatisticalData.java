/** 
 * CIM_CIMOMStatisticalData.java
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
 * Description: CIM_CIMOMStatisticalData provides statistical data about the performance of the CIM Object Manager. Each object of this class provides elapsed time and size data for a particular type of CIM operation. All operations of that type, regardless of the CIM operations protocol being used, are accumulated in one object and covers the CIM operations issued by all clients of the Object Manager scoping the instance. Batched CIM operations are accumulated into a separate operation type for "Batched". The counters in this class SHOULD be implemented such that they always increment and naturally wrap around when their numerical limit is exceeded. A client that calculates the difference of two snapshots of a counter at the beginning and end of a measurement interval should get the correct result, even if there was a wrap-around in between obtaining the two snapshots. (Two or more wrap arounds will result in wrong data being calculated.) The gathering of the data can be controlled through the property, CIM_ObjectManager.GatherStatisticalData. The time interval to which the statistical data applies, ends at the current time and therefore includes the most current CIM operations. The interval starts when the statistical data gathering was last turned on for the Object Manager.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;


public class CIM_CIMOMStatisticalData extends CIM_StatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_CIMOMStatisticalData";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The CimomElapsedTime property contains the elapsed time spent in the CIM Object Manager for this operation type, not counting the elapsed time spent in providers and the underlying instrumentation. The measurement points for this property SHOULD be at the transport layer interface on the network side, and at the provider interface on the instrumentation side of the CIM Object Manager.
	*/
	public final static String CIM_PROPERTY_CIMOMELAPSEDTIME = "CimomElapsedTime"; //$NON-NLS-1$
	/**
	*	The InstanceID property opaquely identifies a unique instance of CIMOMStatisticalData and MUST be unique within a namespace. In order to ensure uniqueness, the value of InstanceID MUST be constructed in the following manner: 
CIM<ID> 
The <ID> MUST include a CIM Object Manager specified unique identifier.
	*/
	public final static String CIM_PROPERTY_INSTANCEID = "InstanceID"; //$NON-NLS-1$
	/**
	*	The NumberOfOperations property contains the number of CIM operations of the specified type. This property can be used to calculate average values per CIM operation.
	*/
	public final static String CIM_PROPERTY_NUMBEROFOPERATIONS = "NumberOfOperations"; //$NON-NLS-1$
	/**
	*	The OperationType property identifies the type of CIM operation for which data is reported in this instance. Batched CIM operations (consisting of multiple simple CIM operations) are reported against the "Batched" type only.
	*/
	public final static String CIM_PROPERTY_OPERATIONTYPE = "OperationType"; //$NON-NLS-1$
	/**
	*	The OtherOperationType property identifies the operation if the OperationType property has a value of 1 ("Other"). For all other values of OperationType, the property is NULL.
	*/
	public final static String CIM_PROPERTY_OTHEROPERATIONTYPE = "OtherOperationType"; //$NON-NLS-1$
	/**
	*	The ProviderElapsedTime property contains the elapsed time spent in all providers involved with this operation type, including the underlying instrumentation. The measurement point for this property SHOULD be from the provider interface of the CIM Object Manager.
	*/
	public final static String CIM_PROPERTY_PROVIDERELAPSEDTIME = "ProviderElapsedTime"; //$NON-NLS-1$
	/**
	*	The RequestSize property contains the size of the operation requests sent to the CIM Object Manager. Any overhead of protocols above the transport protocol SHOULD be included in the count. For example, for the HTTP protocol, the size would include the size of the HTTP payload and the size of the HTTP headers.
	*/
	public final static String CIM_PROPERTY_REQUESTSIZE = "RequestSize"; //$NON-NLS-1$
	/**
	*	The ResponseSize property contains the size of the operation responses sent back from the CIM Object Manager. Any overhead of protocols above the transport protocol SHOULD be included in the count. For example, for the HTTP protocol, the size would include the size of the HTTP payload and the size of the HTTP headers.
	*/
	public final static String CIM_PROPERTY_RESPONSESIZE = "ResponseSize"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIMOMELAPSEDTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_INSTANCEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFOPERATIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OPERATIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHEROPERATIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROVIDERELAPSEDTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_RESPONSESIZE);
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CIMOMELAPSEDTIME)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INSTANCEID)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFOPERATIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OPERATIONTYPE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHEROPERATIONTYPE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROVIDERELAPSEDTIME)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTSIZE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RESPONSESIZE)){
				continue;
			}
			
			CIM_CIMOMStatisticalData.CIM_PropertyNameList.add(CIM_StatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIMOMELAPSEDTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INSTANCEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFOPERATIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OPERATIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHEROPERATIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROVIDERELAPSEDTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESPONSESIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CIMOMELAPSEDTIME)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INSTANCEID)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFOPERATIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OPERATIONTYPE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHEROPERATIONTYPE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROVIDERELAPSEDTIME)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTSIZE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RESPONSESIZE)){
				continue;
			}
			
			CIM_CIMOMStatisticalData.CIM_PropertyList.add(CIM_StatisticalData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_StatisticalData.Java_Package_List.size(); i++) {
			if (((String)CIM_StatisticalData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_StatisticalData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_OPERATIONTYPE = {"Unknown","Other","Batched","GetClass","GetInstance","DeleteClass","DeleteInstance","CreateClass","CreateInstance","ModifyClass","ModifyInstance","EnumerateClasses","EnumerateClassNames","EnumerateInstances","EnumerateInstanceNames","ExecQuery","Associators","AssociatorNames","References","ReferenceNames","GetProperty","SetProperty","GetQualifier","SetQualifier","DeleteQualifier","EnumerateQualifiers","IndicationDelivery"};
	
	
	public final static int OPERATIONTYPE_UNKNOWN = 0;
	public final static int OPERATIONTYPE_OTHER = 1;
	public final static int OPERATIONTYPE_BATCHED = 2;
	public final static int OPERATIONTYPE_GETCLASS = 3;
	public final static int OPERATIONTYPE_GETINSTANCE = 4;
	public final static int OPERATIONTYPE_DELETECLASS = 5;
	public final static int OPERATIONTYPE_DELETEINSTANCE = 6;
	public final static int OPERATIONTYPE_CREATECLASS = 7;
	public final static int OPERATIONTYPE_CREATEINSTANCE = 8;
	public final static int OPERATIONTYPE_MODIFYCLASS = 9;
	public final static int OPERATIONTYPE_MODIFYINSTANCE = 10;
	public final static int OPERATIONTYPE_ENUMERATECLASSES = 11;
	public final static int OPERATIONTYPE_ENUMERATECLASSNAMES = 12;
	public final static int OPERATIONTYPE_ENUMERATEINSTANCES = 13;
	public final static int OPERATIONTYPE_ENUMERATEINSTANCENAMES = 14;
	public final static int OPERATIONTYPE_EXECQUERY = 15;
	public final static int OPERATIONTYPE_ASSOCIATORS = 16;
	public final static int OPERATIONTYPE_ASSOCIATORNAMES = 17;
	public final static int OPERATIONTYPE_REFERENCES = 18;
	public final static int OPERATIONTYPE_REFERENCENAMES = 19;
	public final static int OPERATIONTYPE_GETPROPERTY = 20;
	public final static int OPERATIONTYPE_SETPROPERTY = 21;
	public final static int OPERATIONTYPE_GETQUALIFIER = 22;
	public final static int OPERATIONTYPE_SETQUALIFIER = 23;
	public final static int OPERATIONTYPE_DELETEQUALIFIER = 24;
	public final static int OPERATIONTYPE_ENUMERATEQUALIFIERS = 25;
	public final static int OPERATIONTYPE_INDICATIONDELIVERY = 26;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_CIMOMStatisticalData() {

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
	public CIM_CIMOMStatisticalData(Vector keyProperties){ 
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
	public CIM_CIMOMStatisticalData(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_CimomElapsedTime = this.cimInstance.getProperty(CIM_PROPERTY_CIMOMELAPSEDTIME);
		
		if (CIMProperty_CimomElapsedTime == null || CIMProperty_CimomElapsedTime.getValue().isEmpty() || CIMProperty_CimomElapsedTime.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CIMOMELAPSEDTIME, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_NumberOfOperations = this.cimInstance.getProperty(CIM_PROPERTY_NUMBEROFOPERATIONS);
		
		if (CIMProperty_NumberOfOperations == null || CIMProperty_NumberOfOperations.getValue().isEmpty() || CIMProperty_NumberOfOperations.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NUMBEROFOPERATIONS, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_OperationType = this.cimInstance.getProperty(CIM_PROPERTY_OPERATIONTYPE);
		
		if (CIMProperty_OperationType == null || CIMProperty_OperationType.getValue().isEmpty() || CIMProperty_OperationType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_OPERATIONTYPE, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_ProviderElapsedTime = this.cimInstance.getProperty(CIM_PROPERTY_PROVIDERELAPSEDTIME);
		
		if (CIMProperty_ProviderElapsedTime == null || CIMProperty_ProviderElapsedTime.getValue().isEmpty() || CIMProperty_ProviderElapsedTime.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PROVIDERELAPSEDTIME, "Required"});
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
	    
	    if (!(object instanceof CIM_CIMOMStatisticalData)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_CIMOMStatisticalData)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_CIMOMStatisticalData)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_CIMOMStatisticalData)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_CIMOMStatisticalData)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_CIMOMStatisticalData)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_CIMOMStatisticalData)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_CIMOMStatisticalData)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_CIMOMStatisticalData)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_CIMOMStatisticalData)object).cimObjectPath)) {
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
	
	// Attribute CimomElapsedTime
	
	public Calendar get_CimomElapsedTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_CIMOMELAPSEDTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_CIMOMELAPSEDTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_CIMOMELAPSEDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_CimomElapsedTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_CIMOMELAPSEDTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_CIMOMELAPSEDTIME + " could not be found");
    		
		} else if (!CIM_CIMOMStatisticalDataHelper.isValid_CimomElapsedTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_CIMOMELAPSEDTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_CIMOMELAPSEDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute InstanceID
	
	public String get_InstanceID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_INSTANCEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InstanceID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_INSTANCEID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (!CIM_CIMOMStatisticalDataHelper.isValid_InstanceID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_INSTANCEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfOperations
	
	public UnsignedInt64 get_NumberOfOperations() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_NUMBEROFOPERATIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_NUMBEROFOPERATIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_NUMBEROFOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfOperations(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_NUMBEROFOPERATIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_NUMBEROFOPERATIONS + " could not be found");
    		
		} else if (!CIM_CIMOMStatisticalDataHelper.isValid_NumberOfOperations(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_NUMBEROFOPERATIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_NUMBEROFOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OperationType
	
	public UnsignedInt16 get_OperationType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_OPERATIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_OPERATIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_OPERATIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OperationType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_OPERATIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_OPERATIONTYPE + " could not be found");
    		
		} else if (!CIM_CIMOMStatisticalDataHelper.isValid_OperationType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_OPERATIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_OPERATIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherOperationType
	
	public String get_OtherOperationType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_OTHEROPERATIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_OTHEROPERATIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_OTHEROPERATIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherOperationType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_OTHEROPERATIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_OTHEROPERATIONTYPE + " could not be found");
    		
		} else if (!CIM_CIMOMStatisticalDataHelper.isValid_OtherOperationType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_OTHEROPERATIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_OTHEROPERATIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProviderElapsedTime
	
	public Calendar get_ProviderElapsedTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_PROVIDERELAPSEDTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_PROVIDERELAPSEDTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_PROVIDERELAPSEDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_ProviderElapsedTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_PROVIDERELAPSEDTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_PROVIDERELAPSEDTIME + " could not be found");
    		
		} else if (!CIM_CIMOMStatisticalDataHelper.isValid_ProviderElapsedTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_PROVIDERELAPSEDTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_PROVIDERELAPSEDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute RequestSize
	
	public UnsignedInt64 get_RequestSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_REQUESTSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_REQUESTSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_REQUESTSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequestSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_REQUESTSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_REQUESTSIZE + " could not be found");
    		
		} else if (!CIM_CIMOMStatisticalDataHelper.isValid_RequestSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_REQUESTSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_REQUESTSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ResponseSize
	
	public UnsignedInt64 get_ResponseSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_RESPONSESIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_RESPONSESIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_RESPONSESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ResponseSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CIMOMStatisticalData.CIM_PROPERTY_RESPONSESIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_RESPONSESIZE + " could not be found");
    		
		} else if (!CIM_CIMOMStatisticalDataHelper.isValid_ResponseSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_RESPONSESIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CIMOMStatisticalData.CIM_PROPERTY_RESPONSESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
