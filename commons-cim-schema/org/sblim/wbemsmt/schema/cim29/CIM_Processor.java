/** 
 * CIM_Processor.java
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
 * Description: Capabilities and management of the Processor LogicalDevice.
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

public class CIM_Processor extends CIM_LogicalDevice {

    public final static String CIM_CLASS_NAME = "CIM_Processor";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Association indicating the processor(s) of a UnitaryComputer System. ComputerSystemProcessor is depreacted in lieu of its superclass, SystemDevice, since it adds no detail and changes none of the cardinalities in the superclass' definition.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR = "CIM_ComputerSystemProcessor";

    /**
     * Constants of property AddressWidth
     * Processor address width in bits.
     */
    public static class PROPERTY_ADDRESSWIDTH {
        /**
         * name of the property AddressWidth
         */
        public final static String NAME = "AddressWidth";

    }

    /**
     * Constants of property CPUStatus
     * The CPUStatus property indicates the current status of the Processor. For example, it may be disabled by the user via BIOS (value=2), or disabled due to a POST error (value= 3). Information in this property can be obtained from SMBIOS, the Type 4 structure, the Status attribute.
     */
    public static class PROPERTY_CPUSTATUS {
        /**
         * name of the property CPUStatus
         */
        public final static String NAME = "CPUStatus";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_CPU_Enabled = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry CPU Enabled (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_CPU_Enabled = "CPU Enabled";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CPU_Disabled_by_User_via_BIOS_Setup = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry CPU Disabled by User via BIOS Setup (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_CPU_Disabled_by_User_via_BIOS_Setup = "CPU Disabled by User via BIOS Setup";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CPU_Disabled_By_BIOS__POST_Error_ = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry CPU Disabled By BIOS (POST Error) (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_CPU_Disabled_By_BIOS__POST_Error_ = "CPU Disabled By BIOS (POST Error)";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CPU_Is_Idle = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry CPU Is Idle (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_CPU_Is_Idle = "CPU Is Idle";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Other = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Other (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@4a404a40
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_CPU_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_CPU_Enabled;
            }

            if (VALUE_ENTRY_CPU_Disabled_by_User_via_BIOS_Setup.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CPU_Disabled_by_User_via_BIOS_Setup;
            }

            if (VALUE_ENTRY_CPU_Disabled_By_BIOS__POST_Error_.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CPU_Disabled_By_BIOS__POST_Error_;
            }

            if (VALUE_ENTRY_CPU_Is_Idle.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CPU_Is_Idle;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Other;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_CPU_Enabled.intValue()) {
                return VALUE_ENTRY_CPU_Enabled;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CPU_Disabled_by_User_via_BIOS_Setup
                    .intValue()) {
                return VALUE_ENTRY_CPU_Disabled_by_User_via_BIOS_Setup;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CPU_Disabled_By_BIOS__POST_Error_
                    .intValue()) {
                return VALUE_ENTRY_CPU_Disabled_By_BIOS__POST_Error_;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CPU_Is_Idle.intValue()) {
                return VALUE_ENTRY_CPU_Is_Idle;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
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
         * Value Map for the property CPUStatus   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_CPU_Enabled,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CPU_Disabled_by_User_via_BIOS_Setup,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CPU_Disabled_By_BIOS__POST_Error_,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CPU_Is_Idle,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Other };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property CPUStatus   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_CPU_Enabled, VALUE_ENTRY_CPU_Disabled_by_User_via_BIOS_Setup,
                VALUE_ENTRY_CPU_Disabled_By_BIOS__POST_Error_, VALUE_ENTRY_CPU_Is_Idle,
                VALUE_ENTRY_Other };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property CPUStatus   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_CPU_Enabled, VALUE_ENTRY_CPU_Disabled_by_User_via_BIOS_Setup,
                VALUE_ENTRY_CPU_Disabled_By_BIOS__POST_Error_, VALUE_ENTRY_CPU_Is_Idle,
                VALUE_ENTRY_Other };

    }

    /**
     * Constants of property CurrentClockSpeed
     * The current speed (in MHz) of this Processor.
     */
    public static class PROPERTY_CURRENTCLOCKSPEED {
        /**
         * name of the property CurrentClockSpeed
         */
        public final static String NAME = "CurrentClockSpeed";

    }

    /**
     * Constants of property DataWidth
     * Processor data width in bits.
     */
    public static class PROPERTY_DATAWIDTH {
        /**
         * name of the property DataWidth
         */
        public final static String NAME = "DataWidth";

    }

    /**
     * Constants of property Family
     * The Processor family type. For example, values include "Pentium(R) processor with MMX(TM) technology" (14) and "68040" (96).
     */
    public static class PROPERTY_FAMILY {
        /**
         * name of the property Family
         */
        public final static String NAME = "Family";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_8086 = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry 8086 (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_8086 = "8086";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_80286 = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry 80286 (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_80286 = "80286";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_80386 = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry 80386 (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_80386 = "80386";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_80486 = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry 80486 (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_80486 = "80486";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_8087 = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry 8087 (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_8087 = "8087";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_80287 = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry 80287 (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_80287 = "80287";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_80387 = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry 80387 (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_80387 = "80387";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_80487 = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry 80487 (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_80487 = "80487";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Pentium_R__brand = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Pentium(R) brand (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Pentium_R__brand = "Pentium(R) brand";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Pentium_R__Pro = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Pentium(R) Pro (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Pentium_R__Pro = "Pentium(R) Pro";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Pentium_R__II = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Pentium(R) II (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Pentium_R__II = "Pentium(R) II";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Pentium_R__processor_with_MMX_TM__technology = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry Pentium(R) processor with MMX(TM) technology (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_Pentium_R__processor_with_MMX_TM__technology = "Pentium(R) processor with MMX(TM) technology";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Celeron_TM_ = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Celeron(TM) (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Celeron_TM_ = "Celeron(TM)";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Pentium_R__II_Xeon_TM_ = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry Pentium(R) II Xeon(TM) (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_Pentium_R__II_Xeon_TM_ = "Pentium(R) II Xeon(TM)";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Pentium_R__III = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry Pentium(R) III (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_Pentium_R__III = "Pentium(R) III";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_M1_Family = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry M1 Family (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_M1_Family = "M1 Family";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_M2_Family = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry M2 Family (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_M2_Family = "M2 Family";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_K5_Family = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry K5 Family (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_K5_Family = "K5 Family";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_K6_Family = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry K6 Family (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_K6_Family = "K6 Family";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_K6_2 = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry K6-2 (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_K6_2 = "K6-2";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_K6_3 = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry K6-3 (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_K6_3 = "K6-3";

        /**
         * constant for value map entry 28
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_AMD_Athlon_TM__Processor_Family = new javax.cim.UnsignedInteger16(
                "28");

        /**
         * constant for value entry AMD Athlon(TM) Processor Family (corresponds to mapEntry 28 )
         */
        public final static String VALUE_ENTRY_AMD_Athlon_TM__Processor_Family = "AMD Athlon(TM) Processor Family";

        /**
         * constant for value map entry 29
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_AMD_R__Duron_TM__Processor = new javax.cim.UnsignedInteger16(
                "29");

        /**
         * constant for value entry AMD(R) Duron(TM) Processor (corresponds to mapEntry 29 )
         */
        public final static String VALUE_ENTRY_AMD_R__Duron_TM__Processor = "AMD(R) Duron(TM) Processor";

        /**
         * constant for value map entry 30
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_AMD29000_Family = new javax.cim.UnsignedInteger16(
                "30");

        /**
         * constant for value entry AMD29000 Family (corresponds to mapEntry 30 )
         */
        public final static String VALUE_ENTRY_AMD29000_Family = "AMD29000 Family";

        /**
         * constant for value map entry 31
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_K6_2_ = new javax.cim.UnsignedInteger16(
                "31");

        /**
         * constant for value entry K6-2+ (corresponds to mapEntry 31 )
         */
        public final static String VALUE_ENTRY_K6_2_ = "K6-2+";

        /**
         * constant for value map entry 32
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Power_PC_Family = new javax.cim.UnsignedInteger16(
                "32");

        /**
         * constant for value entry Power PC Family (corresponds to mapEntry 32 )
         */
        public final static String VALUE_ENTRY_Power_PC_Family = "Power PC Family";

        /**
         * constant for value map entry 33
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_Power_PC_601 = new javax.cim.UnsignedInteger16(
                "33");

        /**
         * constant for value entry Power PC 601 (corresponds to mapEntry 33 )
         */
        public final static String VALUE_ENTRY_Power_PC_601 = "Power PC 601";

        /**
         * constant for value map entry 34
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Power_PC_603 = new javax.cim.UnsignedInteger16(
                "34");

        /**
         * constant for value entry Power PC 603 (corresponds to mapEntry 34 )
         */
        public final static String VALUE_ENTRY_Power_PC_603 = "Power PC 603";

        /**
         * constant for value map entry 35
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Power_PC_603_ = new javax.cim.UnsignedInteger16(
                "35");

        /**
         * constant for value entry Power PC 603+ (corresponds to mapEntry 35 )
         */
        public final static String VALUE_ENTRY_Power_PC_603_ = "Power PC 603+";

        /**
         * constant for value map entry 36
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Power_PC_604 = new javax.cim.UnsignedInteger16(
                "36");

        /**
         * constant for value entry Power PC 604 (corresponds to mapEntry 36 )
         */
        public final static String VALUE_ENTRY_Power_PC_604 = "Power PC 604";

        /**
         * constant for value map entry 37
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Power_PC_620 = new javax.cim.UnsignedInteger16(
                "37");

        /**
         * constant for value entry Power PC 620 (corresponds to mapEntry 37 )
         */
        public final static String VALUE_ENTRY_Power_PC_620 = "Power PC 620";

        /**
         * constant for value map entry 38
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Power_PC_X704 = new javax.cim.UnsignedInteger16(
                "38");

        /**
         * constant for value entry Power PC X704 (corresponds to mapEntry 38 )
         */
        public final static String VALUE_ENTRY_Power_PC_X704 = "Power PC X704";

        /**
         * constant for value map entry 39
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_Power_PC_750 = new javax.cim.UnsignedInteger16(
                "39");

        /**
         * constant for value entry Power PC 750 (corresponds to mapEntry 39 )
         */
        public final static String VALUE_ENTRY_Power_PC_750 = "Power PC 750";

        /**
         * constant for value map entry 48
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Alpha_Family = new javax.cim.UnsignedInteger16(
                "48");

        /**
         * constant for value entry Alpha Family (corresponds to mapEntry 48 )
         */
        public final static String VALUE_ENTRY_Alpha_Family = "Alpha Family";

        /**
         * constant for value map entry 49
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Alpha_21064 = new javax.cim.UnsignedInteger16(
                "49");

        /**
         * constant for value entry Alpha 21064 (corresponds to mapEntry 49 )
         */
        public final static String VALUE_ENTRY_Alpha_21064 = "Alpha 21064";

        /**
         * constant for value map entry 50
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Alpha_21066 = new javax.cim.UnsignedInteger16(
                "50");

        /**
         * constant for value entry Alpha 21066 (corresponds to mapEntry 50 )
         */
        public final static String VALUE_ENTRY_Alpha_21066 = "Alpha 21066";

        /**
         * constant for value map entry 51
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Alpha_21164 = new javax.cim.UnsignedInteger16(
                "51");

        /**
         * constant for value entry Alpha 21164 (corresponds to mapEntry 51 )
         */
        public final static String VALUE_ENTRY_Alpha_21164 = "Alpha 21164";

        /**
         * constant for value map entry 52
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Alpha_21164PC = new javax.cim.UnsignedInteger16(
                "52");

        /**
         * constant for value entry Alpha 21164PC (corresponds to mapEntry 52 )
         */
        public final static String VALUE_ENTRY_Alpha_21164PC = "Alpha 21164PC";

        /**
         * constant for value map entry 53
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Alpha_21164a = new javax.cim.UnsignedInteger16(
                "53");

        /**
         * constant for value entry Alpha 21164a (corresponds to mapEntry 53 )
         */
        public final static String VALUE_ENTRY_Alpha_21164a = "Alpha 21164a";

        /**
         * constant for value map entry 54
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Alpha_21264 = new javax.cim.UnsignedInteger16(
                "54");

        /**
         * constant for value entry Alpha 21264 (corresponds to mapEntry 54 )
         */
        public final static String VALUE_ENTRY_Alpha_21264 = "Alpha 21264";

        /**
         * constant for value map entry 55
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Alpha_21364 = new javax.cim.UnsignedInteger16(
                "55");

        /**
         * constant for value entry Alpha 21364 (corresponds to mapEntry 55 )
         */
        public final static String VALUE_ENTRY_Alpha_21364 = "Alpha 21364";

        /**
         * constant for value map entry 64
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_MIPS_Family = new javax.cim.UnsignedInteger16(
                "64");

        /**
         * constant for value entry MIPS Family (corresponds to mapEntry 64 )
         */
        public final static String VALUE_ENTRY_MIPS_Family = "MIPS Family";

        /**
         * constant for value map entry 65
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_MIPS_R4000 = new javax.cim.UnsignedInteger16(
                "65");

        /**
         * constant for value entry MIPS R4000 (corresponds to mapEntry 65 )
         */
        public final static String VALUE_ENTRY_MIPS_R4000 = "MIPS R4000";

        /**
         * constant for value map entry 66
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_MIPS_R4200 = new javax.cim.UnsignedInteger16(
                "66");

        /**
         * constant for value entry MIPS R4200 (corresponds to mapEntry 66 )
         */
        public final static String VALUE_ENTRY_MIPS_R4200 = "MIPS R4200";

        /**
         * constant for value map entry 67
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_MIPS_R4400 = new javax.cim.UnsignedInteger16(
                "67");

        /**
         * constant for value entry MIPS R4400 (corresponds to mapEntry 67 )
         */
        public final static String VALUE_ENTRY_MIPS_R4400 = "MIPS R4400";

        /**
         * constant for value map entry 68
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_MIPS_R4600 = new javax.cim.UnsignedInteger16(
                "68");

        /**
         * constant for value entry MIPS R4600 (corresponds to mapEntry 68 )
         */
        public final static String VALUE_ENTRY_MIPS_R4600 = "MIPS R4600";

        /**
         * constant for value map entry 69
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_MIPS_R10000 = new javax.cim.UnsignedInteger16(
                "69");

        /**
         * constant for value entry MIPS R10000 (corresponds to mapEntry 69 )
         */
        public final static String VALUE_ENTRY_MIPS_R10000 = "MIPS R10000";

        /**
         * constant for value map entry 80
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_SPARC_Family = new javax.cim.UnsignedInteger16(
                "80");

        /**
         * constant for value entry SPARC Family (corresponds to mapEntry 80 )
         */
        public final static String VALUE_ENTRY_SPARC_Family = "SPARC Family";

        /**
         * constant for value map entry 81
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_SuperSPARC = new javax.cim.UnsignedInteger16(
                "81");

        /**
         * constant for value entry SuperSPARC (corresponds to mapEntry 81 )
         */
        public final static String VALUE_ENTRY_SuperSPARC = "SuperSPARC";

        /**
         * constant for value map entry 82
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_microSPARC_II = new javax.cim.UnsignedInteger16(
                "82");

        /**
         * constant for value entry microSPARC II (corresponds to mapEntry 82 )
         */
        public final static String VALUE_ENTRY_microSPARC_II = "microSPARC II";

        /**
         * constant for value map entry 83
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_microSPARC_IIep = new javax.cim.UnsignedInteger16(
                "83");

        /**
         * constant for value entry microSPARC IIep (corresponds to mapEntry 83 )
         */
        public final static String VALUE_ENTRY_microSPARC_IIep = "microSPARC IIep";

        /**
         * constant for value map entry 84
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_UltraSPARC = new javax.cim.UnsignedInteger16(
                "84");

        /**
         * constant for value entry UltraSPARC (corresponds to mapEntry 84 )
         */
        public final static String VALUE_ENTRY_UltraSPARC = "UltraSPARC";

        /**
         * constant for value map entry 85
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_UltraSPARC_II = new javax.cim.UnsignedInteger16(
                "85");

        /**
         * constant for value entry UltraSPARC II (corresponds to mapEntry 85 )
         */
        public final static String VALUE_ENTRY_UltraSPARC_II = "UltraSPARC II";

        /**
         * constant for value map entry 86
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_UltraSPARC_IIi = new javax.cim.UnsignedInteger16(
                "86");

        /**
         * constant for value entry UltraSPARC IIi (corresponds to mapEntry 86 )
         */
        public final static String VALUE_ENTRY_UltraSPARC_IIi = "UltraSPARC IIi";

        /**
         * constant for value map entry 87
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_UltraSPARC_III = new javax.cim.UnsignedInteger16(
                "87");

        /**
         * constant for value entry UltraSPARC III (corresponds to mapEntry 87 )
         */
        public final static String VALUE_ENTRY_UltraSPARC_III = "UltraSPARC III";

        /**
         * constant for value map entry 88
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_UltraSPARC_IIIi = new javax.cim.UnsignedInteger16(
                "88");

        /**
         * constant for value entry UltraSPARC IIIi (corresponds to mapEntry 88 )
         */
        public final static String VALUE_ENTRY_UltraSPARC_IIIi = "UltraSPARC IIIi";

        /**
         * constant for value map entry 96
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_68040 = new javax.cim.UnsignedInteger16(
                "96");

        /**
         * constant for value entry 68040 (corresponds to mapEntry 96 )
         */
        public final static String VALUE_ENTRY_68040 = "68040";

        /**
         * constant for value map entry 97
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_68xxx_Family = new javax.cim.UnsignedInteger16(
                "97");

        /**
         * constant for value entry 68xxx Family (corresponds to mapEntry 97 )
         */
        public final static String VALUE_ENTRY_68xxx_Family = "68xxx Family";

        /**
         * constant for value map entry 98
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_68000 = new javax.cim.UnsignedInteger16(
                "98");

        /**
         * constant for value entry 68000 (corresponds to mapEntry 98 )
         */
        public final static String VALUE_ENTRY_68000 = "68000";

        /**
         * constant for value map entry 99
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_68010 = new javax.cim.UnsignedInteger16(
                "99");

        /**
         * constant for value entry 68010 (corresponds to mapEntry 99 )
         */
        public final static String VALUE_ENTRY_68010 = "68010";

        /**
         * constant for value map entry 100
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_68020 = new javax.cim.UnsignedInteger16(
                "100");

        /**
         * constant for value entry 68020 (corresponds to mapEntry 100 )
         */
        public final static String VALUE_ENTRY_68020 = "68020";

        /**
         * constant for value map entry 101
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_68030 = new javax.cim.UnsignedInteger16(
                "101");

        /**
         * constant for value entry 68030 (corresponds to mapEntry 101 )
         */
        public final static String VALUE_ENTRY_68030 = "68030";

        /**
         * constant for value map entry 112
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Hobbit_Family = new javax.cim.UnsignedInteger16(
                "112");

        /**
         * constant for value entry Hobbit Family (corresponds to mapEntry 112 )
         */
        public final static String VALUE_ENTRY_Hobbit_Family = "Hobbit Family";

        /**
         * constant for value map entry 120
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_Crusoe_TM__TM5000_Family = new javax.cim.UnsignedInteger16(
                "120");

        /**
         * constant for value entry Crusoe(TM) TM5000 Family (corresponds to mapEntry 120 )
         */
        public final static String VALUE_ENTRY_Crusoe_TM__TM5000_Family = "Crusoe(TM) TM5000 Family";

        /**
         * constant for value map entry 121
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_Crusoe_TM__TM3000_Family = new javax.cim.UnsignedInteger16(
                "121");

        /**
         * constant for value entry Crusoe(TM) TM3000 Family (corresponds to mapEntry 121 )
         */
        public final static String VALUE_ENTRY_Crusoe_TM__TM3000_Family = "Crusoe(TM) TM3000 Family";

        /**
         * constant for value map entry 122
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_Efficeon_TM__TM8000_Family = new javax.cim.UnsignedInteger16(
                "122");

        /**
         * constant for value entry Efficeon(TM) TM8000 Family (corresponds to mapEntry 122 )
         */
        public final static String VALUE_ENTRY_Efficeon_TM__TM8000_Family = "Efficeon(TM) TM8000 Family";

        /**
         * constant for value map entry 128
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_Weitek = new javax.cim.UnsignedInteger16(
                "128");

        /**
         * constant for value entry Weitek (corresponds to mapEntry 128 )
         */
        public final static String VALUE_ENTRY_Weitek = "Weitek";

        /**
         * constant for value map entry 130
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Itanium_TM__Processor = new javax.cim.UnsignedInteger16(
                "130");

        /**
         * constant for value entry Itanium(TM) Processor (corresponds to mapEntry 130 )
         */
        public final static String VALUE_ENTRY_Itanium_TM__Processor = "Itanium(TM) Processor";

        /**
         * constant for value map entry 131
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_131_FOR_VALUE_ENTRY_AMD_Athlon_TM__64_Processor_Family = new javax.cim.UnsignedInteger16(
                "131");

        /**
         * constant for value entry AMD Athlon(TM) 64 Processor Family (corresponds to mapEntry 131 )
         */
        public final static String VALUE_ENTRY_AMD_Athlon_TM__64_Processor_Family = "AMD Athlon(TM) 64 Processor Family";

        /**
         * constant for value map entry 132
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_132_FOR_VALUE_ENTRY_AMD_Opteron_TM__Processor_Family = new javax.cim.UnsignedInteger16(
                "132");

        /**
         * constant for value entry AMD Opteron(TM) Processor Family (corresponds to mapEntry 132 )
         */
        public final static String VALUE_ENTRY_AMD_Opteron_TM__Processor_Family = "AMD Opteron(TM) Processor Family";

        /**
         * constant for value map entry 144
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_144_FOR_VALUE_ENTRY_PA_RISC_Family = new javax.cim.UnsignedInteger16(
                "144");

        /**
         * constant for value entry PA-RISC Family (corresponds to mapEntry 144 )
         */
        public final static String VALUE_ENTRY_PA_RISC_Family = "PA-RISC Family";

        /**
         * constant for value map entry 145
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_145_FOR_VALUE_ENTRY_PA_RISC_8500 = new javax.cim.UnsignedInteger16(
                "145");

        /**
         * constant for value entry PA-RISC 8500 (corresponds to mapEntry 145 )
         */
        public final static String VALUE_ENTRY_PA_RISC_8500 = "PA-RISC 8500";

        /**
         * constant for value map entry 146
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_146_FOR_VALUE_ENTRY_PA_RISC_8000 = new javax.cim.UnsignedInteger16(
                "146");

        /**
         * constant for value entry PA-RISC 8000 (corresponds to mapEntry 146 )
         */
        public final static String VALUE_ENTRY_PA_RISC_8000 = "PA-RISC 8000";

        /**
         * constant for value map entry 147
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_147_FOR_VALUE_ENTRY_PA_RISC_7300LC = new javax.cim.UnsignedInteger16(
                "147");

        /**
         * constant for value entry PA-RISC 7300LC (corresponds to mapEntry 147 )
         */
        public final static String VALUE_ENTRY_PA_RISC_7300LC = "PA-RISC 7300LC";

        /**
         * constant for value map entry 148
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_148_FOR_VALUE_ENTRY_PA_RISC_7200 = new javax.cim.UnsignedInteger16(
                "148");

        /**
         * constant for value entry PA-RISC 7200 (corresponds to mapEntry 148 )
         */
        public final static String VALUE_ENTRY_PA_RISC_7200 = "PA-RISC 7200";

        /**
         * constant for value map entry 149
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_149_FOR_VALUE_ENTRY_PA_RISC_7100LC = new javax.cim.UnsignedInteger16(
                "149");

        /**
         * constant for value entry PA-RISC 7100LC (corresponds to mapEntry 149 )
         */
        public final static String VALUE_ENTRY_PA_RISC_7100LC = "PA-RISC 7100LC";

        /**
         * constant for value map entry 150
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_150_FOR_VALUE_ENTRY_PA_RISC_7100 = new javax.cim.UnsignedInteger16(
                "150");

        /**
         * constant for value entry PA-RISC 7100 (corresponds to mapEntry 150 )
         */
        public final static String VALUE_ENTRY_PA_RISC_7100 = "PA-RISC 7100";

        /**
         * constant for value map entry 160
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_160_FOR_VALUE_ENTRY_V30_Family = new javax.cim.UnsignedInteger16(
                "160");

        /**
         * constant for value entry V30 Family (corresponds to mapEntry 160 )
         */
        public final static String VALUE_ENTRY_V30_Family = "V30 Family";

        /**
         * constant for value map entry 176
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_176_FOR_VALUE_ENTRY_Pentium_R__III_Xeon_TM_ = new javax.cim.UnsignedInteger16(
                "176");

        /**
         * constant for value entry Pentium(R) III Xeon(TM) (corresponds to mapEntry 176 )
         */
        public final static String VALUE_ENTRY_Pentium_R__III_Xeon_TM_ = "Pentium(R) III Xeon(TM)";

        /**
         * constant for value map entry 177
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_177_FOR_VALUE_ENTRY_Pentium_R__III_Processor_with_Intel_R__SpeedStep_TM__Technology = new javax.cim.UnsignedInteger16(
                "177");

        /**
         * constant for value entry Pentium(R) III Processor with Intel(R) SpeedStep(TM) Technology (corresponds to mapEntry 177 )
         */
        public final static String VALUE_ENTRY_Pentium_R__III_Processor_with_Intel_R__SpeedStep_TM__Technology = "Pentium(R) III Processor with Intel(R) SpeedStep(TM) Technology";

        /**
         * constant for value map entry 178
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_178_FOR_VALUE_ENTRY_Pentium_R__4 = new javax.cim.UnsignedInteger16(
                "178");

        /**
         * constant for value entry Pentium(R) 4 (corresponds to mapEntry 178 )
         */
        public final static String VALUE_ENTRY_Pentium_R__4 = "Pentium(R) 4";

        /**
         * constant for value map entry 179
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_179_FOR_VALUE_ENTRY_Intel_R__Xeon_TM_ = new javax.cim.UnsignedInteger16(
                "179");

        /**
         * constant for value entry Intel(R) Xeon(TM) (corresponds to mapEntry 179 )
         */
        public final static String VALUE_ENTRY_Intel_R__Xeon_TM_ = "Intel(R) Xeon(TM)";

        /**
         * constant for value map entry 180
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_180_FOR_VALUE_ENTRY_AS400_Family = new javax.cim.UnsignedInteger16(
                "180");

        /**
         * constant for value entry AS400 Family (corresponds to mapEntry 180 )
         */
        public final static String VALUE_ENTRY_AS400_Family = "AS400 Family";

        /**
         * constant for value map entry 181
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_181_FOR_VALUE_ENTRY_Intel_R__Xeon_TM__processor_MP = new javax.cim.UnsignedInteger16(
                "181");

        /**
         * constant for value entry Intel(R) Xeon(TM) processor MP (corresponds to mapEntry 181 )
         */
        public final static String VALUE_ENTRY_Intel_R__Xeon_TM__processor_MP = "Intel(R) Xeon(TM) processor MP";

        /**
         * constant for value map entry 182
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_182_FOR_VALUE_ENTRY_AMD_Athlon_TM__XP_Family = new javax.cim.UnsignedInteger16(
                "182");

        /**
         * constant for value entry AMD Athlon(TM) XP Family (corresponds to mapEntry 182 )
         */
        public final static String VALUE_ENTRY_AMD_Athlon_TM__XP_Family = "AMD Athlon(TM) XP Family";

        /**
         * constant for value map entry 183
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_183_FOR_VALUE_ENTRY_AMD_Athlon_TM__MP_Family = new javax.cim.UnsignedInteger16(
                "183");

        /**
         * constant for value entry AMD Athlon(TM) MP Family (corresponds to mapEntry 183 )
         */
        public final static String VALUE_ENTRY_AMD_Athlon_TM__MP_Family = "AMD Athlon(TM) MP Family";

        /**
         * constant for value map entry 184
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_184_FOR_VALUE_ENTRY_Intel_R__Itanium_R__2 = new javax.cim.UnsignedInteger16(
                "184");

        /**
         * constant for value entry Intel(R) Itanium(R) 2 (corresponds to mapEntry 184 )
         */
        public final static String VALUE_ENTRY_Intel_R__Itanium_R__2 = "Intel(R) Itanium(R) 2";

        /**
         * constant for value map entry 185
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_185_FOR_VALUE_ENTRY_Intel_R__Pentium_R__M_processor = new javax.cim.UnsignedInteger16(
                "185");

        /**
         * constant for value entry Intel(R) Pentium(R) M processor (corresponds to mapEntry 185 )
         */
        public final static String VALUE_ENTRY_Intel_R__Pentium_R__M_processor = "Intel(R) Pentium(R) M processor";

        /**
         * constant for value map entry 190
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_190_FOR_VALUE_ENTRY_K7 = new javax.cim.UnsignedInteger16(
                "190");

        /**
         * constant for value entry K7 (corresponds to mapEntry 190 )
         */
        public final static String VALUE_ENTRY_K7 = "K7";

        /**
         * constant for value map entry 200
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_S_390_and_zSeries_Family = new javax.cim.UnsignedInteger16(
                "200");

        /**
         * constant for value entry S/390 and zSeries Family (corresponds to mapEntry 200 )
         */
        public final static String VALUE_ENTRY_S_390_and_zSeries_Family = "S/390 and zSeries Family";

        /**
         * constant for value map entry 201
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_ESA_390_G4 = new javax.cim.UnsignedInteger16(
                "201");

        /**
         * constant for value entry ESA/390 G4 (corresponds to mapEntry 201 )
         */
        public final static String VALUE_ENTRY_ESA_390_G4 = "ESA/390 G4";

        /**
         * constant for value map entry 202
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_ESA_390_G5 = new javax.cim.UnsignedInteger16(
                "202");

        /**
         * constant for value entry ESA/390 G5 (corresponds to mapEntry 202 )
         */
        public final static String VALUE_ENTRY_ESA_390_G5 = "ESA/390 G5";

        /**
         * constant for value map entry 203
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_203_FOR_VALUE_ENTRY_ESA_390_G6 = new javax.cim.UnsignedInteger16(
                "203");

        /**
         * constant for value entry ESA/390 G6 (corresponds to mapEntry 203 )
         */
        public final static String VALUE_ENTRY_ESA_390_G6 = "ESA/390 G6";

        /**
         * constant for value map entry 204
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_204_FOR_VALUE_ENTRY_z_Architectur_base = new javax.cim.UnsignedInteger16(
                "204");

        /**
         * constant for value entry z/Architectur base (corresponds to mapEntry 204 )
         */
        public final static String VALUE_ENTRY_z_Architectur_base = "z/Architectur base";

        /**
         * constant for value map entry 250
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_250_FOR_VALUE_ENTRY_i860 = new javax.cim.UnsignedInteger16(
                "250");

        /**
         * constant for value entry i860 (corresponds to mapEntry 250 )
         */
        public final static String VALUE_ENTRY_i860 = "i860";

        /**
         * constant for value map entry 251
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_251_FOR_VALUE_ENTRY_i960 = new javax.cim.UnsignedInteger16(
                "251");

        /**
         * constant for value entry i960 (corresponds to mapEntry 251 )
         */
        public final static String VALUE_ENTRY_i960 = "i960";

        /**
         * constant for value map entry 260
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_260_FOR_VALUE_ENTRY_SH_3 = new javax.cim.UnsignedInteger16(
                "260");

        /**
         * constant for value entry SH-3 (corresponds to mapEntry 260 )
         */
        public final static String VALUE_ENTRY_SH_3 = "SH-3";

        /**
         * constant for value map entry 261
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_261_FOR_VALUE_ENTRY_SH_4 = new javax.cim.UnsignedInteger16(
                "261");

        /**
         * constant for value entry SH-4 (corresponds to mapEntry 261 )
         */
        public final static String VALUE_ENTRY_SH_4 = "SH-4";

        /**
         * constant for value map entry 280
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_280_FOR_VALUE_ENTRY_ARM = new javax.cim.UnsignedInteger16(
                "280");

        /**
         * constant for value entry ARM (corresponds to mapEntry 280 )
         */
        public final static String VALUE_ENTRY_ARM = "ARM";

        /**
         * constant for value map entry 281
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_281_FOR_VALUE_ENTRY_StrongARM = new javax.cim.UnsignedInteger16(
                "281");

        /**
         * constant for value entry StrongARM (corresponds to mapEntry 281 )
         */
        public final static String VALUE_ENTRY_StrongARM = "StrongARM";

        /**
         * constant for value map entry 300
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_300_FOR_VALUE_ENTRY_6x86 = new javax.cim.UnsignedInteger16(
                "300");

        /**
         * constant for value entry 6x86 (corresponds to mapEntry 300 )
         */
        public final static String VALUE_ENTRY_6x86 = "6x86";

        /**
         * constant for value map entry 301
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_301_FOR_VALUE_ENTRY_MediaGX = new javax.cim.UnsignedInteger16(
                "301");

        /**
         * constant for value entry MediaGX (corresponds to mapEntry 301 )
         */
        public final static String VALUE_ENTRY_MediaGX = "MediaGX";

        /**
         * constant for value map entry 302
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_302_FOR_VALUE_ENTRY_MII = new javax.cim.UnsignedInteger16(
                "302");

        /**
         * constant for value entry MII (corresponds to mapEntry 302 )
         */
        public final static String VALUE_ENTRY_MII = "MII";

        /**
         * constant for value map entry 320
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_320_FOR_VALUE_ENTRY_WinChip = new javax.cim.UnsignedInteger16(
                "320");

        /**
         * constant for value entry WinChip (corresponds to mapEntry 320 )
         */
        public final static String VALUE_ENTRY_WinChip = "WinChip";

        /**
         * constant for value map entry 350
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_350_FOR_VALUE_ENTRY_DSP = new javax.cim.UnsignedInteger16(
                "350");

        /**
         * constant for value entry DSP (corresponds to mapEntry 350 )
         */
        public final static String VALUE_ENTRY_DSP = "DSP";

        /**
         * constant for value map entry 500
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_500_FOR_VALUE_ENTRY_Video_Processor = new javax.cim.UnsignedInteger16(
                "500");

        /**
         * constant for value entry Video Processor (corresponds to mapEntry 500 )
         */
        public final static String VALUE_ENTRY_Video_Processor = "Video Processor";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@167a167a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_8086.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_8086;
            }

            if (VALUE_ENTRY_80286.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_80286;
            }

            if (VALUE_ENTRY_80386.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_80386;
            }

            if (VALUE_ENTRY_80486.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_80486;
            }

            if (VALUE_ENTRY_8087.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_8087;
            }

            if (VALUE_ENTRY_80287.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_80287;
            }

            if (VALUE_ENTRY_80387.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_80387;
            }

            if (VALUE_ENTRY_80487.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_80487;
            }

            if (VALUE_ENTRY_Pentium_R__brand.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Pentium_R__brand;
            }

            if (VALUE_ENTRY_Pentium_R__Pro.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Pentium_R__Pro;
            }

            if (VALUE_ENTRY_Pentium_R__II.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Pentium_R__II;
            }

            if (VALUE_ENTRY_Pentium_R__processor_with_MMX_TM__technology.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Pentium_R__processor_with_MMX_TM__technology;
            }

            if (VALUE_ENTRY_Celeron_TM_.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Celeron_TM_;
            }

            if (VALUE_ENTRY_Pentium_R__II_Xeon_TM_.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Pentium_R__II_Xeon_TM_;
            }

            if (VALUE_ENTRY_Pentium_R__III.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Pentium_R__III;
            }

            if (VALUE_ENTRY_M1_Family.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_M1_Family;
            }

            if (VALUE_ENTRY_M2_Family.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_M2_Family;
            }

            if (VALUE_ENTRY_K5_Family.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_K5_Family;
            }

            if (VALUE_ENTRY_K6_Family.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_K6_Family;
            }

            if (VALUE_ENTRY_K6_2.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_K6_2;
            }

            if (VALUE_ENTRY_K6_3.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_K6_3;
            }

            if (VALUE_ENTRY_AMD_Athlon_TM__Processor_Family.equals(value)) {
                return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_AMD_Athlon_TM__Processor_Family;
            }

            if (VALUE_ENTRY_AMD_R__Duron_TM__Processor.equals(value)) {
                return VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_AMD_R__Duron_TM__Processor;
            }

            if (VALUE_ENTRY_AMD29000_Family.equals(value)) {
                return VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_AMD29000_Family;
            }

            if (VALUE_ENTRY_K6_2_.equals(value)) {
                return VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_K6_2_;
            }

            if (VALUE_ENTRY_Power_PC_Family.equals(value)) {
                return VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Power_PC_Family;
            }

            if (VALUE_ENTRY_Power_PC_601.equals(value)) {
                return VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_Power_PC_601;
            }

            if (VALUE_ENTRY_Power_PC_603.equals(value)) {
                return VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Power_PC_603;
            }

            if (VALUE_ENTRY_Power_PC_603_.equals(value)) {
                return VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Power_PC_603_;
            }

            if (VALUE_ENTRY_Power_PC_604.equals(value)) {
                return VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Power_PC_604;
            }

            if (VALUE_ENTRY_Power_PC_620.equals(value)) {
                return VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Power_PC_620;
            }

            if (VALUE_ENTRY_Power_PC_X704.equals(value)) {
                return VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Power_PC_X704;
            }

            if (VALUE_ENTRY_Power_PC_750.equals(value)) {
                return VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_Power_PC_750;
            }

            if (VALUE_ENTRY_Alpha_Family.equals(value)) {
                return VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Alpha_Family;
            }

            if (VALUE_ENTRY_Alpha_21064.equals(value)) {
                return VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Alpha_21064;
            }

            if (VALUE_ENTRY_Alpha_21066.equals(value)) {
                return VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Alpha_21066;
            }

            if (VALUE_ENTRY_Alpha_21164.equals(value)) {
                return VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Alpha_21164;
            }

            if (VALUE_ENTRY_Alpha_21164PC.equals(value)) {
                return VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Alpha_21164PC;
            }

            if (VALUE_ENTRY_Alpha_21164a.equals(value)) {
                return VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Alpha_21164a;
            }

            if (VALUE_ENTRY_Alpha_21264.equals(value)) {
                return VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Alpha_21264;
            }

            if (VALUE_ENTRY_Alpha_21364.equals(value)) {
                return VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Alpha_21364;
            }

            if (VALUE_ENTRY_MIPS_Family.equals(value)) {
                return VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_MIPS_Family;
            }

            if (VALUE_ENTRY_MIPS_R4000.equals(value)) {
                return VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_MIPS_R4000;
            }

            if (VALUE_ENTRY_MIPS_R4200.equals(value)) {
                return VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_MIPS_R4200;
            }

            if (VALUE_ENTRY_MIPS_R4400.equals(value)) {
                return VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_MIPS_R4400;
            }

            if (VALUE_ENTRY_MIPS_R4600.equals(value)) {
                return VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_MIPS_R4600;
            }

            if (VALUE_ENTRY_MIPS_R10000.equals(value)) {
                return VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_MIPS_R10000;
            }

            if (VALUE_ENTRY_SPARC_Family.equals(value)) {
                return VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_SPARC_Family;
            }

            if (VALUE_ENTRY_SuperSPARC.equals(value)) {
                return VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_SuperSPARC;
            }

            if (VALUE_ENTRY_microSPARC_II.equals(value)) {
                return VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_microSPARC_II;
            }

            if (VALUE_ENTRY_microSPARC_IIep.equals(value)) {
                return VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_microSPARC_IIep;
            }

            if (VALUE_ENTRY_UltraSPARC.equals(value)) {
                return VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_UltraSPARC;
            }

            if (VALUE_ENTRY_UltraSPARC_II.equals(value)) {
                return VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_UltraSPARC_II;
            }

            if (VALUE_ENTRY_UltraSPARC_IIi.equals(value)) {
                return VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_UltraSPARC_IIi;
            }

            if (VALUE_ENTRY_UltraSPARC_III.equals(value)) {
                return VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_UltraSPARC_III;
            }

            if (VALUE_ENTRY_UltraSPARC_IIIi.equals(value)) {
                return VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_UltraSPARC_IIIi;
            }

            if (VALUE_ENTRY_68040.equals(value)) {
                return VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_68040;
            }

            if (VALUE_ENTRY_68xxx_Family.equals(value)) {
                return VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_68xxx_Family;
            }

            if (VALUE_ENTRY_68000.equals(value)) {
                return VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_68000;
            }

            if (VALUE_ENTRY_68010.equals(value)) {
                return VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_68010;
            }

            if (VALUE_ENTRY_68020.equals(value)) {
                return VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_68020;
            }

            if (VALUE_ENTRY_68030.equals(value)) {
                return VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_68030;
            }

            if (VALUE_ENTRY_Hobbit_Family.equals(value)) {
                return VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Hobbit_Family;
            }

            if (VALUE_ENTRY_Crusoe_TM__TM5000_Family.equals(value)) {
                return VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_Crusoe_TM__TM5000_Family;
            }

            if (VALUE_ENTRY_Crusoe_TM__TM3000_Family.equals(value)) {
                return VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_Crusoe_TM__TM3000_Family;
            }

            if (VALUE_ENTRY_Efficeon_TM__TM8000_Family.equals(value)) {
                return VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_Efficeon_TM__TM8000_Family;
            }

            if (VALUE_ENTRY_Weitek.equals(value)) {
                return VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_Weitek;
            }

            if (VALUE_ENTRY_Itanium_TM__Processor.equals(value)) {
                return VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Itanium_TM__Processor;
            }

            if (VALUE_ENTRY_AMD_Athlon_TM__64_Processor_Family.equals(value)) {
                return VALUE_MAP_ENTRY_131_FOR_VALUE_ENTRY_AMD_Athlon_TM__64_Processor_Family;
            }

            if (VALUE_ENTRY_AMD_Opteron_TM__Processor_Family.equals(value)) {
                return VALUE_MAP_ENTRY_132_FOR_VALUE_ENTRY_AMD_Opteron_TM__Processor_Family;
            }

            if (VALUE_ENTRY_PA_RISC_Family.equals(value)) {
                return VALUE_MAP_ENTRY_144_FOR_VALUE_ENTRY_PA_RISC_Family;
            }

            if (VALUE_ENTRY_PA_RISC_8500.equals(value)) {
                return VALUE_MAP_ENTRY_145_FOR_VALUE_ENTRY_PA_RISC_8500;
            }

            if (VALUE_ENTRY_PA_RISC_8000.equals(value)) {
                return VALUE_MAP_ENTRY_146_FOR_VALUE_ENTRY_PA_RISC_8000;
            }

            if (VALUE_ENTRY_PA_RISC_7300LC.equals(value)) {
                return VALUE_MAP_ENTRY_147_FOR_VALUE_ENTRY_PA_RISC_7300LC;
            }

            if (VALUE_ENTRY_PA_RISC_7200.equals(value)) {
                return VALUE_MAP_ENTRY_148_FOR_VALUE_ENTRY_PA_RISC_7200;
            }

            if (VALUE_ENTRY_PA_RISC_7100LC.equals(value)) {
                return VALUE_MAP_ENTRY_149_FOR_VALUE_ENTRY_PA_RISC_7100LC;
            }

            if (VALUE_ENTRY_PA_RISC_7100.equals(value)) {
                return VALUE_MAP_ENTRY_150_FOR_VALUE_ENTRY_PA_RISC_7100;
            }

            if (VALUE_ENTRY_V30_Family.equals(value)) {
                return VALUE_MAP_ENTRY_160_FOR_VALUE_ENTRY_V30_Family;
            }

            if (VALUE_ENTRY_Pentium_R__III_Xeon_TM_.equals(value)) {
                return VALUE_MAP_ENTRY_176_FOR_VALUE_ENTRY_Pentium_R__III_Xeon_TM_;
            }

            if (VALUE_ENTRY_Pentium_R__III_Processor_with_Intel_R__SpeedStep_TM__Technology
                    .equals(value)) {
                return VALUE_MAP_ENTRY_177_FOR_VALUE_ENTRY_Pentium_R__III_Processor_with_Intel_R__SpeedStep_TM__Technology;
            }

            if (VALUE_ENTRY_Pentium_R__4.equals(value)) {
                return VALUE_MAP_ENTRY_178_FOR_VALUE_ENTRY_Pentium_R__4;
            }

            if (VALUE_ENTRY_Intel_R__Xeon_TM_.equals(value)) {
                return VALUE_MAP_ENTRY_179_FOR_VALUE_ENTRY_Intel_R__Xeon_TM_;
            }

            if (VALUE_ENTRY_AS400_Family.equals(value)) {
                return VALUE_MAP_ENTRY_180_FOR_VALUE_ENTRY_AS400_Family;
            }

            if (VALUE_ENTRY_Intel_R__Xeon_TM__processor_MP.equals(value)) {
                return VALUE_MAP_ENTRY_181_FOR_VALUE_ENTRY_Intel_R__Xeon_TM__processor_MP;
            }

            if (VALUE_ENTRY_AMD_Athlon_TM__XP_Family.equals(value)) {
                return VALUE_MAP_ENTRY_182_FOR_VALUE_ENTRY_AMD_Athlon_TM__XP_Family;
            }

            if (VALUE_ENTRY_AMD_Athlon_TM__MP_Family.equals(value)) {
                return VALUE_MAP_ENTRY_183_FOR_VALUE_ENTRY_AMD_Athlon_TM__MP_Family;
            }

            if (VALUE_ENTRY_Intel_R__Itanium_R__2.equals(value)) {
                return VALUE_MAP_ENTRY_184_FOR_VALUE_ENTRY_Intel_R__Itanium_R__2;
            }

            if (VALUE_ENTRY_Intel_R__Pentium_R__M_processor.equals(value)) {
                return VALUE_MAP_ENTRY_185_FOR_VALUE_ENTRY_Intel_R__Pentium_R__M_processor;
            }

            if (VALUE_ENTRY_K7.equals(value)) {
                return VALUE_MAP_ENTRY_190_FOR_VALUE_ENTRY_K7;
            }

            if (VALUE_ENTRY_S_390_and_zSeries_Family.equals(value)) {
                return VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_S_390_and_zSeries_Family;
            }

            if (VALUE_ENTRY_ESA_390_G4.equals(value)) {
                return VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_ESA_390_G4;
            }

            if (VALUE_ENTRY_ESA_390_G5.equals(value)) {
                return VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_ESA_390_G5;
            }

            if (VALUE_ENTRY_ESA_390_G6.equals(value)) {
                return VALUE_MAP_ENTRY_203_FOR_VALUE_ENTRY_ESA_390_G6;
            }

            if (VALUE_ENTRY_z_Architectur_base.equals(value)) {
                return VALUE_MAP_ENTRY_204_FOR_VALUE_ENTRY_z_Architectur_base;
            }

            if (VALUE_ENTRY_i860.equals(value)) {
                return VALUE_MAP_ENTRY_250_FOR_VALUE_ENTRY_i860;
            }

            if (VALUE_ENTRY_i960.equals(value)) {
                return VALUE_MAP_ENTRY_251_FOR_VALUE_ENTRY_i960;
            }

            if (VALUE_ENTRY_SH_3.equals(value)) {
                return VALUE_MAP_ENTRY_260_FOR_VALUE_ENTRY_SH_3;
            }

            if (VALUE_ENTRY_SH_4.equals(value)) {
                return VALUE_MAP_ENTRY_261_FOR_VALUE_ENTRY_SH_4;
            }

            if (VALUE_ENTRY_ARM.equals(value)) {
                return VALUE_MAP_ENTRY_280_FOR_VALUE_ENTRY_ARM;
            }

            if (VALUE_ENTRY_StrongARM.equals(value)) {
                return VALUE_MAP_ENTRY_281_FOR_VALUE_ENTRY_StrongARM;
            }

            if (VALUE_ENTRY_6x86.equals(value)) {
                return VALUE_MAP_ENTRY_300_FOR_VALUE_ENTRY_6x86;
            }

            if (VALUE_ENTRY_MediaGX.equals(value)) {
                return VALUE_MAP_ENTRY_301_FOR_VALUE_ENTRY_MediaGX;
            }

            if (VALUE_ENTRY_MII.equals(value)) {
                return VALUE_MAP_ENTRY_302_FOR_VALUE_ENTRY_MII;
            }

            if (VALUE_ENTRY_WinChip.equals(value)) {
                return VALUE_MAP_ENTRY_320_FOR_VALUE_ENTRY_WinChip;
            }

            if (VALUE_ENTRY_DSP.equals(value)) {
                return VALUE_MAP_ENTRY_350_FOR_VALUE_ENTRY_DSP;
            }

            if (VALUE_ENTRY_Video_Processor.equals(value)) {
                return VALUE_MAP_ENTRY_500_FOR_VALUE_ENTRY_Video_Processor;
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

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_8086.intValue()) {
                return VALUE_ENTRY_8086;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_80286.intValue()) {
                return VALUE_ENTRY_80286;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_80386.intValue()) {
                return VALUE_ENTRY_80386;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_80486.intValue()) {
                return VALUE_ENTRY_80486;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_8087.intValue()) {
                return VALUE_ENTRY_8087;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_80287.intValue()) {
                return VALUE_ENTRY_80287;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_80387.intValue()) {
                return VALUE_ENTRY_80387;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_80487.intValue()) {
                return VALUE_ENTRY_80487;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Pentium_R__brand.intValue()) {
                return VALUE_ENTRY_Pentium_R__brand;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Pentium_R__Pro.intValue()) {
                return VALUE_ENTRY_Pentium_R__Pro;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Pentium_R__II.intValue()) {
                return VALUE_ENTRY_Pentium_R__II;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Pentium_R__processor_with_MMX_TM__technology
                    .intValue()) {
                return VALUE_ENTRY_Pentium_R__processor_with_MMX_TM__technology;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Celeron_TM_.intValue()) {
                return VALUE_ENTRY_Celeron_TM_;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Pentium_R__II_Xeon_TM_.intValue()) {
                return VALUE_ENTRY_Pentium_R__II_Xeon_TM_;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Pentium_R__III.intValue()) {
                return VALUE_ENTRY_Pentium_R__III;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_M1_Family.intValue()) {
                return VALUE_ENTRY_M1_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_M2_Family.intValue()) {
                return VALUE_ENTRY_M2_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_K5_Family.intValue()) {
                return VALUE_ENTRY_K5_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_K6_Family.intValue()) {
                return VALUE_ENTRY_K6_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_K6_2.intValue()) {
                return VALUE_ENTRY_K6_2;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_K6_3.intValue()) {
                return VALUE_ENTRY_K6_3;
            }

            if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_AMD_Athlon_TM__Processor_Family
                    .intValue()) {
                return VALUE_ENTRY_AMD_Athlon_TM__Processor_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_AMD_R__Duron_TM__Processor.intValue()) {
                return VALUE_ENTRY_AMD_R__Duron_TM__Processor;
            }

            if (iValue == VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_AMD29000_Family.intValue()) {
                return VALUE_ENTRY_AMD29000_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_K6_2_.intValue()) {
                return VALUE_ENTRY_K6_2_;
            }

            if (iValue == VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Power_PC_Family.intValue()) {
                return VALUE_ENTRY_Power_PC_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_Power_PC_601.intValue()) {
                return VALUE_ENTRY_Power_PC_601;
            }

            if (iValue == VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Power_PC_603.intValue()) {
                return VALUE_ENTRY_Power_PC_603;
            }

            if (iValue == VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Power_PC_603_.intValue()) {
                return VALUE_ENTRY_Power_PC_603_;
            }

            if (iValue == VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Power_PC_604.intValue()) {
                return VALUE_ENTRY_Power_PC_604;
            }

            if (iValue == VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Power_PC_620.intValue()) {
                return VALUE_ENTRY_Power_PC_620;
            }

            if (iValue == VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Power_PC_X704.intValue()) {
                return VALUE_ENTRY_Power_PC_X704;
            }

            if (iValue == VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_Power_PC_750.intValue()) {
                return VALUE_ENTRY_Power_PC_750;
            }

            if (iValue == VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Alpha_Family.intValue()) {
                return VALUE_ENTRY_Alpha_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Alpha_21064.intValue()) {
                return VALUE_ENTRY_Alpha_21064;
            }

            if (iValue == VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Alpha_21066.intValue()) {
                return VALUE_ENTRY_Alpha_21066;
            }

            if (iValue == VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Alpha_21164.intValue()) {
                return VALUE_ENTRY_Alpha_21164;
            }

            if (iValue == VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Alpha_21164PC.intValue()) {
                return VALUE_ENTRY_Alpha_21164PC;
            }

            if (iValue == VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Alpha_21164a.intValue()) {
                return VALUE_ENTRY_Alpha_21164a;
            }

            if (iValue == VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Alpha_21264.intValue()) {
                return VALUE_ENTRY_Alpha_21264;
            }

            if (iValue == VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Alpha_21364.intValue()) {
                return VALUE_ENTRY_Alpha_21364;
            }

            if (iValue == VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_MIPS_Family.intValue()) {
                return VALUE_ENTRY_MIPS_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_MIPS_R4000.intValue()) {
                return VALUE_ENTRY_MIPS_R4000;
            }

            if (iValue == VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_MIPS_R4200.intValue()) {
                return VALUE_ENTRY_MIPS_R4200;
            }

            if (iValue == VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_MIPS_R4400.intValue()) {
                return VALUE_ENTRY_MIPS_R4400;
            }

            if (iValue == VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_MIPS_R4600.intValue()) {
                return VALUE_ENTRY_MIPS_R4600;
            }

            if (iValue == VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_MIPS_R10000.intValue()) {
                return VALUE_ENTRY_MIPS_R10000;
            }

            if (iValue == VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_SPARC_Family.intValue()) {
                return VALUE_ENTRY_SPARC_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_SuperSPARC.intValue()) {
                return VALUE_ENTRY_SuperSPARC;
            }

            if (iValue == VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_microSPARC_II.intValue()) {
                return VALUE_ENTRY_microSPARC_II;
            }

            if (iValue == VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_microSPARC_IIep.intValue()) {
                return VALUE_ENTRY_microSPARC_IIep;
            }

            if (iValue == VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_UltraSPARC.intValue()) {
                return VALUE_ENTRY_UltraSPARC;
            }

            if (iValue == VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_UltraSPARC_II.intValue()) {
                return VALUE_ENTRY_UltraSPARC_II;
            }

            if (iValue == VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_UltraSPARC_IIi.intValue()) {
                return VALUE_ENTRY_UltraSPARC_IIi;
            }

            if (iValue == VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_UltraSPARC_III.intValue()) {
                return VALUE_ENTRY_UltraSPARC_III;
            }

            if (iValue == VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_UltraSPARC_IIIi.intValue()) {
                return VALUE_ENTRY_UltraSPARC_IIIi;
            }

            if (iValue == VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_68040.intValue()) {
                return VALUE_ENTRY_68040;
            }

            if (iValue == VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_68xxx_Family.intValue()) {
                return VALUE_ENTRY_68xxx_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_68000.intValue()) {
                return VALUE_ENTRY_68000;
            }

            if (iValue == VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_68010.intValue()) {
                return VALUE_ENTRY_68010;
            }

            if (iValue == VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_68020.intValue()) {
                return VALUE_ENTRY_68020;
            }

            if (iValue == VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_68030.intValue()) {
                return VALUE_ENTRY_68030;
            }

            if (iValue == VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Hobbit_Family.intValue()) {
                return VALUE_ENTRY_Hobbit_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_Crusoe_TM__TM5000_Family.intValue()) {
                return VALUE_ENTRY_Crusoe_TM__TM5000_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_Crusoe_TM__TM3000_Family.intValue()) {
                return VALUE_ENTRY_Crusoe_TM__TM3000_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_Efficeon_TM__TM8000_Family.intValue()) {
                return VALUE_ENTRY_Efficeon_TM__TM8000_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_Weitek.intValue()) {
                return VALUE_ENTRY_Weitek;
            }

            if (iValue == VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Itanium_TM__Processor.intValue()) {
                return VALUE_ENTRY_Itanium_TM__Processor;
            }

            if (iValue == VALUE_MAP_ENTRY_131_FOR_VALUE_ENTRY_AMD_Athlon_TM__64_Processor_Family
                    .intValue()) {
                return VALUE_ENTRY_AMD_Athlon_TM__64_Processor_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_132_FOR_VALUE_ENTRY_AMD_Opteron_TM__Processor_Family
                    .intValue()) {
                return VALUE_ENTRY_AMD_Opteron_TM__Processor_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_144_FOR_VALUE_ENTRY_PA_RISC_Family.intValue()) {
                return VALUE_ENTRY_PA_RISC_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_145_FOR_VALUE_ENTRY_PA_RISC_8500.intValue()) {
                return VALUE_ENTRY_PA_RISC_8500;
            }

            if (iValue == VALUE_MAP_ENTRY_146_FOR_VALUE_ENTRY_PA_RISC_8000.intValue()) {
                return VALUE_ENTRY_PA_RISC_8000;
            }

            if (iValue == VALUE_MAP_ENTRY_147_FOR_VALUE_ENTRY_PA_RISC_7300LC.intValue()) {
                return VALUE_ENTRY_PA_RISC_7300LC;
            }

            if (iValue == VALUE_MAP_ENTRY_148_FOR_VALUE_ENTRY_PA_RISC_7200.intValue()) {
                return VALUE_ENTRY_PA_RISC_7200;
            }

            if (iValue == VALUE_MAP_ENTRY_149_FOR_VALUE_ENTRY_PA_RISC_7100LC.intValue()) {
                return VALUE_ENTRY_PA_RISC_7100LC;
            }

            if (iValue == VALUE_MAP_ENTRY_150_FOR_VALUE_ENTRY_PA_RISC_7100.intValue()) {
                return VALUE_ENTRY_PA_RISC_7100;
            }

            if (iValue == VALUE_MAP_ENTRY_160_FOR_VALUE_ENTRY_V30_Family.intValue()) {
                return VALUE_ENTRY_V30_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_176_FOR_VALUE_ENTRY_Pentium_R__III_Xeon_TM_.intValue()) {
                return VALUE_ENTRY_Pentium_R__III_Xeon_TM_;
            }

            if (iValue == VALUE_MAP_ENTRY_177_FOR_VALUE_ENTRY_Pentium_R__III_Processor_with_Intel_R__SpeedStep_TM__Technology
                    .intValue()) {
                return VALUE_ENTRY_Pentium_R__III_Processor_with_Intel_R__SpeedStep_TM__Technology;
            }

            if (iValue == VALUE_MAP_ENTRY_178_FOR_VALUE_ENTRY_Pentium_R__4.intValue()) {
                return VALUE_ENTRY_Pentium_R__4;
            }

            if (iValue == VALUE_MAP_ENTRY_179_FOR_VALUE_ENTRY_Intel_R__Xeon_TM_.intValue()) {
                return VALUE_ENTRY_Intel_R__Xeon_TM_;
            }

            if (iValue == VALUE_MAP_ENTRY_180_FOR_VALUE_ENTRY_AS400_Family.intValue()) {
                return VALUE_ENTRY_AS400_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_181_FOR_VALUE_ENTRY_Intel_R__Xeon_TM__processor_MP
                    .intValue()) {
                return VALUE_ENTRY_Intel_R__Xeon_TM__processor_MP;
            }

            if (iValue == VALUE_MAP_ENTRY_182_FOR_VALUE_ENTRY_AMD_Athlon_TM__XP_Family.intValue()) {
                return VALUE_ENTRY_AMD_Athlon_TM__XP_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_183_FOR_VALUE_ENTRY_AMD_Athlon_TM__MP_Family.intValue()) {
                return VALUE_ENTRY_AMD_Athlon_TM__MP_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_184_FOR_VALUE_ENTRY_Intel_R__Itanium_R__2.intValue()) {
                return VALUE_ENTRY_Intel_R__Itanium_R__2;
            }

            if (iValue == VALUE_MAP_ENTRY_185_FOR_VALUE_ENTRY_Intel_R__Pentium_R__M_processor
                    .intValue()) {
                return VALUE_ENTRY_Intel_R__Pentium_R__M_processor;
            }

            if (iValue == VALUE_MAP_ENTRY_190_FOR_VALUE_ENTRY_K7.intValue()) {
                return VALUE_ENTRY_K7;
            }

            if (iValue == VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_S_390_and_zSeries_Family.intValue()) {
                return VALUE_ENTRY_S_390_and_zSeries_Family;
            }

            if (iValue == VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_ESA_390_G4.intValue()) {
                return VALUE_ENTRY_ESA_390_G4;
            }

            if (iValue == VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_ESA_390_G5.intValue()) {
                return VALUE_ENTRY_ESA_390_G5;
            }

            if (iValue == VALUE_MAP_ENTRY_203_FOR_VALUE_ENTRY_ESA_390_G6.intValue()) {
                return VALUE_ENTRY_ESA_390_G6;
            }

            if (iValue == VALUE_MAP_ENTRY_204_FOR_VALUE_ENTRY_z_Architectur_base.intValue()) {
                return VALUE_ENTRY_z_Architectur_base;
            }

            if (iValue == VALUE_MAP_ENTRY_250_FOR_VALUE_ENTRY_i860.intValue()) {
                return VALUE_ENTRY_i860;
            }

            if (iValue == VALUE_MAP_ENTRY_251_FOR_VALUE_ENTRY_i960.intValue()) {
                return VALUE_ENTRY_i960;
            }

            if (iValue == VALUE_MAP_ENTRY_260_FOR_VALUE_ENTRY_SH_3.intValue()) {
                return VALUE_ENTRY_SH_3;
            }

            if (iValue == VALUE_MAP_ENTRY_261_FOR_VALUE_ENTRY_SH_4.intValue()) {
                return VALUE_ENTRY_SH_4;
            }

            if (iValue == VALUE_MAP_ENTRY_280_FOR_VALUE_ENTRY_ARM.intValue()) {
                return VALUE_ENTRY_ARM;
            }

            if (iValue == VALUE_MAP_ENTRY_281_FOR_VALUE_ENTRY_StrongARM.intValue()) {
                return VALUE_ENTRY_StrongARM;
            }

            if (iValue == VALUE_MAP_ENTRY_300_FOR_VALUE_ENTRY_6x86.intValue()) {
                return VALUE_ENTRY_6x86;
            }

            if (iValue == VALUE_MAP_ENTRY_301_FOR_VALUE_ENTRY_MediaGX.intValue()) {
                return VALUE_ENTRY_MediaGX;
            }

            if (iValue == VALUE_MAP_ENTRY_302_FOR_VALUE_ENTRY_MII.intValue()) {
                return VALUE_ENTRY_MII;
            }

            if (iValue == VALUE_MAP_ENTRY_320_FOR_VALUE_ENTRY_WinChip.intValue()) {
                return VALUE_ENTRY_WinChip;
            }

            if (iValue == VALUE_MAP_ENTRY_350_FOR_VALUE_ENTRY_DSP.intValue()) {
                return VALUE_ENTRY_DSP;
            }

            if (iValue == VALUE_MAP_ENTRY_500_FOR_VALUE_ENTRY_Video_Processor.intValue()) {
                return VALUE_ENTRY_Video_Processor;
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
         * Value Map for the property Family   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_8086,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_80286,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_80386,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_80486,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_8087,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_80287,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_80387,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_80487,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Pentium_R__brand,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Pentium_R__Pro,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Pentium_R__II,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Pentium_R__processor_with_MMX_TM__technology,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Celeron_TM_,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Pentium_R__II_Xeon_TM_,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Pentium_R__III,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_M1_Family,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_M2_Family,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_K5_Family,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_K6_Family,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_K6_2,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_K6_3,
                VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_AMD_Athlon_TM__Processor_Family,
                VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_AMD_R__Duron_TM__Processor,
                VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_AMD29000_Family,
                VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_K6_2_,
                VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Power_PC_Family,
                VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_Power_PC_601,
                VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Power_PC_603,
                VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Power_PC_603_,
                VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Power_PC_604,
                VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Power_PC_620,
                VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Power_PC_X704,
                VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_Power_PC_750,
                VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Alpha_Family,
                VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Alpha_21064,
                VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Alpha_21066,
                VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Alpha_21164,
                VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Alpha_21164PC,
                VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Alpha_21164a,
                VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Alpha_21264,
                VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Alpha_21364,
                VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_MIPS_Family,
                VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_MIPS_R4000,
                VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_MIPS_R4200,
                VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_MIPS_R4400,
                VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_MIPS_R4600,
                VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_MIPS_R10000,
                VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_SPARC_Family,
                VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_SuperSPARC,
                VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_microSPARC_II,
                VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_microSPARC_IIep,
                VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_UltraSPARC,
                VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_UltraSPARC_II,
                VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_UltraSPARC_IIi,
                VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_UltraSPARC_III,
                VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_UltraSPARC_IIIi,
                VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_68040,
                VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_68xxx_Family,
                VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_68000,
                VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_68010,
                VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_68020,
                VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_68030,
                VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Hobbit_Family,
                VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_Crusoe_TM__TM5000_Family,
                VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_Crusoe_TM__TM3000_Family,
                VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_Efficeon_TM__TM8000_Family,
                VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_Weitek,
                VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Itanium_TM__Processor,
                VALUE_MAP_ENTRY_131_FOR_VALUE_ENTRY_AMD_Athlon_TM__64_Processor_Family,
                VALUE_MAP_ENTRY_132_FOR_VALUE_ENTRY_AMD_Opteron_TM__Processor_Family,
                VALUE_MAP_ENTRY_144_FOR_VALUE_ENTRY_PA_RISC_Family,
                VALUE_MAP_ENTRY_145_FOR_VALUE_ENTRY_PA_RISC_8500,
                VALUE_MAP_ENTRY_146_FOR_VALUE_ENTRY_PA_RISC_8000,
                VALUE_MAP_ENTRY_147_FOR_VALUE_ENTRY_PA_RISC_7300LC,
                VALUE_MAP_ENTRY_148_FOR_VALUE_ENTRY_PA_RISC_7200,
                VALUE_MAP_ENTRY_149_FOR_VALUE_ENTRY_PA_RISC_7100LC,
                VALUE_MAP_ENTRY_150_FOR_VALUE_ENTRY_PA_RISC_7100,
                VALUE_MAP_ENTRY_160_FOR_VALUE_ENTRY_V30_Family,
                VALUE_MAP_ENTRY_176_FOR_VALUE_ENTRY_Pentium_R__III_Xeon_TM_,
                VALUE_MAP_ENTRY_177_FOR_VALUE_ENTRY_Pentium_R__III_Processor_with_Intel_R__SpeedStep_TM__Technology,
                VALUE_MAP_ENTRY_178_FOR_VALUE_ENTRY_Pentium_R__4,
                VALUE_MAP_ENTRY_179_FOR_VALUE_ENTRY_Intel_R__Xeon_TM_,
                VALUE_MAP_ENTRY_180_FOR_VALUE_ENTRY_AS400_Family,
                VALUE_MAP_ENTRY_181_FOR_VALUE_ENTRY_Intel_R__Xeon_TM__processor_MP,
                VALUE_MAP_ENTRY_182_FOR_VALUE_ENTRY_AMD_Athlon_TM__XP_Family,
                VALUE_MAP_ENTRY_183_FOR_VALUE_ENTRY_AMD_Athlon_TM__MP_Family,
                VALUE_MAP_ENTRY_184_FOR_VALUE_ENTRY_Intel_R__Itanium_R__2,
                VALUE_MAP_ENTRY_185_FOR_VALUE_ENTRY_Intel_R__Pentium_R__M_processor,
                VALUE_MAP_ENTRY_190_FOR_VALUE_ENTRY_K7,
                VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_S_390_and_zSeries_Family,
                VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_ESA_390_G4,
                VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_ESA_390_G5,
                VALUE_MAP_ENTRY_203_FOR_VALUE_ENTRY_ESA_390_G6,
                VALUE_MAP_ENTRY_204_FOR_VALUE_ENTRY_z_Architectur_base,
                VALUE_MAP_ENTRY_250_FOR_VALUE_ENTRY_i860, VALUE_MAP_ENTRY_251_FOR_VALUE_ENTRY_i960,
                VALUE_MAP_ENTRY_260_FOR_VALUE_ENTRY_SH_3, VALUE_MAP_ENTRY_261_FOR_VALUE_ENTRY_SH_4,
                VALUE_MAP_ENTRY_280_FOR_VALUE_ENTRY_ARM,
                VALUE_MAP_ENTRY_281_FOR_VALUE_ENTRY_StrongARM,
                VALUE_MAP_ENTRY_300_FOR_VALUE_ENTRY_6x86,
                VALUE_MAP_ENTRY_301_FOR_VALUE_ENTRY_MediaGX,
                VALUE_MAP_ENTRY_302_FOR_VALUE_ENTRY_MII,
                VALUE_MAP_ENTRY_320_FOR_VALUE_ENTRY_WinChip,
                VALUE_MAP_ENTRY_350_FOR_VALUE_ENTRY_DSP,
                VALUE_MAP_ENTRY_500_FOR_VALUE_ENTRY_Video_Processor };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Family   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_8086, VALUE_ENTRY_80286, VALUE_ENTRY_80386, VALUE_ENTRY_80486,
                VALUE_ENTRY_8087, VALUE_ENTRY_80287, VALUE_ENTRY_80387, VALUE_ENTRY_80487,
                VALUE_ENTRY_Pentium_R__brand, VALUE_ENTRY_Pentium_R__Pro,
                VALUE_ENTRY_Pentium_R__II,
                VALUE_ENTRY_Pentium_R__processor_with_MMX_TM__technology, VALUE_ENTRY_Celeron_TM_,
                VALUE_ENTRY_Pentium_R__II_Xeon_TM_, VALUE_ENTRY_Pentium_R__III,
                VALUE_ENTRY_M1_Family, VALUE_ENTRY_M2_Family, VALUE_ENTRY_K5_Family,
                VALUE_ENTRY_K6_Family, VALUE_ENTRY_K6_2, VALUE_ENTRY_K6_3,
                VALUE_ENTRY_AMD_Athlon_TM__Processor_Family,
                VALUE_ENTRY_AMD_R__Duron_TM__Processor, VALUE_ENTRY_AMD29000_Family,
                VALUE_ENTRY_K6_2_, VALUE_ENTRY_Power_PC_Family, VALUE_ENTRY_Power_PC_601,
                VALUE_ENTRY_Power_PC_603, VALUE_ENTRY_Power_PC_603_, VALUE_ENTRY_Power_PC_604,
                VALUE_ENTRY_Power_PC_620, VALUE_ENTRY_Power_PC_X704, VALUE_ENTRY_Power_PC_750,
                VALUE_ENTRY_Alpha_Family, VALUE_ENTRY_Alpha_21064, VALUE_ENTRY_Alpha_21066,
                VALUE_ENTRY_Alpha_21164, VALUE_ENTRY_Alpha_21164PC, VALUE_ENTRY_Alpha_21164a,
                VALUE_ENTRY_Alpha_21264, VALUE_ENTRY_Alpha_21364, VALUE_ENTRY_MIPS_Family,
                VALUE_ENTRY_MIPS_R4000, VALUE_ENTRY_MIPS_R4200, VALUE_ENTRY_MIPS_R4400,
                VALUE_ENTRY_MIPS_R4600, VALUE_ENTRY_MIPS_R10000, VALUE_ENTRY_SPARC_Family,
                VALUE_ENTRY_SuperSPARC, VALUE_ENTRY_microSPARC_II, VALUE_ENTRY_microSPARC_IIep,
                VALUE_ENTRY_UltraSPARC, VALUE_ENTRY_UltraSPARC_II, VALUE_ENTRY_UltraSPARC_IIi,
                VALUE_ENTRY_UltraSPARC_III, VALUE_ENTRY_UltraSPARC_IIIi, VALUE_ENTRY_68040,
                VALUE_ENTRY_68xxx_Family, VALUE_ENTRY_68000, VALUE_ENTRY_68010, VALUE_ENTRY_68020,
                VALUE_ENTRY_68030, VALUE_ENTRY_Hobbit_Family, VALUE_ENTRY_Crusoe_TM__TM5000_Family,
                VALUE_ENTRY_Crusoe_TM__TM3000_Family, VALUE_ENTRY_Efficeon_TM__TM8000_Family,
                VALUE_ENTRY_Weitek, VALUE_ENTRY_Itanium_TM__Processor,
                VALUE_ENTRY_AMD_Athlon_TM__64_Processor_Family,
                VALUE_ENTRY_AMD_Opteron_TM__Processor_Family, VALUE_ENTRY_PA_RISC_Family,
                VALUE_ENTRY_PA_RISC_8500, VALUE_ENTRY_PA_RISC_8000, VALUE_ENTRY_PA_RISC_7300LC,
                VALUE_ENTRY_PA_RISC_7200, VALUE_ENTRY_PA_RISC_7100LC, VALUE_ENTRY_PA_RISC_7100,
                VALUE_ENTRY_V30_Family, VALUE_ENTRY_Pentium_R__III_Xeon_TM_,
                VALUE_ENTRY_Pentium_R__III_Processor_with_Intel_R__SpeedStep_TM__Technology,
                VALUE_ENTRY_Pentium_R__4, VALUE_ENTRY_Intel_R__Xeon_TM_, VALUE_ENTRY_AS400_Family,
                VALUE_ENTRY_Intel_R__Xeon_TM__processor_MP, VALUE_ENTRY_AMD_Athlon_TM__XP_Family,
                VALUE_ENTRY_AMD_Athlon_TM__MP_Family, VALUE_ENTRY_Intel_R__Itanium_R__2,
                VALUE_ENTRY_Intel_R__Pentium_R__M_processor, VALUE_ENTRY_K7,
                VALUE_ENTRY_S_390_and_zSeries_Family, VALUE_ENTRY_ESA_390_G4,
                VALUE_ENTRY_ESA_390_G5, VALUE_ENTRY_ESA_390_G6, VALUE_ENTRY_z_Architectur_base,
                VALUE_ENTRY_i860, VALUE_ENTRY_i960, VALUE_ENTRY_SH_3, VALUE_ENTRY_SH_4,
                VALUE_ENTRY_ARM, VALUE_ENTRY_StrongARM, VALUE_ENTRY_6x86, VALUE_ENTRY_MediaGX,
                VALUE_ENTRY_MII, VALUE_ENTRY_WinChip, VALUE_ENTRY_DSP, VALUE_ENTRY_Video_Processor };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Family   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_8086, VALUE_ENTRY_80286, VALUE_ENTRY_80386,
                VALUE_ENTRY_80486, VALUE_ENTRY_8087, VALUE_ENTRY_80287, VALUE_ENTRY_80387,
                VALUE_ENTRY_80487, VALUE_ENTRY_Pentium_R__brand, VALUE_ENTRY_Pentium_R__Pro,
                VALUE_ENTRY_Pentium_R__II,
                VALUE_ENTRY_Pentium_R__processor_with_MMX_TM__technology, VALUE_ENTRY_Celeron_TM_,
                VALUE_ENTRY_Pentium_R__II_Xeon_TM_, VALUE_ENTRY_Pentium_R__III,
                VALUE_ENTRY_M1_Family, VALUE_ENTRY_M2_Family, VALUE_ENTRY_K5_Family,
                VALUE_ENTRY_K6_Family, VALUE_ENTRY_K6_2, VALUE_ENTRY_K6_3,
                VALUE_ENTRY_AMD_Athlon_TM__Processor_Family,
                VALUE_ENTRY_AMD_R__Duron_TM__Processor, VALUE_ENTRY_AMD29000_Family,
                VALUE_ENTRY_K6_2_, VALUE_ENTRY_Power_PC_Family, VALUE_ENTRY_Power_PC_601,
                VALUE_ENTRY_Power_PC_603, VALUE_ENTRY_Power_PC_603_, VALUE_ENTRY_Power_PC_604,
                VALUE_ENTRY_Power_PC_620, VALUE_ENTRY_Power_PC_X704, VALUE_ENTRY_Power_PC_750,
                VALUE_ENTRY_Alpha_Family, VALUE_ENTRY_Alpha_21064, VALUE_ENTRY_Alpha_21066,
                VALUE_ENTRY_Alpha_21164, VALUE_ENTRY_Alpha_21164PC, VALUE_ENTRY_Alpha_21164a,
                VALUE_ENTRY_Alpha_21264, VALUE_ENTRY_Alpha_21364, VALUE_ENTRY_MIPS_Family,
                VALUE_ENTRY_MIPS_R4000, VALUE_ENTRY_MIPS_R4200, VALUE_ENTRY_MIPS_R4400,
                VALUE_ENTRY_MIPS_R4600, VALUE_ENTRY_MIPS_R10000, VALUE_ENTRY_SPARC_Family,
                VALUE_ENTRY_SuperSPARC, VALUE_ENTRY_microSPARC_II, VALUE_ENTRY_microSPARC_IIep,
                VALUE_ENTRY_UltraSPARC, VALUE_ENTRY_UltraSPARC_II, VALUE_ENTRY_UltraSPARC_IIi,
                VALUE_ENTRY_UltraSPARC_III, VALUE_ENTRY_UltraSPARC_IIIi, VALUE_ENTRY_68040,
                VALUE_ENTRY_68xxx_Family, VALUE_ENTRY_68000, VALUE_ENTRY_68010, VALUE_ENTRY_68020,
                VALUE_ENTRY_68030, VALUE_ENTRY_Hobbit_Family, VALUE_ENTRY_Crusoe_TM__TM5000_Family,
                VALUE_ENTRY_Crusoe_TM__TM3000_Family, VALUE_ENTRY_Efficeon_TM__TM8000_Family,
                VALUE_ENTRY_Weitek, VALUE_ENTRY_Itanium_TM__Processor,
                VALUE_ENTRY_AMD_Athlon_TM__64_Processor_Family,
                VALUE_ENTRY_AMD_Opteron_TM__Processor_Family, VALUE_ENTRY_PA_RISC_Family,
                VALUE_ENTRY_PA_RISC_8500, VALUE_ENTRY_PA_RISC_8000, VALUE_ENTRY_PA_RISC_7300LC,
                VALUE_ENTRY_PA_RISC_7200, VALUE_ENTRY_PA_RISC_7100LC, VALUE_ENTRY_PA_RISC_7100,
                VALUE_ENTRY_V30_Family, VALUE_ENTRY_Pentium_R__III_Xeon_TM_,
                VALUE_ENTRY_Pentium_R__III_Processor_with_Intel_R__SpeedStep_TM__Technology,
                VALUE_ENTRY_Pentium_R__4, VALUE_ENTRY_Intel_R__Xeon_TM_, VALUE_ENTRY_AS400_Family,
                VALUE_ENTRY_Intel_R__Xeon_TM__processor_MP, VALUE_ENTRY_AMD_Athlon_TM__XP_Family,
                VALUE_ENTRY_AMD_Athlon_TM__MP_Family, VALUE_ENTRY_Intel_R__Itanium_R__2,
                VALUE_ENTRY_Intel_R__Pentium_R__M_processor, VALUE_ENTRY_K7,
                VALUE_ENTRY_S_390_and_zSeries_Family, VALUE_ENTRY_ESA_390_G4,
                VALUE_ENTRY_ESA_390_G5, VALUE_ENTRY_ESA_390_G6, VALUE_ENTRY_z_Architectur_base,
                VALUE_ENTRY_i860, VALUE_ENTRY_i960, VALUE_ENTRY_SH_3, VALUE_ENTRY_SH_4,
                VALUE_ENTRY_ARM, VALUE_ENTRY_StrongARM, VALUE_ENTRY_6x86, VALUE_ENTRY_MediaGX,
                VALUE_ENTRY_MII, VALUE_ENTRY_WinChip, VALUE_ENTRY_DSP, VALUE_ENTRY_Video_Processor };

    }

    /**
     * Constants of property LoadPercentage
     * Loading of this Processor, averaged over the last minute, in Percent.
     */
    public static class PROPERTY_LOADPERCENTAGE {
        /**
         * name of the property LoadPercentage
         */
        public final static String NAME = "LoadPercentage";

    }

    /**
     * Constants of property MaxClockSpeed
     * The maximum speed (in MHz) of this Processor.
     */
    public static class PROPERTY_MAXCLOCKSPEED {
        /**
         * name of the property MaxClockSpeed
         */
        public final static String NAME = "MaxClockSpeed";

    }

    /**
     * Constants of property OtherFamilyDescription
     * A string describing the Processor Family type - used when the Family property is set to 1 ("Other"). This string should be set to NULL when the Family property is any value other than 1.
     */
    public static class PROPERTY_OTHERFAMILYDESCRIPTION {
        /**
         * name of the property OtherFamilyDescription
         */
        public final static String NAME = "OtherFamilyDescription";

    }

    /**
     * Constants of property Role
     * A free form string describing the role of the Processor - for example, "Central Processor" or "Math Processor".
     */
    public static class PROPERTY_ROLE {
        /**
         * name of the property Role
         */
        public final static String NAME = "Role";

    }

    /**
     * Constants of property Stepping
     * Stepping is a free-form string indicating the revision level of the Processor within the Processor.Family.
     */
    public static class PROPERTY_STEPPING {
        /**
         * name of the property Stepping
         */
        public final static String NAME = "Stepping";

    }

    /**
     * Constants of property UniqueID
     * A globally unique identifier for the Processor. This identifier may only be unique within a Processor Family.
     */
    public static class PROPERTY_UNIQUEID {
        /**
         * name of the property UniqueID
         */
        public final static String NAME = "UniqueID";

    }

    /**
     * Constants of property UpgradeMethod
     * CPU socket information including data on how this Processor can be upgraded (if upgrades are supported). This property is an integer enumeration.
     */
    public static class PROPERTY_UPGRADEMETHOD {
        /**
         * name of the property UpgradeMethod
         */
        public final static String NAME = "UpgradeMethod";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Daughter_Board = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Daughter Board (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Daughter_Board = "Daughter Board";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ZIF_Socket = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry ZIF Socket (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_ZIF_Socket = "ZIF Socket";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Replacement_Piggy_Back = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Replacement/Piggy Back (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Replacement_Piggy_Back = "Replacement/Piggy Back";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_None = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry None (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_None = "None";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_LIF_Socket = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry LIF Socket (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_LIF_Socket = "LIF Socket";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Slot_1 = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Slot 1 (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Slot_1 = "Slot 1";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Slot_2 = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Slot 2 (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Slot_2 = "Slot 2";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_370_Pin_Socket = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry 370 Pin Socket (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_370_Pin_Socket = "370 Pin Socket";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Slot_A = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Slot A (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Slot_A = "Slot A";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Slot_M = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Slot M (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Slot_M = "Slot M";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Socket_423 = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Socket 423 (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Socket_423 = "Socket 423";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Socket_A__Socket_462_ = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry Socket A (Socket 462) (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_Socket_A__Socket_462_ = "Socket A (Socket 462)";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Socket_478 = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Socket 478 (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Socket_478 = "Socket 478";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Socket_754 = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry Socket 754 (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_Socket_754 = "Socket 754";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Socket_940 = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry Socket 940 (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_Socket_940 = "Socket 940";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Socket_939 = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry Socket 939 (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_Socket_939 = "Socket 939";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@6cea6cea
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Daughter_Board.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Daughter_Board;
            }

            if (VALUE_ENTRY_ZIF_Socket.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ZIF_Socket;
            }

            if (VALUE_ENTRY_Replacement_Piggy_Back.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Replacement_Piggy_Back;
            }

            if (VALUE_ENTRY_None.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_None;
            }

            if (VALUE_ENTRY_LIF_Socket.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_LIF_Socket;
            }

            if (VALUE_ENTRY_Slot_1.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Slot_1;
            }

            if (VALUE_ENTRY_Slot_2.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Slot_2;
            }

            if (VALUE_ENTRY_370_Pin_Socket.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_370_Pin_Socket;
            }

            if (VALUE_ENTRY_Slot_A.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Slot_A;
            }

            if (VALUE_ENTRY_Slot_M.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Slot_M;
            }

            if (VALUE_ENTRY_Socket_423.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Socket_423;
            }

            if (VALUE_ENTRY_Socket_A__Socket_462_.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Socket_A__Socket_462_;
            }

            if (VALUE_ENTRY_Socket_478.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Socket_478;
            }

            if (VALUE_ENTRY_Socket_754.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Socket_754;
            }

            if (VALUE_ENTRY_Socket_940.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Socket_940;
            }

            if (VALUE_ENTRY_Socket_939.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Socket_939;
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

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Daughter_Board.intValue()) {
                return VALUE_ENTRY_Daughter_Board;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ZIF_Socket.intValue()) {
                return VALUE_ENTRY_ZIF_Socket;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Replacement_Piggy_Back.intValue()) {
                return VALUE_ENTRY_Replacement_Piggy_Back;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_None.intValue()) {
                return VALUE_ENTRY_None;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_LIF_Socket.intValue()) {
                return VALUE_ENTRY_LIF_Socket;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Slot_1.intValue()) {
                return VALUE_ENTRY_Slot_1;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Slot_2.intValue()) {
                return VALUE_ENTRY_Slot_2;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_370_Pin_Socket.intValue()) {
                return VALUE_ENTRY_370_Pin_Socket;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Slot_A.intValue()) {
                return VALUE_ENTRY_Slot_A;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Slot_M.intValue()) {
                return VALUE_ENTRY_Slot_M;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Socket_423.intValue()) {
                return VALUE_ENTRY_Socket_423;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Socket_A__Socket_462_.intValue()) {
                return VALUE_ENTRY_Socket_A__Socket_462_;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Socket_478.intValue()) {
                return VALUE_ENTRY_Socket_478;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Socket_754.intValue()) {
                return VALUE_ENTRY_Socket_754;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Socket_940.intValue()) {
                return VALUE_ENTRY_Socket_940;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Socket_939.intValue()) {
                return VALUE_ENTRY_Socket_939;
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
         * Value Map for the property UpgradeMethod   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Daughter_Board,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ZIF_Socket,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Replacement_Piggy_Back,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_None,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_LIF_Socket,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Slot_1, VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Slot_2,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_370_Pin_Socket,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Slot_A,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Slot_M,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Socket_423,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Socket_A__Socket_462_,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Socket_478,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Socket_754,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Socket_940,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Socket_939 };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property UpgradeMethod   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Daughter_Board, VALUE_ENTRY_ZIF_Socket,
                VALUE_ENTRY_Replacement_Piggy_Back, VALUE_ENTRY_None, VALUE_ENTRY_LIF_Socket,
                VALUE_ENTRY_Slot_1, VALUE_ENTRY_Slot_2, VALUE_ENTRY_370_Pin_Socket,
                VALUE_ENTRY_Slot_A, VALUE_ENTRY_Slot_M, VALUE_ENTRY_Socket_423,
                VALUE_ENTRY_Socket_A__Socket_462_, VALUE_ENTRY_Socket_478, VALUE_ENTRY_Socket_754,
                VALUE_ENTRY_Socket_940, VALUE_ENTRY_Socket_939 };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property UpgradeMethod   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Daughter_Board, VALUE_ENTRY_ZIF_Socket,
                VALUE_ENTRY_Replacement_Piggy_Back, VALUE_ENTRY_None, VALUE_ENTRY_LIF_Socket,
                VALUE_ENTRY_Slot_1, VALUE_ENTRY_Slot_2, VALUE_ENTRY_370_Pin_Socket,
                VALUE_ENTRY_Slot_A, VALUE_ENTRY_Slot_M, VALUE_ENTRY_Socket_423,
                VALUE_ENTRY_Socket_A__Socket_462_, VALUE_ENTRY_Socket_478, VALUE_ENTRY_Socket_754,
                VALUE_ENTRY_Socket_940, VALUE_ENTRY_Socket_939 };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_LogicalDevice.getPackages();

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
     *   Capabilities and management of the Processor LogicalDevice.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Processor(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Capabilities and management of the Processor LogicalDevice.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Processor(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Processor() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AddressWidth", new CIMProperty("AddressWidth", CIMDataType.UINT16_T,
                null));
        propertiesToCheck
                .put("CPUStatus", new CIMProperty("CPUStatus", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("CurrentClockSpeed", new CIMProperty("CurrentClockSpeed",
                CIMDataType.UINT32_T, null));
        propertiesToCheck
                .put("DataWidth", new CIMProperty("DataWidth", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Family", new CIMProperty("Family", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("LoadPercentage", new CIMProperty("LoadPercentage",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("MaxClockSpeed", new CIMProperty("MaxClockSpeed",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("OtherFamilyDescription", new CIMProperty("OtherFamilyDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("Role", new CIMProperty("Role", CIMDataType.STRING_T, null));
        propertiesToCheck.put("Stepping", new CIMProperty("Stepping", CIMDataType.STRING_T, null));
        propertiesToCheck.put("UniqueID", new CIMProperty("UniqueID", CIMDataType.STRING_T, null));
        propertiesToCheck.put("UpgradeMethod", new CIMProperty("UpgradeMethod",
                CIMDataType.UINT16_T, null));

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
     * Get the property AddressWidth
     *     * <br>
     * Processor address width in bits.
     *     */

    public javax.cim.UnsignedInteger16 get_AddressWidth() {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDRESSWIDTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ADDRESSWIDTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property AddressWidth
     * <br>
     * Processor address width in bits.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AddressWidth(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDRESSWIDTH.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AddressWidth(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ADDRESSWIDTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AddressWidth by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AddressWidth(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Processor fco = new CIM_Processor(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDRESSWIDTH.NAME);
        if (property != null) {
            property = setPropertyValue_AddressWidth(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ADDRESSWIDTH.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AddressWidth
     * <br>
     * Processor address width in bits.
     */

    private static CIMProperty setPropertyValue_AddressWidth(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CPUStatus
     *     * <br>
     * The CPUStatus property indicates the current status of the Processor. For example, it may be disabled by the user via BIOS (value=2), or disabled due to a POST error (value= 3). Information in this property can be obtained from SMBIOS, the Type 4 structure, the Status attribute.
     *     */

    public javax.cim.UnsignedInteger16 get_CPUStatus() {
        CIMProperty currentProperty = getProperty(PROPERTY_CPUSTATUS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CPUSTATUS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property CPUStatus
     * <br>
     * The CPUStatus property indicates the current status of the Processor. For example, it may be disabled by the user via BIOS (value=2), or disabled due to a POST error (value= 3). Information in this property can be obtained from SMBIOS, the Type 4 structure, the Status attribute.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CPUStatus(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CPUSTATUS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CPUStatus(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CPUSTATUS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CPUStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CPUStatus(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Processor fco = new CIM_Processor(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CPUSTATUS.NAME);
        if (property != null) {
            property = setPropertyValue_CPUStatus(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CPUSTATUS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CPUStatus
     * <br>
     * The CPUStatus property indicates the current status of the Processor. For example, it may be disabled by the user via BIOS (value=2), or disabled due to a POST error (value= 3). Information in this property can be obtained from SMBIOS, the Type 4 structure, the Status attribute.
     */

    private static CIMProperty setPropertyValue_CPUStatus(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CurrentClockSpeed
     *     * <br>
     * The current speed (in MHz) of this Processor.
     *     */

    public javax.cim.UnsignedInteger32 get_CurrentClockSpeed() {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTCLOCKSPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CURRENTCLOCKSPEED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property CurrentClockSpeed
     * <br>
     * The current speed (in MHz) of this Processor.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CurrentClockSpeed(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTCLOCKSPEED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CurrentClockSpeed(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTCLOCKSPEED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CurrentClockSpeed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CurrentClockSpeed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_Processor fco = new CIM_Processor(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CURRENTCLOCKSPEED.NAME);
        if (property != null) {
            property = setPropertyValue_CurrentClockSpeed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTCLOCKSPEED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CurrentClockSpeed
     * <br>
     * The current speed (in MHz) of this Processor.
     */

    private static CIMProperty setPropertyValue_CurrentClockSpeed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DataWidth
     *     * <br>
     * Processor data width in bits.
     *     */

    public javax.cim.UnsignedInteger16 get_DataWidth() {
        CIMProperty currentProperty = getProperty(PROPERTY_DATAWIDTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DATAWIDTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property DataWidth
     * <br>
     * Processor data width in bits.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DataWidth(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DATAWIDTH.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DataWidth(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DATAWIDTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DataWidth by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DataWidth(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Processor fco = new CIM_Processor(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DATAWIDTH.NAME);
        if (property != null) {
            property = setPropertyValue_DataWidth(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DATAWIDTH.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DataWidth
     * <br>
     * Processor data width in bits.
     */

    private static CIMProperty setPropertyValue_DataWidth(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Family
     *     * <br>
     * The Processor family type. For example, values include "Pentium(R) processor with MMX(TM) technology" (14) and "68040" (96).
     *     */

    public javax.cim.UnsignedInteger16 get_Family() {
        CIMProperty currentProperty = getProperty(PROPERTY_FAMILY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FAMILY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Family
     * <br>
     * The Processor family type. For example, values include "Pentium(R) processor with MMX(TM) technology" (14) and "68040" (96).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Family(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FAMILY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Family(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FAMILY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Family by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Family(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Processor fco = new CIM_Processor(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FAMILY.NAME);
        if (property != null) {
            property = setPropertyValue_Family(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FAMILY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Family
     * <br>
     * The Processor family type. For example, values include "Pentium(R) processor with MMX(TM) technology" (14) and "68040" (96).
     */

    private static CIMProperty setPropertyValue_Family(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LoadPercentage
     *     * <br>
     * Loading of this Processor, averaged over the last minute, in Percent.
     *     */

    public javax.cim.UnsignedInteger16 get_LoadPercentage() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOADPERCENTAGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOADPERCENTAGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property LoadPercentage
     * <br>
     * Loading of this Processor, averaged over the last minute, in Percent.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LoadPercentage(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOADPERCENTAGE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LoadPercentage(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOADPERCENTAGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LoadPercentage by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LoadPercentage(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Processor fco = new CIM_Processor(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOADPERCENTAGE.NAME);
        if (property != null) {
            property = setPropertyValue_LoadPercentage(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOADPERCENTAGE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LoadPercentage
     * <br>
     * Loading of this Processor, averaged over the last minute, in Percent.
     */

    private static CIMProperty setPropertyValue_LoadPercentage(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxClockSpeed
     *     * <br>
     * The maximum speed (in MHz) of this Processor.
     *     */

    public javax.cim.UnsignedInteger32 get_MaxClockSpeed() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXCLOCKSPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXCLOCKSPEED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property MaxClockSpeed
     * <br>
     * The maximum speed (in MHz) of this Processor.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxClockSpeed(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXCLOCKSPEED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxClockSpeed(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXCLOCKSPEED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxClockSpeed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxClockSpeed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_Processor fco = new CIM_Processor(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXCLOCKSPEED.NAME);
        if (property != null) {
            property = setPropertyValue_MaxClockSpeed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXCLOCKSPEED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxClockSpeed
     * <br>
     * The maximum speed (in MHz) of this Processor.
     */

    private static CIMProperty setPropertyValue_MaxClockSpeed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherFamilyDescription
     *     * <br>
     * A string describing the Processor Family type - used when the Family property is set to 1 ("Other"). This string should be set to NULL when the Family property is any value other than 1.
     *     */

    public String get_OtherFamilyDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERFAMILYDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERFAMILYDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherFamilyDescription
     * <br>
     * A string describing the Processor Family type - used when the Family property is set to 1 ("Other"). This string should be set to NULL when the Family property is any value other than 1.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherFamilyDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERFAMILYDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherFamilyDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERFAMILYDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherFamilyDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherFamilyDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Processor fco = new CIM_Processor(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERFAMILYDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherFamilyDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERFAMILYDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherFamilyDescription
     * <br>
     * A string describing the Processor Family type - used when the Family property is set to 1 ("Other"). This string should be set to NULL when the Family property is any value other than 1.
     */

    private static CIMProperty setPropertyValue_OtherFamilyDescription(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Role
     *     * <br>
     * A free form string describing the role of the Processor - for example, "Central Processor" or "Math Processor".
     *     */

    public String get_Role() {
        CIMProperty currentProperty = getProperty(PROPERTY_ROLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ROLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Role
     * <br>
     * A free form string describing the role of the Processor - for example, "Central Processor" or "Math Processor".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Role(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ROLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Role(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ROLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Role by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Role(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Processor fco = new CIM_Processor(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ROLE.NAME);
        if (property != null) {
            property = setPropertyValue_Role(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ROLE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Role
     * <br>
     * A free form string describing the role of the Processor - for example, "Central Processor" or "Math Processor".
     */

    private static CIMProperty setPropertyValue_Role(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Stepping
     *     * <br>
     * Stepping is a free-form string indicating the revision level of the Processor within the Processor.Family.
     *     */

    public String get_Stepping() {
        CIMProperty currentProperty = getProperty(PROPERTY_STEPPING.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STEPPING.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Stepping
     * <br>
     * Stepping is a free-form string indicating the revision level of the Processor within the Processor.Family.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Stepping(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STEPPING.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Stepping(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STEPPING.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Stepping by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Stepping(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Processor fco = new CIM_Processor(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STEPPING.NAME);
        if (property != null) {
            property = setPropertyValue_Stepping(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STEPPING.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Stepping
     * <br>
     * Stepping is a free-form string indicating the revision level of the Processor within the Processor.Family.
     */

    private static CIMProperty setPropertyValue_Stepping(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UniqueID
     *     * <br>
     * A globally unique identifier for the Processor. This identifier may only be unique within a Processor Family.
     *     */

    public String get_UniqueID() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNIQUEID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNIQUEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property UniqueID
     * <br>
     * A globally unique identifier for the Processor. This identifier may only be unique within a Processor Family.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UniqueID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNIQUEID.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UniqueID(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNIQUEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UniqueID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UniqueID(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Processor fco = new CIM_Processor(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNIQUEID.NAME);
        if (property != null) {
            property = setPropertyValue_UniqueID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNIQUEID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UniqueID
     * <br>
     * A globally unique identifier for the Processor. This identifier may only be unique within a Processor Family.
     */

    private static CIMProperty setPropertyValue_UniqueID(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UpgradeMethod
     *     * <br>
     * CPU socket information including data on how this Processor can be upgraded (if upgrades are supported). This property is an integer enumeration.
     *     */

    public javax.cim.UnsignedInteger16 get_UpgradeMethod() {
        CIMProperty currentProperty = getProperty(PROPERTY_UPGRADEMETHOD.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UPGRADEMETHOD.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property UpgradeMethod
     * <br>
     * CPU socket information including data on how this Processor can be upgraded (if upgrades are supported). This property is an integer enumeration.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UpgradeMethod(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UPGRADEMETHOD.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UpgradeMethod(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UPGRADEMETHOD.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UpgradeMethod by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UpgradeMethod(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Processor fco = new CIM_Processor(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UPGRADEMETHOD.NAME);
        if (property != null) {
            property = setPropertyValue_UpgradeMethod(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UPGRADEMETHOD.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UpgradeMethod
     * <br>
     * CPU socket information including data on how this Processor can be upgraded (if upgrades are supported). This property is an integer enumeration.
     */

    private static CIMProperty setPropertyValue_UpgradeMethod(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
     * Get the list with CIM_UnitaryComputerSystem objects associated by the association CIM_ComputerSystemProcessor
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemProcessors(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemProcessors(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR,
                CIM_UnitaryComputerSystem.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_UnitaryComputerSystem objects associated by the association CIM_ComputerSystemProcessor
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemProcessors(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemProcessors(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_UnitaryComputerSystem objects associated by the association CIM_ComputerSystemProcessor
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemProcessors(
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
                CIM_ProcessorHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ProcessorHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ProcessorHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_UnitaryComputerSystem(cimInstance));
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
                        result.add(new CIM_UnitaryComputerSystem(cimInstance));
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
                        result.add(new CIM_UnitaryComputerSystem(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ProcessorHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemProcessor
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemProcessorNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemProcessorNames(cimClient,
                true, CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR,
                CIM_UnitaryComputerSystem.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemProcessor
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemProcessorNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemProcessorNames(cimClient,
                true, CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemProcessor
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemProcessorNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR,
                    CIM_UnitaryComputerSystem.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ProcessorHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ProcessorHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_UnitaryComputerSystem.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ProcessorHelper.checkException(enumeration);
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
     * Get the list with CIM_ComputerSystemProcessor associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ComputerSystemProcessor(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ProcessorHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ProcessorHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ComputerSystemProcessorHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ComputerSystemProcessor(cimInstance));
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
                        result.add(new CIM_ComputerSystemProcessor(cimInstance));
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
                        result.add(new CIM_ComputerSystemProcessor(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ProcessorHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ComputerSystemProcessor
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ComputerSystemProcessor(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ProcessorHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ProcessorHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ComputerSystemProcessor.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ProcessorHelper.checkException(enumeration);
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
        return CIM_Processor.CIM_CLASS_NAME;
    }

}