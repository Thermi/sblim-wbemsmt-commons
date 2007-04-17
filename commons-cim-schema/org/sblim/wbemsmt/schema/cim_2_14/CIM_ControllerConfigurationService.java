/** 
 * CIM_ControllerConfigurationService.java
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
 * Description:  The ControllerConfigurationService provides methods that allow a client to
 * manipulate LUN Masking in a storage system.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMArgument;
import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.client.CIMClient;



/**
 *  The ControllerConfigurationService provides methods that allow a client to
 * manipulate LUN Masking in a storage system.
 */
public class CIM_ControllerConfigurationService extends CIM_Service  {
	
	public final static String CIM_CLASS_NAME = "CIM_ControllerConfigurationService"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	
	
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
	/**
	*	Expose a list of SCSI logical units (such as RAID volumes or tape drives) to a list of initiators through a list of target ports, through one or more SCSIProtocolControllers (SPCs). 

The parameters for this method are: Job - null if no job created, otherwise this is a reference to the job. LUNames - the list of names of the logical units to use. InitiatorPortIDs - the names of the initiator ports to use. TargetPortIDs - the names of the target ports to use. DeviceNumbers - the device numbers (LUNs) to use. DeviceAccesses - permissions for the logical units. ProtocolControllers - SPCs involved in this operation. 

There are two modes of operation, create and modify. If a NULL value is passed in for the SPC, then the instrumentation will create at least one SPC that satisfies the request. Depending upon the instrumentation capabilities, more than one SPC MAY be created. (e.g. if CIM_ProtocolControllerMaskingCapabilities.OneHardwareIDPerView is true and more than one initiatorID was passed in, then one SPC per initiatorID will be created). If an SPC is passed in, then the instrumentation attempts to add the new paths to the existing SPC. Depending upon the instrumentation capabilities, this MAY result in the creation of additional SPCs. The instrumentation MAY return an error if honoring this request would violate SCSI semantics. 

For creating an SPC, the parameters that MUST be specified are dependent upon the SPCAllows* properties in CIM_ProtocolControllerMaskingCapabilities. If SPCAllowsNoLUs is false, the caller MUST specify a list of LUNames. If it is true, the caller MAY specify a list of LUNames or MAY pass in null. If SPCAllowsNoTargets is false and PortsPerView is not 'All Ports share the same view' the caller MUST specify a list of TargetPortIDs. If it is true, the caller MAY specify a list of TargetPortIDs or MAY pass in null. If SPCAllowsNoInitiators is false, the caller MUST specify a list of InitiatorPortIDs. If it is true, the caller MAY specify a list of InitiatorPortIDs or MAY pass in null. If LUNames is not null, the caller MUST specify DeviceAccesses for each logical unit. If the instrumentation's CIM_ProtocolControllerMaskingCapabilities ClientSelectableDeviceNumbers property is TRUE then the client MAY provide a list of device numbers (LUNs) to use for the paths to be created. If is false, the client MUST pass in NULL for this parameter. 

The LUNames, DeviceNumbers, and DeviceAccesses parameters are mutually indexed arrays - any element in DeviceNumbers or DeviceAccesses will set a property relative to the LogicalDevice instance named in the corresponding element of LUNames. LUNames and DeviceAccesses MUST have the same number of elements. DeviceNumbers MUST be null (asking the instrumentation to assign numbers) or have the same number of elements as LUNames. If these conditions are not met, the instrumentation MUST return a 'Invalid Parameter' status or a CIM_Error. 

For modifying an SPC, there are three specific use cases identified. The instrumentation MUST support these use cases. Other permutations are allowed, but are vendor-specific. The use cases are: Add LUs to a view, Add initiator IDs to a view, and Add target port IDs to a view. Add LUs to a view requires that the LUNames parameter not be null and that the InitiatorIDs and TargetPortIDs parameters be null. DeviceNumbers MAY be null if ClientSelectableDeviceNumbers is false. DeviceAccesses MUST be specified. Add initiator IDs to a view requires that the LUNames parameter be null, that the InitiatorIDs not be null, and that the TargetPortIDs parameters be null. DeviceNumbers and DeviceAccesses MUST be null. Add target port IDs to a view requires that the LUNames and InitiatorPortIDs parameters be null and is only possible is PortsPerView is 'Multiple Ports Per View'. DeviceNumbers and DeviceAccesses MUST also be null 

The relevant rules of SCSI semantics are: 
- an SPC MAY NOT be exposed through a particular host/target port pair that is in use by another SPC. (In other words, an SPC and its associated logical units and ports together correspond to the logical unit inventory provided by SCSI REPORT LUNS and INQUIRY commands) 
- each LogicalDevice associated to an SPC MUST have a unique ProtocolControllerForUnit DeviceNumber (logical unit number) 
The instrumentation MUST report an error if the client request would violate one of these rules. 

If the instrumentation provides PrivilegeManagementService, the results of setting DeviceAccesses MUST be synchronized with PrivilegeManagementService as described in the ProtocolControllerForUnit DeviceAccess description.
	*/
	public final static String CIM_METHOD_EXPOSEPATHS = "ExposePaths";
	/**
	*	Hide a list of SCSI logical units (such as a RAID volume or tape drive) from a list of initiators and/or target ports on a SCSIProtocolController (SPC). 

The parameters for this method are: Job - null if no job created, otherwise this is a reference to the job. LUNames - the list of names of the logical units to use. InitiatorPortIDs - the names of the initiator ports to use. TargetPortIDs - the names of the target ports to use. ProtocolControllers - SPCs involved in this operation. 

When hiding logical units, there are three specific use cases identified. The instrumentation MUST support these use cases. Other permutations are allowed, but are vendor-specific. The use cases are: Remove LUs from a view, Remove initiator IDs from a view, and Remove target port IDs from a view. Remove LUs from a view requires that the LUNames parameter not be null and that the InitiatorIDs and TargetPortIDs parameters be null. Remove initiator IDs from a view requires that the LUNames parameter be null, that the InitiatorIDs not be null, and that the TargetPortIDs parameters be null. Remove target port IDs from a view requires that the LUNames and InitiatorPortIDs parameters be null. 

The disposition of the SPC when the last logical unit, initiator ID, or target port ID is removed depends upon the CIM_ProtocolControllerMaskingCapabilites SPCAllowsNo* properties. If SPCAllowsNoLUs is false, then the SPC is automatically deleted when the last logical unit is removed. If SPCAllowsNoTargets is false, then the SPC is automatically deleted when the last target port ID is removed. If SPCAllowsNoInitiators is false, then the SPC is automatically deleted when the last initiator port ID is removed. In all other cases, the SPC MUST be explicitly deleted via the DeleteInstance intrinsic function.
	*/
	public final static String CIM_METHOD_HIDEPATHS = "HidePaths";
	

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
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Service.Java_Package_List.size(); i++) {
			if (((String)CIM_Service.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
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

	
	public UnsignedInt32 invoke_exposePaths(CIMClient cimClient, CIM_ConcreteJob Job, String LUNames, String InitiatorPortIDs, String TargetPortIDs, String DeviceNumbers, UnsignedInt16 DeviceAccesses, CIM_SCSIProtocolController ProtocolControllers) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ControllerConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Job = new CIMValue(Job.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_LUNames = new CIMValue(LUNames, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_InitiatorPortIDs = new CIMValue(InitiatorPortIDs, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_TargetPortIDs = new CIMValue(TargetPortIDs, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_DeviceNumbers = new CIMValue(DeviceNumbers, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_DeviceAccesses = new CIMValue(DeviceAccesses, new CIMDataType(CIMDataType.UINT16_ARRAY));
		CIMValue cimValue_ProtocolControllers = new CIMValue(ProtocolControllers.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE_ARRAY));
		
	  	inParameter.add(new CIMArgument("Job", cimValue_Job));
		inParameter.add(new CIMArgument("LUNames", cimValue_LUNames));
		inParameter.add(new CIMArgument("InitiatorPortIDs", cimValue_InitiatorPortIDs));
		inParameter.add(new CIMArgument("TargetPortIDs", cimValue_TargetPortIDs));
		inParameter.add(new CIMArgument("DeviceNumbers", cimValue_DeviceNumbers));
		inParameter.add(new CIMArgument("DeviceAccesses", cimValue_DeviceAccesses));
		inParameter.add(new CIMArgument("ProtocolControllers", cimValue_ProtocolControllers));
		
	  	outParameter.add(new CIMArgument("Job", cimValue_Job));
		outParameter.add(new CIMArgument("ProtocolControllers", cimValue_ProtocolControllers));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_EXPOSEPATHS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ControllerConfigurationService.CIM_METHOD_EXPOSEPATHS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ControllerConfigurationService.CIM_METHOD_EXPOSEPATHS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ControllerConfigurationService.CIM_METHOD_EXPOSEPATHS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_hidePaths(CIMClient cimClient, CIM_ConcreteJob Job, String LUNames, String InitiatorPortIDs, String TargetPortIDs, CIM_SCSIProtocolController ProtocolControllers) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ControllerConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Job = new CIMValue(Job.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_LUNames = new CIMValue(LUNames, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_InitiatorPortIDs = new CIMValue(InitiatorPortIDs, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_TargetPortIDs = new CIMValue(TargetPortIDs, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_ProtocolControllers = new CIMValue(ProtocolControllers.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE_ARRAY));
		
	  	inParameter.add(new CIMArgument("Job", cimValue_Job));
		inParameter.add(new CIMArgument("LUNames", cimValue_LUNames));
		inParameter.add(new CIMArgument("InitiatorPortIDs", cimValue_InitiatorPortIDs));
		inParameter.add(new CIMArgument("TargetPortIDs", cimValue_TargetPortIDs));
		inParameter.add(new CIMArgument("ProtocolControllers", cimValue_ProtocolControllers));
		
	  	outParameter.add(new CIMArgument("Job", cimValue_Job));
		outParameter.add(new CIMArgument("ProtocolControllers", cimValue_ProtocolControllers));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_HIDEPATHS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ControllerConfigurationService.CIM_METHOD_HIDEPATHS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ControllerConfigurationService.CIM_METHOD_HIDEPATHS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ControllerConfigurationService.CIM_METHOD_HIDEPATHS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
