/** 
 * CIM_NetworkAdapterRedundancyComponent.java
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
 * Description: The use of the CIM_NetworkAdapterRedundancyComponent class has been deprecated since a specific association is not needed. Instead use the CIM_ OrderedMemberOf Collection class. CIM_NetworkAdapterRedundancyComponent indicates the role that a NetworkAdapter plays in a ExtraCapacityGroup, providing load balancing.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_NetworkAdapterRedundancyComponent extends CIM_RedundancyComponent {

    public final static String CIM_CLASS_NAME = "CIM_NetworkAdapterRedundancyComponent";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property PrimaryAdapter
     * Boolean indicating whether the Network Adapter is an original primary adapter (value=1), a preferred primary adapter (2), or both (3). Values of "Unknown" and "Not Applicable" may also be specified.
     */
    public static class PROPERTY_PRIMARYADAPTER {
        /**
         * name of the property PrimaryAdapter
         */
        public final static String NAME = "PrimaryAdapter";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Original_Primary = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Original Primary (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Original_Primary = "Original Primary";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Preferred_Primary = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Preferred Primary (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Preferred_Primary = "Preferred Primary";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Both = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Both (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Both = "Both";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@9020902
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Original_Primary.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Original_Primary;
            }

            if (VALUE_ENTRY_Preferred_Primary.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Preferred_Primary;
            }

            if (VALUE_ENTRY_Both.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Both;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_Applicable;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Original_Primary.intValue()) {
                return VALUE_ENTRY_Original_Primary;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Preferred_Primary.intValue()) {
                return VALUE_ENTRY_Preferred_Primary;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Both.intValue()) {
                return VALUE_ENTRY_Both;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
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
         * Value Map for the property PrimaryAdapter   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Original_Primary,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Preferred_Primary,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Both,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_Applicable };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PrimaryAdapter   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Original_Primary, VALUE_ENTRY_Preferred_Primary, VALUE_ENTRY_Both,
                VALUE_ENTRY_Not_Applicable };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PrimaryAdapter   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Original_Primary, VALUE_ENTRY_Preferred_Primary, VALUE_ENTRY_Both,
                VALUE_ENTRY_Not_Applicable };

    }

    /**
     * Constants of property ScopeOfBalancing
     * Indicates the scope of load balancing for the NetworkAdapters involved in the RedundancyGroup. Load balancing may be restricted to transmitting data only (value=1), receiving data only (value=2), or used for both transmit and receive (value=3).
     */
    public static class PROPERTY_SCOPEOFBALANCING {
        /**
         * name of the property ScopeOfBalancing
         */
        public final static String NAME = "ScopeOfBalancing";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Load_Balancing___Transmit_Only = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Load Balancing - Transmit Only (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Load_Balancing___Transmit_Only = "Load Balancing - Transmit Only";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Load_Balancing___Receive_Only = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Load Balancing - Receive Only (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Load_Balancing___Receive_Only = "Load Balancing - Receive Only";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Full_Load_Balancing = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Full Load Balancing (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Full_Load_Balancing = "Full Load Balancing";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@639a639a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Load_Balancing___Transmit_Only.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Load_Balancing___Transmit_Only;
            }

            if (VALUE_ENTRY_Load_Balancing___Receive_Only.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Load_Balancing___Receive_Only;
            }

            if (VALUE_ENTRY_Full_Load_Balancing.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Full_Load_Balancing;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Load_Balancing___Transmit_Only
                    .intValue()) {
                return VALUE_ENTRY_Load_Balancing___Transmit_Only;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Load_Balancing___Receive_Only
                    .intValue()) {
                return VALUE_ENTRY_Load_Balancing___Receive_Only;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Full_Load_Balancing.intValue()) {
                return VALUE_ENTRY_Full_Load_Balancing;
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
         * Value Map for the property ScopeOfBalancing   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Load_Balancing___Transmit_Only,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Load_Balancing___Receive_Only,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Full_Load_Balancing };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ScopeOfBalancing   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Load_Balancing___Transmit_Only,
                VALUE_ENTRY_Load_Balancing___Receive_Only, VALUE_ENTRY_Full_Load_Balancing };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ScopeOfBalancing   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Load_Balancing___Transmit_Only,
                VALUE_ENTRY_Load_Balancing___Receive_Only, VALUE_ENTRY_Full_Load_Balancing };

    }

    /**
     * Constants of property GroupComponent
     * 
     */
    public static class PROPERTY_GROUPCOMPONENT_CIM_EXTRACAPACITYGROUP {
        /**
         * name of the property GroupComponent
         */
        public final static String NAME = "GroupComponent";

    }

    /**
     * Constants of property PartComponent
     * 
     */
    public static class PROPERTY_PARTCOMPONENT_CIM_NETWORKADAPTER {
        /**
         * name of the property PartComponent
         */
        public final static String NAME = "PartComponent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_RedundancyComponent.getPackages();

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
     *   The use of the CIM_NetworkAdapterRedundancyComponent class has been deprecated since a specific association is not needed. Instead use the CIM_ OrderedMemberOf Collection class. CIM_NetworkAdapterRedundancyComponent indicates the role that a NetworkAdapter plays in a ExtraCapacityGroup, providing load balancing.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_NetworkAdapterRedundancyComponent(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The use of the CIM_NetworkAdapterRedundancyComponent class has been deprecated since a specific association is not needed. Instead use the CIM_ OrderedMemberOf Collection class. CIM_NetworkAdapterRedundancyComponent indicates the role that a NetworkAdapter plays in a ExtraCapacityGroup, providing load balancing.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_NetworkAdapterRedundancyComponent(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_NetworkAdapterRedundancyComponent() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("PrimaryAdapter", new CIMProperty("PrimaryAdapter",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ScopeOfBalancing", new CIMProperty("ScopeOfBalancing",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("GroupComponent", new CIMProperty("GroupComponent", new CIMDataType(
                CIM_ExtraCapacityGroup.CIM_CLASS_NAME), null));
        propertiesToCheck.put("PartComponent", new CIMProperty("PartComponent", new CIMDataType(
                CIM_NetworkAdapter.CIM_CLASS_NAME), null));

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
     * Get the property PrimaryAdapter
     *     * <br>
     * Boolean indicating whether the Network Adapter is an original primary adapter (value=1), a preferred primary adapter (2), or both (3). Values of "Unknown" and "Not Applicable" may also be specified.
     *     */

    public javax.cim.UnsignedInteger16 get_PrimaryAdapter() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIMARYADAPTER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRIMARYADAPTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PrimaryAdapter
     * <br>
     * Boolean indicating whether the Network Adapter is an original primary adapter (value=1), a preferred primary adapter (2), or both (3). Values of "Unknown" and "Not Applicable" may also be specified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PrimaryAdapter(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIMARYADAPTER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PrimaryAdapter(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRIMARYADAPTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PrimaryAdapter by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PrimaryAdapter(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_NetworkAdapterRedundancyComponent fco = new CIM_NetworkAdapterRedundancyComponent(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRIMARYADAPTER.NAME);
        if (property != null) {
            property = setPropertyValue_PrimaryAdapter(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRIMARYADAPTER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PrimaryAdapter
     * <br>
     * Boolean indicating whether the Network Adapter is an original primary adapter (value=1), a preferred primary adapter (2), or both (3). Values of "Unknown" and "Not Applicable" may also be specified.
     */

    private static CIMProperty setPropertyValue_PrimaryAdapter(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ScopeOfBalancing
     *     * <br>
     * Indicates the scope of load balancing for the NetworkAdapters involved in the RedundancyGroup. Load balancing may be restricted to transmitting data only (value=1), receiving data only (value=2), or used for both transmit and receive (value=3).
     *     */

    public javax.cim.UnsignedInteger16 get_ScopeOfBalancing() {
        CIMProperty currentProperty = getProperty(PROPERTY_SCOPEOFBALANCING.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SCOPEOFBALANCING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ScopeOfBalancing
     * <br>
     * Indicates the scope of load balancing for the NetworkAdapters involved in the RedundancyGroup. Load balancing may be restricted to transmitting data only (value=1), receiving data only (value=2), or used for both transmit and receive (value=3).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ScopeOfBalancing(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SCOPEOFBALANCING.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ScopeOfBalancing(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SCOPEOFBALANCING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ScopeOfBalancing by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ScopeOfBalancing(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_NetworkAdapterRedundancyComponent fco = new CIM_NetworkAdapterRedundancyComponent(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SCOPEOFBALANCING.NAME);
        if (property != null) {
            property = setPropertyValue_ScopeOfBalancing(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SCOPEOFBALANCING.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ScopeOfBalancing
     * <br>
     * Indicates the scope of load balancing for the NetworkAdapters involved in the RedundancyGroup. Load balancing may be restricted to transmitting data only (value=1), receiving data only (value=2), or used for both transmit and receive (value=3).
     */

    private static CIMProperty setPropertyValue_ScopeOfBalancing(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property GroupComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ExtraCapacityGroup get_GroupComponent_CIM_ExtraCapacityGroup(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_CIM_EXTRACAPACITYGROUP.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_EXTRACAPACITYGROUP.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ExtraCapacityGroupHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GroupComponent_CIM_ExtraCapacityGroup(CIM_ExtraCapacityGroup newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_CIM_EXTRACAPACITYGROUP.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_GroupComponent_CIM_ExtraCapacityGroup(
                    currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_EXTRACAPACITYGROUP.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property GroupComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GroupComponent_CIM_ExtraCapacityGroup(WBEMClient client,
            String namespace, CIM_ExtraCapacityGroup newValue) throws WbemsmtException {
        CIM_NetworkAdapterRedundancyComponent fco = new CIM_NetworkAdapterRedundancyComponent(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GROUPCOMPONENT_CIM_EXTRACAPACITYGROUP.NAME);
        if (property != null) {
            property = setPropertyValue_GroupComponent_CIM_ExtraCapacityGroup(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_EXTRACAPACITYGROUP.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_GroupComponent_CIM_ExtraCapacityGroup(
            CIMProperty currentProperty, CIM_ExtraCapacityGroup newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PartComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_NetworkAdapter get_PartComponent_CIM_NetworkAdapter(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_CIM_NETWORKADAPTER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_NETWORKADAPTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_NetworkAdapterHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PartComponent_CIM_NetworkAdapter(CIM_NetworkAdapter newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_CIM_NETWORKADAPTER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PartComponent_CIM_NetworkAdapter(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_NETWORKADAPTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PartComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PartComponent_CIM_NetworkAdapter(WBEMClient client,
            String namespace, CIM_NetworkAdapter newValue) throws WbemsmtException {
        CIM_NetworkAdapterRedundancyComponent fco = new CIM_NetworkAdapterRedundancyComponent(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARTCOMPONENT_CIM_NETWORKADAPTER.NAME);
        if (property != null) {
            property = setPropertyValue_PartComponent_CIM_NetworkAdapter(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_NETWORKADAPTER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_PartComponent_CIM_NetworkAdapter(
            CIMProperty currentProperty, CIM_NetworkAdapter newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

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
        return CIM_NetworkAdapterRedundancyComponent.CIM_CLASS_NAME;
    }

}