/** 
 * CIM_ReplaceableProductFRU.java
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
 * Description: ReplaceableProductFRU is an association between Product and FRU that shows what Product components may be replaced. The association is one to many, conveying that a Product can have many FRUs, and that a particular instance of a FRU is only applied to one (instance of a) Product.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ReplaceableProductFRU extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_ReplaceableProductFRU";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Product
     * 
     */
    public static class PROPERTY_PRODUCT_CIM_PRODUCT {
        /**
         * name of the property Product
         */
        public final static String NAME = "Product";

    }

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
     *   ReplaceableProductFRU is an association between Product and FRU that shows what Product components may be replaced. The association is one to many, conveying that a Product can have many FRUs, and that a particular instance of a FRU is only applied to one (instance of a) Product.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ReplaceableProductFRU(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   ReplaceableProductFRU is an association between Product and FRU that shows what Product components may be replaced. The association is one to many, conveying that a Product can have many FRUs, and that a particular instance of a FRU is only applied to one (instance of a) Product.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ReplaceableProductFRU(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ReplaceableProductFRU() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Product", new CIMProperty("Product", new CIMDataType(
                CIM_Product.CIM_CLASS_NAME), null));
        propertiesToCheck.put("FRU", new CIMProperty("FRU",
                new CIMDataType(CIM_FRU.CIM_CLASS_NAME), null));

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
     * Get the property Product
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Product get_Product_CIM_Product(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PRODUCT_CIM_PRODUCT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRODUCT_CIM_PRODUCT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ProductHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Product
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Product_CIM_Product(CIM_Product newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRODUCT_CIM_PRODUCT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Product_CIM_Product(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRODUCT_CIM_PRODUCT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Product by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Product_CIM_Product(WBEMClient client, String namespace,
            CIM_Product newValue) throws WbemsmtException {
        CIM_ReplaceableProductFRU fco = new CIM_ReplaceableProductFRU(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRODUCT_CIM_PRODUCT.NAME);
        if (property != null) {
            property = setPropertyValue_Product_CIM_Product(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRODUCT_CIM_PRODUCT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Product
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Product_CIM_Product(CIMProperty currentProperty,
            CIM_Product newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

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
        CIM_ReplaceableProductFRU fco = new CIM_ReplaceableProductFRU(client, namespace);
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
        if (!(object instanceof CIM_ReplaceableProductFRU)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ReplaceableProductFRU.CIM_CLASS_NAME;
    }

}