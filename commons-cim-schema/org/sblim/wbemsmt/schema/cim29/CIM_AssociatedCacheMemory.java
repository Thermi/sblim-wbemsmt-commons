/** 
 * CIM_AssociatedCacheMemory.java
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
 * Description: Indicates that the Memory provides Cache to the Dependent Logical Element.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_AssociatedCacheMemory extends CIM_AssociatedMemory {

    public final static String CIM_CLASS_NAME = "CIM_AssociatedCacheMemory";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Associativity
     * An integer enumeration defining the system cache associativity. For example, 5 indicates a fully associative cache.
     */
    public static class PROPERTY_ASSOCIATIVITY {
        /**
         * name of the property Associativity
         */
        public final static String NAME = "Associativity";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Direct_Mapped = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Direct Mapped (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Direct_Mapped = "Direct Mapped";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_2_way_Set_Associative = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry 2-way Set-Associative (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_2_way_Set_Associative = "2-way Set-Associative";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_4_way_Set_Associative = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry 4-way Set-Associative (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_4_way_Set_Associative = "4-way Set-Associative";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Fully_Associative = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Fully Associative (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Fully_Associative = "Fully Associative";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_8_way_Set_Associative = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry 8-way Set-Associative (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_8_way_Set_Associative = "8-way Set-Associative";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_16_way_Set_Associative = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry 16-way Set-Associative (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_16_way_Set_Associative = "16-way Set-Associative";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@16721672
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Direct_Mapped.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Direct_Mapped;
            }

            if (VALUE_ENTRY_2_way_Set_Associative.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_2_way_Set_Associative;
            }

            if (VALUE_ENTRY_4_way_Set_Associative.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_4_way_Set_Associative;
            }

            if (VALUE_ENTRY_Fully_Associative.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Fully_Associative;
            }

            if (VALUE_ENTRY_8_way_Set_Associative.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_8_way_Set_Associative;
            }

            if (VALUE_ENTRY_16_way_Set_Associative.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_16_way_Set_Associative;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Direct_Mapped.intValue()) {
                return VALUE_ENTRY_Direct_Mapped;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_2_way_Set_Associative.intValue()) {
                return VALUE_ENTRY_2_way_Set_Associative;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_4_way_Set_Associative.intValue()) {
                return VALUE_ENTRY_4_way_Set_Associative;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Fully_Associative.intValue()) {
                return VALUE_ENTRY_Fully_Associative;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_8_way_Set_Associative.intValue()) {
                return VALUE_ENTRY_8_way_Set_Associative;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_16_way_Set_Associative.intValue()) {
                return VALUE_ENTRY_16_way_Set_Associative;
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
         * Value Map for the property Associativity   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Direct_Mapped,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_2_way_Set_Associative,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_4_way_Set_Associative,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Fully_Associative,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_8_way_Set_Associative,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_16_way_Set_Associative };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Associativity   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Direct_Mapped, VALUE_ENTRY_2_way_Set_Associative,
                VALUE_ENTRY_4_way_Set_Associative, VALUE_ENTRY_Fully_Associative,
                VALUE_ENTRY_8_way_Set_Associative, VALUE_ENTRY_16_way_Set_Associative };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Associativity   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Direct_Mapped, VALUE_ENTRY_2_way_Set_Associative,
                VALUE_ENTRY_4_way_Set_Associative, VALUE_ENTRY_Fully_Associative,
                VALUE_ENTRY_8_way_Set_Associative, VALUE_ENTRY_16_way_Set_Associative };

    }

    /**
     * Constants of property CacheType
     * Defines whether this is for instruction caching (value=2), data caching (value=3) or both (value=4, "Unified"). Also, "Other" (1) and "Unknown" (0) can be defined.
     */
    public static class PROPERTY_CACHETYPE {
        /**
         * name of the property CacheType
         */
        public final static String NAME = "CacheType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Instruction = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Instruction (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Instruction = "Instruction";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Data = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Data (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Data = "Data";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Unified = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Unified (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Unified = "Unified";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@32163216
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Instruction.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Instruction;
            }

            if (VALUE_ENTRY_Data.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Data;
            }

            if (VALUE_ENTRY_Unified.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Unified;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Instruction.intValue()) {
                return VALUE_ENTRY_Instruction;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Data.intValue()) {
                return VALUE_ENTRY_Data;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Unified.intValue()) {
                return VALUE_ENTRY_Unified;
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
         * Value Map for the property CacheType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Instruction,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Data, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Unified };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property CacheType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Instruction, VALUE_ENTRY_Data, VALUE_ENTRY_Unified };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property CacheType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Instruction, VALUE_ENTRY_Data, VALUE_ENTRY_Unified };

    }

    /**
     * Constants of property FlushTimer
     * Maximum amount of time, in seconds, dirty lines or buckets may remain in the Cache before they are flushed. A value of zero indicated that a cache flush is not controlled by a flushing timer.
     */
    public static class PROPERTY_FLUSHTIMER {
        /**
         * name of the property FlushTimer
         */
        public final static String NAME = "FlushTimer";

    }

    /**
     * Constants of property Level
     * Defines whether this is the Primary (value=3), Secondary (value=4) or Tertiary (value=5) Cache. Also, "Other" (1), "Unknown" (0) and "Not Applicable" (2) can be defined.
     */
    public static class PROPERTY_LEVEL {
        /**
         * name of the property Level
         */
        public final static String NAME = "Level";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Primary = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Primary (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Primary = "Primary";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Secondary = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Secondary (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Secondary = "Secondary";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Tertiary = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Tertiary (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Tertiary = "Tertiary";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@60fa60fa
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable;
            }

            if (VALUE_ENTRY_Primary.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Primary;
            }

            if (VALUE_ENTRY_Secondary.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Secondary;
            }

            if (VALUE_ENTRY_Tertiary.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Tertiary;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Primary.intValue()) {
                return VALUE_ENTRY_Primary;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Secondary.intValue()) {
                return VALUE_ENTRY_Secondary;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Tertiary.intValue()) {
                return VALUE_ENTRY_Tertiary;
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
         * Value Map for the property Level   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Primary,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Secondary,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Tertiary };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Level   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Primary, VALUE_ENTRY_Secondary,
                VALUE_ENTRY_Tertiary };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Level   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Primary,
                VALUE_ENTRY_Secondary, VALUE_ENTRY_Tertiary };

    }

    /**
     * Constants of property LineSize
     * Size, in bytes, of a single cache bucket or line.
     */
    public static class PROPERTY_LINESIZE {
        /**
         * name of the property LineSize
         */
        public final static String NAME = "LineSize";

    }

    /**
     * Constants of property OtherAssociativityDescription
     * A string describing the cache associativity when the Associativity value is 1, "Other".
     */
    public static class PROPERTY_OTHERASSOCIATIVITYDESCRIPTION {
        /**
         * name of the property OtherAssociativityDescription
         */
        public final static String NAME = "OtherAssociativityDescription";

    }

    /**
     * Constants of property OtherCacheTypeDescription
     * A string describing the Cache Type when the CacheType value is 1, "Other".
     */
    public static class PROPERTY_OTHERCACHETYPEDESCRIPTION {
        /**
         * name of the property OtherCacheTypeDescription
         */
        public final static String NAME = "OtherCacheTypeDescription";

    }

    /**
     * Constants of property OtherLevelDescription
     * A string describing the cache level when the Level value is 1, "Other".
     */
    public static class PROPERTY_OTHERLEVELDESCRIPTION {
        /**
         * name of the property OtherLevelDescription
         */
        public final static String NAME = "OtherLevelDescription";

    }

    /**
     * Constants of property OtherReadPolicyDescription
     * A string describing the read policy when the ReadPolicy value is 1, "Other".
     */
    public static class PROPERTY_OTHERREADPOLICYDESCRIPTION {
        /**
         * name of the property OtherReadPolicyDescription
         */
        public final static String NAME = "OtherReadPolicyDescription";

    }

    /**
     * Constants of property OtherReplacementPolicyDescription
     * A string describing the Cache replacement policy when the ReplacementPolicy value is 1, "Other".
     */
    public static class PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION {
        /**
         * name of the property OtherReplacementPolicyDescription
         */
        public final static String NAME = "OtherReplacementPolicyDescription";

    }

    /**
     * Constants of property OtherWritePolicyDescription
     * A string describing the Write Policy when the WritePolicy value is 1, "Other".
     */
    public static class PROPERTY_OTHERWRITEPOLICYDESCRIPTION {
        /**
         * name of the property OtherWritePolicyDescription
         */
        public final static String NAME = "OtherWritePolicyDescription";

    }

    /**
     * Constants of property ReadPolicy
     * Policy that shall be employed by the Cache for handling read requests. For example, "Read", "Read-Ahead" or both can be specified using the values, 2, 3 or 4, respectively. If the read policy is determined individually (ie, for each request), then the value 5 ("Determination per I/O") should be specified. "Other" (1) and "Unknown" (0) are also valid values.
     */
    public static class PROPERTY_READPOLICY {
        /**
         * name of the property ReadPolicy
         */
        public final static String NAME = "ReadPolicy";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Read = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Read (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Read = "Read";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Read_Ahead = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Read-Ahead (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Read_Ahead = "Read-Ahead";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Read_and_Read_Ahead = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Read and Read-Ahead (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Read_and_Read_Ahead = "Read and Read-Ahead";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Determination_Per_I_O = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Determination Per I/O (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Determination_Per_I_O = "Determination Per I/O";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@712a712a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Read.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Read;
            }

            if (VALUE_ENTRY_Read_Ahead.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Read_Ahead;
            }

            if (VALUE_ENTRY_Read_and_Read_Ahead.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Read_and_Read_Ahead;
            }

            if (VALUE_ENTRY_Determination_Per_I_O.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Determination_Per_I_O;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Read.intValue()) {
                return VALUE_ENTRY_Read;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Read_Ahead.intValue()) {
                return VALUE_ENTRY_Read_Ahead;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Read_and_Read_Ahead.intValue()) {
                return VALUE_ENTRY_Read_and_Read_Ahead;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Determination_Per_I_O.intValue()) {
                return VALUE_ENTRY_Determination_Per_I_O;
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
         * Value Map for the property ReadPolicy   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Read,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Read_Ahead,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Read_and_Read_Ahead,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Determination_Per_I_O };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ReadPolicy   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Read, VALUE_ENTRY_Read_Ahead, VALUE_ENTRY_Read_and_Read_Ahead,
                VALUE_ENTRY_Determination_Per_I_O };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ReadPolicy   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Read, VALUE_ENTRY_Read_Ahead,
                VALUE_ENTRY_Read_and_Read_Ahead, VALUE_ENTRY_Determination_Per_I_O };

    }

    /**
     * Constants of property ReplacementPolicy
     * An integer enumeration describing the algorithm to determine which cache lines or buckets should be re-used.
     */
    public static class PROPERTY_REPLACEMENTPOLICY {
        /**
         * name of the property ReplacementPolicy
         */
        public final static String NAME = "ReplacementPolicy";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Least_Recently_Used__LRU_ = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Least Recently Used (LRU) (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Least_Recently_Used__LRU_ = "Least Recently Used (LRU)";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_First_In_First_Out__FIFO_ = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry First In First Out (FIFO) (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_First_In_First_Out__FIFO_ = "First In First Out (FIFO)";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Last_In_First_Out__LIFO_ = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Last In First Out (LIFO) (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Last_In_First_Out__LIFO_ = "Last In First Out (LIFO)";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Least_Frequently_Used__LFU_ = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Least Frequently Used (LFU) (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Least_Frequently_Used__LFU_ = "Least Frequently Used (LFU)";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Most_Frequently_Used__MFU_ = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Most Frequently Used (MFU) (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Most_Frequently_Used__MFU_ = "Most Frequently Used (MFU)";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Data_Dependent_Multiple_Algorithms = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Data Dependent Multiple Algorithms (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Data_Dependent_Multiple_Algorithms = "Data Dependent Multiple Algorithms";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@73447344
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Least_Recently_Used__LRU_.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Least_Recently_Used__LRU_;
            }

            if (VALUE_ENTRY_First_In_First_Out__FIFO_.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_First_In_First_Out__FIFO_;
            }

            if (VALUE_ENTRY_Last_In_First_Out__LIFO_.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Last_In_First_Out__LIFO_;
            }

            if (VALUE_ENTRY_Least_Frequently_Used__LFU_.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Least_Frequently_Used__LFU_;
            }

            if (VALUE_ENTRY_Most_Frequently_Used__MFU_.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Most_Frequently_Used__MFU_;
            }

            if (VALUE_ENTRY_Data_Dependent_Multiple_Algorithms.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Data_Dependent_Multiple_Algorithms;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Least_Recently_Used__LRU_.intValue()) {
                return VALUE_ENTRY_Least_Recently_Used__LRU_;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_First_In_First_Out__FIFO_.intValue()) {
                return VALUE_ENTRY_First_In_First_Out__FIFO_;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Last_In_First_Out__LIFO_.intValue()) {
                return VALUE_ENTRY_Last_In_First_Out__LIFO_;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Least_Frequently_Used__LFU_.intValue()) {
                return VALUE_ENTRY_Least_Frequently_Used__LFU_;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Most_Frequently_Used__MFU_.intValue()) {
                return VALUE_ENTRY_Most_Frequently_Used__MFU_;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Data_Dependent_Multiple_Algorithms
                    .intValue()) {
                return VALUE_ENTRY_Data_Dependent_Multiple_Algorithms;
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
         * Value Map for the property ReplacementPolicy   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Least_Recently_Used__LRU_,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_First_In_First_Out__FIFO_,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Last_In_First_Out__LIFO_,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Least_Frequently_Used__LFU_,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Most_Frequently_Used__MFU_,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Data_Dependent_Multiple_Algorithms };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ReplacementPolicy   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Least_Recently_Used__LRU_, VALUE_ENTRY_First_In_First_Out__FIFO_,
                VALUE_ENTRY_Last_In_First_Out__LIFO_, VALUE_ENTRY_Least_Frequently_Used__LFU_,
                VALUE_ENTRY_Most_Frequently_Used__MFU_,
                VALUE_ENTRY_Data_Dependent_Multiple_Algorithms };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ReplacementPolicy   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Least_Recently_Used__LRU_,
                VALUE_ENTRY_First_In_First_Out__FIFO_, VALUE_ENTRY_Last_In_First_Out__LIFO_,
                VALUE_ENTRY_Least_Frequently_Used__LFU_, VALUE_ENTRY_Most_Frequently_Used__MFU_,
                VALUE_ENTRY_Data_Dependent_Multiple_Algorithms };

    }

    /**
     * Constants of property WritePolicy
     * Defines whether this is write-back (value=2) or write-through (value=3) Cache, or whether this information "Varies with Address" (4) or is defined individually for each I/O (5). Also, "Other" (1) and "Unknown" (0) can be specified.
     */
    public static class PROPERTY_WRITEPOLICY {
        /**
         * name of the property WritePolicy
         */
        public final static String NAME = "WritePolicy";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Write_Back = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Write Back (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Write_Back = "Write Back";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Write_Through = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Write Through (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Write_Through = "Write Through";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Varies_with_Address = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Varies with Address (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Varies_with_Address = "Varies with Address";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Determination_Per_I_O = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Determination Per I/O (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Determination_Per_I_O = "Determination Per I/O";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@40ea40ea
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Write_Back.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Write_Back;
            }

            if (VALUE_ENTRY_Write_Through.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Write_Through;
            }

            if (VALUE_ENTRY_Varies_with_Address.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Varies_with_Address;
            }

            if (VALUE_ENTRY_Determination_Per_I_O.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Determination_Per_I_O;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Write_Back.intValue()) {
                return VALUE_ENTRY_Write_Back;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Write_Through.intValue()) {
                return VALUE_ENTRY_Write_Through;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Varies_with_Address.intValue()) {
                return VALUE_ENTRY_Varies_with_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Determination_Per_I_O.intValue()) {
                return VALUE_ENTRY_Determination_Per_I_O;
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
         * Value Map for the property WritePolicy   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Write_Back,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Write_Through,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Varies_with_Address,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Determination_Per_I_O };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property WritePolicy   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Write_Back, VALUE_ENTRY_Write_Through, VALUE_ENTRY_Varies_with_Address,
                VALUE_ENTRY_Determination_Per_I_O };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property WritePolicy   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Write_Back, VALUE_ENTRY_Write_Through,
                VALUE_ENTRY_Varies_with_Address, VALUE_ENTRY_Determination_Per_I_O };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_AssociatedMemory.getPackages();

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
     *   Indicates that the Memory provides Cache to the Dependent Logical Element.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_AssociatedCacheMemory(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Indicates that the Memory provides Cache to the Dependent Logical Element.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_AssociatedCacheMemory(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_AssociatedCacheMemory() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Associativity", new CIMProperty("Associativity",
                CIMDataType.UINT16_T, null));
        propertiesToCheck
                .put("CacheType", new CIMProperty("CacheType", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("FlushTimer", new CIMProperty("FlushTimer", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("Level", new CIMProperty("Level", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("LineSize", new CIMProperty("LineSize", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("OtherAssociativityDescription", new CIMProperty(
                "OtherAssociativityDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherCacheTypeDescription", new CIMProperty(
                "OtherCacheTypeDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherLevelDescription", new CIMProperty("OtherLevelDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherReadPolicyDescription", new CIMProperty(
                "OtherReadPolicyDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherReplacementPolicyDescription", new CIMProperty(
                "OtherReplacementPolicyDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherWritePolicyDescription", new CIMProperty(
                "OtherWritePolicyDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("ReadPolicy", new CIMProperty("ReadPolicy", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("ReplacementPolicy", new CIMProperty("ReplacementPolicy",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("WritePolicy", new CIMProperty("WritePolicy", CIMDataType.UINT16_T,
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
     * Get the property Associativity
     *     * <br>
     * An integer enumeration defining the system cache associativity. For example, 5 indicates a fully associative cache.
     *     */

    public javax.cim.UnsignedInteger16 get_Associativity() {
        CIMProperty currentProperty = getProperty(PROPERTY_ASSOCIATIVITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ASSOCIATIVITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Associativity
     * <br>
     * An integer enumeration defining the system cache associativity. For example, 5 indicates a fully associative cache.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Associativity(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ASSOCIATIVITY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Associativity(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ASSOCIATIVITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Associativity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Associativity(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ASSOCIATIVITY.NAME);
        if (property != null) {
            property = setPropertyValue_Associativity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ASSOCIATIVITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Associativity
     * <br>
     * An integer enumeration defining the system cache associativity. For example, 5 indicates a fully associative cache.
     */

    private static CIMProperty setPropertyValue_Associativity(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CacheType
     *     * <br>
     * Defines whether this is for instruction caching (value=2), data caching (value=3) or both (value=4, "Unified"). Also, "Other" (1) and "Unknown" (0) can be defined.
     *     */

    public javax.cim.UnsignedInteger16 get_CacheType() {
        CIMProperty currentProperty = getProperty(PROPERTY_CACHETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CACHETYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property CacheType
     * <br>
     * Defines whether this is for instruction caching (value=2), data caching (value=3) or both (value=4, "Unified"). Also, "Other" (1) and "Unknown" (0) can be defined.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CacheType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CACHETYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CacheType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CACHETYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CacheType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CacheType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CACHETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_CacheType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CACHETYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CacheType
     * <br>
     * Defines whether this is for instruction caching (value=2), data caching (value=3) or both (value=4, "Unified"). Also, "Other" (1) and "Unknown" (0) can be defined.
     */

    private static CIMProperty setPropertyValue_CacheType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FlushTimer
     *     * <br>
     * Maximum amount of time, in seconds, dirty lines or buckets may remain in the Cache before they are flushed. A value of zero indicated that a cache flush is not controlled by a flushing timer.
     *     */

    public javax.cim.UnsignedInteger32 get_FlushTimer() {
        CIMProperty currentProperty = getProperty(PROPERTY_FLUSHTIMER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FLUSHTIMER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property FlushTimer
     * <br>
     * Maximum amount of time, in seconds, dirty lines or buckets may remain in the Cache before they are flushed. A value of zero indicated that a cache flush is not controlled by a flushing timer.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FlushTimer(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FLUSHTIMER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FlushTimer(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FLUSHTIMER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FlushTimer by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FlushTimer(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FLUSHTIMER.NAME);
        if (property != null) {
            property = setPropertyValue_FlushTimer(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FLUSHTIMER.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FlushTimer
     * <br>
     * Maximum amount of time, in seconds, dirty lines or buckets may remain in the Cache before they are flushed. A value of zero indicated that a cache flush is not controlled by a flushing timer.
     */

    private static CIMProperty setPropertyValue_FlushTimer(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Level
     *     * <br>
     * Defines whether this is the Primary (value=3), Secondary (value=4) or Tertiary (value=5) Cache. Also, "Other" (1), "Unknown" (0) and "Not Applicable" (2) can be defined.
     *     */

    public javax.cim.UnsignedInteger16 get_Level() {
        CIMProperty currentProperty = getProperty(PROPERTY_LEVEL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LEVEL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Level
     * <br>
     * Defines whether this is the Primary (value=3), Secondary (value=4) or Tertiary (value=5) Cache. Also, "Other" (1), "Unknown" (0) and "Not Applicable" (2) can be defined.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Level(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LEVEL.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Level(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LEVEL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Level by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Level(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LEVEL.NAME);
        if (property != null) {
            property = setPropertyValue_Level(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LEVEL.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Level
     * <br>
     * Defines whether this is the Primary (value=3), Secondary (value=4) or Tertiary (value=5) Cache. Also, "Other" (1), "Unknown" (0) and "Not Applicable" (2) can be defined.
     */

    private static CIMProperty setPropertyValue_Level(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LineSize
     *     * <br>
     * Size, in bytes, of a single cache bucket or line.
     *     */

    public javax.cim.UnsignedInteger32 get_LineSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_LINESIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LINESIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property LineSize
     * <br>
     * Size, in bytes, of a single cache bucket or line.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LineSize(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LINESIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LineSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LINESIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LineSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LineSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LINESIZE.NAME);
        if (property != null) {
            property = setPropertyValue_LineSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LINESIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LineSize
     * <br>
     * Size, in bytes, of a single cache bucket or line.
     */

    private static CIMProperty setPropertyValue_LineSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherAssociativityDescription
     *     * <br>
     * A string describing the cache associativity when the Associativity value is 1, "Other".
     *     */

    public String get_OtherAssociativityDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERASSOCIATIVITYDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERASSOCIATIVITYDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherAssociativityDescription
     * <br>
     * A string describing the cache associativity when the Associativity value is 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherAssociativityDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERASSOCIATIVITYDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherAssociativityDescription(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERASSOCIATIVITYDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherAssociativityDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherAssociativityDescription(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERASSOCIATIVITYDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherAssociativityDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERASSOCIATIVITYDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherAssociativityDescription
     * <br>
     * A string describing the cache associativity when the Associativity value is 1, "Other".
     */

    private static CIMProperty setPropertyValue_OtherAssociativityDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherCacheTypeDescription
     *     * <br>
     * A string describing the Cache Type when the CacheType value is 1, "Other".
     *     */

    public String get_OtherCacheTypeDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERCACHETYPEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERCACHETYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherCacheTypeDescription
     * <br>
     * A string describing the Cache Type when the CacheType value is 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherCacheTypeDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERCACHETYPEDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherCacheTypeDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERCACHETYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherCacheTypeDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherCacheTypeDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERCACHETYPEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherCacheTypeDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERCACHETYPEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherCacheTypeDescription
     * <br>
     * A string describing the Cache Type when the CacheType value is 1, "Other".
     */

    private static CIMProperty setPropertyValue_OtherCacheTypeDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherLevelDescription
     *     * <br>
     * A string describing the cache level when the Level value is 1, "Other".
     *     */

    public String get_OtherLevelDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERLEVELDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERLEVELDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherLevelDescription
     * <br>
     * A string describing the cache level when the Level value is 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherLevelDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERLEVELDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherLevelDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERLEVELDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherLevelDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherLevelDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERLEVELDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherLevelDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERLEVELDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherLevelDescription
     * <br>
     * A string describing the cache level when the Level value is 1, "Other".
     */

    private static CIMProperty setPropertyValue_OtherLevelDescription(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherReadPolicyDescription
     *     * <br>
     * A string describing the read policy when the ReadPolicy value is 1, "Other".
     *     */

    public String get_OtherReadPolicyDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERREADPOLICYDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERREADPOLICYDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherReadPolicyDescription
     * <br>
     * A string describing the read policy when the ReadPolicy value is 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherReadPolicyDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERREADPOLICYDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherReadPolicyDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERREADPOLICYDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherReadPolicyDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherReadPolicyDescription(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERREADPOLICYDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherReadPolicyDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERREADPOLICYDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherReadPolicyDescription
     * <br>
     * A string describing the read policy when the ReadPolicy value is 1, "Other".
     */

    private static CIMProperty setPropertyValue_OtherReadPolicyDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherReplacementPolicyDescription
     *     * <br>
     * A string describing the Cache replacement policy when the ReplacementPolicy value is 1, "Other".
     *     */

    public String get_OtherReplacementPolicyDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherReplacementPolicyDescription
     * <br>
     * A string describing the Cache replacement policy when the ReplacementPolicy value is 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherReplacementPolicyDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherReplacementPolicyDescription(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherReplacementPolicyDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherReplacementPolicyDescription(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherReplacementPolicyDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherReplacementPolicyDescription
     * <br>
     * A string describing the Cache replacement policy when the ReplacementPolicy value is 1, "Other".
     */

    private static CIMProperty setPropertyValue_OtherReplacementPolicyDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherWritePolicyDescription
     *     * <br>
     * A string describing the Write Policy when the WritePolicy value is 1, "Other".
     *     */

    public String get_OtherWritePolicyDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERWRITEPOLICYDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERWRITEPOLICYDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherWritePolicyDescription
     * <br>
     * A string describing the Write Policy when the WritePolicy value is 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherWritePolicyDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERWRITEPOLICYDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherWritePolicyDescription(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERWRITEPOLICYDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherWritePolicyDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherWritePolicyDescription(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERWRITEPOLICYDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherWritePolicyDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERWRITEPOLICYDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherWritePolicyDescription
     * <br>
     * A string describing the Write Policy when the WritePolicy value is 1, "Other".
     */

    private static CIMProperty setPropertyValue_OtherWritePolicyDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReadPolicy
     *     * <br>
     * Policy that shall be employed by the Cache for handling read requests. For example, "Read", "Read-Ahead" or both can be specified using the values, 2, 3 or 4, respectively. If the read policy is determined individually (ie, for each request), then the value 5 ("Determination per I/O") should be specified. "Other" (1) and "Unknown" (0) are also valid values.
     *     */

    public javax.cim.UnsignedInteger16 get_ReadPolicy() {
        CIMProperty currentProperty = getProperty(PROPERTY_READPOLICY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_READPOLICY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ReadPolicy
     * <br>
     * Policy that shall be employed by the Cache for handling read requests. For example, "Read", "Read-Ahead" or both can be specified using the values, 2, 3 or 4, respectively. If the read policy is determined individually (ie, for each request), then the value 5 ("Determination per I/O") should be specified. "Other" (1) and "Unknown" (0) are also valid values.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReadPolicy(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_READPOLICY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReadPolicy(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_READPOLICY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReadPolicy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReadPolicy(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_READPOLICY.NAME);
        if (property != null) {
            property = setPropertyValue_ReadPolicy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_READPOLICY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReadPolicy
     * <br>
     * Policy that shall be employed by the Cache for handling read requests. For example, "Read", "Read-Ahead" or both can be specified using the values, 2, 3 or 4, respectively. If the read policy is determined individually (ie, for each request), then the value 5 ("Determination per I/O") should be specified. "Other" (1) and "Unknown" (0) are also valid values.
     */

    private static CIMProperty setPropertyValue_ReadPolicy(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReplacementPolicy
     *     * <br>
     * An integer enumeration describing the algorithm to determine which cache lines or buckets should be re-used.
     *     */

    public javax.cim.UnsignedInteger16 get_ReplacementPolicy() {
        CIMProperty currentProperty = getProperty(PROPERTY_REPLACEMENTPOLICY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REPLACEMENTPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ReplacementPolicy
     * <br>
     * An integer enumeration describing the algorithm to determine which cache lines or buckets should be re-used.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReplacementPolicy(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REPLACEMENTPOLICY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReplacementPolicy(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REPLACEMENTPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReplacementPolicy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReplacementPolicy(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REPLACEMENTPOLICY.NAME);
        if (property != null) {
            property = setPropertyValue_ReplacementPolicy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REPLACEMENTPOLICY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReplacementPolicy
     * <br>
     * An integer enumeration describing the algorithm to determine which cache lines or buckets should be re-used.
     */

    private static CIMProperty setPropertyValue_ReplacementPolicy(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property WritePolicy
     *     * <br>
     * Defines whether this is write-back (value=2) or write-through (value=3) Cache, or whether this information "Varies with Address" (4) or is defined individually for each I/O (5). Also, "Other" (1) and "Unknown" (0) can be specified.
     *     */

    public javax.cim.UnsignedInteger16 get_WritePolicy() {
        CIMProperty currentProperty = getProperty(PROPERTY_WRITEPOLICY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_WRITEPOLICY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property WritePolicy
     * <br>
     * Defines whether this is write-back (value=2) or write-through (value=3) Cache, or whether this information "Varies with Address" (4) or is defined individually for each I/O (5). Also, "Other" (1) and "Unknown" (0) can be specified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_WritePolicy(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_WRITEPOLICY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_WritePolicy(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_WRITEPOLICY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property WritePolicy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_WritePolicy(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AssociatedCacheMemory fco = new CIM_AssociatedCacheMemory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_WRITEPOLICY.NAME);
        if (property != null) {
            property = setPropertyValue_WritePolicy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_WRITEPOLICY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property WritePolicy
     * <br>
     * Defines whether this is write-back (value=2) or write-through (value=3) Cache, or whether this information "Varies with Address" (4) or is defined individually for each I/O (5). Also, "Other" (1) and "Unknown" (0) can be specified.
     */

    private static CIMProperty setPropertyValue_WritePolicy(CIMProperty currentProperty,
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
        return CIM_AssociatedCacheMemory.CIM_CLASS_NAME;
    }

}