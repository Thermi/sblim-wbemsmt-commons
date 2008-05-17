/** 
 * CIM_UnixLocalFileSystem.java
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
 * Description: A class derived from LocalFileSystem that represents the Unix environment view of a file store controlled by a ComputerSystem through local means (e.g., direct device driver access). In this case, the file store is managed directly by the ComputerSystem without the need for another computer to act as a file server. This definition does not breakdown in the case of a Clustered File System. In this scenario, the FileSystem is a LocalFileSystem, weak to the Cluster.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_UnixLocalFileSystem extends CIM_LocalFileSystem {

    public final static String CIM_CLASS_NAME = "CIM_UnixLocalFileSystem";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property FSReservedCapacity
     * The reserve data capacity of the file system in bytes.
     */
    public static class PROPERTY_FSRESERVEDCAPACITY {
        /**
         * name of the property FSReservedCapacity
         */
        public final static String NAME = "FSReservedCapacity";

    }

    /**
     * Constants of property FreeInodes
     * The number of free inodes present in the file system. This value is only valid if TotalSlots is non-zero.
     */
    public static class PROPERTY_FREEINODES {
        /**
         * name of the property FreeInodes
         */
        public final static String NAME = "FreeInodes";

    }

    /**
     * Constants of property TotalInodes
     * The total number of inodes available in the file system. A value of zero for TotalInodes indicates that this file system does not have a preset limit.
     */
    public static class PROPERTY_TOTALINODES {
        /**
         * name of the property TotalInodes
         */
        public final static String NAME = "TotalInodes";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_LocalFileSystem.getPackages();

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
     *   A class derived from LocalFileSystem that represents the Unix environment view of a file store controlled by a ComputerSystem through local means (e.g., direct device driver access). In this case, the file store is managed directly by the ComputerSystem without the need for another computer to act as a file server. This definition does not breakdown in the case of a Clustered File System. In this scenario, the FileSystem is a LocalFileSystem, weak to the Cluster.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_UnixLocalFileSystem(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A class derived from LocalFileSystem that represents the Unix environment view of a file store controlled by a ComputerSystem through local means (e.g., direct device driver access). In this case, the file store is managed directly by the ComputerSystem without the need for another computer to act as a file server. This definition does not breakdown in the case of a Clustered File System. In this scenario, the FileSystem is a LocalFileSystem, weak to the Cluster.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_UnixLocalFileSystem(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_UnixLocalFileSystem() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("FSReservedCapacity", new CIMProperty("FSReservedCapacity",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("FreeInodes", new CIMProperty("FreeInodes", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("TotalInodes", new CIMProperty("TotalInodes", CIMDataType.UINT64_T,
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
     * Get the property FSReservedCapacity
     *     * <br>
     * The reserve data capacity of the file system in bytes.
     *     */

    public javax.cim.UnsignedInteger64 get_FSReservedCapacity() {
        CIMProperty currentProperty = getProperty(PROPERTY_FSRESERVEDCAPACITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FSRESERVEDCAPACITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property FSReservedCapacity
     * <br>
     * The reserve data capacity of the file system in bytes.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FSReservedCapacity(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FSRESERVEDCAPACITY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FSReservedCapacity(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FSRESERVEDCAPACITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FSReservedCapacity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FSReservedCapacity(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixLocalFileSystem fco = new CIM_UnixLocalFileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FSRESERVEDCAPACITY.NAME);
        if (property != null) {
            property = setPropertyValue_FSReservedCapacity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FSRESERVEDCAPACITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FSReservedCapacity
     * <br>
     * The reserve data capacity of the file system in bytes.
     */

    private static CIMProperty setPropertyValue_FSReservedCapacity(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FreeInodes
     *     * <br>
     * The number of free inodes present in the file system. This value is only valid if TotalSlots is non-zero.
     *     */

    public javax.cim.UnsignedInteger64 get_FreeInodes() {
        CIMProperty currentProperty = getProperty(PROPERTY_FREEINODES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FREEINODES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property FreeInodes
     * <br>
     * The number of free inodes present in the file system. This value is only valid if TotalSlots is non-zero.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FreeInodes(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FREEINODES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FreeInodes(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FREEINODES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FreeInodes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FreeInodes(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixLocalFileSystem fco = new CIM_UnixLocalFileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FREEINODES.NAME);
        if (property != null) {
            property = setPropertyValue_FreeInodes(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FREEINODES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FreeInodes
     * <br>
     * The number of free inodes present in the file system. This value is only valid if TotalSlots is non-zero.
     */

    private static CIMProperty setPropertyValue_FreeInodes(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TotalInodes
     *     * <br>
     * The total number of inodes available in the file system. A value of zero for TotalInodes indicates that this file system does not have a preset limit.
     *     */

    public javax.cim.UnsignedInteger64 get_TotalInodes() {
        CIMProperty currentProperty = getProperty(PROPERTY_TOTALINODES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TOTALINODES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property TotalInodes
     * <br>
     * The total number of inodes available in the file system. A value of zero for TotalInodes indicates that this file system does not have a preset limit.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TotalInodes(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TOTALINODES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TotalInodes(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TOTALINODES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TotalInodes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TotalInodes(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixLocalFileSystem fco = new CIM_UnixLocalFileSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TOTALINODES.NAME);
        if (property != null) {
            property = setPropertyValue_TotalInodes(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TOTALINODES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TotalInodes
     * <br>
     * The total number of inodes available in the file system. A value of zero for TotalInodes indicates that this file system does not have a preset limit.
     */

    private static CIMProperty setPropertyValue_TotalInodes(CIMProperty currentProperty,
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
        return CIM_UnixLocalFileSystem.CIM_CLASS_NAME;
    }

}