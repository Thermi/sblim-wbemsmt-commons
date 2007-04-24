/** 
 * CIM_MediaAccessDevice.java
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
 * Description:  A MediaAccessDevice represents the ability to access one or more media and use
 * this media to store and retrieve data.
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



/**
 *  A MediaAccessDevice represents the ability to access one or more media and use
 * this media to store and retrieve data.
 */
public class CIM_MediaAccessDevice extends CIM_LogicalDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_MediaAccessDevice"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT = "CIM_MediaPresent"; //$NON-NLS-1$
	
	
	/**
	*	Capabilities of the MediaAccessDevice. For example, the Device may support "Random Access", removeable media and "Automatic Cleaning". In this case, the values 3, 7 and 9 would be written to the array. 
Several of the enumerated values require some explanation: 1) Value 11, Supports Dual Sided Media, distinguishes a Device that can access both sides of dual sided Media, from a Device that reads only a single side and requires the Media to be flipped; and, 2) Value 12, Predismount Eject Not Required, indicates that Media does not have to be explicitly ejected from the Device before being accessed by a PickerElement.
	*/
	public final static String CIM_PROPERTY_CAPABILITIES = "Capabilities"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations for any of the AccessDevice features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_CAPABILITYDESCRIPTIONS = "CapabilityDescriptions"; //$NON-NLS-1$
	/**
	*	A free form string indicating the algorithm or tool used by the device to support compression. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the device supports compression capabilities or not, "Compressed" to represent that the device supports compression capabilities but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the devices does not support compression capabilities.
	*/
	public final static String CIM_PROPERTY_COMPRESSIONMETHOD = "CompressionMethod"; //$NON-NLS-1$
	/**
	*	Default block size, in bytes, for this Device.
	*/
	public final static String CIM_PROPERTY_DEFAULTBLOCKSIZE = "DefaultBlockSize"; //$NON-NLS-1$
	/**
	*	ErrorMethodology is a free-form string describing the type(s) of error detection and correction supported by this Device.
	*/
	public final static String CIM_PROPERTY_ERRORMETHODOLOGY = "ErrorMethodology"; //$NON-NLS-1$
	/**
	*	The date and time on which the Device was last cleaned.
	*/
	public final static String CIM_PROPERTY_LASTCLEANED = "LastCleaned"; //$NON-NLS-1$
	/**
	*	Time in milliseconds from 'load' to being able to read or write a Media. For example, for DiskDrives, this is the interval between a disk not spinning to the disk reporting that it is ready for read/write (ie, the disk spinning at nominal speeds). For TapeDrives, this is the time from a Media being injected to reporting that it is ready for an application. This is usually at the tape's BOT area.
	*/
	public final static String CIM_PROPERTY_LOADTIME = "LoadTime"; //$NON-NLS-1$
	/**
	*	Time in milliseconds to move from the first location on the Media to the location that is furthest with respect to time. For a DiskDrive, this represents full seek + full rotational delay. For TapeDrives, this represents a search from the beginning of the tape to the most physically distant point. (The end of a tape may be at its most physically distant point, but this is not necessarily true.)
	*/
	public final static String CIM_PROPERTY_MAXACCESSTIME = "MaxAccessTime"; //$NON-NLS-1$
	/**
	*	Maximum block size, in bytes, for media accessed by this Device.
	*/
	public final static String CIM_PROPERTY_MAXBLOCKSIZE = "MaxBlockSize"; //$NON-NLS-1$
	/**
	*	Maximum size, in KBytes, of media supported by this Device. KBytes is interpreted as the number of bytes multiplied by 1000 (NOT the number of bytes multiplied by 1024).
	*/
	public final static String CIM_PROPERTY_MAXMEDIASIZE = "MaxMediaSize"; //$NON-NLS-1$
	/**
	*	An unsigned integer indicating the maximum 'units' that can be used, with respect to the AccessDevice, before the Device should be cleaned. The property, UnitsDescription, defines how 'units' should be interpreted.
	*/
	public final static String CIM_PROPERTY_MAXUNITSBEFORECLEANING = "MaxUnitsBeforeCleaning"; //$NON-NLS-1$
	/**
	*	True indicates that the media is locked in the Device and can not be ejected. For non-removeable Devices, this value should be true.
	*/
	public final static String CIM_PROPERTY_MEDIAISLOCKED = "MediaIsLocked"; //$NON-NLS-1$
	/**
	*	Minimum block size, in bytes, for media accessed by this Device.
	*/
	public final static String CIM_PROPERTY_MINBLOCKSIZE = "MinBlockSize"; //$NON-NLS-1$
	/**
	*	For a MediaAccessDevice that supports removable Media, the number of times that Media have been mounted for data transfer or to clean the Device. For Devices accessing nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
	*/
	public final static String CIM_PROPERTY_MOUNTCOUNT = "MountCount"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the MediaAccessDevice needs cleaning. Whether manual or automatic cleaning is possible is indicated in the Capabilities array property.
	*/
	public final static String CIM_PROPERTY_NEEDSCLEANING = "NeedsCleaning"; //$NON-NLS-1$
	/**
	*	When the MediaAccessDevice supports multiple individual Media, this property defines the maximum number which can be supported or inserted.
	*/
	public final static String CIM_PROPERTY_NUMBEROFMEDIASUPPORTED = "NumberOfMediaSupported"; //$NON-NLS-1$
	/**
	*	An enumeration indicating the operational security defined for the MediaAccessDevice. For example, information that the Device is "Read Only" (value=4) or "Boot Bypass" (value=6) can be described using this property.
	*/
	public final static String CIM_PROPERTY_SECURITY = "Security"; //$NON-NLS-1$
	/**
	*	For a MediaAccessDevice that supports removable Media, the most recent date and time that Media was mounted on the Device. For Devices accessing nonremovable Media, such as hard disks, this property has no meaning and is not applicable.
	*/
	public final static String CIM_PROPERTY_TIMEOFLASTMOUNT = "TimeOfLastMount"; //$NON-NLS-1$
	/**
	*	For a MediaAccessDevice that supports removable Media, the total time (in seconds) that Media have been mounted for data transfer or to clean the Device. For Devices accessing nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
	*/
	public final static String CIM_PROPERTY_TOTALMOUNTTIME = "TotalMountTime"; //$NON-NLS-1$
	/**
	*	The sustained data transfer rate in KB/sec that the Device can read from and write to a Media. This is a sustained, raw data rate. Maximum rates or rates assuming compression should not be reported in this property.
	*/
	public final static String CIM_PROPERTY_UNCOMPRESSEDDATARATE = "UncompressedDataRate"; //$NON-NLS-1$
	/**
	*	Defines 'Units' relative to its use in the property, MaxUnitsBeforeCleaning. This describes the criteria used to determine when the MediaAccessDevice should be cleaned.
	*/
	public final static String CIM_PROPERTY_UNITSDESCRIPTION = "UnitsDescription"; //$NON-NLS-1$
	/**
	*	An unsigned integer indicating the currently used 'units' of the AccessDevice, helpful to describe when the Device may require cleaning. The property, UnitsDescription, defines how 'units' should be interpreted.
	*/
	public final static String CIM_PROPERTY_UNITSUSED = "UnitsUsed"; //$NON-NLS-1$
	/**
	*	Time in milliseconds from being able to read or write a Media to its 'unload'. For example, for DiskDrives, this is the interval between a disk spinning at nominal speeds and a disk not spinning. For TapeDrives, this is the time for a Media to go from its BOT to being fully ejected and accessible to a PickerElement or human operator.
	*/
	public final static String CIM_PROPERTY_UNLOADTIME = "UnloadTime"; //$NON-NLS-1$
	
	
	/**
	*	Method to lock and unlock the media in a removeable Access Device. The method takes one parameter as input - a boolean indicating whether to lock or unlock. TRUE indicates that the media should be locked in the Device, FALSE indicates that the media should be unlocked. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. The set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier on the method.
	*/
	public final static String CIM_METHOD_LOCKMEDIA = "LockMedia";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_COMPRESSIONMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTBLOCKSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORMETHODOLOGY);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTCLEANED);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOADTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXACCESSTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXBLOCKSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXMEDIASIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXUNITSBEFORECLEANING);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEDIAISLOCKED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINBLOCKSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MOUNTCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_NEEDSCLEANING);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFMEDIASUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_SECURITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFLASTMOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALMOUNTTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNCOMPRESSEDDATARATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNITSDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNITSUSED);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNLOADTIME);
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIES)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMPRESSIONMETHOD)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTBLOCKSIZE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORMETHODOLOGY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTCLEANED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOADTIME)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXACCESSTIME)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXBLOCKSIZE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXMEDIASIZE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXUNITSBEFORECLEANING)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEDIAISLOCKED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINBLOCKSIZE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MOUNTCOUNT)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NEEDSCLEANING)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFMEDIASUPPORTED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SECURITY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFLASTMOUNT)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALMOUNTTIME)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNCOMPRESSEDDATARATE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNITSDESCRIPTION)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNITSUSED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNLOADTIME)){
				continue;
			}
			
			CIM_MediaAccessDevice.CIM_PropertyNameList.add(CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITYDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMPRESSIONMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTBLOCKSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORMETHODOLOGY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTCLEANED, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOADTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXACCESSTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXBLOCKSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXMEDIASIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXUNITSBEFORECLEANING, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEDIAISLOCKED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINBLOCKSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MOUNTCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NEEDSCLEANING, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFMEDIASUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SECURITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFLASTMOUNT, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALMOUNTTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNCOMPRESSEDDATARATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNITSDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNITSUSED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNLOADTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIES)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMPRESSIONMETHOD)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTBLOCKSIZE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORMETHODOLOGY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTCLEANED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOADTIME)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXACCESSTIME)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXBLOCKSIZE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXMEDIASIZE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXUNITSBEFORECLEANING)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEDIAISLOCKED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINBLOCKSIZE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MOUNTCOUNT)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NEEDSCLEANING)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFMEDIASUPPORTED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SECURITY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFLASTMOUNT)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALMOUNTTIME)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNCOMPRESSEDDATARATE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNITSDESCRIPTION)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNITSUSED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNLOADTIME)){
				continue;
			}
			
			CIM_MediaAccessDevice.CIM_PropertyList.add(CIM_LogicalDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CAPABILITIES = {"Unknown","Other","Sequential Access","Random Access","Supports Writing","Encryption","Compression","Supports Removeable Media","Manual Cleaning","Automatic Cleaning","SMART Notification","Supports Dual Sided Media","Predismount Eject Not Required"};
	public final static String[] CIM_VALUEMAP_SECURITY = {"Other","Unknown","None","Read Only","Locked Out","Boot Bypass","Boot Bypass and Read Only"};
	
	
	public final static int CAPABILITIES_UNKNOWN = 0;
	public final static int CAPABILITIES_OTHER = 1;
	public final static int CAPABILITIES_SEQUENTIALACCESS = 2;
	public final static int CAPABILITIES_RANDOMACCESS = 3;
	public final static int CAPABILITIES_SUPPORTSWRITING = 4;
	public final static int CAPABILITIES_ENCRYPTION = 5;
	public final static int CAPABILITIES_COMPRESSION = 6;
	public final static int CAPABILITIES_SUPPORTSREMOVEABLEMEDIA = 7;
	public final static int CAPABILITIES_MANUALCLEANING = 8;
	public final static int CAPABILITIES_AUTOMATICCLEANING = 9;
	public final static int CAPABILITIES_SMARTNOTIFICATION = 10;
	public final static int CAPABILITIES_SUPPORTSDUALSIDEDMEDIA = 11;
	public final static int CAPABILITIES_PREDISMOUNTEJECTNOTREQUIRED = 12;
	
	public final static int SECURITY_OTHER = 1;
	public final static int SECURITY_UNKNOWN = 2;
	public final static int SECURITY_NONE = 3;
	public final static int SECURITY_READONLY = 4;
	public final static int SECURITY_LOCKEDOUT = 5;
	public final static int SECURITY_BOOTBYPASS = 6;
	public final static int SECURITY_BOOTBYPASSANDREADONLY = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_MediaAccessDevice() {

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
	public CIM_MediaAccessDevice(Vector keyProperties){ 
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
	public CIM_MediaAccessDevice(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_MediaAccessDevice)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_MediaAccessDevice)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_MediaAccessDevice)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_MediaAccessDevice)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_MediaAccessDevice)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_MediaAccessDevice)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_MediaAccessDevice)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_MediaAccessDevice)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_MediaAccessDevice)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_MediaAccessDevice)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_StorageExtent_CIM_MediaPresents(CIMClient cimClient,
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
					CIM_StorageExtent.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_MediaAccessDevice.Java_Package_List.size(); i++) {
						if (!((String)(CIM_MediaAccessDevice.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_MediaAccessDevice.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_MediaAccessDevice.Java_Package_List.setElementAt((String)(CIM_MediaAccessDevice.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_MediaAccessDevice.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageExtent(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_StorageExtent(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageExtent(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_StorageExtent_CIM_MediaPresent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT, 
					CIM_StorageExtent.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_StorageExtent.CIM_CLASS_NAME)) {
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
	
	// Attribute Capabilities
	
	public UnsignedInt16[] get_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Capabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CapabilityDescriptions
	
	public String[] get_CapabilityDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_CapabilityDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_CapabilityDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CompressionMethod
	
	public String get_CompressionMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_COMPRESSIONMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_COMPRESSIONMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_COMPRESSIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CompressionMethod(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_COMPRESSIONMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_COMPRESSIONMETHOD + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_CompressionMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_COMPRESSIONMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_COMPRESSIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultBlockSize
	
	public UnsignedInt64 get_DefaultBlockSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_DEFAULTBLOCKSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_DEFAULTBLOCKSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_DEFAULTBLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultBlockSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_DEFAULTBLOCKSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_DEFAULTBLOCKSIZE + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_DefaultBlockSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_DEFAULTBLOCKSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_DEFAULTBLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorMethodology
	
	public String get_ErrorMethodology() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_ERRORMETHODOLOGY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_ERRORMETHODOLOGY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_ERRORMETHODOLOGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorMethodology(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_ERRORMETHODOLOGY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_ERRORMETHODOLOGY + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_ErrorMethodology(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_ERRORMETHODOLOGY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_ERRORMETHODOLOGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastCleaned
	
	public Calendar get_LastCleaned() {

		CIMProperty property = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_LASTCLEANED);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_LASTCLEANED + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_LASTCLEANED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_LastCleaned(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_LASTCLEANED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_LASTCLEANED + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_LastCleaned(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_LASTCLEANED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_LASTCLEANED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute LoadTime
	
	public UnsignedInt64 get_LoadTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_LOADTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_LOADTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_LOADTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LoadTime(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_LOADTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_LOADTIME + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_LoadTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_LOADTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_LOADTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxAccessTime
	
	public UnsignedInt64 get_MaxAccessTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MAXACCESSTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXACCESSTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXACCESSTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxAccessTime(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MAXACCESSTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXACCESSTIME + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_MaxAccessTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXACCESSTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXACCESSTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxBlockSize
	
	public UnsignedInt64 get_MaxBlockSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MAXBLOCKSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXBLOCKSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXBLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxBlockSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MAXBLOCKSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXBLOCKSIZE + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_MaxBlockSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXBLOCKSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXBLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxMediaSize
	
	public UnsignedInt64 get_MaxMediaSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MAXMEDIASIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXMEDIASIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXMEDIASIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxMediaSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MAXMEDIASIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXMEDIASIZE + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_MaxMediaSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXMEDIASIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXMEDIASIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxUnitsBeforeCleaning
	
	public UnsignedInt64 get_MaxUnitsBeforeCleaning() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MAXUNITSBEFORECLEANING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXUNITSBEFORECLEANING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXUNITSBEFORECLEANING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxUnitsBeforeCleaning(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MAXUNITSBEFORECLEANING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXUNITSBEFORECLEANING + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_MaxUnitsBeforeCleaning(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXUNITSBEFORECLEANING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MAXUNITSBEFORECLEANING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MediaIsLocked
	
	public Boolean get_MediaIsLocked() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MEDIAISLOCKED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MEDIAISLOCKED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MEDIAISLOCKED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MediaIsLocked(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MEDIAISLOCKED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MEDIAISLOCKED + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_MediaIsLocked(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_MEDIAISLOCKED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MEDIAISLOCKED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinBlockSize
	
	public UnsignedInt64 get_MinBlockSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MINBLOCKSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MINBLOCKSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MINBLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinBlockSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MINBLOCKSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MINBLOCKSIZE + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_MinBlockSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_MINBLOCKSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MINBLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MountCount
	
	public UnsignedInt64 get_MountCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MOUNTCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MOUNTCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MOUNTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MountCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_MOUNTCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MOUNTCOUNT + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_MountCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_MOUNTCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_MOUNTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NeedsCleaning
	
	public Boolean get_NeedsCleaning() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_NEEDSCLEANING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_NEEDSCLEANING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_NEEDSCLEANING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NeedsCleaning(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_NEEDSCLEANING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_NEEDSCLEANING + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_NeedsCleaning(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_NEEDSCLEANING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_NEEDSCLEANING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfMediaSupported
	
	public UnsignedInt32 get_NumberOfMediaSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_NUMBEROFMEDIASUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_NUMBEROFMEDIASUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_NUMBEROFMEDIASUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfMediaSupported(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_NUMBEROFMEDIASUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_NUMBEROFMEDIASUPPORTED + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_NumberOfMediaSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_NUMBEROFMEDIASUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_NUMBEROFMEDIASUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Security
	
	public UnsignedInt16 get_Security() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_SECURITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_SECURITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_SECURITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Security(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_SECURITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_SECURITY + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_Security(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_SECURITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_SECURITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfLastMount
	
	public Calendar get_TimeOfLastMount() {

		CIMProperty property = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_TIMEOFLASTMOUNT);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_TIMEOFLASTMOUNT + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_TIMEOFLASTMOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfLastMount(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_TIMEOFLASTMOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_TIMEOFLASTMOUNT + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_TimeOfLastMount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_TIMEOFLASTMOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_TIMEOFLASTMOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute TotalMountTime
	
	public UnsignedInt64 get_TotalMountTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_TOTALMOUNTTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_TOTALMOUNTTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_TOTALMOUNTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalMountTime(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_TOTALMOUNTTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_TOTALMOUNTTIME + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_TotalMountTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_TOTALMOUNTTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_TOTALMOUNTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UncompressedDataRate
	
	public UnsignedInt32 get_UncompressedDataRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_UNCOMPRESSEDDATARATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNCOMPRESSEDDATARATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNCOMPRESSEDDATARATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UncompressedDataRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_UNCOMPRESSEDDATARATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNCOMPRESSEDDATARATE + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_UncompressedDataRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNCOMPRESSEDDATARATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNCOMPRESSEDDATARATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnitsDescription
	
	public String get_UnitsDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_UNITSDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNITSDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNITSDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnitsDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_UNITSDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNITSDESCRIPTION + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_UnitsDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNITSDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNITSDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnitsUsed
	
	public UnsignedInt64 get_UnitsUsed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_UNITSUSED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNITSUSED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNITSUSED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnitsUsed(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_UNITSUSED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNITSUSED + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_UnitsUsed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNITSUSED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNITSUSED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnloadTime
	
	public UnsignedInt64 get_UnloadTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_UNLOADTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNLOADTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNLOADTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnloadTime(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessDevice.CIM_PROPERTY_UNLOADTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNLOADTIME + " could not be found");
    		
		} else if (!CIM_MediaAccessDeviceHelper.isValid_UnloadTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNLOADTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessDevice.CIM_PROPERTY_UNLOADTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_lockMedia(CIMClient cimClient, Boolean Lock) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_MediaAccessDevice.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Lock = new CIMValue(Lock, new CIMDataType(CIMDataType.BOOLEAN));
		
	  	inParameter.add(new CIMArgument("Lock", cimValue_Lock));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_LOCKMEDIA,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_MediaAccessDevice.CIM_METHOD_LOCKMEDIA + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_MediaAccessDevice.CIM_METHOD_LOCKMEDIA + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_MediaAccessDevice.CIM_METHOD_LOCKMEDIA + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
