/** 
 * CIM_UnixProcess.java
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
 * Description: Each instance of the CIM_UnixProcess class represents a single instance of a running program. A user of the Operating System will typically see a Process as an application or task. Within an OperatingSystem, a Process is defined by a workspace of memory resources and environmental settings that are allocated to it. On a multitasking System, this workspace prevents intrusion of resources by other Processes. Additionally, a Process can execute as multiple Threads, all which run within the same workspace.
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

public class CIM_UnixProcess extends CIM_Process {

    public final static String CIM_CLASS_NAME = "CIM_UnixProcess";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * CIM_UnixProcessStatistics is an association that relates a CIM_UnixProcess to its StatisticalInformation.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS = "CIM_UnixProcessStatistics";

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
        addPackage("org.sblim.wbemsmt.schema.cim29");
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
            currentProperty = setPropertyValue_ModulePath(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
            currentProperty = setPropertyValue_Parameters(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
            currentProperty = setPropertyValue_ParentProcessID(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
            currentProperty = setPropertyValue_ProcessGroupID(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
            currentProperty = setPropertyValue_ProcessNiceValue(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
            currentProperty = setPropertyValue_ProcessSessionID(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
            currentProperty = setPropertyValue_ProcessTTY(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
            currentProperty = setPropertyValue_ProcessWaitingForEvent(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
            currentProperty = setPropertyValue_RealUserID(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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

    /**
     * Get the list with CIM_UnixProcessStatisticalInformation objects associated by the association CIM_UnixProcessStatistics
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_UnixProcessStatisticalInformation_CIM_UnixProcessStatisticss(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_UnixProcessStatisticalInformation_CIM_UnixProcessStatisticss(
                cimClient, CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS,
                CIM_UnixProcessStatisticalInformation.CIM_CLASS_NAME, null, null, false, false,
                null);

    }

    /**
     * Get the list with CIM_UnixProcessStatisticalInformation objects associated by the association CIM_UnixProcessStatistics
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_UnixProcessStatisticalInformation_CIM_UnixProcessStatisticss(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_UnixProcessStatisticalInformation_CIM_UnixProcessStatisticss(
                cimClient, CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_UnixProcessStatisticalInformation objects associated by the association CIM_UnixProcessStatistics
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_UnixProcessStatisticalInformation_CIM_UnixProcessStatisticss(
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
                CIM_UnixProcessHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_UnixProcessHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_UnixProcessHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_UnixProcessStatisticalInformation(cimInstance));
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
                        result.add(new CIM_UnixProcessStatisticalInformation(cimInstance));
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
                        result.add(new CIM_UnixProcessStatisticalInformation(cimInstance));
                        continue;
                    }
                }
            }
            CIM_UnixProcessHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_UnixProcessStatistics
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_UnixProcessStatisticalInformation_CIM_UnixProcessStatisticsNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_UnixProcessStatisticalInformation_CIM_UnixProcessStatisticsNames(
                cimClient, true, CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS,
                CIM_UnixProcessStatisticalInformation.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_UnixProcessStatistics
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_UnixProcessStatisticalInformation_CIM_UnixProcessStatisticsNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_UnixProcessStatisticalInformation_CIM_UnixProcessStatisticsNames(
                cimClient, true, CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS, resultClass,
                role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_UnixProcessStatistics
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_UnixProcessStatisticalInformation_CIM_UnixProcessStatisticsNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS,
                    CIM_UnixProcessStatisticalInformation.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnixProcessHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_UnixProcessHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_UnixProcessStatisticalInformation.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_UnixProcessHelper.checkException(enumeration);
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
     * Get the list with CIM_UnixProcessStatistics associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_UnixProcessStatistics(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnixProcessHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_UnixProcessHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_UnixProcessStatisticsHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_UnixProcessStatistics(cimInstance));
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
                        result.add(new CIM_UnixProcessStatistics(cimInstance));
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
                        result.add(new CIM_UnixProcessStatistics(cimInstance));
                        continue;
                    }
                }
            }
            CIM_UnixProcessHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_UnixProcessStatistics
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_UnixProcessStatistics(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnixProcessHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_UnixProcessHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_UnixProcessStatistics.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_UnixProcessHelper.checkException(enumeration);
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
        return CIM_UnixProcess.CIM_CLASS_NAME;
    }

}