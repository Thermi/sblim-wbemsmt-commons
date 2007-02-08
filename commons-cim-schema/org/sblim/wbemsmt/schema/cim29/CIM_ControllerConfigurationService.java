/** 
 * CIM_ControllerConfigurationService.java
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
 * Description: The ControllerConfigurationService provides methods that allow a client to manipulate LUN Masking in a storage system.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import org.sblim.wbem.client.*;



public class CIM_ControllerConfigurationService extends CIM_Service  {
	
	public final static String CIM_CLASS_NAME = "CIM_ControllerConfigurationService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	
	
	/**
	*	This method associates a LogicalDevice subclass (specifically a StorageVolume or MediaAccessDevice subclass) to the referenced ProtocolController. The association is persisted as an instance of ProtocolControllerForUnit. The management instrumentation provider must verify that the logical unit numbers (defined using the DeviceNumber input parameter) are unique for the ProtocolController. When the Protocol Controller is actively masking a device (i.e. is part of an AuthorizedTarget association), the provider should update the access configuration in the underlying hardware as appropriate.
	*/
	public final static String CIM_METHOD_ATTACHDEVICE = "AttachDevice";
	/**
	*	This method creates an appropriate subclass of ProtocolController. In addition to its role of controlling downstream devices, a ProtocolControl is used to provide a central management point for access control with respect to those devices. Certain storage system implementations across multiple vendors require permissions to be established atomically with the creation of a ProtocolController. This method provides this capability via the Privilege and Identity properties. By supplying appropriate information in those properties, this method will assure that appropriate AuthorizedTarget and AuthorizedSubject associations, (as defined in the User and Security Model), are instantiated to restrict access to the logical devices 'behind' it. 
If multiple target ports are specified in the Ports input parameter, all expose the same view (i.e., have the same unit numbers and permissions). This method does not create the port instances, but does create ProtocolControllerForPort associations between the specified ports and the new ProtocolController. The new ProtocolController is defined to be weak to the same System as the ControllerConfigurationService.
	*/
	public final static String CIM_METHOD_CREATEPROTOCOLCONTROLLERWITHPORTS = "CreateProtocolControllerWithPorts";
	/**
	*	The method deletes an instance of ProtocolController and all associations in which this ProtocolController is referenced.
	*/
	public final static String CIM_METHOD_DELETEPROTOCOLCONTROLLER = "DeleteProtocolController";
	/**
	*	This method removes the ProtocolControllerForDevice association subclass between the ProtocolController and a LogicalDevice, such as a StorageVolume or a MediaAccessDevice. When the ProtocolController is actively masking a device (i.e. is part of an AuthorizedTarget association, the management instrumentation provider should update the hardware access configuration when DetachDevice is called.
	*/
	public final static String CIM_METHOD_DETACHDEVICE = "DetachDevice";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
				
		for (int i = 0; i < CIM_Service.CIM_PropertyNameList.size(); i++) {
			
			CIM_ControllerConfigurationService.CIM_PropertyNameList.add(CIM_Service.CIM_PropertyNameList.elementAt(i));
		}
		
				
		for (int i = 0; i < CIM_Service.CIM_PropertyList.size(); i++) {
			
			CIM_ControllerConfigurationService.CIM_PropertyList.add(CIM_Service.CIM_PropertyList.elementAt(i));
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
	public CIM_ControllerConfigurationService() {

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
	public CIM_ControllerConfigurationService(Vector keyProperties){ 
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
	public CIM_ControllerConfigurationService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ControllerConfigurationService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ControllerConfigurationService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ControllerConfigurationService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ControllerConfigurationService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ControllerConfigurationService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ControllerConfigurationService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ControllerConfigurationService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ControllerConfigurationService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ControllerConfigurationService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ControllerConfigurationService)object).cimObjectPath)) {
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
	
	
	public UnsignedInt32 invoke_attachDevice(CIMClient cimClient, CIM_ProtocolController ProtocolController, CIM_LogicalDevice Device, String DeviceNumber) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ControllerConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ProtocolController = new CIMValue(ProtocolController.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Device = new CIMValue(Device.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_DeviceNumber = new CIMValue(DeviceNumber, new CIMDataType(CIMDataType.STRING));
		
	  	inParameter.add(new CIMArgument("ProtocolController", cimValue_ProtocolController));
		inParameter.add(new CIMArgument("Device", cimValue_Device));
		inParameter.add(new CIMArgument("DeviceNumber", cimValue_DeviceNumber));
		
	  	outParameter.add(new CIMArgument("DeviceNumber", cimValue_DeviceNumber));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_ATTACHDEVICE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ControllerConfigurationService.CIM_METHOD_ATTACHDEVICE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ControllerConfigurationService.CIM_METHOD_ATTACHDEVICE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ControllerConfigurationService.CIM_METHOD_ATTACHDEVICE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createProtocolControllerWithPorts(CIMClient cimClient, String ElementName, String Ports, UnsignedInt16 Protocol, CIM_Privilege Privilege, CIM_ManagedElement Identity, CIM_ProtocolController ProtocolController) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ControllerConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ElementName = new CIMValue(ElementName, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_Ports = new CIMValue(Ports, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_Protocol = new CIMValue(Protocol, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_Privilege = new CIMValue(Privilege.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Identity = new CIMValue(Identity.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_ProtocolController = new CIMValue(ProtocolController.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ElementName", cimValue_ElementName));
		inParameter.add(new CIMArgument("Ports", cimValue_Ports));
		inParameter.add(new CIMArgument("Protocol", cimValue_Protocol));
		inParameter.add(new CIMArgument("Privilege", cimValue_Privilege));
		inParameter.add(new CIMArgument("Identity", cimValue_Identity));
		inParameter.add(new CIMArgument("ProtocolController", cimValue_ProtocolController));
		
	  	outParameter.add(new CIMArgument("ProtocolController", cimValue_ProtocolController));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATEPROTOCOLCONTROLLERWITHPORTS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ControllerConfigurationService.CIM_METHOD_CREATEPROTOCOLCONTROLLERWITHPORTS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ControllerConfigurationService.CIM_METHOD_CREATEPROTOCOLCONTROLLERWITHPORTS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ControllerConfigurationService.CIM_METHOD_CREATEPROTOCOLCONTROLLERWITHPORTS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_deleteProtocolController(CIMClient cimClient, CIM_ProtocolController ProtocolController, Boolean DeleteChildrenProtocolControllers, Boolean DeleteUnits) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ControllerConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ProtocolController = new CIMValue(ProtocolController.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_DeleteChildrenProtocolControllers = new CIMValue(DeleteChildrenProtocolControllers, new CIMDataType(CIMDataType.BOOLEAN));
		CIMValue cimValue_DeleteUnits = new CIMValue(DeleteUnits, new CIMDataType(CIMDataType.BOOLEAN));
		
	  	inParameter.add(new CIMArgument("ProtocolController", cimValue_ProtocolController));
		inParameter.add(new CIMArgument("DeleteChildrenProtocolControllers", cimValue_DeleteChildrenProtocolControllers));
		inParameter.add(new CIMArgument("DeleteUnits", cimValue_DeleteUnits));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_DELETEPROTOCOLCONTROLLER,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ControllerConfigurationService.CIM_METHOD_DELETEPROTOCOLCONTROLLER + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ControllerConfigurationService.CIM_METHOD_DELETEPROTOCOLCONTROLLER + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ControllerConfigurationService.CIM_METHOD_DELETEPROTOCOLCONTROLLER + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_detachDevice(CIMClient cimClient, CIM_ProtocolController ProtocolController, CIM_LogicalDevice Device) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ControllerConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ProtocolController = new CIMValue(ProtocolController.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Device = new CIMValue(Device.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ProtocolController", cimValue_ProtocolController));
		inParameter.add(new CIMArgument("Device", cimValue_Device));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_DETACHDEVICE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ControllerConfigurationService.CIM_METHOD_DETACHDEVICE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ControllerConfigurationService.CIM_METHOD_DETACHDEVICE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ControllerConfigurationService.CIM_METHOD_DETACHDEVICE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
