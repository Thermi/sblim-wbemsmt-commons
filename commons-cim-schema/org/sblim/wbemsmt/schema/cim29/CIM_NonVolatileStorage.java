/** 
 * CIM_NonVolatileStorage.java
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
 * Description: This class has been deprecated in favor of CIM_Memory with the volatile parameter set to false. Capabilities and management of NV Storage. Non-volatile memory natively includes flash and ROM storage. In addition, NV memory can be BasedOn VolatileStorage, if the volatile memory is backed by a Battery. This scenario would be completely described by an instance of the AssociatedBattery relationship, referencing the NonVolatileStorage as the Dependent and the Battery as the Antecedent, and an instance of the BasedOn relationship, referencing the NonVolatileStorage as the Dependent and the VolatileStorage as the Antecedent.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_NonVolatileStorage extends CIM_Memory {

    public final static String CIM_CLASS_NAME = "CIM_NonVolatileStorage";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ApplicationWriteable
     * Boolean indicating that at least some portion of the NonVolatileStorage is writeable by applications.
     */
    public static class PROPERTY_APPLICATIONWRITEABLE {
        /**
         * name of the property ApplicationWriteable
         */
        public final static String NAME = "ApplicationWriteable";

    }

    /**
     * Constants of property ApplicationWriteableSize
     * When at least some portion of the NonVolatileStorage is writeable (ApplicationWriteable property = TRUE), Application WritableSize indicates the number of bits available for application data. If the ApplicationWriteable property is FALSE, this property is undefined.
     */
    public static class PROPERTY_APPLICATIONWRITEABLESIZE {
        /**
         * name of the property ApplicationWriteableSize
         */
        public final static String NAME = "ApplicationWriteableSize";

    }

    /**
     * Constants of property IsWriteable
     * Indicating that the NV storage is writeable.
     */
    public static class PROPERTY_ISWRITEABLE {
        /**
         * name of the property IsWriteable
         */
        public final static String NAME = "IsWriteable";

    }

    /**
     * Constants of property StartAddressForApplicationWrite
     * When at least some portion of the NonVolatileStorage is writeable (ApplicationWriteable property = TRUE), StartAddress forApplcationWrite indicates the starting address for application data. If the ApplicationWriteable property is FALSE, this property is undefined.
     */
    public static class PROPERTY_STARTADDRESSFORAPPLICATIONWRITE {
        /**
         * name of the property StartAddressForApplicationWrite
         */
        public final static String NAME = "StartAddressForApplicationWrite";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Memory.getPackages();

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
     *   This class has been deprecated in favor of CIM_Memory with the volatile parameter set to false. Capabilities and management of NV Storage. Non-volatile memory natively includes flash and ROM storage. In addition, NV memory can be BasedOn VolatileStorage, if the volatile memory is backed by a Battery. This scenario would be completely described by an instance of the AssociatedBattery relationship, referencing the NonVolatileStorage as the Dependent and the Battery as the Antecedent, and an instance of the BasedOn relationship, referencing the NonVolatileStorage as the Dependent and the VolatileStorage as the Antecedent.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_NonVolatileStorage(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This class has been deprecated in favor of CIM_Memory with the volatile parameter set to false. Capabilities and management of NV Storage. Non-volatile memory natively includes flash and ROM storage. In addition, NV memory can be BasedOn VolatileStorage, if the volatile memory is backed by a Battery. This scenario would be completely described by an instance of the AssociatedBattery relationship, referencing the NonVolatileStorage as the Dependent and the Battery as the Antecedent, and an instance of the BasedOn relationship, referencing the NonVolatileStorage as the Dependent and the VolatileStorage as the Antecedent.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_NonVolatileStorage(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_NonVolatileStorage() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ApplicationWriteable", new CIMProperty("ApplicationWriteable",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("ApplicationWriteableSize", new CIMProperty(
                "ApplicationWriteableSize", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("IsWriteable", new CIMProperty("IsWriteable", CIMDataType.BOOLEAN_T,
                null));
        propertiesToCheck.put("StartAddressForApplicationWrite", new CIMProperty(
                "StartAddressForApplicationWrite", CIMDataType.UINT64_T, null));

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
     * Get the property ApplicationWriteable
     *     * <br>
     * Boolean indicating that at least some portion of the NonVolatileStorage is writeable by applications.
     *     */

    public Boolean get_ApplicationWriteable() {
        CIMProperty currentProperty = getProperty(PROPERTY_APPLICATIONWRITEABLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_APPLICATIONWRITEABLE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property ApplicationWriteable
     * <br>
     * Boolean indicating that at least some portion of the NonVolatileStorage is writeable by applications.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ApplicationWriteable(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_APPLICATIONWRITEABLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ApplicationWriteable(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_APPLICATIONWRITEABLE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ApplicationWriteable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ApplicationWriteable(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_NonVolatileStorage fco = new CIM_NonVolatileStorage(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_APPLICATIONWRITEABLE.NAME);
        if (property != null) {
            property = setPropertyValue_ApplicationWriteable(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_APPLICATIONWRITEABLE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ApplicationWriteable
     * <br>
     * Boolean indicating that at least some portion of the NonVolatileStorage is writeable by applications.
     */

    private static CIMProperty setPropertyValue_ApplicationWriteable(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ApplicationWriteableSize
     *     * <br>
     * When at least some portion of the NonVolatileStorage is writeable (ApplicationWriteable property = TRUE), Application WritableSize indicates the number of bits available for application data. If the ApplicationWriteable property is FALSE, this property is undefined.
     *     */

    public javax.cim.UnsignedInteger64 get_ApplicationWriteableSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_APPLICATIONWRITEABLESIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_APPLICATIONWRITEABLESIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ApplicationWriteableSize
     * <br>
     * When at least some portion of the NonVolatileStorage is writeable (ApplicationWriteable property = TRUE), Application WritableSize indicates the number of bits available for application data. If the ApplicationWriteable property is FALSE, this property is undefined.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ApplicationWriteableSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_APPLICATIONWRITEABLESIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ApplicationWriteableSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_APPLICATIONWRITEABLESIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ApplicationWriteableSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ApplicationWriteableSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NonVolatileStorage fco = new CIM_NonVolatileStorage(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_APPLICATIONWRITEABLESIZE.NAME);
        if (property != null) {
            property = setPropertyValue_ApplicationWriteableSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_APPLICATIONWRITEABLESIZE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ApplicationWriteableSize
     * <br>
     * When at least some portion of the NonVolatileStorage is writeable (ApplicationWriteable property = TRUE), Application WritableSize indicates the number of bits available for application data. If the ApplicationWriteable property is FALSE, this property is undefined.
     */

    private static CIMProperty setPropertyValue_ApplicationWriteableSize(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IsWriteable
     *     * <br>
     * Indicating that the NV storage is writeable.
     *     */

    public Boolean get_IsWriteable() {
        CIMProperty currentProperty = getProperty(PROPERTY_ISWRITEABLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ISWRITEABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property IsWriteable
     * <br>
     * Indicating that the NV storage is writeable.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IsWriteable(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ISWRITEABLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_IsWriteable(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ISWRITEABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IsWriteable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsWriteable(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_NonVolatileStorage fco = new CIM_NonVolatileStorage(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISWRITEABLE.NAME);
        if (property != null) {
            property = setPropertyValue_IsWriteable(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ISWRITEABLE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IsWriteable
     * <br>
     * Indicating that the NV storage is writeable.
     */

    private static CIMProperty setPropertyValue_IsWriteable(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property StartAddressForApplicationWrite
     *     * <br>
     * When at least some portion of the NonVolatileStorage is writeable (ApplicationWriteable property = TRUE), StartAddress forApplcationWrite indicates the starting address for application data. If the ApplicationWriteable property is FALSE, this property is undefined.
     *     */

    public javax.cim.UnsignedInteger64 get_StartAddressForApplicationWrite() {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTADDRESSFORAPPLICATIONWRITE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STARTADDRESSFORAPPLICATIONWRITE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property StartAddressForApplicationWrite
     * <br>
     * When at least some portion of the NonVolatileStorage is writeable (ApplicationWriteable property = TRUE), StartAddress forApplcationWrite indicates the starting address for application data. If the ApplicationWriteable property is FALSE, this property is undefined.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_StartAddressForApplicationWrite(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTADDRESSFORAPPLICATIONWRITE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_StartAddressForApplicationWrite(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STARTADDRESSFORAPPLICATIONWRITE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property StartAddressForApplicationWrite by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StartAddressForApplicationWrite(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NonVolatileStorage fco = new CIM_NonVolatileStorage(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STARTADDRESSFORAPPLICATIONWRITE.NAME);
        if (property != null) {
            property = setPropertyValue_StartAddressForApplicationWrite(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STARTADDRESSFORAPPLICATIONWRITE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property StartAddressForApplicationWrite
     * <br>
     * When at least some portion of the NonVolatileStorage is writeable (ApplicationWriteable property = TRUE), StartAddress forApplcationWrite indicates the starting address for application data. If the ApplicationWriteable property is FALSE, this property is undefined.
     */

    private static CIMProperty setPropertyValue_StartAddressForApplicationWrite(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
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
        return CIM_NonVolatileStorage.CIM_CLASS_NAME;
    }

}