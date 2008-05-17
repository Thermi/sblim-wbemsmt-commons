/** 
 * CIM_ActsAsSpare.java
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
 * Description: The ActsAsSpare association indicates which elements can spare or replace the other aggregated elements. The fact that a spare can operate in "hot standby" mode is specified on an element by element basis.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ActsAsSpare extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_ActsAsSpare";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property HotStandby
     * HotStandby is a boolean indicating that the spare is operating as a hot standby.
     */
    public static class PROPERTY_HOTSTANDBY {
        /**
         * name of the property HotStandby
         */
        public final static String NAME = "HotStandby";

    }

    /**
     * Constants of property Group
     * 
     */
    public static class PROPERTY_GROUP_CIM_SPAREGROUP {
        /**
         * name of the property Group
         */
        public final static String NAME = "Group";

    }

    /**
     * Constants of property Spare
     * 
     */
    public static class PROPERTY_SPARE_CIM_MANAGEDSYSTEMELEMENT {
        /**
         * name of the property Spare
         */
        public final static String NAME = "Spare";

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
     *   The ActsAsSpare association indicates which elements can spare or replace the other aggregated elements. The fact that a spare can operate in "hot standby" mode is specified on an element by element basis.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ActsAsSpare(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The ActsAsSpare association indicates which elements can spare or replace the other aggregated elements. The fact that a spare can operate in "hot standby" mode is specified on an element by element basis.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ActsAsSpare(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ActsAsSpare() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("HotStandby", new CIMProperty("HotStandby", CIMDataType.BOOLEAN_T,
                null));
        propertiesToCheck.put("Group", new CIMProperty("Group", new CIMDataType(
                CIM_SpareGroup.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Spare", new CIMProperty("Spare", new CIMDataType(
                CIM_ManagedSystemElement.CIM_CLASS_NAME), null));

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
     * Get the property HotStandby
     *     * <br>
     * HotStandby is a boolean indicating that the spare is operating as a hot standby.
     *     */

    public Boolean get_HotStandby() {
        CIMProperty currentProperty = getProperty(PROPERTY_HOTSTANDBY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_HOTSTANDBY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property HotStandby
     * <br>
     * HotStandby is a boolean indicating that the spare is operating as a hot standby.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_HotStandby(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HOTSTANDBY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_HotStandby(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_HOTSTANDBY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property HotStandby by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_HotStandby(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_ActsAsSpare fco = new CIM_ActsAsSpare(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HOTSTANDBY.NAME);
        if (property != null) {
            property = setPropertyValue_HotStandby(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_HOTSTANDBY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property HotStandby
     * <br>
     * HotStandby is a boolean indicating that the spare is operating as a hot standby.
     */

    private static CIMProperty setPropertyValue_HotStandby(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Group
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_SpareGroup get_Group_CIM_SpareGroup(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUP_CIM_SPAREGROUP.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GROUP_CIM_SPAREGROUP.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_SpareGroupHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Group
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Group_CIM_SpareGroup(CIM_SpareGroup newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUP_CIM_SPAREGROUP.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Group_CIM_SpareGroup(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GROUP_CIM_SPAREGROUP.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Group by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Group_CIM_SpareGroup(WBEMClient client, String namespace,
            CIM_SpareGroup newValue) throws WbemsmtException {
        CIM_ActsAsSpare fco = new CIM_ActsAsSpare(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GROUP_CIM_SPAREGROUP.NAME);
        if (property != null) {
            property = setPropertyValue_Group_CIM_SpareGroup(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GROUP_CIM_SPAREGROUP.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Group
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Group_CIM_SpareGroup(CIMProperty currentProperty,
            CIM_SpareGroup newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Spare
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedSystemElement get_Spare_CIM_ManagedSystemElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SPARE_CIM_MANAGEDSYSTEMELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SPARE_CIM_MANAGEDSYSTEMELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedSystemElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Spare
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Spare_CIM_ManagedSystemElement(CIM_ManagedSystemElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SPARE_CIM_MANAGEDSYSTEMELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Spare_CIM_ManagedSystemElement(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SPARE_CIM_MANAGEDSYSTEMELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Spare by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Spare_CIM_ManagedSystemElement(WBEMClient client,
            String namespace, CIM_ManagedSystemElement newValue) throws WbemsmtException {
        CIM_ActsAsSpare fco = new CIM_ActsAsSpare(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SPARE_CIM_MANAGEDSYSTEMELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_Spare_CIM_ManagedSystemElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SPARE_CIM_MANAGEDSYSTEMELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Spare
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Spare_CIM_ManagedSystemElement(
            CIMProperty currentProperty, CIM_ManagedSystemElement newValue) {
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
        if (!(object instanceof CIM_ActsAsSpare)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ActsAsSpare.CIM_CLASS_NAME;
    }

}