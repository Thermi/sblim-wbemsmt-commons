/** 
 * CIM_MediaPhysicalStatData.java
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
 * Description: Statistics related to reading physical labels and picks/puts at a specific StorageMediaLocation, or for a specific piece of PhysicalMedia. The same class is used to represent this data - whether for a Location (independent of the Media), OR for the Media (independent of its StorageMediaLocation). The element whose statistics are described is associated using the relationship, ElementStatisticalData.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_MediaPhysicalStatData extends CIM_StatisticalData {

    public final static String CIM_CLASS_NAME = "CIM_MediaPhysicalStatData";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property PickFailures
     * The number of failed picks.
     */
    public static class PROPERTY_PICKFAILURES {
        /**
         * name of the property PickFailures
         */
        public final static String NAME = "PickFailures";

    }

    /**
     * Constants of property PickRetries
     * The number of retried picks.
     */
    public static class PROPERTY_PICKRETRIES {
        /**
         * name of the property PickRetries
         */
        public final static String NAME = "PickRetries";

    }

    /**
     * Constants of property PickSuccesses
     * The number of successful picks.
     */
    public static class PROPERTY_PICKSUCCESSES {
        /**
         * name of the property PickSuccesses
         */
        public final static String NAME = "PickSuccesses";

    }

    /**
     * Constants of property PutFailures
     * The number of failed puts.
     */
    public static class PROPERTY_PUTFAILURES {
        /**
         * name of the property PutFailures
         */
        public final static String NAME = "PutFailures";

    }

    /**
     * Constants of property PutRetries
     * The number of retried puts.
     */
    public static class PROPERTY_PUTRETRIES {
        /**
         * name of the property PutRetries
         */
        public final static String NAME = "PutRetries";

    }

    /**
     * Constants of property PutSuccesses
     * The number of successful puts.
     */
    public static class PROPERTY_PUTSUCCESSES {
        /**
         * name of the property PutSuccesses
         */
        public final static String NAME = "PutSuccesses";

    }

    /**
     * Constants of property ScanFailures
     * The number of failed physical label scans.
     */
    public static class PROPERTY_SCANFAILURES {
        /**
         * name of the property ScanFailures
         */
        public final static String NAME = "ScanFailures";

    }

    /**
     * Constants of property ScanRetries
     * The number of retried physical label scans.
     */
    public static class PROPERTY_SCANRETRIES {
        /**
         * name of the property ScanRetries
         */
        public final static String NAME = "ScanRetries";

    }

    /**
     * Constants of property ScanSuccesses
     * The number of successful physical label scans.
     */
    public static class PROPERTY_SCANSUCCESSES {
        /**
         * name of the property ScanSuccesses
         */
        public final static String NAME = "ScanSuccesses";

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
     *   Statistics related to reading physical labels and picks/puts at a specific StorageMediaLocation, or for a specific piece of PhysicalMedia. The same class is used to represent this data - whether for a Location (independent of the Media), OR for the Media (independent of its StorageMediaLocation). The element whose statistics are described is associated using the relationship, ElementStatisticalData.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_MediaPhysicalStatData(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Statistics related to reading physical labels and picks/puts at a specific StorageMediaLocation, or for a specific piece of PhysicalMedia. The same class is used to represent this data - whether for a Location (independent of the Media), OR for the Media (independent of its StorageMediaLocation). The element whose statistics are described is associated using the relationship, ElementStatisticalData.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_MediaPhysicalStatData(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_MediaPhysicalStatData() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("PickFailures", new CIMProperty("PickFailures", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("PickRetries", new CIMProperty("PickRetries", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("PickSuccesses", new CIMProperty("PickSuccesses",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PutFailures", new CIMProperty("PutFailures", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("PutRetries", new CIMProperty("PutRetries", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("PutSuccesses", new CIMProperty("PutSuccesses", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("ScanFailures", new CIMProperty("ScanFailures", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("ScanRetries", new CIMProperty("ScanRetries", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("ScanSuccesses", new CIMProperty("ScanSuccesses",
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
     * Get the property PickFailures
     *     * <br>
     * The number of failed picks.
     *     */

    public javax.cim.UnsignedInteger64 get_PickFailures() {
        CIMProperty currentProperty = getProperty(PROPERTY_PICKFAILURES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PICKFAILURES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PickFailures
     * <br>
     * The number of failed picks.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PickFailures(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PICKFAILURES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PickFailures(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PICKFAILURES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PickFailures by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PickFailures(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatData fco = new CIM_MediaPhysicalStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PICKFAILURES.NAME);
        if (property != null) {
            property = setPropertyValue_PickFailures(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PICKFAILURES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PickFailures
     * <br>
     * The number of failed picks.
     */

    private static CIMProperty setPropertyValue_PickFailures(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PickRetries
     *     * <br>
     * The number of retried picks.
     *     */

    public javax.cim.UnsignedInteger64 get_PickRetries() {
        CIMProperty currentProperty = getProperty(PROPERTY_PICKRETRIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PICKRETRIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PickRetries
     * <br>
     * The number of retried picks.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PickRetries(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PICKRETRIES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PickRetries(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PICKRETRIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PickRetries by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PickRetries(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatData fco = new CIM_MediaPhysicalStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PICKRETRIES.NAME);
        if (property != null) {
            property = setPropertyValue_PickRetries(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PICKRETRIES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PickRetries
     * <br>
     * The number of retried picks.
     */

    private static CIMProperty setPropertyValue_PickRetries(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PickSuccesses
     *     * <br>
     * The number of successful picks.
     *     */

    public javax.cim.UnsignedInteger64 get_PickSuccesses() {
        CIMProperty currentProperty = getProperty(PROPERTY_PICKSUCCESSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PICKSUCCESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PickSuccesses
     * <br>
     * The number of successful picks.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PickSuccesses(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PICKSUCCESSES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PickSuccesses(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PICKSUCCESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PickSuccesses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PickSuccesses(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatData fco = new CIM_MediaPhysicalStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PICKSUCCESSES.NAME);
        if (property != null) {
            property = setPropertyValue_PickSuccesses(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PICKSUCCESSES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PickSuccesses
     * <br>
     * The number of successful picks.
     */

    private static CIMProperty setPropertyValue_PickSuccesses(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PutFailures
     *     * <br>
     * The number of failed puts.
     *     */

    public javax.cim.UnsignedInteger64 get_PutFailures() {
        CIMProperty currentProperty = getProperty(PROPERTY_PUTFAILURES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PUTFAILURES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PutFailures
     * <br>
     * The number of failed puts.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PutFailures(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PUTFAILURES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PutFailures(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PUTFAILURES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PutFailures by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PutFailures(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatData fco = new CIM_MediaPhysicalStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PUTFAILURES.NAME);
        if (property != null) {
            property = setPropertyValue_PutFailures(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PUTFAILURES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PutFailures
     * <br>
     * The number of failed puts.
     */

    private static CIMProperty setPropertyValue_PutFailures(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PutRetries
     *     * <br>
     * The number of retried puts.
     *     */

    public javax.cim.UnsignedInteger64 get_PutRetries() {
        CIMProperty currentProperty = getProperty(PROPERTY_PUTRETRIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PUTRETRIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PutRetries
     * <br>
     * The number of retried puts.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PutRetries(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PUTRETRIES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PutRetries(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PUTRETRIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PutRetries by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PutRetries(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatData fco = new CIM_MediaPhysicalStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PUTRETRIES.NAME);
        if (property != null) {
            property = setPropertyValue_PutRetries(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PUTRETRIES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PutRetries
     * <br>
     * The number of retried puts.
     */

    private static CIMProperty setPropertyValue_PutRetries(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PutSuccesses
     *     * <br>
     * The number of successful puts.
     *     */

    public javax.cim.UnsignedInteger64 get_PutSuccesses() {
        CIMProperty currentProperty = getProperty(PROPERTY_PUTSUCCESSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PUTSUCCESSES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PutSuccesses
     * <br>
     * The number of successful puts.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PutSuccesses(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PUTSUCCESSES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PutSuccesses(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PUTSUCCESSES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PutSuccesses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PutSuccesses(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatData fco = new CIM_MediaPhysicalStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PUTSUCCESSES.NAME);
        if (property != null) {
            property = setPropertyValue_PutSuccesses(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PUTSUCCESSES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PutSuccesses
     * <br>
     * The number of successful puts.
     */

    private static CIMProperty setPropertyValue_PutSuccesses(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ScanFailures
     *     * <br>
     * The number of failed physical label scans.
     *     */

    public javax.cim.UnsignedInteger64 get_ScanFailures() {
        CIMProperty currentProperty = getProperty(PROPERTY_SCANFAILURES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SCANFAILURES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ScanFailures
     * <br>
     * The number of failed physical label scans.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ScanFailures(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SCANFAILURES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ScanFailures(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SCANFAILURES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ScanFailures by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ScanFailures(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatData fco = new CIM_MediaPhysicalStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SCANFAILURES.NAME);
        if (property != null) {
            property = setPropertyValue_ScanFailures(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SCANFAILURES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ScanFailures
     * <br>
     * The number of failed physical label scans.
     */

    private static CIMProperty setPropertyValue_ScanFailures(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ScanRetries
     *     * <br>
     * The number of retried physical label scans.
     *     */

    public javax.cim.UnsignedInteger64 get_ScanRetries() {
        CIMProperty currentProperty = getProperty(PROPERTY_SCANRETRIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SCANRETRIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ScanRetries
     * <br>
     * The number of retried physical label scans.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ScanRetries(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SCANRETRIES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ScanRetries(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SCANRETRIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ScanRetries by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ScanRetries(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatData fco = new CIM_MediaPhysicalStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SCANRETRIES.NAME);
        if (property != null) {
            property = setPropertyValue_ScanRetries(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SCANRETRIES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ScanRetries
     * <br>
     * The number of retried physical label scans.
     */

    private static CIMProperty setPropertyValue_ScanRetries(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ScanSuccesses
     *     * <br>
     * The number of successful physical label scans.
     *     */

    public javax.cim.UnsignedInteger64 get_ScanSuccesses() {
        CIMProperty currentProperty = getProperty(PROPERTY_SCANSUCCESSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SCANSUCCESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ScanSuccesses
     * <br>
     * The number of successful physical label scans.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ScanSuccesses(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SCANSUCCESSES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ScanSuccesses(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SCANSUCCESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ScanSuccesses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ScanSuccesses(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_MediaPhysicalStatData fco = new CIM_MediaPhysicalStatData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SCANSUCCESSES.NAME);
        if (property != null) {
            property = setPropertyValue_ScanSuccesses(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SCANSUCCESSES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ScanSuccesses
     * <br>
     * The number of successful physical label scans.
     */

    private static CIMProperty setPropertyValue_ScanSuccesses(CIMProperty currentProperty,
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
        return CIM_MediaPhysicalStatData.CIM_CLASS_NAME;
    }

}