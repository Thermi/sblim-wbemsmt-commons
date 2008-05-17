/** 
 * CIM_MediaPhysicalStatInfo.java
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
 * Description: Statistics related to reading physical labels and picks/puts at a specific StorageMediaLocation, or for a specific piece of PhysicalMedia. Although the same class is used to represent this data, at the instance level the object holds information for the Location (independent of the Media), OR for the Media (independent of its StorageMediaLocation). This class is deprecated in lieu of MediaPhysicalStatData, to take advantage of the simplified key structure defined there.
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

public class CIM_MediaPhysicalStatInfo extends CIM_PhysicalStatisticalInformation {

    public final static String CIM_CLASS_NAME = "CIM_MediaPhysicalStatInfo";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * Method to reset the statistical counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1-3 reset the scan-related counters, 4-6 reset the 'pick'-related counters, and 7-9 reset the 'put'-related counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Element's instrumentation can also reset its internal processing and counters. The set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier on the method.
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

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Scan_Successes = new javax.cim.UnsignedInteger16(
                    "1");

            /**
             * constant for value entry Scan Successes (corresponds to mapEntry 1 )
             */
            public final static String VALUE_ENTRY_Scan_Successes = "Scan Successes";

            /**
             * constant for value map entry 2
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Scan_Failures = new javax.cim.UnsignedInteger16(
                    "2");

            /**
             * constant for value entry Scan Failures (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_Scan_Failures = "Scan Failures";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Scan_Retries = new javax.cim.UnsignedInteger16(
                    "3");

            /**
             * constant for value entry Scan Retries (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_Scan_Retries = "Scan Retries";

            /**
             * constant for value map entry 4
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Pick_Successes = new javax.cim.UnsignedInteger16(
                    "4");

            /**
             * constant for value entry Pick Successes (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_Pick_Successes = "Pick Successes";

            /**
             * constant for value map entry 5
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Pick_Failures = new javax.cim.UnsignedInteger16(
                    "5");

            /**
             * constant for value entry Pick Failures (corresponds to mapEntry 5 )
             */
            public final static String VALUE_ENTRY_Pick_Failures = "Pick Failures";

            /**
             * constant for value map entry 6
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Pick_Retries = new javax.cim.UnsignedInteger16(
                    "6");

            /**
             * constant for value entry Pick Retries (corresponds to mapEntry 6 )
             */
            public final static String VALUE_ENTRY_Pick_Retries = "Pick Retries";

            /**
             * constant for value map entry 7
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Put_Successes = new javax.cim.UnsignedInteger16(
                    "7");

            /**
             * constant for value entry Put Successes (corresponds to mapEntry 7 )
             */
            public final static String VALUE_ENTRY_Put_Successes = "Put Successes";

            /**
             * constant for value map entry 8
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Put_Failures = new javax.cim.UnsignedInteger16(
                    "8");

            /**
             * constant for value entry Put Failures (corresponds to mapEntry 8 )
             */
            public final static String VALUE_ENTRY_Put_Failures = "Put Failures";

            /**
             * constant for value map entry 9
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Put_Retries = new javax.cim.UnsignedInteger16(
                    "9");

            /**
             * constant for value entry Put Retries (corresponds to mapEntry 9 )
             */
            public final static String VALUE_ENTRY_Put_Retries = "Put Retries";

            /**
             * get the ValueMapEntry of the given value
             * @param value the value to find the ValueMapEntry for
             * @return the ValueMap entry or null if not found
             */
            //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@7020702
            public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

                if (VALUE_ENTRY_All.equals(value)) {
                    return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_All;
                }

                if (VALUE_ENTRY_Scan_Successes.equals(value)) {
                    return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Scan_Successes;
                }

                if (VALUE_ENTRY_Scan_Failures.equals(value)) {
                    return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Scan_Failures;
                }

                if (VALUE_ENTRY_Scan_Retries.equals(value)) {
                    return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Scan_Retries;
                }

                if (VALUE_ENTRY_Pick_Successes.equals(value)) {
                    return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Pick_Successes;
                }

                if (VALUE_ENTRY_Pick_Failures.equals(value)) {
                    return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Pick_Failures;
                }

                if (VALUE_ENTRY_Pick_Retries.equals(value)) {
                    return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Pick_Retries;
                }

                if (VALUE_ENTRY_Put_Successes.equals(value)) {
                    return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Put_Successes;
                }

                if (VALUE_ENTRY_Put_Failures.equals(value)) {
                    return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Put_Failures;
                }

                if (VALUE_ENTRY_Put_Retries.equals(value)) {
                    return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Put_Retries;
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

                if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Scan_Successes.intValue()) {
                    return VALUE_ENTRY_Scan_Successes;
                }

                if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Scan_Failures.intValue()) {
                    return VALUE_ENTRY_Scan_Failures;
                }

                if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Scan_Retries.intValue()) {
                    return VALUE_ENTRY_Scan_Retries;
                }

                if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Pick_Successes.intValue()) {
                    return VALUE_ENTRY_Pick_Successes;
                }

                if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Pick_Failures.intValue()) {
                    return VALUE_ENTRY_Pick_Failures;
                }

                if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Pick_Retries.intValue()) {
                    return VALUE_ENTRY_Pick_Retries;
                }

                if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Put_Successes.intValue()) {
                    return VALUE_ENTRY_Put_Successes;
                }

                if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Put_Failures.intValue()) {
                    return VALUE_ENTRY_Put_Failures;
                }

                if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Put_Retries.intValue()) {
                    return VALUE_ENTRY_Put_Retries;
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
                    VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Scan_Successes,
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Scan_Failures,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Scan_Retries,
                    VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Pick_Successes,
                    VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Pick_Failures,
                    VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Pick_Retries,
                    VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Put_Successes,
                    VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Put_Failures,
                    VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Put_Retries };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter SelectedCounter of the method ResetCounter   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_All,
                    VALUE_ENTRY_Scan_Successes, VALUE_ENTRY_Scan_Failures,
                    VALUE_ENTRY_Scan_Retries, VALUE_ENTRY_Pick_Successes,
                    VALUE_ENTRY_Pick_Failures, VALUE_ENTRY_Pick_Retries, VALUE_ENTRY_Put_Successes,
                    VALUE_ENTRY_Put_Failures, VALUE_ENTRY_Put_Retries };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter SelectedCounter of the method ResetCounter   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_All,
                    VALUE_ENTRY_Scan_Successes, VALUE_ENTRY_Scan_Failures,
                    VALUE_ENTRY_Scan_Retries, VALUE_ENTRY_Pick_Successes,
                    VALUE_ENTRY_Pick_Failures, VALUE_ENTRY_Pick_Retries, VALUE_ENTRY_Put_Successes,
                    VALUE_ENTRY_Put_Failures, VALUE_ENTRY_Put_Retries };

        }
    }

    /**
     * Constants of property PickFailures
     * The number of failed picks.
     */
    public static class PROPERTY_PICKFAILURES {
        /**
         * name of the property PickFailures
         */
        public final static String NAME = "PickFailures";

    }

    /**
     * Constants of property PickRetries
     * The number of retried picks.
     */
    public static class PROPERTY_PICKRETRIES {
        /**
         * name of the property PickRetries
         */
        public final static String NAME = "PickRetries";

    }

    /**
     * Constants of property PickSuccesses
     * The number of successful picks.
     */
    public static class PROPERTY_PICKSUCCESSES {
        /**
         * name of the property PickSuccesses
         */
        public final static String NAME = "PickSuccesses";

    }

    /**
     * Constants of property PutFailures
     * The number of failed puts.
     */
    public static class PROPERTY_PUTFAILURES {
        /**
         * name of the property PutFailures
         */
        public final static String NAME = "PutFailures";

    }

    /**
     * Constants of property PutRetries
     * The number of retried puts.
     */
    public static class PROPERTY_PUTRETRIES {
        /**
         * name of the property PutRetries
         */
        public final static String NAME = "PutRetries";

    }

    /**
     * Constants of property PutSuccesses
     * The number of successful puts.
     */
    public static class PROPERTY_PUTSUCCESSES {
        /**
         * name of the property PutSuccesses
         */
        public final static String NAME = "PutSuccesses";

    }

    /**
     * Constants of property ScanFailures
     * The number of failed physical label scans.
     */
    public static class PROPERTY_SCANFAILURES {
        /**
         * name of the property ScanFailures
         */
        public final static String NAME = "ScanFailures";

    }

    /**
     * Constants of property ScanRetries
     * The number of retried physical label scans.
     */
    public static class PROPERTY_SCANRETRIES {
        /**
         * name of the property ScanRetries
         */
        public final static String NAME = "ScanRetries";

    }

    /**
     * Constants of property ScanSuccesses
     * The number of successful physical label scans.
     */
    public static class PROPERTY_SCANSUCCESSES {
        /**
         * name of the property ScanSuccesses
         */
        public final static String NAME = "ScanSuccesses";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_PhysicalStatisticalInformation.getPackages();

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
     *   Statistics related to reading physical labels and picks/puts at a specific StorageMediaLocation, or for a specific piece of PhysicalMedia. Although the same class is used to represent this data, at the instance level the object holds information for the Location (independent of the Media), OR for the Media (independent of its StorageMediaLocation). This class is deprecated in lieu of MediaPhysicalStatData, to take advantage of the simplified key structure defined there.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_MediaPhysicalStatInfo(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Statistics related to reading physical labels and picks/puts at a specific StorageMediaLocation, or for a specific piece of PhysicalMedia. Although the same class is used to represent this data, at the instance level the object holds information for the Location (independent of the Media), OR for the Media (independent of its StorageMediaLocation). This class is deprecated in lieu of MediaPhysicalStatData, to take advantage of the simplified key structure defined there.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_MediaPhysicalStatInfo(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_MediaPhysicalStatInfo() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("PickFailures", new CIMProperty("PickFailures", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("PickRetries", new CIMProperty("PickRetries", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("PickSuccesses", new CIMProperty("PickSuccesses",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PutFailures", new CIMProperty("PutFailures", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("PutRetries", new CIMProperty("PutRetries", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("PutSuccesses", new CIMProperty("PutSuccesses", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("ScanFailures", new CIMProperty("ScanFailures", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("ScanRetries", new CIMProperty("ScanRetries", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("ScanSuccesses", new CIMProperty("ScanSuccesses",
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
     * Get the property PickFailures
     *     * <br>
     * The number of failed picks.
     *     */

    public javax.cim.UnsignedInteger64 get_PickFailures() {
        CIMProperty currentProperty = getProperty(PROPERTY_PICKFAILURES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PICKFAILURES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PickFailures
     * <br>
     * The number of failed picks.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PickFailures(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PICKFAILURES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PickFailures(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PICKFAILURES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PickFailures by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PickFailures(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatInfo fco = new CIM_MediaPhysicalStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PICKFAILURES.NAME);
        if (property != null) {
            property = setPropertyValue_PickFailures(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PICKFAILURES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PickFailures
     * <br>
     * The number of failed picks.
     */

    private static CIMProperty setPropertyValue_PickFailures(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PickRetries
     *     * <br>
     * The number of retried picks.
     *     */

    public javax.cim.UnsignedInteger64 get_PickRetries() {
        CIMProperty currentProperty = getProperty(PROPERTY_PICKRETRIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PICKRETRIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PickRetries
     * <br>
     * The number of retried picks.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PickRetries(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PICKRETRIES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PickRetries(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PICKRETRIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PickRetries by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PickRetries(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatInfo fco = new CIM_MediaPhysicalStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PICKRETRIES.NAME);
        if (property != null) {
            property = setPropertyValue_PickRetries(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PICKRETRIES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PickRetries
     * <br>
     * The number of retried picks.
     */

    private static CIMProperty setPropertyValue_PickRetries(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PickSuccesses
     *     * <br>
     * The number of successful picks.
     *     */

    public javax.cim.UnsignedInteger64 get_PickSuccesses() {
        CIMProperty currentProperty = getProperty(PROPERTY_PICKSUCCESSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PICKSUCCESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PickSuccesses
     * <br>
     * The number of successful picks.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PickSuccesses(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PICKSUCCESSES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PickSuccesses(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PICKSUCCESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PickSuccesses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PickSuccesses(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatInfo fco = new CIM_MediaPhysicalStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PICKSUCCESSES.NAME);
        if (property != null) {
            property = setPropertyValue_PickSuccesses(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PICKSUCCESSES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PickSuccesses
     * <br>
     * The number of successful picks.
     */

    private static CIMProperty setPropertyValue_PickSuccesses(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PutFailures
     *     * <br>
     * The number of failed puts.
     *     */

    public javax.cim.UnsignedInteger64 get_PutFailures() {
        CIMProperty currentProperty = getProperty(PROPERTY_PUTFAILURES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PUTFAILURES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PutFailures
     * <br>
     * The number of failed puts.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PutFailures(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PUTFAILURES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PutFailures(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PUTFAILURES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PutFailures by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PutFailures(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatInfo fco = new CIM_MediaPhysicalStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PUTFAILURES.NAME);
        if (property != null) {
            property = setPropertyValue_PutFailures(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PUTFAILURES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PutFailures
     * <br>
     * The number of failed puts.
     */

    private static CIMProperty setPropertyValue_PutFailures(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PutRetries
     *     * <br>
     * The number of retried puts.
     *     */

    public javax.cim.UnsignedInteger64 get_PutRetries() {
        CIMProperty currentProperty = getProperty(PROPERTY_PUTRETRIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PUTRETRIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PutRetries
     * <br>
     * The number of retried puts.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PutRetries(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PUTRETRIES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PutRetries(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PUTRETRIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PutRetries by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PutRetries(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatInfo fco = new CIM_MediaPhysicalStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PUTRETRIES.NAME);
        if (property != null) {
            property = setPropertyValue_PutRetries(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PUTRETRIES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PutRetries
     * <br>
     * The number of retried puts.
     */

    private static CIMProperty setPropertyValue_PutRetries(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PutSuccesses
     *     * <br>
     * The number of successful puts.
     *     */

    public javax.cim.UnsignedInteger64 get_PutSuccesses() {
        CIMProperty currentProperty = getProperty(PROPERTY_PUTSUCCESSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PUTSUCCESSES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PutSuccesses
     * <br>
     * The number of successful puts.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PutSuccesses(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PUTSUCCESSES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PutSuccesses(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PUTSUCCESSES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PutSuccesses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PutSuccesses(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatInfo fco = new CIM_MediaPhysicalStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PUTSUCCESSES.NAME);
        if (property != null) {
            property = setPropertyValue_PutSuccesses(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PUTSUCCESSES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PutSuccesses
     * <br>
     * The number of successful puts.
     */

    private static CIMProperty setPropertyValue_PutSuccesses(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ScanFailures
     *     * <br>
     * The number of failed physical label scans.
     *     */

    public javax.cim.UnsignedInteger64 get_ScanFailures() {
        CIMProperty currentProperty = getProperty(PROPERTY_SCANFAILURES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SCANFAILURES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ScanFailures
     * <br>
     * The number of failed physical label scans.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ScanFailures(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SCANFAILURES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ScanFailures(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SCANFAILURES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ScanFailures by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ScanFailures(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatInfo fco = new CIM_MediaPhysicalStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SCANFAILURES.NAME);
        if (property != null) {
            property = setPropertyValue_ScanFailures(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SCANFAILURES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ScanFailures
     * <br>
     * The number of failed physical label scans.
     */

    private static CIMProperty setPropertyValue_ScanFailures(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ScanRetries
     *     * <br>
     * The number of retried physical label scans.
     *     */

    public javax.cim.UnsignedInteger64 get_ScanRetries() {
        CIMProperty currentProperty = getProperty(PROPERTY_SCANRETRIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SCANRETRIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ScanRetries
     * <br>
     * The number of retried physical label scans.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ScanRetries(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SCANRETRIES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ScanRetries(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SCANRETRIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ScanRetries by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ScanRetries(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatInfo fco = new CIM_MediaPhysicalStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SCANRETRIES.NAME);
        if (property != null) {
            property = setPropertyValue_ScanRetries(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SCANRETRIES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ScanRetries
     * <br>
     * The number of retried physical label scans.
     */

    private static CIMProperty setPropertyValue_ScanRetries(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ScanSuccesses
     *     * <br>
     * The number of successful physical label scans.
     *     */

    public javax.cim.UnsignedInteger64 get_ScanSuccesses() {
        CIMProperty currentProperty = getProperty(PROPERTY_SCANSUCCESSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SCANSUCCESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ScanSuccesses
     * <br>
     * The number of successful physical label scans.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ScanSuccesses(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SCANSUCCESSES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ScanSuccesses(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SCANSUCCESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ScanSuccesses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ScanSuccesses(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatInfo fco = new CIM_MediaPhysicalStatInfo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SCANSUCCESSES.NAME);
        if (property != null) {
            property = setPropertyValue_ScanSuccesses(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SCANSUCCESSES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ScanSuccesses
     * <br>
     * The number of successful physical label scans.
     */

    private static CIMProperty setPropertyValue_ScanSuccesses(CIMProperty currentProperty,
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
     * Method to reset the statistical counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1-3 reset the scan-related counters, 4-6 reset the 'pick'-related counters, and 7-9 reset the 'put'-related counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Element's instrumentation can also reset its internal processing and counters. The set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier on the method.
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
        return CIM_MediaPhysicalStatInfo.CIM_CLASS_NAME;
    }

}