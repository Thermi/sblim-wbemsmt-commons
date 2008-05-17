/** 
 * CIM_UnixProcessStatisticalInformation.java
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
 * Description: The statistics associated with a Unix process.
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

public class CIM_UnixProcessStatisticalInformation extends CIM_StatisticalInformation {

    public final static String CIM_CLASS_NAME = "CIM_UnixProcessStatisticalInformation";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * CIM_UnixProcessStatistics is an association that relates a CIM_UnixProcess to its StatisticalInformation.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS = "CIM_UnixProcessStatistics";

    /**
     * Constants of property CPUTime
     * A string used to identify the related statistics of a Process. This key allows multiple instances of statistics to correspond to a single process. The multiple instances could be used in applications such as time-sliced statistics.
     */
    public static class PROPERTY_CPUTIME {
        /**
         * name of the property CPUTime
         */
        public final static String NAME = "CPUTime";

    }

    /**
     * Constants of property CSCreationClassName
     * The scoping Process's ComputerSystem CreationClassName.
     */
    public static class PROPERTY_CSCREATIONCLASSNAME {
        /**
         * name of the property CSCreationClassName
         */
        public final static String NAME = "CSCreationClassName";

    }

    /**
     * Constants of property CSName
     * The scoping Process's ComputerSystem Name.
     */
    public static class PROPERTY_CSNAME {
        /**
         * name of the property CSName
         */
        public final static String NAME = "CSName";

    }

    /**
     * Constants of property CpuTimeDeadChildren
     * CPU time of terminated child processes in clock ticks.
     */
    public static class PROPERTY_CPUTIMEDEADCHILDREN {
        /**
         * name of the property CpuTimeDeadChildren
         */
        public final static String NAME = "CpuTimeDeadChildren";

    }

    /**
     * Constants of property Handle
     * The scoping Process's Handle.
     */
    public static class PROPERTY_HANDLE {
        /**
         * name of the property Handle
         */
        public final static String NAME = "Handle";

    }

    /**
     * Constants of property Name
     * A string used to identify the related statistics of a Process.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property OSCreationClassName
     * The scoping Process's OperatingSystem CreationClassName.
     */
    public static class PROPERTY_OSCREATIONCLASSNAME {
        /**
         * name of the property OSCreationClassName
         */
        public final static String NAME = "OSCreationClassName";

    }

    /**
     * Constants of property OSName
     * The scoping Process's OperatingSystem Name.
     */
    public static class PROPERTY_OSNAME {
        /**
         * name of the property OSName
         */
        public final static String NAME = "OSName";

    }

    /**
     * Constants of property ProcessCreationClassName
     * The scoping Process's CreationClassName.
     */
    public static class PROPERTY_PROCESSCREATIONCLASSNAME {
        /**
         * name of the property ProcessCreationClassName
         */
        public final static String NAME = "ProcessCreationClassName";

    }

    /**
     * Constants of property RealData
     * The number of KiloBytes of real data space used by the process.
     */
    public static class PROPERTY_REALDATA {
        /**
         * name of the property RealData
         */
        public final static String NAME = "RealData";

    }

    /**
     * Constants of property RealStack
     * The number of KiloBytes of real stack space used by the process.
     */
    public static class PROPERTY_REALSTACK {
        /**
         * name of the property RealStack
         */
        public final static String NAME = "RealStack";

    }

    /**
     * Constants of property RealText
     * The number of KiloBytes of real text space used by the process.
     */
    public static class PROPERTY_REALTEXT {
        /**
         * name of the property RealText
         */
        public final static String NAME = "RealText";

    }

    /**
     * Constants of property SystemTimeDeadChildren
     * System time of terminated child processes in clock ticks.
     */
    public static class PROPERTY_SYSTEMTIMEDEADCHILDREN {
        /**
         * name of the property SystemTimeDeadChildren
         */
        public final static String NAME = "SystemTimeDeadChildren";

    }

    /**
     * Constants of property VirtualData
     * The number of KiloBytes of virtual data space used by the process.
     */
    public static class PROPERTY_VIRTUALDATA {
        /**
         * name of the property VirtualData
         */
        public final static String NAME = "VirtualData";

    }

    /**
     * Constants of property VirtualMemoryMappedFileSize
     * The number of KiloBytes of virtual space used for memory mapped files by the process.
     */
    public static class PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE {
        /**
         * name of the property VirtualMemoryMappedFileSize
         */
        public final static String NAME = "VirtualMemoryMappedFileSize";

    }

    /**
     * Constants of property VirtualSharedMemory
     * The number of KiloBytes of shared memory used by the process.
     */
    public static class PROPERTY_VIRTUALSHAREDMEMORY {
        /**
         * name of the property VirtualSharedMemory
         */
        public final static String NAME = "VirtualSharedMemory";

    }

    /**
     * Constants of property VirtualStack
     * The number of KiloBytes of virtual stack space used by the process.
     */
    public static class PROPERTY_VIRTUALSTACK {
        /**
         * name of the property VirtualStack
         */
        public final static String NAME = "VirtualStack";

    }

    /**
     * Constants of property VirtualText
     * The number of KiloBytes of virtual text space used by the process.
     */
    public static class PROPERTY_VIRTUALTEXT {
        /**
         * name of the property VirtualText
         */
        public final static String NAME = "VirtualText";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_StatisticalInformation.getPackages();

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
     *   The statistics associated with a Unix process.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_UnixProcessStatisticalInformation(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The statistics associated with a Unix process.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_UnixProcessStatisticalInformation(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_UnixProcessStatisticalInformation() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CPUTime", new CIMProperty("CPUTime", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("CSCreationClassName", new CIMProperty("CSCreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("CSName", new CIMProperty("CSName", CIMDataType.STRING_T, null));
        propertiesToCheck.put("CpuTimeDeadChildren", new CIMProperty("CpuTimeDeadChildren",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Handle", new CIMProperty("Handle", CIMDataType.STRING_T, null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OSCreationClassName", new CIMProperty("OSCreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("OSName", new CIMProperty("OSName", CIMDataType.STRING_T, null));
        propertiesToCheck.put("ProcessCreationClassName", new CIMProperty(
                "ProcessCreationClassName", CIMDataType.STRING_T, null));
        propertiesToCheck.put("RealData", new CIMProperty("RealData", CIMDataType.UINT64_T, null));
        propertiesToCheck
                .put("RealStack", new CIMProperty("RealStack", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("RealText", new CIMProperty("RealText", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("SystemTimeDeadChildren", new CIMProperty("SystemTimeDeadChildren",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("VirtualData", new CIMProperty("VirtualData", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("VirtualMemoryMappedFileSize", new CIMProperty(
                "VirtualMemoryMappedFileSize", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("VirtualSharedMemory", new CIMProperty("VirtualSharedMemory",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("VirtualStack", new CIMProperty("VirtualStack", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("VirtualText", new CIMProperty("VirtualText", CIMDataType.UINT64_T,
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
     * Get the property CPUTime
     *     * <br>
     * A string used to identify the related statistics of a Process. This key allows multiple instances of statistics to correspond to a single process. The multiple instances could be used in applications such as time-sliced statistics.
     *     */

    public javax.cim.UnsignedInteger32 get_CPUTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_CPUTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CPUTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property CPUTime
     * <br>
     * A string used to identify the related statistics of a Process. This key allows multiple instances of statistics to correspond to a single process. The multiple instances could be used in applications such as time-sliced statistics.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CPUTime(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CPUTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CPUTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CPUTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CPUTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CPUTime(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CPUTIME.NAME);
        if (property != null) {
            property = setPropertyValue_CPUTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CPUTIME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CPUTime
     * <br>
     * A string used to identify the related statistics of a Process. This key allows multiple instances of statistics to correspond to a single process. The multiple instances could be used in applications such as time-sliced statistics.
     */

    private static CIMProperty setPropertyValue_CPUTime(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CSCreationClassName
     *     * <br>
     * The scoping Process's ComputerSystem CreationClassName.
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
     * The scoping Process's ComputerSystem CreationClassName.
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
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
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
     * The scoping Process's ComputerSystem CreationClassName.
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
     * The scoping Process's ComputerSystem Name.
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
     * The scoping Process's ComputerSystem Name.
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
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
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
     * The scoping Process's ComputerSystem Name.
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
     * Get the property CpuTimeDeadChildren
     *     * <br>
     * CPU time of terminated child processes in clock ticks.
     *     */

    public javax.cim.UnsignedInteger64 get_CpuTimeDeadChildren() {
        CIMProperty currentProperty = getProperty(PROPERTY_CPUTIMEDEADCHILDREN.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CPUTIMEDEADCHILDREN.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property CpuTimeDeadChildren
     * <br>
     * CPU time of terminated child processes in clock ticks.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CpuTimeDeadChildren(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CPUTIMEDEADCHILDREN.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CpuTimeDeadChildren(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CPUTIMEDEADCHILDREN.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CpuTimeDeadChildren by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CpuTimeDeadChildren(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CPUTIMEDEADCHILDREN.NAME);
        if (property != null) {
            property = setPropertyValue_CpuTimeDeadChildren(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CPUTIMEDEADCHILDREN.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CpuTimeDeadChildren
     * <br>
     * CPU time of terminated child processes in clock ticks.
     */

    private static CIMProperty setPropertyValue_CpuTimeDeadChildren(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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
     * The scoping Process's Handle.
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
     * The scoping Process's Handle.
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
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
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
     * The scoping Process's Handle.
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
     * Get the property Name
     *     * <br>
     * A string used to identify the related statistics of a Process.
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
     * A string used to identify the related statistics of a Process.
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
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
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
     * A string used to identify the related statistics of a Process.
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
     * Get the property OSCreationClassName
     *     * <br>
     * The scoping Process's OperatingSystem CreationClassName.
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
     * The scoping Process's OperatingSystem CreationClassName.
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
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
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
     * The scoping Process's OperatingSystem CreationClassName.
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
     * The scoping Process's OperatingSystem Name.
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
     * The scoping Process's OperatingSystem Name.
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
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
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
     * The scoping Process's OperatingSystem Name.
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
     * Get the property ProcessCreationClassName
     *     * <br>
     * The scoping Process's CreationClassName.
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
     * The scoping Process's CreationClassName.
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
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
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
     * The scoping Process's CreationClassName.
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
     * Get the property RealData
     *     * <br>
     * The number of KiloBytes of real data space used by the process.
     *     */

    public javax.cim.UnsignedInteger64 get_RealData() {
        CIMProperty currentProperty = getProperty(PROPERTY_REALDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REALDATA.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RealData
     * <br>
     * The number of KiloBytes of real data space used by the process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RealData(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REALDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RealData(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REALDATA.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RealData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RealData(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REALDATA.NAME);
        if (property != null) {
            property = setPropertyValue_RealData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REALDATA.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RealData
     * <br>
     * The number of KiloBytes of real data space used by the process.
     */

    private static CIMProperty setPropertyValue_RealData(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RealStack
     *     * <br>
     * The number of KiloBytes of real stack space used by the process.
     *     */

    public javax.cim.UnsignedInteger64 get_RealStack() {
        CIMProperty currentProperty = getProperty(PROPERTY_REALSTACK.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REALSTACK.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RealStack
     * <br>
     * The number of KiloBytes of real stack space used by the process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RealStack(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REALSTACK.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RealStack(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REALSTACK.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RealStack by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RealStack(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REALSTACK.NAME);
        if (property != null) {
            property = setPropertyValue_RealStack(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REALSTACK.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RealStack
     * <br>
     * The number of KiloBytes of real stack space used by the process.
     */

    private static CIMProperty setPropertyValue_RealStack(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RealText
     *     * <br>
     * The number of KiloBytes of real text space used by the process.
     *     */

    public javax.cim.UnsignedInteger64 get_RealText() {
        CIMProperty currentProperty = getProperty(PROPERTY_REALTEXT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REALTEXT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RealText
     * <br>
     * The number of KiloBytes of real text space used by the process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RealText(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REALTEXT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RealText(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REALTEXT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RealText by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RealText(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REALTEXT.NAME);
        if (property != null) {
            property = setPropertyValue_RealText(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REALTEXT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RealText
     * <br>
     * The number of KiloBytes of real text space used by the process.
     */

    private static CIMProperty setPropertyValue_RealText(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SystemTimeDeadChildren
     *     * <br>
     * System time of terminated child processes in clock ticks.
     *     */

    public javax.cim.UnsignedInteger64 get_SystemTimeDeadChildren() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMTIMEDEADCHILDREN.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEMTIMEDEADCHILDREN.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property SystemTimeDeadChildren
     * <br>
     * System time of terminated child processes in clock ticks.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SystemTimeDeadChildren(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMTIMEDEADCHILDREN.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SystemTimeDeadChildren(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMTIMEDEADCHILDREN.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SystemTimeDeadChildren by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SystemTimeDeadChildren(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMTIMEDEADCHILDREN.NAME);
        if (property != null) {
            property = setPropertyValue_SystemTimeDeadChildren(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMTIMEDEADCHILDREN.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SystemTimeDeadChildren
     * <br>
     * System time of terminated child processes in clock ticks.
     */

    private static CIMProperty setPropertyValue_SystemTimeDeadChildren(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property VirtualData
     *     * <br>
     * The number of KiloBytes of virtual data space used by the process.
     *     */

    public javax.cim.UnsignedInteger64 get_VirtualData() {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VIRTUALDATA.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property VirtualData
     * <br>
     * The number of KiloBytes of virtual data space used by the process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_VirtualData(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_VirtualData(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALDATA.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property VirtualData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VirtualData(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VIRTUALDATA.NAME);
        if (property != null) {
            property = setPropertyValue_VirtualData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALDATA.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property VirtualData
     * <br>
     * The number of KiloBytes of virtual data space used by the process.
     */

    private static CIMProperty setPropertyValue_VirtualData(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property VirtualMemoryMappedFileSize
     *     * <br>
     * The number of KiloBytes of virtual space used for memory mapped files by the process.
     *     */

    public javax.cim.UnsignedInteger64 get_VirtualMemoryMappedFileSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property VirtualMemoryMappedFileSize
     * <br>
     * The number of KiloBytes of virtual space used for memory mapped files by the process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_VirtualMemoryMappedFileSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_VirtualMemoryMappedFileSize(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property VirtualMemoryMappedFileSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VirtualMemoryMappedFileSize(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE.NAME);
        if (property != null) {
            property = setPropertyValue_VirtualMemoryMappedFileSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property VirtualMemoryMappedFileSize
     * <br>
     * The number of KiloBytes of virtual space used for memory mapped files by the process.
     */

    private static CIMProperty setPropertyValue_VirtualMemoryMappedFileSize(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property VirtualSharedMemory
     *     * <br>
     * The number of KiloBytes of shared memory used by the process.
     *     */

    public javax.cim.UnsignedInteger64 get_VirtualSharedMemory() {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALSHAREDMEMORY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VIRTUALSHAREDMEMORY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property VirtualSharedMemory
     * <br>
     * The number of KiloBytes of shared memory used by the process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_VirtualSharedMemory(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALSHAREDMEMORY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_VirtualSharedMemory(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALSHAREDMEMORY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property VirtualSharedMemory by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VirtualSharedMemory(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VIRTUALSHAREDMEMORY.NAME);
        if (property != null) {
            property = setPropertyValue_VirtualSharedMemory(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALSHAREDMEMORY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property VirtualSharedMemory
     * <br>
     * The number of KiloBytes of shared memory used by the process.
     */

    private static CIMProperty setPropertyValue_VirtualSharedMemory(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property VirtualStack
     *     * <br>
     * The number of KiloBytes of virtual stack space used by the process.
     *     */

    public javax.cim.UnsignedInteger64 get_VirtualStack() {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALSTACK.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VIRTUALSTACK.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property VirtualStack
     * <br>
     * The number of KiloBytes of virtual stack space used by the process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_VirtualStack(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALSTACK.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_VirtualStack(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALSTACK.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property VirtualStack by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VirtualStack(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VIRTUALSTACK.NAME);
        if (property != null) {
            property = setPropertyValue_VirtualStack(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALSTACK.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property VirtualStack
     * <br>
     * The number of KiloBytes of virtual stack space used by the process.
     */

    private static CIMProperty setPropertyValue_VirtualStack(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property VirtualText
     *     * <br>
     * The number of KiloBytes of virtual text space used by the process.
     *     */

    public javax.cim.UnsignedInteger64 get_VirtualText() {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALTEXT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VIRTUALTEXT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property VirtualText
     * <br>
     * The number of KiloBytes of virtual text space used by the process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_VirtualText(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALTEXT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_VirtualText(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALTEXT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property VirtualText by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VirtualText(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixProcessStatisticalInformation fco = new CIM_UnixProcessStatisticalInformation(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VIRTUALTEXT.NAME);
        if (property != null) {
            property = setPropertyValue_VirtualText(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALTEXT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property VirtualText
     * <br>
     * The number of KiloBytes of virtual text space used by the process.
     */

    private static CIMProperty setPropertyValue_VirtualText(CIMProperty currentProperty,
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
     * Get the list with CIM_UnixProcess objects associated by the association CIM_UnixProcessStatistics
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_UnixProcess_CIM_UnixProcessStatisticss(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_UnixProcess_CIM_UnixProcessStatisticss(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS,
                CIM_UnixProcess.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_UnixProcess objects associated by the association CIM_UnixProcessStatistics
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

    public java.util.List getAssociated_CIM_UnixProcess_CIM_UnixProcessStatisticss(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_UnixProcess_CIM_UnixProcessStatisticss(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_UnixProcess objects associated by the association CIM_UnixProcessStatistics
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

    public java.util.List getAssociated_CIM_UnixProcess_CIM_UnixProcessStatisticss(
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
                CIM_UnixProcessStatisticalInformationHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_UnixProcessStatisticalInformationHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_UnixProcessStatisticalInformationHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_UnixProcess(cimInstance));
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
                        result.add(new CIM_UnixProcess(cimInstance));
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
                        result.add(new CIM_UnixProcess(cimInstance));
                        continue;
                    }
                }
            }
            CIM_UnixProcessStatisticalInformationHelper.checkException(enumeration);
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

    public java.util.List getAssociated_CIM_UnixProcess_CIM_UnixProcessStatisticsNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_UnixProcess_CIM_UnixProcessStatisticsNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS,
                CIM_UnixProcess.CIM_CLASS_NAME, null, null);
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

    public java.util.List getAssociated_CIM_UnixProcess_CIM_UnixProcessStatisticsNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_UnixProcess_CIM_UnixProcessStatisticsNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_UnixProcessStatistics
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_UnixProcess_CIM_UnixProcessStatisticsNames(
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
                    CIM_UnixProcess.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnixProcessStatisticalInformationHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_UnixProcessStatisticalInformationHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_UnixProcess.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_UnixProcessStatisticalInformationHelper.checkException(enumeration);
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
                CIM_UnixProcessStatisticalInformationHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_UnixProcessStatisticalInformationHelper.checkException(enumeration);

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
            CIM_UnixProcessStatisticalInformationHelper.checkException(enumeration);
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
                CIM_UnixProcessStatisticalInformationHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_UnixProcessStatisticalInformationHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_UnixProcessStatistics.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_UnixProcessStatisticalInformationHelper.checkException(enumeration);
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
        return CIM_UnixProcessStatisticalInformation.CIM_CLASS_NAME;
    }

}