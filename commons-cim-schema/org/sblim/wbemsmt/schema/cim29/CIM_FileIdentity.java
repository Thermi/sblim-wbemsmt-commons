/** 
 * CIM_FileIdentity.java
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
 * Description: CIM_FileIdentity indicates that a UnixFile describes Unix- specific aspects of the various subclasses of LogicalFile. The association exists since it forces UnixFile to be weak to (scoped by) the LogicalFile. This is not true in the association's superclass, LogicalIdentity.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_FileIdentity extends CIM_LogicalIdentity {

    public final static String CIM_CLASS_NAME = "CIM_FileIdentity";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property SystemElement
     * 
     */
    public static class PROPERTY_SYSTEMELEMENT_CIM_LOGICALFILE {
        /**
         * name of the property SystemElement
         */
        public final static String NAME = "SystemElement";

    }

    /**
     * Constants of property SameElement
     * 
     */
    public static class PROPERTY_SAMEELEMENT_CIM_UNIXFILE {
        /**
         * name of the property SameElement
         */
        public final static String NAME = "SameElement";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_LogicalIdentity.getPackages();

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
     *   CIM_FileIdentity indicates that a UnixFile describes Unix- specific aspects of the various subclasses of LogicalFile. The association exists since it forces UnixFile to be weak to (scoped by) the LogicalFile. This is not true in the association's superclass, LogicalIdentity.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_FileIdentity(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_FileIdentity indicates that a UnixFile describes Unix- specific aspects of the various subclasses of LogicalFile. The association exists since it forces UnixFile to be weak to (scoped by) the LogicalFile. This is not true in the association's superclass, LogicalIdentity.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_FileIdentity(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_FileIdentity() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("SystemElement", new CIMProperty("SystemElement", new CIMDataType(
                CIM_LogicalFile.CIM_CLASS_NAME), null));
        propertiesToCheck.put("SameElement", new CIMProperty("SameElement", new CIMDataType(
                CIM_UnixFile.CIM_CLASS_NAME), null));

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

    public CIM_LogicalFile get_SystemElement_CIM_LogicalFile(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMELEMENT_CIM_LOGICALFILE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEMELEMENT_CIM_LOGICALFILE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_LogicalFileHelper
                .getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property SystemElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SystemElement_CIM_LogicalFile(CIM_LogicalFile newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMELEMENT_CIM_LOGICALFILE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SystemElement_CIM_LogicalFile(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMELEMENT_CIM_LOGICALFILE.NAME
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

    public static CIMProperty create_SystemElement_CIM_LogicalFile(WBEMClient client,
            String namespace, CIM_LogicalFile newValue) throws WbemsmtException {
        CIM_FileIdentity fco = new CIM_FileIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMELEMENT_CIM_LOGICALFILE.NAME);
        if (property != null) {
            property = setPropertyValue_SystemElement_CIM_LogicalFile(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMELEMENT_CIM_LOGICALFILE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SystemElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_SystemElement_CIM_LogicalFile(
            CIMProperty currentProperty, CIM_LogicalFile newValue) {
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

    public CIM_UnixFile get_SameElement_CIM_UnixFile(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SAMEELEMENT_CIM_UNIXFILE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SAMEELEMENT_CIM_UNIXFILE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_UnixFileHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property SameElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SameElement_CIM_UnixFile(CIM_UnixFile newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SAMEELEMENT_CIM_UNIXFILE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SameElement_CIM_UnixFile(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SAMEELEMENT_CIM_UNIXFILE.NAME
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

    public static CIMProperty create_SameElement_CIM_UnixFile(WBEMClient client, String namespace,
            CIM_UnixFile newValue) throws WbemsmtException {
        CIM_FileIdentity fco = new CIM_FileIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SAMEELEMENT_CIM_UNIXFILE.NAME);
        if (property != null) {
            property = setPropertyValue_SameElement_CIM_UnixFile(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SAMEELEMENT_CIM_UNIXFILE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SameElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_SameElement_CIM_UnixFile(
            CIMProperty currentProperty, CIM_UnixFile newValue) {
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
        return CIM_FileIdentity.CIM_CLASS_NAME;
    }

}