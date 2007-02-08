/** 
 * CIM_Setting.java
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
 * Description: The Setting class represents configuration-related and operational parameters for one or more ManagedSystemElement(s). An Element may have multiple Setting objects associated with it. The current operational values for an Element's parameters are reflected by properties in the Element itself or by properties in its associations. These properties do not have to be the same values present in the Setting object. For example, a modem may have a Setting baud rate of 56Kb/sec but be operating at 19.2Kb/sec. 
Note that the CIM_SettingData class is very similar to CIM_Setting, yet both classes are present in the model. This is because many implementations have successfully used CIM_Setting. However, issues have arisen that could not be resolved without defining a new class. Therefore, until a new major release occurs, both classes will exist in the model. Refer to the Core White Paper for additional information.
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



public class CIM_Setting extends CIM_ManagedElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_Setting";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COLLECTIONSETTING = "CIM_CollectionSetting";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING = "CIM_ElementSetting";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT = "CIM_SettingContext";
	
	
	/**
	*	The identifier by which the Setting object is known.
	*/
	public final static String CIM_PROPERTY_SETTINGID = "SettingID"; //$NON-NLS-1$
	
	
	/**
	*	The ApplyIncrementalChangeToCollection method performs the application of a subset of the properties in this Setting to the referenced Collection of ManagedSystem Elements. The net effect is to execute the ApplyIncrementalChangeToMSE method against each of the Elements aggregated by the Collection. If the input value ContinueOnError is FALSE, this method applies the Setting to all Elements in the Collection until it encounters an error, in which case it stops execution, logs the key of the Element that caused the error in the CanNotApply array, and issues a return code of 2. If the input value ContinueOnError is TRUE, then this method applies the Setting to all the ManagedSystemElements in the Collection, and reports the failed Elements in the array, CanNotApply. For the latter, processing will continue until the method is applied to all Elements in the Collection, regardless of any errors encountered. The key of each ManagedSystemElement to which the Setting could not be applied is logged into the CanNotApply array. This method takes four input parameters: Collection (the Collection of Elements to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), ContinueOnError (TRUE means to continue processing on encountering an error), and MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be applied.) If a property is not in this list, it will be ignored by the Apply. If the array is null or empty or contains the string "ALL" as a property name, then all Settings properties shall be applied. If it is set to "NONE", then no Settings properties will be applied. 
The return value should be 0 if the Setting is successfully applied to the referenced Collection, 1 if the method is not supported, 2 if the Setting was not applied within the specified time, 3 if the Setting cannot be applied using the input value for ContinueOnError, and any other number if an error occurred. One output parameter is defined, CanNotApplystring, which is an array that lists the keys of the ManagedSystemElements to which the Setting was NOT able to be applied. This output parameter has meaning only when the ContinueOnError parameter is TRUE. 
In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier. 
Note: if an error occurs in applying the Setting to a ManagedSystemElement in the Collection, the Element must be configured as when the 'Apply' attempt began. That is, the Element should NOT be left in an indeterminate state.
	*/
	public final static String CIM_METHOD_APPLYINCREMENTALCHANGETOCOLLECTION = "ApplyIncrementalChangeToCollection";
	/**
	*	The ApplyIncrementalChangeToMSE method performs the actual application of a subset of the properties in the Setting to the referenced ManagedSystemElement. It takes four input parameters: MSE (the ManagedSystem Element to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be applied.) If a property is not in this list, it will be ignored by the Apply. If the array is null, empty or contains the string "ALL" as a property name, then all Settings properties shall be applied. If it is set to "NONE", then no Settings properties will be applied. 
Note that the semantics of this method are that individual Settings are either wholly applied or not applied at all to their target ManagedSystemElement. The return value should be 0 if the Setting is successfully applied to the referenced ManagedSystemElement, 1 if the method is not supported, 2 if the Setting was not applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier. 
Note: If an error occurs in applying the Setting to a ManagedSystemElement, the Element must be configured as when the 'Apply' attempt began. That is, the Element should NOT be left in an indeterminate state.
	*/
	public final static String CIM_METHOD_APPLYINCREMENTALCHANGETOMSE = "ApplyIncrementalChangeToMSE";
	/**
	*	The ApplyToCollection method performs the application of the Setting to the referenced Collection of ManagedSystem Elements. The net effect is to execute the ApplyToMSE method against each of the Elements aggregated by the Collection. If the input value ContinueOnError is FALSE, this method applies the Setting to all Elements in the Collection until it encounters an error, in which case it stops execution, logs the key of the Element that caused the error in the CanNotApply array, and issues a return code of 2. If the input value ContinueOnError is TRUE, then this method applies the Setting to all the ManagedSystemElements in the Collection, and reports the failed Elements in the array, CanNotApply. For the latter, processing will continue until the method is applied to all Elements in the Collection, regardless of any errors encountered. The key of each ManagedSystemElement to which the Setting could not be applied is logged into the CanNotApply array. This method takes four input parameters: Collection (the Collection of Elements to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), ContinueOnError (TRUE means to continue processing on encountering an error), and MustBeCompletedBy (which indicates the required completion time for the method). The return value should be 0 if the Setting is successfully applied to the referenced Collection, 1 if the method is not supported, 2 if the Setting was not applied within the specified times, 3 if the Setting cannot be applied using the input value for ContinueOnError, and any other number if an error occurred. One output parameter is defined, CanNotApplystring, which is an array that lists the keys of the ManagedSystemElements to which the Setting was NOT able to be applied. This output parameter has meaning only when the ContinueOnError parameter is TRUE. 
In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier. 
Note: if an error occurs in applying the Setting to a ManagedSystemElement in the Collection, the Element must be configured as when the 'Apply' attempt began. That is, the Element should NOT be left in an indeterminate state.
	*/
	public final static String CIM_METHOD_APPLYTOCOLLECTION = "ApplyToCollection";
	/**
	*	The ApplyToMSE method performs the actual application of the Setting to the referenced ManagedSystemElement. It takes three input parameters: MSE (the ManagedSystem Element to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), and MustBeCompletedBy (which indicates the required completion time for the method). Note that the semantics of this method are that individual Settings are either wholly applied or not applied at all to their target ManagedSystemElement. The return value should be 0 if the Setting is successfully applied to the referenced ManagedSystemElement, 1 if the method is not supported, 2 if the Setting was not applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier. 
Note: If an error occurs in applying the Setting to a ManagedSystemElement, the Element must be configured as when the 'Apply' attempt began. That is, the Element should NOT be left in an indeterminate state.
	*/
	public final static String CIM_METHOD_APPLYTOMSE = "ApplyToMSE";
	/**
	*	The VerifyOKToApplyIncrementalChangeToCollection method is used to verify that a subset of the properties in this Setting can be 'applied' to the referenced Collection of ManagedSystemElements, at the given time or time interval, without causing adverse effects to either the Collection itself or its surrounding environment. The net effect is to execute the VerifyOKToApplyIncrementalChangeToMSE method against each of the Elements aggregated by the Collection. This method takes three input parameters: Collection (the Collection of Managed SystemElements that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be verified. If they array is null or empty or constains the string "all" as a property name then all Settings properties shall be verified. If it is set to "none" then no Settings properties will be verified). The return value should be 0 if it is OK to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. One output parameter is defined - CanNotApply - which is a string array that lists the keys of the ManagedSystemElements to which the Setting can NOT be applied. This enables those Elements to be revisited and either fixed, or other corrective action taken. 
In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOCOLLECTION = "VerifyOKToApplyIncrementalChangeToCollection";
	/**
	*	The VerifyOKToApplyIncrementalChangeToMSE method is used to verify that a subset of the properties in this Setting can be 'applied' to the referenced Managed SystemElement, at the given time or time interval. This method takes four input parameters: MSE (the Managed SystemElement that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be verified.) If the array is null, empty or contains the string "ALL" as a property name, then all Settings properties shall be verified. If it is set to "NONE", then no Settings properties will be verified. The return value should be 0 if it is OK to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOMSE = "VerifyOKToApplyIncrementalChangeToMSE";
	/**
	*	The VerifyOKToApplyToCollection method is used to verify that this Setting can be 'applied' to the referenced Collection of ManagedSystemElements, at the given time or time interval, without causing adverse effects to either the Collection itself or its surrounding environment. The net effect is to execute the VerifyOKToApply method against each of the Elements aggregated by the Collection. This method takes three input parameters: Collection (the Collection of Managed SystemElements that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), and MustBeCompletedBy (which indicates the required completion time for the method). The return value should be 0 if it is OK to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. One output parameter is defined - CanNotApply - which is a string array that lists the keys of the ManagedSystemElements to which the Setting can NOT be applied. This enables those Elements to be revisited and either fixed, or other corrective action taken. 
In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_VERIFYOKTOAPPLYTOCOLLECTION = "VerifyOKToApplyToCollection";
	/**
	*	The VerifyOKToApplyToMSE method is used to verify that this Setting can be 'applied' to the referenced Managed SystemElement, at the given time or time interval. This method takes three input parameters: MSE (the Managed SystemElement that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), and MustBeCompletedBy (which indicates the required completion time for the method). The return value should be 0 if it is OK to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_VERIFYOKTOAPPLYTOMSE = "VerifyOKToApplyToMSE";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_SETTINGID);
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SETTINGID)){
				continue;
			}
			
			CIM_Setting.CIM_PropertyNameList.add(CIM_ManagedElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SETTINGID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SETTINGID)){
				continue;
			}
			
			CIM_Setting.CIM_PropertyList.add(CIM_ManagedElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ManagedElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ManagedElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ManagedElement.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Setting() {

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
	public CIM_Setting(Vector keyProperties){ 
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
	public CIM_Setting(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Setting)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Setting)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Setting)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Setting)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Setting)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Setting)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Setting)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Setting)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Setting)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Setting)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_CollectionOfMSEs_CIM_CollectionSettings(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COLLECTIONSETTING, 
					CIM_CollectionOfMSEs.CIM_CLASS_NAME, 
					"Setting",
					"Collection",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Setting.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Setting.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Setting.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Setting.Java_Package_List.setElementAt((String)(CIM_Setting.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Setting.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_CollectionOfMSEs(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_CollectionOfMSEs(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_CollectionOfMSEs(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_CollectionOfMSEs_CIM_CollectionSetting_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COLLECTIONSETTING, 
					CIM_CollectionOfMSEs.CIM_CLASS_NAME, 
					"Setting",
					"Collection");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_CollectionOfMSEs.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_ManagedSystemElement_CIM_ElementSettings(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING, 
					CIM_ManagedSystemElement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_Setting.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Setting.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Setting.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Setting.Java_Package_List.setElementAt((String)(CIM_Setting.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Setting.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_ManagedSystemElement_CIM_ElementSetting_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING, 
					CIM_ManagedSystemElement.CIM_CLASS_NAME, 
					"Setting",
					"Element");
		
		
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

	public ArrayList getAssociated_CIM_Configuration_CIM_SettingContexts(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT, 
					CIM_Configuration.CIM_CLASS_NAME, 
					"Setting",
					"Context",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Setting.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Setting.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Setting.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Setting.Java_Package_List.setElementAt((String)(CIM_Setting.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Setting.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Configuration(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Configuration(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Configuration(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Configuration_CIM_SettingContext_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT, 
					CIM_Configuration.CIM_CLASS_NAME, 
					"Setting",
					"Context");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Configuration.CIM_CLASS_NAME)) {
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
	
	// Attribute SettingID
	
	public String get_SettingID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Setting.CIM_PROPERTY_SETTINGID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Setting.CIM_PROPERTY_SETTINGID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Setting.CIM_PROPERTY_SETTINGID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SettingID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Setting.CIM_PROPERTY_SETTINGID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Setting.CIM_PROPERTY_SETTINGID + " could not be found");
    		
		} else if (!CIM_SettingHelper.isValid_SettingID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Setting.CIM_PROPERTY_SETTINGID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Setting.CIM_PROPERTY_SETTINGID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_applyIncrementalChangeToCollection(CIMClient cimClient, CIM_CollectionOfMSEs Collection, Calendar TimeToApply, Boolean ContinueOnError, Calendar MustBeCompletedBy, String PropertiesToApply, String CanNotApply) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Setting.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Collection = new CIMValue(Collection.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TimeToApply = new CIMValue(TimeToApply, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_ContinueOnError = new CIMValue(ContinueOnError, new CIMDataType(CIMDataType.BOOLEAN));
		CIMValue cimValue_MustBeCompletedBy = new CIMValue(MustBeCompletedBy, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_PropertiesToApply = new CIMValue(PropertiesToApply, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_CanNotApply = new CIMValue(CanNotApply, new CIMDataType(CIMDataType.STRING_ARRAY));
		
	  	inParameter.add(new CIMArgument("Collection", cimValue_Collection));
		inParameter.add(new CIMArgument("TimeToApply", cimValue_TimeToApply));
		inParameter.add(new CIMArgument("ContinueOnError", cimValue_ContinueOnError));
		inParameter.add(new CIMArgument("MustBeCompletedBy", cimValue_MustBeCompletedBy));
		inParameter.add(new CIMArgument("PropertiesToApply", cimValue_PropertiesToApply));
		inParameter.add(new CIMArgument("CanNotApply", cimValue_CanNotApply));
		
	  	outParameter.add(new CIMArgument("CanNotApply", cimValue_CanNotApply));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_APPLYINCREMENTALCHANGETOCOLLECTION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Setting.CIM_METHOD_APPLYINCREMENTALCHANGETOCOLLECTION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Setting.CIM_METHOD_APPLYINCREMENTALCHANGETOCOLLECTION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Setting.CIM_METHOD_APPLYINCREMENTALCHANGETOCOLLECTION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_applyIncrementalChangeToMSE(CIMClient cimClient, CIM_ManagedSystemElement MSE, Calendar TimeToApply, Calendar MustBeCompletedBy, String PropertiesToApply) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Setting.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_MSE = new CIMValue(MSE.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TimeToApply = new CIMValue(TimeToApply, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_MustBeCompletedBy = new CIMValue(MustBeCompletedBy, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_PropertiesToApply = new CIMValue(PropertiesToApply, new CIMDataType(CIMDataType.STRING_ARRAY));
		
	  	inParameter.add(new CIMArgument("MSE", cimValue_MSE));
		inParameter.add(new CIMArgument("TimeToApply", cimValue_TimeToApply));
		inParameter.add(new CIMArgument("MustBeCompletedBy", cimValue_MustBeCompletedBy));
		inParameter.add(new CIMArgument("PropertiesToApply", cimValue_PropertiesToApply));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_APPLYINCREMENTALCHANGETOMSE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Setting.CIM_METHOD_APPLYINCREMENTALCHANGETOMSE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Setting.CIM_METHOD_APPLYINCREMENTALCHANGETOMSE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Setting.CIM_METHOD_APPLYINCREMENTALCHANGETOMSE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_applyToCollection(CIMClient cimClient, CIM_CollectionOfMSEs Collection, Calendar TimeToApply, Boolean ContinueOnError, Calendar MustBeCompletedBy, String CanNotApply) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Setting.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Collection = new CIMValue(Collection.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TimeToApply = new CIMValue(TimeToApply, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_ContinueOnError = new CIMValue(ContinueOnError, new CIMDataType(CIMDataType.BOOLEAN));
		CIMValue cimValue_MustBeCompletedBy = new CIMValue(MustBeCompletedBy, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_CanNotApply = new CIMValue(CanNotApply, new CIMDataType(CIMDataType.STRING_ARRAY));
		
	  	inParameter.add(new CIMArgument("Collection", cimValue_Collection));
		inParameter.add(new CIMArgument("TimeToApply", cimValue_TimeToApply));
		inParameter.add(new CIMArgument("ContinueOnError", cimValue_ContinueOnError));
		inParameter.add(new CIMArgument("MustBeCompletedBy", cimValue_MustBeCompletedBy));
		inParameter.add(new CIMArgument("CanNotApply", cimValue_CanNotApply));
		
	  	outParameter.add(new CIMArgument("CanNotApply", cimValue_CanNotApply));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_APPLYTOCOLLECTION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Setting.CIM_METHOD_APPLYTOCOLLECTION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Setting.CIM_METHOD_APPLYTOCOLLECTION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Setting.CIM_METHOD_APPLYTOCOLLECTION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_applyToMSE(CIMClient cimClient, CIM_ManagedSystemElement MSE, Calendar TimeToApply, Calendar MustBeCompletedBy) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Setting.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_MSE = new CIMValue(MSE.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TimeToApply = new CIMValue(TimeToApply, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_MustBeCompletedBy = new CIMValue(MustBeCompletedBy, new CIMDataType(CIMDataType.DATETIME));
		
	  	inParameter.add(new CIMArgument("MSE", cimValue_MSE));
		inParameter.add(new CIMArgument("TimeToApply", cimValue_TimeToApply));
		inParameter.add(new CIMArgument("MustBeCompletedBy", cimValue_MustBeCompletedBy));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_APPLYTOMSE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Setting.CIM_METHOD_APPLYTOMSE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Setting.CIM_METHOD_APPLYTOMSE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Setting.CIM_METHOD_APPLYTOMSE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_verifyOKToApplyIncrementalChangeToCollection(CIMClient cimClient, CIM_CollectionOfMSEs Collection, Calendar TimeToApply, Calendar MustBeCompletedBy, String PropertiesToApply, String CanNotApply) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Setting.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Collection = new CIMValue(Collection.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TimeToApply = new CIMValue(TimeToApply, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_MustBeCompletedBy = new CIMValue(MustBeCompletedBy, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_PropertiesToApply = new CIMValue(PropertiesToApply, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_CanNotApply = new CIMValue(CanNotApply, new CIMDataType(CIMDataType.STRING_ARRAY));
		
	  	inParameter.add(new CIMArgument("Collection", cimValue_Collection));
		inParameter.add(new CIMArgument("TimeToApply", cimValue_TimeToApply));
		inParameter.add(new CIMArgument("MustBeCompletedBy", cimValue_MustBeCompletedBy));
		inParameter.add(new CIMArgument("PropertiesToApply", cimValue_PropertiesToApply));
		inParameter.add(new CIMArgument("CanNotApply", cimValue_CanNotApply));
		
	  	outParameter.add(new CIMArgument("CanNotApply", cimValue_CanNotApply));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOCOLLECTION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Setting.CIM_METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOCOLLECTION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Setting.CIM_METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOCOLLECTION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Setting.CIM_METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOCOLLECTION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_verifyOKToApplyIncrementalChangeToMSE(CIMClient cimClient, CIM_ManagedSystemElement MSE, Calendar TimeToApply, Calendar MustBeCompletedBy, String PropertiesToApply) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Setting.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_MSE = new CIMValue(MSE.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TimeToApply = new CIMValue(TimeToApply, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_MustBeCompletedBy = new CIMValue(MustBeCompletedBy, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_PropertiesToApply = new CIMValue(PropertiesToApply, new CIMDataType(CIMDataType.STRING_ARRAY));
		
	  	inParameter.add(new CIMArgument("MSE", cimValue_MSE));
		inParameter.add(new CIMArgument("TimeToApply", cimValue_TimeToApply));
		inParameter.add(new CIMArgument("MustBeCompletedBy", cimValue_MustBeCompletedBy));
		inParameter.add(new CIMArgument("PropertiesToApply", cimValue_PropertiesToApply));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOMSE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Setting.CIM_METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOMSE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Setting.CIM_METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOMSE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Setting.CIM_METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOMSE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_verifyOKToApplyToCollection(CIMClient cimClient, CIM_CollectionOfMSEs Collection, Calendar TimeToApply, Calendar MustBeCompletedBy, String CanNotApply) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Setting.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Collection = new CIMValue(Collection.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TimeToApply = new CIMValue(TimeToApply, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_MustBeCompletedBy = new CIMValue(MustBeCompletedBy, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_CanNotApply = new CIMValue(CanNotApply, new CIMDataType(CIMDataType.STRING_ARRAY));
		
	  	inParameter.add(new CIMArgument("Collection", cimValue_Collection));
		inParameter.add(new CIMArgument("TimeToApply", cimValue_TimeToApply));
		inParameter.add(new CIMArgument("MustBeCompletedBy", cimValue_MustBeCompletedBy));
		inParameter.add(new CIMArgument("CanNotApply", cimValue_CanNotApply));
		
	  	outParameter.add(new CIMArgument("CanNotApply", cimValue_CanNotApply));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_VERIFYOKTOAPPLYTOCOLLECTION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Setting.CIM_METHOD_VERIFYOKTOAPPLYTOCOLLECTION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Setting.CIM_METHOD_VERIFYOKTOAPPLYTOCOLLECTION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Setting.CIM_METHOD_VERIFYOKTOAPPLYTOCOLLECTION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_verifyOKToApplyToMSE(CIMClient cimClient, CIM_ManagedSystemElement MSE, Calendar TimeToApply, Calendar MustBeCompletedBy) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Setting.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_MSE = new CIMValue(MSE.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TimeToApply = new CIMValue(TimeToApply, new CIMDataType(CIMDataType.DATETIME));
		CIMValue cimValue_MustBeCompletedBy = new CIMValue(MustBeCompletedBy, new CIMDataType(CIMDataType.DATETIME));
		
	  	inParameter.add(new CIMArgument("MSE", cimValue_MSE));
		inParameter.add(new CIMArgument("TimeToApply", cimValue_TimeToApply));
		inParameter.add(new CIMArgument("MustBeCompletedBy", cimValue_MustBeCompletedBy));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_VERIFYOKTOAPPLYTOMSE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Setting.CIM_METHOD_VERIFYOKTOAPPLYTOMSE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Setting.CIM_METHOD_VERIFYOKTOAPPLYTOMSE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Setting.CIM_METHOD_VERIFYOKTOAPPLYTOMSE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
