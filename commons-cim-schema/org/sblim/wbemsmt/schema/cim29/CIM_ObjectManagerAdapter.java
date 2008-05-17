/** 
 * CIM_ObjectManagerAdapter.java
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
 * Description: A ObjectManagerAdapter is a Service of the CIM Object Manager. An adapter can be any service of the Object Manager that needs to be managed (e.g. started, stopped, monitored, ...). There MUST be an instance for each Adapter type.
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

public class CIM_ObjectManagerAdapter extends CIM_WBEMService {

    public final static String CIM_CLASS_NAME = "CIM_ObjectManagerAdapter";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * CommMechanismForObjectManagerAdapter is an association between an ObjectManager's communication mechanism and a ObjectManagerAdapter that supports that mechanism to translate requests and responses for the Object Manager.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER = "CIM_CommMechanismForObjectManagerAdapter";

    /**
     * Constants of property AdapterType
     * AdapterType enumerates the kind of Object Manager Adapter. If 'Other' is specified, the OtherAdapterTypeDescription property MUST be populated. 
     * Other - If the adapter does not fit into one of the other catagories in the list. If specified, the OtherAdapterTypeDescription property MUST be populated. 
     * Client - A client side adapter that responds to client operation requests, such as CIM-XML or CIM-SOAP. 
     * Provider - A provider adapter, such as DMI, SNMP, JSR48 or CMPI. 
     * Indication Handler - An Indication Handler is a service that delivers indications to a subscriber. Examples of possible Indication Handlers are CIM-XML, CIM-SOAP, SMPT (e-mail) or any other delivery mechanism. 
     * Repository - A repository is an adapter that can store/retrieve persistent data, such as CIM Qualifier Types, CIM Classes and CIM Instances. An Object Manager could use multiple repositiories at one time, for example one could be used for CIM Schema information only, while another is used for instance information. Repositories MAY be remote or local to the CIM Object Manager. Examples of repository implementations could be databases, LDAP or files.
     */
    public static class PROPERTY_ADAPTERTYPE {
        /**
         * name of the property AdapterType
         */
        public final static String NAME = "AdapterType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Client = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Client (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Client = "Client";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Provider = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Provider (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Provider = "Provider";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Indication_Handler = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Indication Handler (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Indication_Handler = "Indication Handler";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Repository = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Repository (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Repository = "Repository";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@49484948
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Client.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Client;
            }

            if (VALUE_ENTRY_Provider.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Provider;
            }

            if (VALUE_ENTRY_Indication_Handler.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Indication_Handler;
            }

            if (VALUE_ENTRY_Repository.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Repository;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Client.intValue()) {
                return VALUE_ENTRY_Client;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Provider.intValue()) {
                return VALUE_ENTRY_Provider;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Indication_Handler.intValue()) {
                return VALUE_ENTRY_Indication_Handler;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Repository.intValue()) {
                return VALUE_ENTRY_Repository;
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
         * Value Map for the property AdapterType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Client,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Provider,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Indication_Handler,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Repository };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property AdapterType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Client,
                VALUE_ENTRY_Provider, VALUE_ENTRY_Indication_Handler, VALUE_ENTRY_Repository };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property AdapterType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Client, VALUE_ENTRY_Provider, VALUE_ENTRY_Indication_Handler,
                VALUE_ENTRY_Repository };

    }

    /**
     * Constants of property ElementName
     * The ElmentName property is used as a name of the Object Manager Adapter for human interfaces. For example, "ACME ObjectManager Adapter".
     */
    public static class PROPERTY_ELEMENTNAME {
        /**
         * name of the property ElementName
         */
        public final static String NAME = "ElementName";

    }

    /**
     * Constants of property Handle
     * An implementation specific string that identifies the handle to the Object Manager Adapter.
     */
    public static class PROPERTY_HANDLE {
        /**
         * name of the property Handle
         */
        public final static String NAME = "Handle";

    }

    /**
     * Constants of property Name
     * A human-readable name that uniquely identifies the ObjectManager within a system.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property OtherAdapterTypeDescription
     * The type(s) of ObjectManagerAdapter when "Other" is included in ObjectManagerAdapterType property.
     */
    public static class PROPERTY_OTHERADAPTERTYPEDESCRIPTION {
        /**
         * name of the property OtherAdapterTypeDescription
         */
        public final static String NAME = "OtherAdapterTypeDescription";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_WBEMService.getPackages();

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
     *   A ObjectManagerAdapter is a Service of the CIM Object Manager. An adapter can be any service of the Object Manager that needs to be managed (e.g. started, stopped, monitored, ...). There MUST be an instance for each Adapter type.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ObjectManagerAdapter(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A ObjectManagerAdapter is a Service of the CIM Object Manager. An adapter can be any service of the Object Manager that needs to be managed (e.g. started, stopped, monitored, ...). There MUST be an instance for each Adapter type.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ObjectManagerAdapter(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ObjectManagerAdapter() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AdapterType", new CIMProperty("AdapterType", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("ElementName", new CIMProperty("ElementName", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("Handle", new CIMProperty("Handle", CIMDataType.STRING_T, null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherAdapterTypeDescription", new CIMProperty(
                "OtherAdapterTypeDescription", CIMDataType.STRING_T, null));

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
     * Get the property AdapterType
     *     * <br>
     * AdapterType enumerates the kind of Object Manager Adapter. If 'Other' is specified, the OtherAdapterTypeDescription property MUST be populated. 
     * Other - If the adapter does not fit into one of the other catagories in the list. If specified, the OtherAdapterTypeDescription property MUST be populated. 
     * Client - A client side adapter that responds to client operation requests, such as CIM-XML or CIM-SOAP. 
     * Provider - A provider adapter, such as DMI, SNMP, JSR48 or CMPI. 
     * Indication Handler - An Indication Handler is a service that delivers indications to a subscriber. Examples of possible Indication Handlers are CIM-XML, CIM-SOAP, SMPT (e-mail) or any other delivery mechanism. 
     * Repository - A repository is an adapter that can store/retrieve persistent data, such as CIM Qualifier Types, CIM Classes and CIM Instances. An Object Manager could use multiple repositiories at one time, for example one could be used for CIM Schema information only, while another is used for instance information. Repositories MAY be remote or local to the CIM Object Manager. Examples of repository implementations could be databases, LDAP or files.
     *     */

    public javax.cim.UnsignedInteger16 get_AdapterType() {
        CIMProperty currentProperty = getProperty(PROPERTY_ADAPTERTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ADAPTERTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property AdapterType
     * <br>
     * AdapterType enumerates the kind of Object Manager Adapter. If 'Other' is specified, the OtherAdapterTypeDescription property MUST be populated. 
     * Other - If the adapter does not fit into one of the other catagories in the list. If specified, the OtherAdapterTypeDescription property MUST be populated. 
     * Client - A client side adapter that responds to client operation requests, such as CIM-XML or CIM-SOAP. 
     * Provider - A provider adapter, such as DMI, SNMP, JSR48 or CMPI. 
     * Indication Handler - An Indication Handler is a service that delivers indications to a subscriber. Examples of possible Indication Handlers are CIM-XML, CIM-SOAP, SMPT (e-mail) or any other delivery mechanism. 
     * Repository - A repository is an adapter that can store/retrieve persistent data, such as CIM Qualifier Types, CIM Classes and CIM Instances. An Object Manager could use multiple repositiories at one time, for example one could be used for CIM Schema information only, while another is used for instance information. Repositories MAY be remote or local to the CIM Object Manager. Examples of repository implementations could be databases, LDAP or files.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AdapterType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ADAPTERTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AdapterType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ADAPTERTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AdapterType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AdapterType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ObjectManagerAdapter fco = new CIM_ObjectManagerAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADAPTERTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_AdapterType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ADAPTERTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AdapterType
     * <br>
     * AdapterType enumerates the kind of Object Manager Adapter. If 'Other' is specified, the OtherAdapterTypeDescription property MUST be populated. 
     * Other - If the adapter does not fit into one of the other catagories in the list. If specified, the OtherAdapterTypeDescription property MUST be populated. 
     * Client - A client side adapter that responds to client operation requests, such as CIM-XML or CIM-SOAP. 
     * Provider - A provider adapter, such as DMI, SNMP, JSR48 or CMPI. 
     * Indication Handler - An Indication Handler is a service that delivers indications to a subscriber. Examples of possible Indication Handlers are CIM-XML, CIM-SOAP, SMPT (e-mail) or any other delivery mechanism. 
     * Repository - A repository is an adapter that can store/retrieve persistent data, such as CIM Qualifier Types, CIM Classes and CIM Instances. An Object Manager could use multiple repositiories at one time, for example one could be used for CIM Schema information only, while another is used for instance information. Repositories MAY be remote or local to the CIM Object Manager. Examples of repository implementations could be databases, LDAP or files.
     */

    private static CIMProperty setPropertyValue_AdapterType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ElementName
     *     * <br>
     * The ElmentName property is used as a name of the Object Manager Adapter for human interfaces. For example, "ACME ObjectManager Adapter".
     *     */

    public String get_ElementName() {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENTNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ELEMENTNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ElementName
     * <br>
     * The ElmentName property is used as a name of the Object Manager Adapter for human interfaces. For example, "ACME ObjectManager Adapter".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ElementName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENTNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ElementName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENTNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ElementName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ElementName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_ObjectManagerAdapter fco = new CIM_ObjectManagerAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELEMENTNAME.NAME);
        if (property != null) {
            property = setPropertyValue_ElementName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENTNAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ElementName
     * <br>
     * The ElmentName property is used as a name of the Object Manager Adapter for human interfaces. For example, "ACME ObjectManager Adapter".
     */

    private static CIMProperty setPropertyValue_ElementName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Handle
     *     * <br>
     * An implementation specific string that identifies the handle to the Object Manager Adapter.
     *     */

    public String get_Handle() {
        CIMProperty currentProperty = getProperty(PROPERTY_HANDLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_HANDLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Handle
     * <br>
     * An implementation specific string that identifies the handle to the Object Manager Adapter.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Handle(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HANDLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Handle(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_HANDLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Handle by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Handle(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_ObjectManagerAdapter fco = new CIM_ObjectManagerAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HANDLE.NAME);
        if (property != null) {
            property = setPropertyValue_Handle(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_HANDLE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Handle
     * <br>
     * An implementation specific string that identifies the handle to the Object Manager Adapter.
     */

    private static CIMProperty setPropertyValue_Handle(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Name
     *     * <br>
     * A human-readable name that uniquely identifies the ObjectManager within a system.
     *     */

    public String get_Name() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Name
     * <br>
     * A human-readable name that uniquely identifies the ObjectManager within a system.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Name(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Name(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Name by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Name(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_ObjectManagerAdapter fco = new CIM_ObjectManagerAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null) {
            property = setPropertyValue_Name(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Name
     * <br>
     * A human-readable name that uniquely identifies the ObjectManager within a system.
     */

    private static CIMProperty setPropertyValue_Name(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherAdapterTypeDescription
     *     * <br>
     * The type(s) of ObjectManagerAdapter when "Other" is included in ObjectManagerAdapterType property.
     *     */

    public String get_OtherAdapterTypeDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERADAPTERTYPEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERADAPTERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherAdapterTypeDescription
     * <br>
     * The type(s) of ObjectManagerAdapter when "Other" is included in ObjectManagerAdapterType property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherAdapterTypeDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERADAPTERTYPEDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherAdapterTypeDescription(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERADAPTERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherAdapterTypeDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherAdapterTypeDescription(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_ObjectManagerAdapter fco = new CIM_ObjectManagerAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERADAPTERTYPEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherAdapterTypeDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERADAPTERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherAdapterTypeDescription
     * <br>
     * The type(s) of ObjectManagerAdapter when "Other" is included in ObjectManagerAdapterType property.
     */

    private static CIMProperty setPropertyValue_OtherAdapterTypeDescription(
            CIMProperty currentProperty, String newValue) {
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
     * Get the list with CIM_ObjectManagerCommunicationMechanism objects associated by the association CIM_CommMechanismForObjectManagerAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForObjectManagerAdapters(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForObjectManagerAdapters(
                cimClient, CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER,
                CIM_ObjectManagerCommunicationMechanism.CIM_CLASS_NAME, null, null, false, false,
                null);

    }

    /**
     * Get the list with CIM_ObjectManagerCommunicationMechanism objects associated by the association CIM_CommMechanismForObjectManagerAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForObjectManagerAdapters(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForObjectManagerAdapters(
                cimClient, CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER,
                resultClass, role, resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_ObjectManagerCommunicationMechanism objects associated by the association CIM_CommMechanismForObjectManagerAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForObjectManagerAdapters(
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
                CIM_ObjectManagerAdapterHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ObjectManagerAdapterHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ObjectManagerAdapterHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ObjectManagerCommunicationMechanism(cimInstance));
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
                        result.add(new CIM_ObjectManagerCommunicationMechanism(cimInstance));
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
                        result.add(new CIM_ObjectManagerCommunicationMechanism(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ObjectManagerAdapterHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForObjectManagerAdapter
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForObjectManagerAdapterNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForObjectManagerAdapterNames(
                cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER,
                CIM_ObjectManagerCommunicationMechanism.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForObjectManagerAdapter
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForObjectManagerAdapterNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForObjectManagerAdapterNames(
                cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, resultClass,
                role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForObjectManagerAdapter
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForObjectManagerAdapterNames(
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
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER,
                    CIM_ObjectManagerCommunicationMechanism.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ObjectManagerAdapterHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ObjectManagerAdapterHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ObjectManagerCommunicationMechanism.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ObjectManagerAdapterHelper.checkException(enumeration);
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
     * Get the list with CIM_CommMechanismForObjectManagerAdapter associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_CommMechanismForObjectManagerAdapter(
            WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin,
            String role, java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ObjectManagerAdapterHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ObjectManagerAdapterHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_CommMechanismForObjectManagerAdapterHelper.findClass(
                            cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_CommMechanismForObjectManagerAdapter(cimInstance));
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
                        result.add(new CIM_CommMechanismForObjectManagerAdapter(cimInstance));
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
                        result.add(new CIM_CommMechanismForObjectManagerAdapter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ObjectManagerAdapterHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_CommMechanismForObjectManagerAdapter
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_CommMechanismForObjectManagerAdapter(
            WBEMClient cimClient, String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ObjectManagerAdapterHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ObjectManagerAdapterHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_CommMechanismForObjectManagerAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ObjectManagerAdapterHelper.checkException(enumeration);
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
        return CIM_ObjectManagerAdapter.CIM_CLASS_NAME;
    }

}