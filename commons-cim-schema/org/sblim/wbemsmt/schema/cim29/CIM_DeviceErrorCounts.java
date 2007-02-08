/** 
 * CIM_DeviceErrorCounts.java
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
 * Description: DeviceErrorCounts is a statistical class containing error- related counters for a LogicalDevice. The types of errors are as defined by CCITT (Rec X.733) and ISO (IEC 10164-4). Note that the CIM_DeviceErrorCountData class uses a simplified naming/identity algorithm as compared to this class. DeviceErrorCounts is not deprecated since its naming algorithm is still in use in various implementations.
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



public class CIM_DeviceErrorCounts extends CIM_StatisticalInformation  {
	
	public final static String CIM_CLASS_NAME = "CIM_DeviceErrorCounts";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ERRORCOUNTERSFORDEVICE = "CIM_ErrorCountersForDevice";
	
	
	/**
	*	Count of the critical errors.
	*/
	public final static String CIM_PROPERTY_CRITICALERRORCOUNT = "CriticalErrorCount"; //$NON-NLS-1$
	/**
	*	The scoping Device's CreationClassName.
	*/
	public final static String CIM_PROPERTY_DEVICECREATIONCLASSNAME = "DeviceCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping Device's ID.
	*/
	public final static String CIM_PROPERTY_DEVICEID = "DeviceID"; //$NON-NLS-1$
	/**
	*	Count of the indeterminate errors.
	*/
	public final static String CIM_PROPERTY_INDETERMINATEERRORCOUNT = "IndeterminateErrorCount"; //$NON-NLS-1$
	/**
	*	Count of the major errors.
	*/
	public final static String CIM_PROPERTY_MAJORERRORCOUNT = "MajorErrorCount"; //$NON-NLS-1$
	/**
	*	Count of the minor errors.
	*/
	public final static String CIM_PROPERTY_MINORERRORCOUNT = "MinorErrorCount"; //$NON-NLS-1$
	/**
	*	The inherited Name serves as part of the key for the DeviceErrorCounts instance. The object is scoped by the LogicalDevice to which the statistics apply.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The scoping System's CreationClassName.
	*/
	public final static String CIM_PROPERTY_SYSTEMCREATIONCLASSNAME = "SystemCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping System's Name.
	*/
	public final static String CIM_PROPERTY_SYSTEMNAME = "SystemName"; //$NON-NLS-1$
	/**
	*	Count of the warnings.
	*/
	public final static String CIM_PROPERTY_WARNINGCOUNT = "WarningCount"; //$NON-NLS-1$
	
	
	/**
	*	Method to reset the error and warning counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1 indicates a reset of the indeterminate error counter, 2 the critical error counter, 3 the major error counter, 4 the minor error counter and 5 the warning counter. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the LogicalDevice's instrumentation, which tabulates the errors and warnings, can also reset its internal processing and counters. 
In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_RESETCOUNTER = "ResetCounter";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CRITICALERRORCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEVICECREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEVICEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_INDETERMINATEERRORCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAJORERRORCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINORERRORCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_WARNINGCOUNT);
				
		for (int i = 0; i < CIM_StatisticalInformation.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CRITICALERRORCOUNT)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEVICECREATIONCLASSNAME)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEVICEID)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INDETERMINATEERRORCOUNT)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAJORERRORCOUNT)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINORERRORCOUNT)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMNAME)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WARNINGCOUNT)){
				continue;
			}
			
			CIM_DeviceErrorCounts.CIM_PropertyNameList.add(CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CRITICALERRORCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEVICECREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEVICEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INDETERMINATEERRORCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAJORERRORCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINORERRORCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WARNINGCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_StatisticalInformation.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CRITICALERRORCOUNT)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEVICECREATIONCLASSNAME)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEVICEID)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INDETERMINATEERRORCOUNT)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAJORERRORCOUNT)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINORERRORCOUNT)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMNAME)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WARNINGCOUNT)){
				continue;
			}
			
			CIM_DeviceErrorCounts.CIM_PropertyList.add(CIM_StatisticalInformation.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_StatisticalInformation.Java_Package_List.size(); i++) {
			if (((String)CIM_StatisticalInformation.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_StatisticalInformation.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DeviceErrorCounts() {

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
	public CIM_DeviceErrorCounts(Vector keyProperties){ 
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
	public CIM_DeviceErrorCounts(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_DeviceCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_DEVICECREATIONCLASSNAME);
		
		if (CIMProperty_DeviceCreationClassName == null || CIMProperty_DeviceCreationClassName.getValue().isEmpty() || CIMProperty_DeviceCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_DEVICECREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_DeviceID = this.cimInstance.getProperty(CIM_PROPERTY_DEVICEID);
		
		if (CIMProperty_DeviceID == null || CIMProperty_DeviceID.getValue().isEmpty() || CIMProperty_DeviceID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_DEVICEID, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SystemCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		
		if (CIMProperty_SystemCreationClassName == null || CIMProperty_SystemCreationClassName.getValue().isEmpty() || CIMProperty_SystemCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SystemName = this.cimInstance.getProperty(CIM_PROPERTY_SYSTEMNAME);
		
		if (CIMProperty_SystemName == null || CIMProperty_SystemName.getValue().isEmpty() || CIMProperty_SystemName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SYSTEMNAME, "Key"});
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
	    
	    if (!(object instanceof CIM_DeviceErrorCounts)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DeviceErrorCounts)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DeviceErrorCounts)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DeviceErrorCounts)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DeviceErrorCounts)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DeviceErrorCounts)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DeviceErrorCounts)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DeviceErrorCounts)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DeviceErrorCounts)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DeviceErrorCounts)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_LogicalDevice_CIM_ErrorCountersForDevices(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ERRORCOUNTERSFORDEVICE, 
					CIM_LogicalDevice.CIM_CLASS_NAME, 
					"Stats",
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
				
					for (int i = 0; clazz == null && i < CIM_DeviceErrorCounts.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DeviceErrorCounts.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_DeviceErrorCounts.Java_Package_List.get(i))).endsWith(".")) {
							CIM_DeviceErrorCounts.Java_Package_List.setElementAt((String)(CIM_DeviceErrorCounts.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_DeviceErrorCounts.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_LogicalDevice_CIM_ErrorCountersForDevice_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ERRORCOUNTERSFORDEVICE, 
					CIM_LogicalDevice.CIM_CLASS_NAME, 
					"Stats",
					"Element");
		
		
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

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute CriticalErrorCount
	
	public UnsignedInt64 get_CriticalErrorCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_CRITICALERRORCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_CRITICALERRORCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_CRITICALERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CriticalErrorCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_CRITICALERRORCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_CRITICALERRORCOUNT + " could not be found");
    		
		} else if (!CIM_DeviceErrorCountsHelper.isValid_CriticalErrorCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorCounts.CIM_PROPERTY_CRITICALERRORCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_CRITICALERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeviceCreationClassName
	
	public String get_DeviceCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICECREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICECREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICECREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeviceCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICECREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICECREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICECREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_DeviceErrorCountsHelper.isValid_DeviceCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICECREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICECREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeviceID
	
	public String get_DeviceID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeviceID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICEID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICEID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICEID + " could not be found");
    		
		} else if (!CIM_DeviceErrorCountsHelper.isValid_DeviceID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_DEVICEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IndeterminateErrorCount
	
	public UnsignedInt64 get_IndeterminateErrorCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_INDETERMINATEERRORCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_INDETERMINATEERRORCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_INDETERMINATEERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IndeterminateErrorCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_INDETERMINATEERRORCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_INDETERMINATEERRORCOUNT + " could not be found");
    		
		} else if (!CIM_DeviceErrorCountsHelper.isValid_IndeterminateErrorCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorCounts.CIM_PROPERTY_INDETERMINATEERRORCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_INDETERMINATEERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MajorErrorCount
	
	public UnsignedInt64 get_MajorErrorCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_MAJORERRORCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_MAJORERRORCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_MAJORERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MajorErrorCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_MAJORERRORCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_MAJORERRORCOUNT + " could not be found");
    		
		} else if (!CIM_DeviceErrorCountsHelper.isValid_MajorErrorCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorCounts.CIM_PROPERTY_MAJORERRORCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_MAJORERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinorErrorCount
	
	public UnsignedInt64 get_MinorErrorCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_MINORERRORCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_MINORERRORCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_MINORERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinorErrorCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_MINORERRORCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_MINORERRORCOUNT + " could not be found");
    		
		} else if (!CIM_DeviceErrorCountsHelper.isValid_MinorErrorCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorCounts.CIM_PROPERTY_MINORERRORCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_MINORERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_DeviceErrorCountsHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorCounts.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemCreationClassName
	
	public String get_SystemCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_DeviceErrorCountsHelper.isValid_SystemCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemName
	
	public String get_SystemName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (!CIM_DeviceErrorCountsHelper.isValid_SystemName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WarningCount
	
	public UnsignedInt64 get_WarningCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_WARNINGCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_WARNINGCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_WARNINGCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WarningCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorCounts.CIM_PROPERTY_WARNINGCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_WARNINGCOUNT + " could not be found");
    		
		} else if (!CIM_DeviceErrorCountsHelper.isValid_WarningCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorCounts.CIM_PROPERTY_WARNINGCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorCounts.CIM_PROPERTY_WARNINGCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_resetCounter(CIMClient cimClient, UnsignedInt16 SelectedCounter) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_DeviceErrorCounts.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_SelectedCounter = new CIMValue(SelectedCounter, new CIMDataType(CIMDataType.UINT16));
		
	  	inParameter.add(new CIMArgument("SelectedCounter", cimValue_SelectedCounter));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_RESETCOUNTER,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_DeviceErrorCounts.CIM_METHOD_RESETCOUNTER + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_DeviceErrorCounts.CIM_METHOD_RESETCOUNTER + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_DeviceErrorCounts.CIM_METHOD_RESETCOUNTER + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
