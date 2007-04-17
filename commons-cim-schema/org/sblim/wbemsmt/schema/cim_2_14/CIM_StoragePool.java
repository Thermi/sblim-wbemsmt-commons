/** 
 * CIM_StoragePool.java
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
 * Description:  A StoragePool is a conglomeration of storage capacity for the purpose of
 * assignment and allocation based on service characteristics, such as location,
 * available space or other criteria (for example, cost per megabyte or hardware
 * ownership). A StoragePool is managed within the scope of a particular System.
 * StoragePools may consist of component StoragePools or StorageExtents.
 * StorageExtents that belong to the StoragePool have a Component relationship
 * to the StoragePool. StorageExtents/StoragePools that are elements of a pool
 * have their available space aggregated into the pool. StoragePools,
 * StorageVolumes and LogicalDisks may be created from StoragePools. This is
 * indicated by the AllocatedFromStoragePool association. StoragePool is scoped
 * to a system by the HostedStoragePool association.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
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
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  A StoragePool is a conglomeration of storage capacity for the purpose of
 * assignment and allocation based on service characteristics, such as location,
 * available space or other criteria (for example, cost per megabyte or hardware
 * ownership). A StoragePool is managed within the scope of a particular System.
 * StoragePools may consist of component StoragePools or StorageExtents.
 * StorageExtents that belong to the StoragePool have a Component relationship
 * to the StoragePool. StorageExtents/StoragePools that are elements of a pool
 * have their available space aggregated into the pool. StoragePools,
 * StorageVolumes and LogicalDisks may be created from StoragePools. This is
 * indicated by the AllocatedFromStoragePool association. StoragePool is scoped
 * to a system by the HostedStoragePool association.
 */
