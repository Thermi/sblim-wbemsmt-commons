/** 
 * CIM_StorageVolume.java
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
 * Description: A StorageVolume is an Extent that is presented to the Operating System (for example, by a hardware RAID cabinet), to a File System (for example, by a software volume manager) or to another entity. StorageVolumes do NOT participate in StorageRedundancy Groups. They are directly Realized in hardware or are the end result of assembling lower level Extents.
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

public class CIM_StorageVolume extends CIM_StorageExtent {

    public final static String CIM_CLASS_NAME = "CIM_StorageVolume";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * DiskPartitions should be BasedOn a single StorageVolume (for example, exposed by a hardware RAID cabinet), an SCC VolumeSet, or realized directly in PhysicalMedia. The first two relationships are made explicit in this association. The latter is conveyed by the RealizesDiskPartition association.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME = "CIM_DiskPartitionBasedOnVolume";

    /**
     * LogicalDisks can be BasedOn a single Volume (for example, exposed by a software volume manager), or be BasedOn a Disk Partition directly. The former relationship is made explicit in this association.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME = "CIM_LogicalDiskBasedOnVolume";

    /**
     * Constants of property Name
     * A unique identifier for the Volume.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property NameFormat
     * Note - this property originally touched on two concepts that are now separated into this property and NameNamespace. Values 2,3,4,5,6, and 8 are retained for backwards compatibility but are deprecated in lieu of the corresponding values in CIM_StorageVolume.NameNamespace. Format of the Name property. Values are (per SCSI SPC-3): 
     * 2 = VPD Page 83, NAA IEEE Registered Extended (VPD83NAA6) 
     * (DEPRECATED) 
     * 3 = VPD Page 83, NAA IEEE Registered (VPD83NAA5) 
     * (DEPRECATED) 
     * 4 = VPD Page 83, (VPD83Type2) (DEPRECATED) 
     * 5 = VPD Page 83, 
     * T10 Vendor Identification (VPD83Type1) (DEPRECATED) 
     * 6 = VPD Page 83, Vendor Specific (VPD83Type0) (DEPRECATED) 
     * 7 = Serial Number/Vendor/Model (SNVM) SNVM is 3 strings representing the vendor name, product name within the vendor namespace, and the serial number within the model namespace. Strings are delimited with a '+'. Spaces may be included and are significant. The serial number is the text representation of the serial number in hexadecimal upper case. Vendor and Model represent the vendor and model ID from SCSI Inquiry data, the vendor field MUST be 8 characters wide and the product field MUST be 16 characters wide. For example, 'ACME +SUPER DISK +124437458' 
     * 8 = Node WWN (for single LUN/controller) (NodeWWN) 
     * (DEPRECATED) 
     * 9 = NAA as a generic format. See 
     * http://standards.ieee.org/regauth/oui/tutorials/fibrecomp_id.html Formatted as 16 or 32 unseparated uppercase hex characters (2 per binary byte). For example '21000020372D3C73' 
     * 10 = EUI as a generic format (EUI64) See 
     * http://standards.ieee.org/regauth/oui/tutorials/EUI64.html 
     * Formatted as 16 unseparated uppercase hex characters (2 per binary byte) 
     * 11 = T10 vendor identifier format as returned by SCSI Inquiry VPD page 83, identifier type 2. See T1- SPC-3 specification. The 8-byte ASCII vendor ID from the T10 registry followed by a vendor specific ASCII identifier; spaces are permitted. For non SCSI volumes, 'SNVM' may be the most appropriate choice.
     */
    public static class PROPERTY_NAMEFORMAT {
        /**
         * name of the property NameFormat
         */
        public final static String NAME = "NameFormat";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83NAA6 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry VPD83NAA6 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_VPD83NAA6 = "VPD83NAA6";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83NAA5 = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry VPD83NAA5 (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_VPD83NAA5 = "VPD83NAA5";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type2 = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry VPD83Type2 (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_VPD83Type2 = "VPD83Type2";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD83Type1 = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry VPD83Type1 (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_VPD83Type1 = "VPD83Type1";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_VPD83Type0 = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry VPD83Type0 (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_VPD83Type0 = "VPD83Type0";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry SNVM (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_SNVM = "SNVM";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_NodeWWN = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry NodeWWN (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_NodeWWN = "NodeWWN";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_NAA = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry NAA (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_NAA = "NAA";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_EUI64 = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry EUI64 (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_EUI64 = "EUI64";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_T10VID = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry T10VID (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_T10VID = "T10VID";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@2ff62ff6
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_VPD83NAA6.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83NAA6;
            }

            if (VALUE_ENTRY_VPD83NAA5.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83NAA5;
            }

            if (VALUE_ENTRY_VPD83Type2.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type2;
            }

            if (VALUE_ENTRY_VPD83Type1.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD83Type1;
            }

            if (VALUE_ENTRY_VPD83Type0.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_VPD83Type0;
            }

            if (VALUE_ENTRY_SNVM.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM;
            }

            if (VALUE_ENTRY_NodeWWN.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_NodeWWN;
            }

            if (VALUE_ENTRY_NAA.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_NAA;
            }

            if (VALUE_ENTRY_EUI64.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_EUI64;
            }

            if (VALUE_ENTRY_T10VID.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_T10VID;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83NAA6.intValue()) {
                return VALUE_ENTRY_VPD83NAA6;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83NAA5.intValue()) {
                return VALUE_ENTRY_VPD83NAA5;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type2.intValue()) {
                return VALUE_ENTRY_VPD83Type2;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD83Type1.intValue()) {
                return VALUE_ENTRY_VPD83Type1;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_VPD83Type0.intValue()) {
                return VALUE_ENTRY_VPD83Type0;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM.intValue()) {
                return VALUE_ENTRY_SNVM;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_NodeWWN.intValue()) {
                return VALUE_ENTRY_NodeWWN;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_NAA.intValue()) {
                return VALUE_ENTRY_NAA;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_EUI64.intValue()) {
                return VALUE_ENTRY_EUI64;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_T10VID.intValue()) {
                return VALUE_ENTRY_T10VID;
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
         * Value Map for the property NameFormat   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83NAA6,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83NAA5,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type2,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD83Type1,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_VPD83Type0,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM, VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_NodeWWN,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_NAA, VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_EUI64,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_T10VID };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property NameFormat   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_VPD83NAA6, VALUE_ENTRY_VPD83NAA5, VALUE_ENTRY_VPD83Type2,
                VALUE_ENTRY_VPD83Type1, VALUE_ENTRY_VPD83Type0, VALUE_ENTRY_SNVM,
                VALUE_ENTRY_NodeWWN, VALUE_ENTRY_NAA, VALUE_ENTRY_EUI64, VALUE_ENTRY_T10VID };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property NameFormat   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_VPD83NAA6, VALUE_ENTRY_VPD83NAA5,
                VALUE_ENTRY_VPD83Type2, VALUE_ENTRY_VPD83Type1, VALUE_ENTRY_VPD83Type0,
                VALUE_ENTRY_SNVM, VALUE_ENTRY_NodeWWN, VALUE_ENTRY_NAA, VALUE_ENTRY_EUI64,
                VALUE_ENTRY_T10VID };

    }

    /**
     * Constants of property NameNamespace
     * The preferred source for volume names is SCSI VPD Page 83 responses. Page 83 returns a list of identifiers for various device elements. The metadata for each identifier includes an Association field, identifiers with association of 0 apply to volumes. Page 83 supports several namespaces specified in the Type field in the identifier metadata. See SCSI SPC-3 specification. 2 = VPD Page 83, Type 3 NAA (NameFormat should be NAA) 3 = VPD Page 83, Type 2 EUI64 (NameFormat EUI) 4 = VPD Page 83, Type 1 T10 Vendor Identification; (NameFormat T10) Less preferred namespaces from other interfaces: 5 = VPD page 80, Serial number (NameFormat should be Other) 6 = FC NodeWWN (NameFormat should be NAA or EUI) 7 = Serial Number/Vendor/Model (NameFormat should be SNVM)
     */
    public static class PROPERTY_NAMENAMESPACE {
        /**
         * name of the property NameNamespace
         */
        public final static String NAME = "NameNamespace";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83Type3 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry VPD83Type3 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_VPD83Type3 = "VPD83Type3";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83Type2 = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry VPD83Type2 (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_VPD83Type2 = "VPD83Type2";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type1 = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry VPD83Type1 (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_VPD83Type1 = "VPD83Type1";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD80 = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry VPD80 (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_VPD80 = "VPD80";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_NodeWWN = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry NodeWWN (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_NodeWWN = "NodeWWN";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry SNVM (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_SNVM = "SNVM";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@7e827e82
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_VPD83Type3.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83Type3;
            }

            if (VALUE_ENTRY_VPD83Type2.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83Type2;
            }

            if (VALUE_ENTRY_VPD83Type1.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type1;
            }

            if (VALUE_ENTRY_VPD80.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD80;
            }

            if (VALUE_ENTRY_NodeWWN.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_NodeWWN;
            }

            if (VALUE_ENTRY_SNVM.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83Type3.intValue()) {
                return VALUE_ENTRY_VPD83Type3;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83Type2.intValue()) {
                return VALUE_ENTRY_VPD83Type2;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type1.intValue()) {
                return VALUE_ENTRY_VPD83Type1;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD80.intValue()) {
                return VALUE_ENTRY_VPD80;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_NodeWWN.intValue()) {
                return VALUE_ENTRY_NodeWWN;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM.intValue()) {
                return VALUE_ENTRY_SNVM;
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
         * Value Map for the property NameNamespace   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_VPD83Type3,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_VPD83Type2,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_VPD83Type1,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_VPD80, VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_NodeWWN,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNVM };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property NameNamespace   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_VPD83Type3, VALUE_ENTRY_VPD83Type2, VALUE_ENTRY_VPD83Type1,
                VALUE_ENTRY_VPD80, VALUE_ENTRY_NodeWWN, VALUE_ENTRY_SNVM };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property NameNamespace   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_VPD83Type3, VALUE_ENTRY_VPD83Type2,
                VALUE_ENTRY_VPD83Type1, VALUE_ENTRY_VPD80, VALUE_ENTRY_NodeWWN, VALUE_ENTRY_SNVM };

    }

    /**
     * Constants of property OtherNameFormat
     * A string describing the format of the Name property when NameFormat includes the value 1, "Other".
     */
    public static class PROPERTY_OTHERNAMEFORMAT {
        /**
         * name of the property OtherNameFormat
         */
        public final static String NAME = "OtherNameFormat";

    }

    /**
     * Constants of property OtherNameNamespace
     * A string describing the namespace of the Name property when NameNamespace includes the value 1, "Other".
     */
    public static class PROPERTY_OTHERNAMENAMESPACE {
        /**
         * name of the property OtherNameNamespace
         */
        public final static String NAME = "OtherNameNamespace";

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
     *   A StorageVolume is an Extent that is presented to the Operating System (for example, by a hardware RAID cabinet), to a File System (for example, by a software volume manager) or to another entity. StorageVolumes do NOT participate in StorageRedundancy Groups. They are directly Realized in hardware or are the end result of assembling lower level Extents.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_StorageVolume(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A StorageVolume is an Extent that is presented to the Operating System (for example, by a hardware RAID cabinet), to a File System (for example, by a software volume manager) or to another entity. StorageVolumes do NOT participate in StorageRedundancy Groups. They are directly Realized in hardware or are the end result of assembling lower level Extents.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_StorageVolume(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_StorageVolume() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("NameFormat", new CIMProperty("NameFormat", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("NameNamespace", new CIMProperty("NameNamespace",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("OtherNameFormat", new CIMProperty("OtherNameFormat",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherNameNamespace", new CIMProperty("OtherNameNamespace",
                CIMDataType.STRING_T, null));

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
     * Get the property Name
     *     * <br>
     * A unique identifier for the Volume.
     *     */

    public String get_Name() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Name
     * <br>
     * A unique identifier for the Volume.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Name(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Name(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Name by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Name(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_StorageVolume fco = new CIM_StorageVolume(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null) {
            property = setPropertyValue_Name(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Name
     * <br>
     * A unique identifier for the Volume.
     */

    private static CIMProperty setPropertyValue_Name(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NameFormat
     *     * <br>
     * Note - this property originally touched on two concepts that are now separated into this property and NameNamespace. Values 2,3,4,5,6, and 8 are retained for backwards compatibility but are deprecated in lieu of the corresponding values in CIM_StorageVolume.NameNamespace. Format of the Name property. Values are (per SCSI SPC-3): 
     * 2 = VPD Page 83, NAA IEEE Registered Extended (VPD83NAA6) 
     * (DEPRECATED) 
     * 3 = VPD Page 83, NAA IEEE Registered (VPD83NAA5) 
     * (DEPRECATED) 
     * 4 = VPD Page 83, (VPD83Type2) (DEPRECATED) 
     * 5 = VPD Page 83, 
     * T10 Vendor Identification (VPD83Type1) (DEPRECATED) 
     * 6 = VPD Page 83, Vendor Specific (VPD83Type0) (DEPRECATED) 
     * 7 = Serial Number/Vendor/Model (SNVM) SNVM is 3 strings representing the vendor name, product name within the vendor namespace, and the serial number within the model namespace. Strings are delimited with a '+'. Spaces may be included and are significant. The serial number is the text representation of the serial number in hexadecimal upper case. Vendor and Model represent the vendor and model ID from SCSI Inquiry data, the vendor field MUST be 8 characters wide and the product field MUST be 16 characters wide. For example, 'ACME +SUPER DISK +124437458' 
     * 8 = Node WWN (for single LUN/controller) (NodeWWN) 
     * (DEPRECATED) 
     * 9 = NAA as a generic format. See 
     * http://standards.ieee.org/regauth/oui/tutorials/fibrecomp_id.html Formatted as 16 or 32 unseparated uppercase hex characters (2 per binary byte). For example '21000020372D3C73' 
     * 10 = EUI as a generic format (EUI64) See 
     * http://standards.ieee.org/regauth/oui/tutorials/EUI64.html 
     * Formatted as 16 unseparated uppercase hex characters (2 per binary byte) 
     * 11 = T10 vendor identifier format as returned by SCSI Inquiry VPD page 83, identifier type 2. See T1- SPC-3 specification. The 8-byte ASCII vendor ID from the T10 registry followed by a vendor specific ASCII identifier; spaces are permitted. For non SCSI volumes, 'SNVM' may be the most appropriate choice.
     *     */

    public javax.cim.UnsignedInteger16 get_NameFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property NameFormat
     * <br>
     * Note - this property originally touched on two concepts that are now separated into this property and NameNamespace. Values 2,3,4,5,6, and 8 are retained for backwards compatibility but are deprecated in lieu of the corresponding values in CIM_StorageVolume.NameNamespace. Format of the Name property. Values are (per SCSI SPC-3): 
     * 2 = VPD Page 83, NAA IEEE Registered Extended (VPD83NAA6) 
     * (DEPRECATED) 
     * 3 = VPD Page 83, NAA IEEE Registered (VPD83NAA5) 
     * (DEPRECATED) 
     * 4 = VPD Page 83, (VPD83Type2) (DEPRECATED) 
     * 5 = VPD Page 83, 
     * T10 Vendor Identification (VPD83Type1) (DEPRECATED) 
     * 6 = VPD Page 83, Vendor Specific (VPD83Type0) (DEPRECATED) 
     * 7 = Serial Number/Vendor/Model (SNVM) SNVM is 3 strings representing the vendor name, product name within the vendor namespace, and the serial number within the model namespace. Strings are delimited with a '+'. Spaces may be included and are significant. The serial number is the text representation of the serial number in hexadecimal upper case. Vendor and Model represent the vendor and model ID from SCSI Inquiry data, the vendor field MUST be 8 characters wide and the product field MUST be 16 characters wide. For example, 'ACME +SUPER DISK +124437458' 
     * 8 = Node WWN (for single LUN/controller) (NodeWWN) 
     * (DEPRECATED) 
     * 9 = NAA as a generic format. See 
     * http://standards.ieee.org/regauth/oui/tutorials/fibrecomp_id.html Formatted as 16 or 32 unseparated uppercase hex characters (2 per binary byte). For example '21000020372D3C73' 
     * 10 = EUI as a generic format (EUI64) See 
     * http://standards.ieee.org/regauth/oui/tutorials/EUI64.html 
     * Formatted as 16 unseparated uppercase hex characters (2 per binary byte) 
     * 11 = T10 vendor identifier format as returned by SCSI Inquiry VPD page 83, identifier type 2. See T1- SPC-3 specification. The 8-byte ASCII vendor ID from the T10 registry followed by a vendor specific ASCII identifier; spaces are permitted. For non SCSI volumes, 'SNVM' may be the most appropriate choice.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NameFormat(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEFORMAT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NameFormat(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NameFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NameFormat(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_StorageVolume fco = new CIM_StorageVolume(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAMEFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_NameFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NameFormat
     * <br>
     * Note - this property originally touched on two concepts that are now separated into this property and NameNamespace. Values 2,3,4,5,6, and 8 are retained for backwards compatibility but are deprecated in lieu of the corresponding values in CIM_StorageVolume.NameNamespace. Format of the Name property. Values are (per SCSI SPC-3): 
     * 2 = VPD Page 83, NAA IEEE Registered Extended (VPD83NAA6) 
     * (DEPRECATED) 
     * 3 = VPD Page 83, NAA IEEE Registered (VPD83NAA5) 
     * (DEPRECATED) 
     * 4 = VPD Page 83, (VPD83Type2) (DEPRECATED) 
     * 5 = VPD Page 83, 
     * T10 Vendor Identification (VPD83Type1) (DEPRECATED) 
     * 6 = VPD Page 83, Vendor Specific (VPD83Type0) (DEPRECATED) 
     * 7 = Serial Number/Vendor/Model (SNVM) SNVM is 3 strings representing the vendor name, product name within the vendor namespace, and the serial number within the model namespace. Strings are delimited with a '+'. Spaces may be included and are significant. The serial number is the text representation of the serial number in hexadecimal upper case. Vendor and Model represent the vendor and model ID from SCSI Inquiry data, the vendor field MUST be 8 characters wide and the product field MUST be 16 characters wide. For example, 'ACME +SUPER DISK +124437458' 
     * 8 = Node WWN (for single LUN/controller) (NodeWWN) 
     * (DEPRECATED) 
     * 9 = NAA as a generic format. See 
     * http://standards.ieee.org/regauth/oui/tutorials/fibrecomp_id.html Formatted as 16 or 32 unseparated uppercase hex characters (2 per binary byte). For example '21000020372D3C73' 
     * 10 = EUI as a generic format (EUI64) See 
     * http://standards.ieee.org/regauth/oui/tutorials/EUI64.html 
     * Formatted as 16 unseparated uppercase hex characters (2 per binary byte) 
     * 11 = T10 vendor identifier format as returned by SCSI Inquiry VPD page 83, identifier type 2. See T1- SPC-3 specification. The 8-byte ASCII vendor ID from the T10 registry followed by a vendor specific ASCII identifier; spaces are permitted. For non SCSI volumes, 'SNVM' may be the most appropriate choice.
     */

    private static CIMProperty setPropertyValue_NameFormat(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NameNamespace
     *     * <br>
     * The preferred source for volume names is SCSI VPD Page 83 responses. Page 83 returns a list of identifiers for various device elements. The metadata for each identifier includes an Association field, identifiers with association of 0 apply to volumes. Page 83 supports several namespaces specified in the Type field in the identifier metadata. See SCSI SPC-3 specification. 2 = VPD Page 83, Type 3 NAA (NameFormat should be NAA) 3 = VPD Page 83, Type 2 EUI64 (NameFormat EUI) 4 = VPD Page 83, Type 1 T10 Vendor Identification; (NameFormat T10) Less preferred namespaces from other interfaces: 5 = VPD page 80, Serial number (NameFormat should be Other) 6 = FC NodeWWN (NameFormat should be NAA or EUI) 7 = Serial Number/Vendor/Model (NameFormat should be SNVM)
     *     */

    public javax.cim.UnsignedInteger16 get_NameNamespace() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMENAMESPACE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAMENAMESPACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property NameNamespace
     * <br>
     * The preferred source for volume names is SCSI VPD Page 83 responses. Page 83 returns a list of identifiers for various device elements. The metadata for each identifier includes an Association field, identifiers with association of 0 apply to volumes. Page 83 supports several namespaces specified in the Type field in the identifier metadata. See SCSI SPC-3 specification. 2 = VPD Page 83, Type 3 NAA (NameFormat should be NAA) 3 = VPD Page 83, Type 2 EUI64 (NameFormat EUI) 4 = VPD Page 83, Type 1 T10 Vendor Identification; (NameFormat T10) Less preferred namespaces from other interfaces: 5 = VPD page 80, Serial number (NameFormat should be Other) 6 = FC NodeWWN (NameFormat should be NAA or EUI) 7 = Serial Number/Vendor/Model (NameFormat should be SNVM)
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NameNamespace(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMENAMESPACE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NameNamespace(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAMENAMESPACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NameNamespace by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NameNamespace(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_StorageVolume fco = new CIM_StorageVolume(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAMENAMESPACE.NAME);
        if (property != null) {
            property = setPropertyValue_NameNamespace(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAMENAMESPACE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NameNamespace
     * <br>
     * The preferred source for volume names is SCSI VPD Page 83 responses. Page 83 returns a list of identifiers for various device elements. The metadata for each identifier includes an Association field, identifiers with association of 0 apply to volumes. Page 83 supports several namespaces specified in the Type field in the identifier metadata. See SCSI SPC-3 specification. 2 = VPD Page 83, Type 3 NAA (NameFormat should be NAA) 3 = VPD Page 83, Type 2 EUI64 (NameFormat EUI) 4 = VPD Page 83, Type 1 T10 Vendor Identification; (NameFormat T10) Less preferred namespaces from other interfaces: 5 = VPD page 80, Serial number (NameFormat should be Other) 6 = FC NodeWWN (NameFormat should be NAA or EUI) 7 = Serial Number/Vendor/Model (NameFormat should be SNVM)
     */

    private static CIMProperty setPropertyValue_NameNamespace(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherNameFormat
     *     * <br>
     * A string describing the format of the Name property when NameFormat includes the value 1, "Other".
     *     */

    public String get_OtherNameFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERNAMEFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERNAMEFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherNameFormat
     * <br>
     * A string describing the format of the Name property when NameFormat includes the value 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherNameFormat(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERNAMEFORMAT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherNameFormat(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERNAMEFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherNameFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherNameFormat(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_StorageVolume fco = new CIM_StorageVolume(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERNAMEFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_OtherNameFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERNAMEFORMAT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherNameFormat
     * <br>
     * A string describing the format of the Name property when NameFormat includes the value 1, "Other".
     */

    private static CIMProperty setPropertyValue_OtherNameFormat(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherNameNamespace
     *     * <br>
     * A string describing the namespace of the Name property when NameNamespace includes the value 1, "Other".
     *     */

    public String get_OtherNameNamespace() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERNAMENAMESPACE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERNAMENAMESPACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherNameNamespace
     * <br>
     * A string describing the namespace of the Name property when NameNamespace includes the value 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherNameNamespace(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERNAMENAMESPACE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherNameNamespace(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERNAMENAMESPACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherNameNamespace by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherNameNamespace(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_StorageVolume fco = new CIM_StorageVolume(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERNAMENAMESPACE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherNameNamespace(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERNAMENAMESPACE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherNameNamespace
     * <br>
     * A string describing the namespace of the Name property when NameNamespace includes the value 1, "Other".
     */

    private static CIMProperty setPropertyValue_OtherNameNamespace(CIMProperty currentProperty,
            String newValue) {
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
     * Get the list with CIM_DiskPartition objects associated by the association CIM_DiskPartitionBasedOnVolume
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_DiskPartition_CIM_DiskPartitionBasedOnVolumes(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_DiskPartition_CIM_DiskPartitionBasedOnVolumes(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME,
                CIM_DiskPartition.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_DiskPartition objects associated by the association CIM_DiskPartitionBasedOnVolume
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_DiskPartition_CIM_DiskPartitionBasedOnVolumes(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_DiskPartition_CIM_DiskPartitionBasedOnVolumes(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_DiskPartition objects associated by the association CIM_DiskPartitionBasedOnVolume
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_DiskPartition_CIM_DiskPartitionBasedOnVolumes(
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
                CIM_StorageVolumeHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_StorageVolumeHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_StorageVolumeHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_DiskPartition(cimInstance));
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
                        result.add(new CIM_DiskPartition(cimInstance));
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
                        result.add(new CIM_DiskPartition(cimInstance));
                        continue;
                    }
                }
            }
            CIM_StorageVolumeHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_DiskPartitionBasedOnVolume
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_DiskPartition_CIM_DiskPartitionBasedOnVolumeNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_DiskPartition_CIM_DiskPartitionBasedOnVolumeNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME,
                CIM_DiskPartition.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_DiskPartitionBasedOnVolume
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_DiskPartition_CIM_DiskPartitionBasedOnVolumeNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_DiskPartition_CIM_DiskPartitionBasedOnVolumeNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_DiskPartitionBasedOnVolume
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_DiskPartition_CIM_DiskPartitionBasedOnVolumeNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME,
                    CIM_DiskPartition.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_StorageVolumeHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_StorageVolumeHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_DiskPartition.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_StorageVolumeHelper.checkException(enumeration);
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
     * Get the list with CIM_DiskPartitionBasedOnVolume associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_DiskPartitionBasedOnVolume(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_StorageVolumeHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_StorageVolumeHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_DiskPartitionBasedOnVolumeHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_DiskPartitionBasedOnVolume(cimInstance));
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
                        result.add(new CIM_DiskPartitionBasedOnVolume(cimInstance));
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
                        result.add(new CIM_DiskPartitionBasedOnVolume(cimInstance));
                        continue;
                    }
                }
            }
            CIM_StorageVolumeHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_DiskPartitionBasedOnVolume
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_DiskPartitionBasedOnVolume(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_StorageVolumeHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_StorageVolumeHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_DiskPartitionBasedOnVolume.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_StorageVolumeHelper.checkException(enumeration);
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
     * Get the list with CIM_LogicalDisk objects associated by the association CIM_LogicalDiskBasedOnVolume
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnVolumes(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnVolumes(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME,
                CIM_LogicalDisk.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_LogicalDisk objects associated by the association CIM_LogicalDiskBasedOnVolume
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnVolumes(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnVolumes(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_LogicalDisk objects associated by the association CIM_LogicalDiskBasedOnVolume
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnVolumes(
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
                CIM_StorageVolumeHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_StorageVolumeHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_StorageVolumeHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_LogicalDisk(cimInstance));
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
                        result.add(new CIM_LogicalDisk(cimInstance));
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
                        result.add(new CIM_LogicalDisk(cimInstance));
                        continue;
                    }
                }
            }
            CIM_StorageVolumeHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_LogicalDiskBasedOnVolume
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnVolumeNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnVolumeNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME,
                CIM_LogicalDisk.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_LogicalDiskBasedOnVolume
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnVolumeNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnVolumeNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_LogicalDiskBasedOnVolume
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnVolumeNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME,
                    CIM_LogicalDisk.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_StorageVolumeHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_StorageVolumeHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_LogicalDisk.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_StorageVolumeHelper.checkException(enumeration);
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
     * Get the list with CIM_LogicalDiskBasedOnVolume associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_LogicalDiskBasedOnVolume(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_StorageVolumeHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_StorageVolumeHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_LogicalDiskBasedOnVolumeHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_LogicalDiskBasedOnVolume(cimInstance));
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
                        result.add(new CIM_LogicalDiskBasedOnVolume(cimInstance));
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
                        result.add(new CIM_LogicalDiskBasedOnVolume(cimInstance));
                        continue;
                    }
                }
            }
            CIM_StorageVolumeHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_LogicalDiskBasedOnVolume
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_LogicalDiskBasedOnVolume(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONVOLUME,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_StorageVolumeHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_StorageVolumeHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_LogicalDiskBasedOnVolume.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_StorageVolumeHelper.checkException(enumeration);
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
        return CIM_StorageVolume.CIM_CLASS_NAME;
    }

}