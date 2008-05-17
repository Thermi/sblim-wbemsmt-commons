/** 
 * CIM_ActiveConnection.java
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
 * Description: This association defines a connection that is currently communicating, or is configured to communicate, between two ServiceAccessPoints. It is used when the connection is not treated as a ManagedElement itself (i.e., with Status, statistics, etc.), but its existence is known. The SAPs that are connected are typically at the same networking or application layer.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ActiveConnection extends CIM_SAPSAPDependency {

    public final static String CIM_CLASS_NAME = "CIM_ActiveConnection";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property IsUnidirectional
     * TRUE means that this connection is uni-directional; FALSE means that this connection is bi-directional. When the connection is unidirectional, the 'speaker' should be defined as the Antecedent reference. In a bidirectional connection, the selection of which AccessPoint is the Antecedent or Dependent is immaterial.
     */
    public static class PROPERTY_ISUNIDIRECTIONAL {
        /**
         * name of the property IsUnidirectional
         */
        public final static String NAME = "IsUnidirectional";

    }

    /**
     * Constants of property OtherTrafficDescription
     * A string describing the type of traffic that is being carried over this instance when its Type property is set to 1 (e.g., 'Other'). This property is deprecated since it is incorrectly placed on the association. Unicast, broadcast or other traffic types are not a function of the connection between the referenced endpoints, but on the addressing, protocol, and basic functionality of the endpoints.
     */
    public static class PROPERTY_OTHERTRAFFICDESCRIPTION {
        /**
         * name of the property OtherTrafficDescription
         */
        public final static String NAME = "OtherTrafficDescription";

    }

    /**
     * Constants of property TrafficType
     * The type of traffic that is carried over this connection. This property is deprecated since it is incorrectly placed on the association. Unicast, broadcast or other traffic types are not a function of the connection between the referenced endpoints, but on the addressing, protocol, and basic functionality of the endpoints.
     */
    public static class PROPERTY_TRAFFICTYPE {
        /**
         * name of the property TrafficType
         */
        public final static String NAME = "TrafficType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unicast = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Unicast (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unicast = "Unicast";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Broadcast = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Broadcast (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Broadcast = "Broadcast";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Multicast = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Multicast (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Multicast = "Multicast";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Anycast = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Anycast (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Anycast = "Anycast";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@520a520a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unicast.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unicast;
            }

            if (VALUE_ENTRY_Broadcast.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Broadcast;
            }

            if (VALUE_ENTRY_Multicast.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Multicast;
            }

            if (VALUE_ENTRY_Anycast.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Anycast;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unicast.intValue()) {
                return VALUE_ENTRY_Unicast;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Broadcast.intValue()) {
                return VALUE_ENTRY_Broadcast;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Multicast.intValue()) {
                return VALUE_ENTRY_Multicast;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Anycast.intValue()) {
                return VALUE_ENTRY_Anycast;
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
         * Value Map for the property TrafficType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unicast,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Broadcast,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Multicast,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Anycast };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property TrafficType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Unicast, VALUE_ENTRY_Broadcast, VALUE_ENTRY_Multicast,
                VALUE_ENTRY_Anycast };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property TrafficType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Unicast, VALUE_ENTRY_Broadcast,
                VALUE_ENTRY_Multicast, VALUE_ENTRY_Anycast };

    }

    /**
     * Constants of property Antecedent
     * 
     */
    public static class PROPERTY_ANTECEDENT_CIM_SERVICEACCESSPOINT {
        /**
         * name of the property Antecedent
         */
        public final static String NAME = "Antecedent";

    }

    /**
     * Constants of property Dependent
     * 
     */
    public static class PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT {
        /**
         * name of the property Dependent
         */
        public final static String NAME = "Dependent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_SAPSAPDependency.getPackages();

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
     *   This association defines a connection that is currently communicating, or is configured to communicate, between two ServiceAccessPoints. It is used when the connection is not treated as a ManagedElement itself (i.e., with Status, statistics, etc.), but its existence is known. The SAPs that are connected are typically at the same networking or application layer.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ActiveConnection(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This association defines a connection that is currently communicating, or is configured to communicate, between two ServiceAccessPoints. It is used when the connection is not treated as a ManagedElement itself (i.e., with Status, statistics, etc.), but its existence is known. The SAPs that are connected are typically at the same networking or application layer.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ActiveConnection(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ActiveConnection() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("IsUnidirectional", new CIMProperty("IsUnidirectional",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("OtherTrafficDescription", new CIMProperty("OtherTrafficDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("TrafficType", new CIMProperty("TrafficType", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("Antecedent", new CIMProperty("Antecedent", new CIMDataType(
                CIM_ServiceAccessPoint.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependent", new CIMProperty("Dependent", new CIMDataType(
                CIM_ServiceAccessPoint.CIM_CLASS_NAME), null));

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
     * Get the property IsUnidirectional
     *     * <br>
     * TRUE means that this connection is uni-directional; FALSE means that this connection is bi-directional. When the connection is unidirectional, the 'speaker' should be defined as the Antecedent reference. In a bidirectional connection, the selection of which AccessPoint is the Antecedent or Dependent is immaterial.
     *     */

    public Boolean get_IsUnidirectional() {
        CIMProperty currentProperty = getProperty(PROPERTY_ISUNIDIRECTIONAL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ISUNIDIRECTIONAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property IsUnidirectional
     * <br>
     * TRUE means that this connection is uni-directional; FALSE means that this connection is bi-directional. When the connection is unidirectional, the 'speaker' should be defined as the Antecedent reference. In a bidirectional connection, the selection of which AccessPoint is the Antecedent or Dependent is immaterial.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IsUnidirectional(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ISUNIDIRECTIONAL.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_IsUnidirectional(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ISUNIDIRECTIONAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IsUnidirectional by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsUnidirectional(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_ActiveConnection fco = new CIM_ActiveConnection(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISUNIDIRECTIONAL.NAME);
        if (property != null) {
            property = setPropertyValue_IsUnidirectional(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ISUNIDIRECTIONAL.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IsUnidirectional
     * <br>
     * TRUE means that this connection is uni-directional; FALSE means that this connection is bi-directional. When the connection is unidirectional, the 'speaker' should be defined as the Antecedent reference. In a bidirectional connection, the selection of which AccessPoint is the Antecedent or Dependent is immaterial.
     */

    private static CIMProperty setPropertyValue_IsUnidirectional(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherTrafficDescription
     *     * <br>
     * A string describing the type of traffic that is being carried over this instance when its Type property is set to 1 (e.g., 'Other'). This property is deprecated since it is incorrectly placed on the association. Unicast, broadcast or other traffic types are not a function of the connection between the referenced endpoints, but on the addressing, protocol, and basic functionality of the endpoints.
     *     */

    public String get_OtherTrafficDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERTRAFFICDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERTRAFFICDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherTrafficDescription
     * <br>
     * A string describing the type of traffic that is being carried over this instance when its Type property is set to 1 (e.g., 'Other'). This property is deprecated since it is incorrectly placed on the association. Unicast, broadcast or other traffic types are not a function of the connection between the referenced endpoints, but on the addressing, protocol, and basic functionality of the endpoints.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherTrafficDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERTRAFFICDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherTrafficDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERTRAFFICDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherTrafficDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherTrafficDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_ActiveConnection fco = new CIM_ActiveConnection(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERTRAFFICDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherTrafficDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERTRAFFICDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherTrafficDescription
     * <br>
     * A string describing the type of traffic that is being carried over this instance when its Type property is set to 1 (e.g., 'Other'). This property is deprecated since it is incorrectly placed on the association. Unicast, broadcast or other traffic types are not a function of the connection between the referenced endpoints, but on the addressing, protocol, and basic functionality of the endpoints.
     */

    private static CIMProperty setPropertyValue_OtherTrafficDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TrafficType
     *     * <br>
     * The type of traffic that is carried over this connection. This property is deprecated since it is incorrectly placed on the association. Unicast, broadcast or other traffic types are not a function of the connection between the referenced endpoints, but on the addressing, protocol, and basic functionality of the endpoints.
     *     */

    public javax.cim.UnsignedInteger16 get_TrafficType() {
        CIMProperty currentProperty = getProperty(PROPERTY_TRAFFICTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TRAFFICTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property TrafficType
     * <br>
     * The type of traffic that is carried over this connection. This property is deprecated since it is incorrectly placed on the association. Unicast, broadcast or other traffic types are not a function of the connection between the referenced endpoints, but on the addressing, protocol, and basic functionality of the endpoints.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TrafficType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TRAFFICTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TrafficType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TRAFFICTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TrafficType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TrafficType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ActiveConnection fco = new CIM_ActiveConnection(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TRAFFICTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_TrafficType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TRAFFICTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TrafficType
     * <br>
     * The type of traffic that is carried over this connection. This property is deprecated since it is incorrectly placed on the association. Unicast, broadcast or other traffic types are not a function of the connection between the referenced endpoints, but on the addressing, protocol, and basic functionality of the endpoints.
     */

    private static CIMProperty setPropertyValue_TrafficType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Antecedent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ServiceAccessPoint get_Antecedent_CIM_ServiceAccessPoint(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_SERVICEACCESSPOINT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_SERVICEACCESSPOINT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ServiceAccessPointHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Antecedent_CIM_ServiceAccessPoint(CIM_ServiceAccessPoint newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_SERVICEACCESSPOINT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Antecedent_CIM_ServiceAccessPoint(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_SERVICEACCESSPOINT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Antecedent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Antecedent_CIM_ServiceAccessPoint(WBEMClient client,
            String namespace, CIM_ServiceAccessPoint newValue) throws WbemsmtException {
        CIM_ActiveConnection fco = new CIM_ActiveConnection(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ANTECEDENT_CIM_SERVICEACCESSPOINT.NAME);
        if (property != null) {
            property = setPropertyValue_Antecedent_CIM_ServiceAccessPoint(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_SERVICEACCESSPOINT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Antecedent_CIM_ServiceAccessPoint(
            CIMProperty currentProperty, CIM_ServiceAccessPoint newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Dependent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ServiceAccessPoint get_Dependent_CIM_ServiceAccessPoint(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ServiceAccessPointHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Dependent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependent_CIM_ServiceAccessPoint(CIM_ServiceAccessPoint newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Dependent_CIM_ServiceAccessPoint(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Dependent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Dependent_CIM_ServiceAccessPoint(WBEMClient client,
            String namespace, CIM_ServiceAccessPoint newValue) throws WbemsmtException {
        CIM_ActiveConnection fco = new CIM_ActiveConnection(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT.NAME);
        if (property != null) {
            property = setPropertyValue_Dependent_CIM_ServiceAccessPoint(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependent_CIM_ServiceAccessPoint(
            CIMProperty currentProperty, CIM_ServiceAccessPoint newValue) {
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
        return CIM_ActiveConnection.CIM_CLASS_NAME;
    }

}