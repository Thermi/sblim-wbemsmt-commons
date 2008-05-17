/** 
 * CIM_Indication.java
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
 * Description: CIM_Indication is the abstract root class for all notifications about changes in schema, objects and their data, and about events detected by providers and instrumentation. Subclasses represent specific types of notifications. 
 * 
 * To receive an Indication, a consumer (or subscriber) must create an instance of CIM_IndicationFilter describing the criteria of the notification, an instance of CIM_ListenerDestination describing the delivery of the notification, and an instance of CIM_IndicationSubscription associating the Filter and Handler.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_Indication extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_Indication";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property CorrelatedIndications
     * A list of IndicationIdentifiers whose notifications are correlated with (related to) this one.
     */
    public static class PROPERTY_CORRELATEDINDICATIONS {
        /**
         * name of the property CorrelatedIndications
         */
        public final static String NAME = "CorrelatedIndications";

    }

    /**
     * Constants of property IndicationIdentifier
     * An identifier for the Indication. This property is similar to a key value in that it can be used for identification, when correlating Indications (see the CorrelatedIndications array). Its value SHOULD be unique as long as Alert correlations are reported, but MAY be reused or left NULL if no future Indications will reference it in their CorrelatedIndications array.
     */
    public static class PROPERTY_INDICATIONIDENTIFIER {
        /**
         * name of the property IndicationIdentifier
         */
        public final static String NAME = "IndicationIdentifier";

    }

    /**
     * Constants of property IndicationTime
     * The time and date of creation of the Indication. The property may be set to NULL if the entity creating the Indication is not capable of determing this information. Note that IndicationTime may be the same for two Indications that are generated in rapid succession.
     */
    public static class PROPERTY_INDICATIONTIME {
        /**
         * name of the property IndicationTime
         */
        public final static String NAME = "IndicationTime";

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
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   CIM_Indication is the abstract root class for all notifications about changes in schema, objects and their data, and about events detected by providers and instrumentation. Subclasses represent specific types of notifications. 
     * 
     * To receive an Indication, a consumer (or subscriber) must create an instance of CIM_IndicationFilter describing the criteria of the notification, an instance of CIM_ListenerDestination describing the delivery of the notification, and an instance of CIM_IndicationSubscription associating the Filter and Handler.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_Indication(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   CIM_Indication is the abstract root class for all notifications about changes in schema, objects and their data, and about events detected by providers and instrumentation. Subclasses represent specific types of notifications. 
     * 
     * To receive an Indication, a consumer (or subscriber) must create an instance of CIM_IndicationFilter describing the criteria of the notification, an instance of CIM_ListenerDestination describing the delivery of the notification, and an instance of CIM_IndicationSubscription associating the Filter and Handler.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_Indication(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Indication() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CorrelatedIndications", new CIMProperty("CorrelatedIndications",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("IndicationIdentifier", new CIMProperty("IndicationIdentifier",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("IndicationTime", new CIMProperty("IndicationTime",
                CIMDataType.DATETIME_T, null));

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
     * Get the property CorrelatedIndications
     *     * <br>
     * A list of IndicationIdentifiers whose notifications are correlated with (related to) this one.
     *     */

    public String[] get_CorrelatedIndications() {
        CIMProperty currentProperty = getProperty(PROPERTY_CORRELATEDINDICATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CORRELATEDINDICATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property CorrelatedIndications
     * <br>
     * A list of IndicationIdentifiers whose notifications are correlated with (related to) this one.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CorrelatedIndications(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CORRELATEDINDICATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CorrelatedIndications(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CORRELATEDINDICATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CorrelatedIndications by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CorrelatedIndications(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_Indication fco = new CIM_Indication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CORRELATEDINDICATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_CorrelatedIndications(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CORRELATEDINDICATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CorrelatedIndications
     * <br>
     * A list of IndicationIdentifiers whose notifications are correlated with (related to) this one.
     */

    private static CIMProperty setPropertyValue_CorrelatedIndications(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IndicationIdentifier
     *     * <br>
     * An identifier for the Indication. This property is similar to a key value in that it can be used for identification, when correlating Indications (see the CorrelatedIndications array). Its value SHOULD be unique as long as Alert correlations are reported, but MAY be reused or left NULL if no future Indications will reference it in their CorrelatedIndications array.
     *     */

    public String get_IndicationIdentifier() {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONIDENTIFIER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INDICATIONIDENTIFIER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property IndicationIdentifier
     * <br>
     * An identifier for the Indication. This property is similar to a key value in that it can be used for identification, when correlating Indications (see the CorrelatedIndications array). Its value SHOULD be unique as long as Alert correlations are reported, but MAY be reused or left NULL if no future Indications will reference it in their CorrelatedIndications array.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IndicationIdentifier(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONIDENTIFIER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_IndicationIdentifier(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONIDENTIFIER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IndicationIdentifier by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IndicationIdentifier(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Indication fco = new CIM_Indication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INDICATIONIDENTIFIER.NAME);
        if (property != null) {
            property = setPropertyValue_IndicationIdentifier(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONIDENTIFIER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IndicationIdentifier
     * <br>
     * An identifier for the Indication. This property is similar to a key value in that it can be used for identification, when correlating Indications (see the CorrelatedIndications array). Its value SHOULD be unique as long as Alert correlations are reported, but MAY be reused or left NULL if no future Indications will reference it in their CorrelatedIndications array.
     */

    private static CIMProperty setPropertyValue_IndicationIdentifier(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IndicationTime
     *     * <br>
     * The time and date of creation of the Indication. The property may be set to NULL if the entity creating the Indication is not capable of determing this information. Note that IndicationTime may be the same for two Indications that are generated in rapid succession.
     *     */

    public javax.cim.CIMDateTime get_IndicationTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INDICATIONTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property IndicationTime
     * <br>
     * The time and date of creation of the Indication. The property may be set to NULL if the entity creating the Indication is not capable of determing this information. Note that IndicationTime may be the same for two Indications that are generated in rapid succession.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IndicationTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_IndicationTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IndicationTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IndicationTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_Indication fco = new CIM_Indication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INDICATIONTIME.NAME);
        if (property != null) {
            property = setPropertyValue_IndicationTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONTIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IndicationTime
     * <br>
     * The time and date of creation of the Indication. The property may be set to NULL if the entity creating the Indication is not capable of determing this information. Note that IndicationTime may be the same for two Indications that are generated in rapid succession.
     */

    private static CIMProperty setPropertyValue_IndicationTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
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
     * returns true if the objects are the same
     * 
     * @return
     * @see org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco\#equals(Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof CIM_Indication)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_Indication.CIM_CLASS_NAME;
    }

}