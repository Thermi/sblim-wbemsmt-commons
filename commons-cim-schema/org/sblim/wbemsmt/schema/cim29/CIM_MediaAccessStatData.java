/** 
 * CIM_MediaAccessStatData.java
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
 * Description: Statistics related to reading and writing at a specific MediaAccessDevice, or for a specific StorageExtent. The same class is used to represent this data - whether for the MediaAccessDevice (independent of the StorageExtent), OR for the Extent (independent of its AccessDevice). The element whose statistics are described is associated using the relationship, ElementStatisticalData. Note that this class models the same properties as MediaAccessStatInfo. This class, however, uses the simplified key mechanisms of its superclass, StatisticalData.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_MediaAccessStatData extends CIM_StatisticalData {

    public final static String CIM_CLASS_NAME = "CIM_MediaAccessStatData";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ReadOperations
     * The number of attempted read operations.
     */
    public static class PROPERTY_READOPERATIONS {
        /**
         * name of the property ReadOperations
         */
        public final static String NAME = "ReadOperations";

    }

    /**
     * Constants of property RecoveredReadOperations
     * The number of recovered read operations.
     */
    public static class PROPERTY_RECOVEREDREADOPERATIONS {
        /**
         * name of the property RecoveredReadOperations
         */
        public final static String NAME = "RecoveredReadOperations";

    }

    /**
     * Constants of property RecoveredSeekOperations
     * The number of recovered seek operations.
     */
    public static class PROPERTY_RECOVEREDSEEKOPERATIONS {
        /**
         * name of the property RecoveredSeekOperations
         */
        public final static String NAME = "RecoveredSeekOperations";

    }

    /**
     * Constants of property RecoveredWriteOperations
     * The number of recovered write operations.
     */
    public static class PROPERTY_RECOVEREDWRITEOPERATIONS {
        /**
         * name of the property RecoveredWriteOperations
         */
        public final static String NAME = "RecoveredWriteOperations";

    }

    /**
     * Constants of property UnrecoverableReadOperations
     * The number of unrecoverable read operations.
     */
    public static class PROPERTY_UNRECOVERABLEREADOPERATIONS {
        /**
         * name of the property UnrecoverableReadOperations
         */
        public final static String NAME = "UnrecoverableReadOperations";

    }

    /**
     * Constants of property UnrecoverableSeekOperations
     * The number of unrecoverable seek operations.
     */
    public static class PROPERTY_UNRECOVERABLESEEKOPERATIONS {
        /**
         * name of the property UnrecoverableSeekOperations
         */
        public final static String NAME = "UnrecoverableSeekOperations";

    }

    /**
     * Constants of property UnrecoverableWriteOperations
     * The number of unrecoverable write operations.
     */
    public static class PROPERTY_UNRECOVERABLEWRITEOPERATIONS {
        /**
         * name of the property UnrecoverableWriteOperations
         */
        public final static String NAME = "UnrecoverableWriteOperations";

    }

    /**
     * Constants of property WriteOperations
     * The number of attempted write operations.
     */
    public static class PROPERTY_WRITEOPERATIONS {
        /**
         * name of the property WriteOperations
         */
        public final static String NAME = "WriteOperations";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_StatisticalData.getPackages();

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
     *   Statistics related to reading and writing at a specific MediaAccessDevice, or for a specific StorageExtent. The same class is used to represent this data - whether for the MediaAccessDevice (independent of the StorageExtent), OR for the Extent (independent of its AccessDevice). The element whose statistics are described is associated using the relationship, ElementStatisticalData. Note that this class models the same properties as MediaAccessStatInfo. This class, however, uses the simplified key mechanisms of its superclass, StatisticalData.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_MediaAccessStatData(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Statistics related to reading and writing at a specific MediaAccessDevice, or for a specific StorageExtent. The same class is used to represent this data - whether for the MediaAccessDevice (independent of the StorageExtent), OR for the Extent (independent of its AccessDevice). The element whose statistics are described is associated using the relationship, ElementStatisticalData. Note that this class models the same properties as MediaAccessStatInfo. This class, however, uses the simplified key mechanisms of its superclass, StatisticalData.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_MediaAccessStatData(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_MediaAccessStatData() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ReadOperations", new CIMProperty("ReadOperations",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("RecoveredReadOperations", new CIMProperty("RecoveredReadOperations",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("RecoveredSeekOperations", new CIMProperty("RecoveredSeekOperations",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("RecoveredWriteOperations", new CIMProperty(
                "RecoveredWriteOperations", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UnrecoverableReadOperations", new CIMProperty(
                "UnrecoverableReadOperations", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UnrecoverableSeekOperations", new CIMProperty(
                "UnrecoverableSeekOperations", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UnrecoverableWriteOperations", new CIMProperty(
                "UnrecoverableWriteOperations", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("WriteOperations", new CIMProperty("WriteOperations",
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
     * Get the property ReadOperations
     *     * <br>
     * The number of attempted read operations.
     *     */

    public javax.cim.UnsignedInteger64 get_ReadOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_READOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_READOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ReadOperations
     * <br>
     * The number of attempted read operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReadOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_READOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReadOperations(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_READOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReadOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReadOperations(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatData fco = new CIM_MediaAccessStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_READOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_ReadOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_READOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReadOperations
     * <br>
     * The number of attempted read operations.
     */

    private static CIMProperty setPropertyValue_ReadOperations(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RecoveredReadOperations
     *     * <br>
     * The number of recovered read operations.
     *     */

    public javax.cim.UnsignedInteger64 get_RecoveredReadOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVEREDREADOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECOVEREDREADOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RecoveredReadOperations
     * <br>
     * The number of recovered read operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RecoveredReadOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVEREDREADOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RecoveredReadOperations(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVEREDREADOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RecoveredReadOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RecoveredReadOperations(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatData fco = new CIM_MediaAccessStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOVEREDREADOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_RecoveredReadOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVEREDREADOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RecoveredReadOperations
     * <br>
     * The number of recovered read operations.
     */

    private static CIMProperty setPropertyValue_RecoveredReadOperations(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RecoveredSeekOperations
     *     * <br>
     * The number of recovered seek operations.
     *     */

    public javax.cim.UnsignedInteger64 get_RecoveredSeekOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVEREDSEEKOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECOVEREDSEEKOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RecoveredSeekOperations
     * <br>
     * The number of recovered seek operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RecoveredSeekOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVEREDSEEKOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RecoveredSeekOperations(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVEREDSEEKOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RecoveredSeekOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RecoveredSeekOperations(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatData fco = new CIM_MediaAccessStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOVEREDSEEKOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_RecoveredSeekOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVEREDSEEKOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RecoveredSeekOperations
     * <br>
     * The number of recovered seek operations.
     */

    private static CIMProperty setPropertyValue_RecoveredSeekOperations(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RecoveredWriteOperations
     *     * <br>
     * The number of recovered write operations.
     *     */

    public javax.cim.UnsignedInteger64 get_RecoveredWriteOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVEREDWRITEOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECOVEREDWRITEOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RecoveredWriteOperations
     * <br>
     * The number of recovered write operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RecoveredWriteOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVEREDWRITEOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RecoveredWriteOperations(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVEREDWRITEOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RecoveredWriteOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RecoveredWriteOperations(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatData fco = new CIM_MediaAccessStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOVEREDWRITEOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_RecoveredWriteOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVEREDWRITEOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RecoveredWriteOperations
     * <br>
     * The number of recovered write operations.
     */

    private static CIMProperty setPropertyValue_RecoveredWriteOperations(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UnrecoverableReadOperations
     *     * <br>
     * The number of unrecoverable read operations.
     *     */

    public javax.cim.UnsignedInteger64 get_UnrecoverableReadOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNRECOVERABLEREADOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNRECOVERABLEREADOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UnrecoverableReadOperations
     * <br>
     * The number of unrecoverable read operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnrecoverableReadOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNRECOVERABLEREADOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnrecoverableReadOperations(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNRECOVERABLEREADOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnrecoverableReadOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnrecoverableReadOperations(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatData fco = new CIM_MediaAccessStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNRECOVERABLEREADOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_UnrecoverableReadOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNRECOVERABLEREADOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnrecoverableReadOperations
     * <br>
     * The number of unrecoverable read operations.
     */

    private static CIMProperty setPropertyValue_UnrecoverableReadOperations(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UnrecoverableSeekOperations
     *     * <br>
     * The number of unrecoverable seek operations.
     *     */

    public javax.cim.UnsignedInteger64 get_UnrecoverableSeekOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNRECOVERABLESEEKOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNRECOVERABLESEEKOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UnrecoverableSeekOperations
     * <br>
     * The number of unrecoverable seek operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnrecoverableSeekOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNRECOVERABLESEEKOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnrecoverableSeekOperations(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNRECOVERABLESEEKOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnrecoverableSeekOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnrecoverableSeekOperations(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatData fco = new CIM_MediaAccessStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNRECOVERABLESEEKOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_UnrecoverableSeekOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNRECOVERABLESEEKOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnrecoverableSeekOperations
     * <br>
     * The number of unrecoverable seek operations.
     */

    private static CIMProperty setPropertyValue_UnrecoverableSeekOperations(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UnrecoverableWriteOperations
     *     * <br>
     * The number of unrecoverable write operations.
     *     */

    public javax.cim.UnsignedInteger64 get_UnrecoverableWriteOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNRECOVERABLEWRITEOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNRECOVERABLEWRITEOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property UnrecoverableWriteOperations
     * <br>
     * The number of unrecoverable write operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnrecoverableWriteOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNRECOVERABLEWRITEOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnrecoverableWriteOperations(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNRECOVERABLEWRITEOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnrecoverableWriteOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnrecoverableWriteOperations(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatData fco = new CIM_MediaAccessStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNRECOVERABLEWRITEOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_UnrecoverableWriteOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNRECOVERABLEWRITEOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnrecoverableWriteOperations
     * <br>
     * The number of unrecoverable write operations.
     */

    private static CIMProperty setPropertyValue_UnrecoverableWriteOperations(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property WriteOperations
     *     * <br>
     * The number of attempted write operations.
     *     */

    public javax.cim.UnsignedInteger64 get_WriteOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_WRITEOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_WRITEOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property WriteOperations
     * <br>
     * The number of attempted write operations.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_WriteOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_WRITEOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_WriteOperations(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_WRITEOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property WriteOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_WriteOperations(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaAccessStatData fco = new CIM_MediaAccessStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_WRITEOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_WriteOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_WRITEOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property WriteOperations
     * <br>
     * The number of attempted write operations.
     */

    private static CIMProperty setPropertyValue_WriteOperations(CIMProperty currentProperty,
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
        return CIM_MediaAccessStatData.CIM_CLASS_NAME;
    }

}