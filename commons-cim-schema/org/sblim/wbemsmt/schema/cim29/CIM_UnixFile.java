/** 
 * CIM_UnixFile.java
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
 * Description: The UnixFile class holds properties that are valid for various subclasses of LogicalFile, in a Unix environment. This is defined as a separate and unique class since it is applicable to Unix files, directories, etc. It is associated via a FileIdentity relationship to these subclasses of LogicalFile. Unless this approach of creating and associating a separate class is used, it is necessary to subclass each of the inheritance hierarchies under LogicalFile, duplicating the properties in this class. The referenced _PC* and _POSIX* constants are defined in unistd.h. Some properties indicate whether the UNIX implementation support a feature such as asynchronous I/O or priority I/O. If supported, sysconf returns the value as defined in the appropriate header file such as unistd.h. If a feature is not supported, then pathconf returns a -1. In this case, the corresponding property should be returned without any value.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_UnixFile extends CIM_LogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_UnixFile";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY = "CIM_FileIdentity";
	
	
	/**
	*	The scoping ComputerSystem's CreationClassName.
	*/
	public final static String CIM_PROPERTY_CSCREATIONCLASSNAME = "CSCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping ComputerSystem's Name.
	*/
	public final static String CIM_PROPERTY_CSNAME = "CSName"; //$NON-NLS-1$
	/**
	*	The scoping FileSystem's CreationClassName.
	*/
	public final static String CIM_PROPERTY_FSCREATIONCLASSNAME = "FSCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping FileSystem's Name.
	*/
	public final static String CIM_PROPERTY_FSNAME = "FSName"; //$NON-NLS-1$
	/**
	*	File Inode number, as printed by "ls -i".
	*/
	public final static String CIM_PROPERTY_FILEINODENUMBER = "FileInodeNumber"; //$NON-NLS-1$
	/**
	*	An identifier that describes the group that owns this file.
	*/
	public final static String CIM_PROPERTY_GROUPID = "GroupID"; //$NON-NLS-1$
	/**
	*	The scoping LogicalFile's CreationClassName.
	*/
	public final static String CIM_PROPERTY_LFCREATIONCLASSNAME = "LFCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping LogicalFile's Name.
	*/
	public final static String CIM_PROPERTY_LFNAME = "LFName"; //$NON-NLS-1$
	/**
	*	The time that the Inode was last modified. This includes the Inode creation time, state modification, and etc.
	*/
	public final static String CIM_PROPERTY_LASTMODIFIEDINODE = "LastModifiedInode"; //$NON-NLS-1$
	/**
	*	Count of the number of names for this file.
	*/
	public final static String CIM_PROPERTY_LINKCOUNT = "LinkCount"; //$NON-NLS-1$
	/**
	*	Maximum number of links to a single file.
	*/
	public final static String CIM_PROPERTY_LINKMAX = "LinkMax"; //$NON-NLS-1$
	/**
	*	Maximum number of bytes in a filename, not including terminating null.
	*/
	public final static String CIM_PROPERTY_NAMEMAX = "NameMax"; //$NON-NLS-1$
	/**
	*	Maximum number of bytes in a pathname, including the terminating null character.
	*/
	public final static String CIM_PROPERTY_PATHMAX = "PathMax"; //$NON-NLS-1$
	/**
	*	Indicates whether asynchronous input or output operations may be performed for the associated file.
	*/
	public final static String CIM_PROPERTY_POSIXASYNCIO = "PosixAsyncIo"; //$NON-NLS-1$
	/**
	*	The use of chown() is restricted to a process with appropriate privileges. chown() is used to change the group ID of a file. The group ID can be changed to the effective group ID or one of its supplementary group IDs.
	*/
	public final static String CIM_PROPERTY_POSIXCHOWNRESTRICTED = "PosixChownRestricted"; //$NON-NLS-1$
	/**
	*	Indicates whether pathname components longer than NameMax generate an error.
	*/
	public final static String CIM_PROPERTY_POSIXNOTRUNC = "PosixNoTrunc"; //$NON-NLS-1$
	/**
	*	Indicates whether prioritized input or output operations may be performed for the associated file.
	*/
	public final static String CIM_PROPERTY_POSIXPRIOIO = "PosixPrioIo"; //$NON-NLS-1$
	/**
	*	Indicates whether synchronised input or output operations may be performed for the associated file.
	*/
	public final static String CIM_PROPERTY_POSIXSYNCIO = "PosixSyncIo"; //$NON-NLS-1$
	/**
	*	Indicates restricted deletion for directories, or possible implementation defined properties for executable files. For directories this is known as the sticky bit.
	*/
	public final static String CIM_PROPERTY_SAVETEXT = "SaveText"; //$NON-NLS-1$
	/**
	*	Indicates whether the associated file has setgid permissions.
	*/
	public final static String CIM_PROPERTY_SETGID = "SetGid"; //$NON-NLS-1$
	/**
	*	Indicates whether the associated file has setuid permissions.
	*/
	public final static String CIM_PROPERTY_SETUID = "SetUid"; //$NON-NLS-1$
	/**
	*	An Identifer that uniquely describes the owner of this file.
	*/
	public final static String CIM_PROPERTY_USERID = "UserID"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CSCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_FSCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_FSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_FILEINODENUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_GROUPID);
		CIM_PropertyNameList.add(CIM_PROPERTY_LFCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_LFNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTMODIFIEDINODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_LINKCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_LINKMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAMEMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSIXASYNCIO);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSIXCHOWNRESTRICTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSIXNOTRUNC);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSIXPRIOIO);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSIXSYNCIO);
		CIM_PropertyNameList.add(CIM_PROPERTY_SAVETEXT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SETGID);
		CIM_PropertyNameList.add(CIM_PROPERTY_SETUID);
		CIM_PropertyNameList.add(CIM_PROPERTY_USERID);
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CSCREATIONCLASSNAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CSNAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FSCREATIONCLASSNAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FSNAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FILEINODENUMBER)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GROUPID)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LFCREATIONCLASSNAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LFNAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTMODIFIEDINODE)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LINKCOUNT)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LINKMAX)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAMEMAX)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHMAX)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSIXASYNCIO)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSIXCHOWNRESTRICTED)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSIXNOTRUNC)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSIXPRIOIO)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSIXSYNCIO)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SAVETEXT)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SETGID)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SETUID)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USERID)){
				continue;
			}
			
			CIM_UnixFile.CIM_PropertyNameList.add(CIM_LogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CSCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FSCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FILEINODENUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GROUPID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LFCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LFNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTMODIFIEDINODE, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LINKCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LINKMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAMEMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSIXASYNCIO, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSIXCHOWNRESTRICTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSIXNOTRUNC, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSIXPRIOIO, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSIXSYNCIO, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SAVETEXT, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SETGID, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SETUID, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USERID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CSCREATIONCLASSNAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CSNAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FSCREATIONCLASSNAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FSNAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FILEINODENUMBER)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GROUPID)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LFCREATIONCLASSNAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LFNAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTMODIFIEDINODE)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LINKCOUNT)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LINKMAX)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAMEMAX)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHMAX)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSIXASYNCIO)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSIXCHOWNRESTRICTED)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSIXNOTRUNC)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSIXPRIOIO)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSIXSYNCIO)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SAVETEXT)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SETGID)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SETUID)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USERID)){
				continue;
			}
			
			CIM_UnixFile.CIM_PropertyList.add(CIM_LogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
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
	public CIM_UnixFile() {

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
	public CIM_UnixFile(Vector keyProperties){ 
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
	public CIM_UnixFile(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_FSCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_FSCREATIONCLASSNAME);
		
		if (CIMProperty_FSCreationClassName == null || CIMProperty_FSCreationClassName.getValue().isEmpty() || CIMProperty_FSCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_FSCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_FSName = this.cimInstance.getProperty(CIM_PROPERTY_FSNAME);
		
		if (CIMProperty_FSName == null || CIMProperty_FSName.getValue().isEmpty() || CIMProperty_FSName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_FSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_GroupID = this.cimInstance.getProperty(CIM_PROPERTY_GROUPID);
		
		if (CIMProperty_GroupID == null || CIMProperty_GroupID.getValue().isEmpty() || CIMProperty_GroupID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_GROUPID, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_LFCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_LFCREATIONCLASSNAME);
		
		if (CIMProperty_LFCreationClassName == null || CIMProperty_LFCreationClassName.getValue().isEmpty() || CIMProperty_LFCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_LFCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_LFName = this.cimInstance.getProperty(CIM_PROPERTY_LFNAME);
		
		if (CIMProperty_LFName == null || CIMProperty_LFName.getValue().isEmpty() || CIMProperty_LFName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_LFNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_UserID = this.cimInstance.getProperty(CIM_PROPERTY_USERID);
		
		if (CIMProperty_UserID == null || CIMProperty_UserID.getValue().isEmpty() || CIMProperty_UserID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_USERID, "Required"});
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
	    
	    if (!(object instanceof CIM_UnixFile)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_UnixFile)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_UnixFile)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_UnixFile)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_UnixFile)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_UnixFile)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_UnixFile)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_UnixFile)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_UnixFile)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_UnixFile)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_LogicalFile_CIM_FileIdentitys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY, 
					CIM_LogicalFile.CIM_CLASS_NAME, 
					"SameElement",
					"SystemElement",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_UnixFile.Java_Package_List.size(); i++) {
						if (!((String)(CIM_UnixFile.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_UnixFile.Java_Package_List.get(i))).endsWith(".")) {
							CIM_UnixFile.Java_Package_List.setElementAt((String)(CIM_UnixFile.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_UnixFile.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_LogicalFile_CIM_FileIdentity_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY, 
					CIM_LogicalFile.CIM_CLASS_NAME, 
					"SameElement",
					"SystemElement");
		
		
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

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute CSCreationClassName
	
	public String get_CSCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_CSCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_CSCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_CSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CSCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_CSCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixFile.CIM_PROPERTY_CSCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_CSCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_CSCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_CSCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_CSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CSName
	
	public String get_CSName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_CSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_CSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_CSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CSName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_CSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixFile.CIM_PROPERTY_CSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_CSNAME + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_CSName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_CSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_CSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FSCreationClassName
	
	public String get_FSCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_FSCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_FSCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_FSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FSCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_FSCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixFile.CIM_PROPERTY_FSCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_FSCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_FSCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_FSCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_FSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FSName
	
	public String get_FSName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_FSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_FSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_FSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FSName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_FSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixFile.CIM_PROPERTY_FSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_FSNAME + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_FSName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_FSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_FSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FileInodeNumber
	
	public String get_FileInodeNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_FILEINODENUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_FILEINODENUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_FILEINODENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FileInodeNumber(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_FILEINODENUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_FILEINODENUMBER + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_FileInodeNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_FILEINODENUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_FILEINODENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute GroupID
	
	public String get_GroupID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_GROUPID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_GROUPID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_GROUPID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_GroupID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_GROUPID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_GROUPID + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_GroupID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_GROUPID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_GROUPID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LFCreationClassName
	
	public String get_LFCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_LFCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_LFCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_LFCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LFCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_LFCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixFile.CIM_PROPERTY_LFCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_LFCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_LFCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_LFCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_LFCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LFName
	
	public String get_LFName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_LFNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_LFNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_LFNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LFName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_LFNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixFile.CIM_PROPERTY_LFNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_LFNAME + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_LFName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_LFNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_LFNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastModifiedInode
	
	public Calendar get_LastModifiedInode() {

		CIMProperty property = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_LASTMODIFIEDINODE);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_LASTMODIFIEDINODE + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_LASTMODIFIEDINODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_LastModifiedInode(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_LASTMODIFIEDINODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_LASTMODIFIEDINODE + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_LastModifiedInode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_LASTMODIFIEDINODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_LASTMODIFIEDINODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute LinkCount
	
	public UnsignedInt64 get_LinkCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_LINKCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_LINKCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_LINKCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LinkCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_LINKCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_LINKCOUNT + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_LinkCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_LINKCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_LINKCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LinkMax
	
	public UnsignedInt64 get_LinkMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_LINKMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_LINKMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_LINKMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LinkMax(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_LINKMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_LINKMAX + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_LinkMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_LINKMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_LINKMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NameMax
	
	public UnsignedInt64 get_NameMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_NAMEMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_NAMEMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_NAMEMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NameMax(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_NAMEMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_NAMEMAX + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_NameMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_NAMEMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_NAMEMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathMax
	
	public UnsignedInt64 get_PathMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_PATHMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_PATHMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_PATHMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathMax(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_PATHMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_PATHMAX + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_PathMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_PATHMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_PATHMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PosixAsyncIo
	
	public UnsignedInt64 get_PosixAsyncIo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_POSIXASYNCIO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXASYNCIO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXASYNCIO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PosixAsyncIo(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_POSIXASYNCIO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXASYNCIO + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_PosixAsyncIo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_POSIXASYNCIO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXASYNCIO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PosixChownRestricted
	
	public UnsignedInt64 get_PosixChownRestricted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_POSIXCHOWNRESTRICTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXCHOWNRESTRICTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXCHOWNRESTRICTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PosixChownRestricted(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_POSIXCHOWNRESTRICTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXCHOWNRESTRICTED + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_PosixChownRestricted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_POSIXCHOWNRESTRICTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXCHOWNRESTRICTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PosixNoTrunc
	
	public UnsignedInt64 get_PosixNoTrunc() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_POSIXNOTRUNC);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXNOTRUNC + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXNOTRUNC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PosixNoTrunc(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_POSIXNOTRUNC);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXNOTRUNC + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_PosixNoTrunc(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_POSIXNOTRUNC);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXNOTRUNC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PosixPrioIo
	
	public UnsignedInt64 get_PosixPrioIo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_POSIXPRIOIO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXPRIOIO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXPRIOIO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PosixPrioIo(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_POSIXPRIOIO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXPRIOIO + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_PosixPrioIo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_POSIXPRIOIO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXPRIOIO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PosixSyncIo
	
	public UnsignedInt64 get_PosixSyncIo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_POSIXSYNCIO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXSYNCIO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXSYNCIO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PosixSyncIo(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_POSIXSYNCIO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXSYNCIO + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_PosixSyncIo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_POSIXSYNCIO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_POSIXSYNCIO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SaveText
	
	public Boolean get_SaveText() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_SAVETEXT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_SAVETEXT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_SAVETEXT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SaveText(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_SAVETEXT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_SAVETEXT + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_SaveText(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_SAVETEXT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_SAVETEXT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SetGid
	
	public Boolean get_SetGid() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_SETGID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_SETGID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_SETGID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SetGid(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_SETGID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_SETGID + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_SetGid(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_SETGID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_SETGID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SetUid
	
	public Boolean get_SetUid() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_SETUID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_SETUID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_SETUID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SetUid(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_SETUID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_SETUID + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_SetUid(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_SETUID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_SETUID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UserID
	
	public String get_UserID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_USERID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_USERID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_USERID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UserID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixFile.CIM_PROPERTY_USERID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixFile.CIM_PROPERTY_USERID + " could not be found");
    		
		} else if (!CIM_UnixFileHelper.isValid_UserID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixFile.CIM_PROPERTY_USERID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixFile.CIM_PROPERTY_USERID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
