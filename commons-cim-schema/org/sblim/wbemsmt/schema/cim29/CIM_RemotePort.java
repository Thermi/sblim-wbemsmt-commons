/** 
 * CIM_RemotePort.java
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
 * Description: RemotePort adds port information to the access data (such as IP Address), specified in and inherited from RemoteServiceAccessPoint. For example, using the additional properties in this class, one could indicate that UDP Port 123 is accessed at IP Address xyz. The IP Address would be specified in the inherited AccessInfo property, while the UDP Port number would be specified in this class' property, PortInfo.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_RemotePort extends CIM_RemoteServiceAccessPoint {

    public final static String CIM_CLASS_NAME = "CIM_RemotePort";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property OtherProtocolDescription
     * Describes the protocol when the property PortProtocol is set to 1 ("Other").
     */
    public static class PROPERTY_OTHERPROTOCOLDESCRIPTION {
        /**
         * name of the property OtherProtocolDescription
         */
        public final static String NAME = "OtherProtocolDescription";

    }

    /**
     * Constants of property PortInfo
     * Port information that may further specify the remote access information.
     */
    public static class PROPERTY_PORTINFO {
        /**
         * name of the property PortInfo
         */
        public final static String NAME = "PortInfo";

    }

    /**
     * Constants of property PortProtocol
     * An enumerated integer describing the protocol of the port addressed by PortInformation.
     */
    public static class PROPERTY_PORTPROTOCOL {
        /**
         * name of the property PortProtocol
         */
        public final static String NAME = "PortProtocol";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_TCP = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry TCP (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_TCP = "TCP";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_UDP = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry UDP (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_UDP = "UDP";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Specific (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Specific = "Vendor Specific";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1840184
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_TCP.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_TCP;
            }

            if (VALUE_ENTRY_UDP.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_UDP;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_TCP.intValue()) {
                return VALUE_ENTRY_TCP;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_UDP.intValue()) {
                return VALUE_ENTRY_UDP;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Specific;
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
         * Value Map for the property PortProtocol   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_TCP,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_UDP };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PortProtocol   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_TCP,
                VALUE_ENTRY_UDP, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PortProtocol   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_TCP, VALUE_ENTRY_UDP };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_RemoteServiceAccessPoint.getPackages();

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
     *   RemotePort adds port information to the access data (such as IP Address), specified in and inherited from RemoteServiceAccessPoint. For example, using the additional properties in this class, one could indicate that UDP Port 123 is accessed at IP Address xyz. The IP Address would be specified in the inherited AccessInfo property, while the UDP Port number would be specified in this class' property, PortInfo.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_RemotePort(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   RemotePort adds port information to the access data (such as IP Address), specified in and inherited from RemoteServiceAccessPoint. For example, using the additional properties in this class, one could indicate that UDP Port 123 is accessed at IP Address xyz. The IP Address would be specified in the inherited AccessInfo property, while the UDP Port number would be specified in this class' property, PortInfo.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_RemotePort(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_RemotePort() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("OtherProtocolDescription", new CIMProperty(
                "OtherProtocolDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("PortInfo", new CIMProperty("PortInfo", CIMDataType.STRING_T, null));
        propertiesToCheck.put("PortProtocol", new CIMProperty("PortProtocol", CIMDataType.UINT16_T,
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
     * Get the property OtherProtocolDescription
     *     * <br>
     * Describes the protocol when the property PortProtocol is set to 1 ("Other").
     *     */

    public String get_OtherProtocolDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERPROTOCOLDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERPROTOCOLDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherProtocolDescription
     * <br>
     * Describes the protocol when the property PortProtocol is set to 1 ("Other").
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherProtocolDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERPROTOCOLDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherProtocolDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERPROTOCOLDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherProtocolDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherProtocolDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_RemotePort fco = new CIM_RemotePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERPROTOCOLDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherProtocolDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERPROTOCOLDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherProtocolDescription
     * <br>
     * Describes the protocol when the property PortProtocol is set to 1 ("Other").
     */

    private static CIMProperty setPropertyValue_OtherProtocolDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PortInfo
     *     * <br>
     * Port information that may further specify the remote access information.
     *     */

    public String get_PortInfo() {
        CIMProperty currentProperty = getProperty(PROPERTY_PORTINFO.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PORTINFO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property PortInfo
     * <br>
     * Port information that may further specify the remote access information.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PortInfo(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PORTINFO.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PortInfo(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PORTINFO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PortInfo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PortInfo(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_RemotePort fco = new CIM_RemotePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PORTINFO.NAME);
        if (property != null) {
            property = setPropertyValue_PortInfo(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PORTINFO.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PortInfo
     * <br>
     * Port information that may further specify the remote access information.
     */

    private static CIMProperty setPropertyValue_PortInfo(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PortProtocol
     *     * <br>
     * An enumerated integer describing the protocol of the port addressed by PortInformation.
     *     */

    public javax.cim.UnsignedInteger16 get_PortProtocol() {
        CIMProperty currentProperty = getProperty(PROPERTY_PORTPROTOCOL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PORTPROTOCOL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PortProtocol
     * <br>
     * An enumerated integer describing the protocol of the port addressed by PortInformation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PortProtocol(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PORTPROTOCOL.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PortProtocol(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PORTPROTOCOL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PortProtocol by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PortProtocol(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_RemotePort fco = new CIM_RemotePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PORTPROTOCOL.NAME);
        if (property != null) {
            property = setPropertyValue_PortProtocol(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PORTPROTOCOL.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PortProtocol
     * <br>
     * An enumerated integer describing the protocol of the port addressed by PortInformation.
     */

    private static CIMProperty setPropertyValue_PortProtocol(CIMProperty currentProperty,
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
        return CIM_RemotePort.CIM_CLASS_NAME;
    }

}