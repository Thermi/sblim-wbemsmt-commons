/** 
 * CIM_StorageMediaLocation.java
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
 * Description: StorageMediaLocation is a PackageLocation where PhysicalMedia may be placed. This class is typically used in the context of a StorageLibrary. Examples of StorageMediaLocations are Media AccessDevices, InterLibraryPorts or 'slots' in a Library's panel.
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



public class CIM_StorageMediaLocation extends CIM_PackageLocation  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageMediaLocation";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DEVICESERVICESLOCATION = "CIM_DeviceServicesLocation";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA = "CIM_HomeForMedia";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION = "CIM_PhysicalMediaInLocation";
	
	
	/**
	*	The type of Location. For example, whether this is an individual Media "Slot" (value=2), a MediaAccessDevice (value=4) or a "Magazine" (value=3) is indicated in this property.
	*/
	public final static String CIM_PROPERTY_LOCATIONTYPE = "LocationType"; //$NON-NLS-1$
	/**
	*	A StorageMediaLocation may hold more than one PhysicalMedia - for example, a Magazine. This property indicates the Physical Media capacity of the Location.
	*/
	public final static String CIM_PROPERTY_MEDIACAPACITY = "MediaCapacity"; //$NON-NLS-1$
	/**
	*	The sizes (in inches) of the particular MediaTypes that may be placed in the Location. Note, each entry of this array is related to the entry in the MediaTypesSupported array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_MEDIASIZESSUPPORTED = "MediaSizesSupported"; //$NON-NLS-1$
	/**
	*	Certain StorageMediaLocations may only be able to accept a limited set of PhysicalMedia MediaTypes. This property defines an array containing the types of Media that are acceptable for placement in the Location. Additional information and description of the contained MediaTypes can be provided using the TypesDescription array. Also, size data (for example, DVD disc diameter) can be specified using the MediaSizesSupported array. 

Values defined here correspond to those in the CIM_Physical Media.MediaType property. This allows quick comparisons using value equivalence calculations. It is understood that there is no external physical difference between (for example) DVD- Video and DVD-RAM. But, equivalent values in both the Physical Media and StorageMediaLocation enumerations allows for one for one comparisons with no additional processing logic (i.e., the following is not required ... if "DVD-Video" then value="DVD").
	*/
	public final static String CIM_PROPERTY_MEDIATYPESSUPPORTED = "MediaTypesSupported"; //$NON-NLS-1$
	/**
	*	This property provides additional detail related to the entries in the MediaTypesSupported array. This is especially critical when the MediaTypesSupported value is 1 ("Other"). Note, each entry of this array is related to the entry in MediaTypesSupported that is located at the same index.
	*/
	public final static String CIM_PROPERTY_TYPEDESCRIPTIONS = "TypeDescriptions"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCATIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEDIACAPACITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEDIASIZESSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEDIATYPESSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_TYPEDESCRIPTIONS);
				
		for (int i = 0; i < CIM_PackageLocation.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PackageLocation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCATIONTYPE)||
				((String)CIM_PackageLocation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEDIACAPACITY)||
				((String)CIM_PackageLocation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEDIASIZESSUPPORTED)||
				((String)CIM_PackageLocation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEDIATYPESSUPPORTED)||
				((String)CIM_PackageLocation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TYPEDESCRIPTIONS)){
				continue;
			}
			
			CIM_StorageMediaLocation.CIM_PropertyNameList.add(CIM_PackageLocation.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCATIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEDIACAPACITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEDIASIZESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.REAL32_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEDIATYPESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TYPEDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
				
		for (int i = 0; i < CIM_PackageLocation.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PackageLocation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCATIONTYPE)||
				((CIMProperty)CIM_PackageLocation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEDIACAPACITY)||
				((CIMProperty)CIM_PackageLocation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEDIASIZESSUPPORTED)||
				((CIMProperty)CIM_PackageLocation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEDIATYPESSUPPORTED)||
				((CIMProperty)CIM_PackageLocation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TYPEDESCRIPTIONS)){
				continue;
			}
			
			CIM_StorageMediaLocation.CIM_PropertyList.add(CIM_PackageLocation.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PackageLocation.Java_Package_List.size(); i++) {
			if (((String)CIM_PackageLocation.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PackageLocation.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LOCATIONTYPE = {"Unknown","Other","Slot","Magazine","MediaAccessDevice","InterLibrary Port","Limited Access Port","Door","Shelf","Vault"};
	public final static String[] CIM_VALUEMAP_MEDIATYPESSUPPORTED = {"Unknown","Other","Tape Cartridge","QIC Cartridge","AIT Cartridge","DTF Cartridge","DAT Cartridge","8mm Tape Cartridge","19mm Tape Cartridge","DLT Cartridge","Half-Inch Magnetic Tape Cartridge","Cartridge Disk","JAZ Disk","ZIP Disk","SyQuest Disk","Winchester Removable Disk","CD-ROM","CD-ROM/XA","CD-I","CD Recordable","WORM","Magneto-Optical","DVD","DVD-RW+","DVD-RAM","DVD-ROM","DVD-Video","Divx","Floppy/Diskette","Hard Disk","Memory Card","Hard Copy","Clik Disk","CD-RW","CD-DA","CD+","DVD Recordable","DVD-RW","DVD-Audio","DVD-5","DVD-9","DVD-10","DVD-18","Magneto-Optical Rewriteable","Magneto-Optical Write Once","Magneto-Optical Rewriteable (LIMDOW)","Phase Change Write Once","Phase Change Rewriteable","Phase Change Dual Rewriteable","Ablative Write Once","Near Field Recording","MiniQic","Travan","8mm Metal Particle","8mm Advanced Metal Evaporate","NCTP","LTO Ultrium","LTO Accelis","9 Track Tape","18 Track Tape","36 Track Tape","Magstar 3590","Magstar MP","D2 Tape","Tape - DST Small","Tape - DST Medium","Tape - DST Large"};
	
	
	public final static int LOCATIONTYPE_UNKNOWN = 0;
	public final static int LOCATIONTYPE_OTHER = 1;
	public final static int LOCATIONTYPE_SLOT = 2;
	public final static int LOCATIONTYPE_MAGAZINE = 3;
	public final static int LOCATIONTYPE_MEDIAACCESSDEVICE = 4;
	public final static int LOCATIONTYPE_INTERLIBRARYPORT = 5;
	public final static int LOCATIONTYPE_LIMITEDACCESSPORT = 6;
	public final static int LOCATIONTYPE_DOOR = 7;
	public final static int LOCATIONTYPE_SHELF = 8;
	public final static int LOCATIONTYPE_VAULT = 9;
	
	public final static int MEDIATYPESSUPPORTED_UNKNOWN = 0;
	public final static int MEDIATYPESSUPPORTED_OTHER = 1;
	public final static int MEDIATYPESSUPPORTED_TAPECARTRIDGE = 2;
	public final static int MEDIATYPESSUPPORTED_QICCARTRIDGE = 3;
	public final static int MEDIATYPESSUPPORTED_AITCARTRIDGE = 4;
	public final static int MEDIATYPESSUPPORTED_DTFCARTRIDGE = 5;
	public final static int MEDIATYPESSUPPORTED_DATCARTRIDGE = 6;
	public final static int MEDIATYPESSUPPORTED_8MMTAPECARTRIDGE = 7;
	public final static int MEDIATYPESSUPPORTED_19MMTAPECARTRIDGE = 8;
	public final static int MEDIATYPESSUPPORTED_DLTCARTRIDGE = 9;
	public final static int MEDIATYPESSUPPORTED_HALF_INCHMAGNETICTAPECARTRIDGE = 10;
	public final static int MEDIATYPESSUPPORTED_CARTRIDGEDISK = 11;
	public final static int MEDIATYPESSUPPORTED_JAZDISK = 12;
	public final static int MEDIATYPESSUPPORTED_ZIPDISK = 13;
	public final static int MEDIATYPESSUPPORTED_SYQUESTDISK = 14;
	public final static int MEDIATYPESSUPPORTED_WINCHESTERREMOVABLEDISK = 15;
	public final static int MEDIATYPESSUPPORTED_CD_ROM = 16;
	public final static int MEDIATYPESSUPPORTED_CD_ROM_XA = 17;
	public final static int MEDIATYPESSUPPORTED_CD_I = 18;
	public final static int MEDIATYPESSUPPORTED_CDRECORDABLE = 19;
	public final static int MEDIATYPESSUPPORTED_WORM = 20;
	public final static int MEDIATYPESSUPPORTED_MAGNETO_OPTICAL = 21;
	public final static int MEDIATYPESSUPPORTED_DVD = 22;
	public final static int MEDIATYPESSUPPORTED_DVD_RW_ = 23;
	public final static int MEDIATYPESSUPPORTED_DVD_RAM = 24;
	public final static int MEDIATYPESSUPPORTED_DVD_ROM = 25;
	public final static int MEDIATYPESSUPPORTED_DVD_VIDEO = 26;
	public final static int MEDIATYPESSUPPORTED_DIVX = 27;
	public final static int MEDIATYPESSUPPORTED_FLOPPY_DISKETTE = 28;
	public final static int MEDIATYPESSUPPORTED_HARDDISK = 29;
	public final static int MEDIATYPESSUPPORTED_MEMORYCARD = 30;
	public final static int MEDIATYPESSUPPORTED_HARDCOPY = 31;
	public final static int MEDIATYPESSUPPORTED_CLIKDISK = 32;
	public final static int MEDIATYPESSUPPORTED_CD_RW = 33;
	public final static int MEDIATYPESSUPPORTED_CD_DA = 34;
	public final static int MEDIATYPESSUPPORTED_CD_ = 35;
	public final static int MEDIATYPESSUPPORTED_DVDRECORDABLE = 36;
	public final static int MEDIATYPESSUPPORTED_DVD_RW = 37;
	public final static int MEDIATYPESSUPPORTED_DVD_AUDIO = 38;
	public final static int MEDIATYPESSUPPORTED_DVD_5 = 39;
	public final static int MEDIATYPESSUPPORTED_DVD_9 = 40;
	public final static int MEDIATYPESSUPPORTED_DVD_10 = 41;
	public final static int MEDIATYPESSUPPORTED_DVD_18 = 42;
	public final static int MEDIATYPESSUPPORTED_MAGNETO_OPTICALREWRITEABLE = 43;
	public final static int MEDIATYPESSUPPORTED_MAGNETO_OPTICALWRITEONCE = 44;
	public final static int MEDIATYPESSUPPORTED_MAGNETO_OPTICALREWRITEABLELIMDOW = 45;
	public final static int MEDIATYPESSUPPORTED_PHASECHANGEWRITEONCE = 46;
	public final static int MEDIATYPESSUPPORTED_PHASECHANGEREWRITEABLE = 47;
	public final static int MEDIATYPESSUPPORTED_PHASECHANGEDUALREWRITEABLE = 48;
	public final static int MEDIATYPESSUPPORTED_ABLATIVEWRITEONCE = 49;
	public final static int MEDIATYPESSUPPORTED_NEARFIELDRECORDING = 50;
	public final static int MEDIATYPESSUPPORTED_MINIQIC = 51;
	public final static int MEDIATYPESSUPPORTED_TRAVAN = 52;
	public final static int MEDIATYPESSUPPORTED_8MMMETALPARTICLE = 53;
	public final static int MEDIATYPESSUPPORTED_8MMADVANCEDMETALEVAPORATE = 54;
	public final static int MEDIATYPESSUPPORTED_NCTP = 55;
	public final static int MEDIATYPESSUPPORTED_LTOULTRIUM = 56;
	public final static int MEDIATYPESSUPPORTED_LTOACCELIS = 57;
	public final static int MEDIATYPESSUPPORTED_9TRACKTAPE = 58;
	public final static int MEDIATYPESSUPPORTED_18TRACKTAPE = 59;
	public final static int MEDIATYPESSUPPORTED_36TRACKTAPE = 60;
	public final static int MEDIATYPESSUPPORTED_MAGSTAR3590 = 61;
	public final static int MEDIATYPESSUPPORTED_MAGSTARMP = 62;
	public final static int MEDIATYPESSUPPORTED_D2TAPE = 63;
	public final static int MEDIATYPESSUPPORTED_TAPE_DSTSMALL = 64;
	public final static int MEDIATYPESSUPPORTED_TAPE_DSTMEDIUM = 65;
	public final static int MEDIATYPESSUPPORTED_TAPE_DSTLARGE = 66;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageMediaLocation() {

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
	public CIM_StorageMediaLocation(Vector keyProperties){ 
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
	public CIM_StorageMediaLocation(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageMediaLocation)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageMediaLocation)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageMediaLocation)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageMediaLocation)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageMediaLocation)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageMediaLocation)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageMediaLocation)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageMediaLocation)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageMediaLocation)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageMediaLocation)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_MediaTransferDevice_CIM_DeviceServicesLocations(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DEVICESERVICESLOCATION, 
					CIM_MediaTransferDevice.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageMediaLocation.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageMediaLocation.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageMediaLocation.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageMediaLocation.Java_Package_List.setElementAt((String)(CIM_StorageMediaLocation.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageMediaLocation.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_MediaTransferDevice(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_MediaTransferDevice(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_MediaTransferDevice(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_MediaTransferDevice_CIM_DeviceServicesLocation_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DEVICESERVICESLOCATION, 
					CIM_MediaTransferDevice.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_MediaTransferDevice.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PhysicalMedia_CIM_HomeForMedias(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA, 
					CIM_PhysicalMedia.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageMediaLocation.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageMediaLocation.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageMediaLocation.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageMediaLocation.Java_Package_List.setElementAt((String)(CIM_StorageMediaLocation.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageMediaLocation.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_PhysicalMedia_CIM_HomeForMedia_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA, 
					CIM_PhysicalMedia.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
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

	public ArrayList getAssociated_CIM_PhysicalMedia_CIM_PhysicalMediaInLocations(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION, 
					CIM_PhysicalMedia.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageMediaLocation.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageMediaLocation.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageMediaLocation.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageMediaLocation.Java_Package_List.setElementAt((String)(CIM_StorageMediaLocation.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageMediaLocation.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_PhysicalMedia_CIM_PhysicalMediaInLocation_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION, 
					CIM_PhysicalMedia.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
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
	
	// Attribute LocationType
	
	public UnsignedInt16 get_LocationType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageMediaLocation.CIM_PROPERTY_LOCATIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_LOCATIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_LOCATIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocationType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageMediaLocation.CIM_PROPERTY_LOCATIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_LOCATIONTYPE + " could not be found");
    		
		} else if (!CIM_StorageMediaLocationHelper.isValid_LocationType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageMediaLocation.CIM_PROPERTY_LOCATIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_LOCATIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MediaCapacity
	
	public UnsignedInt32 get_MediaCapacity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageMediaLocation.CIM_PROPERTY_MEDIACAPACITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIACAPACITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIACAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MediaCapacity(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageMediaLocation.CIM_PROPERTY_MEDIACAPACITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIACAPACITY + " could not be found");
    		
		} else if (!CIM_StorageMediaLocationHelper.isValid_MediaCapacity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIACAPACITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIACAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MediaSizesSupported
	
	public Float[] get_MediaSizesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageMediaLocation.CIM_PROPERTY_MEDIASIZESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIASIZESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL32_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIASIZESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL32_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		Float[] resultArray = new Float[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (Float)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_MediaSizesSupported(Float[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageMediaLocation.CIM_PROPERTY_MEDIASIZESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIASIZESSUPPORTED + " could not be found");
    		
		} else if (!CIM_StorageMediaLocationHelper.isValid_MediaSizesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIASIZESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL32_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIASIZESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL32_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.REAL32_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MediaTypesSupported
	
	public UnsignedInt16[] get_MediaTypesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageMediaLocation.CIM_PROPERTY_MEDIATYPESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIATYPESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIATYPESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_MediaTypesSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageMediaLocation.CIM_PROPERTY_MEDIATYPESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIATYPESSUPPORTED + " could not be found");
    		
		} else if (!CIM_StorageMediaLocationHelper.isValid_MediaTypesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIATYPESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_MEDIATYPESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TypeDescriptions
	
	public String[] get_TypeDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageMediaLocation.CIM_PROPERTY_TYPEDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_TYPEDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_TYPEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_TypeDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageMediaLocation.CIM_PROPERTY_TYPEDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_TYPEDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_StorageMediaLocationHelper.isValid_TypeDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageMediaLocation.CIM_PROPERTY_TYPEDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageMediaLocation.CIM_PROPERTY_TYPEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
