/** 
 * PRS_ServiceIncident.java
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
 * Description: PRS_ServiceIncident contains the fundamental information related to a specific incident: its identity, status, priority, etc. The actual incident data, including specific transactions and resolution information, is contained in the objects associated with PRS_ServiceIncident. These include specific Problem, Resolution and Activity related objects accrued through the Transaction workflow.
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



public class PRS_ServiceIncident extends PRS_ExchangeElement  {
	
	public final static String CIM_CLASS_NAME = "PRS_ServiceIncident";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEACTIVITY = "PRS_ServiceActivity";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEAGREEMENT = "PRS_ServiceAgreement";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEPROBLEM = "PRS_ServiceProblem";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEPROVIDER = "PRS_ServiceProvider";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEREQUESTER = "PRS_ServiceRequester";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICERESOLUTIONSOLUTION = "PRS_ServiceResolutionSolution";
	
	
	/**
	*	Was the last transaction was accepted or rejected?
	*/
	public final static String CIM_PROPERTY_ACKNOWLEDGE = "Acknowledge"; //$NON-NLS-1$
	/**
	*	Additional general information about the incident.
	*/
	public final static String CIM_PROPERTY_COMMENT = "Comment"; //$NON-NLS-1$
	/**
	*	The state of the incident within the Service Incident Exchange Standard transaction model.
	*/
	public final static String CIM_PROPERTY_CURRENTSTATE = "CurrentState"; //$NON-NLS-1$
	/**
	*	Is the Requester entitled to service or not?
	*/
	public final static String CIM_PROPERTY_ENTITLED = "Entitled"; //$NON-NLS-1$
	/**
	*	The name of the last transaction which was acknowledged.
	*/
	public final static String CIM_PROPERTY_LASTTRANSACTION = "LastTransaction"; //$NON-NLS-1$
	/**
	*	The unique identifier for this incident assigned by the Provider.
	*/
	public final static String CIM_PROPERTY_PROVIDERID = "ProviderID"; //$NON-NLS-1$
	/**
	*	The priority of the incident as defined by the Requester. One is the highest priority and five is the lowest priority.
	*/
	public final static String CIM_PROPERTY_PROVIDERPRIORITY = "ProviderPriority"; //$NON-NLS-1$
	/**
	*	The unique identifier for this incident assigned by the Requester.
	*/
	public final static String CIM_PROPERTY_REQUESTERID = "RequesterID"; //$NON-NLS-1$
	/**
	*	The severity of the incident as defined by the Requester. One is the most severe and five is the least severe.
	*/
	public final static String CIM_PROPERTY_REQUESTERSEVERITY = "RequesterSeverity"; //$NON-NLS-1$
	/**
	*	The explicit time the Requester expects a response.
	*/
	public final static String CIM_PROPERTY_RESPONSETIME = "ResponseTime"; //$NON-NLS-1$
	/**
	*	The use of the TransactionName property is deprecated. New Service Incidents should use the LastTransaction property and set this property to NULL.
	*/
	public final static String CIM_PROPERTY_TRANSACTIONNAME = "TransactionName"; //$NON-NLS-1$
	/**
	*	Status of the incident according to the workflow.
	*/
	public final static String CIM_PROPERTY_WORKFLOWSTATUS = "WorkflowStatus"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACKNOWLEDGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_COMMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENTITLED);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTTRANSACTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROVIDERID);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROVIDERPRIORITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTERID);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTERSEVERITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_RESPONSETIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRANSACTIONNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_WORKFLOWSTATUS);
				
		for (int i = 0; i < PRS_ExchangeElement.CIM_PropertyNameList.size(); i++) {
			if (((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACKNOWLEDGE)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMMENT)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTSTATE)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENTITLED)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTTRANSACTION)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROVIDERID)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROVIDERPRIORITY)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTERID)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTERSEVERITY)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RESPONSETIME)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRANSACTIONNAME)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WORKFLOWSTATUS)){
				continue;
			}
			
			PRS_ServiceIncident.CIM_PropertyNameList.add(PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACKNOWLEDGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMMENT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENTITLED, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTTRANSACTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROVIDERID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROVIDERPRIORITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTERID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTERSEVERITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESPONSETIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRANSACTIONNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WORKFLOWSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < PRS_ExchangeElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACKNOWLEDGE)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMMENT)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTSTATE)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENTITLED)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTTRANSACTION)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROVIDERID)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROVIDERPRIORITY)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTERID)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTERSEVERITY)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RESPONSETIME)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRANSACTIONNAME)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WORKFLOWSTATUS)){
				continue;
			}
			
			PRS_ServiceIncident.CIM_PropertyList.add(PRS_ExchangeElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < PRS_ExchangeElement.Java_Package_List.size(); i++) {
			if (((String)PRS_ExchangeElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(PRS_ExchangeElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ACKNOWLEDGE = {"Yes","No","Other","Unknown"};
	public final static String[] CIM_VALUEMAP_CURRENTSTATE = {"Beginning_State","Not_Entitled","Entitled","Problem_Submitted","Open_Requester","Open_Provider","Closed_Pending_Confirmation","Closed","Other","Unknown"};
	public final static String[] CIM_VALUEMAP_ENTITLED = {"Yes","No","Other","Unknown"};
	public final static String[] CIM_VALUEMAP_LASTTRANSACTION = {"Service_Request","Entitlement","Problem_Submittal","Accept_Problem","Problem_Resolution","Request_Problem_Information","Provide_Problem_Information","Provide_Admin_Information","Query_Incident","Confirm_Close","Reject_Resolution","Request_Closure","Other","Unknown"};
	public final static String[] CIM_VALUEMAP_PROVIDERPRIORITY = {"Value0","Value1","Value2","Value3","Value4"};
	public final static String[] CIM_VALUEMAP_REQUESTERSEVERITY = {"Value0","Value1","Value2","Value3","Value4"};
	
	
	public final static int ACKNOWLEDGE_YES = 0;
	public final static int ACKNOWLEDGE_NO = 1;
	public final static int ACKNOWLEDGE_OTHER = 254;
	public final static int ACKNOWLEDGE_UNKNOWN = 255;
	
	public final static int CURRENTSTATE_BEGINNING_STATE = 0;
	public final static int CURRENTSTATE_NOT_ENTITLED = 1;
	public final static int CURRENTSTATE_ENTITLED = 2;
	public final static int CURRENTSTATE_PROBLEM_SUBMITTED = 3;
	public final static int CURRENTSTATE_OPEN_REQUESTER = 4;
	public final static int CURRENTSTATE_OPEN_PROVIDER = 5;
	public final static int CURRENTSTATE_CLOSED_PENDING_CONFIRMATION = 6;
	public final static int CURRENTSTATE_CLOSED = 7;
	public final static int CURRENTSTATE_OTHER = 254;
	public final static int CURRENTSTATE_UNKNOWN = 255;
	
	public final static int ENTITLED_YES = 0;
	public final static int ENTITLED_NO = 1;
	public final static int ENTITLED_OTHER = 254;
	public final static int ENTITLED_UNKNOWN = 255;
	
	public final static int LASTTRANSACTION_SERVICE_REQUEST = 0;
	public final static int LASTTRANSACTION_ENTITLEMENT = 1;
	public final static int LASTTRANSACTION_PROBLEM_SUBMITTAL = 2;
	public final static int LASTTRANSACTION_ACCEPT_PROBLEM = 3;
	public final static int LASTTRANSACTION_PROBLEM_RESOLUTION = 4;
	public final static int LASTTRANSACTION_REQUEST_PROBLEM_INFORMATION = 5;
	public final static int LASTTRANSACTION_PROVIDE_PROBLEM_INFORMATION = 6;
	public final static int LASTTRANSACTION_PROVIDE_ADMIN_INFORMATION = 7;
	public final static int LASTTRANSACTION_QUERY_INCIDENT = 8;
	public final static int LASTTRANSACTION_CONFIRM_CLOSE = 9;
	public final static int LASTTRANSACTION_REJECT_RESOLUTION = 10;
	public final static int LASTTRANSACTION_REQUEST_CLOSURE = 11;
	public final static int LASTTRANSACTION_OTHER = 254;
	public final static int LASTTRANSACTION_UNKNOWN = 255;
	
	public final static int PROVIDERPRIORITY_VALUE0 = 1;
	public final static int PROVIDERPRIORITY_VALUE1 = 2;
	public final static int PROVIDERPRIORITY_VALUE2 = 3;
	public final static int PROVIDERPRIORITY_VALUE3 = 4;
	public final static int PROVIDERPRIORITY_VALUE4 = 5;
	
	public final static int REQUESTERSEVERITY_VALUE0 = 1;
	public final static int REQUESTERSEVERITY_VALUE1 = 2;
	public final static int REQUESTERSEVERITY_VALUE2 = 3;
	public final static int REQUESTERSEVERITY_VALUE3 = 4;
	public final static int REQUESTERSEVERITY_VALUE4 = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public PRS_ServiceIncident() {

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
	public PRS_ServiceIncident(Vector keyProperties){ 
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
	public PRS_ServiceIncident(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof PRS_ServiceIncident)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((PRS_ServiceIncident)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((PRS_ServiceIncident)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((PRS_ServiceIncident)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((PRS_ServiceIncident)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((PRS_ServiceIncident)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((PRS_ServiceIncident)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((PRS_ServiceIncident)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((PRS_ServiceIncident)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((PRS_ServiceIncident)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_PRS_Activity_PRS_ServiceActivitys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEACTIVITY, 
					PRS_Activity.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < PRS_ServiceIncident.Java_Package_List.size(); i++) {
						if (!((String)(PRS_ServiceIncident.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(PRS_ServiceIncident.Java_Package_List.get(i))).endsWith(".")) {
							PRS_ServiceIncident.Java_Package_List.setElementAt((String)(PRS_ServiceIncident.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (PRS_ServiceIncident.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Activity(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new PRS_Activity(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Activity(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_PRS_Activity_PRS_ServiceActivity_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEACTIVITY, 
					PRS_Activity.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(PRS_Activity.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_PRS_Agreement_PRS_ServiceAgreements(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEAGREEMENT, 
					PRS_Agreement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < PRS_ServiceIncident.Java_Package_List.size(); i++) {
						if (!((String)(PRS_ServiceIncident.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(PRS_ServiceIncident.Java_Package_List.get(i))).endsWith(".")) {
							PRS_ServiceIncident.Java_Package_List.setElementAt((String)(PRS_ServiceIncident.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (PRS_ServiceIncident.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Agreement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new PRS_Agreement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Agreement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_PRS_Agreement_PRS_ServiceAgreement_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEAGREEMENT, 
					PRS_Agreement.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(PRS_Agreement.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_PRS_Problem_PRS_ServiceProblems(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEPROBLEM, 
					PRS_Problem.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < PRS_ServiceIncident.Java_Package_List.size(); i++) {
						if (!((String)(PRS_ServiceIncident.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(PRS_ServiceIncident.Java_Package_List.get(i))).endsWith(".")) {
							PRS_ServiceIncident.Java_Package_List.setElementAt((String)(PRS_ServiceIncident.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (PRS_ServiceIncident.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Problem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new PRS_Problem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Problem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_PRS_Problem_PRS_ServiceProblem_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEPROBLEM, 
					PRS_Problem.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(PRS_Problem.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_PRS_Contact_PRS_ServiceProviders(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEPROVIDER, 
					PRS_Contact.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < PRS_ServiceIncident.Java_Package_List.size(); i++) {
						if (!((String)(PRS_ServiceIncident.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(PRS_ServiceIncident.Java_Package_List.get(i))).endsWith(".")) {
							PRS_ServiceIncident.Java_Package_List.setElementAt((String)(PRS_ServiceIncident.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (PRS_ServiceIncident.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Contact(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new PRS_Contact(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Contact(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_PRS_Contact_PRS_ServiceProvider_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEPROVIDER, 
					PRS_Contact.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(PRS_Contact.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_PRS_Contact_PRS_ServiceRequesters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEREQUESTER, 
					PRS_Contact.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < PRS_ServiceIncident.Java_Package_List.size(); i++) {
						if (!((String)(PRS_ServiceIncident.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(PRS_ServiceIncident.Java_Package_List.get(i))).endsWith(".")) {
							PRS_ServiceIncident.Java_Package_List.setElementAt((String)(PRS_ServiceIncident.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (PRS_ServiceIncident.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Contact(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new PRS_Contact(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Contact(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_PRS_Contact_PRS_ServiceRequester_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICEREQUESTER, 
					PRS_Contact.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(PRS_Contact.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_PRS_Solution_PRS_ServiceResolutionSolutions(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICERESOLUTIONSOLUTION, 
					PRS_Solution.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < PRS_ServiceIncident.Java_Package_List.size(); i++) {
						if (!((String)(PRS_ServiceIncident.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(PRS_ServiceIncident.Java_Package_List.get(i))).endsWith(".")) {
							PRS_ServiceIncident.Java_Package_List.setElementAt((String)(PRS_ServiceIncident.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (PRS_ServiceIncident.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Solution(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new PRS_Solution(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Solution(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_PRS_Solution_PRS_ServiceResolutionSolution_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_SERVICERESOLUTIONSOLUTION, 
					PRS_Solution.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(PRS_Solution.CIM_CLASS_NAME)) {
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
	
	// Attribute Acknowledge
	
	public UnsignedInt8 get_Acknowledge() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_ACKNOWLEDGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_ACKNOWLEDGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_ACKNOWLEDGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Acknowledge(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_ACKNOWLEDGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_ACKNOWLEDGE + " could not be found");
    		
		} else if (!PRS_ServiceIncidentHelper.isValid_Acknowledge(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceIncident.CIM_PROPERTY_ACKNOWLEDGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_ACKNOWLEDGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Comment
	
	public String get_Comment() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_COMMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_COMMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_COMMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Comment(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_COMMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_COMMENT + " could not be found");
    		
		} else if (!PRS_ServiceIncidentHelper.isValid_Comment(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceIncident.CIM_PROPERTY_COMMENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_COMMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentState
	
	public UnsignedInt8 get_CurrentState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_CURRENTSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_CURRENTSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_CURRENTSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentState(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_CURRENTSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_CURRENTSTATE + " could not be found");
    		
		} else if (!PRS_ServiceIncidentHelper.isValid_CurrentState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceIncident.CIM_PROPERTY_CURRENTSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_CURRENTSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Entitled
	
	public UnsignedInt8 get_Entitled() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_ENTITLED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_ENTITLED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_ENTITLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Entitled(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_ENTITLED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_ENTITLED + " could not be found");
    		
		} else if (!PRS_ServiceIncidentHelper.isValid_Entitled(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceIncident.CIM_PROPERTY_ENTITLED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_ENTITLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastTransaction
	
	public UnsignedInt8 get_LastTransaction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_LASTTRANSACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_LASTTRANSACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_LASTTRANSACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LastTransaction(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_LASTTRANSACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_LASTTRANSACTION + " could not be found");
    		
		} else if (!PRS_ServiceIncidentHelper.isValid_LastTransaction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceIncident.CIM_PROPERTY_LASTTRANSACTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_LASTTRANSACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProviderID
	
	public String get_ProviderID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_PROVIDERID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_PROVIDERID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_PROVIDERID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProviderID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_PROVIDERID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_PROVIDERID + " could not be found");
    		
		} else if (!PRS_ServiceIncidentHelper.isValid_ProviderID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceIncident.CIM_PROPERTY_PROVIDERID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_PROVIDERID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProviderPriority
	
	public UnsignedInt8 get_ProviderPriority() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_PROVIDERPRIORITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_PROVIDERPRIORITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_PROVIDERPRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProviderPriority(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_PROVIDERPRIORITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_PROVIDERPRIORITY + " could not be found");
    		
		} else if (!PRS_ServiceIncidentHelper.isValid_ProviderPriority(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceIncident.CIM_PROPERTY_PROVIDERPRIORITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_PROVIDERPRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequesterID
	
	public String get_RequesterID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_REQUESTERID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_REQUESTERID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_REQUESTERID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequesterID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_REQUESTERID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_REQUESTERID + " could not be found");
    		
		} else if (!PRS_ServiceIncidentHelper.isValid_RequesterID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceIncident.CIM_PROPERTY_REQUESTERID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_REQUESTERID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequesterSeverity
	
	public UnsignedInt8 get_RequesterSeverity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_REQUESTERSEVERITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_REQUESTERSEVERITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_REQUESTERSEVERITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequesterSeverity(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_REQUESTERSEVERITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_REQUESTERSEVERITY + " could not be found");
    		
		} else if (!PRS_ServiceIncidentHelper.isValid_RequesterSeverity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceIncident.CIM_PROPERTY_REQUESTERSEVERITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_REQUESTERSEVERITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ResponseTime
	
	public Calendar get_ResponseTime() {

		CIMProperty property = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_RESPONSETIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_RESPONSETIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_RESPONSETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_ResponseTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_RESPONSETIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_RESPONSETIME + " could not be found");
    		
		} else if (!PRS_ServiceIncidentHelper.isValid_ResponseTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceIncident.CIM_PROPERTY_RESPONSETIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_RESPONSETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute TransactionName
	
	public String get_TransactionName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_TRANSACTIONNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_TRANSACTIONNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_TRANSACTIONNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TransactionName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_TRANSACTIONNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_TRANSACTIONNAME + " could not be found");
    		
		} else if (!PRS_ServiceIncidentHelper.isValid_TransactionName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceIncident.CIM_PROPERTY_TRANSACTIONNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_TRANSACTIONNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WorkflowStatus
	
	public String get_WorkflowStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_WORKFLOWSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_WORKFLOWSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_WORKFLOWSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WorkflowStatus(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceIncident.CIM_PROPERTY_WORKFLOWSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceIncident.CIM_PROPERTY_WORKFLOWSTATUS + " could not be found");
    		
		} else if (!PRS_ServiceIncidentHelper.isValid_WorkflowStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceIncident.CIM_PROPERTY_WORKFLOWSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceIncident.CIM_PROPERTY_WORKFLOWSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
