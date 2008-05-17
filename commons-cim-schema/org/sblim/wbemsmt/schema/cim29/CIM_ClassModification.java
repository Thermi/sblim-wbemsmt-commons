/** 
 * CIM_ClassModification.java
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
 * Description: CIM_ClassModification notifies when a class definition in the schema is modified.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ClassModification extends CIM_ClassIndication {

    public final static String CIM_CLASS_NAME = "CIM_ClassModification";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property PreviousClassDefinition
     * A copy of the 'previous' class definition whose change generated the Indication. PreviousClassDefinition contains an 'older' copy of the class' information, as compared to what is found in the ClassDefinition property (inherited from ClassIndication).
     */
    public static class PROPERTY_PREVIOUSCLASSDEFINITION {
        /**
         * name of the property PreviousClassDefinition
         */
        public final static String NAME = "PreviousClassDefinition";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_ClassIndication.getPackages();

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
     *   CIM_ClassModification notifies when a class definition in the schema is modified.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ClassModification(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_ClassModification notifies when a class definition in the schema is modified.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ClassModification(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ClassModification() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("PreviousClassDefinition", new CIMProperty("PreviousClassDefinition",
                CIMDataType.CLASS_T, null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {
            set_PreviousClassDefinition(null);

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property PreviousClassDefinition
     *     * <br>
     * A copy of the 'previous' class definition whose change generated the Indication. PreviousClassDefinition contains an 'older' copy of the class' information, as compared to what is found in the ClassDefinition property (inherited from ClassIndication).
     *     * 
     * @return a org.sblim.wbemsmt.bl.fco.embeddedobject.WbemsmtEmbeddedObject
     *     */

    public org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject get_PreviousClassDefinition(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PREVIOUSCLASSDEFINITION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PREVIOUSCLASSDEFINITION.NAME
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
                + PROPERTY_PREVIOUSCLASSDEFINITION.NAME + " is no CIMInstance or CIMClass");

    }

    /**
     * Set the property PreviousClassDefinition
     * <br>
     * A copy of the 'previous' class definition whose change generated the Indication. PreviousClassDefinition contains an 'older' copy of the class' information, as compared to what is found in the ClassDefinition property (inherited from ClassIndication).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PreviousClassDefinition(
            org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PREVIOUSCLASSDEFINITION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PreviousClassDefinition(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PREVIOUSCLASSDEFINITION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PreviousClassDefinition by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PreviousClassDefinition(WBEMClient client, String namespace,
            org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) throws WbemsmtException {
        CIM_ClassModification fco = new CIM_ClassModification(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PREVIOUSCLASSDEFINITION.NAME);
        if (property != null) {
            property = setPropertyValue_PreviousClassDefinition(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PREVIOUSCLASSDEFINITION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PreviousClassDefinition
     * <br>
     * A copy of the 'previous' class definition whose change generated the Indication. PreviousClassDefinition contains an 'older' copy of the class' information, as compared to what is found in the ClassDefinition property (inherited from ClassIndication).
     */

    private static CIMProperty setPropertyValue_PreviousClassDefinition(
            CIMProperty currentProperty, org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) {
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
        return CIM_ClassModification.CIM_CLASS_NAME;
    }

}