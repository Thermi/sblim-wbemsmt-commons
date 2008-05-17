/** 
 * CIM_BasedOn.java
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
 * Description: BasedOn is an association describing how StorageExtents can be assembled from lower level Extents. For example, ProtectedSpaceExtents are parts of PhysicalExtents, while VolumeSets are assembled from one or more Physical or ProtectedSpaceExtents. As another example, CacheMemory can be defined independently and realized in a PhysicalElement or can be 'based on' Volatile or NonVolatileStorageExtents.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_BasedOn extends CIM_Dependency {

    public final static String CIM_CLASS_NAME = "CIM_BasedOn";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property EndingAddress
     * EndingAddress indicates where in lower level storage, the higher level Extent ends. This property is useful when mapping non-contiguous Extents into a higher level grouping.
     */
    public static class PROPERTY_ENDINGADDRESS {
        /**
         * name of the property EndingAddress
         */
        public final static String NAME = "EndingAddress";

    }

    /**
     * Constants of property OrderIndex
     * If there is an order to the BasedOn associations that describe how a higher level StorageExtent is assembled, the OrderIndex property indicates this. When an order exists, the instances of BasedOn with the same Dependent value (i.e., the same higher level Extent) should place unique values in the OrderIndex property. The lowest value implies the first member of the collection of lower level Extents, and increasing values imply successive members of the collection. If there is no ordered relationship, a value of zero should be specified. An example of the use of this property is to define a RAID-0 striped array of 3 disks. The resultant RAID array is a StorageExtent that is dependent on (BasedOn) the StorageExtents that describe each of the 3 disks. The OrderIndex of each BasedOn association from the disk Extents to the RAID array could be specified as 1, 2 and 3 to indicate the order in which the disk Extents are used to access the RAID data.
     */
    public static class PROPERTY_ORDERINDEX {
        /**
         * name of the property OrderIndex
         */
        public final static String NAME = "OrderIndex";

    }

    /**
     * Constants of property StartingAddress
     * StartingAddress indicates where in lower level storage, the higher level Extent begins.
     */
    public static class PROPERTY_STARTINGADDRESS {
        /**
         * name of the property StartingAddress
         */
        public final static String NAME = "StartingAddress";

    }

    /**
     * Constants of property Antecedent
     * 
     */
    public static class PROPERTY_ANTECEDENT_CIM_STORAGEEXTENT {
        /**
         * name of the property Antecedent
         */
        public final static String NAME = "Antecedent";

    }

    /**
     * Constants of property Dependent
     * 
     */
    public static class PROPERTY_DEPENDENT_CIM_STORAGEEXTENT {
        /**
         * name of the property Dependent
         */
        public final static String NAME = "Dependent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Dependency.getPackages();

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
     *   BasedOn is an association describing how StorageExtents can be assembled from lower level Extents. For example, ProtectedSpaceExtents are parts of PhysicalExtents, while VolumeSets are assembled from one or more Physical or ProtectedSpaceExtents. As another example, CacheMemory can be defined independently and realized in a PhysicalElement or can be 'based on' Volatile or NonVolatileStorageExtents.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_BasedOn(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   BasedOn is an association describing how StorageExtents can be assembled from lower level Extents. For example, ProtectedSpaceExtents are parts of PhysicalExtents, while VolumeSets are assembled from one or more Physical or ProtectedSpaceExtents. As another example, CacheMemory can be defined independently and realized in a PhysicalElement or can be 'based on' Volatile or NonVolatileStorageExtents.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_BasedOn(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_BasedOn() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("EndingAddress", new CIMProperty("EndingAddress",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("OrderIndex", new CIMProperty("OrderIndex", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("StartingAddress", new CIMProperty("StartingAddress",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Antecedent", new CIMProperty("Antecedent", new CIMDataType(
                CIM_StorageExtent.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependent", new CIMProperty("Dependent", new CIMDataType(
                CIM_StorageExtent.CIM_CLASS_NAME), null));

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
     * Get the property EndingAddress
     *     * <br>
     * EndingAddress indicates where in lower level storage, the higher level Extent ends. This property is useful when mapping non-contiguous Extents into a higher level grouping.
     *     */

    public javax.cim.UnsignedInteger64 get_EndingAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENDINGADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENDINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property EndingAddress
     * <br>
     * EndingAddress indicates where in lower level storage, the higher level Extent ends. This property is useful when mapping non-contiguous Extents into a higher level grouping.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EndingAddress(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENDINGADDRESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EndingAddress(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENDINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EndingAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EndingAddress(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_BasedOn fco = new CIM_BasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENDINGADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_EndingAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENDINGADDRESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EndingAddress
     * <br>
     * EndingAddress indicates where in lower level storage, the higher level Extent ends. This property is useful when mapping non-contiguous Extents into a higher level grouping.
     */

    private static CIMProperty setPropertyValue_EndingAddress(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OrderIndex
     *     * <br>
     * If there is an order to the BasedOn associations that describe how a higher level StorageExtent is assembled, the OrderIndex property indicates this. When an order exists, the instances of BasedOn with the same Dependent value (i.e., the same higher level Extent) should place unique values in the OrderIndex property. The lowest value implies the first member of the collection of lower level Extents, and increasing values imply successive members of the collection. If there is no ordered relationship, a value of zero should be specified. An example of the use of this property is to define a RAID-0 striped array of 3 disks. The resultant RAID array is a StorageExtent that is dependent on (BasedOn) the StorageExtents that describe each of the 3 disks. The OrderIndex of each BasedOn association from the disk Extents to the RAID array could be specified as 1, 2 and 3 to indicate the order in which the disk Extents are used to access the RAID data.
     *     */

    public javax.cim.UnsignedInteger16 get_OrderIndex() {
        CIMProperty currentProperty = getProperty(PROPERTY_ORDERINDEX.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ORDERINDEX.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property OrderIndex
     * <br>
     * If there is an order to the BasedOn associations that describe how a higher level StorageExtent is assembled, the OrderIndex property indicates this. When an order exists, the instances of BasedOn with the same Dependent value (i.e., the same higher level Extent) should place unique values in the OrderIndex property. The lowest value implies the first member of the collection of lower level Extents, and increasing values imply successive members of the collection. If there is no ordered relationship, a value of zero should be specified. An example of the use of this property is to define a RAID-0 striped array of 3 disks. The resultant RAID array is a StorageExtent that is dependent on (BasedOn) the StorageExtents that describe each of the 3 disks. The OrderIndex of each BasedOn association from the disk Extents to the RAID array could be specified as 1, 2 and 3 to indicate the order in which the disk Extents are used to access the RAID data.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OrderIndex(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ORDERINDEX.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OrderIndex(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ORDERINDEX.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OrderIndex by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OrderIndex(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_BasedOn fco = new CIM_BasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ORDERINDEX.NAME);
        if (property != null) {
            property = setPropertyValue_OrderIndex(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ORDERINDEX.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OrderIndex
     * <br>
     * If there is an order to the BasedOn associations that describe how a higher level StorageExtent is assembled, the OrderIndex property indicates this. When an order exists, the instances of BasedOn with the same Dependent value (i.e., the same higher level Extent) should place unique values in the OrderIndex property. The lowest value implies the first member of the collection of lower level Extents, and increasing values imply successive members of the collection. If there is no ordered relationship, a value of zero should be specified. An example of the use of this property is to define a RAID-0 striped array of 3 disks. The resultant RAID array is a StorageExtent that is dependent on (BasedOn) the StorageExtents that describe each of the 3 disks. The OrderIndex of each BasedOn association from the disk Extents to the RAID array could be specified as 1, 2 and 3 to indicate the order in which the disk Extents are used to access the RAID data.
     */

    private static CIMProperty setPropertyValue_OrderIndex(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property StartingAddress
     *     * <br>
     * StartingAddress indicates where in lower level storage, the higher level Extent begins.
     *     */

    public javax.cim.UnsignedInteger64 get_StartingAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTINGADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STARTINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property StartingAddress
     * <br>
     * StartingAddress indicates where in lower level storage, the higher level Extent begins.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_StartingAddress(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTINGADDRESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_StartingAddress(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STARTINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property StartingAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StartingAddress(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_BasedOn fco = new CIM_BasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STARTINGADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_StartingAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STARTINGADDRESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property StartingAddress
     * <br>
     * StartingAddress indicates where in lower level storage, the higher level Extent begins.
     */

    private static CIMProperty setPropertyValue_StartingAddress(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Antecedent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_StorageExtent get_Antecedent_CIM_StorageExtent(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_STORAGEEXTENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_StorageExtentHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Antecedent_CIM_StorageExtent(CIM_StorageExtent newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_STORAGEEXTENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Antecedent_CIM_StorageExtent(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Antecedent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Antecedent_CIM_StorageExtent(WBEMClient client,
            String namespace, CIM_StorageExtent newValue) throws WbemsmtException {
        CIM_BasedOn fco = new CIM_BasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ANTECEDENT_CIM_STORAGEEXTENT.NAME);
        if (property != null) {
            property = setPropertyValue_Antecedent_CIM_StorageExtent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Antecedent_CIM_StorageExtent(
            CIMProperty currentProperty, CIM_StorageExtent newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Dependent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_StorageExtent get_Dependent_CIM_StorageExtent(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_StorageExtentHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Dependent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependent_CIM_StorageExtent(CIM_StorageExtent newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Dependent_CIM_StorageExtent(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Dependent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Dependent_CIM_StorageExtent(WBEMClient client,
            String namespace, CIM_StorageExtent newValue) throws WbemsmtException {
        CIM_BasedOn fco = new CIM_BasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME);
        if (property != null) {
            property = setPropertyValue_Dependent_CIM_StorageExtent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependent_CIM_StorageExtent(
            CIMProperty currentProperty, CIM_StorageExtent newValue) {
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
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_BasedOn.CIM_CLASS_NAME;
    }

}