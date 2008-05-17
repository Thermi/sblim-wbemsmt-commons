/** 
 * CIM_InstalledSoftwareIdentity.java
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
 * Description: The InstalledSoftwareIdentity association identifies the System on which a SoftwareIdentity is installed. This class is a corollary to InstalledSoftwareElement, but deals with the asset aspects of software (as indicated by SoftwareIdentity), versus the deployment aspects (as indicated by SoftwareElement).
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_InstalledSoftwareIdentity extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_InstalledSoftwareIdentity";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property System
     * 
     */
    public static class PROPERTY_SYSTEM_CIM_SYSTEM {
        /**
         * name of the property System
         */
        public final static String NAME = "System";

    }

    /**
     * Constants of property InstalledSoftware
     * 
     */
    public static class PROPERTY_INSTALLEDSOFTWARE_CIM_SOFTWAREIDENTITY {
        /**
         * name of the property InstalledSoftware
         */
        public final static String NAME = "InstalledSoftware";

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
     *   The InstalledSoftwareIdentity association identifies the System on which a SoftwareIdentity is installed. This class is a corollary to InstalledSoftwareElement, but deals with the asset aspects of software (as indicated by SoftwareIdentity), versus the deployment aspects (as indicated by SoftwareElement).
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_InstalledSoftwareIdentity(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The InstalledSoftwareIdentity association identifies the System on which a SoftwareIdentity is installed. This class is a corollary to InstalledSoftwareElement, but deals with the asset aspects of software (as indicated by SoftwareIdentity), versus the deployment aspects (as indicated by SoftwareElement).
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_InstalledSoftwareIdentity(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_InstalledSoftwareIdentity() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("System", new CIMProperty("System", new CIMDataType(
                CIM_System.CIM_CLASS_NAME), null));
        propertiesToCheck.put("InstalledSoftware", new CIMProperty("InstalledSoftware",
                new CIMDataType(CIM_SoftwareIdentity.CIM_CLASS_NAME), null));

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
     * Get the property System
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_System get_System_CIM_System(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEM_CIM_SYSTEM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEM_CIM_SYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SystemHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property System
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_System_CIM_System(CIM_System newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEM_CIM_SYSTEM.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_System_CIM_System(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEM_CIM_SYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property System by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_System_CIM_System(WBEMClient client, String namespace,
            CIM_System newValue) throws WbemsmtException {
        CIM_InstalledSoftwareIdentity fco = new CIM_InstalledSoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEM_CIM_SYSTEM.NAME);
        if (property != null) {
            property = setPropertyValue_System_CIM_System(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEM_CIM_SYSTEM.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property System
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_System_CIM_System(CIMProperty currentProperty,
            CIM_System newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property InstalledSoftware
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_SoftwareIdentity get_InstalledSoftware_CIM_SoftwareIdentity(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_INSTALLEDSOFTWARE_CIM_SOFTWAREIDENTITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INSTALLEDSOFTWARE_CIM_SOFTWAREIDENTITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SoftwareIdentityHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property InstalledSoftware
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_InstalledSoftware_CIM_SoftwareIdentity(CIM_SoftwareIdentity newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INSTALLEDSOFTWARE_CIM_SOFTWAREIDENTITY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_InstalledSoftware_CIM_SoftwareIdentity(
                    currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INSTALLEDSOFTWARE_CIM_SOFTWAREIDENTITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InstalledSoftware by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_InstalledSoftware_CIM_SoftwareIdentity(WBEMClient client,
            String namespace, CIM_SoftwareIdentity newValue) throws WbemsmtException {
        CIM_InstalledSoftwareIdentity fco = new CIM_InstalledSoftwareIdentity(client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_INSTALLEDSOFTWARE_CIM_SOFTWAREIDENTITY.NAME);
        if (property != null) {
            property = setPropertyValue_InstalledSoftware_CIM_SoftwareIdentity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INSTALLEDSOFTWARE_CIM_SOFTWAREIDENTITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InstalledSoftware
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_InstalledSoftware_CIM_SoftwareIdentity(
            CIMProperty currentProperty, CIM_SoftwareIdentity newValue) {
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
        if (!(object instanceof CIM_InstalledSoftwareIdentity)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_InstalledSoftwareIdentity.CIM_CLASS_NAME;
    }

}