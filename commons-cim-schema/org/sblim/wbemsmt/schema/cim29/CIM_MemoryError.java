/** 
 * CIM_MemoryError.java
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
 * Description: MemoryError defines a memory space that has errors. The Key of the class is the StartingAddress of the bytes in error.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_MemoryError extends CIM_StorageError {

    public final static String CIM_CLASS_NAME = "CIM_MemoryError";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AdditionalErrorData
     * An array of octets holding additional error information. An example is ECC Syndrome or the return of the check bits if a CRC-based ErrorMethodology is used. In the latter case, if a single bit error is recognized and the CRC algorithm is known, it is possible to determine the exact bit that failed. This type of data (ECC Syndrome, Check Bit or Parity Bit data, or other vendor supplied information) is included in this field. If the ErrorInfo property is equal to 3, "OK", then AdditionalErrorData has no meaning.
     */
    public static class PROPERTY_ADDITIONALERRORDATA {
        /**
         * name of the property AdditionalErrorData
         */
        public final static String NAME = "AdditionalErrorData";

    }

    /**
     * Constants of property CorrectableError
     * Boolean indicating that the most recent error was correctable. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */
    public static class PROPERTY_CORRECTABLEERROR {
        /**
         * name of the property CorrectableError
         */
        public final static String NAME = "CorrectableError";

    }

    /**
     * Constants of property ErrorAccess
     * An integer enumeration indicating the memory access operation that caused the last error. The type of error MUST be described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */
    public static class PROPERTY_ERRORACCESS {
        /**
         * name of the property ErrorAccess
         */
        public final static String NAME = "ErrorAccess";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Write = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Write (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Write = "Write";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Partial_Write = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Partial Write (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Partial_Write = "Partial Write";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@50a050a
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

            if (VALUE_ENTRY_Write.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Write;
            }

            if (VALUE_ENTRY_Partial_Write.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Partial_Write;
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

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Write.intValue()) {
                return VALUE_ENTRY_Write;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Partial_Write.intValue()) {
                return VALUE_ENTRY_Partial_Write;
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
         * Value Map for the property ErrorAccess   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Read, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Write,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Partial_Write };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ErrorAccess   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Read, VALUE_ENTRY_Write, VALUE_ENTRY_Partial_Write };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ErrorAccess   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Read, VALUE_ENTRY_Write, VALUE_ENTRY_Partial_Write };

    }

    /**
     * Constants of property ErrorDataOrder
     * The ordering for data stored in the ErrorData property. "Least Significant Byte First" (value=1) or "Most Significant Byte First" (2) can be specified. If ErrorTransferSize is 0, then this property has no meaning.
     */
    public static class PROPERTY_ERRORDATAORDER {
        /**
         * name of the property ErrorDataOrder
         */
        public final static String NAME = "ErrorDataOrder";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Least_Significant_Byte_First = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Least Significant Byte First (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Least_Significant_Byte_First = "Least Significant Byte First";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Most_Significant_Byte_First = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Most Significant Byte First (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Most_Significant_Byte_First = "Most Significant Byte First";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@4900490
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Least_Significant_Byte_First.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Least_Significant_Byte_First;
            }

            if (VALUE_ENTRY_Most_Significant_Byte_First.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Most_Significant_Byte_First;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Least_Significant_Byte_First.intValue()) {
                return VALUE_ENTRY_Least_Significant_Byte_First;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Most_Significant_Byte_First.intValue()) {
                return VALUE_ENTRY_Most_Significant_Byte_First;
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
         * Value Map for the property ErrorDataOrder   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Least_Significant_Byte_First,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Most_Significant_Byte_First };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ErrorDataOrder   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Least_Significant_Byte_First, VALUE_ENTRY_Most_Significant_Byte_First };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ErrorDataOrder   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Least_Significant_Byte_First, VALUE_ENTRY_Most_Significant_Byte_First };

    }

    /**
     * Constants of property ErrorData
     * Data captured during the last erroneous mebmory access. The data occupies the first n octets of the array necessary to hold the number of bits specified by the ErrorTransferSize property. If ErrorTransferSize is 0, then this property has no meaning.
     */
    public static class PROPERTY_ERRORDATA {
        /**
         * name of the property ErrorData
         */
        public final static String NAME = "ErrorData";

    }

    /**
     * Constants of property ErrorInfo
     * An integer enumeration describing the type of error that occurred most recently. For example, single (value=6) or double bit errors (7) can be specified using this property. The values, 12-14, are undefined in the CIM Schema since in DMI, they mix the semantics of the type of error and whether it was correctable or not. The latter is indicated in the property, CorrectableError.
     */
    public static class PROPERTY_ERRORINFO {
        /**
         * name of the property ErrorInfo
         */
        public final static String NAME = "ErrorInfo";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OK = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry OK (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_OK = "OK";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Bad_Read = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Bad Read (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Bad_Read = "Bad Read";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Parity_Error = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Parity Error (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Parity_Error = "Parity Error";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Single_Bit_Error = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Single-Bit Error (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Single_Bit_Error = "Single-Bit Error";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Double_Bit_Error = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Double-Bit Error (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Double_Bit_Error = "Double-Bit Error";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Multi_Bit_Error = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Multi-Bit Error (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Multi_Bit_Error = "Multi-Bit Error";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Nibble_Error = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Nibble Error (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Nibble_Error = "Nibble Error";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Checksum_Error = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Checksum Error (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Checksum_Error = "Checksum Error";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_CRC_Error = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry CRC Error (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_CRC_Error = "CRC Error";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@b500b50
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_OK.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OK;
            }

            if (VALUE_ENTRY_Bad_Read.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Bad_Read;
            }

            if (VALUE_ENTRY_Parity_Error.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Parity_Error;
            }

            if (VALUE_ENTRY_Single_Bit_Error.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Single_Bit_Error;
            }

            if (VALUE_ENTRY_Double_Bit_Error.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Double_Bit_Error;
            }

            if (VALUE_ENTRY_Multi_Bit_Error.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Multi_Bit_Error;
            }

            if (VALUE_ENTRY_Nibble_Error.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Nibble_Error;
            }

            if (VALUE_ENTRY_Checksum_Error.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Checksum_Error;
            }

            if (VALUE_ENTRY_CRC_Error.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_CRC_Error;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OK.intValue()) {
                return VALUE_ENTRY_OK;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Bad_Read.intValue()) {
                return VALUE_ENTRY_Bad_Read;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Parity_Error.intValue()) {
                return VALUE_ENTRY_Parity_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Single_Bit_Error.intValue()) {
                return VALUE_ENTRY_Single_Bit_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Double_Bit_Error.intValue()) {
                return VALUE_ENTRY_Double_Bit_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Multi_Bit_Error.intValue()) {
                return VALUE_ENTRY_Multi_Bit_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Nibble_Error.intValue()) {
                return VALUE_ENTRY_Nibble_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Checksum_Error.intValue()) {
                return VALUE_ENTRY_Checksum_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_CRC_Error.intValue()) {
                return VALUE_ENTRY_CRC_Error;
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
         * Value Map for the property ErrorInfo   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OK, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Bad_Read,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Parity_Error,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Single_Bit_Error,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Double_Bit_Error,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Multi_Bit_Error,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Nibble_Error,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Checksum_Error,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_CRC_Error };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ErrorInfo   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_OK, VALUE_ENTRY_Bad_Read, VALUE_ENTRY_Parity_Error,
                VALUE_ENTRY_Single_Bit_Error, VALUE_ENTRY_Double_Bit_Error,
                VALUE_ENTRY_Multi_Bit_Error, VALUE_ENTRY_Nibble_Error, VALUE_ENTRY_Checksum_Error,
                VALUE_ENTRY_CRC_Error };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ErrorInfo   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_OK, VALUE_ENTRY_Bad_Read, VALUE_ENTRY_Parity_Error,
                VALUE_ENTRY_Single_Bit_Error, VALUE_ENTRY_Double_Bit_Error,
                VALUE_ENTRY_Multi_Bit_Error, VALUE_ENTRY_Nibble_Error, VALUE_ENTRY_Checksum_Error,
                VALUE_ENTRY_CRC_Error };

    }

    /**
     * Constants of property ErrorResolution
     * Specifies the range, in bytes, to which the last error can be resolved. For example, if error addresses are resolved to bit 11 (ie, on a typical page basis), then errors can be resolved to 4K boundaries and this property is set to 4000. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */
    public static class PROPERTY_ERRORRESOLUTION {
        /**
         * name of the property ErrorResolution
         */
        public final static String NAME = "ErrorResolution";

    }

    /**
     * Constants of property ErrorTime
     * The time that the last memory error occurred. The type of error is described by the ErrorInfo property. If the Error Info property is equal to 3, "OK", then this property has no meaning.
     */
    public static class PROPERTY_ERRORTIME {
        /**
         * name of the property ErrorTime
         */
        public final static String NAME = "ErrorTime";

    }

    /**
     * Constants of property ErrorTransferSize
     * The size of the data transfer in bits that caused the last error. 0 indicates no error. If the ErrorInfo property is equal to 3, "OK", then this property should be set to 0.
     */
    public static class PROPERTY_ERRORTRANSFERSIZE {
        /**
         * name of the property ErrorTransferSize
         */
        public final static String NAME = "ErrorTransferSize";

    }

    /**
     * Constants of property OtherErrorDescription
     * Free form string providing more information if the Error Type property is set to 1, "Other". If not set to 1, this string has no meaning.
     */
    public static class PROPERTY_OTHERERRORDESCRIPTION {
        /**
         * name of the property OtherErrorDescription
         */
        public final static String NAME = "OtherErrorDescription";

    }

    /**
     * Constants of property StartingAddress
     * Specifies the address of the memory error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */
    public static class PROPERTY_STARTINGADDRESS {
        /**
         * name of the property StartingAddress
         */
        public final static String NAME = "StartingAddress";

    }

    /**
     * Constants of property SystemLevelAddress
     * Boolean indicating whether the address information in the property, ErrorAddress, is a system-level address (TRUE) or a physical address (FALSE). If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */
    public static class PROPERTY_SYSTEMLEVELADDRESS {
        /**
         * name of the property SystemLevelAddress
         */
        public final static String NAME = "SystemLevelAddress";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_StorageError.getPackages();

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
     *   MemoryError defines a memory space that has errors. The Key of the class is the StartingAddress of the bytes in error.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_MemoryError(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   MemoryError defines a memory space that has errors. The Key of the class is the StartingAddress of the bytes in error.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_MemoryError(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_MemoryError() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AdditionalErrorData", new CIMProperty("AdditionalErrorData",
                CIMDataType.UINT8_ARRAY_T, null));
        propertiesToCheck.put("CorrectableError", new CIMProperty("CorrectableError",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("ErrorAccess", new CIMProperty("ErrorAccess", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("ErrorDataOrder", new CIMProperty("ErrorDataOrder",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ErrorData", new CIMProperty("ErrorData", CIMDataType.UINT8_ARRAY_T,
                null));
        propertiesToCheck
                .put("ErrorInfo", new CIMProperty("ErrorInfo", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ErrorResolution", new CIMProperty("ErrorResolution",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ErrorTime", new CIMProperty("ErrorTime", CIMDataType.DATETIME_T,
                null));
        propertiesToCheck.put("ErrorTransferSize", new CIMProperty("ErrorTransferSize",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("OtherErrorDescription", new CIMProperty("OtherErrorDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("StartingAddress", new CIMProperty("StartingAddress",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("SystemLevelAddress", new CIMProperty("SystemLevelAddress",
                CIMDataType.BOOLEAN_T, null));

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
     * Get the property AdditionalErrorData
     *     * <br>
     * An array of octets holding additional error information. An example is ECC Syndrome or the return of the check bits if a CRC-based ErrorMethodology is used. In the latter case, if a single bit error is recognized and the CRC algorithm is known, it is possible to determine the exact bit that failed. This type of data (ECC Syndrome, Check Bit or Parity Bit data, or other vendor supplied information) is included in this field. If the ErrorInfo property is equal to 3, "OK", then AdditionalErrorData has no meaning.
     *     */

    public javax.cim.UnsignedInteger8[] get_AdditionalErrorData() {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDITIONALERRORDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ADDITIONALERRORDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger8[]) currentProperty.getValue();

    }

    /**
     * Set the property AdditionalErrorData
     * <br>
     * An array of octets holding additional error information. An example is ECC Syndrome or the return of the check bits if a CRC-based ErrorMethodology is used. In the latter case, if a single bit error is recognized and the CRC algorithm is known, it is possible to determine the exact bit that failed. This type of data (ECC Syndrome, Check Bit or Parity Bit data, or other vendor supplied information) is included in this field. If the ErrorInfo property is equal to 3, "OK", then AdditionalErrorData has no meaning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AdditionalErrorData(javax.cim.UnsignedInteger8[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDITIONALERRORDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AdditionalErrorData(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ADDITIONALERRORDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AdditionalErrorData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AdditionalErrorData(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger8[] newValue) throws WbemsmtException {
        CIM_MemoryError fco = new CIM_MemoryError(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDITIONALERRORDATA.NAME);
        if (property != null) {
            property = setPropertyValue_AdditionalErrorData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ADDITIONALERRORDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AdditionalErrorData
     * <br>
     * An array of octets holding additional error information. An example is ECC Syndrome or the return of the check bits if a CRC-based ErrorMethodology is used. In the latter case, if a single bit error is recognized and the CRC algorithm is known, it is possible to determine the exact bit that failed. This type of data (ECC Syndrome, Check Bit or Parity Bit data, or other vendor supplied information) is included in this field. If the ErrorInfo property is equal to 3, "OK", then AdditionalErrorData has no meaning.
     */

    private static CIMProperty setPropertyValue_AdditionalErrorData(CIMProperty currentProperty,
            javax.cim.UnsignedInteger8[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CorrectableError
     *     * <br>
     * Boolean indicating that the most recent error was correctable. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     *     */

    public Boolean get_CorrectableError() {
        CIMProperty currentProperty = getProperty(PROPERTY_CORRECTABLEERROR.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CORRECTABLEERROR.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property CorrectableError
     * <br>
     * Boolean indicating that the most recent error was correctable. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CorrectableError(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CORRECTABLEERROR.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CorrectableError(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CORRECTABLEERROR.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CorrectableError by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CorrectableError(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_MemoryError fco = new CIM_MemoryError(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CORRECTABLEERROR.NAME);
        if (property != null) {
            property = setPropertyValue_CorrectableError(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CORRECTABLEERROR.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CorrectableError
     * <br>
     * Boolean indicating that the most recent error was correctable. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */

    private static CIMProperty setPropertyValue_CorrectableError(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorAccess
     *     * <br>
     * An integer enumeration indicating the memory access operation that caused the last error. The type of error MUST be described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     *     */

    public javax.cim.UnsignedInteger16 get_ErrorAccess() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORACCESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORACCESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ErrorAccess
     * <br>
     * An integer enumeration indicating the memory access operation that caused the last error. The type of error MUST be described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorAccess(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORACCESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ErrorAccess(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORACCESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorAccess by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorAccess(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_MemoryError fco = new CIM_MemoryError(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORACCESS.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorAccess(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORACCESS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorAccess
     * <br>
     * An integer enumeration indicating the memory access operation that caused the last error. The type of error MUST be described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */

    private static CIMProperty setPropertyValue_ErrorAccess(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorDataOrder
     *     * <br>
     * The ordering for data stored in the ErrorData property. "Least Significant Byte First" (value=1) or "Most Significant Byte First" (2) can be specified. If ErrorTransferSize is 0, then this property has no meaning.
     *     */

    public javax.cim.UnsignedInteger16 get_ErrorDataOrder() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORDATAORDER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORDATAORDER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ErrorDataOrder
     * <br>
     * The ordering for data stored in the ErrorData property. "Least Significant Byte First" (value=1) or "Most Significant Byte First" (2) can be specified. If ErrorTransferSize is 0, then this property has no meaning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorDataOrder(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORDATAORDER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ErrorDataOrder(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORDATAORDER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorDataOrder by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorDataOrder(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_MemoryError fco = new CIM_MemoryError(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORDATAORDER.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorDataOrder(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORDATAORDER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorDataOrder
     * <br>
     * The ordering for data stored in the ErrorData property. "Least Significant Byte First" (value=1) or "Most Significant Byte First" (2) can be specified. If ErrorTransferSize is 0, then this property has no meaning.
     */

    private static CIMProperty setPropertyValue_ErrorDataOrder(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorData
     *     * <br>
     * Data captured during the last erroneous mebmory access. The data occupies the first n octets of the array necessary to hold the number of bits specified by the ErrorTransferSize property. If ErrorTransferSize is 0, then this property has no meaning.
     *     */

    public javax.cim.UnsignedInteger8[] get_ErrorData() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORDATA.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger8[]) currentProperty.getValue();

    }

    /**
     * Set the property ErrorData
     * <br>
     * Data captured during the last erroneous mebmory access. The data occupies the first n octets of the array necessary to hold the number of bits specified by the ErrorTransferSize property. If ErrorTransferSize is 0, then this property has no meaning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorData(javax.cim.UnsignedInteger8[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ErrorData(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORDATA.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorData(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger8[] newValue) throws WbemsmtException {
        CIM_MemoryError fco = new CIM_MemoryError(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORDATA.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORDATA.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorData
     * <br>
     * Data captured during the last erroneous mebmory access. The data occupies the first n octets of the array necessary to hold the number of bits specified by the ErrorTransferSize property. If ErrorTransferSize is 0, then this property has no meaning.
     */

    private static CIMProperty setPropertyValue_ErrorData(CIMProperty currentProperty,
            javax.cim.UnsignedInteger8[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorInfo
     *     * <br>
     * An integer enumeration describing the type of error that occurred most recently. For example, single (value=6) or double bit errors (7) can be specified using this property. The values, 12-14, are undefined in the CIM Schema since in DMI, they mix the semantics of the type of error and whether it was correctable or not. The latter is indicated in the property, CorrectableError.
     *     */

    public javax.cim.UnsignedInteger16 get_ErrorInfo() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORINFO.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORINFO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ErrorInfo
     * <br>
     * An integer enumeration describing the type of error that occurred most recently. For example, single (value=6) or double bit errors (7) can be specified using this property. The values, 12-14, are undefined in the CIM Schema since in DMI, they mix the semantics of the type of error and whether it was correctable or not. The latter is indicated in the property, CorrectableError.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorInfo(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORINFO.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ErrorInfo(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORINFO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorInfo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorInfo(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_MemoryError fco = new CIM_MemoryError(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORINFO.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorInfo(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORINFO.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorInfo
     * <br>
     * An integer enumeration describing the type of error that occurred most recently. For example, single (value=6) or double bit errors (7) can be specified using this property. The values, 12-14, are undefined in the CIM Schema since in DMI, they mix the semantics of the type of error and whether it was correctable or not. The latter is indicated in the property, CorrectableError.
     */

    private static CIMProperty setPropertyValue_ErrorInfo(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorResolution
     *     * <br>
     * Specifies the range, in bytes, to which the last error can be resolved. For example, if error addresses are resolved to bit 11 (ie, on a typical page basis), then errors can be resolved to 4K boundaries and this property is set to 4000. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     *     */

    public javax.cim.UnsignedInteger64 get_ErrorResolution() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORRESOLUTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORRESOLUTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ErrorResolution
     * <br>
     * Specifies the range, in bytes, to which the last error can be resolved. For example, if error addresses are resolved to bit 11 (ie, on a typical page basis), then errors can be resolved to 4K boundaries and this property is set to 4000. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorResolution(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORRESOLUTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ErrorResolution(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORRESOLUTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorResolution by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorResolution(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MemoryError fco = new CIM_MemoryError(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORRESOLUTION.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorResolution(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORRESOLUTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorResolution
     * <br>
     * Specifies the range, in bytes, to which the last error can be resolved. For example, if error addresses are resolved to bit 11 (ie, on a typical page basis), then errors can be resolved to 4K boundaries and this property is set to 4000. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */

    private static CIMProperty setPropertyValue_ErrorResolution(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorTime
     *     * <br>
     * The time that the last memory error occurred. The type of error is described by the ErrorInfo property. If the Error Info property is equal to 3, "OK", then this property has no meaning.
     *     */

    public javax.cim.CIMDateTime get_ErrorTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property ErrorTime
     * <br>
     * The time that the last memory error occurred. The type of error is described by the ErrorInfo property. If the Error Info property is equal to 3, "OK", then this property has no meaning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ErrorTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_MemoryError fco = new CIM_MemoryError(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORTIME.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORTIME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorTime
     * <br>
     * The time that the last memory error occurred. The type of error is described by the ErrorInfo property. If the Error Info property is equal to 3, "OK", then this property has no meaning.
     */

    private static CIMProperty setPropertyValue_ErrorTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorTransferSize
     *     * <br>
     * The size of the data transfer in bits that caused the last error. 0 indicates no error. If the ErrorInfo property is equal to 3, "OK", then this property should be set to 0.
     *     */

    public javax.cim.UnsignedInteger32 get_ErrorTransferSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORTRANSFERSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORTRANSFERSIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property ErrorTransferSize
     * <br>
     * The size of the data transfer in bits that caused the last error. 0 indicates no error. If the ErrorInfo property is equal to 3, "OK", then this property should be set to 0.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorTransferSize(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORTRANSFERSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ErrorTransferSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORTRANSFERSIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorTransferSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorTransferSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_MemoryError fco = new CIM_MemoryError(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORTRANSFERSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorTransferSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORTRANSFERSIZE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorTransferSize
     * <br>
     * The size of the data transfer in bits that caused the last error. 0 indicates no error. If the ErrorInfo property is equal to 3, "OK", then this property should be set to 0.
     */

    private static CIMProperty setPropertyValue_ErrorTransferSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherErrorDescription
     *     * <br>
     * Free form string providing more information if the Error Type property is set to 1, "Other". If not set to 1, this string has no meaning.
     *     */

    public String get_OtherErrorDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERERRORDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERERRORDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherErrorDescription
     * <br>
     * Free form string providing more information if the Error Type property is set to 1, "Other". If not set to 1, this string has no meaning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherErrorDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERERRORDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherErrorDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERERRORDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherErrorDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherErrorDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_MemoryError fco = new CIM_MemoryError(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERERRORDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherErrorDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERERRORDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherErrorDescription
     * <br>
     * Free form string providing more information if the Error Type property is set to 1, "Other". If not set to 1, this string has no meaning.
     */

    private static CIMProperty setPropertyValue_OtherErrorDescription(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property StartingAddress
     *     * <br>
     * Specifies the address of the memory error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     *     */

    public javax.cim.UnsignedInteger64 get_StartingAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTINGADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STARTINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property StartingAddress
     * <br>
     * Specifies the address of the memory error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_StartingAddress(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTINGADDRESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_StartingAddress(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STARTINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property StartingAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StartingAddress(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MemoryError fco = new CIM_MemoryError(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STARTINGADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_StartingAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STARTINGADDRESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property StartingAddress
     * <br>
     * Specifies the address of the memory error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */

    private static CIMProperty setPropertyValue_StartingAddress(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SystemLevelAddress
     *     * <br>
     * Boolean indicating whether the address information in the property, ErrorAddress, is a system-level address (TRUE) or a physical address (FALSE). If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     *     */

    public Boolean get_SystemLevelAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMLEVELADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEMLEVELADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property SystemLevelAddress
     * <br>
     * Boolean indicating whether the address information in the property, ErrorAddress, is a system-level address (TRUE) or a physical address (FALSE). If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SystemLevelAddress(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMLEVELADDRESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SystemLevelAddress(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMLEVELADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SystemLevelAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SystemLevelAddress(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_MemoryError fco = new CIM_MemoryError(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMLEVELADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_SystemLevelAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMLEVELADDRESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SystemLevelAddress
     * <br>
     * Boolean indicating whether the address information in the property, ErrorAddress, is a system-level address (TRUE) or a physical address (FALSE). If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */

    private static CIMProperty setPropertyValue_SystemLevelAddress(CIMProperty currentProperty,
            Boolean newValue) {
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
        return CIM_MemoryError.CIM_CLASS_NAME;
    }

}