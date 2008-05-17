/** 
 * CIM_ServiceAccessURI.java
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
 * Description: CIM_ServiceAccessURI represents the ability to utilize or invoke a Service via a uniform resource identifier. RFC 1738 describes the Uniform Resource Locator which is a more specific form of a URI, and RFC 2396 describes the broader, inclusive URI. Quoting from the RFC, 'A Uniform Resource Identifier (URI) is a compact string of characters for identifying an abstract or physical resource.' In the context of a ServiceAccessPoint, a URI contains the information necessary to access an associated service (associated via ServiceAccessBySAP), using a syntax specific to that service.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ServiceAccessURI extends CIM_ServiceAccessPoint {

    public final static String CIM_CLASS_NAME = "CIM_ServiceAccessURI";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property LabeledURI
     * The LabeledURI property is based on RFC 2079 and its value and syntax is service specific.
     */
    public static class PROPERTY_LABELEDURI {
        /**
         * name of the property LabeledURI
         */
        public final static String NAME = "LabeledURI";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_ServiceAccessPoint.getPackages();

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
     *   CIM_ServiceAccessURI represents the ability to utilize or invoke a Service via a uniform resource identifier. RFC 1738 describes the Uniform Resource Locator which is a more specific form of a URI, and RFC 2396 describes the broader, inclusive URI. Quoting from the RFC, 'A Uniform Resource Identifier (URI) is a compact string of characters for identifying an abstract or physical resource.' In the context of a ServiceAccessPoint, a URI contains the information necessary to access an associated service (associated via ServiceAccessBySAP), using a syntax specific to that service.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ServiceAccessURI(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_ServiceAccessURI represents the ability to utilize or invoke a Service via a uniform resource identifier. RFC 1738 describes the Uniform Resource Locator which is a more specific form of a URI, and RFC 2396 describes the broader, inclusive URI. Quoting from the RFC, 'A Uniform Resource Identifier (URI) is a compact string of characters for identifying an abstract or physical resource.' In the context of a ServiceAccessPoint, a URI contains the information necessary to access an associated service (associated via ServiceAccessBySAP), using a syntax specific to that service.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ServiceAccessURI(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ServiceAccessURI() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("LabeledURI", new CIMProperty("LabeledURI", CIMDataType.STRING_T,
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
     * Get the property LabeledURI
     *     * <br>
     * The LabeledURI property is based on RFC 2079 and its value and syntax is service specific.
     *     */

    public String get_LabeledURI() {
        CIMProperty currentProperty = getProperty(PROPERTY_LABELEDURI.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LABELEDURI.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property LabeledURI
     * <br>
     * The LabeledURI property is based on RFC 2079 and its value and syntax is service specific.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LabeledURI(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LABELEDURI.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LabeledURI(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LABELEDURI.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LabeledURI by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LabeledURI(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_ServiceAccessURI fco = new CIM_ServiceAccessURI(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LABELEDURI.NAME);
        if (property != null) {
            property = setPropertyValue_LabeledURI(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LABELEDURI.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LabeledURI
     * <br>
     * The LabeledURI property is based on RFC 2079 and its value and syntax is service specific.
     */

    private static CIMProperty setPropertyValue_LabeledURI(CIMProperty currentProperty,
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
        return CIM_ServiceAccessURI.CIM_CLASS_NAME;
    }

}