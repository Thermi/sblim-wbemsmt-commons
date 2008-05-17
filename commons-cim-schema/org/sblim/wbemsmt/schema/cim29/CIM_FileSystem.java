/** 
 * CIM_FileSystem.java
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
 * Description: A file or dataset store local to a System (such as a ComputerSystem or an ApplicationSystem) or remotely mounted from a file server.
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

public class CIM_FileSystem extends CIM_EnabledLogicalElement {

    public final static String CIM_CLASS_NAME = "CIM_FileSystem";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * An association between a FileSystem and a Directory which indicates that the Directory is being attached to the FileSystem. The semantics of this relationship require that the mounted Directory be contained by a FileSystem (via the FileStorage association) that is different from the FileSystem referenced as the Dependent. The Directory's containing FileSystem could be either local or remote. For example, a LocalFileSystem on a Solaris ComputerSystem can mount a Directory from the FileSystem accessed via the machine's CDROM drive, i.e., another LocalFile System. On the other hand, in a 'remote' case, the Directory is first exported by its FileSystem, which is hosted on another ComputerSystem acting (for example) as a file server. In order to distinguish these two types of Mount, it is recommended that a CIM_Export association always be defined for the remotely accessed/mounted Directories.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT = "CIM_Mount";

    /**
     * A link between the System (such as a Computer or Application System) and the FileSystem that is a part of it.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM = "CIM_HostedFileSystem";

    /**
     * A link between the FileSystem and the LogicalFile(s) addressed through this FileSystem.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE = "CIM_FileStorage";

    /**
     * A link between the OperatingSystem and the FileSystem(s) from which this OperatingSystem is loaded. The association is many- to-many since a Distributed OS could depend on several File Systems in order to correctly and completely load.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS = "CIM_BootOSFromFS";

    /**
     * Constants of property AvailableSpace
     * AvailableSpace indicates the total amount of free space for the FileSystem, in bytes. If unknown, enter 0.
     */
    public static class PROPERTY_AVAILABLESPACE {
        /**
         * name of the property AvailableSpace
         */
        public final static String NAME = "AvailableSpace";

    }

    /**
     * Constants of property BlockSize
     * FileSystems can read/write data in blocks which are defined independently of the underlying StorageExtents. This property captures the FileSystem's block size for data storage and retrieval.
     */
    public static class PROPERTY_BLOCKSIZE {
        /**
         * name of the property BlockSize
         */
        public final static String NAME = "BlockSize";

    }

    /**
     * Constants of property CSCreationClassName
     * The scoping System's CreationClassName. Note that this class was originally defined in the scope of a ComputerSystem, and was later allowed to be scoped by any System (for example, a computer or application system). Unfortunately, the property name, CSCreationClassName, could not be changed (for example, to SystemCreationClass Name) without deprecating the class. This change was not deemed critical to the semantics and therefore did not merit deprecation. So, the property name remains.
     */
    public static class PROPERTY_CSCREATIONCLASSNAME {
        /**
         * name of the property CSCreationClassName
         */
        public final static String NAME = "CSCreationClassName";

    }

    /**
     * Constants of property CSName
     * The scoping System's Name. Note that this class was originally defined in the scope of a ComputerSystem, and was later allowed to be scoped by any System (for example, a computer or application system). Unfortunately, the property name, CSName, could not be changed (for example, to SystemName) without deprecating the class. This change was not deemed critical to the semantics and therefore did not merit deprecation. So, the property name remains.
     */
    public static class PROPERTY_CSNAME {
        /**
         * name of the property CSName
         */
        public final static String NAME = "CSName";

    }

    /**
     * Constants of property CasePreserved
     * Indicates that the case of file names are preserved.
     */
    public static class PROPERTY_CASEPRESERVED {
        /**
         * name of the property CasePreserved
         */
        public final static String NAME = "CasePreserved";

    }

    /**
     * Constants of property CaseSensitive
     * Indicates that case sensitive file names are supported.
     */
    public static class PROPERTY_CASESENSITIVE {
        /**
         * name of the property CaseSensitive
         */
        public final static String NAME = "CaseSensitive";

    }

    /**
     * Constants of property ClusterSize
     * The minimum file allocation size (an integral number of blocks), imposed by the FileSystem. (The size of a block is specified in the BlockSize property for the FileSystem.) Minimum allocation size is the smallest amount of storage allocated to a LogicalFile by the FileSystem. This is not a mandatory minimum allocation for all FileSystems. Under stress conditions, some FileSystems may allocate storage in amounts smaller than the ClusterSize.
     */
    public static class PROPERTY_CLUSTERSIZE {
        /**
         * name of the property ClusterSize
         */
        public final static String NAME = "ClusterSize";

    }

    /**
     * Constants of property CodeSet
     * Array defining the character sets or encoding supported by the FileSystem. For example, the values, "ASCII" (2) or "ISO2022" (4), may be specified.
     */
    public static class PROPERTY_CODESET {
        /**
         * name of the property CodeSet
         */
        public final static String NAME = "CodeSet";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ASCII = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry ASCII (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_ASCII = "ASCII";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Unicode = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Unicode (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Unicode = "Unicode";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISO2022 = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry ISO2022 (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_ISO2022 = "ISO2022";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ISO8859 = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry ISO8859 (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_ISO8859 = "ISO8859";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Extended_UNIX_Code = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Extended UNIX Code (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Extended_UNIX_Code = "Extended UNIX Code";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_UTF_8 = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry UTF-8 (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_UTF_8 = "UTF-8";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_UCS_2 = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry UCS-2 (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_UCS_2 = "UCS-2";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@16361636
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_ASCII.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ASCII;
            }

            if (VALUE_ENTRY_Unicode.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Unicode;
            }

            if (VALUE_ENTRY_ISO2022.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISO2022;
            }

            if (VALUE_ENTRY_ISO8859.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ISO8859;
            }

            if (VALUE_ENTRY_Extended_UNIX_Code.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Extended_UNIX_Code;
            }

            if (VALUE_ENTRY_UTF_8.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_UTF_8;
            }

            if (VALUE_ENTRY_UCS_2.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_UCS_2;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ASCII.intValue()) {
                return VALUE_ENTRY_ASCII;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Unicode.intValue()) {
                return VALUE_ENTRY_Unicode;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISO2022.intValue()) {
                return VALUE_ENTRY_ISO2022;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ISO8859.intValue()) {
                return VALUE_ENTRY_ISO8859;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Extended_UNIX_Code.intValue()) {
                return VALUE_ENTRY_Extended_UNIX_Code;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_UTF_8.intValue()) {
                return VALUE_ENTRY_UTF_8;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_UCS_2.intValue()) {
                return VALUE_ENTRY_UCS_2;
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
         * Value Map for the property CodeSet   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ASCII, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Unicode,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISO2022,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_ISO8859,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Extended_UNIX_Code,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_UTF_8, VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_UCS_2 };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property CodeSet   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_ASCII, VALUE_ENTRY_Unicode, VALUE_ENTRY_ISO2022, VALUE_ENTRY_ISO8859,
                VALUE_ENTRY_Extended_UNIX_Code, VALUE_ENTRY_UTF_8, VALUE_ENTRY_UCS_2 };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property CodeSet   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_ASCII, VALUE_ENTRY_Unicode, VALUE_ENTRY_ISO2022,
                VALUE_ENTRY_ISO8859, VALUE_ENTRY_Extended_UNIX_Code, VALUE_ENTRY_UTF_8,
                VALUE_ENTRY_UCS_2 };

    }

    /**
     * Constants of property CompressionMethod
     * A free form string indicating the algorithm or tool used to compress the FileSystem. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the FileSystem is compressed or not, "Compressed" to represent that the File System is compressed but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the FileSystem is not compressed.
     */
    public static class PROPERTY_COMPRESSIONMETHOD {
        /**
         * name of the property CompressionMethod
         */
        public final static String NAME = "CompressionMethod";

    }

    /**
     * Constants of property CreationClassName
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     */
    public static class PROPERTY_CREATIONCLASSNAME {
        /**
         * name of the property CreationClassName
         */
        public final static String NAME = "CreationClassName";

    }

    /**
     * Constants of property EncryptionMethod
     * A free form string indicating the algorithm or tool used to encrypt the FileSystem. If it is not possible or not desired to describe the encryption scheme (perhaps for security reasons), recommend using the following words: "Unknown" to represent that it is not known whether the FileSystem is encrypted or not, "Encrypted" to represent that the File System is encrypted but either its encryption scheme is not known or not disclosed, and "Not Encrypted" to represent that the FileSystem is not encrypted.
     */
    public static class PROPERTY_ENCRYPTIONMETHOD {
        /**
         * name of the property EncryptionMethod
         */
        public final static String NAME = "EncryptionMethod";

    }

    /**
     * Constants of property FileSystemSize
     * The FileSystemSize property stores the total size of the File System in bytes. If unknown, enter 0.
     */
    public static class PROPERTY_FILESYSTEMSIZE {
        /**
         * name of the property FileSystemSize
         */
        public final static String NAME = "FileSystemSize";

    }

    /**
     * Constants of property FileSystemType
     * String describing the type of FileSystem and therefore, its conventions. For example, "NTFS" or "S5" may be listed as well as any additional information on the FileSystem's implementation. Since various flavors of FileSystems (like S5) exist, this property is defined as a string.
     */
    public static class PROPERTY_FILESYSTEMTYPE {
        /**
         * name of the property FileSystemType
         */
        public final static String NAME = "FileSystemType";

    }

    /**
     * Constants of property MaxFileNameLength
     * Integer indicating the maximum length of a file name within the FileSystem. 0 indicates that there is no limit on file name length.
     */
    public static class PROPERTY_MAXFILENAMELENGTH {
        /**
         * name of the property MaxFileNameLength
         */
        public final static String NAME = "MaxFileNameLength";

    }

    /**
     * Constants of property Name
     * The inherited Name serves as key of a FileSystem instance within a ComputerSystem.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property NumberOfFiles
     * The number of files contained in the FileSystem.
     */
    public static class PROPERTY_NUMBEROFFILES {
        /**
         * name of the property NumberOfFiles
         */
        public final static String NAME = "NumberOfFiles";

    }

    /**
     * Constants of property OtherPersistenceType
     * A string describing the persistence characteristics when PersistenceType is "Other".
     */
    public static class PROPERTY_OTHERPERSISTENCETYPE {
        /**
         * name of the property OtherPersistenceType
         */
        public final static String NAME = "OtherPersistenceType";

    }

    /**
     * Constants of property PersistenceType
     * An enumerated value representing the FileSystem's perception of its own persistence characteristics. This property would typically be set at the time the FileSystem is instantiated and would not be changed by external actions. A value of "Persistent" indicates that the FileSystem is persistent, will be preserved through an orderly shutdown and should be protected. A value of "Temporary" indicates that the FileSystem is non-persistent, should not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem is controlled outside of the scope of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used. A value of "Unknown" indicates that the persistence of the FileSystem can not be determined.
     */
    public static class PROPERTY_PERSISTENCETYPE {
        /**
         * name of the property PersistenceType
         */
        public final static String NAME = "PersistenceType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Persistent = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Persistent (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Persistent = "Persistent";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Temporary = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Temporary (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Temporary = "Temporary";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_External = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry External (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_External = "External";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@68b268b2
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Persistent.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Persistent;
            }

            if (VALUE_ENTRY_Temporary.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Temporary;
            }

            if (VALUE_ENTRY_External.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_External;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Persistent.intValue()) {
                return VALUE_ENTRY_Persistent;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Temporary.intValue()) {
                return VALUE_ENTRY_Temporary;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_External.intValue()) {
                return VALUE_ENTRY_External;
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
         * Value Map for the property PersistenceType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Persistent,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Temporary,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_External };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PersistenceType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Persistent, VALUE_ENTRY_Temporary, VALUE_ENTRY_External };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PersistenceType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Persistent, VALUE_ENTRY_Temporary,
                VALUE_ENTRY_External };

    }

    /**
     * Constants of property ReadOnly
     * Indicates that the FileSystem is designated as read only.
     */
    public static class PROPERTY_READONLY {
        /**
         * name of the property ReadOnly
         */
        public final static String NAME = "ReadOnly";

    }

    /**
     * Constants of property Root
     * Path name or other information defining the root of the FileSystem.
     */
    public static class PROPERTY_ROOT {
        /**
         * name of the property Root
         */
        public final static String NAME = "Root";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_EnabledLogicalElement.getPackages();

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
     *   A file or dataset store local to a System (such as a ComputerSystem or an ApplicationSystem) or remotely mounted from a file server.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_FileSystem(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A file or dataset store local to a System (such as a ComputerSystem or an ApplicationSystem) or remotely mounted from a file server.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_FileSystem(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_FileSystem() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AvailableSpace", new CIMProperty("AvailableSpace",
                CIMDataType.UINT64_T, null));
        propertiesToCheck
                .put("BlockSize", new CIMProperty("BlockSize", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("CSCreationClassName", new CIMProperty("CSCreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("CSName", new CIMProperty("CSName", CIMDataType.STRING_T, null));
        propertiesToCheck.put("CasePreserved", new CIMProperty("CasePreserved",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("CaseSensitive", new CIMProperty("CaseSensitive",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("ClusterSize", new CIMProperty("ClusterSize", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("CodeSet", new CIMProperty("CodeSet", CIMDataType.UINT16_ARRAY_T,
                null));
        propertiesToCheck.put("CompressionMethod", new CIMProperty("CompressionMethod",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("CreationClassName", new CIMProperty("CreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("EncryptionMethod", new CIMProperty("EncryptionMethod",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("FileSystemSize", new CIMProperty("FileSystemSize",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("FileSystemType", new CIMProperty("FileSystemType",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("MaxFileNameLength", new CIMProperty("MaxFileNameLength",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("NumberOfFiles", new CIMProperty("NumberOfFiles",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("OtherPersistenceType", new CIMProperty("OtherPersistenceType",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("PersistenceType", new CIMProperty("PersistenceType",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ReadOnly", new CIMProperty("ReadOnly", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("Root", new CIMProperty("Root", CIMDataType.STRING_T, null));

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
     * Get the property AvailableSpace
     *     * <br>
     * AvailableSpace indicates the total amount of free space for the FileSystem, in bytes. If unknown, enter 0.
     *     */

    public javax.cim.UnsignedInteger64 get_AvailableSpace() {
        CIMProperty currentProperty = getProperty(PROPERTY_AVAILABLESPACE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_AVAILABLESPACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property AvailableSpace
     * <br>
     * AvailableSpace indicates the total amount of free space for the FileSystem, in bytes. If unknown, enter 0.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AvailableSpace(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_AVAILABLESPACE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AvailableSpace(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_AVAILABLESPACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AvailableSpace by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AvailableSpace(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AVAILABLESPACE.NAME);
        if (property != null) {
            property = setPropertyValue_AvailableSpace(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_AVAILABLESPACE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AvailableSpace
     * <br>
     * AvailableSpace indicates the total amount of free space for the FileSystem, in bytes. If unknown, enter 0.
     */

    private static CIMProperty setPropertyValue_AvailableSpace(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property BlockSize
     *     * <br>
     * FileSystems can read/write data in blocks which are defined independently of the underlying StorageExtents. This property captures the FileSystem's block size for data storage and retrieval.
     *     */

    public javax.cim.UnsignedInteger64 get_BlockSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_BLOCKSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BLOCKSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property BlockSize
     * <br>
     * FileSystems can read/write data in blocks which are defined independently of the underlying StorageExtents. This property captures the FileSystem's block size for data storage and retrieval.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BlockSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BLOCKSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BlockSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BLOCKSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BlockSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BlockSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BLOCKSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_BlockSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BLOCKSIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BlockSize
     * <br>
     * FileSystems can read/write data in blocks which are defined independently of the underlying StorageExtents. This property captures the FileSystem's block size for data storage and retrieval.
     */

    private static CIMProperty setPropertyValue_BlockSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CSCreationClassName
     *     * <br>
     * The scoping System's CreationClassName. Note that this class was originally defined in the scope of a ComputerSystem, and was later allowed to be scoped by any System (for example, a computer or application system). Unfortunately, the property name, CSCreationClassName, could not be changed (for example, to SystemCreationClass Name) without deprecating the class. This change was not deemed critical to the semantics and therefore did not merit deprecation. So, the property name remains.
     *     */

    public String get_key_CSCreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_CSCREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CSCreationClassName
     * <br>
     * The scoping System's CreationClassName. Note that this class was originally defined in the scope of a ComputerSystem, and was later allowed to be scoped by any System (for example, a computer or application system). Unfortunately, the property name, CSCreationClassName, could not be changed (for example, to SystemCreationClass Name) without deprecating the class. This change was not deemed critical to the semantics and therefore did not merit deprecation. So, the property name remains.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_CSCreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CSCREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_CSCreationClassName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CSCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_CSCreationClassName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CSCREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_CSCreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CSCreationClassName
     * <br>
     * The scoping System's CreationClassName. Note that this class was originally defined in the scope of a ComputerSystem, and was later allowed to be scoped by any System (for example, a computer or application system). Unfortunately, the property name, CSCreationClassName, could not be changed (for example, to SystemCreationClass Name) without deprecating the class. This change was not deemed critical to the semantics and therefore did not merit deprecation. So, the property name remains.
     */

    private static CIMProperty setPropertyValue_key_CSCreationClassName(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CSName
     *     * <br>
     * The scoping System's Name. Note that this class was originally defined in the scope of a ComputerSystem, and was later allowed to be scoped by any System (for example, a computer or application system). Unfortunately, the property name, CSName, could not be changed (for example, to SystemName) without deprecating the class. This change was not deemed critical to the semantics and therefore did not merit deprecation. So, the property name remains.
     *     */

    public String get_key_CSName() {
        CIMProperty currentProperty = getProperty(PROPERTY_CSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CSNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CSName
     * <br>
     * The scoping System's Name. Note that this class was originally defined in the scope of a ComputerSystem, and was later allowed to be scoped by any System (for example, a computer or application system). Unfortunately, the property name, CSName, could not be changed (for example, to SystemName) without deprecating the class. This change was not deemed critical to the semantics and therefore did not merit deprecation. So, the property name remains.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_CSName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_CSName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CSNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CSName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_CSName(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_CSName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CSNAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CSName
     * <br>
     * The scoping System's Name. Note that this class was originally defined in the scope of a ComputerSystem, and was later allowed to be scoped by any System (for example, a computer or application system). Unfortunately, the property name, CSName, could not be changed (for example, to SystemName) without deprecating the class. This change was not deemed critical to the semantics and therefore did not merit deprecation. So, the property name remains.
     */

    private static CIMProperty setPropertyValue_key_CSName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CasePreserved
     *     * <br>
     * Indicates that the case of file names are preserved.
     *     */

    public Boolean get_CasePreserved() {
        CIMProperty currentProperty = getProperty(PROPERTY_CASEPRESERVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CASEPRESERVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property CasePreserved
     * <br>
     * Indicates that the case of file names are preserved.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CasePreserved(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CASEPRESERVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CasePreserved(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CASEPRESERVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CasePreserved by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CasePreserved(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CASEPRESERVED.NAME);
        if (property != null) {
            property = setPropertyValue_CasePreserved(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CASEPRESERVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CasePreserved
     * <br>
     * Indicates that the case of file names are preserved.
     */

    private static CIMProperty setPropertyValue_CasePreserved(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CaseSensitive
     *     * <br>
     * Indicates that case sensitive file names are supported.
     *     */

    public Boolean get_CaseSensitive() {
        CIMProperty currentProperty = getProperty(PROPERTY_CASESENSITIVE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CASESENSITIVE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property CaseSensitive
     * <br>
     * Indicates that case sensitive file names are supported.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CaseSensitive(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CASESENSITIVE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CaseSensitive(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CASESENSITIVE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CaseSensitive by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CaseSensitive(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CASESENSITIVE.NAME);
        if (property != null) {
            property = setPropertyValue_CaseSensitive(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CASESENSITIVE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CaseSensitive
     * <br>
     * Indicates that case sensitive file names are supported.
     */

    private static CIMProperty setPropertyValue_CaseSensitive(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ClusterSize
     *     * <br>
     * The minimum file allocation size (an integral number of blocks), imposed by the FileSystem. (The size of a block is specified in the BlockSize property for the FileSystem.) Minimum allocation size is the smallest amount of storage allocated to a LogicalFile by the FileSystem. This is not a mandatory minimum allocation for all FileSystems. Under stress conditions, some FileSystems may allocate storage in amounts smaller than the ClusterSize.
     *     */

    public javax.cim.UnsignedInteger32 get_ClusterSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLUSTERSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLUSTERSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property ClusterSize
     * <br>
     * The minimum file allocation size (an integral number of blocks), imposed by the FileSystem. (The size of a block is specified in the BlockSize property for the FileSystem.) Minimum allocation size is the smallest amount of storage allocated to a LogicalFile by the FileSystem. This is not a mandatory minimum allocation for all FileSystems. Under stress conditions, some FileSystems may allocate storage in amounts smaller than the ClusterSize.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ClusterSize(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLUSTERSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ClusterSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLUSTERSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ClusterSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ClusterSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLUSTERSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_ClusterSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLUSTERSIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ClusterSize
     * <br>
     * The minimum file allocation size (an integral number of blocks), imposed by the FileSystem. (The size of a block is specified in the BlockSize property for the FileSystem.) Minimum allocation size is the smallest amount of storage allocated to a LogicalFile by the FileSystem. This is not a mandatory minimum allocation for all FileSystems. Under stress conditions, some FileSystems may allocate storage in amounts smaller than the ClusterSize.
     */

    private static CIMProperty setPropertyValue_ClusterSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CodeSet
     *     * <br>
     * Array defining the character sets or encoding supported by the FileSystem. For example, the values, "ASCII" (2) or "ISO2022" (4), may be specified.
     *     */

    public javax.cim.UnsignedInteger16[] get_CodeSet() {
        CIMProperty currentProperty = getProperty(PROPERTY_CODESET.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CODESET.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property CodeSet
     * <br>
     * Array defining the character sets or encoding supported by the FileSystem. For example, the values, "ASCII" (2) or "ISO2022" (4), may be specified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CodeSet(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CODESET.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CodeSet(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CODESET.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CodeSet by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CodeSet(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CODESET.NAME);
        if (property != null) {
            property = setPropertyValue_CodeSet(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CODESET.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CodeSet
     * <br>
     * Array defining the character sets or encoding supported by the FileSystem. For example, the values, "ASCII" (2) or "ISO2022" (4), may be specified.
     */

    private static CIMProperty setPropertyValue_CodeSet(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
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
     * A free form string indicating the algorithm or tool used to compress the FileSystem. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the FileSystem is compressed or not, "Compressed" to represent that the File System is compressed but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the FileSystem is not compressed.
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
     * A free form string indicating the algorithm or tool used to compress the FileSystem. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the FileSystem is compressed or not, "Compressed" to represent that the File System is compressed but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the FileSystem is not compressed.
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
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
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
     * A free form string indicating the algorithm or tool used to compress the FileSystem. If it is not possible or not desired to describe the compression scheme (perhaps because it is not known), recommend using the following words: "Unknown" to represent that it is not known whether the FileSystem is compressed or not, "Compressed" to represent that the File System is compressed but either its compression scheme is not known or not disclosed, and "Not Compressed" to represent that the FileSystem is not compressed.
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
     * Get the property CreationClassName
     *     * <br>
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     *     */

    public String get_key_CreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_CREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CreationClassName
     * <br>
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_CreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_CreationClassName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_CreationClassName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_CreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CreationClassName
     * <br>
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     */

    private static CIMProperty setPropertyValue_key_CreationClassName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EncryptionMethod
     *     * <br>
     * A free form string indicating the algorithm or tool used to encrypt the FileSystem. If it is not possible or not desired to describe the encryption scheme (perhaps for security reasons), recommend using the following words: "Unknown" to represent that it is not known whether the FileSystem is encrypted or not, "Encrypted" to represent that the File System is encrypted but either its encryption scheme is not known or not disclosed, and "Not Encrypted" to represent that the FileSystem is not encrypted.
     *     */

    public String get_EncryptionMethod() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENCRYPTIONMETHOD.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENCRYPTIONMETHOD.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property EncryptionMethod
     * <br>
     * A free form string indicating the algorithm or tool used to encrypt the FileSystem. If it is not possible or not desired to describe the encryption scheme (perhaps for security reasons), recommend using the following words: "Unknown" to represent that it is not known whether the FileSystem is encrypted or not, "Encrypted" to represent that the File System is encrypted but either its encryption scheme is not known or not disclosed, and "Not Encrypted" to represent that the FileSystem is not encrypted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EncryptionMethod(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENCRYPTIONMETHOD.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EncryptionMethod(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENCRYPTIONMETHOD.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EncryptionMethod by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EncryptionMethod(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENCRYPTIONMETHOD.NAME);
        if (property != null) {
            property = setPropertyValue_EncryptionMethod(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENCRYPTIONMETHOD.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EncryptionMethod
     * <br>
     * A free form string indicating the algorithm or tool used to encrypt the FileSystem. If it is not possible or not desired to describe the encryption scheme (perhaps for security reasons), recommend using the following words: "Unknown" to represent that it is not known whether the FileSystem is encrypted or not, "Encrypted" to represent that the File System is encrypted but either its encryption scheme is not known or not disclosed, and "Not Encrypted" to represent that the FileSystem is not encrypted.
     */

    private static CIMProperty setPropertyValue_EncryptionMethod(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FileSystemSize
     *     * <br>
     * The FileSystemSize property stores the total size of the File System in bytes. If unknown, enter 0.
     *     */

    public javax.cim.UnsignedInteger64 get_FileSystemSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_FILESYSTEMSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FILESYSTEMSIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property FileSystemSize
     * <br>
     * The FileSystemSize property stores the total size of the File System in bytes. If unknown, enter 0.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FileSystemSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FILESYSTEMSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FileSystemSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FILESYSTEMSIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FileSystemSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FileSystemSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FILESYSTEMSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_FileSystemSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FILESYSTEMSIZE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FileSystemSize
     * <br>
     * The FileSystemSize property stores the total size of the File System in bytes. If unknown, enter 0.
     */

    private static CIMProperty setPropertyValue_FileSystemSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FileSystemType
     *     * <br>
     * String describing the type of FileSystem and therefore, its conventions. For example, "NTFS" or "S5" may be listed as well as any additional information on the FileSystem's implementation. Since various flavors of FileSystems (like S5) exist, this property is defined as a string.
     *     */

    public String get_FileSystemType() {
        CIMProperty currentProperty = getProperty(PROPERTY_FILESYSTEMTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FILESYSTEMTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property FileSystemType
     * <br>
     * String describing the type of FileSystem and therefore, its conventions. For example, "NTFS" or "S5" may be listed as well as any additional information on the FileSystem's implementation. Since various flavors of FileSystems (like S5) exist, this property is defined as a string.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FileSystemType(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FILESYSTEMTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FileSystemType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FILESYSTEMTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FileSystemType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FileSystemType(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FILESYSTEMTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_FileSystemType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FILESYSTEMTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FileSystemType
     * <br>
     * String describing the type of FileSystem and therefore, its conventions. For example, "NTFS" or "S5" may be listed as well as any additional information on the FileSystem's implementation. Since various flavors of FileSystems (like S5) exist, this property is defined as a string.
     */

    private static CIMProperty setPropertyValue_FileSystemType(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxFileNameLength
     *     * <br>
     * Integer indicating the maximum length of a file name within the FileSystem. 0 indicates that there is no limit on file name length.
     *     */

    public javax.cim.UnsignedInteger32 get_MaxFileNameLength() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXFILENAMELENGTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXFILENAMELENGTH.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property MaxFileNameLength
     * <br>
     * Integer indicating the maximum length of a file name within the FileSystem. 0 indicates that there is no limit on file name length.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxFileNameLength(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXFILENAMELENGTH.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxFileNameLength(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXFILENAMELENGTH.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxFileNameLength by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxFileNameLength(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXFILENAMELENGTH.NAME);
        if (property != null) {
            property = setPropertyValue_MaxFileNameLength(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXFILENAMELENGTH.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxFileNameLength
     * <br>
     * Integer indicating the maximum length of a file name within the FileSystem. 0 indicates that there is no limit on file name length.
     */

    private static CIMProperty setPropertyValue_MaxFileNameLength(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Name
     *     * <br>
     * The inherited Name serves as key of a FileSystem instance within a ComputerSystem.
     *     */

    public String get_key_Name() {
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
     * The inherited Name serves as key of a FileSystem instance within a ComputerSystem.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_Name(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_Name(currentProperty, newValue);
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

    public static CIMProperty create_key_Name(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_Name(property, newValue);
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
     * The inherited Name serves as key of a FileSystem instance within a ComputerSystem.
     */

    private static CIMProperty setPropertyValue_key_Name(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NumberOfFiles
     *     * <br>
     * The number of files contained in the FileSystem.
     *     */

    public javax.cim.UnsignedInteger64 get_NumberOfFiles() {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFFILES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NUMBEROFFILES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property NumberOfFiles
     * <br>
     * The number of files contained in the FileSystem.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NumberOfFiles(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFFILES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NumberOfFiles(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFFILES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NumberOfFiles by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NumberOfFiles(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NUMBEROFFILES.NAME);
        if (property != null) {
            property = setPropertyValue_NumberOfFiles(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFFILES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NumberOfFiles
     * <br>
     * The number of files contained in the FileSystem.
     */

    private static CIMProperty setPropertyValue_NumberOfFiles(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherPersistenceType
     *     * <br>
     * A string describing the persistence characteristics when PersistenceType is "Other".
     *     */

    public String get_OtherPersistenceType() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERPERSISTENCETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERPERSISTENCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherPersistenceType
     * <br>
     * A string describing the persistence characteristics when PersistenceType is "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherPersistenceType(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERPERSISTENCETYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherPersistenceType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERPERSISTENCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherPersistenceType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherPersistenceType(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERPERSISTENCETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherPersistenceType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERPERSISTENCETYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherPersistenceType
     * <br>
     * A string describing the persistence characteristics when PersistenceType is "Other".
     */

    private static CIMProperty setPropertyValue_OtherPersistenceType(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PersistenceType
     *     * <br>
     * An enumerated value representing the FileSystem's perception of its own persistence characteristics. This property would typically be set at the time the FileSystem is instantiated and would not be changed by external actions. A value of "Persistent" indicates that the FileSystem is persistent, will be preserved through an orderly shutdown and should be protected. A value of "Temporary" indicates that the FileSystem is non-persistent, should not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem is controlled outside of the scope of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used. A value of "Unknown" indicates that the persistence of the FileSystem can not be determined.
     *     */

    public javax.cim.UnsignedInteger16 get_PersistenceType() {
        CIMProperty currentProperty = getProperty(PROPERTY_PERSISTENCETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PERSISTENCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PersistenceType
     * <br>
     * An enumerated value representing the FileSystem's perception of its own persistence characteristics. This property would typically be set at the time the FileSystem is instantiated and would not be changed by external actions. A value of "Persistent" indicates that the FileSystem is persistent, will be preserved through an orderly shutdown and should be protected. A value of "Temporary" indicates that the FileSystem is non-persistent, should not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem is controlled outside of the scope of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used. A value of "Unknown" indicates that the persistence of the FileSystem can not be determined.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PersistenceType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PERSISTENCETYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PersistenceType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PERSISTENCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PersistenceType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PersistenceType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PERSISTENCETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_PersistenceType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PERSISTENCETYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PersistenceType
     * <br>
     * An enumerated value representing the FileSystem's perception of its own persistence characteristics. This property would typically be set at the time the FileSystem is instantiated and would not be changed by external actions. A value of "Persistent" indicates that the FileSystem is persistent, will be preserved through an orderly shutdown and should be protected. A value of "Temporary" indicates that the FileSystem is non-persistent, should not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem is controlled outside of the scope of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used. A value of "Unknown" indicates that the persistence of the FileSystem can not be determined.
     */

    private static CIMProperty setPropertyValue_PersistenceType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReadOnly
     *     * <br>
     * Indicates that the FileSystem is designated as read only.
     *     */

    public Boolean get_ReadOnly() {
        CIMProperty currentProperty = getProperty(PROPERTY_READONLY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_READONLY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property ReadOnly
     * <br>
     * Indicates that the FileSystem is designated as read only.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReadOnly(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_READONLY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReadOnly(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_READONLY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReadOnly by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReadOnly(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_READONLY.NAME);
        if (property != null) {
            property = setPropertyValue_ReadOnly(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_READONLY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReadOnly
     * <br>
     * Indicates that the FileSystem is designated as read only.
     */

    private static CIMProperty setPropertyValue_ReadOnly(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Root
     *     * <br>
     * Path name or other information defining the root of the FileSystem.
     *     */

    public String get_Root() {
        CIMProperty currentProperty = getProperty(PROPERTY_ROOT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ROOT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Root
     * <br>
     * Path name or other information defining the root of the FileSystem.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Root(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ROOT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Root(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ROOT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Root by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Root(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_FileSystem fco = new CIM_FileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ROOT.NAME);
        if (property != null) {
            property = setPropertyValue_Root(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ROOT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Root
     * <br>
     * Path name or other information defining the root of the FileSystem.
     */

    private static CIMProperty setPropertyValue_Root(CIMProperty currentProperty, String newValue) {
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
     * Get the list with CIM_Directory objects associated by the association CIM_Mount
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Directory_CIM_Mounts(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Directory_CIM_Mounts(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT, CIM_Directory.CIM_CLASS_NAME, null, null,
                false, false, null);

    }

    /**
     * Get the list with CIM_Directory objects associated by the association CIM_Mount
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Directory_CIM_Mounts(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Directory_CIM_Mounts(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT, resultClass, role, resultRole, false, false,
                null);

    }

    /**
     * Get the list with CIM_Directory objects associated by the association CIM_Mount
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Directory_CIM_Mounts(WBEMClient cimClient,
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
                CIM_FileSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_FileSystemHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Directory(cimInstance));
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
                        result.add(new CIM_Directory(cimInstance));
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
                        result.add(new CIM_Directory(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_Mount
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Directory_CIM_MountNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Directory_CIM_MountNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT, CIM_Directory.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_Mount
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Directory_CIM_MountNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Directory_CIM_MountNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_Mount
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Directory_CIM_MountNames(WBEMClient cimClient,
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT,
                    CIM_Directory.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FileSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Directory.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_Mount associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_Mount(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FileSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_MountHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Mount(cimInstance));
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
                        result.add(new CIM_Mount(cimInstance));
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
                        result.add(new CIM_Mount(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_Mount
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_Mount(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_MOUNT, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FileSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Mount.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_System objects associated by the association CIM_HostedFileSystem
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_System_CIM_HostedFileSystems(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_System_CIM_HostedFileSystems(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM, CIM_System.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_System objects associated by the association CIM_HostedFileSystem
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_System_CIM_HostedFileSystems(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_System_CIM_HostedFileSystems(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_System objects associated by the association CIM_HostedFileSystem
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_System_CIM_HostedFileSystems(WBEMClient cimClient,
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
                CIM_FileSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_FileSystemHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_System(cimInstance));
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
                        result.add(new CIM_System(cimInstance));
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
                        result.add(new CIM_System(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_HostedFileSystem
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_System_CIM_HostedFileSystemNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_System_CIM_HostedFileSystemNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM, CIM_System.CIM_CLASS_NAME, null,
                null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_HostedFileSystem
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_System_CIM_HostedFileSystemNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_System_CIM_HostedFileSystemNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_HostedFileSystem
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_System_CIM_HostedFileSystemNames(WBEMClient cimClient,
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM,
                    CIM_System.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FileSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_System.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_HostedFileSystem associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_HostedFileSystem(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FileSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_HostedFileSystemHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_HostedFileSystem(cimInstance));
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
                        result.add(new CIM_HostedFileSystem(cimInstance));
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
                        result.add(new CIM_HostedFileSystem(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_HostedFileSystem
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_HostedFileSystem(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDFILESYSTEM, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FileSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_HostedFileSystem.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_LogicalFile objects associated by the association CIM_FileStorage
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalFile_CIM_FileStorages(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalFile_CIM_FileStorages(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE, CIM_LogicalFile.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_LogicalFile objects associated by the association CIM_FileStorage
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalFile_CIM_FileStorages(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_LogicalFile_CIM_FileStorages(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_LogicalFile objects associated by the association CIM_FileStorage
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalFile_CIM_FileStorages(WBEMClient cimClient,
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
                CIM_FileSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_FileSystemHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_LogicalFile(cimInstance));
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
                        result.add(new CIM_LogicalFile(cimInstance));
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
                        result.add(new CIM_LogicalFile(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FileStorage
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalFile_CIM_FileStorageNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalFile_CIM_FileStorageNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE, CIM_LogicalFile.CIM_CLASS_NAME, null,
                null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FileStorage
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalFile_CIM_FileStorageNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_LogicalFile_CIM_FileStorageNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FileStorage
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalFile_CIM_FileStorageNames(WBEMClient cimClient,
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE,
                    CIM_LogicalFile.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FileSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_LogicalFile.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_FileStorage associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_FileStorage(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FileSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_FileStorageHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_FileStorage(cimInstance));
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
                        result.add(new CIM_FileStorage(cimInstance));
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
                        result.add(new CIM_FileStorage(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_FileStorage
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_FileStorage(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_FILESTORAGE, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FileSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_FileStorage.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_OperatingSystem objects associated by the association CIM_BootOSFromFS
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_OperatingSystem_CIM_BootOSFromFSs(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_OperatingSystem_CIM_BootOSFromFSs(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS, CIM_OperatingSystem.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_OperatingSystem objects associated by the association CIM_BootOSFromFS
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_OperatingSystem_CIM_BootOSFromFSs(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_OperatingSystem_CIM_BootOSFromFSs(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_OperatingSystem objects associated by the association CIM_BootOSFromFS
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_OperatingSystem_CIM_BootOSFromFSs(WBEMClient cimClient,
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
                CIM_FileSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_FileSystemHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_OperatingSystem(cimInstance));
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
                        result.add(new CIM_OperatingSystem(cimInstance));
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
                        result.add(new CIM_OperatingSystem(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BootOSFromFS
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_OperatingSystem_CIM_BootOSFromFSNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_OperatingSystem_CIM_BootOSFromFSNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS, CIM_OperatingSystem.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BootOSFromFS
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_OperatingSystem_CIM_BootOSFromFSNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_OperatingSystem_CIM_BootOSFromFSNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BootOSFromFS
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_OperatingSystem_CIM_BootOSFromFSNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS,
                    CIM_OperatingSystem.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FileSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_OperatingSystem.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_BootOSFromFS associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_BootOSFromFS(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FileSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_BootOSFromFSHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_BootOSFromFS(cimInstance));
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
                        result.add(new CIM_BootOSFromFS(cimInstance));
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
                        result.add(new CIM_BootOSFromFS(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_BootOSFromFS
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_BootOSFromFS(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_BOOTOSFROMFS, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FileSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FileSystemHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_BootOSFromFS.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FileSystemHelper.checkException(enumeration);
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
        return CIM_FileSystem.CIM_CLASS_NAME;
    }

}