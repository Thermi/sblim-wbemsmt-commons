/** 
 * CIM_InstMethodCall.java
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
 * Description: CIM_InstMethodCall notifies when an instance's method is invoked.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_InstMethodCall extends CIM_InstIndication {

    public final static String CIM_CLASS_NAME = "CIM_InstMethodCall";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property MethodName
     * The name of the method invoked.
     */
    public static class PROPERTY_METHODNAME {
        /**
         * name of the property MethodName
         */
        public final static String NAME = "MethodName";

    }

    /**
     * Constants of property MethodParameters
     * The parameters of the method, formatted as an EmbeddedObject (with a predefined class name of "__MethodParameters".
     */
    public static class PROPERTY_METHODPARAMETERS {
        /**
         * name of the property MethodParameters
         */
        public final static String NAME = "MethodParameters";

    }

    /**
     * Constants of property PreCall
     * Boolean indicating whether the Indication is sent before the method begins executing (TRUE) or when the method completes (FALSE). When TRUE, the inherited property SourceInstance contains the value of the instance (the properties defined by the Filter's Query clause), before execution of the method. When PreCall is FALSE, SourceInstance embeds the instance as it appears after the completion of the method.
     */
    public static class PROPERTY_PRECALL {
        /**
         * name of the property PreCall
         */
        public final static String NAME = "PreCall";

    }

    /**
     * Constants of property ReturnValue
     * ReturnValue's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method return value (since the method has not yet executed). When PreCall is FALSE, ReturnValue contains a string representation of the method's return value.
     */
    public static class PROPERTY_RETURNVALUE {
        /**
         * name of the property ReturnValue
         */
        public final static String NAME = "ReturnValue";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim_2_14");
        String[] parentClassPackageList = CIM_InstIndication.getPackages();

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
     *   CIM_InstMethodCall notifies when an instance's method is invoked.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_InstMethodCall(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_InstMethodCall notifies when an instance's method is invoked.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_InstMethodCall(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_InstMethodCall() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("MethodName", new CIMProperty("MethodName", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("MethodParameters", new CIMProperty("MethodParameters",
                CIMDataType.CLASS_T, null));
        propertiesToCheck.put("PreCall", new CIMProperty("PreCall", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("ReturnValue", new CIMProperty("ReturnValue", CIMDataType.STRING_T,
                null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {
            set_MethodParameters(null);

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property MethodName
     *     * <br>
     * The name of the method invoked.
     *     */

    public String get_MethodName() {
        CIMProperty currentProperty = getProperty(PROPERTY_METHODNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_METHODNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property MethodName
     * <br>
     * The name of the method invoked.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MethodName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_METHODNAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MethodName(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_METHODNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MethodName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MethodName(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_InstMethodCall fco = new CIM_InstMethodCall(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_METHODNAME.NAME);
        if (property != null) {
            property = setPropertyValue_MethodName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_METHODNAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MethodName
     * <br>
     * The name of the method invoked.
     */

    private static CIMProperty setPropertyValue_MethodName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MethodParameters
     *     * <br>
     * The parameters of the method, formatted as an EmbeddedObject (with a predefined class name of "__MethodParameters".
     *     * 
     * @return a org.sblim.wbemsmt.bl.fco.embeddedobject.WbemsmtEmbeddedObject
     *     */

    public org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject get_MethodParameters(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_METHODPARAMETERS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_METHODPARAMETERS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        Object result = currentProperty.getValue();
        if (result == null) {
            return null;
        }

        if (result instanceof CIMInstance) {
            return new org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject((CIMInstance) result);
        }
        if (result instanceof CIMClass) {
            return new org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject((CIMClass) result);
        }
        throw new WbemsmtException(WbemsmtException.ERR_CIM_TYPE_MISMATCH, "The property "
                + PROPERTY_METHODPARAMETERS.NAME + " is no CIMInstance or CIMClass");

    }

    /**
     * Set the property MethodParameters
     * <br>
     * The parameters of the method, formatted as an EmbeddedObject (with a predefined class name of "__MethodParameters".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MethodParameters(org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_METHODPARAMETERS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MethodParameters(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_METHODPARAMETERS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MethodParameters by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MethodParameters(WBEMClient client, String namespace,
            org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) throws WbemsmtException {
        CIM_InstMethodCall fco = new CIM_InstMethodCall(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_METHODPARAMETERS.NAME);
        if (property != null) {
            property = setPropertyValue_MethodParameters(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_METHODPARAMETERS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MethodParameters
     * <br>
     * The parameters of the method, formatted as an EmbeddedObject (with a predefined class name of "__MethodParameters".
     */

    private static CIMProperty setPropertyValue_MethodParameters(CIMProperty currentProperty,
            org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getValue() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), CIMDataType.CLASS_T,
                setThis, currentProperty.isKey(), currentProperty.isPropagated(), currentProperty
                        .getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PreCall
     *     * <br>
     * Boolean indicating whether the Indication is sent before the method begins executing (TRUE) or when the method completes (FALSE). When TRUE, the inherited property SourceInstance contains the value of the instance (the properties defined by the Filter's Query clause), before execution of the method. When PreCall is FALSE, SourceInstance embeds the instance as it appears after the completion of the method.
     *     */

    public Boolean get_PreCall() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRECALL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRECALL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property PreCall
     * <br>
     * Boolean indicating whether the Indication is sent before the method begins executing (TRUE) or when the method completes (FALSE). When TRUE, the inherited property SourceInstance contains the value of the instance (the properties defined by the Filter's Query clause), before execution of the method. When PreCall is FALSE, SourceInstance embeds the instance as it appears after the completion of the method.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PreCall(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRECALL.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PreCall(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRECALL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PreCall by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PreCall(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_InstMethodCall fco = new CIM_InstMethodCall(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRECALL.NAME);
        if (property != null) {
            property = setPropertyValue_PreCall(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRECALL.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PreCall
     * <br>
     * Boolean indicating whether the Indication is sent before the method begins executing (TRUE) or when the method completes (FALSE). When TRUE, the inherited property SourceInstance contains the value of the instance (the properties defined by the Filter's Query clause), before execution of the method. When PreCall is FALSE, SourceInstance embeds the instance as it appears after the completion of the method.
     */

    private static CIMProperty setPropertyValue_PreCall(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReturnValue
     *     * <br>
     * ReturnValue's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method return value (since the method has not yet executed). When PreCall is FALSE, ReturnValue contains a string representation of the method's return value.
     *     */

    public String get_ReturnValue() {
        CIMProperty currentProperty = getProperty(PROPERTY_RETURNVALUE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RETURNVALUE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ReturnValue
     * <br>
     * ReturnValue's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method return value (since the method has not yet executed). When PreCall is FALSE, ReturnValue contains a string representation of the method's return value.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReturnValue(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RETURNVALUE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ReturnValue(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RETURNVALUE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReturnValue by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReturnValue(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_InstMethodCall fco = new CIM_InstMethodCall(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RETURNVALUE.NAME);
        if (property != null) {
            property = setPropertyValue_ReturnValue(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RETURNVALUE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReturnValue
     * <br>
     * ReturnValue's data is dependent on the PreCall property. When PreCall is TRUE, this property is NULL describing that there is no method return value (since the method has not yet executed). When PreCall is FALSE, ReturnValue contains a string representation of the method's return value.
     */

    private static CIMProperty setPropertyValue_ReturnValue(CIMProperty currentProperty,
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
        return CIM_InstMethodCall.CIM_CLASS_NAME;
    }

}