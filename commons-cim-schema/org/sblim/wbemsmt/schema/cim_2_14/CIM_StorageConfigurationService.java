/** 
 * CIM_StorageConfigurationService.java
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
 * Description:  This service allows the active management of a Storage Server. It allows jobs
 * to be started for the creation, modification and deletion of storage objects
 * (StoragePools, StorageVolumes and LogicalDisks).
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
import org.sblim.wbem.cim.UnsignedInt64;
import org.sblim.wbem.client.CIMClient;



/**
 *  This service allows the active management of a Storage Server. It allows jobs
 * to be started for the creation, modification and deletion of storage objects
 * (StoragePools, StorageVolumes and LogicalDisks).
 */
public class CIM_StorageConfigurationService extends CIM_Service  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageConfigurationService"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	
	
	
	
	/**
	*	Create (or start a job to create) a StorageSynchronized relationship between two existing storage objects. Note that using the input parameter, CopyType, this function can be used to to create an ongoing association between the source and replica. If 0 is returned, the function completed successfully and no ConcreteJob instance is created. If 0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter. A return value of 1 indicates the method is not supported. All other values indicate some type of error condition.
	*/
	public final static String CIM_METHOD_ATTACHREPLICA = "AttachReplica";
	/**
	*	Start a job to create (or modify) a specified storage element from specified input StorageExtents. The created or modified storage element can be a StorageExtent, StorageVolume, LogicalDisk, or StoragePool. An input list of InElements must be specified. The GetAvailableExtents method can be used to get a list of valid extents that can be used to achieve a desired goal. Validity of the extents is determined by the implementation. As an input parameter, Size specifies the desired size of the element. As an output parameter, it specifies the size achieved. Space is taken from the input InElements. The desired Settings for the element are specified by the Goal parameter. If the size of Extents passed is less than the size requested, then the capacity is drawn from the extents in the order, left to right, that the Extents were specified. The partial consumption of an Extent is represented by an Extent for the capacity used and an Extent for the capacity not used. If the Size is NULL, then a configuration using all Extents passed will be attempted. If the requested size cannot be created, no action will be taken, and the Return Value will be 4097/0x1001. Also, the output value of Size is set to the nearest possible size. If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to create the element. The Job's reference will be returned in the output parameter Job.
	*/
	public final static String CIM_METHOD_CREATEORMODIFYELEMENTFROMELEMENTS = "CreateOrModifyElementFromElements";
	/**
	*	Start a job to create (or modify) a specified element (for example a StorageVolume or StorageExtent) from a StoragePool. One of the parameters for this method is Size. As an input parameter, Size specifies the desired size of the element. As an output parameter, it specifies the size achieved. Space is taken from the input StoragePool. The desired settings for the element are specified by the Goal parameter. If the requested size cannot be created, no action will be taken, and the Return Value will be 4097/0x1001. Also, the output value of Size is set to the nearest possible size. If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to create the element. The Job's reference will be returned in the output parameter Job.
	*/
	public final static String CIM_METHOD_CREATEORMODIFYELEMENTFROMSTORAGEPOOL = "CreateOrModifyElementFromStoragePool";
	/**
	*	Starts a job to create (or modify) a StoragePool. The StoragePool will be (or must be) scoped to the same System as this Service. One of the parameters for this method is Size. As an input parameter, Size specifies the desired size of the pool. As an output parameter, it specifies the size achieved. Space is taken from either or both of the specified input StoragePools and StorageExtents (InPools and InExtents). The capability requirements that the Pool must support are defined using the Goal parameter. If the requested pool size cannot be created, no action will be taken, the Return Value will be 4097/0x1001, and the output value of Size will be set to the nearest possible size. If 0 is returned, then the task completed successfully and the use of ConcreteJob was not required. If the task will take some time to complete, a ConcreteJob will be created and its reference returned in the output parameter Job.
	*/
	public final static String CIM_METHOD_CREATEORMODIFYSTORAGEPOOL = "CreateOrModifyStoragePool";
	/**
	*	Start a job to create a new storage object which is a replica of the specified source storage object. (SourceElement). Note that using the input paramter, CopyType, this function can be used to instantiate the replica, and to create an ongoing association between the source and replica. If 0 is returned, the function completed successfully and no ConcreteJob instance is created. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter.
	*/
	public final static String CIM_METHOD_CREATEREPLICA = "CreateReplica";
	/**
	*	Start a job to delete a StoragePool. The freed space is returned source StoragePools (indicated by AllocatedFrom StoragePool) or back to underlying storage extents. If 0 is returned, the function completed successfully, and no ConcreteJob was required. If 4096/0x1000 is returned, a ConcreteJob will be started to delete the StoragePool. A reference to the Job is returned in the Job parameter.
	*/
	public final static String CIM_METHOD_DELETESTORAGEPOOL = "DeleteStoragePool";
	/**
	*	Modify (or start a job to modify) the synchronization association between two storage objects. If 0 is returned, the function completed successfully and no ConcreteJob instance was created. If 0x1000 is returned, a ConcreteJob was started and a reference to this Job is returned in the Job output parameter. A return value of 1 indicates the method is not supported. All other values indicate some type of error condition.
	*/
	public final static String CIM_METHOD_MODIFYSYNCHRONIZATION = "ModifySynchronization";
	/**
	*	Start a job to delete an element previously created from a StoragePool. The freed space is returned to the source StoragePool. If 0 is returned, the function completed successfully and no ConcreteJob was required. If 4096/0x1000 is returned, a ConcreteJob will be started to delete the element. A reference to the Job is returned in the Job parameter.
	*/
	public final static String CIM_METHOD_RETURNTOSTORAGEPOOL = "ReturnToStoragePool";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
				
		for (int i = 0; i < CIM_Service.CIM_PropertyNameList.size(); i++) {
			
			CIM_StorageConfigurationService.CIM_PropertyNameList.add(CIM_Service.CIM_PropertyNameList.elementAt(i));
		}
		
				
		for (int i = 0; i < CIM_Service.CIM_PropertyList.size(); i++) {
			
			CIM_StorageConfigurationService.CIM_PropertyList.add(CIM_Service.CIM_PropertyList.elementAt(i));
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
	public CIM_StorageConfigurationService() {

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
	public CIM_StorageConfigurationService(Vector keyProperties){ 
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
	public CIM_StorageConfigurationService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageConfigurationService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageConfigurationService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageConfigurationService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageConfigurationService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageConfigurationService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageConfigurationService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageConfigurationService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageConfigurationService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageConfigurationService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageConfigurationService)object).cimObjectPath)) {
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
	
	
	public UnsignedInt32 invoke_attachReplica(CIMClient cimClient, CIM_ConcreteJob Job, CIM_ManagedElement SourceElement, CIM_ManagedElement TargetElement, UnsignedInt16 CopyType) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Job = new CIMValue(Job.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_SourceElement = new CIMValue(SourceElement.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TargetElement = new CIMValue(TargetElement.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_CopyType = new CIMValue(CopyType, new CIMDataType(CIMDataType.UINT16));
		
	  	inParameter.add(new CIMArgument("Job", cimValue_Job));
		inParameter.add(new CIMArgument("SourceElement", cimValue_SourceElement));
		inParameter.add(new CIMArgument("TargetElement", cimValue_TargetElement));
		inParameter.add(new CIMArgument("CopyType", cimValue_CopyType));
		
	  	outParameter.add(new CIMArgument("Job", cimValue_Job));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_ATTACHREPLICA,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_ATTACHREPLICA + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_ATTACHREPLICA + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageConfigurationService.CIM_METHOD_ATTACHREPLICA + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createOrModifyElementFromElements(CIMClient cimClient, String ElementName, UnsignedInt16 ElementType, CIM_ConcreteJob Job, CIM_ManagedElement Goal, UnsignedInt64 Size, CIM_StorageExtent InElements, CIM_LogicalElement TheElement) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ElementName = new CIMValue(ElementName, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_ElementType = new CIMValue(ElementType, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_Job = new CIMValue(Job.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Goal = new CIMValue(Goal.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Size = new CIMValue(Size, new CIMDataType(CIMDataType.UINT64));
		CIMValue cimValue_InElements = new CIMValue(InElements.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE_ARRAY));
		CIMValue cimValue_TheElement = new CIMValue(TheElement.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ElementName", cimValue_ElementName));
		inParameter.add(new CIMArgument("ElementType", cimValue_ElementType));
		inParameter.add(new CIMArgument("Job", cimValue_Job));
		inParameter.add(new CIMArgument("Goal", cimValue_Goal));
		inParameter.add(new CIMArgument("Size", cimValue_Size));
		inParameter.add(new CIMArgument("InElements", cimValue_InElements));
		inParameter.add(new CIMArgument("TheElement", cimValue_TheElement));
		
	  	outParameter.add(new CIMArgument("Job", cimValue_Job));
		outParameter.add(new CIMArgument("Size", cimValue_Size));
		outParameter.add(new CIMArgument("TheElement", cimValue_TheElement));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATEORMODIFYELEMENTFROMELEMENTS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_CREATEORMODIFYELEMENTFROMELEMENTS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_CREATEORMODIFYELEMENTFROMELEMENTS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageConfigurationService.CIM_METHOD_CREATEORMODIFYELEMENTFROMELEMENTS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createOrModifyElementFromStoragePool(CIMClient cimClient, String ElementName, UnsignedInt16 ElementType, CIM_ConcreteJob Job, CIM_ManagedElement Goal, UnsignedInt64 Size, CIM_StoragePool InPool, CIM_LogicalElement TheElement) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ElementName = new CIMValue(ElementName, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_ElementType = new CIMValue(ElementType, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_Job = new CIMValue(Job.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Goal = new CIMValue(Goal.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Size = new CIMValue(Size, new CIMDataType(CIMDataType.UINT64));
		CIMValue cimValue_InPool = new CIMValue(InPool.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TheElement = new CIMValue(TheElement.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ElementName", cimValue_ElementName));
		inParameter.add(new CIMArgument("ElementType", cimValue_ElementType));
		inParameter.add(new CIMArgument("Job", cimValue_Job));
		inParameter.add(new CIMArgument("Goal", cimValue_Goal));
		inParameter.add(new CIMArgument("Size", cimValue_Size));
		inParameter.add(new CIMArgument("InPool", cimValue_InPool));
		inParameter.add(new CIMArgument("TheElement", cimValue_TheElement));
		
	  	outParameter.add(new CIMArgument("Job", cimValue_Job));
		outParameter.add(new CIMArgument("Size", cimValue_Size));
		outParameter.add(new CIMArgument("TheElement", cimValue_TheElement));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATEORMODIFYELEMENTFROMSTORAGEPOOL,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_CREATEORMODIFYELEMENTFROMSTORAGEPOOL + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_CREATEORMODIFYELEMENTFROMSTORAGEPOOL + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageConfigurationService.CIM_METHOD_CREATEORMODIFYELEMENTFROMSTORAGEPOOL + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createOrModifyStoragePool(CIMClient cimClient, String ElementName, CIM_ConcreteJob Job, CIM_StorageSetting Goal, UnsignedInt64 Size, String InPools, String InExtents, CIM_StoragePool Pool) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ElementName = new CIMValue(ElementName, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_Job = new CIMValue(Job.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Goal = new CIMValue(Goal.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Size = new CIMValue(Size, new CIMDataType(CIMDataType.UINT64));
		CIMValue cimValue_InPools = new CIMValue(InPools, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_InExtents = new CIMValue(InExtents, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_Pool = new CIMValue(Pool.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ElementName", cimValue_ElementName));
		inParameter.add(new CIMArgument("Job", cimValue_Job));
		inParameter.add(new CIMArgument("Goal", cimValue_Goal));
		inParameter.add(new CIMArgument("Size", cimValue_Size));
		inParameter.add(new CIMArgument("InPools", cimValue_InPools));
		inParameter.add(new CIMArgument("InExtents", cimValue_InExtents));
		inParameter.add(new CIMArgument("Pool", cimValue_Pool));
		
	  	outParameter.add(new CIMArgument("Job", cimValue_Job));
		outParameter.add(new CIMArgument("Size", cimValue_Size));
		outParameter.add(new CIMArgument("Pool", cimValue_Pool));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATEORMODIFYSTORAGEPOOL,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_CREATEORMODIFYSTORAGEPOOL + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_CREATEORMODIFYSTORAGEPOOL + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageConfigurationService.CIM_METHOD_CREATEORMODIFYSTORAGEPOOL + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createReplica(CIMClient cimClient, String ElementName, CIM_ConcreteJob Job, CIM_LogicalElement SourceElement, CIM_LogicalElement TargetElement, CIM_StorageSetting TargetSettingGoal, CIM_StoragePool TargetPool, UnsignedInt16 CopyType) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ElementName = new CIMValue(ElementName, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_Job = new CIMValue(Job.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_SourceElement = new CIMValue(SourceElement.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TargetElement = new CIMValue(TargetElement.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TargetSettingGoal = new CIMValue(TargetSettingGoal.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TargetPool = new CIMValue(TargetPool.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_CopyType = new CIMValue(CopyType, new CIMDataType(CIMDataType.UINT16));
		
	  	inParameter.add(new CIMArgument("ElementName", cimValue_ElementName));
		inParameter.add(new CIMArgument("Job", cimValue_Job));
		inParameter.add(new CIMArgument("SourceElement", cimValue_SourceElement));
		inParameter.add(new CIMArgument("TargetElement", cimValue_TargetElement));
		inParameter.add(new CIMArgument("TargetSettingGoal", cimValue_TargetSettingGoal));
		inParameter.add(new CIMArgument("TargetPool", cimValue_TargetPool));
		inParameter.add(new CIMArgument("CopyType", cimValue_CopyType));
		
	  	outParameter.add(new CIMArgument("Job", cimValue_Job));
		outParameter.add(new CIMArgument("TargetElement", cimValue_TargetElement));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATEREPLICA,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_CREATEREPLICA + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_CREATEREPLICA + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageConfigurationService.CIM_METHOD_CREATEREPLICA + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_deleteStoragePool(CIMClient cimClient, CIM_ConcreteJob Job, CIM_StoragePool Pool) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Job = new CIMValue(Job.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Pool = new CIMValue(Pool.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("Job", cimValue_Job));
		inParameter.add(new CIMArgument("Pool", cimValue_Pool));
		
	  	outParameter.add(new CIMArgument("Job", cimValue_Job));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_DELETESTORAGEPOOL,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_DELETESTORAGEPOOL + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_DELETESTORAGEPOOL + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageConfigurationService.CIM_METHOD_DELETESTORAGEPOOL + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_modifySynchronization(CIMClient cimClient, UnsignedInt16 Operation, CIM_ConcreteJob Job, CIM_StorageSynchronized Synchronization) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Operation = new CIMValue(Operation, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_Job = new CIMValue(Job.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Synchronization = new CIMValue(Synchronization.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("Operation", cimValue_Operation));
		inParameter.add(new CIMArgument("Job", cimValue_Job));
		inParameter.add(new CIMArgument("Synchronization", cimValue_Synchronization));
		
	  	outParameter.add(new CIMArgument("Job", cimValue_Job));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_MODIFYSYNCHRONIZATION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_MODIFYSYNCHRONIZATION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_MODIFYSYNCHRONIZATION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageConfigurationService.CIM_METHOD_MODIFYSYNCHRONIZATION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_returnToStoragePool(CIMClient cimClient, CIM_ConcreteJob Job, CIM_LogicalElement TheElement) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageConfigurationService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Job = new CIMValue(Job.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TheElement = new CIMValue(TheElement.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("Job", cimValue_Job));
		inParameter.add(new CIMArgument("TheElement", cimValue_TheElement));
		
	  	outParameter.add(new CIMArgument("Job", cimValue_Job));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_RETURNTOSTORAGEPOOL,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_RETURNTOSTORAGEPOOL + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageConfigurationService.CIM_METHOD_RETURNTOSTORAGEPOOL + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageConfigurationService.CIM_METHOD_RETURNTOSTORAGEPOOL + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
