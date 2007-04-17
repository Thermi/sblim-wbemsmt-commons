/** 
 * CIM_StorageSetting.java
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
 * Description:  StorageSetting is roughly equivalent to a Service Level Agreement (SLA) It
 * defines the characteristics, qualities of service and goals when used in a
 * CreateOrModifyElement FromStoragePool or CreateOrModifyStoragePool method in
 * the StorageConfigurationService. It specifies a series of properties with
 * Maximum and Minimum values that define the (inclusive) bounds that the object
 * should maintain. Note that the setting is associated to a StorageVolume or
 * LogicalDisk, using ElementSetting. The use of these properties differs
 * depending on whether the StorageSetting instance is being used as a goal for
 * a configuration operation or being used as a Service Level Agreement for a
 * created Volume. In addition the properties fall into two categories: The QOS
 * properties(PackageRedundancy, Data Redundancy, & NoSinglePointOfFailure) and
 * the Detailed RAID properties(ExtentStripeLength, ParityLayout, and
 * UserDataStripeDepth). In a Setting used as a goal, the QOS properties are
 * required as a set; The Detailed RAID properties(if supported as indicated by
 * the scoping StorageCapabilities instance) may be used optionally in any
 * combination. The implementation MUST supply it's own best practice in the
 * case where one or more supported RAID properties are not supplied. In this
 * situation the use of StorageSettingWithHints can be useful to provide
 * direction to the implementation. In a Setting used as a service agreement for
 * a Volume, the QOS properties reflect the Service Level Agreement, with goal,
 * min, & max. The actual current service level is exposed by corresponding
 * values in StorageExtent. The Detailed RAID properties, by contrast, reflect
 * specific values that reflect the RAID construction of the Volume. Only the
 * primary values are meaningful; Min and Max are set to match. Certain
 * StorageSetting instances may be classed as "Fixed", by using the
 * "ChangeableType" property, indicating the setting is preset. Such settings
 * are used when the possible setting variations are low enough to be
 * instantiated in their entirety. The StorageCapabilities "CreateSetting"
 * method MAY NOT be used to return settings that are not changeable. Other
 * StorageSetting instances are created using the "CreateSetting" method. If the
 * capabilities specifies ranges, then the setting can be used by a client to
 * narrow the range to particular values within the range. In other words, the
 * capabilities MAY be broad, but the related setting MUST be as capable or less
 * capable, that is more narrowly defined, before it is used to create or modify
 * resources. These created StorageSetting instances MUST have their
 * "ChangeableType" property = 1, "Changeable - Transient". GeneratedSettings
 * MAY not remain after the restart or reset of the implementation. They may be
 * deleted by implementation at any time. A reasonable minimal time to retain
 * the generated transient settings is five minutes, although there is no
 * minimal retention time.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
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
import org.sblim.wbem.cim.UnsignedInt8;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  StorageSetting is roughly equivalent to a Service Level Agreement (SLA) It
 * defines the characteristics, qualities of service and goals when used in a
 * CreateOrModifyElement FromStoragePool or CreateOrModifyStoragePool method in
 * the StorageConfigurationService. It specifies a series of properties with
 * Maximum and Minimum values that define the (inclusive) bounds that the object
 * should maintain. Note that the setting is associated to a StorageVolume or
 * LogicalDisk, using ElementSetting. The use of these properties differs
 * depending on whether the StorageSetting instance is being used as a goal for
 * a configuration operation or being used as a Service Level Agreement for a
 * created Volume. In addition the properties fall into two categories: The QOS
 * properties(PackageRedundancy, Data Redundancy, & NoSinglePointOfFailure) and
 * the Detailed RAID properties(ExtentStripeLength, ParityLayout, and
 * UserDataStripeDepth). In a Setting used as a goal, the QOS properties are
 * required as a set; The Detailed RAID properties(if supported as indicated by
 * the scoping StorageCapabilities instance) may be used optionally in any
 * combination. The implementation MUST supply it's own best practice in the
 * case where one or more supported RAID properties are not supplied. In this
 * situation the use of StorageSettingWithHints can be useful to provide
 * direction to the implementation. In a Setting used as a service agreement for
 * a Volume, the QOS properties reflect the Service Level Agreement, with goal,
 * min, & max. The actual current service level is exposed by corresponding
 * values in StorageExtent. The Detailed RAID properties, by contrast, reflect
 * specific values that reflect the RAID construction of the Volume. Only the
 * primary values are meaningful; Min and Max are set to match. Certain
 * StorageSetting instances may be classed as "Fixed", by using the
 * "ChangeableType" property, indicating the setting is preset. Such settings
 * are used when the possible setting variations are low enough to be
 * instantiated in their entirety. The StorageCapabilities "CreateSetting"
 * method MAY NOT be used to return settings that are not changeable. Other
 * StorageSetting instances are created using the "CreateSetting" method. If the
 * capabilities specifies ranges, then the setting can be used by a client to
 * narrow the range to particular values within the range. In other words, the
 * capabilities MAY be broad, but the related setting MUST be as capable or less
 * capable, that is more narrowly defined, before it is used to create or modify
 * resources. These created StorageSetting instances MUST have their
 * "ChangeableType" property = 1, "Changeable - Transient". GeneratedSettings
 * MAY not remain after the restart or reset of the implementation. They may be
 * deleted by implementation at any time. A reasonable minimal time to retain
 * the generated transient settings is five minutes, although there is no
 * minimal retention time.
 */
