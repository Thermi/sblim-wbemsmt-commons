/** 
 * CIM_DiskPartition.java
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
 * Description:  A DiskPartition is a presentation of a contiguous range of logical blocks that
 * is identifiable by the Operating System via the Partition's type and subtype
 * fields. Disk Partitions should be directly realized by PhysicalMedia
 * (indicated by the RealizesDiskPartition association) or built on
 * StorageVolumes (indicated by the PartitionBasedOnVolume association.
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
 *  A DiskPartition is a presentation of a contiguous range of logical blocks that
 * is identifiable by the Operating System via the Partition's type and subtype
 * fields. Disk Partitions should be directly realized by PhysicalMedia
 * (indicated by the RealizesDiskPartition association) or built on
 * StorageVolumes (indicated by the PartitionBasedOnVolume association.
 */
public class CIM_DiskPartition extends CIM_MediaPartition  {
	
	public final static String CIM_CLASS_NAME = "CIM_DiskPartition"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME = "CIM_DiskPartitionBasedOnVolume"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION = "CIM_LogicalDiskBasedOnPartition"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION = "CIM_RealizesDiskPartition"; //$NON-NLS-1$
	
	
	/**
	*	The 'sub' type of a primary, extended, or logical Partition. The list of possible values corresponds to the decimal representation of the typical values in the Partition record.
	*/
	public final static String CIM_PROPERTY_PARTITIONSUBTYPE = "PartitionSubtype"; //$NON-NLS-1$
	/**
	*	The type of Partition.
	*/
	public final static String CIM_PROPERTY_PARTITIONTYPE = "PartitionType"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the DiskPartition is labelled as the primary partition for a ComputerSystem.
	*/
	public final static String CIM_PROPERTY_PRIMARYPARTITION = "PrimaryPartition"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_PARTITIONSUBTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PARTITIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIMARYPARTITION);
				
		for (int i = 0; i < CIM_MediaPartition.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_MediaPartition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PARTITIONSUBTYPE)||
				((String)CIM_MediaPartition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PARTITIONTYPE)||
				((String)CIM_MediaPartition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIMARYPARTITION)){
				continue;
			}
			
			CIM_DiskPartition.CIM_PropertyNameList.add(CIM_MediaPartition.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PARTITIONSUBTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PARTITIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIMARYPARTITION, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_MediaPartition.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_MediaPartition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PARTITIONSUBTYPE)||
				((CIMProperty)CIM_MediaPartition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PARTITIONTYPE)||
				((CIMProperty)CIM_MediaPartition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIMARYPARTITION)){
				continue;
			}
			
			CIM_DiskPartition.CIM_PropertyList.add(CIM_MediaPartition.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_MediaPartition.Java_Package_List.size(); i++) {
			if (((String)CIM_MediaPartition.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_MediaPartition.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PARTITIONSUBTYPE = {"Empty | Microsoft","DOS 12-bit FAT","XENIX root","XENIX usr","DOS 16-bit FAT","DOS Extended","DOS 16-bit FAT (> 32MB)","OS/2 HPFS | Win NTFS | QNX Ver 2 | Adv UNIX","AIX Boot | OS /2 | Dell (Array) | Commodore DOS","AIX Data, Coherent","OS/2 Boot Manager","32-bit FAT","32-bit FAT","Microsoft 16-bit FAT","Microsoft DOS Extended","OPUS | OS/2 2.0","OS/2 (MOSS) Inactive Type 1","Compaq Diagnostics Partition | Microsoft","OS/2 (MOSS) Inactive Type 4","OS/2 (MOSS) Inactive Type 6","OS/2 (MOSS) Inactive Type 7","OS/2 (MOSS) Inactive Type B","OS/2 (MOSS) Inactive Type C","Microsoft","Microsoft","Microsoft","Microsoft","Microsoft","Microsoft","Microsoft","OS/2 Logical Volume Manager","Microsoft","OS/2 JFS Log","PowerQuest","VENIX 80286 | Series/1 Disk","Personal RISC Boot","Veritas","Veritas","OnTrack Disk Manager Read Only DOS","OnTrack Disk Manager Read/Write DOS","CPM | Microport System V/386 | OnTrack Disk Mgr | Microsoft","OnTrack Disk Manager","OnTrack Disk Manager Non-DOS","Micro House EZ-Drive Non-DOS","Golden Bow Vfeature | Microsoft","Storage Dimensions SpeedStor | Microsoft","UNIX - AT&T System V/386 | SCO UNIX","Novell NetWare | Speedstore","Novell NetWare","Novell NetWare","Novell","Novell","Novell","Microsoft","Microsoft","Microsoft","PC/IX IBM","Microsoft","QNX POSIX","QNX POSIX (Secondary)","QNX POSIX (Secondary)","Minix (<=1.4a) | Linux | Microsoft","Minix (>=1.4b) | Microsoft","Linux Swap | Prime","Linux Native | Apple","System Hibernation for APM","Microsoft","HPFS FT mirror","Amoeba | Microsoft","Amoeba BBT | Microsoft","Microsoft","Microsoft","Microsoft","BSD/386","Microsoft","Microsoft","Microsoft","Microsoft","Microsoft","BSDI fs | Microsoft","BSDI Swap | Microsoft","Microsoft","Microsoft","Microsoft","Syrinx | HPFS FT Disabled Mirror","CP/M 86","Digital Research CPM-86 | Concurrent DOS | OUTRIGGER","SpeedStor 12-bit FAT Extended","DOS Read-Only | Storage Dimensions","SpeedStor 16-bit FAT Extended","Microsoft","Microsoft","Intel","OS/2 Raw Data","Storage Dimensions","DOS (Secondary)","Microsoft","SpeedStor Large | Storage Dimensions","Microsoft","Lan Step | SpeedStor | IBM PS/2 IML","Bad Block Tables","Unknown"};
	public final static String[] CIM_VALUEMAP_PARTITIONTYPE = {"Unknown","Primary","Extended","Logical"};
	
	
	public final static int PARTITIONSUBTYPE_EMPTY_MICROSOFT = 0;
	public final static int PARTITIONSUBTYPE_DOS12_BITFAT = 1;
	public final static int PARTITIONSUBTYPE_XENIXROOT = 2;
	public final static int PARTITIONSUBTYPE_XENIXUSR = 3;
	public final static int PARTITIONSUBTYPE_DOS16_BITFAT = 4;
	public final static int PARTITIONSUBTYPE_DOSEXTENDED = 5;
	public final static int PARTITIONSUBTYPE_DOS16_BITFAT_LARGER_32MB = 6;
	public final static int PARTITIONSUBTYPE_OS_2HPFS_WINNTFS_QNXVER2_ADVUNIX = 7;
	public final static int PARTITIONSUBTYPE_AIXBOOT_OS_2_DELLARRAY_COMMODOREDOS = 8;
	public final static int PARTITIONSUBTYPE_AIXDATA_COHERENT = 9;
	public final static int PARTITIONSUBTYPE_OS_2BOOTMANAGER = 10;
	public final static int PARTITIONSUBTYPE_32_BITFAT = 11;
	public final static int PARTITIONSUBTYPE_32_BITFAT1 = 12;
	public final static int PARTITIONSUBTYPE_MICROSOFT16_BITFAT = 14;
	public final static int PARTITIONSUBTYPE_MICROSOFTDOSEXTENDED = 15;
	public final static int PARTITIONSUBTYPE_OPUS_OS_22_0 = 16;
	public final static int PARTITIONSUBTYPE_OS_2MOSSINACTIVETYPE1 = 17;
	public final static int PARTITIONSUBTYPE_COMPAQDIAGNOSTICSPARTITION_MICROSOFT = 18;
	public final static int PARTITIONSUBTYPE_OS_2MOSSINACTIVETYPE4 = 20;
	public final static int PARTITIONSUBTYPE_OS_2MOSSINACTIVETYPE6 = 22;
	public final static int PARTITIONSUBTYPE_OS_2MOSSINACTIVETYPE7 = 23;
	public final static int PARTITIONSUBTYPE_OS_2MOSSINACTIVETYPEB = 27;
	public final static int PARTITIONSUBTYPE_OS_2MOSSINACTIVETYPEC = 28;
	public final static int PARTITIONSUBTYPE_MICROSOFT = 33;
	public final static int PARTITIONSUBTYPE_MICROSOFT1 = 35;
	public final static int PARTITIONSUBTYPE_MICROSOFT2 = 36;
	public final static int PARTITIONSUBTYPE_MICROSOFT3 = 38;
	public final static int PARTITIONSUBTYPE_MICROSOFT4 = 49;
	public final static int PARTITIONSUBTYPE_MICROSOFT5 = 51;
	public final static int PARTITIONSUBTYPE_MICROSOFT6 = 52;
	public final static int PARTITIONSUBTYPE_OS_2LOGICALVOLUMEMANAGER = 53;
	public final static int PARTITIONSUBTYPE_MICROSOFT7 = 54;
	public final static int PARTITIONSUBTYPE_OS_2JFSLOG = 55;
	public final static int PARTITIONSUBTYPE_POWERQUEST = 60;
	public final static int PARTITIONSUBTYPE_VENIX80286_SERIES_1DISK = 64;
	public final static int PARTITIONSUBTYPE_PERSONALRISCBOOT = 65;
	public final static int PARTITIONSUBTYPE_VERITAS = 66;
	public final static int PARTITIONSUBTYPE_VERITAS1 = 67;
	public final static int PARTITIONSUBTYPE_ONTRACKDISKMANAGERREADONLYDOS = 80;
	public final static int PARTITIONSUBTYPE_ONTRACKDISKMANAGERREAD_WRITEDOS = 81;
	public final static int PARTITIONSUBTYPE_CPM_MICROPORTSYSTEMV_386_ONTRACKDISKMGR_MICROSOFT = 82;
	public final static int PARTITIONSUBTYPE_ONTRACKDISKMANAGER = 83;
	public final static int PARTITIONSUBTYPE_ONTRACKDISKMANAGERNON_DOS = 84;
	public final static int PARTITIONSUBTYPE_MICROHOUSEEZ_DRIVENON_DOS = 85;
	public final static int PARTITIONSUBTYPE_GOLDENBOWVFEATURE_MICROSOFT = 86;
	public final static int PARTITIONSUBTYPE_STORAGEDIMENSIONSSPEEDSTOR_MICROSOFT = 97;
	public final static int PARTITIONSUBTYPE_UNIX_AT_AND_TSYSTEMV_386_SCOUNIX = 99;
	public final static int PARTITIONSUBTYPE_NOVELLNETWARE_SPEEDSTORE = 100;
	public final static int PARTITIONSUBTYPE_NOVELLNETWARE = 101;
	public final static int PARTITIONSUBTYPE_NOVELLNETWARE1 = 102;
	public final static int PARTITIONSUBTYPE_NOVELL = 103;
	public final static int PARTITIONSUBTYPE_NOVELL1 = 104;
	public final static int PARTITIONSUBTYPE_NOVELL2 = 105;
	public final static int PARTITIONSUBTYPE_MICROSOFT8 = 113;
	public final static int PARTITIONSUBTYPE_MICROSOFT9 = 115;
	public final static int PARTITIONSUBTYPE_MICROSOFT10 = 116;
	public final static int PARTITIONSUBTYPE_PC_IXIBM = 117;
	public final static int PARTITIONSUBTYPE_MICROSOFT11 = 118;
	public final static int PARTITIONSUBTYPE_QNXPOSIX = 119;
	public final static int PARTITIONSUBTYPE_QNXPOSIXSECONDARY = 120;
	public final static int PARTITIONSUBTYPE_QNXPOSIXSECONDARY1 = 121;
	public final static int PARTITIONSUBTYPE_MINIX_LESS_OR_EQUAL_1_4A_LINUX_MICROSOFT = 128;
	public final static int PARTITIONSUBTYPE_MINIX_LARGER_OR_EQUAL_1_4B_MICROSOFT = 129;
	public final static int PARTITIONSUBTYPE_LINUXSWAP_PRIME = 130;
	public final static int PARTITIONSUBTYPE_LINUXNATIVE_APPLE = 131;
	public final static int PARTITIONSUBTYPE_SYSTEMHIBERNATIONFORAPM = 132;
	public final static int PARTITIONSUBTYPE_MICROSOFT12 = 134;
	public final static int PARTITIONSUBTYPE_HPFSFTMIRROR = 135;
	public final static int PARTITIONSUBTYPE_AMOEBA_MICROSOFT = 147;
	public final static int PARTITIONSUBTYPE_AMOEBABBT_MICROSOFT = 148;
	public final static int PARTITIONSUBTYPE_MICROSOFT13 = 161;
	public final static int PARTITIONSUBTYPE_MICROSOFT14 = 163;
	public final static int PARTITIONSUBTYPE_MICROSOFT15 = 164;
	public final static int PARTITIONSUBTYPE_BSD_386 = 165;
	public final static int PARTITIONSUBTYPE_MICROSOFT16 = 166;
	public final static int PARTITIONSUBTYPE_MICROSOFT17 = 177;
	public final static int PARTITIONSUBTYPE_MICROSOFT18 = 179;
	public final static int PARTITIONSUBTYPE_MICROSOFT19 = 180;
	public final static int PARTITIONSUBTYPE_MICROSOFT20 = 182;
	public final static int PARTITIONSUBTYPE_BSDIFS_MICROSOFT = 183;
	public final static int PARTITIONSUBTYPE_BSDISWAP_MICROSOFT = 184;
	public final static int PARTITIONSUBTYPE_MICROSOFT21 = 193;
	public final static int PARTITIONSUBTYPE_MICROSOFT22 = 196;
	public final static int PARTITIONSUBTYPE_MICROSOFT23 = 198;
	public final static int PARTITIONSUBTYPE_SYRINX_HPFSFTDISABLEDMIRROR = 199;
	public final static int PARTITIONSUBTYPE_CP_M86 = 216;
	public final static int PARTITIONSUBTYPE_DIGITALRESEARCHCPM_86_CONCURRENTDOS_OUTRIGGER = 219;
	public final static int PARTITIONSUBTYPE_SPEEDSTOR12_BITFATEXTENDED = 225;
	public final static int PARTITIONSUBTYPE_DOSREAD_ONLY_STORAGEDIMENSIONS = 227;
	public final static int PARTITIONSUBTYPE_SPEEDSTOR16_BITFATEXTENDED = 228;
	public final static int PARTITIONSUBTYPE_MICROSOFT24 = 229;
	public final static int PARTITIONSUBTYPE_MICROSOFT25 = 230;
	public final static int PARTITIONSUBTYPE_INTEL = 239;
	public final static int PARTITIONSUBTYPE_OS_2RAWDATA = 240;
	public final static int PARTITIONSUBTYPE_STORAGEDIMENSIONS = 241;
	public final static int PARTITIONSUBTYPE_DOSSECONDARY = 242;
	public final static int PARTITIONSUBTYPE_MICROSOFT26 = 243;
	public final static int PARTITIONSUBTYPE_SPEEDSTORLARGE_STORAGEDIMENSIONS = 244;
	public final static int PARTITIONSUBTYPE_MICROSOFT27 = 246;
	public final static int PARTITIONSUBTYPE_LANSTEP_SPEEDSTOR_IBMPS_2IML = 254;
	public final static int PARTITIONSUBTYPE_BADBLOCKTABLES = 255;
	public final static int PARTITIONSUBTYPE_UNKNOWN = 65535;
	
	public final static int PARTITIONTYPE_UNKNOWN = 0;
	public final static int PARTITIONTYPE_PRIMARY = 1;
	public final static int PARTITIONTYPE_EXTENDED = 2;
	public final static int PARTITIONTYPE_LOGICAL = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DiskPartition() {

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
	public CIM_DiskPartition(Vector keyProperties){ 
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
	public CIM_DiskPartition(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DiskPartition)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DiskPartition)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DiskPartition)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DiskPartition)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DiskPartition)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DiskPartition)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DiskPartition)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DiskPartition)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DiskPartition)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DiskPartition)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_StorageVolume_CIM_DiskPartitionBasedOnVolumes(CIMClient cimClient,
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
					CIM_StorageVolume.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DiskPartition.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiskPartition.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_DiskPartition.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_DiskPartition.Java_Package_List.setElementAt((String)(CIM_DiskPartition.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_DiskPartition.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageVolume(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_StorageVolume(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageVolume(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_StorageVolume_CIM_DiskPartitionBasedOnVolume_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, 
					CIM_StorageVolume.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_StorageVolume.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnPartitions(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION, 
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
				
					for (int i = 0; clazz == null && i < CIM_DiskPartition.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiskPartition.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_DiskPartition.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_DiskPartition.Java_Package_List.setElementAt((String)(CIM_DiskPartition.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_DiskPartition.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnPartition_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION, 
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

	public ArrayList getAssociated_CIM_PhysicalMedia_CIM_RealizesDiskPartitions(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION, 
					CIM_PhysicalMedia.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DiskPartition.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DiskPartition.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_DiskPartition.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_DiskPartition.Java_Package_List.setElementAt((String)(CIM_DiskPartition.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_DiskPartition.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_PhysicalMedia_CIM_RealizesDiskPartition_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION, 
					CIM_PhysicalMedia.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
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

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute PartitionSubtype
	
	public UnsignedInt16 get_PartitionSubtype() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiskPartition.CIM_PROPERTY_PARTITIONSUBTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiskPartition.CIM_PROPERTY_PARTITIONSUBTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiskPartition.CIM_PROPERTY_PARTITIONSUBTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PartitionSubtype(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiskPartition.CIM_PROPERTY_PARTITIONSUBTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiskPartition.CIM_PROPERTY_PARTITIONSUBTYPE + " could not be found");
    		
		} else if (!CIM_DiskPartitionHelper.isValid_PartitionSubtype(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiskPartition.CIM_PROPERTY_PARTITIONSUBTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiskPartition.CIM_PROPERTY_PARTITIONSUBTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PartitionType
	
	public UnsignedInt16 get_PartitionType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiskPartition.CIM_PROPERTY_PARTITIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiskPartition.CIM_PROPERTY_PARTITIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiskPartition.CIM_PROPERTY_PARTITIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PartitionType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiskPartition.CIM_PROPERTY_PARTITIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiskPartition.CIM_PROPERTY_PARTITIONTYPE + " could not be found");
    		
		} else if (!CIM_DiskPartitionHelper.isValid_PartitionType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiskPartition.CIM_PROPERTY_PARTITIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiskPartition.CIM_PROPERTY_PARTITIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrimaryPartition
	
	public Boolean get_PrimaryPartition() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiskPartition.CIM_PROPERTY_PRIMARYPARTITION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiskPartition.CIM_PROPERTY_PRIMARYPARTITION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiskPartition.CIM_PROPERTY_PRIMARYPARTITION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrimaryPartition(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DiskPartition.CIM_PROPERTY_PRIMARYPARTITION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DiskPartition.CIM_PROPERTY_PRIMARYPARTITION + " could not be found");
    		
		} else if (!CIM_DiskPartitionHelper.isValid_PrimaryPartition(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DiskPartition.CIM_PROPERTY_PRIMARYPARTITION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DiskPartition.CIM_PROPERTY_PRIMARYPARTITION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
