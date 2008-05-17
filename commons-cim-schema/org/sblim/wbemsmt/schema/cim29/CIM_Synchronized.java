/** 
 * CIM_Synchronized.java
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
 * Description: Indicates that two ManagedElements were aligned or made to be equivalent at the specified point in time. If the boolean property SyncMaintained is TRUE, then synchronization of the Elements is preserved. Both like and unlike objects may be synchronized. For example, two WatchDog timers may be aligned, or the contents of a LogicalFile may be synchronized with the contents of a StorageExtent.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_Synchronized extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_Synchronized";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property SyncMaintained
     * Boolean indicating whether synchronization is maintained.
     */
    public static class PROPERTY_SYNCMAINTAINED {
        /**
         * name of the property SyncMaintained
         */
        public final static String NAME = "SyncMaintained";

    }

    /**
     * Constants of property WhenSynced
     * The point in time that the Elements were synchronized.
     */
    public static class PROPERTY_WHENSYNCED {
        /**
         * name of the property WhenSynced
         */
        public final static String NAME = "WhenSynced";

    }

    /**
     * Constants of property SystemElement
     * 
     */
    public static class PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT {
        /**
         * name of the property SystemElement
         */
        public final static String NAME = "SystemElement";

    }

    /**
     * Constants of property SyncedElement
     * 
     */
    public static class PROPERTY_SYNCEDELEMENT_CIM_MANAGEDELEMENT {
        /**
         * name of the property SyncedElement
         */
        public final static String NAME = "SyncedElement";

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
     *   Indicates that two ManagedElements were aligned or made to be equivalent at the specified point in time. If the boolean property SyncMaintained is TRUE, then synchronization of the Elements is preserved. Both like and unlike objects may be synchronized. For example, two WatchDog timers may be aligned, or the contents of a LogicalFile may be synchronized with the contents of a StorageExtent.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Synchronized(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Indicates that two ManagedElements were aligned or made to be equivalent at the specified point in time. If the boolean property SyncMaintained is TRUE, then synchronization of the Elements is preserved. Both like and unlike objects may be synchronized. For example, two WatchDog timers may be aligned, or the contents of a LogicalFile may be synchronized with the contents of a StorageExtent.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Synchronized(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Synchronized() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("SyncMaintained", new CIMProperty("SyncMaintained",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("WhenSynced", new CIMProperty("WhenSynced", CIMDataType.DATETIME_T,
                null));
        propertiesToCheck.put("SystemElement", new CIMProperty("SystemElement", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), null));
        propertiesToCheck.put("SyncedElement", new CIMProperty("SyncedElement", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), null));

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
     * Get the property SyncMaintained
     *     * <br>
     * Boolean indicating whether synchronization is maintained.
     *     */

    public Boolean get_SyncMaintained() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYNCMAINTAINED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYNCMAINTAINED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property SyncMaintained
     * <br>
     * Boolean indicating whether synchronization is maintained.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SyncMaintained(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYNCMAINTAINED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SyncMaintained(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYNCMAINTAINED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SyncMaintained by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SyncMaintained(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_Synchronized fco = new CIM_Synchronized(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYNCMAINTAINED.NAME);
        if (property != null) {
            property = setPropertyValue_SyncMaintained(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYNCMAINTAINED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SyncMaintained
     * <br>
     * Boolean indicating whether synchronization is maintained.
     */

    private static CIMProperty setPropertyValue_SyncMaintained(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property WhenSynced
     *     * <br>
     * The point in time that the Elements were synchronized.
     *     */

    public javax.cim.CIMDateTime get_WhenSynced() {
        CIMProperty currentProperty = getProperty(PROPERTY_WHENSYNCED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_WHENSYNCED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property WhenSynced
     * <br>
     * The point in time that the Elements were synchronized.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_WhenSynced(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_WHENSYNCED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_WhenSynced(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_WHENSYNCED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property WhenSynced by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_WhenSynced(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_Synchronized fco = new CIM_Synchronized(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_WHENSYNCED.NAME);
        if (property != null) {
            property = setPropertyValue_WhenSynced(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_WHENSYNCED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property WhenSynced
     * <br>
     * The point in time that the Elements were synchronized.
     */

    private static CIMProperty setPropertyValue_WhenSynced(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SystemElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_SystemElement_CIM_ManagedElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property SystemElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SystemElement_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SystemElement_CIM_ManagedElement(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SystemElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SystemElement_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_Synchronized fco = new CIM_Synchronized(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_SystemElement_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SystemElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_SystemElement_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SyncedElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_SyncedElement_CIM_ManagedElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SYNCEDELEMENT_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYNCEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property SyncedElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SyncedElement_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYNCEDELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SyncedElement_CIM_ManagedElement(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYNCEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SyncedElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SyncedElement_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_Synchronized fco = new CIM_Synchronized(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYNCEDELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_SyncedElement_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYNCEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SyncedElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_SyncedElement_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
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
        if (!(object instanceof CIM_Synchronized)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_Synchronized.CIM_CLASS_NAME;
    }

}