/** 
 * CIM_LogicalPortGroup.java
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
 * Description: A collection of one or more ports logically grouped for administrative and discovery/topology purposes. LogicalPortGroups define port collections for access control, or for use in routing policy or other management tasks. For example, in Fibre Channel and Infiniband, a LogicalPortGroup represents the concept of a 'node'.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_LogicalPortGroup extends CIM_SystemSpecificCollection {

    public final static String CIM_CLASS_NAME = "CIM_LogicalPortGroup";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Name
     * The Name property defines the identity by which the LogicalPortGroup is known.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property NameFormat
     * The NameFormat property identifies how the Name of the LogicalPortGroup is generated.
     */
    public static class PROPERTY_NAMEFORMAT {
        /**
         * name of the property NameFormat
         */
        public final static String NAME = "NameFormat";

        /**
         * constant for value map entry Unknown
         */

        public final static String VALUE_MAP_ENTRY_Unknown = new String("Unknown");

        /**
         * constant for value map entry Other
         */

        public final static String VALUE_MAP_ENTRY_Other = new String("Other");

        /**
         * constant for value map entry WWN
         */

        public final static String VALUE_MAP_ENTRY_WWN = new String("WWN");

        /**
         * constant for value map entry GUID
         */

        public final static String VALUE_MAP_ENTRY_GUID = new String("GUID");

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property NameFormat   
         */
        public final static String[] VALUE_MAP_ENTRIES = { VALUE_MAP_ENTRY_Unknown,
                VALUE_MAP_ENTRY_Other, VALUE_MAP_ENTRY_WWN, VALUE_MAP_ENTRY_GUID };

    }

    /**
     * Constants of property OtherNameFormat
     * A string describing how the LogicalPortGroup is identified when the NameFormat is "Other".
     */
    public static class PROPERTY_OTHERNAMEFORMAT {
        /**
         * name of the property OtherNameFormat
         */
        public final static String NAME = "OtherNameFormat";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_SystemSpecificCollection.getPackages();

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
     *   A collection of one or more ports logically grouped for administrative and discovery/topology purposes. LogicalPortGroups define port collections for access control, or for use in routing policy or other management tasks. For example, in Fibre Channel and Infiniband, a LogicalPortGroup represents the concept of a 'node'.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_LogicalPortGroup(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A collection of one or more ports logically grouped for administrative and discovery/topology purposes. LogicalPortGroups define port collections for access control, or for use in routing policy or other management tasks. For example, in Fibre Channel and Infiniband, a LogicalPortGroup represents the concept of a 'node'.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_LogicalPortGroup(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_LogicalPortGroup() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("NameFormat", new CIMProperty("NameFormat", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("OtherNameFormat", new CIMProperty("OtherNameFormat",
                CIMDataType.STRING_T, null));

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
     * Get the property Name
     *     * <br>
     * The Name property defines the identity by which the LogicalPortGroup is known.
     *     */

    public String get_Name() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Name
     * <br>
     * The Name property defines the identity by which the LogicalPortGroup is known.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Name(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Name(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Name by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Name(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_LogicalPortGroup fco = new CIM_LogicalPortGroup(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null) {
            property = setPropertyValue_Name(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Name
     * <br>
     * The Name property defines the identity by which the LogicalPortGroup is known.
     */

    private static CIMProperty setPropertyValue_Name(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NameFormat
     *     * <br>
     * The NameFormat property identifies how the Name of the LogicalPortGroup is generated.
     *     */

    public String get_NameFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property NameFormat
     * <br>
     * The NameFormat property identifies how the Name of the LogicalPortGroup is generated.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NameFormat(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEFORMAT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NameFormat(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NameFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NameFormat(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_LogicalPortGroup fco = new CIM_LogicalPortGroup(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAMEFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_NameFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NameFormat
     * <br>
     * The NameFormat property identifies how the Name of the LogicalPortGroup is generated.
     */

    private static CIMProperty setPropertyValue_NameFormat(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherNameFormat
     *     * <br>
     * A string describing how the LogicalPortGroup is identified when the NameFormat is "Other".
     *     */

    public String get_OtherNameFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERNAMEFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERNAMEFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherNameFormat
     * <br>
     * A string describing how the LogicalPortGroup is identified when the NameFormat is "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherNameFormat(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERNAMEFORMAT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherNameFormat(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERNAMEFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherNameFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherNameFormat(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_LogicalPortGroup fco = new CIM_LogicalPortGroup(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERNAMEFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_OtherNameFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERNAMEFORMAT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherNameFormat
     * <br>
     * A string describing how the LogicalPortGroup is identified when the NameFormat is "Other".
     */

    private static CIMProperty setPropertyValue_OtherNameFormat(CIMProperty currentProperty,
            String newValue) {
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
        return CIM_LogicalPortGroup.CIM_CLASS_NAME;
    }

}