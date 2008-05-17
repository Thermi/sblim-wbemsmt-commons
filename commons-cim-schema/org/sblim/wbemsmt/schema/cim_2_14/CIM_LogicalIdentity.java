/** 
 * CIM_LogicalIdentity.java
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
 * Description: CIM_LogicalIdentity is an abstract and generic association, indicating that two ManagedElements represent different aspects of the same underlying entity. This relationship conveys what could be defined with multiple inheritance. In most scenarios, the Identity relationship is determined by the equivalence of Keys or some other identifying properties of the related Elements. 
 * 
 * This relationship is reasonable in several scenarios. For example, it could be used to represent that a LogicalDevice is both a 'bus' entity and a 'functional' entity. A Device could be both a USB (bus) and a Keyboard (functional) entity.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_LogicalIdentity extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_LogicalIdentity";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property SystemElement
     * 
     */
    public static class PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT {
        /**
         * name of the property SystemElement
         */
        public final static String NAME = "SystemElement";

    }

    /**
     * Constants of property SameElement
     * 
     */
    public static class PROPERTY_SAMEELEMENT_CIM_MANAGEDELEMENT {
        /**
         * name of the property SameElement
         */
        public final static String NAME = "SameElement";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim_2_14");

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   CIM_LogicalIdentity is an abstract and generic association, indicating that two ManagedElements represent different aspects of the same underlying entity. This relationship conveys what could be defined with multiple inheritance. In most scenarios, the Identity relationship is determined by the equivalence of Keys or some other identifying properties of the related Elements. 
     * 
     * This relationship is reasonable in several scenarios. For example, it could be used to represent that a LogicalDevice is both a 'bus' entity and a 'functional' entity. A Device could be both a USB (bus) and a Keyboard (functional) entity.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_LogicalIdentity(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   CIM_LogicalIdentity is an abstract and generic association, indicating that two ManagedElements represent different aspects of the same underlying entity. This relationship conveys what could be defined with multiple inheritance. In most scenarios, the Identity relationship is determined by the equivalence of Keys or some other identifying properties of the related Elements. 
     * 
     * This relationship is reasonable in several scenarios. For example, it could be used to represent that a LogicalDevice is both a 'bus' entity and a 'functional' entity. A Device could be both a USB (bus) and a Keyboard (functional) entity.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_LogicalIdentity(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_LogicalIdentity() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("SystemElement", new CIMProperty("SystemElement", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), null));
        propertiesToCheck.put("SameElement", new CIMProperty("SameElement", new CIMDataType(
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
     * Get the property SystemElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_SystemElement_CIM_ManagedElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property SystemElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SystemElement_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SystemElement_CIM_ManagedElement(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SystemElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SystemElement_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_LogicalIdentity fco = new CIM_LogicalIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_SystemElement_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SystemElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_SystemElement_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SameElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_SameElement_CIM_ManagedElement(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SAMEELEMENT_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SAMEELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property SameElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SameElement_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SAMEELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SameElement_CIM_ManagedElement(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SAMEELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SameElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SameElement_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_LogicalIdentity fco = new CIM_LogicalIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SAMEELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_SameElement_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SAMEELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SameElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_SameElement_CIM_ManagedElement(
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
        if (!(object instanceof CIM_LogicalIdentity)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_LogicalIdentity.CIM_CLASS_NAME;
    }

}