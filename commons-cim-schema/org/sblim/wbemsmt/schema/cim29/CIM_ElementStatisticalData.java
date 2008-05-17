/** 
 * CIM_ElementStatisticalData.java
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
 * Description: CIM_ElementStatisticalData is an association that relates a ManagedElement to its StatisticalData. Note that the cardinality of the ManagedElement reference is Min(1), Max(1). This cardinality mandates the instantiation of the ElementStatisticalData association for the referenced instance of CIM_StatisticalData. ElementStatisticalData describes the existence requirements and context for the CIM_StatisticalData, relative to a specific ManagedElement.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ElementStatisticalData extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_ElementStatisticalData";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ManagedElement
     * 
     */
    public static class PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT {
        /**
         * name of the property ManagedElement
         */
        public final static String NAME = "ManagedElement";

    }

    /**
     * Constants of property Stats
     * 
     */
    public static class PROPERTY_STATS_CIM_STATISTICALDATA {
        /**
         * name of the property Stats
         */
        public final static String NAME = "Stats";

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
     *   CIM_ElementStatisticalData is an association that relates a ManagedElement to its StatisticalData. Note that the cardinality of the ManagedElement reference is Min(1), Max(1). This cardinality mandates the instantiation of the ElementStatisticalData association for the referenced instance of CIM_StatisticalData. ElementStatisticalData describes the existence requirements and context for the CIM_StatisticalData, relative to a specific ManagedElement.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ElementStatisticalData(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_ElementStatisticalData is an association that relates a ManagedElement to its StatisticalData. Note that the cardinality of the ManagedElement reference is Min(1), Max(1). This cardinality mandates the instantiation of the ElementStatisticalData association for the referenced instance of CIM_StatisticalData. ElementStatisticalData describes the existence requirements and context for the CIM_StatisticalData, relative to a specific ManagedElement.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ElementStatisticalData(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ElementStatisticalData() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ManagedElement", new CIMProperty("ManagedElement", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Stats", new CIMProperty("Stats", new CIMDataType(
                CIM_StatisticalData.CIM_CLASS_NAME), null));

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
     * Get the property ManagedElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_ManagedElement_CIM_ManagedElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ManagedElement_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ManagedElement_CIM_ManagedElement(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ManagedElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ManagedElement_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_ElementStatisticalData fco = new CIM_ElementStatisticalData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_ManagedElement_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ManagedElement_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Stats
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_StatisticalData get_Stats_CIM_StatisticalData(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_STATS_CIM_STATISTICALDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STATS_CIM_STATISTICALDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_StatisticalDataHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Stats
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Stats_CIM_StatisticalData(CIM_StatisticalData newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STATS_CIM_STATISTICALDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Stats_CIM_StatisticalData(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STATS_CIM_STATISTICALDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Stats by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Stats_CIM_StatisticalData(WBEMClient client, String namespace,
            CIM_StatisticalData newValue) throws WbemsmtException {
        CIM_ElementStatisticalData fco = new CIM_ElementStatisticalData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STATS_CIM_STATISTICALDATA.NAME);
        if (property != null) {
            property = setPropertyValue_Stats_CIM_StatisticalData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STATS_CIM_STATISTICALDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Stats
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Stats_CIM_StatisticalData(
            CIMProperty currentProperty, CIM_StatisticalData newValue) {
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
        if (!(object instanceof CIM_ElementStatisticalData)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ElementStatisticalData.CIM_CLASS_NAME;
    }

}