/** 
 * CIM_UnixDeviceFile.java
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
 * Description: DeviceFile is a special type of LogicalFile that represents a Device. This class is a specialization of DeviceFile for a Unix environment.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_UnixDeviceFile extends CIM_DeviceFile {

    public final static String CIM_CLASS_NAME = "CIM_UnixDeviceFile";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property DeviceDescription
     * Additional information provided by the driver. This property may be null if no information is available, or a general description of the device when available, e.g. "Non-rewind tape streamer".
     */
    public static class PROPERTY_DEVICEDESCRIPTION {
        /**
         * name of the property DeviceDescription
         */
        public final static String NAME = "DeviceDescription";

    }

    /**
     * Constants of property DeviceFileType
     * The type of device file.
     */
    public static class PROPERTY_DEVICEFILETYPE {
        /**
         * name of the property DeviceFileType
         */
        public final static String NAME = "DeviceFileType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Block = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Block (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Block = "Block";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Character = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Character (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Character = "Character";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@546a546a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Block.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Block;
            }

            if (VALUE_ENTRY_Character.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Character;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Block.intValue()) {
                return VALUE_ENTRY_Block;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Character.intValue()) {
                return VALUE_ENTRY_Character;
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
         * Value Map for the property DeviceFileType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Block,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Character };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property DeviceFileType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Block, VALUE_ENTRY_Character };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property DeviceFileType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Block, VALUE_ENTRY_Character };

    }

    /**
     * Constants of property DeviceId
     * The device Identifier: this is the st_rdev field in the stat structure.
     */
    public static class PROPERTY_DEVICEID {
        /**
         * name of the property DeviceId
         */
        public final static String NAME = "DeviceId";

    }

    /**
     * Constants of property DeviceMajor
     * The Device's Major Id.
     */
    public static class PROPERTY_DEVICEMAJOR {
        /**
         * name of the property DeviceMajor
         */
        public final static String NAME = "DeviceMajor";

    }

    /**
     * Constants of property DeviceMinor
     * The Device's Minor Id.
     */
    public static class PROPERTY_DEVICEMINOR {
        /**
         * name of the property DeviceMinor
         */
        public final static String NAME = "DeviceMinor";

    }

    /**
     * Constants of property OtherTypeDescription
     * Additional information when the DeviceFileType property is set to "Other".
     */
    public static class PROPERTY_OTHERTYPEDESCRIPTION {
        /**
         * name of the property OtherTypeDescription
         */
        public final static String NAME = "OtherTypeDescription";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_DeviceFile.getPackages();

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
     *   DeviceFile is a special type of LogicalFile that represents a Device. This class is a specialization of DeviceFile for a Unix environment.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_UnixDeviceFile(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   DeviceFile is a special type of LogicalFile that represents a Device. This class is a specialization of DeviceFile for a Unix environment.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_UnixDeviceFile(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_UnixDeviceFile() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("DeviceDescription", new CIMProperty("DeviceDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("DeviceFileType", new CIMProperty("DeviceFileType",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("DeviceId", new CIMProperty("DeviceId", CIMDataType.STRING_T, null));
        propertiesToCheck.put("DeviceMajor", new CIMProperty("DeviceMajor", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("DeviceMinor", new CIMProperty("DeviceMinor", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("OtherTypeDescription", new CIMProperty("OtherTypeDescription",
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
     * Get the property DeviceDescription
     *     * <br>
     * Additional information provided by the driver. This property may be null if no information is available, or a general description of the device when available, e.g. "Non-rewind tape streamer".
     *     */

    public String get_DeviceDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_DEVICEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEVICEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property DeviceDescription
     * <br>
     * Additional information provided by the driver. This property may be null if no information is available, or a general description of the device when available, e.g. "Non-rewind tape streamer".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DeviceDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEVICEDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DeviceDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEVICEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DeviceDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DeviceDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_UnixDeviceFile fco = new CIM_UnixDeviceFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEVICEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_DeviceDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEVICEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DeviceDescription
     * <br>
     * Additional information provided by the driver. This property may be null if no information is available, or a general description of the device when available, e.g. "Non-rewind tape streamer".
     */

    private static CIMProperty setPropertyValue_DeviceDescription(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DeviceFileType
     *     * <br>
     * The type of device file.
     *     */

    public javax.cim.UnsignedInteger16 get_DeviceFileType() {
        CIMProperty currentProperty = getProperty(PROPERTY_DEVICEFILETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEVICEFILETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property DeviceFileType
     * <br>
     * The type of device file.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DeviceFileType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEVICEFILETYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DeviceFileType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEVICEFILETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DeviceFileType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DeviceFileType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_UnixDeviceFile fco = new CIM_UnixDeviceFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEVICEFILETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_DeviceFileType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEVICEFILETYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DeviceFileType
     * <br>
     * The type of device file.
     */

    private static CIMProperty setPropertyValue_DeviceFileType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DeviceId
     *     * <br>
     * The device Identifier: this is the st_rdev field in the stat structure.
     *     */

    public String get_DeviceId() {
        CIMProperty currentProperty = getProperty(PROPERTY_DEVICEID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEVICEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property DeviceId
     * <br>
     * The device Identifier: this is the st_rdev field in the stat structure.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DeviceId(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEVICEID.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DeviceId(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEVICEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DeviceId by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DeviceId(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_UnixDeviceFile fco = new CIM_UnixDeviceFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEVICEID.NAME);
        if (property != null) {
            property = setPropertyValue_DeviceId(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEVICEID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DeviceId
     * <br>
     * The device Identifier: this is the st_rdev field in the stat structure.
     */

    private static CIMProperty setPropertyValue_DeviceId(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DeviceMajor
     *     * <br>
     * The Device's Major Id.
     *     */

    public String get_DeviceMajor() {
        CIMProperty currentProperty = getProperty(PROPERTY_DEVICEMAJOR.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEVICEMAJOR.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property DeviceMajor
     * <br>
     * The Device's Major Id.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DeviceMajor(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEVICEMAJOR.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DeviceMajor(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEVICEMAJOR.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DeviceMajor by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DeviceMajor(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_UnixDeviceFile fco = new CIM_UnixDeviceFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEVICEMAJOR.NAME);
        if (property != null) {
            property = setPropertyValue_DeviceMajor(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEVICEMAJOR.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DeviceMajor
     * <br>
     * The Device's Major Id.
     */

    private static CIMProperty setPropertyValue_DeviceMajor(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DeviceMinor
     *     * <br>
     * The Device's Minor Id.
     *     */

    public String get_DeviceMinor() {
        CIMProperty currentProperty = getProperty(PROPERTY_DEVICEMINOR.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEVICEMINOR.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property DeviceMinor
     * <br>
     * The Device's Minor Id.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DeviceMinor(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEVICEMINOR.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DeviceMinor(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEVICEMINOR.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DeviceMinor by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DeviceMinor(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_UnixDeviceFile fco = new CIM_UnixDeviceFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEVICEMINOR.NAME);
        if (property != null) {
            property = setPropertyValue_DeviceMinor(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEVICEMINOR.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DeviceMinor
     * <br>
     * The Device's Minor Id.
     */

    private static CIMProperty setPropertyValue_DeviceMinor(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherTypeDescription
     *     * <br>
     * Additional information when the DeviceFileType property is set to "Other".
     *     */

    public String get_OtherTypeDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERTYPEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherTypeDescription
     * <br>
     * Additional information when the DeviceFileType property is set to "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherTypeDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERTYPEDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherTypeDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherTypeDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherTypeDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_UnixDeviceFile fco = new CIM_UnixDeviceFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERTYPEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherTypeDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherTypeDescription
     * <br>
     * Additional information when the DeviceFileType property is set to "Other".
     */

    private static CIMProperty setPropertyValue_OtherTypeDescription(CIMProperty currentProperty,
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
        return CIM_UnixDeviceFile.CIM_CLASS_NAME;
    }

}