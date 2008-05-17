/** 
 * CIM_BIOSFeature.java
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
 * Description: BIOSFeature represents the capabilities of the low-level software that is used to bring up and configure a Computer System.
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

public class CIM_BIOSFeature extends CIM_SoftwareFeature {

    public final static String CIM_CLASS_NAME = "CIM_BIOSFeature";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * A link between BIOSFeature and its aggregated BIOSElements.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS = "CIM_BIOSFeatureBIOSElements";

    /**
     * Constants of property CharacteristicDescriptions
     * An array of free-form strings providing more detailed explanations for any of the BIOS features indicated in the Characteristics array. Note, each entry of this array is related to the entry in the Characteristics array that is located at the same index.
     */
    public static class PROPERTY_CHARACTERISTICDESCRIPTIONS {
        /**
         * name of the property CharacteristicDescriptions
         */
        public final static String NAME = "CharacteristicDescriptions";

    }

    /**
     * Constants of property Characteristics
     * An array of integers that specify the features supported by the BIOS. For example, one can specify that PnP capabilities are provided (value=9) or that infrared devices are supported (21). Values specified in the enumeration are taken from both DMI and SMBIOS (the Type 0 structure, the BIOS Characteristics and BIOS Characteristics Extension Bytes attributes.
     */
    public static class PROPERTY_CHARACTERISTICS {
        /**
         * name of the property Characteristics
         */
        public final static String NAME = "Characteristics";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Undefined = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Undefined (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Undefined = "Undefined";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISA_Support = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry ISA Support (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_ISA_Support = "ISA Support";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_MCA_Support = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry MCA Support (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_MCA_Support = "MCA Support";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_EISA_Support = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry EISA Support (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_EISA_Support = "EISA Support";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PCI_Support = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry PCI Support (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_PCI_Support = "PCI Support";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_PCMCIA_Support = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry PCMCIA Support (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_PCMCIA_Support = "PCMCIA Support";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_PnP_Support = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry PnP Support (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_PnP_Support = "PnP Support";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_APM_Support = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry APM Support (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_APM_Support = "APM Support";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Upgradeable_BIOS = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Upgradeable BIOS (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Upgradeable_BIOS = "Upgradeable BIOS";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_BIOS_Shadowing_Allowed = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry BIOS Shadowing Allowed (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_BIOS_Shadowing_Allowed = "BIOS Shadowing Allowed";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_VL_VESA_Support = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry VL VESA Support (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_VL_VESA_Support = "VL VESA Support";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_ESCD_Support = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry ESCD Support (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_ESCD_Support = "ESCD Support";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_LS_120_Boot_Support = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry LS-120 Boot Support (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_LS_120_Boot_Support = "LS-120 Boot Support";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_ACPI_Support = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry ACPI Support (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_ACPI_Support = "ACPI Support";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_I2O_Boot_Support = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry I2O Boot Support (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_I2O_Boot_Support = "I2O Boot Support";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_USB_Legacy_Support = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry USB Legacy Support (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_USB_Legacy_Support = "USB Legacy Support";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_AGP_Support = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry AGP Support (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_AGP_Support = "AGP Support";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_PC_Card = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry PC Card (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_PC_Card = "PC Card";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_IR = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry IR (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_IR = "IR";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_1394 = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry 1394 (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_1394 = "1394";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_I2C = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry I2C (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_I2C = "I2C";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Smart_Battery = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry Smart Battery (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_Smart_Battery = "Smart Battery";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_ATAPI_ZIP_Drive_Boot_Support = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry ATAPI ZIP Drive Boot Support (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_ATAPI_ZIP_Drive_Boot_Support = "ATAPI ZIP Drive Boot Support";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_1394_Boot_Support = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry 1394 Boot Support (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_1394_Boot_Support = "1394 Boot Support";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Boot_from_CD = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry Boot from CD (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_Boot_from_CD = "Boot from CD";

        /**
         * constant for value map entry 28
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Selectable_Boot = new javax.cim.UnsignedInteger16(
                "28");

        /**
         * constant for value entry Selectable Boot (corresponds to mapEntry 28 )
         */
        public final static String VALUE_ENTRY_Selectable_Boot = "Selectable Boot";

        /**
         * constant for value map entry 29
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_BIOS_ROM_is_Socketed = new javax.cim.UnsignedInteger16(
                "29");

        /**
         * constant for value entry BIOS ROM is Socketed (corresponds to mapEntry 29 )
         */
        public final static String VALUE_ENTRY_BIOS_ROM_is_Socketed = "BIOS ROM is Socketed";

        /**
         * constant for value map entry 30
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Boot_from_PCMCIA = new javax.cim.UnsignedInteger16(
                "30");

        /**
         * constant for value entry Boot from PCMCIA (corresponds to mapEntry 30 )
         */
        public final static String VALUE_ENTRY_Boot_from_PCMCIA = "Boot from PCMCIA";

        /**
         * constant for value map entry 31
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_EDD_Specification_Support = new javax.cim.UnsignedInteger16(
                "31");

        /**
         * constant for value entry EDD Specification Support (corresponds to mapEntry 31 )
         */
        public final static String VALUE_ENTRY_EDD_Specification_Support = "EDD Specification Support";

        /**
         * constant for value map entry 160
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_160_FOR_VALUE_ENTRY_PC_98 = new javax.cim.UnsignedInteger16(
                "160");

        /**
         * constant for value entry PC-98 (corresponds to mapEntry 160 )
         */
        public final static String VALUE_ENTRY_PC_98 = "PC-98";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@12941294
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Undefined.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Undefined;
            }

            if (VALUE_ENTRY_ISA_Support.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISA_Support;
            }

            if (VALUE_ENTRY_MCA_Support.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_MCA_Support;
            }

            if (VALUE_ENTRY_EISA_Support.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_EISA_Support;
            }

            if (VALUE_ENTRY_PCI_Support.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PCI_Support;
            }

            if (VALUE_ENTRY_PCMCIA_Support.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_PCMCIA_Support;
            }

            if (VALUE_ENTRY_PnP_Support.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_PnP_Support;
            }

            if (VALUE_ENTRY_APM_Support.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_APM_Support;
            }

            if (VALUE_ENTRY_Upgradeable_BIOS.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Upgradeable_BIOS;
            }

            if (VALUE_ENTRY_BIOS_Shadowing_Allowed.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_BIOS_Shadowing_Allowed;
            }

            if (VALUE_ENTRY_VL_VESA_Support.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_VL_VESA_Support;
            }

            if (VALUE_ENTRY_ESCD_Support.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_ESCD_Support;
            }

            if (VALUE_ENTRY_LS_120_Boot_Support.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_LS_120_Boot_Support;
            }

            if (VALUE_ENTRY_ACPI_Support.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_ACPI_Support;
            }

            if (VALUE_ENTRY_I2O_Boot_Support.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_I2O_Boot_Support;
            }

            if (VALUE_ENTRY_USB_Legacy_Support.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_USB_Legacy_Support;
            }

            if (VALUE_ENTRY_AGP_Support.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_AGP_Support;
            }

            if (VALUE_ENTRY_PC_Card.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_PC_Card;
            }

            if (VALUE_ENTRY_IR.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_IR;
            }

            if (VALUE_ENTRY_1394.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_1394;
            }

            if (VALUE_ENTRY_I2C.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_I2C;
            }

            if (VALUE_ENTRY_Smart_Battery.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Smart_Battery;
            }

            if (VALUE_ENTRY_ATAPI_ZIP_Drive_Boot_Support.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_ATAPI_ZIP_Drive_Boot_Support;
            }

            if (VALUE_ENTRY_1394_Boot_Support.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_1394_Boot_Support;
            }

            if (VALUE_ENTRY_Boot_from_CD.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Boot_from_CD;
            }

            if (VALUE_ENTRY_Selectable_Boot.equals(value)) {
                return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Selectable_Boot;
            }

            if (VALUE_ENTRY_BIOS_ROM_is_Socketed.equals(value)) {
                return VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_BIOS_ROM_is_Socketed;
            }

            if (VALUE_ENTRY_Boot_from_PCMCIA.equals(value)) {
                return VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Boot_from_PCMCIA;
            }

            if (VALUE_ENTRY_EDD_Specification_Support.equals(value)) {
                return VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_EDD_Specification_Support;
            }

            if (VALUE_ENTRY_PC_98.equals(value)) {
                return VALUE_MAP_ENTRY_160_FOR_VALUE_ENTRY_PC_98;
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

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Undefined.intValue()) {
                return VALUE_ENTRY_Undefined;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISA_Support.intValue()) {
                return VALUE_ENTRY_ISA_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_MCA_Support.intValue()) {
                return VALUE_ENTRY_MCA_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_EISA_Support.intValue()) {
                return VALUE_ENTRY_EISA_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PCI_Support.intValue()) {
                return VALUE_ENTRY_PCI_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_PCMCIA_Support.intValue()) {
                return VALUE_ENTRY_PCMCIA_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_PnP_Support.intValue()) {
                return VALUE_ENTRY_PnP_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_APM_Support.intValue()) {
                return VALUE_ENTRY_APM_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Upgradeable_BIOS.intValue()) {
                return VALUE_ENTRY_Upgradeable_BIOS;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_BIOS_Shadowing_Allowed.intValue()) {
                return VALUE_ENTRY_BIOS_Shadowing_Allowed;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_VL_VESA_Support.intValue()) {
                return VALUE_ENTRY_VL_VESA_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_ESCD_Support.intValue()) {
                return VALUE_ENTRY_ESCD_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_LS_120_Boot_Support.intValue()) {
                return VALUE_ENTRY_LS_120_Boot_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_ACPI_Support.intValue()) {
                return VALUE_ENTRY_ACPI_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_I2O_Boot_Support.intValue()) {
                return VALUE_ENTRY_I2O_Boot_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_USB_Legacy_Support.intValue()) {
                return VALUE_ENTRY_USB_Legacy_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_AGP_Support.intValue()) {
                return VALUE_ENTRY_AGP_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_PC_Card.intValue()) {
                return VALUE_ENTRY_PC_Card;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_IR.intValue()) {
                return VALUE_ENTRY_IR;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_1394.intValue()) {
                return VALUE_ENTRY_1394;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_I2C.intValue()) {
                return VALUE_ENTRY_I2C;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Smart_Battery.intValue()) {
                return VALUE_ENTRY_Smart_Battery;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_ATAPI_ZIP_Drive_Boot_Support
                    .intValue()) {
                return VALUE_ENTRY_ATAPI_ZIP_Drive_Boot_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_1394_Boot_Support.intValue()) {
                return VALUE_ENTRY_1394_Boot_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Boot_from_CD.intValue()) {
                return VALUE_ENTRY_Boot_from_CD;
            }

            if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Selectable_Boot.intValue()) {
                return VALUE_ENTRY_Selectable_Boot;
            }

            if (iValue == VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_BIOS_ROM_is_Socketed.intValue()) {
                return VALUE_ENTRY_BIOS_ROM_is_Socketed;
            }

            if (iValue == VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Boot_from_PCMCIA.intValue()) {
                return VALUE_ENTRY_Boot_from_PCMCIA;
            }

            if (iValue == VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_EDD_Specification_Support.intValue()) {
                return VALUE_ENTRY_EDD_Specification_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_160_FOR_VALUE_ENTRY_PC_98.intValue()) {
                return VALUE_ENTRY_PC_98;
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
         * Value Map for the property Characteristics   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Undefined,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISA_Support,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_MCA_Support,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_EISA_Support,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PCI_Support,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_PCMCIA_Support,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_PnP_Support,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_APM_Support,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Upgradeable_BIOS,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_BIOS_Shadowing_Allowed,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_VL_VESA_Support,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_ESCD_Support,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_LS_120_Boot_Support,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_ACPI_Support,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_I2O_Boot_Support,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_USB_Legacy_Support,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_AGP_Support,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_PC_Card, VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_IR,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_1394, VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_I2C,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Smart_Battery,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_ATAPI_ZIP_Drive_Boot_Support,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_1394_Boot_Support,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Boot_from_CD,
                VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Selectable_Boot,
                VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_BIOS_ROM_is_Socketed,
                VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Boot_from_PCMCIA,
                VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_EDD_Specification_Support,
                VALUE_MAP_ENTRY_160_FOR_VALUE_ENTRY_PC_98 };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Characteristics   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Undefined, VALUE_ENTRY_ISA_Support, VALUE_ENTRY_MCA_Support,
                VALUE_ENTRY_EISA_Support, VALUE_ENTRY_PCI_Support, VALUE_ENTRY_PCMCIA_Support,
                VALUE_ENTRY_PnP_Support, VALUE_ENTRY_APM_Support, VALUE_ENTRY_Upgradeable_BIOS,
                VALUE_ENTRY_BIOS_Shadowing_Allowed, VALUE_ENTRY_VL_VESA_Support,
                VALUE_ENTRY_ESCD_Support, VALUE_ENTRY_LS_120_Boot_Support,
                VALUE_ENTRY_ACPI_Support, VALUE_ENTRY_I2O_Boot_Support,
                VALUE_ENTRY_USB_Legacy_Support, VALUE_ENTRY_AGP_Support, VALUE_ENTRY_PC_Card,
                VALUE_ENTRY_IR, VALUE_ENTRY_1394, VALUE_ENTRY_I2C, VALUE_ENTRY_Smart_Battery,
                VALUE_ENTRY_ATAPI_ZIP_Drive_Boot_Support, VALUE_ENTRY_1394_Boot_Support,
                VALUE_ENTRY_Boot_from_CD, VALUE_ENTRY_Selectable_Boot,
                VALUE_ENTRY_BIOS_ROM_is_Socketed, VALUE_ENTRY_Boot_from_PCMCIA,
                VALUE_ENTRY_EDD_Specification_Support, VALUE_ENTRY_PC_98 };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Characteristics   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Undefined, VALUE_ENTRY_ISA_Support,
                VALUE_ENTRY_MCA_Support, VALUE_ENTRY_EISA_Support, VALUE_ENTRY_PCI_Support,
                VALUE_ENTRY_PCMCIA_Support, VALUE_ENTRY_PnP_Support, VALUE_ENTRY_APM_Support,
                VALUE_ENTRY_Upgradeable_BIOS, VALUE_ENTRY_BIOS_Shadowing_Allowed,
                VALUE_ENTRY_VL_VESA_Support, VALUE_ENTRY_ESCD_Support,
                VALUE_ENTRY_LS_120_Boot_Support, VALUE_ENTRY_ACPI_Support,
                VALUE_ENTRY_I2O_Boot_Support, VALUE_ENTRY_USB_Legacy_Support,
                VALUE_ENTRY_AGP_Support, VALUE_ENTRY_PC_Card, VALUE_ENTRY_IR, VALUE_ENTRY_1394,
                VALUE_ENTRY_I2C, VALUE_ENTRY_Smart_Battery,
                VALUE_ENTRY_ATAPI_ZIP_Drive_Boot_Support, VALUE_ENTRY_1394_Boot_Support,
                VALUE_ENTRY_Boot_from_CD, VALUE_ENTRY_Selectable_Boot,
                VALUE_ENTRY_BIOS_ROM_is_Socketed, VALUE_ENTRY_Boot_from_PCMCIA,
                VALUE_ENTRY_EDD_Specification_Support, VALUE_ENTRY_PC_98 };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_SoftwareFeature.getPackages();

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
     *   BIOSFeature represents the capabilities of the low-level software that is used to bring up and configure a Computer System.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_BIOSFeature(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   BIOSFeature represents the capabilities of the low-level software that is used to bring up and configure a Computer System.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_BIOSFeature(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_BIOSFeature() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CharacteristicDescriptions", new CIMProperty(
                "CharacteristicDescriptions", CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("Characteristics", new CIMProperty("Characteristics",
                CIMDataType.UINT16_ARRAY_T, null));

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
     * Get the property CharacteristicDescriptions
     *     * <br>
     * An array of free-form strings providing more detailed explanations for any of the BIOS features indicated in the Characteristics array. Note, each entry of this array is related to the entry in the Characteristics array that is located at the same index.
     *     */

    public String[] get_CharacteristicDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_CHARACTERISTICDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CHARACTERISTICDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property CharacteristicDescriptions
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the BIOS features indicated in the Characteristics array. Note, each entry of this array is related to the entry in the Characteristics array that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CharacteristicDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CHARACTERISTICDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CharacteristicDescriptions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CHARACTERISTICDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CharacteristicDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CharacteristicDescriptions(WBEMClient client,
            String namespace, String[] newValue) throws WbemsmtException {
        CIM_BIOSFeature fco = new CIM_BIOSFeature(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CHARACTERISTICDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_CharacteristicDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CHARACTERISTICDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CharacteristicDescriptions
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the BIOS features indicated in the Characteristics array. Note, each entry of this array is related to the entry in the Characteristics array that is located at the same index.
     */

    private static CIMProperty setPropertyValue_CharacteristicDescriptions(
            CIMProperty currentProperty, String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Characteristics
     *     * <br>
     * An array of integers that specify the features supported by the BIOS. For example, one can specify that PnP capabilities are provided (value=9) or that infrared devices are supported (21). Values specified in the enumeration are taken from both DMI and SMBIOS (the Type 0 structure, the BIOS Characteristics and BIOS Characteristics Extension Bytes attributes.
     *     */

    public javax.cim.UnsignedInteger16[] get_Characteristics() {
        CIMProperty currentProperty = getProperty(PROPERTY_CHARACTERISTICS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CHARACTERISTICS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property Characteristics
     * <br>
     * An array of integers that specify the features supported by the BIOS. For example, one can specify that PnP capabilities are provided (value=9) or that infrared devices are supported (21). Values specified in the enumeration are taken from both DMI and SMBIOS (the Type 0 structure, the BIOS Characteristics and BIOS Characteristics Extension Bytes attributes.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Characteristics(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CHARACTERISTICS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Characteristics(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CHARACTERISTICS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Characteristics by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Characteristics(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_BIOSFeature fco = new CIM_BIOSFeature(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CHARACTERISTICS.NAME);
        if (property != null) {
            property = setPropertyValue_Characteristics(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CHARACTERISTICS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Characteristics
     * <br>
     * An array of integers that specify the features supported by the BIOS. For example, one can specify that PnP capabilities are provided (value=9) or that infrared devices are supported (21). Values specified in the enumeration are taken from both DMI and SMBIOS (the Type 0 structure, the BIOS Characteristics and BIOS Characteristics Extension Bytes attributes.
     */

    private static CIMProperty setPropertyValue_Characteristics(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
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
     * Get the list with CIM_BIOSElement objects associated by the association CIM_BIOSFeatureBIOSElements
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_BIOSElement_CIM_BIOSFeatureBIOSElementss(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_BIOSElement_CIM_BIOSFeatureBIOSElementss(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS,
                CIM_BIOSElement.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_BIOSElement objects associated by the association CIM_BIOSFeatureBIOSElements
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_BIOSElement_CIM_BIOSFeatureBIOSElementss(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_BIOSElement_CIM_BIOSFeatureBIOSElementss(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_BIOSElement objects associated by the association CIM_BIOSFeatureBIOSElements
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_BIOSElement_CIM_BIOSFeatureBIOSElementss(
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
                CIM_BIOSFeatureHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_BIOSFeatureHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_BIOSFeatureHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_BIOSElement(cimInstance));
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
                        result.add(new CIM_BIOSElement(cimInstance));
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
                        result.add(new CIM_BIOSElement(cimInstance));
                        continue;
                    }
                }
            }
            CIM_BIOSFeatureHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BIOSFeatureBIOSElements
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_BIOSElement_CIM_BIOSFeatureBIOSElementsNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_BIOSElement_CIM_BIOSFeatureBIOSElementsNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS,
                CIM_BIOSElement.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BIOSFeatureBIOSElements
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_BIOSElement_CIM_BIOSFeatureBIOSElementsNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_BIOSElement_CIM_BIOSFeatureBIOSElementsNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BIOSFeatureBIOSElements
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_BIOSElement_CIM_BIOSFeatureBIOSElementsNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS,
                    CIM_BIOSElement.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_BIOSFeatureHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_BIOSFeatureHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_BIOSElement.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_BIOSFeatureHelper.checkException(enumeration);
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
     * Get the list with CIM_BIOSFeatureBIOSElements associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_BIOSFeatureBIOSElements(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_BIOSFeatureHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_BIOSFeatureHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_BIOSFeatureBIOSElementsHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_BIOSFeatureBIOSElements(cimInstance));
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
                        result.add(new CIM_BIOSFeatureBIOSElements(cimInstance));
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
                        result.add(new CIM_BIOSFeatureBIOSElements(cimInstance));
                        continue;
                    }
                }
            }
            CIM_BIOSFeatureHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_BIOSFeatureBIOSElements
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_BIOSFeatureBIOSElements(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_BIOSFeatureHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_BIOSFeatureHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_BIOSFeatureBIOSElements.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_BIOSFeatureHelper.checkException(enumeration);
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
        return CIM_BIOSFeature.CIM_CLASS_NAME;
    }

}