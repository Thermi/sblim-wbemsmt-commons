/** 
 * CIM_MediaPartition.java
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
 * Description: A MediaPartition is a presentation of a contiguous range of logical blocks and has identifying data written on/to it. It may include a signature written by the OS or by an application. This class is a common superclass for Disk and TapePartions. Partitions are directly realized by Physical Media (indicated by the RealizesExtent association) or built on StorageVolumes (indicated by the BasedOn association).
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_MediaPartition extends CIM_StorageExtent {

    public final static String CIM_CLASS_NAME = "CIM_MediaPartition";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Allocatable
     * Boolean indicating that the Partition is available and may be allocated for use.
     */
    public static class PROPERTY_ALLOCATABLE {
        /**
         * name of the property Allocatable
         */
        public final static String NAME = "Allocatable";

    }

    /**
     * Constants of property Bootable
     * Boolean indicating that the Partition is labeled as bootable. (Note that this does not mean that an Operating System is actually loaded on the Partition.) With the advent of bootable Tape and other bootable media, this property is included in the higher level MediaPartition class, rather than in a subclass such as DiskPartition.
     */
    public static class PROPERTY_BOOTABLE {
        /**
         * name of the property Bootable
         */
        public final static String NAME = "Bootable";

    }

    /**
     * Constants of property Extendable
     * Boolean indicating that the Partition can be grown/extended without reformatting.
     */
    public static class PROPERTY_EXTENDABLE {
        /**
         * name of the property Extendable
         */
        public final static String NAME = "Extendable";

    }

    /**
     * Constants of property Signature
     * An identifying string written to the Partition. Additional information related to this 'Signature' may be found in the properties, SignatureState and SignatureAlgorithm.
     */
    public static class PROPERTY_SIGNATURE {
        /**
         * name of the property Signature
         */
        public final static String NAME = "Signature";

    }

    /**
     * Constants of property SignatureAlgorithm
     * A free-form string describing the algorithm used to define the Partition Signature. The value of this property is dependent on the Signature's State.
     */
    public static class PROPERTY_SIGNATUREALGORITHM {
        /**
         * name of the property SignatureAlgorithm
         */
        public final static String NAME = "SignatureAlgorithm";

    }

    /**
     * Constants of property SignatureState
     * An enumeration describing the state of the Partition's identifying Signature string. Information such as "Uninitialized" (value=2), or "Assigned by Owning Application" (value=5) are possible entries.
     */
    public static class PROPERTY_SIGNATURESTATE {
        /**
         * name of the property SignatureState
         */
        public final static String NAME = "SignatureState";

        /**
         * constant for value map entry 0
         */

        public final static String VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown = new String("0");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 1
         */

        public final static String VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unimplemented = new String("1");

        /**
         * constant for value entry Unimplemented (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Unimplemented = "Unimplemented";

        /**
         * constant for value map entry 2
         */

        public final static String VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Uninitialized = new String("2");

        /**
         * constant for value entry Uninitialized (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Uninitialized = "Uninitialized";

        /**
         * constant for value map entry 3
         */

        public final static String VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Calculated_by_Operating_System = new String(
                "3");

        /**
         * constant for value entry Calculated by Operating System (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Calculated_by_Operating_System = "Calculated by Operating System";

        /**
         * constant for value map entry 4
         */

        public final static String VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Calculated_by_a_Media_Manager = new String(
                "4");

        /**
         * constant for value entry Calculated by a Media Manager (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Calculated_by_a_Media_Manager = "Calculated by a Media Manager";

        /**
         * constant for value map entry 5
         */

        public final static String VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Assigned_by_Owning_Application = new String(
                "5");

        /**
         * constant for value entry Assigned by Owning Application (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Assigned_by_Owning_Application = "Assigned by Owning Application";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static String getValueMapEntry(String value) {
            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }
            if (VALUE_ENTRY_Unimplemented.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unimplemented;
            }
            if (VALUE_ENTRY_Uninitialized.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Uninitialized;
            }
            if (VALUE_ENTRY_Calculated_by_Operating_System.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Calculated_by_Operating_System;
            }
            if (VALUE_ENTRY_Calculated_by_a_Media_Manager.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Calculated_by_a_Media_Manager;
            }
            if (VALUE_ENTRY_Assigned_by_Owning_Application.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Assigned_by_Owning_Application;
            }
            return null;
        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static String getValueMapEntryFromDisplayedValue(Number indexInPulldown) {
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
        public static int getIndexForDisplay(String currentValue) {
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

        public static String getValueEntry(String valueMapEntry) {
            if (VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.equals(valueMapEntry)) {
                return VALUE_ENTRY_Unknown;
            }
            if (VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unimplemented.equals(valueMapEntry)) {
                return VALUE_ENTRY_Unimplemented;
            }
            if (VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Uninitialized.equals(valueMapEntry)) {
                return VALUE_ENTRY_Uninitialized;
            }
            if (VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Calculated_by_Operating_System
                    .equals(valueMapEntry)) {
                return VALUE_ENTRY_Calculated_by_Operating_System;
            }
            if (VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Calculated_by_a_Media_Manager
                    .equals(valueMapEntry)) {
                return VALUE_ENTRY_Calculated_by_a_Media_Manager;
            }
            if (VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Assigned_by_Owning_Application
                    .equals(valueMapEntry)) {
                return VALUE_ENTRY_Assigned_by_Owning_Application;
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
         * Value Map for the property SignatureState   
         */
        public final static String[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unimplemented,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Uninitialized,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Calculated_by_Operating_System,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Calculated_by_a_Media_Manager,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Assigned_by_Owning_Application };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SignatureState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Unimplemented, VALUE_ENTRY_Uninitialized,
                VALUE_ENTRY_Calculated_by_Operating_System,
                VALUE_ENTRY_Calculated_by_a_Media_Manager,
                VALUE_ENTRY_Assigned_by_Owning_Application };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SignatureState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Unimplemented, VALUE_ENTRY_Uninitialized,
                VALUE_ENTRY_Calculated_by_Operating_System,
                VALUE_ENTRY_Calculated_by_a_Media_Manager,
                VALUE_ENTRY_Assigned_by_Owning_Application };

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
     *   A MediaPartition is a presentation of a contiguous range of logical blocks and has identifying data written on/to it. It may include a signature written by the OS or by an application. This class is a common superclass for Disk and TapePartions. Partitions are directly realized by Physical Media (indicated by the RealizesExtent association) or built on StorageVolumes (indicated by the BasedOn association).
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_MediaPartition(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A MediaPartition is a presentation of a contiguous range of logical blocks and has identifying data written on/to it. It may include a signature written by the OS or by an application. This class is a common superclass for Disk and TapePartions. Partitions are directly realized by Physical Media (indicated by the RealizesExtent association) or built on StorageVolumes (indicated by the BasedOn association).
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_MediaPartition(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_MediaPartition() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Allocatable", new CIMProperty("Allocatable", CIMDataType.BOOLEAN_T,
                null));
        propertiesToCheck.put("Bootable", new CIMProperty("Bootable", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("Extendable", new CIMProperty("Extendable", CIMDataType.BOOLEAN_T,
                null));
        propertiesToCheck
                .put("Signature", new CIMProperty("Signature", CIMDataType.STRING_T, null));
        propertiesToCheck.put("SignatureAlgorithm", new CIMProperty("SignatureAlgorithm",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("SignatureState", new CIMProperty("SignatureState",
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
     * Get the property Allocatable
     *     * <br>
     * Boolean indicating that the Partition is available and may be allocated for use.
     *     */

    public Boolean get_Allocatable() {
        CIMProperty currentProperty = getProperty(PROPERTY_ALLOCATABLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ALLOCATABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property Allocatable
     * <br>
     * Boolean indicating that the Partition is available and may be allocated for use.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Allocatable(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ALLOCATABLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Allocatable(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ALLOCATABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Allocatable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Allocatable(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_MediaPartition fco = new CIM_MediaPartition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ALLOCATABLE.NAME);
        if (property != null) {
            property = setPropertyValue_Allocatable(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ALLOCATABLE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Allocatable
     * <br>
     * Boolean indicating that the Partition is available and may be allocated for use.
     */

    private static CIMProperty setPropertyValue_Allocatable(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Bootable
     *     * <br>
     * Boolean indicating that the Partition is labeled as bootable. (Note that this does not mean that an Operating System is actually loaded on the Partition.) With the advent of bootable Tape and other bootable media, this property is included in the higher level MediaPartition class, rather than in a subclass such as DiskPartition.
     *     */

    public Boolean get_Bootable() {
        CIMProperty currentProperty = getProperty(PROPERTY_BOOTABLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BOOTABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property Bootable
     * <br>
     * Boolean indicating that the Partition is labeled as bootable. (Note that this does not mean that an Operating System is actually loaded on the Partition.) With the advent of bootable Tape and other bootable media, this property is included in the higher level MediaPartition class, rather than in a subclass such as DiskPartition.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Bootable(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BOOTABLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Bootable(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BOOTABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Bootable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Bootable(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_MediaPartition fco = new CIM_MediaPartition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BOOTABLE.NAME);
        if (property != null) {
            property = setPropertyValue_Bootable(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BOOTABLE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Bootable
     * <br>
     * Boolean indicating that the Partition is labeled as bootable. (Note that this does not mean that an Operating System is actually loaded on the Partition.) With the advent of bootable Tape and other bootable media, this property is included in the higher level MediaPartition class, rather than in a subclass such as DiskPartition.
     */

    private static CIMProperty setPropertyValue_Bootable(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Extendable
     *     * <br>
     * Boolean indicating that the Partition can be grown/extended without reformatting.
     *     */

    public Boolean get_Extendable() {
        CIMProperty currentProperty = getProperty(PROPERTY_EXTENDABLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EXTENDABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property Extendable
     * <br>
     * Boolean indicating that the Partition can be grown/extended without reformatting.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Extendable(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EXTENDABLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Extendable(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EXTENDABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Extendable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Extendable(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_MediaPartition fco = new CIM_MediaPartition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EXTENDABLE.NAME);
        if (property != null) {
            property = setPropertyValue_Extendable(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EXTENDABLE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Extendable
     * <br>
     * Boolean indicating that the Partition can be grown/extended without reformatting.
     */

    private static CIMProperty setPropertyValue_Extendable(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Signature
     *     * <br>
     * An identifying string written to the Partition. Additional information related to this 'Signature' may be found in the properties, SignatureState and SignatureAlgorithm.
     *     */

    public String get_Signature() {
        CIMProperty currentProperty = getProperty(PROPERTY_SIGNATURE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SIGNATURE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Signature
     * <br>
     * An identifying string written to the Partition. Additional information related to this 'Signature' may be found in the properties, SignatureState and SignatureAlgorithm.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Signature(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SIGNATURE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Signature(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SIGNATURE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Signature by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Signature(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_MediaPartition fco = new CIM_MediaPartition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SIGNATURE.NAME);
        if (property != null) {
            property = setPropertyValue_Signature(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SIGNATURE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Signature
     * <br>
     * An identifying string written to the Partition. Additional information related to this 'Signature' may be found in the properties, SignatureState and SignatureAlgorithm.
     */

    private static CIMProperty setPropertyValue_Signature(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SignatureAlgorithm
     *     * <br>
     * A free-form string describing the algorithm used to define the Partition Signature. The value of this property is dependent on the Signature's State.
     *     */

    public String get_SignatureAlgorithm() {
        CIMProperty currentProperty = getProperty(PROPERTY_SIGNATUREALGORITHM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SIGNATUREALGORITHM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SignatureAlgorithm
     * <br>
     * A free-form string describing the algorithm used to define the Partition Signature. The value of this property is dependent on the Signature's State.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SignatureAlgorithm(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SIGNATUREALGORITHM.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SignatureAlgorithm(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SIGNATUREALGORITHM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SignatureAlgorithm by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SignatureAlgorithm(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_MediaPartition fco = new CIM_MediaPartition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SIGNATUREALGORITHM.NAME);
        if (property != null) {
            property = setPropertyValue_SignatureAlgorithm(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SIGNATUREALGORITHM.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SignatureAlgorithm
     * <br>
     * A free-form string describing the algorithm used to define the Partition Signature. The value of this property is dependent on the Signature's State.
     */

    private static CIMProperty setPropertyValue_SignatureAlgorithm(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SignatureState
     *     * <br>
     * An enumeration describing the state of the Partition's identifying Signature string. Information such as "Uninitialized" (value=2), or "Assigned by Owning Application" (value=5) are possible entries.
     *     */

    public String get_SignatureState() {
        CIMProperty currentProperty = getProperty(PROPERTY_SIGNATURESTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SIGNATURESTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SignatureState
     * <br>
     * An enumeration describing the state of the Partition's identifying Signature string. Information such as "Uninitialized" (value=2), or "Assigned by Owning Application" (value=5) are possible entries.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SignatureState(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SIGNATURESTATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SignatureState(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SIGNATURESTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SignatureState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SignatureState(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_MediaPartition fco = new CIM_MediaPartition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SIGNATURESTATE.NAME);
        if (property != null) {
            property = setPropertyValue_SignatureState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SIGNATURESTATE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SignatureState
     * <br>
     * An enumeration describing the state of the Partition's identifying Signature string. Information such as "Uninitialized" (value=2), or "Assigned by Owning Application" (value=5) are possible entries.
     */

    private static CIMProperty setPropertyValue_SignatureState(CIMProperty currentProperty,
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
        return CIM_MediaPartition.CIM_CLASS_NAME;
    }

}