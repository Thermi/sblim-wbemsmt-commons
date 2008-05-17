/** 
 * CIM_NetworkPortStatistics.java
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
 * Description: The NetworkPortStatistics class describes the statistics for the NetworkPort.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_NetworkPortStatistics extends CIM_StatisticalData {

    public final static String CIM_CLASS_NAME = "CIM_NetworkPortStatistics";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property BytesReceived
     * The total number of bytes received, including framing characters.
     */
    public static class PROPERTY_BYTESRECEIVED {
        /**
         * name of the property BytesReceived
         */
        public final static String NAME = "BytesReceived";

    }

    /**
     * Constants of property BytesTransmitted
     * The total number of bytes transmitted, including framing characters.
     */
    public static class PROPERTY_BYTESTRANSMITTED {
        /**
         * name of the property BytesTransmitted
         */
        public final static String NAME = "BytesTransmitted";

    }

    /**
     * Constants of property PacketsReceived
     * The total number of packets received.
     */
    public static class PROPERTY_PACKETSRECEIVED {
        /**
         * name of the property PacketsReceived
         */
        public final static String NAME = "PacketsReceived";

    }

    /**
     * Constants of property PacketsTransmitted
     * The total number of packets transmitted.
     */
    public static class PROPERTY_PACKETSTRANSMITTED {
        /**
         * name of the property PacketsTransmitted
         */
        public final static String NAME = "PacketsTransmitted";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_StatisticalData.getPackages();

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
     *   The NetworkPortStatistics class describes the statistics for the NetworkPort.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_NetworkPortStatistics(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The NetworkPortStatistics class describes the statistics for the NetworkPort.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_NetworkPortStatistics(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_NetworkPortStatistics() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("BytesReceived", new CIMProperty("BytesReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("BytesTransmitted", new CIMProperty("BytesTransmitted",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PacketsReceived", new CIMProperty("PacketsReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PacketsTransmitted", new CIMProperty("PacketsTransmitted",
                CIMDataType.UINT64_T, null));

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
     * Get the property BytesReceived
     *     * <br>
     * The total number of bytes received, including framing characters.
     *     */

    public javax.cim.UnsignedInteger64 get_BytesReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_BYTESRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BYTESRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property BytesReceived
     * <br>
     * The total number of bytes received, including framing characters.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BytesReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BYTESRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BytesReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BYTESRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BytesReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BytesReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NetworkPortStatistics fco = new CIM_NetworkPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BYTESRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_BytesReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BYTESRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BytesReceived
     * <br>
     * The total number of bytes received, including framing characters.
     */

    private static CIMProperty setPropertyValue_BytesReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property BytesTransmitted
     *     * <br>
     * The total number of bytes transmitted, including framing characters.
     *     */

    public javax.cim.UnsignedInteger64 get_BytesTransmitted() {
        CIMProperty currentProperty = getProperty(PROPERTY_BYTESTRANSMITTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BYTESTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property BytesTransmitted
     * <br>
     * The total number of bytes transmitted, including framing characters.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BytesTransmitted(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BYTESTRANSMITTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BytesTransmitted(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BYTESTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BytesTransmitted by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BytesTransmitted(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NetworkPortStatistics fco = new CIM_NetworkPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BYTESTRANSMITTED.NAME);
        if (property != null) {
            property = setPropertyValue_BytesTransmitted(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BYTESTRANSMITTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BytesTransmitted
     * <br>
     * The total number of bytes transmitted, including framing characters.
     */

    private static CIMProperty setPropertyValue_BytesTransmitted(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PacketsReceived
     *     * <br>
     * The total number of packets received.
     *     */

    public javax.cim.UnsignedInteger64 get_PacketsReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_PACKETSRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PACKETSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PacketsReceived
     * <br>
     * The total number of packets received.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PacketsReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PACKETSRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PacketsReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PACKETSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PacketsReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PacketsReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NetworkPortStatistics fco = new CIM_NetworkPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PACKETSRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_PacketsReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PACKETSRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PacketsReceived
     * <br>
     * The total number of packets received.
     */

    private static CIMProperty setPropertyValue_PacketsReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PacketsTransmitted
     *     * <br>
     * The total number of packets transmitted.
     *     */

    public javax.cim.UnsignedInteger64 get_PacketsTransmitted() {
        CIMProperty currentProperty = getProperty(PROPERTY_PACKETSTRANSMITTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PACKETSTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PacketsTransmitted
     * <br>
     * The total number of packets transmitted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PacketsTransmitted(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PACKETSTRANSMITTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PacketsTransmitted(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PACKETSTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PacketsTransmitted by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PacketsTransmitted(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NetworkPortStatistics fco = new CIM_NetworkPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PACKETSTRANSMITTED.NAME);
        if (property != null) {
            property = setPropertyValue_PacketsTransmitted(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PACKETSTRANSMITTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PacketsTransmitted
     * <br>
     * The total number of packets transmitted.
     */

    private static CIMProperty setPropertyValue_PacketsTransmitted(CIMProperty currentProperty,
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
        return CIM_NetworkPortStatistics.CIM_CLASS_NAME;
    }

}