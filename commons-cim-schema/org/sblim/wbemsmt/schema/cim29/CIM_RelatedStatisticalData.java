/** 
 * CIM_RelatedStatisticalData.java
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
 * Description: CIM_RelatedStatisticalData is an association that defines hierarchies and/or dependencies of related CIM_Statistical Data classes.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_RelatedStatisticalData extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_RelatedStatisticalData";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Description
     * A free-form string describing how the statistics are related.
     */
    public static class PROPERTY_DESCRIPTION {
        /**
         * name of the property Description
         */
        public final static String NAME = "Description";

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

    /**
     * Constants of property RelatedStats
     * 
     */
    public static class PROPERTY_RELATEDSTATS_CIM_STATISTICALDATA {
        /**
         * name of the property RelatedStats
         */
        public final static String NAME = "RelatedStats";

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
     *   CIM_RelatedStatisticalData is an association that defines hierarchies and/or dependencies of related CIM_Statistical Data classes.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_RelatedStatisticalData(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_RelatedStatisticalData is an association that defines hierarchies and/or dependencies of related CIM_Statistical Data classes.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_RelatedStatisticalData(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_RelatedStatisticalData() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Description", new CIMProperty("Description", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("Stats", new CIMProperty("Stats", new CIMDataType(
                CIM_StatisticalData.CIM_CLASS_NAME), null));
        propertiesToCheck.put("RelatedStats", new CIMProperty("RelatedStats", new CIMDataType(
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
     * Get the property Description
     *     * <br>
     * A free-form string describing how the statistics are related.
     *     */

    public String get_Description() {
        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Description
     * <br>
     * A free-form string describing how the statistics are related.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Description(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Description(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Description by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Description(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_RelatedStatisticalData fco = new CIM_RelatedStatisticalData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_Description(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Description
     * <br>
     * A free-form string describing how the statistics are related.
     */

    private static CIMProperty setPropertyValue_Description(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

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
        CIM_RelatedStatisticalData fco = new CIM_RelatedStatisticalData(client, namespace);
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

    /**
     * Get the property RelatedStats
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_StatisticalData get_RelatedStats_CIM_StatisticalData(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_RELATEDSTATS_CIM_STATISTICALDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RELATEDSTATS_CIM_STATISTICALDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_StatisticalDataHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property RelatedStats
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RelatedStats_CIM_StatisticalData(CIM_StatisticalData newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RELATEDSTATS_CIM_STATISTICALDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RelatedStats_CIM_StatisticalData(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RELATEDSTATS_CIM_STATISTICALDATA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RelatedStats by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RelatedStats_CIM_StatisticalData(WBEMClient client,
            String namespace, CIM_StatisticalData newValue) throws WbemsmtException {
        CIM_RelatedStatisticalData fco = new CIM_RelatedStatisticalData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RELATEDSTATS_CIM_STATISTICALDATA.NAME);
        if (property != null) {
            property = setPropertyValue_RelatedStats_CIM_StatisticalData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RELATEDSTATS_CIM_STATISTICALDATA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RelatedStats
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_RelatedStats_CIM_StatisticalData(
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
        if (!(object instanceof CIM_RelatedStatisticalData)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_RelatedStatisticalData.CIM_CLASS_NAME;
    }

}