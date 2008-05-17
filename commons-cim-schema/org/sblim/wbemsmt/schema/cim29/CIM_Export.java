/** 
 * CIM_Export.java
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
 * Description: An association between a LocalFileSystem and its Directories indicating that the specified Directories are available for mount. When exporting an entire FileSystem, the Directory should reference the topmost directory of the FileSystem.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_Export extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_Export";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ExportedDirectoryName
     * Name under which the Directory is exported.
     */
    public static class PROPERTY_EXPORTEDDIRECTORYNAME {
        /**
         * name of the property ExportedDirectoryName
         */
        public final static String NAME = "ExportedDirectoryName";

    }

    /**
     * Constants of property LocalFS
     * 
     */
    public static class PROPERTY_LOCALFS_CIM_LOCALFILESYSTEM {
        /**
         * name of the property LocalFS
         */
        public final static String NAME = "LocalFS";

    }

    /**
     * Constants of property Directory
     * 
     */
    public static class PROPERTY_DIRECTORY_CIM_DIRECTORY {
        /**
         * name of the property Directory
         */
        public final static String NAME = "Directory";

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
     *   An association between a LocalFileSystem and its Directories indicating that the specified Directories are available for mount. When exporting an entire FileSystem, the Directory should reference the topmost directory of the FileSystem.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Export(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   An association between a LocalFileSystem and its Directories indicating that the specified Directories are available for mount. When exporting an entire FileSystem, the Directory should reference the topmost directory of the FileSystem.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Export(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Export() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ExportedDirectoryName", new CIMProperty("ExportedDirectoryName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("LocalFS", new CIMProperty("LocalFS", new CIMDataType(
                CIM_LocalFileSystem.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Directory", new CIMProperty("Directory", new CIMDataType(
                CIM_Directory.CIM_CLASS_NAME), null));

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
     * Get the property ExportedDirectoryName
     *     * <br>
     * Name under which the Directory is exported.
     *     */

    public String get_ExportedDirectoryName() {
        CIMProperty currentProperty = getProperty(PROPERTY_EXPORTEDDIRECTORYNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EXPORTEDDIRECTORYNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ExportedDirectoryName
     * <br>
     * Name under which the Directory is exported.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ExportedDirectoryName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EXPORTEDDIRECTORYNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ExportedDirectoryName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EXPORTEDDIRECTORYNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ExportedDirectoryName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ExportedDirectoryName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Export fco = new CIM_Export(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EXPORTEDDIRECTORYNAME.NAME);
        if (property != null) {
            property = setPropertyValue_ExportedDirectoryName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EXPORTEDDIRECTORYNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ExportedDirectoryName
     * <br>
     * Name under which the Directory is exported.
     */

    private static CIMProperty setPropertyValue_ExportedDirectoryName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LocalFS
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_LocalFileSystem get_LocalFS_CIM_LocalFileSystem(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCALFS_CIM_LOCALFILESYSTEM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOCALFS_CIM_LOCALFILESYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_LocalFileSystemHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property LocalFS
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LocalFS_CIM_LocalFileSystem(CIM_LocalFileSystem newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCALFS_CIM_LOCALFILESYSTEM.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LocalFS_CIM_LocalFileSystem(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOCALFS_CIM_LOCALFILESYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LocalFS by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LocalFS_CIM_LocalFileSystem(WBEMClient client,
            String namespace, CIM_LocalFileSystem newValue) throws WbemsmtException {
        CIM_Export fco = new CIM_Export(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOCALFS_CIM_LOCALFILESYSTEM.NAME);
        if (property != null) {
            property = setPropertyValue_LocalFS_CIM_LocalFileSystem(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOCALFS_CIM_LOCALFILESYSTEM.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LocalFS
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_LocalFS_CIM_LocalFileSystem(
            CIMProperty currentProperty, CIM_LocalFileSystem newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Directory
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Directory get_Directory_CIM_Directory(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DIRECTORY_CIM_DIRECTORY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DIRECTORY_CIM_DIRECTORY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_DirectoryHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Directory
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Directory_CIM_Directory(CIM_Directory newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DIRECTORY_CIM_DIRECTORY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Directory_CIM_Directory(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DIRECTORY_CIM_DIRECTORY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Directory by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Directory_CIM_Directory(WBEMClient client, String namespace,
            CIM_Directory newValue) throws WbemsmtException {
        CIM_Export fco = new CIM_Export(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DIRECTORY_CIM_DIRECTORY.NAME);
        if (property != null) {
            property = setPropertyValue_Directory_CIM_Directory(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DIRECTORY_CIM_DIRECTORY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Directory
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Directory_CIM_Directory(
            CIMProperty currentProperty, CIM_Directory newValue) {
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
        if (!(object instanceof CIM_Export)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_Export.CIM_CLASS_NAME;
    }

}