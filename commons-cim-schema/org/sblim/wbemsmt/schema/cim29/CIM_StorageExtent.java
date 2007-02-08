/** 
 * CIM_StorageExtent.java
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
 * Description: StorageExtent describes the capabilities and management of the various media that exist to store data and allow data retrieval. This superclass could be used to represent the various components of RAID (Hardware or Software) or as a raw logical extent on top of physical media.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_StorageExtent extends CIM_LogicalDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageExtent";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON = "CIM_CompositeExtentBasedOn";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_EXTENTINDISKGROUP = "CIM_ExtentInDiskGroup";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_EXTENTREDUNDANCYCOMPONENT = "CIM_ExtentRedundancyComponent";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGINSTORAGE = "CIM_LogInStorage";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONEXTENT = "CIM_LogicalDiskBasedOnExtent";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT = "CIM_MediaPresent";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZEDONSIDE = "CIM_RealizedOnSide";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESEXTENT = "CIM_RealizesExtent";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_RESIDESONEXTENT = "CIM_ResidesOnExtent";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFEXTENT = "CIM_SnapshotOfExtent";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_STORAGEDEFECT = "CIM_StorageDefect";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_TAPEPARTITIONONSURFACE = "CIM_TapePartitionOnSurface";
	
	
	/**
	*	Access describes whether the media is readable (value=1), writeable (value=2), or both (value=3). "Unknown" (0) and "Write Once" (4) can also be defined.
	*/
	public final static String CIM_PROPERTY_ACCESS = "Access"; //$NON-NLS-1$
	/**
	*	Size in bytes of the blocks which form this StorageExtent. If variable block size, then the maximum block size in bytes should be specified. If the block size is unknown or if a block concept is not valid (for example, for AggregateExtents, Memory or LogicalDisks), enter a 1.
	*/
	public final static String CIM_PROPERTY_BLOCKSIZE = "BlockSize"; //$NON-NLS-1$
	/**
	*	The maximum number of blocks, of size BlockSize, which are available for consumption when layering StorageExtents using the BasedOn association. This property only has meaning when this StorageExtent is an Antecedent reference in a BasedOn relationship. For example, a StorageExtent could be composed of 120 blocks. However, the Extent itself may use 20 blocks for redundancy data. If another StorageExtent is BasedOn this Extent, only 100 blocks would be available to it. This information ('100 blocks is available for consumption') is indicated in the ConsumableBlocks property.
	*/
	public final static String CIM_PROPERTY_CONSUMABLEBLOCKS = "ConsumableBlocks"; //$NON-NLS-1$
	/**
	*	Type of data organization used.
	*/
	public final static String CIM_PROPERTY_DATAORGANIZATION = "DataOrganization"; //$NON-NLS-1$
	/**
	*	Number of complete copies of data currently maintained.
	*/
	public final static String CIM_PROPERTY_DATAREDUNDANCY = "DataRedundancy"; //$NON-NLS-1$
	/**
	*	Current value for Delta reservation. This is a percentage that specifies the amount of space that should be reserved in a replica for caching changes.
	*/
	public final static String CIM_PROPERTY_DELTARESERVATION = "DeltaReservation"; //$NON-NLS-1$
	/**
	*	ErrorMethodology is a free-form string describing the type of error detection and correction supported by this StorageExtent.
	*/
	public final static String CIM_PROPERTY_ERRORMETHODOLOGY = "ErrorMethodology"; //$NON-NLS-1$
	/**
	*	StorageExtents have additional status information beyond that captured in the OperationalStatus and other properties, inherited from ManagedSystemElement. This additional information (for example, "Protection Disabled", value=9) is captured in the VolumeStatus property.
	*/
	public final static String CIM_PROPERTY_EXTENTSTATUS = "ExtentStatus"; //$NON-NLS-1$
	/**
	*	True indicates that the underlying StorageExtent(s) participate in a StorageRedundancyGroup.
	*/
	public final static String CIM_PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY = "IsBasedOnUnderlyingRedundancy"; //$NON-NLS-1$
	/**
	*	Indicates whether or not there exists no single point of failure.
	*/
	public final static String CIM_PROPERTY_NOSINGLEPOINTOFFAILURE = "NoSinglePointOfFailure"; //$NON-NLS-1$
	/**
	*	Total number of logically contiguous blocks, of size Block Size, which form this Extent. The total size of the Extent can be calculated by multiplying BlockSize by NumberOfBlocks. If the BlockSize is 1, this property is the total size of the Extent.
	*/
	public final static String CIM_PROPERTY_NUMBEROFBLOCKS = "NumberOfBlocks"; //$NON-NLS-1$
	/**
	*	How many physical packages can currently fail without data loss. For example, in the storage domain, this might be disk spindles.
	*/
	public final static String CIM_PROPERTY_PACKAGEREDUNDANCY = "PackageRedundancy"; //$NON-NLS-1$
	/**
	*	If true, "Primordial" indicates that the containing System does not have the ability to create or delete this operational element. This is important because StorageExtents are assembled into higher-level abstractions using the BasedOn association. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based storage entities cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized. In other words, a Primordial StorageExtent exists in, but is not created by its System and conversely a non-Primordial StorageExtent is created in the context of its System. For StorageVolumes, this property will generally be false. One use of this property is to enable algorithms that aggregate StorageExtent.ConsumableSpace across all, StorageExtents but that also want to distinquish the space that underlies Primordial StoragePools. Since implementations are not required to surface all Component StorageExtents of a StoragePool, this information is not accessible in any other way.
	*/
	public final static String CIM_PROPERTY_PRIMORDIAL = "Primordial"; //$NON-NLS-1$
	/**
	*	A free form string describing the media and/or its use.
	*/
	public final static String CIM_PROPERTY_PURPOSE = "Purpose"; //$NON-NLS-1$
	/**
	*	Boolean set to TRUE if the Storage is sequentially accessed by a MediaAccessDevice. A TapePartition is an example of a sequentially accessed StorageExtent. StorageVolumes, Disk Partitions and LogicalDisks represent randomly accessed Extents.
	*/
	public final static String CIM_PROPERTY_SEQUENTIALACCESS = "SequentialAccess"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_BLOCKSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONSUMABLEBLOCKS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAORGANIZATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAREDUNDANCY);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELTARESERVATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORMETHODOLOGY);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXTENTSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY);
		CIM_PropertyNameList.add(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFBLOCKS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKAGEREDUNDANCY);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIMORDIAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_PURPOSE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SEQUENTIALACCESS);
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCESS)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BLOCKSIZE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONSUMABLEBLOCKS)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAORGANIZATION)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAREDUNDANCY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELTARESERVATION)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORMETHODOLOGY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXTENTSTATUS)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFBLOCKS)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKAGEREDUNDANCY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIMORDIAL)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PURPOSE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SEQUENTIALACCESS)){
				continue;
			}
			
			CIM_StorageExtent.CIM_PropertyNameList.add(CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BLOCKSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONSUMABLEBLOCKS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAORGANIZATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAREDUNDANCY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELTARESERVATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORMETHODOLOGY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXTENTSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFBLOCKS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKAGEREDUNDANCY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIMORDIAL, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PURPOSE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SEQUENTIALACCESS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCESS)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BLOCKSIZE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONSUMABLEBLOCKS)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAORGANIZATION)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAREDUNDANCY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELTARESERVATION)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORMETHODOLOGY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXTENTSTATUS)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFBLOCKS)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKAGEREDUNDANCY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIMORDIAL)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PURPOSE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SEQUENTIALACCESS)){
				continue;
			}
			
			CIM_StorageExtent.CIM_PropertyList.add(CIM_LogicalDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ACCESS = {"Unknown","Readable","Writeable","Read/Write Supported","Write Once"};
	public final static String[] CIM_VALUEMAP_DATAORGANIZATION = {"Other","Unknown","Fixed Block","Variable Block","Count Key Data"};
	public final static String[] CIM_VALUEMAP_EXTENTSTATUS = {"Other","Unknown","None/Not Applicable","Broken","Data Lost","Dynamic Reconfig","Exposed","Fractionally Exposed","Partially Exposed","Protection Disabled","Readying","Rebuild","Recalculate","Spare in Use","Verify In Progress","DMTF Reserved","Vendor Reserved"};
	
	
	public final static int ACCESS_UNKNOWN = 0;
	public final static int ACCESS_READABLE = 1;
	public final static int ACCESS_WRITEABLE = 2;
	public final static int ACCESS_READ_WRITESUPPORTED = 3;
	public final static int ACCESS_WRITEONCE = 4;
	
	public final static int DATAORGANIZATION_OTHER = 0;
	public final static int DATAORGANIZATION_UNKNOWN = 1;
	public final static int DATAORGANIZATION_FIXEDBLOCK = 2;
	public final static int DATAORGANIZATION_VARIABLEBLOCK = 3;
	public final static int DATAORGANIZATION_COUNTKEYDATA = 4;
	
	public final static String EXTENTSTATUS_OTHER = "0";
	public final static String EXTENTSTATUS_UNKNOWN = "1";
	public final static String EXTENTSTATUS_NONE_NOTAPPLICABLE = "2";
	public final static String EXTENTSTATUS_BROKEN = "3";
	public final static String EXTENTSTATUS_DATALOST = "4";
	public final static String EXTENTSTATUS_DYNAMICRECONFIG = "5";
	public final static String EXTENTSTATUS_EXPOSED = "6";
	public final static String EXTENTSTATUS_FRACTIONALLYEXPOSED = "7";
	public final static String EXTENTSTATUS_PARTIALLYEXPOSED = "8";
	public final static String EXTENTSTATUS_PROTECTIONDISABLED = "9";
	public final static String EXTENTSTATUS_READYING = "10";
	public final static String EXTENTSTATUS_REBUILD = "11";
	public final static String EXTENTSTATUS_RECALCULATE = "12";
	public final static String EXTENTSTATUS_SPAREINUSE = "13";
	public final static String EXTENTSTATUS_VERIFYINPROGRESS = "14";
	public final static String EXTENTSTATUS_DMTFRESERVED = "15..32767";
	public final static String EXTENTSTATUS_VENDORRESERVED = "32768..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageExtent() {

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
	public CIM_StorageExtent(Vector keyProperties){ 
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
	public CIM_StorageExtent(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageExtent)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageExtent)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageExtent)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageExtent)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageExtent)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageExtent)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageExtent)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageExtent)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageExtent)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageExtent)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_CompositeExtent_CIM_CompositeExtentBasedOns(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON, 
					CIM_CompositeExtent.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageExtent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageExtent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageExtent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageExtent.Java_Package_List.setElementAt((String)(CIM_StorageExtent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageExtent.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_CompositeExtent(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_CompositeExtent(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_CompositeExtent(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_CompositeExtent_CIM_CompositeExtentBasedOn_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON, 
					CIM_CompositeExtent.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_CompositeExtent.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_DiskGroup_CIM_ExtentInDiskGroups(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_EXTENTINDISKGROUP, 
					CIM_DiskGroup.CIM_CLASS_NAME, 
					"Member",
					"Collection",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_StorageExtent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageExtent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageExtent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageExtent.Java_Package_List.setElementAt((String)(CIM_StorageExtent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageExtent.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiskGroup(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_DiskGroup(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiskGroup(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_DiskGroup_CIM_ExtentInDiskGroup_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_EXTENTINDISKGROUP, 
					CIM_DiskGroup.CIM_CLASS_NAME, 
					"Member",
					"Collection");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_DiskGroup.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_StorageRedundancyGroup_CIM_ExtentRedundancyComponents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_EXTENTREDUNDANCYCOMPONENT, 
					CIM_StorageRedundancyGroup.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_StorageExtent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageExtent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageExtent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageExtent.Java_Package_List.setElementAt((String)(CIM_StorageExtent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageExtent.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageRedundancyGroup(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_StorageRedundancyGroup(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageRedundancyGroup(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_StorageRedundancyGroup_CIM_ExtentRedundancyComponent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_EXTENTREDUNDANCYCOMPONENT, 
					CIM_StorageRedundancyGroup.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_StorageRedundancyGroup.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_MessageLog_CIM_LogInStorages(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGINSTORAGE, 
					CIM_MessageLog.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageExtent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageExtent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageExtent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageExtent.Java_Package_List.setElementAt((String)(CIM_StorageExtent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageExtent.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_MessageLog(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_MessageLog(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_MessageLog(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_MessageLog_CIM_LogInStorage_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGINSTORAGE, 
					CIM_MessageLog.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_MessageLog.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnExtents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONEXTENT, 
					CIM_LogicalDisk.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageExtent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageExtent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageExtent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageExtent.Java_Package_List.setElementAt((String)(CIM_StorageExtent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageExtent.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalDisk(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_LogicalDisk(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalDisk(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnExtent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONEXTENT, 
					CIM_LogicalDisk.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LogicalDisk.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_MediaAccessDevice_CIM_MediaPresents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT, 
					CIM_MediaAccessDevice.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageExtent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageExtent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageExtent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageExtent.Java_Package_List.setElementAt((String)(CIM_StorageExtent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageExtent.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_MediaAccessDevice(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_MediaAccessDevice(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_MediaAccessDevice(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_MediaAccessDevice_CIM_MediaPresent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT, 
					CIM_MediaAccessDevice.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_MediaAccessDevice.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PhysicalMedia_CIM_RealizedOnSides(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZEDONSIDE, 
					CIM_PhysicalMedia.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageExtent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageExtent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageExtent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageExtent.Java_Package_List.setElementAt((String)(CIM_StorageExtent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageExtent.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalMedia(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PhysicalMedia(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalMedia(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PhysicalMedia_CIM_RealizedOnSide_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZEDONSIDE, 
					CIM_PhysicalMedia.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PhysicalMedia.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PhysicalComponent_CIM_RealizesExtents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESEXTENT, 
					CIM_PhysicalComponent.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageExtent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageExtent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageExtent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageExtent.Java_Package_List.setElementAt((String)(CIM_StorageExtent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageExtent.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalComponent(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PhysicalComponent(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalComponent(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PhysicalComponent_CIM_RealizesExtent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESEXTENT, 
					CIM_PhysicalComponent.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PhysicalComponent.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_LogicalElement_CIM_ResidesOnExtents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_RESIDESONEXTENT, 
					CIM_LogicalElement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageExtent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageExtent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageExtent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageExtent.Java_Package_List.setElementAt((String)(CIM_StorageExtent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageExtent.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_LogicalElement_CIM_ResidesOnExtent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_RESIDESONEXTENT, 
					CIM_LogicalElement.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
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

	public ArrayList getAssociated_CIM_Snapshot_CIM_SnapshotOfExtents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFEXTENT, 
					CIM_Snapshot.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageExtent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageExtent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageExtent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageExtent.Java_Package_List.setElementAt((String)(CIM_StorageExtent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageExtent.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Snapshot(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Snapshot(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Snapshot(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Snapshot_CIM_SnapshotOfExtent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SNAPSHOTOFEXTENT, 
					CIM_Snapshot.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Snapshot.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_StorageError_CIM_StorageDefects(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_STORAGEDEFECT, 
					CIM_StorageError.CIM_CLASS_NAME, 
					"Extent",
					"Error",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_StorageExtent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageExtent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageExtent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageExtent.Java_Package_List.setElementAt((String)(CIM_StorageExtent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageExtent.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageError(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_StorageError(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageError(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_StorageError_CIM_StorageDefect_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_STORAGEDEFECT, 
					CIM_StorageError.CIM_CLASS_NAME, 
					"Extent",
					"Error");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_StorageError.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_TapePartition_CIM_TapePartitionOnSurfaces(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_TAPEPARTITIONONSURFACE, 
					CIM_TapePartition.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageExtent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageExtent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageExtent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageExtent.Java_Package_List.setElementAt((String)(CIM_StorageExtent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageExtent.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_TapePartition(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_TapePartition(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_TapePartition(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_TapePartition_CIM_TapePartitionOnSurface_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_TAPEPARTITIONONSURFACE, 
					CIM_TapePartition.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_TapePartition.CIM_CLASS_NAME)) {
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
	
	// Attribute Access
	
	public UnsignedInt16 get_Access() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_ACCESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_ACCESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_ACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Access(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_ACCESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_ACCESS + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_Access(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_ACCESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_ACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BlockSize
	
	public UnsignedInt64 get_BlockSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_BLOCKSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_BLOCKSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_BLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BlockSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_BLOCKSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_BLOCKSIZE + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_BlockSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_BLOCKSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_BLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConsumableBlocks
	
	public UnsignedInt64 get_ConsumableBlocks() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_CONSUMABLEBLOCKS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_CONSUMABLEBLOCKS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_CONSUMABLEBLOCKS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConsumableBlocks(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_CONSUMABLEBLOCKS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_CONSUMABLEBLOCKS + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_ConsumableBlocks(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_CONSUMABLEBLOCKS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_CONSUMABLEBLOCKS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataOrganization
	
	public UnsignedInt16 get_DataOrganization() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_DATAORGANIZATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_DATAORGANIZATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_DATAORGANIZATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataOrganization(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_DATAORGANIZATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_DATAORGANIZATION + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_DataOrganization(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_DATAORGANIZATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_DATAORGANIZATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataRedundancy
	
	public UnsignedInt16 get_DataRedundancy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_DATAREDUNDANCY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_DATAREDUNDANCY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_DATAREDUNDANCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataRedundancy(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_DATAREDUNDANCY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_DATAREDUNDANCY + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_DataRedundancy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_DATAREDUNDANCY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_DATAREDUNDANCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeltaReservation
	
	public UnsignedInt8 get_DeltaReservation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_DELTARESERVATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_DELTARESERVATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_DELTARESERVATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeltaReservation(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_DELTARESERVATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_DELTARESERVATION + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_DeltaReservation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_DELTARESERVATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_DELTARESERVATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorMethodology
	
	public String get_ErrorMethodology() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_ERRORMETHODOLOGY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_ERRORMETHODOLOGY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_ERRORMETHODOLOGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorMethodology(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_ERRORMETHODOLOGY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_ERRORMETHODOLOGY + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_ErrorMethodology(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_ERRORMETHODOLOGY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_ERRORMETHODOLOGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExtentStatus
	
	public UnsignedInt16[] get_ExtentStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_EXTENTSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_EXTENTSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_EXTENTSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ExtentStatus(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_EXTENTSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_EXTENTSTATUS + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_ExtentStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_EXTENTSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_EXTENTSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsBasedOnUnderlyingRedundancy
	
	public Boolean get_IsBasedOnUnderlyingRedundancy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsBasedOnUnderlyingRedundancy(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_IsBasedOnUnderlyingRedundancy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_ISBASEDONUNDERLYINGREDUNDANCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NoSinglePointOfFailure
	
	public Boolean get_NoSinglePointOfFailure() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NoSinglePointOfFailure(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_NoSinglePointOfFailure(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfBlocks
	
	public UnsignedInt64 get_NumberOfBlocks() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_NUMBEROFBLOCKS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_NUMBEROFBLOCKS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_NUMBEROFBLOCKS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfBlocks(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_NUMBEROFBLOCKS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_NUMBEROFBLOCKS + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_NumberOfBlocks(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_NUMBEROFBLOCKS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_NUMBEROFBLOCKS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PackageRedundancy
	
	public UnsignedInt16 get_PackageRedundancy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_PACKAGEREDUNDANCY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_PACKAGEREDUNDANCY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_PACKAGEREDUNDANCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PackageRedundancy(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_PACKAGEREDUNDANCY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_PACKAGEREDUNDANCY + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_PackageRedundancy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_PACKAGEREDUNDANCY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_PACKAGEREDUNDANCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Primordial
	
	public Boolean get_Primordial() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_PRIMORDIAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_PRIMORDIAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_PRIMORDIAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Primordial(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_PRIMORDIAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_PRIMORDIAL + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_Primordial(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_PRIMORDIAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_PRIMORDIAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Purpose
	
	public String get_Purpose() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_PURPOSE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_PURPOSE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_PURPOSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Purpose(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_PURPOSE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_PURPOSE + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_Purpose(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_PURPOSE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_PURPOSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SequentialAccess
	
	public Boolean get_SequentialAccess() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_SEQUENTIALACCESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_SEQUENTIALACCESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_SEQUENTIALACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SequentialAccess(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageExtent.CIM_PROPERTY_SEQUENTIALACCESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageExtent.CIM_PROPERTY_SEQUENTIALACCESS + " could not be found");
    		
		} else if (!CIM_StorageExtentHelper.isValid_SequentialAccess(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageExtent.CIM_PROPERTY_SEQUENTIALACCESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageExtent.CIM_PROPERTY_SEQUENTIALACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
