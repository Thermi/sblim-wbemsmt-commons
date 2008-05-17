/** 
 * CIM_MediaAccessDevice.java
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
 * Description: A MediaAccessDevice represents the ability to access one or more media and use this media to store and retrieve data.
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

public class CIM_MediaAccessDevice extends CIM_LogicalDevice {

    public final static String CIM_CLASS_NAME = "CIM_MediaAccessDevice";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Where a StorageExtent must be accessed through a MediaAccess Device, this relationship is described by the MediaPresent association.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT = "CIM_MediaPresent";

    /**
     * Constant for method\'s name and parameters
     * Method to lock and unlock the media in a removeable Access Device. The method takes one parameter as input - a boolean indicating whether to lock or unlock. TRUE indicates that the media should be locked in the Device, FALSE indicates that the media should be unlocked. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. The set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier on the method.
     */

    public static class METHOD_LOCKMEDIA {
        /**
         * Constant for method LockMedia
         */
        public final static String NAME = "LockMedia";

        /**
         * constants for parameter Lock
         */
        public static class PARAMETER_LOCK {
            /*
             * Name of the parameter Lock
             */
            public final static String NAME = "Lock";

        }
    }

    /**
     * Constants of property Capabilities
     * Capabilities of the MediaAccessDevice. For example, the Device may support "Random Access", removeable media and "Automatic Cleaning". In this case, the values 3, 7 and 9 would be written to the array. 
     * Several of the enumerated values require some explanation: 1) Value 11, Supports Dual Sided Media, distinguishes a Device that can access both sides of dual sided Media, from a Device that reads only a single side and requires the Media to be flipped; and, 2) Value 12, Predismount Eject Not Required, indicates that Media does not have to be explicitly ejected from the Device before being accessed by a PickerElement.
     */
    public static class PROPERTY_CAPABILITIES {
        /**
         * name of the property Capabilities
         */
        public final static String NAME = "Capabilities";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Sequential_Access = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Sequential Access (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Sequential_Access = "Sequential Access";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Random_Access = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Random Access (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Random_Access = "Random Access";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Supports_Writing = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Supports Writing (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Supports_Writing = "Supports Writing";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Encryption = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Encryption (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Encryption = "Encryption";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Compression = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Compression (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Compression = "Compression";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Supports_Removeable_Media = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Supports Removeable Media (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Supports_Removeable_Media = "Supports Removeable Media";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Manual_Cleaning = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Manual Cleaning (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Manual_Cleaning = "Manual Cleaning";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Automatic_Cleaning = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Automatic Cleaning (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Automatic_Cleaning = "Automatic Cleaning";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_SMART_Notification = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry SMART Notification (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_SMART_Notification = "SMART Notification";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Supports_Dual_Sided_Media = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Supports Dual Sided Media (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Supports_Dual_Sided_Media = "Supports Dual Sided Media";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Predismount_Eject_Not_Required = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Predismount Eject Not Required (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Predismount_Eject_Not_Required = "Predismount Eject Not Required";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@7e807e8
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Sequential_Access.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Sequential_Access;
            }

            if (VALUE_ENTRY_Random_Access.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Random_Access;
            }

            if (VALUE_ENTRY_Supports_Writing.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Supports_Writing;
            }

            if (VALUE_ENTRY_Encryption.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Encryption;
            }

            if (VALUE_ENTRY_Compression.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Compression;
            }

            if (VALUE_ENTRY_Supports_Removeable_Media.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Supports_Removeable_Media;
            }

            if (VALUE_ENTRY_Manual_Cleaning.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Manual_Cleaning;
            }

            if (VALUE_ENTRY_Automatic_Cleaning.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Automatic_Cleaning;
            }

            if (VALUE_ENTRY_SMART_Notification.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_SMART_Notification;
            }

            if (VALUE_ENTRY_Supports_Dual_Sided_Media.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Supports_Dual_Sided_Media;
            }

            if (VALUE_ENTRY_Predismount_Eject_Not_Required.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Predismount_Eject_Not_Required;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Sequential_Access.intValue()) {
                return VALUE_ENTRY_Sequential_Access;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Random_Access.intValue()) {
                return VALUE_ENTRY_Random_Access;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Supports_Writing.intValue()) {
                return VALUE_ENTRY_Supports_Writing;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Encryption.intValue()) {
                return VALUE_ENTRY_Encryption;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Compression.intValue()) {
                return VALUE_ENTRY_Compression;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Supports_Removeable_Media.intValue()) {
                return VALUE_ENTRY_Supports_Removeable_Media;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Manual_Cleaning.intValue()) {
                return VALUE_ENTRY_Manual_Cleaning;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Automatic_Cleaning.intValue()) {
                return VALUE_ENTRY_Automatic_Cleaning;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_SMART_Notification.intValue()) {
                return VALUE_ENTRY_SMART_Notification;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Supports_Dual_Sided_Media.intValue()) {
                return VALUE_ENTRY_Supports_Dual_Sided_Media;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Predismount_Eject_Not_Required
                    .intValue()) {
                return VALUE_ENTRY_Predismount_Eject_Not_Required;
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
         * Value Map for the property Capabilities   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Sequential_Access,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Random_Access,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Supports_Writing,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Encryption,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Compression,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Supports_Removeable_Media,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Manual_Cleaning,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Automatic_Cleaning,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_SMART_Notification,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Supports_Dual_Sided_Media,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Predismount_Eject_Not_Required };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Capabilities   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Sequential_Access, VALUE_ENTRY_Random_Access,
                VALUE_ENTRY_Supports_Writing, VALUE_ENTRY_Encryption, VALUE_ENTRY_Compression,
                VALUE_ENTRY_Supports_Removeable_Media, VALUE_ENTRY_Manual_Cleaning,
                VALUE_ENTRY_Automatic_Cleaning, VALUE_ENTRY_SMART_Notification,
                VALUE_ENTRY_Supports_Dual_Sided_Media, VALUE_ENTRY_Predismount_Eject_Not_Required };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Capabilities   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Sequential_Access, VALUE_ENTRY_Random_Access,
                VALUE_ENTRY_Supports_Writing, VALUE_ENTRY_Encryption, VALUE_ENTRY_Compression,
                VALUE_ENTRY_Supports_Removeable_Media, VALUE_ENTRY_Manual_Cleaning,
                VALUE_ENTRY_Automatic_Cleaning, VALUE_ENTRY_SMART_Notification,
                VALUE_ENTRY_Supports_Dual_Sided_Media, VALUE_ENTRY_Predismount_Eject_Not_Required };

    }

    /**
     * Constants of property CapabilityDescriptions
     * An array of free-form strings providing more detailed explanations for any of the AccessDevice features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
     */
    public static class PROPERTY_CAPABILITYDESCRIPTIONS {
        /**
         * name of the property CapabilityDescriptions
         */
        public final static String NAME = "CapabilityDescriptions";

    }

    /**
     * Constants of property CompressionMethod
     * A free form string indicating the algorithm or tool used by the device to support compression. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the device supports compression capabilities or not, "Compressed" to represent that the device supports compression capabilities but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the devices does not support compression capabilities.
     */
    public static class PROPERTY_COMPRESSIONMETHOD {
        /**
         * name of the property CompressionMethod
         */
        public final static String NAME = "CompressionMethod";

    }

    /**
     * Constants of property DefaultBlockSize
     * Default block size, in bytes, for this Device.
     */
    public static class PROPERTY_DEFAULTBLOCKSIZE {
        /**
         * name of the property DefaultBlockSize
         */
        public final static String NAME = "DefaultBlockSize";

    }

    /**
     * Constants of property ErrorMethodology
     * ErrorMethodology is a free-form string describing the type(s) of error detection and correction supported by this Device.
     */
    public static class PROPERTY_ERRORMETHODOLOGY {
        /**
         * name of the property ErrorMethodology
         */
        public final static String NAME = "ErrorMethodology";

    }

    /**
     * Constants of property LastCleaned
     * The date and time on which the Device was last cleaned.
     */
    public static class PROPERTY_LASTCLEANED {
        /**
         * name of the property LastCleaned
         */
        public final static String NAME = "LastCleaned";

    }

    /**
     * Constants of property LoadTime
     * Time in milliseconds from 'load' to being able to read or write a Media. For example, for DiskDrives, this is the interval between a disk not spinning to the disk reporting that it is ready for read/write (ie, the disk spinning at nominal speeds). For TapeDrives, this is the time from a Media being injected to reporting that it is ready for an application. This is usually at the tape's BOT area.
     */
    public static class PROPERTY_LOADTIME {
        /**
         * name of the property LoadTime
         */
        public final static String NAME = "LoadTime";

    }

    /**
     * Constants of property MaxAccessTime
     * Time in milliseconds to move from the first location on the Media to the location that is furthest with respect to time. For a DiskDrive, this represents full seek + full rotational delay. For TapeDrives, this represents a search from the beginning of the tape to the most physically distant point. (The end of a tape may be at its most physically distant point, but this is not necessarily true.)
     */
    public static class PROPERTY_MAXACCESSTIME {
        /**
         * name of the property MaxAccessTime
         */
        public final static String NAME = "MaxAccessTime";

    }

    /**
     * Constants of property MaxBlockSize
     * Maximum block size, in bytes, for media accessed by this Device.
     */
    public static class PROPERTY_MAXBLOCKSIZE {
        /**
         * name of the property MaxBlockSize
         */
        public final static String NAME = "MaxBlockSize";

    }

    /**
     * Constants of property MaxMediaSize
     * Maximum size, in KBytes, of media supported by this Device. KBytes is interpreted as the number of bytes multiplied by 1000 (NOT the number of bytes multiplied by 1024).
     */
    public static class PROPERTY_MAXMEDIASIZE {
        /**
         * name of the property MaxMediaSize
         */
        public final static String NAME = "MaxMediaSize";

    }

    /**
     * Constants of property MaxUnitsBeforeCleaning
     * An unsigned integer indicating the maximum 'units' that can be used, with respect to the AccessDevice, before the Device should be cleaned. The property, UnitsDescription, defines how 'units' should be interpreted.
     */
    public static class PROPERTY_MAXUNITSBEFORECLEANING {
        /**
         * name of the property MaxUnitsBeforeCleaning
         */
        public final static String NAME = "MaxUnitsBeforeCleaning";

    }

    /**
     * Constants of property MediaIsLocked
     * True indicates that the media is locked in the Device and can not be ejected. For non-removeable Devices, this value should be true.
     */
    public static class PROPERTY_MEDIAISLOCKED {
        /**
         * name of the property MediaIsLocked
         */
        public final static String NAME = "MediaIsLocked";

    }

    /**
     * Constants of property MinBlockSize
     * Minimum block size, in bytes, for media accessed by this Device.
     */
    public static class PROPERTY_MINBLOCKSIZE {
        /**
         * name of the property MinBlockSize
         */
        public final static String NAME = "MinBlockSize";

    }

    /**
     * Constants of property MountCount
     * For a MediaAccessDevice that supports removable Media, the number of times that Media have been mounted for data transfer or to clean the Device. For Devices accessing nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
     */
    public static class PROPERTY_MOUNTCOUNT {
        /**
         * name of the property MountCount
         */
        public final static String NAME = "MountCount";

    }

    /**
     * Constants of property NeedsCleaning
     * Boolean indicating that the MediaAccessDevice needs cleaning. Whether manual or automatic cleaning is possible is indicated in the Capabilities array property.
     */
    public static class PROPERTY_NEEDSCLEANING {
        /**
         * name of the property NeedsCleaning
         */
        public final static String NAME = "NeedsCleaning";

    }

    /**
     * Constants of property NumberOfMediaSupported
     * When the MediaAccessDevice supports multiple individual Media, this property defines the maximum number which can be supported or inserted.
     */
    public static class PROPERTY_NUMBEROFMEDIASUPPORTED {
        /**
         * name of the property NumberOfMediaSupported
         */
        public final static String NAME = "NumberOfMediaSupported";

    }

    /**
     * Constants of property Security
     * An enumeration indicating the operational security defined for the MediaAccessDevice. For example, information that the Device is "Read Only" (value=4) or "Boot Bypass" (value=6) can be described using this property.
     */
    public static class PROPERTY_SECURITY {
        /**
         * name of the property Security
         */
        public final static String NAME = "Security";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_None = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry None (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_None = "None";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Read_Only = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Read Only (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Read_Only = "Read Only";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Locked_Out = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Locked Out (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Locked_Out = "Locked Out";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Boot_Bypass = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Boot Bypass (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Boot_Bypass = "Boot Bypass";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Boot_Bypass_and_Read_Only = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Boot Bypass and Read Only (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Boot_Bypass_and_Read_Only = "Boot Bypass and Read Only";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@7f007f0
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_None.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_None;
            }

            if (VALUE_ENTRY_Read_Only.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Read_Only;
            }

            if (VALUE_ENTRY_Locked_Out.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Locked_Out;
            }

            if (VALUE_ENTRY_Boot_Bypass.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Boot_Bypass;
            }

            if (VALUE_ENTRY_Boot_Bypass_and_Read_Only.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Boot_Bypass_and_Read_Only;
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

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_None.intValue()) {
                return VALUE_ENTRY_None;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Read_Only.intValue()) {
                return VALUE_ENTRY_Read_Only;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Locked_Out.intValue()) {
                return VALUE_ENTRY_Locked_Out;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Boot_Bypass.intValue()) {
                return VALUE_ENTRY_Boot_Bypass;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Boot_Bypass_and_Read_Only.intValue()) {
                return VALUE_ENTRY_Boot_Bypass_and_Read_Only;
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
         * Value Map for the property Security   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_None,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Read_Only,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Locked_Out,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Boot_Bypass,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Boot_Bypass_and_Read_Only };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Security   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_None, VALUE_ENTRY_Read_Only, VALUE_ENTRY_Locked_Out,
                VALUE_ENTRY_Boot_Bypass, VALUE_ENTRY_Boot_Bypass_and_Read_Only };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Security   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_None, VALUE_ENTRY_Read_Only,
                VALUE_ENTRY_Locked_Out, VALUE_ENTRY_Boot_Bypass,
                VALUE_ENTRY_Boot_Bypass_and_Read_Only };

    }

    /**
     * Constants of property TimeOfLastMount
     * For a MediaAccessDevice that supports removable Media, the most recent date and time that Media was mounted on the Device. For Devices accessing nonremovable Media, such as hard disks, this property has no meaning and is not applicable.
     */
    public static class PROPERTY_TIMEOFLASTMOUNT {
        /**
         * name of the property TimeOfLastMount
         */
        public final static String NAME = "TimeOfLastMount";

    }

    /**
     * Constants of property TotalMountTime
     * For a MediaAccessDevice that supports removable Media, the total time (in seconds) that Media have been mounted for data transfer or to clean the Device. For Devices accessing nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
     */
    public static class PROPERTY_TOTALMOUNTTIME {
        /**
         * name of the property TotalMountTime
         */
        public final static String NAME = "TotalMountTime";

    }

    /**
     * Constants of property UncompressedDataRate
     * The sustained data transfer rate in KB/sec that the Device can read from and write to a Media. This is a sustained, raw data rate. Maximum rates or rates assuming compression should not be reported in this property.
     */
    public static class PROPERTY_UNCOMPRESSEDDATARATE {
        /**
         * name of the property UncompressedDataRate
         */
        public final static String NAME = "UncompressedDataRate";

    }

    /**
     * Constants of property UnitsDescription
     * Defines 'Units' relative to its use in the property, MaxUnitsBeforeCleaning. This describes the criteria used to determine when the MediaAccessDevice should be cleaned.
     */
    public static class PROPERTY_UNITSDESCRIPTION {
        /**
         * name of the property UnitsDescription
         */
        public final static String NAME = "UnitsDescription";

    }

    /**
     * Constants of property UnitsUsed
     * An unsigned integer indicating the currently used 'units' of the AccessDevice, helpful to describe when the Device may require cleaning. The property, UnitsDescription, defines how 'units' should be interpreted.
     */
    public static class PROPERTY_UNITSUSED {
        /**
         * name of the property UnitsUsed
         */
        public final static String NAME = "UnitsUsed";

    }

    /**
     * Constants of property UnloadTime
     * Time in milliseconds from being able to read or write a Media to its 'unload'. For example, for DiskDrives, this is the interval between a disk spinning at nominal speeds and a disk not spinning. For TapeDrives, this is the time for a Media to go from its BOT to being fully ejected and accessible to a PickerElement or human operator.
     */
    public static class PROPERTY_UNLOADTIME {
        /**
         * name of the property UnloadTime
         */
        public final static String NAME = "UnloadTime";

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
     *   A MediaAccessDevice represents the ability to access one or more media and use this media to store and retrieve data.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_MediaAccessDevice(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A MediaAccessDevice represents the ability to access one or more media and use this media to store and retrieve data.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_MediaAccessDevice(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_MediaAccessDevice() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Capabilities", new CIMProperty("Capabilities",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("CapabilityDescriptions", new CIMProperty("CapabilityDescriptions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("CompressionMethod", new CIMProperty("CompressionMethod",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("DefaultBlockSize", new CIMProperty("DefaultBlockSize",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ErrorMethodology", new CIMProperty("ErrorMethodology",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("LastCleaned", new CIMProperty("LastCleaned", CIMDataType.DATETIME_T,
                null));
        propertiesToCheck.put("LoadTime", new CIMProperty("LoadTime", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("MaxAccessTime", new CIMProperty("MaxAccessTime",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("MaxBlockSize", new CIMProperty("MaxBlockSize", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("MaxMediaSize", new CIMProperty("MaxMediaSize", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("MaxUnitsBeforeCleaning", new CIMProperty("MaxUnitsBeforeCleaning",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("MediaIsLocked", new CIMProperty("MediaIsLocked",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("MinBlockSize", new CIMProperty("MinBlockSize", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("MountCount", new CIMProperty("MountCount", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("NeedsCleaning", new CIMProperty("NeedsCleaning",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("NumberOfMediaSupported", new CIMProperty("NumberOfMediaSupported",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("Security", new CIMProperty("Security", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("TimeOfLastMount", new CIMProperty("TimeOfLastMount",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("TotalMountTime", new CIMProperty("TotalMountTime",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UncompressedDataRate", new CIMProperty("UncompressedDataRate",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("UnitsDescription", new CIMProperty("UnitsDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck
                .put("UnitsUsed", new CIMProperty("UnitsUsed", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UnloadTime", new CIMProperty("UnloadTime", CIMDataType.UINT64_T,
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
     * Get the property Capabilities
     *     * <br>
     * Capabilities of the MediaAccessDevice. For example, the Device may support "Random Access", removeable media and "Automatic Cleaning". In this case, the values 3, 7 and 9 would be written to the array. 
     * Several of the enumerated values require some explanation: 1) Value 11, Supports Dual Sided Media, distinguishes a Device that can access both sides of dual sided Media, from a Device that reads only a single side and requires the Media to be flipped; and, 2) Value 12, Predismount Eject Not Required, indicates that Media does not have to be explicitly ejected from the Device before being accessed by a PickerElement.
     *     */

    public javax.cim.UnsignedInteger16[] get_Capabilities() {
        CIMProperty currentProperty = getProperty(PROPERTY_CAPABILITIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CAPABILITIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property Capabilities
     * <br>
     * Capabilities of the MediaAccessDevice. For example, the Device may support "Random Access", removeable media and "Automatic Cleaning". In this case, the values 3, 7 and 9 would be written to the array. 
     * Several of the enumerated values require some explanation: 1) Value 11, Supports Dual Sided Media, distinguishes a Device that can access both sides of dual sided Media, from a Device that reads only a single side and requires the Media to be flipped; and, 2) Value 12, Predismount Eject Not Required, indicates that Media does not have to be explicitly ejected from the Device before being accessed by a PickerElement.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Capabilities(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CAPABILITIES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Capabilities(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CAPABILITIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Capabilities by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Capabilities(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CAPABILITIES.NAME);
        if (property != null) {
            property = setPropertyValue_Capabilities(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CAPABILITIES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Capabilities
     * <br>
     * Capabilities of the MediaAccessDevice. For example, the Device may support "Random Access", removeable media and "Automatic Cleaning". In this case, the values 3, 7 and 9 would be written to the array. 
     * Several of the enumerated values require some explanation: 1) Value 11, Supports Dual Sided Media, distinguishes a Device that can access both sides of dual sided Media, from a Device that reads only a single side and requires the Media to be flipped; and, 2) Value 12, Predismount Eject Not Required, indicates that Media does not have to be explicitly ejected from the Device before being accessed by a PickerElement.
     */

    private static CIMProperty setPropertyValue_Capabilities(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CapabilityDescriptions
     *     * <br>
     * An array of free-form strings providing more detailed explanations for any of the AccessDevice features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
     *     */

    public String[] get_CapabilityDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_CAPABILITYDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CAPABILITYDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property CapabilityDescriptions
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the AccessDevice features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CapabilityDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CAPABILITYDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CapabilityDescriptions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CAPABILITYDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CapabilityDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CapabilityDescriptions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CAPABILITYDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_CapabilityDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CAPABILITYDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CapabilityDescriptions
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the AccessDevice features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
     */

    private static CIMProperty setPropertyValue_CapabilityDescriptions(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CompressionMethod
     *     * <br>
     * A free form string indicating the algorithm or tool used by the device to support compression. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the device supports compression capabilities or not, "Compressed" to represent that the device supports compression capabilities but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the devices does not support compression capabilities.
     *     */

    public String get_CompressionMethod() {
        CIMProperty currentProperty = getProperty(PROPERTY_COMPRESSIONMETHOD.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_COMPRESSIONMETHOD.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CompressionMethod
     * <br>
     * A free form string indicating the algorithm or tool used by the device to support compression. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the device supports compression capabilities or not, "Compressed" to represent that the device supports compression capabilities but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the devices does not support compression capabilities.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CompressionMethod(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_COMPRESSIONMETHOD.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CompressionMethod(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_COMPRESSIONMETHOD.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CompressionMethod by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CompressionMethod(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_COMPRESSIONMETHOD.NAME);
        if (property != null) {
            property = setPropertyValue_CompressionMethod(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_COMPRESSIONMETHOD.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CompressionMethod
     * <br>
     * A free form string indicating the algorithm or tool used by the device to support compression. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the device supports compression capabilities or not, "Compressed" to represent that the device supports compression capabilities but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the devices does not support compression capabilities.
     */

    private static CIMProperty setPropertyValue_CompressionMethod(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DefaultBlockSize
     *     * <br>
     * Default block size, in bytes, for this Device.
     *     */

    public javax.cim.UnsignedInteger64 get_DefaultBlockSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_DEFAULTBLOCKSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEFAULTBLOCKSIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property DefaultBlockSize
     * <br>
     * Default block size, in bytes, for this Device.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DefaultBlockSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEFAULTBLOCKSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DefaultBlockSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEFAULTBLOCKSIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DefaultBlockSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DefaultBlockSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEFAULTBLOCKSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_DefaultBlockSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEFAULTBLOCKSIZE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DefaultBlockSize
     * <br>
     * Default block size, in bytes, for this Device.
     */

    private static CIMProperty setPropertyValue_DefaultBlockSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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
     * ErrorMethodology is a free-form string describing the type(s) of error detection and correction supported by this Device.
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
     * ErrorMethodology is a free-form string describing the type(s) of error detection and correction supported by this Device.
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
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
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
     * ErrorMethodology is a free-form string describing the type(s) of error detection and correction supported by this Device.
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
     * Get the property LastCleaned
     *     * <br>
     * The date and time on which the Device was last cleaned.
     *     */

    public javax.cim.CIMDateTime get_LastCleaned() {
        CIMProperty currentProperty = getProperty(PROPERTY_LASTCLEANED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LASTCLEANED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property LastCleaned
     * <br>
     * The date and time on which the Device was last cleaned.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LastCleaned(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LASTCLEANED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LastCleaned(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LASTCLEANED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LastCleaned by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LastCleaned(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LASTCLEANED.NAME);
        if (property != null) {
            property = setPropertyValue_LastCleaned(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LASTCLEANED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LastCleaned
     * <br>
     * The date and time on which the Device was last cleaned.
     */

    private static CIMProperty setPropertyValue_LastCleaned(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LoadTime
     *     * <br>
     * Time in milliseconds from 'load' to being able to read or write a Media. For example, for DiskDrives, this is the interval between a disk not spinning to the disk reporting that it is ready for read/write (ie, the disk spinning at nominal speeds). For TapeDrives, this is the time from a Media being injected to reporting that it is ready for an application. This is usually at the tape's BOT area.
     *     */

    public javax.cim.UnsignedInteger64 get_LoadTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOADTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOADTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property LoadTime
     * <br>
     * Time in milliseconds from 'load' to being able to read or write a Media. For example, for DiskDrives, this is the interval between a disk not spinning to the disk reporting that it is ready for read/write (ie, the disk spinning at nominal speeds). For TapeDrives, this is the time from a Media being injected to reporting that it is ready for an application. This is usually at the tape's BOT area.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LoadTime(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOADTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LoadTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOADTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LoadTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LoadTime(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOADTIME.NAME);
        if (property != null) {
            property = setPropertyValue_LoadTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOADTIME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LoadTime
     * <br>
     * Time in milliseconds from 'load' to being able to read or write a Media. For example, for DiskDrives, this is the interval between a disk not spinning to the disk reporting that it is ready for read/write (ie, the disk spinning at nominal speeds). For TapeDrives, this is the time from a Media being injected to reporting that it is ready for an application. This is usually at the tape's BOT area.
     */

    private static CIMProperty setPropertyValue_LoadTime(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxAccessTime
     *     * <br>
     * Time in milliseconds to move from the first location on the Media to the location that is furthest with respect to time. For a DiskDrive, this represents full seek + full rotational delay. For TapeDrives, this represents a search from the beginning of the tape to the most physically distant point. (The end of a tape may be at its most physically distant point, but this is not necessarily true.)
     *     */

    public javax.cim.UnsignedInteger64 get_MaxAccessTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXACCESSTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXACCESSTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MaxAccessTime
     * <br>
     * Time in milliseconds to move from the first location on the Media to the location that is furthest with respect to time. For a DiskDrive, this represents full seek + full rotational delay. For TapeDrives, this represents a search from the beginning of the tape to the most physically distant point. (The end of a tape may be at its most physically distant point, but this is not necessarily true.)
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxAccessTime(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXACCESSTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxAccessTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXACCESSTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxAccessTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxAccessTime(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXACCESSTIME.NAME);
        if (property != null) {
            property = setPropertyValue_MaxAccessTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXACCESSTIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxAccessTime
     * <br>
     * Time in milliseconds to move from the first location on the Media to the location that is furthest with respect to time. For a DiskDrive, this represents full seek + full rotational delay. For TapeDrives, this represents a search from the beginning of the tape to the most physically distant point. (The end of a tape may be at its most physically distant point, but this is not necessarily true.)
     */

    private static CIMProperty setPropertyValue_MaxAccessTime(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxBlockSize
     *     * <br>
     * Maximum block size, in bytes, for media accessed by this Device.
     *     */

    public javax.cim.UnsignedInteger64 get_MaxBlockSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXBLOCKSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXBLOCKSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MaxBlockSize
     * <br>
     * Maximum block size, in bytes, for media accessed by this Device.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxBlockSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXBLOCKSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxBlockSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXBLOCKSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxBlockSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxBlockSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXBLOCKSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_MaxBlockSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXBLOCKSIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxBlockSize
     * <br>
     * Maximum block size, in bytes, for media accessed by this Device.
     */

    private static CIMProperty setPropertyValue_MaxBlockSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxMediaSize
     *     * <br>
     * Maximum size, in KBytes, of media supported by this Device. KBytes is interpreted as the number of bytes multiplied by 1000 (NOT the number of bytes multiplied by 1024).
     *     */

    public javax.cim.UnsignedInteger64 get_MaxMediaSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXMEDIASIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXMEDIASIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MaxMediaSize
     * <br>
     * Maximum size, in KBytes, of media supported by this Device. KBytes is interpreted as the number of bytes multiplied by 1000 (NOT the number of bytes multiplied by 1024).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxMediaSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXMEDIASIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxMediaSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXMEDIASIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxMediaSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxMediaSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXMEDIASIZE.NAME);
        if (property != null) {
            property = setPropertyValue_MaxMediaSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXMEDIASIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxMediaSize
     * <br>
     * Maximum size, in KBytes, of media supported by this Device. KBytes is interpreted as the number of bytes multiplied by 1000 (NOT the number of bytes multiplied by 1024).
     */

    private static CIMProperty setPropertyValue_MaxMediaSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxUnitsBeforeCleaning
     *     * <br>
     * An unsigned integer indicating the maximum 'units' that can be used, with respect to the AccessDevice, before the Device should be cleaned. The property, UnitsDescription, defines how 'units' should be interpreted.
     *     */

    public javax.cim.UnsignedInteger64 get_MaxUnitsBeforeCleaning() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXUNITSBEFORECLEANING.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXUNITSBEFORECLEANING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MaxUnitsBeforeCleaning
     * <br>
     * An unsigned integer indicating the maximum 'units' that can be used, with respect to the AccessDevice, before the Device should be cleaned. The property, UnitsDescription, defines how 'units' should be interpreted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxUnitsBeforeCleaning(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXUNITSBEFORECLEANING.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxUnitsBeforeCleaning(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXUNITSBEFORECLEANING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxUnitsBeforeCleaning by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxUnitsBeforeCleaning(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXUNITSBEFORECLEANING.NAME);
        if (property != null) {
            property = setPropertyValue_MaxUnitsBeforeCleaning(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXUNITSBEFORECLEANING.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxUnitsBeforeCleaning
     * <br>
     * An unsigned integer indicating the maximum 'units' that can be used, with respect to the AccessDevice, before the Device should be cleaned. The property, UnitsDescription, defines how 'units' should be interpreted.
     */

    private static CIMProperty setPropertyValue_MaxUnitsBeforeCleaning(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MediaIsLocked
     *     * <br>
     * True indicates that the media is locked in the Device and can not be ejected. For non-removeable Devices, this value should be true.
     *     */

    public Boolean get_MediaIsLocked() {
        CIMProperty currentProperty = getProperty(PROPERTY_MEDIAISLOCKED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MEDIAISLOCKED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property MediaIsLocked
     * <br>
     * True indicates that the media is locked in the Device and can not be ejected. For non-removeable Devices, this value should be true.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MediaIsLocked(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MEDIAISLOCKED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MediaIsLocked(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MEDIAISLOCKED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MediaIsLocked by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MediaIsLocked(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MEDIAISLOCKED.NAME);
        if (property != null) {
            property = setPropertyValue_MediaIsLocked(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MEDIAISLOCKED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MediaIsLocked
     * <br>
     * True indicates that the media is locked in the Device and can not be ejected. For non-removeable Devices, this value should be true.
     */

    private static CIMProperty setPropertyValue_MediaIsLocked(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MinBlockSize
     *     * <br>
     * Minimum block size, in bytes, for media accessed by this Device.
     *     */

    public javax.cim.UnsignedInteger64 get_MinBlockSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_MINBLOCKSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MINBLOCKSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MinBlockSize
     * <br>
     * Minimum block size, in bytes, for media accessed by this Device.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MinBlockSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MINBLOCKSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MinBlockSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MINBLOCKSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MinBlockSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MinBlockSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MINBLOCKSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_MinBlockSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MINBLOCKSIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MinBlockSize
     * <br>
     * Minimum block size, in bytes, for media accessed by this Device.
     */

    private static CIMProperty setPropertyValue_MinBlockSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MountCount
     *     * <br>
     * For a MediaAccessDevice that supports removable Media, the number of times that Media have been mounted for data transfer or to clean the Device. For Devices accessing nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
     *     */

    public javax.cim.UnsignedInteger64 get_MountCount() {
        CIMProperty currentProperty = getProperty(PROPERTY_MOUNTCOUNT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MOUNTCOUNT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MountCount
     * <br>
     * For a MediaAccessDevice that supports removable Media, the number of times that Media have been mounted for data transfer or to clean the Device. For Devices accessing nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MountCount(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MOUNTCOUNT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MountCount(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MOUNTCOUNT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MountCount by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MountCount(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MOUNTCOUNT.NAME);
        if (property != null) {
            property = setPropertyValue_MountCount(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MOUNTCOUNT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MountCount
     * <br>
     * For a MediaAccessDevice that supports removable Media, the number of times that Media have been mounted for data transfer or to clean the Device. For Devices accessing nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
     */

    private static CIMProperty setPropertyValue_MountCount(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NeedsCleaning
     *     * <br>
     * Boolean indicating that the MediaAccessDevice needs cleaning. Whether manual or automatic cleaning is possible is indicated in the Capabilities array property.
     *     */

    public Boolean get_NeedsCleaning() {
        CIMProperty currentProperty = getProperty(PROPERTY_NEEDSCLEANING.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NEEDSCLEANING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property NeedsCleaning
     * <br>
     * Boolean indicating that the MediaAccessDevice needs cleaning. Whether manual or automatic cleaning is possible is indicated in the Capabilities array property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NeedsCleaning(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NEEDSCLEANING.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NeedsCleaning(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NEEDSCLEANING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NeedsCleaning by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NeedsCleaning(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NEEDSCLEANING.NAME);
        if (property != null) {
            property = setPropertyValue_NeedsCleaning(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NEEDSCLEANING.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NeedsCleaning
     * <br>
     * Boolean indicating that the MediaAccessDevice needs cleaning. Whether manual or automatic cleaning is possible is indicated in the Capabilities array property.
     */

    private static CIMProperty setPropertyValue_NeedsCleaning(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NumberOfMediaSupported
     *     * <br>
     * When the MediaAccessDevice supports multiple individual Media, this property defines the maximum number which can be supported or inserted.
     *     */

    public javax.cim.UnsignedInteger32 get_NumberOfMediaSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFMEDIASUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NUMBEROFMEDIASUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property NumberOfMediaSupported
     * <br>
     * When the MediaAccessDevice supports multiple individual Media, this property defines the maximum number which can be supported or inserted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NumberOfMediaSupported(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFMEDIASUPPORTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NumberOfMediaSupported(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFMEDIASUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NumberOfMediaSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NumberOfMediaSupported(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NUMBEROFMEDIASUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_NumberOfMediaSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFMEDIASUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NumberOfMediaSupported
     * <br>
     * When the MediaAccessDevice supports multiple individual Media, this property defines the maximum number which can be supported or inserted.
     */

    private static CIMProperty setPropertyValue_NumberOfMediaSupported(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Security
     *     * <br>
     * An enumeration indicating the operational security defined for the MediaAccessDevice. For example, information that the Device is "Read Only" (value=4) or "Boot Bypass" (value=6) can be described using this property.
     *     */

    public javax.cim.UnsignedInteger16 get_Security() {
        CIMProperty currentProperty = getProperty(PROPERTY_SECURITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SECURITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Security
     * <br>
     * An enumeration indicating the operational security defined for the MediaAccessDevice. For example, information that the Device is "Read Only" (value=4) or "Boot Bypass" (value=6) can be described using this property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Security(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SECURITY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Security(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SECURITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Security by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Security(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SECURITY.NAME);
        if (property != null) {
            property = setPropertyValue_Security(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SECURITY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Security
     * <br>
     * An enumeration indicating the operational security defined for the MediaAccessDevice. For example, information that the Device is "Read Only" (value=4) or "Boot Bypass" (value=6) can be described using this property.
     */

    private static CIMProperty setPropertyValue_Security(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimeOfLastMount
     *     * <br>
     * For a MediaAccessDevice that supports removable Media, the most recent date and time that Media was mounted on the Device. For Devices accessing nonremovable Media, such as hard disks, this property has no meaning and is not applicable.
     *     */

    public javax.cim.CIMDateTime get_TimeOfLastMount() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOFLASTMOUNT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMEOFLASTMOUNT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property TimeOfLastMount
     * <br>
     * For a MediaAccessDevice that supports removable Media, the most recent date and time that Media was mounted on the Device. For Devices accessing nonremovable Media, such as hard disks, this property has no meaning and is not applicable.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimeOfLastMount(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOFLASTMOUNT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TimeOfLastMount(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOFLASTMOUNT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimeOfLastMount by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimeOfLastMount(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMEOFLASTMOUNT.NAME);
        if (property != null) {
            property = setPropertyValue_TimeOfLastMount(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOFLASTMOUNT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimeOfLastMount
     * <br>
     * For a MediaAccessDevice that supports removable Media, the most recent date and time that Media was mounted on the Device. For Devices accessing nonremovable Media, such as hard disks, this property has no meaning and is not applicable.
     */

    private static CIMProperty setPropertyValue_TimeOfLastMount(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TotalMountTime
     *     * <br>
     * For a MediaAccessDevice that supports removable Media, the total time (in seconds) that Media have been mounted for data transfer or to clean the Device. For Devices accessing nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
     *     */

    public javax.cim.UnsignedInteger64 get_TotalMountTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_TOTALMOUNTTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TOTALMOUNTTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property TotalMountTime
     * <br>
     * For a MediaAccessDevice that supports removable Media, the total time (in seconds) that Media have been mounted for data transfer or to clean the Device. For Devices accessing nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TotalMountTime(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TOTALMOUNTTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TotalMountTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TOTALMOUNTTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TotalMountTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TotalMountTime(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TOTALMOUNTTIME.NAME);
        if (property != null) {
            property = setPropertyValue_TotalMountTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TOTALMOUNTTIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TotalMountTime
     * <br>
     * For a MediaAccessDevice that supports removable Media, the total time (in seconds) that Media have been mounted for data transfer or to clean the Device. For Devices accessing nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
     */

    private static CIMProperty setPropertyValue_TotalMountTime(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UncompressedDataRate
     *     * <br>
     * The sustained data transfer rate in KB/sec that the Device can read from and write to a Media. This is a sustained, raw data rate. Maximum rates or rates assuming compression should not be reported in this property.
     *     */

    public javax.cim.UnsignedInteger32 get_UncompressedDataRate() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNCOMPRESSEDDATARATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNCOMPRESSEDDATARATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property UncompressedDataRate
     * <br>
     * The sustained data transfer rate in KB/sec that the Device can read from and write to a Media. This is a sustained, raw data rate. Maximum rates or rates assuming compression should not be reported in this property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UncompressedDataRate(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNCOMPRESSEDDATARATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UncompressedDataRate(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNCOMPRESSEDDATARATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UncompressedDataRate by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UncompressedDataRate(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNCOMPRESSEDDATARATE.NAME);
        if (property != null) {
            property = setPropertyValue_UncompressedDataRate(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNCOMPRESSEDDATARATE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UncompressedDataRate
     * <br>
     * The sustained data transfer rate in KB/sec that the Device can read from and write to a Media. This is a sustained, raw data rate. Maximum rates or rates assuming compression should not be reported in this property.
     */

    private static CIMProperty setPropertyValue_UncompressedDataRate(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UnitsDescription
     *     * <br>
     * Defines 'Units' relative to its use in the property, MaxUnitsBeforeCleaning. This describes the criteria used to determine when the MediaAccessDevice should be cleaned.
     *     */

    public String get_UnitsDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNITSDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNITSDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property UnitsDescription
     * <br>
     * Defines 'Units' relative to its use in the property, MaxUnitsBeforeCleaning. This describes the criteria used to determine when the MediaAccessDevice should be cleaned.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnitsDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNITSDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnitsDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNITSDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnitsDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnitsDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNITSDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_UnitsDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNITSDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnitsDescription
     * <br>
     * Defines 'Units' relative to its use in the property, MaxUnitsBeforeCleaning. This describes the criteria used to determine when the MediaAccessDevice should be cleaned.
     */

    private static CIMProperty setPropertyValue_UnitsDescription(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UnitsUsed
     *     * <br>
     * An unsigned integer indicating the currently used 'units' of the AccessDevice, helpful to describe when the Device may require cleaning. The property, UnitsDescription, defines how 'units' should be interpreted.
     *     */

    public javax.cim.UnsignedInteger64 get_UnitsUsed() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNITSUSED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNITSUSED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UnitsUsed
     * <br>
     * An unsigned integer indicating the currently used 'units' of the AccessDevice, helpful to describe when the Device may require cleaning. The property, UnitsDescription, defines how 'units' should be interpreted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnitsUsed(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNITSUSED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnitsUsed(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNITSUSED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnitsUsed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnitsUsed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNITSUSED.NAME);
        if (property != null) {
            property = setPropertyValue_UnitsUsed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNITSUSED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnitsUsed
     * <br>
     * An unsigned integer indicating the currently used 'units' of the AccessDevice, helpful to describe when the Device may require cleaning. The property, UnitsDescription, defines how 'units' should be interpreted.
     */

    private static CIMProperty setPropertyValue_UnitsUsed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UnloadTime
     *     * <br>
     * Time in milliseconds from being able to read or write a Media to its 'unload'. For example, for DiskDrives, this is the interval between a disk spinning at nominal speeds and a disk not spinning. For TapeDrives, this is the time for a Media to go from its BOT to being fully ejected and accessible to a PickerElement or human operator.
     *     */

    public javax.cim.UnsignedInteger64 get_UnloadTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNLOADTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNLOADTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UnloadTime
     * <br>
     * Time in milliseconds from being able to read or write a Media to its 'unload'. For example, for DiskDrives, this is the interval between a disk spinning at nominal speeds and a disk not spinning. For TapeDrives, this is the time for a Media to go from its BOT to being fully ejected and accessible to a PickerElement or human operator.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnloadTime(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNLOADTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnloadTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNLOADTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnloadTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnloadTime(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessDevice fco = new CIM_MediaAccessDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNLOADTIME.NAME);
        if (property != null) {
            property = setPropertyValue_UnloadTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNLOADTIME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnloadTime
     * <br>
     * Time in milliseconds from being able to read or write a Media to its 'unload'. For example, for DiskDrives, this is the interval between a disk spinning at nominal speeds and a disk not spinning. For TapeDrives, this is the time for a Media to go from its BOT to being fully ejected and accessible to a PickerElement or human operator.
     */

    private static CIMProperty setPropertyValue_UnloadTime(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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
     * Get the list with CIM_StorageExtent objects associated by the association CIM_MediaPresent
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_StorageExtent_CIM_MediaPresents(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_StorageExtent_CIM_MediaPresents(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT, CIM_StorageExtent.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_StorageExtent objects associated by the association CIM_MediaPresent
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_StorageExtent_CIM_MediaPresents(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_StorageExtent_CIM_MediaPresents(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_StorageExtent objects associated by the association CIM_MediaPresent
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_StorageExtent_CIM_MediaPresents(WBEMClient cimClient,
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
                CIM_MediaAccessDeviceHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_MediaAccessDeviceHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_MediaAccessDeviceHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_StorageExtent(cimInstance));
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
                        result.add(new CIM_StorageExtent(cimInstance));
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
                        result.add(new CIM_StorageExtent(cimInstance));
                        continue;
                    }
                }
            }
            CIM_MediaAccessDeviceHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_MediaPresent
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_StorageExtent_CIM_MediaPresentNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_StorageExtent_CIM_MediaPresentNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT, CIM_StorageExtent.CIM_CLASS_NAME, null,
                null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_MediaPresent
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_StorageExtent_CIM_MediaPresentNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_StorageExtent_CIM_MediaPresentNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_MediaPresent
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_StorageExtent_CIM_MediaPresentNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT,
                    CIM_StorageExtent.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_MediaAccessDeviceHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_MediaAccessDeviceHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_StorageExtent.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_MediaAccessDeviceHelper.checkException(enumeration);
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
     * Get the list with CIM_MediaPresent associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_MediaPresent(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_MediaAccessDeviceHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_MediaAccessDeviceHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_MediaPresentHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_MediaPresent(cimInstance));
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
                        result.add(new CIM_MediaPresent(cimInstance));
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
                        result.add(new CIM_MediaPresent(cimInstance));
                        continue;
                    }
                }
            }
            CIM_MediaAccessDeviceHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_MediaPresent
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_MediaPresent(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_MEDIAPRESENT, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_MediaAccessDeviceHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_MediaAccessDeviceHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_MediaPresent.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_MediaAccessDeviceHelper.checkException(enumeration);
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

    /**
     * Invokes the Method LockMedia
     * <br>
     * @param client the cimclient
     * Method to lock and unlock the media in a removeable Access Device. The method takes one parameter as input - a boolean indicating whether to lock or unlock. TRUE indicates that the media should be locked in the Device, FALSE indicates that the media should be unlocked. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. The set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier on the method.
     *   @param Lock If TRUE, lock the media. If FALSE release the media.
     *
     */

    public LockMediaResult invoke_LockMedia(WBEMClient cimClient, Boolean Lock)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[1];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("Lock", CIMDataType.BOOLEAN_T, Lock);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(), METHOD_LOCKMEDIA.NAME,
                    inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_LOCKMEDIA.NAME, inParameter, outParameter));
        }

        LockMediaResult result = new LockMediaResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        return result;
    }

    /**
     * Result object for the method LockMedia
     */
    public static class LockMediaResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        LockMediaResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

    }

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_MediaAccessDevice.CIM_CLASS_NAME;
    }

}