public class CIM_StorageSetting extends CIM_SettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageSetting"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_STORAGESETTINGSGENERATEDFROMCAPABILITIES = "CIM_StorageSettingsGeneratedFromCapabilities"; //$NON-NLS-1$
	
	
	/**
	*	Enumeration indicating the type of setting. "Fixed - Not Changeable" settings are primordial. These setting are defined at the implementor of the class. "Changeable - Transient" is the type of setting produced by the "CreateSetting" method. A client can subsequently request that the implementation persist the generated and potentially modified setting indefinately. Only a "Changeable - Transient" setting SHALL be converted to a "Changeable = Persistent" setting; the setting SHALL NOT be changed back.
	*/
	public final static String CIM_PROPERTY_CHANGEABLETYPE = "ChangeableType"; //$NON-NLS-1$
	/**
	*	DataRedundancyGoal describes the desired number of complete copies of data to be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained. Possible values are 1 to n. The bounds (max and min) for redundancy are defined using the properties, DataRedundancyMax and DataRedundancyMin.
	*/
	public final static String CIM_PROPERTY_DATAREDUNDANCYGOAL = "DataRedundancyGoal"; //$NON-NLS-1$
	/**
	*	DataRedundancyMax describes the maximum number of complete copies of data to be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained. Possible values are 1 to n. The desired redundancy is specified using DataRedundancyGoal, while the minimum is defined by DataRedundancyMin.
	*/
	public final static String CIM_PROPERTY_DATAREDUNDANCYMAX = "DataRedundancyMax"; //$NON-NLS-1$
	/**
	*	DataRedundancyMin describes the minimum number of complete copies of data to be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained. Possible values are 1 to n. The desired redundancy is specified using DataRedundancyGoal, while the maximum is defined by DataRedundancyMax.
	*/
	public final static String CIM_PROPERTY_DATAREDUNDANCYMIN = "DataRedundancyMin"; //$NON-NLS-1$
	/**
	*	DeltaReservationGoal is a number between 1 (1%) and a 100 (100%) which specifies the desired amount of space that should be reserved in a replica for caching changes. For a complete copy this would be 100%. The bounds (max and min) for the reservation are defined using the properties, DeltaReservationMax and DeltaReservationMin.
	*/
	public final static String CIM_PROPERTY_DELTARESERVATIONGOAL = "DeltaReservationGoal"; //$NON-NLS-1$
	/**
	*	DeltaReservationMax is a number between 1 (1%) and a 100 (100%) which specifies the maximum amount of space that should be reserved in a replica for caching changes. For a complete copy this would be 100%. The desired reservation is specified using DeltaReservationGoal, while the minimum is defined by DeltaReservationMin.
	*/
	public final static String CIM_PROPERTY_DELTARESERVATIONMAX = "DeltaReservationMax"; //$NON-NLS-1$
	/**
	*	DeltaReservationMin is a number between 1 (1%) and a 100 (100%) which specifies the minimum amount of space that should be reserved in a replica for caching changes. For a complete copy this would be 100%. The desired reservation is specified using DeltaReservationGoal, while the maximum is defined by DeltaReservationMax.
	*/
	public final static String CIM_PROPERTY_DELTARESERVATIONMIN = "DeltaReservationMin"; //$NON-NLS-1$
	/**
	*	ExtentStripeLength describes the number of underlying StorageExtents across which data is striped in the common striping-based storage organizations. This is also known as the number of 'members' or 'columns'. When used in a goal setting instance, ExtentStripeLength is the optimal desired value. The bounds (max and min) for Stripe Length are defined using the properties ExtentStripeLengthMax and ExtentStripeLengthMin. ExtentStripeLength MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. ExtentStripeLength can be used in conjunction with CreateOrModifyElementFromELements to explicitly configure storage. An example would be RAID 0+1 with mirroring two stripe sets, each set being three wide. In this case CreateOrModifyElementFromElements would be passed a goal setting with DataRedundancy = 2 and ExtentStripeLength = 3. The size of the InElements array would be 6 and would contain the StorageExtents to be used to construct the StorageElement as a RAID 0+1. ExtentStripeLengthMin and ExtentStripeLengthMax are meaningless and wouldbe set to NULL. If the property is supported, and is part of StorageSettingWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property indicates the specific value that the Volume was created with, and ExtentStripeLengthMin and ExtentStripeLengthMax will be set to the same specific value.
	*/
	public final static String CIM_PROPERTY_EXTENTSTRIPELENGTH = "ExtentStripeLength"; //$NON-NLS-1$
	/**
	*	ExtentStripeLength describes the number of underlying StorageExtents across which data is striped in the common striping-based storage organizations. This is also known as the number of 'members' or 'columns'. When used in a goal setting instance, ExtentStripeLengthMax is the maximum acceptable value. The desired Stripe Length is specified using ExtentStripeLength, while the minimum is defined by ExtentStripeLengthMin. ExtentStripeLengthMax MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. If the property is supported, and is part of StorageSettingWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property is set to the specific value of ExtentStripeLength.
	*/
	public final static String CIM_PROPERTY_EXTENTSTRIPELENGTHMAX = "ExtentStripeLengthMax"; //$NON-NLS-1$
	/**
	*	ExtentStripeLength describes the number of underlying StorageExtents across which data is striped in the common striping-based storage organizations. This is also known as the number of 'members' or 'columns'. When used in a goal setting instance, ExtentStripeLengthMin is the minimum acceptable value. The desired Stripe Length is specified using ExtentStripeLength, while the maximum is defined by ExtentStripeLengthMax. ExtentStripeLengthMin MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. If the property is supported, and is part of StorageSettingWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property is set to the specific value of ExtentStripeLength.
	*/
	public final static String CIM_PROPERTY_EXTENTSTRIPELENGTHMIN = "ExtentStripeLengthMin"; //$NON-NLS-1$
	/**
	*	Indicates the desired value for No Single Point of Failure. Possible values are false = single point of failure, and true = no single point of failure.
	*/
	public final static String CIM_PROPERTY_NOSINGLEPOINTOFFAILURE = "NoSinglePointOfFailure"; //$NON-NLS-1$
	/**
	*	PackageRedundancyGoal describes the desired number of redundant packages to be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The bounds (max and min) for redundancy are defined using the properties, PackageRedundancyMax and PackageRedundancyMin.
	*/
	public final static String CIM_PROPERTY_PACKAGEREDUNDANCYGOAL = "PackageRedundancyGoal"; //$NON-NLS-1$
	/**
	*	PackageRedundancyMax describes the maximum number of redundant packages to be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The desired redundancy is specified using PackageRedundancyGoal, while the minimum is defined by PackageRedundancyMin.
	*/
	public final static String CIM_PROPERTY_PACKAGEREDUNDANCYMAX = "PackageRedundancyMax"; //$NON-NLS-1$
	/**
	*	PackageRedundancyMin describes the minimum number of redundant packages to be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The desired redundancy is specified using PackageRedundancyGoal, while the maximum is defined by PackageRedundancyMax.
	*/
	public final static String CIM_PROPERTY_PACKAGEREDUNDANCYMIN = "PackageRedundancyMin"; //$NON-NLS-1$
	/**
	*	ParityLayout specifies whether a parity-based storage organization is using rotated or non-rotated parity. When used in a goal setting instance, ParityLayout is the desired value. It MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. If the property is supported, and is part of StorageSettingWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property indicates the specific value that the Volume was created with.
	*/
	public final static String CIM_PROPERTY_PARITYLAYOUT = "ParityLayout"; //$NON-NLS-1$
	/**
	*	UserDataStripeDepth describes the number of bytes forming a strip in common striping-based storage organizations. The strip is defined as the size of the portion of a stripe that lies on one extent. Thus, ExtentStripeLength * UserDataStripeDepth will yield the size of one stripe of user data. When used in a goal setting instance, UserDataStripeDepth is the optimal desired value. The bounds (max and min) for Stripe Depth are defined using the properties UserDataStripeDepthMax and UserDataStripeDepthMin. UserDataStripeDepth MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. If the property is supported, and is part of StorageSettingWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property indicates the specific value that the Volume was created with, and UserDataStripeDepthMin and UserDataStripeDepthMax will be set to the same specific value.
	*/
	public final static String CIM_PROPERTY_USERDATASTRIPEDEPTH = "UserDataStripeDepth"; //$NON-NLS-1$
	/**
	*	UserDataStripeDepth describes the number of bytes forming a strip in common striping-based storage organizations. The strip is defined as the size of the portion of a stripe that lies on one extent. Thus, ExtentStripeLength * UserDataStripeDepth will yield the size of one stripe of user data. When used in a goal setting instance, UserDataStripeDepthMax is the maximum acceptable value. The desired Stripe Depth is specified using UserDataStripeDepthGoal, while the minimum is defined by UserDataStripeDepthMin. UserDataStripeDepthMax MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. If the property is supported, and is part of StorageSettingwWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property is set to the specific value of UserDataStripeDepth.
	*/
	public final static String CIM_PROPERTY_USERDATASTRIPEDEPTHMAX = "UserDataStripeDepthMax"; //$NON-NLS-1$
	/**
	*	UserDataStripeDepth describes the number of bytes forming a strip in common striping-based storage organizations. The strip is defined as the size of the portion of a stripe that lies on one extent. Thus, ExtentStripeLength * UserDataStripeDepth will yield the size of one stripe of user data. When used in a goal setting instance, UserDataStripeDepthMin is the minimum acceptable value. The desired Stripe Depth is specified using UserDataStripeDepth, while the maximum is defined by UserDataStripeDepthMax. UserDataStripeDepthMin MUST be set to NULL if the scoping StorageCapablities indicates that it is not supported in this context. If the property is supported, and is part of StorageSettingWithHints it MAY be set to NULL. If used it will constrain the effects of Hint selections. When used in a Setting instance associated to a Volume, this property is set to the specific value of UserDataStripeDepth.
	*/
	public final static String CIM_PROPERTY_USERDATASTRIPEDEPTHMIN = "UserDataStripeDepthMin"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CHANGEABLETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAREDUNDANCYGOAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAREDUNDANCYMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAREDUNDANCYMIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELTARESERVATIONGOAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELTARESERVATIONMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELTARESERVATIONMIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXTENTSTRIPELENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXTENTSTRIPELENGTHMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXTENTSTRIPELENGTHMIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKAGEREDUNDANCYGOAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKAGEREDUNDANCYMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKAGEREDUNDANCYMIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_PARITYLAYOUT);
		CIM_PropertyNameList.add(CIM_PROPERTY_USERDATASTRIPEDEPTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_USERDATASTRIPEDEPTHMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_USERDATASTRIPEDEPTHMIN);
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHANGEABLETYPE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAREDUNDANCYGOAL)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAREDUNDANCYMAX)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAREDUNDANCYMIN)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELTARESERVATIONGOAL)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELTARESERVATIONMAX)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELTARESERVATIONMIN)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXTENTSTRIPELENGTH)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXTENTSTRIPELENGTHMAX)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXTENTSTRIPELENGTHMIN)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKAGEREDUNDANCYGOAL)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKAGEREDUNDANCYMAX)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKAGEREDUNDANCYMIN)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PARITYLAYOUT)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USERDATASTRIPEDEPTH)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USERDATASTRIPEDEPTHMAX)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USERDATASTRIPEDEPTHMIN)){
				continue;
			}
			
			CIM_StorageSetting.CIM_PropertyNameList.add(CIM_SettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHANGEABLETYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAREDUNDANCYGOAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAREDUNDANCYMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAREDUNDANCYMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELTARESERVATIONGOAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELTARESERVATIONMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELTARESERVATIONMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXTENTSTRIPELENGTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXTENTSTRIPELENGTHMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXTENTSTRIPELENGTHMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKAGEREDUNDANCYGOAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKAGEREDUNDANCYMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKAGEREDUNDANCYMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PARITYLAYOUT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USERDATASTRIPEDEPTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USERDATASTRIPEDEPTHMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USERDATASTRIPEDEPTHMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHANGEABLETYPE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAREDUNDANCYGOAL)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAREDUNDANCYMAX)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAREDUNDANCYMIN)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELTARESERVATIONGOAL)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELTARESERVATIONMAX)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELTARESERVATIONMIN)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXTENTSTRIPELENGTH)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXTENTSTRIPELENGTHMAX)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXTENTSTRIPELENGTHMIN)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKAGEREDUNDANCYGOAL)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKAGEREDUNDANCYMAX)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKAGEREDUNDANCYMIN)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PARITYLAYOUT)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USERDATASTRIPEDEPTH)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USERDATASTRIPEDEPTHMAX)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USERDATASTRIPEDEPTHMIN)){
				continue;
			}
			
			CIM_StorageSetting.CIM_PropertyList.add(CIM_SettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_SettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_SettingData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CHANGEABLETYPE = {"Fixed - Not Changeable","Changeable - Transient","Changeable - Persistent"};
	public final static String[] CIM_VALUEMAP_PARITYLAYOUT = {"Non-rotated Parity","Rotated Parity"};
	
	
	public final static int CHANGEABLETYPE_FIXED_NOTCHANGEABLE = 0;
	public final static int CHANGEABLETYPE_CHANGEABLE_TRANSIENT = 1;
	public final static int CHANGEABLETYPE_CHANGEABLE_PERSISTENT = 2;
	
	public final static int PARITYLAYOUT_NON_ROTATEDPARITY = 1;
	public final static int PARITYLAYOUT_ROTATEDPARITY = 2;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageSetting() {

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
	public CIM_StorageSetting(Vector keyProperties){ 
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
	public CIM_StorageSetting(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageSetting)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageSetting)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageSetting)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageSetting)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageSetting)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageSetting)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageSetting)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageSetting)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageSetting)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageSetting)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_StorageCapabilities_CIM_StorageSettingsGeneratedFromCapabilitiess(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_STORAGESETTINGSGENERATEDFROMCAPABILITIES, 
					CIM_StorageCapabilities.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageSetting.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageSetting.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_StorageSetting.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_StorageSetting.Java_Package_List.setElementAt((String)(CIM_StorageSetting.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_StorageSetting.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageCapabilities(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_StorageCapabilities(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageCapabilities(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_StorageCapabilities_CIM_StorageSettingsGeneratedFromCapabilities_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_STORAGESETTINGSGENERATEDFROMCAPABILITIES, 
					CIM_StorageCapabilities.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_StorageCapabilities.CIM_CLASS_NAME)) {
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
	
	// Attribute ChangeableType
	
	public UnsignedInt16 get_ChangeableType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_CHANGEABLETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_CHANGEABLETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_CHANGEABLETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ChangeableType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_CHANGEABLETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_CHANGEABLETYPE + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_ChangeableType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_CHANGEABLETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_CHANGEABLETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataRedundancyGoal
	
	public UnsignedInt16 get_DataRedundancyGoal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataRedundancyGoal(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_DataRedundancyGoal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataRedundancyMax
	
	public UnsignedInt16 get_DataRedundancyMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataRedundancyMax(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_DataRedundancyMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataRedundancyMin
	
	public UnsignedInt16 get_DataRedundancyMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataRedundancyMin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_DataRedundancyMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeltaReservationGoal
	
	public UnsignedInt8 get_DeltaReservationGoal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeltaReservationGoal(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_DeltaReservationGoal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeltaReservationMax
	
	public UnsignedInt8 get_DeltaReservationMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeltaReservationMax(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_DeltaReservationMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeltaReservationMin
	
	public UnsignedInt8 get_DeltaReservationMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeltaReservationMin(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_DeltaReservationMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExtentStripeLength
	
	public UnsignedInt16 get_ExtentStripeLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExtentStripeLength(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTH + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_ExtentStripeLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExtentStripeLengthMax
	
	public UnsignedInt16 get_ExtentStripeLengthMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExtentStripeLengthMax(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMAX + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_ExtentStripeLengthMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExtentStripeLengthMin
	
	public UnsignedInt16 get_ExtentStripeLengthMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExtentStripeLengthMin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMIN + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_ExtentStripeLengthMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_EXTENTSTRIPELENGTHMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NoSinglePointOfFailure
	
	public Boolean get_NoSinglePointOfFailure() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NoSinglePointOfFailure(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_NoSinglePointOfFailure(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PackageRedundancyGoal
	
	public UnsignedInt16 get_PackageRedundancyGoal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PackageRedundancyGoal(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_PackageRedundancyGoal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PackageRedundancyMax
	
	public UnsignedInt16 get_PackageRedundancyMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PackageRedundancyMax(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_PackageRedundancyMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PackageRedundancyMin
	
	public UnsignedInt16 get_PackageRedundancyMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PackageRedundancyMin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_PackageRedundancyMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ParityLayout
	
	public UnsignedInt16 get_ParityLayout() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PARITYLAYOUT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PARITYLAYOUT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PARITYLAYOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ParityLayout(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PARITYLAYOUT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PARITYLAYOUT + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_ParityLayout(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_PARITYLAYOUT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PARITYLAYOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UserDataStripeDepth
	
	public UnsignedInt64 get_UserDataStripeDepth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UserDataStripeDepth(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTH + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_UserDataStripeDepth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UserDataStripeDepthMax
	
	public UnsignedInt64 get_UserDataStripeDepthMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UserDataStripeDepthMax(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMAX + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_UserDataStripeDepthMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UserDataStripeDepthMin
	
	public UnsignedInt64 get_UserDataStripeDepthMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UserDataStripeDepthMin(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMIN + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_UserDataStripeDepthMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_USERDATASTRIPEDEPTHMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
