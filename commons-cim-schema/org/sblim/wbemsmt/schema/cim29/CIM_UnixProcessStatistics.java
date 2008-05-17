/** 
 * CIM_UnixProcessStatistics.java
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
 * Description: CIM_UnixProcessStatistics is an association that relates a CIM_UnixProcess to its StatisticalInformation.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_UnixProcessStatistics extends CIM_Statistics {

    public final static String CIM_CLASS_NAME = "CIM_UnixProcessStatistics";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Element
     * 
     */
    public static class PROPERTY_ELEMENT_CIM_UNIXPROCESS {
        /**
         * name of the property Element
         */
        public final static String NAME = "Element";

    }

    /**
     * Constants of property Stats
     * 
     */
    public static class PROPERTY_STATS_CIM_UNIXPROCESSSTATISTICALINFORMATION {
        /**
         * name of the property Stats
         */
        public final static String NAME = "Stats";

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
     *   CIM_UnixProcessStatistics is an association that relates a CIM_UnixProcess to its StatisticalInformation.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_UnixProcessStatistics(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_UnixProcessStatistics is an association that relates a CIM_UnixProcess to its StatisticalInformation.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_UnixProcessStatistics(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_UnixProcessStatistics() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Element", new CIMProperty("Element", new CIMDataType(
                CIM_UnixProcess.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Stats", new CIMProperty("Stats", new CIMDataType(
                CIM_UnixProcessStatisticalInformation.CIM_CLASS_NAME), null));

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
     * Get the property Element
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_UnixProcess get_Element_CIM_UnixProcess(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENT_CIM_UNIXPROCESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ELEMENT_CIM_UNIXPROCESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_UnixProcessHelper
                .getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Element
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Element_CIM_UnixProcess(CIM_UnixProcess newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENT_CIM_UNIXPROCESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Element_CIM_UnixProcess(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENT_CIM_UNIXPROCESS.NAME
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

    public static CIMProperty create_Element_CIM_UnixProcess(WBEMClient client, String namespace,
            CIM_UnixProcess newValue) throws WbemsmtException {
        CIM_UnixProcessStatistics fco = new CIM_UnixProcessStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELEMENT_CIM_UNIXPROCESS.NAME);
        if (property != null) {
            property = setPropertyValue_Element_CIM_UnixProcess(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENT_CIM_UNIXPROCESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Element
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Element_CIM_UnixProcess(
            CIMProperty currentProperty, CIM_UnixProcess newValue) {
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

    public CIM_UnixProcessStatisticalInformation get_Stats_CIM_UnixProcessStatisticalInformation(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_STATS_CIM_UNIXPROCESSSTATISTICALINFORMATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STATS_CIM_UNIXPROCESSSTATISTICALINFORMATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_UnixProcessStatisticalInformationHelper.getInstance(client,
                (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Stats
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Stats_CIM_UnixProcessStatisticalInformation(
            CIM_UnixProcessStatisticalInformation newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STATS_CIM_UNIXPROCESSSTATISTICALINFORMATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Stats_CIM_UnixProcessStatisticalInformation(
                    currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STATS_CIM_UNIXPROCESSSTATISTICALINFORMATION.NAME
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

    public static CIMProperty create_Stats_CIM_UnixProcessStatisticalInformation(WBEMClient client,
            String namespace, CIM_UnixProcessStatisticalInformation newValue)
            throws WbemsmtException {
        CIM_UnixProcessStatistics fco = new CIM_UnixProcessStatistics(client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_STATS_CIM_UNIXPROCESSSTATISTICALINFORMATION.NAME);
        if (property != null) {
            property = setPropertyValue_Stats_CIM_UnixProcessStatisticalInformation(property,
                    newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STATS_CIM_UNIXPROCESSSTATISTICALINFORMATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Stats
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Stats_CIM_UnixProcessStatisticalInformation(
            CIMProperty currentProperty, CIM_UnixProcessStatisticalInformation newValue) {
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
        return CIM_UnixProcessStatistics.CIM_CLASS_NAME;
    }

}