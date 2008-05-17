/** 
 * CIM_IndicationHandler.java
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
 * Description: CIM_IndicationHandler is an abstract superclass describing how an Indication is to be processd/delivered/'handled'. This may define a destination and protocol for delivering Indications, or it may define a process to invoke. This class is derived from CIM_ManagedElement to allow modeling the dependency of the Handler on a specific service.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_IndicationHandler extends CIM_ListenerDestination {

    public final static String CIM_CLASS_NAME = "CIM_IndicationHandler";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Owner
     * The name of the entity that created and/or maintains this Handler.
     */
    public static class PROPERTY_OWNER {
        /**
         * name of the property Owner
         */
        public final static String NAME = "Owner";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_ListenerDestination.getPackages();

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
     *   CIM_IndicationHandler is an abstract superclass describing how an Indication is to be processd/delivered/'handled'. This may define a destination and protocol for delivering Indications, or it may define a process to invoke. This class is derived from CIM_ManagedElement to allow modeling the dependency of the Handler on a specific service.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_IndicationHandler(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   CIM_IndicationHandler is an abstract superclass describing how an Indication is to be processd/delivered/'handled'. This may define a destination and protocol for delivering Indications, or it may define a process to invoke. This class is derived from CIM_ManagedElement to allow modeling the dependency of the Handler on a specific service.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_IndicationHandler(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_IndicationHandler() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Owner", new CIMProperty("Owner", CIMDataType.STRING_T, null));

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
     * Get the property Owner
     *     * <br>
     * The name of the entity that created and/or maintains this Handler.
     *     */

    public String get_Owner() {
        CIMProperty currentProperty = getProperty(PROPERTY_OWNER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OWNER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Owner
     * <br>
     * The name of the entity that created and/or maintains this Handler.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Owner(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OWNER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Owner(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OWNER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Owner by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Owner(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_IndicationHandler fco = new CIM_IndicationHandler(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OWNER.NAME);
        if (property != null) {
            property = setPropertyValue_Owner(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OWNER.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Owner
     * <br>
     * The name of the entity that created and/or maintains this Handler.
     */

    private static CIMProperty setPropertyValue_Owner(CIMProperty currentProperty, String newValue) {
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
        return CIM_IndicationHandler.CIM_CLASS_NAME;
    }

}