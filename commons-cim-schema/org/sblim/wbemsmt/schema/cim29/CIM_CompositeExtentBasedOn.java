/** 
 * CIM_CompositeExtentBasedOn.java
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
 * Description: This specialization defines how data is striped across StorageExtents. Additionally, it includes information on distribution of check data so that the 'usual case' RAID devices can be created in one step.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_CompositeExtentBasedOn extends CIM_BasedOn {

    public final static String CIM_CLASS_NAME = "CIM_CompositeExtentBasedOn";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property BlockSize
     * The Dependent's BlockSize is limited by the Antecedent's. In SCC, this is equivalent to the NUMBER OF BYTES PER LBA_PS field in the RedundancyGroup P_Extent Descriptor.
     */
    public static class PROPERTY_BLOCKSIZE {
        /**
         * name of the property BlockSize
         */
        public final static String NAME = "BlockSize";

    }

    /**
     * Constants of property LBAMappingIncludesCheckData
     * True if the logical block mapping algorithm includes check data bytes. This property corresponds to the NOCHKSKIP attribute in the SCC-2 Volume Set PS_Extent Descriptor.
     */
    public static class PROPERTY_LBAMAPPINGINCLUDESCHECKDATA {
        /**
         * name of the property LBAMappingIncludesCheckData
         */
        public final static String NAME = "LBAMappingIncludesCheckData";

    }

    /**
     * Constants of property LBAsMappedByDecrementing
     * True if logical blocks in the underlying StorageExtents are mapped in decrementing order. This property corresponds to the INCDEC value in the SCC-2 Volume Set PS_Extent Descriptor.
     */
    public static class PROPERTY_LBASMAPPEDBYDECREMENTING {
        /**
         * name of the property LBAsMappedByDecrementing
         */
        public final static String NAME = "LBAsMappedByDecrementing";

    }

    /**
     * Constants of property NumberOfBlocks
     * The total number of blocks that will be consumed on the Dependent Extent. This is limited by the Antecedent's NumberOfBlocks, but is included explicitly to provide for the DMTF MIF mapping. In SCC, this is equivalent to the NUMBER OF LBA_PS(s) field in the Volume Set PS_Extent Descriptor.
     */
    public static class PROPERTY_NUMBEROFBLOCKS {
        /**
         * name of the property NumberOfBlocks
         */
        public final static String NAME = "NumberOfBlocks";

    }

    /**
     * Constants of property OrderIndex
     * Order matters to CompositeExtents. An example of the use of this property is when defining a RAID-0 striped array of 3 disks. The resultant RAID array is a CompositeExtent that is dependent on (as described by CompositeExtentBasedOn) the StorageExtents that represent each of the 3 disks. The OrderIndex of each CompositeExtentBasedOn association from the disk Extents to the RAID array could be specified as 1, 2 and 3 to indicate the order in which the disk Extents are used to access the RAID data.
     */
    public static class PROPERTY_ORDERINDEX {
        /**
         * name of the property OrderIndex
         */
        public final static String NAME = "OrderIndex";

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
     * Constants of property UserDataStripeDepth
     * Number of bytes which form the stripe size for the Dependent StorageExtent. If the CompositeExtent is concatenated instead of striped, then UserDataStripeDepth should be set to zero.
     */
    public static class PROPERTY_USERDATASTRIPEDEPTH {
        /**
         * name of the property UserDataStripeDepth
         */
        public final static String NAME = "UserDataStripeDepth";

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
    public static class PROPERTY_DEPENDENT_CIM_COMPOSITEEXTENT {
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
     *   This specialization defines how data is striped across StorageExtents. Additionally, it includes information on distribution of check data so that the 'usual case' RAID devices can be created in one step.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_CompositeExtentBasedOn(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This specialization defines how data is striped across StorageExtents. Additionally, it includes information on distribution of check data so that the 'usual case' RAID devices can be created in one step.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_CompositeExtentBasedOn(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_CompositeExtentBasedOn() {
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
        propertiesToCheck.put("LBAMappingIncludesCheckData", new CIMProperty(
                "LBAMappingIncludesCheckData", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("LBAsMappedByDecrementing", new CIMProperty(
                "LBAsMappedByDecrementing", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("NumberOfBlocks", new CIMProperty("NumberOfBlocks",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("OrderIndex", new CIMProperty("OrderIndex", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("UnitsBeforeCheckDataInterleave", new CIMProperty(
                "UnitsBeforeCheckDataInterleave", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UnitsOfCheckData", new CIMProperty("UnitsOfCheckData",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UnitsOfUserData", new CIMProperty("UnitsOfUserData",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UserDataStripeDepth", new CIMProperty("UserDataStripeDepth",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Antecedent", new CIMProperty("Antecedent", new CIMDataType(
                CIM_StorageExtent.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependent", new CIMProperty("Dependent", new CIMDataType(
                CIM_CompositeExtent.CIM_CLASS_NAME), null));

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
     * The Dependent's BlockSize is limited by the Antecedent's. In SCC, this is equivalent to the NUMBER OF BYTES PER LBA_PS field in the RedundancyGroup P_Extent Descriptor.
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
     * The Dependent's BlockSize is limited by the Antecedent's. In SCC, this is equivalent to the NUMBER OF BYTES PER LBA_PS field in the RedundancyGroup P_Extent Descriptor.
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
        CIM_CompositeExtentBasedOn fco = new CIM_CompositeExtentBasedOn(client, namespace);
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
     * The Dependent's BlockSize is limited by the Antecedent's. In SCC, this is equivalent to the NUMBER OF BYTES PER LBA_PS field in the RedundancyGroup P_Extent Descriptor.
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
     * Get the property LBAMappingIncludesCheckData
     *     * <br>
     * True if the logical block mapping algorithm includes check data bytes. This property corresponds to the NOCHKSKIP attribute in the SCC-2 Volume Set PS_Extent Descriptor.
     *     */

    public Boolean get_LBAMappingIncludesCheckData() {
        CIMProperty currentProperty = getProperty(PROPERTY_LBAMAPPINGINCLUDESCHECKDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LBAMAPPINGINCLUDESCHECKDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property LBAMappingIncludesCheckData
     * <br>
     * True if the logical block mapping algorithm includes check data bytes. This property corresponds to the NOCHKSKIP attribute in the SCC-2 Volume Set PS_Extent Descriptor.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LBAMappingIncludesCheckData(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LBAMAPPINGINCLUDESCHECKDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LBAMappingIncludesCheckData(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LBAMAPPINGINCLUDESCHECKDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LBAMappingIncludesCheckData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LBAMappingIncludesCheckData(WBEMClient client,
            String namespace, Boolean newValue) throws WbemsmtException {
        CIM_CompositeExtentBasedOn fco = new CIM_CompositeExtentBasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LBAMAPPINGINCLUDESCHECKDATA.NAME);
        if (property != null) {
            property = setPropertyValue_LBAMappingIncludesCheckData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LBAMAPPINGINCLUDESCHECKDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LBAMappingIncludesCheckData
     * <br>
     * True if the logical block mapping algorithm includes check data bytes. This property corresponds to the NOCHKSKIP attribute in the SCC-2 Volume Set PS_Extent Descriptor.
     */

    private static CIMProperty setPropertyValue_LBAMappingIncludesCheckData(
            CIMProperty currentProperty, Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LBAsMappedByDecrementing
     *     * <br>
     * True if logical blocks in the underlying StorageExtents are mapped in decrementing order. This property corresponds to the INCDEC value in the SCC-2 Volume Set PS_Extent Descriptor.
     *     */

    public Boolean get_LBAsMappedByDecrementing() {
        CIMProperty currentProperty = getProperty(PROPERTY_LBASMAPPEDBYDECREMENTING.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LBASMAPPEDBYDECREMENTING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property LBAsMappedByDecrementing
     * <br>
     * True if logical blocks in the underlying StorageExtents are mapped in decrementing order. This property corresponds to the INCDEC value in the SCC-2 Volume Set PS_Extent Descriptor.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LBAsMappedByDecrementing(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LBASMAPPEDBYDECREMENTING.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LBAsMappedByDecrementing(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LBASMAPPEDBYDECREMENTING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LBAsMappedByDecrementing by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LBAsMappedByDecrementing(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_CompositeExtentBasedOn fco = new CIM_CompositeExtentBasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LBASMAPPEDBYDECREMENTING.NAME);
        if (property != null) {
            property = setPropertyValue_LBAsMappedByDecrementing(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LBASMAPPEDBYDECREMENTING.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LBAsMappedByDecrementing
     * <br>
     * True if logical blocks in the underlying StorageExtents are mapped in decrementing order. This property corresponds to the INCDEC value in the SCC-2 Volume Set PS_Extent Descriptor.
     */

    private static CIMProperty setPropertyValue_LBAsMappedByDecrementing(
            CIMProperty currentProperty, Boolean newValue) {
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
     * The total number of blocks that will be consumed on the Dependent Extent. This is limited by the Antecedent's NumberOfBlocks, but is included explicitly to provide for the DMTF MIF mapping. In SCC, this is equivalent to the NUMBER OF LBA_PS(s) field in the Volume Set PS_Extent Descriptor.
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
     * The total number of blocks that will be consumed on the Dependent Extent. This is limited by the Antecedent's NumberOfBlocks, but is included explicitly to provide for the DMTF MIF mapping. In SCC, this is equivalent to the NUMBER OF LBA_PS(s) field in the Volume Set PS_Extent Descriptor.
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
        CIM_CompositeExtentBasedOn fco = new CIM_CompositeExtentBasedOn(client, namespace);
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
     * The total number of blocks that will be consumed on the Dependent Extent. This is limited by the Antecedent's NumberOfBlocks, but is included explicitly to provide for the DMTF MIF mapping. In SCC, this is equivalent to the NUMBER OF LBA_PS(s) field in the Volume Set PS_Extent Descriptor.
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
     * Get the property OrderIndex
     *     * <br>
     * Order matters to CompositeExtents. An example of the use of this property is when defining a RAID-0 striped array of 3 disks. The resultant RAID array is a CompositeExtent that is dependent on (as described by CompositeExtentBasedOn) the StorageExtents that represent each of the 3 disks. The OrderIndex of each CompositeExtentBasedOn association from the disk Extents to the RAID array could be specified as 1, 2 and 3 to indicate the order in which the disk Extents are used to access the RAID data.
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
     * Order matters to CompositeExtents. An example of the use of this property is when defining a RAID-0 striped array of 3 disks. The resultant RAID array is a CompositeExtent that is dependent on (as described by CompositeExtentBasedOn) the StorageExtents that represent each of the 3 disks. The OrderIndex of each CompositeExtentBasedOn association from the disk Extents to the RAID array could be specified as 1, 2 and 3 to indicate the order in which the disk Extents are used to access the RAID data.
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
        CIM_CompositeExtentBasedOn fco = new CIM_CompositeExtentBasedOn(client, namespace);
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
     * Order matters to CompositeExtents. An example of the use of this property is when defining a RAID-0 striped array of 3 disks. The resultant RAID array is a CompositeExtent that is dependent on (as described by CompositeExtentBasedOn) the StorageExtents that represent each of the 3 disks. The OrderIndex of each CompositeExtentBasedOn association from the disk Extents to the RAID array could be specified as 1, 2 and 3 to indicate the order in which the disk Extents are used to access the RAID data.
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
        CIM_CompositeExtentBasedOn fco = new CIM_CompositeExtentBasedOn(client, namespace);
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
        CIM_CompositeExtentBasedOn fco = new CIM_CompositeExtentBasedOn(client, namespace);
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
        CIM_CompositeExtentBasedOn fco = new CIM_CompositeExtentBasedOn(client, namespace);
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
     * Get the property UserDataStripeDepth
     *     * <br>
     * Number of bytes which form the stripe size for the Dependent StorageExtent. If the CompositeExtent is concatenated instead of striped, then UserDataStripeDepth should be set to zero.
     *     */

    public javax.cim.UnsignedInteger64 get_UserDataStripeDepth() {
        CIMProperty currentProperty = getProperty(PROPERTY_USERDATASTRIPEDEPTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_USERDATASTRIPEDEPTH.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UserDataStripeDepth
     * <br>
     * Number of bytes which form the stripe size for the Dependent StorageExtent. If the CompositeExtent is concatenated instead of striped, then UserDataStripeDepth should be set to zero.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UserDataStripeDepth(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_USERDATASTRIPEDEPTH.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UserDataStripeDepth(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_USERDATASTRIPEDEPTH.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UserDataStripeDepth by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UserDataStripeDepth(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_CompositeExtentBasedOn fco = new CIM_CompositeExtentBasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_USERDATASTRIPEDEPTH.NAME);
        if (property != null) {
            property = setPropertyValue_UserDataStripeDepth(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_USERDATASTRIPEDEPTH.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UserDataStripeDepth
     * <br>
     * Number of bytes which form the stripe size for the Dependent StorageExtent. If the CompositeExtent is concatenated instead of striped, then UserDataStripeDepth should be set to zero.
     */

    private static CIMProperty setPropertyValue_UserDataStripeDepth(CIMProperty currentProperty,
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
        CIM_CompositeExtentBasedOn fco = new CIM_CompositeExtentBasedOn(client, namespace);
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

    public CIM_CompositeExtent get_Dependent_CIM_CompositeExtent(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_COMPOSITEEXTENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_COMPOSITEEXTENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_CompositeExtentHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Dependent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependent_CIM_CompositeExtent(CIM_CompositeExtent newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_COMPOSITEEXTENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Dependent_CIM_CompositeExtent(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_COMPOSITEEXTENT.NAME
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

    public static CIMProperty create_Dependent_CIM_CompositeExtent(WBEMClient client,
            String namespace, CIM_CompositeExtent newValue) throws WbemsmtException {
        CIM_CompositeExtentBasedOn fco = new CIM_CompositeExtentBasedOn(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENT_CIM_COMPOSITEEXTENT.NAME);
        if (property != null) {
            property = setPropertyValue_Dependent_CIM_CompositeExtent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_COMPOSITEEXTENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependent_CIM_CompositeExtent(
            CIMProperty currentProperty, CIM_CompositeExtent newValue) {
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
        return CIM_CompositeExtentBasedOn.CIM_CLASS_NAME;
    }

}