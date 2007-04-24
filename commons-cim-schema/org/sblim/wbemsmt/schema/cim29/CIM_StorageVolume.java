/** 
 * CIM_StorageVolume.java
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
 * Description:  A StorageVolume is an Extent that is presented to the Operating System (for
 * example, by a hardware RAID cabinet), to a File System (for example, by a
 * software volume manager) or to another entity. StorageVolumes do NOT
 * participate in StorageRedundancy Groups. They are directly Realized in
 * hardware or are the end result of assembling lower level Extents.
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



/**
 *  A StorageVolume is an Extent that is presented to the Operating System (for
 * example, by a hardware RAID cabinet), to a File System (for example, by a
 * software volume manager) or to another entity. StorageVolumes do NOT
 * participate in StorageRedundancy Groups. They are directly Realized in
 * hardware or are the end result of assembling lower level Extents.
 */
public class CIM_StorageVolume extends CIM_StorageExtent  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageVolume"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.2";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME = "CIM_DiskPartitionBasedOnVolume"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME = "CIM_LogicalDiskBasedOnVolume"; //$NON-NLS-1$
	
	
	/**
	*	A unique identifier for the Volume.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	Note - this property originally touched on two concepts that are now separated into this property and NameNamespace. Values 2,3,4,5,6, and 8 are retained for backwards compatibility but are deprecated in lieu of the corresponding values in CIM_StorageVolume.NameNamespace. Format of the Name property. Values are (per SCSI SPC-3): 
2 = VPD Page 83, NAA IEEE Registered Extended (VPD83NAA6) 
(DEPRECATED) 
3 = VPD Page 83, NAA IEEE Registered (VPD83NAA5) 
(DEPRECATED) 
4 = VPD Page 83, (VPD83Type2) (DEPRECATED) 
5 = VPD Page 83, 
T10 Vendor Identification (VPD83Type1) (DEPRECATED) 
6 = VPD Page 83, Vendor Specific (VPD83Type0) (DEPRECATED) 
7 = Serial Number/Vendor/Model (SNVM) SNVM is 3 strings representing the vendor name, product name within the vendor namespace, and the serial number within the model namespace. Strings are delimited with a '+'. Spaces may be included and are significant. The serial number is the text representation of the serial number in hexadecimal upper case. Vendor and Model represent the vendor and model ID from SCSI Inquiry data, the vendor field MUST be 8 characters wide and the product field MUST be 16 characters wide. For example, 'ACME +SUPER DISK +124437458' 
8 = Node WWN (for single LUN/controller) (NodeWWN) 
(DEPRECATED) 
9 = NAA as a generic format. See 
http://standards.ieee.org/regauth/oui/tutorials/fibrecomp_id.html Formatted as 16 or 32 unseparated uppercase hex characters (2 per binary byte). For example '21000020372D3C73' 
10 = EUI as a generic format (EUI64) See 
http://standards.ieee.org/regauth/oui/tutorials/EUI64.html 
Formatted as 16 unseparated uppercase hex characters (2 per binary byte) 
11 = T10 vendor identifier format as returned by SCSI Inquiry VPD page 83, identifier type 2. See T1- SPC-3 specification. The 8-byte ASCII vendor ID from the T10 registry followed by a vendor specific ASCII identifier; spaces are permitted. For non SCSI volumes, 'SNVM' may be the most appropriate choice.
	*/
	public final static String CIM_PROPERTY_NAMEFORMAT = "NameFormat"; //$NON-NLS-1$
	/**
	*	The preferred source for volume names is SCSI VPD Page 83 responses. Page 83 returns a list of identifiers for various device elements. The metadata for each identifier includes an Association field, identifiers with association of 0 apply to volumes. Page 83 supports several namespaces specified in the Type field in the identifier metadata. See SCSI SPC-3 specification. 2 = VPD Page 83, Type 3 NAA (NameFormat should be NAA) 3 = VPD Page 83, Type 2 EUI64 (NameFormat EUI) 4 = VPD Page 83, Type 1 T10 Vendor Identification; (NameFormat T10) Less preferred namespaces from other interfaces: 5 = VPD page 80, Serial number (NameFormat should be Other) 6 = FC NodeWWN (NameFormat should be NAA or EUI) 7 = Serial Number/Vendor/Model (NameFormat should be SNVM)
	*/
	public final static String CIM_PROPERTY_NAMENAMESPACE = "NameNamespace"; //$NON-NLS-1$
	/**
	*	A string describing the format of the Name property when NameFormat includes the value 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERNAMEFORMAT = "OtherNameFormat"; //$NON-NLS-1$
	/**
	*	A string describing the namespace of the Name property when NameNamespace includes the value 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERNAMENAMESPACE = "OtherNameNamespace"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAMEFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAMENAMESPACE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERNAMEFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERNAMENAMESPACE);
				
		for (int i = 0; i < CIM_StorageExtent.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAMEFORMAT)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAMENAMESPACE)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERNAMEFORMAT)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERNAMENAMESPACE)){
				continue;
			}
			
			CIM_StorageVolume.CIM_PropertyNameList.add(CIM_StorageExtent.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAMEFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAMENAMESPACE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERNAMEFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERNAMENAMESPACE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_StorageExtent.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAMEFORMAT)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAMENAMESPACE)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERNAMEFORMAT)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERNAMENAMESPACE)){
				continue;
			}
			
			CIM_StorageVolume.CIM_PropertyList.add(CIM_StorageExtent.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_StorageExtent.Java_Package_List.size(); i++) {
			if (((String)CIM_StorageExtent.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_StorageExtent.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_NAMEFORMAT = {"Unknown","Other","VPD83NAA6","VPD83NAA5","VPD83Type2","VPD83Type1","VPD83Type0","SNVM","NodeWWN","NAA","EUI64","T10VID"};
	public final static String[] CIM_VALUEMAP_NAMENAMESPACE = {"Unknown","Other","VPD83Type3","VPD83Type2","VPD83Type1","VPD80","NodeWWN","SNVM"};
	
	
	public final static int NAMEFORMAT_UNKNOWN = 0;
	public final static int NAMEFORMAT_OTHER = 1;
	public final static int NAMEFORMAT_VPD83NAA6 = 2;
	public final static int NAMEFORMAT_VPD83NAA5 = 3;
	public final static int NAMEFORMAT_VPD83TYPE2 = 4;
	public final static int NAMEFORMAT_VPD83TYPE1 = 5;
	public final static int NAMEFORMAT_VPD83TYPE0 = 6;
	public final static int NAMEFORMAT_SNVM = 7;
	public final static int NAMEFORMAT_NODEWWN = 8;
	public final static int NAMEFORMAT_NAA = 9;
	public final static int NAMEFORMAT_EUI64 = 10;
	public final static int NAMEFORMAT_T10VID = 11;
	
	public final static int NAMENAMESPACE_UNKNOWN = 0;
	public final static int NAMENAMESPACE_OTHER = 1;
	public final static int NAMENAMESPACE_VPD83TYPE3 = 2;
	public final static int NAMENAMESPACE_VPD83TYPE2 = 3;
	public final static int NAMENAMESPACE_VPD83TYPE1 = 4;
	public final static int NAMENAMESPACE_VPD80 = 5;
	public final static int NAMENAMESPACE_NODEWWN = 6;
	public final static int NAMENAMESPACE_SNVM = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageVolume() {

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
	public CIM_StorageVolume(Vector keyProperties){ 
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
	public CIM_StorageVolume(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageVolume)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageVolume)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageVolume)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageVolume)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageVolume)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageVolume)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageVolume)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageVolume)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageVolume)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageVolume)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_DiskPartition_CIM_DiskPartitionBasedOnVolumes(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, 
					CIM_DiskPartition.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageVolume.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageVolume.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_StorageVolume.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_StorageVolume.Java_Package_List.setElementAt((String)(CIM_StorageVolume.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_StorageVolume.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiskPartition(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_DiskPartition(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DiskPartition(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_DiskPartition_CIM_DiskPartitionBasedOnVolume_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, 
					CIM_DiskPartition.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_DiskPartition.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnVolumes(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME, 
					CIM_LogicalDisk.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageVolume.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageVolume.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_StorageVolume.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_StorageVolume.Java_Package_List.setElementAt((String)(CIM_StorageVolume.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_StorageVolume.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnVolume_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME, 
					CIM_LogicalDisk.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
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

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageVolume.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageVolume.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageVolume.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageVolume.CIM_PROPERTY_NAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageVolume.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_StorageVolumeHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageVolume.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageVolume.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NameFormat
	
	public UnsignedInt16 get_NameFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageVolume.CIM_PROPERTY_NAMEFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageVolume.CIM_PROPERTY_NAMEFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageVolume.CIM_PROPERTY_NAMEFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NameFormat(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageVolume.CIM_PROPERTY_NAMEFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageVolume.CIM_PROPERTY_NAMEFORMAT + " could not be found");
    		
		} else if (!CIM_StorageVolumeHelper.isValid_NameFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageVolume.CIM_PROPERTY_NAMEFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageVolume.CIM_PROPERTY_NAMEFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NameNamespace
	
	public UnsignedInt16 get_NameNamespace() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageVolume.CIM_PROPERTY_NAMENAMESPACE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageVolume.CIM_PROPERTY_NAMENAMESPACE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageVolume.CIM_PROPERTY_NAMENAMESPACE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NameNamespace(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageVolume.CIM_PROPERTY_NAMENAMESPACE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageVolume.CIM_PROPERTY_NAMENAMESPACE + " could not be found");
    		
		} else if (!CIM_StorageVolumeHelper.isValid_NameNamespace(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageVolume.CIM_PROPERTY_NAMENAMESPACE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageVolume.CIM_PROPERTY_NAMENAMESPACE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherNameFormat
	
	public String get_OtherNameFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageVolume.CIM_PROPERTY_OTHERNAMEFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageVolume.CIM_PROPERTY_OTHERNAMEFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageVolume.CIM_PROPERTY_OTHERNAMEFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherNameFormat(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageVolume.CIM_PROPERTY_OTHERNAMEFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageVolume.CIM_PROPERTY_OTHERNAMEFORMAT + " could not be found");
    		
		} else if (!CIM_StorageVolumeHelper.isValid_OtherNameFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageVolume.CIM_PROPERTY_OTHERNAMEFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageVolume.CIM_PROPERTY_OTHERNAMEFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherNameNamespace
	
	public String get_OtherNameNamespace() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageVolume.CIM_PROPERTY_OTHERNAMENAMESPACE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageVolume.CIM_PROPERTY_OTHERNAMENAMESPACE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageVolume.CIM_PROPERTY_OTHERNAMENAMESPACE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherNameNamespace(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageVolume.CIM_PROPERTY_OTHERNAMENAMESPACE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageVolume.CIM_PROPERTY_OTHERNAMENAMESPACE + " could not be found");
    		
		} else if (!CIM_StorageVolumeHelper.isValid_OtherNameNamespace(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageVolume.CIM_PROPERTY_OTHERNAMENAMESPACE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageVolume.CIM_PROPERTY_OTHERNAMENAMESPACE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
