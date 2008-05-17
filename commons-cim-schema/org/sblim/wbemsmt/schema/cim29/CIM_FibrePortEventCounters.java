/** 
 * CIM_FibrePortEventCounters.java
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
 * Description: The use of the FibrePortEventCounters class is deprecated, since FibrePort is deprecated. FCPortStatistics should be used instead, but redefines the level at which data is collected. This is why there is no direct translation of the individual counters between the two classes. This object defines error counters specific to a FibrePort.
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

public class CIM_FibrePortEventCounters extends CIM_DeviceStatisticalInformation {

    public final static String CIM_CLASS_NAME = "CIM_FibrePortEventCounters";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * Method to reset the Port event counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1 through 8 indicate a reset of the individual counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Device's instrumentation, which tabulates the errors and warnings, can also reset its internal processing and counters. 
     * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
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

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_PLOGIsReceived = new javax.cim.UnsignedInteger16(
                    "1");

            /**
             * constant for value entry PLOGIsReceived (corresponds to mapEntry 1 )
             */
            public final static String VALUE_ENTRY_PLOGIsReceived = "PLOGIsReceived";

            /**
             * constant for value map entry 2
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PLOGIsSent = new javax.cim.UnsignedInteger16(
                    "2");

            /**
             * constant for value entry PLOGIsSent (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_PLOGIsSent = "PLOGIsSent";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_EOFAbortsReceived = new javax.cim.UnsignedInteger16(
                    "3");

            /**
             * constant for value entry EOFAbortsReceived (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_EOFAbortsReceived = "EOFAbortsReceived";

            /**
             * constant for value map entry 4
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_EOFAbortsTransmitted = new javax.cim.UnsignedInteger16(
                    "4");

            /**
             * constant for value entry EOFAbortsTransmitted (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_EOFAbortsTransmitted = "EOFAbortsTransmitted";

            /**
             * constant for value map entry 5
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_PLOGOsReceived = new javax.cim.UnsignedInteger16(
                    "5");

            /**
             * constant for value entry PLOGOsReceived (corresponds to mapEntry 5 )
             */
            public final static String VALUE_ENTRY_PLOGOsReceived = "PLOGOsReceived";

            /**
             * constant for value map entry 6
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_PLOGOsSent = new javax.cim.UnsignedInteger16(
                    "6");

            /**
             * constant for value entry PLOGOsSent (corresponds to mapEntry 6 )
             */
            public final static String VALUE_ENTRY_PLOGOsSent = "PLOGOsSent";

            /**
             * constant for value map entry 7
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PLOGIsRejected = new javax.cim.UnsignedInteger16(
                    "7");

            /**
             * constant for value entry PLOGIsRejected (corresponds to mapEntry 7 )
             */
            public final static String VALUE_ENTRY_PLOGIsRejected = "PLOGIsRejected";

            /**
             * constant for value map entry 8
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_PLOGOsRejected = new javax.cim.UnsignedInteger16(
                    "8");

            /**
             * constant for value entry PLOGOsRejected (corresponds to mapEntry 8 )
             */
            public final static String VALUE_ENTRY_PLOGOsRejected = "PLOGOsRejected";

            /**
             * get the ValueMapEntry of the given value
             * @param value the value to find the ValueMapEntry for
             * @return the ValueMap entry or null if not found
             */
            //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@4ff44ff4
            public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

                if (VALUE_ENTRY_All.equals(value)) {
                    return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_All;
                }

                if (VALUE_ENTRY_PLOGIsReceived.equals(value)) {
                    return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_PLOGIsReceived;
                }

                if (VALUE_ENTRY_PLOGIsSent.equals(value)) {
                    return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PLOGIsSent;
                }

                if (VALUE_ENTRY_EOFAbortsReceived.equals(value)) {
                    return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_EOFAbortsReceived;
                }

                if (VALUE_ENTRY_EOFAbortsTransmitted.equals(value)) {
                    return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_EOFAbortsTransmitted;
                }

                if (VALUE_ENTRY_PLOGOsReceived.equals(value)) {
                    return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_PLOGOsReceived;
                }

                if (VALUE_ENTRY_PLOGOsSent.equals(value)) {
                    return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_PLOGOsSent;
                }

                if (VALUE_ENTRY_PLOGIsRejected.equals(value)) {
                    return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PLOGIsRejected;
                }

                if (VALUE_ENTRY_PLOGOsRejected.equals(value)) {
                    return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_PLOGOsRejected;
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

                if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_PLOGIsReceived.intValue()) {
                    return VALUE_ENTRY_PLOGIsReceived;
                }

                if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PLOGIsSent.intValue()) {
                    return VALUE_ENTRY_PLOGIsSent;
                }

                if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_EOFAbortsReceived.intValue()) {
                    return VALUE_ENTRY_EOFAbortsReceived;
                }

                if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_EOFAbortsTransmitted.intValue()) {
                    return VALUE_ENTRY_EOFAbortsTransmitted;
                }

                if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_PLOGOsReceived.intValue()) {
                    return VALUE_ENTRY_PLOGOsReceived;
                }

                if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_PLOGOsSent.intValue()) {
                    return VALUE_ENTRY_PLOGOsSent;
                }

                if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PLOGIsRejected.intValue()) {
                    return VALUE_ENTRY_PLOGIsRejected;
                }

                if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_PLOGOsRejected.intValue()) {
                    return VALUE_ENTRY_PLOGOsRejected;
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
                    VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_PLOGIsReceived,
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PLOGIsSent,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_EOFAbortsReceived,
                    VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_EOFAbortsTransmitted,
                    VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_PLOGOsReceived,
                    VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_PLOGOsSent,
                    VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PLOGIsRejected,
                    VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_PLOGOsRejected };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter SelectedCounter of the method ResetCounter   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_All,
                    VALUE_ENTRY_PLOGIsReceived, VALUE_ENTRY_PLOGIsSent,
                    VALUE_ENTRY_EOFAbortsReceived, VALUE_ENTRY_EOFAbortsTransmitted,
                    VALUE_ENTRY_PLOGOsReceived, VALUE_ENTRY_PLOGOsSent, VALUE_ENTRY_PLOGIsRejected,
                    VALUE_ENTRY_PLOGOsRejected };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter SelectedCounter of the method ResetCounter   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_All,
                    VALUE_ENTRY_PLOGIsReceived, VALUE_ENTRY_PLOGIsSent,
                    VALUE_ENTRY_EOFAbortsReceived, VALUE_ENTRY_EOFAbortsTransmitted,
                    VALUE_ENTRY_PLOGOsReceived, VALUE_ENTRY_PLOGOsSent, VALUE_ENTRY_PLOGIsRejected,
                    VALUE_ENTRY_PLOGOsRejected };

        }
    }

    /**
     * Constants of property EOFAbortsReceived
     * Number of frames received containing 'EOF Abort'.
     */
    public static class PROPERTY_EOFABORTSRECEIVED {
        /**
         * name of the property EOFAbortsReceived
         */
        public final static String NAME = "EOFAbortsReceived";

    }

    /**
     * Constants of property EOFAbortsTransmitted
     * Number of frames transmitted containing 'EOF Abort'.
     */
    public static class PROPERTY_EOFABORTSTRANSMITTED {
        /**
         * name of the property EOFAbortsTransmitted
         */
        public final static String NAME = "EOFAbortsTransmitted";

    }

    /**
     * Constants of property PLOGIsReceived
     * The number of login frames received.
     */
    public static class PROPERTY_PLOGISRECEIVED {
        /**
         * name of the property PLOGIsReceived
         */
        public final static String NAME = "PLOGIsReceived";

    }

    /**
     * Constants of property PLOGIsRejected
     * The number of PLOGI frames sent where the response was LS_RJT.
     */
    public static class PROPERTY_PLOGISREJECTED {
        /**
         * name of the property PLOGIsRejected
         */
        public final static String NAME = "PLOGIsRejected";

    }

    /**
     * Constants of property PLOGIsSent
     * The number of login frames sent.
     */
    public static class PROPERTY_PLOGISSENT {
        /**
         * name of the property PLOGIsSent
         */
        public final static String NAME = "PLOGIsSent";

    }

    /**
     * Constants of property PLOGOsReceived
     * The number of logouts received from various targets.
     */
    public static class PROPERTY_PLOGOSRECEIVED {
        /**
         * name of the property PLOGOsReceived
         */
        public final static String NAME = "PLOGOsReceived";

    }

    /**
     * Constants of property PLOGOsRejected
     * The number of PLOGO frames sent where the response was LS_RJT.
     */
    public static class PROPERTY_PLOGOSREJECTED {
        /**
         * name of the property PLOGOsRejected
         */
        public final static String NAME = "PLOGOsRejected";

    }

    /**
     * Constants of property PLOGOsSent
     * The number of logout frames sent.
     */
    public static class PROPERTY_PLOGOSSENT {
        /**
         * name of the property PLOGOsSent
         */
        public final static String NAME = "PLOGOsSent";

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
     *   The use of the FibrePortEventCounters class is deprecated, since FibrePort is deprecated. FCPortStatistics should be used instead, but redefines the level at which data is collected. This is why there is no direct translation of the individual counters between the two classes. This object defines error counters specific to a FibrePort.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_FibrePortEventCounters(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The use of the FibrePortEventCounters class is deprecated, since FibrePort is deprecated. FCPortStatistics should be used instead, but redefines the level at which data is collected. This is why there is no direct translation of the individual counters between the two classes. This object defines error counters specific to a FibrePort.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_FibrePortEventCounters(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_FibrePortEventCounters() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("EOFAbortsReceived", new CIMProperty("EOFAbortsReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("EOFAbortsTransmitted", new CIMProperty("EOFAbortsTransmitted",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PLOGIsReceived", new CIMProperty("PLOGIsReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PLOGIsRejected", new CIMProperty("PLOGIsRejected",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PLOGIsSent", new CIMProperty("PLOGIsSent", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("PLOGOsReceived", new CIMProperty("PLOGOsReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PLOGOsRejected", new CIMProperty("PLOGOsRejected",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PLOGOsSent", new CIMProperty("PLOGOsSent", CIMDataType.UINT64_T,
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
     * Get the property EOFAbortsReceived
     *     * <br>
     * Number of frames received containing 'EOF Abort'.
     *     */

    public javax.cim.UnsignedInteger64 get_EOFAbortsReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_EOFABORTSRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EOFABORTSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property EOFAbortsReceived
     * <br>
     * Number of frames received containing 'EOF Abort'.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EOFAbortsReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EOFABORTSRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EOFAbortsReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EOFABORTSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EOFAbortsReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EOFAbortsReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortEventCounters fco = new CIM_FibrePortEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EOFABORTSRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_EOFAbortsReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EOFABORTSRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EOFAbortsReceived
     * <br>
     * Number of frames received containing 'EOF Abort'.
     */

    private static CIMProperty setPropertyValue_EOFAbortsReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EOFAbortsTransmitted
     *     * <br>
     * Number of frames transmitted containing 'EOF Abort'.
     *     */

    public javax.cim.UnsignedInteger64 get_EOFAbortsTransmitted() {
        CIMProperty currentProperty = getProperty(PROPERTY_EOFABORTSTRANSMITTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EOFABORTSTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property EOFAbortsTransmitted
     * <br>
     * Number of frames transmitted containing 'EOF Abort'.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EOFAbortsTransmitted(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EOFABORTSTRANSMITTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EOFAbortsTransmitted(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EOFABORTSTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EOFAbortsTransmitted by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EOFAbortsTransmitted(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortEventCounters fco = new CIM_FibrePortEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EOFABORTSTRANSMITTED.NAME);
        if (property != null) {
            property = setPropertyValue_EOFAbortsTransmitted(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EOFABORTSTRANSMITTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EOFAbortsTransmitted
     * <br>
     * Number of frames transmitted containing 'EOF Abort'.
     */

    private static CIMProperty setPropertyValue_EOFAbortsTransmitted(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PLOGIsReceived
     *     * <br>
     * The number of login frames received.
     *     */

    public javax.cim.UnsignedInteger64 get_PLOGIsReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_PLOGISRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PLOGISRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PLOGIsReceived
     * <br>
     * The number of login frames received.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PLOGIsReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PLOGISRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PLOGIsReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PLOGISRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PLOGIsReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PLOGIsReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortEventCounters fco = new CIM_FibrePortEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PLOGISRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_PLOGIsReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PLOGISRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PLOGIsReceived
     * <br>
     * The number of login frames received.
     */

    private static CIMProperty setPropertyValue_PLOGIsReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PLOGIsRejected
     *     * <br>
     * The number of PLOGI frames sent where the response was LS_RJT.
     *     */

    public javax.cim.UnsignedInteger64 get_PLOGIsRejected() {
        CIMProperty currentProperty = getProperty(PROPERTY_PLOGISREJECTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PLOGISREJECTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PLOGIsRejected
     * <br>
     * The number of PLOGI frames sent where the response was LS_RJT.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PLOGIsRejected(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PLOGISREJECTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PLOGIsRejected(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PLOGISREJECTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PLOGIsRejected by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PLOGIsRejected(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortEventCounters fco = new CIM_FibrePortEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PLOGISREJECTED.NAME);
        if (property != null) {
            property = setPropertyValue_PLOGIsRejected(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PLOGISREJECTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PLOGIsRejected
     * <br>
     * The number of PLOGI frames sent where the response was LS_RJT.
     */

    private static CIMProperty setPropertyValue_PLOGIsRejected(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PLOGIsSent
     *     * <br>
     * The number of login frames sent.
     *     */

    public javax.cim.UnsignedInteger64 get_PLOGIsSent() {
        CIMProperty currentProperty = getProperty(PROPERTY_PLOGISSENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PLOGISSENT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PLOGIsSent
     * <br>
     * The number of login frames sent.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PLOGIsSent(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PLOGISSENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PLOGIsSent(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PLOGISSENT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PLOGIsSent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PLOGIsSent(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortEventCounters fco = new CIM_FibrePortEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PLOGISSENT.NAME);
        if (property != null) {
            property = setPropertyValue_PLOGIsSent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PLOGISSENT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PLOGIsSent
     * <br>
     * The number of login frames sent.
     */

    private static CIMProperty setPropertyValue_PLOGIsSent(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PLOGOsReceived
     *     * <br>
     * The number of logouts received from various targets.
     *     */

    public javax.cim.UnsignedInteger64 get_PLOGOsReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_PLOGOSRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PLOGOSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PLOGOsReceived
     * <br>
     * The number of logouts received from various targets.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PLOGOsReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PLOGOSRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PLOGOsReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PLOGOSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PLOGOsReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PLOGOsReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortEventCounters fco = new CIM_FibrePortEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PLOGOSRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_PLOGOsReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PLOGOSRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PLOGOsReceived
     * <br>
     * The number of logouts received from various targets.
     */

    private static CIMProperty setPropertyValue_PLOGOsReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PLOGOsRejected
     *     * <br>
     * The number of PLOGO frames sent where the response was LS_RJT.
     *     */

    public javax.cim.UnsignedInteger64 get_PLOGOsRejected() {
        CIMProperty currentProperty = getProperty(PROPERTY_PLOGOSREJECTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PLOGOSREJECTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PLOGOsRejected
     * <br>
     * The number of PLOGO frames sent where the response was LS_RJT.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PLOGOsRejected(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PLOGOSREJECTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PLOGOsRejected(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PLOGOSREJECTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PLOGOsRejected by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PLOGOsRejected(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortEventCounters fco = new CIM_FibrePortEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PLOGOSREJECTED.NAME);
        if (property != null) {
            property = setPropertyValue_PLOGOsRejected(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PLOGOSREJECTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PLOGOsRejected
     * <br>
     * The number of PLOGO frames sent where the response was LS_RJT.
     */

    private static CIMProperty setPropertyValue_PLOGOsRejected(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PLOGOsSent
     *     * <br>
     * The number of logout frames sent.
     *     */

    public javax.cim.UnsignedInteger64 get_PLOGOsSent() {
        CIMProperty currentProperty = getProperty(PROPERTY_PLOGOSSENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PLOGOSSENT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PLOGOsSent
     * <br>
     * The number of logout frames sent.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PLOGOsSent(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PLOGOSSENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PLOGOsSent(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PLOGOSSENT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PLOGOsSent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PLOGOsSent(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortEventCounters fco = new CIM_FibrePortEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PLOGOSSENT.NAME);
        if (property != null) {
            property = setPropertyValue_PLOGOsSent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PLOGOSSENT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PLOGOsSent
     * <br>
     * The number of logout frames sent.
     */

    private static CIMProperty setPropertyValue_PLOGOsSent(CIMProperty currentProperty,
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
     * Method to reset the Port event counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1 through 8 indicate a reset of the individual counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Device's instrumentation, which tabulates the errors and warnings, can also reset its internal processing and counters. 
     * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
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
        return CIM_FibrePortEventCounters.CIM_CLASS_NAME;
    }

}