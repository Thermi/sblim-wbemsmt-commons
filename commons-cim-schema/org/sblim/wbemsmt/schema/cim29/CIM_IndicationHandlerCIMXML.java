/** 
 * CIM_IndicationHandlerCIMXML.java
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
 * Description: CIM_IndicationHandlerCIMXML describes the destination for Indications to be delivered via CIM-XML.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_IndicationHandlerCIMXML extends CIM_IndicationHandler {

    public final static String CIM_CLASS_NAME = "CIM_IndicationHandlerCIMXML";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Destination
     * The destination URL to which CIM-XML Indication messages are to be delivered. The scheme prefix MUST be consistent with the DMTF CIM-XML Specifications. If a scheme prefix is not specified, the scheme "http:" MUST be assumed.
     */
    public static class PROPERTY_DESTINATION {
        /**
         * name of the property Destination
         */
        public final static String NAME = "Destination";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_IndicationHandler.getPackages();

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
     *   CIM_IndicationHandlerCIMXML describes the destination for Indications to be delivered via CIM-XML.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_IndicationHandlerCIMXML(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_IndicationHandlerCIMXML describes the destination for Indications to be delivered via CIM-XML.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_IndicationHandlerCIMXML(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_IndicationHandlerCIMXML() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Destination", new CIMProperty("Destination", CIMDataType.STRING_T,
                null));

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
     * Get the property Destination
     *     * <br>
     * The destination URL to which CIM-XML Indication messages are to be delivered. The scheme prefix MUST be consistent with the DMTF CIM-XML Specifications. If a scheme prefix is not specified, the scheme "http:" MUST be assumed.
     *     */

    public String get_Destination() {
        CIMProperty currentProperty = getProperty(PROPERTY_DESTINATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DESTINATION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Destination
     * <br>
     * The destination URL to which CIM-XML Indication messages are to be delivered. The scheme prefix MUST be consistent with the DMTF CIM-XML Specifications. If a scheme prefix is not specified, the scheme "http:" MUST be assumed.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Destination(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DESTINATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Destination(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DESTINATION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Destination by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Destination(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_IndicationHandlerCIMXML fco = new CIM_IndicationHandlerCIMXML(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESTINATION.NAME);
        if (property != null) {
            property = setPropertyValue_Destination(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DESTINATION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Destination
     * <br>
     * The destination URL to which CIM-XML Indication messages are to be delivered. The scheme prefix MUST be consistent with the DMTF CIM-XML Specifications. If a scheme prefix is not specified, the scheme "http:" MUST be assumed.
     */

    private static CIMProperty setPropertyValue_Destination(CIMProperty currentProperty,
            String newValue) {
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
        return CIM_IndicationHandlerCIMXML.CIM_CLASS_NAME;
    }

}