/** 
 * CIM_DefaultSetting.java
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
 * Description: DefaultSetting represents the association between a Managed SystemElement and the single Setting class that is defined to be the default setting for this Element.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_DefaultSetting extends CIM_ElementSetting {

    public final static String CIM_CLASS_NAME = "CIM_DefaultSetting";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Setting
     * 
     */
    public static class PROPERTY_SETTING_CIM_SETTING {
        /**
         * name of the property Setting
         */
        public final static String NAME = "Setting";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_ElementSetting.getPackages();

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
     *   DefaultSetting represents the association between a Managed SystemElement and the single Setting class that is defined to be the default setting for this Element.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_DefaultSetting(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   DefaultSetting represents the association between a Managed SystemElement and the single Setting class that is defined to be the default setting for this Element.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_DefaultSetting(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_DefaultSetting() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Setting", new CIMProperty("Setting", new CIMDataType(
                CIM_Setting.CIM_CLASS_NAME), null));

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
     * Get the property Setting
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Setting get_Setting_CIM_Setting(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SETTING_CIM_SETTING.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SETTING_CIM_SETTING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SettingHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Setting
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Setting_CIM_Setting(CIM_Setting newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SETTING_CIM_SETTING.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Setting_CIM_Setting(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SETTING_CIM_SETTING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Setting by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Setting_CIM_Setting(WBEMClient client, String namespace,
            CIM_Setting newValue) throws WbemsmtException {
        CIM_DefaultSetting fco = new CIM_DefaultSetting(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SETTING_CIM_SETTING.NAME);
        if (property != null) {
            property = setPropertyValue_Setting_CIM_Setting(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SETTING_CIM_SETTING.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Setting
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Setting_CIM_Setting(CIMProperty currentProperty,
            CIM_Setting newValue) {
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
        return CIM_DefaultSetting.CIM_CLASS_NAME;
    }

}