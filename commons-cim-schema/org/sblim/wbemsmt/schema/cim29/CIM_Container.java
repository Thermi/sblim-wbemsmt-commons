/** 
 * CIM_Container.java
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
 * Description: The Container association represents the relationship between a contained and a containing PhysicalElement. A containing object must be a PhysicalPackage.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_Container extends CIM_Component {

    public final static String CIM_CLASS_NAME = "CIM_Container";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property LocationWithinContainer
     * A free-form string representing the positioning of the PhysicalElement within the PhysicalPackage. Information relative to stationary elements in the Container (for example, 'second drive bay from the top'), angles, altitudes and other data may be recorded in this property. This string could supplement or be used in place of instantiating the CIM_Location object.
     */
    public static class PROPERTY_LOCATIONWITHINCONTAINER {
        /**
         * name of the property LocationWithinContainer
         */
        public final static String NAME = "LocationWithinContainer";

    }

    /**
     * Constants of property GroupComponent
     * 
     */
    public static class PROPERTY_GROUPCOMPONENT_CIM_PHYSICALPACKAGE {
        /**
         * name of the property GroupComponent
         */
        public final static String NAME = "GroupComponent";

    }

    /**
     * Constants of property PartComponent
     * 
     */
    public static class PROPERTY_PARTCOMPONENT_CIM_PHYSICALELEMENT {
        /**
         * name of the property PartComponent
         */
        public final static String NAME = "PartComponent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Component.getPackages();

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
     *   The Container association represents the relationship between a contained and a containing PhysicalElement. A containing object must be a PhysicalPackage.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Container(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The Container association represents the relationship between a contained and a containing PhysicalElement. A containing object must be a PhysicalPackage.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Container(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Container() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("LocationWithinContainer", new CIMProperty("LocationWithinContainer",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("GroupComponent", new CIMProperty("GroupComponent", new CIMDataType(
                CIM_PhysicalPackage.CIM_CLASS_NAME), null));
        propertiesToCheck.put("PartComponent", new CIMProperty("PartComponent", new CIMDataType(
                CIM_PhysicalElement.CIM_CLASS_NAME), null));

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
     * Get the property LocationWithinContainer
     *     * <br>
     * A free-form string representing the positioning of the PhysicalElement within the PhysicalPackage. Information relative to stationary elements in the Container (for example, 'second drive bay from the top'), angles, altitudes and other data may be recorded in this property. This string could supplement or be used in place of instantiating the CIM_Location object.
     *     */

    public String get_LocationWithinContainer() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCATIONWITHINCONTAINER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOCATIONWITHINCONTAINER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property LocationWithinContainer
     * <br>
     * A free-form string representing the positioning of the PhysicalElement within the PhysicalPackage. Information relative to stationary elements in the Container (for example, 'second drive bay from the top'), angles, altitudes and other data may be recorded in this property. This string could supplement or be used in place of instantiating the CIM_Location object.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LocationWithinContainer(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCATIONWITHINCONTAINER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LocationWithinContainer(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOCATIONWITHINCONTAINER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LocationWithinContainer by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LocationWithinContainer(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Container fco = new CIM_Container(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOCATIONWITHINCONTAINER.NAME);
        if (property != null) {
            property = setPropertyValue_LocationWithinContainer(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOCATIONWITHINCONTAINER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LocationWithinContainer
     * <br>
     * A free-form string representing the positioning of the PhysicalElement within the PhysicalPackage. Information relative to stationary elements in the Container (for example, 'second drive bay from the top'), angles, altitudes and other data may be recorded in this property. This string could supplement or be used in place of instantiating the CIM_Location object.
     */

    private static CIMProperty setPropertyValue_LocationWithinContainer(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property GroupComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_PhysicalPackage get_GroupComponent_CIM_PhysicalPackage(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_CIM_PHYSICALPACKAGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_PHYSICALPACKAGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_PhysicalPackageHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GroupComponent_CIM_PhysicalPackage(CIM_PhysicalPackage newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_CIM_PHYSICALPACKAGE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_GroupComponent_CIM_PhysicalPackage(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_PHYSICALPACKAGE.NAME
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

    public static CIMProperty create_GroupComponent_CIM_PhysicalPackage(WBEMClient client,
            String namespace, CIM_PhysicalPackage newValue) throws WbemsmtException {
        CIM_Container fco = new CIM_Container(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GROUPCOMPONENT_CIM_PHYSICALPACKAGE.NAME);
        if (property != null) {
            property = setPropertyValue_GroupComponent_CIM_PhysicalPackage(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_PHYSICALPACKAGE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_GroupComponent_CIM_PhysicalPackage(
            CIMProperty currentProperty, CIM_PhysicalPackage newValue) {
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

    public CIM_PhysicalElement get_PartComponent_CIM_PhysicalElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_CIM_PHYSICALELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_PHYSICALELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_PhysicalElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PartComponent_CIM_PhysicalElement(CIM_PhysicalElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_CIM_PHYSICALELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PartComponent_CIM_PhysicalElement(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_PHYSICALELEMENT.NAME
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

    public static CIMProperty create_PartComponent_CIM_PhysicalElement(WBEMClient client,
            String namespace, CIM_PhysicalElement newValue) throws WbemsmtException {
        CIM_Container fco = new CIM_Container(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARTCOMPONENT_CIM_PHYSICALELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_PartComponent_CIM_PhysicalElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_PHYSICALELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_PartComponent_CIM_PhysicalElement(
            CIMProperty currentProperty, CIM_PhysicalElement newValue) {
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
        return CIM_Container.CIM_CLASS_NAME;
    }

}