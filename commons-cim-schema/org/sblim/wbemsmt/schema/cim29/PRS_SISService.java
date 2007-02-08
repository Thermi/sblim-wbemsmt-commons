/** 
 * PRS_SISService.java
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
 * Description: The PRS_SISService is used as a class factory for PRS_Transactions.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import org.sblim.wbem.client.*;



public class PRS_SISService extends CIM_Service  {
	
	public final static String CIM_CLASS_NAME = "PRS_SISService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	
	
	/**
	*	The EndSISTransaction method is used to handle committing or aborting a transaction. For commit, the method is invoked by a remote system when all of the objects associated with the transaction have been placed in the child namespace created by StartSISTransaction. 

For abort, the method cleans up the child namespace and closes the specified PRS_Transaction, setting the Transaction's CompletionStatus to the method parameter of the same name.
	*/
	public final static String CIM_METHOD_ENDSISTRANSACTION = "EndSISTransaction";
	/**
	*	SetSISCompletionStatus is used to signal the system that originated a PRS_Transaction that the remote system has completed processing of the transaction. If the processing was successful, as indicated by the CompletionStatus parameter, the local system resets the DirtyFlag for all of the objects identified in the PRS_Activity instance associated with the PRS_Transaction.
	*/
	public final static String CIM_METHOD_SETSISCOMPLETIONSTATUS = "SetSISCompletionStatus";
	/**
	*	When invoked on a local system, this method validates the objects in the local repository, to determine if they are sufficient for the indicated (input parameter) TransactionType. If not, an error is returned and no additional processing is performed. If the repository is successfully validated, this method creates a PRS_Transaction instance for return to the caller. 

The method also reviews the repository looking for new, modified or deleted objects. As these objects are located, their keys are appended to the related strings in the PRS_Activity instance referenced by another parameter of this method. 

After all the appropriate new, modified or deleted objects have been located, this method invokes the PRS_SISService's StartSISTransaction method on the remote system specified by the objects related to the Service Incident, associated with the PRS_Activity instance specified as a method parameter. The TransactionType and PRS_Activity REF is forwarded to the remote system as method parameters as well as the PRS_Transaction REF for the instance created by this method. 

The remote system creates a child namespace using the PRS_Transaction REF for the name. The local system then transfers all of the new, modified and deleted objects to the namespace on the remote system. Once all objects have been successfully transferred, the PRS_SISService's EndSISTransaction method is invoked on the remote system with a Status value of zero to indicate that the remote system should attempt to commit the transaction to the remote repository. 

The remote system passes the results of the remote commit back to the originating system by invoking the PRS_SISService's SetSISCompletionStatus method on the system that originated the SIS transaction. The CompletionStatus method parameter indicates whether the remote commit was successful. If the CompletionStatis is zero, the remote commit was successful. If it was unsuccessful, the objects were not applied to the remote repository and the CompletionStatus is non-zero, indicating the error. The local invocation of the SetSIS CompletionStatus method updates the specified PRS_Transaction's TransactionState to Closed and CompletionStatus to the value provided by the remote system in the CompletionStatus method parameter. 

In order to promote extensibility, the uint32 return values for PRS_SISService's methods and Status-related parameters are mapped into three sections. The first describes the type of value being reported. It indicates Error versus Notification, and Standard versus Vendor-Specific. 

The second section describes the source of the value. It indicates Method, Operating System, Repository, or Transport. In addition, this section indicates whether the value was created locally or remotely. 

The third section is the specific return value. 

If all 32 bits of the return value are reset, the method completed successfully. Any other value indicates an error condition or notification. If D31 is set, the method did not complete successfully. If D31 is reset, but the rest of the return value is non-zero, this is a Notification that the operation did complete successfully, but that there is a conditon of which the caller should be aware. 

If D30 is set, the return value is vendor specific. If D30 is reset, the return value is defined by the standard. 

If D29 is set, the return value was generated by a remote system. If D29 is reset, the return value was generated locally. The bit is always set or reset by the local system. The local system sets the bit if it receives a non-zero return value from a remote method invocation. 

Bit D28 is reserved for future use and shall be reset on all return values. 

When there is an error or notification, D24 through D27 indicate its source. The following sources are currently defined (D24 is the least significant bit below): 
0000 Method 
0001 Operating System 
0010 Repository 
0011 Transport 
All remaining values are reserved. 

Bits D16 through D23 are reserved for future use and shall be reset to zero. 

Bits D0 through D15 indicate the specific return value. If zero, all other bits in the return value must be zero, indicating successful completion of the method (or Transaction).
	*/
	public final static String CIM_METHOD_STARTSISTRANSACTION = "StartSISTransaction";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
				
		for (int i = 0; i < CIM_Service.CIM_PropertyNameList.size(); i++) {
			
			PRS_SISService.CIM_PropertyNameList.add(CIM_Service.CIM_PropertyNameList.elementAt(i));
		}
		
				
		for (int i = 0; i < CIM_Service.CIM_PropertyList.size(); i++) {
			
			PRS_SISService.CIM_PropertyList.add(CIM_Service.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Service.Java_Package_List.size(); i++) {
			if (((String)CIM_Service.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Service.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public PRS_SISService() {

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
	public PRS_SISService(Vector keyProperties){ 
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
	public PRS_SISService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof PRS_SISService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((PRS_SISService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((PRS_SISService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((PRS_SISService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((PRS_SISService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((PRS_SISService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((PRS_SISService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((PRS_SISService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((PRS_SISService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((PRS_SISService)object).cimObjectPath)) {
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
	
	
	public UnsignedInt32 invoke_endSISTransaction(CIMClient cimClient, UnsignedInt32 Status, PRS_Transaction TransactionRef) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				PRS_SISService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Status = new CIMValue(Status, new CIMDataType(CIMDataType.UINT32));
		CIMValue cimValue_TransactionRef = new CIMValue(TransactionRef.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("Status", cimValue_Status));
		inParameter.add(new CIMArgument("TransactionRef", cimValue_TransactionRef));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_ENDSISTRANSACTION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					PRS_SISService.CIM_METHOD_ENDSISTRANSACTION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					PRS_SISService.CIM_METHOD_ENDSISTRANSACTION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + PRS_SISService.CIM_METHOD_ENDSISTRANSACTION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_setSISCompletionStatus(CIMClient cimClient, UnsignedInt32 CompletionStatus, PRS_Transaction TransactionRef) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				PRS_SISService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_CompletionStatus = new CIMValue(CompletionStatus, new CIMDataType(CIMDataType.UINT32));
		CIMValue cimValue_TransactionRef = new CIMValue(TransactionRef.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("CompletionStatus", cimValue_CompletionStatus));
		inParameter.add(new CIMArgument("TransactionRef", cimValue_TransactionRef));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_SETSISCOMPLETIONSTATUS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					PRS_SISService.CIM_METHOD_SETSISCOMPLETIONSTATUS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					PRS_SISService.CIM_METHOD_SETSISCOMPLETIONSTATUS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + PRS_SISService.CIM_METHOD_SETSISCOMPLETIONSTATUS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_startSISTransaction(CIMClient cimClient, UnsignedInt8 TransactionType, PRS_Activity ActivityRef, PRS_Transaction TransactionRef) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				PRS_SISService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_TransactionType = new CIMValue(TransactionType, new CIMDataType(CIMDataType.UINT8));
		CIMValue cimValue_ActivityRef = new CIMValue(ActivityRef.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TransactionRef = new CIMValue(TransactionRef.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("TransactionType", cimValue_TransactionType));
		inParameter.add(new CIMArgument("ActivityRef", cimValue_ActivityRef));
		inParameter.add(new CIMArgument("TransactionRef", cimValue_TransactionRef));
		
	  	outParameter.add(new CIMArgument("TransactionRef", cimValue_TransactionRef));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_STARTSISTRANSACTION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					PRS_SISService.CIM_METHOD_STARTSISTRANSACTION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					PRS_SISService.CIM_METHOD_STARTSISTRANSACTION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + PRS_SISService.CIM_METHOD_STARTSISTRANSACTION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
