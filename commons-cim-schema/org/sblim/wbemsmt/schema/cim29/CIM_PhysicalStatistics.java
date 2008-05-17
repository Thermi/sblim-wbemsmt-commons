/** 
 * CIM_PhysicalStatistics.java
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
 * Description: PhysicalStatistics relates the PhysicalStatisticalInformation class to the PhysicalElement to which it applies.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_PhysicalStatistics extends CIM_Statistics {

    public final static String CIM_CLASS_NAME = "CIM_PhysicalStatistics";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Stats
     * 
     */
    public static class PROPERTY_STATS_CIM_PHYSICALSTATISTICALINFORMATION {
        /**
         * name of the property Stats
         */
        public final static String NAME = "Stats";

    }

    /**
     * Constants of property Element
     * 
     */
    public static class PROPERTY_ELEMENT_CIM_PHYSICALELEMENT {
        /**
         * name of the property Element
         */
        public final static String NAME = "Element";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Statistics.getPackages();

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
     *   PhysicalStatistics relates the PhysicalStatisticalInformation class to the PhysicalElement to which it applies.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_PhysicalStatistics(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   PhysicalStatistics relates the PhysicalStatisticalInformation class to the PhysicalElement to which it applies.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_PhysicalStatistics(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_PhysicalStatistics() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Stats", new CIMProperty("Stats", new CIMDataType(
                CIM_PhysicalStatisticalInformation.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Element", new CIMProperty("Element", new CIMDataType(
                CIM_PhysicalElement.CIM_CLASS_NAME), null));

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
     * Get the property Stats
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_PhysicalStatisticalInformation get_Stats_CIM_PhysicalStatisticalInformation(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_STATS_CIM_PHYSICALSTATISTICALINFORMATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STATS_CIM_PHYSICALSTATISTICALINFORMATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_PhysicalStatisticalInformationHelper.getInstance(client,
                (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Stats
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Stats_CIM_PhysicalStatisticalInformation(
            CIM_PhysicalStatisticalInformation newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STATS_CIM_PHYSICALSTATISTICALINFORMATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Stats_CIM_PhysicalStatisticalInformation(
                    currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STATS_CIM_PHYSICALSTATISTICALINFORMATION.NAME
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

    public static CIMProperty create_Stats_CIM_PhysicalStatisticalInformation(WBEMClient client,
            String namespace, CIM_PhysicalStatisticalInformation newValue) throws WbemsmtException {
        CIM_PhysicalStatistics fco = new CIM_PhysicalStatistics(client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_STATS_CIM_PHYSICALSTATISTICALINFORMATION.NAME);
        if (property != null) {
            property = setPropertyValue_Stats_CIM_PhysicalStatisticalInformation(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STATS_CIM_PHYSICALSTATISTICALINFORMATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Stats
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Stats_CIM_PhysicalStatisticalInformation(
            CIMProperty currentProperty, CIM_PhysicalStatisticalInformation newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Element
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_PhysicalElement get_Element_CIM_PhysicalElement(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENT_CIM_PHYSICALELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ELEMENT_CIM_PHYSICALELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_PhysicalElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Element
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Element_CIM_PhysicalElement(CIM_PhysicalElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENT_CIM_PHYSICALELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Element_CIM_PhysicalElement(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENT_CIM_PHYSICALELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Element by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Element_CIM_PhysicalElement(WBEMClient client,
            String namespace, CIM_PhysicalElement newValue) throws WbemsmtException {
        CIM_PhysicalStatistics fco = new CIM_PhysicalStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELEMENT_CIM_PHYSICALELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_Element_CIM_PhysicalElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENT_CIM_PHYSICALELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Element
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Element_CIM_PhysicalElement(
            CIMProperty currentProperty, CIM_PhysicalElement newValue) {
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
        return CIM_PhysicalStatistics.CIM_CLASS_NAME;
    }

}