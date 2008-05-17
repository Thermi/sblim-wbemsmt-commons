/** 
 * CIM_SystemDevice.java
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
 * Description: LogicalDevices may be aggregated by a System. This relationship is made explicit by the SystemDevice association.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_SystemDevice extends CIM_SystemComponent {

    public final static String CIM_CLASS_NAME = "CIM_SystemDevice";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property GroupComponent
     * 
     */
    public static class PROPERTY_GROUPCOMPONENT_CIM_SYSTEM {
        /**
         * name of the property GroupComponent
         */
        public final static String NAME = "GroupComponent";

    }

    /**
     * Constants of property PartComponent
     * 
     */
    public static class PROPERTY_PARTCOMPONENT_CIM_LOGICALDEVICE {
        /**
         * name of the property PartComponent
         */
        public final static String NAME = "PartComponent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_SystemComponent.getPackages();

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
     *   LogicalDevices may be aggregated by a System. This relationship is made explicit by the SystemDevice association.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SystemDevice(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   LogicalDevices may be aggregated by a System. This relationship is made explicit by the SystemDevice association.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SystemDevice(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SystemDevice() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("GroupComponent", new CIMProperty("GroupComponent", new CIMDataType(
                CIM_System.CIM_CLASS_NAME), null));
        propertiesToCheck.put("PartComponent", new CIMProperty("PartComponent", new CIMDataType(
                CIM_LogicalDevice.CIM_CLASS_NAME), null));

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
     * Get the property GroupComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_System get_GroupComponent_CIM_System(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_CIM_SYSTEM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_SYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SystemHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GroupComponent_CIM_System(CIM_System newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_CIM_SYSTEM.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_GroupComponent_CIM_System(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_SYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property GroupComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GroupComponent_CIM_System(WBEMClient client, String namespace,
            CIM_System newValue) throws WbemsmtException {
        CIM_SystemDevice fco = new CIM_SystemDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GROUPCOMPONENT_CIM_SYSTEM.NAME);
        if (property != null) {
            property = setPropertyValue_GroupComponent_CIM_System(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_SYSTEM.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_GroupComponent_CIM_System(
            CIMProperty currentProperty, CIM_System newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PartComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_LogicalDevice get_PartComponent_CIM_LogicalDevice(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_CIM_LOGICALDEVICE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_LOGICALDEVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_LogicalDeviceHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PartComponent_CIM_LogicalDevice(CIM_LogicalDevice newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_CIM_LOGICALDEVICE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PartComponent_CIM_LogicalDevice(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_LOGICALDEVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PartComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PartComponent_CIM_LogicalDevice(WBEMClient client,
            String namespace, CIM_LogicalDevice newValue) throws WbemsmtException {
        CIM_SystemDevice fco = new CIM_SystemDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARTCOMPONENT_CIM_LOGICALDEVICE.NAME);
        if (property != null) {
            property = setPropertyValue_PartComponent_CIM_LogicalDevice(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_LOGICALDEVICE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_PartComponent_CIM_LogicalDevice(
            CIMProperty currentProperty, CIM_LogicalDevice newValue) {
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
        return CIM_SystemDevice.CIM_CLASS_NAME;
    }

}