/** 
 * CIM_UnitOfWork.java
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
 * Description: Each instance of UnitOfWork identifies a transaction that is either in-process or already completed. Because instances of 'in-process' UnitsOfWork can be very short-lived and there can be a great number of active ones, use of this class as an instrumentation source for determining response time may be incorrect or inefficient, unless the rate and duration of the UnitsOfWork are known. The intended use is to respond to queries about currently active or recently completed UnitsOfWork. The length of time that a UnitOfWork instance exists after the UnitOfWork completes is not defined and should be assumed to be implementation-dependent. This class is weak to its definition (CIM_UnitOfWorkDefintion).
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



public class CIM_UnitOfWork extends CIM_ManagedElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_UnitOfWork";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALELEMENTPERFORMSUOW = "CIM_LogicalElementPerformsUoW";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_STARTEDUOW = "CIM_StartedUoW";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_UOWMETRIC = "CIM_UoWMetric";
	
	
	/**
	*	Since UnitOfWork is designed to be an extremely lightweight object, it is recommended that this property not be used. The Description specified for the instance's associated CIM_UnitOfWorkDefintion should apply.
	*/
	public final static String CIM_PROPERTY_DESCRIPTION = "Description"; //$NON-NLS-1$
	/**
	*	The elapsed time since the UnitOfWork was started. Upon completion of the UnitOfWork, this property contains the total amount of time taken in processing the entire UnitOfWork.
	*/
	public final static String CIM_PROPERTY_ELAPSEDTIME = "ElapsedTime"; //$NON-NLS-1$
	/**
	*	The identifier of the UnitOfWork, within the context of the UnitOfWorkDefinition.
	*/
	public final static String CIM_PROPERTY_ID = "Id"; //$NON-NLS-1$
	/**
	*	A string that uniquely identifies the mutual context of UnitOfWork instances. The context is defined as an individual action that several UnitOfWork instances participate in. The use of Ids such as OSF UUID/GUIDs is recommended, although some implementations may require longer Ids. (This is the reason why no maxlen(16) qualifier has been used.) 
MutualContextId explicitly identifies the context for instances of UnitOfWork, that is otherwise provided implicitly by SubUoW association instances. In addition, one can query directly (i.e. without following the associations) for UnitOfWork instances that participate in some individual action (i.e., the mutual context). If no mutual context is needed or if it is not supported by the implementation, the value is NULL. 
Note that the MutualContextId value is to be transferred internally between the participating UnitOfWork implementations such that each UnitOfWork instance implementation receives its value from its predecessor/parent or initially creates the value if it is the first instance of the context.
	*/
	public final static String CIM_PROPERTY_MUTUALCONTEXTID = "MutualContextId"; //$NON-NLS-1$
	/**
	*	The time that the UnitOfWork was started.
	*/
	public final static String CIM_PROPERTY_STARTTIME = "StartTime"; //$NON-NLS-1$
	/**
	*	An enumeration identifing the status of the UnitOfWork. Most of the property values are self-explanatory, but a few need additional text: 
3="Completed" - Should be used to represent a 'completed' transaction whose status ('good', 'failed' or 'aborted') is unknown. 
6="Completed Aborted" - Should be used when a UnitOfWork has completed but was not allowed to end normally. An example would be when the Stop or Back buttons are selected from a web browser, before a page is fully loaded.
	*/
	public final static String CIM_PROPERTY_STATUS = "Status"; //$NON-NLS-1$
	/**
	*	Indicates the granularity at which traces are written for this particular instance of UnitOfWork. Traces allow providing more detailed information on the course of the execution of the UnitOfWork than just the status and the elapsed time. The trace level does not indicate where the traces are found (i.e. in which file or CIM instances). TraceLevel cannot be set (i.e. written) since an instance of UnitOfWork only publishes information. So, the application code that executes the unit of work must receive the desired trace level by its caller (e.g. the parent module, the user or some remote system that initiates the unit of work). 
If its value is 0, no traces are available. If its value is > 0, traces are available. Except 0, the possible values and their semantics are implementation dependent. Two instances of UnitOfWork (even with the same definition) may have different trace levels since the desired or required granularity of traces may be dependent on the execution context (detection of an error, analysis of an error, etc.) of the unit of work. 
The trace level can be encoded as a bit map (each individual bit indicates a certain trace type and/or level of detail) or numbers (that are further defined by a value map). No encoding scheme is imposed since no general rules or standards exist and in consequence, application developers could reuse their existing trace level scheme.
	*/
	public final static String CIM_PROPERTY_TRACELEVEL = "TraceLevel"; //$NON-NLS-1$
	/**
	*	A 16 byte value that uniquely identifies the UnitOfWork Definition. The use of OSF UUID/GUIDs is recommended.
	*/
	public final static String CIM_PROPERTY_UOWDEFID = "UoWDefId"; //$NON-NLS-1$
	/**
	*	The name of the user who initiated the UnitOfWork. This may be a real user's login name or a logical name representing an application.
	*/
	public final static String CIM_PROPERTY_USERNAME = "UserName"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ELAPSEDTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_ID);
		CIM_PropertyNameList.add(CIM_PROPERTY_MUTUALCONTEXTID);
		CIM_PropertyNameList.add(CIM_PROPERTY_STARTTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_STATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRACELEVEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_UOWDEFID);
		CIM_PropertyNameList.add(CIM_PROPERTY_USERNAME);
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESCRIPTION)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELAPSEDTIME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ID)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MUTUALCONTEXTID)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STARTTIME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STATUS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRACELEVEL)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UOWDEFID)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USERNAME)){
				continue;
			}
			
			CIM_UnitOfWork.CIM_PropertyNameList.add(CIM_ManagedElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELAPSEDTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ID, new CIMValue(null, new CIMDataType(CIMDataType.SINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MUTUALCONTEXTID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STARTTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRACELEVEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UOWDEFID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USERNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESCRIPTION)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELAPSEDTIME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ID)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MUTUALCONTEXTID)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STARTTIME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STATUS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRACELEVEL)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UOWDEFID)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USERNAME)){
				continue;
			}
			
			CIM_UnitOfWork.CIM_PropertyList.add(CIM_ManagedElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ManagedElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ManagedElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ManagedElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_STATUS = {"Active","Suspended","Completed","Completed Good","Completed Failed","Completed Aborted"};
	
	
	public final static int STATUS_ACTIVE = 1;
	public final static int STATUS_SUSPENDED = 2;
	public final static int STATUS_COMPLETED = 3;
	public final static int STATUS_COMPLETEDGOOD = 4;
	public final static int STATUS_COMPLETEDFAILED = 5;
	public final static int STATUS_COMPLETEDABORTED = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_UnitOfWork() {

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
	public CIM_UnitOfWork(Vector keyProperties){ 
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
	public CIM_UnitOfWork(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_Id = this.cimInstance.getProperty(CIM_PROPERTY_ID);
		
		if (CIMProperty_Id == null || CIMProperty_Id.getValue().isEmpty() || CIMProperty_Id.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ID, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_UoWDefId = this.cimInstance.getProperty(CIM_PROPERTY_UOWDEFID);
		
		if (CIMProperty_UoWDefId == null || CIMProperty_UoWDefId.getValue().isEmpty() || CIMProperty_UoWDefId.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_UOWDEFID, "Key"});
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
	    
	    if (!(object instanceof CIM_UnitOfWork)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_UnitOfWork)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_UnitOfWork)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_UnitOfWork)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_UnitOfWork)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_UnitOfWork)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_UnitOfWork)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_UnitOfWork)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_UnitOfWork)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_UnitOfWork)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_LogicalElement_CIM_LogicalElementPerformsUoWs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALELEMENTPERFORMSUOW, 
					CIM_LogicalElement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_UnitOfWork.Java_Package_List.size(); i++) {
						if (!((String)(CIM_UnitOfWork.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_UnitOfWork.Java_Package_List.get(i))).endsWith(".")) {
							CIM_UnitOfWork.Java_Package_List.setElementAt((String)(CIM_UnitOfWork.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_UnitOfWork.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_LogicalElement_CIM_LogicalElementPerformsUoW_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALELEMENTPERFORMSUOW, 
					CIM_LogicalElement.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
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

	public ArrayList getAssociated_CIM_UnitOfWorkDefinition_CIM_StartedUoWs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_STARTEDUOW, 
					CIM_UnitOfWorkDefinition.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_UnitOfWork.Java_Package_List.size(); i++) {
						if (!((String)(CIM_UnitOfWork.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_UnitOfWork.Java_Package_List.get(i))).endsWith(".")) {
							CIM_UnitOfWork.Java_Package_List.setElementAt((String)(CIM_UnitOfWork.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_UnitOfWork.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_UnitOfWorkDefinition(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_UnitOfWorkDefinition(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_UnitOfWorkDefinition(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_UnitOfWorkDefinition_CIM_StartedUoW_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_STARTEDUOW, 
					CIM_UnitOfWorkDefinition.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_UnitOfWorkDefinition.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_MetricDefinition_CIM_UoWMetrics(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_UOWMETRIC, 
					CIM_MetricDefinition.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_UnitOfWork.Java_Package_List.size(); i++) {
						if (!((String)(CIM_UnitOfWork.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_UnitOfWork.Java_Package_List.get(i))).endsWith(".")) {
							CIM_UnitOfWork.Java_Package_List.setElementAt((String)(CIM_UnitOfWork.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_UnitOfWork.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_MetricDefinition(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_MetricDefinition(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_MetricDefinition(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_MetricDefinition_CIM_UoWMetric_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_UOWMETRIC, 
					CIM_MetricDefinition.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_MetricDefinition.CIM_CLASS_NAME)) {
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
	
	// Attribute Description
	
	public String get_Description() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_DESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_DESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_DESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Description(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_DESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_DESCRIPTION + " could not be found");
    		
		} else if (!CIM_UnitOfWorkHelper.isValid_Description(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitOfWork.CIM_PROPERTY_DESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_DESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ElapsedTime
	
	public Calendar get_ElapsedTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_ELAPSEDTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_ELAPSEDTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_ELAPSEDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_ElapsedTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_ELAPSEDTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_ELAPSEDTIME + " could not be found");
    		
		} else if (!CIM_UnitOfWorkHelper.isValid_ElapsedTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitOfWork.CIM_PROPERTY_ELAPSEDTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_ELAPSEDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute Id
	
	public Long get_Id() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_ID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_ID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_ID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Long)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Id(Long newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_ID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnitOfWork.CIM_PROPERTY_ID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_ID + " could not be found");
    		
		} else if (!CIM_UnitOfWorkHelper.isValid_Id(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitOfWork.CIM_PROPERTY_ID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_ID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MutualContextId
	
	public String get_MutualContextId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_MUTUALCONTEXTID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_MUTUALCONTEXTID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_MUTUALCONTEXTID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MutualContextId(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_MUTUALCONTEXTID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_MUTUALCONTEXTID + " could not be found");
    		
		} else if (!CIM_UnitOfWorkHelper.isValid_MutualContextId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitOfWork.CIM_PROPERTY_MUTUALCONTEXTID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_MUTUALCONTEXTID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StartTime
	
	public Calendar get_StartTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_STARTTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_STARTTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_STARTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_StartTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_STARTTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_STARTTIME + " could not be found");
    		
		} else if (!CIM_UnitOfWorkHelper.isValid_StartTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitOfWork.CIM_PROPERTY_STARTTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_STARTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute Status
	
	public UnsignedInt16 get_Status() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_STATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_STATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_STATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Status(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_STATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_STATUS + " could not be found");
    		
		} else if (!CIM_UnitOfWorkHelper.isValid_Status(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitOfWork.CIM_PROPERTY_STATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_STATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TraceLevel
	
	public UnsignedInt32 get_TraceLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_TRACELEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_TRACELEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_TRACELEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TraceLevel(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_TRACELEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_TRACELEVEL + " could not be found");
    		
		} else if (!CIM_UnitOfWorkHelper.isValid_TraceLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitOfWork.CIM_PROPERTY_TRACELEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_TRACELEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UoWDefId
	
	public String get_UoWDefId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_UOWDEFID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_UOWDEFID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_UOWDEFID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UoWDefId(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_UOWDEFID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnitOfWork.CIM_PROPERTY_UOWDEFID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_UOWDEFID + " could not be found");
    		
		} else if (!CIM_UnitOfWorkHelper.isValid_UoWDefId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitOfWork.CIM_PROPERTY_UOWDEFID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_UOWDEFID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UserName
	
	public String get_UserName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_USERNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_USERNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_USERNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UserName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnitOfWork.CIM_PROPERTY_USERNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnitOfWork.CIM_PROPERTY_USERNAME + " could not be found");
    		
		} else if (!CIM_UnitOfWorkHelper.isValid_UserName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnitOfWork.CIM_PROPERTY_USERNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnitOfWork.CIM_PROPERTY_USERNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