public class CIM_StoragePool extends CIM_LogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_StoragePool"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.13.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ALLOCATEDFROMSTORAGEPOOL = "CIM_AllocatedFromStoragePool"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDSTORAGEPOOL = "CIM_HostedStoragePool"; //$NON-NLS-1$
	
	
	/**
	*	Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
<OrgID>:<LocalID> 
Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
<LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
	*/
	public final static String CIM_PROPERTY_INSTANCEID = "InstanceID"; //$NON-NLS-1$
	/**
	*	A unique name in the context of the System that identifies this pool.
	*/
	public final static String CIM_PROPERTY_POOLID = "PoolID"; //$NON-NLS-1$
	/**
	*	If true, "Primordial" indicates that this StoragePool is the base from which storage capacity is drawn and returned in the activity of storage management. Being primordial means that this StoragePool shall not be created or deleted by consumers of this model. However, other actions, modeled or not, may affect the characteristics or size of primordial StoragePools. If false, "Primordial" indicated that the StoragePool, a concrete Storage Pool, is subject to storage services functions. This distinction is important because higher-level StoragePools may be assembled using the Component or AllocatedFromStoragePool associations. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based StoragePools cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized.
	*/
	public final static String CIM_PROPERTY_PRIMORDIAL = "Primordial"; //$NON-NLS-1$
	/**
	*	The remaining usable capacity after the allocation of StorageVolumes, LogicalDisks, or child Storage Pools. This property is maintained here to provide efficient access to this information. However, note that it is possible to compute RemainingManagedSpace as (TotalManagedSpace minus the sum of SpaceConsumed from all of the AllocatedFromStoragePool references from this StoragePool). Note that SpaceConsumed remains useful to determine the amount of capacity consumed by a particular allocated element.
	*/
	public final static String CIM_PROPERTY_REMAININGMANAGEDSPACE = "RemainingManagedSpace"; //$NON-NLS-1$
	/**
	*	The total amount of capacity usable for the allocation of StorageVolumes, LogicalDisks, or child Storage Pools. 
For primordial Storage Pools, this capacity reflects the usable capacity of Disk Drives or LUNs, for example, to the owning storage device or application. For example, in storage array, a primordial Storage Pool's TotalManagedSpace does not include metadata such as the disk label area and absolute disk drive capacity lost in disk formatting. 
For concrete Storage Pools, the same applies, but the metadata not included in TotalManagedSpace is consumed in virtualization like RAID and concatenation. Concrete Storage Pool may also be simple reserve of capacity. In such a case, no capacity may be lost in formation of the Storage Pool. 
Conceptually TotalManagedSpace is the sum of all storage known via AssociatedComponentExtent associations to underlying StorageExtents. However, note some of these underlying storage may not be modeled by the instrumentation.
	*/
	public final static String CIM_PROPERTY_TOTALMANAGEDSPACE = "TotalManagedSpace"; //$NON-NLS-1$
	
	
	/**
	*	This method can be used to retrieve a list of available Extents that may be used in the creation or modification of a StoragePool, StorageVolume, or LogicalDisk. The GetAvailableExtents method MUST return the Extents from the set of Component Extents of the Pool on which the method is being invoked. The returned Extents are available at the time the method returns. There is no guarantee that the same Extents will be available later. This method MUST return the Extents that are not being used as supporting capacity for any other Pools, Volumes, or LogicalDisks that have been allocated from this Pool. The Extent returned MUST be a component Extent of the Pool or subdivisions of a component Extent, the subdivisions themselves represented as Extents.
	*/
	public final static String CIM_METHOD_GETAVAILABLEEXTENTS = "GetAvailableExtents";
	/**
	*	For pools that that support a range of sizes for volume or pool creation, this method can be used to retrieve the supported range. Note that different pool implementations may support either or both the GetSupportedSizes and GetSupportedSizeRanges methods at different times, depending on Pool configuration. Also note that the advertised sizes may change after the call due to requests from other clients. If the pool currently only supports discrete sizes, then the return value will be set to 1.
	*/
	public final static String CIM_METHOD_GETSUPPORTEDSIZERANGE = "GetSupportedSizeRange";
	/**
	*	For pools that support discrete sizes for volume or pool creation, this method can be used to retrieve a list of supported sizes. Note that different pool implementations may support either or both the GetSupportedSizes and GetSupportedSizeRanges methods at different times, depending on Pool configuration. Also note that the advertised sizes may change after the call due to requests from other clients. If the pool currently only supports a range of sizes, then the return value will be set to 1.
	*/
	public final static String CIM_METHOD_GETSUPPORTEDSIZES = "GetSupportedSizes";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_INSTANCEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_POOLID);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIMORDIAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMAININGMANAGEDSPACE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALMANAGEDSPACE);
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INSTANCEID)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POOLID)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIMORDIAL)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMAININGMANAGEDSPACE)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALMANAGEDSPACE)){
				continue;
			}
			
			CIM_StoragePool.CIM_PropertyNameList.add(CIM_LogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INSTANCEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POOLID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIMORDIAL, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMAININGMANAGEDSPACE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALMANAGEDSPACE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INSTANCEID)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POOLID)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIMORDIAL)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMAININGMANAGEDSPACE)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALMANAGEDSPACE)){
				continue;
			}
			
			CIM_StoragePool.CIM_PropertyList.add(CIM_LogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_LogicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalElement.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StoragePool() {

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
	public CIM_StoragePool(Vector keyProperties){ 
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
	public CIM_StoragePool(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_InstanceID = this.cimInstance.getProperty(CIM_PROPERTY_INSTANCEID);
		
		if (CIMProperty_InstanceID == null || CIMProperty_InstanceID.getValue().isEmpty() || CIMProperty_InstanceID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_INSTANCEID, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_PoolID = this.cimInstance.getProperty(CIM_PROPERTY_POOLID);
		
		if (CIMProperty_PoolID == null || CIMProperty_PoolID.getValue().isEmpty() || CIMProperty_PoolID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_POOLID, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_RemainingManagedSpace = this.cimInstance.getProperty(CIM_PROPERTY_REMAININGMANAGEDSPACE);
		
		if (CIMProperty_RemainingManagedSpace == null || CIMProperty_RemainingManagedSpace.getValue().isEmpty() || CIMProperty_RemainingManagedSpace.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_REMAININGMANAGEDSPACE, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_StoragePool)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StoragePool)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StoragePool)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StoragePool)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StoragePool)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StoragePool)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StoragePool)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StoragePool)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StoragePool)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StoragePool)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_LogicalElement_CIM_AllocatedFromStoragePools(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ALLOCATEDFROMSTORAGEPOOL, 
					CIM_LogicalElement.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_StoragePool.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StoragePool.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_StoragePool.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_StoragePool.Java_Package_List.setElementAt((String)(CIM_StoragePool.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_StoragePool.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_LogicalElement_CIM_AllocatedFromStoragePool_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ALLOCATEDFROMSTORAGEPOOL, 
					CIM_LogicalElement.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_CIM_System_CIM_HostedStoragePools(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDSTORAGEPOOL, 
					CIM_System.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_StoragePool.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StoragePool.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_StoragePool.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_StoragePool.Java_Package_List.setElementAt((String)(CIM_StoragePool.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_StoragePool.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_System(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_System(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_System(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_System_CIM_HostedStoragePool_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDSTORAGEPOOL, 
					CIM_System.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_System.CIM_CLASS_NAME)) {
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
	
	// Attribute InstanceID
	
	public String get_InstanceID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StoragePool.CIM_PROPERTY_INSTANCEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StoragePool.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StoragePool.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InstanceID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StoragePool.CIM_PROPERTY_INSTANCEID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_StoragePool.CIM_PROPERTY_INSTANCEID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StoragePool.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (!CIM_StoragePoolHelper.isValid_InstanceID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StoragePool.CIM_PROPERTY_INSTANCEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StoragePool.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PoolID
	
	public String get_PoolID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StoragePool.CIM_PROPERTY_POOLID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StoragePool.CIM_PROPERTY_POOLID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StoragePool.CIM_PROPERTY_POOLID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PoolID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StoragePool.CIM_PROPERTY_POOLID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StoragePool.CIM_PROPERTY_POOLID + " could not be found");
    		
		} else if (!CIM_StoragePoolHelper.isValid_PoolID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StoragePool.CIM_PROPERTY_POOLID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StoragePool.CIM_PROPERTY_POOLID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Primordial
	
	public Boolean get_Primordial() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StoragePool.CIM_PROPERTY_PRIMORDIAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StoragePool.CIM_PROPERTY_PRIMORDIAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StoragePool.CIM_PROPERTY_PRIMORDIAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Primordial(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StoragePool.CIM_PROPERTY_PRIMORDIAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StoragePool.CIM_PROPERTY_PRIMORDIAL + " could not be found");
    		
		} else if (!CIM_StoragePoolHelper.isValid_Primordial(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StoragePool.CIM_PROPERTY_PRIMORDIAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StoragePool.CIM_PROPERTY_PRIMORDIAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemainingManagedSpace
	
	public UnsignedInt64 get_RemainingManagedSpace() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StoragePool.CIM_PROPERTY_REMAININGMANAGEDSPACE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StoragePool.CIM_PROPERTY_REMAININGMANAGEDSPACE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StoragePool.CIM_PROPERTY_REMAININGMANAGEDSPACE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemainingManagedSpace(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StoragePool.CIM_PROPERTY_REMAININGMANAGEDSPACE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StoragePool.CIM_PROPERTY_REMAININGMANAGEDSPACE + " could not be found");
    		
		} else if (!CIM_StoragePoolHelper.isValid_RemainingManagedSpace(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StoragePool.CIM_PROPERTY_REMAININGMANAGEDSPACE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StoragePool.CIM_PROPERTY_REMAININGMANAGEDSPACE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TotalManagedSpace
	
	public UnsignedInt64 get_TotalManagedSpace() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StoragePool.CIM_PROPERTY_TOTALMANAGEDSPACE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StoragePool.CIM_PROPERTY_TOTALMANAGEDSPACE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StoragePool.CIM_PROPERTY_TOTALMANAGEDSPACE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalManagedSpace(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StoragePool.CIM_PROPERTY_TOTALMANAGEDSPACE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StoragePool.CIM_PROPERTY_TOTALMANAGEDSPACE + " could not be found");
    		
		} else if (!CIM_StoragePoolHelper.isValid_TotalManagedSpace(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StoragePool.CIM_PROPERTY_TOTALMANAGEDSPACE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StoragePool.CIM_PROPERTY_TOTALMANAGEDSPACE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_getAvailableExtents(CIMClient cimClient, CIM_StorageSetting Goal, CIM_StorageExtent AvailableExtents) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StoragePool.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Goal = new CIMValue(Goal.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_AvailableExtents = new CIMValue(AvailableExtents.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE_ARRAY));
		
	  	inParameter.add(new CIMArgument("Goal", cimValue_Goal));
		
	  	outParameter.add(new CIMArgument("AvailableExtents", cimValue_AvailableExtents));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_GETAVAILABLEEXTENTS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StoragePool.CIM_METHOD_GETAVAILABLEEXTENTS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StoragePool.CIM_METHOD_GETAVAILABLEEXTENTS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StoragePool.CIM_METHOD_GETAVAILABLEEXTENTS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_getSupportedSizeRange(CIMClient cimClient, UnsignedInt16 ElementType, CIM_StorageSetting Goal, UnsignedInt64 MinimumVolumeSize, UnsignedInt64 MaximumVolumeSize, UnsignedInt64 VolumeSizeDivisor) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StoragePool.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ElementType = new CIMValue(ElementType, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_Goal = new CIMValue(Goal.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_MinimumVolumeSize = new CIMValue(MinimumVolumeSize, new CIMDataType(CIMDataType.UINT64));
		CIMValue cimValue_MaximumVolumeSize = new CIMValue(MaximumVolumeSize, new CIMDataType(CIMDataType.UINT64));
		CIMValue cimValue_VolumeSizeDivisor = new CIMValue(VolumeSizeDivisor, new CIMDataType(CIMDataType.UINT64));
		
	  	inParameter.add(new CIMArgument("ElementType", cimValue_ElementType));
		inParameter.add(new CIMArgument("Goal", cimValue_Goal));
		inParameter.add(new CIMArgument("MinimumVolumeSize", cimValue_MinimumVolumeSize));
		inParameter.add(new CIMArgument("MaximumVolumeSize", cimValue_MaximumVolumeSize));
		inParameter.add(new CIMArgument("VolumeSizeDivisor", cimValue_VolumeSizeDivisor));
		
	  	outParameter.add(new CIMArgument("MinimumVolumeSize", cimValue_MinimumVolumeSize));
		outParameter.add(new CIMArgument("MaximumVolumeSize", cimValue_MaximumVolumeSize));
		outParameter.add(new CIMArgument("VolumeSizeDivisor", cimValue_VolumeSizeDivisor));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_GETSUPPORTEDSIZERANGE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StoragePool.CIM_METHOD_GETSUPPORTEDSIZERANGE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StoragePool.CIM_METHOD_GETSUPPORTEDSIZERANGE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StoragePool.CIM_METHOD_GETSUPPORTEDSIZERANGE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_getSupportedSizes(CIMClient cimClient, UnsignedInt16 ElementType, CIM_StorageSetting Goal, UnsignedInt64 Sizes) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StoragePool.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ElementType = new CIMValue(ElementType, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_Goal = new CIMValue(Goal.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Sizes = new CIMValue(Sizes, new CIMDataType(CIMDataType.UINT64_ARRAY));
		
	  	inParameter.add(new CIMArgument("ElementType", cimValue_ElementType));
		inParameter.add(new CIMArgument("Goal", cimValue_Goal));
		inParameter.add(new CIMArgument("Sizes", cimValue_Sizes));
		
	  	outParameter.add(new CIMArgument("Sizes", cimValue_Sizes));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_GETSUPPORTEDSIZES,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StoragePool.CIM_METHOD_GETSUPPORTEDSIZES + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StoragePool.CIM_METHOD_GETSUPPORTEDSIZES + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StoragePool.CIM_METHOD_GETSUPPORTEDSIZES + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}