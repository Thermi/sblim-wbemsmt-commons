/** 
 * CIM_PhysicalMemory.java
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
 * Description: PhysicalMemory is a subclass of CIM_Chip, representing low level memory devices - SIMMS, DIMMs, raw memory chips, etc.
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

public class CIM_PhysicalMemory extends CIM_Chip {

    public final static String CIM_CLASS_NAME = "CIM_PhysicalMemory";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * PhysicalMemory can be located on HostingBoards, adapter Cards, etc. This association explicitly defines this relationship of Memory to Cards.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD = "CIM_MemoryOnCard";

    /**
     * MemoryWithMedia indicates that Memory is associated with a PhysicalMedia and its cartridge. The Memory provides media identification and also stores user-specific data.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA = "CIM_MemoryWithMedia";

    /**
     * Constants of property BankLabel
     * A string identifying the physically labeled bank where the Memory is located - for example, 'Bank 0' or 'Bank A'.
     */
    public static class PROPERTY_BANKLABEL {
        /**
         * name of the property BankLabel
         */
        public final static String NAME = "BankLabel";

    }

    /**
     * Constants of property Capacity
     * The total capacity of this PhysicalMemory, in bytes.
     */
    public static class PROPERTY_CAPACITY {
        /**
         * name of the property Capacity
         */
        public final static String NAME = "Capacity";

    }

    /**
     * Constants of property DataWidth
     * Data width of the PhysicalMemory, in bits. A data width of 0 and a TotalWidth of 8 would indicate that the Memory is solely used to provide error correction bits.
     */
    public static class PROPERTY_DATAWIDTH {
        /**
         * name of the property DataWidth
         */
        public final static String NAME = "DataWidth";

    }

    /**
     * Constants of property FormFactor
     * 
     */
    public static class PROPERTY_FORMFACTOR {
        /**
         * name of the property FormFactor
         */
        public final static String NAME = "FormFactor";

    }

    /**
     * Constants of property InterleavePosition
     * The position of this PhysicalMemory in an interleave. 0 indicates non-interleaved. 1 indicates the first position, 2 the second position and so on. For example, in a 2:1 interleave, a value of '1' would indicate that the Memory is in the 'even' position.
     */
    public static class PROPERTY_INTERLEAVEPOSITION {
        /**
         * name of the property InterleavePosition
         */
        public final static String NAME = "InterleavePosition";

    }

    /**
     * Constants of property MemoryType
     * The type of PhysicalMemory.
     */
    public static class PROPERTY_MEMORYTYPE {
        /**
         * name of the property MemoryType
         */
        public final static String NAME = "MemoryType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DRAM = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry DRAM (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_DRAM = "DRAM";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Synchronous_DRAM = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Synchronous DRAM (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Synchronous_DRAM = "Synchronous DRAM";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Cache_DRAM = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Cache DRAM (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Cache_DRAM = "Cache DRAM";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_EDO = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry EDO (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_EDO = "EDO";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_EDRAM = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry EDRAM (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_EDRAM = "EDRAM";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_VRAM = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry VRAM (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_VRAM = "VRAM";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SRAM = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry SRAM (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_SRAM = "SRAM";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_RAM = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry RAM (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_RAM = "RAM";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_ROM = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry ROM (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_ROM = "ROM";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Flash = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Flash (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Flash = "Flash";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_EEPROM = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry EEPROM (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_EEPROM = "EEPROM";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_FEPROM = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry FEPROM (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_FEPROM = "FEPROM";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_EPROM = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry EPROM (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_EPROM = "EPROM";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CDRAM = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry CDRAM (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_CDRAM = "CDRAM";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_3DRAM = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry 3DRAM (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_3DRAM = "3DRAM";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_SDRAM = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry SDRAM (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_SDRAM = "SDRAM";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_SGRAM = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry SGRAM (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_SGRAM = "SGRAM";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_RDRAM = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry RDRAM (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_RDRAM = "RDRAM";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_DDR = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry DDR (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_DDR = "DDR";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_DDR2 = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry DDR2 (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_DDR2 = "DDR2";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@73fe73fe
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_DRAM.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DRAM;
            }

            if (VALUE_ENTRY_Synchronous_DRAM.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Synchronous_DRAM;
            }

            if (VALUE_ENTRY_Cache_DRAM.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Cache_DRAM;
            }

            if (VALUE_ENTRY_EDO.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_EDO;
            }

            if (VALUE_ENTRY_EDRAM.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_EDRAM;
            }

            if (VALUE_ENTRY_VRAM.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_VRAM;
            }

            if (VALUE_ENTRY_SRAM.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SRAM;
            }

            if (VALUE_ENTRY_RAM.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_RAM;
            }

            if (VALUE_ENTRY_ROM.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_ROM;
            }

            if (VALUE_ENTRY_Flash.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Flash;
            }

            if (VALUE_ENTRY_EEPROM.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_EEPROM;
            }

            if (VALUE_ENTRY_FEPROM.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_FEPROM;
            }

            if (VALUE_ENTRY_EPROM.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_EPROM;
            }

            if (VALUE_ENTRY_CDRAM.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CDRAM;
            }

            if (VALUE_ENTRY_3DRAM.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_3DRAM;
            }

            if (VALUE_ENTRY_SDRAM.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_SDRAM;
            }

            if (VALUE_ENTRY_SGRAM.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_SGRAM;
            }

            if (VALUE_ENTRY_RDRAM.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_RDRAM;
            }

            if (VALUE_ENTRY_DDR.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_DDR;
            }

            if (VALUE_ENTRY_DDR2.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_DDR2;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DRAM.intValue()) {
                return VALUE_ENTRY_DRAM;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Synchronous_DRAM.intValue()) {
                return VALUE_ENTRY_Synchronous_DRAM;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Cache_DRAM.intValue()) {
                return VALUE_ENTRY_Cache_DRAM;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_EDO.intValue()) {
                return VALUE_ENTRY_EDO;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_EDRAM.intValue()) {
                return VALUE_ENTRY_EDRAM;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_VRAM.intValue()) {
                return VALUE_ENTRY_VRAM;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SRAM.intValue()) {
                return VALUE_ENTRY_SRAM;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_RAM.intValue()) {
                return VALUE_ENTRY_RAM;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_ROM.intValue()) {
                return VALUE_ENTRY_ROM;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Flash.intValue()) {
                return VALUE_ENTRY_Flash;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_EEPROM.intValue()) {
                return VALUE_ENTRY_EEPROM;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_FEPROM.intValue()) {
                return VALUE_ENTRY_FEPROM;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_EPROM.intValue()) {
                return VALUE_ENTRY_EPROM;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CDRAM.intValue()) {
                return VALUE_ENTRY_CDRAM;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_3DRAM.intValue()) {
                return VALUE_ENTRY_3DRAM;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_SDRAM.intValue()) {
                return VALUE_ENTRY_SDRAM;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_SGRAM.intValue()) {
                return VALUE_ENTRY_SGRAM;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_RDRAM.intValue()) {
                return VALUE_ENTRY_RDRAM;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_DDR.intValue()) {
                return VALUE_ENTRY_DDR;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_DDR2.intValue()) {
                return VALUE_ENTRY_DDR2;
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
         * Value Map for the property MemoryType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DRAM,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Synchronous_DRAM,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Cache_DRAM,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_EDO, VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_EDRAM,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_VRAM, VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SRAM,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_RAM, VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_ROM,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Flash,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_EEPROM,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_FEPROM,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_EPROM, VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_CDRAM,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_3DRAM, VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_SDRAM,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_SGRAM, VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_RDRAM,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_DDR, VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_DDR2 };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property MemoryType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_DRAM, VALUE_ENTRY_Synchronous_DRAM, VALUE_ENTRY_Cache_DRAM,
                VALUE_ENTRY_EDO, VALUE_ENTRY_EDRAM, VALUE_ENTRY_VRAM, VALUE_ENTRY_SRAM,
                VALUE_ENTRY_RAM, VALUE_ENTRY_ROM, VALUE_ENTRY_Flash, VALUE_ENTRY_EEPROM,
                VALUE_ENTRY_FEPROM, VALUE_ENTRY_EPROM, VALUE_ENTRY_CDRAM, VALUE_ENTRY_3DRAM,
                VALUE_ENTRY_SDRAM, VALUE_ENTRY_SGRAM, VALUE_ENTRY_RDRAM, VALUE_ENTRY_DDR,
                VALUE_ENTRY_DDR2 };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property MemoryType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_DRAM, VALUE_ENTRY_Synchronous_DRAM,
                VALUE_ENTRY_Cache_DRAM, VALUE_ENTRY_EDO, VALUE_ENTRY_EDRAM, VALUE_ENTRY_VRAM,
                VALUE_ENTRY_SRAM, VALUE_ENTRY_RAM, VALUE_ENTRY_ROM, VALUE_ENTRY_Flash,
                VALUE_ENTRY_EEPROM, VALUE_ENTRY_FEPROM, VALUE_ENTRY_EPROM, VALUE_ENTRY_CDRAM,
                VALUE_ENTRY_3DRAM, VALUE_ENTRY_SDRAM, VALUE_ENTRY_SGRAM, VALUE_ENTRY_RDRAM,
                VALUE_ENTRY_DDR, VALUE_ENTRY_DDR2 };

    }

    /**
     * Constants of property PositionInRow
     * Specifies the position of the PhysicalMemory in a 'row'. For example, if it takes two 8-bit memory devices to form a 16- bit row, then a value of '2'means that this Memory is the second device. 0 is an invalid value for this property.
     */
    public static class PROPERTY_POSITIONINROW {
        /**
         * name of the property PositionInRow
         */
        public final static String NAME = "PositionInRow";

    }

    /**
     * Constants of property Speed
     * The speed of the PhysicalMemory, in nanoseconds.
     */
    public static class PROPERTY_SPEED {
        /**
         * name of the property Speed
         */
        public final static String NAME = "Speed";

    }

    /**
     * Constants of property TotalWidth
     * Total width, in bits, of the PhysicalMemory, including check or error correction bits. If there are no error correction bits, the value in this property should match that specified for DataWidth.
     */
    public static class PROPERTY_TOTALWIDTH {
        /**
         * name of the property TotalWidth
         */
        public final static String NAME = "TotalWidth";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Chip.getPackages();

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
     *   PhysicalMemory is a subclass of CIM_Chip, representing low level memory devices - SIMMS, DIMMs, raw memory chips, etc.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_PhysicalMemory(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   PhysicalMemory is a subclass of CIM_Chip, representing low level memory devices - SIMMS, DIMMs, raw memory chips, etc.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_PhysicalMemory(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_PhysicalMemory() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck
                .put("BankLabel", new CIMProperty("BankLabel", CIMDataType.STRING_T, null));
        propertiesToCheck.put("Capacity", new CIMProperty("Capacity", CIMDataType.UINT64_T, null));
        propertiesToCheck
                .put("DataWidth", new CIMProperty("DataWidth", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("FormFactor", new CIMProperty("FormFactor", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("InterleavePosition", new CIMProperty("InterleavePosition",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("MemoryType", new CIMProperty("MemoryType", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("PositionInRow", new CIMProperty("PositionInRow",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("Speed", new CIMProperty("Speed", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("TotalWidth", new CIMProperty("TotalWidth", CIMDataType.UINT16_T,
                null));

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
     * Get the property BankLabel
     *     * <br>
     * A string identifying the physically labeled bank where the Memory is located - for example, 'Bank 0' or 'Bank A'.
     *     */

    public String get_BankLabel() {
        CIMProperty currentProperty = getProperty(PROPERTY_BANKLABEL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BANKLABEL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property BankLabel
     * <br>
     * A string identifying the physically labeled bank where the Memory is located - for example, 'Bank 0' or 'Bank A'.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BankLabel(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BANKLABEL.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BankLabel(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BANKLABEL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BankLabel by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BankLabel(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_PhysicalMemory fco = new CIM_PhysicalMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BANKLABEL.NAME);
        if (property != null) {
            property = setPropertyValue_BankLabel(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BANKLABEL.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BankLabel
     * <br>
     * A string identifying the physically labeled bank where the Memory is located - for example, 'Bank 0' or 'Bank A'.
     */

    private static CIMProperty setPropertyValue_BankLabel(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Capacity
     *     * <br>
     * The total capacity of this PhysicalMemory, in bytes.
     *     */

    public javax.cim.UnsignedInteger64 get_Capacity() {
        CIMProperty currentProperty = getProperty(PROPERTY_CAPACITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CAPACITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Capacity
     * <br>
     * The total capacity of this PhysicalMemory, in bytes.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Capacity(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CAPACITY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Capacity(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CAPACITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Capacity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Capacity(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_PhysicalMemory fco = new CIM_PhysicalMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CAPACITY.NAME);
        if (property != null) {
            property = setPropertyValue_Capacity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CAPACITY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Capacity
     * <br>
     * The total capacity of this PhysicalMemory, in bytes.
     */

    private static CIMProperty setPropertyValue_Capacity(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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
     * Data width of the PhysicalMemory, in bits. A data width of 0 and a TotalWidth of 8 would indicate that the Memory is solely used to provide error correction bits.
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
     * Data width of the PhysicalMemory, in bits. A data width of 0 and a TotalWidth of 8 would indicate that the Memory is solely used to provide error correction bits.
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
        CIM_PhysicalMemory fco = new CIM_PhysicalMemory(client, namespace);
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
     * Data width of the PhysicalMemory, in bits. A data width of 0 and a TotalWidth of 8 would indicate that the Memory is solely used to provide error correction bits.
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
     * Get the property FormFactor
     *     * <br>
     * 
     *     */

    public javax.cim.UnsignedInteger16 get_FormFactor() {
        CIMProperty currentProperty = getProperty(PROPERTY_FORMFACTOR.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FORMFACTOR.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property FormFactor
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FormFactor(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FORMFACTOR.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FormFactor(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FORMFACTOR.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FormFactor by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FormFactor(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_PhysicalMemory fco = new CIM_PhysicalMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FORMFACTOR.NAME);
        if (property != null) {
            property = setPropertyValue_FormFactor(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FORMFACTOR.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FormFactor
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_FormFactor(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property InterleavePosition
     *     * <br>
     * The position of this PhysicalMemory in an interleave. 0 indicates non-interleaved. 1 indicates the first position, 2 the second position and so on. For example, in a 2:1 interleave, a value of '1' would indicate that the Memory is in the 'even' position.
     *     */

    public javax.cim.UnsignedInteger32 get_InterleavePosition() {
        CIMProperty currentProperty = getProperty(PROPERTY_INTERLEAVEPOSITION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INTERLEAVEPOSITION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property InterleavePosition
     * <br>
     * The position of this PhysicalMemory in an interleave. 0 indicates non-interleaved. 1 indicates the first position, 2 the second position and so on. For example, in a 2:1 interleave, a value of '1' would indicate that the Memory is in the 'even' position.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_InterleavePosition(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INTERLEAVEPOSITION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_InterleavePosition(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INTERLEAVEPOSITION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InterleavePosition by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_InterleavePosition(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_PhysicalMemory fco = new CIM_PhysicalMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INTERLEAVEPOSITION.NAME);
        if (property != null) {
            property = setPropertyValue_InterleavePosition(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INTERLEAVEPOSITION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InterleavePosition
     * <br>
     * The position of this PhysicalMemory in an interleave. 0 indicates non-interleaved. 1 indicates the first position, 2 the second position and so on. For example, in a 2:1 interleave, a value of '1' would indicate that the Memory is in the 'even' position.
     */

    private static CIMProperty setPropertyValue_InterleavePosition(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MemoryType
     *     * <br>
     * The type of PhysicalMemory.
     *     */

    public javax.cim.UnsignedInteger16 get_MemoryType() {
        CIMProperty currentProperty = getProperty(PROPERTY_MEMORYTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MEMORYTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property MemoryType
     * <br>
     * The type of PhysicalMemory.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MemoryType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MEMORYTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MemoryType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MEMORYTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MemoryType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MemoryType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_PhysicalMemory fco = new CIM_PhysicalMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MEMORYTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_MemoryType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MEMORYTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MemoryType
     * <br>
     * The type of PhysicalMemory.
     */

    private static CIMProperty setPropertyValue_MemoryType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PositionInRow
     *     * <br>
     * Specifies the position of the PhysicalMemory in a 'row'. For example, if it takes two 8-bit memory devices to form a 16- bit row, then a value of '2'means that this Memory is the second device. 0 is an invalid value for this property.
     *     */

    public javax.cim.UnsignedInteger32 get_PositionInRow() {
        CIMProperty currentProperty = getProperty(PROPERTY_POSITIONINROW.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_POSITIONINROW.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property PositionInRow
     * <br>
     * Specifies the position of the PhysicalMemory in a 'row'. For example, if it takes two 8-bit memory devices to form a 16- bit row, then a value of '2'means that this Memory is the second device. 0 is an invalid value for this property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PositionInRow(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POSITIONINROW.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PositionInRow(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_POSITIONINROW.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PositionInRow by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PositionInRow(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_PhysicalMemory fco = new CIM_PhysicalMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POSITIONINROW.NAME);
        if (property != null) {
            property = setPropertyValue_PositionInRow(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_POSITIONINROW.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PositionInRow
     * <br>
     * Specifies the position of the PhysicalMemory in a 'row'. For example, if it takes two 8-bit memory devices to form a 16- bit row, then a value of '2'means that this Memory is the second device. 0 is an invalid value for this property.
     */

    private static CIMProperty setPropertyValue_PositionInRow(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Speed
     *     * <br>
     * The speed of the PhysicalMemory, in nanoseconds.
     *     */

    public javax.cim.UnsignedInteger32 get_Speed() {
        CIMProperty currentProperty = getProperty(PROPERTY_SPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property Speed
     * <br>
     * The speed of the PhysicalMemory, in nanoseconds.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Speed(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SPEED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Speed(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Speed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Speed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_PhysicalMemory fco = new CIM_PhysicalMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SPEED.NAME);
        if (property != null) {
            property = setPropertyValue_Speed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SPEED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Speed
     * <br>
     * The speed of the PhysicalMemory, in nanoseconds.
     */

    private static CIMProperty setPropertyValue_Speed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TotalWidth
     *     * <br>
     * Total width, in bits, of the PhysicalMemory, including check or error correction bits. If there are no error correction bits, the value in this property should match that specified for DataWidth.
     *     */

    public javax.cim.UnsignedInteger16 get_TotalWidth() {
        CIMProperty currentProperty = getProperty(PROPERTY_TOTALWIDTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TOTALWIDTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property TotalWidth
     * <br>
     * Total width, in bits, of the PhysicalMemory, including check or error correction bits. If there are no error correction bits, the value in this property should match that specified for DataWidth.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TotalWidth(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TOTALWIDTH.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TotalWidth(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TOTALWIDTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TotalWidth by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TotalWidth(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_PhysicalMemory fco = new CIM_PhysicalMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TOTALWIDTH.NAME);
        if (property != null) {
            property = setPropertyValue_TotalWidth(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TOTALWIDTH.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TotalWidth
     * <br>
     * Total width, in bits, of the PhysicalMemory, including check or error correction bits. If there are no error correction bits, the value in this property should match that specified for DataWidth.
     */

    private static CIMProperty setPropertyValue_TotalWidth(CIMProperty currentProperty,
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
     * Get the list with CIM_Card objects associated by the association CIM_MemoryOnCard
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Card_CIM_MemoryOnCards(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Card_CIM_MemoryOnCards(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, CIM_Card.CIM_CLASS_NAME, null, null,
                false, false, null);

    }

    /**
     * Get the list with CIM_Card objects associated by the association CIM_MemoryOnCard
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Card_CIM_MemoryOnCards(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Card_CIM_MemoryOnCards(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_Card objects associated by the association CIM_MemoryOnCard
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Card_CIM_MemoryOnCards(WBEMClient cimClient,
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
                CIM_PhysicalMemoryHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalMemoryHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PhysicalMemoryHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Card(cimInstance));
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
                        result.add(new CIM_Card(cimInstance));
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
                        result.add(new CIM_Card(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalMemoryHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_MemoryOnCard
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Card_CIM_MemoryOnCardNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Card_CIM_MemoryOnCardNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, CIM_Card.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_MemoryOnCard
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Card_CIM_MemoryOnCardNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Card_CIM_MemoryOnCardNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_MemoryOnCard
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Card_CIM_MemoryOnCardNames(WBEMClient cimClient,
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD,
                    CIM_Card.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalMemoryHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalMemoryHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName()
                                    .equals(CIM_Card.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalMemoryHelper.checkException(enumeration);
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
     * Get the list with CIM_MemoryOnCard associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_MemoryOnCard(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalMemoryHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalMemoryHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_MemoryOnCardHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_MemoryOnCard(cimInstance));
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
                        result.add(new CIM_MemoryOnCard(cimInstance));
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
                        result.add(new CIM_MemoryOnCard(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalMemoryHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_MemoryOnCard
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_MemoryOnCard(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalMemoryHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalMemoryHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_MemoryOnCard.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalMemoryHelper.checkException(enumeration);
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
     * Get the list with CIM_PhysicalMedia objects associated by the association CIM_MemoryWithMedia
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_MemoryWithMedias(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_MemoryWithMedias(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA, CIM_PhysicalMedia.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalMedia objects associated by the association CIM_MemoryWithMedia
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_MemoryWithMedias(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_MemoryWithMedias(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalMedia objects associated by the association CIM_MemoryWithMedia
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_MemoryWithMedias(
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
                CIM_PhysicalMemoryHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalMemoryHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PhysicalMemoryHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalMedia(cimInstance));
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
                        result.add(new CIM_PhysicalMedia(cimInstance));
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
                        result.add(new CIM_PhysicalMedia(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalMemoryHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_MemoryWithMedia
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_MemoryWithMediaNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_MemoryWithMediaNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA, CIM_PhysicalMedia.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_MemoryWithMedia
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_MemoryWithMediaNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_MemoryWithMediaNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_MemoryWithMedia
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_MemoryWithMediaNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA,
                    CIM_PhysicalMedia.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalMemoryHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalMemoryHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PhysicalMedia.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalMemoryHelper.checkException(enumeration);
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
     * Get the list with CIM_MemoryWithMedia associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_MemoryWithMedia(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalMemoryHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalMemoryHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_MemoryWithMediaHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_MemoryWithMedia(cimInstance));
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
                        result.add(new CIM_MemoryWithMedia(cimInstance));
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
                        result.add(new CIM_MemoryWithMedia(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalMemoryHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_MemoryWithMedia
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_MemoryWithMedia(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYWITHMEDIA, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalMemoryHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalMemoryHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_MemoryWithMedia.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalMemoryHelper.checkException(enumeration);
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
        return CIM_PhysicalMemory.CIM_CLASS_NAME;
    }

}