/** 
 * CIM_MediaAccessStatInfo.java
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
 * Description: Statistics related to reading and writing at a specific MediaAccessDevice, or for a specific StorageExtent. Although the same class is used to represent this data, at the instance level the object holds information for the MediaAccessDevice (independent of the StorageExtent), OR for the Extent (independent of its AccessDevice). Note that this class models the same properties as MediaAccessStatData. The latter, however, uses the simplified key mechanisms of the StatisticalData class.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import javax.wbem.*;

public class CIM_MediaAccessStatInfo extends CIM_DeviceStatisticalInformation {

    public final static String CIM_CLASS_NAME = "CIM_MediaAccessStatInfo";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * Method to reset the statistical counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1-2 and 5 reset the 'read operation'-related counters, 3-4 and 6 reset the 'write operation'-related counters, and 7-8 reset the seek-related counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Device's instrumentation can also reset its internal processing and counters. 
     * In a subclass, the set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can be specified as a Values array qualifier.
     */

    public static class METHOD_RESETCOUNTER {
        /**
         * Constant for method ResetCounter
         */
        public final static String NAME = "ResetCounter";

        /**
         * constants for parameter SelectedCounter
         */
        public static class PARAMETER_SELECTEDCOUNTER {
            /*
             * Name of the parameter SelectedCounter
             */
            public final static String NAME = "SelectedCounter";

            /**
             * constant for value map entry 0
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_All = new javax.cim.UnsignedInteger16(
                    "0");

            /**
             * constant for value entry All (corresponds to mapEntry 0 )
             */
            public final static String VALUE_ENTRY_All = "All";

            /**
             * constant for value map entry 1
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Read_Operations = new javax.cim.UnsignedInteger16(
                    "1");

            /**
             * constant for value entry Read Operations (corresponds to mapEntry 1 )
             */
            public final static String VALUE_ENTRY_Read_Operations = "Read Operations";

            /**
             * constant for value map entry 2
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unrecoverable_Read_Operations = new javax.cim.UnsignedInteger16(
                    "2");

            /**
             * constant for value entry Unrecoverable Read Operations (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_Unrecoverable_Read_Operations = "Unrecoverable Read Operations";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Write_Operations = new javax.cim.UnsignedInteger16(
                    "3");

            /**
             * constant for value entry Write Operations (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_Write_Operations = "Write Operations";

            /**
             * constant for value map entry 4
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Unrecoverable_Write_Operations = new javax.cim.UnsignedInteger16(
                    "4");

            /**
             * constant for value entry Unrecoverable Write Operations (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_Unrecoverable_Write_Operations = "Unrecoverable Write Operations";

            /**
             * constant for value map entry 5
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Recovered_Read_Operations = new javax.cim.UnsignedInteger16(
                    "5");

            /**
             * constant for value entry Recovered Read Operations (corresponds to mapEntry 5 )
             */
            public final static String VALUE_ENTRY_Recovered_Read_Operations = "Recovered Read Operations";

            /**
             * constant for value map entry 6
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Recovered_Write_Operations = new javax.cim.UnsignedInteger16(
                    "6");

            /**
             * constant for value entry Recovered Write Operations (corresponds to mapEntry 6 )
             */
            public final static String VALUE_ENTRY_Recovered_Write_Operations = "Recovered Write Operations";

            /**
             * constant for value map entry 7
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Recovered_Seeks = new javax.cim.UnsignedInteger16(
                    "7");

            /**
             * constant for value entry Recovered Seeks (corresponds to mapEntry 7 )
             */
            public final static String VALUE_ENTRY_Recovered_Seeks = "Recovered Seeks";

            /**
             * constant for value map entry 8
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Unrecoverable_Seeks = new javax.cim.UnsignedInteger16(
                    "8");

            /**
             * constant for value entry Unrecoverable Seeks (corresponds to mapEntry 8 )
             */
            public final static String VALUE_ENTRY_Unrecoverable_Seeks = "Unrecoverable Seeks";

            /**
             * get the ValueMapEntry of the given value
             * @param value the value to find the ValueMapEntry for
             * @return the ValueMap entry or null if not found
             */
            //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@39483948
            public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

                if (VALUE_ENTRY_All.equals(value)) {
                    return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_All;
                }

                if (VALUE_ENTRY_Read_Operations.equals(value)) {
                    return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Read_Operations;
                }

                if (VALUE_ENTRY_Unrecoverable_Read_Operations.equals(value)) {
                    return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unrecoverable_Read_Operations;
                }

                if (VALUE_ENTRY_Write_Operations.equals(value)) {
                    return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Write_Operations;
                }

                if (VALUE_ENTRY_Unrecoverable_Write_Operations.equals(value)) {
                    return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Unrecoverable_Write_Operations;
                }

                if (VALUE_ENTRY_Recovered_Read_Operations.equals(value)) {
                    return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Recovered_Read_Operations;
                }

                if (VALUE_ENTRY_Recovered_Write_Operations.equals(value)) {
                    return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Recovered_Write_Operations;
                }

                if (VALUE_ENTRY_Recovered_Seeks.equals(value)) {
                    return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Recovered_Seeks;
                }

                if (VALUE_ENTRY_Unrecoverable_Seeks.equals(value)) {
                    return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Unrecoverable_Seeks;
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

                if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_All.intValue()) {
                    return VALUE_ENTRY_All;
                }

                if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Read_Operations.intValue()) {
                    return VALUE_ENTRY_Read_Operations;
                }

                if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unrecoverable_Read_Operations
                        .intValue()) {
                    return VALUE_ENTRY_Unrecoverable_Read_Operations;
                }

                if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Write_Operations.intValue()) {
                    return VALUE_ENTRY_Write_Operations;
                }

                if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Unrecoverable_Write_Operations
                        .intValue()) {
                    return VALUE_ENTRY_Unrecoverable_Write_Operations;
                }

                if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Recovered_Read_Operations
                        .intValue()) {
                    return VALUE_ENTRY_Recovered_Read_Operations;
                }

                if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Recovered_Write_Operations
                        .intValue()) {
                    return VALUE_ENTRY_Recovered_Write_Operations;
                }

                if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Recovered_Seeks.intValue()) {
                    return VALUE_ENTRY_Recovered_Seeks;
                }

                if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Unrecoverable_Seeks.intValue()) {
                    return VALUE_ENTRY_Unrecoverable_Seeks;
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
             * Value Map for the parameter SelectedCounter of the method ResetCounter   
             */
            public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                    VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_All,
                    VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Read_Operations,
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unrecoverable_Read_Operations,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Write_Operations,
                    VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Unrecoverable_Write_Operations,
                    VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Recovered_Read_Operations,
                    VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Recovered_Write_Operations,
                    VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Recovered_Seeks,
                    VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Unrecoverable_Seeks };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter SelectedCounter of the method ResetCounter   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_All,
                    VALUE_ENTRY_Read_Operations, VALUE_ENTRY_Unrecoverable_Read_Operations,
                    VALUE_ENTRY_Write_Operations, VALUE_ENTRY_Unrecoverable_Write_Operations,
                    VALUE_ENTRY_Recovered_Read_Operations, VALUE_ENTRY_Recovered_Write_Operations,
                    VALUE_ENTRY_Recovered_Seeks, VALUE_ENTRY_Unrecoverable_Seeks };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter SelectedCounter of the method ResetCounter   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_All,
                    VALUE_ENTRY_Read_Operations, VALUE_ENTRY_Unrecoverable_Read_Operations,
                    VALUE_ENTRY_Write_Operations, VALUE_ENTRY_Unrecoverable_Write_Operations,
                    VALUE_ENTRY_Recovered_Read_Operations, VALUE_ENTRY_Recovered_Write_Operations,
                    VALUE_ENTRY_Recovered_Seeks, VALUE_ENTRY_Unrecoverable_Seeks };

        }
    }

    /**
     * Constants of property ReadOperations
     * The number of attempted read operations.
     */
    public static class PROPERTY_READOPERATIONS {
        /**
         * name of the property ReadOperations
         */
        public final static String NAME = "ReadOperations";

    }

    /**
     * Constants of property RecoveredReadOperations
     * The number of recovered read operations.
     */
    public static class PROPERTY_RECOVEREDREADOPERATIONS {
        /**
         * name of the property RecoveredReadOperations
         */
        public final static String NAME = "RecoveredReadOperations";

    }

    /**
     * Constants of property RecoveredSeekOperations
     * The number of recovered seek operations.
     */
    public static class PROPERTY_RECOVEREDSEEKOPERATIONS {
        /**
         * name of the property RecoveredSeekOperations
         */
        public final static String NAME = "RecoveredSeekOperations";

    }

    /**
     * Constants of property RecoveredWriteOperations
     * The number of recovered write operations.
     */
    public static class PROPERTY_RECOVEREDWRITEOPERATIONS {
        /**
         * name of the property RecoveredWriteOperations
         */
        public final static String NAME = "RecoveredWriteOperations";

    }

    /**
     * Constants of property UnrecoverableReadOperations
     * The number of unrecoverable read operations.
     */
    public static class PROPERTY_UNRECOVERABLEREADOPERATIONS {
        /**
         * name of the property UnrecoverableReadOperations
         */
        public final static String NAME = "UnrecoverableReadOperations";

    }

    /**
     * Constants of property UnrecoverableSeekOperations
     * The number of unrecoverable seek operations.
     */
    public static class PROPERTY_UNRECOVERABLESEEKOPERATIONS {
        /**
         * name of the property UnrecoverableSeekOperations
         */
        public final static String NAME = "UnrecoverableSeekOperations";

    }

    /**
     * Constants of property UnrecoverableWriteOperations
     * The number of unrecoverable write operations.
     */
    public static class PROPERTY_UNRECOVERABLEWRITEOPERATIONS {
        /**
         * name of the property UnrecoverableWriteOperations
         */
        public final static String NAME = "UnrecoverableWriteOperations";

    }

    /**
     * Constants of property WriteOperations
     * The number of attempted write operations.
     */
    public static class PROPERTY_WRITEOPERATIONS {
        /**
         * name of the property WriteOperations
         */
        public final static String NAME = "WriteOperations";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_DeviceStatisticalInformation.getPackages();

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
     *   Statistics related to reading and writing at a specific MediaAccessDevice, or for a specific StorageExtent. Although the same class is used to represent this data, at the instance level the object holds information for the MediaAccessDevice (independent of the StorageExtent), OR for the Extent (independent of its AccessDevice). Note that this class models the same properties as MediaAccessStatData. The latter, however, uses the simplified key mechanisms of the StatisticalData class.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_MediaAccessStatInfo(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Statistics related to reading and writing at a specific MediaAccessDevice, or for a specific StorageExtent. Although the same class is used to represent this data, at the instance level the object holds information for the MediaAccessDevice (independent of the StorageExtent), OR for the Extent (independent of its AccessDevice). Note that this class models the same properties as MediaAccessStatData. The latter, however, uses the simplified key mechanisms of the StatisticalData class.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_MediaAccessStatInfo(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_MediaAccessStatInfo() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ReadOperations", new CIMProperty("ReadOperations",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("RecoveredReadOperations", new CIMProperty("RecoveredReadOperations",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("RecoveredSeekOperations", new CIMProperty("RecoveredSeekOperations",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("RecoveredWriteOperations", new CIMProperty(
                "RecoveredWriteOperations", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UnrecoverableReadOperations", new CIMProperty(
                "UnrecoverableReadOperations", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UnrecoverableSeekOperations", new CIMProperty(
                "UnrecoverableSeekOperations", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UnrecoverableWriteOperations", new CIMProperty(
                "UnrecoverableWriteOperations", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("WriteOperations", new CIMProperty("WriteOperations",
                CIMDataType.UINT64_T, null));

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
     * Get the property ReadOperations
     *     * <br>
     * The number of attempted read operations.
     *     */

    public javax.cim.UnsignedInteger64 get_ReadOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_READOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_READOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ReadOperations
     * <br>
     * The number of attempted read operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReadOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_READOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReadOperations(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_READOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReadOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReadOperations(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatInfo fco = new CIM_MediaAccessStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_READOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_ReadOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_READOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReadOperations
     * <br>
     * The number of attempted read operations.
     */

    private static CIMProperty setPropertyValue_ReadOperations(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RecoveredReadOperations
     *     * <br>
     * The number of recovered read operations.
     *     */

    public javax.cim.UnsignedInteger64 get_RecoveredReadOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVEREDREADOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECOVEREDREADOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RecoveredReadOperations
     * <br>
     * The number of recovered read operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RecoveredReadOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVEREDREADOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RecoveredReadOperations(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVEREDREADOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RecoveredReadOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RecoveredReadOperations(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatInfo fco = new CIM_MediaAccessStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOVEREDREADOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_RecoveredReadOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVEREDREADOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RecoveredReadOperations
     * <br>
     * The number of recovered read operations.
     */

    private static CIMProperty setPropertyValue_RecoveredReadOperations(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RecoveredSeekOperations
     *     * <br>
     * The number of recovered seek operations.
     *     */

    public javax.cim.UnsignedInteger64 get_RecoveredSeekOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVEREDSEEKOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECOVEREDSEEKOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RecoveredSeekOperations
     * <br>
     * The number of recovered seek operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RecoveredSeekOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVEREDSEEKOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RecoveredSeekOperations(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVEREDSEEKOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RecoveredSeekOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RecoveredSeekOperations(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatInfo fco = new CIM_MediaAccessStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOVEREDSEEKOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_RecoveredSeekOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVEREDSEEKOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RecoveredSeekOperations
     * <br>
     * The number of recovered seek operations.
     */

    private static CIMProperty setPropertyValue_RecoveredSeekOperations(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RecoveredWriteOperations
     *     * <br>
     * The number of recovered write operations.
     *     */

    public javax.cim.UnsignedInteger64 get_RecoveredWriteOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVEREDWRITEOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECOVEREDWRITEOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RecoveredWriteOperations
     * <br>
     * The number of recovered write operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RecoveredWriteOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVEREDWRITEOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RecoveredWriteOperations(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVEREDWRITEOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RecoveredWriteOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RecoveredWriteOperations(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatInfo fco = new CIM_MediaAccessStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOVEREDWRITEOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_RecoveredWriteOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVEREDWRITEOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RecoveredWriteOperations
     * <br>
     * The number of recovered write operations.
     */

    private static CIMProperty setPropertyValue_RecoveredWriteOperations(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UnrecoverableReadOperations
     *     * <br>
     * The number of unrecoverable read operations.
     *     */

    public javax.cim.UnsignedInteger64 get_UnrecoverableReadOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNRECOVERABLEREADOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNRECOVERABLEREADOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UnrecoverableReadOperations
     * <br>
     * The number of unrecoverable read operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnrecoverableReadOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNRECOVERABLEREADOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnrecoverableReadOperations(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNRECOVERABLEREADOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnrecoverableReadOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnrecoverableReadOperations(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatInfo fco = new CIM_MediaAccessStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNRECOVERABLEREADOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_UnrecoverableReadOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNRECOVERABLEREADOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnrecoverableReadOperations
     * <br>
     * The number of unrecoverable read operations.
     */

    private static CIMProperty setPropertyValue_UnrecoverableReadOperations(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UnrecoverableSeekOperations
     *     * <br>
     * The number of unrecoverable seek operations.
     *     */

    public javax.cim.UnsignedInteger64 get_UnrecoverableSeekOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNRECOVERABLESEEKOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNRECOVERABLESEEKOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UnrecoverableSeekOperations
     * <br>
     * The number of unrecoverable seek operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnrecoverableSeekOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNRECOVERABLESEEKOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnrecoverableSeekOperations(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNRECOVERABLESEEKOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnrecoverableSeekOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnrecoverableSeekOperations(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatInfo fco = new CIM_MediaAccessStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNRECOVERABLESEEKOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_UnrecoverableSeekOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNRECOVERABLESEEKOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnrecoverableSeekOperations
     * <br>
     * The number of unrecoverable seek operations.
     */

    private static CIMProperty setPropertyValue_UnrecoverableSeekOperations(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UnrecoverableWriteOperations
     *     * <br>
     * The number of unrecoverable write operations.
     *     */

    public javax.cim.UnsignedInteger64 get_UnrecoverableWriteOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNRECOVERABLEWRITEOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNRECOVERABLEWRITEOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UnrecoverableWriteOperations
     * <br>
     * The number of unrecoverable write operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnrecoverableWriteOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNRECOVERABLEWRITEOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnrecoverableWriteOperations(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNRECOVERABLEWRITEOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnrecoverableWriteOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnrecoverableWriteOperations(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatInfo fco = new CIM_MediaAccessStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNRECOVERABLEWRITEOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_UnrecoverableWriteOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNRECOVERABLEWRITEOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnrecoverableWriteOperations
     * <br>
     * The number of unrecoverable write operations.
     */

    private static CIMProperty setPropertyValue_UnrecoverableWriteOperations(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property WriteOperations
     *     * <br>
     * The number of attempted write operations.
     *     */

    public javax.cim.UnsignedInteger64 get_WriteOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_WRITEOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_WRITEOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property WriteOperations
     * <br>
     * The number of attempted write operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_WriteOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_WRITEOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_WriteOperations(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_WRITEOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property WriteOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_WriteOperations(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatInfo fco = new CIM_MediaAccessStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_WRITEOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_WriteOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_WRITEOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property WriteOperations
     * <br>
     * The number of attempted write operations.
     */

    private static CIMProperty setPropertyValue_WriteOperations(CIMProperty currentProperty,
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

    //**********************************************************************
    // Extrinsic Method invocations     
    //**********************************************************************                         

    /**
     * Invokes the Method ResetCounter
     * <br>
     * @param client the cimclient
     * Method to reset the statistical counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1-2 and 5 reset the 'read operation'-related counters, 3-4 and 6 reset the 'write operation'-related counters, and 7-8 reset the seek-related counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Device's instrumentation can also reset its internal processing and counters. 
     * In a subclass, the set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can be specified as a Values array qualifier.
     *   @param SelectedCounter The counter to reset.
     *
     */

    public ResetCounterResult invoke_ResetCounter(WBEMClient cimClient,
            javax.cim.UnsignedInteger16 SelectedCounter) throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[1];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("SelectedCounter", CIMDataType.UINT16_T, SelectedCounter);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_RESETCOUNTER.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_RESETCOUNTER.NAME, inParameter, outParameter));
        }

        ResetCounterResult result = new ResetCounterResult();
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
     * Result object for the method ResetCounter
     */
    public static class ResetCounterResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        ResetCounterResult() {
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
        return CIM_MediaAccessStatInfo.CIM_CLASS_NAME;
    }

}