/** 
 * CIM_TapeDrive.java
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
 * Description: Capabilities and managment of a TapeDrive, a subtype of MediaAccessDevice.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_TapeDrive extends CIM_MediaAccessDevice {

    public final static String CIM_CLASS_NAME = "CIM_TapeDrive";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property EOTWarningZoneSize
     * EOTWarningZoneSize indicates the size, in bytes, of the area designated as 'end of tape'. Access in this area generates an 'end of tape' warning.
     */
    public static class PROPERTY_EOTWARNINGZONESIZE {
        /**
         * name of the property EOTWarningZoneSize
         */
        public final static String NAME = "EOTWarningZoneSize";

    }

    /**
     * Constants of property MaxPartitionCount
     * Maximum partition count for the TapeDrive.
     */
    public static class PROPERTY_MAXPARTITIONCOUNT {
        /**
         * name of the property MaxPartitionCount
         */
        public final static String NAME = "MaxPartitionCount";

    }

    /**
     * Constants of property MaxRewindTime
     * Time in milliseconds to move from the most physically distant point on the tape to the beginning.
     */
    public static class PROPERTY_MAXREWINDTIME {
        /**
         * name of the property MaxRewindTime
         */
        public final static String NAME = "MaxRewindTime";

    }

    /**
     * Constants of property Padding
     * Padding indicates the number of bytes inserted between blocks on a tape Media.
     */
    public static class PROPERTY_PADDING {
        /**
         * name of the property Padding
         */
        public final static String NAME = "Padding";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_MediaAccessDevice.getPackages();

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
     *   Capabilities and managment of a TapeDrive, a subtype of MediaAccessDevice.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_TapeDrive(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Capabilities and managment of a TapeDrive, a subtype of MediaAccessDevice.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_TapeDrive(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_TapeDrive() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("EOTWarningZoneSize", new CIMProperty("EOTWarningZoneSize",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("MaxPartitionCount", new CIMProperty("MaxPartitionCount",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("MaxRewindTime", new CIMProperty("MaxRewindTime",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Padding", new CIMProperty("Padding", CIMDataType.UINT32_T, null));

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
     * Get the property EOTWarningZoneSize
     *     * <br>
     * EOTWarningZoneSize indicates the size, in bytes, of the area designated as 'end of tape'. Access in this area generates an 'end of tape' warning.
     *     */

    public javax.cim.UnsignedInteger32 get_EOTWarningZoneSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_EOTWARNINGZONESIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EOTWARNINGZONESIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property EOTWarningZoneSize
     * <br>
     * EOTWarningZoneSize indicates the size, in bytes, of the area designated as 'end of tape'. Access in this area generates an 'end of tape' warning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EOTWarningZoneSize(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EOTWARNINGZONESIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EOTWarningZoneSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EOTWARNINGZONESIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EOTWarningZoneSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EOTWarningZoneSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TapeDrive fco = new CIM_TapeDrive(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EOTWARNINGZONESIZE.NAME);
        if (property != null) {
            property = setPropertyValue_EOTWarningZoneSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EOTWARNINGZONESIZE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EOTWarningZoneSize
     * <br>
     * EOTWarningZoneSize indicates the size, in bytes, of the area designated as 'end of tape'. Access in this area generates an 'end of tape' warning.
     */

    private static CIMProperty setPropertyValue_EOTWarningZoneSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxPartitionCount
     *     * <br>
     * Maximum partition count for the TapeDrive.
     *     */

    public javax.cim.UnsignedInteger32 get_MaxPartitionCount() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXPARTITIONCOUNT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXPARTITIONCOUNT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property MaxPartitionCount
     * <br>
     * Maximum partition count for the TapeDrive.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxPartitionCount(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXPARTITIONCOUNT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxPartitionCount(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXPARTITIONCOUNT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxPartitionCount by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxPartitionCount(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TapeDrive fco = new CIM_TapeDrive(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXPARTITIONCOUNT.NAME);
        if (property != null) {
            property = setPropertyValue_MaxPartitionCount(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXPARTITIONCOUNT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxPartitionCount
     * <br>
     * Maximum partition count for the TapeDrive.
     */

    private static CIMProperty setPropertyValue_MaxPartitionCount(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxRewindTime
     *     * <br>
     * Time in milliseconds to move from the most physically distant point on the tape to the beginning.
     *     */

    public javax.cim.UnsignedInteger64 get_MaxRewindTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXREWINDTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXREWINDTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MaxRewindTime
     * <br>
     * Time in milliseconds to move from the most physically distant point on the tape to the beginning.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxRewindTime(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXREWINDTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxRewindTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXREWINDTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxRewindTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxRewindTime(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_TapeDrive fco = new CIM_TapeDrive(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXREWINDTIME.NAME);
        if (property != null) {
            property = setPropertyValue_MaxRewindTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXREWINDTIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxRewindTime
     * <br>
     * Time in milliseconds to move from the most physically distant point on the tape to the beginning.
     */

    private static CIMProperty setPropertyValue_MaxRewindTime(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Padding
     *     * <br>
     * Padding indicates the number of bytes inserted between blocks on a tape Media.
     *     */

    public javax.cim.UnsignedInteger32 get_Padding() {
        CIMProperty currentProperty = getProperty(PROPERTY_PADDING.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PADDING.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property Padding
     * <br>
     * Padding indicates the number of bytes inserted between blocks on a tape Media.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Padding(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PADDING.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Padding(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PADDING.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Padding by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Padding(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TapeDrive fco = new CIM_TapeDrive(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PADDING.NAME);
        if (property != null) {
            property = setPropertyValue_Padding(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PADDING.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Padding
     * <br>
     * Padding indicates the number of bytes inserted between blocks on a tape Media.
     */

    private static CIMProperty setPropertyValue_Padding(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
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
        return CIM_TapeDrive.CIM_CLASS_NAME;
    }

}