/** 
 * CIM_NFS.java
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
 * Description: A class derived from RemoteFileSystem representing that the FileSystem is mounted, using the NFS protocol, from a ComputerSystem. The properties of the NFS object deal with the operational aspects of the mount and represent the client-side configuration for NFS access. The FileSystemType (inherited from FileSystem) should be set to indicate the type of this FileSystem as it appears to the client.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_NFS extends CIM_RemoteFileSystem {

    public final static String CIM_CLASS_NAME = "CIM_NFS";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AttributeCaching
     * If set to true: Control attribute caching is enabled. 
     * If set to false: Control attribute caching is disabled.
     */
    public static class PROPERTY_ATTRIBUTECACHING {
        /**
         * name of the property AttributeCaching
         */
        public final static String NAME = "AttributeCaching";

    }

    /**
     * Constants of property AttributeCachingForDirectoriesMax
     * Maximum number of seconds that cached attributes are held after directory update.
     */
    public static class PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX {
        /**
         * name of the property AttributeCachingForDirectoriesMax
         */
        public final static String NAME = "AttributeCachingForDirectoriesMax";

    }

    /**
     * Constants of property AttributeCachingForDirectoriesMin
     * Minimum number of seconds that cached attributes are held after directory update.
     */
    public static class PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN {
        /**
         * name of the property AttributeCachingForDirectoriesMin
         */
        public final static String NAME = "AttributeCachingForDirectoriesMin";

    }

    /**
     * Constants of property AttributeCachingForRegularFilesMax
     * Maximum number of seconds that cached attributes are held after file modification.
     */
    public static class PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX {
        /**
         * name of the property AttributeCachingForRegularFilesMax
         */
        public final static String NAME = "AttributeCachingForRegularFilesMax";

    }

    /**
     * Constants of property AttributeCachingForRegularFilesMin
     * Minimum number of seconds that cached attributes are held after file modification.
     */
    public static class PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN {
        /**
         * name of the property AttributeCachingForRegularFilesMin
         */
        public final static String NAME = "AttributeCachingForRegularFilesMin";

    }

    /**
     * Constants of property ForegroundMount
     * If set to true: Retries are performed in the foreground. 
     * If set to false: If the first mount attempt fails, retries are performed in the background.
     */
    public static class PROPERTY_FOREGROUNDMOUNT {
        /**
         * name of the property ForegroundMount
         */
        public final static String NAME = "ForegroundMount";

    }

    /**
     * Constants of property HardMount
     * If set to true: Once the FileSystem is mounted, NFS requests are retried until the hosting System responds. 
     * If set to false: Once the FileSystem is mounted, an error is returned if the hosting System does not respond.
     */
    public static class PROPERTY_HARDMOUNT {
        /**
         * name of the property HardMount
         */
        public final static String NAME = "HardMount";

    }

    /**
     * Constants of property Interrupt
     * If set to true: Interrupts are permitted for hard mounts. 
     * If set to false : Interrupts are ignored for hard mounts.
     */
    public static class PROPERTY_INTERRUPT {
        /**
         * name of the property Interrupt
         */
        public final static String NAME = "Interrupt";

    }

    /**
     * Constants of property MountFailureRetries
     * Maximum number of mount failure retries allowed.
     */
    public static class PROPERTY_MOUNTFAILURERETRIES {
        /**
         * name of the property MountFailureRetries
         */
        public final static String NAME = "MountFailureRetries";

    }

    /**
     * Constants of property ReadBufferSize
     * Read buffer size in bytes.
     */
    public static class PROPERTY_READBUFFERSIZE {
        /**
         * name of the property ReadBufferSize
         */
        public final static String NAME = "ReadBufferSize";

    }

    /**
     * Constants of property RetransmissionAttempts
     * Maximum number of NFS retransmissions allowed.
     */
    public static class PROPERTY_RETRANSMISSIONATTEMPTS {
        /**
         * name of the property RetransmissionAttempts
         */
        public final static String NAME = "RetransmissionAttempts";

    }

    /**
     * Constants of property RetransmissionTimeout
     * NFS timeout in tenths of a second.
     */
    public static class PROPERTY_RETRANSMISSIONTIMEOUT {
        /**
         * name of the property RetransmissionTimeout
         */
        public final static String NAME = "RetransmissionTimeout";

    }

    /**
     * Constants of property ServerCommunicationPort
     * The remote ComputerSystem's (ie, the NFS File 'Server's) UDP port number.
     */
    public static class PROPERTY_SERVERCOMMUNICATIONPORT {
        /**
         * name of the property ServerCommunicationPort
         */
        public final static String NAME = "ServerCommunicationPort";

    }

    /**
     * Constants of property WriteBufferSize
     * Write buffer size in bytes.
     */
    public static class PROPERTY_WRITEBUFFERSIZE {
        /**
         * name of the property WriteBufferSize
         */
        public final static String NAME = "WriteBufferSize";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_RemoteFileSystem.getPackages();

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
     *   A class derived from RemoteFileSystem representing that the FileSystem is mounted, using the NFS protocol, from a ComputerSystem. The properties of the NFS object deal with the operational aspects of the mount and represent the client-side configuration for NFS access. The FileSystemType (inherited from FileSystem) should be set to indicate the type of this FileSystem as it appears to the client.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_NFS(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A class derived from RemoteFileSystem representing that the FileSystem is mounted, using the NFS protocol, from a ComputerSystem. The properties of the NFS object deal with the operational aspects of the mount and represent the client-side configuration for NFS access. The FileSystemType (inherited from FileSystem) should be set to indicate the type of this FileSystem as it appears to the client.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_NFS(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_NFS() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AttributeCaching", new CIMProperty("AttributeCaching",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("AttributeCachingForDirectoriesMax", new CIMProperty(
                "AttributeCachingForDirectoriesMax", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("AttributeCachingForDirectoriesMin", new CIMProperty(
                "AttributeCachingForDirectoriesMin", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("AttributeCachingForRegularFilesMax", new CIMProperty(
                "AttributeCachingForRegularFilesMax", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("AttributeCachingForRegularFilesMin", new CIMProperty(
                "AttributeCachingForRegularFilesMin", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ForegroundMount", new CIMProperty("ForegroundMount",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("HardMount",
                new CIMProperty("HardMount", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("Interrupt",
                new CIMProperty("Interrupt", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("MountFailureRetries", new CIMProperty("MountFailureRetries",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ReadBufferSize", new CIMProperty("ReadBufferSize",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("RetransmissionAttempts", new CIMProperty("RetransmissionAttempts",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("RetransmissionTimeout", new CIMProperty("RetransmissionTimeout",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("ServerCommunicationPort", new CIMProperty("ServerCommunicationPort",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("WriteBufferSize", new CIMProperty("WriteBufferSize",
                CIMDataType.UINT64_T, null));

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
     * Get the property AttributeCaching
     *     * <br>
     * If set to true: Control attribute caching is enabled. 
     * If set to false: Control attribute caching is disabled.
     *     */

    public Boolean get_AttributeCaching() {
        CIMProperty currentProperty = getProperty(PROPERTY_ATTRIBUTECACHING.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property AttributeCaching
     * <br>
     * If set to true: Control attribute caching is enabled. 
     * If set to false: Control attribute caching is disabled.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AttributeCaching(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ATTRIBUTECACHING.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AttributeCaching(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AttributeCaching by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AttributeCaching(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ATTRIBUTECACHING.NAME);
        if (property != null) {
            property = setPropertyValue_AttributeCaching(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHING.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AttributeCaching
     * <br>
     * If set to true: Control attribute caching is enabled. 
     * If set to false: Control attribute caching is disabled.
     */

    private static CIMProperty setPropertyValue_AttributeCaching(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AttributeCachingForDirectoriesMax
     *     * <br>
     * Maximum number of seconds that cached attributes are held after directory update.
     *     */

    public javax.cim.UnsignedInteger16 get_AttributeCachingForDirectoriesMax() {
        CIMProperty currentProperty = getProperty(PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property AttributeCachingForDirectoriesMax
     * <br>
     * Maximum number of seconds that cached attributes are held after directory update.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AttributeCachingForDirectoriesMax(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AttributeCachingForDirectoriesMax(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AttributeCachingForDirectoriesMax by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AttributeCachingForDirectoriesMax(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX.NAME);
        if (property != null) {
            property = setPropertyValue_AttributeCachingForDirectoriesMax(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMAX.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AttributeCachingForDirectoriesMax
     * <br>
     * Maximum number of seconds that cached attributes are held after directory update.
     */

    private static CIMProperty setPropertyValue_AttributeCachingForDirectoriesMax(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AttributeCachingForDirectoriesMin
     *     * <br>
     * Minimum number of seconds that cached attributes are held after directory update.
     *     */

    public javax.cim.UnsignedInteger16 get_AttributeCachingForDirectoriesMin() {
        CIMProperty currentProperty = getProperty(PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property AttributeCachingForDirectoriesMin
     * <br>
     * Minimum number of seconds that cached attributes are held after directory update.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AttributeCachingForDirectoriesMin(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AttributeCachingForDirectoriesMin(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AttributeCachingForDirectoriesMin by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AttributeCachingForDirectoriesMin(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN.NAME);
        if (property != null) {
            property = setPropertyValue_AttributeCachingForDirectoriesMin(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHINGFORDIRECTORIESMIN.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AttributeCachingForDirectoriesMin
     * <br>
     * Minimum number of seconds that cached attributes are held after directory update.
     */

    private static CIMProperty setPropertyValue_AttributeCachingForDirectoriesMin(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AttributeCachingForRegularFilesMax
     *     * <br>
     * Maximum number of seconds that cached attributes are held after file modification.
     *     */

    public javax.cim.UnsignedInteger16 get_AttributeCachingForRegularFilesMax() {
        CIMProperty currentProperty = getProperty(PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property AttributeCachingForRegularFilesMax
     * <br>
     * Maximum number of seconds that cached attributes are held after file modification.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AttributeCachingForRegularFilesMax(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AttributeCachingForRegularFilesMax(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AttributeCachingForRegularFilesMax by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AttributeCachingForRegularFilesMax(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX.NAME);
        if (property != null) {
            property = setPropertyValue_AttributeCachingForRegularFilesMax(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMAX.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AttributeCachingForRegularFilesMax
     * <br>
     * Maximum number of seconds that cached attributes are held after file modification.
     */

    private static CIMProperty setPropertyValue_AttributeCachingForRegularFilesMax(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AttributeCachingForRegularFilesMin
     *     * <br>
     * Minimum number of seconds that cached attributes are held after file modification.
     *     */

    public javax.cim.UnsignedInteger16 get_AttributeCachingForRegularFilesMin() {
        CIMProperty currentProperty = getProperty(PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property AttributeCachingForRegularFilesMin
     * <br>
     * Minimum number of seconds that cached attributes are held after file modification.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AttributeCachingForRegularFilesMin(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AttributeCachingForRegularFilesMin(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AttributeCachingForRegularFilesMin by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AttributeCachingForRegularFilesMin(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN.NAME);
        if (property != null) {
            property = setPropertyValue_AttributeCachingForRegularFilesMin(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ATTRIBUTECACHINGFORREGULARFILESMIN.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AttributeCachingForRegularFilesMin
     * <br>
     * Minimum number of seconds that cached attributes are held after file modification.
     */

    private static CIMProperty setPropertyValue_AttributeCachingForRegularFilesMin(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ForegroundMount
     *     * <br>
     * If set to true: Retries are performed in the foreground. 
     * If set to false: If the first mount attempt fails, retries are performed in the background.
     *     */

    public Boolean get_ForegroundMount() {
        CIMProperty currentProperty = getProperty(PROPERTY_FOREGROUNDMOUNT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FOREGROUNDMOUNT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property ForegroundMount
     * <br>
     * If set to true: Retries are performed in the foreground. 
     * If set to false: If the first mount attempt fails, retries are performed in the background.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ForegroundMount(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FOREGROUNDMOUNT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ForegroundMount(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FOREGROUNDMOUNT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ForegroundMount by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ForegroundMount(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FOREGROUNDMOUNT.NAME);
        if (property != null) {
            property = setPropertyValue_ForegroundMount(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FOREGROUNDMOUNT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ForegroundMount
     * <br>
     * If set to true: Retries are performed in the foreground. 
     * If set to false: If the first mount attempt fails, retries are performed in the background.
     */

    private static CIMProperty setPropertyValue_ForegroundMount(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property HardMount
     *     * <br>
     * If set to true: Once the FileSystem is mounted, NFS requests are retried until the hosting System responds. 
     * If set to false: Once the FileSystem is mounted, an error is returned if the hosting System does not respond.
     *     */

    public Boolean get_HardMount() {
        CIMProperty currentProperty = getProperty(PROPERTY_HARDMOUNT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_HARDMOUNT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property HardMount
     * <br>
     * If set to true: Once the FileSystem is mounted, NFS requests are retried until the hosting System responds. 
     * If set to false: Once the FileSystem is mounted, an error is returned if the hosting System does not respond.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_HardMount(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HARDMOUNT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_HardMount(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_HARDMOUNT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property HardMount by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_HardMount(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HARDMOUNT.NAME);
        if (property != null) {
            property = setPropertyValue_HardMount(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_HARDMOUNT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property HardMount
     * <br>
     * If set to true: Once the FileSystem is mounted, NFS requests are retried until the hosting System responds. 
     * If set to false: Once the FileSystem is mounted, an error is returned if the hosting System does not respond.
     */

    private static CIMProperty setPropertyValue_HardMount(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Interrupt
     *     * <br>
     * If set to true: Interrupts are permitted for hard mounts. 
     * If set to false : Interrupts are ignored for hard mounts.
     *     */

    public Boolean get_Interrupt() {
        CIMProperty currentProperty = getProperty(PROPERTY_INTERRUPT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INTERRUPT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property Interrupt
     * <br>
     * If set to true: Interrupts are permitted for hard mounts. 
     * If set to false : Interrupts are ignored for hard mounts.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Interrupt(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INTERRUPT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Interrupt(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INTERRUPT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Interrupt by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Interrupt(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INTERRUPT.NAME);
        if (property != null) {
            property = setPropertyValue_Interrupt(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INTERRUPT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Interrupt
     * <br>
     * If set to true: Interrupts are permitted for hard mounts. 
     * If set to false : Interrupts are ignored for hard mounts.
     */

    private static CIMProperty setPropertyValue_Interrupt(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MountFailureRetries
     *     * <br>
     * Maximum number of mount failure retries allowed.
     *     */

    public javax.cim.UnsignedInteger16 get_MountFailureRetries() {
        CIMProperty currentProperty = getProperty(PROPERTY_MOUNTFAILURERETRIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MOUNTFAILURERETRIES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property MountFailureRetries
     * <br>
     * Maximum number of mount failure retries allowed.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MountFailureRetries(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MOUNTFAILURERETRIES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MountFailureRetries(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MOUNTFAILURERETRIES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MountFailureRetries by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MountFailureRetries(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MOUNTFAILURERETRIES.NAME);
        if (property != null) {
            property = setPropertyValue_MountFailureRetries(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MOUNTFAILURERETRIES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MountFailureRetries
     * <br>
     * Maximum number of mount failure retries allowed.
     */

    private static CIMProperty setPropertyValue_MountFailureRetries(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReadBufferSize
     *     * <br>
     * Read buffer size in bytes.
     *     */

    public javax.cim.UnsignedInteger64 get_ReadBufferSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_READBUFFERSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_READBUFFERSIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ReadBufferSize
     * <br>
     * Read buffer size in bytes.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReadBufferSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_READBUFFERSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReadBufferSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_READBUFFERSIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReadBufferSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReadBufferSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_READBUFFERSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_ReadBufferSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_READBUFFERSIZE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReadBufferSize
     * <br>
     * Read buffer size in bytes.
     */

    private static CIMProperty setPropertyValue_ReadBufferSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RetransmissionAttempts
     *     * <br>
     * Maximum number of NFS retransmissions allowed.
     *     */

    public javax.cim.UnsignedInteger16 get_RetransmissionAttempts() {
        CIMProperty currentProperty = getProperty(PROPERTY_RETRANSMISSIONATTEMPTS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RETRANSMISSIONATTEMPTS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RetransmissionAttempts
     * <br>
     * Maximum number of NFS retransmissions allowed.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RetransmissionAttempts(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RETRANSMISSIONATTEMPTS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RetransmissionAttempts(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RETRANSMISSIONATTEMPTS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RetransmissionAttempts by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RetransmissionAttempts(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RETRANSMISSIONATTEMPTS.NAME);
        if (property != null) {
            property = setPropertyValue_RetransmissionAttempts(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RETRANSMISSIONATTEMPTS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RetransmissionAttempts
     * <br>
     * Maximum number of NFS retransmissions allowed.
     */

    private static CIMProperty setPropertyValue_RetransmissionAttempts(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RetransmissionTimeout
     *     * <br>
     * NFS timeout in tenths of a second.
     *     */

    public javax.cim.UnsignedInteger32 get_RetransmissionTimeout() {
        CIMProperty currentProperty = getProperty(PROPERTY_RETRANSMISSIONTIMEOUT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RETRANSMISSIONTIMEOUT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property RetransmissionTimeout
     * <br>
     * NFS timeout in tenths of a second.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RetransmissionTimeout(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RETRANSMISSIONTIMEOUT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RetransmissionTimeout(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RETRANSMISSIONTIMEOUT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RetransmissionTimeout by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RetransmissionTimeout(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RETRANSMISSIONTIMEOUT.NAME);
        if (property != null) {
            property = setPropertyValue_RetransmissionTimeout(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RETRANSMISSIONTIMEOUT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RetransmissionTimeout
     * <br>
     * NFS timeout in tenths of a second.
     */

    private static CIMProperty setPropertyValue_RetransmissionTimeout(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ServerCommunicationPort
     *     * <br>
     * The remote ComputerSystem's (ie, the NFS File 'Server's) UDP port number.
     *     */

    public javax.cim.UnsignedInteger32 get_ServerCommunicationPort() {
        CIMProperty currentProperty = getProperty(PROPERTY_SERVERCOMMUNICATIONPORT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SERVERCOMMUNICATIONPORT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property ServerCommunicationPort
     * <br>
     * The remote ComputerSystem's (ie, the NFS File 'Server's) UDP port number.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ServerCommunicationPort(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SERVERCOMMUNICATIONPORT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ServerCommunicationPort(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SERVERCOMMUNICATIONPORT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ServerCommunicationPort by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ServerCommunicationPort(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SERVERCOMMUNICATIONPORT.NAME);
        if (property != null) {
            property = setPropertyValue_ServerCommunicationPort(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SERVERCOMMUNICATIONPORT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ServerCommunicationPort
     * <br>
     * The remote ComputerSystem's (ie, the NFS File 'Server's) UDP port number.
     */

    private static CIMProperty setPropertyValue_ServerCommunicationPort(
            CIMProperty currentProperty, javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property WriteBufferSize
     *     * <br>
     * Write buffer size in bytes.
     *     */

    public javax.cim.UnsignedInteger64 get_WriteBufferSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_WRITEBUFFERSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_WRITEBUFFERSIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property WriteBufferSize
     * <br>
     * Write buffer size in bytes.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_WriteBufferSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_WRITEBUFFERSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_WriteBufferSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_WRITEBUFFERSIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property WriteBufferSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_WriteBufferSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NFS fco = new CIM_NFS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_WRITEBUFFERSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_WriteBufferSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_WRITEBUFFERSIZE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property WriteBufferSize
     * <br>
     * Write buffer size in bytes.
     */

    private static CIMProperty setPropertyValue_WriteBufferSize(CIMProperty currentProperty,
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
        return CIM_NFS.CIM_CLASS_NAME;
    }

}