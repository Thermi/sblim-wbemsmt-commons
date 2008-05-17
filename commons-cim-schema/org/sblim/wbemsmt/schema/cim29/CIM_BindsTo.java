/** 
 * CIM_BindsTo.java
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
 * Description: This association establishes a ServiceAccessPoint as a requestor of protocol services from a ProtocolEndpoint. Typically, this association runs between SAPs and endpoints on a single system. Since a ProtocolEndpoint is a kind of ServiceAccessPoint, this binding can be used to establish a layering of two protocols, the upper layer represented by the Dependent and the lower layer represented by the Antecedent.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_BindsTo extends CIM_SAPSAPDependency {

    public final static String CIM_CLASS_NAME = "CIM_BindsTo";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Antecedent
     * 
     */
    public static class PROPERTY_ANTECEDENT_CIM_PROTOCOLENDPOINT {
        /**
         * name of the property Antecedent
         */
        public final static String NAME = "Antecedent";

    }

    /**
     * Constants of property Dependent
     * 
     */
    public static class PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT {
        /**
         * name of the property Dependent
         */
        public final static String NAME = "Dependent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_SAPSAPDependency.getPackages();

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
     *   This association establishes a ServiceAccessPoint as a requestor of protocol services from a ProtocolEndpoint. Typically, this association runs between SAPs and endpoints on a single system. Since a ProtocolEndpoint is a kind of ServiceAccessPoint, this binding can be used to establish a layering of two protocols, the upper layer represented by the Dependent and the lower layer represented by the Antecedent.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_BindsTo(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This association establishes a ServiceAccessPoint as a requestor of protocol services from a ProtocolEndpoint. Typically, this association runs between SAPs and endpoints on a single system. Since a ProtocolEndpoint is a kind of ServiceAccessPoint, this binding can be used to establish a layering of two protocols, the upper layer represented by the Dependent and the lower layer represented by the Antecedent.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_BindsTo(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_BindsTo() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Antecedent", new CIMProperty("Antecedent", new CIMDataType(
                CIM_ProtocolEndpoint.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependent", new CIMProperty("Dependent", new CIMDataType(
                CIM_ServiceAccessPoint.CIM_CLASS_NAME), null));

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
     * Get the property Antecedent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ProtocolEndpoint get_Antecedent_CIM_ProtocolEndpoint(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_PROTOCOLENDPOINT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_PROTOCOLENDPOINT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ProtocolEndpointHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Antecedent_CIM_ProtocolEndpoint(CIM_ProtocolEndpoint newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_PROTOCOLENDPOINT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Antecedent_CIM_ProtocolEndpoint(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_PROTOCOLENDPOINT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Antecedent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Antecedent_CIM_ProtocolEndpoint(WBEMClient client,
            String namespace, CIM_ProtocolEndpoint newValue) throws WbemsmtException {
        CIM_BindsTo fco = new CIM_BindsTo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ANTECEDENT_CIM_PROTOCOLENDPOINT.NAME);
        if (property != null) {
            property = setPropertyValue_Antecedent_CIM_ProtocolEndpoint(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_PROTOCOLENDPOINT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Antecedent_CIM_ProtocolEndpoint(
            CIMProperty currentProperty, CIM_ProtocolEndpoint newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Dependent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ServiceAccessPoint get_Dependent_CIM_ServiceAccessPoint(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ServiceAccessPointHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Dependent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependent_CIM_ServiceAccessPoint(CIM_ServiceAccessPoint newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Dependent_CIM_ServiceAccessPoint(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Dependent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Dependent_CIM_ServiceAccessPoint(WBEMClient client,
            String namespace, CIM_ServiceAccessPoint newValue) throws WbemsmtException {
        CIM_BindsTo fco = new CIM_BindsTo(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT.NAME);
        if (property != null) {
            property = setPropertyValue_Dependent_CIM_ServiceAccessPoint(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_SERVICEACCESSPOINT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependent_CIM_ServiceAccessPoint(
            CIMProperty currentProperty, CIM_ServiceAccessPoint newValue) {
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
        return CIM_BindsTo.CIM_CLASS_NAME;
    }

}