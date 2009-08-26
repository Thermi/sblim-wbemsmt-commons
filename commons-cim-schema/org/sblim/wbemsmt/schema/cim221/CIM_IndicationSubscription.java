/**
 * CIM_IndicationSubscription.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED UNDER THE
 * TER MS OF THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Common Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: CIM_IndicationSubscription describes a flow
 *            of Indications. The flow is specified by the referenced Filter, and directed to the
 *            referenced destination or process in the Handler. Property values of the referenced
 *            CIM_IndicationFilter instance and CIM_ListenerDestination instance MAY significantly
 *            effect the definition of the subscription. E.g., a subscription associated with a
 *            "Transient" destination MAY be deleted when the destination terminates or is no longer
 *            available. generated Class
 */

package org.sblim.wbemsmt.schema.cim221;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_IndicationSubscription extends CIM_AbstractIndicationSubscription {

    public final static String CIM_CLASS_NAME = "CIM_IndicationSubscription";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Filter
     * 
     */
    public static class PROPERTY_FILTER_CIM_INDICATIONFILTER {
        /**
         * name of the property Filter
         */
        public final static String NAME = "Filter";

    }

    /**
     * Constants of property Handler
     * 
     */
    public static class PROPERTY_HANDLER_CIM_LISTENERDESTINATION {
        /**
         * name of the property Handler
         */
        public final static String NAME = "Handler";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim221");
        String[] parentClassPackageList = CIM_AbstractIndicationSubscription.getPackages();

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
     *   CIM_IndicationSubscription describes a flow of Indications. The flow is specified by the referenced Filter, and directed to the referenced destination or process in the Handler. Property values of the referenced CIM_IndicationFilter instance and CIM_ListenerDestination instance MAY significantly effect the definition of the subscription. E.g., a subscription associated with a "Transient" destination MAY be deleted when the destination terminates or is no longer available.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_IndicationSubscription(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_IndicationSubscription describes a flow of Indications. The flow is specified by the referenced Filter, and directed to the referenced destination or process in the Handler. Property values of the referenced CIM_IndicationFilter instance and CIM_ListenerDestination instance MAY significantly effect the definition of the subscription. E.g., a subscription associated with a "Transient" destination MAY be deleted when the destination terminates or is no longer available.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_IndicationSubscription(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_IndicationSubscription() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Filter", new CIMProperty("Filter", new CIMDataType(
                CIM_IndicationFilter.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Handler", new CIMProperty("Handler", new CIMDataType(
                CIM_ListenerDestination.CIM_CLASS_NAME), null));

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
     * Get the property Filter
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_IndicationFilter get_Filter_CIM_IndicationFilter(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_FILTER_CIM_INDICATIONFILTER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FILTER_CIM_INDICATIONFILTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_IndicationFilterHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Filter
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Filter_CIM_IndicationFilter(CIM_IndicationFilter newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FILTER_CIM_INDICATIONFILTER.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Filter_CIM_IndicationFilter(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FILTER_CIM_INDICATIONFILTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Filter by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Filter_CIM_IndicationFilter(WBEMClient client,
            String namespace, CIM_IndicationFilter newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FILTER_CIM_INDICATIONFILTER.NAME);
        if (property != null) {
            property = setPropertyValue_Filter_CIM_IndicationFilter(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FILTER_CIM_INDICATIONFILTER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Filter
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Filter_CIM_IndicationFilter(
            CIMProperty currentProperty, CIM_IndicationFilter newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Handler
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ListenerDestination get_Handler_CIM_ListenerDestination(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_HANDLER_CIM_LISTENERDESTINATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_HANDLER_CIM_LISTENERDESTINATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ListenerDestinationHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Handler
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Handler_CIM_ListenerDestination(CIM_ListenerDestination newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HANDLER_CIM_LISTENERDESTINATION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Handler_CIM_ListenerDestination(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_HANDLER_CIM_LISTENERDESTINATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Handler by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Handler_CIM_ListenerDestination(WBEMClient client,
            String namespace, CIM_ListenerDestination newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HANDLER_CIM_LISTENERDESTINATION.NAME);
        if (property != null) {
            property = setPropertyValue_Handler_CIM_ListenerDestination(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_HANDLER_CIM_LISTENERDESTINATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Handler
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Handler_CIM_ListenerDestination(
            CIMProperty currentProperty, CIM_ListenerDestination newValue) {
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
        return CIM_IndicationSubscription.CIM_CLASS_NAME;
    }

}