/**
 * CIM_UnixProcess.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE TERMS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Eclipse
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Each instance of the CIM_UnixProcess class
 *            represents a single instance of a running program. A user of the Operating System will
 *            typically see a Process as an application or task. Within an OperatingSystem, a
 *            Process is defined by a workspace of memory resources and environmental settings that
 *            are allocated to it. On a multitasking System, this workspace prevents intrusion of
 *            resources by other Processes. Additionally, a Process can execute as multiple Threads,
 *            all which run within the same workspace. generated Class
 */

package org.sblim.wbemsmt.schema.cim221;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_UnixProcess extends CIM_Process {

    public final static String CIM_CLASS_NAME = "CIM_UnixProcess";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ModulePath
     * The executing process's command path.
     */
    public static class PROPERTY_MODULEPATH {
        /**
         * name of the property ModulePath
         */
        public final static String NAME = "ModulePath";

    }

    /**
     * Constants of property Parameters
     * The operating system parameters provided to the executing process. These are the argv[] values.
     */
    public static class PROPERTY_PARAMETERS {
        /**
         * name of the property Parameters
         */
        public final static String NAME = "Parameters";

    }

    /**
     * Constants of property ParentProcessID
     * The parent process ID of this executing process.
     */
    public static class PROPERTY_PARENTPROCESSID {
        /**
         * name of the property ParentProcessID
         */
        public final static String NAME = "ParentProcessID";

    }

    /**
     * Constants of property ProcessGroupID
     * The Group ID of this currently executing process.
     */
    public static class PROPERTY_PROCESSGROUPID {
        /**
         * name of the property ProcessGroupID
         */
        public final static String NAME = "ProcessGroupID";

    }

    /**
     * Constants of property ProcessNiceValue
     * The process's 'nice' value. Used to compute its priority.
     */
    public static class PROPERTY_PROCESSNICEVALUE {
        /**
         * name of the property ProcessNiceValue
         */
        public final static String NAME = "ProcessNiceValue";

    }

    /**
     * Constants of property ProcessSessionID
     * If part of a group of processes are under the control of a session leader, this property holds the session ID for the group.
     */
    public static class PROPERTY_PROCESSSESSIONID {
        /**
         * name of the property ProcessSessionID
         */
        public final static String NAME = "ProcessSessionID";

    }

    /**
     * Constants of property ProcessTTY
     * The TTY currently associated with this process.
     */
    public static class PROPERTY_PROCESSTTY {
        /**
         * name of the property ProcessTTY
         */
        public final static String NAME = "ProcessTTY";

    }

    /**
     * Constants of property ProcessWaitingForEvent
     * A description of the event this process is currently sleeping for. The precise nature of this string is implementation defined, but is typically the address of a system data structure that will be modified when the event occurs. This string only has meaning when the ExecutionState is "Blocked" or "SuspendedBlocked".
     */
    public static class PROPERTY_PROCESSWAITINGFOREVENT {
        /**
         * name of the property ProcessWaitingForEvent
         */
        public final static String NAME = "ProcessWaitingForEvent";

    }

    /**
     * Constants of property RealUserID
     * The Real User ID of this currently executing process.
     */
    public static class PROPERTY_REALUSERID {
        /**
         * name of the property RealUserID
         */
        public final static String NAME = "RealUserID";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim221");
        String[] parentClassPackageList = CIM_Process.getPackages();

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
     *   Each instance of the CIM_UnixProcess class represents a single instance of a running program. A user of the Operating System will typically see a Process as an application or task. Within an OperatingSystem, a Process is defined by a workspace of memory resources and environmental settings that are allocated to it. On a multitasking System, this workspace prevents intrusion of resources by other Processes. Additionally, a Process can execute as multiple Threads, all which run within the same workspace.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_UnixProcess(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Each instance of the CIM_UnixProcess class represents a single instance of a running program. A user of the Operating System will typically see a Process as an application or task. Within an OperatingSystem, a Process is defined by a workspace of memory resources and environmental settings that are allocated to it. On a multitasking System, this workspace prevents intrusion of resources by other Processes. Additionally, a Process can execute as multiple Threads, all which run within the same workspace.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_UnixProcess(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_UnixProcess() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ModulePath", new CIMProperty("ModulePath", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("Parameters", new CIMProperty("Parameters",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("ParentProcessID", new CIMProperty("ParentProcessID",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ProcessGroupID", new CIMProperty("ProcessGroupID",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ProcessNiceValue", new CIMProperty("ProcessNiceValue",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("ProcessSessionID", new CIMProperty("ProcessSessionID",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ProcessTTY", new CIMProperty("ProcessTTY", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("ProcessWaitingForEvent", new CIMProperty("ProcessWaitingForEvent",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("RealUserID", new CIMProperty("RealUserID", CIMDataType.UINT64_T,
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
     * Get the property ModulePath
     *     * <br>
     * The executing process's command path.
     *     */

    public String get_ModulePath() {
        CIMProperty currentProperty = getProperty(PROPERTY_MODULEPATH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MODULEPATH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ModulePath
     * <br>
     * The executing process's command path.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ModulePath(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MODULEPATH.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ModulePath(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MODULEPATH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ModulePath by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ModulePath(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_UnixProcess fco = new CIM_UnixProcess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MODULEPATH.NAME);
        if (property != null) {
            property = setPropertyValue_ModulePath(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MODULEPATH.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ModulePath
     * <br>
     * The executing process's command path.
     */

    private static CIMProperty setPropertyValue_ModulePath(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Parameters
     *     * <br>
     * The operating system parameters provided to the executing process. These are the argv[] values.
     *     */

    public String[] get_Parameters() {
        CIMProperty currentProperty = getProperty(PROPERTY_PARAMETERS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARAMETERS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property Parameters
     * <br>
     * The operating system parameters provided to the executing process. These are the argv[] values.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Parameters(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARAMETERS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Parameters(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARAMETERS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Parameters by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Parameters(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_UnixProcess fco = new CIM_UnixProcess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARAMETERS.NAME);
        if (property != null) {
            property = setPropertyValue_Parameters(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARAMETERS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Parameters
     * <br>
     * The operating system parameters provided to the executing process. These are the argv[] values.
     */

    private static CIMProperty setPropertyValue_Parameters(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ParentProcessID
     *     * <br>
     * The parent process ID of this executing process.
     *     */

    public String get_ParentProcessID() {
        CIMProperty currentProperty = getProperty(PROPERTY_PARENTPROCESSID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARENTPROCESSID.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ParentProcessID
     * <br>
     * The parent process ID of this executing process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ParentProcessID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARENTPROCESSID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ParentProcessID(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARENTPROCESSID.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ParentProcessID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ParentProcessID(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_UnixProcess fco = new CIM_UnixProcess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARENTPROCESSID.NAME);
        if (property != null) {
            property = setPropertyValue_ParentProcessID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARENTPROCESSID.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ParentProcessID
     * <br>
     * The parent process ID of this executing process.
     */

    private static CIMProperty setPropertyValue_ParentProcessID(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProcessGroupID
     *     * <br>
     * The Group ID of this currently executing process.
     *     */

    public javax.cim.UnsignedInteger64 get_ProcessGroupID() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSGROUPID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROCESSGROUPID.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ProcessGroupID
     * <br>
     * The Group ID of this currently executing process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProcessGroupID(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSGROUPID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ProcessGroupID(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSGROUPID.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProcessGroupID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProcessGroupID(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcess fco = new CIM_UnixProcess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROCESSGROUPID.NAME);
        if (property != null) {
            property = setPropertyValue_ProcessGroupID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSGROUPID.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProcessGroupID
     * <br>
     * The Group ID of this currently executing process.
     */

    private static CIMProperty setPropertyValue_ProcessGroupID(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProcessNiceValue
     *     * <br>
     * The process's 'nice' value. Used to compute its priority.
     *     */

    public javax.cim.UnsignedInteger32 get_ProcessNiceValue() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSNICEVALUE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROCESSNICEVALUE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property ProcessNiceValue
     * <br>
     * The process's 'nice' value. Used to compute its priority.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProcessNiceValue(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSNICEVALUE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ProcessNiceValue(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSNICEVALUE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProcessNiceValue by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProcessNiceValue(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_UnixProcess fco = new CIM_UnixProcess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROCESSNICEVALUE.NAME);
        if (property != null) {
            property = setPropertyValue_ProcessNiceValue(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSNICEVALUE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProcessNiceValue
     * <br>
     * The process's 'nice' value. Used to compute its priority.
     */

    private static CIMProperty setPropertyValue_ProcessNiceValue(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProcessSessionID
     *     * <br>
     * If part of a group of processes are under the control of a session leader, this property holds the session ID for the group.
     *     */

    public javax.cim.UnsignedInteger64 get_ProcessSessionID() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSSESSIONID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROCESSSESSIONID.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ProcessSessionID
     * <br>
     * If part of a group of processes are under the control of a session leader, this property holds the session ID for the group.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProcessSessionID(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSSESSIONID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ProcessSessionID(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSSESSIONID.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProcessSessionID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProcessSessionID(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcess fco = new CIM_UnixProcess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROCESSSESSIONID.NAME);
        if (property != null) {
            property = setPropertyValue_ProcessSessionID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSSESSIONID.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProcessSessionID
     * <br>
     * If part of a group of processes are under the control of a session leader, this property holds the session ID for the group.
     */

    private static CIMProperty setPropertyValue_ProcessSessionID(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProcessTTY
     *     * <br>
     * The TTY currently associated with this process.
     *     */

    public String get_ProcessTTY() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSTTY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROCESSTTY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ProcessTTY
     * <br>
     * The TTY currently associated with this process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProcessTTY(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSTTY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ProcessTTY(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSTTY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProcessTTY by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProcessTTY(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_UnixProcess fco = new CIM_UnixProcess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROCESSTTY.NAME);
        if (property != null) {
            property = setPropertyValue_ProcessTTY(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSTTY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProcessTTY
     * <br>
     * The TTY currently associated with this process.
     */

    private static CIMProperty setPropertyValue_ProcessTTY(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProcessWaitingForEvent
     *     * <br>
     * A description of the event this process is currently sleeping for. The precise nature of this string is implementation defined, but is typically the address of a system data structure that will be modified when the event occurs. This string only has meaning when the ExecutionState is "Blocked" or "SuspendedBlocked".
     *     */

    public String get_ProcessWaitingForEvent() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSWAITINGFOREVENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROCESSWAITINGFOREVENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ProcessWaitingForEvent
     * <br>
     * A description of the event this process is currently sleeping for. The precise nature of this string is implementation defined, but is typically the address of a system data structure that will be modified when the event occurs. This string only has meaning when the ExecutionState is "Blocked" or "SuspendedBlocked".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProcessWaitingForEvent(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESSWAITINGFOREVENT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ProcessWaitingForEvent(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSWAITINGFOREVENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProcessWaitingForEvent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProcessWaitingForEvent(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_UnixProcess fco = new CIM_UnixProcess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROCESSWAITINGFOREVENT.NAME);
        if (property != null) {
            property = setPropertyValue_ProcessWaitingForEvent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESSWAITINGFOREVENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProcessWaitingForEvent
     * <br>
     * A description of the event this process is currently sleeping for. The precise nature of this string is implementation defined, but is typically the address of a system data structure that will be modified when the event occurs. This string only has meaning when the ExecutionState is "Blocked" or "SuspendedBlocked".
     */

    private static CIMProperty setPropertyValue_ProcessWaitingForEvent(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RealUserID
     *     * <br>
     * The Real User ID of this currently executing process.
     *     */

    public javax.cim.UnsignedInteger64 get_RealUserID() {
        CIMProperty currentProperty = getProperty(PROPERTY_REALUSERID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REALUSERID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RealUserID
     * <br>
     * The Real User ID of this currently executing process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RealUserID(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REALUSERID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_RealUserID(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REALUSERID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RealUserID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RealUserID(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcess fco = new CIM_UnixProcess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REALUSERID.NAME);
        if (property != null) {
            property = setPropertyValue_RealUserID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REALUSERID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RealUserID
     * <br>
     * The Real User ID of this currently executing process.
     */

    private static CIMProperty setPropertyValue_RealUserID(CIMProperty currentProperty,
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
        return CIM_UnixProcess.CIM_CLASS_NAME;
    }

}