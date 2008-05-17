/** 
 * CIM_Thread.java
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
 * Description: Threads represent the ability to execute units of a Process or task in parallel. A Process can have many Threads, each of which is weak to the Process.
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

public class CIM_Thread extends CIM_EnabledLogicalElement {

    public final static String CIM_CLASS_NAME = "CIM_Thread";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * A link between a Process and the Thread(s) running in the context of this Process.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD = "CIM_ProcessThread";

    /**
     * Constants of property CSCreationClassName
     * The scoping ComputerSystem's CreationClassName.
     */
    public static class PROPERTY_CSCREATIONCLASSNAME {
        /**
         * name of the property CSCreationClassName
         */
        public final static String NAME = "CSCreationClassName";

    }

    /**
     * Constants of property CSName
     * The scoping ComputerSystem's Name.
     */
    public static class PROPERTY_CSNAME {
        /**
         * name of the property CSName
         */
        public final static String NAME = "CSName";

    }

    /**
     * Constants of property CreationClassName
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allow all instances of this class and its subclasses to be uniquely identified.
     */
    public static class PROPERTY_CREATIONCLASSNAME {
        /**
         * name of the property CreationClassName
         */
        public final static String NAME = "CreationClassName";

    }

    /**
     * Constants of property ExecutionState
     * Indicates the current operating condition of the Thread. Values include ready (2), running (3), and blocked (4), among others. The majority of the enumerated values are obvious. However, a few require additional explanation: 
     * 7 (Ready but Relinquished Processor) describes that a thread is in the Ready state, but has voluntarily relinquished execution time to other threads. For example, this state may indicate a problem when the relinquishing thread is not handling items on its queues. If these semantics cannot be detected, the thread should report its state as 2 ("Ready"). 
     * 8 (Hung) indicates that a thread is not responding.
     */
    public static class PROPERTY_EXECUTIONSTATE {
        /**
         * name of the property ExecutionState
         */
        public final static String NAME = "ExecutionState";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ready = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Ready (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Ready = "Ready";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Running (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Running = "Running";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Blocked = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Blocked (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Blocked = "Blocked";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Suspended_Blocked = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Suspended Blocked (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Suspended_Blocked = "Suspended Blocked";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Suspended_Ready = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Suspended Ready (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Suspended_Ready = "Suspended Ready";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Ready_But_Relinquished_Processor = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Ready But Relinquished Processor (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Ready_But_Relinquished_Processor = "Ready But Relinquished Processor";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Hung = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Hung (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Hung = "Hung";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@53965396
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Ready.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ready;
            }

            if (VALUE_ENTRY_Running.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running;
            }

            if (VALUE_ENTRY_Blocked.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Blocked;
            }

            if (VALUE_ENTRY_Suspended_Blocked.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Suspended_Blocked;
            }

            if (VALUE_ENTRY_Suspended_Ready.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Suspended_Ready;
            }

            if (VALUE_ENTRY_Ready_But_Relinquished_Processor.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Ready_But_Relinquished_Processor;
            }

            if (VALUE_ENTRY_Hung.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Hung;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ready.intValue()) {
                return VALUE_ENTRY_Ready;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running.intValue()) {
                return VALUE_ENTRY_Running;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Blocked.intValue()) {
                return VALUE_ENTRY_Blocked;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Suspended_Blocked.intValue()) {
                return VALUE_ENTRY_Suspended_Blocked;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Suspended_Ready.intValue()) {
                return VALUE_ENTRY_Suspended_Ready;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Ready_But_Relinquished_Processor
                    .intValue()) {
                return VALUE_ENTRY_Ready_But_Relinquished_Processor;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Hung.intValue()) {
                return VALUE_ENTRY_Hung;
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
         * Value Map for the property ExecutionState   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ready, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Blocked,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Suspended_Blocked,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Suspended_Ready,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Ready_But_Relinquished_Processor,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Hung };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ExecutionState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Ready, VALUE_ENTRY_Running, VALUE_ENTRY_Blocked,
                VALUE_ENTRY_Suspended_Blocked, VALUE_ENTRY_Suspended_Ready,
                VALUE_ENTRY_Ready_But_Relinquished_Processor, VALUE_ENTRY_Hung };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ExecutionState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Ready, VALUE_ENTRY_Running, VALUE_ENTRY_Blocked,
                VALUE_ENTRY_Suspended_Blocked, VALUE_ENTRY_Suspended_Ready,
                VALUE_ENTRY_Ready_But_Relinquished_Processor, VALUE_ENTRY_Hung };

    }

    /**
     * Constants of property Handle
     * A string used to identify the Thread.
     */
    public static class PROPERTY_HANDLE {
        /**
         * name of the property Handle
         */
        public final static String NAME = "Handle";

    }

    /**
     * Constants of property KernelModeTime
     * Time in kernel mode, in milliseconds. If this information is not available, a value of 0 should be used.
     */
    public static class PROPERTY_KERNELMODETIME {
        /**
         * name of the property KernelModeTime
         */
        public final static String NAME = "KernelModeTime";

    }

    /**
     * Constants of property OSCreationClassName
     * The scoping OperatingSystem's CreationClassName.
     */
    public static class PROPERTY_OSCREATIONCLASSNAME {
        /**
         * name of the property OSCreationClassName
         */
        public final static String NAME = "OSCreationClassName";

    }

    /**
     * Constants of property OSName
     * The scoping OperatingSystem's Name.
     */
    public static class PROPERTY_OSNAME {
        /**
         * name of the property OSName
         */
        public final static String NAME = "OSName";

    }

    /**
     * Constants of property Priority
     * Priority indicates the urgency or importance of execution of a Thread. A Thread may have a different priority than its owning Process. If this information is not available for a Thread, a value of 0 should be used.
     */
    public static class PROPERTY_PRIORITY {
        /**
         * name of the property Priority
         */
        public final static String NAME = "Priority";

    }

    /**
     * Constants of property ProcessCreationClassName
     * The scoping Process' CreationClassName.
     */
    public static class PROPERTY_PROCESSCREATIONCLASSNAME {
        /**
         * name of the property ProcessCreationClassName
         */
        public final static String NAME = "ProcessCreationClassName";

    }

    /**
     * Constants of property ProcessHandle
     * The scoping Process' Handle.
     */
    public static class PROPERTY_PROCESSHANDLE {
        /**
         * name of the property ProcessHandle
         */
        public final static String NAME = "ProcessHandle";

    }

    /**
     * Constants of property UserModeTime
     * Time in user mode, in milliseconds. If this information is not available, a value of 0 should be used.
     */
    public static class PROPERTY_USERMODETIME {
        /**
         * name of the property UserModeTime
         */
        public final static String NAME = "UserModeTime";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_EnabledLogicalElement.getPackages();

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
     *   Threads represent the ability to execute units of a Process or task in parallel. A Process can have many Threads, each of which is weak to the Process.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Thread(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Threads represent the ability to execute units of a Process or task in parallel. A Process can have many Threads, each of which is weak to the Process.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Thread(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Thread() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CSCreationClassName", new CIMProperty("CSCreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("CSName", new CIMProperty("CSName", CIMDataType.STRING_T, null));
        propertiesToCheck.put("CreationClassName", new CIMProperty("CreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ExecutionState", new CIMProperty("ExecutionState",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Handle", new CIMProperty("Handle", CIMDataType.STRING_T, null));
        propertiesToCheck.put("KernelModeTime", new CIMProperty("KernelModeTime",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("OSCreationClassName", new CIMProperty("OSCreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("OSName", new CIMProperty("OSName", CIMDataType.STRING_T, null));
        propertiesToCheck.put("Priority", new CIMProperty("Priority", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("ProcessCreationClassName", new CIMProperty(
                "ProcessCreationClassName", CIMDataType.STRING_T, null));
        propertiesToCheck.put("ProcessHandle", new CIMProperty("ProcessHandle",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("UserModeTime", new CIMProperty("UserModeTime", CIMDataType.UINT64_T,
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
     * Get the property CSCreationClassName
     *     * <br>
     * The scoping ComputerSystem's CreationClassName.
     *     */

    public String get_key_CSCreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_CSCREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CSCreationClassName
     * <br>
     * The scoping ComputerSystem's CreationClassName.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_CSCreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CSCREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_CSCreationClassName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CSCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_CSCreationClassName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Thread fco = new CIM_Thread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CSCREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_CSCreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CSCreationClassName
     * <br>
     * The scoping ComputerSystem's CreationClassName.
     */

    private static CIMProperty setPropertyValue_key_CSCreationClassName(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CSName
     *     * <br>
     * The scoping ComputerSystem's Name.
     *     */

    public String get_key_CSName() {
        CIMProperty currentProperty = getProperty(PROPERTY_CSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CSNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CSName
     * <br>
     * The scoping ComputerSystem's Name.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_CSName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_CSName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CSNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CSName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_CSName(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Thread fco = new CIM_Thread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_CSName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CSNAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CSName
     * <br>
     * The scoping ComputerSystem's Name.
     */

    private static CIMProperty setPropertyValue_key_CSName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CreationClassName
     *     * <br>
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allow all instances of this class and its subclasses to be uniquely identified.
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
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allow all instances of this class and its subclasses to be uniquely identified.
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
        CIM_Thread fco = new CIM_Thread(client, namespace);
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
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allow all instances of this class and its subclasses to be uniquely identified.
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
     * Get the property ExecutionState
     *     * <br>
     * Indicates the current operating condition of the Thread. Values include ready (2), running (3), and blocked (4), among others. The majority of the enumerated values are obvious. However, a few require additional explanation: 
     * 7 (Ready but Relinquished Processor) describes that a thread is in the Ready state, but has voluntarily relinquished execution time to other threads. For example, this state may indicate a problem when the relinquishing thread is not handling items on its queues. If these semantics cannot be detected, the thread should report its state as 2 ("Ready"). 
     * 8 (Hung) indicates that a thread is not responding.
     *     */

    public javax.cim.UnsignedInteger16 get_ExecutionState() {
        CIMProperty currentProperty = getProperty(PROPERTY_EXECUTIONSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EXECUTIONSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ExecutionState
     * <br>
     * Indicates the current operating condition of the Thread. Values include ready (2), running (3), and blocked (4), among others. The majority of the enumerated values are obvious. However, a few require additional explanation: 
     * 7 (Ready but Relinquished Processor) describes that a thread is in the Ready state, but has voluntarily relinquished execution time to other threads. For example, this state may indicate a problem when the relinquishing thread is not handling items on its queues. If these semantics cannot be detected, the thread should report its state as 2 ("Ready"). 
     * 8 (Hung) indicates that a thread is not responding.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ExecutionState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EXECUTIONSTATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ExecutionState(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EXECUTIONSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ExecutionState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ExecutionState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Thread fco = new CIM_Thread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EXECUTIONSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_ExecutionState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EXECUTIONSTATE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ExecutionState
     * <br>
     * Indicates the current operating condition of the Thread. Values include ready (2), running (3), and blocked (4), among others. The majority of the enumerated values are obvious. However, a few require additional explanation: 
     * 7 (Ready but Relinquished Processor) describes that a thread is in the Ready state, but has voluntarily relinquished execution time to other threads. For example, this state may indicate a problem when the relinquishing thread is not handling items on its queues. If these semantics cannot be detected, the thread should report its state as 2 ("Ready"). 
     * 8 (Hung) indicates that a thread is not responding.
     */

    private static CIMProperty setPropertyValue_ExecutionState(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
     * A string used to identify the Thread.
     *     */

    public String get_key_Handle() {
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
     * A string used to identify the Thread.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_Handle(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HANDLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_Handle(currentProperty, newValue);
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

    public static CIMProperty create_key_Handle(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Thread fco = new CIM_Thread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HANDLE.NAME);
        if (property != null) {
            property = setPropertyValue_key_Handle(property, newValue);
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
     * A string used to identify the Thread.
     */

    private static CIMProperty setPropertyValue_key_Handle(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property KernelModeTime
     *     * <br>
     * Time in kernel mode, in milliseconds. If this information is not available, a value of 0 should be used.
     *     */

    public javax.cim.UnsignedInteger64 get_KernelModeTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_KERNELMODETIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_KERNELMODETIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property KernelModeTime
     * <br>
     * Time in kernel mode, in milliseconds. If this information is not available, a value of 0 should be used.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_KernelModeTime(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_KERNELMODETIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_KernelModeTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_KERNELMODETIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property KernelModeTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_KernelModeTime(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_Thread fco = new CIM_Thread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_KERNELMODETIME.NAME);
        if (property != null) {
            property = setPropertyValue_KernelModeTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_KERNELMODETIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property KernelModeTime
     * <br>
     * Time in kernel mode, in milliseconds. If this information is not available, a value of 0 should be used.
     */

    private static CIMProperty setPropertyValue_KernelModeTime(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OSCreationClassName
     *     * <br>
     * The scoping OperatingSystem's CreationClassName.
     *     */

    public String get_key_OSCreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_OSCREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OSCreationClassName
     * <br>
     * The scoping OperatingSystem's CreationClassName.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_OSCreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OSCREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_OSCreationClassName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OSCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_OSCreationClassName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Thread fco = new CIM_Thread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OSCREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_OSCreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OSCreationClassName
     * <br>
     * The scoping OperatingSystem's CreationClassName.
     */

    private static CIMProperty setPropertyValue_key_OSCreationClassName(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OSName
     *     * <br>
     * The scoping OperatingSystem's Name.
     *     */

    public String get_key_OSName() {
        CIMProperty currentProperty = getProperty(PROPERTY_OSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OSNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OSName
     * <br>
     * The scoping OperatingSystem's Name.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_OSName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_OSName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OSNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OSName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_OSName(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Thread fco = new CIM_Thread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_OSName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OSNAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OSName
     * <br>
     * The scoping OperatingSystem's Name.
     */

    private static CIMProperty setPropertyValue_key_OSName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Priority
     *     * <br>
     * Priority indicates the urgency or importance of execution of a Thread. A Thread may have a different priority than its owning Process. If this information is not available for a Thread, a value of 0 should be used.
     *     */

    public javax.cim.UnsignedInteger32 get_Priority() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIORITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRIORITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property Priority
     * <br>
     * Priority indicates the urgency or importance of execution of a Thread. A Thread may have a different priority than its owning Process. If this information is not available for a Thread, a value of 0 should be used.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Priority(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIORITY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Priority(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRIORITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Priority by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Priority(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_Thread fco = new CIM_Thread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRIORITY.NAME);
        if (property != null) {
            property = setPropertyValue_Priority(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRIORITY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Priority
     * <br>
     * Priority indicates the urgency or importance of execution of a Thread. A Thread may have a different priority than its owning Process. If this information is not available for a Thread, a value of 0 should be used.
     */

    private static CIMProperty setPropertyValue_Priority(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProcessCreationClassName
     *     * <br>
     * The scoping Process' CreationClassName.
     *     */

    public String get_key_ProcessCreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSCREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROCESSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ProcessCreationClassName
     * <br>
     * The scoping Process' CreationClassName.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_ProcessCreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSCREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_ProcessCreationClassName(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProcessCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_ProcessCreationClassName(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_Thread fco = new CIM_Thread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROCESSCREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_ProcessCreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProcessCreationClassName
     * <br>
     * The scoping Process' CreationClassName.
     */

    private static CIMProperty setPropertyValue_key_ProcessCreationClassName(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProcessHandle
     *     * <br>
     * The scoping Process' Handle.
     *     */

    public String get_key_ProcessHandle() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSHANDLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROCESSHANDLE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ProcessHandle
     * <br>
     * The scoping Process' Handle.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_ProcessHandle(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSHANDLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_ProcessHandle(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSHANDLE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProcessHandle by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_ProcessHandle(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Thread fco = new CIM_Thread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROCESSHANDLE.NAME);
        if (property != null) {
            property = setPropertyValue_key_ProcessHandle(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSHANDLE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProcessHandle
     * <br>
     * The scoping Process' Handle.
     */

    private static CIMProperty setPropertyValue_key_ProcessHandle(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UserModeTime
     *     * <br>
     * Time in user mode, in milliseconds. If this information is not available, a value of 0 should be used.
     *     */

    public javax.cim.UnsignedInteger64 get_UserModeTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_USERMODETIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_USERMODETIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UserModeTime
     * <br>
     * Time in user mode, in milliseconds. If this information is not available, a value of 0 should be used.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UserModeTime(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_USERMODETIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UserModeTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_USERMODETIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UserModeTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UserModeTime(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_Thread fco = new CIM_Thread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_USERMODETIME.NAME);
        if (property != null) {
            property = setPropertyValue_UserModeTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_USERMODETIME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UserModeTime
     * <br>
     * Time in user mode, in milliseconds. If this information is not available, a value of 0 should be used.
     */

    private static CIMProperty setPropertyValue_UserModeTime(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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
     * Get the list with CIM_Process objects associated by the association CIM_ProcessThread
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Process_CIM_ProcessThreads(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Process_CIM_ProcessThreads(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD, CIM_Process.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_Process objects associated by the association CIM_ProcessThread
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Process_CIM_ProcessThreads(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Process_CIM_ProcessThreads(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_Process objects associated by the association CIM_ProcessThread
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Process_CIM_ProcessThreads(WBEMClient cimClient,
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
                CIM_ThreadHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ThreadHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ThreadHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Process(cimInstance));
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
                        result.add(new CIM_Process(cimInstance));
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
                        result.add(new CIM_Process(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ThreadHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ProcessThread
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Process_CIM_ProcessThreadNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Process_CIM_ProcessThreadNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD, CIM_Process.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ProcessThread
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Process_CIM_ProcessThreadNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Process_CIM_ProcessThreadNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ProcessThread
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Process_CIM_ProcessThreadNames(WBEMClient cimClient,
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD,
                    CIM_Process.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ThreadHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ThreadHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Process.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ThreadHelper.checkException(enumeration);
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
     * Get the list with CIM_ProcessThread associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ProcessThread(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ThreadHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ThreadHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ProcessThreadHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ProcessThread(cimInstance));
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
                        result.add(new CIM_ProcessThread(cimInstance));
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
                        result.add(new CIM_ProcessThread(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ThreadHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ProcessThread
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ProcessThread(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSTHREAD, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ThreadHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ThreadHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ProcessThread.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ThreadHelper.checkException(enumeration);
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
        return CIM_Thread.CIM_CLASS_NAME;
    }

}