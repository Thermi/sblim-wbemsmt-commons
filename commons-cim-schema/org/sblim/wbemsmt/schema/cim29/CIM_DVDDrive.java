/** 
 * CIM_DVDDrive.java
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
 * Description: Capabilities and management of a DVDDrive, a subtype of MediaAccessDevice.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_DVDDrive extends CIM_MediaAccessDevice {

    public final static String CIM_CLASS_NAME = "CIM_DVDDrive";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property FormatsSupported
     * The CD and DVD formats that are supported by this Device. For example, the Drive may support "CD-ROM" and "DVD-RAM". In this case, the values 16 and 24 would be written to the array. This property's values align with those defined in PhysicalMedia.MediaType.
     */
    public static class PROPERTY_FORMATSSUPPORTED {
        /**
         * name of the property FormatsSupported
         */
        public final static String NAME = "FormatsSupported";

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
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@7b4c7b4c
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
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
         * Value Map for the property FormatsSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_CD_ROM,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_CD_ROM_XA,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_CD_I,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_CD_Recordable,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_DVD, VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DVD_RW_,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DVD_RAM,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_DVD_ROM,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_DVD_Video,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Divx, VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_CD_RW,
                VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_CD_DA, VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_CD_,
                VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_DVD_Recordable,
                VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_DVD_RW,
                VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_DVD_Audio,
                VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_DVD_5, VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_DVD_9,
                VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_DVD_10,
                VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_DVD_18 };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property FormatsSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_CD_ROM, VALUE_ENTRY_CD_ROM_XA, VALUE_ENTRY_CD_I,
                VALUE_ENTRY_CD_Recordable, VALUE_ENTRY_DVD, VALUE_ENTRY_DVD_RW_,
                VALUE_ENTRY_DVD_RAM, VALUE_ENTRY_DVD_ROM, VALUE_ENTRY_DVD_Video, VALUE_ENTRY_Divx,
                VALUE_ENTRY_CD_RW, VALUE_ENTRY_CD_DA, VALUE_ENTRY_CD_, VALUE_ENTRY_DVD_Recordable,
                VALUE_ENTRY_DVD_RW, VALUE_ENTRY_DVD_Audio, VALUE_ENTRY_DVD_5, VALUE_ENTRY_DVD_9,
                VALUE_ENTRY_DVD_10, VALUE_ENTRY_DVD_18 };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property FormatsSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_CD_ROM, VALUE_ENTRY_CD_ROM_XA, VALUE_ENTRY_CD_I,
                VALUE_ENTRY_CD_Recordable, VALUE_ENTRY_DVD, VALUE_ENTRY_DVD_RW_,
                VALUE_ENTRY_DVD_RAM, VALUE_ENTRY_DVD_ROM, VALUE_ENTRY_DVD_Video, VALUE_ENTRY_Divx,
                VALUE_ENTRY_CD_RW, VALUE_ENTRY_CD_DA, VALUE_ENTRY_CD_, VALUE_ENTRY_DVD_Recordable,
                VALUE_ENTRY_DVD_RW, VALUE_ENTRY_DVD_Audio, VALUE_ENTRY_DVD_5, VALUE_ENTRY_DVD_9,
                VALUE_ENTRY_DVD_10, VALUE_ENTRY_DVD_18 };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_MediaAccessDevice.getPackages();

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
     *   Capabilities and management of a DVDDrive, a subtype of MediaAccessDevice.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_DVDDrive(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Capabilities and management of a DVDDrive, a subtype of MediaAccessDevice.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_DVDDrive(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_DVDDrive() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("FormatsSupported", new CIMProperty("FormatsSupported",
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
     * Get the property FormatsSupported
     *     * <br>
     * The CD and DVD formats that are supported by this Device. For example, the Drive may support "CD-ROM" and "DVD-RAM". In this case, the values 16 and 24 would be written to the array. This property's values align with those defined in PhysicalMedia.MediaType.
     *     */

    public javax.cim.UnsignedInteger16[] get_FormatsSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_FORMATSSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FORMATSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property FormatsSupported
     * <br>
     * The CD and DVD formats that are supported by this Device. For example, the Drive may support "CD-ROM" and "DVD-RAM". In this case, the values 16 and 24 would be written to the array. This property's values align with those defined in PhysicalMedia.MediaType.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FormatsSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FORMATSSUPPORTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FormatsSupported(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FORMATSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FormatsSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FormatsSupported(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_DVDDrive fco = new CIM_DVDDrive(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FORMATSSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_FormatsSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FORMATSSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FormatsSupported
     * <br>
     * The CD and DVD formats that are supported by this Device. For example, the Drive may support "CD-ROM" and "DVD-RAM". In this case, the values 16 and 24 would be written to the array. This property's values align with those defined in PhysicalMedia.MediaType.
     */

    private static CIMProperty setPropertyValue_FormatsSupported(CIMProperty currentProperty,
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
        return CIM_DVDDrive.CIM_CLASS_NAME;
    }

}