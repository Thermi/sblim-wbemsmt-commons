/** 
 * CIM_SystemInNamespace.java
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
 * Description: SystemInNamespace is an association that allows enumeration of the system(s) represented in a Namespace.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_SystemInNamespace extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_SystemInNamespace";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property DescriptionOfContainedData
     * An array of free-form strings providing more detailed explanations for the data/objects contained in the Namespace, as described by the ContainedData array. Note, each entry of this array is related to the entry in the ContainedData array that is located at the same index.
     */
    public static class PROPERTY_DESCRIPTIONOFCONTAINEDDATA {
        /**
         * name of the property DescriptionOfContainedData
         */
        public final static String NAME = "DescriptionOfContainedData";

    }

    /**
     * Constants of property ScopeOfContainedData
     * A list of enumerated values providing a high level description of the data contained and allowed in the Namespace. Additional clarification is provided in the DescriptionOfContainedData array.
     */
    public static class PROPERTY_SCOPEOFCONTAINEDDATA {
        /**
         * name of the property ScopeOfContainedData
         */
        public final static String NAME = "ScopeOfContainedData";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Local_System_Data = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Local System Data (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Local_System_Data = "Local System Data";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Data_Aggregated_from_Multiple_Systems = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Data Aggregated from Multiple Systems (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Data_Aggregated_from_Multiple_Systems = "Data Aggregated from Multiple Systems";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Proxied_Data = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Proxied Data (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Proxied_Data = "Proxied Data";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1ef41ef4
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Local_System_Data.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Local_System_Data;
            }

            if (VALUE_ENTRY_Data_Aggregated_from_Multiple_Systems.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Data_Aggregated_from_Multiple_Systems;
            }

            if (VALUE_ENTRY_Proxied_Data.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Proxied_Data;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Local_System_Data.intValue()) {
                return VALUE_ENTRY_Local_System_Data;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Data_Aggregated_from_Multiple_Systems
                    .intValue()) {
                return VALUE_ENTRY_Data_Aggregated_from_Multiple_Systems;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Proxied_Data.intValue()) {
                return VALUE_ENTRY_Proxied_Data;
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
         * Value Map for the property ScopeOfContainedData   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Local_System_Data,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Data_Aggregated_from_Multiple_Systems,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Proxied_Data };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ScopeOfContainedData   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Local_System_Data, VALUE_ENTRY_Data_Aggregated_from_Multiple_Systems,
                VALUE_ENTRY_Proxied_Data };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ScopeOfContainedData   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Local_System_Data,
                VALUE_ENTRY_Data_Aggregated_from_Multiple_Systems, VALUE_ENTRY_Proxied_Data };

    }

    /**
     * Constants of property ManagedNamespace
     * 
     */
    public static class PROPERTY_MANAGEDNAMESPACE_CIM_NAMESPACE {
        /**
         * name of the property ManagedNamespace
         */
        public final static String NAME = "ManagedNamespace";

    }

    /**
     * Constants of property Identification
     * 
     */
    public static class PROPERTY_IDENTIFICATION_CIM_SYSTEMIDENTIFICATION {
        /**
         * name of the property Identification
         */
        public final static String NAME = "Identification";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   SystemInNamespace is an association that allows enumeration of the system(s) represented in a Namespace.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SystemInNamespace(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   SystemInNamespace is an association that allows enumeration of the system(s) represented in a Namespace.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SystemInNamespace(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SystemInNamespace() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("DescriptionOfContainedData", new CIMProperty(
                "DescriptionOfContainedData", CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("ScopeOfContainedData", new CIMProperty("ScopeOfContainedData",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("ManagedNamespace", new CIMProperty("ManagedNamespace",
                new CIMDataType(CIM_Namespace.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Identification", new CIMProperty("Identification", new CIMDataType(
                CIM_SystemIdentification.CIM_CLASS_NAME), null));

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
     * Get the property DescriptionOfContainedData
     *     * <br>
     * An array of free-form strings providing more detailed explanations for the data/objects contained in the Namespace, as described by the ContainedData array. Note, each entry of this array is related to the entry in the ContainedData array that is located at the same index.
     *     */

    public String[] get_DescriptionOfContainedData() {
        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTIONOFCONTAINEDDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DESCRIPTIONOFCONTAINEDDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property DescriptionOfContainedData
     * <br>
     * An array of free-form strings providing more detailed explanations for the data/objects contained in the Namespace, as described by the ContainedData array. Note, each entry of this array is related to the entry in the ContainedData array that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DescriptionOfContainedData(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTIONOFCONTAINEDDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DescriptionOfContainedData(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DESCRIPTIONOFCONTAINEDDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DescriptionOfContainedData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DescriptionOfContainedData(WBEMClient client,
            String namespace, String[] newValue) throws WbemsmtException {
        CIM_SystemInNamespace fco = new CIM_SystemInNamespace(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESCRIPTIONOFCONTAINEDDATA.NAME);
        if (property != null) {
            property = setPropertyValue_DescriptionOfContainedData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DESCRIPTIONOFCONTAINEDDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DescriptionOfContainedData
     * <br>
     * An array of free-form strings providing more detailed explanations for the data/objects contained in the Namespace, as described by the ContainedData array. Note, each entry of this array is related to the entry in the ContainedData array that is located at the same index.
     */

    private static CIMProperty setPropertyValue_DescriptionOfContainedData(
            CIMProperty currentProperty, String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ScopeOfContainedData
     *     * <br>
     * A list of enumerated values providing a high level description of the data contained and allowed in the Namespace. Additional clarification is provided in the DescriptionOfContainedData array.
     *     */

    public javax.cim.UnsignedInteger16[] get_ScopeOfContainedData() {
        CIMProperty currentProperty = getProperty(PROPERTY_SCOPEOFCONTAINEDDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SCOPEOFCONTAINEDDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property ScopeOfContainedData
     * <br>
     * A list of enumerated values providing a high level description of the data contained and allowed in the Namespace. Additional clarification is provided in the DescriptionOfContainedData array.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ScopeOfContainedData(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SCOPEOFCONTAINEDDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ScopeOfContainedData(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SCOPEOFCONTAINEDDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ScopeOfContainedData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ScopeOfContainedData(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_SystemInNamespace fco = new CIM_SystemInNamespace(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SCOPEOFCONTAINEDDATA.NAME);
        if (property != null) {
            property = setPropertyValue_ScopeOfContainedData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SCOPEOFCONTAINEDDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ScopeOfContainedData
     * <br>
     * A list of enumerated values providing a high level description of the data contained and allowed in the Namespace. Additional clarification is provided in the DescriptionOfContainedData array.
     */

    private static CIMProperty setPropertyValue_ScopeOfContainedData(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ManagedNamespace
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Namespace get_ManagedNamespace_CIM_Namespace(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDNAMESPACE_CIM_NAMESPACE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MANAGEDNAMESPACE_CIM_NAMESPACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_NamespaceHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property ManagedNamespace
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ManagedNamespace_CIM_Namespace(CIM_Namespace newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDNAMESPACE_CIM_NAMESPACE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ManagedNamespace_CIM_Namespace(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDNAMESPACE_CIM_NAMESPACE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ManagedNamespace by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ManagedNamespace_CIM_Namespace(WBEMClient client,
            String namespace, CIM_Namespace newValue) throws WbemsmtException {
        CIM_SystemInNamespace fco = new CIM_SystemInNamespace(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MANAGEDNAMESPACE_CIM_NAMESPACE.NAME);
        if (property != null) {
            property = setPropertyValue_ManagedNamespace_CIM_Namespace(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDNAMESPACE_CIM_NAMESPACE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ManagedNamespace
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ManagedNamespace_CIM_Namespace(
            CIMProperty currentProperty, CIM_Namespace newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Identification
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_SystemIdentification get_Identification_CIM_SystemIdentification(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_IDENTIFICATION_CIM_SYSTEMIDENTIFICATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_IDENTIFICATION_CIM_SYSTEMIDENTIFICATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SystemIdentificationHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Identification
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Identification_CIM_SystemIdentification(CIM_SystemIdentification newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_IDENTIFICATION_CIM_SYSTEMIDENTIFICATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Identification_CIM_SystemIdentification(
                    currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_IDENTIFICATION_CIM_SYSTEMIDENTIFICATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Identification by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Identification_CIM_SystemIdentification(WBEMClient client,
            String namespace, CIM_SystemIdentification newValue) throws WbemsmtException {
        CIM_SystemInNamespace fco = new CIM_SystemInNamespace(client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_IDENTIFICATION_CIM_SYSTEMIDENTIFICATION.NAME);
        if (property != null) {
            property = setPropertyValue_Identification_CIM_SystemIdentification(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_IDENTIFICATION_CIM_SYSTEMIDENTIFICATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Identification
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Identification_CIM_SystemIdentification(
            CIMProperty currentProperty, CIM_SystemIdentification newValue) {
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
     * returns true if the objects are the same
     * 
     * @return
     * @see org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco\#equals(Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof CIM_SystemInNamespace)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_SystemInNamespace.CIM_CLASS_NAME;
    }

}