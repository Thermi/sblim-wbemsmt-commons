/** 
 * CIM_StorageConfigurationCapabilities.java
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
 * Description: A subclass of Capabilities that defines the Capabilities of a StorageConfigurationService. An instance of StorageConfigurationCapabilities is associated with a StorageConfigurationService using ElementCapabilities.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_StorageConfigurationCapabilities extends CIM_Capabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageConfigurationCapabilities";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	InitialReplicationState specifies which initial ReplicationState is supported by a particular provider. Values are: 
Initialized: The replication relationship is known and unsynchronized, but time required to synchronize may be long. 
Prepared: The replication relationship is known and unsynchronized and the time required to synchronize will be short. 
Synchronized: The replicas are synchronized.
	*/
	public final static String CIM_PROPERTY_INITIALREPLICATIONSTATE = "InitialReplicationState"; //$NON-NLS-1$
	/**
	*	Enumeration indicating what operations will be executed as asynchronous jobs. If an operation is included in both this and SupportedSynchronousActions then the underlying implementation is indicating that it may or may not create a job.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS = "SupportedAsynchronousActions"; //$NON-NLS-1$
	/**
	*	SupportedCopyTypes describes the replication capabilities supported by the associated StorageConfigurationServices. Values are: 
Async: asynchronous copies may be created and maintained. 
Sync: synchronous copies may be created and maintained. 
UnSyncAssoc: unsynchronized copies may be created and maintained. 
UnSyncUnAssoc: a 'straight copy' may be created.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDCOPYTYPES = "SupportedCopyTypes"; //$NON-NLS-1$
	/**
	*	Enumeration indicating features supported by the Storage Element methods.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTFEATURES = "SupportedStorageElementFeatures"; //$NON-NLS-1$
	/**
	*	Enumeration indicating the type of storage elements that are supported by the associated StorageConfigurationService.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTTYPES = "SupportedStorageElementTypes"; //$NON-NLS-1$
	/**
	*	Enumeration indicating features supported by the StoragePool methods.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDSTORAGEPOOLFEATURES = "SupportedStoragePoolFeatures"; //$NON-NLS-1$
	/**
	*	Enumeration indicating what operations will be executed without the creation of a job. If an operation is included in both this and SupportedAsynchronousActions then the underlying instrumentation is indicating that it may or may not create a job.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS = "SupportedSynchronousActions"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_INITIALREPLICATIONSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDCOPYTYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTFEATURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTTYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDSTORAGEPOOLFEATURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS);
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INITIALREPLICATIONSTATE)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDCOPYTYPES)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTFEATURES)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTTYPES)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDSTORAGEPOOLFEATURES)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS)){
				continue;
			}
			
			CIM_StorageConfigurationCapabilities.CIM_PropertyNameList.add(CIM_Capabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INITIALREPLICATIONSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDCOPYTYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTFEATURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTTYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDSTORAGEPOOLFEATURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INITIALREPLICATIONSTATE)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDCOPYTYPES)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTFEATURES)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTTYPES)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDSTORAGEPOOLFEATURES)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS)){
				continue;
			}
			
			CIM_StorageConfigurationCapabilities.CIM_PropertyList.add(CIM_Capabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Capabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_Capabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Capabilities.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_INITIALREPLICATIONSTATE = {"Initialized","Prepared","Synchronized","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDASYNCHRONOUSACTIONS = {"Storage Pool Creation","Storage Pool Deletion","Storage Pool Modification","Storage Element Creation","Storage Element Return","Storage Element Modification","Replica Creation","Replica Modification","Replica Attachment"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDCOPYTYPES = {"Async","Sync","UnSyncAssoc","UnSyncUnAssoc","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDSTORAGEELEMENTFEATURES = {"StorageExtent Creation","StorageVolume Creation","StorageExtent Modification","StorageVolume Modification","Single InPool","Multiple InPools","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDSTORAGEELEMENTTYPES = {"StorageVolume","StorageExtent","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDSTORAGEPOOLFEATURES = {"InExtents","Single InPool","Multiple InPools","DMTF Reserved","Vendor Specific"};
	public final static String[] CIM_VALUEMAP_SUPPORTEDSYNCHRONOUSACTIONS = {"Storage Pool Creation","Storage Pool Deletion","Storage Pool Modification","Storage Element Creation","Storage Element Return","Storage Element Modification","Replica Creation","Replica Modification","Replica Attachment"};
	
	
	public final static String INITIALREPLICATIONSTATE_INITIALIZED = "2";
	public final static String INITIALREPLICATIONSTATE_PREPARED = "3";
	public final static String INITIALREPLICATIONSTATE_SYNCHRONIZED = "4";
	public final static String INITIALREPLICATIONSTATE_DMTFRESERVED = "..";
	public final static String INITIALREPLICATIONSTATE_VENDORSPECIFIC = "0x8000..0xFFFF";
	
	public final static int SUPPORTEDASYNCHRONOUSACTIONS_STORAGEPOOLCREATION = 2;
	public final static int SUPPORTEDASYNCHRONOUSACTIONS_STORAGEPOOLDELETION = 3;
	public final static int SUPPORTEDASYNCHRONOUSACTIONS_STORAGEPOOLMODIFICATION = 4;
	public final static int SUPPORTEDASYNCHRONOUSACTIONS_STORAGEELEMENTCREATION = 5;
	public final static int SUPPORTEDASYNCHRONOUSACTIONS_STORAGEELEMENTRETURN = 6;
	public final static int SUPPORTEDASYNCHRONOUSACTIONS_STORAGEELEMENTMODIFICATION = 7;
	public final static int SUPPORTEDASYNCHRONOUSACTIONS_REPLICACREATION = 8;
	public final static int SUPPORTEDASYNCHRONOUSACTIONS_REPLICAMODIFICATION = 9;
	public final static int SUPPORTEDASYNCHRONOUSACTIONS_REPLICAATTACHMENT = 10;
	
	public final static String SUPPORTEDCOPYTYPES_ASYNC = "2";
	public final static String SUPPORTEDCOPYTYPES_SYNC = "3";
	public final static String SUPPORTEDCOPYTYPES_UNSYNCASSOC = "4";
	public final static String SUPPORTEDCOPYTYPES_UNSYNCUNASSOC = "5";
	public final static String SUPPORTEDCOPYTYPES_DMTFRESERVED = "..";
	public final static String SUPPORTEDCOPYTYPES_VENDORSPECIFIC = "0x8000..0xFFFF";
	
	public final static String SUPPORTEDSTORAGEELEMENTFEATURES_STORAGEEXTENTCREATION = "2";
	public final static String SUPPORTEDSTORAGEELEMENTFEATURES_STORAGEVOLUMECREATION = "3";
	public final static String SUPPORTEDSTORAGEELEMENTFEATURES_STORAGEEXTENTMODIFICATION = "4";
	public final static String SUPPORTEDSTORAGEELEMENTFEATURES_STORAGEVOLUMEMODIFICATION = "5";
	public final static String SUPPORTEDSTORAGEELEMENTFEATURES_SINGLEINPOOL = "6";
	public final static String SUPPORTEDSTORAGEELEMENTFEATURES_MULTIPLEINPOOLS = "7";
	public final static String SUPPORTEDSTORAGEELEMENTFEATURES_DMTFRESERVED = "..";
	public final static String SUPPORTEDSTORAGEELEMENTFEATURES_VENDORSPECIFIC = "0x8000..0xFFFF";
	
	public final static String SUPPORTEDSTORAGEELEMENTTYPES_STORAGEVOLUME = "2";
	public final static String SUPPORTEDSTORAGEELEMENTTYPES_STORAGEEXTENT = "3";
	public final static String SUPPORTEDSTORAGEELEMENTTYPES_DMTFRESERVED = "..";
	public final static String SUPPORTEDSTORAGEELEMENTTYPES_VENDORSPECIFIC = "0x8000..0xFFFF";
	
	public final static String SUPPORTEDSTORAGEPOOLFEATURES_INEXTENTS = "2";
	public final static String SUPPORTEDSTORAGEPOOLFEATURES_SINGLEINPOOL = "3";
	public final static String SUPPORTEDSTORAGEPOOLFEATURES_MULTIPLEINPOOLS = "4";
	public final static String SUPPORTEDSTORAGEPOOLFEATURES_DMTFRESERVED = "..";
	public final static String SUPPORTEDSTORAGEPOOLFEATURES_VENDORSPECIFIC = "0x8000..0xFFFF";
	
	public final static int SUPPORTEDSYNCHRONOUSACTIONS_STORAGEPOOLCREATION = 2;
	public final static int SUPPORTEDSYNCHRONOUSACTIONS_STORAGEPOOLDELETION = 3;
	public final static int SUPPORTEDSYNCHRONOUSACTIONS_STORAGEPOOLMODIFICATION = 4;
	public final static int SUPPORTEDSYNCHRONOUSACTIONS_STORAGEELEMENTCREATION = 5;
	public final static int SUPPORTEDSYNCHRONOUSACTIONS_STORAGEELEMENTRETURN = 6;
	public final static int SUPPORTEDSYNCHRONOUSACTIONS_STORAGEELEMENTMODIFICATION = 7;
	public final static int SUPPORTEDSYNCHRONOUSACTIONS_REPLICACREATION = 8;
	public final static int SUPPORTEDSYNCHRONOUSACTIONS_REPLICAMODIFICATION = 9;
	public final static int SUPPORTEDSYNCHRONOUSACTIONS_REPLICAATTACHMENT = 10;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageConfigurationCapabilities() {

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
	public CIM_StorageConfigurationCapabilities(Vector keyProperties){ 
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
	public CIM_StorageConfigurationCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageConfigurationCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageConfigurationCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageConfigurationCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageConfigurationCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageConfigurationCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageConfigurationCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageConfigurationCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageConfigurationCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageConfigurationCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageConfigurationCapabilities)object).cimObjectPath)) {
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
	
	// Attribute InitialReplicationState
	
	public UnsignedInt16 get_InitialReplicationState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InitialReplicationState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE + " could not be found");
    		
		} else if (!CIM_StorageConfigurationCapabilitiesHelper.isValid_InitialReplicationState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_INITIALREPLICATIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedAsynchronousActions
	
	public UnsignedInt16[] get_SupportedAsynchronousActions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_SupportedAsynchronousActions(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS + " could not be found");
    		
		} else if (!CIM_StorageConfigurationCapabilitiesHelper.isValid_SupportedAsynchronousActions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDASYNCHRONOUSACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedCopyTypes
	
	public UnsignedInt16[] get_SupportedCopyTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDCOPYTYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDCOPYTYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDCOPYTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_SupportedCopyTypes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDCOPYTYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDCOPYTYPES + " could not be found");
    		
		} else if (!CIM_StorageConfigurationCapabilitiesHelper.isValid_SupportedCopyTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDCOPYTYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDCOPYTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedStorageElementFeatures
	
	public UnsignedInt16[] get_SupportedStorageElementFeatures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTFEATURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTFEATURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTFEATURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_SupportedStorageElementFeatures(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTFEATURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTFEATURES + " could not be found");
    		
		} else if (!CIM_StorageConfigurationCapabilitiesHelper.isValid_SupportedStorageElementFeatures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTFEATURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTFEATURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedStorageElementTypes
	
	public UnsignedInt16[] get_SupportedStorageElementTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTTYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTTYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_SupportedStorageElementTypes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTTYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTTYPES + " could not be found");
    		
		} else if (!CIM_StorageConfigurationCapabilitiesHelper.isValid_SupportedStorageElementTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTTYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEELEMENTTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedStoragePoolFeatures
	
	public UnsignedInt16[] get_SupportedStoragePoolFeatures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEPOOLFEATURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEPOOLFEATURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEPOOLFEATURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_SupportedStoragePoolFeatures(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEPOOLFEATURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEPOOLFEATURES + " could not be found");
    		
		} else if (!CIM_StorageConfigurationCapabilitiesHelper.isValid_SupportedStoragePoolFeatures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEPOOLFEATURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSTORAGEPOOLFEATURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedSynchronousActions
	
	public UnsignedInt16[] get_SupportedSynchronousActions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_SupportedSynchronousActions(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS + " could not be found");
    		
		} else if (!CIM_StorageConfigurationCapabilitiesHelper.isValid_SupportedSynchronousActions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageConfigurationCapabilities.CIM_PROPERTY_SUPPORTEDSYNCHRONOUSACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
