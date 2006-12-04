/** 
 * CIM_StorageHardwareIDManagementService.java
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
 * Description: StorageHardwareIDManagementService provides methods for manipulating instances of StorageHardwareIDs and manipulating the trust of these IDs in the underlying storage system.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import org.sblim.wbem.client.*;



public class CIM_StorageHardwareIDManagementService extends CIM_AuthenticationService  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageHardwareIDManagementService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	
	
	/**
	*	Create MemberOfCollection instances between the specified Collection and the StorageHardwareIDs. This method allows the client to make a request of a specific Service instance to create the associations. When these capabilities are standardized in CIM/WBEM, this method can be deprecated and intrinsic methods used.
	*/
	public final static String CIM_METHOD_ADDHARDWAREIDSTOCOLLECTION = "AddHardwareIDsToCollection";
	/**
	*	This method creates a CIM_GatewayPathID and the association CIM_ConcreteDependency between this service and the new GatewayPathID.
	*/
	public final static String CIM_METHOD_CREATEGATEWAYPATHID = "CreateGatewayPathID";
	/**
	*	Create a group of StorageHardwareIDs as a new instance of SystemSpecificCollection. This is useful to define a set of authorized subjects that can access volumes in a disk array. This method allows the client to make a request of a specific Service instance to create the collection and provide the appropriate class name. When these capabilities are standardized in CIM/WBEM, this method can be deprecated and intrinsic methods used. In addition to creating the collection, this method causes the creation of the HostedCollection association (to this service's scoping system) and MemberOfCollection association to members of the IDs parameter.
	*/
	public final static String CIM_METHOD_CREATEHARDWAREIDCOLLECTION = "CreateHardwareIDCollection";
	/**
	*	This method creates a CIM_StorageHardwareID, it creates the association CIM_ConcreteDependency between this service and the new CIM_StorageHardwareID.
	*/
	public final static String CIM_METHOD_CREATESTORAGEHARDWAREID = "CreateStorageHardwareID";
	/**
	*	This method deletes a named CIM_StorageHardwareID, and also tears down the associations that are no longer needed, including CIM_ConcreteDependency and CIM_AuthorizedSubject.
	*/
	public final static String CIM_METHOD_DELETESTORAGEHARDWAREID = "DeleteStorageHardwareID";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
				
		for (int i = 0; i < CIM_AuthenticationService.CIM_PropertyNameList.size(); i++) {
			
			CIM_StorageHardwareIDManagementService.CIM_PropertyNameList.add(CIM_AuthenticationService.CIM_PropertyNameList.elementAt(i));
		}
		
				
		for (int i = 0; i < CIM_AuthenticationService.CIM_PropertyList.size(); i++) {
			
			CIM_StorageHardwareIDManagementService.CIM_PropertyList.add(CIM_AuthenticationService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_AuthenticationService.Java_Package_List.size(); i++) {
			if (((String)CIM_AuthenticationService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_AuthenticationService.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageHardwareIDManagementService() {

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
	public CIM_StorageHardwareIDManagementService(Vector keyProperties){ 
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
	public CIM_StorageHardwareIDManagementService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageHardwareIDManagementService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageHardwareIDManagementService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageHardwareIDManagementService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageHardwareIDManagementService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageHardwareIDManagementService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageHardwareIDManagementService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageHardwareIDManagementService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageHardwareIDManagementService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageHardwareIDManagementService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageHardwareIDManagementService)object).cimObjectPath)) {
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
	
	
	public UnsignedInt32 invoke_addHardwareIDsToCollection(CIMClient cimClient, String HardwareIDs, CIM_SystemSpecificCollection Collection) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageHardwareIDManagementService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_HardwareIDs = new CIMValue(HardwareIDs, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_Collection = new CIMValue(Collection.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("HardwareIDs", cimValue_HardwareIDs));
		inParameter.add(new CIMArgument("Collection", cimValue_Collection));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_ADDHARDWAREIDSTOCOLLECTION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageHardwareIDManagementService.CIM_METHOD_ADDHARDWAREIDSTOCOLLECTION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageHardwareIDManagementService.CIM_METHOD_ADDHARDWAREIDSTOCOLLECTION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageHardwareIDManagementService.CIM_METHOD_ADDHARDWAREIDSTOCOLLECTION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createGatewayPathID(CIMClient cimClient, String ElementName, String StorageID, UnsignedInt16 IDType, String OtherIDType, String GatewayID, UnsignedInt16 GatewayIDType, String OtherGatewayIDType, CIM_GatewayPathID NewGatewayPathID) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageHardwareIDManagementService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ElementName = new CIMValue(ElementName, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_StorageID = new CIMValue(StorageID, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_IDType = new CIMValue(IDType, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_OtherIDType = new CIMValue(OtherIDType, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_GatewayID = new CIMValue(GatewayID, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_GatewayIDType = new CIMValue(GatewayIDType, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_OtherGatewayIDType = new CIMValue(OtherGatewayIDType, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_NewGatewayPathID = new CIMValue(NewGatewayPathID.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ElementName", cimValue_ElementName));
		inParameter.add(new CIMArgument("StorageID", cimValue_StorageID));
		inParameter.add(new CIMArgument("IDType", cimValue_IDType));
		inParameter.add(new CIMArgument("OtherIDType", cimValue_OtherIDType));
		inParameter.add(new CIMArgument("GatewayID", cimValue_GatewayID));
		inParameter.add(new CIMArgument("GatewayIDType", cimValue_GatewayIDType));
		inParameter.add(new CIMArgument("OtherGatewayIDType", cimValue_OtherGatewayIDType));
		inParameter.add(new CIMArgument("NewGatewayPathID", cimValue_NewGatewayPathID));
		
	  	outParameter.add(new CIMArgument("NewGatewayPathID", cimValue_NewGatewayPathID));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATEGATEWAYPATHID,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageHardwareIDManagementService.CIM_METHOD_CREATEGATEWAYPATHID + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageHardwareIDManagementService.CIM_METHOD_CREATEGATEWAYPATHID + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageHardwareIDManagementService.CIM_METHOD_CREATEGATEWAYPATHID + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createHardwareIDCollection(CIMClient cimClient, String ElementName, String HardwareIDs, CIM_SystemSpecificCollection Collection) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageHardwareIDManagementService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ElementName = new CIMValue(ElementName, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_HardwareIDs = new CIMValue(HardwareIDs, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_Collection = new CIMValue(Collection.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ElementName", cimValue_ElementName));
		inParameter.add(new CIMArgument("HardwareIDs", cimValue_HardwareIDs));
		inParameter.add(new CIMArgument("Collection", cimValue_Collection));
		
	  	outParameter.add(new CIMArgument("Collection", cimValue_Collection));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATEHARDWAREIDCOLLECTION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageHardwareIDManagementService.CIM_METHOD_CREATEHARDWAREIDCOLLECTION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageHardwareIDManagementService.CIM_METHOD_CREATEHARDWAREIDCOLLECTION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageHardwareIDManagementService.CIM_METHOD_CREATEHARDWAREIDCOLLECTION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createStorageHardwareID(CIMClient cimClient, String ElementName, String StorageID, UnsignedInt16 IDType, String OtherIDType, CIM_StorageClientSettingData Setting, CIM_StorageHardwareID HardwareID) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageHardwareIDManagementService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ElementName = new CIMValue(ElementName, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_StorageID = new CIMValue(StorageID, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_IDType = new CIMValue(IDType, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_OtherIDType = new CIMValue(OtherIDType, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_Setting = new CIMValue(Setting.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_HardwareID = new CIMValue(HardwareID.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ElementName", cimValue_ElementName));
		inParameter.add(new CIMArgument("StorageID", cimValue_StorageID));
		inParameter.add(new CIMArgument("IDType", cimValue_IDType));
		inParameter.add(new CIMArgument("OtherIDType", cimValue_OtherIDType));
		inParameter.add(new CIMArgument("Setting", cimValue_Setting));
		inParameter.add(new CIMArgument("HardwareID", cimValue_HardwareID));
		
	  	outParameter.add(new CIMArgument("HardwareID", cimValue_HardwareID));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATESTORAGEHARDWAREID,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageHardwareIDManagementService.CIM_METHOD_CREATESTORAGEHARDWAREID + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageHardwareIDManagementService.CIM_METHOD_CREATESTORAGEHARDWAREID + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageHardwareIDManagementService.CIM_METHOD_CREATESTORAGEHARDWAREID + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_deleteStorageHardwareID(CIMClient cimClient, CIM_StorageHardwareID HardwareID) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageHardwareIDManagementService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_HardwareID = new CIMValue(HardwareID.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("HardwareID", cimValue_HardwareID));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_DELETESTORAGEHARDWAREID,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageHardwareIDManagementService.CIM_METHOD_DELETESTORAGEHARDWAREID + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageHardwareIDManagementService.CIM_METHOD_DELETESTORAGEHARDWAREID + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageHardwareIDManagementService.CIM_METHOD_DELETESTORAGEHARDWAREID + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
