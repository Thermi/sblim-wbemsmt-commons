/** 
 * CIM_LogicalPort.java
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
 * Description: The abstraction of a port or connection point of a Device. This object should be instantiated when the Port has independent management characteristics from the Device that includes it. Examples are a Fibre Channel Port and a USB Port.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import java.lang.reflect.*;
import javax.wbem.*;

public class CIM_LogicalPort extends CIM_LogicalDevice {

    public final static String CIM_CLASS_NAME = "CIM_LogicalPort";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * PortOnDevice associates a Port or connection point with its Device.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE = "CIM_PortOnDevice";

    /**
     * PortImplementsEndpoint associates a LogicalPort with one or more ProtocolEndpoints that are implemented on it. This class specializes the DeviceSAPImplementation association. It indicates that the referenced Endpoint is dependent on the operations of the Port Device.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT = "CIM_PortImplementsEndpoint";

    /**
     * Constants of property MaxSpeed
     * The maximum bandwidth of the Port in Bits per Second.
     */
    public static class PROPERTY_MAXSPEED {
        /**
         * name of the property MaxSpeed
         */
        public final static String NAME = "MaxSpeed";

    }

    /**
     * Constants of property RequestedSpeed
     * The requested bandwidth of the Port in Bits per Second. The actual bandwidth is reported in LogicalPort.Speed.
     */
    public static class PROPERTY_REQUESTEDSPEED {
        /**
         * name of the property RequestedSpeed
         */
        public final static String NAME = "RequestedSpeed";

    }

    /**
     * Constants of property Speed
     * The bandwidth of the Port in Bits per Second.
     */
    public static class PROPERTY_SPEED {
        /**
         * name of the property Speed
         */
        public final static String NAME = "Speed";

    }

    /**
     * Constants of property UsageRestriction
     * In some circumstances, a LogicalPort may be identifiable as a front end or back end port. An example of this would be a storage array which might have back end ports to communicate with disk drives and front end ports to communicate with hosts. If there is no restriction on the use of the port, then the value should be set to 'not restricted'.
     */
    public static class PROPERTY_USAGERESTRICTION {
        /**
         * name of the property UsageRestriction
         */
        public final static String NAME = "UsageRestriction";

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
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Front_end_only = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Front-end only (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Front_end_only = "Front-end only";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Back_end_only = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Back-end only (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Back_end_only = "Back-end only";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_restricted = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Not restricted (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Not_restricted = "Not restricted";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@5dba5dba
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Front_end_only.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Front_end_only;
            }

            if (VALUE_ENTRY_Back_end_only.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Back_end_only;
            }

            if (VALUE_ENTRY_Not_restricted.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_restricted;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Front_end_only.intValue()) {
                return VALUE_ENTRY_Front_end_only;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Back_end_only.intValue()) {
                return VALUE_ENTRY_Back_end_only;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_restricted.intValue()) {
                return VALUE_ENTRY_Not_restricted;
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
         * Value Map for the property UsageRestriction   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Front_end_only,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Back_end_only,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_restricted };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property UsageRestriction   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Front_end_only, VALUE_ENTRY_Back_end_only, VALUE_ENTRY_Not_restricted };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property UsageRestriction   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Front_end_only, VALUE_ENTRY_Back_end_only, VALUE_ENTRY_Not_restricted };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_LogicalDevice.getPackages();

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
     *   The abstraction of a port or connection point of a Device. This object should be instantiated when the Port has independent management characteristics from the Device that includes it. Examples are a Fibre Channel Port and a USB Port.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_LogicalPort(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The abstraction of a port or connection point of a Device. This object should be instantiated when the Port has independent management characteristics from the Device that includes it. Examples are a Fibre Channel Port and a USB Port.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_LogicalPort(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_LogicalPort() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("MaxSpeed", new CIMProperty("MaxSpeed", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("RequestedSpeed", new CIMProperty("RequestedSpeed",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Speed", new CIMProperty("Speed", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UsageRestriction", new CIMProperty("UsageRestriction",
                CIMDataType.UINT16_T, null));

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
     * Get the property MaxSpeed
     *     * <br>
     * The maximum bandwidth of the Port in Bits per Second.
     *     */

    public javax.cim.UnsignedInteger64 get_MaxSpeed() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXSPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXSPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MaxSpeed
     * <br>
     * The maximum bandwidth of the Port in Bits per Second.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxSpeed(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXSPEED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxSpeed(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXSPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxSpeed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxSpeed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_LogicalPort fco = new CIM_LogicalPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXSPEED.NAME);
        if (property != null) {
            property = setPropertyValue_MaxSpeed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXSPEED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxSpeed
     * <br>
     * The maximum bandwidth of the Port in Bits per Second.
     */

    private static CIMProperty setPropertyValue_MaxSpeed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RequestedSpeed
     *     * <br>
     * The requested bandwidth of the Port in Bits per Second. The actual bandwidth is reported in LogicalPort.Speed.
     *     */

    public javax.cim.UnsignedInteger64 get_RequestedSpeed() {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUESTEDSPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REQUESTEDSPEED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RequestedSpeed
     * <br>
     * The requested bandwidth of the Port in Bits per Second. The actual bandwidth is reported in LogicalPort.Speed.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RequestedSpeed(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUESTEDSPEED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RequestedSpeed(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REQUESTEDSPEED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RequestedSpeed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RequestedSpeed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_LogicalPort fco = new CIM_LogicalPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REQUESTEDSPEED.NAME);
        if (property != null) {
            property = setPropertyValue_RequestedSpeed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REQUESTEDSPEED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RequestedSpeed
     * <br>
     * The requested bandwidth of the Port in Bits per Second. The actual bandwidth is reported in LogicalPort.Speed.
     */

    private static CIMProperty setPropertyValue_RequestedSpeed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Speed
     *     * <br>
     * The bandwidth of the Port in Bits per Second.
     *     */

    public javax.cim.UnsignedInteger64 get_Speed() {
        CIMProperty currentProperty = getProperty(PROPERTY_SPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Speed
     * <br>
     * The bandwidth of the Port in Bits per Second.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Speed(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SPEED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Speed(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Speed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Speed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_LogicalPort fco = new CIM_LogicalPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SPEED.NAME);
        if (property != null) {
            property = setPropertyValue_Speed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SPEED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Speed
     * <br>
     * The bandwidth of the Port in Bits per Second.
     */

    private static CIMProperty setPropertyValue_Speed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UsageRestriction
     *     * <br>
     * In some circumstances, a LogicalPort may be identifiable as a front end or back end port. An example of this would be a storage array which might have back end ports to communicate with disk drives and front end ports to communicate with hosts. If there is no restriction on the use of the port, then the value should be set to 'not restricted'.
     *     */

    public javax.cim.UnsignedInteger16 get_UsageRestriction() {
        CIMProperty currentProperty = getProperty(PROPERTY_USAGERESTRICTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_USAGERESTRICTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property UsageRestriction
     * <br>
     * In some circumstances, a LogicalPort may be identifiable as a front end or back end port. An example of this would be a storage array which might have back end ports to communicate with disk drives and front end ports to communicate with hosts. If there is no restriction on the use of the port, then the value should be set to 'not restricted'.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UsageRestriction(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_USAGERESTRICTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UsageRestriction(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_USAGERESTRICTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UsageRestriction by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UsageRestriction(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_LogicalPort fco = new CIM_LogicalPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_USAGERESTRICTION.NAME);
        if (property != null) {
            property = setPropertyValue_UsageRestriction(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_USAGERESTRICTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UsageRestriction
     * <br>
     * In some circumstances, a LogicalPort may be identifiable as a front end or back end port. An example of this would be a storage array which might have back end ports to communicate with disk drives and front end ports to communicate with hosts. If there is no restriction on the use of the port, then the value should be set to 'not restricted'.
     */

    private static CIMProperty setPropertyValue_UsageRestriction(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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

    /**
     * Get the list with CIM_LogicalDevice objects associated by the association CIM_PortOnDevice
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalDevice_CIM_PortOnDevices(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalDevice_CIM_PortOnDevices(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE, CIM_LogicalDevice.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_LogicalDevice objects associated by the association CIM_PortOnDevice
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalDevice_CIM_PortOnDevices(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_LogicalDevice_CIM_PortOnDevices(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_LogicalDevice objects associated by the association CIM_PortOnDevice
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalDevice_CIM_PortOnDevices(WBEMClient cimClient,
            String associationClass, String resultClass, String role, String resultRole,
            boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList)
            throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associators(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole, includeQualifiers, includeClassOrigin,
                    propertyList);
        }
        catch (WBEMException e) {
            throw new AssociatorException(e, new AssociatorUserObject(this.getCimObjectPath(),
                    associationClass, resultClass, role, resultRole, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_LogicalPortHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_LogicalPortHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_LogicalPortHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_LogicalDevice(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_LogicalDevice(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_LogicalDevice(cimInstance));
                        continue;
                    }
                }
            }
            CIM_LogicalPortHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PortOnDevice
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalDevice_CIM_PortOnDeviceNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalDevice_CIM_PortOnDeviceNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE, CIM_LogicalDevice.CIM_CLASS_NAME, null,
                null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PortOnDevice
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalDevice_CIM_PortOnDeviceNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalDevice_CIM_PortOnDeviceNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PortOnDevice
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalDevice_CIM_PortOnDeviceNames(
            WBEMClient cimClient, boolean deep, String associationClass, String resultClass,
            String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole);

        }
        catch (WBEMException e) {
            throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE,
                    CIM_LogicalDevice.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_LogicalPortHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_LogicalPortHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_LogicalDevice.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_LogicalPortHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_PortOnDevice associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_PortOnDevice(WBEMClient cimClient,
            boolean includeQualifiers, boolean includeClassOrigin, String role,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_LogicalPortHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_LogicalPortHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PortOnDeviceHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PortOnDevice(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_PortOnDevice(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_PortOnDevice(cimInstance));
                        continue;
                    }
                }
            }
            CIM_LogicalPortHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get a list of CIMObjectPath items of the associations CIM_PortOnDevice
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_PortOnDevice(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTONDEVICE, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_LogicalPortHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_LogicalPortHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PortOnDevice.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_LogicalPortHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_ProtocolEndpoint objects associated by the association CIM_PortImplementsEndpoint
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ProtocolEndpoint_CIM_PortImplementsEndpoints(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ProtocolEndpoint_CIM_PortImplementsEndpoints(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT,
                CIM_ProtocolEndpoint.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_ProtocolEndpoint objects associated by the association CIM_PortImplementsEndpoint
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ProtocolEndpoint_CIM_PortImplementsEndpoints(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ProtocolEndpoint_CIM_PortImplementsEndpoints(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_ProtocolEndpoint objects associated by the association CIM_PortImplementsEndpoint
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ProtocolEndpoint_CIM_PortImplementsEndpoints(
            WBEMClient cimClient, String associationClass, String resultClass, String role,
            String resultRole, boolean includeQualifiers, boolean includeClassOrigin,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associators(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole, includeQualifiers, includeClassOrigin,
                    propertyList);
        }
        catch (WBEMException e) {
            throw new AssociatorException(e, new AssociatorUserObject(this.getCimObjectPath(),
                    associationClass, resultClass, role, resultRole, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_LogicalPortHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_LogicalPortHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_LogicalPortHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ProtocolEndpoint(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_ProtocolEndpoint(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_ProtocolEndpoint(cimInstance));
                        continue;
                    }
                }
            }
            CIM_LogicalPortHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PortImplementsEndpoint
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ProtocolEndpoint_CIM_PortImplementsEndpointNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ProtocolEndpoint_CIM_PortImplementsEndpointNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT,
                CIM_ProtocolEndpoint.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PortImplementsEndpoint
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ProtocolEndpoint_CIM_PortImplementsEndpointNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ProtocolEndpoint_CIM_PortImplementsEndpointNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PortImplementsEndpoint
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ProtocolEndpoint_CIM_PortImplementsEndpointNames(
            WBEMClient cimClient, boolean deep, String associationClass, String resultClass,
            String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole);

        }
        catch (WBEMException e) {
            throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT,
                    CIM_ProtocolEndpoint.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_LogicalPortHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_LogicalPortHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ProtocolEndpoint.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_LogicalPortHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_PortImplementsEndpoint associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_PortImplementsEndpoint(WBEMClient cimClient,
            boolean includeQualifiers, boolean includeClassOrigin, String role,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_LogicalPortHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_LogicalPortHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PortImplementsEndpointHelper
                            .findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PortImplementsEndpoint(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_PortImplementsEndpoint(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_PortImplementsEndpoint(cimInstance));
                        continue;
                    }
                }
            }
            CIM_LogicalPortHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get a list of CIMObjectPath items of the associations CIM_PortImplementsEndpoint
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_PortImplementsEndpoint(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e,
                    new ReferenceNamesUserObject(this.getCimObjectPath(),
                            CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTIMPLEMENTSENDPOINT, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_LogicalPortHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_LogicalPortHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PortImplementsEndpoint.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_LogicalPortHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

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
        return CIM_LogicalPort.CIM_CLASS_NAME;
    }

}