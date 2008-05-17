/** 
 * CIM_UnixFile.java
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
 * Description: The UnixFile class holds properties that are valid for various subclasses of LogicalFile, in a Unix environment. This is defined as a separate and unique class since it is applicable to Unix files, directories, etc. It is associated via a FileIdentity relationship to these subclasses of LogicalFile. Unless this approach of creating and associating a separate class is used, it is necessary to subclass each of the inheritance hierarchies under LogicalFile, duplicating the properties in this class. The referenced _PC* and _POSIX* constants are defined in unistd.h. Some properties indicate whether the UNIX implementation support a feature such as asynchronous I/O or priority I/O. If supported, sysconf returns the value as defined in the appropriate header file such as unistd.h. If a feature is not supported, then pathconf returns a -1. In this case, the corresponding property should be returned without any value.
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

public class CIM_UnixFile extends CIM_LogicalElement {

    public final static String CIM_CLASS_NAME = "CIM_UnixFile";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * CIM_FileIdentity indicates that a UnixFile describes Unix- specific aspects of the various subclasses of LogicalFile. The association exists since it forces UnixFile to be weak to (scoped by) the LogicalFile. This is not true in the association's superclass, LogicalIdentity.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY = "CIM_FileIdentity";

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
     * Constants of property FSCreationClassName
     * The scoping FileSystem's CreationClassName.
     */
    public static class PROPERTY_FSCREATIONCLASSNAME {
        /**
         * name of the property FSCreationClassName
         */
        public final static String NAME = "FSCreationClassName";

    }

    /**
     * Constants of property FSName
     * The scoping FileSystem's Name.
     */
    public static class PROPERTY_FSNAME {
        /**
         * name of the property FSName
         */
        public final static String NAME = "FSName";

    }

    /**
     * Constants of property FileInodeNumber
     * File Inode number, as printed by "ls -i".
     */
    public static class PROPERTY_FILEINODENUMBER {
        /**
         * name of the property FileInodeNumber
         */
        public final static String NAME = "FileInodeNumber";

    }

    /**
     * Constants of property GroupID
     * An identifier that describes the group that owns this file.
     */
    public static class PROPERTY_GROUPID {
        /**
         * name of the property GroupID
         */
        public final static String NAME = "GroupID";

    }

    /**
     * Constants of property LFCreationClassName
     * The scoping LogicalFile's CreationClassName.
     */
    public static class PROPERTY_LFCREATIONCLASSNAME {
        /**
         * name of the property LFCreationClassName
         */
        public final static String NAME = "LFCreationClassName";

    }

    /**
     * Constants of property LFName
     * The scoping LogicalFile's Name.
     */
    public static class PROPERTY_LFNAME {
        /**
         * name of the property LFName
         */
        public final static String NAME = "LFName";

    }

    /**
     * Constants of property LastModifiedInode
     * The time that the Inode was last modified. This includes the Inode creation time, state modification, and etc.
     */
    public static class PROPERTY_LASTMODIFIEDINODE {
        /**
         * name of the property LastModifiedInode
         */
        public final static String NAME = "LastModifiedInode";

    }

    /**
     * Constants of property LinkCount
     * Count of the number of names for this file.
     */
    public static class PROPERTY_LINKCOUNT {
        /**
         * name of the property LinkCount
         */
        public final static String NAME = "LinkCount";

    }

    /**
     * Constants of property LinkMax
     * Maximum number of links to a single file.
     */
    public static class PROPERTY_LINKMAX {
        /**
         * name of the property LinkMax
         */
        public final static String NAME = "LinkMax";

    }

    /**
     * Constants of property NameMax
     * Maximum number of bytes in a filename, not including terminating null.
     */
    public static class PROPERTY_NAMEMAX {
        /**
         * name of the property NameMax
         */
        public final static String NAME = "NameMax";

    }

    /**
     * Constants of property PathMax
     * Maximum number of bytes in a pathname, including the terminating null character.
     */
    public static class PROPERTY_PATHMAX {
        /**
         * name of the property PathMax
         */
        public final static String NAME = "PathMax";

    }

    /**
     * Constants of property PosixAsyncIo
     * Indicates whether asynchronous input or output operations may be performed for the associated file.
     */
    public static class PROPERTY_POSIXASYNCIO {
        /**
         * name of the property PosixAsyncIo
         */
        public final static String NAME = "PosixAsyncIo";

    }

    /**
     * Constants of property PosixChownRestricted
     * The use of chown() is restricted to a process with appropriate privileges. chown() is used to change the group ID of a file. The group ID can be changed to the effective group ID or one of its supplementary group IDs.
     */
    public static class PROPERTY_POSIXCHOWNRESTRICTED {
        /**
         * name of the property PosixChownRestricted
         */
        public final static String NAME = "PosixChownRestricted";

    }

    /**
     * Constants of property PosixNoTrunc
     * Indicates whether pathname components longer than NameMax generate an error.
     */
    public static class PROPERTY_POSIXNOTRUNC {
        /**
         * name of the property PosixNoTrunc
         */
        public final static String NAME = "PosixNoTrunc";

    }

    /**
     * Constants of property PosixPrioIo
     * Indicates whether prioritized input or output operations may be performed for the associated file.
     */
    public static class PROPERTY_POSIXPRIOIO {
        /**
         * name of the property PosixPrioIo
         */
        public final static String NAME = "PosixPrioIo";

    }

    /**
     * Constants of property PosixSyncIo
     * Indicates whether synchronised input or output operations may be performed for the associated file.
     */
    public static class PROPERTY_POSIXSYNCIO {
        /**
         * name of the property PosixSyncIo
         */
        public final static String NAME = "PosixSyncIo";

    }

    /**
     * Constants of property SaveText
     * Indicates restricted deletion for directories, or possible implementation defined properties for executable files. For directories this is known as the sticky bit.
     */
    public static class PROPERTY_SAVETEXT {
        /**
         * name of the property SaveText
         */
        public final static String NAME = "SaveText";

    }

    /**
     * Constants of property SetGid
     * Indicates whether the associated file has setgid permissions.
     */
    public static class PROPERTY_SETGID {
        /**
         * name of the property SetGid
         */
        public final static String NAME = "SetGid";

    }

    /**
     * Constants of property SetUid
     * Indicates whether the associated file has setuid permissions.
     */
    public static class PROPERTY_SETUID {
        /**
         * name of the property SetUid
         */
        public final static String NAME = "SetUid";

    }

    /**
     * Constants of property UserID
     * An Identifer that uniquely describes the owner of this file.
     */
    public static class PROPERTY_USERID {
        /**
         * name of the property UserID
         */
        public final static String NAME = "UserID";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_LogicalElement.getPackages();

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
     *   The UnixFile class holds properties that are valid for various subclasses of LogicalFile, in a Unix environment. This is defined as a separate and unique class since it is applicable to Unix files, directories, etc. It is associated via a FileIdentity relationship to these subclasses of LogicalFile. Unless this approach of creating and associating a separate class is used, it is necessary to subclass each of the inheritance hierarchies under LogicalFile, duplicating the properties in this class. The referenced _PC* and _POSIX* constants are defined in unistd.h. Some properties indicate whether the UNIX implementation support a feature such as asynchronous I/O or priority I/O. If supported, sysconf returns the value as defined in the appropriate header file such as unistd.h. If a feature is not supported, then pathconf returns a -1. In this case, the corresponding property should be returned without any value.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_UnixFile(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The UnixFile class holds properties that are valid for various subclasses of LogicalFile, in a Unix environment. This is defined as a separate and unique class since it is applicable to Unix files, directories, etc. It is associated via a FileIdentity relationship to these subclasses of LogicalFile. Unless this approach of creating and associating a separate class is used, it is necessary to subclass each of the inheritance hierarchies under LogicalFile, duplicating the properties in this class. The referenced _PC* and _POSIX* constants are defined in unistd.h. Some properties indicate whether the UNIX implementation support a feature such as asynchronous I/O or priority I/O. If supported, sysconf returns the value as defined in the appropriate header file such as unistd.h. If a feature is not supported, then pathconf returns a -1. In this case, the corresponding property should be returned without any value.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_UnixFile(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_UnixFile() {
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
        propertiesToCheck.put("FSCreationClassName", new CIMProperty("FSCreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("FSName", new CIMProperty("FSName", CIMDataType.STRING_T, null));
        propertiesToCheck.put("FileInodeNumber", new CIMProperty("FileInodeNumber",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("GroupID", new CIMProperty("GroupID", CIMDataType.STRING_T, null));
        propertiesToCheck.put("LFCreationClassName", new CIMProperty("LFCreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("LFName", new CIMProperty("LFName", CIMDataType.STRING_T, null));
        propertiesToCheck.put("LastModifiedInode", new CIMProperty("LastModifiedInode",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck
                .put("LinkCount", new CIMProperty("LinkCount", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("LinkMax", new CIMProperty("LinkMax", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("NameMax", new CIMProperty("NameMax", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PathMax", new CIMProperty("PathMax", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PosixAsyncIo", new CIMProperty("PosixAsyncIo", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("PosixChownRestricted", new CIMProperty("PosixChownRestricted",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PosixNoTrunc", new CIMProperty("PosixNoTrunc", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("PosixPrioIo", new CIMProperty("PosixPrioIo", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("PosixSyncIo", new CIMProperty("PosixSyncIo", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("SaveText", new CIMProperty("SaveText", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("SetGid", new CIMProperty("SetGid", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("SetUid", new CIMProperty("SetUid", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("UserID", new CIMProperty("UserID", CIMDataType.STRING_T, null));

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
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
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
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
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
     * Get the property FSCreationClassName
     *     * <br>
     * The scoping FileSystem's CreationClassName.
     *     */

    public String get_key_FSCreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_FSCREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property FSCreationClassName
     * <br>
     * The scoping FileSystem's CreationClassName.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_FSCreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FSCREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_FSCreationClassName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FSCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_FSCreationClassName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FSCREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_FSCreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FSCREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FSCreationClassName
     * <br>
     * The scoping FileSystem's CreationClassName.
     */

    private static CIMProperty setPropertyValue_key_FSCreationClassName(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FSName
     *     * <br>
     * The scoping FileSystem's Name.
     *     */

    public String get_key_FSName() {
        CIMProperty currentProperty = getProperty(PROPERTY_FSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FSNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property FSName
     * <br>
     * The scoping FileSystem's Name.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_FSName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_FSName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FSNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FSName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_FSName(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_FSName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FSNAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FSName
     * <br>
     * The scoping FileSystem's Name.
     */

    private static CIMProperty setPropertyValue_key_FSName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FileInodeNumber
     *     * <br>
     * File Inode number, as printed by "ls -i".
     *     */

    public String get_FileInodeNumber() {
        CIMProperty currentProperty = getProperty(PROPERTY_FILEINODENUMBER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FILEINODENUMBER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property FileInodeNumber
     * <br>
     * File Inode number, as printed by "ls -i".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FileInodeNumber(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FILEINODENUMBER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FileInodeNumber(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FILEINODENUMBER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FileInodeNumber by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FileInodeNumber(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FILEINODENUMBER.NAME);
        if (property != null) {
            property = setPropertyValue_FileInodeNumber(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FILEINODENUMBER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FileInodeNumber
     * <br>
     * File Inode number, as printed by "ls -i".
     */

    private static CIMProperty setPropertyValue_FileInodeNumber(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property GroupID
     *     * <br>
     * An identifier that describes the group that owns this file.
     *     */

    public String get_GroupID() {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GROUPID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property GroupID
     * <br>
     * An identifier that describes the group that owns this file.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GroupID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPID.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_GroupID(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property GroupID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GroupID(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GROUPID.NAME);
        if (property != null) {
            property = setPropertyValue_GroupID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GroupID
     * <br>
     * An identifier that describes the group that owns this file.
     */

    private static CIMProperty setPropertyValue_GroupID(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LFCreationClassName
     *     * <br>
     * The scoping LogicalFile's CreationClassName.
     *     */

    public String get_key_LFCreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_LFCREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LFCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property LFCreationClassName
     * <br>
     * The scoping LogicalFile's CreationClassName.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_LFCreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LFCREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_LFCreationClassName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LFCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LFCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_LFCreationClassName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LFCREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_LFCreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LFCREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LFCreationClassName
     * <br>
     * The scoping LogicalFile's CreationClassName.
     */

    private static CIMProperty setPropertyValue_key_LFCreationClassName(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LFName
     *     * <br>
     * The scoping LogicalFile's Name.
     *     */

    public String get_key_LFName() {
        CIMProperty currentProperty = getProperty(PROPERTY_LFNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LFNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property LFName
     * <br>
     * The scoping LogicalFile's Name.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_LFName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LFNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_LFName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LFNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LFName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_LFName(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LFNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_LFName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LFNAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LFName
     * <br>
     * The scoping LogicalFile's Name.
     */

    private static CIMProperty setPropertyValue_key_LFName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LastModifiedInode
     *     * <br>
     * The time that the Inode was last modified. This includes the Inode creation time, state modification, and etc.
     *     */

    public javax.cim.CIMDateTime get_LastModifiedInode() {
        CIMProperty currentProperty = getProperty(PROPERTY_LASTMODIFIEDINODE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LASTMODIFIEDINODE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property LastModifiedInode
     * <br>
     * The time that the Inode was last modified. This includes the Inode creation time, state modification, and etc.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LastModifiedInode(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LASTMODIFIEDINODE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LastModifiedInode(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LASTMODIFIEDINODE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LastModifiedInode by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LastModifiedInode(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LASTMODIFIEDINODE.NAME);
        if (property != null) {
            property = setPropertyValue_LastModifiedInode(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LASTMODIFIEDINODE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LastModifiedInode
     * <br>
     * The time that the Inode was last modified. This includes the Inode creation time, state modification, and etc.
     */

    private static CIMProperty setPropertyValue_LastModifiedInode(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LinkCount
     *     * <br>
     * Count of the number of names for this file.
     *     */

    public javax.cim.UnsignedInteger64 get_LinkCount() {
        CIMProperty currentProperty = getProperty(PROPERTY_LINKCOUNT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LINKCOUNT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property LinkCount
     * <br>
     * Count of the number of names for this file.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LinkCount(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LINKCOUNT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LinkCount(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LINKCOUNT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LinkCount by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LinkCount(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LINKCOUNT.NAME);
        if (property != null) {
            property = setPropertyValue_LinkCount(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LINKCOUNT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LinkCount
     * <br>
     * Count of the number of names for this file.
     */

    private static CIMProperty setPropertyValue_LinkCount(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LinkMax
     *     * <br>
     * Maximum number of links to a single file.
     *     */

    public javax.cim.UnsignedInteger64 get_LinkMax() {
        CIMProperty currentProperty = getProperty(PROPERTY_LINKMAX.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LINKMAX.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property LinkMax
     * <br>
     * Maximum number of links to a single file.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LinkMax(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LINKMAX.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LinkMax(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LINKMAX.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LinkMax by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LinkMax(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LINKMAX.NAME);
        if (property != null) {
            property = setPropertyValue_LinkMax(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LINKMAX.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LinkMax
     * <br>
     * Maximum number of links to a single file.
     */

    private static CIMProperty setPropertyValue_LinkMax(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NameMax
     *     * <br>
     * Maximum number of bytes in a filename, not including terminating null.
     *     */

    public javax.cim.UnsignedInteger64 get_NameMax() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEMAX.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAMEMAX.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property NameMax
     * <br>
     * Maximum number of bytes in a filename, not including terminating null.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NameMax(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEMAX.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NameMax(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEMAX.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NameMax by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NameMax(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAMEMAX.NAME);
        if (property != null) {
            property = setPropertyValue_NameMax(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEMAX.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NameMax
     * <br>
     * Maximum number of bytes in a filename, not including terminating null.
     */

    private static CIMProperty setPropertyValue_NameMax(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PathMax
     *     * <br>
     * Maximum number of bytes in a pathname, including the terminating null character.
     *     */

    public javax.cim.UnsignedInteger64 get_PathMax() {
        CIMProperty currentProperty = getProperty(PROPERTY_PATHMAX.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PATHMAX.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PathMax
     * <br>
     * Maximum number of bytes in a pathname, including the terminating null character.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PathMax(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PATHMAX.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PathMax(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PATHMAX.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PathMax by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PathMax(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PATHMAX.NAME);
        if (property != null) {
            property = setPropertyValue_PathMax(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PATHMAX.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PathMax
     * <br>
     * Maximum number of bytes in a pathname, including the terminating null character.
     */

    private static CIMProperty setPropertyValue_PathMax(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PosixAsyncIo
     *     * <br>
     * Indicates whether asynchronous input or output operations may be performed for the associated file.
     *     */

    public javax.cim.UnsignedInteger64 get_PosixAsyncIo() {
        CIMProperty currentProperty = getProperty(PROPERTY_POSIXASYNCIO.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_POSIXASYNCIO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PosixAsyncIo
     * <br>
     * Indicates whether asynchronous input or output operations may be performed for the associated file.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PosixAsyncIo(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POSIXASYNCIO.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PosixAsyncIo(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_POSIXASYNCIO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PosixAsyncIo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PosixAsyncIo(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POSIXASYNCIO.NAME);
        if (property != null) {
            property = setPropertyValue_PosixAsyncIo(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_POSIXASYNCIO.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PosixAsyncIo
     * <br>
     * Indicates whether asynchronous input or output operations may be performed for the associated file.
     */

    private static CIMProperty setPropertyValue_PosixAsyncIo(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PosixChownRestricted
     *     * <br>
     * The use of chown() is restricted to a process with appropriate privileges. chown() is used to change the group ID of a file. The group ID can be changed to the effective group ID or one of its supplementary group IDs.
     *     */

    public javax.cim.UnsignedInteger64 get_PosixChownRestricted() {
        CIMProperty currentProperty = getProperty(PROPERTY_POSIXCHOWNRESTRICTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_POSIXCHOWNRESTRICTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PosixChownRestricted
     * <br>
     * The use of chown() is restricted to a process with appropriate privileges. chown() is used to change the group ID of a file. The group ID can be changed to the effective group ID or one of its supplementary group IDs.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PosixChownRestricted(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POSIXCHOWNRESTRICTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PosixChownRestricted(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_POSIXCHOWNRESTRICTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PosixChownRestricted by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PosixChownRestricted(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POSIXCHOWNRESTRICTED.NAME);
        if (property != null) {
            property = setPropertyValue_PosixChownRestricted(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_POSIXCHOWNRESTRICTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PosixChownRestricted
     * <br>
     * The use of chown() is restricted to a process with appropriate privileges. chown() is used to change the group ID of a file. The group ID can be changed to the effective group ID or one of its supplementary group IDs.
     */

    private static CIMProperty setPropertyValue_PosixChownRestricted(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PosixNoTrunc
     *     * <br>
     * Indicates whether pathname components longer than NameMax generate an error.
     *     */

    public javax.cim.UnsignedInteger64 get_PosixNoTrunc() {
        CIMProperty currentProperty = getProperty(PROPERTY_POSIXNOTRUNC.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_POSIXNOTRUNC.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PosixNoTrunc
     * <br>
     * Indicates whether pathname components longer than NameMax generate an error.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PosixNoTrunc(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POSIXNOTRUNC.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PosixNoTrunc(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_POSIXNOTRUNC.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PosixNoTrunc by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PosixNoTrunc(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POSIXNOTRUNC.NAME);
        if (property != null) {
            property = setPropertyValue_PosixNoTrunc(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_POSIXNOTRUNC.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PosixNoTrunc
     * <br>
     * Indicates whether pathname components longer than NameMax generate an error.
     */

    private static CIMProperty setPropertyValue_PosixNoTrunc(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PosixPrioIo
     *     * <br>
     * Indicates whether prioritized input or output operations may be performed for the associated file.
     *     */

    public javax.cim.UnsignedInteger64 get_PosixPrioIo() {
        CIMProperty currentProperty = getProperty(PROPERTY_POSIXPRIOIO.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_POSIXPRIOIO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PosixPrioIo
     * <br>
     * Indicates whether prioritized input or output operations may be performed for the associated file.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PosixPrioIo(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POSIXPRIOIO.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PosixPrioIo(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_POSIXPRIOIO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PosixPrioIo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PosixPrioIo(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POSIXPRIOIO.NAME);
        if (property != null) {
            property = setPropertyValue_PosixPrioIo(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_POSIXPRIOIO.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PosixPrioIo
     * <br>
     * Indicates whether prioritized input or output operations may be performed for the associated file.
     */

    private static CIMProperty setPropertyValue_PosixPrioIo(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PosixSyncIo
     *     * <br>
     * Indicates whether synchronised input or output operations may be performed for the associated file.
     *     */

    public javax.cim.UnsignedInteger64 get_PosixSyncIo() {
        CIMProperty currentProperty = getProperty(PROPERTY_POSIXSYNCIO.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_POSIXSYNCIO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PosixSyncIo
     * <br>
     * Indicates whether synchronised input or output operations may be performed for the associated file.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PosixSyncIo(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POSIXSYNCIO.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PosixSyncIo(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_POSIXSYNCIO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PosixSyncIo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PosixSyncIo(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POSIXSYNCIO.NAME);
        if (property != null) {
            property = setPropertyValue_PosixSyncIo(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_POSIXSYNCIO.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PosixSyncIo
     * <br>
     * Indicates whether synchronised input or output operations may be performed for the associated file.
     */

    private static CIMProperty setPropertyValue_PosixSyncIo(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SaveText
     *     * <br>
     * Indicates restricted deletion for directories, or possible implementation defined properties for executable files. For directories this is known as the sticky bit.
     *     */

    public Boolean get_SaveText() {
        CIMProperty currentProperty = getProperty(PROPERTY_SAVETEXT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SAVETEXT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property SaveText
     * <br>
     * Indicates restricted deletion for directories, or possible implementation defined properties for executable files. For directories this is known as the sticky bit.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SaveText(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SAVETEXT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SaveText(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SAVETEXT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SaveText by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SaveText(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SAVETEXT.NAME);
        if (property != null) {
            property = setPropertyValue_SaveText(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SAVETEXT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SaveText
     * <br>
     * Indicates restricted deletion for directories, or possible implementation defined properties for executable files. For directories this is known as the sticky bit.
     */

    private static CIMProperty setPropertyValue_SaveText(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SetGid
     *     * <br>
     * Indicates whether the associated file has setgid permissions.
     *     */

    public Boolean get_SetGid() {
        CIMProperty currentProperty = getProperty(PROPERTY_SETGID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SETGID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property SetGid
     * <br>
     * Indicates whether the associated file has setgid permissions.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SetGid(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SETGID.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SetGid(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SETGID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SetGid by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SetGid(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SETGID.NAME);
        if (property != null) {
            property = setPropertyValue_SetGid(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SETGID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SetGid
     * <br>
     * Indicates whether the associated file has setgid permissions.
     */

    private static CIMProperty setPropertyValue_SetGid(CIMProperty currentProperty, Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SetUid
     *     * <br>
     * Indicates whether the associated file has setuid permissions.
     *     */

    public Boolean get_SetUid() {
        CIMProperty currentProperty = getProperty(PROPERTY_SETUID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SETUID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property SetUid
     * <br>
     * Indicates whether the associated file has setuid permissions.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SetUid(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SETUID.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SetUid(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SETUID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SetUid by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SetUid(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SETUID.NAME);
        if (property != null) {
            property = setPropertyValue_SetUid(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SETUID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SetUid
     * <br>
     * Indicates whether the associated file has setuid permissions.
     */

    private static CIMProperty setPropertyValue_SetUid(CIMProperty currentProperty, Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UserID
     *     * <br>
     * An Identifer that uniquely describes the owner of this file.
     *     */

    public String get_UserID() {
        CIMProperty currentProperty = getProperty(PROPERTY_USERID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_USERID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property UserID
     * <br>
     * An Identifer that uniquely describes the owner of this file.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UserID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_USERID.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UserID(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_USERID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UserID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UserID(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_UnixFile fco = new CIM_UnixFile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_USERID.NAME);
        if (property != null) {
            property = setPropertyValue_UserID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_USERID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UserID
     * <br>
     * An Identifer that uniquely describes the owner of this file.
     */

    private static CIMProperty setPropertyValue_UserID(CIMProperty currentProperty, String newValue) {
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
     * Get the list with CIM_LogicalFile objects associated by the association CIM_FileIdentity
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalFile_CIM_FileIdentitys(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalFile_CIM_FileIdentitys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY, CIM_LogicalFile.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_LogicalFile objects associated by the association CIM_FileIdentity
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalFile_CIM_FileIdentitys(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_LogicalFile_CIM_FileIdentitys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_LogicalFile objects associated by the association CIM_FileIdentity
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalFile_CIM_FileIdentitys(WBEMClient cimClient,
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
                CIM_UnixFileHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_UnixFileHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_UnixFileHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_LogicalFile(cimInstance));
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
                        result.add(new CIM_LogicalFile(cimInstance));
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
                        result.add(new CIM_LogicalFile(cimInstance));
                        continue;
                    }
                }
            }
            CIM_UnixFileHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FileIdentity
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalFile_CIM_FileIdentityNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalFile_CIM_FileIdentityNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY, CIM_LogicalFile.CIM_CLASS_NAME, null,
                null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FileIdentity
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalFile_CIM_FileIdentityNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_LogicalFile_CIM_FileIdentityNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FileIdentity
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalFile_CIM_FileIdentityNames(WBEMClient cimClient,
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY,
                    CIM_LogicalFile.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnixFileHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_UnixFileHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_LogicalFile.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_UnixFileHelper.checkException(enumeration);
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
     * Get the list with CIM_FileIdentity associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_FileIdentity(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnixFileHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_UnixFileHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_FileIdentityHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_FileIdentity(cimInstance));
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
                        result.add(new CIM_FileIdentity(cimInstance));
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
                        result.add(new CIM_FileIdentity(cimInstance));
                        continue;
                    }
                }
            }
            CIM_UnixFileHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_FileIdentity
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_FileIdentity(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_FILEIDENTITY, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnixFileHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_UnixFileHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_FileIdentity.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_UnixFileHelper.checkException(enumeration);
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
        return CIM_UnixFile.CIM_CLASS_NAME;
    }

}