/** 
 * CIM_StorageDefect.java
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
 * Description: The StorageDefect aggregation collects the StorageErrors for a StorageExtent.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_StorageDefect extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_StorageDefect";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Extent
     * 
     */
    public static class PROPERTY_EXTENT_CIM_STORAGEEXTENT {
        /**
         * name of the property Extent
         */
        public final static String NAME = "Extent";

    }

    /**
     * Constants of property Error
     * 
     */
    public static class PROPERTY_ERROR_CIM_STORAGEERROR {
        /**
         * name of the property Error
         */
        public final static String NAME = "Error";

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
     *   The StorageDefect aggregation collects the StorageErrors for a StorageExtent.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_StorageDefect(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The StorageDefect aggregation collects the StorageErrors for a StorageExtent.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_StorageDefect(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_StorageDefect() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Extent", new CIMProperty("Extent", new CIMDataType(
                CIM_StorageExtent.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Error", new CIMProperty("Error", new CIMDataType(
                CIM_StorageError.CIM_CLASS_NAME), null));

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
     * Get the property Extent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_StorageExtent get_Extent_CIM_StorageExtent(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_EXTENT_CIM_STORAGEEXTENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EXTENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_StorageExtentHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Extent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Extent_CIM_StorageExtent(CIM_StorageExtent newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EXTENT_CIM_STORAGEEXTENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Extent_CIM_StorageExtent(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EXTENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Extent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Extent_CIM_StorageExtent(WBEMClient client, String namespace,
            CIM_StorageExtent newValue) throws WbemsmtException {
        CIM_StorageDefect fco = new CIM_StorageDefect(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EXTENT_CIM_STORAGEEXTENT.NAME);
        if (property != null) {
            property = setPropertyValue_Extent_CIM_StorageExtent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EXTENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Extent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Extent_CIM_StorageExtent(
            CIMProperty currentProperty, CIM_StorageExtent newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Error
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_StorageError get_Error_CIM_StorageError(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ERROR_CIM_STORAGEERROR.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERROR_CIM_STORAGEERROR.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_StorageErrorHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Error
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Error_CIM_StorageError(CIM_StorageError newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERROR_CIM_STORAGEERROR.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Error_CIM_StorageError(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERROR_CIM_STORAGEERROR.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Error by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Error_CIM_StorageError(WBEMClient client, String namespace,
            CIM_StorageError newValue) throws WbemsmtException {
        CIM_StorageDefect fco = new CIM_StorageDefect(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERROR_CIM_STORAGEERROR.NAME);
        if (property != null) {
            property = setPropertyValue_Error_CIM_StorageError(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERROR_CIM_STORAGEERROR.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Error
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Error_CIM_StorageError(CIMProperty currentProperty,
            CIM_StorageError newValue) {
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
        if (!(object instanceof CIM_StorageDefect)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_StorageDefect.CIM_CLASS_NAME;
    }

}