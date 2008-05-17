/** 
 * CIM_ProtectedExtentBasedOn.java
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
 * Description: Protected StorageExtents map to an underlying StorageExtent. This mapping includes information about the placement of check data on the underlying extent. The mapping is made explicit in this association.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ProtectedExtentBasedOn extends CIM_BasedOn {

    public final static String CIM_CLASS_NAME = "CIM_ProtectedExtentBasedOn";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property BlockSize
     * The block size of the protected space. Note that this is limited by the Antecedent->BlockSize. In SCC, this is equivalent to the NUMBER OF BYTES PER LBA_P field in the Redundancy Group P_Extent Descriptor.
     */
    public static class PROPERTY_BLOCKSIZE {
        /**
         * name of the property BlockSize
         */
        public final static String NAME = "BlockSize";

    }

    /**
     * Constants of property NumberOfBlocks
     * The size of the protected space. Note that this is limited by the Antecedent->NumberOfBlocks, but is included explicitly to provide for the DMTF MIF mapping. In SCC, this is equivalent to the NUMBER OF LBA_P(s) field in the Redundancy Group P_Extent Descriptor.
     */
    public static class PROPERTY_NUMBEROFBLOCKS {
        /**
         * name of the property NumberOfBlocks
         */
        public final static String NAME = "NumberOfBlocks";

    }

    /**
     * Constants of property StartingAddress
     * The starting logical block address of the underlying StorageExtent from which this protected StorageExtent is derived. In SCC, this is equivalent to the START LBA_P field in the Redundancy Group P_Extent Descriptor.
     */
    public static class PROPERTY_STARTINGADDRESS {
        /**
         * name of the property StartingAddress
         */
        public final static String NAME = "StartingAddress";

    }

    /**
     * Constants of property UnitsBeforeCheckDataInterleave
     * Number of bytes of user data to skip before starting the check data interleave.
     */
    public static class PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE {
        /**
         * name of the property UnitsBeforeCheckDataInterleave
         */
        public final static String NAME = "UnitsBeforeCheckDataInterleave";

    }

    /**
     * Constants of property UnitsOfCheckData
     * Number of bytes to be reserved for check data.
     */
    public static class PROPERTY_UNITSOFCHECKDATA {
        /**
         * name of the property UnitsOfCheckData
         */
        public final static String NAME = "UnitsOfCheckData";

    }

    /**
     * Constants of property UnitsOfUserData
     * Number of bytes to be reserved for user data.
     */
    public static class PROPERTY_UNITSOFUSERDATA {
        /**
         * name of the property UnitsOfUserData
         */
        public final static String NAME = "UnitsOfUserData";

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
        String[] parentClassPackageList = CIM_BasedOn.getPackages();

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
     *   Protected StorageExtents map to an underlying StorageExtent. This mapping includes information about the placement of check data on the underlying extent. The mapping is made explicit in this association.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ProtectedExtentBasedOn(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Protected StorageExtents map to an underlying StorageExtent. This mapping includes information about the placement of check data on the underlying extent. The mapping is made explicit in this association.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ProtectedExtentBasedOn(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ProtectedExtentBasedOn() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck
                .put("BlockSize", new CIMProperty("BlockSize", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("NumberOfBlocks", new CIMProperty("NumberOfBlocks",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("StartingAddress", new CIMProperty("StartingAddress",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UnitsBeforeCheckDataInterleave", new CIMProperty(
                "UnitsBeforeCheckDataInterleave", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UnitsOfCheckData", new CIMProperty("UnitsOfCheckData",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UnitsOfUserData", new CIMProperty("UnitsOfUserData",
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
     * Get the property BlockSize
     *     * <br>
     * The block size of the protected space. Note that this is limited by the Antecedent->BlockSize. In SCC, this is equivalent to the NUMBER OF BYTES PER LBA_P field in the Redundancy Group P_Extent Descriptor.
     *     */

    public javax.cim.UnsignedInteger64 get_BlockSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_BLOCKSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BLOCKSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property BlockSize
     * <br>
     * The block size of the protected space. Note that this is limited by the Antecedent->BlockSize. In SCC, this is equivalent to the NUMBER OF BYTES PER LBA_P field in the Redundancy Group P_Extent Descriptor.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BlockSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BLOCKSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BlockSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BLOCKSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BlockSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BlockSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_ProtectedExtentBasedOn fco = new CIM_ProtectedExtentBasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BLOCKSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_BlockSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BLOCKSIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BlockSize
     * <br>
     * The block size of the protected space. Note that this is limited by the Antecedent->BlockSize. In SCC, this is equivalent to the NUMBER OF BYTES PER LBA_P field in the Redundancy Group P_Extent Descriptor.
     */

    private static CIMProperty setPropertyValue_BlockSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NumberOfBlocks
     *     * <br>
     * The size of the protected space. Note that this is limited by the Antecedent->NumberOfBlocks, but is included explicitly to provide for the DMTF MIF mapping. In SCC, this is equivalent to the NUMBER OF LBA_P(s) field in the Redundancy Group P_Extent Descriptor.
     *     */

    public javax.cim.UnsignedInteger64 get_NumberOfBlocks() {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFBLOCKS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NUMBEROFBLOCKS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property NumberOfBlocks
     * <br>
     * The size of the protected space. Note that this is limited by the Antecedent->NumberOfBlocks, but is included explicitly to provide for the DMTF MIF mapping. In SCC, this is equivalent to the NUMBER OF LBA_P(s) field in the Redundancy Group P_Extent Descriptor.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NumberOfBlocks(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFBLOCKS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NumberOfBlocks(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFBLOCKS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NumberOfBlocks by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NumberOfBlocks(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_ProtectedExtentBasedOn fco = new CIM_ProtectedExtentBasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NUMBEROFBLOCKS.NAME);
        if (property != null) {
            property = setPropertyValue_NumberOfBlocks(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFBLOCKS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NumberOfBlocks
     * <br>
     * The size of the protected space. Note that this is limited by the Antecedent->NumberOfBlocks, but is included explicitly to provide for the DMTF MIF mapping. In SCC, this is equivalent to the NUMBER OF LBA_P(s) field in the Redundancy Group P_Extent Descriptor.
     */

    private static CIMProperty setPropertyValue_NumberOfBlocks(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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
     * The starting logical block address of the underlying StorageExtent from which this protected StorageExtent is derived. In SCC, this is equivalent to the START LBA_P field in the Redundancy Group P_Extent Descriptor.
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
     * The starting logical block address of the underlying StorageExtent from which this protected StorageExtent is derived. In SCC, this is equivalent to the START LBA_P field in the Redundancy Group P_Extent Descriptor.
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
        CIM_ProtectedExtentBasedOn fco = new CIM_ProtectedExtentBasedOn(client, namespace);
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
     * The starting logical block address of the underlying StorageExtent from which this protected StorageExtent is derived. In SCC, this is equivalent to the START LBA_P field in the Redundancy Group P_Extent Descriptor.
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
     * Get the property UnitsBeforeCheckDataInterleave
     *     * <br>
     * Number of bytes of user data to skip before starting the check data interleave.
     *     */

    public javax.cim.UnsignedInteger64 get_UnitsBeforeCheckDataInterleave() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UnitsBeforeCheckDataInterleave
     * <br>
     * Number of bytes of user data to skip before starting the check data interleave.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnitsBeforeCheckDataInterleave(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnitsBeforeCheckDataInterleave(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnitsBeforeCheckDataInterleave by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnitsBeforeCheckDataInterleave(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_ProtectedExtentBasedOn fco = new CIM_ProtectedExtentBasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE.NAME);
        if (property != null) {
            property = setPropertyValue_UnitsBeforeCheckDataInterleave(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnitsBeforeCheckDataInterleave
     * <br>
     * Number of bytes of user data to skip before starting the check data interleave.
     */

    private static CIMProperty setPropertyValue_UnitsBeforeCheckDataInterleave(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UnitsOfCheckData
     *     * <br>
     * Number of bytes to be reserved for check data.
     *     */

    public javax.cim.UnsignedInteger64 get_UnitsOfCheckData() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNITSOFCHECKDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNITSOFCHECKDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UnitsOfCheckData
     * <br>
     * Number of bytes to be reserved for check data.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnitsOfCheckData(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNITSOFCHECKDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnitsOfCheckData(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNITSOFCHECKDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnitsOfCheckData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnitsOfCheckData(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_ProtectedExtentBasedOn fco = new CIM_ProtectedExtentBasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNITSOFCHECKDATA.NAME);
        if (property != null) {
            property = setPropertyValue_UnitsOfCheckData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNITSOFCHECKDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnitsOfCheckData
     * <br>
     * Number of bytes to be reserved for check data.
     */

    private static CIMProperty setPropertyValue_UnitsOfCheckData(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UnitsOfUserData
     *     * <br>
     * Number of bytes to be reserved for user data.
     *     */

    public javax.cim.UnsignedInteger64 get_UnitsOfUserData() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNITSOFUSERDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNITSOFUSERDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UnitsOfUserData
     * <br>
     * Number of bytes to be reserved for user data.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnitsOfUserData(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNITSOFUSERDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnitsOfUserData(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNITSOFUSERDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnitsOfUserData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnitsOfUserData(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_ProtectedExtentBasedOn fco = new CIM_ProtectedExtentBasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNITSOFUSERDATA.NAME);
        if (property != null) {
            property = setPropertyValue_UnitsOfUserData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNITSOFUSERDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnitsOfUserData
     * <br>
     * Number of bytes to be reserved for user data.
     */

    private static CIMProperty setPropertyValue_UnitsOfUserData(CIMProperty currentProperty,
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
        CIM_ProtectedExtentBasedOn fco = new CIM_ProtectedExtentBasedOn(client, namespace);
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
        CIM_ProtectedExtentBasedOn fco = new CIM_ProtectedExtentBasedOn(client, namespace);
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
        return CIM_ProtectedExtentBasedOn.CIM_CLASS_NAME;
    }

}