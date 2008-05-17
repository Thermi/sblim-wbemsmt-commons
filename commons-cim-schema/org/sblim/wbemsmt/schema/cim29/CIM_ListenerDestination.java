/** 
 * CIM_ListenerDestination.java
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
 * Description: The description of a CIM Listener destination. A CIM_Listener is an entity capable of receiving CIM Export Messages (e.g., Indications or responses to an asynchronous CIM Operation).
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

public class CIM_ListenerDestination extends CIM_ManagedElement {

    public final static String CIM_CLASS_NAME = "CIM_ListenerDestination";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * CIM_IndicationSubscription describes a flow of Indications. The flow is specified by the referenced Filter, and directed to the referenced destination or process in the Handler. Property values of the referenced CIM_IndicationFilter instance and CIM_ListenerDestination instance MAY significantly effect the definition of the subscription. E.g., a subscription associated with a "Transient" destination MAY be deleted when the destination terminates or is no longer available.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION = "CIM_IndicationSubscription";

    /**
     * Constants of property CreationClassName
     * Indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, it allows all instances of this class and its subclasses to be uniquely identified.
     */
    public static class PROPERTY_CREATIONCLASSNAME {
        /**
         * name of the property CreationClassName
         */
        public final static String NAME = "CreationClassName";

    }

    /**
     * Constants of property Name
     * Indicates the name of the CIM Listener destination.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property OtherPersistenceType
     * A string describing ("Other") values for PersistenceType. This value MUST be set to a non NULL value when the PersistenceType is 1 ("Other"). For all other values of PersistenceType, the value of OtherPersistenceType MUST be NULL.
     */
    public static class PROPERTY_OTHERPERSISTENCETYPE {
        /**
         * name of the property OtherPersistenceType
         */
        public final static String NAME = "OtherPersistenceType";

    }

    /**
     * Constants of property PersistenceType
     * Describes the Persistence Type of the destination defined by this instance. If the value of PersistenceType is not specified, the value of PersistenceType MUST be treated as 2 ("Permanent"). A value of 2 ("Permanent") declares that the destination is always expected to be available (e.g., system log file). Inability to access this destination MUST be treated as an error condition. A value of 3 ("Transient") indicates that the destination is short-lived. Inability to access the destination MAY be treated as a normal termination condition. Subscriptions with "Transient" destinations MAY be deleted when the destination terminates or is no longer available.
     */
    public static class PROPERTY_PERSISTENCETYPE {
        /**
         * name of the property PersistenceType
         */
        public final static String NAME = "PersistenceType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Permanent = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Permanent (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Permanent = "Permanent";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Transient = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Transient (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Transient = "Transient";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@62086208
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Permanent.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Permanent;
            }

            if (VALUE_ENTRY_Transient.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Transient;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Permanent.intValue()) {
                return VALUE_ENTRY_Permanent;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Transient.intValue()) {
                return VALUE_ENTRY_Transient;
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
         * Value Map for the property PersistenceType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Permanent,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Transient };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PersistenceType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Permanent,
                VALUE_ENTRY_Transient };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PersistenceType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Permanent, VALUE_ENTRY_Transient };

    }

    /**
     * Constants of property SystemCreationClassName
     * A System's CreationClassName. A CIM Listener destination is defined in context of a CIM_System (e.g., the sending system.
     */
    public static class PROPERTY_SYSTEMCREATIONCLASSNAME {
        /**
         * name of the property SystemCreationClassName
         */
        public final static String NAME = "SystemCreationClassName";

    }

    /**
     * Constants of property SystemName
     * A System's Name. A CIM Listener destination is defined in context of a CIM_System (e.g., the sending system.
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
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   The description of a CIM Listener destination. A CIM_Listener is an entity capable of receiving CIM Export Messages (e.g., Indications or responses to an asynchronous CIM Operation).
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_ListenerDestination(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   The description of a CIM Listener destination. A CIM_Listener is an entity capable of receiving CIM Export Messages (e.g., Indications or responses to an asynchronous CIM Operation).
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_ListenerDestination(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ListenerDestination() {
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
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherPersistenceType", new CIMProperty("OtherPersistenceType",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("PersistenceType", new CIMProperty("PersistenceType",
                CIMDataType.UINT16_T, null));
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
     * Indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, it allows all instances of this class and its subclasses to be uniquely identified.
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
     * Indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, it allows all instances of this class and its subclasses to be uniquely identified.
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
        CIM_ListenerDestination fco = new CIM_ListenerDestination(client, namespace);
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
     * Indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, it allows all instances of this class and its subclasses to be uniquely identified.
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
     * Get the property Name
     *     * <br>
     * Indicates the name of the CIM Listener destination.
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
     * Indicates the name of the CIM Listener destination.
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
        CIM_ListenerDestination fco = new CIM_ListenerDestination(client, namespace);
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
     * Indicates the name of the CIM Listener destination.
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
     * Get the property OtherPersistenceType
     *     * <br>
     * A string describing ("Other") values for PersistenceType. This value MUST be set to a non NULL value when the PersistenceType is 1 ("Other"). For all other values of PersistenceType, the value of OtherPersistenceType MUST be NULL.
     *     */

    public String get_OtherPersistenceType() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERPERSISTENCETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERPERSISTENCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherPersistenceType
     * <br>
     * A string describing ("Other") values for PersistenceType. This value MUST be set to a non NULL value when the PersistenceType is 1 ("Other"). For all other values of PersistenceType, the value of OtherPersistenceType MUST be NULL.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherPersistenceType(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERPERSISTENCETYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherPersistenceType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERPERSISTENCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherPersistenceType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherPersistenceType(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_ListenerDestination fco = new CIM_ListenerDestination(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERPERSISTENCETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherPersistenceType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERPERSISTENCETYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherPersistenceType
     * <br>
     * A string describing ("Other") values for PersistenceType. This value MUST be set to a non NULL value when the PersistenceType is 1 ("Other"). For all other values of PersistenceType, the value of OtherPersistenceType MUST be NULL.
     */

    private static CIMProperty setPropertyValue_OtherPersistenceType(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PersistenceType
     *     * <br>
     * Describes the Persistence Type of the destination defined by this instance. If the value of PersistenceType is not specified, the value of PersistenceType MUST be treated as 2 ("Permanent"). A value of 2 ("Permanent") declares that the destination is always expected to be available (e.g., system log file). Inability to access this destination MUST be treated as an error condition. A value of 3 ("Transient") indicates that the destination is short-lived. Inability to access the destination MAY be treated as a normal termination condition. Subscriptions with "Transient" destinations MAY be deleted when the destination terminates or is no longer available.
     *     */

    public javax.cim.UnsignedInteger16 get_PersistenceType() {
        CIMProperty currentProperty = getProperty(PROPERTY_PERSISTENCETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PERSISTENCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PersistenceType
     * <br>
     * Describes the Persistence Type of the destination defined by this instance. If the value of PersistenceType is not specified, the value of PersistenceType MUST be treated as 2 ("Permanent"). A value of 2 ("Permanent") declares that the destination is always expected to be available (e.g., system log file). Inability to access this destination MUST be treated as an error condition. A value of 3 ("Transient") indicates that the destination is short-lived. Inability to access the destination MAY be treated as a normal termination condition. Subscriptions with "Transient" destinations MAY be deleted when the destination terminates or is no longer available.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PersistenceType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PERSISTENCETYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PersistenceType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PERSISTENCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PersistenceType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PersistenceType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ListenerDestination fco = new CIM_ListenerDestination(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PERSISTENCETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_PersistenceType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PERSISTENCETYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PersistenceType
     * <br>
     * Describes the Persistence Type of the destination defined by this instance. If the value of PersistenceType is not specified, the value of PersistenceType MUST be treated as 2 ("Permanent"). A value of 2 ("Permanent") declares that the destination is always expected to be available (e.g., system log file). Inability to access this destination MUST be treated as an error condition. A value of 3 ("Transient") indicates that the destination is short-lived. Inability to access the destination MAY be treated as a normal termination condition. Subscriptions with "Transient" destinations MAY be deleted when the destination terminates or is no longer available.
     */

    private static CIMProperty setPropertyValue_PersistenceType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
     * A System's CreationClassName. A CIM Listener destination is defined in context of a CIM_System (e.g., the sending system.
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
     * A System's CreationClassName. A CIM Listener destination is defined in context of a CIM_System (e.g., the sending system.
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
        CIM_ListenerDestination fco = new CIM_ListenerDestination(client, namespace);
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
     * A System's CreationClassName. A CIM Listener destination is defined in context of a CIM_System (e.g., the sending system.
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
     * A System's Name. A CIM Listener destination is defined in context of a CIM_System (e.g., the sending system.
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
     * A System's Name. A CIM Listener destination is defined in context of a CIM_System (e.g., the sending system.
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
        CIM_ListenerDestination fco = new CIM_ListenerDestination(client, namespace);
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
     * A System's Name. A CIM Listener destination is defined in context of a CIM_System (e.g., the sending system.
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
     * Get the list with CIM_IndicationFilter objects associated by the association CIM_IndicationSubscription
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_IndicationFilter_CIM_IndicationSubscriptions(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_IndicationFilter_CIM_IndicationSubscriptions(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION,
                CIM_IndicationFilter.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_IndicationFilter objects associated by the association CIM_IndicationSubscription
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_IndicationFilter_CIM_IndicationSubscriptions(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_IndicationFilter_CIM_IndicationSubscriptions(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_IndicationFilter objects associated by the association CIM_IndicationSubscription
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_IndicationFilter_CIM_IndicationSubscriptions(
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
                CIM_ListenerDestinationHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ListenerDestinationHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ListenerDestinationHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_IndicationFilter(cimInstance));
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
                        result.add(new CIM_IndicationFilter(cimInstance));
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
                        result.add(new CIM_IndicationFilter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ListenerDestinationHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_IndicationSubscription
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_IndicationFilter_CIM_IndicationSubscriptionNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_IndicationFilter_CIM_IndicationSubscriptionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION,
                CIM_IndicationFilter.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_IndicationSubscription
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_IndicationFilter_CIM_IndicationSubscriptionNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_IndicationFilter_CIM_IndicationSubscriptionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_IndicationSubscription
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_IndicationFilter_CIM_IndicationSubscriptionNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION,
                    CIM_IndicationFilter.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ListenerDestinationHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ListenerDestinationHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_IndicationFilter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ListenerDestinationHelper.checkException(enumeration);
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
     * Get the list with CIM_IndicationSubscription associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_IndicationSubscription(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ListenerDestinationHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ListenerDestinationHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_IndicationSubscriptionHelper
                            .findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_IndicationSubscription(cimInstance));
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
                        result.add(new CIM_IndicationSubscription(cimInstance));
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
                        result.add(new CIM_IndicationSubscription(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ListenerDestinationHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_IndicationSubscription
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_IndicationSubscription(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e,
                    new ReferenceNamesUserObject(this.getCimObjectPath(),
                            CIM_ASSOCIATOR_CLASS_NAME_CIM_INDICATIONSUBSCRIPTION, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ListenerDestinationHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ListenerDestinationHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_IndicationSubscription.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ListenerDestinationHelper.checkException(enumeration);
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
        return CIM_ListenerDestination.CIM_CLASS_NAME;
    }

}