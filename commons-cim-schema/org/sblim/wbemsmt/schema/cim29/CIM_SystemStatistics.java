/** 
 * CIM_SystemStatistics.java
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
 * Description: SystemStatistics relates the SystemStatisticalInformation class to the System to which it applies.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_SystemStatistics extends CIM_Statistics {

    public final static String CIM_CLASS_NAME = "CIM_SystemStatistics";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Stats
     * 
     */
    public static class PROPERTY_STATS_CIM_SYSTEMSTATISTICALINFORMATION {
        /**
         * name of the property Stats
         */
        public final static String NAME = "Stats";

    }

    /**
     * Constants of property Element
     * 
     */
    public static class PROPERTY_ELEMENT_CIM_SYSTEM {
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
     *   SystemStatistics relates the SystemStatisticalInformation class to the System to which it applies.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SystemStatistics(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   SystemStatistics relates the SystemStatisticalInformation class to the System to which it applies.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SystemStatistics(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SystemStatistics() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Stats", new CIMProperty("Stats", new CIMDataType(
                CIM_SystemStatisticalInformation.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Element", new CIMProperty("Element", new CIMDataType(
                CIM_System.CIM_CLASS_NAME), null));

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

    public CIM_SystemStatisticalInformation get_Stats_CIM_SystemStatisticalInformation(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_STATS_CIM_SYSTEMSTATISTICALINFORMATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STATS_CIM_SYSTEMSTATISTICALINFORMATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SystemStatisticalInformationHelper.getInstance(client,
                (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Stats
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Stats_CIM_SystemStatisticalInformation(
            CIM_SystemStatisticalInformation newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STATS_CIM_SYSTEMSTATISTICALINFORMATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Stats_CIM_SystemStatisticalInformation(
                    currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STATS_CIM_SYSTEMSTATISTICALINFORMATION.NAME
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

    public static CIMProperty create_Stats_CIM_SystemStatisticalInformation(WBEMClient client,
            String namespace, CIM_SystemStatisticalInformation newValue) throws WbemsmtException {
        CIM_SystemStatistics fco = new CIM_SystemStatistics(client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_STATS_CIM_SYSTEMSTATISTICALINFORMATION.NAME);
        if (property != null) {
            property = setPropertyValue_Stats_CIM_SystemStatisticalInformation(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STATS_CIM_SYSTEMSTATISTICALINFORMATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Stats
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Stats_CIM_SystemStatisticalInformation(
            CIMProperty currentProperty, CIM_SystemStatisticalInformation newValue) {
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

    public CIM_System get_Element_CIM_System(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENT_CIM_SYSTEM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ELEMENT_CIM_SYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SystemHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Element
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Element_CIM_System(CIM_System newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENT_CIM_SYSTEM.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Element_CIM_System(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENT_CIM_SYSTEM.NAME
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

    public static CIMProperty create_Element_CIM_System(WBEMClient client, String namespace,
            CIM_System newValue) throws WbemsmtException {
        CIM_SystemStatistics fco = new CIM_SystemStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELEMENT_CIM_SYSTEM.NAME);
        if (property != null) {
            property = setPropertyValue_Element_CIM_System(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENT_CIM_SYSTEM.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Element
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Element_CIM_System(CIMProperty currentProperty,
            CIM_System newValue) {
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
        return CIM_SystemStatistics.CIM_CLASS_NAME;
    }

}