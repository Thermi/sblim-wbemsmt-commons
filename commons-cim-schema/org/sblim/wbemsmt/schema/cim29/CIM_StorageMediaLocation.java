/** 
 * CIM_StorageMediaLocation.java
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
 * Description: StorageMediaLocation is a PackageLocation where PhysicalMedia may be placed. This class is typically used in the context of a StorageLibrary. Examples of StorageMediaLocations are Media AccessDevices, InterLibraryPorts or 'slots' in a Library's panel.
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

public class CIM_StorageMediaLocation extends CIM_PackageLocation {

    public final static String CIM_CLASS_NAME = "CIM_StorageMediaLocation";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Within a StorageLibrary, all Media should be accounted for, and be present in some Storage Location. This relationship is made explicit by the PhysicalMediaInLocation association. In addition, one can determine if a Location is empty or full based on whether this association exists for the StorageMediaLocation.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION = "CIM_PhysicalMediaInLocation";

    /**
     * In a StorageLibrary or repository for PhysicalMedia, it is reasonable that a specific Media always be placed in a specific Location (rather than anywhere in the repository/ Library). The default location for a PhysicalMedia is called its 'home'. This information is expressed by the HomeForMedia dependency association. (Note that a PhysicalMedia can have at most one 'home', and a StorageMediaLocation can be 'home' to at most one Media.)
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA = "CIM_HomeForMedia";

    /**
     * Constants of property LocationType
     * The type of Location. For example, whether this is an individual Media "Slot" (value=2), a MediaAccessDevice (value=4) or a "Magazine" (value=3) is indicated in this property.
     */
    public static class PROPERTY_LOCATIONTYPE {
        /**
         * name of the property LocationType
         */
        public final static String NAME = "LocationType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Slot = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Slot (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Slot = "Slot";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Magazine = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Magazine (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Magazine = "Magazine";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_MediaAccessDevice = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry MediaAccessDevice (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_MediaAccessDevice = "MediaAccessDevice";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_InterLibrary_Port = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry InterLibrary Port (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_InterLibrary_Port = "InterLibrary Port";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Limited_Access_Port = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Limited Access Port (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Limited_Access_Port = "Limited Access Port";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Door = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Door (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Door = "Door";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Shelf = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Shelf (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Shelf = "Shelf";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Vault = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Vault (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Vault = "Vault";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@17da17da
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Slot.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Slot;
            }

            if (VALUE_ENTRY_Magazine.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Magazine;
            }

            if (VALUE_ENTRY_MediaAccessDevice.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_MediaAccessDevice;
            }

            if (VALUE_ENTRY_InterLibrary_Port.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_InterLibrary_Port;
            }

            if (VALUE_ENTRY_Limited_Access_Port.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Limited_Access_Port;
            }

            if (VALUE_ENTRY_Door.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Door;
            }

            if (VALUE_ENTRY_Shelf.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Shelf;
            }

            if (VALUE_ENTRY_Vault.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Vault;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Slot.intValue()) {
                return VALUE_ENTRY_Slot;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Magazine.intValue()) {
                return VALUE_ENTRY_Magazine;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_MediaAccessDevice.intValue()) {
                return VALUE_ENTRY_MediaAccessDevice;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_InterLibrary_Port.intValue()) {
                return VALUE_ENTRY_InterLibrary_Port;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Limited_Access_Port.intValue()) {
                return VALUE_ENTRY_Limited_Access_Port;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Door.intValue()) {
                return VALUE_ENTRY_Door;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Shelf.intValue()) {
                return VALUE_ENTRY_Shelf;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Vault.intValue()) {
                return VALUE_ENTRY_Vault;
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
         * Value Map for the property LocationType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Slot, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Magazine,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_MediaAccessDevice,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_InterLibrary_Port,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Limited_Access_Port,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Door, VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Shelf,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Vault };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property LocationType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Slot, VALUE_ENTRY_Magazine, VALUE_ENTRY_MediaAccessDevice,
                VALUE_ENTRY_InterLibrary_Port, VALUE_ENTRY_Limited_Access_Port, VALUE_ENTRY_Door,
                VALUE_ENTRY_Shelf, VALUE_ENTRY_Vault };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property LocationType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Slot, VALUE_ENTRY_Magazine,
                VALUE_ENTRY_MediaAccessDevice, VALUE_ENTRY_InterLibrary_Port,
                VALUE_ENTRY_Limited_Access_Port, VALUE_ENTRY_Door, VALUE_ENTRY_Shelf,
                VALUE_ENTRY_Vault };

    }

    /**
     * Constants of property MediaCapacity
     * A StorageMediaLocation may hold more than one PhysicalMedia - for example, a Magazine. This property indicates the Physical Media capacity of the Location.
     */
    public static class PROPERTY_MEDIACAPACITY {
        /**
         * name of the property MediaCapacity
         */
        public final static String NAME = "MediaCapacity";

    }

    /**
     * Constants of property MediaSizesSupported
     * The sizes (in inches) of the particular MediaTypes that may be placed in the Location. Note, each entry of this array is related to the entry in the MediaTypesSupported array that is located at the same index.
     */
    public static class PROPERTY_MEDIASIZESSUPPORTED {
        /**
         * name of the property MediaSizesSupported
         */
        public final static String NAME = "MediaSizesSupported";

    }

    /**
     * Constants of property MediaTypesSupported
     * Certain StorageMediaLocations may only be able to accept a limited set of PhysicalMedia MediaTypes. This property defines an array containing the types of Media that are acceptable for placement in the Location. Additional information and description of the contained MediaTypes can be provided using the TypesDescription array. Also, size data (for example, DVD disc diameter) can be specified using the MediaSizesSupported array. 
     * 
     * Values defined here correspond to those in the CIM_Physical Media.MediaType property. This allows quick comparisons using value equivalence calculations. It is understood that there is no external physical difference between (for example) DVD- Video and DVD-RAM. But, equivalent values in both the Physical Media and StorageMediaLocation enumerations allows for one for one comparisons with no additional processing logic (i.e., the following is not required ... if "DVD-Video" then value="DVD").
     */
    public static class PROPERTY_MEDIATYPESSUPPORTED {
        /**
         * name of the property MediaTypesSupported
         */
        public final static String NAME = "MediaTypesSupported";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Tape_Cartridge = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Tape Cartridge (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Tape_Cartridge = "Tape Cartridge";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_QIC_Cartridge = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry QIC Cartridge (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_QIC_Cartridge = "QIC Cartridge";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_AIT_Cartridge = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry AIT Cartridge (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_AIT_Cartridge = "AIT Cartridge";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DTF_Cartridge = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry DTF Cartridge (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_DTF_Cartridge = "DTF Cartridge";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DAT_Cartridge = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry DAT Cartridge (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_DAT_Cartridge = "DAT Cartridge";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_8mm_Tape_Cartridge = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry 8mm Tape Cartridge (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_8mm_Tape_Cartridge = "8mm Tape Cartridge";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_19mm_Tape_Cartridge = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry 19mm Tape Cartridge (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_19mm_Tape_Cartridge = "19mm Tape Cartridge";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_DLT_Cartridge = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry DLT Cartridge (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_DLT_Cartridge = "DLT Cartridge";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Half_Inch_Magnetic_Tape_Cartridge = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Half-Inch Magnetic Tape Cartridge (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Half_Inch_Magnetic_Tape_Cartridge = "Half-Inch Magnetic Tape Cartridge";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Cartridge_Disk = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Cartridge Disk (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Cartridge_Disk = "Cartridge Disk";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_JAZ_Disk = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry JAZ Disk (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_JAZ_Disk = "JAZ Disk";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_ZIP_Disk = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry ZIP Disk (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_ZIP_Disk = "ZIP Disk";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_SyQuest_Disk = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry SyQuest Disk (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_SyQuest_Disk = "SyQuest Disk";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Winchester_Removable_Disk = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Winchester Removable Disk (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Winchester_Removable_Disk = "Winchester Removable Disk";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_CD_ROM = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry CD-ROM (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_CD_ROM = "CD-ROM";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_CD_ROM_XA = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry CD-ROM/XA (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_CD_ROM_XA = "CD-ROM/XA";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_CD_I = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry CD-I (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_CD_I = "CD-I";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_CD_Recordable = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry CD Recordable (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_CD_Recordable = "CD Recordable";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_WORM = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry WORM (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_WORM = "WORM";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Magneto_Optical = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry Magneto-Optical (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_Magneto_Optical = "Magneto-Optical";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_DVD = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry DVD (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_DVD = "DVD";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DVD_RW_ = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry DVD-RW+ (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_DVD_RW_ = "DVD-RW+";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DVD_RAM = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry DVD-RAM (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_DVD_RAM = "DVD-RAM";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_DVD_ROM = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry DVD-ROM (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_DVD_ROM = "DVD-ROM";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_DVD_Video = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry DVD-Video (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_DVD_Video = "DVD-Video";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Divx = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry Divx (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_Divx = "Divx";

        /**
         * constant for value map entry 28
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Floppy_Diskette = new javax.cim.UnsignedInteger16(
                "28");

        /**
         * constant for value entry Floppy/Diskette (corresponds to mapEntry 28 )
         */
        public final static String VALUE_ENTRY_Floppy_Diskette = "Floppy/Diskette";

        /**
         * constant for value map entry 29
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Hard_Disk = new javax.cim.UnsignedInteger16(
                "29");

        /**
         * constant for value entry Hard Disk (corresponds to mapEntry 29 )
         */
        public final static String VALUE_ENTRY_Hard_Disk = "Hard Disk";

        /**
         * constant for value map entry 30
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Memory_Card = new javax.cim.UnsignedInteger16(
                "30");

        /**
         * constant for value entry Memory Card (corresponds to mapEntry 30 )
         */
        public final static String VALUE_ENTRY_Memory_Card = "Memory Card";

        /**
         * constant for value map entry 31
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_Hard_Copy = new javax.cim.UnsignedInteger16(
                "31");

        /**
         * constant for value entry Hard Copy (corresponds to mapEntry 31 )
         */
        public final static String VALUE_ENTRY_Hard_Copy = "Hard Copy";

        /**
         * constant for value map entry 32
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Clik_Disk = new javax.cim.UnsignedInteger16(
                "32");

        /**
         * constant for value entry Clik Disk (corresponds to mapEntry 32 )
         */
        public final static String VALUE_ENTRY_Clik_Disk = "Clik Disk";

        /**
         * constant for value map entry 33
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_CD_RW = new javax.cim.UnsignedInteger16(
                "33");

        /**
         * constant for value entry CD-RW (corresponds to mapEntry 33 )
         */
        public final static String VALUE_ENTRY_CD_RW = "CD-RW";

        /**
         * constant for value map entry 34
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_CD_DA = new javax.cim.UnsignedInteger16(
                "34");

        /**
         * constant for value entry CD-DA (corresponds to mapEntry 34 )
         */
        public final static String VALUE_ENTRY_CD_DA = "CD-DA";

        /**
         * constant for value map entry 35
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_CD_ = new javax.cim.UnsignedInteger16(
                "35");

        /**
         * constant for value entry CD+ (corresponds to mapEntry 35 )
         */
        public final static String VALUE_ENTRY_CD_ = "CD+";

        /**
         * constant for value map entry 36
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_DVD_Recordable = new javax.cim.UnsignedInteger16(
                "36");

        /**
         * constant for value entry DVD Recordable (corresponds to mapEntry 36 )
         */
        public final static String VALUE_ENTRY_DVD_Recordable = "DVD Recordable";

        /**
         * constant for value map entry 37
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_DVD_RW = new javax.cim.UnsignedInteger16(
                "37");

        /**
         * constant for value entry DVD-RW (corresponds to mapEntry 37 )
         */
        public final static String VALUE_ENTRY_DVD_RW = "DVD-RW";

        /**
         * constant for value map entry 38
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_DVD_Audio = new javax.cim.UnsignedInteger16(
                "38");

        /**
         * constant for value entry DVD-Audio (corresponds to mapEntry 38 )
         */
        public final static String VALUE_ENTRY_DVD_Audio = "DVD-Audio";

        /**
         * constant for value map entry 39
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_DVD_5 = new javax.cim.UnsignedInteger16(
                "39");

        /**
         * constant for value entry DVD-5 (corresponds to mapEntry 39 )
         */
        public final static String VALUE_ENTRY_DVD_5 = "DVD-5";

        /**
         * constant for value map entry 40
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_DVD_9 = new javax.cim.UnsignedInteger16(
                "40");

        /**
         * constant for value entry DVD-9 (corresponds to mapEntry 40 )
         */
        public final static String VALUE_ENTRY_DVD_9 = "DVD-9";

        /**
         * constant for value map entry 41
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_DVD_10 = new javax.cim.UnsignedInteger16(
                "41");

        /**
         * constant for value entry DVD-10 (corresponds to mapEntry 41 )
         */
        public final static String VALUE_ENTRY_DVD_10 = "DVD-10";

        /**
         * constant for value map entry 42
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_DVD_18 = new javax.cim.UnsignedInteger16(
                "42");

        /**
         * constant for value entry DVD-18 (corresponds to mapEntry 42 )
         */
        public final static String VALUE_ENTRY_DVD_18 = "DVD-18";

        /**
         * constant for value map entry 43
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Magneto_Optical_Rewriteable = new javax.cim.UnsignedInteger16(
                "43");

        /**
         * constant for value entry Magneto-Optical Rewriteable (corresponds to mapEntry 43 )
         */
        public final static String VALUE_ENTRY_Magneto_Optical_Rewriteable = "Magneto-Optical Rewriteable";

        /**
         * constant for value map entry 44
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Magneto_Optical_Write_Once = new javax.cim.UnsignedInteger16(
                "44");

        /**
         * constant for value entry Magneto-Optical Write Once (corresponds to mapEntry 44 )
         */
        public final static String VALUE_ENTRY_Magneto_Optical_Write_Once = "Magneto-Optical Write Once";

        /**
         * constant for value map entry 45
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_Magneto_Optical_Rewriteable__LIMDOW_ = new javax.cim.UnsignedInteger16(
                "45");

        /**
         * constant for value entry Magneto-Optical Rewriteable (LIMDOW) (corresponds to mapEntry 45 )
         */
        public final static String VALUE_ENTRY_Magneto_Optical_Rewriteable__LIMDOW_ = "Magneto-Optical Rewriteable (LIMDOW)";

        /**
         * constant for value map entry 46
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_Phase_Change_Write_Once = new javax.cim.UnsignedInteger16(
                "46");

        /**
         * constant for value entry Phase Change Write Once (corresponds to mapEntry 46 )
         */
        public final static String VALUE_ENTRY_Phase_Change_Write_Once = "Phase Change Write Once";

        /**
         * constant for value map entry 47
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Phase_Change_Rewriteable = new javax.cim.UnsignedInteger16(
                "47");

        /**
         * constant for value entry Phase Change Rewriteable (corresponds to mapEntry 47 )
         */
        public final static String VALUE_ENTRY_Phase_Change_Rewriteable = "Phase Change Rewriteable";

        /**
         * constant for value map entry 48
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Phase_Change_Dual_Rewriteable = new javax.cim.UnsignedInteger16(
                "48");

        /**
         * constant for value entry Phase Change Dual Rewriteable (corresponds to mapEntry 48 )
         */
        public final static String VALUE_ENTRY_Phase_Change_Dual_Rewriteable = "Phase Change Dual Rewriteable";

        /**
         * constant for value map entry 49
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Ablative_Write_Once = new javax.cim.UnsignedInteger16(
                "49");

        /**
         * constant for value entry Ablative Write Once (corresponds to mapEntry 49 )
         */
        public final static String VALUE_ENTRY_Ablative_Write_Once = "Ablative Write Once";

        /**
         * constant for value map entry 50
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Near_Field_Recording = new javax.cim.UnsignedInteger16(
                "50");

        /**
         * constant for value entry Near Field Recording (corresponds to mapEntry 50 )
         */
        public final static String VALUE_ENTRY_Near_Field_Recording = "Near Field Recording";

        /**
         * constant for value map entry 51
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_MiniQic = new javax.cim.UnsignedInteger16(
                "51");

        /**
         * constant for value entry MiniQic (corresponds to mapEntry 51 )
         */
        public final static String VALUE_ENTRY_MiniQic = "MiniQic";

        /**
         * constant for value map entry 52
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Travan = new javax.cim.UnsignedInteger16(
                "52");

        /**
         * constant for value entry Travan (corresponds to mapEntry 52 )
         */
        public final static String VALUE_ENTRY_Travan = "Travan";

        /**
         * constant for value map entry 53
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_8mm_Metal_Particle = new javax.cim.UnsignedInteger16(
                "53");

        /**
         * constant for value entry 8mm Metal Particle (corresponds to mapEntry 53 )
         */
        public final static String VALUE_ENTRY_8mm_Metal_Particle = "8mm Metal Particle";

        /**
         * constant for value map entry 54
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_8mm_Advanced_Metal_Evaporate = new javax.cim.UnsignedInteger16(
                "54");

        /**
         * constant for value entry 8mm Advanced Metal Evaporate (corresponds to mapEntry 54 )
         */
        public final static String VALUE_ENTRY_8mm_Advanced_Metal_Evaporate = "8mm Advanced Metal Evaporate";

        /**
         * constant for value map entry 55
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_NCTP = new javax.cim.UnsignedInteger16(
                "55");

        /**
         * constant for value entry NCTP (corresponds to mapEntry 55 )
         */
        public final static String VALUE_ENTRY_NCTP = "NCTP";

        /**
         * constant for value map entry 56
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_LTO_Ultrium = new javax.cim.UnsignedInteger16(
                "56");

        /**
         * constant for value entry LTO Ultrium (corresponds to mapEntry 56 )
         */
        public final static String VALUE_ENTRY_LTO_Ultrium = "LTO Ultrium";

        /**
         * constant for value map entry 57
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_LTO_Accelis = new javax.cim.UnsignedInteger16(
                "57");

        /**
         * constant for value entry LTO Accelis (corresponds to mapEntry 57 )
         */
        public final static String VALUE_ENTRY_LTO_Accelis = "LTO Accelis";

        /**
         * constant for value map entry 58
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_9_Track_Tape = new javax.cim.UnsignedInteger16(
                "58");

        /**
         * constant for value entry 9 Track Tape (corresponds to mapEntry 58 )
         */
        public final static String VALUE_ENTRY_9_Track_Tape = "9 Track Tape";

        /**
         * constant for value map entry 59
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_18_Track_Tape = new javax.cim.UnsignedInteger16(
                "59");

        /**
         * constant for value entry 18 Track Tape (corresponds to mapEntry 59 )
         */
        public final static String VALUE_ENTRY_18_Track_Tape = "18 Track Tape";

        /**
         * constant for value map entry 60
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_36_Track_Tape = new javax.cim.UnsignedInteger16(
                "60");

        /**
         * constant for value entry 36 Track Tape (corresponds to mapEntry 60 )
         */
        public final static String VALUE_ENTRY_36_Track_Tape = "36 Track Tape";

        /**
         * constant for value map entry 61
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Magstar_3590 = new javax.cim.UnsignedInteger16(
                "61");

        /**
         * constant for value entry Magstar 3590 (corresponds to mapEntry 61 )
         */
        public final static String VALUE_ENTRY_Magstar_3590 = "Magstar 3590";

        /**
         * constant for value map entry 62
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Magstar_MP = new javax.cim.UnsignedInteger16(
                "62");

        /**
         * constant for value entry Magstar MP (corresponds to mapEntry 62 )
         */
        public final static String VALUE_ENTRY_Magstar_MP = "Magstar MP";

        /**
         * constant for value map entry 63
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_D2_Tape = new javax.cim.UnsignedInteger16(
                "63");

        /**
         * constant for value entry D2 Tape (corresponds to mapEntry 63 )
         */
        public final static String VALUE_ENTRY_D2_Tape = "D2 Tape";

        /**
         * constant for value map entry 64
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Tape___DST_Small = new javax.cim.UnsignedInteger16(
                "64");

        /**
         * constant for value entry Tape - DST Small (corresponds to mapEntry 64 )
         */
        public final static String VALUE_ENTRY_Tape___DST_Small = "Tape - DST Small";

        /**
         * constant for value map entry 65
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Tape___DST_Medium = new javax.cim.UnsignedInteger16(
                "65");

        /**
         * constant for value entry Tape - DST Medium (corresponds to mapEntry 65 )
         */
        public final static String VALUE_ENTRY_Tape___DST_Medium = "Tape - DST Medium";

        /**
         * constant for value map entry 66
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Tape___DST_Large = new javax.cim.UnsignedInteger16(
                "66");

        /**
         * constant for value entry Tape - DST Large (corresponds to mapEntry 66 )
         */
        public final static String VALUE_ENTRY_Tape___DST_Large = "Tape - DST Large";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@56285628
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Tape_Cartridge.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Tape_Cartridge;
            }

            if (VALUE_ENTRY_QIC_Cartridge.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_QIC_Cartridge;
            }

            if (VALUE_ENTRY_AIT_Cartridge.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_AIT_Cartridge;
            }

            if (VALUE_ENTRY_DTF_Cartridge.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DTF_Cartridge;
            }

            if (VALUE_ENTRY_DAT_Cartridge.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DAT_Cartridge;
            }

            if (VALUE_ENTRY_8mm_Tape_Cartridge.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_8mm_Tape_Cartridge;
            }

            if (VALUE_ENTRY_19mm_Tape_Cartridge.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_19mm_Tape_Cartridge;
            }

            if (VALUE_ENTRY_DLT_Cartridge.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_DLT_Cartridge;
            }

            if (VALUE_ENTRY_Half_Inch_Magnetic_Tape_Cartridge.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Half_Inch_Magnetic_Tape_Cartridge;
            }

            if (VALUE_ENTRY_Cartridge_Disk.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Cartridge_Disk;
            }

            if (VALUE_ENTRY_JAZ_Disk.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_JAZ_Disk;
            }

            if (VALUE_ENTRY_ZIP_Disk.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_ZIP_Disk;
            }

            if (VALUE_ENTRY_SyQuest_Disk.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_SyQuest_Disk;
            }

            if (VALUE_ENTRY_Winchester_Removable_Disk.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Winchester_Removable_Disk;
            }

            if (VALUE_ENTRY_CD_ROM.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_CD_ROM;
            }

            if (VALUE_ENTRY_CD_ROM_XA.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_CD_ROM_XA;
            }

            if (VALUE_ENTRY_CD_I.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_CD_I;
            }

            if (VALUE_ENTRY_CD_Recordable.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_CD_Recordable;
            }

            if (VALUE_ENTRY_WORM.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_WORM;
            }

            if (VALUE_ENTRY_Magneto_Optical.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Magneto_Optical;
            }

            if (VALUE_ENTRY_DVD.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_DVD;
            }

            if (VALUE_ENTRY_DVD_RW_.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DVD_RW_;
            }

            if (VALUE_ENTRY_DVD_RAM.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DVD_RAM;
            }

            if (VALUE_ENTRY_DVD_ROM.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_DVD_ROM;
            }

            if (VALUE_ENTRY_DVD_Video.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_DVD_Video;
            }

            if (VALUE_ENTRY_Divx.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Divx;
            }

            if (VALUE_ENTRY_Floppy_Diskette.equals(value)) {
                return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Floppy_Diskette;
            }

            if (VALUE_ENTRY_Hard_Disk.equals(value)) {
                return VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Hard_Disk;
            }

            if (VALUE_ENTRY_Memory_Card.equals(value)) {
                return VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Memory_Card;
            }

            if (VALUE_ENTRY_Hard_Copy.equals(value)) {
                return VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_Hard_Copy;
            }

            if (VALUE_ENTRY_Clik_Disk.equals(value)) {
                return VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Clik_Disk;
            }

            if (VALUE_ENTRY_CD_RW.equals(value)) {
                return VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_CD_RW;
            }

            if (VALUE_ENTRY_CD_DA.equals(value)) {
                return VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_CD_DA;
            }

            if (VALUE_ENTRY_CD_.equals(value)) {
                return VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_CD_;
            }

            if (VALUE_ENTRY_DVD_Recordable.equals(value)) {
                return VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_DVD_Recordable;
            }

            if (VALUE_ENTRY_DVD_RW.equals(value)) {
                return VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_DVD_RW;
            }

            if (VALUE_ENTRY_DVD_Audio.equals(value)) {
                return VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_DVD_Audio;
            }

            if (VALUE_ENTRY_DVD_5.equals(value)) {
                return VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_DVD_5;
            }

            if (VALUE_ENTRY_DVD_9.equals(value)) {
                return VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_DVD_9;
            }

            if (VALUE_ENTRY_DVD_10.equals(value)) {
                return VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_DVD_10;
            }

            if (VALUE_ENTRY_DVD_18.equals(value)) {
                return VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_DVD_18;
            }

            if (VALUE_ENTRY_Magneto_Optical_Rewriteable.equals(value)) {
                return VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Magneto_Optical_Rewriteable;
            }

            if (VALUE_ENTRY_Magneto_Optical_Write_Once.equals(value)) {
                return VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Magneto_Optical_Write_Once;
            }

            if (VALUE_ENTRY_Magneto_Optical_Rewriteable__LIMDOW_.equals(value)) {
                return VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_Magneto_Optical_Rewriteable__LIMDOW_;
            }

            if (VALUE_ENTRY_Phase_Change_Write_Once.equals(value)) {
                return VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_Phase_Change_Write_Once;
            }

            if (VALUE_ENTRY_Phase_Change_Rewriteable.equals(value)) {
                return VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Phase_Change_Rewriteable;
            }

            if (VALUE_ENTRY_Phase_Change_Dual_Rewriteable.equals(value)) {
                return VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Phase_Change_Dual_Rewriteable;
            }

            if (VALUE_ENTRY_Ablative_Write_Once.equals(value)) {
                return VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Ablative_Write_Once;
            }

            if (VALUE_ENTRY_Near_Field_Recording.equals(value)) {
                return VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Near_Field_Recording;
            }

            if (VALUE_ENTRY_MiniQic.equals(value)) {
                return VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_MiniQic;
            }

            if (VALUE_ENTRY_Travan.equals(value)) {
                return VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Travan;
            }

            if (VALUE_ENTRY_8mm_Metal_Particle.equals(value)) {
                return VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_8mm_Metal_Particle;
            }

            if (VALUE_ENTRY_8mm_Advanced_Metal_Evaporate.equals(value)) {
                return VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_8mm_Advanced_Metal_Evaporate;
            }

            if (VALUE_ENTRY_NCTP.equals(value)) {
                return VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_NCTP;
            }

            if (VALUE_ENTRY_LTO_Ultrium.equals(value)) {
                return VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_LTO_Ultrium;
            }

            if (VALUE_ENTRY_LTO_Accelis.equals(value)) {
                return VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_LTO_Accelis;
            }

            if (VALUE_ENTRY_9_Track_Tape.equals(value)) {
                return VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_9_Track_Tape;
            }

            if (VALUE_ENTRY_18_Track_Tape.equals(value)) {
                return VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_18_Track_Tape;
            }

            if (VALUE_ENTRY_36_Track_Tape.equals(value)) {
                return VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_36_Track_Tape;
            }

            if (VALUE_ENTRY_Magstar_3590.equals(value)) {
                return VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Magstar_3590;
            }

            if (VALUE_ENTRY_Magstar_MP.equals(value)) {
                return VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Magstar_MP;
            }

            if (VALUE_ENTRY_D2_Tape.equals(value)) {
                return VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_D2_Tape;
            }

            if (VALUE_ENTRY_Tape___DST_Small.equals(value)) {
                return VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Tape___DST_Small;
            }

            if (VALUE_ENTRY_Tape___DST_Medium.equals(value)) {
                return VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Tape___DST_Medium;
            }

            if (VALUE_ENTRY_Tape___DST_Large.equals(value)) {
                return VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Tape___DST_Large;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Tape_Cartridge.intValue()) {
                return VALUE_ENTRY_Tape_Cartridge;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_QIC_Cartridge.intValue()) {
                return VALUE_ENTRY_QIC_Cartridge;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_AIT_Cartridge.intValue()) {
                return VALUE_ENTRY_AIT_Cartridge;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DTF_Cartridge.intValue()) {
                return VALUE_ENTRY_DTF_Cartridge;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DAT_Cartridge.intValue()) {
                return VALUE_ENTRY_DAT_Cartridge;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_8mm_Tape_Cartridge.intValue()) {
                return VALUE_ENTRY_8mm_Tape_Cartridge;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_19mm_Tape_Cartridge.intValue()) {
                return VALUE_ENTRY_19mm_Tape_Cartridge;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_DLT_Cartridge.intValue()) {
                return VALUE_ENTRY_DLT_Cartridge;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Half_Inch_Magnetic_Tape_Cartridge
                    .intValue()) {
                return VALUE_ENTRY_Half_Inch_Magnetic_Tape_Cartridge;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Cartridge_Disk.intValue()) {
                return VALUE_ENTRY_Cartridge_Disk;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_JAZ_Disk.intValue()) {
                return VALUE_ENTRY_JAZ_Disk;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_ZIP_Disk.intValue()) {
                return VALUE_ENTRY_ZIP_Disk;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_SyQuest_Disk.intValue()) {
                return VALUE_ENTRY_SyQuest_Disk;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Winchester_Removable_Disk.intValue()) {
                return VALUE_ENTRY_Winchester_Removable_Disk;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_CD_ROM.intValue()) {
                return VALUE_ENTRY_CD_ROM;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_CD_ROM_XA.intValue()) {
                return VALUE_ENTRY_CD_ROM_XA;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_CD_I.intValue()) {
                return VALUE_ENTRY_CD_I;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_CD_Recordable.intValue()) {
                return VALUE_ENTRY_CD_Recordable;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_WORM.intValue()) {
                return VALUE_ENTRY_WORM;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Magneto_Optical.intValue()) {
                return VALUE_ENTRY_Magneto_Optical;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_DVD.intValue()) {
                return VALUE_ENTRY_DVD;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DVD_RW_.intValue()) {
                return VALUE_ENTRY_DVD_RW_;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DVD_RAM.intValue()) {
                return VALUE_ENTRY_DVD_RAM;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_DVD_ROM.intValue()) {
                return VALUE_ENTRY_DVD_ROM;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_DVD_Video.intValue()) {
                return VALUE_ENTRY_DVD_Video;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Divx.intValue()) {
                return VALUE_ENTRY_Divx;
            }

            if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Floppy_Diskette.intValue()) {
                return VALUE_ENTRY_Floppy_Diskette;
            }

            if (iValue == VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Hard_Disk.intValue()) {
                return VALUE_ENTRY_Hard_Disk;
            }

            if (iValue == VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Memory_Card.intValue()) {
                return VALUE_ENTRY_Memory_Card;
            }

            if (iValue == VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_Hard_Copy.intValue()) {
                return VALUE_ENTRY_Hard_Copy;
            }

            if (iValue == VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Clik_Disk.intValue()) {
                return VALUE_ENTRY_Clik_Disk;
            }

            if (iValue == VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_CD_RW.intValue()) {
                return VALUE_ENTRY_CD_RW;
            }

            if (iValue == VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_CD_DA.intValue()) {
                return VALUE_ENTRY_CD_DA;
            }

            if (iValue == VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_CD_.intValue()) {
                return VALUE_ENTRY_CD_;
            }

            if (iValue == VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_DVD_Recordable.intValue()) {
                return VALUE_ENTRY_DVD_Recordable;
            }

            if (iValue == VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_DVD_RW.intValue()) {
                return VALUE_ENTRY_DVD_RW;
            }

            if (iValue == VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_DVD_Audio.intValue()) {
                return VALUE_ENTRY_DVD_Audio;
            }

            if (iValue == VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_DVD_5.intValue()) {
                return VALUE_ENTRY_DVD_5;
            }

            if (iValue == VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_DVD_9.intValue()) {
                return VALUE_ENTRY_DVD_9;
            }

            if (iValue == VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_DVD_10.intValue()) {
                return VALUE_ENTRY_DVD_10;
            }

            if (iValue == VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_DVD_18.intValue()) {
                return VALUE_ENTRY_DVD_18;
            }

            if (iValue == VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Magneto_Optical_Rewriteable.intValue()) {
                return VALUE_ENTRY_Magneto_Optical_Rewriteable;
            }

            if (iValue == VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Magneto_Optical_Write_Once.intValue()) {
                return VALUE_ENTRY_Magneto_Optical_Write_Once;
            }

            if (iValue == VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_Magneto_Optical_Rewriteable__LIMDOW_
                    .intValue()) {
                return VALUE_ENTRY_Magneto_Optical_Rewriteable__LIMDOW_;
            }

            if (iValue == VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_Phase_Change_Write_Once.intValue()) {
                return VALUE_ENTRY_Phase_Change_Write_Once;
            }

            if (iValue == VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Phase_Change_Rewriteable.intValue()) {
                return VALUE_ENTRY_Phase_Change_Rewriteable;
            }

            if (iValue == VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Phase_Change_Dual_Rewriteable
                    .intValue()) {
                return VALUE_ENTRY_Phase_Change_Dual_Rewriteable;
            }

            if (iValue == VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Ablative_Write_Once.intValue()) {
                return VALUE_ENTRY_Ablative_Write_Once;
            }

            if (iValue == VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Near_Field_Recording.intValue()) {
                return VALUE_ENTRY_Near_Field_Recording;
            }

            if (iValue == VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_MiniQic.intValue()) {
                return VALUE_ENTRY_MiniQic;
            }

            if (iValue == VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Travan.intValue()) {
                return VALUE_ENTRY_Travan;
            }

            if (iValue == VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_8mm_Metal_Particle.intValue()) {
                return VALUE_ENTRY_8mm_Metal_Particle;
            }

            if (iValue == VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_8mm_Advanced_Metal_Evaporate
                    .intValue()) {
                return VALUE_ENTRY_8mm_Advanced_Metal_Evaporate;
            }

            if (iValue == VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_NCTP.intValue()) {
                return VALUE_ENTRY_NCTP;
            }

            if (iValue == VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_LTO_Ultrium.intValue()) {
                return VALUE_ENTRY_LTO_Ultrium;
            }

            if (iValue == VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_LTO_Accelis.intValue()) {
                return VALUE_ENTRY_LTO_Accelis;
            }

            if (iValue == VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_9_Track_Tape.intValue()) {
                return VALUE_ENTRY_9_Track_Tape;
            }

            if (iValue == VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_18_Track_Tape.intValue()) {
                return VALUE_ENTRY_18_Track_Tape;
            }

            if (iValue == VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_36_Track_Tape.intValue()) {
                return VALUE_ENTRY_36_Track_Tape;
            }

            if (iValue == VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Magstar_3590.intValue()) {
                return VALUE_ENTRY_Magstar_3590;
            }

            if (iValue == VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Magstar_MP.intValue()) {
                return VALUE_ENTRY_Magstar_MP;
            }

            if (iValue == VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_D2_Tape.intValue()) {
                return VALUE_ENTRY_D2_Tape;
            }

            if (iValue == VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Tape___DST_Small.intValue()) {
                return VALUE_ENTRY_Tape___DST_Small;
            }

            if (iValue == VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Tape___DST_Medium.intValue()) {
                return VALUE_ENTRY_Tape___DST_Medium;
            }

            if (iValue == VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Tape___DST_Large.intValue()) {
                return VALUE_ENTRY_Tape___DST_Large;
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
         * Value Map for the property MediaTypesSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Tape_Cartridge,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_QIC_Cartridge,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_AIT_Cartridge,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DTF_Cartridge,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DAT_Cartridge,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_8mm_Tape_Cartridge,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_19mm_Tape_Cartridge,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_DLT_Cartridge,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Half_Inch_Magnetic_Tape_Cartridge,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Cartridge_Disk,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_JAZ_Disk,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_ZIP_Disk,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_SyQuest_Disk,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Winchester_Removable_Disk,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_CD_ROM,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_CD_ROM_XA,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_CD_I,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_CD_Recordable,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_WORM,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Magneto_Optical,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_DVD, VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DVD_RW_,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DVD_RAM,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_DVD_ROM,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_DVD_Video,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Divx,
                VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Floppy_Diskette,
                VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Hard_Disk,
                VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Memory_Card,
                VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_Hard_Copy,
                VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Clik_Disk,
                VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_CD_RW, VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_CD_DA,
                VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_CD_,
                VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_DVD_Recordable,
                VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_DVD_RW,
                VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_DVD_Audio,
                VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_DVD_5, VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_DVD_9,
                VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_DVD_10,
                VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_DVD_18,
                VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Magneto_Optical_Rewriteable,
                VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Magneto_Optical_Write_Once,
                VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_Magneto_Optical_Rewriteable__LIMDOW_,
                VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_Phase_Change_Write_Once,
                VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Phase_Change_Rewriteable,
                VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Phase_Change_Dual_Rewriteable,
                VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Ablative_Write_Once,
                VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Near_Field_Recording,
                VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_MiniQic,
                VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Travan,
                VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_8mm_Metal_Particle,
                VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_8mm_Advanced_Metal_Evaporate,
                VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_NCTP,
                VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_LTO_Ultrium,
                VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_LTO_Accelis,
                VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_9_Track_Tape,
                VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_18_Track_Tape,
                VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_36_Track_Tape,
                VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Magstar_3590,
                VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Magstar_MP,
                VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_D2_Tape,
                VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Tape___DST_Small,
                VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Tape___DST_Medium,
                VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Tape___DST_Large };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property MediaTypesSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Tape_Cartridge, VALUE_ENTRY_QIC_Cartridge, VALUE_ENTRY_AIT_Cartridge,
                VALUE_ENTRY_DTF_Cartridge, VALUE_ENTRY_DAT_Cartridge,
                VALUE_ENTRY_8mm_Tape_Cartridge, VALUE_ENTRY_19mm_Tape_Cartridge,
                VALUE_ENTRY_DLT_Cartridge, VALUE_ENTRY_Half_Inch_Magnetic_Tape_Cartridge,
                VALUE_ENTRY_Cartridge_Disk, VALUE_ENTRY_JAZ_Disk, VALUE_ENTRY_ZIP_Disk,
                VALUE_ENTRY_SyQuest_Disk, VALUE_ENTRY_Winchester_Removable_Disk,
                VALUE_ENTRY_CD_ROM, VALUE_ENTRY_CD_ROM_XA, VALUE_ENTRY_CD_I,
                VALUE_ENTRY_CD_Recordable, VALUE_ENTRY_WORM, VALUE_ENTRY_Magneto_Optical,
                VALUE_ENTRY_DVD, VALUE_ENTRY_DVD_RW_, VALUE_ENTRY_DVD_RAM, VALUE_ENTRY_DVD_ROM,
                VALUE_ENTRY_DVD_Video, VALUE_ENTRY_Divx, VALUE_ENTRY_Floppy_Diskette,
                VALUE_ENTRY_Hard_Disk, VALUE_ENTRY_Memory_Card, VALUE_ENTRY_Hard_Copy,
                VALUE_ENTRY_Clik_Disk, VALUE_ENTRY_CD_RW, VALUE_ENTRY_CD_DA, VALUE_ENTRY_CD_,
                VALUE_ENTRY_DVD_Recordable, VALUE_ENTRY_DVD_RW, VALUE_ENTRY_DVD_Audio,
                VALUE_ENTRY_DVD_5, VALUE_ENTRY_DVD_9, VALUE_ENTRY_DVD_10, VALUE_ENTRY_DVD_18,
                VALUE_ENTRY_Magneto_Optical_Rewriteable, VALUE_ENTRY_Magneto_Optical_Write_Once,
                VALUE_ENTRY_Magneto_Optical_Rewriteable__LIMDOW_,
                VALUE_ENTRY_Phase_Change_Write_Once, VALUE_ENTRY_Phase_Change_Rewriteable,
                VALUE_ENTRY_Phase_Change_Dual_Rewriteable, VALUE_ENTRY_Ablative_Write_Once,
                VALUE_ENTRY_Near_Field_Recording, VALUE_ENTRY_MiniQic, VALUE_ENTRY_Travan,
                VALUE_ENTRY_8mm_Metal_Particle, VALUE_ENTRY_8mm_Advanced_Metal_Evaporate,
                VALUE_ENTRY_NCTP, VALUE_ENTRY_LTO_Ultrium, VALUE_ENTRY_LTO_Accelis,
                VALUE_ENTRY_9_Track_Tape, VALUE_ENTRY_18_Track_Tape, VALUE_ENTRY_36_Track_Tape,
                VALUE_ENTRY_Magstar_3590, VALUE_ENTRY_Magstar_MP, VALUE_ENTRY_D2_Tape,
                VALUE_ENTRY_Tape___DST_Small, VALUE_ENTRY_Tape___DST_Medium,
                VALUE_ENTRY_Tape___DST_Large };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property MediaTypesSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Tape_Cartridge, VALUE_ENTRY_QIC_Cartridge,
                VALUE_ENTRY_AIT_Cartridge, VALUE_ENTRY_DTF_Cartridge, VALUE_ENTRY_DAT_Cartridge,
                VALUE_ENTRY_8mm_Tape_Cartridge, VALUE_ENTRY_19mm_Tape_Cartridge,
                VALUE_ENTRY_DLT_Cartridge, VALUE_ENTRY_Half_Inch_Magnetic_Tape_Cartridge,
                VALUE_ENTRY_Cartridge_Disk, VALUE_ENTRY_JAZ_Disk, VALUE_ENTRY_ZIP_Disk,
                VALUE_ENTRY_SyQuest_Disk, VALUE_ENTRY_Winchester_Removable_Disk,
                VALUE_ENTRY_CD_ROM, VALUE_ENTRY_CD_ROM_XA, VALUE_ENTRY_CD_I,
                VALUE_ENTRY_CD_Recordable, VALUE_ENTRY_WORM, VALUE_ENTRY_Magneto_Optical,
                VALUE_ENTRY_DVD, VALUE_ENTRY_DVD_RW_, VALUE_ENTRY_DVD_RAM, VALUE_ENTRY_DVD_ROM,
                VALUE_ENTRY_DVD_Video, VALUE_ENTRY_Divx, VALUE_ENTRY_Floppy_Diskette,
                VALUE_ENTRY_Hard_Disk, VALUE_ENTRY_Memory_Card, VALUE_ENTRY_Hard_Copy,
                VALUE_ENTRY_Clik_Disk, VALUE_ENTRY_CD_RW, VALUE_ENTRY_CD_DA, VALUE_ENTRY_CD_,
                VALUE_ENTRY_DVD_Recordable, VALUE_ENTRY_DVD_RW, VALUE_ENTRY_DVD_Audio,
                VALUE_ENTRY_DVD_5, VALUE_ENTRY_DVD_9, VALUE_ENTRY_DVD_10, VALUE_ENTRY_DVD_18,
                VALUE_ENTRY_Magneto_Optical_Rewriteable, VALUE_ENTRY_Magneto_Optical_Write_Once,
                VALUE_ENTRY_Magneto_Optical_Rewriteable__LIMDOW_,
                VALUE_ENTRY_Phase_Change_Write_Once, VALUE_ENTRY_Phase_Change_Rewriteable,
                VALUE_ENTRY_Phase_Change_Dual_Rewriteable, VALUE_ENTRY_Ablative_Write_Once,
                VALUE_ENTRY_Near_Field_Recording, VALUE_ENTRY_MiniQic, VALUE_ENTRY_Travan,
                VALUE_ENTRY_8mm_Metal_Particle, VALUE_ENTRY_8mm_Advanced_Metal_Evaporate,
                VALUE_ENTRY_NCTP, VALUE_ENTRY_LTO_Ultrium, VALUE_ENTRY_LTO_Accelis,
                VALUE_ENTRY_9_Track_Tape, VALUE_ENTRY_18_Track_Tape, VALUE_ENTRY_36_Track_Tape,
                VALUE_ENTRY_Magstar_3590, VALUE_ENTRY_Magstar_MP, VALUE_ENTRY_D2_Tape,
                VALUE_ENTRY_Tape___DST_Small, VALUE_ENTRY_Tape___DST_Medium,
                VALUE_ENTRY_Tape___DST_Large };

    }

    /**
     * Constants of property TypeDescriptions
     * This property provides additional detail related to the entries in the MediaTypesSupported array. This is especially critical when the MediaTypesSupported value is 1 ("Other"). Note, each entry of this array is related to the entry in MediaTypesSupported that is located at the same index.
     */
    public static class PROPERTY_TYPEDESCRIPTIONS {
        /**
         * name of the property TypeDescriptions
         */
        public final static String NAME = "TypeDescriptions";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_PackageLocation.getPackages();

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
     *   StorageMediaLocation is a PackageLocation where PhysicalMedia may be placed. This class is typically used in the context of a StorageLibrary. Examples of StorageMediaLocations are Media AccessDevices, InterLibraryPorts or 'slots' in a Library's panel.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_StorageMediaLocation(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   StorageMediaLocation is a PackageLocation where PhysicalMedia may be placed. This class is typically used in the context of a StorageLibrary. Examples of StorageMediaLocations are Media AccessDevices, InterLibraryPorts or 'slots' in a Library's panel.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_StorageMediaLocation(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_StorageMediaLocation() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("LocationType", new CIMProperty("LocationType", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("MediaCapacity", new CIMProperty("MediaCapacity",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("MediaSizesSupported", new CIMProperty("MediaSizesSupported",
                CIMDataType.REAL32_ARRAY_T, null));
        propertiesToCheck.put("MediaTypesSupported", new CIMProperty("MediaTypesSupported",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("TypeDescriptions", new CIMProperty("TypeDescriptions",
                CIMDataType.STRING_ARRAY_T, null));

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
     * Get the property LocationType
     *     * <br>
     * The type of Location. For example, whether this is an individual Media "Slot" (value=2), a MediaAccessDevice (value=4) or a "Magazine" (value=3) is indicated in this property.
     *     */

    public javax.cim.UnsignedInteger16 get_LocationType() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCATIONTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOCATIONTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property LocationType
     * <br>
     * The type of Location. For example, whether this is an individual Media "Slot" (value=2), a MediaAccessDevice (value=4) or a "Magazine" (value=3) is indicated in this property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LocationType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCATIONTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LocationType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOCATIONTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LocationType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LocationType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_StorageMediaLocation fco = new CIM_StorageMediaLocation(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOCATIONTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_LocationType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOCATIONTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LocationType
     * <br>
     * The type of Location. For example, whether this is an individual Media "Slot" (value=2), a MediaAccessDevice (value=4) or a "Magazine" (value=3) is indicated in this property.
     */

    private static CIMProperty setPropertyValue_LocationType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MediaCapacity
     *     * <br>
     * A StorageMediaLocation may hold more than one PhysicalMedia - for example, a Magazine. This property indicates the Physical Media capacity of the Location.
     *     */

    public javax.cim.UnsignedInteger32 get_MediaCapacity() {
        CIMProperty currentProperty = getProperty(PROPERTY_MEDIACAPACITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MEDIACAPACITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property MediaCapacity
     * <br>
     * A StorageMediaLocation may hold more than one PhysicalMedia - for example, a Magazine. This property indicates the Physical Media capacity of the Location.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MediaCapacity(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MEDIACAPACITY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MediaCapacity(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MEDIACAPACITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MediaCapacity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MediaCapacity(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_StorageMediaLocation fco = new CIM_StorageMediaLocation(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MEDIACAPACITY.NAME);
        if (property != null) {
            property = setPropertyValue_MediaCapacity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MEDIACAPACITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MediaCapacity
     * <br>
     * A StorageMediaLocation may hold more than one PhysicalMedia - for example, a Magazine. This property indicates the Physical Media capacity of the Location.
     */

    private static CIMProperty setPropertyValue_MediaCapacity(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MediaSizesSupported
     *     * <br>
     * The sizes (in inches) of the particular MediaTypes that may be placed in the Location. Note, each entry of this array is related to the entry in the MediaTypesSupported array that is located at the same index.
     *     */

    public Float[] get_MediaSizesSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_MEDIASIZESSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MEDIASIZESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Float[]) currentProperty.getValue();

    }

    /**
     * Set the property MediaSizesSupported
     * <br>
     * The sizes (in inches) of the particular MediaTypes that may be placed in the Location. Note, each entry of this array is related to the entry in the MediaTypesSupported array that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MediaSizesSupported(Float[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MEDIASIZESSUPPORTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MediaSizesSupported(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MEDIASIZESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MediaSizesSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MediaSizesSupported(WBEMClient client, String namespace,
            Float[] newValue) throws WbemsmtException {
        CIM_StorageMediaLocation fco = new CIM_StorageMediaLocation(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MEDIASIZESSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_MediaSizesSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MEDIASIZESSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MediaSizesSupported
     * <br>
     * The sizes (in inches) of the particular MediaTypes that may be placed in the Location. Note, each entry of this array is related to the entry in the MediaTypesSupported array that is located at the same index.
     */

    private static CIMProperty setPropertyValue_MediaSizesSupported(CIMProperty currentProperty,
            Float[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MediaTypesSupported
     *     * <br>
     * Certain StorageMediaLocations may only be able to accept a limited set of PhysicalMedia MediaTypes. This property defines an array containing the types of Media that are acceptable for placement in the Location. Additional information and description of the contained MediaTypes can be provided using the TypesDescription array. Also, size data (for example, DVD disc diameter) can be specified using the MediaSizesSupported array. 
     * 
     * Values defined here correspond to those in the CIM_Physical Media.MediaType property. This allows quick comparisons using value equivalence calculations. It is understood that there is no external physical difference between (for example) DVD- Video and DVD-RAM. But, equivalent values in both the Physical Media and StorageMediaLocation enumerations allows for one for one comparisons with no additional processing logic (i.e., the following is not required ... if "DVD-Video" then value="DVD").
     *     */

    public javax.cim.UnsignedInteger16[] get_MediaTypesSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_MEDIATYPESSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MEDIATYPESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property MediaTypesSupported
     * <br>
     * Certain StorageMediaLocations may only be able to accept a limited set of PhysicalMedia MediaTypes. This property defines an array containing the types of Media that are acceptable for placement in the Location. Additional information and description of the contained MediaTypes can be provided using the TypesDescription array. Also, size data (for example, DVD disc diameter) can be specified using the MediaSizesSupported array. 
     * 
     * Values defined here correspond to those in the CIM_Physical Media.MediaType property. This allows quick comparisons using value equivalence calculations. It is understood that there is no external physical difference between (for example) DVD- Video and DVD-RAM. But, equivalent values in both the Physical Media and StorageMediaLocation enumerations allows for one for one comparisons with no additional processing logic (i.e., the following is not required ... if "DVD-Video" then value="DVD").
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MediaTypesSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MEDIATYPESSUPPORTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MediaTypesSupported(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MEDIATYPESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MediaTypesSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MediaTypesSupported(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_StorageMediaLocation fco = new CIM_StorageMediaLocation(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MEDIATYPESSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_MediaTypesSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MEDIATYPESSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MediaTypesSupported
     * <br>
     * Certain StorageMediaLocations may only be able to accept a limited set of PhysicalMedia MediaTypes. This property defines an array containing the types of Media that are acceptable for placement in the Location. Additional information and description of the contained MediaTypes can be provided using the TypesDescription array. Also, size data (for example, DVD disc diameter) can be specified using the MediaSizesSupported array. 
     * 
     * Values defined here correspond to those in the CIM_Physical Media.MediaType property. This allows quick comparisons using value equivalence calculations. It is understood that there is no external physical difference between (for example) DVD- Video and DVD-RAM. But, equivalent values in both the Physical Media and StorageMediaLocation enumerations allows for one for one comparisons with no additional processing logic (i.e., the following is not required ... if "DVD-Video" then value="DVD").
     */

    private static CIMProperty setPropertyValue_MediaTypesSupported(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TypeDescriptions
     *     * <br>
     * This property provides additional detail related to the entries in the MediaTypesSupported array. This is especially critical when the MediaTypesSupported value is 1 ("Other"). Note, each entry of this array is related to the entry in MediaTypesSupported that is located at the same index.
     *     */

    public String[] get_TypeDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_TYPEDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TYPEDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property TypeDescriptions
     * <br>
     * This property provides additional detail related to the entries in the MediaTypesSupported array. This is especially critical when the MediaTypesSupported value is 1 ("Other"). Note, each entry of this array is related to the entry in MediaTypesSupported that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TypeDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TYPEDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TypeDescriptions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TYPEDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TypeDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TypeDescriptions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_StorageMediaLocation fco = new CIM_StorageMediaLocation(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TYPEDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_TypeDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TYPEDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TypeDescriptions
     * <br>
     * This property provides additional detail related to the entries in the MediaTypesSupported array. This is especially critical when the MediaTypesSupported value is 1 ("Other"). Note, each entry of this array is related to the entry in MediaTypesSupported that is located at the same index.
     */

    private static CIMProperty setPropertyValue_TypeDescriptions(CIMProperty currentProperty,
            String[] newValue) {
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
     * Get the list with CIM_PhysicalMedia objects associated by the association CIM_PhysicalMediaInLocation
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_PhysicalMediaInLocations(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_PhysicalMediaInLocations(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION,
                CIM_PhysicalMedia.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalMedia objects associated by the association CIM_PhysicalMediaInLocation
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_PhysicalMediaInLocations(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_PhysicalMediaInLocations(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalMedia objects associated by the association CIM_PhysicalMediaInLocation
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_PhysicalMediaInLocations(
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
                CIM_StorageMediaLocationHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_StorageMediaLocationHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_StorageMediaLocationHelper.findClass(cimClient, cimInstance);

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
            CIM_StorageMediaLocationHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PhysicalMediaInLocation
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_PhysicalMediaInLocationNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_PhysicalMediaInLocationNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION,
                CIM_PhysicalMedia.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PhysicalMediaInLocation
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_PhysicalMediaInLocationNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_PhysicalMediaInLocationNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PhysicalMediaInLocation
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_PhysicalMediaInLocationNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION,
                    CIM_PhysicalMedia.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_StorageMediaLocationHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_StorageMediaLocationHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PhysicalMedia.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_StorageMediaLocationHelper.checkException(enumeration);
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
     * Get the list with CIM_PhysicalMediaInLocation associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_PhysicalMediaInLocation(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_StorageMediaLocationHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_StorageMediaLocationHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PhysicalMediaInLocationHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalMediaInLocation(cimInstance));
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
                        result.add(new CIM_PhysicalMediaInLocation(cimInstance));
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
                        result.add(new CIM_PhysicalMediaInLocation(cimInstance));
                        continue;
                    }
                }
            }
            CIM_StorageMediaLocationHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_PhysicalMediaInLocation
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_PhysicalMediaInLocation(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PHYSICALMEDIAINLOCATION,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_StorageMediaLocationHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_StorageMediaLocationHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PhysicalMediaInLocation.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_StorageMediaLocationHelper.checkException(enumeration);
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
     * Get the list with CIM_PhysicalMedia objects associated by the association CIM_HomeForMedia
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_HomeForMedias(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_HomeForMedias(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA, CIM_PhysicalMedia.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalMedia objects associated by the association CIM_HomeForMedia
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_HomeForMedias(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_HomeForMedias(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_PhysicalMedia objects associated by the association CIM_HomeForMedia
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_HomeForMedias(WBEMClient cimClient,
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
                CIM_StorageMediaLocationHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_StorageMediaLocationHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_StorageMediaLocationHelper.findClass(cimClient, cimInstance);

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
            CIM_StorageMediaLocationHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_HomeForMedia
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_HomeForMediaNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_HomeForMediaNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA, CIM_PhysicalMedia.CIM_CLASS_NAME, null,
                null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_HomeForMedia
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_HomeForMediaNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_HomeForMediaNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_HomeForMedia
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_HomeForMediaNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA,
                    CIM_PhysicalMedia.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_StorageMediaLocationHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_StorageMediaLocationHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PhysicalMedia.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_StorageMediaLocationHelper.checkException(enumeration);
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
     * Get the list with CIM_HomeForMedia associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_HomeForMedia(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_StorageMediaLocationHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_StorageMediaLocationHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_HomeForMediaHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_HomeForMedia(cimInstance));
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
                        result.add(new CIM_HomeForMedia(cimInstance));
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
                        result.add(new CIM_HomeForMedia(cimInstance));
                        continue;
                    }
                }
            }
            CIM_StorageMediaLocationHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_HomeForMedia
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_HomeForMedia(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_HOMEFORMEDIA, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_StorageMediaLocationHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_StorageMediaLocationHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_HomeForMedia.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_StorageMediaLocationHelper.checkException(enumeration);
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
        return CIM_StorageMediaLocation.CIM_CLASS_NAME;
    }

}