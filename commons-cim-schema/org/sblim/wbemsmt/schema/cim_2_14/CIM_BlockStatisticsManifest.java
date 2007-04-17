/** 
 * CIM_BlockStatisticsManifest.java
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
 * Description:  Instances of this class define a list of supported or desired properties of
 * BlockStatisticalData instances. In the case where a BlockStatisticsManifest
 * instance is a member of a BlockStatisticsManifestCollection used in a
 * BlockStatisticsService.GetStatisticsCollection request, for each of the
 * boolean "include" properties set to true in that BlockStatisticsManifest, the
 * corresponding BlockStatisticalData property will be included, if available,
 * in the statistics returned for BlockStatisticalData instances whose
 * ElementType matches the ElementType of the BlockStatisticsManifest.
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


/**
 *  Instances of this class define a list of supported or desired properties of
 * BlockStatisticalData instances. In the case where a BlockStatisticsManifest
 * instance is a member of a BlockStatisticsManifestCollection used in a
 * BlockStatisticsService.GetStatisticsCollection request, for each of the
 * boolean "include" properties set to true in that BlockStatisticsManifest, the
 * corresponding BlockStatisticalData property will be included, if available,
 * in the statistics returned for BlockStatisticalData instances whose
 * ElementType matches the ElementType of the BlockStatisticsManifest.
 */
