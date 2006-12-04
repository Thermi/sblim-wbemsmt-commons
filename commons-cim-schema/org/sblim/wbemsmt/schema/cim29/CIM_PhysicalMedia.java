/** 
 * CIM_PhysicalMedia.java
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
 * Description: The PhysicalMedia class represents any type of documentation or storage medium, such as tapes, CDROMs, etc. This class is typically used to locate and manage Removable Media (versus Media sealed with the MediaAccessDevice, as a single Package, as is the case with hard disks). However, 'sealed' Media can also be modeled using this class, where the Media would then be associated with the PhysicalPackage using the PackagedComponent relationship.
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



public class CIM_PhysicalMedia extends CIM_PhysicalComponent  {
	
	public final static String CIM_CLASS_NAME = "CIM_PhysicalMedia";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA = "CIM_HomeForMedia";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA = "CIM_MemoryWithMedia";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION = "CIM_PhysicalMediaInLocation";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZEDONSIDE = "CIM_RealizedOnSide";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESAGGREGATEPEXTENT = "CIM_RealizesAggregatePExtent";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION = "CIM_RealizesDiskPartition";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESPEXTENT = "CIM_RealizesPExtent";
	
	
	/**
	*	The number of bytes that can be read from or written to a Media. This property is not applicable to "Hard Copy" (documentation) or cleaner Media. Data compression should not be assumed, as it would increase the value in this property. For tapes, it should be assumed that no filemarks or blank space areas are recorded on the Media.
	*/
	public final static String CIM_PROPERTY_CAPACITY = "Capacity"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the PhysicalMedia is used for cleaning purposes and not data storage.
	*/
	public final static String CIM_PROPERTY_CLEANERMEDIA = "CleanerMedia"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the Media has two recording sides (TRUE) or only a single side (FALSE). Examples of dual sided Media include DVD-ROM and some optical disks. Examples of single sided Media are tapes and CD-ROM.
	*/
	public final static String CIM_PROPERTY_DUALSIDED = "DualSided"; //$NON-NLS-1$
	/**
	*	An array of enumerated integers describing the formats of each of the labels on a PhysicalMedia. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
	*/
	public final static String CIM_PROPERTY_LABELFORMATS = "LabelFormats"; //$NON-NLS-1$
	/**
	*	An array of enumerated integers describing the states of each of the labels on a PhysicalMedia. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
	*/
	public final static String CIM_PROPERTY_LABELSTATES = "LabelStates"; //$NON-NLS-1$
	/**
	*	For removable Media, the maximum number of times that the Media can be mounted before it should be retired. For cleaner Media, this is the maximum number of Drive cleans that can be performed. For nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
	*/
	public final static String CIM_PROPERTY_MAXMOUNTS = "MaxMounts"; //$NON-NLS-1$
	/**
	*	Additional detail related to the MediaType enumeration. For example, if value 3 ("QIC Cartridge") is specified, this property could indicate whether the tape is wide or 1/4 inch, whether it is pre-formatted, whether it is Travan compatible, etc.
	*/
	public final static String CIM_PROPERTY_MEDIADESCRIPTION = "MediaDescription"; //$NON-NLS-1$
	/**
	*	Size of the Media in inches. For example, '3.5' would be entered for a 3.5 inch disk, or '12' would be entered for a 12 inch optical disk. On the other hand, '0.5' would be defined for a 1/2 inch tape.
	*/
	public final static String CIM_PROPERTY_MEDIASIZE = "MediaSize"; //$NON-NLS-1$
	/**
	*	Specifies the type of the PhysicalMedia, as an enumerated integer. The MediaDescription property is used to provide more explicit definition of the Media type, whether it is pre-formatted, compatability features, etc.
	*/
	public final static String CIM_PROPERTY_MEDIATYPE = "MediaType"; //$NON-NLS-1$
	/**
	*	For removable or cleaner Media, the number of times that the Media has been mounted for data transfer or to clean a Drive. For nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
	*/
	public final static String CIM_PROPERTY_MOUNTCOUNT = "MountCount"; //$NON-NLS-1$
	/**
	*	One or more strings on 'labels' on the PhysicalMedia. The format of the labels and their state (readable, unreadable, upside-down) are indicated in the LabelFormats and LabelStates array properties.
	*/
	public final static String CIM_PROPERTY_PHYSICALLABELS = "PhysicalLabels"; //$NON-NLS-1$
	/**
	*	For removable or cleaner Media, the date and time that the Media was last mounted. For nonremovable Media, such as hard disks, this property has no meaning and is not applicable.
	*/
	public final static String CIM_PROPERTY_TIMEOFLASTMOUNT = "TimeOfLastMount"; //$NON-NLS-1$
	/**
	*	For removable or cleaner Media, the total time (in seconds) that the Media has been mounted for data transfer or to clean a Drive. For nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
	*/
	public final static String CIM_PROPERTY_TOTALMOUNTTIME = "TotalMountTime"; //$NON-NLS-1$
	/**
	*	Boolean specifying whether the Media is currently write protected by some kind of physical mechanism, such as a protect tab on a floppy diskette.
	*/
	public final static String CIM_PROPERTY_WRITEPROTECTON = "WriteProtectOn"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPACITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLEANERMEDIA);
		CIM_PropertyNameList.add(CIM_PROPERTY_DUALSIDED);
		CIM_PropertyNameList.add(CIM_PROPERTY_LABELFORMATS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LABELSTATES);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXMOUNTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEDIADESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEDIASIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEDIATYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MOUNTCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PHYSICALLABELS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFLASTMOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALMOUNTTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_WRITEPROTECTON);
				
		for (int i = 0; i < CIM_PhysicalComponent.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPACITY)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLEANERMEDIA)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DUALSIDED)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LABELFORMATS)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LABELSTATES)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXMOUNTS)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEDIADESCRIPTION)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEDIASIZE)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEDIATYPE)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MOUNTCOUNT)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PHYSICALLABELS)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFLASTMOUNT)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALMOUNTTIME)||
				((String)CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WRITEPROTECTON)){
				continue;
			}
			
			CIM_PhysicalMedia.CIM_PropertyNameList.add(CIM_PhysicalComponent.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPACITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLEANERMEDIA, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DUALSIDED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LABELFORMATS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LABELSTATES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXMOUNTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEDIADESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEDIASIZE, new CIMValue(null, new CIMDataType(CIMDataType.REAL32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEDIATYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MOUNTCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PHYSICALLABELS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFLASTMOUNT, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALMOUNTTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WRITEPROTECTON, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_PhysicalComponent.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPACITY)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLEANERMEDIA)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DUALSIDED)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LABELFORMATS)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LABELSTATES)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXMOUNTS)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEDIADESCRIPTION)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEDIASIZE)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEDIATYPE)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MOUNTCOUNT)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PHYSICALLABELS)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFLASTMOUNT)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALMOUNTTIME)||
				((CIMProperty)CIM_PhysicalComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WRITEPROTECTON)){
				continue;
			}
			
			CIM_PhysicalMedia.CIM_PropertyList.add(CIM_PhysicalComponent.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PhysicalComponent.Java_Package_List.size(); i++) {
			if (((String)CIM_PhysicalComponent.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PhysicalComponent.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LABELFORMATS = {"Barcode","Radio Frequency Identification","OCR (Optical Character Recognition)","MICR (Magnetic Ink Character Recognition)","7 Character Barcode","9 Character Barcode"};
	public final static String[] CIM_VALUEMAP_LABELSTATES = {"OK/Readable","Unreadable","Upside Down"};
	public final static String[] CIM_VALUEMAP_MEDIATYPE = {"Unknown","Other","Tape Cartridge","QIC Cartridge","AIT Cartridge","DTF Cartridge","DAT Cartridge","8mm Tape Cartridge","19mm Tape Cartridge","DLT Cartridge","Half-Inch Magnetic Tape Cartridge","Cartridge Disk","JAZ Disk","ZIP Disk","SyQuest Disk","Winchester Removable Disk","CD-ROM","CD-ROM/XA","CD-I","CD Recordable","WORM","Magneto-Optical","DVD","DVD-RW+","DVD-RAM","DVD-ROM","DVD-Video","Divx","Floppy/Diskette","Hard Disk","Memory Card","Hard Copy","Clik Disk","CD-RW","CD-DA","CD+","DVD Recordable","DVD-RW","DVD-Audio","DVD-5","DVD-9","DVD-10","DVD-18","Magneto-Optical Rewriteable","Magneto-Optical Write Once","Magneto-Optical Rewriteable (LIMDOW)","Phase Change Write Once","Phase Change Rewriteable","Phase Change Dual Rewriteable","Ablative Write Once","Near Field Recording","MiniQic","Travan","8mm Metal Particle","8mm Advanced Metal Evaporate","NCTP","LTO Ultrium","LTO Accelis","9 Track Tape","18 Track Tape","36 Track Tape","Magstar 3590","Magstar MP","D2 Tape","Tape - DST Small","Tape - DST Medium","Tape - DST Large"};
	
	
	public final static int LABELFORMATS_BARCODE = 0;
	public final static int LABELFORMATS_RADIOFREQUENCYIDENTIFICATION = 1;
	public final static int LABELFORMATS_OCROPTICALCHARACTERRECOGNITION = 2;
	public final static int LABELFORMATS_MICRMAGNETICINKCHARACTERRECOGNITION = 3;
	public final static int LABELFORMATS_7CHARACTERBARCODE = 4;
	public final static int LABELFORMATS_9CHARACTERBARCODE = 5;
	
	public final static int LABELSTATES_OK_READABLE = 0;
	public final static int LABELSTATES_UNREADABLE = 1;
	public final static int LABELSTATES_UPSIDEDOWN = 2;
	
	public final static int MEDIATYPE_UNKNOWN = 0;
	public final static int MEDIATYPE_OTHER = 1;
	public final static int MEDIATYPE_TAPECARTRIDGE = 2;
	public final static int MEDIATYPE_QICCARTRIDGE = 3;
	public final static int MEDIATYPE_AITCARTRIDGE = 4;
	public final static int MEDIATYPE_DTFCARTRIDGE = 5;
	public final static int MEDIATYPE_DATCARTRIDGE = 6;
	public final static int MEDIATYPE_8MMTAPECARTRIDGE = 7;
	public final static int MEDIATYPE_19MMTAPECARTRIDGE = 8;
	public final static int MEDIATYPE_DLTCARTRIDGE = 9;
	public final static int MEDIATYPE_HALF_INCHMAGNETICTAPECARTRIDGE = 10;
	public final static int MEDIATYPE_CARTRIDGEDISK = 11;
	public final static int MEDIATYPE_JAZDISK = 12;
	public final static int MEDIATYPE_ZIPDISK = 13;
	public final static int MEDIATYPE_SYQUESTDISK = 14;
	public final static int MEDIATYPE_WINCHESTERREMOVABLEDISK = 15;
	public final static int MEDIATYPE_CD_ROM = 16;
	public final static int MEDIATYPE_CD_ROM_XA = 17;
	public final static int MEDIATYPE_CD_I = 18;
	public final static int MEDIATYPE_CDRECORDABLE = 19;
	public final static int MEDIATYPE_WORM = 20;
	public final static int MEDIATYPE_MAGNETO_OPTICAL = 21;
	public final static int MEDIATYPE_DVD = 22;
	public final static int MEDIATYPE_DVD_RW_ = 23;
	public final static int MEDIATYPE_DVD_RAM = 24;
	public final static int MEDIATYPE_DVD_ROM = 25;
	public final static int MEDIATYPE_DVD_VIDEO = 26;
	public final static int MEDIATYPE_DIVX = 27;
	public final static int MEDIATYPE_FLOPPY_DISKETTE = 28;
	public final static int MEDIATYPE_HARDDISK = 29;
	public final static int MEDIATYPE_MEMORYCARD = 30;
	public final static int MEDIATYPE_HARDCOPY = 31;
	public final static int MEDIATYPE_CLIKDISK = 32;
	public final static int MEDIATYPE_CD_RW = 33;
	public final static int MEDIATYPE_CD_DA = 34;
	public final static int MEDIATYPE_CD_ = 35;
	public final static int MEDIATYPE_DVDRECORDABLE = 36;
	public final static int MEDIATYPE_DVD_RW = 37;
	public final static int MEDIATYPE_DVD_AUDIO = 38;
	public final static int MEDIATYPE_DVD_5 = 39;
	public final static int MEDIATYPE_DVD_9 = 40;
	public final static int MEDIATYPE_DVD_10 = 41;
	public final static int MEDIATYPE_DVD_18 = 42;
	public final static int MEDIATYPE_MAGNETO_OPTICALREWRITEABLE = 43;
	public final static int MEDIATYPE_MAGNETO_OPTICALWRITEONCE = 44;
	public final static int MEDIATYPE_MAGNETO_OPTICALREWRITEABLELIMDOW = 45;
	public final static int MEDIATYPE_PHASECHANGEWRITEONCE = 46;
	public final static int MEDIATYPE_PHASECHANGEREWRITEABLE = 47;
	public final static int MEDIATYPE_PHASECHANGEDUALREWRITEABLE = 48;
	public final static int MEDIATYPE_ABLATIVEWRITEONCE = 49;
	public final static int MEDIATYPE_NEARFIELDRECORDING = 50;
	public final static int MEDIATYPE_MINIQIC = 51;
	public final static int MEDIATYPE_TRAVAN = 52;
	public final static int MEDIATYPE_8MMMETALPARTICLE = 53;
	public final static int MEDIATYPE_8MMADVANCEDMETALEVAPORATE = 54;
	public final static int MEDIATYPE_NCTP = 55;
	public final static int MEDIATYPE_LTOULTRIUM = 56;
	public final static int MEDIATYPE_LTOACCELIS = 57;
	public final static int MEDIATYPE_9TRACKTAPE = 58;
	public final static int MEDIATYPE_18TRACKTAPE = 59;
	public final static int MEDIATYPE_36TRACKTAPE = 60;
	public final static int MEDIATYPE_MAGSTAR3590 = 61;
	public final static int MEDIATYPE_MAGSTARMP = 62;
	public final static int MEDIATYPE_D2TAPE = 63;
	public final static int MEDIATYPE_TAPE_DSTSMALL = 64;
	public final static int MEDIATYPE_TAPE_DSTMEDIUM = 65;
	public final static int MEDIATYPE_TAPE_DSTLARGE = 66;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PhysicalMedia() {

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
	public CIM_PhysicalMedia(Vector keyProperties){ 
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
	public CIM_PhysicalMedia(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PhysicalMedia)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PhysicalMedia)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PhysicalMedia)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PhysicalMedia)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PhysicalMedia)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PhysicalMedia)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PhysicalMedia)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PhysicalMedia)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PhysicalMedia)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PhysicalMedia)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_StorageMediaLocation_CIM_HomeForMedias(CIMClient cimClient,
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
					CIM_StorageMediaLocation.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PhysicalMedia.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PhysicalMedia.Java_Package_List.setElementAt((String)(CIM_PhysicalMedia.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PhysicalMedia.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageMediaLocation(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_StorageMediaLocation(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageMediaLocation(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_StorageMediaLocation_CIM_HomeForMedia_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA, 
					CIM_StorageMediaLocation.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_StorageMediaLocation.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PhysicalMemory_CIM_MemoryWithMedias(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA, 
					CIM_PhysicalMemory.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PhysicalMedia.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PhysicalMedia.Java_Package_List.setElementAt((String)(CIM_PhysicalMedia.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PhysicalMedia.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalMemory(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PhysicalMemory(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalMemory(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PhysicalMemory_CIM_MemoryWithMedia_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA, 
					CIM_PhysicalMemory.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PhysicalMemory.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_StorageMediaLocation_CIM_PhysicalMediaInLocations(CIMClient cimClient,
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
					CIM_StorageMediaLocation.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PhysicalMedia.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PhysicalMedia.Java_Package_List.setElementAt((String)(CIM_PhysicalMedia.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PhysicalMedia.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageMediaLocation(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_StorageMediaLocation(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageMediaLocation(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_StorageMediaLocation_CIM_PhysicalMediaInLocation_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION, 
					CIM_StorageMediaLocation.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_StorageMediaLocation.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_StorageExtent_CIM_RealizedOnSides(CIMClient cimClient,
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
					CIM_StorageExtent.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PhysicalMedia.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PhysicalMedia.Java_Package_List.setElementAt((String)(CIM_PhysicalMedia.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PhysicalMedia.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_StorageExtent_CIM_RealizedOnSide_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZEDONSIDE, 
					CIM_StorageExtent.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
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

	public ArrayList getAssociated_CIM_AggregatePExtent_CIM_RealizesAggregatePExtents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESAGGREGATEPEXTENT, 
					CIM_AggregatePExtent.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PhysicalMedia.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PhysicalMedia.Java_Package_List.setElementAt((String)(CIM_PhysicalMedia.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PhysicalMedia.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_AggregatePExtent(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_AggregatePExtent(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_AggregatePExtent(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_AggregatePExtent_CIM_RealizesAggregatePExtent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESAGGREGATEPEXTENT, 
					CIM_AggregatePExtent.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_AggregatePExtent.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_DiskPartition_CIM_RealizesDiskPartitions(CIMClient cimClient,
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
					CIM_DiskPartition.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PhysicalMedia.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PhysicalMedia.Java_Package_List.setElementAt((String)(CIM_PhysicalMedia.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PhysicalMedia.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_DiskPartition_CIM_RealizesDiskPartition_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION, 
					CIM_DiskPartition.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
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

	public ArrayList getAssociated_CIM_PhysicalExtent_CIM_RealizesPExtents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESPEXTENT, 
					CIM_PhysicalExtent.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PhysicalMedia.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PhysicalMedia.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PhysicalMedia.Java_Package_List.setElementAt((String)(CIM_PhysicalMedia.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PhysicalMedia.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalExtent(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PhysicalExtent(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalExtent(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PhysicalExtent_CIM_RealizesPExtent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESPEXTENT, 
					CIM_PhysicalExtent.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PhysicalExtent.CIM_CLASS_NAME)) {
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
	
	// Attribute Capacity
	
	public UnsignedInt64 get_Capacity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_CAPACITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_CAPACITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_CAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Capacity(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_CAPACITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_CAPACITY + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_Capacity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_CAPACITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_CAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CleanerMedia
	
	public Boolean get_CleanerMedia() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_CLEANERMEDIA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_CLEANERMEDIA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_CLEANERMEDIA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CleanerMedia(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_CLEANERMEDIA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_CLEANERMEDIA + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_CleanerMedia(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_CLEANERMEDIA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_CLEANERMEDIA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DualSided
	
	public Boolean get_DualSided() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_DUALSIDED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_DUALSIDED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_DUALSIDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DualSided(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_DUALSIDED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_DUALSIDED + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_DualSided(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_DUALSIDED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_DUALSIDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LabelFormats
	
	public UnsignedInt16[] get_LabelFormats() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_LABELFORMATS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_LABELFORMATS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_LABELFORMATS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_LabelFormats(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_LABELFORMATS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_LABELFORMATS + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_LabelFormats(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_LABELFORMATS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_LABELFORMATS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LabelStates
	
	public UnsignedInt16[] get_LabelStates() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_LABELSTATES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_LABELSTATES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_LABELSTATES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_LabelStates(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_LABELSTATES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_LABELSTATES + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_LabelStates(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_LABELSTATES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_LABELSTATES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxMounts
	
	public UnsignedInt64 get_MaxMounts() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_MAXMOUNTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MAXMOUNTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MAXMOUNTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxMounts(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_MAXMOUNTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MAXMOUNTS + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_MaxMounts(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_MAXMOUNTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MAXMOUNTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MediaDescription
	
	public String get_MediaDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_MEDIADESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIADESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIADESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MediaDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_MEDIADESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIADESCRIPTION + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_MediaDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIADESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIADESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MediaSize
	
	public Float get_MediaSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_MEDIASIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIASIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIASIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Float)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MediaSize(Float newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_MEDIASIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIASIZE + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_MediaSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIASIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIASIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.REAL32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MediaType
	
	public UnsignedInt16 get_MediaType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_MEDIATYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIATYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIATYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MediaType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_MEDIATYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIATYPE + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_MediaType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIATYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MEDIATYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MountCount
	
	public UnsignedInt64 get_MountCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_MOUNTCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MOUNTCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MOUNTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MountCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_MOUNTCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MOUNTCOUNT + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_MountCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_MOUNTCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_MOUNTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PhysicalLabels
	
	public String[] get_PhysicalLabels() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_PHYSICALLABELS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_PHYSICALLABELS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_PHYSICALLABELS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_PhysicalLabels(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_PHYSICALLABELS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_PHYSICALLABELS + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_PhysicalLabels(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_PHYSICALLABELS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_PHYSICALLABELS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfLastMount
	
	public Calendar get_TimeOfLastMount() {

		CIMProperty property = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_TIMEOFLASTMOUNT);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_TIMEOFLASTMOUNT + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_TIMEOFLASTMOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfLastMount(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_TIMEOFLASTMOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_TIMEOFLASTMOUNT + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_TimeOfLastMount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_TIMEOFLASTMOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_TIMEOFLASTMOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute TotalMountTime
	
	public UnsignedInt64 get_TotalMountTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_TOTALMOUNTTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_TOTALMOUNTTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_TOTALMOUNTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalMountTime(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_TOTALMOUNTTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_TOTALMOUNTTIME + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_TotalMountTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_TOTALMOUNTTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_TOTALMOUNTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WriteProtectOn
	
	public Boolean get_WriteProtectOn() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_WRITEPROTECTON);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_WRITEPROTECTON + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_WRITEPROTECTON + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WriteProtectOn(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalMedia.CIM_PROPERTY_WRITEPROTECTON);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_WRITEPROTECTON + " could not be found");
    		
		} else if (!CIM_PhysicalMediaHelper.isValid_WriteProtectOn(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalMedia.CIM_PROPERTY_WRITEPROTECTON);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalMedia.CIM_PROPERTY_WRITEPROTECTON + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
