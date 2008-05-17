/** 
 * CIM_FRUIncludesSoftwareFeature.java
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
 * Description: The FRUIncludesSoftwareFeature association identifies the SoftwareFeature(s) packaged with a particular FRU. A common usage is to determine whether the FRU is compatible with a hardware/software platform. In order to determine this, the following conditions need to be verified: 
 * (1) Is the physical package of the FRU compatible with the slots or equivalent packaging of the hardware? 
 * (2) Are there any physical constraints (such as power consumption) that prevent the FRU from being installed? 
 * (3) Are the SoftwareFeatures packaged with the FRU compatiable with the underlying operating system and other software already installed/to be installed on the platform? 
 * This latter question can be answered by first checking if an instance of FRUIncludesSoftwareFeature exists. If it does, then the compatibility of each SoftwareFeature can be determined by evaluating the Check classes for the Software Elements that are part of the Feature (found by traversing the association, SoftwareFeatureSoftwareElements). For example, there might be a SoftwareElementVersionCheck that declares that a SoftwareElement (of the FRU's Software Feature) is not compatible with current software.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_FRUIncludesSoftwareFeature extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_FRUIncludesSoftwareFeature";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property FRU
     * 
     */
    public static class PROPERTY_FRU_CIM_FRU {
        /**
         * name of the property FRU
         */
        public final static String NAME = "FRU";

    }

    /**
     * Constants of property Component
     * 
     */
    public static class PROPERTY_COMPONENT_CIM_SOFTWAREFEATURE {
        /**
         * name of the property Component
         */
        public final static String NAME = "Component";

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
     *   The FRUIncludesSoftwareFeature association identifies the SoftwareFeature(s) packaged with a particular FRU. A common usage is to determine whether the FRU is compatible with a hardware/software platform. In order to determine this, the following conditions need to be verified: 
     * (1) Is the physical package of the FRU compatible with the slots or equivalent packaging of the hardware? 
     * (2) Are there any physical constraints (such as power consumption) that prevent the FRU from being installed? 
     * (3) Are the SoftwareFeatures packaged with the FRU compatiable with the underlying operating system and other software already installed/to be installed on the platform? 
     * This latter question can be answered by first checking if an instance of FRUIncludesSoftwareFeature exists. If it does, then the compatibility of each SoftwareFeature can be determined by evaluating the Check classes for the Software Elements that are part of the Feature (found by traversing the association, SoftwareFeatureSoftwareElements). For example, there might be a SoftwareElementVersionCheck that declares that a SoftwareElement (of the FRU's Software Feature) is not compatible with current software.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_FRUIncludesSoftwareFeature(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The FRUIncludesSoftwareFeature association identifies the SoftwareFeature(s) packaged with a particular FRU. A common usage is to determine whether the FRU is compatible with a hardware/software platform. In order to determine this, the following conditions need to be verified: 
     * (1) Is the physical package of the FRU compatible with the slots or equivalent packaging of the hardware? 
     * (2) Are there any physical constraints (such as power consumption) that prevent the FRU from being installed? 
     * (3) Are the SoftwareFeatures packaged with the FRU compatiable with the underlying operating system and other software already installed/to be installed on the platform? 
     * This latter question can be answered by first checking if an instance of FRUIncludesSoftwareFeature exists. If it does, then the compatibility of each SoftwareFeature can be determined by evaluating the Check classes for the Software Elements that are part of the Feature (found by traversing the association, SoftwareFeatureSoftwareElements). For example, there might be a SoftwareElementVersionCheck that declares that a SoftwareElement (of the FRU's Software Feature) is not compatible with current software.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_FRUIncludesSoftwareFeature(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_FRUIncludesSoftwareFeature() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("FRU", new CIMProperty("FRU",
                new CIMDataType(CIM_FRU.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Component", new CIMProperty("Component", new CIMDataType(
                CIM_SoftwareFeature.CIM_CLASS_NAME), null));

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
     * Get the property FRU
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_FRU get_FRU_CIM_FRU(javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_FRU_CIM_FRU.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FRU_CIM_FRU.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return CIM_FRUHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property FRU
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FRU_CIM_FRU(CIM_FRU newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FRU_CIM_FRU.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FRU_CIM_FRU(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FRU_CIM_FRU.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FRU by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FRU_CIM_FRU(WBEMClient client, String namespace,
            CIM_FRU newValue) throws WbemsmtException {
        CIM_FRUIncludesSoftwareFeature fco = new CIM_FRUIncludesSoftwareFeature(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FRU_CIM_FRU.NAME);
        if (property != null) {
            property = setPropertyValue_FRU_CIM_FRU(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FRU_CIM_FRU.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FRU
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_FRU_CIM_FRU(CIMProperty currentProperty,
            CIM_FRU newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Component
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_SoftwareFeature get_Component_CIM_SoftwareFeature(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_COMPONENT_CIM_SOFTWAREFEATURE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_COMPONENT_CIM_SOFTWAREFEATURE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SoftwareFeatureHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Component
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Component_CIM_SoftwareFeature(CIM_SoftwareFeature newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_COMPONENT_CIM_SOFTWAREFEATURE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Component_CIM_SoftwareFeature(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_COMPONENT_CIM_SOFTWAREFEATURE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Component by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Component_CIM_SoftwareFeature(WBEMClient client,
            String namespace, CIM_SoftwareFeature newValue) throws WbemsmtException {
        CIM_FRUIncludesSoftwareFeature fco = new CIM_FRUIncludesSoftwareFeature(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_COMPONENT_CIM_SOFTWAREFEATURE.NAME);
        if (property != null) {
            property = setPropertyValue_Component_CIM_SoftwareFeature(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_COMPONENT_CIM_SOFTWAREFEATURE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Component
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Component_CIM_SoftwareFeature(
            CIMProperty currentProperty, CIM_SoftwareFeature newValue) {
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
        if (!(object instanceof CIM_FRUIncludesSoftwareFeature)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_FRUIncludesSoftwareFeature.CIM_CLASS_NAME;
    }

}