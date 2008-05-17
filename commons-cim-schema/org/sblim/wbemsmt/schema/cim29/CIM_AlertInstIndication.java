/** 
 * CIM_AlertInstIndication.java
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
 * Description: A subclass of CIM_AlertIndication that embeds a CIM_Inst Indication. It is used when adding AlertIndication data to a LifeCycle Indication.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_AlertInstIndication extends CIM_AlertIndication {

    public final static String CIM_CLASS_NAME = "CIM_AlertInstIndication";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AlertType
     * The primary classification of the Indication, defaulted to 7, "Model Change", for this class. This is done because: 1) the primary purpose of AlertInstIndication is to add Alert data to a LifeCycle Indication; and 2) LifeCycle Indications deal with 'model changes'.
     */
    public static class PROPERTY_ALERTTYPE {
        /**
         * name of the property AlertType
         */
        public final static String NAME = "AlertType";

    }

    /**
     * Constants of property IndObject
     * Embeds the InstIndication that is part of this Alert Indication. Only the properties selected by the Indication Filter's Query are included.
     */
    public static class PROPERTY_INDOBJECT {
        /**
         * name of the property IndObject
         */
        public final static String NAME = "IndObject";

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
     *   A subclass of CIM_AlertIndication that embeds a CIM_Inst Indication. It is used when adding AlertIndication data to a LifeCycle Indication.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_AlertInstIndication(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A subclass of CIM_AlertIndication that embeds a CIM_Inst Indication. It is used when adding AlertIndication data to a LifeCycle Indication.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_AlertInstIndication(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_AlertInstIndication() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck
                .put("AlertType", new CIMProperty("AlertType", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("IndObject", new CIMProperty("IndObject", CIMDataType.CLASS_T, null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {
            set_IndObject(null);

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property AlertType
     *     * <br>
     * The primary classification of the Indication, defaulted to 7, "Model Change", for this class. This is done because: 1) the primary purpose of AlertInstIndication is to add Alert data to a LifeCycle Indication; and 2) LifeCycle Indications deal with 'model changes'.
     *     */

    public javax.cim.UnsignedInteger16 get_AlertType() {
        CIMProperty currentProperty = getProperty(PROPERTY_ALERTTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ALERTTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property AlertType
     * <br>
     * The primary classification of the Indication, defaulted to 7, "Model Change", for this class. This is done because: 1) the primary purpose of AlertInstIndication is to add Alert data to a LifeCycle Indication; and 2) LifeCycle Indications deal with 'model changes'.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AlertType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ALERTTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AlertType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ALERTTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AlertType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AlertType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AlertInstIndication fco = new CIM_AlertInstIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ALERTTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_AlertType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ALERTTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AlertType
     * <br>
     * The primary classification of the Indication, defaulted to 7, "Model Change", for this class. This is done because: 1) the primary purpose of AlertInstIndication is to add Alert data to a LifeCycle Indication; and 2) LifeCycle Indications deal with 'model changes'.
     */

    private static CIMProperty setPropertyValue_AlertType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IndObject
     *     * <br>
     * Embeds the InstIndication that is part of this Alert Indication. Only the properties selected by the Indication Filter's Query are included.
     *     * 
     * @return a org.sblim.wbemsmt.bl.fco.embeddedobject.WbemsmtEmbeddedObject
     *     */

    public org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject get_IndObject(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_INDOBJECT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INDOBJECT.NAME + " was not found in instance "
                    + getCimObjectPath());
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
                + PROPERTY_INDOBJECT.NAME + " is no CIMInstance or CIMClass");

    }

    /**
     * Set the property IndObject
     * <br>
     * Embeds the InstIndication that is part of this Alert Indication. Only the properties selected by the Indication Filter's Query are included.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IndObject(org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INDOBJECT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_IndObject(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INDOBJECT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IndObject by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IndObject(WBEMClient client, String namespace,
            org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) throws WbemsmtException {
        CIM_AlertInstIndication fco = new CIM_AlertInstIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INDOBJECT.NAME);
        if (property != null) {
            property = setPropertyValue_IndObject(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INDOBJECT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IndObject
     * <br>
     * Embeds the InstIndication that is part of this Alert Indication. Only the properties selected by the Indication Filter's Query are included.
     */

    private static CIMProperty setPropertyValue_IndObject(CIMProperty currentProperty,
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
        return CIM_AlertInstIndication.CIM_CLASS_NAME;
    }

}