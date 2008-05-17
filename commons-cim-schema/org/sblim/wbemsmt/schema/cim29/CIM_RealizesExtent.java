/** 
 * CIM_RealizesExtent.java
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
 * Description: StorageExtents can be realized by PhysicalComponents. For example, disks or tapes are realized by PhysicalMedia. Memory is realized by PhysicalMemory. This relationship of Extents to PhysicalComponents is made explicit by the RealizesExtent association. In addition, the StartingAddress of the StorageExtent on the Component is specified here.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_RealizesExtent extends CIM_Realizes {

    public final static String CIM_CLASS_NAME = "CIM_RealizesExtent";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property StartingAddress
     * The starting address on the PhysicalComponent where the StorageExtent begins. Ending address of the StorageExtent is determined using the NumberOfBlocks and Block Size properties of the StorageExtent object.
     */
    public static class PROPERTY_STARTINGADDRESS {
        /**
         * name of the property StartingAddress
         */
        public final static String NAME = "StartingAddress";

    }

    /**
     * Constants of property Antecedent
     * 
     */
    public static class PROPERTY_ANTECEDENT_CIM_PHYSICALCOMPONENT {
        /**
         * name of the property Antecedent
         */
        public final static String NAME = "Antecedent";

    }

    /**
     * Constants of property Dependent
     * 
     */
    public static class PROPERTY_DEPENDENT_CIM_STORAGEEXTENT {
        /**
         * name of the property Dependent
         */
        public final static String NAME = "Dependent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Realizes.getPackages();

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
     *   StorageExtents can be realized by PhysicalComponents. For example, disks or tapes are realized by PhysicalMedia. Memory is realized by PhysicalMemory. This relationship of Extents to PhysicalComponents is made explicit by the RealizesExtent association. In addition, the StartingAddress of the StorageExtent on the Component is specified here.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_RealizesExtent(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   StorageExtents can be realized by PhysicalComponents. For example, disks or tapes are realized by PhysicalMedia. Memory is realized by PhysicalMemory. This relationship of Extents to PhysicalComponents is made explicit by the RealizesExtent association. In addition, the StartingAddress of the StorageExtent on the Component is specified here.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_RealizesExtent(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_RealizesExtent() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("StartingAddress", new CIMProperty("StartingAddress",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Antecedent", new CIMProperty("Antecedent", new CIMDataType(
                CIM_PhysicalComponent.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependent", new CIMProperty("Dependent", new CIMDataType(
                CIM_StorageExtent.CIM_CLASS_NAME), null));

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
     * Get the property StartingAddress
     *     * <br>
     * The starting address on the PhysicalComponent where the StorageExtent begins. Ending address of the StorageExtent is determined using the NumberOfBlocks and Block Size properties of the StorageExtent object.
     *     */

    public javax.cim.UnsignedInteger64 get_StartingAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTINGADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STARTINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property StartingAddress
     * <br>
     * The starting address on the PhysicalComponent where the StorageExtent begins. Ending address of the StorageExtent is determined using the NumberOfBlocks and Block Size properties of the StorageExtent object.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_StartingAddress(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTINGADDRESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_StartingAddress(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STARTINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property StartingAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StartingAddress(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_RealizesExtent fco = new CIM_RealizesExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STARTINGADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_StartingAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STARTINGADDRESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property StartingAddress
     * <br>
     * The starting address on the PhysicalComponent where the StorageExtent begins. Ending address of the StorageExtent is determined using the NumberOfBlocks and Block Size properties of the StorageExtent object.
     */

    private static CIMProperty setPropertyValue_StartingAddress(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Antecedent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_PhysicalComponent get_Antecedent_CIM_PhysicalComponent(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_PHYSICALCOMPONENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_PHYSICALCOMPONENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_PhysicalComponentHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Antecedent_CIM_PhysicalComponent(CIM_PhysicalComponent newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_PHYSICALCOMPONENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Antecedent_CIM_PhysicalComponent(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_PHYSICALCOMPONENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Antecedent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Antecedent_CIM_PhysicalComponent(WBEMClient client,
            String namespace, CIM_PhysicalComponent newValue) throws WbemsmtException {
        CIM_RealizesExtent fco = new CIM_RealizesExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ANTECEDENT_CIM_PHYSICALCOMPONENT.NAME);
        if (property != null) {
            property = setPropertyValue_Antecedent_CIM_PhysicalComponent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_PHYSICALCOMPONENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Antecedent_CIM_PhysicalComponent(
            CIMProperty currentProperty, CIM_PhysicalComponent newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Dependent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_StorageExtent get_Dependent_CIM_StorageExtent(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_StorageExtentHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Dependent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependent_CIM_StorageExtent(CIM_StorageExtent newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Dependent_CIM_StorageExtent(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Dependent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Dependent_CIM_StorageExtent(WBEMClient client,
            String namespace, CIM_StorageExtent newValue) throws WbemsmtException {
        CIM_RealizesExtent fco = new CIM_RealizesExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME);
        if (property != null) {
            property = setPropertyValue_Dependent_CIM_StorageExtent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependent_CIM_StorageExtent(
            CIMProperty currentProperty, CIM_StorageExtent newValue) {
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
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_RealizesExtent.CIM_CLASS_NAME;
    }

}