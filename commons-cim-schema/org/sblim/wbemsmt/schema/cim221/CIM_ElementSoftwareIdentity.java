/**
 * CIM_ElementSoftwareIdentity.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE
 * TERMS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Common Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: ElementSoftwareIdentity allows a Managed
 *            Element to report its software related asset information (firmware, drivers,
 *            configuration software, and etc.) generated Class
 */

package org.sblim.wbemsmt.schema.cim221;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ElementSoftwareIdentity extends CIM_Dependency {

    public final static String CIM_CLASS_NAME = "CIM_ElementSoftwareIdentity";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ElementSoftwareStatus
     * A collection of properties describing the status of the software on the managed element. Multiple properties could be set at the same time. For example a ElementSoftwareStatus could have "Installed", "Default", "Current" and "FallBack" set at the same time. 
     * "Current" indicates that the software is currently running on or for the Managed Element. 
     * "Next" indicates that the software will run after the next reset or reboot unless superseded by a software with a status of "SingleUse". 
     * "FallBack" indicates that the software will be run if the software which has a status of "Next" or "SingleUse" fails to run. 
     * "Default" indicates the default version of the software that was originally shipped by the manufacturer. 
     * "Installed" indicates that the software is persistently located and is available for use on the Managed Element. 
     * "SingleUse" indicates that the software will run only after the next reset or reboot but will not run after the subsequent reset or reboot. 
     * "Available" indicates that the software is available for installation on the Managed Element. 
     * "Supports"indicates that the software will work with or operate the Managed Element but is or will be installed on a different Managed Element.
     */
    public static class PROPERTY_ELEMENTSOFTWARESTATUS {
        /**
         * name of the property ElementSoftwareStatus
         */
        public final static String NAME = "ElementSoftwareStatus";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Current = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Current (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Current = "Current";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Next = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Next (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Next = "Next";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FallBack = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry FallBack (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_FallBack = "FallBack";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Default = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Default (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Default = "Default";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Installed = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Installed (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Installed = "Installed";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Single_Use = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Single Use (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Single_Use = "Single Use";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Available = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Available (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Available = "Available";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Supports = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Supports (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Supports = "Supports";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Current.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Current;
            }

            if (VALUE_ENTRY_Next.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Next;
            }

            if (VALUE_ENTRY_FallBack.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FallBack;
            }

            if (VALUE_ENTRY_Default.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Default;
            }

            if (VALUE_ENTRY_Installed.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Installed;
            }

            if (VALUE_ENTRY_Single_Use.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Single_Use;
            }

            if (VALUE_ENTRY_Available.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Available;
            }

            if (VALUE_ENTRY_Supports.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Supports;
            }

            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(
                Number indexInPulldown) {
            return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
        }

        /**
         * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
         *
         * can be used to set the correct selection index for a pulldown field
         *
         * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
         * @param currentValue the currentValue to get the index for
         */
        public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue) {
            String valueEntry = getValueEntry(currentValue);
            if (valueEntry != null) {
                for (int i = 0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++) {
                    if (VALUE_ENTRIES_FOR_DISPLAY[i].equals(valueEntry)) {
                        return i;
                    }
                }
            }
            return -1;

        }

        /**
         * get the ValueEntry of the given valueMapEntry
         * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
         * @return the Value entry or null if not found
         */

        public static String getValueEntry(javax.cim.UnsignedInteger16 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Current.intValue()) {
                return VALUE_ENTRY_Current;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Next.intValue()) {
                return VALUE_ENTRY_Next;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FallBack.intValue()) {
                return VALUE_ENTRY_FallBack;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Default.intValue()) {
                return VALUE_ENTRY_Default;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Installed.intValue()) {
                return VALUE_ENTRY_Installed;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Single_Use.intValue()) {
                return VALUE_ENTRY_Single_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Available.intValue()) {
                return VALUE_ENTRY_Available;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Supports.intValue()) {
                return VALUE_ENTRY_Supports;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
            }
            return VALUE_ENTRY_DMTF_Reserved;

        }

        /**
         * get the ValueEntries of the given valueMapEntries
         * @param values the values to find the ValueMapEntries for
         * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
         */

        public static javax.cim.UnsignedInteger16[] getValueMapEntries(String[] values) {
            javax.cim.UnsignedInteger16[] result = new javax.cim.UnsignedInteger16[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueMapEntry(values[i]);
            }

            return result;
        }

        /**
         * get the ValueMapEntries of the given valueEntries
         * @param valueMapEntries the valueMap entries to find the Values for
         * @return the array with Value entries. Some of them may be null to if no value entry was found
         */

        public static String[] getValueEntries(javax.cim.UnsignedInteger16[] values) {
            String[] result = new String[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueEntry(values[i]);
            }

            return result;
        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property ElementSoftwareStatus   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Current, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Next,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FallBack,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Default,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Installed,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Single_Use,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Available,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Supports };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ElementSoftwareStatus   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Current,
                VALUE_ENTRY_Next, VALUE_ENTRY_FallBack, VALUE_ENTRY_Default, VALUE_ENTRY_Installed,
                VALUE_ENTRY_Single_Use, VALUE_ENTRY_Available, VALUE_ENTRY_Supports,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ElementSoftwareStatus   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Current, VALUE_ENTRY_Next, VALUE_ENTRY_FallBack, VALUE_ENTRY_Default,
                VALUE_ENTRY_Installed, VALUE_ENTRY_Single_Use, VALUE_ENTRY_Available,
                VALUE_ENTRY_Supports };

    }

    /**
     * Constants of property OtherUpgradeCondition
     * Describes the upgrade condition, when UpgradeCondition is set to 1 ("Other").
     */
    public static class PROPERTY_OTHERUPGRADECONDITION {
        /**
         * name of the property OtherUpgradeCondition
         */
        public final static String NAME = "OtherUpgradeCondition";

    }

    /**
     * Constants of property UpgradeCondition
     * Indicates the element's ability to upgrade this software asset.
     * 'Resides off element'(2), indicates the persistence of the software is outside of the element. Typically for a element this software is part of the OperatingSystem is typically upgradeable.
     * 'Owner Upgradeable' (3), indicates the persistence of the software is on the element and is upgradeable by the owner.
     * 'FactoryUpgradeable' (4),indicates the persistence of the software is on the element and is upgradeable by the manufacturer.
     * 'Not Upgradeable' (5), indicates the presistence of the software is on the element and is not upgradeable. (i.e. burned into a non replaceable ROM chip.
     */
    public static class PROPERTY_UPGRADECONDITION {
        /**
         * name of the property UpgradeCondition
         */
        public final static String NAME = "UpgradeCondition";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Other (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Resides_off_device = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Resides off device (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Resides_off_device = "Resides off device";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Owner_Upgradeable = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Owner Upgradeable (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Owner_Upgradeable = "Owner Upgradeable";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Factory_Upgradeable = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Factory Upgradeable (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Factory_Upgradeable = "Factory Upgradeable";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Upgradeable = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Not Upgradeable (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Not_Upgradeable = "Not Upgradeable";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 0x8000..0xFFFF
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000..0xFFFF )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Resides_off_device.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Resides_off_device;
            }

            if (VALUE_ENTRY_Owner_Upgradeable.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Owner_Upgradeable;
            }

            if (VALUE_ENTRY_Factory_Upgradeable.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Factory_Upgradeable;
            }

            if (VALUE_ENTRY_Not_Upgradeable.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Upgradeable;
            }

            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(
                Number indexInPulldown) {
            return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
        }

        /**
         * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
         *
         * can be used to set the correct selection index for a pulldown field
         *
         * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
         * @param currentValue the currentValue to get the index for
         */
        public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue) {
            String valueEntry = getValueEntry(currentValue);
            if (valueEntry != null) {
                for (int i = 0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++) {
                    if (VALUE_ENTRIES_FOR_DISPLAY[i].equals(valueEntry)) {
                        return i;
                    }
                }
            }
            return -1;

        }

        /**
         * get the ValueEntry of the given valueMapEntry
         * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
         * @return the Value entry or null if not found
         */

        public static String getValueEntry(javax.cim.UnsignedInteger16 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Resides_off_device.intValue()) {
                return VALUE_ENTRY_Resides_off_device;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Owner_Upgradeable.intValue()) {
                return VALUE_ENTRY_Owner_Upgradeable;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Factory_Upgradeable.intValue()) {
                return VALUE_ENTRY_Factory_Upgradeable;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Upgradeable.intValue()) {
                return VALUE_ENTRY_Not_Upgradeable;
            }

            if (iValue >= 0x8000 || iValue <= 0xFFFF) {
                return VALUE_ENTRY_Vendor_Reserved;
            }
            return VALUE_ENTRY_DMTF_Reserved;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property UpgradeCondition   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Resides_off_device,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Owner_Upgradeable,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Factory_Upgradeable,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Upgradeable };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property UpgradeCondition   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Resides_off_device, VALUE_ENTRY_Owner_Upgradeable,
                VALUE_ENTRY_Factory_Upgradeable, VALUE_ENTRY_Not_Upgradeable,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property UpgradeCondition   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Resides_off_device, VALUE_ENTRY_Owner_Upgradeable,
                VALUE_ENTRY_Factory_Upgradeable, VALUE_ENTRY_Not_Upgradeable };

    }

    /**
     * Constants of property Antecedent
     * 
     */
    public static class PROPERTY_ANTECEDENT_CIM_SOFTWAREIDENTITY {
        /**
         * name of the property Antecedent
         */
        public final static String NAME = "Antecedent";

    }

    /**
     * Constants of property Dependent
     * 
     */
    public static class PROPERTY_DEPENDENT_CIM_MANAGEDELEMENT {
        /**
         * name of the property Dependent
         */
        public final static String NAME = "Dependent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim221");
        String[] parentClassPackageList = CIM_Dependency.getPackages();

        for (int i = 0; i < parentClassPackageList.length; i++) {
            addPackage(parentClassPackageList[i]);
        }

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   ElementSoftwareIdentity allows a Managed Element to report its software related asset information (firmware, drivers, configuration software, and etc.)
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ElementSoftwareIdentity(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   ElementSoftwareIdentity allows a Managed Element to report its software related asset information (firmware, drivers, configuration software, and etc.)
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ElementSoftwareIdentity(CIMInstance cimInstance) throws WbemsmtException {

        if (cimInstance == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimInstance parameter does not contain a valid reference.");
        }
        setFromServer(true);
        init(cimInstance, false);
    }

    /**
     * Default constructor
     */
    protected CIM_ElementSoftwareIdentity() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ElementSoftwareStatus", new CIMProperty("ElementSoftwareStatus",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("OtherUpgradeCondition", new CIMProperty("OtherUpgradeCondition",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("UpgradeCondition", new CIMProperty("UpgradeCondition",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Antecedent", new CIMProperty("Antecedent", new CIMDataType(
                CIM_SoftwareIdentity.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependent", new CIMProperty("Dependent", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property ElementSoftwareStatus
     *     * <br>
     * A collection of properties describing the status of the software on the managed element. Multiple properties could be set at the same time. For example a ElementSoftwareStatus could have "Installed", "Default", "Current" and "FallBack" set at the same time. 
     * "Current" indicates that the software is currently running on or for the Managed Element. 
     * "Next" indicates that the software will run after the next reset or reboot unless superseded by a software with a status of "SingleUse". 
     * "FallBack" indicates that the software will be run if the software which has a status of "Next" or "SingleUse" fails to run. 
     * "Default" indicates the default version of the software that was originally shipped by the manufacturer. 
     * "Installed" indicates that the software is persistently located and is available for use on the Managed Element. 
     * "SingleUse" indicates that the software will run only after the next reset or reboot but will not run after the subsequent reset or reboot. 
     * "Available" indicates that the software is available for installation on the Managed Element. 
     * "Supports"indicates that the software will work with or operate the Managed Element but is or will be installed on a different Managed Element.
     *     */

    public javax.cim.UnsignedInteger16[] get_ElementSoftwareStatus() {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENTSOFTWARESTATUS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ELEMENTSOFTWARESTATUS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property ElementSoftwareStatus
     * <br>
     * A collection of properties describing the status of the software on the managed element. Multiple properties could be set at the same time. For example a ElementSoftwareStatus could have "Installed", "Default", "Current" and "FallBack" set at the same time. 
     * "Current" indicates that the software is currently running on or for the Managed Element. 
     * "Next" indicates that the software will run after the next reset or reboot unless superseded by a software with a status of "SingleUse". 
     * "FallBack" indicates that the software will be run if the software which has a status of "Next" or "SingleUse" fails to run. 
     * "Default" indicates the default version of the software that was originally shipped by the manufacturer. 
     * "Installed" indicates that the software is persistently located and is available for use on the Managed Element. 
     * "SingleUse" indicates that the software will run only after the next reset or reboot but will not run after the subsequent reset or reboot. 
     * "Available" indicates that the software is available for installation on the Managed Element. 
     * "Supports"indicates that the software will work with or operate the Managed Element but is or will be installed on a different Managed Element.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ElementSoftwareStatus(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENTSOFTWARESTATUS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ElementSoftwareStatus(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENTSOFTWARESTATUS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ElementSoftwareStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ElementSoftwareStatus(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_ElementSoftwareIdentity fco = new CIM_ElementSoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELEMENTSOFTWARESTATUS.NAME);
        if (property != null) {
            property = setPropertyValue_ElementSoftwareStatus(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENTSOFTWARESTATUS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ElementSoftwareStatus
     * <br>
     * A collection of properties describing the status of the software on the managed element. Multiple properties could be set at the same time. For example a ElementSoftwareStatus could have "Installed", "Default", "Current" and "FallBack" set at the same time. 
     * "Current" indicates that the software is currently running on or for the Managed Element. 
     * "Next" indicates that the software will run after the next reset or reboot unless superseded by a software with a status of "SingleUse". 
     * "FallBack" indicates that the software will be run if the software which has a status of "Next" or "SingleUse" fails to run. 
     * "Default" indicates the default version of the software that was originally shipped by the manufacturer. 
     * "Installed" indicates that the software is persistently located and is available for use on the Managed Element. 
     * "SingleUse" indicates that the software will run only after the next reset or reboot but will not run after the subsequent reset or reboot. 
     * "Available" indicates that the software is available for installation on the Managed Element. 
     * "Supports"indicates that the software will work with or operate the Managed Element but is or will be installed on a different Managed Element.
     */

    private static CIMProperty setPropertyValue_ElementSoftwareStatus(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherUpgradeCondition
     *     * <br>
     * Describes the upgrade condition, when UpgradeCondition is set to 1 ("Other").
     *     */

    public String get_OtherUpgradeCondition() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERUPGRADECONDITION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERUPGRADECONDITION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherUpgradeCondition
     * <br>
     * Describes the upgrade condition, when UpgradeCondition is set to 1 ("Other").
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherUpgradeCondition(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERUPGRADECONDITION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherUpgradeCondition(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERUPGRADECONDITION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherUpgradeCondition by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherUpgradeCondition(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_ElementSoftwareIdentity fco = new CIM_ElementSoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERUPGRADECONDITION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherUpgradeCondition(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERUPGRADECONDITION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherUpgradeCondition
     * <br>
     * Describes the upgrade condition, when UpgradeCondition is set to 1 ("Other").
     */

    private static CIMProperty setPropertyValue_OtherUpgradeCondition(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UpgradeCondition
     *     * <br>
     * Indicates the element's ability to upgrade this software asset.
     * 'Resides off element'(2), indicates the persistence of the software is outside of the element. Typically for a element this software is part of the OperatingSystem is typically upgradeable.
     * 'Owner Upgradeable' (3), indicates the persistence of the software is on the element and is upgradeable by the owner.
     * 'FactoryUpgradeable' (4),indicates the persistence of the software is on the element and is upgradeable by the manufacturer.
     * 'Not Upgradeable' (5), indicates the presistence of the software is on the element and is not upgradeable. (i.e. burned into a non replaceable ROM chip.
     *     */

    public javax.cim.UnsignedInteger16 get_UpgradeCondition() {
        CIMProperty currentProperty = getProperty(PROPERTY_UPGRADECONDITION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UPGRADECONDITION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property UpgradeCondition
     * <br>
     * Indicates the element's ability to upgrade this software asset.
     * 'Resides off element'(2), indicates the persistence of the software is outside of the element. Typically for a element this software is part of the OperatingSystem is typically upgradeable.
     * 'Owner Upgradeable' (3), indicates the persistence of the software is on the element and is upgradeable by the owner.
     * 'FactoryUpgradeable' (4),indicates the persistence of the software is on the element and is upgradeable by the manufacturer.
     * 'Not Upgradeable' (5), indicates the presistence of the software is on the element and is not upgradeable. (i.e. burned into a non replaceable ROM chip.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UpgradeCondition(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UPGRADECONDITION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_UpgradeCondition(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UPGRADECONDITION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UpgradeCondition by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UpgradeCondition(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ElementSoftwareIdentity fco = new CIM_ElementSoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UPGRADECONDITION.NAME);
        if (property != null) {
            property = setPropertyValue_UpgradeCondition(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UPGRADECONDITION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UpgradeCondition
     * <br>
     * Indicates the element's ability to upgrade this software asset.
     * 'Resides off element'(2), indicates the persistence of the software is outside of the element. Typically for a element this software is part of the OperatingSystem is typically upgradeable.
     * 'Owner Upgradeable' (3), indicates the persistence of the software is on the element and is upgradeable by the owner.
     * 'FactoryUpgradeable' (4),indicates the persistence of the software is on the element and is upgradeable by the manufacturer.
     * 'Not Upgradeable' (5), indicates the presistence of the software is on the element and is not upgradeable. (i.e. burned into a non replaceable ROM chip.
     */

    private static CIMProperty setPropertyValue_UpgradeCondition(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Antecedent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_SoftwareIdentity get_Antecedent_CIM_SoftwareIdentity(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_SOFTWAREIDENTITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_SOFTWAREIDENTITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SoftwareIdentityHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Antecedent_CIM_SoftwareIdentity(CIM_SoftwareIdentity newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_SOFTWAREIDENTITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Antecedent_CIM_SoftwareIdentity(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_SOFTWAREIDENTITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Antecedent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Antecedent_CIM_SoftwareIdentity(WBEMClient client,
            String namespace, CIM_SoftwareIdentity newValue) throws WbemsmtException {
        CIM_ElementSoftwareIdentity fco = new CIM_ElementSoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ANTECEDENT_CIM_SOFTWAREIDENTITY.NAME);
        if (property != null) {
            property = setPropertyValue_Antecedent_CIM_SoftwareIdentity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_SOFTWAREIDENTITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Antecedent_CIM_SoftwareIdentity(
            CIMProperty currentProperty, CIM_SoftwareIdentity newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Dependent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_Dependent_CIM_ManagedElement(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Dependent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependent_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Dependent_CIM_ManagedElement(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Dependent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Dependent_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_ElementSoftwareIdentity fco = new CIM_ElementSoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENT_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_Dependent_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependent_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    //**********************************************************************
    // Associators methods     
    //**********************************************************************

    //**********************************************************************
    // Extrinsic Method invocations     
    //**********************************************************************                         

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ElementSoftwareIdentity.CIM_CLASS_NAME;
    }

}