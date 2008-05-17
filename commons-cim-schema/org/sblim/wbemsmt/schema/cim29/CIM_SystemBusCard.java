/** 
 * CIM_SystemBusCard.java
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
 * Description: The SystemBusCard class represents additional information for a CIM_Card, detailing the Card's bus type and data width. These properties dictate the type of Slot into which the Card can be inserted. For example, using the properties of this class, one can define that a Card is a PCI, 64 bit adapter.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_SystemBusCard extends CIM_Card {

    public final static String CIM_CLASS_NAME = "CIM_SystemBusCard";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property BusType
     * An enumerated integer describing the System bus type for this Card. It indicates the type of Slot into which the Card can plug. The list of permissible values aligns with the System bus types in CIM_PhysicalConnector.Connector Type.
     */
    public static class PROPERTY_BUSTYPE {
        /**
         * name of the property BusType
         */
        public final static String NAME = "BusType";

        /**
         * constant for value map entry 43
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_PCI = new javax.cim.UnsignedInteger16(
                "43");

        /**
         * constant for value entry PCI (corresponds to mapEntry 43 )
         */
        public final static String VALUE_ENTRY_PCI = "PCI";

        /**
         * constant for value map entry 44
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_ISA = new javax.cim.UnsignedInteger16(
                "44");

        /**
         * constant for value entry ISA (corresponds to mapEntry 44 )
         */
        public final static String VALUE_ENTRY_ISA = "ISA";

        /**
         * constant for value map entry 45
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_EISA = new javax.cim.UnsignedInteger16(
                "45");

        /**
         * constant for value entry EISA (corresponds to mapEntry 45 )
         */
        public final static String VALUE_ENTRY_EISA = "EISA";

        /**
         * constant for value map entry 46
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_VESA = new javax.cim.UnsignedInteger16(
                "46");

        /**
         * constant for value entry VESA (corresponds to mapEntry 46 )
         */
        public final static String VALUE_ENTRY_VESA = "VESA";

        /**
         * constant for value map entry 47
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_PCMCIA = new javax.cim.UnsignedInteger16(
                "47");

        /**
         * constant for value entry PCMCIA (corresponds to mapEntry 47 )
         */
        public final static String VALUE_ENTRY_PCMCIA = "PCMCIA";

        /**
         * constant for value map entry 48
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_PCMCIA_Type_I = new javax.cim.UnsignedInteger16(
                "48");

        /**
         * constant for value entry PCMCIA Type I (corresponds to mapEntry 48 )
         */
        public final static String VALUE_ENTRY_PCMCIA_Type_I = "PCMCIA Type I";

        /**
         * constant for value map entry 49
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_PCMCIA_Type_II = new javax.cim.UnsignedInteger16(
                "49");

        /**
         * constant for value entry PCMCIA Type II (corresponds to mapEntry 49 )
         */
        public final static String VALUE_ENTRY_PCMCIA_Type_II = "PCMCIA Type II";

        /**
         * constant for value map entry 50
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_PCMCIA_Type_III = new javax.cim.UnsignedInteger16(
                "50");

        /**
         * constant for value entry PCMCIA Type III (corresponds to mapEntry 50 )
         */
        public final static String VALUE_ENTRY_PCMCIA_Type_III = "PCMCIA Type III";

        /**
         * constant for value map entry 52
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_CardBus = new javax.cim.UnsignedInteger16(
                "52");

        /**
         * constant for value entry CardBus (corresponds to mapEntry 52 )
         */
        public final static String VALUE_ENTRY_CardBus = "CardBus";

        /**
         * constant for value map entry 64
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Access_bus = new javax.cim.UnsignedInteger16(
                "64");

        /**
         * constant for value entry Access.bus (corresponds to mapEntry 64 )
         */
        public final static String VALUE_ENTRY_Access_bus = "Access.bus";

        /**
         * constant for value map entry 65
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_NuBus = new javax.cim.UnsignedInteger16(
                "65");

        /**
         * constant for value entry NuBus (corresponds to mapEntry 65 )
         */
        public final static String VALUE_ENTRY_NuBus = "NuBus";

        /**
         * constant for value map entry 73
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_AGP = new javax.cim.UnsignedInteger16(
                "73");

        /**
         * constant for value entry AGP (corresponds to mapEntry 73 )
         */
        public final static String VALUE_ENTRY_AGP = "AGP";

        /**
         * constant for value map entry 74
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_VME_Bus = new javax.cim.UnsignedInteger16(
                "74");

        /**
         * constant for value entry VME Bus (corresponds to mapEntry 74 )
         */
        public final static String VALUE_ENTRY_VME_Bus = "VME Bus";

        /**
         * constant for value map entry 75
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_VME64 = new javax.cim.UnsignedInteger16(
                "75");

        /**
         * constant for value entry VME64 (corresponds to mapEntry 75 )
         */
        public final static String VALUE_ENTRY_VME64 = "VME64";

        /**
         * constant for value map entry 76
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Proprietary = new javax.cim.UnsignedInteger16(
                "76");

        /**
         * constant for value entry Proprietary (corresponds to mapEntry 76 )
         */
        public final static String VALUE_ENTRY_Proprietary = "Proprietary";

        /**
         * constant for value map entry 77
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Proprietary_Processor_Card_Slot = new javax.cim.UnsignedInteger16(
                "77");

        /**
         * constant for value entry Proprietary Processor Card Slot (corresponds to mapEntry 77 )
         */
        public final static String VALUE_ENTRY_Proprietary_Processor_Card_Slot = "Proprietary Processor Card Slot";

        /**
         * constant for value map entry 78
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Proprietary_Memory_Card_Slot = new javax.cim.UnsignedInteger16(
                "78");

        /**
         * constant for value entry Proprietary Memory Card Slot (corresponds to mapEntry 78 )
         */
        public final static String VALUE_ENTRY_Proprietary_Memory_Card_Slot = "Proprietary Memory Card Slot";

        /**
         * constant for value map entry 79
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Proprietary_I_O_Riser_Slot = new javax.cim.UnsignedInteger16(
                "79");

        /**
         * constant for value entry Proprietary I/O Riser Slot (corresponds to mapEntry 79 )
         */
        public final static String VALUE_ENTRY_Proprietary_I_O_Riser_Slot = "Proprietary I/O Riser Slot";

        /**
         * constant for value map entry 80
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_PCI_66MHZ = new javax.cim.UnsignedInteger16(
                "80");

        /**
         * constant for value entry PCI-66MHZ (corresponds to mapEntry 80 )
         */
        public final static String VALUE_ENTRY_PCI_66MHZ = "PCI-66MHZ";

        /**
         * constant for value map entry 81
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_AGP2X = new javax.cim.UnsignedInteger16(
                "81");

        /**
         * constant for value entry AGP2X (corresponds to mapEntry 81 )
         */
        public final static String VALUE_ENTRY_AGP2X = "AGP2X";

        /**
         * constant for value map entry 82
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_AGP4X = new javax.cim.UnsignedInteger16(
                "82");

        /**
         * constant for value entry AGP4X (corresponds to mapEntry 82 )
         */
        public final static String VALUE_ENTRY_AGP4X = "AGP4X";

        /**
         * constant for value map entry 83
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_PC_98 = new javax.cim.UnsignedInteger16(
                "83");

        /**
         * constant for value entry PC-98 (corresponds to mapEntry 83 )
         */
        public final static String VALUE_ENTRY_PC_98 = "PC-98";

        /**
         * constant for value map entry 84
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_PC_98_Hireso = new javax.cim.UnsignedInteger16(
                "84");

        /**
         * constant for value entry PC-98-Hireso (corresponds to mapEntry 84 )
         */
        public final static String VALUE_ENTRY_PC_98_Hireso = "PC-98-Hireso";

        /**
         * constant for value map entry 85
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_PC_H98 = new javax.cim.UnsignedInteger16(
                "85");

        /**
         * constant for value entry PC-H98 (corresponds to mapEntry 85 )
         */
        public final static String VALUE_ENTRY_PC_H98 = "PC-H98";

        /**
         * constant for value map entry 86
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_PC_98Note = new javax.cim.UnsignedInteger16(
                "86");

        /**
         * constant for value entry PC-98Note (corresponds to mapEntry 86 )
         */
        public final static String VALUE_ENTRY_PC_98Note = "PC-98Note";

        /**
         * constant for value map entry 87
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_PC_98Full = new javax.cim.UnsignedInteger16(
                "87");

        /**
         * constant for value entry PC-98Full (corresponds to mapEntry 87 )
         */
        public final static String VALUE_ENTRY_PC_98Full = "PC-98Full";

        /**
         * constant for value map entry 98
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_PCI_X = new javax.cim.UnsignedInteger16(
                "98");

        /**
         * constant for value entry PCI-X (corresponds to mapEntry 98 )
         */
        public final static String VALUE_ENTRY_PCI_X = "PCI-X";

        /**
         * constant for value map entry 99
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit = new javax.cim.UnsignedInteger16(
                "99");

        /**
         * constant for value entry Sbus IEEE 1396-1993 32 bit (corresponds to mapEntry 99 )
         */
        public final static String VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit = "Sbus IEEE 1396-1993 32 bit";

        /**
         * constant for value map entry 100
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit = new javax.cim.UnsignedInteger16(
                "100");

        /**
         * constant for value entry Sbus IEEE 1396-1993 64 bit (corresponds to mapEntry 100 )
         */
        public final static String VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit = "Sbus IEEE 1396-1993 64 bit";

        /**
         * constant for value map entry 101
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_MCA = new javax.cim.UnsignedInteger16(
                "101");

        /**
         * constant for value entry MCA (corresponds to mapEntry 101 )
         */
        public final static String VALUE_ENTRY_MCA = "MCA";

        /**
         * constant for value map entry 102
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_GIO = new javax.cim.UnsignedInteger16(
                "102");

        /**
         * constant for value entry GIO (corresponds to mapEntry 102 )
         */
        public final static String VALUE_ENTRY_GIO = "GIO";

        /**
         * constant for value map entry 103
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_XIO = new javax.cim.UnsignedInteger16(
                "103");

        /**
         * constant for value entry XIO (corresponds to mapEntry 103 )
         */
        public final static String VALUE_ENTRY_XIO = "XIO";

        /**
         * constant for value map entry 104
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_HIO = new javax.cim.UnsignedInteger16(
                "104");

        /**
         * constant for value entry HIO (corresponds to mapEntry 104 )
         */
        public final static String VALUE_ENTRY_HIO = "HIO";

        /**
         * constant for value map entry 105
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_NGIO = new javax.cim.UnsignedInteger16(
                "105");

        /**
         * constant for value entry NGIO (corresponds to mapEntry 105 )
         */
        public final static String VALUE_ENTRY_NGIO = "NGIO";

        /**
         * constant for value map entry 106
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_PMC = new javax.cim.UnsignedInteger16(
                "106");

        /**
         * constant for value entry PMC (corresponds to mapEntry 106 )
         */
        public final static String VALUE_ENTRY_PMC = "PMC";

        /**
         * constant for value map entry 109
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_Future_I_O = new javax.cim.UnsignedInteger16(
                "109");

        /**
         * constant for value entry Future I/O (corresponds to mapEntry 109 )
         */
        public final static String VALUE_ENTRY_Future_I_O = "Future I/O";

        /**
         * constant for value map entry 110
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_InfiniBand = new javax.cim.UnsignedInteger16(
                "110");

        /**
         * constant for value entry InfiniBand (corresponds to mapEntry 110 )
         */
        public final static String VALUE_ENTRY_InfiniBand = "InfiniBand";

        /**
         * constant for value map entry 111
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_AGP8X = new javax.cim.UnsignedInteger16(
                "111");

        /**
         * constant for value entry AGP8X (corresponds to mapEntry 111 )
         */
        public final static String VALUE_ENTRY_AGP8X = "AGP8X";

        /**
         * constant for value map entry 112
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_PCI_E = new javax.cim.UnsignedInteger16(
                "112");

        /**
         * constant for value entry PCI-E (corresponds to mapEntry 112 )
         */
        public final static String VALUE_ENTRY_PCI_E = "PCI-E";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@79007900
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_PCI.equals(value)) {
                return VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_PCI;
            }

            if (VALUE_ENTRY_ISA.equals(value)) {
                return VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_ISA;
            }

            if (VALUE_ENTRY_EISA.equals(value)) {
                return VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_EISA;
            }

            if (VALUE_ENTRY_VESA.equals(value)) {
                return VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_VESA;
            }

            if (VALUE_ENTRY_PCMCIA.equals(value)) {
                return VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_PCMCIA;
            }

            if (VALUE_ENTRY_PCMCIA_Type_I.equals(value)) {
                return VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_PCMCIA_Type_I;
            }

            if (VALUE_ENTRY_PCMCIA_Type_II.equals(value)) {
                return VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_PCMCIA_Type_II;
            }

            if (VALUE_ENTRY_PCMCIA_Type_III.equals(value)) {
                return VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_PCMCIA_Type_III;
            }

            if (VALUE_ENTRY_CardBus.equals(value)) {
                return VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_CardBus;
            }

            if (VALUE_ENTRY_Access_bus.equals(value)) {
                return VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Access_bus;
            }

            if (VALUE_ENTRY_NuBus.equals(value)) {
                return VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_NuBus;
            }

            if (VALUE_ENTRY_AGP.equals(value)) {
                return VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_AGP;
            }

            if (VALUE_ENTRY_VME_Bus.equals(value)) {
                return VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_VME_Bus;
            }

            if (VALUE_ENTRY_VME64.equals(value)) {
                return VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_VME64;
            }

            if (VALUE_ENTRY_Proprietary.equals(value)) {
                return VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Proprietary;
            }

            if (VALUE_ENTRY_Proprietary_Processor_Card_Slot.equals(value)) {
                return VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Proprietary_Processor_Card_Slot;
            }

            if (VALUE_ENTRY_Proprietary_Memory_Card_Slot.equals(value)) {
                return VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Proprietary_Memory_Card_Slot;
            }

            if (VALUE_ENTRY_Proprietary_I_O_Riser_Slot.equals(value)) {
                return VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Proprietary_I_O_Riser_Slot;
            }

            if (VALUE_ENTRY_PCI_66MHZ.equals(value)) {
                return VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_PCI_66MHZ;
            }

            if (VALUE_ENTRY_AGP2X.equals(value)) {
                return VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_AGP2X;
            }

            if (VALUE_ENTRY_AGP4X.equals(value)) {
                return VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_AGP4X;
            }

            if (VALUE_ENTRY_PC_98.equals(value)) {
                return VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_PC_98;
            }

            if (VALUE_ENTRY_PC_98_Hireso.equals(value)) {
                return VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_PC_98_Hireso;
            }

            if (VALUE_ENTRY_PC_H98.equals(value)) {
                return VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_PC_H98;
            }

            if (VALUE_ENTRY_PC_98Note.equals(value)) {
                return VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_PC_98Note;
            }

            if (VALUE_ENTRY_PC_98Full.equals(value)) {
                return VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_PC_98Full;
            }

            if (VALUE_ENTRY_PCI_X.equals(value)) {
                return VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_PCI_X;
            }

            if (VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit.equals(value)) {
                return VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit;
            }

            if (VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit.equals(value)) {
                return VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit;
            }

            if (VALUE_ENTRY_MCA.equals(value)) {
                return VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_MCA;
            }

            if (VALUE_ENTRY_GIO.equals(value)) {
                return VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_GIO;
            }

            if (VALUE_ENTRY_XIO.equals(value)) {
                return VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_XIO;
            }

            if (VALUE_ENTRY_HIO.equals(value)) {
                return VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_HIO;
            }

            if (VALUE_ENTRY_NGIO.equals(value)) {
                return VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_NGIO;
            }

            if (VALUE_ENTRY_PMC.equals(value)) {
                return VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_PMC;
            }

            if (VALUE_ENTRY_Future_I_O.equals(value)) {
                return VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_Future_I_O;
            }

            if (VALUE_ENTRY_InfiniBand.equals(value)) {
                return VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_InfiniBand;
            }

            if (VALUE_ENTRY_AGP8X.equals(value)) {
                return VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_AGP8X;
            }

            if (VALUE_ENTRY_PCI_E.equals(value)) {
                return VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_PCI_E;
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

            if (iValue == VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_PCI.intValue()) {
                return VALUE_ENTRY_PCI;
            }

            if (iValue == VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_ISA.intValue()) {
                return VALUE_ENTRY_ISA;
            }

            if (iValue == VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_EISA.intValue()) {
                return VALUE_ENTRY_EISA;
            }

            if (iValue == VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_VESA.intValue()) {
                return VALUE_ENTRY_VESA;
            }

            if (iValue == VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_PCMCIA.intValue()) {
                return VALUE_ENTRY_PCMCIA;
            }

            if (iValue == VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_PCMCIA_Type_I.intValue()) {
                return VALUE_ENTRY_PCMCIA_Type_I;
            }

            if (iValue == VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_PCMCIA_Type_II.intValue()) {
                return VALUE_ENTRY_PCMCIA_Type_II;
            }

            if (iValue == VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_PCMCIA_Type_III.intValue()) {
                return VALUE_ENTRY_PCMCIA_Type_III;
            }

            if (iValue == VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_CardBus.intValue()) {
                return VALUE_ENTRY_CardBus;
            }

            if (iValue == VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Access_bus.intValue()) {
                return VALUE_ENTRY_Access_bus;
            }

            if (iValue == VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_NuBus.intValue()) {
                return VALUE_ENTRY_NuBus;
            }

            if (iValue == VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_AGP.intValue()) {
                return VALUE_ENTRY_AGP;
            }

            if (iValue == VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_VME_Bus.intValue()) {
                return VALUE_ENTRY_VME_Bus;
            }

            if (iValue == VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_VME64.intValue()) {
                return VALUE_ENTRY_VME64;
            }

            if (iValue == VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Proprietary.intValue()) {
                return VALUE_ENTRY_Proprietary;
            }

            if (iValue == VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Proprietary_Processor_Card_Slot
                    .intValue()) {
                return VALUE_ENTRY_Proprietary_Processor_Card_Slot;
            }

            if (iValue == VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Proprietary_Memory_Card_Slot
                    .intValue()) {
                return VALUE_ENTRY_Proprietary_Memory_Card_Slot;
            }

            if (iValue == VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Proprietary_I_O_Riser_Slot.intValue()) {
                return VALUE_ENTRY_Proprietary_I_O_Riser_Slot;
            }

            if (iValue == VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_PCI_66MHZ.intValue()) {
                return VALUE_ENTRY_PCI_66MHZ;
            }

            if (iValue == VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_AGP2X.intValue()) {
                return VALUE_ENTRY_AGP2X;
            }

            if (iValue == VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_AGP4X.intValue()) {
                return VALUE_ENTRY_AGP4X;
            }

            if (iValue == VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_PC_98.intValue()) {
                return VALUE_ENTRY_PC_98;
            }

            if (iValue == VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_PC_98_Hireso.intValue()) {
                return VALUE_ENTRY_PC_98_Hireso;
            }

            if (iValue == VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_PC_H98.intValue()) {
                return VALUE_ENTRY_PC_H98;
            }

            if (iValue == VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_PC_98Note.intValue()) {
                return VALUE_ENTRY_PC_98Note;
            }

            if (iValue == VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_PC_98Full.intValue()) {
                return VALUE_ENTRY_PC_98Full;
            }

            if (iValue == VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_PCI_X.intValue()) {
                return VALUE_ENTRY_PCI_X;
            }

            if (iValue == VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit.intValue()) {
                return VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit;
            }

            if (iValue == VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit.intValue()) {
                return VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit;
            }

            if (iValue == VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_MCA.intValue()) {
                return VALUE_ENTRY_MCA;
            }

            if (iValue == VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_GIO.intValue()) {
                return VALUE_ENTRY_GIO;
            }

            if (iValue == VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_XIO.intValue()) {
                return VALUE_ENTRY_XIO;
            }

            if (iValue == VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_HIO.intValue()) {
                return VALUE_ENTRY_HIO;
            }

            if (iValue == VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_NGIO.intValue()) {
                return VALUE_ENTRY_NGIO;
            }

            if (iValue == VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_PMC.intValue()) {
                return VALUE_ENTRY_PMC;
            }

            if (iValue == VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_Future_I_O.intValue()) {
                return VALUE_ENTRY_Future_I_O;
            }

            if (iValue == VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_InfiniBand.intValue()) {
                return VALUE_ENTRY_InfiniBand;
            }

            if (iValue == VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_AGP8X.intValue()) {
                return VALUE_ENTRY_AGP8X;
            }

            if (iValue == VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_PCI_E.intValue()) {
                return VALUE_ENTRY_PCI_E;
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
         * Value Map for the property BusType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_PCI, VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_ISA,
                VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_EISA, VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_VESA,
                VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_PCMCIA,
                VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_PCMCIA_Type_I,
                VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_PCMCIA_Type_II,
                VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_PCMCIA_Type_III,
                VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_CardBus,
                VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Access_bus,
                VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_NuBus, VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_AGP,
                VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_VME_Bus,
                VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_VME64,
                VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Proprietary,
                VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Proprietary_Processor_Card_Slot,
                VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Proprietary_Memory_Card_Slot,
                VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Proprietary_I_O_Riser_Slot,
                VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_PCI_66MHZ,
                VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_AGP2X, VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_AGP4X,
                VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_PC_98,
                VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_PC_98_Hireso,
                VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_PC_H98,
                VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_PC_98Note,
                VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_PC_98Full,
                VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_PCI_X,
                VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit,
                VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit,
                VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_MCA, VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_GIO,
                VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_XIO, VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_HIO,
                VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_NGIO, VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_PMC,
                VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_Future_I_O,
                VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_InfiniBand,
                VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_AGP8X,
                VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_PCI_E };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property BusType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_PCI, VALUE_ENTRY_ISA,
                VALUE_ENTRY_EISA, VALUE_ENTRY_VESA, VALUE_ENTRY_PCMCIA, VALUE_ENTRY_PCMCIA_Type_I,
                VALUE_ENTRY_PCMCIA_Type_II, VALUE_ENTRY_PCMCIA_Type_III, VALUE_ENTRY_CardBus,
                VALUE_ENTRY_Access_bus, VALUE_ENTRY_NuBus, VALUE_ENTRY_AGP, VALUE_ENTRY_VME_Bus,
                VALUE_ENTRY_VME64, VALUE_ENTRY_Proprietary,
                VALUE_ENTRY_Proprietary_Processor_Card_Slot,
                VALUE_ENTRY_Proprietary_Memory_Card_Slot, VALUE_ENTRY_Proprietary_I_O_Riser_Slot,
                VALUE_ENTRY_PCI_66MHZ, VALUE_ENTRY_AGP2X, VALUE_ENTRY_AGP4X, VALUE_ENTRY_PC_98,
                VALUE_ENTRY_PC_98_Hireso, VALUE_ENTRY_PC_H98, VALUE_ENTRY_PC_98Note,
                VALUE_ENTRY_PC_98Full, VALUE_ENTRY_PCI_X, VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit,
                VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit, VALUE_ENTRY_MCA, VALUE_ENTRY_GIO,
                VALUE_ENTRY_XIO, VALUE_ENTRY_HIO, VALUE_ENTRY_NGIO, VALUE_ENTRY_PMC,
                VALUE_ENTRY_Future_I_O, VALUE_ENTRY_InfiniBand, VALUE_ENTRY_AGP8X,
                VALUE_ENTRY_PCI_E };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property BusType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_PCI,
                VALUE_ENTRY_ISA, VALUE_ENTRY_EISA, VALUE_ENTRY_VESA, VALUE_ENTRY_PCMCIA,
                VALUE_ENTRY_PCMCIA_Type_I, VALUE_ENTRY_PCMCIA_Type_II, VALUE_ENTRY_PCMCIA_Type_III,
                VALUE_ENTRY_CardBus, VALUE_ENTRY_Access_bus, VALUE_ENTRY_NuBus, VALUE_ENTRY_AGP,
                VALUE_ENTRY_VME_Bus, VALUE_ENTRY_VME64, VALUE_ENTRY_Proprietary,
                VALUE_ENTRY_Proprietary_Processor_Card_Slot,
                VALUE_ENTRY_Proprietary_Memory_Card_Slot, VALUE_ENTRY_Proprietary_I_O_Riser_Slot,
                VALUE_ENTRY_PCI_66MHZ, VALUE_ENTRY_AGP2X, VALUE_ENTRY_AGP4X, VALUE_ENTRY_PC_98,
                VALUE_ENTRY_PC_98_Hireso, VALUE_ENTRY_PC_H98, VALUE_ENTRY_PC_98Note,
                VALUE_ENTRY_PC_98Full, VALUE_ENTRY_PCI_X, VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit,
                VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit, VALUE_ENTRY_MCA, VALUE_ENTRY_GIO,
                VALUE_ENTRY_XIO, VALUE_ENTRY_HIO, VALUE_ENTRY_NGIO, VALUE_ENTRY_PMC,
                VALUE_ENTRY_Future_I_O, VALUE_ENTRY_InfiniBand, VALUE_ENTRY_AGP8X,
                VALUE_ENTRY_PCI_E };

    }

    /**
     * Constants of property BusWidth
     * System bus width (in bits) required by this Card. If 'unknown', enter 0. If 'other' than the values, 8, 16, 32, 64 or 128, enter 1. The list of permissible values aligns with the data in CIM_Slot.MaxBusWidth.
     */
    public static class PROPERTY_BUSWIDTH {
        /**
         * name of the property BusWidth
         */
        public final static String NAME = "BusWidth";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0 = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1 = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8 = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16 = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value map entry 32
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_32 = new javax.cim.UnsignedInteger16(
                "32");

        /**
         * constant for value map entry 64
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64 = new javax.cim.UnsignedInteger16(
                "64");

        /**
         * constant for value map entry 128
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_128 = new javax.cim.UnsignedInteger16(
                "128");

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property BusWidth   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { VALUE_MAP_ENTRY_0,
                VALUE_MAP_ENTRY_1, VALUE_MAP_ENTRY_8, VALUE_MAP_ENTRY_16, VALUE_MAP_ENTRY_32,
                VALUE_MAP_ENTRY_64, VALUE_MAP_ENTRY_128 };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Card.getPackages();

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
     *   The SystemBusCard class represents additional information for a CIM_Card, detailing the Card's bus type and data width. These properties dictate the type of Slot into which the Card can be inserted. For example, using the properties of this class, one can define that a Card is a PCI, 64 bit adapter.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SystemBusCard(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The SystemBusCard class represents additional information for a CIM_Card, detailing the Card's bus type and data width. These properties dictate the type of Slot into which the Card can be inserted. For example, using the properties of this class, one can define that a Card is a PCI, 64 bit adapter.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SystemBusCard(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SystemBusCard() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("BusType", new CIMProperty("BusType", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("BusWidth", new CIMProperty("BusWidth", CIMDataType.UINT16_T, null));

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
     * Get the property BusType
     *     * <br>
     * An enumerated integer describing the System bus type for this Card. It indicates the type of Slot into which the Card can plug. The list of permissible values aligns with the System bus types in CIM_PhysicalConnector.Connector Type.
     *     */

    public javax.cim.UnsignedInteger16 get_BusType() {
        CIMProperty currentProperty = getProperty(PROPERTY_BUSTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BUSTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property BusType
     * <br>
     * An enumerated integer describing the System bus type for this Card. It indicates the type of Slot into which the Card can plug. The list of permissible values aligns with the System bus types in CIM_PhysicalConnector.Connector Type.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BusType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BUSTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BusType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BUSTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BusType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BusType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SystemBusCard fco = new CIM_SystemBusCard(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BUSTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_BusType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BUSTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BusType
     * <br>
     * An enumerated integer describing the System bus type for this Card. It indicates the type of Slot into which the Card can plug. The list of permissible values aligns with the System bus types in CIM_PhysicalConnector.Connector Type.
     */

    private static CIMProperty setPropertyValue_BusType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property BusWidth
     *     * <br>
     * System bus width (in bits) required by this Card. If 'unknown', enter 0. If 'other' than the values, 8, 16, 32, 64 or 128, enter 1. The list of permissible values aligns with the data in CIM_Slot.MaxBusWidth.
     *     */

    public javax.cim.UnsignedInteger16 get_BusWidth() {
        CIMProperty currentProperty = getProperty(PROPERTY_BUSWIDTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BUSWIDTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property BusWidth
     * <br>
     * System bus width (in bits) required by this Card. If 'unknown', enter 0. If 'other' than the values, 8, 16, 32, 64 or 128, enter 1. The list of permissible values aligns with the data in CIM_Slot.MaxBusWidth.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BusWidth(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BUSWIDTH.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BusWidth(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BUSWIDTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BusWidth by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BusWidth(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SystemBusCard fco = new CIM_SystemBusCard(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BUSWIDTH.NAME);
        if (property != null) {
            property = setPropertyValue_BusWidth(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BUSWIDTH.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BusWidth
     * <br>
     * System bus width (in bits) required by this Card. If 'unknown', enter 0. If 'other' than the values, 8, 16, 32, 64 or 128, enter 1. The list of permissible values aligns with the data in CIM_Slot.MaxBusWidth.
     */

    private static CIMProperty setPropertyValue_BusWidth(CIMProperty currentProperty,
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
        return CIM_SystemBusCard.CIM_CLASS_NAME;
    }

}