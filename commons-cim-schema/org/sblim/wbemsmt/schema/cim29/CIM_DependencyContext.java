/** 
 * CIM_DependencyContext.java
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
 * Description: This relationship associates a Dependency with one or more Configuration objects. For example, a ComputerSystem's dependencies could change based on the site/network to which the System is attached.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_DependencyContext extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_DependencyContext";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Context
     * 
     */
    public static class PROPERTY_CONTEXT_CIM_CONFIGURATION {
        /**
         * name of the property Context
         */
        public final static String NAME = "Context";

    }

    /**
     * Constants of property Dependency
     * 
     */
    public static class PROPERTY_DEPENDENCY_CIM_DEPENDENCY {
        /**
         * name of the property Dependency
         */
        public final static String NAME = "Dependency";

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
     *   This relationship associates a Dependency with one or more Configuration objects. For example, a ComputerSystem's dependencies could change based on the site/network to which the System is attached.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_DependencyContext(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This relationship associates a Dependency with one or more Configuration objects. For example, a ComputerSystem's dependencies could change based on the site/network to which the System is attached.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_DependencyContext(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_DependencyContext() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Context", new CIMProperty("Context", new CIMDataType(
                CIM_Configuration.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependency", new CIMProperty("Dependency", new CIMDataType(
                CIM_Dependency.CIM_CLASS_NAME), null));

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
     * Get the property Context
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Configuration get_Context_CIM_Configuration(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_CONTEXT_CIM_CONFIGURATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONTEXT_CIM_CONFIGURATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ConfigurationHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Context
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Context_CIM_Configuration(CIM_Configuration newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONTEXT_CIM_CONFIGURATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Context_CIM_Configuration(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONTEXT_CIM_CONFIGURATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Context by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Context_CIM_Configuration(WBEMClient client, String namespace,
            CIM_Configuration newValue) throws WbemsmtException {
        CIM_DependencyContext fco = new CIM_DependencyContext(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONTEXT_CIM_CONFIGURATION.NAME);
        if (property != null) {
            property = setPropertyValue_Context_CIM_Configuration(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONTEXT_CIM_CONFIGURATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Context
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Context_CIM_Configuration(
            CIMProperty currentProperty, CIM_Configuration newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Dependency
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Dependency get_Dependency_CIM_Dependency(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENCY_CIM_DEPENDENCY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENCY_CIM_DEPENDENCY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_DependencyHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Dependency
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependency_CIM_Dependency(CIM_Dependency newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENCY_CIM_DEPENDENCY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Dependency_CIM_Dependency(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENCY_CIM_DEPENDENCY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Dependency by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Dependency_CIM_Dependency(WBEMClient client, String namespace,
            CIM_Dependency newValue) throws WbemsmtException {
        CIM_DependencyContext fco = new CIM_DependencyContext(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENCY_CIM_DEPENDENCY.NAME);
        if (property != null) {
            property = setPropertyValue_Dependency_CIM_Dependency(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENCY_CIM_DEPENDENCY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependency
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependency_CIM_Dependency(
            CIMProperty currentProperty, CIM_Dependency newValue) {
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
        if (!(object instanceof CIM_DependencyContext)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_DependencyContext.CIM_CLASS_NAME;
    }

}