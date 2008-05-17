/** 
 * CIM_UnixDirectory.java
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
 * Description: UnixDirectory is a type of File that logically groups UnixFiles 'contained' in it.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_UnixDirectory extends CIM_Directory {

    public final static String CIM_CLASS_NAME = "CIM_UnixDirectory";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property FileSizeBits
     * Minimum number of bits needed to represent the maximum size of a Unix file allowed in the specified directory, as a signed integer value. Thus, a value of 32 indicates a maximum size of 2**31 bytes.
     */
    public static class PROPERTY_FILESIZEBITS {
        /**
         * name of the property FileSizeBits
         */
        public final static String NAME = "FileSizeBits";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Directory.getPackages();

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
     *   UnixDirectory is a type of File that logically groups UnixFiles 'contained' in it.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_UnixDirectory(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   UnixDirectory is a type of File that logically groups UnixFiles 'contained' in it.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_UnixDirectory(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_UnixDirectory() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("FileSizeBits", new CIMProperty("FileSizeBits", CIMDataType.UINT64_T,
                null));

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
     * Get the property FileSizeBits
     *     * <br>
     * Minimum number of bits needed to represent the maximum size of a Unix file allowed in the specified directory, as a signed integer value. Thus, a value of 32 indicates a maximum size of 2**31 bytes.
     *     */

    public javax.cim.UnsignedInteger64 get_FileSizeBits() {
        CIMProperty currentProperty = getProperty(PROPERTY_FILESIZEBITS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FILESIZEBITS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property FileSizeBits
     * <br>
     * Minimum number of bits needed to represent the maximum size of a Unix file allowed in the specified directory, as a signed integer value. Thus, a value of 32 indicates a maximum size of 2**31 bytes.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FileSizeBits(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FILESIZEBITS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FileSizeBits(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FILESIZEBITS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FileSizeBits by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FileSizeBits(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixDirectory fco = new CIM_UnixDirectory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FILESIZEBITS.NAME);
        if (property != null) {
            property = setPropertyValue_FileSizeBits(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FILESIZEBITS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FileSizeBits
     * <br>
     * Minimum number of bits needed to represent the maximum size of a Unix file allowed in the specified directory, as a signed integer value. Thus, a value of 32 indicates a maximum size of 2**31 bytes.
     */

    private static CIMProperty setPropertyValue_FileSizeBits(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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
        return CIM_UnixDirectory.CIM_CLASS_NAME;
    }

}