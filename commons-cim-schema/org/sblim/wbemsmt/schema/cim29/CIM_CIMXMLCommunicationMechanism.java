/** 
 * CIM_CIMXMLCommunicationMechanism.java
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
 * Description: This class specializes ObjectManagerCommunicationMechanism, adding properties specific to the CIM-XML protocol (XML encoding and CIM Operations).
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_CIMXMLCommunicationMechanism extends CIM_ObjectManagerCommunicationMechanism {

    public final static String CIM_CLASS_NAME = "CIM_CIMXMLCommunicationMechanism";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property CIMValidated
     * Describes whether the CIM Server is strictly validating (validates the XML document against the DTD) or not (loosely validating).
     */
    public static class PROPERTY_CIMVALIDATED {
        /**
         * name of the property CIMValidated
         */
        public final static String NAME = "CIMValidated";

    }

    /**
     * Constants of property CIMXMLProtocolVersion
     * Enumeration describing the CIM-XML protocol version supported by the ObjectManager. It is deprecated in lieu of a more general, inherited property (Version).
     */
    public static class PROPERTY_CIMXMLPROTOCOLVERSION {
        /**
         * name of the property CIMXMLProtocolVersion
         */
        public final static String NAME = "CIMXMLProtocolVersion";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_1_0 = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry 1.0 (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_1_0 = "1.0";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@247e247e
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_1_0.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_1_0;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_1_0.intValue()) {
                return VALUE_ENTRY_1_0;
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
         * Value Map for the property CIMXMLProtocolVersion   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_1_0 };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property CIMXMLProtocolVersion   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_1_0 };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property CIMXMLProtocolVersion   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_1_0 };

    }

    /**
     * Constants of property CommunicationMechanism
     * 
     */
    public static class PROPERTY_COMMUNICATIONMECHANISM {
        /**
         * name of the property CommunicationMechanism
         */
        public final static String NAME = "CommunicationMechanism";

    }

    /**
     * Constants of property Version
     * Enumeration describing the CIM-XML protocol version supported by the ObjectManager.
     */
    public static class PROPERTY_VERSION {
        /**
         * name of the property Version
         */
        public final static String NAME = "Version";

        /**
         * constant for value map entry 1.0
         */

        public final static String VALUE_MAP_ENTRY_1_0 = new String("1.0");

        /**
         * constant for value map entry 1.1
         */

        public final static String VALUE_MAP_ENTRY_1_1 = new String("1.1");

        /**
         * constant for value map entry 1.2
         */

        public final static String VALUE_MAP_ENTRY_1_2 = new String("1.2");

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property Version   
         */
        public final static String[] VALUE_MAP_ENTRIES = { VALUE_MAP_ENTRY_1_0,
                VALUE_MAP_ENTRY_1_1, VALUE_MAP_ENTRY_1_2 };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_ObjectManagerCommunicationMechanism.getPackages();

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
     *   This class specializes ObjectManagerCommunicationMechanism, adding properties specific to the CIM-XML protocol (XML encoding and CIM Operations).
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_CIMXMLCommunicationMechanism(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This class specializes ObjectManagerCommunicationMechanism, adding properties specific to the CIM-XML protocol (XML encoding and CIM Operations).
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_CIMXMLCommunicationMechanism(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_CIMXMLCommunicationMechanism() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CIMValidated", new CIMProperty("CIMValidated",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("CIMXMLProtocolVersion", new CIMProperty("CIMXMLProtocolVersion",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("CommunicationMechanism", new CIMProperty("CommunicationMechanism",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Version", new CIMProperty("Version", CIMDataType.STRING_T, null));

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
     * Get the property CIMValidated
     *     * <br>
     * Describes whether the CIM Server is strictly validating (validates the XML document against the DTD) or not (loosely validating).
     *     */

    public Boolean get_CIMValidated() {
        CIMProperty currentProperty = getProperty(PROPERTY_CIMVALIDATED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CIMVALIDATED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property CIMValidated
     * <br>
     * Describes whether the CIM Server is strictly validating (validates the XML document against the DTD) or not (loosely validating).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CIMValidated(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CIMVALIDATED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CIMValidated(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CIMVALIDATED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CIMValidated by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CIMValidated(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_CIMXMLCommunicationMechanism fco = new CIM_CIMXMLCommunicationMechanism(client,
                namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CIMVALIDATED.NAME);
        if (property != null) {
            property = setPropertyValue_CIMValidated(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CIMVALIDATED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CIMValidated
     * <br>
     * Describes whether the CIM Server is strictly validating (validates the XML document against the DTD) or not (loosely validating).
     */

    private static CIMProperty setPropertyValue_CIMValidated(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CIMXMLProtocolVersion
     *     * <br>
     * Enumeration describing the CIM-XML protocol version supported by the ObjectManager. It is deprecated in lieu of a more general, inherited property (Version).
     *     */

    public javax.cim.UnsignedInteger16 get_CIMXMLProtocolVersion() {
        CIMProperty currentProperty = getProperty(PROPERTY_CIMXMLPROTOCOLVERSION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CIMXMLPROTOCOLVERSION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property CIMXMLProtocolVersion
     * <br>
     * Enumeration describing the CIM-XML protocol version supported by the ObjectManager. It is deprecated in lieu of a more general, inherited property (Version).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CIMXMLProtocolVersion(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CIMXMLPROTOCOLVERSION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CIMXMLProtocolVersion(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CIMXMLPROTOCOLVERSION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CIMXMLProtocolVersion by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CIMXMLProtocolVersion(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_CIMXMLCommunicationMechanism fco = new CIM_CIMXMLCommunicationMechanism(client,
                namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CIMXMLPROTOCOLVERSION.NAME);
        if (property != null) {
            property = setPropertyValue_CIMXMLProtocolVersion(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CIMXMLPROTOCOLVERSION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CIMXMLProtocolVersion
     * <br>
     * Enumeration describing the CIM-XML protocol version supported by the ObjectManager. It is deprecated in lieu of a more general, inherited property (Version).
     */

    private static CIMProperty setPropertyValue_CIMXMLProtocolVersion(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CommunicationMechanism
     *     * <br>
     * 
     *     */

    public javax.cim.UnsignedInteger16 get_CommunicationMechanism() {
        CIMProperty currentProperty = getProperty(PROPERTY_COMMUNICATIONMECHANISM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_COMMUNICATIONMECHANISM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property CommunicationMechanism
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CommunicationMechanism(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_COMMUNICATIONMECHANISM.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CommunicationMechanism(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_COMMUNICATIONMECHANISM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CommunicationMechanism by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CommunicationMechanism(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_CIMXMLCommunicationMechanism fco = new CIM_CIMXMLCommunicationMechanism(client,
                namespace);
        CIMProperty property = fco.getProperty(PROPERTY_COMMUNICATIONMECHANISM.NAME);
        if (property != null) {
            property = setPropertyValue_CommunicationMechanism(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_COMMUNICATIONMECHANISM.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CommunicationMechanism
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_CommunicationMechanism(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Version
     *     * <br>
     * Enumeration describing the CIM-XML protocol version supported by the ObjectManager.
     *     */

    public String get_Version() {
        CIMProperty currentProperty = getProperty(PROPERTY_VERSION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Version
     * <br>
     * Enumeration describing the CIM-XML protocol version supported by the ObjectManager.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Version(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VERSION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Version(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Version by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Version(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_CIMXMLCommunicationMechanism fco = new CIM_CIMXMLCommunicationMechanism(client,
                namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VERSION.NAME);
        if (property != null) {
            property = setPropertyValue_Version(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Version
     * <br>
     * Enumeration describing the CIM-XML protocol version supported by the ObjectManager.
     */

    private static CIMProperty setPropertyValue_Version(CIMProperty currentProperty, String newValue) {
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
        return CIM_CIMXMLCommunicationMechanism.CIM_CLASS_NAME;
    }

}