/** 
 * CIM_ClassIndication.java
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
 * Description: CIM_ClassIndication is an abstract superclass describing changes in the definition of the schema. Subclasses represent specific types of change notifications, such as class creation, deletion and modification.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ClassIndication extends CIM_Indication {

    public final static String CIM_CLASS_NAME = "CIM_ClassIndication";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ClassDefinition
     * The current definition of the class that is created, changed or deleted in the schema. In the case of a CIM_ClassDeletion Indication, the definition for the class just prior to deletion should be placed in this property.
     */
    public static class PROPERTY_CLASSDEFINITION {
        /**
         * name of the property ClassDefinition
         */
        public final static String NAME = "ClassDefinition";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Indication.getPackages();

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
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   CIM_ClassIndication is an abstract superclass describing changes in the definition of the schema. Subclasses represent specific types of change notifications, such as class creation, deletion and modification.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_ClassIndication(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   CIM_ClassIndication is an abstract superclass describing changes in the definition of the schema. Subclasses represent specific types of change notifications, such as class creation, deletion and modification.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_ClassIndication(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ClassIndication() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ClassDefinition", new CIMProperty("ClassDefinition",
                CIMDataType.CLASS_T, null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {
            set_ClassDefinition(null);

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property ClassDefinition
     *     * <br>
     * The current definition of the class that is created, changed or deleted in the schema. In the case of a CIM_ClassDeletion Indication, the definition for the class just prior to deletion should be placed in this property.
     *     * 
     * @return a org.sblim.wbemsmt.bl.fco.embeddedobject.WbemsmtEmbeddedObject
     *     */

    public org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject get_ClassDefinition(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASSDEFINITION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASSDEFINITION.NAME
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
                + PROPERTY_CLASSDEFINITION.NAME + " is no CIMInstance or CIMClass");

    }

    /**
     * Set the property ClassDefinition
     * <br>
     * The current definition of the class that is created, changed or deleted in the schema. In the case of a CIM_ClassDeletion Indication, the definition for the class just prior to deletion should be placed in this property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ClassDefinition(org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASSDEFINITION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ClassDefinition(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASSDEFINITION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ClassDefinition by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ClassDefinition(WBEMClient client, String namespace,
            org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) throws WbemsmtException {
        CIM_ClassIndication fco = new CIM_ClassIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASSDEFINITION.NAME);
        if (property != null) {
            property = setPropertyValue_ClassDefinition(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASSDEFINITION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ClassDefinition
     * <br>
     * The current definition of the class that is created, changed or deleted in the schema. In the case of a CIM_ClassDeletion Indication, the definition for the class just prior to deletion should be placed in this property.
     */

    private static CIMProperty setPropertyValue_ClassDefinition(CIMProperty currentProperty,
            org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getValue() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), CIMDataType.CLASS_T,
                setThis, currentProperty.isKey(), currentProperty.isPropagated(), currentProperty
                        .getOriginClass());

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
        return CIM_ClassIndication.CIM_CLASS_NAME;
    }

}