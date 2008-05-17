/** 
 * CIM_ProductProductDependency.java
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
 * Description: CIM_ProductProductDependency is an association between two Products, indicating that one must be installed, or must be absent, for the other to function. This is conceptually equivalent to the ServiceServiceDependency association.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ProductProductDependency extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_ProductProductDependency";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property TypeOfDependency
     * The nature of the Product dependency. This property describes that the associated Product must be installed (value=2) or must be absent (value=3) in order for the Product to function.
     */
    public static class PROPERTY_TYPEOFDEPENDENCY {
        /**
         * name of the property TypeOfDependency
         */
        public final static String NAME = "TypeOfDependency";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Other (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Product_Must_Be_Installed = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Product Must Be Installed (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Product_Must_Be_Installed = "Product Must Be Installed";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Product_Must_Not_Be_Installed = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Product Must Not Be Installed (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Product_Must_Not_Be_Installed = "Product Must Not Be Installed";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@ab00ab0
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Product_Must_Be_Installed.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Product_Must_Be_Installed;
            }

            if (VALUE_ENTRY_Product_Must_Not_Be_Installed.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Product_Must_Not_Be_Installed;
            }
            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(
                Number indexInPulldown) {
            return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
        }

        /**
         * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
         *
         * can be used to set the correct selection index for a pulldown field
         *
         * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
         * @param currentValue the currentValue to get the index for
         */
        public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue) {
            String valueEntry = getValueEntry(currentValue);
            if (valueEntry != null) {
                for (int i = 0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++) {
                    if (VALUE_ENTRIES_FOR_DISPLAY[i].equals(valueEntry)) {
                        return i;
                    }
                }
            }
            return -1;

        }

        /**
         * get the ValueEntry of the given valueMapEntry
         * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
         * @return the Value entry or null if not found
         */

        public static String getValueEntry(javax.cim.UnsignedInteger16 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Product_Must_Be_Installed.intValue()) {
                return VALUE_ENTRY_Product_Must_Be_Installed;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Product_Must_Not_Be_Installed
                    .intValue()) {
                return VALUE_ENTRY_Product_Must_Not_Be_Installed;
            }
            return null;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property TypeOfDependency   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Product_Must_Be_Installed,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Product_Must_Not_Be_Installed };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property TypeOfDependency   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Product_Must_Be_Installed, VALUE_ENTRY_Product_Must_Not_Be_Installed };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property TypeOfDependency   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Product_Must_Be_Installed,
                VALUE_ENTRY_Product_Must_Not_Be_Installed };

    }

    /**
     * Constants of property RequiredProduct
     * 
     */
    public static class PROPERTY_REQUIREDPRODUCT_CIM_PRODUCT {
        /**
         * name of the property RequiredProduct
         */
        public final static String NAME = "RequiredProduct";

    }

    /**
     * Constants of property DependentProduct
     * 
     */
    public static class PROPERTY_DEPENDENTPRODUCT_CIM_PRODUCT {
        /**
         * name of the property DependentProduct
         */
        public final static String NAME = "DependentProduct";

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
     *   CIM_ProductProductDependency is an association between two Products, indicating that one must be installed, or must be absent, for the other to function. This is conceptually equivalent to the ServiceServiceDependency association.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ProductProductDependency(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_ProductProductDependency is an association between two Products, indicating that one must be installed, or must be absent, for the other to function. This is conceptually equivalent to the ServiceServiceDependency association.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ProductProductDependency(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ProductProductDependency() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("TypeOfDependency", new CIMProperty("TypeOfDependency",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("RequiredProduct", new CIMProperty("RequiredProduct",
                new CIMDataType(CIM_Product.CIM_CLASS_NAME), null));
        propertiesToCheck.put("DependentProduct", new CIMProperty("DependentProduct",
                new CIMDataType(CIM_Product.CIM_CLASS_NAME), null));

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
     * Get the property TypeOfDependency
     *     * <br>
     * The nature of the Product dependency. This property describes that the associated Product must be installed (value=2) or must be absent (value=3) in order for the Product to function.
     *     */

    public javax.cim.UnsignedInteger16 get_TypeOfDependency() {
        CIMProperty currentProperty = getProperty(PROPERTY_TYPEOFDEPENDENCY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TYPEOFDEPENDENCY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property TypeOfDependency
     * <br>
     * The nature of the Product dependency. This property describes that the associated Product must be installed (value=2) or must be absent (value=3) in order for the Product to function.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TypeOfDependency(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TYPEOFDEPENDENCY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TypeOfDependency(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TYPEOFDEPENDENCY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TypeOfDependency by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TypeOfDependency(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ProductProductDependency fco = new CIM_ProductProductDependency(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TYPEOFDEPENDENCY.NAME);
        if (property != null) {
            property = setPropertyValue_TypeOfDependency(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TYPEOFDEPENDENCY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TypeOfDependency
     * <br>
     * The nature of the Product dependency. This property describes that the associated Product must be installed (value=2) or must be absent (value=3) in order for the Product to function.
     */

    private static CIMProperty setPropertyValue_TypeOfDependency(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RequiredProduct
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Product get_RequiredProduct_CIM_Product(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUIREDPRODUCT_CIM_PRODUCT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REQUIREDPRODUCT_CIM_PRODUCT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ProductHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property RequiredProduct
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RequiredProduct_CIM_Product(CIM_Product newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUIREDPRODUCT_CIM_PRODUCT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RequiredProduct_CIM_Product(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REQUIREDPRODUCT_CIM_PRODUCT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RequiredProduct by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RequiredProduct_CIM_Product(WBEMClient client,
            String namespace, CIM_Product newValue) throws WbemsmtException {
        CIM_ProductProductDependency fco = new CIM_ProductProductDependency(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REQUIREDPRODUCT_CIM_PRODUCT.NAME);
        if (property != null) {
            property = setPropertyValue_RequiredProduct_CIM_Product(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REQUIREDPRODUCT_CIM_PRODUCT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RequiredProduct
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_RequiredProduct_CIM_Product(
            CIMProperty currentProperty, CIM_Product newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DependentProduct
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Product get_DependentProduct_CIM_Product(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENTPRODUCT_CIM_PRODUCT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENTPRODUCT_CIM_PRODUCT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ProductHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property DependentProduct
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DependentProduct_CIM_Product(CIM_Product newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENTPRODUCT_CIM_PRODUCT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DependentProduct_CIM_Product(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENTPRODUCT_CIM_PRODUCT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DependentProduct by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DependentProduct_CIM_Product(WBEMClient client,
            String namespace, CIM_Product newValue) throws WbemsmtException {
        CIM_ProductProductDependency fco = new CIM_ProductProductDependency(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENTPRODUCT_CIM_PRODUCT.NAME);
        if (property != null) {
            property = setPropertyValue_DependentProduct_CIM_Product(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENTPRODUCT_CIM_PRODUCT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DependentProduct
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_DependentProduct_CIM_Product(
            CIMProperty currentProperty, CIM_Product newValue) {
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
        if (!(object instanceof CIM_ProductProductDependency)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ProductProductDependency.CIM_CLASS_NAME;
    }

}