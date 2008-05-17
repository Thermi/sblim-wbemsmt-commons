/** 
 * CIM_ThresholdIndication.java
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
 * Description: A subclass of CIM_AlertIndications carrying additional threshold information related to the notification. This subclass is used when one of the ProbableCauses is set to 53, "Threshold Crossed".
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ThresholdIndication extends CIM_AlertIndication {

    public final static String CIM_CLASS_NAME = "CIM_ThresholdIndication";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ObservedValue
     * A string holding the current reading value that exceeds the threshold. This is modeled as a string for universal mapping, similar to the CIM_Sensor properties in the Device Model.
     */
    public static class PROPERTY_OBSERVEDVALUE {
        /**
         * name of the property ObservedValue
         */
        public final static String NAME = "ObservedValue";

    }

    /**
     * Constants of property ThresholdIdentifier
     * A string describing the threshold or naming the property that represents the threshold, if modeled in the CIM hierarchy. In the latter case, the value should be written as <schema name>_ <class name>.<property name>.
     */
    public static class PROPERTY_THRESHOLDIDENTIFIER {
        /**
         * name of the property ThresholdIdentifier
         */
        public final static String NAME = "ThresholdIdentifier";

    }

    /**
     * Constants of property ThresholdValue
     * A string holding the current value of the threshold. This is modeled as a string for universal mapping, similar to the CIM_Sensor properties in the Device Model.
     */
    public static class PROPERTY_THRESHOLDVALUE {
        /**
         * name of the property ThresholdValue
         */
        public final static String NAME = "ThresholdValue";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_AlertIndication.getPackages();

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
     *   A subclass of CIM_AlertIndications carrying additional threshold information related to the notification. This subclass is used when one of the ProbableCauses is set to 53, "Threshold Crossed".
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ThresholdIndication(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A subclass of CIM_AlertIndications carrying additional threshold information related to the notification. This subclass is used when one of the ProbableCauses is set to 53, "Threshold Crossed".
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ThresholdIndication(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ThresholdIndication() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ObservedValue", new CIMProperty("ObservedValue",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ThresholdIdentifier", new CIMProperty("ThresholdIdentifier",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ThresholdValue", new CIMProperty("ThresholdValue",
                CIMDataType.STRING_T, null));

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
     * Get the property ObservedValue
     *     * <br>
     * A string holding the current reading value that exceeds the threshold. This is modeled as a string for universal mapping, similar to the CIM_Sensor properties in the Device Model.
     *     */

    public String get_ObservedValue() {
        CIMProperty currentProperty = getProperty(PROPERTY_OBSERVEDVALUE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OBSERVEDVALUE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ObservedValue
     * <br>
     * A string holding the current reading value that exceeds the threshold. This is modeled as a string for universal mapping, similar to the CIM_Sensor properties in the Device Model.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ObservedValue(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OBSERVEDVALUE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ObservedValue(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OBSERVEDVALUE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ObservedValue by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ObservedValue(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_ThresholdIndication fco = new CIM_ThresholdIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OBSERVEDVALUE.NAME);
        if (property != null) {
            property = setPropertyValue_ObservedValue(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OBSERVEDVALUE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ObservedValue
     * <br>
     * A string holding the current reading value that exceeds the threshold. This is modeled as a string for universal mapping, similar to the CIM_Sensor properties in the Device Model.
     */

    private static CIMProperty setPropertyValue_ObservedValue(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ThresholdIdentifier
     *     * <br>
     * A string describing the threshold or naming the property that represents the threshold, if modeled in the CIM hierarchy. In the latter case, the value should be written as <schema name>_ <class name>.<property name>.
     *     */

    public String get_ThresholdIdentifier() {
        CIMProperty currentProperty = getProperty(PROPERTY_THRESHOLDIDENTIFIER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_THRESHOLDIDENTIFIER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ThresholdIdentifier
     * <br>
     * A string describing the threshold or naming the property that represents the threshold, if modeled in the CIM hierarchy. In the latter case, the value should be written as <schema name>_ <class name>.<property name>.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ThresholdIdentifier(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_THRESHOLDIDENTIFIER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ThresholdIdentifier(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_THRESHOLDIDENTIFIER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ThresholdIdentifier by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ThresholdIdentifier(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_ThresholdIndication fco = new CIM_ThresholdIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_THRESHOLDIDENTIFIER.NAME);
        if (property != null) {
            property = setPropertyValue_ThresholdIdentifier(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_THRESHOLDIDENTIFIER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ThresholdIdentifier
     * <br>
     * A string describing the threshold or naming the property that represents the threshold, if modeled in the CIM hierarchy. In the latter case, the value should be written as <schema name>_ <class name>.<property name>.
     */

    private static CIMProperty setPropertyValue_ThresholdIdentifier(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ThresholdValue
     *     * <br>
     * A string holding the current value of the threshold. This is modeled as a string for universal mapping, similar to the CIM_Sensor properties in the Device Model.
     *     */

    public String get_ThresholdValue() {
        CIMProperty currentProperty = getProperty(PROPERTY_THRESHOLDVALUE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_THRESHOLDVALUE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ThresholdValue
     * <br>
     * A string holding the current value of the threshold. This is modeled as a string for universal mapping, similar to the CIM_Sensor properties in the Device Model.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ThresholdValue(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_THRESHOLDVALUE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ThresholdValue(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_THRESHOLDVALUE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ThresholdValue by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ThresholdValue(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_ThresholdIndication fco = new CIM_ThresholdIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_THRESHOLDVALUE.NAME);
        if (property != null) {
            property = setPropertyValue_ThresholdValue(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_THRESHOLDVALUE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ThresholdValue
     * <br>
     * A string holding the current value of the threshold. This is modeled as a string for universal mapping, similar to the CIM_Sensor properties in the Device Model.
     */

    private static CIMProperty setPropertyValue_ThresholdValue(CIMProperty currentProperty,
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
        return CIM_ThresholdIndication.CIM_CLASS_NAME;
    }

}