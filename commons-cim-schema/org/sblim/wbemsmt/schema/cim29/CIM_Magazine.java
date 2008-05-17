/** 
 * CIM_Magazine.java
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
 * Description: StorageMediaLocations are typically slots or spaces where removable media are located. However, a specific kind of MediaLocation is a Magazine. This entity represents a single physical container with multiple StorageMediaLocations in it. All the MediaLocations within the Magazine are added/removed together. Often, this container has a Barcode or other label for identification. This is the unique data captured in the CIM_Magazine class. Magazine's label properties are defined exactly as are labels for PhysicalMedia.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_Magazine extends CIM_StorageMediaLocation {

    public final static String CIM_CLASS_NAME = "CIM_Magazine";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property LabelFormats
     * An array of enumerated integers describing the formats of each of the labels on a Magazine. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
     */
    public static class PROPERTY_LABELFORMATS {
        /**
         * name of the property LabelFormats
         */
        public final static String NAME = "LabelFormats";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Barcode = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Barcode (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Barcode = "Barcode";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Radio_Frequency_Identification = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Radio Frequency Identification (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Radio_Frequency_Identification = "Radio Frequency Identification";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OCR__Optical_Character_Recognition_ = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry OCR (Optical Character Recognition) (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_OCR__Optical_Character_Recognition_ = "OCR (Optical Character Recognition)";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MICR__Magnetic_Ink_Character_Recognition_ = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry MICR (Magnetic Ink Character Recognition) (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_MICR__Magnetic_Ink_Character_Recognition_ = "MICR (Magnetic Ink Character Recognition)";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_7_Character_Barcode = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry 7 Character Barcode (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_7_Character_Barcode = "7 Character Barcode";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_9_Character_Barcode = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry 9 Character Barcode (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_9_Character_Barcode = "9 Character Barcode";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@61986198
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Barcode.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Barcode;
            }

            if (VALUE_ENTRY_Radio_Frequency_Identification.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Radio_Frequency_Identification;
            }

            if (VALUE_ENTRY_OCR__Optical_Character_Recognition_.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OCR__Optical_Character_Recognition_;
            }

            if (VALUE_ENTRY_MICR__Magnetic_Ink_Character_Recognition_.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MICR__Magnetic_Ink_Character_Recognition_;
            }

            if (VALUE_ENTRY_7_Character_Barcode.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_7_Character_Barcode;
            }

            if (VALUE_ENTRY_9_Character_Barcode.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_9_Character_Barcode;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Barcode.intValue()) {
                return VALUE_ENTRY_Barcode;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Radio_Frequency_Identification
                    .intValue()) {
                return VALUE_ENTRY_Radio_Frequency_Identification;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OCR__Optical_Character_Recognition_
                    .intValue()) {
                return VALUE_ENTRY_OCR__Optical_Character_Recognition_;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MICR__Magnetic_Ink_Character_Recognition_
                    .intValue()) {
                return VALUE_ENTRY_MICR__Magnetic_Ink_Character_Recognition_;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_7_Character_Barcode.intValue()) {
                return VALUE_ENTRY_7_Character_Barcode;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_9_Character_Barcode.intValue()) {
                return VALUE_ENTRY_9_Character_Barcode;
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
         * Value Map for the property LabelFormats   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Barcode,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Radio_Frequency_Identification,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OCR__Optical_Character_Recognition_,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_MICR__Magnetic_Ink_Character_Recognition_,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_7_Character_Barcode,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_9_Character_Barcode };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property LabelFormats   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Barcode,
                VALUE_ENTRY_Radio_Frequency_Identification,
                VALUE_ENTRY_OCR__Optical_Character_Recognition_,
                VALUE_ENTRY_MICR__Magnetic_Ink_Character_Recognition_,
                VALUE_ENTRY_7_Character_Barcode, VALUE_ENTRY_9_Character_Barcode };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property LabelFormats   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Barcode,
                VALUE_ENTRY_Radio_Frequency_Identification,
                VALUE_ENTRY_OCR__Optical_Character_Recognition_,
                VALUE_ENTRY_MICR__Magnetic_Ink_Character_Recognition_,
                VALUE_ENTRY_7_Character_Barcode, VALUE_ENTRY_9_Character_Barcode };

    }

    /**
     * Constants of property LabelStates
     * An array of enumerated integers describing the states of each of the labels on a Magazine. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
     */
    public static class PROPERTY_LABELSTATES {
        /**
         * name of the property LabelStates
         */
        public final static String NAME = "LabelStates";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_OK_Readable = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry OK/Readable (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_OK_Readable = "OK/Readable";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unreadable = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Unreadable (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Unreadable = "Unreadable";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Upside_Down = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Upside Down (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Upside_Down = "Upside Down";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@5a1a5a1a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_OK_Readable.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_OK_Readable;
            }

            if (VALUE_ENTRY_Unreadable.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unreadable;
            }

            if (VALUE_ENTRY_Upside_Down.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Upside_Down;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_OK_Readable.intValue()) {
                return VALUE_ENTRY_OK_Readable;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unreadable.intValue()) {
                return VALUE_ENTRY_Unreadable;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Upside_Down.intValue()) {
                return VALUE_ENTRY_Upside_Down;
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
         * Value Map for the property LabelStates   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_OK_Readable,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unreadable,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Upside_Down };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property LabelStates   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_OK_Readable,
                VALUE_ENTRY_Unreadable, VALUE_ENTRY_Upside_Down };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property LabelStates   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_OK_Readable,
                VALUE_ENTRY_Unreadable, VALUE_ENTRY_Upside_Down };

    }

    /**
     * Constants of property PhysicalLabels
     * One or more strings on 'labels' on the Magazine. The format of the labels and their state (readable, unreadable, upside-down) are indicated in the corresponding LabelFormats and LabelStates array properties.
     */
    public static class PROPERTY_PHYSICALLABELS {
        /**
         * name of the property PhysicalLabels
         */
        public final static String NAME = "PhysicalLabels";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_StorageMediaLocation.getPackages();

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
     *   StorageMediaLocations are typically slots or spaces where removable media are located. However, a specific kind of MediaLocation is a Magazine. This entity represents a single physical container with multiple StorageMediaLocations in it. All the MediaLocations within the Magazine are added/removed together. Often, this container has a Barcode or other label for identification. This is the unique data captured in the CIM_Magazine class. Magazine's label properties are defined exactly as are labels for PhysicalMedia.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Magazine(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   StorageMediaLocations are typically slots or spaces where removable media are located. However, a specific kind of MediaLocation is a Magazine. This entity represents a single physical container with multiple StorageMediaLocations in it. All the MediaLocations within the Magazine are added/removed together. Often, this container has a Barcode or other label for identification. This is the unique data captured in the CIM_Magazine class. Magazine's label properties are defined exactly as are labels for PhysicalMedia.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Magazine(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Magazine() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("LabelFormats", new CIMProperty("LabelFormats",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("LabelStates", new CIMProperty("LabelStates",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("PhysicalLabels", new CIMProperty("PhysicalLabels",
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
     * Get the property LabelFormats
     *     * <br>
     * An array of enumerated integers describing the formats of each of the labels on a Magazine. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
     *     */

    public javax.cim.UnsignedInteger16[] get_LabelFormats() {
        CIMProperty currentProperty = getProperty(PROPERTY_LABELFORMATS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LABELFORMATS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property LabelFormats
     * <br>
     * An array of enumerated integers describing the formats of each of the labels on a Magazine. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LabelFormats(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LABELFORMATS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LabelFormats(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LABELFORMATS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LabelFormats by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LabelFormats(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_Magazine fco = new CIM_Magazine(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LABELFORMATS.NAME);
        if (property != null) {
            property = setPropertyValue_LabelFormats(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LABELFORMATS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LabelFormats
     * <br>
     * An array of enumerated integers describing the formats of each of the labels on a Magazine. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
     */

    private static CIMProperty setPropertyValue_LabelFormats(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LabelStates
     *     * <br>
     * An array of enumerated integers describing the states of each of the labels on a Magazine. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
     *     */

    public javax.cim.UnsignedInteger16[] get_LabelStates() {
        CIMProperty currentProperty = getProperty(PROPERTY_LABELSTATES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LABELSTATES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property LabelStates
     * <br>
     * An array of enumerated integers describing the states of each of the labels on a Magazine. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LabelStates(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LABELSTATES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LabelStates(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LABELSTATES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LabelStates by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LabelStates(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_Magazine fco = new CIM_Magazine(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LABELSTATES.NAME);
        if (property != null) {
            property = setPropertyValue_LabelStates(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LABELSTATES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LabelStates
     * <br>
     * An array of enumerated integers describing the states of each of the labels on a Magazine. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
     */

    private static CIMProperty setPropertyValue_LabelStates(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PhysicalLabels
     *     * <br>
     * One or more strings on 'labels' on the Magazine. The format of the labels and their state (readable, unreadable, upside-down) are indicated in the corresponding LabelFormats and LabelStates array properties.
     *     */

    public String[] get_PhysicalLabels() {
        CIMProperty currentProperty = getProperty(PROPERTY_PHYSICALLABELS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PHYSICALLABELS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property PhysicalLabels
     * <br>
     * One or more strings on 'labels' on the Magazine. The format of the labels and their state (readable, unreadable, upside-down) are indicated in the corresponding LabelFormats and LabelStates array properties.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PhysicalLabels(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PHYSICALLABELS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PhysicalLabels(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PHYSICALLABELS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PhysicalLabels by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PhysicalLabels(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_Magazine fco = new CIM_Magazine(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PHYSICALLABELS.NAME);
        if (property != null) {
            property = setPropertyValue_PhysicalLabels(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PHYSICALLABELS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PhysicalLabels
     * <br>
     * One or more strings on 'labels' on the Magazine. The format of the labels and their state (readable, unreadable, upside-down) are indicated in the corresponding LabelFormats and LabelStates array properties.
     */

    private static CIMProperty setPropertyValue_PhysicalLabels(CIMProperty currentProperty,
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
        return CIM_Magazine.CIM_CLASS_NAME;
    }

}