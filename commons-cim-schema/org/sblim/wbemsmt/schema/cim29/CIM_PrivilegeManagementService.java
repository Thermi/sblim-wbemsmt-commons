/** 
 * CIM_PrivilegeManagementService.java
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
 * Description: The PrivilegeManagementService is responsible for creating, deleting, and associating AuthorizedPrivilege instances. References to 'subject' and 'target' define the entities that are associated with an AuthorizedPrivilege instance via the relationships, AuthorizedSubject and AuthorizedTarget, respectively. When created, an AuthorizedPrivilege instance is related to this (PrivilegeManagement)Service via the association, ConcreteDependency.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import org.sblim.wbem.client.*;



public class CIM_PrivilegeManagementService extends CIM_AuthorizationService  {
	
	public final static String CIM_CLASS_NAME = "CIM_PrivilegeManagementService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	
	
	/**
	*	When this method is called, a provider updates the specified Subject's rights to the Target according to the parameters of this call. The rights are modeled via an AuthorizedPrivilege instance. If an AuthorizedPrivilege instance is created as a result of this call, it MUST be linked to the Subject and Target via the AuthorizedSubject and AuthorizedTarget associations, respectively. When created, the AuthorizedPrivilege instance is associated to this PrivilegeManagementService via ConcreteDependency. If the execution of this call results in no rights between the Subject and Target, then they MUST NOT be linked to a particular AuthorizedPrivilege instance via AuthorizedSubject and AuthorizedTarget respectively. 

Note that regardless of whether specified via parameter, or template, the Activities, ActivityQualifiers and QualifierFormats, are mutually indexed. Also note that Subject and Target references MUST be supplied. 

The successful completion of the method SHALL create any necessary AuthorizedSubject, AuthorizedTarget, AuthorizedPrivilege, HostedDependency, and ConcreteDependency instances.
	*/
	public final static String CIM_METHOD_ASSIGNACCESS = "AssignAccess";
	/**
	*	This method revokes a specific AuthorizedPrivilege or all privileges for a particular target, subject, or subject/target pair. If an AuthorizedPrivilege instance is left with no AuthorizedTarget associations, it SHOULD be deleted. The successful completion of the method SHALL remove the directly or indirectly requested AuthorizedSubject, AuthorizedTarget and AuthorizedPrivilege instances.
	*/
	public final static String CIM_METHOD_REMOVEACCESS = "RemoveAccess";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
				
		for (int i = 0; i < CIM_AuthorizationService.CIM_PropertyNameList.size(); i++) {
			
			CIM_PrivilegeManagementService.CIM_PropertyNameList.add(CIM_AuthorizationService.CIM_PropertyNameList.elementAt(i));
		}
		
				
		for (int i = 0; i < CIM_AuthorizationService.CIM_PropertyList.size(); i++) {
			
			CIM_PrivilegeManagementService.CIM_PropertyList.add(CIM_AuthorizationService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_AuthorizationService.Java_Package_List.size(); i++) {
			if (((String)CIM_AuthorizationService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_AuthorizationService.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PrivilegeManagementService() {

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
	public CIM_PrivilegeManagementService(Vector keyProperties){ 
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
	public CIM_PrivilegeManagementService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PrivilegeManagementService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PrivilegeManagementService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PrivilegeManagementService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PrivilegeManagementService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PrivilegeManagementService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PrivilegeManagementService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PrivilegeManagementService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PrivilegeManagementService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PrivilegeManagementService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PrivilegeManagementService)object).cimObjectPath)) {
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
	
	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_assignAccess(CIMClient cimClient, CIM_ManagedElement Subject, Boolean PrivilegeGranted, UnsignedInt16 Activities, String ActivityQualifiers, UnsignedInt16 QualifierFormats, CIM_ManagedElement Target, CIM_AuthorizedPrivilege Privilege) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_PrivilegeManagementService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Subject = new CIMValue(Subject.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_PrivilegeGranted = new CIMValue(PrivilegeGranted, new CIMDataType(CIMDataType.BOOLEAN));
		CIMValue cimValue_Activities = new CIMValue(Activities, new CIMDataType(CIMDataType.UINT16_ARRAY));
		CIMValue cimValue_ActivityQualifiers = new CIMValue(ActivityQualifiers, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_QualifierFormats = new CIMValue(QualifierFormats, new CIMDataType(CIMDataType.UINT16_ARRAY));
		CIMValue cimValue_Target = new CIMValue(Target.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Privilege = new CIMValue(Privilege.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("Subject", cimValue_Subject));
		inParameter.add(new CIMArgument("PrivilegeGranted", cimValue_PrivilegeGranted));
		inParameter.add(new CIMArgument("Activities", cimValue_Activities));
		inParameter.add(new CIMArgument("ActivityQualifiers", cimValue_ActivityQualifiers));
		inParameter.add(new CIMArgument("QualifierFormats", cimValue_QualifierFormats));
		inParameter.add(new CIMArgument("Target", cimValue_Target));
		inParameter.add(new CIMArgument("Privilege", cimValue_Privilege));
		
	  	outParameter.add(new CIMArgument("Privilege", cimValue_Privilege));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_ASSIGNACCESS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_PrivilegeManagementService.CIM_METHOD_ASSIGNACCESS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_PrivilegeManagementService.CIM_METHOD_ASSIGNACCESS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_PrivilegeManagementService.CIM_METHOD_ASSIGNACCESS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_removeAccess(CIMClient cimClient, CIM_ManagedElement Subject, CIM_AuthorizedPrivilege Privilege, CIM_ManagedElement Target) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_PrivilegeManagementService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Subject = new CIMValue(Subject.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Privilege = new CIMValue(Privilege.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Target = new CIMValue(Target.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("Subject", cimValue_Subject));
		inParameter.add(new CIMArgument("Privilege", cimValue_Privilege));
		inParameter.add(new CIMArgument("Target", cimValue_Target));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_REMOVEACCESS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_PrivilegeManagementService.CIM_METHOD_REMOVEACCESS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_PrivilegeManagementService.CIM_METHOD_REMOVEACCESS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_PrivilegeManagementService.CIM_METHOD_REMOVEACCESS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
