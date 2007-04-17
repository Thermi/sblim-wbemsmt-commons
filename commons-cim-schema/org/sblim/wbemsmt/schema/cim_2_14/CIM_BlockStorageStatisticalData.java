/** 
 * CIM_BlockStorageStatisticalData.java
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
 * Description:  A subclass of StatisticalData which identifies individual statistics for an
 * element of a block storage system. This class defines the metrics that MAY be
 * kept for managed elements of the system.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt64;


/**
 *  A subclass of StatisticalData which identifies individual statistics for an
 * element of a block storage system. This class defines the metrics that MAY be
 * kept for managed elements of the system.
 */
public class CIM_BlockStorageStatisticalData extends CIM_StatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_BlockStorageStatisticalData"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	Defines the role that the element played for which this statistics record was collected. If the metered element is a system or a component of a system associated to a RegisteredProfile, then that profile may provide a more specialized definition and additional usage information for this property. 
Generally, the ElementTypes defined here have the following meaning in the context of this class: 2, "Computer System": Cumulative statistics for the storage system. In the case of a complex system with multiple component Computer Systems, these are the statistics for the top-level aggregate Computer System. 3, "Front-end Computer System": Statistics for a component computer system that communicate with systems that initiate IO requests. 4, "Peer Computer System": Statistics for a component computer system that communicates with peer storage systems e.g. to provide remote mirroring of a volume. 5, "Back-end Computer System": Statistics for a component computer system that communicates with back-end storage. 6, "Front-end Port": Statistics for a port that communicates with systems that initiate IO requests. 7, "Back-end Port": Statistics for a port that initiates IO requests to storage devices. 8, "Volume": Statistics for an exposable storage extent, such as a StorageVolume or LogicalDisk. 9, "Extent": Statistics for an intermediate storage extent, i.e. an extent that is neither a volume or a disk. 10, "Disk Drive: Statistics for a StorageExtent that is associated to a DiskDrive through the MediaPresent association. 11, "Arbitrary LUs": Statistics that derive from access to Logical Units that are NOT StorageVolumes (e.g., controller commands). 12, "Remote Replica Group": Statistics for control IOs between an array and a remote mirror across a Network. Note that statistics for the actual movement of data to the remote mirror are attributed to the targeted StorageVolume (or LogicalDisk). Note that a particular element could be associated to multiple BlockStorageStatisticalData instances if it had multiple roles. For example, a storage array could contain redundant component computer systems that communicate both with hosts on the front end and disks on the back end. Such a device could have one BlockStorageStatisticalData instance where ElementType=3 and another instance where ElementType=5.
	*/
	public final static String CIM_PROPERTY_ELEMENTTYPE = "ElementType"; //$NON-NLS-1$
	/**
	*	The cumulative elapsed I/O time (number of Clock Tick Intervals) for all I/Os as defined in 'Total I/Os'. I/O response time is added to this counter at the completion of each measured I/O using ClockTickInterval units. This value can be divided by number of IOs to obtain an average response time.
	*/
	public final static String CIM_PROPERTY_IOTIMECOUNTER = "IOTimeCounter"; //$NON-NLS-1$
	/**
	*	The cumulative elapsed idle time using ClockTickInterval units (Cumulative Number of Time Units for all idle time in the array).
	*/
	public final static String CIM_PROPERTY_IDLETIMECOUNTER = "IdleTimeCounter"; //$NON-NLS-1$
	/**
	*	The cumulative count of data read in Kbytes (1024bytes = 1KByte).
	*/
	public final static String CIM_PROPERTY_KBYTESREAD = "KBytesRead"; //$NON-NLS-1$
	/**
	*	The cumulative count of data transferred in Kbytes (1024bytes = 1KByte).
	*/
	public final static String CIM_PROPERTY_KBYTESTRANSFERRED = "KBytesTransferred"; //$NON-NLS-1$
	/**
	*	The cumulative count of data written in Kbytes (1024bytes = 1KByte).
	*/
	public final static String CIM_PROPERTY_KBYTESWRITTEN = "KBytesWritten"; //$NON-NLS-1$
	/**
	*	The cumulative count of all disk maintenance operations (SCSI commands such as: Verify, skip-mask, XOR read, XOR write-read, etc).This is needed to understand the load on the disks that may interfere with normal read and write operations.
	*/
	public final static String CIM_PROPERTY_MAINTOP = "MaintOp"; //$NON-NLS-1$
	/**
	*	The cumulative elapsed disk mainenance time. Maintainance response time is added to this counter at the completion of each measured maintenance operation using ClockTickInterval units.
	*/
	public final static String CIM_PROPERTY_MAINTTIMECOUNTER = "MaintTimeCounter"; //$NON-NLS-1$
	/**
	*	The cumulative elapsed time for all Read I/Os read from cache for all cumulative Read I/Os.
	*/
	public final static String CIM_PROPERTY_READHITIOTIMECOUNTER = "ReadHitIOTimeCounter"; //$NON-NLS-1$
	/**
	*	The cumulative count of all read cache hits (Reads from Cache).
	*/
	public final static String CIM_PROPERTY_READHITIOS = "ReadHitIOs"; //$NON-NLS-1$
	/**
	*	The cumulative elapsed time for all Read I/Os for all cumulative Read I/Os.
	*/
	public final static String CIM_PROPERTY_READIOTIMECOUNTER = "ReadIOTimeCounter"; //$NON-NLS-1$
	/**
	*	The cumulative count of all reads.
	*/
	public final static String CIM_PROPERTY_READIOS = "ReadIOs"; //$NON-NLS-1$
	/**
	*	The cumulative count of I/Os for the object.
	*/
	public final static String CIM_PROPERTY_TOTALIOS = "TotalIOs"; //$NON-NLS-1$
	/**
	*	The cumulative elapsed time using ClockTickInterval units for all Write I/Os written to cache for all cumulative Write I/Os.
	*/
	public final static String CIM_PROPERTY_WRITEHITIOTIMECOUNTER = "WriteHitIOTimeCounter"; //$NON-NLS-1$
	/**
	*	The cumulative count of Write Cache Hits (Writes that went directly to Cache).
	*/
	public final static String CIM_PROPERTY_WRITEHITIOS = "WriteHitIOs"; //$NON-NLS-1$
	/**
	*	The cumulative elapsed time for all Write I/Os for all cumulative Writes.
	*/
	public final static String CIM_PROPERTY_WRITEIOTIMECOUNTER = "WriteIOTimeCounter"; //$NON-NLS-1$
	/**
	*	The cumulative count of all writes.
	*/
	public final static String CIM_PROPERTY_WRITEIOS = "WriteIOs"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ELEMENTTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_IOTIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_IDLETIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_KBYTESREAD);
		CIM_PropertyNameList.add(CIM_PROPERTY_KBYTESTRANSFERRED);
		CIM_PropertyNameList.add(CIM_PROPERTY_KBYTESWRITTEN);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAINTOP);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAINTTIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_READHITIOTIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_READHITIOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_READIOTIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_READIOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALIOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_WRITEHITIOTIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_WRITEHITIOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_WRITEIOTIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_WRITEIOS);
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELEMENTTYPE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IOTIMECOUNTER)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IDLETIMECOUNTER)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_KBYTESREAD)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_KBYTESTRANSFERRED)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_KBYTESWRITTEN)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAINTOP)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAINTTIMECOUNTER)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_READHITIOTIMECOUNTER)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_READHITIOS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_READIOTIMECOUNTER)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_READIOS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALIOS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WRITEHITIOTIMECOUNTER)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WRITEHITIOS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WRITEIOTIMECOUNTER)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WRITEIOS)){
				continue;
			}
			
			CIM_BlockStorageStatisticalData.CIM_PropertyNameList.add(CIM_StatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELEMENTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IOTIMECOUNTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IDLETIMECOUNTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_KBYTESREAD, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_KBYTESTRANSFERRED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_KBYTESWRITTEN, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAINTOP, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAINTTIMECOUNTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_READHITIOTIMECOUNTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_READHITIOS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_READIOTIMECOUNTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_READIOS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALIOS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WRITEHITIOTIMECOUNTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WRITEHITIOS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WRITEIOTIMECOUNTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WRITEIOS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELEMENTTYPE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IOTIMECOUNTER)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IDLETIMECOUNTER)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_KBYTESREAD)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_KBYTESTRANSFERRED)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_KBYTESWRITTEN)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAINTOP)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAINTTIMECOUNTER)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_READHITIOTIMECOUNTER)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_READHITIOS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_READIOTIMECOUNTER)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_READIOS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALIOS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WRITEHITIOTIMECOUNTER)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WRITEHITIOS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WRITEIOTIMECOUNTER)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WRITEIOS)){
				continue;
			}
			
			CIM_BlockStorageStatisticalData.CIM_PropertyList.add(CIM_StatisticalData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_StatisticalData.Java_Package_List.size(); i++) {
			if (((String)CIM_StatisticalData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_StatisticalData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ELEMENTTYPE = {"Computer System","Front-end Computer System","Peer Computer System","Back-end Computer System","Front-end Port","Back-end Port","Volume","Extent","Disk Drive","Arbitrary LUs","Remote Replica Group","DMTF Reserved","Vendor Specific"};
	
	
	public final static String ELEMENTTYPE_COMPUTERSYSTEM = "2";
	public final static String ELEMENTTYPE_FRONT_ENDCOMPUTERSYSTEM = "3";
	public final static String ELEMENTTYPE_PEERCOMPUTERSYSTEM = "4";
	public final static String ELEMENTTYPE_BACK_ENDCOMPUTERSYSTEM = "5";
	public final static String ELEMENTTYPE_FRONT_ENDPORT = "6";
	public final static String ELEMENTTYPE_BACK_ENDPORT = "7";
	public final static String ELEMENTTYPE_VOLUME = "8";
	public final static String ELEMENTTYPE_EXTENT = "9";
	public final static String ELEMENTTYPE_DISKDRIVE = "10";
	public final static String ELEMENTTYPE_ARBITRARYLUS = "11";
	public final static String ELEMENTTYPE_REMOTEREPLICAGROUP = "12";
	public final static String ELEMENTTYPE_DMTFRESERVED = "..";
	public final static String ELEMENTTYPE_VENDORSPECIFIC = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BlockStorageStatisticalData() {

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
	public CIM_BlockStorageStatisticalData(Vector keyProperties){ 
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
	public CIM_BlockStorageStatisticalData(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_ElementType = this.cimInstance.getProperty(CIM_PROPERTY_ELEMENTTYPE);
		
		if (CIMProperty_ElementType == null || CIMProperty_ElementType.getValue().isEmpty() || CIMProperty_ElementType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ELEMENTTYPE, "Required"});
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
	    
	    if (!(object instanceof CIM_BlockStorageStatisticalData)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BlockStorageStatisticalData)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BlockStorageStatisticalData)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BlockStorageStatisticalData)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BlockStorageStatisticalData)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BlockStorageStatisticalData)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BlockStorageStatisticalData)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BlockStorageStatisticalData)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BlockStorageStatisticalData)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BlockStorageStatisticalData)object).cimObjectPath)) {
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
	
	// Attribute ElementType
	
	public UnsignedInt16 get_ElementType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_ELEMENTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_ELEMENTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_ELEMENTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ElementType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_ELEMENTTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_ELEMENTTYPE + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_ElementType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_ELEMENTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_ELEMENTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IOTimeCounter
	
	public UnsignedInt64 get_IOTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_IOTIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_IOTIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_IOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IOTimeCounter(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_IOTIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_IOTIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_IOTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_IOTIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_IOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IdleTimeCounter
	
	public UnsignedInt64 get_IdleTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_IDLETIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_IDLETIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_IDLETIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IdleTimeCounter(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_IDLETIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_IDLETIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_IdleTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_IDLETIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_IDLETIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute KBytesRead
	
	public UnsignedInt64 get_KBytesRead() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESREAD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESREAD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESREAD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_KBytesRead(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESREAD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESREAD + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_KBytesRead(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESREAD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESREAD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute KBytesTransferred
	
	public UnsignedInt64 get_KBytesTransferred() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESTRANSFERRED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESTRANSFERRED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESTRANSFERRED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_KBytesTransferred(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESTRANSFERRED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESTRANSFERRED + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_KBytesTransferred(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESTRANSFERRED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESTRANSFERRED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute KBytesWritten
	
	public UnsignedInt64 get_KBytesWritten() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESWRITTEN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESWRITTEN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESWRITTEN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_KBytesWritten(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESWRITTEN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESWRITTEN + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_KBytesWritten(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESWRITTEN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_KBYTESWRITTEN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaintOp
	
	public UnsignedInt64 get_MaintOp() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTOP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTOP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTOP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaintOp(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTOP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTOP + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_MaintOp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTOP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTOP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaintTimeCounter
	
	public UnsignedInt64 get_MaintTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTTIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTTIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaintTimeCounter(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTTIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTTIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_MaintTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTTIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_MAINTTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReadHitIOTimeCounter
	
	public UnsignedInt64 get_ReadHitIOTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOTIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOTIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReadHitIOTimeCounter(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOTIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOTIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_ReadHitIOTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOTIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReadHitIOs
	
	public UnsignedInt64 get_ReadHitIOs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReadHitIOs(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOS + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_ReadHitIOs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READHITIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReadIOTimeCounter
	
	public UnsignedInt64 get_ReadIOTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOTIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOTIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReadIOTimeCounter(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOTIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOTIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_ReadIOTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOTIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReadIOs
	
	public UnsignedInt64 get_ReadIOs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReadIOs(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOS + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_ReadIOs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_READIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TotalIOs
	
	public UnsignedInt64 get_TotalIOs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_TOTALIOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_TOTALIOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_TOTALIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalIOs(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_TOTALIOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_TOTALIOS + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_TotalIOs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_TOTALIOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_TOTALIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WriteHitIOTimeCounter
	
	public UnsignedInt64 get_WriteHitIOTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOTIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOTIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WriteHitIOTimeCounter(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOTIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOTIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_WriteHitIOTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOTIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WriteHitIOs
	
	public UnsignedInt64 get_WriteHitIOs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WriteHitIOs(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOS + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_WriteHitIOs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEHITIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WriteIOTimeCounter
	
	public UnsignedInt64 get_WriteIOTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOTIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOTIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WriteIOTimeCounter(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOTIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOTIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_WriteIOTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOTIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WriteIOs
	
	public UnsignedInt64 get_WriteIOs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WriteIOs(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOS + " could not be found");
    		
		} else if (!CIM_BlockStorageStatisticalDataHelper.isValid_WriteIOs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStorageStatisticalData.CIM_PROPERTY_WRITEIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
