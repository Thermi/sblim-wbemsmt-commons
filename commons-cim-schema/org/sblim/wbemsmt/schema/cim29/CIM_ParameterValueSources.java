/** 
 * CIM_ParameterValueSources.java
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
 * Description: ParameterValueSources represents the association between a MethodParameters instance and the ManagedElement instances which contain properties to be used to create values for the MethodParameters properties.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ParameterValueSources extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_ParameterValueSources";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Parameters
     * 
     */
    public static class PROPERTY_PARAMETERS_CIM_METHODPARAMETERS {
        /**
         * name of the property Parameters
         */
        public final static String NAME = "Parameters";

    }

    /**
     * Constants of property ValueSource
     * 
     */
    public static class PROPERTY_VALUESOURCE_CIM_MANAGEDELEMENT {
        /**
         * name of the property ValueSource
         */
        public final static String NAME = "ValueSource";

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
     *   ParameterValueSources represents the association between a MethodParameters instance and the ManagedElement instances which contain properties to be used to create values for the MethodParameters properties.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ParameterValueSources(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   ParameterValueSources represents the association between a MethodParameters instance and the ManagedElement instances which contain properties to be used to create values for the MethodParameters properties.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ParameterValueSources(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ParameterValueSources() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Parameters", new CIMProperty("Parameters", new CIMDataType(
                CIM_MethodParameters.CIM_CLASS_NAME), null));
        propertiesToCheck.put("ValueSource", new CIMProperty("ValueSource", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), null));

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
     * Get the property Parameters
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_MethodParameters get_Parameters_CIM_MethodParameters(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PARAMETERS_CIM_METHODPARAMETERS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARAMETERS_CIM_METHODPARAMETERS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_MethodParametersHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Parameters
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Parameters_CIM_MethodParameters(CIM_MethodParameters newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARAMETERS_CIM_METHODPARAMETERS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Parameters_CIM_MethodParameters(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARAMETERS_CIM_METHODPARAMETERS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Parameters by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Parameters_CIM_MethodParameters(WBEMClient client,
            String namespace, CIM_MethodParameters newValue) throws WbemsmtException {
        CIM_ParameterValueSources fco = new CIM_ParameterValueSources(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARAMETERS_CIM_METHODPARAMETERS.NAME);
        if (property != null) {
            property = setPropertyValue_Parameters_CIM_MethodParameters(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARAMETERS_CIM_METHODPARAMETERS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Parameters
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Parameters_CIM_MethodParameters(
            CIMProperty currentProperty, CIM_MethodParameters newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ValueSource
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_ValueSource_CIM_ManagedElement(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_VALUESOURCE_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VALUESOURCE_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property ValueSource
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ValueSource_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VALUESOURCE_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ValueSource_CIM_ManagedElement(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VALUESOURCE_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ValueSource by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ValueSource_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_ParameterValueSources fco = new CIM_ParameterValueSources(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VALUESOURCE_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_ValueSource_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VALUESOURCE_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ValueSource
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ValueSource_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
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
        if (!(object instanceof CIM_ParameterValueSources)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ParameterValueSources.CIM_CLASS_NAME;
    }

}