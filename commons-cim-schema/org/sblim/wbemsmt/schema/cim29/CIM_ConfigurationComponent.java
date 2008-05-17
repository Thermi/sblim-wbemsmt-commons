/** 
 * CIM_ConfigurationComponent.java
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
 * Description: ConfigurationComponent aggregates 'lower-level' Configuration objects into a 'high-level' Configuration. This enables the assembly of complex Configurations by grouping together simpler ones. For example, a logon policy for the United States could consist of two Configuration groups, one for the east coast and one for the west coast. Each of these could in turn consist of multiple Configurations to handle different aspects of the logon process.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ConfigurationComponent extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_ConfigurationComponent";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ConfigGroup
     * 
     */
    public static class PROPERTY_CONFIGGROUP_CIM_CONFIGURATION {
        /**
         * name of the property ConfigGroup
         */
        public final static String NAME = "ConfigGroup";

    }

    /**
     * Constants of property ConfigComponent
     * 
     */
    public static class PROPERTY_CONFIGCOMPONENT_CIM_CONFIGURATION {
        /**
         * name of the property ConfigComponent
         */
        public final static String NAME = "ConfigComponent";

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
     *   ConfigurationComponent aggregates 'lower-level' Configuration objects into a 'high-level' Configuration. This enables the assembly of complex Configurations by grouping together simpler ones. For example, a logon policy for the United States could consist of two Configuration groups, one for the east coast and one for the west coast. Each of these could in turn consist of multiple Configurations to handle different aspects of the logon process.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ConfigurationComponent(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   ConfigurationComponent aggregates 'lower-level' Configuration objects into a 'high-level' Configuration. This enables the assembly of complex Configurations by grouping together simpler ones. For example, a logon policy for the United States could consist of two Configuration groups, one for the east coast and one for the west coast. Each of these could in turn consist of multiple Configurations to handle different aspects of the logon process.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ConfigurationComponent(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ConfigurationComponent() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ConfigGroup", new CIMProperty("ConfigGroup", new CIMDataType(
                CIM_Configuration.CIM_CLASS_NAME), null));
        propertiesToCheck.put("ConfigComponent", new CIMProperty("ConfigComponent",
                new CIMDataType(CIM_Configuration.CIM_CLASS_NAME), null));

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
     * Get the property ConfigGroup
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Configuration get_ConfigGroup_CIM_Configuration(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_CONFIGGROUP_CIM_CONFIGURATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONFIGGROUP_CIM_CONFIGURATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ConfigurationHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property ConfigGroup
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConfigGroup_CIM_Configuration(CIM_Configuration newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONFIGGROUP_CIM_CONFIGURATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ConfigGroup_CIM_Configuration(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONFIGGROUP_CIM_CONFIGURATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConfigGroup by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConfigGroup_CIM_Configuration(WBEMClient client,
            String namespace, CIM_Configuration newValue) throws WbemsmtException {
        CIM_ConfigurationComponent fco = new CIM_ConfigurationComponent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONFIGGROUP_CIM_CONFIGURATION.NAME);
        if (property != null) {
            property = setPropertyValue_ConfigGroup_CIM_Configuration(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONFIGGROUP_CIM_CONFIGURATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConfigGroup
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ConfigGroup_CIM_Configuration(
            CIMProperty currentProperty, CIM_Configuration newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ConfigComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Configuration get_ConfigComponent_CIM_Configuration(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_CONFIGCOMPONENT_CIM_CONFIGURATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONFIGCOMPONENT_CIM_CONFIGURATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ConfigurationHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property ConfigComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConfigComponent_CIM_Configuration(CIM_Configuration newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONFIGCOMPONENT_CIM_CONFIGURATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ConfigComponent_CIM_Configuration(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONFIGCOMPONENT_CIM_CONFIGURATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConfigComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConfigComponent_CIM_Configuration(WBEMClient client,
            String namespace, CIM_Configuration newValue) throws WbemsmtException {
        CIM_ConfigurationComponent fco = new CIM_ConfigurationComponent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONFIGCOMPONENT_CIM_CONFIGURATION.NAME);
        if (property != null) {
            property = setPropertyValue_ConfigComponent_CIM_Configuration(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONFIGCOMPONENT_CIM_CONFIGURATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConfigComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ConfigComponent_CIM_Configuration(
            CIMProperty currentProperty, CIM_Configuration newValue) {
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
        if (!(object instanceof CIM_ConfigurationComponent)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ConfigurationComponent.CIM_CLASS_NAME;
    }

}