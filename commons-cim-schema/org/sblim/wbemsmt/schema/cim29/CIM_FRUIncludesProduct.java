/** 
 * CIM_FRUIncludesProduct.java
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
 * Description: Indicates that a FRU may be composed of other Product(s).
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_FRUIncludesProduct extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_FRUIncludesProduct";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property FRU
     * 
     */
    public static class PROPERTY_FRU_CIM_FRU {
        /**
         * name of the property FRU
         */
        public final static String NAME = "FRU";

    }

    /**
     * Constants of property Component
     * 
     */
    public static class PROPERTY_COMPONENT_CIM_PRODUCT {
        /**
         * name of the property Component
         */
        public final static String NAME = "Component";

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
     *   Indicates that a FRU may be composed of other Product(s).
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_FRUIncludesProduct(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Indicates that a FRU may be composed of other Product(s).
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_FRUIncludesProduct(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_FRUIncludesProduct() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("FRU", new CIMProperty("FRU",
                new CIMDataType(CIM_FRU.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Component", new CIMProperty("Component", new CIMDataType(
                CIM_Product.CIM_CLASS_NAME), null));

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
     * Get the property FRU
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_FRU get_FRU_CIM_FRU(javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_FRU_CIM_FRU.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FRU_CIM_FRU.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return CIM_FRUHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property FRU
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FRU_CIM_FRU(CIM_FRU newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FRU_CIM_FRU.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FRU_CIM_FRU(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FRU_CIM_FRU.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FRU by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FRU_CIM_FRU(WBEMClient client, String namespace,
            CIM_FRU newValue) throws WbemsmtException {
        CIM_FRUIncludesProduct fco = new CIM_FRUIncludesProduct(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FRU_CIM_FRU.NAME);
        if (property != null) {
            property = setPropertyValue_FRU_CIM_FRU(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FRU_CIM_FRU.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FRU
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_FRU_CIM_FRU(CIMProperty currentProperty,
            CIM_FRU newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Component
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Product get_Component_CIM_Product(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_COMPONENT_CIM_PRODUCT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_COMPONENT_CIM_PRODUCT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ProductHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Component
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Component_CIM_Product(CIM_Product newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_COMPONENT_CIM_PRODUCT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Component_CIM_Product(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_COMPONENT_CIM_PRODUCT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Component by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Component_CIM_Product(WBEMClient client, String namespace,
            CIM_Product newValue) throws WbemsmtException {
        CIM_FRUIncludesProduct fco = new CIM_FRUIncludesProduct(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_COMPONENT_CIM_PRODUCT.NAME);
        if (property != null) {
            property = setPropertyValue_Component_CIM_Product(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_COMPONENT_CIM_PRODUCT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Component
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Component_CIM_Product(CIMProperty currentProperty,
            CIM_Product newValue) {
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
        if (!(object instanceof CIM_FRUIncludesProduct)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_FRUIncludesProduct.CIM_CLASS_NAME;
    }

}