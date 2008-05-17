/** 
 * CIM_InstIndication.java
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
 * Description: CIM_InstIndication is an abstract superclass describing changes to instances. Subclasses represent specific types of change notifications, such as instance creation, deletion and modification.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_InstIndication extends CIM_Indication {

    public final static String CIM_CLASS_NAME = "CIM_InstIndication";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property SourceInstance
     * A copy of the instance that changed to generate the Indication. SourceInstance contains the current values of the properties selected by the Indication Filter's Query. In the case of CIM_InstDeletion, the property values are copied before the instance is deleted.
     */
    public static class PROPERTY_SOURCEINSTANCE {
        /**
         * name of the property SourceInstance
         */
        public final static String NAME = "SourceInstance";

    }

    /**
     * Constants of property SourceInstanceHost
     * The host name or IP address of the SourceInstance.
     */
    public static class PROPERTY_SOURCEINSTANCEHOST {
        /**
         * name of the property SourceInstanceHost
         */
        public final static String NAME = "SourceInstanceHost";

    }

    /**
     * Constants of property SourceInstanceModelPath
     * The Model Path of the SourceInstance. The following format MUST be used to encode the Model Path: 
     * <NamespacePath>:<ClassName>.<Prop1>="<Value1>", 
     * <Prop2>="<Value2>", ...
     */
    public static class PROPERTY_SOURCEINSTANCEMODELPATH {
        /**
         * name of the property SourceInstanceModelPath
         */
        public final static String NAME = "SourceInstanceModelPath";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim_2_14");
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
     *   CIM_InstIndication is an abstract superclass describing changes to instances. Subclasses represent specific types of change notifications, such as instance creation, deletion and modification.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_InstIndication(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   CIM_InstIndication is an abstract superclass describing changes to instances. Subclasses represent specific types of change notifications, such as instance creation, deletion and modification.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_InstIndication(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_InstIndication() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("SourceInstance", new CIMProperty("SourceInstance",
                CIMDataType.CLASS_T, null));
        propertiesToCheck.put("SourceInstanceHost", new CIMProperty("SourceInstanceHost",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("SourceInstanceModelPath", new CIMProperty("SourceInstanceModelPath",
                CIMDataType.STRING_T, null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {
            set_SourceInstance(null);

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property SourceInstance
     *     * <br>
     * A copy of the instance that changed to generate the Indication. SourceInstance contains the current values of the properties selected by the Indication Filter's Query. In the case of CIM_InstDeletion, the property values are copied before the instance is deleted.
     *     * 
     * @return a org.sblim.wbemsmt.bl.fco.embeddedobject.WbemsmtEmbeddedObject
     *     */

    public org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject get_SourceInstance(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SOURCEINSTANCE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SOURCEINSTANCE.NAME
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
                + PROPERTY_SOURCEINSTANCE.NAME + " is no CIMInstance or CIMClass");

    }

    /**
     * Set the property SourceInstance
     * <br>
     * A copy of the instance that changed to generate the Indication. SourceInstance contains the current values of the properties selected by the Indication Filter's Query. In the case of CIM_InstDeletion, the property values are copied before the instance is deleted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SourceInstance(org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SOURCEINSTANCE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SourceInstance(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SOURCEINSTANCE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SourceInstance by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SourceInstance(WBEMClient client, String namespace,
            org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) throws WbemsmtException {
        CIM_InstIndication fco = new CIM_InstIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SOURCEINSTANCE.NAME);
        if (property != null) {
            property = setPropertyValue_SourceInstance(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SOURCEINSTANCE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SourceInstance
     * <br>
     * A copy of the instance that changed to generate the Indication. SourceInstance contains the current values of the properties selected by the Indication Filter's Query. In the case of CIM_InstDeletion, the property values are copied before the instance is deleted.
     */

    private static CIMProperty setPropertyValue_SourceInstance(CIMProperty currentProperty,
            org.sblim.wbemsmt.bl.fco.WbemsmtEmbeddedObject newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getValue() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), CIMDataType.CLASS_T,
                setThis, currentProperty.isKey(), currentProperty.isPropagated(), currentProperty
                        .getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SourceInstanceHost
     *     * <br>
     * The host name or IP address of the SourceInstance.
     *     */

    public String get_SourceInstanceHost() {
        CIMProperty currentProperty = getProperty(PROPERTY_SOURCEINSTANCEHOST.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SOURCEINSTANCEHOST.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SourceInstanceHost
     * <br>
     * The host name or IP address of the SourceInstance.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SourceInstanceHost(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SOURCEINSTANCEHOST.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SourceInstanceHost(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SOURCEINSTANCEHOST.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SourceInstanceHost by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SourceInstanceHost(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_InstIndication fco = new CIM_InstIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SOURCEINSTANCEHOST.NAME);
        if (property != null) {
            property = setPropertyValue_SourceInstanceHost(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SOURCEINSTANCEHOST.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SourceInstanceHost
     * <br>
     * The host name or IP address of the SourceInstance.
     */

    private static CIMProperty setPropertyValue_SourceInstanceHost(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SourceInstanceModelPath
     *     * <br>
     * The Model Path of the SourceInstance. The following format MUST be used to encode the Model Path: 
     * <NamespacePath>:<ClassName>.<Prop1>="<Value1>", 
     * <Prop2>="<Value2>", ...
     *     */

    public String get_SourceInstanceModelPath() {
        CIMProperty currentProperty = getProperty(PROPERTY_SOURCEINSTANCEMODELPATH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SOURCEINSTANCEMODELPATH.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SourceInstanceModelPath
     * <br>
     * The Model Path of the SourceInstance. The following format MUST be used to encode the Model Path: 
     * <NamespacePath>:<ClassName>.<Prop1>="<Value1>", 
     * <Prop2>="<Value2>", ...
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SourceInstanceModelPath(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SOURCEINSTANCEMODELPATH.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SourceInstanceModelPath(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SOURCEINSTANCEMODELPATH.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SourceInstanceModelPath by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SourceInstanceModelPath(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_InstIndication fco = new CIM_InstIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SOURCEINSTANCEMODELPATH.NAME);
        if (property != null) {
            property = setPropertyValue_SourceInstanceModelPath(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SOURCEINSTANCEMODELPATH.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SourceInstanceModelPath
     * <br>
     * The Model Path of the SourceInstance. The following format MUST be used to encode the Model Path: 
     * <NamespacePath>:<ClassName>.<Prop1>="<Value1>", 
     * <Prop2>="<Value2>", ...
     */

    private static CIMProperty setPropertyValue_SourceInstanceModelPath(
            CIMProperty currentProperty, String newValue) {
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
        return CIM_InstIndication.CIM_CLASS_NAME;
    }

}