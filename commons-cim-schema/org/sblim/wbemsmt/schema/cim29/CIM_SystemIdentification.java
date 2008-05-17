/** 
 * CIM_SystemIdentification.java
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
 * Description: A Namespace may represent data for one or many systems, that are local, remote (different than the system on which the ObjectManager is running) or aggregated. The System Identification class provides enough data to identify the system(s) represented in the Namespace. It is weak to the Namespace.
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

public class CIM_SystemIdentification extends CIM_ManagedElement {

    public final static String CIM_CLASS_NAME = "CIM_SystemIdentification";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * SystemInNamespace is an association that allows enumeration of the system(s) represented in a Namespace.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE = "CIM_SystemInNamespace";

    /**
     * IdentificationOfManagedSystem is an association that links the SystemIdentification object to the CIM_System(s) that are being identified and represented in the Namespace.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM = "CIM_IdentificationOfManagedSystem";

    /**
     * Constants of property CreationClassName
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     */
    public static class PROPERTY_CREATIONCLASSNAME {
        /**
         * name of the property CreationClassName
         */
        public final static String NAME = "CreationClassName";

    }

    /**
     * Constants of property FormatDescriptions
     * Strings further describing the format of the system identification information.
     */
    public static class PROPERTY_FORMATDESCRIPTIONS {
        /**
         * name of the property FormatDescriptions
         */
        public final static String NAME = "FormatDescriptions";

    }

    /**
     * Constants of property IdentificationData
     * Strings containing the system identification information. The format is described by the corresponding array item in IdentificationFormats.
     */
    public static class PROPERTY_IDENTIFICATIONDATA {
        /**
         * name of the property IdentificationData
         */
        public final static String NAME = "IdentificationData";

    }

    /**
     * Constants of property IdentificationFormats
     * Enumeration indicating the format of the system identification and/or addressing information.
     */
    public static class PROPERTY_IDENTIFICATIONFORMATS {
        /**
         * name of the property IdentificationFormats
         */
        public final static String NAME = "IdentificationFormats";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Short_DNS_Name = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Short DNS Name (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Short_DNS_Name = "Short DNS Name";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Fully_qualified_DNS_Name = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Fully qualified DNS Name (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Fully_qualified_DNS_Name = "Fully qualified DNS Name";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Windows_Domain_Name = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Windows Domain Name (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Windows_Domain_Name = "Windows Domain Name";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_NetWare_Server_Name = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry NetWare Server Name (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_NetWare_Server_Name = "NetWare Server Name";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Unix_Hostname = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Unix Hostname (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Unix_Hostname = "Unix Hostname";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Globally_Unique_System_Identifier = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Globally Unique System Identifier (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Globally_Unique_System_Identifier = "Globally Unique System Identifier";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_IP_Address = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry IP Address (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_IP_Address = "IP Address";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Modem_Dialup_String = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Modem Dialup String (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Modem_Dialup_String = "Modem Dialup String";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_MAC_Address = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry MAC Address (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_MAC_Address = "MAC Address";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_IPMI_Address = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry IPMI Address (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_IPMI_Address = "IPMI Address";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@22f222f2
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Short_DNS_Name.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Short_DNS_Name;
            }

            if (VALUE_ENTRY_Fully_qualified_DNS_Name.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Fully_qualified_DNS_Name;
            }

            if (VALUE_ENTRY_Windows_Domain_Name.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Windows_Domain_Name;
            }

            if (VALUE_ENTRY_NetWare_Server_Name.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_NetWare_Server_Name;
            }

            if (VALUE_ENTRY_Unix_Hostname.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Unix_Hostname;
            }

            if (VALUE_ENTRY_Globally_Unique_System_Identifier.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Globally_Unique_System_Identifier;
            }

            if (VALUE_ENTRY_IP_Address.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_IP_Address;
            }

            if (VALUE_ENTRY_Modem_Dialup_String.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Modem_Dialup_String;
            }

            if (VALUE_ENTRY_MAC_Address.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_MAC_Address;
            }

            if (VALUE_ENTRY_IPMI_Address.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_IPMI_Address;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Short_DNS_Name.intValue()) {
                return VALUE_ENTRY_Short_DNS_Name;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Fully_qualified_DNS_Name.intValue()) {
                return VALUE_ENTRY_Fully_qualified_DNS_Name;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Windows_Domain_Name.intValue()) {
                return VALUE_ENTRY_Windows_Domain_Name;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_NetWare_Server_Name.intValue()) {
                return VALUE_ENTRY_NetWare_Server_Name;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Unix_Hostname.intValue()) {
                return VALUE_ENTRY_Unix_Hostname;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Globally_Unique_System_Identifier
                    .intValue()) {
                return VALUE_ENTRY_Globally_Unique_System_Identifier;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_IP_Address.intValue()) {
                return VALUE_ENTRY_IP_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Modem_Dialup_String.intValue()) {
                return VALUE_ENTRY_Modem_Dialup_String;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_MAC_Address.intValue()) {
                return VALUE_ENTRY_MAC_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_IPMI_Address.intValue()) {
                return VALUE_ENTRY_IPMI_Address;
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
         * Value Map for the property IdentificationFormats   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Short_DNS_Name,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Fully_qualified_DNS_Name,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Windows_Domain_Name,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_NetWare_Server_Name,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Unix_Hostname,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Globally_Unique_System_Identifier,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_IP_Address,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Modem_Dialup_String,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_MAC_Address,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_IPMI_Address };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property IdentificationFormats   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Short_DNS_Name, VALUE_ENTRY_Fully_qualified_DNS_Name,
                VALUE_ENTRY_Windows_Domain_Name, VALUE_ENTRY_NetWare_Server_Name,
                VALUE_ENTRY_Unix_Hostname, VALUE_ENTRY_Globally_Unique_System_Identifier,
                VALUE_ENTRY_IP_Address, VALUE_ENTRY_Modem_Dialup_String, VALUE_ENTRY_MAC_Address,
                VALUE_ENTRY_IPMI_Address };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property IdentificationFormats   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Short_DNS_Name,
                VALUE_ENTRY_Fully_qualified_DNS_Name, VALUE_ENTRY_Windows_Domain_Name,
                VALUE_ENTRY_NetWare_Server_Name, VALUE_ENTRY_Unix_Hostname,
                VALUE_ENTRY_Globally_Unique_System_Identifier, VALUE_ENTRY_IP_Address,
                VALUE_ENTRY_Modem_Dialup_String, VALUE_ENTRY_MAC_Address, VALUE_ENTRY_IPMI_Address };

    }

    /**
     * Constants of property Name
     * A string uniquely identifying the name of the system represented in the Namespace.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property NamespaceCreationClassName
     * The scoping Namespace's CreationClassName.
     */
    public static class PROPERTY_NAMESPACECREATIONCLASSNAME {
        /**
         * name of the property NamespaceCreationClassName
         */
        public final static String NAME = "NamespaceCreationClassName";

    }

    /**
     * Constants of property NamespaceName
     * The scoping Namespace's Name.
     */
    public static class PROPERTY_NAMESPACENAME {
        /**
         * name of the property NamespaceName
         */
        public final static String NAME = "NamespaceName";

    }

    /**
     * Constants of property ObjectManagerCreationClassName
     * The scoping ObjectManager's CreationClassName.
     */
    public static class PROPERTY_OBJECTMANAGERCREATIONCLASSNAME {
        /**
         * name of the property ObjectManagerCreationClassName
         */
        public final static String NAME = "ObjectManagerCreationClassName";

    }

    /**
     * Constants of property ObjectManagerName
     * The scoping ObjectManager's Name.
     */
    public static class PROPERTY_OBJECTMANAGERNAME {
        /**
         * name of the property ObjectManagerName
         */
        public final static String NAME = "ObjectManagerName";

    }

    /**
     * Constants of property SystemCreationClassName
     * The scoping System's CreationClassName.
     */
    public static class PROPERTY_SYSTEMCREATIONCLASSNAME {
        /**
         * name of the property SystemCreationClassName
         */
        public final static String NAME = "SystemCreationClassName";

    }

    /**
     * Constants of property SystemName
     * The scoping System's Name.
     */
    public static class PROPERTY_SYSTEMNAME {
        /**
         * name of the property SystemName
         */
        public final static String NAME = "SystemName";

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
     *   A Namespace may represent data for one or many systems, that are local, remote (different than the system on which the ObjectManager is running) or aggregated. The System Identification class provides enough data to identify the system(s) represented in the Namespace. It is weak to the Namespace.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SystemIdentification(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A Namespace may represent data for one or many systems, that are local, remote (different than the system on which the ObjectManager is running) or aggregated. The System Identification class provides enough data to identify the system(s) represented in the Namespace. It is weak to the Namespace.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SystemIdentification(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SystemIdentification() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CreationClassName", new CIMProperty("CreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("FormatDescriptions", new CIMProperty("FormatDescriptions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("IdentificationData", new CIMProperty("IdentificationData",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("IdentificationFormats", new CIMProperty("IdentificationFormats",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("NamespaceCreationClassName", new CIMProperty(
                "NamespaceCreationClassName", CIMDataType.STRING_T, null));
        propertiesToCheck.put("NamespaceName", new CIMProperty("NamespaceName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ObjectManagerCreationClassName", new CIMProperty(
                "ObjectManagerCreationClassName", CIMDataType.STRING_T, null));
        propertiesToCheck.put("ObjectManagerName", new CIMProperty("ObjectManagerName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("SystemCreationClassName", new CIMProperty("SystemCreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("SystemName", new CIMProperty("SystemName", CIMDataType.STRING_T,
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
     * Get the property CreationClassName
     *     * <br>
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     *     */

    public String get_key_CreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_CREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CreationClassName
     * <br>
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_CreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_CreationClassName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_CreationClassName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SystemIdentification fco = new CIM_SystemIdentification(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_CreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CreationClassName
     * <br>
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     */

    private static CIMProperty setPropertyValue_key_CreationClassName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FormatDescriptions
     *     * <br>
     * Strings further describing the format of the system identification information.
     *     */

    public String[] get_FormatDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_FORMATDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FORMATDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property FormatDescriptions
     * <br>
     * Strings further describing the format of the system identification information.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FormatDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FORMATDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FormatDescriptions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FORMATDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FormatDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FormatDescriptions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_SystemIdentification fco = new CIM_SystemIdentification(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FORMATDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_FormatDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FORMATDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FormatDescriptions
     * <br>
     * Strings further describing the format of the system identification information.
     */

    private static CIMProperty setPropertyValue_FormatDescriptions(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IdentificationData
     *     * <br>
     * Strings containing the system identification information. The format is described by the corresponding array item in IdentificationFormats.
     *     */

    public String[] get_IdentificationData() {
        CIMProperty currentProperty = getProperty(PROPERTY_IDENTIFICATIONDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_IDENTIFICATIONDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property IdentificationData
     * <br>
     * Strings containing the system identification information. The format is described by the corresponding array item in IdentificationFormats.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IdentificationData(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_IDENTIFICATIONDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_IdentificationData(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_IDENTIFICATIONDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IdentificationData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IdentificationData(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_SystemIdentification fco = new CIM_SystemIdentification(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IDENTIFICATIONDATA.NAME);
        if (property != null) {
            property = setPropertyValue_IdentificationData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_IDENTIFICATIONDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IdentificationData
     * <br>
     * Strings containing the system identification information. The format is described by the corresponding array item in IdentificationFormats.
     */

    private static CIMProperty setPropertyValue_IdentificationData(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IdentificationFormats
     *     * <br>
     * Enumeration indicating the format of the system identification and/or addressing information.
     *     */

    public javax.cim.UnsignedInteger16[] get_IdentificationFormats() {
        CIMProperty currentProperty = getProperty(PROPERTY_IDENTIFICATIONFORMATS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_IDENTIFICATIONFORMATS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property IdentificationFormats
     * <br>
     * Enumeration indicating the format of the system identification and/or addressing information.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IdentificationFormats(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_IDENTIFICATIONFORMATS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_IdentificationFormats(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_IDENTIFICATIONFORMATS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IdentificationFormats by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IdentificationFormats(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_SystemIdentification fco = new CIM_SystemIdentification(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IDENTIFICATIONFORMATS.NAME);
        if (property != null) {
            property = setPropertyValue_IdentificationFormats(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_IDENTIFICATIONFORMATS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IdentificationFormats
     * <br>
     * Enumeration indicating the format of the system identification and/or addressing information.
     */

    private static CIMProperty setPropertyValue_IdentificationFormats(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
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
     * A string uniquely identifying the name of the system represented in the Namespace.
     *     */

    public String get_key_Name() {
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
     * A string uniquely identifying the name of the system represented in the Namespace.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_Name(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_Name(currentProperty, newValue);
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

    public static CIMProperty create_key_Name(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_SystemIdentification fco = new CIM_SystemIdentification(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_Name(property, newValue);
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
     * A string uniquely identifying the name of the system represented in the Namespace.
     */

    private static CIMProperty setPropertyValue_key_Name(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NamespaceCreationClassName
     *     * <br>
     * The scoping Namespace's CreationClassName.
     *     */

    public String get_key_NamespaceCreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMESPACECREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAMESPACECREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property NamespaceCreationClassName
     * <br>
     * The scoping Namespace's CreationClassName.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_NamespaceCreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMESPACECREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_NamespaceCreationClassName(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAMESPACECREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NamespaceCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_NamespaceCreationClassName(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_SystemIdentification fco = new CIM_SystemIdentification(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAMESPACECREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_NamespaceCreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAMESPACECREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NamespaceCreationClassName
     * <br>
     * The scoping Namespace's CreationClassName.
     */

    private static CIMProperty setPropertyValue_key_NamespaceCreationClassName(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NamespaceName
     *     * <br>
     * The scoping Namespace's Name.
     *     */

    public String get_key_NamespaceName() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMESPACENAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAMESPACENAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property NamespaceName
     * <br>
     * The scoping Namespace's Name.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_NamespaceName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMESPACENAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_NamespaceName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAMESPACENAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NamespaceName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_NamespaceName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SystemIdentification fco = new CIM_SystemIdentification(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAMESPACENAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_NamespaceName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAMESPACENAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NamespaceName
     * <br>
     * The scoping Namespace's Name.
     */

    private static CIMProperty setPropertyValue_key_NamespaceName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ObjectManagerCreationClassName
     *     * <br>
     * The scoping ObjectManager's CreationClassName.
     *     */

    public String get_key_ObjectManagerCreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_OBJECTMANAGERCREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OBJECTMANAGERCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ObjectManagerCreationClassName
     * <br>
     * The scoping ObjectManager's CreationClassName.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_ObjectManagerCreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OBJECTMANAGERCREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_ObjectManagerCreationClassName(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OBJECTMANAGERCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ObjectManagerCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_ObjectManagerCreationClassName(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_SystemIdentification fco = new CIM_SystemIdentification(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OBJECTMANAGERCREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_ObjectManagerCreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OBJECTMANAGERCREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ObjectManagerCreationClassName
     * <br>
     * The scoping ObjectManager's CreationClassName.
     */

    private static CIMProperty setPropertyValue_key_ObjectManagerCreationClassName(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ObjectManagerName
     *     * <br>
     * The scoping ObjectManager's Name.
     *     */

    public String get_key_ObjectManagerName() {
        CIMProperty currentProperty = getProperty(PROPERTY_OBJECTMANAGERNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OBJECTMANAGERNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ObjectManagerName
     * <br>
     * The scoping ObjectManager's Name.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_ObjectManagerName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OBJECTMANAGERNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_ObjectManagerName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OBJECTMANAGERNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ObjectManagerName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_ObjectManagerName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SystemIdentification fco = new CIM_SystemIdentification(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OBJECTMANAGERNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_ObjectManagerName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OBJECTMANAGERNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ObjectManagerName
     * <br>
     * The scoping ObjectManager's Name.
     */

    private static CIMProperty setPropertyValue_key_ObjectManagerName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SystemCreationClassName
     *     * <br>
     * The scoping System's CreationClassName.
     *     */

    public String get_key_SystemCreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SystemCreationClassName
     * <br>
     * The scoping System's CreationClassName.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_SystemCreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_SystemCreationClassName(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SystemCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_SystemCreationClassName(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_SystemIdentification fco = new CIM_SystemIdentification(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_SystemCreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SystemCreationClassName
     * <br>
     * The scoping System's CreationClassName.
     */

    private static CIMProperty setPropertyValue_key_SystemCreationClassName(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SystemName
     *     * <br>
     * The scoping System's Name.
     *     */

    public String get_key_SystemName() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SystemName
     * <br>
     * The scoping System's Name.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_SystemName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_SystemName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SystemName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_SystemName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SystemIdentification fco = new CIM_SystemIdentification(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_SystemName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SystemName
     * <br>
     * The scoping System's Name.
     */

    private static CIMProperty setPropertyValue_key_SystemName(CIMProperty currentProperty,
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
     * Get the list with CIM_Namespace objects associated by the association CIM_SystemInNamespace
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Namespace_CIM_SystemInNamespaces(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Namespace_CIM_SystemInNamespaces(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE, CIM_Namespace.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_Namespace objects associated by the association CIM_SystemInNamespace
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Namespace_CIM_SystemInNamespaces(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Namespace_CIM_SystemInNamespaces(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_Namespace objects associated by the association CIM_SystemInNamespace
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Namespace_CIM_SystemInNamespaces(WBEMClient cimClient,
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
                CIM_SystemIdentificationHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SystemIdentificationHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SystemIdentificationHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Namespace(cimInstance));
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
                        result.add(new CIM_Namespace(cimInstance));
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
                        result.add(new CIM_Namespace(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SystemIdentificationHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SystemInNamespace
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Namespace_CIM_SystemInNamespaceNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_Namespace_CIM_SystemInNamespaceNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE, CIM_Namespace.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SystemInNamespace
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Namespace_CIM_SystemInNamespaceNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_Namespace_CIM_SystemInNamespaceNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SystemInNamespace
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Namespace_CIM_SystemInNamespaceNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE,
                    CIM_Namespace.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SystemIdentificationHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SystemIdentificationHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Namespace.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SystemIdentificationHelper.checkException(enumeration);
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
     * Get the list with CIM_SystemInNamespace associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_SystemInNamespace(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SystemIdentificationHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SystemIdentificationHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SystemInNamespaceHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_SystemInNamespace(cimInstance));
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
                        result.add(new CIM_SystemInNamespace(cimInstance));
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
                        result.add(new CIM_SystemInNamespace(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SystemIdentificationHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_SystemInNamespace
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_SystemInNamespace(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMINNAMESPACE, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SystemIdentificationHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SystemIdentificationHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_SystemInNamespace.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SystemIdentificationHelper.checkException(enumeration);
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
     * Get the list with CIM_System objects associated by the association CIM_IdentificationOfManagedSystem
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_System_CIM_IdentificationOfManagedSystems(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_System_CIM_IdentificationOfManagedSystems(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM,
                CIM_System.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_System objects associated by the association CIM_IdentificationOfManagedSystem
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_System_CIM_IdentificationOfManagedSystems(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_System_CIM_IdentificationOfManagedSystems(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_System objects associated by the association CIM_IdentificationOfManagedSystem
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_System_CIM_IdentificationOfManagedSystems(
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
                CIM_SystemIdentificationHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SystemIdentificationHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SystemIdentificationHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_System(cimInstance));
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
                        result.add(new CIM_System(cimInstance));
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
                        result.add(new CIM_System(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SystemIdentificationHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_IdentificationOfManagedSystem
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_System_CIM_IdentificationOfManagedSystemNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_System_CIM_IdentificationOfManagedSystemNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM,
                CIM_System.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_IdentificationOfManagedSystem
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_System_CIM_IdentificationOfManagedSystemNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_System_CIM_IdentificationOfManagedSystemNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_IdentificationOfManagedSystem
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_System_CIM_IdentificationOfManagedSystemNames(
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM,
                    CIM_System.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SystemIdentificationHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SystemIdentificationHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_System.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SystemIdentificationHelper.checkException(enumeration);
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
     * Get the list with CIM_IdentificationOfManagedSystem associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_IdentificationOfManagedSystem(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SystemIdentificationHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SystemIdentificationHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_IdentificationOfManagedSystemHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_IdentificationOfManagedSystem(cimInstance));
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
                        result.add(new CIM_IdentificationOfManagedSystem(cimInstance));
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
                        result.add(new CIM_IdentificationOfManagedSystem(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SystemIdentificationHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_IdentificationOfManagedSystem
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_IdentificationOfManagedSystem(
            WBEMClient cimClient, String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_IDENTIFICATIONOFMANAGEDSYSTEM, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SystemIdentificationHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SystemIdentificationHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_IdentificationOfManagedSystem.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SystemIdentificationHelper.checkException(enumeration);
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
        return CIM_SystemIdentification.CIM_CLASS_NAME;
    }

}