/** 
 * CIM_SupportAccess.java
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
 * Description: The CIM_SupportAccess association defines how to obtain assistance for a Product.
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

public class CIM_SupportAccess extends CIM_ManagedElement {

    public final static String CIM_CLASS_NAME = "CIM_SupportAccess";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * CIM_ProductSupport is an association between Product and SupportAccess that conveys how support is obtained for the Product. This is a many-to-many relationship, implying that various types of Support are available for a Product, and that the same Support object can provide assistance for multiple Products.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT = "CIM_ProductSupport";

    /**
     * Constants of property CommunicationInfo
     * CommunicationInfo provides the details of the Communication Mode. For example, if the CommunicationMode is 'Phone', CommunicationInfo specifies the phone number to be called.
     */
    public static class PROPERTY_COMMUNICATIONINFO {
        /**
         * name of the property CommunicationInfo
         */
        public final static String NAME = "CommunicationInfo";

    }

    /**
     * Constants of property CommunicationMode
     * CommunicationMode defines the form of communication in order to obtain support. For example, phone communication (value =2), fax (3) or email (8) can be specified.
     */
    public static class PROPERTY_COMMUNICATIONMODE {
        /**
         * name of the property CommunicationMode
         */
        public final static String NAME = "CommunicationMode";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Phone = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Phone (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Phone = "Phone";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Fax = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Fax (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Fax = "Fax";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_BBS = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry BBS (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_BBS = "BBS";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Online_Service = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Online Service (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Online_Service = "Online Service";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Web_Page = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Web Page (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Web_Page = "Web Page";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_FTP = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry FTP (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_FTP = "FTP";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_E_mail = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry E-mail (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_E_mail = "E-mail";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@67046704
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Phone.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Phone;
            }

            if (VALUE_ENTRY_Fax.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Fax;
            }

            if (VALUE_ENTRY_BBS.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_BBS;
            }

            if (VALUE_ENTRY_Online_Service.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Online_Service;
            }

            if (VALUE_ENTRY_Web_Page.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Web_Page;
            }

            if (VALUE_ENTRY_FTP.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_FTP;
            }

            if (VALUE_ENTRY_E_mail.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_E_mail;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Phone.intValue()) {
                return VALUE_ENTRY_Phone;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Fax.intValue()) {
                return VALUE_ENTRY_Fax;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_BBS.intValue()) {
                return VALUE_ENTRY_BBS;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Online_Service.intValue()) {
                return VALUE_ENTRY_Online_Service;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Web_Page.intValue()) {
                return VALUE_ENTRY_Web_Page;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_FTP.intValue()) {
                return VALUE_ENTRY_FTP;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_E_mail.intValue()) {
                return VALUE_ENTRY_E_mail;
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
         * Value Map for the property CommunicationMode   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Phone,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Fax, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_BBS,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Online_Service,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Web_Page, VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_FTP,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_E_mail };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property CommunicationMode   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Phone,
                VALUE_ENTRY_Fax, VALUE_ENTRY_BBS, VALUE_ENTRY_Online_Service, VALUE_ENTRY_Web_Page,
                VALUE_ENTRY_FTP, VALUE_ENTRY_E_mail };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property CommunicationMode   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Phone, VALUE_ENTRY_Fax, VALUE_ENTRY_BBS, VALUE_ENTRY_Online_Service,
                VALUE_ENTRY_Web_Page, VALUE_ENTRY_FTP, VALUE_ENTRY_E_mail };

    }

    /**
     * Constants of property Description
     * A textual description of the type of Support provided.
     */
    public static class PROPERTY_DESCRIPTION {
        /**
         * name of the property Description
         */
        public final static String NAME = "Description";

    }

    /**
     * Constants of property Locale
     * Locale defines the geographic region and/or language dialect to which this Support resource pertains.
     */
    public static class PROPERTY_LOCALE {
        /**
         * name of the property Locale
         */
        public final static String NAME = "Locale";

    }

    /**
     * Constants of property SupportAccessId
     * SupportAccessID is an arbitrary, free form string defined by the Product Vendor or by the organization that deploys the Product. This property, since it is a key, should be unique throughout the enterprise.
     */
    public static class PROPERTY_SUPPORTACCESSID {
        /**
         * name of the property SupportAccessId
         */
        public final static String NAME = "SupportAccessId";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_ManagedElement.getPackages();

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
     *   The CIM_SupportAccess association defines how to obtain assistance for a Product.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SupportAccess(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The CIM_SupportAccess association defines how to obtain assistance for a Product.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SupportAccess(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SupportAccess() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CommunicationInfo", new CIMProperty("CommunicationInfo",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("CommunicationMode", new CIMProperty("CommunicationMode",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Description", new CIMProperty("Description", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("Locale", new CIMProperty("Locale", CIMDataType.STRING_T, null));
        propertiesToCheck.put("SupportAccessId", new CIMProperty("SupportAccessId",
                CIMDataType.STRING_T, null));

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
     * Get the property CommunicationInfo
     *     * <br>
     * CommunicationInfo provides the details of the Communication Mode. For example, if the CommunicationMode is 'Phone', CommunicationInfo specifies the phone number to be called.
     *     */

    public String get_CommunicationInfo() {
        CIMProperty currentProperty = getProperty(PROPERTY_COMMUNICATIONINFO.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_COMMUNICATIONINFO.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CommunicationInfo
     * <br>
     * CommunicationInfo provides the details of the Communication Mode. For example, if the CommunicationMode is 'Phone', CommunicationInfo specifies the phone number to be called.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CommunicationInfo(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_COMMUNICATIONINFO.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CommunicationInfo(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_COMMUNICATIONINFO.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CommunicationInfo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CommunicationInfo(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SupportAccess fco = new CIM_SupportAccess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_COMMUNICATIONINFO.NAME);
        if (property != null) {
            property = setPropertyValue_CommunicationInfo(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_COMMUNICATIONINFO.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CommunicationInfo
     * <br>
     * CommunicationInfo provides the details of the Communication Mode. For example, if the CommunicationMode is 'Phone', CommunicationInfo specifies the phone number to be called.
     */

    private static CIMProperty setPropertyValue_CommunicationInfo(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CommunicationMode
     *     * <br>
     * CommunicationMode defines the form of communication in order to obtain support. For example, phone communication (value =2), fax (3) or email (8) can be specified.
     *     */

    public javax.cim.UnsignedInteger16 get_CommunicationMode() {
        CIMProperty currentProperty = getProperty(PROPERTY_COMMUNICATIONMODE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_COMMUNICATIONMODE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property CommunicationMode
     * <br>
     * CommunicationMode defines the form of communication in order to obtain support. For example, phone communication (value =2), fax (3) or email (8) can be specified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CommunicationMode(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_COMMUNICATIONMODE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CommunicationMode(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_COMMUNICATIONMODE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CommunicationMode by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CommunicationMode(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SupportAccess fco = new CIM_SupportAccess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_COMMUNICATIONMODE.NAME);
        if (property != null) {
            property = setPropertyValue_CommunicationMode(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_COMMUNICATIONMODE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CommunicationMode
     * <br>
     * CommunicationMode defines the form of communication in order to obtain support. For example, phone communication (value =2), fax (3) or email (8) can be specified.
     */

    private static CIMProperty setPropertyValue_CommunicationMode(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Description
     *     * <br>
     * A textual description of the type of Support provided.
     *     */

    public String get_Description() {
        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Description
     * <br>
     * A textual description of the type of Support provided.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Description(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Description(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Description by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Description(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SupportAccess fco = new CIM_SupportAccess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_Description(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Description
     * <br>
     * A textual description of the type of Support provided.
     */

    private static CIMProperty setPropertyValue_Description(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Locale
     *     * <br>
     * Locale defines the geographic region and/or language dialect to which this Support resource pertains.
     *     */

    public String get_Locale() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCALE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOCALE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Locale
     * <br>
     * Locale defines the geographic region and/or language dialect to which this Support resource pertains.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Locale(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCALE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Locale(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOCALE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Locale by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Locale(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_SupportAccess fco = new CIM_SupportAccess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOCALE.NAME);
        if (property != null) {
            property = setPropertyValue_Locale(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOCALE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Locale
     * <br>
     * Locale defines the geographic region and/or language dialect to which this Support resource pertains.
     */

    private static CIMProperty setPropertyValue_Locale(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SupportAccessId
     *     * <br>
     * SupportAccessID is an arbitrary, free form string defined by the Product Vendor or by the organization that deploys the Product. This property, since it is a key, should be unique throughout the enterprise.
     *     */

    public String get_key_SupportAccessId() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTACCESSID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUPPORTACCESSID.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SupportAccessId
     * <br>
     * SupportAccessID is an arbitrary, free form string defined by the Product Vendor or by the organization that deploys the Product. This property, since it is a key, should be unique throughout the enterprise.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_SupportAccessId(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTACCESSID.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_SupportAccessId(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTACCESSID.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SupportAccessId by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_SupportAccessId(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SupportAccess fco = new CIM_SupportAccess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUPPORTACCESSID.NAME);
        if (property != null) {
            property = setPropertyValue_key_SupportAccessId(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTACCESSID.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SupportAccessId
     * <br>
     * SupportAccessID is an arbitrary, free form string defined by the Product Vendor or by the organization that deploys the Product. This property, since it is a key, should be unique throughout the enterprise.
     */

    private static CIMProperty setPropertyValue_key_SupportAccessId(CIMProperty currentProperty,
            String newValue) {
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
     * Get the list with CIM_Product objects associated by the association CIM_ProductSupport
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Product_CIM_ProductSupports(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Product_CIM_ProductSupports(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT, CIM_Product.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_Product objects associated by the association CIM_ProductSupport
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Product_CIM_ProductSupports(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Product_CIM_ProductSupports(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_Product objects associated by the association CIM_ProductSupport
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Product_CIM_ProductSupports(WBEMClient cimClient,
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
                CIM_SupportAccessHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SupportAccessHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SupportAccessHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Product(cimInstance));
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
                        result.add(new CIM_Product(cimInstance));
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
                        result.add(new CIM_Product(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SupportAccessHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ProductSupport
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Product_CIM_ProductSupportNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Product_CIM_ProductSupportNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT, CIM_Product.CIM_CLASS_NAME, null,
                null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ProductSupport
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Product_CIM_ProductSupportNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Product_CIM_ProductSupportNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ProductSupport
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Product_CIM_ProductSupportNames(WBEMClient cimClient,
            boolean deep, String associationClass, String resultClass, String role,
            String resultRole) throws WbemsmtException {

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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT,
                    CIM_Product.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SupportAccessHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SupportAccessHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Product.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SupportAccessHelper.checkException(enumeration);
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
     * Get the list with CIM_ProductSupport associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ProductSupport(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SupportAccessHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SupportAccessHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ProductSupportHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ProductSupport(cimInstance));
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
                        result.add(new CIM_ProductSupport(cimInstance));
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
                        result.add(new CIM_ProductSupport(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SupportAccessHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ProductSupport
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ProductSupport(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSUPPORT, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SupportAccessHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SupportAccessHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ProductSupport.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SupportAccessHelper.checkException(enumeration);
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
        return CIM_SupportAccess.CIM_CLASS_NAME;
    }

}