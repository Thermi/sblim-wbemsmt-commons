/** 
 * CIM_FileSystem.java
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
 * Description: A file or dataset store local to a System (such as a ComputerSystem or an ApplicationSystem) or remotely mounted from a file server.
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



public class CIM_FileSystem extends CIM_EnabledLogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_FileSystem";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS = "CIM_BootOSFromFS";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE = "CIM_FileStorage";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM = "CIM_HostedFileSystem";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT = "CIM_Mount";
	
	
	/**
	*	AvailableSpace indicates the total amount of free space for the FileSystem, in bytes. If unknown, enter 0.
	*/
	public final static String CIM_PROPERTY_AVAILABLESPACE = "AvailableSpace"; //$NON-NLS-1$
	/**
	*	FileSystems can read/write data in blocks which are defined independently of the underlying StorageExtents. This property captures the FileSystem's block size for data storage and retrieval.
	*/
	public final static String CIM_PROPERTY_BLOCKSIZE = "BlockSize"; //$NON-NLS-1$
	/**
	*	The scoping System's CreationClassName. Note that this class was originally defined in the scope of a ComputerSystem, and was later allowed to be scoped by any System (for example, a computer or application system). Unfortunately, the property name, CSCreationClassName, could not be changed (for example, to SystemCreationClass Name) without deprecating the class. This change was not deemed critical to the semantics and therefore did not merit deprecation. So, the property name remains.
	*/
	public final static String CIM_PROPERTY_CSCREATIONCLASSNAME = "CSCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping System's Name. Note that this class was originally defined in the scope of a ComputerSystem, and was later allowed to be scoped by any System (for example, a computer or application system). Unfortunately, the property name, CSName, could not be changed (for example, to SystemName) without deprecating the class. This change was not deemed critical to the semantics and therefore did not merit deprecation. So, the property name remains.
	*/
	public final static String CIM_PROPERTY_CSNAME = "CSName"; //$NON-NLS-1$
	/**
	*	Indicates that the case of file names are preserved.
	*/
	public final static String CIM_PROPERTY_CASEPRESERVED = "CasePreserved"; //$NON-NLS-1$
	/**
	*	Indicates that case sensitive file names are supported.
	*/
	public final static String CIM_PROPERTY_CASESENSITIVE = "CaseSensitive"; //$NON-NLS-1$
	/**
	*	The minimum file allocation size (an integral number of blocks), imposed by the FileSystem. (The size of a block is specified in the BlockSize property for the FileSystem.) Minimum allocation size is the smallest amount of storage allocated to a LogicalFile by the FileSystem. This is not a mandatory minimum allocation for all FileSystems. Under stress conditions, some FileSystems may allocate storage in amounts smaller than the ClusterSize.
	*/
	public final static String CIM_PROPERTY_CLUSTERSIZE = "ClusterSize"; //$NON-NLS-1$
	/**
	*	Array defining the character sets or encoding supported by the FileSystem. For example, the values, "ASCII" (2) or "ISO2022" (4), may be specified.
	*/
	public final static String CIM_PROPERTY_CODESET = "CodeSet"; //$NON-NLS-1$
	/**
	*	A free form string indicating the algorithm or tool used to compress the FileSystem. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the FileSystem is compressed or not, "Compressed" to represent that the File System is compressed but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the FileSystem is not compressed.
	*/
	public final static String CIM_PROPERTY_COMPRESSIONMETHOD = "CompressionMethod"; //$NON-NLS-1$
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	A free form string indicating the algorithm or tool used to encrypt the FileSystem. If it is not possible or not desired to describe the encryption scheme (perhaps for security reasons), recommend using the following words: "Unknown" to represent that it is not known whether the FileSystem is encrypted or not, "Encrypted" to represent that the File System is encrypted but either its encryption scheme is not known or not disclosed, and "Not Encrypted" to represent that the FileSystem is not encrypted.
	*/
	public final static String CIM_PROPERTY_ENCRYPTIONMETHOD = "EncryptionMethod"; //$NON-NLS-1$
	/**
	*	The FileSystemSize property stores the total size of the File System in bytes. If unknown, enter 0.
	*/
	public final static String CIM_PROPERTY_FILESYSTEMSIZE = "FileSystemSize"; //$NON-NLS-1$
	/**
	*	String describing the type of FileSystem and therefore, its conventions. For example, "NTFS" or "S5" may be listed as well as any additional information on the FileSystem's implementation. Since various flavors of FileSystems (like S5) exist, this property is defined as a string.
	*/
	public final static String CIM_PROPERTY_FILESYSTEMTYPE = "FileSystemType"; //$NON-NLS-1$
	/**
	*	Integer indicating the maximum length of a file name within the FileSystem. 0 indicates that there is no limit on file name length.
	*/
	public final static String CIM_PROPERTY_MAXFILENAMELENGTH = "MaxFileNameLength"; //$NON-NLS-1$
	/**
	*	The inherited Name serves as key of a FileSystem instance within a ComputerSystem.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The number of files contained in the FileSystem.
	*/
	public final static String CIM_PROPERTY_NUMBEROFFILES = "NumberOfFiles"; //$NON-NLS-1$
	/**
	*	A string describing the persistence characteristics when PersistenceType is "Other".
	*/
	public final static String CIM_PROPERTY_OTHERPERSISTENCETYPE = "OtherPersistenceType"; //$NON-NLS-1$
	/**
	*	An enumerated value representing the FileSystem's perception of its own persistence characteristics. This property would typically be set at the time the FileSystem is instantiated and would not be changed by external actions. A value of "Persistent" indicates that the FileSystem is persistent, will be preserved through an orderly shutdown and should be protected. A value of "Temporary" indicates that the FileSystem is non-persistent, should not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem is controlled outside of the scope of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used. A value of "Unknown" indicates that the persistence of the FileSystem can not be determined.
	*/
	public final static String CIM_PROPERTY_PERSISTENCETYPE = "PersistenceType"; //$NON-NLS-1$
	/**
	*	Indicates that the FileSystem is designated as read only.
	*/
	public final static String CIM_PROPERTY_READONLY = "ReadOnly"; //$NON-NLS-1$
	/**
	*	Path name or other information defining the root of the FileSystem.
	*/
	public final static String CIM_PROPERTY_ROOT = "Root"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AVAILABLESPACE);
		CIM_PropertyNameList.add(CIM_PROPERTY_BLOCKSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CSCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CASEPRESERVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CASESENSITIVE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLUSTERSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CODESET);
		CIM_PropertyNameList.add(CIM_PROPERTY_COMPRESSIONMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENCRYPTIONMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_FILESYSTEMSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_FILESYSTEMTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXFILENAMELENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFFILES);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERPERSISTENCETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERSISTENCETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_READONLY);
		CIM_PropertyNameList.add(CIM_PROPERTY_ROOT);
				
		for (int i = 0; i < CIM_EnabledLogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AVAILABLESPACE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BLOCKSIZE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CSCREATIONCLASSNAME)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CSNAME)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CASEPRESERVED)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CASESENSITIVE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLUSTERSIZE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CODESET)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMPRESSIONMETHOD)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENCRYPTIONMETHOD)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FILESYSTEMSIZE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FILESYSTEMTYPE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXFILENAMELENGTH)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFFILES)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERPERSISTENCETYPE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PERSISTENCETYPE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_READONLY)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROOT)){
				continue;
			}
			
			CIM_FileSystem.CIM_PropertyNameList.add(CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AVAILABLESPACE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BLOCKSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CSCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CASEPRESERVED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CASESENSITIVE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLUSTERSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CODESET, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMPRESSIONMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENCRYPTIONMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FILESYSTEMSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FILESYSTEMTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXFILENAMELENGTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFFILES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERPERSISTENCETYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERSISTENCETYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_READONLY, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROOT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_EnabledLogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AVAILABLESPACE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BLOCKSIZE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CSCREATIONCLASSNAME)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CSNAME)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CASEPRESERVED)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CASESENSITIVE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLUSTERSIZE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CODESET)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMPRESSIONMETHOD)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENCRYPTIONMETHOD)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FILESYSTEMSIZE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FILESYSTEMTYPE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXFILENAMELENGTH)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFFILES)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERPERSISTENCETYPE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PERSISTENCETYPE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_READONLY)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROOT)){
				continue;
			}
			
			CIM_FileSystem.CIM_PropertyList.add(CIM_EnabledLogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_EnabledLogicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_EnabledLogicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_EnabledLogicalElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CODESET = {"Unknown","Other","ASCII","Unicode","ISO2022","ISO8859","Extended UNIX Code","UTF-8","UCS-2"};
	public final static String[] CIM_VALUEMAP_PERSISTENCETYPE = {"Unknown","Other","Persistent","Temporary","External"};
	
	
	public final static int CODESET_UNKNOWN = 0;
	public final static int CODESET_OTHER = 1;
	public final static int CODESET_ASCII = 2;
	public final static int CODESET_UNICODE = 3;
	public final static int CODESET_ISO2022 = 4;
	public final static int CODESET_ISO8859 = 5;
	public final static int CODESET_EXTENDEDUNIXCODE = 6;
	public final static int CODESET_UTF_8 = 7;
	public final static int CODESET_UCS_2 = 8;
	
	public final static int PERSISTENCETYPE_UNKNOWN = 0;
	public final static int PERSISTENCETYPE_OTHER = 1;
	public final static int PERSISTENCETYPE_PERSISTENT = 2;
	public final static int PERSISTENCETYPE_TEMPORARY = 3;
	public final static int PERSISTENCETYPE_EXTERNAL = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_FileSystem() {

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
	public CIM_FileSystem(Vector keyProperties){ 
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
	public CIM_FileSystem(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_CSCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CSCREATIONCLASSNAME);
		
		if (CIMProperty_CSCreationClassName == null || CIMProperty_CSCreationClassName.getValue().isEmpty() || CIMProperty_CSCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CSCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_CSName = this.cimInstance.getProperty(CIM_PROPERTY_CSNAME);
		
		if (CIMProperty_CSName == null || CIMProperty_CSName.getValue().isEmpty() || CIMProperty_CSName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_CreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CREATIONCLASSNAME);
		
		if (CIMProperty_CreationClassName == null || CIMProperty_CreationClassName.getValue().isEmpty() || CIMProperty_CreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
			result = false;
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
	    
	    if (!(object instanceof CIM_FileSystem)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FileSystem)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FileSystem)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FileSystem)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FileSystem)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FileSystem)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FileSystem)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FileSystem)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FileSystem)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FileSystem)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_OperatingSystem_CIM_BootOSFromFSs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS, 
					CIM_OperatingSystem.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_FileSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_FileSystem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_FileSystem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_FileSystem.Java_Package_List.setElementAt((String)(CIM_FileSystem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_FileSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OperatingSystem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_OperatingSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OperatingSystem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_OperatingSystem_CIM_BootOSFromFS_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS, 
					CIM_OperatingSystem.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_OperatingSystem.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_LogicalFile_CIM_FileStorages(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE, 
					CIM_LogicalFile.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_FileSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_FileSystem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_FileSystem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_FileSystem.Java_Package_List.setElementAt((String)(CIM_FileSystem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_FileSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalFile(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_LogicalFile(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalFile(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_LogicalFile_CIM_FileStorage_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE, 
					CIM_LogicalFile.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LogicalFile.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_System_CIM_HostedFileSystems(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM, 
					CIM_System.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_FileSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_FileSystem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_FileSystem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_FileSystem.Java_Package_List.setElementAt((String)(CIM_FileSystem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_FileSystem.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_System_CIM_HostedFileSystem_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM, 
					CIM_System.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent");
		
		
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

	public ArrayList getAssociated_CIM_Directory_CIM_Mounts(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT, 
					CIM_Directory.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_FileSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_FileSystem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_FileSystem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_FileSystem.Java_Package_List.setElementAt((String)(CIM_FileSystem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_FileSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Directory(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Directory(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Directory(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Directory_CIM_Mount_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT, 
					CIM_Directory.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Directory.CIM_CLASS_NAME)) {
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
	
	// Attribute AvailableSpace
	
	public UnsignedInt64 get_AvailableSpace() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_AVAILABLESPACE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_AVAILABLESPACE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_AVAILABLESPACE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AvailableSpace(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_AVAILABLESPACE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_AVAILABLESPACE + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_AvailableSpace(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_AVAILABLESPACE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_AVAILABLESPACE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BlockSize
	
	public UnsignedInt64 get_BlockSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_BLOCKSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_BLOCKSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_BLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BlockSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_BLOCKSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_BLOCKSIZE + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_BlockSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_BLOCKSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_BLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CSCreationClassName
	
	public String get_CSCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CSCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CSCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CSCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CSCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_FileSystem.CIM_PROPERTY_CSCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CSCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_CSCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_CSCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CSName
	
	public String get_CSName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CSName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_FileSystem.CIM_PROPERTY_CSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CSNAME + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_CSName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_CSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CasePreserved
	
	public Boolean get_CasePreserved() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CASEPRESERVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CASEPRESERVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CASEPRESERVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CasePreserved(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CASEPRESERVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CASEPRESERVED + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_CasePreserved(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_CASEPRESERVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CASEPRESERVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CaseSensitive
	
	public Boolean get_CaseSensitive() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CASESENSITIVE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CASESENSITIVE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CASESENSITIVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CaseSensitive(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CASESENSITIVE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CASESENSITIVE + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_CaseSensitive(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_CASESENSITIVE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CASESENSITIVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ClusterSize
	
	public UnsignedInt32 get_ClusterSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CLUSTERSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CLUSTERSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CLUSTERSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ClusterSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CLUSTERSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CLUSTERSIZE + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_ClusterSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_CLUSTERSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CLUSTERSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CodeSet
	
	public UnsignedInt16[] get_CodeSet() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CODESET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CODESET + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CODESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_CodeSet(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CODESET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CODESET + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_CodeSet(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_CODESET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CODESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CompressionMethod
	
	public String get_CompressionMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_COMPRESSIONMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_COMPRESSIONMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_COMPRESSIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CompressionMethod(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_COMPRESSIONMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_COMPRESSIONMETHOD + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_CompressionMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_COMPRESSIONMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_COMPRESSIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_FileSystem.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EncryptionMethod
	
	public String get_EncryptionMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_ENCRYPTIONMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_ENCRYPTIONMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_ENCRYPTIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EncryptionMethod(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_ENCRYPTIONMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_ENCRYPTIONMETHOD + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_EncryptionMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_ENCRYPTIONMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_ENCRYPTIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FileSystemSize
	
	public UnsignedInt64 get_FileSystemSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_FILESYSTEMSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_FILESYSTEMSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_FILESYSTEMSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FileSystemSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_FILESYSTEMSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_FILESYSTEMSIZE + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_FileSystemSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_FILESYSTEMSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_FILESYSTEMSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FileSystemType
	
	public String get_FileSystemType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_FILESYSTEMTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_FILESYSTEMTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_FILESYSTEMTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FileSystemType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_FILESYSTEMTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_FILESYSTEMTYPE + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_FileSystemType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_FILESYSTEMTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_FILESYSTEMTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxFileNameLength
	
	public UnsignedInt32 get_MaxFileNameLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_MAXFILENAMELENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_MAXFILENAMELENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_MAXFILENAMELENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxFileNameLength(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_MAXFILENAMELENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_MAXFILENAMELENGTH + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_MaxFileNameLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_MAXFILENAMELENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_MAXFILENAMELENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_FileSystem.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfFiles
	
	public UnsignedInt64 get_NumberOfFiles() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_NUMBEROFFILES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_NUMBEROFFILES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_NUMBEROFFILES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfFiles(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_NUMBEROFFILES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_NUMBEROFFILES + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_NumberOfFiles(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_NUMBEROFFILES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_NUMBEROFFILES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherPersistenceType
	
	public String get_OtherPersistenceType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_OTHERPERSISTENCETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_OTHERPERSISTENCETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_OTHERPERSISTENCETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherPersistenceType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_OTHERPERSISTENCETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_OTHERPERSISTENCETYPE + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_OtherPersistenceType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_OTHERPERSISTENCETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_OTHERPERSISTENCETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PersistenceType
	
	public UnsignedInt16 get_PersistenceType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_PERSISTENCETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_PERSISTENCETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_PERSISTENCETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PersistenceType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_PERSISTENCETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_PERSISTENCETYPE + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_PersistenceType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_PERSISTENCETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_PERSISTENCETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReadOnly
	
	public Boolean get_ReadOnly() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_READONLY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_READONLY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_READONLY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReadOnly(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_READONLY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_READONLY + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_ReadOnly(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_READONLY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_READONLY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Root
	
	public String get_Root() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_ROOT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_ROOT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_ROOT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Root(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystem.CIM_PROPERTY_ROOT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystem.CIM_PROPERTY_ROOT + " could not be found");
    		
		} else if (!CIM_FileSystemHelper.isValid_Root(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystem.CIM_PROPERTY_ROOT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystem.CIM_PROPERTY_ROOT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
