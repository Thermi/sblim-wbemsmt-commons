/** 
 * CIM_FCAdapterEventCounters.java
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
 * Description: The use of the FCAdapterEventCounters class is deprecated since FibreChannelAdapter is deprecated. FCPortStatistics should be used instead, but redefines the level at which data is collected. This is why there is no direct translation of the individual counters between the two classes. This object describes event counters specific to a FibreChannelAdapter.
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

public class CIM_FCAdapterEventCounters extends CIM_DeviceStatisticalInformation {

    public final static String CIM_CLASS_NAME = "CIM_FCAdapterEventCounters";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * Method to reset the Adapter event counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1 through 11 indicate a reset of the individual counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Device's instrumentation, which tabulates the errors and warnings, can also reset its internal processing and counters. 
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

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_ABTSFramesReceived = new javax.cim.UnsignedInteger16(
                    "1");

            /**
             * constant for value entry ABTSFramesReceived (corresponds to mapEntry 1 )
             */
            public final static String VALUE_ENTRY_ABTSFramesReceived = "ABTSFramesReceived";

            /**
             * constant for value map entry 2
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ABTSFramesSent = new javax.cim.UnsignedInteger16(
                    "2");

            /**
             * constant for value entry ABTSFramesSent (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_ABTSFramesSent = "ABTSFramesSent";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_FBSYReceived = new javax.cim.UnsignedInteger16(
                    "3");

            /**
             * constant for value entry FBSYReceived (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_FBSYReceived = "FBSYReceived";

            /**
             * constant for value map entry 4
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_PBSYReceived = new javax.cim.UnsignedInteger16(
                    "4");

            /**
             * constant for value entry PBSYReceived (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_PBSYReceived = "PBSYReceived";

            /**
             * constant for value map entry 5
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_PBSYSent = new javax.cim.UnsignedInteger16(
                    "5");

            /**
             * constant for value entry PBSYSent (corresponds to mapEntry 5 )
             */
            public final static String VALUE_ENTRY_PBSYSent = "PBSYSent";

            /**
             * constant for value map entry 6
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FRJTReceived = new javax.cim.UnsignedInteger16(
                    "6");

            /**
             * constant for value entry FRJTReceived (corresponds to mapEntry 6 )
             */
            public final static String VALUE_ENTRY_FRJTReceived = "FRJTReceived";

            /**
             * constant for value map entry 7
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PRJTReceived = new javax.cim.UnsignedInteger16(
                    "7");

            /**
             * constant for value entry PRJTReceived (corresponds to mapEntry 7 )
             */
            public final static String VALUE_ENTRY_PRJTReceived = "PRJTReceived";

            /**
             * constant for value map entry 8
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_PRJTSent = new javax.cim.UnsignedInteger16(
                    "8");

            /**
             * constant for value entry PRJTSent (corresponds to mapEntry 8 )
             */
            public final static String VALUE_ENTRY_PRJTSent = "PRJTSent";

            /**
             * constant for value map entry 9
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_PRLIRejected = new javax.cim.UnsignedInteger16(
                    "9");

            /**
             * constant for value entry PRLIRejected (corresponds to mapEntry 9 )
             */
            public final static String VALUE_ENTRY_PRLIRejected = "PRLIRejected";

            /**
             * constant for value map entry 10
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_PRLORejected = new javax.cim.UnsignedInteger16(
                    "10");

            /**
             * constant for value entry PRLORejected (corresponds to mapEntry 10 )
             */
            public final static String VALUE_ENTRY_PRLORejected = "PRLORejected";

            /**
             * constant for value map entry 11
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_ABTSFramesRejected = new javax.cim.UnsignedInteger16(
                    "11");

            /**
             * constant for value entry ABTSFramesRejected (corresponds to mapEntry 11 )
             */
            public final static String VALUE_ENTRY_ABTSFramesRejected = "ABTSFramesRejected";

            /**
             * get the ValueMapEntry of the given value
             * @param value the value to find the ValueMapEntry for
             * @return the ValueMap entry or null if not found
             */
            //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@6f286f28
            public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

                if (VALUE_ENTRY_All.equals(value)) {
                    return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_All;
                }

                if (VALUE_ENTRY_ABTSFramesReceived.equals(value)) {
                    return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_ABTSFramesReceived;
                }

                if (VALUE_ENTRY_ABTSFramesSent.equals(value)) {
                    return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ABTSFramesSent;
                }

                if (VALUE_ENTRY_FBSYReceived.equals(value)) {
                    return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_FBSYReceived;
                }

                if (VALUE_ENTRY_PBSYReceived.equals(value)) {
                    return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_PBSYReceived;
                }

                if (VALUE_ENTRY_PBSYSent.equals(value)) {
                    return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_PBSYSent;
                }

                if (VALUE_ENTRY_FRJTReceived.equals(value)) {
                    return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FRJTReceived;
                }

                if (VALUE_ENTRY_PRJTReceived.equals(value)) {
                    return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PRJTReceived;
                }

                if (VALUE_ENTRY_PRJTSent.equals(value)) {
                    return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_PRJTSent;
                }

                if (VALUE_ENTRY_PRLIRejected.equals(value)) {
                    return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_PRLIRejected;
                }

                if (VALUE_ENTRY_PRLORejected.equals(value)) {
                    return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_PRLORejected;
                }

                if (VALUE_ENTRY_ABTSFramesRejected.equals(value)) {
                    return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_ABTSFramesRejected;
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

                if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_ABTSFramesReceived.intValue()) {
                    return VALUE_ENTRY_ABTSFramesReceived;
                }

                if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ABTSFramesSent.intValue()) {
                    return VALUE_ENTRY_ABTSFramesSent;
                }

                if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_FBSYReceived.intValue()) {
                    return VALUE_ENTRY_FBSYReceived;
                }

                if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_PBSYReceived.intValue()) {
                    return VALUE_ENTRY_PBSYReceived;
                }

                if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_PBSYSent.intValue()) {
                    return VALUE_ENTRY_PBSYSent;
                }

                if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FRJTReceived.intValue()) {
                    return VALUE_ENTRY_FRJTReceived;
                }

                if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PRJTReceived.intValue()) {
                    return VALUE_ENTRY_PRJTReceived;
                }

                if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_PRJTSent.intValue()) {
                    return VALUE_ENTRY_PRJTSent;
                }

                if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_PRLIRejected.intValue()) {
                    return VALUE_ENTRY_PRLIRejected;
                }

                if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_PRLORejected.intValue()) {
                    return VALUE_ENTRY_PRLORejected;
                }

                if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_ABTSFramesRejected.intValue()) {
                    return VALUE_ENTRY_ABTSFramesRejected;
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
                    VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_ABTSFramesReceived,
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ABTSFramesSent,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_FBSYReceived,
                    VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_PBSYReceived,
                    VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_PBSYSent,
                    VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FRJTReceived,
                    VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PRJTReceived,
                    VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_PRJTSent,
                    VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_PRLIRejected,
                    VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_PRLORejected,
                    VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_ABTSFramesRejected };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter SelectedCounter of the method ResetCounter   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_All,
                    VALUE_ENTRY_ABTSFramesReceived, VALUE_ENTRY_ABTSFramesSent,
                    VALUE_ENTRY_FBSYReceived, VALUE_ENTRY_PBSYReceived, VALUE_ENTRY_PBSYSent,
                    VALUE_ENTRY_FRJTReceived, VALUE_ENTRY_PRJTReceived, VALUE_ENTRY_PRJTSent,
                    VALUE_ENTRY_PRLIRejected, VALUE_ENTRY_PRLORejected,
                    VALUE_ENTRY_ABTSFramesRejected };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter SelectedCounter of the method ResetCounter   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_All,
                    VALUE_ENTRY_ABTSFramesReceived, VALUE_ENTRY_ABTSFramesSent,
                    VALUE_ENTRY_FBSYReceived, VALUE_ENTRY_PBSYReceived, VALUE_ENTRY_PBSYSent,
                    VALUE_ENTRY_FRJTReceived, VALUE_ENTRY_PRJTReceived, VALUE_ENTRY_PRJTSent,
                    VALUE_ENTRY_PRLIRejected, VALUE_ENTRY_PRLORejected,
                    VALUE_ENTRY_ABTSFramesRejected };

        }
    }

    /**
     * Constants of property ABTSFramesReceived
     * The number of Abort sequence frames received.
     */
    public static class PROPERTY_ABTSFRAMESRECEIVED {
        /**
         * name of the property ABTSFramesReceived
         */
        public final static String NAME = "ABTSFramesReceived";

    }

    /**
     * Constants of property ABTSFramesRejected
     * The number of Abort sequence frames sent where the response was BA_RJT.
     */
    public static class PROPERTY_ABTSFRAMESREJECTED {
        /**
         * name of the property ABTSFramesRejected
         */
        public final static String NAME = "ABTSFramesRejected";

    }

    /**
     * Constants of property ABTSFramesSent
     * The number of Abort sequence frames sent.
     */
    public static class PROPERTY_ABTSFRAMESSENT {
        /**
         * name of the property ABTSFramesSent
         */
        public final static String NAME = "ABTSFramesSent";

    }

    /**
     * Constants of property FBSYsReceived
     * The number of frames busied by the Fabric.
     */
    public static class PROPERTY_FBSYSRECEIVED {
        /**
         * name of the property FBSYsReceived
         */
        public final static String NAME = "FBSYsReceived";

    }

    /**
     * Constants of property FRJTsReceived
     * The number of frames rejected by the Fabric.
     */
    public static class PROPERTY_FRJTSRECEIVED {
        /**
         * name of the property FRJTsReceived
         */
        public final static String NAME = "FRJTsReceived";

    }

    /**
     * Constants of property PBSYsReceived
     * The number of frames busied by the receiving Node.
     */
    public static class PROPERTY_PBSYSRECEIVED {
        /**
         * name of the property PBSYsReceived
         */
        public final static String NAME = "PBSYsReceived";

    }

    /**
     * Constants of property PBSYsSent
     * The number of frames busied by the Adapter itself.
     */
    public static class PROPERTY_PBSYSSENT {
        /**
         * name of the property PBSYsSent
         */
        public final static String NAME = "PBSYsSent";

    }

    /**
     * Constants of property PRJTsReceived
     * The number of frames rejected by the receiving Node.
     */
    public static class PROPERTY_PRJTSRECEIVED {
        /**
         * name of the property PRJTsReceived
         */
        public final static String NAME = "PRJTsReceived";

    }

    /**
     * Constants of property PRJTsSent
     * The number of frames rejected by the Adapter itself.
     */
    public static class PROPERTY_PRJTSSENT {
        /**
         * name of the property PRJTsSent
         */
        public final static String NAME = "PRJTsSent";

    }

    /**
     * Constants of property PRLIsRejected
     * The number of PRLI frames sent where the response was LS_RJT.
     */
    public static class PROPERTY_PRLISREJECTED {
        /**
         * name of the property PRLIsRejected
         */
        public final static String NAME = "PRLIsRejected";

    }

    /**
     * Constants of property PRLOsRejected
     * The number of PRLO frames sent where the response was LS_RJT.
     */
    public static class PROPERTY_PRLOSREJECTED {
        /**
         * name of the property PRLOsRejected
         */
        public final static String NAME = "PRLOsRejected";

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
     *   The use of the FCAdapterEventCounters class is deprecated since FibreChannelAdapter is deprecated. FCPortStatistics should be used instead, but redefines the level at which data is collected. This is why there is no direct translation of the individual counters between the two classes. This object describes event counters specific to a FibreChannelAdapter.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_FCAdapterEventCounters(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The use of the FCAdapterEventCounters class is deprecated since FibreChannelAdapter is deprecated. FCPortStatistics should be used instead, but redefines the level at which data is collected. This is why there is no direct translation of the individual counters between the two classes. This object describes event counters specific to a FibreChannelAdapter.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_FCAdapterEventCounters(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_FCAdapterEventCounters() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ABTSFramesReceived", new CIMProperty("ABTSFramesReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ABTSFramesRejected", new CIMProperty("ABTSFramesRejected",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ABTSFramesSent", new CIMProperty("ABTSFramesSent",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("FBSYsReceived", new CIMProperty("FBSYsReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("FRJTsReceived", new CIMProperty("FRJTsReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PBSYsReceived", new CIMProperty("PBSYsReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck
                .put("PBSYsSent", new CIMProperty("PBSYsSent", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PRJTsReceived", new CIMProperty("PRJTsReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck
                .put("PRJTsSent", new CIMProperty("PRJTsSent", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PRLIsRejected", new CIMProperty("PRLIsRejected",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PRLOsRejected", new CIMProperty("PRLOsRejected",
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
     * Get the property ABTSFramesReceived
     *     * <br>
     * The number of Abort sequence frames received.
     *     */

    public javax.cim.UnsignedInteger64 get_ABTSFramesReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_ABTSFRAMESRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ABTSFRAMESRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ABTSFramesReceived
     * <br>
     * The number of Abort sequence frames received.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ABTSFramesReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ABTSFRAMESRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ABTSFramesReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ABTSFRAMESRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ABTSFramesReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ABTSFramesReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FCAdapterEventCounters fco = new CIM_FCAdapterEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ABTSFRAMESRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_ABTSFramesReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ABTSFRAMESRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ABTSFramesReceived
     * <br>
     * The number of Abort sequence frames received.
     */

    private static CIMProperty setPropertyValue_ABTSFramesReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ABTSFramesRejected
     *     * <br>
     * The number of Abort sequence frames sent where the response was BA_RJT.
     *     */

    public javax.cim.UnsignedInteger64 get_ABTSFramesRejected() {
        CIMProperty currentProperty = getProperty(PROPERTY_ABTSFRAMESREJECTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ABTSFRAMESREJECTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ABTSFramesRejected
     * <br>
     * The number of Abort sequence frames sent where the response was BA_RJT.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ABTSFramesRejected(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ABTSFRAMESREJECTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ABTSFramesRejected(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ABTSFRAMESREJECTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ABTSFramesRejected by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ABTSFramesRejected(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FCAdapterEventCounters fco = new CIM_FCAdapterEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ABTSFRAMESREJECTED.NAME);
        if (property != null) {
            property = setPropertyValue_ABTSFramesRejected(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ABTSFRAMESREJECTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ABTSFramesRejected
     * <br>
     * The number of Abort sequence frames sent where the response was BA_RJT.
     */

    private static CIMProperty setPropertyValue_ABTSFramesRejected(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ABTSFramesSent
     *     * <br>
     * The number of Abort sequence frames sent.
     *     */

    public javax.cim.UnsignedInteger64 get_ABTSFramesSent() {
        CIMProperty currentProperty = getProperty(PROPERTY_ABTSFRAMESSENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ABTSFRAMESSENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ABTSFramesSent
     * <br>
     * The number of Abort sequence frames sent.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ABTSFramesSent(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ABTSFRAMESSENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ABTSFramesSent(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ABTSFRAMESSENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ABTSFramesSent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ABTSFramesSent(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FCAdapterEventCounters fco = new CIM_FCAdapterEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ABTSFRAMESSENT.NAME);
        if (property != null) {
            property = setPropertyValue_ABTSFramesSent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ABTSFRAMESSENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ABTSFramesSent
     * <br>
     * The number of Abort sequence frames sent.
     */

    private static CIMProperty setPropertyValue_ABTSFramesSent(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FBSYsReceived
     *     * <br>
     * The number of frames busied by the Fabric.
     *     */

    public javax.cim.UnsignedInteger64 get_FBSYsReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_FBSYSRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FBSYSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property FBSYsReceived
     * <br>
     * The number of frames busied by the Fabric.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FBSYsReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FBSYSRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FBSYsReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FBSYSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FBSYsReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FBSYsReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FCAdapterEventCounters fco = new CIM_FCAdapterEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FBSYSRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_FBSYsReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FBSYSRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FBSYsReceived
     * <br>
     * The number of frames busied by the Fabric.
     */

    private static CIMProperty setPropertyValue_FBSYsReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FRJTsReceived
     *     * <br>
     * The number of frames rejected by the Fabric.
     *     */

    public javax.cim.UnsignedInteger64 get_FRJTsReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_FRJTSRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FRJTSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property FRJTsReceived
     * <br>
     * The number of frames rejected by the Fabric.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FRJTsReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FRJTSRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FRJTsReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FRJTSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FRJTsReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FRJTsReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FCAdapterEventCounters fco = new CIM_FCAdapterEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FRJTSRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_FRJTsReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FRJTSRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FRJTsReceived
     * <br>
     * The number of frames rejected by the Fabric.
     */

    private static CIMProperty setPropertyValue_FRJTsReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PBSYsReceived
     *     * <br>
     * The number of frames busied by the receiving Node.
     *     */

    public javax.cim.UnsignedInteger64 get_PBSYsReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_PBSYSRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PBSYSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PBSYsReceived
     * <br>
     * The number of frames busied by the receiving Node.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PBSYsReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PBSYSRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PBSYsReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PBSYSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PBSYsReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PBSYsReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FCAdapterEventCounters fco = new CIM_FCAdapterEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PBSYSRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_PBSYsReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PBSYSRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PBSYsReceived
     * <br>
     * The number of frames busied by the receiving Node.
     */

    private static CIMProperty setPropertyValue_PBSYsReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PBSYsSent
     *     * <br>
     * The number of frames busied by the Adapter itself.
     *     */

    public javax.cim.UnsignedInteger64 get_PBSYsSent() {
        CIMProperty currentProperty = getProperty(PROPERTY_PBSYSSENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PBSYSSENT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PBSYsSent
     * <br>
     * The number of frames busied by the Adapter itself.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PBSYsSent(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PBSYSSENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PBSYsSent(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PBSYSSENT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PBSYsSent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PBSYsSent(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FCAdapterEventCounters fco = new CIM_FCAdapterEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PBSYSSENT.NAME);
        if (property != null) {
            property = setPropertyValue_PBSYsSent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PBSYSSENT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PBSYsSent
     * <br>
     * The number of frames busied by the Adapter itself.
     */

    private static CIMProperty setPropertyValue_PBSYsSent(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PRJTsReceived
     *     * <br>
     * The number of frames rejected by the receiving Node.
     *     */

    public javax.cim.UnsignedInteger64 get_PRJTsReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRJTSRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRJTSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PRJTsReceived
     * <br>
     * The number of frames rejected by the receiving Node.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PRJTsReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRJTSRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PRJTsReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRJTSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PRJTsReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PRJTsReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FCAdapterEventCounters fco = new CIM_FCAdapterEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRJTSRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_PRJTsReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRJTSRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PRJTsReceived
     * <br>
     * The number of frames rejected by the receiving Node.
     */

    private static CIMProperty setPropertyValue_PRJTsReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PRJTsSent
     *     * <br>
     * The number of frames rejected by the Adapter itself.
     *     */

    public javax.cim.UnsignedInteger64 get_PRJTsSent() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRJTSSENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRJTSSENT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PRJTsSent
     * <br>
     * The number of frames rejected by the Adapter itself.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PRJTsSent(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRJTSSENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PRJTsSent(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRJTSSENT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PRJTsSent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PRJTsSent(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FCAdapterEventCounters fco = new CIM_FCAdapterEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRJTSSENT.NAME);
        if (property != null) {
            property = setPropertyValue_PRJTsSent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRJTSSENT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PRJTsSent
     * <br>
     * The number of frames rejected by the Adapter itself.
     */

    private static CIMProperty setPropertyValue_PRJTsSent(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PRLIsRejected
     *     * <br>
     * The number of PRLI frames sent where the response was LS_RJT.
     *     */

    public javax.cim.UnsignedInteger64 get_PRLIsRejected() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRLISREJECTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRLISREJECTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PRLIsRejected
     * <br>
     * The number of PRLI frames sent where the response was LS_RJT.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PRLIsRejected(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRLISREJECTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PRLIsRejected(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRLISREJECTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PRLIsRejected by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PRLIsRejected(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FCAdapterEventCounters fco = new CIM_FCAdapterEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRLISREJECTED.NAME);
        if (property != null) {
            property = setPropertyValue_PRLIsRejected(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRLISREJECTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PRLIsRejected
     * <br>
     * The number of PRLI frames sent where the response was LS_RJT.
     */

    private static CIMProperty setPropertyValue_PRLIsRejected(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PRLOsRejected
     *     * <br>
     * The number of PRLO frames sent where the response was LS_RJT.
     *     */

    public javax.cim.UnsignedInteger64 get_PRLOsRejected() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRLOSREJECTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRLOSREJECTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PRLOsRejected
     * <br>
     * The number of PRLO frames sent where the response was LS_RJT.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PRLOsRejected(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRLOSREJECTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PRLOsRejected(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRLOSREJECTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PRLOsRejected by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PRLOsRejected(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FCAdapterEventCounters fco = new CIM_FCAdapterEventCounters(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRLOSREJECTED.NAME);
        if (property != null) {
            property = setPropertyValue_PRLOsRejected(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRLOSREJECTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PRLOsRejected
     * <br>
     * The number of PRLO frames sent where the response was LS_RJT.
     */

    private static CIMProperty setPropertyValue_PRLOsRejected(CIMProperty currentProperty,
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
     * Method to reset the Adapter event counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1 through 11 indicate a reset of the individual counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Device's instrumentation, which tabulates the errors and warnings, can also reset its internal processing and counters. 
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
        return CIM_FCAdapterEventCounters.CIM_CLASS_NAME;
    }

}