public class CIM_BlockStatisticsManifest extends CIM_ManagedElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_BlockStatisticsManifest"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	Determines the type of elements that this BlockStatisticsManifest can be applied to (e.g. during a GetStatisticsCollection request). This is used when the same set of statistical metrics is calculated for several types of devices. In this way, a single BlockStatisticsManifest instance can be used to filter all the StatsiticalData instances that contain metrics for the same type of element in a StatisticsCollection. If used, a subclass should override this property to specify the element types supported by that class, preferably through ValueMap and Values qualifiers to allow clients to programmatically retrieve those supported types.
	*/
	public final static String CIM_PROPERTY_ELEMENTTYPE = "ElementType"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative elapsed I/O time (number of Clock Tick Intervals) for all I/Os for that element as defined in 'Total I/Os'.
	*/
	public final static String CIM_PROPERTY_INCLUDEIOTIMECOUNTER = "IncludeIOTimeCounter"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative elapsed idle time for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEIDLETIMECOUNTER = "IncludeIdleTimeCounter"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative count of data read in Kbytes for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEKBYTESREAD = "IncludeKBytesRead"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative count of data transferred in Kbytes for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEKBYTESTRANSFERRED = "IncludeKBytesTransferred"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative count of data written in Kbytes for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEKBYTESWRITTEN = "IncludeKBytesWritten"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative count of all maintenance operations for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEMAINTOP = "IncludeMaintOp"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative elapsed maintenance time for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEMAINTTIMECOUNTER = "IncludeMaintTimeCounter"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative elapsed time for all Read I/Os read from cache for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEREADHITIOTIMECOUNTER = "IncludeReadHitIOTimeCounter"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative count of all read cache hits (Reads from Cache) for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEREADHITIOS = "IncludeReadHitIOs"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative elapsed time for all cumulative Read I/Os for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEREADIOTIMECOUNTER = "IncludeReadIOTimeCounter"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative count of all reads for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEREADIOS = "IncludeReadIOs"; //$NON-NLS-1$
	/**
	*	Indicates whether or not the Statistics property of StatisticsService.GetStatisticsCollection method will include the time at time when statistics for this BlockStatisticsManifest were first captured.
	*/
	public final static String CIM_PROPERTY_INCLUDESTARTSTATISTICTIME = "IncludeStartStatisticTime"; //$NON-NLS-1$
	/**
	*	Indicates whether or not the Statistics property of StatisticsService.GetStatisticsCollection method will include the time when statistics for this BlockStatisticsManifest were last captured.
	*/
	public final static String CIM_PROPERTY_INCLUDESTATISTICTIME = "IncludeStatisticTime"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative count of I/Os for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDETOTALIOS = "IncludeTotalIOs"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative elapsed time for all Write I/Os written to cache for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEWRITEHITIOTIMECOUNTER = "IncludeWriteHitIOTimeCounter"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative count of Write Cache Hits (Writes that went directly to Cache) for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEWRITEHITIOS = "IncludeWriteHitIOs"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative elapsed time for all Write I/Os for that element.
	*/
	public final static String CIM_PROPERTY_INCLUDEWRITEIOTIMECOUNTER = "IncludeWriteIOTimeCounter"; //$NON-NLS-1$
	/**
	*	Whether to include in a filter for a metered element the cumulative count of all writes for tat element.
	*/
	public final static String CIM_PROPERTY_INCLUDEWRITEIOS = "IncludeWriteIOs"; //$NON-NLS-1$
	/**
	*	Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following "preferred" algorithm: 
<OrgID>:<LocalID> 
Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
<LocalID> is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above "preferred" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. 
For DMTF-defined instances, the "preferred" algorithm must be used with the <OrgID> set to CIM.
	*/
	public final static String CIM_PROPERTY_INSTANCEID = "InstanceID"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ELEMENTTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEIOTIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEIDLETIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEKBYTESREAD);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEKBYTESTRANSFERRED);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEKBYTESWRITTEN);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEMAINTOP);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEMAINTTIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEREADHITIOTIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEREADHITIOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEREADIOTIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEREADIOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDESTARTSTATISTICTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDESTATISTICTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDETOTALIOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEWRITEHITIOTIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEWRITEHITIOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEWRITEIOTIMECOUNTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_INCLUDEWRITEIOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INSTANCEID);
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELEMENTTYPE)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEIOTIMECOUNTER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEIDLETIMECOUNTER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEKBYTESREAD)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEKBYTESTRANSFERRED)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEKBYTESWRITTEN)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEMAINTOP)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEMAINTTIMECOUNTER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEREADHITIOTIMECOUNTER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEREADHITIOS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEREADIOTIMECOUNTER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEREADIOS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDESTARTSTATISTICTIME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDESTATISTICTIME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDETOTALIOS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEWRITEHITIOTIMECOUNTER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEWRITEHITIOS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEWRITEIOTIMECOUNTER)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCLUDEWRITEIOS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INSTANCEID)){
				continue;
			}
			
			CIM_BlockStatisticsManifest.CIM_PropertyNameList.add(CIM_ManagedElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELEMENTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEIOTIMECOUNTER, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEIDLETIMECOUNTER, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEKBYTESREAD, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEKBYTESTRANSFERRED, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEKBYTESWRITTEN, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEMAINTOP, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEMAINTTIMECOUNTER, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEREADHITIOTIMECOUNTER, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEREADHITIOS, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEREADIOTIMECOUNTER, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEREADIOS, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDESTARTSTATISTICTIME, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDESTATISTICTIME, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDETOTALIOS, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEWRITEHITIOTIMECOUNTER, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEWRITEHITIOS, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEWRITEIOTIMECOUNTER, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCLUDEWRITEIOS, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INSTANCEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELEMENTTYPE)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEIOTIMECOUNTER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEIDLETIMECOUNTER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEKBYTESREAD)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEKBYTESTRANSFERRED)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEKBYTESWRITTEN)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEMAINTOP)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEMAINTTIMECOUNTER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEREADHITIOTIMECOUNTER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEREADHITIOS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEREADIOTIMECOUNTER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEREADIOS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDESTARTSTATISTICTIME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDESTATISTICTIME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDETOTALIOS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEWRITEHITIOTIMECOUNTER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEWRITEHITIOS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEWRITEIOTIMECOUNTER)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCLUDEWRITEIOS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INSTANCEID)){
				continue;
			}
			
			CIM_BlockStatisticsManifest.CIM_PropertyList.add(CIM_ManagedElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ManagedElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ManagedElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ManagedElement.Java_Package_List.elementAt(i));
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
	public CIM_BlockStatisticsManifest() {

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
	public CIM_BlockStatisticsManifest(Vector keyProperties){ 
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
	public CIM_BlockStatisticsManifest(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_BlockStatisticsManifest)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BlockStatisticsManifest)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BlockStatisticsManifest)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BlockStatisticsManifest)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BlockStatisticsManifest)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BlockStatisticsManifest)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BlockStatisticsManifest)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BlockStatisticsManifest)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BlockStatisticsManifest)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BlockStatisticsManifest)object).cimObjectPath)) {
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_ELEMENTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_ELEMENTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_ELEMENTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ElementType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_ELEMENTTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_ELEMENTTYPE + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_ElementType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_ELEMENTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_ELEMENTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeIOTimeCounter
	
	public Boolean get_IncludeIOTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIOTIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIOTIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeIOTimeCounter(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIOTIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIOTIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeIOTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIOTIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeIdleTimeCounter
	
	public Boolean get_IncludeIdleTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIDLETIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIDLETIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIDLETIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeIdleTimeCounter(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIDLETIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIDLETIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeIdleTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIDLETIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEIDLETIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeKBytesRead
	
	public Boolean get_IncludeKBytesRead() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESREAD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESREAD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESREAD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeKBytesRead(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESREAD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESREAD + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeKBytesRead(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESREAD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESREAD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeKBytesTransferred
	
	public Boolean get_IncludeKBytesTransferred() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESTRANSFERRED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESTRANSFERRED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESTRANSFERRED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeKBytesTransferred(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESTRANSFERRED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESTRANSFERRED + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeKBytesTransferred(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESTRANSFERRED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESTRANSFERRED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeKBytesWritten
	
	public Boolean get_IncludeKBytesWritten() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESWRITTEN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESWRITTEN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESWRITTEN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeKBytesWritten(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESWRITTEN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESWRITTEN + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeKBytesWritten(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESWRITTEN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEKBYTESWRITTEN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeMaintOp
	
	public Boolean get_IncludeMaintOp() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTOP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTOP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTOP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeMaintOp(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTOP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTOP + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeMaintOp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTOP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTOP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeMaintTimeCounter
	
	public Boolean get_IncludeMaintTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTTIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTTIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeMaintTimeCounter(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTTIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTTIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeMaintTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTTIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEMAINTTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeReadHitIOTimeCounter
	
	public Boolean get_IncludeReadHitIOTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOTIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOTIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeReadHitIOTimeCounter(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOTIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOTIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeReadHitIOTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOTIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeReadHitIOs
	
	public Boolean get_IncludeReadHitIOs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeReadHitIOs(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOS + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeReadHitIOs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADHITIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeReadIOTimeCounter
	
	public Boolean get_IncludeReadIOTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOTIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOTIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeReadIOTimeCounter(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOTIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOTIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeReadIOTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOTIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeReadIOs
	
	public Boolean get_IncludeReadIOs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeReadIOs(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOS + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeReadIOs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEREADIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeStartStatisticTime
	
	public Boolean get_IncludeStartStatisticTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTARTSTATISTICTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTARTSTATISTICTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTARTSTATISTICTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeStartStatisticTime(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTARTSTATISTICTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTARTSTATISTICTIME + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeStartStatisticTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTARTSTATISTICTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTARTSTATISTICTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeStatisticTime
	
	public Boolean get_IncludeStatisticTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTATISTICTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTATISTICTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTATISTICTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeStatisticTime(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTATISTICTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTATISTICTIME + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeStatisticTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTATISTICTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDESTATISTICTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeTotalIOs
	
	public Boolean get_IncludeTotalIOs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDETOTALIOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDETOTALIOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDETOTALIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeTotalIOs(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDETOTALIOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDETOTALIOS + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeTotalIOs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDETOTALIOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDETOTALIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeWriteHitIOTimeCounter
	
	public Boolean get_IncludeWriteHitIOTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOTIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOTIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeWriteHitIOTimeCounter(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOTIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOTIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeWriteHitIOTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOTIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeWriteHitIOs
	
	public Boolean get_IncludeWriteHitIOs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeWriteHitIOs(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOS + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeWriteHitIOs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEHITIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeWriteIOTimeCounter
	
	public Boolean get_IncludeWriteIOTimeCounter() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOTIMECOUNTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOTIMECOUNTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeWriteIOTimeCounter(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOTIMECOUNTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOTIMECOUNTER + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeWriteIOTimeCounter(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOTIMECOUNTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOTIMECOUNTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IncludeWriteIOs
	
	public Boolean get_IncludeWriteIOs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IncludeWriteIOs(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOS + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_IncludeWriteIOs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INCLUDEWRITEIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InstanceID
	
	public String get_InstanceID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INSTANCEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InstanceID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BlockStatisticsManifest.CIM_PROPERTY_INSTANCEID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INSTANCEID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (!CIM_BlockStatisticsManifestHelper.isValid_InstanceID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INSTANCEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BlockStatisticsManifest.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
