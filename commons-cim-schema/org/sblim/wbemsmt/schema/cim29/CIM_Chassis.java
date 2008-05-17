/** 
 * CIM_Chassis.java
 *
 * 
 * © Copyright IBM Corp. 2006,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm
 *
 * Contributors:
 *    michael.bauschert@de.ibm.com 
 * 
 * Description: The Chassis class represents the PhysicalElements that enclose other Elements and provide definable functionality, such as a desktop, processing node, UPS, disk or tape storage, or a combination of these.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import java.lang.reflect.*;
import javax.wbem.*;

public class CIM_Chassis extends CIM_PhysicalFrame {

    public final static String CIM_CLASS_NAME = "CIM_Chassis";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Racks, as simple enclosures, contain Chassis that provide the physical componentry realizing processing nodes, storage devices, UPSs, etc. The ChassisInRack association makes explicit the 'containing' relationship between the Rack and the Chassis.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK = "CIM_ChassisInRack";

    /**
     * A Chassis can contain other Packages, such as other Chassis and Cards. The PackageInChassis association makes explicit this relationship.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS = "CIM_PackageInChassis";

    /**
     * A laptop, a type of Chassis, may be docked in another type of Chassis, a Docking Station. This is the relationship represented by the Docked association. Because this is such a typical relationship, it is explicitly described.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED = "CIM_Docked";

    /**
     * Constants of property ChassisPackageType
     * ChassisPackageType indicates the physical form factor for the type of Chassis.
     */
    public static class PROPERTY_CHASSISPACKAGETYPE {
        /**
         * name of the property ChassisPackageType
         */
        public final static String NAME = "ChassisPackageType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_SMBIOS_Reserved = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry SMBIOS Reserved (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_SMBIOS_Reserved = "SMBIOS Reserved";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Desktop = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Desktop (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Desktop = "Desktop";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Low_Profile_Desktop = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Low Profile Desktop (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Low_Profile_Desktop = "Low Profile Desktop";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Pizza_Box = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Pizza Box (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Pizza_Box = "Pizza Box";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Mini_Tower = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Mini Tower (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Mini_Tower = "Mini Tower";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Tower = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Tower (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Tower = "Tower";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Portable = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Portable (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Portable = "Portable";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_LapTop = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry LapTop (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_LapTop = "LapTop";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Notebook = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Notebook (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Notebook = "Notebook";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Hand_Held = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Hand Held (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Hand_Held = "Hand Held";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Docking_Station = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Docking Station (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Docking_Station = "Docking Station";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_All_in_One = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry All in One (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_All_in_One = "All in One";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Sub_Notebook = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry Sub Notebook (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_Sub_Notebook = "Sub Notebook";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Space_Saving = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Space-Saving (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Space_Saving = "Space-Saving";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Lunch_Box = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry Lunch Box (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_Lunch_Box = "Lunch Box";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Main_System_Chassis = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry Main System Chassis (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_Main_System_Chassis = "Main System Chassis";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Expansion_Chassis = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry Expansion Chassis (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_Expansion_Chassis = "Expansion Chassis";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_SubChassis = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry SubChassis (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_SubChassis = "SubChassis";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Bus_Expansion_Chassis = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry Bus Expansion Chassis (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_Bus_Expansion_Chassis = "Bus Expansion Chassis";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Peripheral_Chassis = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry Peripheral Chassis (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_Peripheral_Chassis = "Peripheral Chassis";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Storage_Chassis = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry Storage Chassis (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_Storage_Chassis = "Storage Chassis";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_SMBIOS_Reseved = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry SMBIOS Reseved (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_SMBIOS_Reseved = "SMBIOS Reseved";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Sealed_Case_PC = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry Sealed-Case PC (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_Sealed_Case_PC = "Sealed-Case PC";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SMBIOS_Reserved = new javax.cim.UnsignedInteger16(
                "25");

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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@47604760
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_SMBIOS_Reserved.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_SMBIOS_Reserved;
            }

            if (VALUE_ENTRY_Desktop.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Desktop;
            }

            if (VALUE_ENTRY_Low_Profile_Desktop.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Low_Profile_Desktop;
            }

            if (VALUE_ENTRY_Pizza_Box.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Pizza_Box;
            }

            if (VALUE_ENTRY_Mini_Tower.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Mini_Tower;
            }

            if (VALUE_ENTRY_Tower.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Tower;
            }

            if (VALUE_ENTRY_Portable.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Portable;
            }

            if (VALUE_ENTRY_LapTop.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_LapTop;
            }

            if (VALUE_ENTRY_Notebook.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Notebook;
            }

            if (VALUE_ENTRY_Hand_Held.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Hand_Held;
            }

            if (VALUE_ENTRY_Docking_Station.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Docking_Station;
            }

            if (VALUE_ENTRY_All_in_One.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_All_in_One;
            }

            if (VALUE_ENTRY_Sub_Notebook.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Sub_Notebook;
            }

            if (VALUE_ENTRY_Space_Saving.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Space_Saving;
            }

            if (VALUE_ENTRY_Lunch_Box.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Lunch_Box;
            }

            if (VALUE_ENTRY_Main_System_Chassis.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Main_System_Chassis;
            }

            if (VALUE_ENTRY_Expansion_Chassis.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Expansion_Chassis;
            }

            if (VALUE_ENTRY_SubChassis.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_SubChassis;
            }

            if (VALUE_ENTRY_Bus_Expansion_Chassis.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Bus_Expansion_Chassis;
            }

            if (VALUE_ENTRY_Peripheral_Chassis.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Peripheral_Chassis;
            }

            if (VALUE_ENTRY_Storage_Chassis.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Storage_Chassis;
            }

            if (VALUE_ENTRY_SMBIOS_Reseved.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_SMBIOS_Reseved;
            }

            if (VALUE_ENTRY_Sealed_Case_PC.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Sealed_Case_PC;
            }

            if (VALUE_ENTRY_SMBIOS_Reserved.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SMBIOS_Reserved;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_SMBIOS_Reserved.intValue()) {
                return VALUE_ENTRY_SMBIOS_Reserved;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Desktop.intValue()) {
                return VALUE_ENTRY_Desktop;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Low_Profile_Desktop.intValue()) {
                return VALUE_ENTRY_Low_Profile_Desktop;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Pizza_Box.intValue()) {
                return VALUE_ENTRY_Pizza_Box;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Mini_Tower.intValue()) {
                return VALUE_ENTRY_Mini_Tower;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Tower.intValue()) {
                return VALUE_ENTRY_Tower;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Portable.intValue()) {
                return VALUE_ENTRY_Portable;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_LapTop.intValue()) {
                return VALUE_ENTRY_LapTop;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Notebook.intValue()) {
                return VALUE_ENTRY_Notebook;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Hand_Held.intValue()) {
                return VALUE_ENTRY_Hand_Held;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Docking_Station.intValue()) {
                return VALUE_ENTRY_Docking_Station;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_All_in_One.intValue()) {
                return VALUE_ENTRY_All_in_One;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Sub_Notebook.intValue()) {
                return VALUE_ENTRY_Sub_Notebook;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Space_Saving.intValue()) {
                return VALUE_ENTRY_Space_Saving;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Lunch_Box.intValue()) {
                return VALUE_ENTRY_Lunch_Box;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Main_System_Chassis.intValue()) {
                return VALUE_ENTRY_Main_System_Chassis;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Expansion_Chassis.intValue()) {
                return VALUE_ENTRY_Expansion_Chassis;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_SubChassis.intValue()) {
                return VALUE_ENTRY_SubChassis;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Bus_Expansion_Chassis.intValue()) {
                return VALUE_ENTRY_Bus_Expansion_Chassis;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Peripheral_Chassis.intValue()) {
                return VALUE_ENTRY_Peripheral_Chassis;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Storage_Chassis.intValue()) {
                return VALUE_ENTRY_Storage_Chassis;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_SMBIOS_Reseved.intValue()) {
                return VALUE_ENTRY_SMBIOS_Reseved;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Sealed_Case_PC.intValue()) {
                return VALUE_ENTRY_Sealed_Case_PC;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SMBIOS_Reserved.intValue()) {
                return VALUE_ENTRY_SMBIOS_Reserved;
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
         * Value Map for the property ChassisPackageType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_SMBIOS_Reserved,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Desktop,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Low_Profile_Desktop,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Pizza_Box,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Mini_Tower,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Tower,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Portable,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_LapTop,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Notebook,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Hand_Held,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Docking_Station,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_All_in_One,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Sub_Notebook,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Space_Saving,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Lunch_Box,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Main_System_Chassis,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Expansion_Chassis,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_SubChassis,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Bus_Expansion_Chassis,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Peripheral_Chassis,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Storage_Chassis,
                VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_SMBIOS_Reseved,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Sealed_Case_PC,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SMBIOS_Reserved };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ChassisPackageType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_SMBIOS_Reserved, VALUE_ENTRY_Desktop, VALUE_ENTRY_Low_Profile_Desktop,
                VALUE_ENTRY_Pizza_Box, VALUE_ENTRY_Mini_Tower, VALUE_ENTRY_Tower,
                VALUE_ENTRY_Portable, VALUE_ENTRY_LapTop, VALUE_ENTRY_Notebook,
                VALUE_ENTRY_Hand_Held, VALUE_ENTRY_Docking_Station, VALUE_ENTRY_All_in_One,
                VALUE_ENTRY_Sub_Notebook, VALUE_ENTRY_Space_Saving, VALUE_ENTRY_Lunch_Box,
                VALUE_ENTRY_Main_System_Chassis, VALUE_ENTRY_Expansion_Chassis,
                VALUE_ENTRY_SubChassis, VALUE_ENTRY_Bus_Expansion_Chassis,
                VALUE_ENTRY_Peripheral_Chassis, VALUE_ENTRY_Storage_Chassis,
                VALUE_ENTRY_SMBIOS_Reseved, VALUE_ENTRY_Sealed_Case_PC, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ChassisPackageType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_SMBIOS_Reserved, VALUE_ENTRY_Desktop,
                VALUE_ENTRY_Low_Profile_Desktop, VALUE_ENTRY_Pizza_Box, VALUE_ENTRY_Mini_Tower,
                VALUE_ENTRY_Tower, VALUE_ENTRY_Portable, VALUE_ENTRY_LapTop, VALUE_ENTRY_Notebook,
                VALUE_ENTRY_Hand_Held, VALUE_ENTRY_Docking_Station, VALUE_ENTRY_All_in_One,
                VALUE_ENTRY_Sub_Notebook, VALUE_ENTRY_Space_Saving, VALUE_ENTRY_Lunch_Box,
                VALUE_ENTRY_Main_System_Chassis, VALUE_ENTRY_Expansion_Chassis,
                VALUE_ENTRY_SubChassis, VALUE_ENTRY_Bus_Expansion_Chassis,
                VALUE_ENTRY_Peripheral_Chassis, VALUE_ENTRY_Storage_Chassis,
                VALUE_ENTRY_SMBIOS_Reseved, VALUE_ENTRY_Sealed_Case_PC };

    }

    /**
     * Constants of property ChassisTypeDescription
     * A string providing more information on the ChassisPackageType.
     */
    public static class PROPERTY_CHASSISTYPEDESCRIPTION {
        /**
         * name of the property ChassisTypeDescription
         */
        public final static String NAME = "ChassisTypeDescription";

    }

    /**
     * Constants of property ChassisTypes
     * The use of this property is deprecated in lieu of ChassisPackageType. A physical package should not have multiple form factors. Therefore, this property is being deprecated in lieu of a single value property. 
     * An enumerated, integer-valued array indicating the type of Chassis.
     */
    public static class PROPERTY_CHASSISTYPES {
        /**
         * name of the property ChassisTypes
         */
        public final static String NAME = "ChassisTypes";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Desktop = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Desktop (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Desktop = "Desktop";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Low_Profile_Desktop = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Low Profile Desktop (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Low_Profile_Desktop = "Low Profile Desktop";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Pizza_Box = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Pizza Box (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Pizza_Box = "Pizza Box";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Mini_Tower = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Mini Tower (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Mini_Tower = "Mini Tower";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Tower = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Tower (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Tower = "Tower";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Portable = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Portable (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Portable = "Portable";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_LapTop = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry LapTop (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_LapTop = "LapTop";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Notebook = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Notebook (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Notebook = "Notebook";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Hand_Held = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Hand Held (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Hand_Held = "Hand Held";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Docking_Station = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Docking Station (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Docking_Station = "Docking Station";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_All_in_One = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry All in One (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_All_in_One = "All in One";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Sub_Notebook = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry Sub Notebook (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_Sub_Notebook = "Sub Notebook";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Space_Saving = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Space-Saving (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Space_Saving = "Space-Saving";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Lunch_Box = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry Lunch Box (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_Lunch_Box = "Lunch Box";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Main_System_Chassis = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry Main System Chassis (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_Main_System_Chassis = "Main System Chassis";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Expansion_Chassis = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry Expansion Chassis (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_Expansion_Chassis = "Expansion Chassis";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_SubChassis = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry SubChassis (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_SubChassis = "SubChassis";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Bus_Expansion_Chassis = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry Bus Expansion Chassis (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_Bus_Expansion_Chassis = "Bus Expansion Chassis";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Peripheral_Chassis = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry Peripheral Chassis (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_Peripheral_Chassis = "Peripheral Chassis";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Storage_Chassis = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry Storage Chassis (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_Storage_Chassis = "Storage Chassis";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Rack_Mount_Chassis = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry Rack Mount Chassis (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_Rack_Mount_Chassis = "Rack Mount Chassis";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Sealed_Case_PC = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry Sealed-Case PC (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_Sealed_Case_PC = "Sealed-Case PC";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Multi_system_Chassis = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry Multi-system Chassis (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_Multi_system_Chassis = "Multi-system Chassis";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@488a488a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Desktop.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Desktop;
            }

            if (VALUE_ENTRY_Low_Profile_Desktop.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Low_Profile_Desktop;
            }

            if (VALUE_ENTRY_Pizza_Box.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Pizza_Box;
            }

            if (VALUE_ENTRY_Mini_Tower.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Mini_Tower;
            }

            if (VALUE_ENTRY_Tower.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Tower;
            }

            if (VALUE_ENTRY_Portable.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Portable;
            }

            if (VALUE_ENTRY_LapTop.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_LapTop;
            }

            if (VALUE_ENTRY_Notebook.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Notebook;
            }

            if (VALUE_ENTRY_Hand_Held.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Hand_Held;
            }

            if (VALUE_ENTRY_Docking_Station.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Docking_Station;
            }

            if (VALUE_ENTRY_All_in_One.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_All_in_One;
            }

            if (VALUE_ENTRY_Sub_Notebook.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Sub_Notebook;
            }

            if (VALUE_ENTRY_Space_Saving.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Space_Saving;
            }

            if (VALUE_ENTRY_Lunch_Box.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Lunch_Box;
            }

            if (VALUE_ENTRY_Main_System_Chassis.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Main_System_Chassis;
            }

            if (VALUE_ENTRY_Expansion_Chassis.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Expansion_Chassis;
            }

            if (VALUE_ENTRY_SubChassis.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_SubChassis;
            }

            if (VALUE_ENTRY_Bus_Expansion_Chassis.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Bus_Expansion_Chassis;
            }

            if (VALUE_ENTRY_Peripheral_Chassis.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Peripheral_Chassis;
            }

            if (VALUE_ENTRY_Storage_Chassis.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Storage_Chassis;
            }

            if (VALUE_ENTRY_Rack_Mount_Chassis.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Rack_Mount_Chassis;
            }

            if (VALUE_ENTRY_Sealed_Case_PC.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Sealed_Case_PC;
            }

            if (VALUE_ENTRY_Multi_system_Chassis.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Multi_system_Chassis;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Desktop.intValue()) {
                return VALUE_ENTRY_Desktop;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Low_Profile_Desktop.intValue()) {
                return VALUE_ENTRY_Low_Profile_Desktop;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Pizza_Box.intValue()) {
                return VALUE_ENTRY_Pizza_Box;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Mini_Tower.intValue()) {
                return VALUE_ENTRY_Mini_Tower;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Tower.intValue()) {
                return VALUE_ENTRY_Tower;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Portable.intValue()) {
                return VALUE_ENTRY_Portable;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_LapTop.intValue()) {
                return VALUE_ENTRY_LapTop;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Notebook.intValue()) {
                return VALUE_ENTRY_Notebook;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Hand_Held.intValue()) {
                return VALUE_ENTRY_Hand_Held;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Docking_Station.intValue()) {
                return VALUE_ENTRY_Docking_Station;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_All_in_One.intValue()) {
                return VALUE_ENTRY_All_in_One;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Sub_Notebook.intValue()) {
                return VALUE_ENTRY_Sub_Notebook;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Space_Saving.intValue()) {
                return VALUE_ENTRY_Space_Saving;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Lunch_Box.intValue()) {
                return VALUE_ENTRY_Lunch_Box;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Main_System_Chassis.intValue()) {
                return VALUE_ENTRY_Main_System_Chassis;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Expansion_Chassis.intValue()) {
                return VALUE_ENTRY_Expansion_Chassis;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_SubChassis.intValue()) {
                return VALUE_ENTRY_SubChassis;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Bus_Expansion_Chassis.intValue()) {
                return VALUE_ENTRY_Bus_Expansion_Chassis;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Peripheral_Chassis.intValue()) {
                return VALUE_ENTRY_Peripheral_Chassis;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Storage_Chassis.intValue()) {
                return VALUE_ENTRY_Storage_Chassis;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Rack_Mount_Chassis.intValue()) {
                return VALUE_ENTRY_Rack_Mount_Chassis;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Sealed_Case_PC.intValue()) {
                return VALUE_ENTRY_Sealed_Case_PC;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Multi_system_Chassis.intValue()) {
                return VALUE_ENTRY_Multi_system_Chassis;
            }
            return null;

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
         * Value Map for the property ChassisTypes   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Desktop,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Low_Profile_Desktop,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Pizza_Box,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Mini_Tower,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Tower,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Portable,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_LapTop,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Notebook,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Hand_Held,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Docking_Station,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_All_in_One,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Sub_Notebook,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Space_Saving,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Lunch_Box,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Main_System_Chassis,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Expansion_Chassis,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_SubChassis,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Bus_Expansion_Chassis,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Peripheral_Chassis,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Storage_Chassis,
                VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Rack_Mount_Chassis,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Sealed_Case_PC,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Multi_system_Chassis };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ChassisTypes   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Desktop, VALUE_ENTRY_Low_Profile_Desktop, VALUE_ENTRY_Pizza_Box,
                VALUE_ENTRY_Mini_Tower, VALUE_ENTRY_Tower, VALUE_ENTRY_Portable,
                VALUE_ENTRY_LapTop, VALUE_ENTRY_Notebook, VALUE_ENTRY_Hand_Held,
                VALUE_ENTRY_Docking_Station, VALUE_ENTRY_All_in_One, VALUE_ENTRY_Sub_Notebook,
                VALUE_ENTRY_Space_Saving, VALUE_ENTRY_Lunch_Box, VALUE_ENTRY_Main_System_Chassis,
                VALUE_ENTRY_Expansion_Chassis, VALUE_ENTRY_SubChassis,
                VALUE_ENTRY_Bus_Expansion_Chassis, VALUE_ENTRY_Peripheral_Chassis,
                VALUE_ENTRY_Storage_Chassis, VALUE_ENTRY_Rack_Mount_Chassis,
                VALUE_ENTRY_Sealed_Case_PC, VALUE_ENTRY_Multi_system_Chassis };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ChassisTypes   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Desktop, VALUE_ENTRY_Low_Profile_Desktop,
                VALUE_ENTRY_Pizza_Box, VALUE_ENTRY_Mini_Tower, VALUE_ENTRY_Tower,
                VALUE_ENTRY_Portable, VALUE_ENTRY_LapTop, VALUE_ENTRY_Notebook,
                VALUE_ENTRY_Hand_Held, VALUE_ENTRY_Docking_Station, VALUE_ENTRY_All_in_One,
                VALUE_ENTRY_Sub_Notebook, VALUE_ENTRY_Space_Saving, VALUE_ENTRY_Lunch_Box,
                VALUE_ENTRY_Main_System_Chassis, VALUE_ENTRY_Expansion_Chassis,
                VALUE_ENTRY_SubChassis, VALUE_ENTRY_Bus_Expansion_Chassis,
                VALUE_ENTRY_Peripheral_Chassis, VALUE_ENTRY_Storage_Chassis,
                VALUE_ENTRY_Rack_Mount_Chassis, VALUE_ENTRY_Sealed_Case_PC,
                VALUE_ENTRY_Multi_system_Chassis };

    }

    /**
     * Constants of property CurrentRequiredOrProduced
     * Current required by the Chassis at 120V. If power is provided by the Chassis (as in the case of a UPS), this property may indicate the amperage produced, as a negative number.
     */
    public static class PROPERTY_CURRENTREQUIREDORPRODUCED {
        /**
         * name of the property CurrentRequiredOrProduced
         */
        public final static String NAME = "CurrentRequiredOrProduced";

    }

    /**
     * Constants of property HeatGeneration
     * Amount of heat generated by the Chassis in BTU/hour.
     */
    public static class PROPERTY_HEATGENERATION {
        /**
         * name of the property HeatGeneration
         */
        public final static String NAME = "HeatGeneration";

    }

    /**
     * Constants of property MultipleSystemSupport
     * MultipleSystemSupport indicates whether or not this chassis supports multiple systems, for example server blades.
     */
    public static class PROPERTY_MULTIPLESYSTEMSUPPORT {
        /**
         * name of the property MultipleSystemSupport
         */
        public final static String NAME = "MultipleSystemSupport";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_True = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry True (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_True = "True";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_False = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry False (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_False = "False";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@6a726a72
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_True.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_True;
            }

            if (VALUE_ENTRY_False.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_False;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_True.intValue()) {
                return VALUE_ENTRY_True;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_False.intValue()) {
                return VALUE_ENTRY_False;
            }
            return null;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property MultipleSystemSupport   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_True,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_False };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property MultipleSystemSupport   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_True,
                VALUE_ENTRY_False };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property MultipleSystemSupport   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_True, VALUE_ENTRY_False };

    }

    /**
     * Constants of property NumberOfPowerCords
     * Integer indicating the number of power cords which must be connected to the Chassis, for all the componentry to operate.
     */
    public static class PROPERTY_NUMBEROFPOWERCORDS {
        /**
         * name of the property NumberOfPowerCords
         */
        public final static String NAME = "NumberOfPowerCords";

    }

    /**
     * Constants of property RackMountable
     * RackMountable indicates whether or not the chassis is Rack Mountable.
     */
    public static class PROPERTY_RACKMOUNTABLE {
        /**
         * name of the property RackMountable
         */
        public final static String NAME = "RackMountable";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_True = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry True (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_True = "True";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_False = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry False (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_False = "False";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@52645264
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_True.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_True;
            }

            if (VALUE_ENTRY_False.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_False;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_True.intValue()) {
                return VALUE_ENTRY_True;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_False.intValue()) {
                return VALUE_ENTRY_False;
            }
            return null;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property RackMountable   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_True,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_False };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RackMountable   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_True,
                VALUE_ENTRY_False };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RackMountable   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_True, VALUE_ENTRY_False };

    }

    /**
     * Constants of property TypeDescriptions
     * The use of this property is deprecated in lieu of a single value property, ChassisTypeDescription. 
     * An array of free-form strings providing more information on the ChassisTypes array entries. Note, each entry of this array is related to the entry in ChassisTypes that is located at the same index.
     */
    public static class PROPERTY_TYPEDESCRIPTIONS {
        /**
         * name of the property TypeDescriptions
         */
        public final static String NAME = "TypeDescriptions";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_PhysicalFrame.getPackages();

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
     *   The Chassis class represents the PhysicalElements that enclose other Elements and provide definable functionality, such as a desktop, processing node, UPS, disk or tape storage, or a combination of these.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Chassis(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The Chassis class represents the PhysicalElements that enclose other Elements and provide definable functionality, such as a desktop, processing node, UPS, disk or tape storage, or a combination of these.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Chassis(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Chassis() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ChassisPackageType", new CIMProperty("ChassisPackageType",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ChassisTypeDescription", new CIMProperty("ChassisTypeDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ChassisTypes", new CIMProperty("ChassisTypes",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("CurrentRequiredOrProduced", new CIMProperty(
                "CurrentRequiredOrProduced", CIMDataType.SINT16_T, null));
        propertiesToCheck.put("HeatGeneration", new CIMProperty("HeatGeneration",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("MultipleSystemSupport", new CIMProperty("MultipleSystemSupport",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("NumberOfPowerCords", new CIMProperty("NumberOfPowerCords",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("RackMountable", new CIMProperty("RackMountable",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("TypeDescriptions", new CIMProperty("TypeDescriptions",
                CIMDataType.STRING_ARRAY_T, null));

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
     * Get the property ChassisPackageType
     *     * <br>
     * ChassisPackageType indicates the physical form factor for the type of Chassis.
     *     */

    public javax.cim.UnsignedInteger16 get_ChassisPackageType() {
        CIMProperty currentProperty = getProperty(PROPERTY_CHASSISPACKAGETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CHASSISPACKAGETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ChassisPackageType
     * <br>
     * ChassisPackageType indicates the physical form factor for the type of Chassis.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ChassisPackageType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CHASSISPACKAGETYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ChassisPackageType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CHASSISPACKAGETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ChassisPackageType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ChassisPackageType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Chassis fco = new CIM_Chassis(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CHASSISPACKAGETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_ChassisPackageType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CHASSISPACKAGETYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ChassisPackageType
     * <br>
     * ChassisPackageType indicates the physical form factor for the type of Chassis.
     */

    private static CIMProperty setPropertyValue_ChassisPackageType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ChassisTypeDescription
     *     * <br>
     * A string providing more information on the ChassisPackageType.
     *     */

    public String get_ChassisTypeDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_CHASSISTYPEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CHASSISTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ChassisTypeDescription
     * <br>
     * A string providing more information on the ChassisPackageType.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ChassisTypeDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CHASSISTYPEDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ChassisTypeDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CHASSISTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ChassisTypeDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ChassisTypeDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Chassis fco = new CIM_Chassis(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CHASSISTYPEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_ChassisTypeDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CHASSISTYPEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ChassisTypeDescription
     * <br>
     * A string providing more information on the ChassisPackageType.
     */

    private static CIMProperty setPropertyValue_ChassisTypeDescription(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ChassisTypes
     *     * <br>
     * The use of this property is deprecated in lieu of ChassisPackageType. A physical package should not have multiple form factors. Therefore, this property is being deprecated in lieu of a single value property. 
     * An enumerated, integer-valued array indicating the type of Chassis.
     *     */

    public javax.cim.UnsignedInteger16[] get_ChassisTypes() {
        CIMProperty currentProperty = getProperty(PROPERTY_CHASSISTYPES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CHASSISTYPES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property ChassisTypes
     * <br>
     * The use of this property is deprecated in lieu of ChassisPackageType. A physical package should not have multiple form factors. Therefore, this property is being deprecated in lieu of a single value property. 
     * An enumerated, integer-valued array indicating the type of Chassis.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ChassisTypes(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CHASSISTYPES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ChassisTypes(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CHASSISTYPES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ChassisTypes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ChassisTypes(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_Chassis fco = new CIM_Chassis(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CHASSISTYPES.NAME);
        if (property != null) {
            property = setPropertyValue_ChassisTypes(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CHASSISTYPES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ChassisTypes
     * <br>
     * The use of this property is deprecated in lieu of ChassisPackageType. A physical package should not have multiple form factors. Therefore, this property is being deprecated in lieu of a single value property. 
     * An enumerated, integer-valued array indicating the type of Chassis.
     */

    private static CIMProperty setPropertyValue_ChassisTypes(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CurrentRequiredOrProduced
     *     * <br>
     * Current required by the Chassis at 120V. If power is provided by the Chassis (as in the case of a UPS), this property may indicate the amperage produced, as a negative number.
     *     */

    public Short get_CurrentRequiredOrProduced() {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTREQUIREDORPRODUCED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CURRENTREQUIREDORPRODUCED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Short) currentProperty.getValue();

    }

    /**
     * Set the property CurrentRequiredOrProduced
     * <br>
     * Current required by the Chassis at 120V. If power is provided by the Chassis (as in the case of a UPS), this property may indicate the amperage produced, as a negative number.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CurrentRequiredOrProduced(Short newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTREQUIREDORPRODUCED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CurrentRequiredOrProduced(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTREQUIREDORPRODUCED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CurrentRequiredOrProduced by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CurrentRequiredOrProduced(WBEMClient client, String namespace,
            Short newValue) throws WbemsmtException {
        CIM_Chassis fco = new CIM_Chassis(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CURRENTREQUIREDORPRODUCED.NAME);
        if (property != null) {
            property = setPropertyValue_CurrentRequiredOrProduced(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTREQUIREDORPRODUCED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CurrentRequiredOrProduced
     * <br>
     * Current required by the Chassis at 120V. If power is provided by the Chassis (as in the case of a UPS), this property may indicate the amperage produced, as a negative number.
     */

    private static CIMProperty setPropertyValue_CurrentRequiredOrProduced(
            CIMProperty currentProperty, Short newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property HeatGeneration
     *     * <br>
     * Amount of heat generated by the Chassis in BTU/hour.
     *     */

    public javax.cim.UnsignedInteger16 get_HeatGeneration() {
        CIMProperty currentProperty = getProperty(PROPERTY_HEATGENERATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_HEATGENERATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property HeatGeneration
     * <br>
     * Amount of heat generated by the Chassis in BTU/hour.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_HeatGeneration(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HEATGENERATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_HeatGeneration(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_HEATGENERATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property HeatGeneration by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_HeatGeneration(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Chassis fco = new CIM_Chassis(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HEATGENERATION.NAME);
        if (property != null) {
            property = setPropertyValue_HeatGeneration(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_HEATGENERATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property HeatGeneration
     * <br>
     * Amount of heat generated by the Chassis in BTU/hour.
     */

    private static CIMProperty setPropertyValue_HeatGeneration(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MultipleSystemSupport
     *     * <br>
     * MultipleSystemSupport indicates whether or not this chassis supports multiple systems, for example server blades.
     *     */

    public javax.cim.UnsignedInteger16 get_MultipleSystemSupport() {
        CIMProperty currentProperty = getProperty(PROPERTY_MULTIPLESYSTEMSUPPORT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MULTIPLESYSTEMSUPPORT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property MultipleSystemSupport
     * <br>
     * MultipleSystemSupport indicates whether or not this chassis supports multiple systems, for example server blades.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MultipleSystemSupport(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MULTIPLESYSTEMSUPPORT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MultipleSystemSupport(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MULTIPLESYSTEMSUPPORT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MultipleSystemSupport by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MultipleSystemSupport(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Chassis fco = new CIM_Chassis(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MULTIPLESYSTEMSUPPORT.NAME);
        if (property != null) {
            property = setPropertyValue_MultipleSystemSupport(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MULTIPLESYSTEMSUPPORT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MultipleSystemSupport
     * <br>
     * MultipleSystemSupport indicates whether or not this chassis supports multiple systems, for example server blades.
     */

    private static CIMProperty setPropertyValue_MultipleSystemSupport(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NumberOfPowerCords
     *     * <br>
     * Integer indicating the number of power cords which must be connected to the Chassis, for all the componentry to operate.
     *     */

    public javax.cim.UnsignedInteger16 get_NumberOfPowerCords() {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFPOWERCORDS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NUMBEROFPOWERCORDS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property NumberOfPowerCords
     * <br>
     * Integer indicating the number of power cords which must be connected to the Chassis, for all the componentry to operate.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NumberOfPowerCords(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFPOWERCORDS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NumberOfPowerCords(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFPOWERCORDS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NumberOfPowerCords by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NumberOfPowerCords(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Chassis fco = new CIM_Chassis(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NUMBEROFPOWERCORDS.NAME);
        if (property != null) {
            property = setPropertyValue_NumberOfPowerCords(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFPOWERCORDS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NumberOfPowerCords
     * <br>
     * Integer indicating the number of power cords which must be connected to the Chassis, for all the componentry to operate.
     */

    private static CIMProperty setPropertyValue_NumberOfPowerCords(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RackMountable
     *     * <br>
     * RackMountable indicates whether or not the chassis is Rack Mountable.
     *     */

    public javax.cim.UnsignedInteger16 get_RackMountable() {
        CIMProperty currentProperty = getProperty(PROPERTY_RACKMOUNTABLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RACKMOUNTABLE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RackMountable
     * <br>
     * RackMountable indicates whether or not the chassis is Rack Mountable.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RackMountable(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RACKMOUNTABLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RackMountable(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RACKMOUNTABLE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RackMountable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RackMountable(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Chassis fco = new CIM_Chassis(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RACKMOUNTABLE.NAME);
        if (property != null) {
            property = setPropertyValue_RackMountable(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RACKMOUNTABLE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RackMountable
     * <br>
     * RackMountable indicates whether or not the chassis is Rack Mountable.
     */

    private static CIMProperty setPropertyValue_RackMountable(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TypeDescriptions
     *     * <br>
     * The use of this property is deprecated in lieu of a single value property, ChassisTypeDescription. 
     * An array of free-form strings providing more information on the ChassisTypes array entries. Note, each entry of this array is related to the entry in ChassisTypes that is located at the same index.
     *     */

    public String[] get_TypeDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_TYPEDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TYPEDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property TypeDescriptions
     * <br>
     * The use of this property is deprecated in lieu of a single value property, ChassisTypeDescription. 
     * An array of free-form strings providing more information on the ChassisTypes array entries. Note, each entry of this array is related to the entry in ChassisTypes that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TypeDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TYPEDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TypeDescriptions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TYPEDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TypeDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TypeDescriptions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_Chassis fco = new CIM_Chassis(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TYPEDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_TypeDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TYPEDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TypeDescriptions
     * <br>
     * The use of this property is deprecated in lieu of a single value property, ChassisTypeDescription. 
     * An array of free-form strings providing more information on the ChassisTypes array entries. Note, each entry of this array is related to the entry in ChassisTypes that is located at the same index.
     */

    private static CIMProperty setPropertyValue_TypeDescriptions(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    //**********************************************************************
    // Associators methods     
    //**********************************************************************

    /**
     * Get the list with CIM_Rack objects associated by the association CIM_ChassisInRack
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Rack_CIM_ChassisInRacks(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Rack_CIM_ChassisInRacks(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, CIM_Rack.CIM_CLASS_NAME, null, null,
                false, false, null);

    }

    /**
     * Get the list with CIM_Rack objects associated by the association CIM_ChassisInRack
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Rack_CIM_ChassisInRacks(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Rack_CIM_ChassisInRacks(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_Rack objects associated by the association CIM_ChassisInRack
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Rack_CIM_ChassisInRacks(WBEMClient cimClient,
            String associationClass, String resultClass, String role, String resultRole,
            boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList)
            throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associators(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole, includeQualifiers, includeClassOrigin,
                    propertyList);
        }
        catch (WBEMException e) {
            throw new AssociatorException(e, new AssociatorUserObject(this.getCimObjectPath(),
                    associationClass, resultClass, role, resultRole, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ChassisHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ChassisHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ChassisHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Rack(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_Rack(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_Rack(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ChassisHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ChassisInRack
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Rack_CIM_ChassisInRackNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Rack_CIM_ChassisInRackNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, CIM_Rack.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ChassisInRack
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Rack_CIM_ChassisInRackNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Rack_CIM_ChassisInRackNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ChassisInRack
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Rack_CIM_ChassisInRackNames(WBEMClient cimClient,
            boolean deep, String associationClass, String resultClass, String role,
            String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole);

        }
        catch (WBEMException e) {
            throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK,
                    CIM_Rack.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ChassisHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ChassisHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName()
                                    .equals(CIM_Rack.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ChassisHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_ChassisInRack associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ChassisInRack(WBEMClient cimClient,
            boolean includeQualifiers, boolean includeClassOrigin, String role,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ChassisHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ChassisHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ChassisInRackHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ChassisInRack(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_ChassisInRack(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_ChassisInRack(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ChassisHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get a list of CIMObjectPath items of the associations CIM_ChassisInRack
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ChassisInRack(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ChassisHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ChassisHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ChassisInRack.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ChassisHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_PhysicalPackage objects associated by the association CIM_PackageInChassis
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalPackage_CIM_PackageInChassiss(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_PhysicalPackage_CIM_PackageInChassiss(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, CIM_PhysicalPackage.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalPackage objects associated by the association CIM_PackageInChassis
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalPackage_CIM_PackageInChassiss(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalPackage_CIM_PackageInChassiss(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalPackage objects associated by the association CIM_PackageInChassis
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalPackage_CIM_PackageInChassiss(
            WBEMClient cimClient, String associationClass, String resultClass, String role,
            String resultRole, boolean includeQualifiers, boolean includeClassOrigin,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associators(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole, includeQualifiers, includeClassOrigin,
                    propertyList);
        }
        catch (WBEMException e) {
            throw new AssociatorException(e, new AssociatorUserObject(this.getCimObjectPath(),
                    associationClass, resultClass, role, resultRole, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ChassisHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ChassisHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ChassisHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalPackage(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalPackage(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalPackage(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ChassisHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PackageInChassis
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalPackage_CIM_PackageInChassisNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_PhysicalPackage_CIM_PackageInChassisNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, CIM_PhysicalPackage.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PackageInChassis
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalPackage_CIM_PackageInChassisNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalPackage_CIM_PackageInChassisNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PackageInChassis
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalPackage_CIM_PackageInChassisNames(
            WBEMClient cimClient, boolean deep, String associationClass, String resultClass,
            String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole);

        }
        catch (WBEMException e) {
            throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS,
                    CIM_PhysicalPackage.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ChassisHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ChassisHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PhysicalPackage.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ChassisHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_PackageInChassis associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_PackageInChassis(WBEMClient cimClient,
            boolean includeQualifiers, boolean includeClassOrigin, String role,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ChassisHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ChassisHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PackageInChassisHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PackageInChassis(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_PackageInChassis(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_PackageInChassis(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ChassisHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get a list of CIMObjectPath items of the associations CIM_PackageInChassis
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_PackageInChassis(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ChassisHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ChassisHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PackageInChassis.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ChassisHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_Chassis objects associated by the association CIM_Docked
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_Dockeds(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Chassis_CIM_Dockeds(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED, CIM_Chassis.CIM_CLASS_NAME, null, null,
                false, false, null);

    }

    /**
     * Get the list with CIM_Chassis objects associated by the association CIM_Docked
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_Dockeds(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Chassis_CIM_Dockeds(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED, resultClass, role, resultRole, false, false,
                null);

    }

    /**
     * Get the list with CIM_Chassis objects associated by the association CIM_Docked
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_Dockeds(WBEMClient cimClient,
            String associationClass, String resultClass, String role, String resultRole,
            boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList)
            throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associators(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole, includeQualifiers, includeClassOrigin,
                    propertyList);
        }
        catch (WBEMException e) {
            throw new AssociatorException(e, new AssociatorUserObject(this.getCimObjectPath(),
                    associationClass, resultClass, role, resultRole, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ChassisHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ChassisHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ChassisHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Chassis(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_Chassis(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_Chassis(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ChassisHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_Docked
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_DockedNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Chassis_CIM_DockedNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED, CIM_Chassis.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_Docked
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_DockedNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Chassis_CIM_DockedNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_Docked
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_DockedNames(WBEMClient cimClient,
            boolean deep, String associationClass, String resultClass, String role,
            String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole);

        }
        catch (WBEMException e) {
            throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED,
                    CIM_Chassis.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ChassisHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ChassisHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Chassis.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ChassisHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_Docked associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_Docked(WBEMClient cimClient,
            boolean includeQualifiers, boolean includeClassOrigin, String role,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ChassisHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ChassisHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_DockedHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Docked(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_Docked(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_Docked(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ChassisHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get a list of CIMObjectPath items of the associations CIM_Docked
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_Docked(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_DOCKED, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ChassisHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ChassisHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Docked.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ChassisHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

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
        return CIM_Chassis.CIM_CLASS_NAME;
    }

}