/** 
 * CIM_PhysicalFrame.java
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
 * Description: PhysicalFrame is a superclass of Rack, Chassis and other frame enclosures, as they are defined in extension classes. Properties like visible or audible alarm, and data related to security breaches are in this superclass.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_PhysicalFrame extends CIM_PhysicalPackage {

    public final static String CIM_CLASS_NAME = "CIM_PhysicalFrame";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AudibleAlarm
     * Boolean indicating whether the Frame is equipped with an audible alarm.
     */
    public static class PROPERTY_AUDIBLEALARM {
        /**
         * name of the property AudibleAlarm
         */
        public final static String NAME = "AudibleAlarm";

    }

    /**
     * Constants of property BreachDescription
     * BreachDescription is a free-form string providing more information if the SecurityBreach property indicates that a breach or some other security-related event occurred.
     */
    public static class PROPERTY_BREACHDESCRIPTION {
        /**
         * name of the property BreachDescription
         */
        public final static String NAME = "BreachDescription";

    }

    /**
     * Constants of property CableManagementStrategy
     * CableManagementStrategy is a free-form string that contains information on how the various cables are connected and bundled for the Frame. With many networking, storage-related and power cables, cable management can be a complex and challenging endeavor. This string property contains information to aid in assembly and service of the Frame.
     */
    public static class PROPERTY_CABLEMANAGEMENTSTRATEGY {
        /**
         * name of the property CableManagementStrategy
         */
        public final static String NAME = "CableManagementStrategy";

    }

    /**
     * Constants of property IsLocked
     * Boolean indicating that the Frame is currently locked.
     */
    public static class PROPERTY_ISLOCKED {
        /**
         * name of the property IsLocked
         */
        public final static String NAME = "IsLocked";

    }

    /**
     * Constants of property LockPresent
     * Boolean indicating whether the Frame is protected with a lock.
     */
    public static class PROPERTY_LOCKPRESENT {
        /**
         * name of the property LockPresent
         */
        public final static String NAME = "LockPresent";

    }

    /**
     * Constants of property SecurityBreach
     * SecurityBreach is an enumerated, integer-valued property indicating whether a physical breach of the Frame was attempted but unsuccessful (value=4) or attempted and successful (5). Also, the values, "Unknown", "Other" or "No Breach", can be specified.
     */
    public static class PROPERTY_SECURITYBREACH {
        /**
         * name of the property SecurityBreach
         */
        public final static String NAME = "SecurityBreach";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_No_Breach = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry No Breach (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_No_Breach = "No Breach";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Breach_Attempted = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Breach Attempted (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Breach_Attempted = "Breach Attempted";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Breach_Successful = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Breach Successful (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Breach_Successful = "Breach Successful";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@388c388c
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_No_Breach.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_No_Breach;
            }

            if (VALUE_ENTRY_Breach_Attempted.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Breach_Attempted;
            }

            if (VALUE_ENTRY_Breach_Successful.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Breach_Successful;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_No_Breach.intValue()) {
                return VALUE_ENTRY_No_Breach;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Breach_Attempted.intValue()) {
                return VALUE_ENTRY_Breach_Attempted;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Breach_Successful.intValue()) {
                return VALUE_ENTRY_Breach_Successful;
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
         * Value Map for the property SecurityBreach   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_No_Breach,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Breach_Attempted,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Breach_Successful };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SecurityBreach   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_No_Breach, VALUE_ENTRY_Breach_Attempted, VALUE_ENTRY_Breach_Successful };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SecurityBreach   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_No_Breach, VALUE_ENTRY_Breach_Attempted,
                VALUE_ENTRY_Breach_Successful };

    }

    /**
     * Constants of property ServiceDescriptions
     * An array of free-form strings providing more detailed explanations for any of the entries in the Service Philosophy array. Note, each entry of this array is related to the entry in ServicePhilosophy that is located at the same index.
     */
    public static class PROPERTY_SERVICEDESCRIPTIONS {
        /**
         * name of the property ServiceDescriptions
         */
        public final static String NAME = "ServiceDescriptions";

    }

    /**
     * Constants of property ServicePhilosophy
     * ServicePhilosophy is an enumerated, integer-valued array that indicates whether the Frame is serviced from the top (value=2), front (3), back (4) or side (5), whether it has sliding trays (6) or removable sides (7), and/or whether the Frame is moveable (8), for example, having rollers.
     */
    public static class PROPERTY_SERVICEPHILOSOPHY {
        /**
         * name of the property ServicePhilosophy
         */
        public final static String NAME = "ServicePhilosophy";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Service_From_Top = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Service From Top (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Service_From_Top = "Service From Top";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Service_From_Front = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Service From Front (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Service_From_Front = "Service From Front";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Service_From_Back = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Service From Back (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Service_From_Back = "Service From Back";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Service_From_Side = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Service From Side (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Service_From_Side = "Service From Side";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Sliding_Trays = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Sliding Trays (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Sliding_Trays = "Sliding Trays";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Removable_Sides = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Removable Sides (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Removable_Sides = "Removable Sides";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Moveable = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Moveable (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Moveable = "Moveable";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@49a849a8
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Service_From_Top.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Service_From_Top;
            }

            if (VALUE_ENTRY_Service_From_Front.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Service_From_Front;
            }

            if (VALUE_ENTRY_Service_From_Back.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Service_From_Back;
            }

            if (VALUE_ENTRY_Service_From_Side.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Service_From_Side;
            }

            if (VALUE_ENTRY_Sliding_Trays.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Sliding_Trays;
            }

            if (VALUE_ENTRY_Removable_Sides.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Removable_Sides;
            }

            if (VALUE_ENTRY_Moveable.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Moveable;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Service_From_Top.intValue()) {
                return VALUE_ENTRY_Service_From_Top;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Service_From_Front.intValue()) {
                return VALUE_ENTRY_Service_From_Front;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Service_From_Back.intValue()) {
                return VALUE_ENTRY_Service_From_Back;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Service_From_Side.intValue()) {
                return VALUE_ENTRY_Service_From_Side;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Sliding_Trays.intValue()) {
                return VALUE_ENTRY_Sliding_Trays;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Removable_Sides.intValue()) {
                return VALUE_ENTRY_Removable_Sides;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Moveable.intValue()) {
                return VALUE_ENTRY_Moveable;
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
         * Value Map for the property ServicePhilosophy   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Service_From_Top,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Service_From_Front,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Service_From_Back,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Service_From_Side,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Sliding_Trays,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Removable_Sides,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Moveable };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ServicePhilosophy   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Service_From_Top, VALUE_ENTRY_Service_From_Front,
                VALUE_ENTRY_Service_From_Back, VALUE_ENTRY_Service_From_Side,
                VALUE_ENTRY_Sliding_Trays, VALUE_ENTRY_Removable_Sides, VALUE_ENTRY_Moveable };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ServicePhilosophy   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Service_From_Top, VALUE_ENTRY_Service_From_Front,
                VALUE_ENTRY_Service_From_Back, VALUE_ENTRY_Service_From_Side,
                VALUE_ENTRY_Sliding_Trays, VALUE_ENTRY_Removable_Sides, VALUE_ENTRY_Moveable };

    }

    /**
     * Constants of property VisibleAlarm
     * Boolean indicating that the equipment includes a visible alarm.
     */
    public static class PROPERTY_VISIBLEALARM {
        /**
         * name of the property VisibleAlarm
         */
        public final static String NAME = "VisibleAlarm";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_PhysicalPackage.getPackages();

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
     *   PhysicalFrame is a superclass of Rack, Chassis and other frame enclosures, as they are defined in extension classes. Properties like visible or audible alarm, and data related to security breaches are in this superclass.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_PhysicalFrame(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   PhysicalFrame is a superclass of Rack, Chassis and other frame enclosures, as they are defined in extension classes. Properties like visible or audible alarm, and data related to security breaches are in this superclass.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_PhysicalFrame(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_PhysicalFrame() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AudibleAlarm", new CIMProperty("AudibleAlarm",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("BreachDescription", new CIMProperty("BreachDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("CableManagementStrategy", new CIMProperty("CableManagementStrategy",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("IsLocked", new CIMProperty("IsLocked", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("LockPresent", new CIMProperty("LockPresent", CIMDataType.BOOLEAN_T,
                null));
        propertiesToCheck.put("SecurityBreach", new CIMProperty("SecurityBreach",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ServiceDescriptions", new CIMProperty("ServiceDescriptions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("ServicePhilosophy", new CIMProperty("ServicePhilosophy",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("VisibleAlarm", new CIMProperty("VisibleAlarm",
                CIMDataType.BOOLEAN_T, null));

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
     * Get the property AudibleAlarm
     *     * <br>
     * Boolean indicating whether the Frame is equipped with an audible alarm.
     *     */

    public Boolean get_AudibleAlarm() {
        CIMProperty currentProperty = getProperty(PROPERTY_AUDIBLEALARM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_AUDIBLEALARM.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property AudibleAlarm
     * <br>
     * Boolean indicating whether the Frame is equipped with an audible alarm.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AudibleAlarm(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_AUDIBLEALARM.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AudibleAlarm(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_AUDIBLEALARM.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AudibleAlarm by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AudibleAlarm(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_PhysicalFrame fco = new CIM_PhysicalFrame(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUDIBLEALARM.NAME);
        if (property != null) {
            property = setPropertyValue_AudibleAlarm(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_AUDIBLEALARM.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AudibleAlarm
     * <br>
     * Boolean indicating whether the Frame is equipped with an audible alarm.
     */

    private static CIMProperty setPropertyValue_AudibleAlarm(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property BreachDescription
     *     * <br>
     * BreachDescription is a free-form string providing more information if the SecurityBreach property indicates that a breach or some other security-related event occurred.
     *     */

    public String get_BreachDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_BREACHDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BREACHDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property BreachDescription
     * <br>
     * BreachDescription is a free-form string providing more information if the SecurityBreach property indicates that a breach or some other security-related event occurred.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BreachDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BREACHDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BreachDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BREACHDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BreachDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BreachDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_PhysicalFrame fco = new CIM_PhysicalFrame(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BREACHDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_BreachDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BREACHDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BreachDescription
     * <br>
     * BreachDescription is a free-form string providing more information if the SecurityBreach property indicates that a breach or some other security-related event occurred.
     */

    private static CIMProperty setPropertyValue_BreachDescription(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CableManagementStrategy
     *     * <br>
     * CableManagementStrategy is a free-form string that contains information on how the various cables are connected and bundled for the Frame. With many networking, storage-related and power cables, cable management can be a complex and challenging endeavor. This string property contains information to aid in assembly and service of the Frame.
     *     */

    public String get_CableManagementStrategy() {
        CIMProperty currentProperty = getProperty(PROPERTY_CABLEMANAGEMENTSTRATEGY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CABLEMANAGEMENTSTRATEGY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CableManagementStrategy
     * <br>
     * CableManagementStrategy is a free-form string that contains information on how the various cables are connected and bundled for the Frame. With many networking, storage-related and power cables, cable management can be a complex and challenging endeavor. This string property contains information to aid in assembly and service of the Frame.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CableManagementStrategy(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CABLEMANAGEMENTSTRATEGY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CableManagementStrategy(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CABLEMANAGEMENTSTRATEGY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CableManagementStrategy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CableManagementStrategy(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_PhysicalFrame fco = new CIM_PhysicalFrame(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CABLEMANAGEMENTSTRATEGY.NAME);
        if (property != null) {
            property = setPropertyValue_CableManagementStrategy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CABLEMANAGEMENTSTRATEGY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CableManagementStrategy
     * <br>
     * CableManagementStrategy is a free-form string that contains information on how the various cables are connected and bundled for the Frame. With many networking, storage-related and power cables, cable management can be a complex and challenging endeavor. This string property contains information to aid in assembly and service of the Frame.
     */

    private static CIMProperty setPropertyValue_CableManagementStrategy(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IsLocked
     *     * <br>
     * Boolean indicating that the Frame is currently locked.
     *     */

    public Boolean get_IsLocked() {
        CIMProperty currentProperty = getProperty(PROPERTY_ISLOCKED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ISLOCKED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property IsLocked
     * <br>
     * Boolean indicating that the Frame is currently locked.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IsLocked(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ISLOCKED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_IsLocked(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ISLOCKED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IsLocked by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsLocked(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_PhysicalFrame fco = new CIM_PhysicalFrame(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISLOCKED.NAME);
        if (property != null) {
            property = setPropertyValue_IsLocked(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ISLOCKED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IsLocked
     * <br>
     * Boolean indicating that the Frame is currently locked.
     */

    private static CIMProperty setPropertyValue_IsLocked(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LockPresent
     *     * <br>
     * Boolean indicating whether the Frame is protected with a lock.
     *     */

    public Boolean get_LockPresent() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCKPRESENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOCKPRESENT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property LockPresent
     * <br>
     * Boolean indicating whether the Frame is protected with a lock.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LockPresent(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCKPRESENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LockPresent(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOCKPRESENT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LockPresent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LockPresent(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_PhysicalFrame fco = new CIM_PhysicalFrame(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOCKPRESENT.NAME);
        if (property != null) {
            property = setPropertyValue_LockPresent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOCKPRESENT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LockPresent
     * <br>
     * Boolean indicating whether the Frame is protected with a lock.
     */

    private static CIMProperty setPropertyValue_LockPresent(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SecurityBreach
     *     * <br>
     * SecurityBreach is an enumerated, integer-valued property indicating whether a physical breach of the Frame was attempted but unsuccessful (value=4) or attempted and successful (5). Also, the values, "Unknown", "Other" or "No Breach", can be specified.
     *     */

    public javax.cim.UnsignedInteger16 get_SecurityBreach() {
        CIMProperty currentProperty = getProperty(PROPERTY_SECURITYBREACH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SECURITYBREACH.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property SecurityBreach
     * <br>
     * SecurityBreach is an enumerated, integer-valued property indicating whether a physical breach of the Frame was attempted but unsuccessful (value=4) or attempted and successful (5). Also, the values, "Unknown", "Other" or "No Breach", can be specified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SecurityBreach(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SECURITYBREACH.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SecurityBreach(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SECURITYBREACH.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SecurityBreach by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SecurityBreach(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_PhysicalFrame fco = new CIM_PhysicalFrame(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SECURITYBREACH.NAME);
        if (property != null) {
            property = setPropertyValue_SecurityBreach(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SECURITYBREACH.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SecurityBreach
     * <br>
     * SecurityBreach is an enumerated, integer-valued property indicating whether a physical breach of the Frame was attempted but unsuccessful (value=4) or attempted and successful (5). Also, the values, "Unknown", "Other" or "No Breach", can be specified.
     */

    private static CIMProperty setPropertyValue_SecurityBreach(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ServiceDescriptions
     *     * <br>
     * An array of free-form strings providing more detailed explanations for any of the entries in the Service Philosophy array. Note, each entry of this array is related to the entry in ServicePhilosophy that is located at the same index.
     *     */

    public String[] get_ServiceDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_SERVICEDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SERVICEDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property ServiceDescriptions
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the entries in the Service Philosophy array. Note, each entry of this array is related to the entry in ServicePhilosophy that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ServiceDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SERVICEDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ServiceDescriptions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SERVICEDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ServiceDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ServiceDescriptions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_PhysicalFrame fco = new CIM_PhysicalFrame(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SERVICEDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_ServiceDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SERVICEDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ServiceDescriptions
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the entries in the Service Philosophy array. Note, each entry of this array is related to the entry in ServicePhilosophy that is located at the same index.
     */

    private static CIMProperty setPropertyValue_ServiceDescriptions(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ServicePhilosophy
     *     * <br>
     * ServicePhilosophy is an enumerated, integer-valued array that indicates whether the Frame is serviced from the top (value=2), front (3), back (4) or side (5), whether it has sliding trays (6) or removable sides (7), and/or whether the Frame is moveable (8), for example, having rollers.
     *     */

    public javax.cim.UnsignedInteger16[] get_ServicePhilosophy() {
        CIMProperty currentProperty = getProperty(PROPERTY_SERVICEPHILOSOPHY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SERVICEPHILOSOPHY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property ServicePhilosophy
     * <br>
     * ServicePhilosophy is an enumerated, integer-valued array that indicates whether the Frame is serviced from the top (value=2), front (3), back (4) or side (5), whether it has sliding trays (6) or removable sides (7), and/or whether the Frame is moveable (8), for example, having rollers.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ServicePhilosophy(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SERVICEPHILOSOPHY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ServicePhilosophy(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SERVICEPHILOSOPHY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ServicePhilosophy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ServicePhilosophy(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_PhysicalFrame fco = new CIM_PhysicalFrame(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SERVICEPHILOSOPHY.NAME);
        if (property != null) {
            property = setPropertyValue_ServicePhilosophy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SERVICEPHILOSOPHY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ServicePhilosophy
     * <br>
     * ServicePhilosophy is an enumerated, integer-valued array that indicates whether the Frame is serviced from the top (value=2), front (3), back (4) or side (5), whether it has sliding trays (6) or removable sides (7), and/or whether the Frame is moveable (8), for example, having rollers.
     */

    private static CIMProperty setPropertyValue_ServicePhilosophy(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property VisibleAlarm
     *     * <br>
     * Boolean indicating that the equipment includes a visible alarm.
     *     */

    public Boolean get_VisibleAlarm() {
        CIMProperty currentProperty = getProperty(PROPERTY_VISIBLEALARM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VISIBLEALARM.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property VisibleAlarm
     * <br>
     * Boolean indicating that the equipment includes a visible alarm.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_VisibleAlarm(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VISIBLEALARM.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_VisibleAlarm(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VISIBLEALARM.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property VisibleAlarm by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VisibleAlarm(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_PhysicalFrame fco = new CIM_PhysicalFrame(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VISIBLEALARM.NAME);
        if (property != null) {
            property = setPropertyValue_VisibleAlarm(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VISIBLEALARM.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property VisibleAlarm
     * <br>
     * Boolean indicating that the equipment includes a visible alarm.
     */

    private static CIMProperty setPropertyValue_VisibleAlarm(CIMProperty currentProperty,
            Boolean newValue) {
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
        return CIM_PhysicalFrame.CIM_CLASS_NAME;
    }

}