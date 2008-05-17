/** 
 * CIM_Memory.java
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
 * Description: Capabilities and management of Memory-related LogicalDevices.
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

public class CIM_Memory extends CIM_StorageExtent {

    public final static String CIM_CLASS_NAME = "CIM_Memory";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * LogicalElements may have Memory installed on them or otherwise associated with them - such as CacheMemory. This is made explicit in this association.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY = "CIM_AssociatedMemory";

    /**
     * The use of this association has be deprecated in lieu of SystemDevice. Association indicating that memory is installed and required for the UnitaryComputerSystem to operate. Note that this relationship inherits from the SystemDevice association, and therefore, the Memory StorageExtent is weak to the aggregating UnitaryComputerSystem.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY = "CIM_ComputerSystemMemory";

    /**
     * A link between BIOSElement and Memory where the BIOS is loaded.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV = "CIM_BIOSLoadedInNV";

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
     * Constants of property EndingAddress
     * The ending address, referenced by an application or operating system and mapped by a memory controller, for this Memory object. The ending address is specified in KBytes.
     */
    public static class PROPERTY_ENDINGADDRESS {
        /**
         * name of the property EndingAddress
         */
        public final static String NAME = "EndingAddress";

    }

    /**
     * Constants of property ErrorAccess
     * An integer enumeration indicating the memory access operation that caused the last error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */
    public static class PROPERTY_ERRORACCESS {
        /**
         * name of the property ErrorAccess
         */
        public final static String NAME = "ErrorAccess";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Read = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Read (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Read = "Read";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Write = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Write (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Write = "Write";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Partial_Write = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Partial Write (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Partial_Write = "Partial Write";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1d861d86
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Read.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Read;
            }

            if (VALUE_ENTRY_Write.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Write;
            }

            if (VALUE_ENTRY_Partial_Write.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Partial_Write;
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

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Read.intValue()) {
                return VALUE_ENTRY_Read;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Write.intValue()) {
                return VALUE_ENTRY_Write;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Partial_Write.intValue()) {
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
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Read, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Write,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Partial_Write };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ErrorAccess   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Read, VALUE_ENTRY_Write, VALUE_ENTRY_Partial_Write };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ErrorAccess   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Read, VALUE_ENTRY_Write, VALUE_ENTRY_Partial_Write };

    }

    /**
     * Constants of property ErrorAddress
     * Specifies the address of the last memory error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */
    public static class PROPERTY_ERRORADDRESS {
        /**
         * name of the property ErrorAddress
         */
        public final static String NAME = "ErrorAddress";

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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1e321e32
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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_OK = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry OK (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_OK = "OK";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Bad_Read = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Bad Read (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Bad_Read = "Bad Read";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Parity_Error = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Parity Error (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Parity_Error = "Parity Error";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Single_Bit_Error = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Single-Bit Error (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Single_Bit_Error = "Single-Bit Error";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Double_Bit_Error = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Double-Bit Error (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Double_Bit_Error = "Double-Bit Error";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Multi_Bit_Error = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Multi-Bit Error (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Multi_Bit_Error = "Multi-Bit Error";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Nibble_Error = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Nibble Error (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Nibble_Error = "Nibble Error";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Checksum_Error = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Checksum Error (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Checksum_Error = "Checksum Error";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CRC_Error = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry CRC Error (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_CRC_Error = "CRC Error";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Undefined = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Undefined (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Undefined = "Undefined";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Undefined = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Undefined = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@2f202f20
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_OK.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_OK;
            }

            if (VALUE_ENTRY_Bad_Read.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Bad_Read;
            }

            if (VALUE_ENTRY_Parity_Error.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Parity_Error;
            }

            if (VALUE_ENTRY_Single_Bit_Error.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Single_Bit_Error;
            }

            if (VALUE_ENTRY_Double_Bit_Error.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Double_Bit_Error;
            }

            if (VALUE_ENTRY_Multi_Bit_Error.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Multi_Bit_Error;
            }

            if (VALUE_ENTRY_Nibble_Error.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Nibble_Error;
            }

            if (VALUE_ENTRY_Checksum_Error.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Checksum_Error;
            }

            if (VALUE_ENTRY_CRC_Error.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CRC_Error;
            }

            if (VALUE_ENTRY_Undefined.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Undefined;
            }

            if (VALUE_ENTRY_Undefined.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Undefined;
            }

            if (VALUE_ENTRY_Undefined.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Undefined;
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

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_OK.intValue()) {
                return VALUE_ENTRY_OK;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Bad_Read.intValue()) {
                return VALUE_ENTRY_Bad_Read;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Parity_Error.intValue()) {
                return VALUE_ENTRY_Parity_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Single_Bit_Error.intValue()) {
                return VALUE_ENTRY_Single_Bit_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Double_Bit_Error.intValue()) {
                return VALUE_ENTRY_Double_Bit_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Multi_Bit_Error.intValue()) {
                return VALUE_ENTRY_Multi_Bit_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Nibble_Error.intValue()) {
                return VALUE_ENTRY_Nibble_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Checksum_Error.intValue()) {
                return VALUE_ENTRY_Checksum_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CRC_Error.intValue()) {
                return VALUE_ENTRY_CRC_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Undefined.intValue()) {
                return VALUE_ENTRY_Undefined;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Undefined.intValue()) {
                return VALUE_ENTRY_Undefined;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Undefined.intValue()) {
                return VALUE_ENTRY_Undefined;
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
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_OK, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Bad_Read,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Parity_Error,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Single_Bit_Error,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Double_Bit_Error,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Multi_Bit_Error,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Nibble_Error,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Checksum_Error,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CRC_Error,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Undefined,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Undefined,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Undefined };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ErrorInfo   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_OK, VALUE_ENTRY_Bad_Read, VALUE_ENTRY_Parity_Error,
                VALUE_ENTRY_Single_Bit_Error, VALUE_ENTRY_Double_Bit_Error,
                VALUE_ENTRY_Multi_Bit_Error, VALUE_ENTRY_Nibble_Error, VALUE_ENTRY_Checksum_Error,
                VALUE_ENTRY_CRC_Error, VALUE_ENTRY_Undefined };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ErrorInfo   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_OK, VALUE_ENTRY_Bad_Read,
                VALUE_ENTRY_Parity_Error, VALUE_ENTRY_Single_Bit_Error,
                VALUE_ENTRY_Double_Bit_Error, VALUE_ENTRY_Multi_Bit_Error,
                VALUE_ENTRY_Nibble_Error, VALUE_ENTRY_Checksum_Error, VALUE_ENTRY_CRC_Error,
                VALUE_ENTRY_Undefined };

    }

    /**
     * Constants of property ErrorMethodology
     * ErrorMethodology for Memory is a string property that indicates whether parity or CRC algorithms, ECC or other mechanisms are used. Details on the algorithm can also be supplied.
     */
    public static class PROPERTY_ERRORMETHODOLOGY {
        /**
         * name of the property ErrorMethodology
         */
        public final static String NAME = "ErrorMethodology";

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
     * The beginning address, referenced by an application or operating system and mapped by a memory controller, for this Memory object. The starting address is specified in KBytes.
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

    /**
     * Constants of property Volatile
     * Volatile is a property that indicates whether this memory is volatile or not.
     */
    public static class PROPERTY_VOLATILE {
        /**
         * name of the property Volatile
         */
        public final static String NAME = "Volatile";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_StorageExtent.getPackages();

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
     *   Capabilities and management of Memory-related LogicalDevices.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Memory(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Capabilities and management of Memory-related LogicalDevices.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Memory(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Memory() {
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
        propertiesToCheck.put("EndingAddress", new CIMProperty("EndingAddress",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ErrorAccess", new CIMProperty("ErrorAccess", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("ErrorAddress", new CIMProperty("ErrorAddress", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("ErrorDataOrder", new CIMProperty("ErrorDataOrder",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ErrorData", new CIMProperty("ErrorData", CIMDataType.UINT8_ARRAY_T,
                null));
        propertiesToCheck
                .put("ErrorInfo", new CIMProperty("ErrorInfo", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ErrorMethodology", new CIMProperty("ErrorMethodology",
                CIMDataType.STRING_T, null));
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
        propertiesToCheck.put("Volatile", new CIMProperty("Volatile", CIMDataType.BOOLEAN_T, null));

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
        CIM_Memory fco = new CIM_Memory(client, namespace);
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
        CIM_Memory fco = new CIM_Memory(client, namespace);
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
     * Get the property EndingAddress
     *     * <br>
     * The ending address, referenced by an application or operating system and mapped by a memory controller, for this Memory object. The ending address is specified in KBytes.
     *     */

    public javax.cim.UnsignedInteger64 get_EndingAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENDINGADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENDINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property EndingAddress
     * <br>
     * The ending address, referenced by an application or operating system and mapped by a memory controller, for this Memory object. The ending address is specified in KBytes.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EndingAddress(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENDINGADDRESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EndingAddress(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENDINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EndingAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EndingAddress(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_Memory fco = new CIM_Memory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENDINGADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_EndingAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENDINGADDRESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EndingAddress
     * <br>
     * The ending address, referenced by an application or operating system and mapped by a memory controller, for this Memory object. The ending address is specified in KBytes.
     */

    private static CIMProperty setPropertyValue_EndingAddress(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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
     * An integer enumeration indicating the memory access operation that caused the last error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
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
     * An integer enumeration indicating the memory access operation that caused the last error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
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
        CIM_Memory fco = new CIM_Memory(client, namespace);
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
     * An integer enumeration indicating the memory access operation that caused the last error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
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
     * Get the property ErrorAddress
     *     * <br>
     * Specifies the address of the last memory error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     *     */

    public javax.cim.UnsignedInteger64 get_ErrorAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORADDRESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ErrorAddress
     * <br>
     * Specifies the address of the last memory error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorAddress(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORADDRESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ErrorAddress(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORADDRESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorAddress(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_Memory fco = new CIM_Memory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORADDRESS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorAddress
     * <br>
     * Specifies the address of the last memory error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
     */

    private static CIMProperty setPropertyValue_ErrorAddress(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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
        CIM_Memory fco = new CIM_Memory(client, namespace);
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
        CIM_Memory fco = new CIM_Memory(client, namespace);
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
        CIM_Memory fco = new CIM_Memory(client, namespace);
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
     * Get the property ErrorMethodology
     *     * <br>
     * ErrorMethodology for Memory is a string property that indicates whether parity or CRC algorithms, ECC or other mechanisms are used. Details on the algorithm can also be supplied.
     *     */

    public String get_ErrorMethodology() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORMETHODOLOGY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORMETHODOLOGY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ErrorMethodology
     * <br>
     * ErrorMethodology for Memory is a string property that indicates whether parity or CRC algorithms, ECC or other mechanisms are used. Details on the algorithm can also be supplied.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorMethodology(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORMETHODOLOGY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ErrorMethodology(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORMETHODOLOGY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorMethodology by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorMethodology(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Memory fco = new CIM_Memory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORMETHODOLOGY.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorMethodology(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORMETHODOLOGY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorMethodology
     * <br>
     * ErrorMethodology for Memory is a string property that indicates whether parity or CRC algorithms, ECC or other mechanisms are used. Details on the algorithm can also be supplied.
     */

    private static CIMProperty setPropertyValue_ErrorMethodology(CIMProperty currentProperty,
            String newValue) {
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
        CIM_Memory fco = new CIM_Memory(client, namespace);
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
        CIM_Memory fco = new CIM_Memory(client, namespace);
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
        CIM_Memory fco = new CIM_Memory(client, namespace);
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
        CIM_Memory fco = new CIM_Memory(client, namespace);
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
     * The beginning address, referenced by an application or operating system and mapped by a memory controller, for this Memory object. The starting address is specified in KBytes.
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
     * The beginning address, referenced by an application or operating system and mapped by a memory controller, for this Memory object. The starting address is specified in KBytes.
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
        CIM_Memory fco = new CIM_Memory(client, namespace);
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
     * The beginning address, referenced by an application or operating system and mapped by a memory controller, for this Memory object. The starting address is specified in KBytes.
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
        CIM_Memory fco = new CIM_Memory(client, namespace);
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

    /**
     * Get the property Volatile
     *     * <br>
     * Volatile is a property that indicates whether this memory is volatile or not.
     *     */

    public Boolean get_Volatile() {
        CIMProperty currentProperty = getProperty(PROPERTY_VOLATILE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VOLATILE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property Volatile
     * <br>
     * Volatile is a property that indicates whether this memory is volatile or not.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Volatile(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VOLATILE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Volatile(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VOLATILE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Volatile by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Volatile(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_Memory fco = new CIM_Memory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VOLATILE.NAME);
        if (property != null) {
            property = setPropertyValue_Volatile(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VOLATILE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Volatile
     * <br>
     * Volatile is a property that indicates whether this memory is volatile or not.
     */

    private static CIMProperty setPropertyValue_Volatile(CIMProperty currentProperty,
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

    /**
     * Get the list with CIM_LogicalElement objects associated by the association CIM_AssociatedMemory
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalElement_CIM_AssociatedMemorys(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_LogicalElement_CIM_AssociatedMemorys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY, CIM_LogicalElement.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_LogicalElement objects associated by the association CIM_AssociatedMemory
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalElement_CIM_AssociatedMemorys(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalElement_CIM_AssociatedMemorys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_LogicalElement objects associated by the association CIM_AssociatedMemory
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalElement_CIM_AssociatedMemorys(
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
                CIM_MemoryHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_MemoryHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_MemoryHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_LogicalElement(cimInstance));
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
                        result.add(new CIM_LogicalElement(cimInstance));
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
                        result.add(new CIM_LogicalElement(cimInstance));
                        continue;
                    }
                }
            }
            CIM_MemoryHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_AssociatedMemory
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalElement_CIM_AssociatedMemoryNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_LogicalElement_CIM_AssociatedMemoryNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY, CIM_LogicalElement.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_AssociatedMemory
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalElement_CIM_AssociatedMemoryNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalElement_CIM_AssociatedMemoryNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_AssociatedMemory
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalElement_CIM_AssociatedMemoryNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY,
                    CIM_LogicalElement.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_MemoryHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_MemoryHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_LogicalElement.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_MemoryHelper.checkException(enumeration);
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
     * Get the list with CIM_AssociatedMemory associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_AssociatedMemory(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_MemoryHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_MemoryHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_AssociatedMemoryHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_AssociatedMemory(cimInstance));
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
                        result.add(new CIM_AssociatedMemory(cimInstance));
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
                        result.add(new CIM_AssociatedMemory(cimInstance));
                        continue;
                    }
                }
            }
            CIM_MemoryHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_AssociatedMemory
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_AssociatedMemory(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_MemoryHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_MemoryHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_AssociatedMemory.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_MemoryHelper.checkException(enumeration);
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
     * Get the list with CIM_UnitaryComputerSystem objects associated by the association CIM_ComputerSystemMemory
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemMemorys(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemMemorys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY,
                CIM_UnitaryComputerSystem.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_UnitaryComputerSystem objects associated by the association CIM_ComputerSystemMemory
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemMemorys(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemMemorys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_UnitaryComputerSystem objects associated by the association CIM_ComputerSystemMemory
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemMemorys(
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
                CIM_MemoryHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_MemoryHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_MemoryHelper.findClass(cimClient, cimInstance);

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
            CIM_MemoryHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemMemory
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemMemoryNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemMemoryNames(cimClient,
                true, CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY,
                CIM_UnitaryComputerSystem.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemMemory
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemMemoryNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemMemoryNames(cimClient,
                true, CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemMemory
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemMemoryNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY,
                    CIM_UnitaryComputerSystem.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_MemoryHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_MemoryHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_UnitaryComputerSystem.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_MemoryHelper.checkException(enumeration);
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
     * Get the list with CIM_ComputerSystemMemory associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ComputerSystemMemory(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_MemoryHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_MemoryHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ComputerSystemMemoryHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ComputerSystemMemory(cimInstance));
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
                        result.add(new CIM_ComputerSystemMemory(cimInstance));
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
                        result.add(new CIM_ComputerSystemMemory(cimInstance));
                        continue;
                    }
                }
            }
            CIM_MemoryHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ComputerSystemMemory
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ComputerSystemMemory(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_MemoryHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_MemoryHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ComputerSystemMemory.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_MemoryHelper.checkException(enumeration);
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
     * Get the list with CIM_BIOSElement objects associated by the association CIM_BIOSLoadedInNV
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_BIOSElement_CIM_BIOSLoadedInNVs(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_BIOSElement_CIM_BIOSLoadedInNVs(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, CIM_BIOSElement.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_BIOSElement objects associated by the association CIM_BIOSLoadedInNV
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_BIOSElement_CIM_BIOSLoadedInNVs(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_BIOSElement_CIM_BIOSLoadedInNVs(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_BIOSElement objects associated by the association CIM_BIOSLoadedInNV
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_BIOSElement_CIM_BIOSLoadedInNVs(WBEMClient cimClient,
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
                CIM_MemoryHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_MemoryHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_MemoryHelper.findClass(cimClient, cimInstance);

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
            CIM_MemoryHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BIOSLoadedInNV
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_BIOSElement_CIM_BIOSLoadedInNVNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_BIOSElement_CIM_BIOSLoadedInNVNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, CIM_BIOSElement.CIM_CLASS_NAME, null,
                null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BIOSLoadedInNV
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_BIOSElement_CIM_BIOSLoadedInNVNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_BIOSElement_CIM_BIOSLoadedInNVNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BIOSLoadedInNV
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_BIOSElement_CIM_BIOSLoadedInNVNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV,
                    CIM_BIOSElement.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_MemoryHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_MemoryHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_BIOSElement.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_MemoryHelper.checkException(enumeration);
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
     * Get the list with CIM_BIOSLoadedInNV associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_BIOSLoadedInNV(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_MemoryHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_MemoryHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_BIOSLoadedInNVHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_BIOSLoadedInNV(cimInstance));
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
                        result.add(new CIM_BIOSLoadedInNV(cimInstance));
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
                        result.add(new CIM_BIOSLoadedInNV(cimInstance));
                        continue;
                    }
                }
            }
            CIM_MemoryHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_BIOSLoadedInNV
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_BIOSLoadedInNV(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_MemoryHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_MemoryHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_BIOSLoadedInNV.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_MemoryHelper.checkException(enumeration);
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
        return CIM_Memory.CIM_CLASS_NAME;
    }

}