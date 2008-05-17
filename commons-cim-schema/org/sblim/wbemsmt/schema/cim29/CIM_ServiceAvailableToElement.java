/** 
 * CIM_ServiceAvailableToElement.java
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
 * Description: CIM_ServiceAvailableToElement conveys the semantics of a Service being available for the 'use' of a ManagedElement. An example is that a Processor and an enclosure (a PhysicalElement) may use AlertOnLAN Services to signal an incomplete or erroneous boot. In reality, AlertOnLAN is simply a HostedService on a computer system that is generally 'available for use', and not a dependency of the processor or enclosure. To describe that use of this service is restricted or has limited availability/applicability, then the CIM_ServiceAvailableToElement association would be instantiated between the Service and specific CIM_Processors and CIM_Chassis .
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ServiceAvailableToElement extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_ServiceAvailableToElement";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ServiceProvided
     * 
     */
    public static class PROPERTY_SERVICEPROVIDED_CIM_SERVICE {
        /**
         * name of the property ServiceProvided
         */
        public final static String NAME = "ServiceProvided";

    }

    /**
     * Constants of property UserOfService
     * 
     */
    public static class PROPERTY_USEROFSERVICE_CIM_MANAGEDELEMENT {
        /**
         * name of the property UserOfService
         */
        public final static String NAME = "UserOfService";

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
     *   CIM_ServiceAvailableToElement conveys the semantics of a Service being available for the 'use' of a ManagedElement. An example is that a Processor and an enclosure (a PhysicalElement) may use AlertOnLAN Services to signal an incomplete or erroneous boot. In reality, AlertOnLAN is simply a HostedService on a computer system that is generally 'available for use', and not a dependency of the processor or enclosure. To describe that use of this service is restricted or has limited availability/applicability, then the CIM_ServiceAvailableToElement association would be instantiated between the Service and specific CIM_Processors and CIM_Chassis .
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ServiceAvailableToElement(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_ServiceAvailableToElement conveys the semantics of a Service being available for the 'use' of a ManagedElement. An example is that a Processor and an enclosure (a PhysicalElement) may use AlertOnLAN Services to signal an incomplete or erroneous boot. In reality, AlertOnLAN is simply a HostedService on a computer system that is generally 'available for use', and not a dependency of the processor or enclosure. To describe that use of this service is restricted or has limited availability/applicability, then the CIM_ServiceAvailableToElement association would be instantiated between the Service and specific CIM_Processors and CIM_Chassis .
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ServiceAvailableToElement(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ServiceAvailableToElement() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ServiceProvided", new CIMProperty("ServiceProvided",
                new CIMDataType(CIM_Service.CIM_CLASS_NAME), null));
        propertiesToCheck.put("UserOfService", new CIMProperty("UserOfService", new CIMDataType(
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
     * Get the property ServiceProvided
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Service get_ServiceProvided_CIM_Service(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SERVICEPROVIDED_CIM_SERVICE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SERVICEPROVIDED_CIM_SERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ServiceHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property ServiceProvided
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ServiceProvided_CIM_Service(CIM_Service newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SERVICEPROVIDED_CIM_SERVICE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ServiceProvided_CIM_Service(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SERVICEPROVIDED_CIM_SERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ServiceProvided by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ServiceProvided_CIM_Service(WBEMClient client,
            String namespace, CIM_Service newValue) throws WbemsmtException {
        CIM_ServiceAvailableToElement fco = new CIM_ServiceAvailableToElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SERVICEPROVIDED_CIM_SERVICE.NAME);
        if (property != null) {
            property = setPropertyValue_ServiceProvided_CIM_Service(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SERVICEPROVIDED_CIM_SERVICE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ServiceProvided
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ServiceProvided_CIM_Service(
            CIMProperty currentProperty, CIM_Service newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UserOfService
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_UserOfService_CIM_ManagedElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_USEROFSERVICE_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_USEROFSERVICE_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property UserOfService
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UserOfService_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_USEROFSERVICE_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UserOfService_CIM_ManagedElement(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_USEROFSERVICE_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UserOfService by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UserOfService_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_ServiceAvailableToElement fco = new CIM_ServiceAvailableToElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_USEROFSERVICE_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_UserOfService_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_USEROFSERVICE_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UserOfService
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_UserOfService_CIM_ManagedElement(
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
        if (!(object instanceof CIM_ServiceAvailableToElement)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ServiceAvailableToElement.CIM_CLASS_NAME;
    }

}