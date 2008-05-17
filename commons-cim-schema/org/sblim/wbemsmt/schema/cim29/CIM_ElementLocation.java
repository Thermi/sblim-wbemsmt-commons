/** 
 * CIM_ElementLocation.java
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
 * Description: ElementLocation associates a ManagedElement with a Location for positioning, inventory, maintenance and similar purposes. PhysicalElements can certainly have Locations - this is explicitly defined in a subclass, PhysicalElement Location. However, other ManagedElements may also be associated with Locations. For example, Organizations may be 'in' one or more Locations, or Services may be restricted to a Location.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ElementLocation extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_ElementLocation";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Element
     * 
     */
    public static class PROPERTY_ELEMENT_CIM_MANAGEDELEMENT {
        /**
         * name of the property Element
         */
        public final static String NAME = "Element";

    }

    /**
     * Constants of property PhysicalLocation
     * 
     */
    public static class PROPERTY_PHYSICALLOCATION_CIM_LOCATION {
        /**
         * name of the property PhysicalLocation
         */
        public final static String NAME = "PhysicalLocation";

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
     *   ElementLocation associates a ManagedElement with a Location for positioning, inventory, maintenance and similar purposes. PhysicalElements can certainly have Locations - this is explicitly defined in a subclass, PhysicalElement Location. However, other ManagedElements may also be associated with Locations. For example, Organizations may be 'in' one or more Locations, or Services may be restricted to a Location.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ElementLocation(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   ElementLocation associates a ManagedElement with a Location for positioning, inventory, maintenance and similar purposes. PhysicalElements can certainly have Locations - this is explicitly defined in a subclass, PhysicalElement Location. However, other ManagedElements may also be associated with Locations. For example, Organizations may be 'in' one or more Locations, or Services may be restricted to a Location.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ElementLocation(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ElementLocation() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Element", new CIMProperty("Element", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), null));
        propertiesToCheck.put("PhysicalLocation", new CIMProperty("PhysicalLocation",
                new CIMDataType(CIM_Location.CIM_CLASS_NAME), null));

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
     * Get the property Element
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_Element_CIM_ManagedElement(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENT_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Element
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Element_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Element_CIM_ManagedElement(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Element by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Element_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_ElementLocation fco = new CIM_ElementLocation(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_Element_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Element
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Element_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PhysicalLocation
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Location get_PhysicalLocation_CIM_Location(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PHYSICALLOCATION_CIM_LOCATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PHYSICALLOCATION_CIM_LOCATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_LocationHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property PhysicalLocation
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PhysicalLocation_CIM_Location(CIM_Location newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PHYSICALLOCATION_CIM_LOCATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PhysicalLocation_CIM_Location(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PHYSICALLOCATION_CIM_LOCATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PhysicalLocation by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PhysicalLocation_CIM_Location(WBEMClient client,
            String namespace, CIM_Location newValue) throws WbemsmtException {
        CIM_ElementLocation fco = new CIM_ElementLocation(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PHYSICALLOCATION_CIM_LOCATION.NAME);
        if (property != null) {
            property = setPropertyValue_PhysicalLocation_CIM_Location(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PHYSICALLOCATION_CIM_LOCATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PhysicalLocation
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_PhysicalLocation_CIM_Location(
            CIMProperty currentProperty, CIM_Location newValue) {
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
        if (!(object instanceof CIM_ElementLocation)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ElementLocation.CIM_CLASS_NAME;
    }

}