/** 
 * CIM_StatisticalSetting.java
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
 * Description: CIM_StatisticalSetting is the class for setting the collection criteria of statistical data and/or metrics applicable to one or more ManagedElements.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_StatisticalSetting extends CIM_SettingData {

    public final static String CIM_CLASS_NAME = "CIM_StatisticalSetting";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property EndStatisticTime
     * The time, relative to managed element where the statistic is to be collected, when the measurement is to end.
     */
    public static class PROPERTY_ENDSTATISTICTIME {
        /**
         * name of the property EndStatisticTime
         */
        public final static String NAME = "EndStatisticTime";

    }

    /**
     * Constants of property SampleInterval
     * Some statistics are sampled at consistent time intervals. This property when set indicates the desired minimum time that new statistics should be polled or calculated.
     */
    public static class PROPERTY_SAMPLEINTERVAL {
        /**
         * name of the property SampleInterval
         */
        public final static String NAME = "SampleInterval";

    }

    /**
     * Constants of property StartStatisticTime
     * The time, relative to managed element where the statistic is to be collected, when the first measurement is to be taken.
     */
    public static class PROPERTY_STARTSTATISTICTIME {
        /**
         * name of the property StartStatisticTime
         */
        public final static String NAME = "StartStatisticTime";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_SettingData.getPackages();

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
     *   CIM_StatisticalSetting is the class for setting the collection criteria of statistical data and/or metrics applicable to one or more ManagedElements.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_StatisticalSetting(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_StatisticalSetting is the class for setting the collection criteria of statistical data and/or metrics applicable to one or more ManagedElements.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_StatisticalSetting(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_StatisticalSetting() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("EndStatisticTime", new CIMProperty("EndStatisticTime",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("SampleInterval", new CIMProperty("SampleInterval",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("StartStatisticTime", new CIMProperty("StartStatisticTime",
                CIMDataType.DATETIME_T, null));

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
     * Get the property EndStatisticTime
     *     * <br>
     * The time, relative to managed element where the statistic is to be collected, when the measurement is to end.
     *     */

    public javax.cim.CIMDateTime get_EndStatisticTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENDSTATISTICTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENDSTATISTICTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property EndStatisticTime
     * <br>
     * The time, relative to managed element where the statistic is to be collected, when the measurement is to end.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EndStatisticTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENDSTATISTICTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EndStatisticTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENDSTATISTICTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EndStatisticTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EndStatisticTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_StatisticalSetting fco = new CIM_StatisticalSetting(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENDSTATISTICTIME.NAME);
        if (property != null) {
            property = setPropertyValue_EndStatisticTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENDSTATISTICTIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EndStatisticTime
     * <br>
     * The time, relative to managed element where the statistic is to be collected, when the measurement is to end.
     */

    private static CIMProperty setPropertyValue_EndStatisticTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SampleInterval
     *     * <br>
     * Some statistics are sampled at consistent time intervals. This property when set indicates the desired minimum time that new statistics should be polled or calculated.
     *     */

    public javax.cim.CIMDateTime get_SampleInterval() {
        CIMProperty currentProperty = getProperty(PROPERTY_SAMPLEINTERVAL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SAMPLEINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property SampleInterval
     * <br>
     * Some statistics are sampled at consistent time intervals. This property when set indicates the desired minimum time that new statistics should be polled or calculated.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SampleInterval(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SAMPLEINTERVAL.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SampleInterval(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SAMPLEINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SampleInterval by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SampleInterval(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_StatisticalSetting fco = new CIM_StatisticalSetting(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SAMPLEINTERVAL.NAME);
        if (property != null) {
            property = setPropertyValue_SampleInterval(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SAMPLEINTERVAL.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SampleInterval
     * <br>
     * Some statistics are sampled at consistent time intervals. This property when set indicates the desired minimum time that new statistics should be polled or calculated.
     */

    private static CIMProperty setPropertyValue_SampleInterval(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property StartStatisticTime
     *     * <br>
     * The time, relative to managed element where the statistic is to be collected, when the first measurement is to be taken.
     *     */

    public javax.cim.CIMDateTime get_StartStatisticTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTSTATISTICTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STARTSTATISTICTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property StartStatisticTime
     * <br>
     * The time, relative to managed element where the statistic is to be collected, when the first measurement is to be taken.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_StartStatisticTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTSTATISTICTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_StartStatisticTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STARTSTATISTICTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property StartStatisticTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StartStatisticTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_StatisticalSetting fco = new CIM_StatisticalSetting(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STARTSTATISTICTIME.NAME);
        if (property != null) {
            property = setPropertyValue_StartStatisticTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STARTSTATISTICTIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property StartStatisticTime
     * <br>
     * The time, relative to managed element where the statistic is to be collected, when the first measurement is to be taken.
     */

    private static CIMProperty setPropertyValue_StartStatisticTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
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
        return CIM_StatisticalSetting.CIM_CLASS_NAME;
    }

}